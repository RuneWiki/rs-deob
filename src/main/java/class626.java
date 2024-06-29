import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class626 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "J")
    private long field8765 = -1L;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "J")
    private long field8769 = -1L;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    private int field8778 = 0;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Ldq;")
    private class327 field8780;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "J")
    private long field8781;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
    private long field8770;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[B")
    private byte[] field8771;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[B")
    private byte[] field8785;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "J")
    private long field8772;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lcr;")
    public static class292 field8776 = new class292("game4", 3);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field8766;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "J")
    private long field8774;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[[[S")
    public static short[][][] field8786;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BB)V", line = 4)
    public final void method3536(byte[] arg0, byte arg1) throws IOException {
        int var3 = 114 % (arg1 / 49);
        field8782++;
        this.method3539(arg0, 0, arg0.length, -99);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J", line = 15)
    public final long method3537(int arg0) {
        field8773++;
        if (arg0 != 24219) {
            field8776 = null;
        }
        return this.field8770;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 30)
    private final void method3538(int arg0) throws IOException {
        this.field8766 = 0;
        field8784++;
        if (arg0 < 67) {
            return;
        }
        if (this.field8774 != this.field8772) {
            this.field8780.method2111(1, this.field8772);
            this.field8774 = this.field8772;
        }
        this.field8765 = this.field8772;
        while (this.field8785.length > this.field8766) {
            int var2 = this.field8785.length - this.field8766;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field8780.method2109(var2, (byte) 92, this.field8766, this.field8785);
            if (var3 == -1) {
                break;
            }
            this.field8766 += var3;
            this.field8774 += var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BIII)V", line = 75)
    public final void method3539(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8768++;
        try {
            if (arg0.length < (arg1 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (arg3 > -74) {
                this.field8774 = 110L;
            }
            if (this.field8769 != -1L && this.field8772 >= this.field8769 && (this.field8772 + ((long) arg2)) <= ((long) this.field8778 + this.field8769)) {
                class571.method3313(this.field8771, (int) (this.field8772 - this.field8769), arg0, arg1, arg2);
                this.field8772 += arg2;
                return;
            }
            long var5 = this.field8772;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field8772 >= this.field8765 && this.field8772 < ((long) this.field8766 + this.field8765)) {
                int var9 = (int) ((long) this.field8766 + this.field8765 - this.field8772);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class571.method3313(this.field8785, (int) (this.field8772 - this.field8765), arg0, arg1, var9);
                arg1 += var9;
                arg2 -= var9;
                this.field8772 += var9;
            }
            if (arg2 > this.field8785.length) {
                this.field8780.method2111(1, this.field8772);
                this.field8774 = this.field8772;
                while (arg2 > 0) {
                    int var11 = this.field8780.method2109(arg2, (byte) 92, arg1, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 += var11;
                    this.field8772 += var11;
                    this.field8774 += var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method3538(118);
                int var10 = arg2;
                if (arg2 > this.field8766) {
                    var10 = this.field8766;
                }
                class571.method3313(this.field8785, 0, arg0, arg1, var10);
                arg2 -= var10;
                arg1 += var10;
                this.field8772 += var10;
            }
            if (this.field8769 != -1L) {
                if (this.field8772 < this.field8769 && arg2 > 0) {
                    int var12 = (int) (this.field8769 - this.field8772) + arg1;
                    if (var12 > (arg1 + arg2)) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg2--;
                        arg0[arg1++] = 0;
                        this.field8772++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field8769 && this.field8769 < (long) var8 + var5) {
                    var13 = this.field8769;
                } else if (this.field8769 <= var5 && (long) this.field8778 + this.field8769 > var5) {
                    var13 = var5;
                }
                if ((long) this.field8778 + this.field8769 > var5 && (long) this.field8778 + this.field8769 <= (long) var8 + var5) {
                    var15 = (long) this.field8778 + this.field8769;
                } else if (this.field8769 < var5 + ((long) var8) && (long) var8 + var5 <= (long) this.field8778 + this.field8769) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class571.method3313(this.field8771, (int) (var13 - this.field8769), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field8772) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field8772));
                        this.field8772 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field8774 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ldq;II)V", line = 553)
    public class626(class327 arg0, int arg1, int arg2) throws IOException {
        this.field8780 = arg0;
        this.field8770 = this.field8781 = arg0.method2113(-1);
        this.field8771 = new byte[arg2];
        this.field8785 = new byte[arg1];
        this.field8772 = 0L;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 277)
    private final void method3540(byte arg0) throws IOException {
        int var2 = 15 / ((50 - arg0) / 42);
        if (this.field8769 != -1L) {
            if (this.field8774 != this.field8769) {
                this.field8780.method2111(1, this.field8769);
                this.field8774 = this.field8769;
            }
            this.field8780.method2108(0, 111, this.field8771, this.field8778);
            this.field8774 += this.field8778;
            if (this.field8781 < this.field8774) {
                this.field8781 = this.field8774;
            }
            long var3 = -1L;
            long var5 = -1L;
            if (this.field8769 >= this.field8765 && this.field8769 < this.field8765 + ((long) this.field8766)) {
                var3 = this.field8769;
            } else if (this.field8765 >= this.field8769 && this.field8769 + ((long) this.field8778) > this.field8765) {
                var3 = this.field8765;
            }
            if (this.field8769 + ((long) this.field8778) > this.field8765 && (long) this.field8766 + this.field8765 >= (long) this.field8778 + this.field8769) {
                var5 = this.field8769 + ((long) this.field8778);
            } else if (this.field8769 < (long) this.field8766 + this.field8765 && (this.field8765 + ((long) this.field8766)) <= ((long) this.field8778 + this.field8769)) {
                var5 = (long) this.field8766 + this.field8765;
            }
            if (var3 > -1L && var5 > var3) {
                int var7 = (int) (var5 - var3);
                class571.method3313(this.field8771, (int) (var3 - this.field8769), this.field8785, (int) (var3 - this.field8765), var7);
            }
            this.field8778 = 0;
            this.field8769 = -1L;
        }
        field8777++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Ljava/io/File;", line = 351)
    private final File method3541(boolean arg0) {
        if (!arg0) {
            this.method3537(-4);
        }
        field8775++;
        return this.field8780.method2112((byte) 91);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 366)
    public static void method3542(int arg0) {
        field8776 = null;
        field8786 = null;
        if (arg0 != 23732) {
            method3542(48);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 378)
    public final void method3543(int arg0) throws IOException {
        if (arg0 > -18) {
            method3542(-125);
        }
        this.method3540((byte) 95);
        field8767++;
        this.field8780.method2110((byte) 52);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V", line = 393)
    public final void method3544(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8783++;
        try {
            if (arg1 != 3589) {
                method3542(116);
            }
            if (this.field8770 < ((long) arg0 + this.field8772)) {
                this.field8770 = (long) arg0 + this.field8772;
            }
            if (this.field8769 != -1L && (this.field8769 > this.field8772 || this.field8772 > (long) this.field8778 + this.field8769)) {
                this.method3540((byte) 120);
            }
            if (this.field8769 != -1L && this.field8772 + ((long) arg0) > this.field8769 - -((long) this.field8771.length)) {
                int var5 = (int) (this.field8769 + (long) this.field8771.length - this.field8772);
                class571.method3313(arg3, arg2, this.field8771, (int) (this.field8772 - this.field8769), var5);
                this.field8772 += var5;
                arg2 += var5;
                arg0 -= var5;
                this.field8778 = this.field8771.length;
                this.method3540((byte) -25);
            }
            if (arg0 > this.field8771.length) {
                if (this.field8774 != this.field8772) {
                    this.field8780.method2111(arg1 - 3588, this.field8772);
                    this.field8774 = this.field8772;
                }
                this.field8780.method2108(arg2, 124, arg3, arg0);
                this.field8774 += arg0;
                if (this.field8774 > this.field8781) {
                    this.field8781 = this.field8774;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field8772 >= this.field8765 && (this.field8765 + ((long) this.field8766)) > this.field8772) {
                    var6 = this.field8772;
                } else if (this.field8765 >= this.field8772 && this.field8765 < (long) arg0 + this.field8772) {
                    var6 = this.field8765;
                }
                if ((long) arg0 + this.field8772 > this.field8765 && (this.field8772 + ((long) arg0)) <= (this.field8765 + ((long) this.field8766))) {
                    var8 = (long) arg0 + this.field8772;
                } else if ((long) this.field8766 + this.field8765 > this.field8772 && (long) arg0 + this.field8772 >= (long) this.field8766 + this.field8765) {
                    var8 = (long) this.field8766 + this.field8765;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class571.method3313(arg3, (int) ((long) arg2 + var6 - this.field8772), this.field8785, (int) (var6 - this.field8765), var10);
                }
                this.field8772 += arg0;
            } else if (arg0 > 0) {
                if (this.field8769 == -1L) {
                    this.field8769 = this.field8772;
                }
                class571.method3313(arg3, arg2, this.field8771, (int) (this.field8772 - this.field8769), arg0);
                this.field8772 += arg0;
                if ((this.field8772 - this.field8769) > ((long) this.field8778)) {
                    this.field8778 = (int) (this.field8772 - this.field8769);
                }
            }
        } catch (IOException var12) {
            this.field8774 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JB)V", line = 536)
    public final void method3545(long arg0, byte arg1) throws IOException {
        field8779++;
        if (arg1 != 70) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3541(true));
        }
        this.field8772 = arg0;
    }
}
