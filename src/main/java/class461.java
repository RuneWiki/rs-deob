import java.awt.Image;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class461 {

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    private int field6778 = 0;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "J")
    private long field6780 = -1L;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "J")
    private long field6781 = -1L;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lgq;")
    private class355 field6770;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "J")
    private long field6787;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "J")
    private long field6775;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "J")
    private long field6774;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "[B")
    private byte[] field6782;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[B")
    private byte[] field6769;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lwj;")
    public static class270 field6773 = new class270(49, 6);

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field6784 = 0;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    private int field6777;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "J")
    private long field6789;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field6783;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method2703(int arg0) {
        field6771++;
        if (arg0 != 2) {
            method2705((byte) 97);
        }
        return this.field6770.method2123(0);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    private final void method2704(int arg0) throws IOException {
        field6772++;
        this.field6777 = arg0;
        if (this.field6789 != this.field6774) {
            this.field6770.method2122(this.field6774, (byte) 115);
            this.field6789 = this.field6774;
        }
        this.field6781 = this.field6774;
        while (this.field6769.length > this.field6777) {
            int var2 = this.field6769.length - this.field6777;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6770.method2124(this.field6777, var2, this.field6769, false);
            if (var3 == -1) {
                break;
            }
            this.field6777 += var3;
            this.field6789 += var3;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method2705(byte arg0) {
        if (arg0 != 76) {
            method2705((byte) -20);
        }
        field6783 = null;
        field6773 = null;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)J")
    public final long method2706(int arg0) {
        if (arg0 == -5302) {
            field6779++;
            return this.field6775;
        } else {
            return -96L;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public static final void method2707(byte arg0) {
        class162 var1 = class528.field7803;
        synchronized (class528.field7803) {
            class528.field7803.method1066(4080);
        }
        field6786++;
        class162 var2 = class345.field4953;
        synchronized (class345.field4953) {
            if (arg0 < -115) {
                class345.field4953.method1066(4080);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[BB)V")
    public final void method2708(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field6767++;
        int var5 = -83 % ((arg3 + 43) / 61);
        try {
            if ((this.field6774 + ((long) arg0)) > this.field6775) {
                this.field6775 = (long) arg0 + this.field6774;
            }
            if (this.field6780 != -1L && (this.field6780 > this.field6774 || this.field6774 > (long) this.field6778 + this.field6780)) {
                this.method2711(16658);
            }
            if (this.field6780 != -1L && (long) this.field6782.length + this.field6780 < (long) arg0 + this.field6774) {
                int var6 = (int) (this.field6780 + (long) this.field6782.length - this.field6774);
                class91.method678(arg2, arg1, this.field6782, (int) (this.field6774 - this.field6780), var6);
                arg1 += var6;
                arg0 -= var6;
                this.field6774 += var6;
                this.field6778 = this.field6782.length;
                this.method2711(16658);
            }
            if (this.field6782.length < arg0) {
                if (this.field6789 != this.field6774) {
                    this.field6770.method2122(this.field6774, (byte) 123);
                    this.field6789 = this.field6774;
                }
                this.field6770.method2121(arg1, (byte) 124, arg0, arg2);
                this.field6789 += arg0;
                if (this.field6787 < this.field6789) {
                    this.field6787 = this.field6789;
                }
                long var7 = -1L;
                if (this.field6781 <= this.field6774 && (this.field6781 + ((long) this.field6777)) > this.field6774) {
                    var7 = this.field6774;
                } else if (this.field6781 >= this.field6774 && ((long) arg0 + this.field6774) > this.field6781) {
                    var7 = this.field6781;
                }
                long var9 = -1L;
                if (this.field6781 < (long) arg0 + this.field6774 && ((long) arg0 + this.field6774) <= ((long) this.field6777 + this.field6781)) {
                    var9 = (long) arg0 + this.field6774;
                } else if (this.field6774 < ((long) this.field6777 + this.field6781) && ((long) this.field6777 + this.field6781) <= ((long) arg0 + this.field6774)) {
                    var9 = (long) this.field6777 + this.field6781;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class91.method678(arg2, (int) ((long) arg1 + var7 - this.field6774), this.field6769, (int) (var7 - this.field6781), var11);
                }
                this.field6774 += arg0;
            } else if (arg0 > 0) {
                if (this.field6780 == -1L) {
                    this.field6780 = this.field6774;
                }
                class91.method678(arg2, arg1, this.field6782, (int) (this.field6774 - this.field6780), arg0);
                this.field6774 += arg0;
                if ((this.field6774 - this.field6780) > ((long) this.field6778)) {
                    this.field6778 = (int) (this.field6774 - this.field6780);
                }
            }
        } catch (IOException var13) {
            this.field6789 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([BB)V")
    public final void method2709(byte[] arg0, byte arg1) throws IOException {
        this.method2712(0, arg0.length, (byte) -81, arg0);
        field6785++;
        int var3 = 47 % ((11 - arg1) / 41);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZJ)V")
    public final void method2710(boolean arg0, long arg1) throws IOException {
        field6776++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2703(2));
        }
        this.field6774 = arg1;
        if (!arg0) {
            field6783 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)V")
    private final void method2711(int arg0) throws IOException {
        if (arg0 != 16658) {
            this.method2706(107);
        }
        if (this.field6780 != -1L) {
            if (this.field6789 != this.field6780) {
                this.field6770.method2122(this.field6780, (byte) 110);
                this.field6789 = this.field6780;
            }
            this.field6770.method2121(0, (byte) 55, this.field6778, this.field6782);
            this.field6789 += this.field6778;
            if (this.field6789 > this.field6787) {
                this.field6787 = this.field6789;
            }
            long var2 = -1L;
            if (this.field6781 <= this.field6780 && ((long) this.field6777 + this.field6781) > this.field6780) {
                var2 = this.field6780;
            } else if (this.field6781 >= this.field6780 && this.field6781 < (long) this.field6778 + this.field6780) {
                var2 = this.field6781;
            }
            long var4 = -1L;
            if (this.field6781 < ((long) this.field6778 + this.field6780) && (long) this.field6777 + this.field6781 >= this.field6780 - -((long) this.field6778)) {
                var4 = this.field6780 + ((long) this.field6778);
            } else if (((long) this.field6777 + this.field6781) > this.field6780 && (this.field6780 + ((long) this.field6778)) >= ((long) this.field6777 + this.field6781)) {
                var4 = (long) this.field6777 + this.field6781;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class91.method678(this.field6782, (int) (var2 - this.field6780), this.field6769, (int) (var2 - this.field6781), var6);
            }
            this.field6780 = -1L;
            this.field6778 = 0;
        }
        field6788++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB[B)V")
    public final void method2712(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field6768++;
        try {
            if (arg3.length < (arg0 + arg1)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (arg2 != -81) {
                return;
            }
            if (this.field6780 != -1L && this.field6774 >= this.field6780 && ((long) this.field6778 + this.field6780) >= ((long) arg1 + this.field6774)) {
                class91.method678(this.field6782, (int) (this.field6774 - this.field6780), arg3, arg0, arg1);
                this.field6774 += arg1;
                return;
            }
            long var5 = this.field6774;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field6781 <= this.field6774 && this.field6774 < (this.field6781 + ((long) this.field6777))) {
                int var9 = (int) ((long) this.field6777 + this.field6781 - this.field6774);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class91.method678(this.field6769, (int) (this.field6774 - this.field6781), arg3, arg0, var9);
                arg0 += var9;
                this.field6774 += var9;
                arg1 -= var9;
            }
            if (this.field6769.length < arg1) {
                this.field6770.method2122(this.field6774, (byte) 88);
                this.field6789 = this.field6774;
                while (arg1 > 0) {
                    int var10 = this.field6770.method2124(arg0, arg1, arg3, false);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    this.field6774 += var10;
                    this.field6789 += var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                this.method2704(0);
                int var11 = arg1;
                if (this.field6777 < arg1) {
                    var11 = this.field6777;
                }
                class91.method678(this.field6769, 0, arg3, arg0, var11);
                arg0 += var11;
                arg1 -= var11;
                this.field6774 += var11;
            }
            if (this.field6780 != -1L) {
                if (this.field6774 < this.field6780 && arg1 > 0) {
                    int var12 = (int) (this.field6780 - this.field6774) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg1--;
                        arg3[arg0++] = 0;
                        this.field6774++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field6780 && (long) var8 + var5 > this.field6780) {
                    var13 = this.field6780;
                } else if (var5 >= this.field6780 && var5 < (long) this.field6778 + this.field6780) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field6778 + this.field6780) > var5 && var5 + ((long) var8) >= (long) this.field6778 + this.field6780) {
                    var15 = (long) this.field6778 + this.field6780;
                } else if ((long) var8 + var5 > this.field6780 && var5 + ((long) var8) <= this.field6780 - -((long) this.field6778)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class91.method678(this.field6782, (int) (var13 - this.field6780), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field6774 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field6774));
                        this.field6774 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6789 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lgq;II)V")
    public class461(class355 arg0, int arg1, int arg2) throws IOException {
        this.field6770 = arg0;
        this.field6775 = this.field6787 = arg0.method2125(92);
        this.field6774 = 0L;
        this.field6782 = new byte[arg2];
        this.field6769 = new byte[arg1];
    }
}
