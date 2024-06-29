import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class40 {

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "J")
    private long field766 = -1L;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
    private long field761 = -1L;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    private int field782 = 0;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lkc;")
    private class94 field770;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "J")
    private long field762;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "J")
    private long field769;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[B")
    private byte[] field774;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "J")
    private long field763;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "[B")
    private byte[] field784;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    public static int[] field756 = new int[500];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Z")
    public static boolean field757 = false;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Led;")
    public static class43 field772 = class191.method1219("(U0a )2 in: ", false);

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Led;")
    public static class43 field775 = class191.method1219("<br>(X", false);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
    public static boolean field767 = false;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Led;")
    public static class43 field783 = class191.method1219("sich mit einer anderen Welt zu verbinden)3", false);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "J")
    private long field768;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field771;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[Lnb;")
    public static class120[] field755;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BBI)V")
    public final void method216(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field764++;
        try {
            if (arg2 == 45) {
                if (this.field769 < this.field763 + (long) arg0) {
                    this.field769 = (long) arg0 + this.field763;
                }
                if (this.field761 != -1L && (this.field761 > this.field763 || this.field763 > (long) this.field782 + this.field761)) {
                    this.method225(0);
                }
                if (this.field761 != -1L && this.field761 + (long) this.field774.length < this.field763 - -((long) arg0)) {
                    int var5 = (int) ((long) this.field774.length + this.field761 - this.field763);
                    class42.method234(arg1, arg3, this.field774, (int) (this.field763 - this.field761), var5);
                    arg3 += var5;
                    this.field763 += var5;
                    arg0 -= var5;
                    this.field782 = this.field774.length;
                    this.method225(arg2 - 45);
                }
                if (arg0 > this.field774.length) {
                    long var6 = -1L;
                    if (this.field768 != this.field763) {
                        this.field770.method601((byte) 104, this.field763);
                        this.field768 = this.field763;
                    }
                    this.field770.method600(arg0, true, arg1, arg3);
                    this.field768 += arg0;
                    if (this.field763 >= this.field766 && this.field763 < this.field766 + (long) this.field780) {
                        var6 = this.field763;
                    } else if (this.field763 <= this.field766 && (long) arg0 + this.field763 > this.field766) {
                        var6 = this.field766;
                    }
                    long var8 = -1L;
                    if (this.field768 > this.field762) {
                        this.field762 = this.field768;
                    }
                    if ((long) arg0 + this.field763 > this.field766 && (long) arg0 + this.field763 <= (long) this.field780 + this.field766) {
                        var8 = (long) arg0 + this.field763;
                    } else if ((long) this.field780 + this.field766 > this.field763 && (long) this.field780 + this.field766 <= (long) arg0 + this.field763) {
                        var8 = (long) this.field780 + this.field766;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class42.method234(arg1, (int) ((long) arg3 + var6 - this.field763), this.field784, (int) (var6 - this.field766), var10);
                    }
                    this.field763 += arg0;
                } else if (arg0 > 0) {
                    if (this.field761 == -1L) {
                        this.field761 = this.field763;
                    }
                    class42.method234(arg1, arg3, this.field774, (int) (this.field763 - this.field761), arg0);
                    this.field763 += arg0;
                    if (this.field763 - this.field761 > (long) this.field782) {
                        this.field782 = (int) (this.field763 - this.field761);
                    }
                }
            }
        } catch (IOException var12) {
            this.field768 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)J")
    public final long method217(int arg0) {
        if (arg0 != -1) {
            this.field784 = null;
        }
        field754++;
        return this.field769;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    private final void method218(byte arg0) throws IOException {
        field759++;
        this.field780 = 0;
        if (arg0 != 17) {
            method220((byte) -73, -45);
        }
        if (this.field768 != this.field763) {
            this.field770.method601((byte) -47, this.field763);
            this.field768 = this.field763;
        }
        this.field766 = this.field763;
        while (this.field784.length > this.field780) {
            int var2 = this.field770.method602(this.field784, (byte) -102, this.field784.length - this.field780, this.field780);
            if (var2 == -1) {
                break;
            }
            this.field768 += var2;
            this.field780 += var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)V")
    public final void method219(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field773++;
        try {
            if (arg0 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field761 != -1L && this.field761 <= this.field763 && this.field761 + (long) this.field782 >= (long) arg1 + this.field763) {
                class42.method234(this.field774, (int) (this.field763 - this.field761), arg2, arg0, arg1);
                this.field763 += arg1;
                return;
            }
            long var5 = this.field763;
            if (arg3 != 0) {
                method220((byte) 45, -107);
            }
            int var7 = arg1;
            int var8 = arg0;
            if (this.field766 <= this.field763 && this.field763 < (long) this.field780 + this.field766) {
                int var9 = (int) ((long) this.field780 + this.field766 - this.field763);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class42.method234(this.field784, (int) (this.field763 - this.field766), arg2, arg0, var9);
                this.field763 += var9;
                arg0 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field784.length) {
                this.field770.method601((byte) 111, this.field763);
                this.field768 = this.field763;
                while (arg1 > 0) {
                    int var11 = this.field770.method602(arg2, (byte) -75, arg1, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 += var11;
                    this.field768 += var11;
                    arg1 -= var11;
                    this.field763 += var11;
                }
            } else if (arg1 > 0) {
                this.method218((byte) 17);
                int var10 = arg1;
                if (this.field780 < arg1) {
                    var10 = this.field780;
                }
                arg1 -= var10;
                class42.method234(this.field784, 0, arg2, arg0, var10);
                arg0 += var10;
                this.field763 += var10;
            }
            if (this.field761 != -1L) {
                if (this.field761 > this.field763 && arg1 > 0) {
                    int var12 = (int) (this.field761 - this.field763) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        this.field763++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field761 && (long) var7 + var5 > this.field761) {
                    var13 = this.field761;
                } else if (var5 >= this.field761 && var5 < (long) this.field782 + this.field761) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field782 + this.field761 && this.field761 + (long) this.field782 <= (long) var7 + var5) {
                    var15 = (long) this.field782 + this.field761;
                } else if ((long) var7 + var5 > this.field761 && (long) this.field782 + this.field761 >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class42.method234(this.field774, (int) (var13 - this.field761), arg2, var8 + (int) (var13 - var5), var17);
                    if (this.field763 < var15) {
                        arg1 = (int) ((long) arg1 + this.field763 - var15);
                        this.field763 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field768 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
    public static final boolean method220(byte arg0, int arg1) {
        if (arg0 == 48) {
            field758++;
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final void method221(int arg0) throws IOException {
        field760++;
        if (arg0 != 255) {
            method220((byte) -60, 20);
        }
        this.method225(arg0 - 255);
        this.field770.method603(-1);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method222(byte arg0) {
        field772 = null;
        field783 = null;
        field755 = null;
        field771 = null;
        field756 = null;
        int var1 = -88 / ((20 - arg0) / 57);
        field775 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B)V")
    public final void method223(int arg0, byte[] arg1) throws IOException {
        field765++;
        if (arg0 == -22907) {
            this.method219(0, arg1.length, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method224(byte arg0) {
        if (arg0 != 112) {
            field776 = -70;
        }
        field777++;
        return this.field770.method599((byte) 34);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    private final void method225(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field769 = -74L;
        }
        if (this.field761 != -1L) {
            if (this.field768 != this.field761) {
                this.field770.method601((byte) 118, this.field761);
                this.field768 = this.field761;
            }
            this.field770.method600(this.field782, true, this.field774, 0);
            this.field768 += this.field782;
            long var2 = -1L;
            if (this.field768 > this.field762) {
                this.field762 = this.field768;
            }
            if (this.field766 <= this.field761 && this.field761 < (long) this.field780 + this.field766) {
                var2 = this.field761;
            } else if (this.field766 >= this.field761 && this.field766 < this.field761 + (long) this.field782) {
                var2 = this.field766;
            }
            long var4 = -1L;
            if (this.field766 < this.field761 + (long) this.field782 && (long) this.field780 + this.field766 >= (long) this.field782 + this.field761) {
                var4 = (long) this.field782 + this.field761;
            } else if (this.field761 < (long) this.field780 + this.field766 && (long) this.field780 + this.field766 <= this.field761 - -((long) this.field782)) {
                var4 = (long) this.field780 + this.field766;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class42.method234(this.field774, (int) (var2 - this.field761), this.field784, (int) (var2 - this.field766), var6);
            }
            this.field782 = 0;
            this.field761 = -1L;
        }
        field781++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
    public final void method226(long arg0, byte arg1) throws IOException {
        field779++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method224((byte) 112));
        }
        if (arg1 != -105) {
            this.method224((byte) -107);
        }
        this.field763 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lkc;II)V")
    public class40(class94 arg0, int arg1, int arg2) throws IOException {
        this.field770 = arg0;
        this.field769 = this.field762 = arg0.method598(2066);
        this.field774 = new byte[arg2];
        this.field763 = 0L;
        this.field784 = new byte[arg1];
    }
}
