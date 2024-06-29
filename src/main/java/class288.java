import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class288 {

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field3867 = 0;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "J")
    private long field3881 = -1L;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "J")
    private long field3884 = -1L;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "Ljo;")
    private class219 field3878;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "J")
    private long field3866;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "J")
    private long field3862;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[B")
    private byte[] field3871;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "J")
    private long field3861;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[B")
    private byte[] field3868;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Luf;")
    public static class310 field3879 = new class310(58, 0);

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "Lfg;")
    public static class83 field3882 = new class83("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "Llf;")
    public static class157 field3885 = new class157("stellardawn", 1);

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
    public static float field3864;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    private int field3873;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "J")
    private long field3874;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "Lvh;")
    public static class240 field3883;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BI)V", line = 7)
    public final void method1640(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3872++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (arg0 > -43) {
                this.method1646(10);
            }
            if (this.field3881 != -1L && this.field3861 >= this.field3881 && (long) this.field3867 + this.field3881 >= this.field3861 - -((long) arg3)) {
                class416.method2491(this.field3868, (int) (this.field3861 - this.field3881), arg2, arg1, arg3);
                this.field3861 += arg3;
                return;
            }
            long var5 = this.field3861;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field3884 <= this.field3861 && (long) this.field3873 + this.field3884 > this.field3861) {
                int var9 = (int) ((long) this.field3873 - (this.field3861 - this.field3884));
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class416.method2491(this.field3871, (int) (this.field3861 - this.field3884), arg2, arg1, var9);
                arg3 -= var9;
                this.field3861 += var9;
                arg1 += var9;
            }
            if (arg3 > this.field3871.length) {
                this.field3878.method1294(this.field3861, 123);
                this.field3874 = this.field3861;
                while (arg3 > 0) {
                    int var10 = this.field3878.method1298(false, arg2, arg3, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3874 += var10;
                    arg1 += var10;
                    arg3 -= var10;
                    this.field3861 += var10;
                }
            } else if (arg3 > 0) {
                this.method1649(0);
                int var11 = arg3;
                if (arg3 > this.field3873) {
                    var11 = this.field3873;
                }
                class416.method2491(this.field3871, 0, arg2, arg1, var11);
                this.field3861 += var11;
                arg1 += var11;
                arg3 -= var11;
            }
            if (this.field3881 != -1L) {
                if (this.field3881 > this.field3861 && arg3 > 0) {
                    int var12 = (int) (this.field3881 - this.field3861) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field3861++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field3881 && (long) var8 + var5 > this.field3881) {
                    var13 = this.field3881;
                } else if (this.field3881 <= var5 && ((long) this.field3867 + this.field3881) > var5) {
                    var13 = var5;
                }
                if ((long) this.field3867 + this.field3881 > var5 && (long) var8 + var5 >= (long) this.field3867 + this.field3881) {
                    var15 = (long) this.field3867 + this.field3881;
                } else if (this.field3881 < (long) var8 + var5 && (long) this.field3867 + this.field3881 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class416.method2491(this.field3868, (int) (var13 - this.field3881), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field3861) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field3861));
                        this.field3861 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3874 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 196)
    public static void method1641(int arg0) {
        field3879 = null;
        field3883 = null;
        field3885 = null;
        field3882 = null;
        if (arg0 <= 28) {
            field3882 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)J", line = 209)
    public final long method1642(byte arg0) {
        field3860++;
        if (arg0 != 18) {
            field3882 = null;
        }
        return this.field3862;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 223)
    private final void method1643(int arg0) throws IOException {
        if (this.field3881 != -1L) {
            if (this.field3881 != this.field3874) {
                this.field3878.method1294(this.field3881, arg0 + 115);
                this.field3874 = this.field3881;
            }
            this.field3878.method1295(0, this.field3867, (byte) 26, this.field3868);
            this.field3874 += this.field3867;
            if (this.field3874 > this.field3866) {
                this.field3866 = this.field3874;
            }
            long var2 = -1L;
            if (this.field3881 >= this.field3884 && this.field3881 < ((long) this.field3873 + this.field3884)) {
                var2 = this.field3881;
            } else if (this.field3881 <= this.field3884 && this.field3884 < (this.field3881 + ((long) this.field3867))) {
                var2 = this.field3884;
            }
            long var4 = -1L;
            if (this.field3881 + ((long) this.field3867) > this.field3884 && ((long) this.field3873 + this.field3884) >= (this.field3881 + ((long) this.field3867))) {
                var4 = (long) this.field3867 + this.field3881;
            } else if (((long) this.field3873 + this.field3884) > this.field3881 && this.field3884 + ((long) this.field3873) <= (long) this.field3867 + this.field3881) {
                var4 = (long) this.field3873 + this.field3884;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class416.method2491(this.field3868, (int) (var2 - this.field3881), this.field3871, (int) (var2 - this.field3884), var6);
            }
            this.field3881 = -1L;
            this.field3867 = 0;
        }
        field3865++;
        if (arg0 != 0) {
            this.field3871 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B[B)V", line = 298)
    public final void method1644(byte arg0, byte[] arg1) throws IOException {
        int var3 = -54 / ((69 - arg0) / 45);
        field3869++;
        this.method1640(-79, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BZI)V", line = 309)
    public final void method1645(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field3863++;
        try {
            if ((long) arg0 + this.field3861 > this.field3862) {
                this.field3862 = (long) arg0 + this.field3861;
            }
            if (this.field3881 != -1L && (this.field3861 < this.field3881 || this.field3881 + ((long) this.field3867) < this.field3861)) {
                this.method1643(0);
            }
            if (this.field3881 != -1L && (long) this.field3868.length + this.field3881 < this.field3861 - -((long) arg0)) {
                int var5 = (int) ((long) this.field3868.length + this.field3881 - this.field3861);
                class416.method2491(arg1, arg3, this.field3868, (int) (this.field3861 - this.field3881), var5);
                this.field3861 += var5;
                arg0 -= var5;
                arg3 += var5;
                this.field3867 = this.field3868.length;
                this.method1643(0);
            }
            if (arg0 > this.field3868.length) {
                if (this.field3874 != this.field3861) {
                    this.field3878.method1294(this.field3861, 124);
                    this.field3874 = this.field3861;
                }
                this.field3878.method1295(arg3, arg0, (byte) 26, arg1);
                this.field3874 += arg0;
                if (this.field3866 < this.field3874) {
                    this.field3866 = this.field3874;
                }
                long var6 = -1L;
                if (this.field3884 <= this.field3861 && this.field3861 < (this.field3884 + ((long) this.field3873))) {
                    var6 = this.field3861;
                } else if (this.field3884 >= this.field3861 && this.field3884 < (long) arg0 + this.field3861) {
                    var6 = this.field3884;
                }
                long var8 = -1L;
                if (this.field3884 < (long) arg0 + this.field3861 && (long) arg0 + this.field3861 <= (long) this.field3873 + this.field3884) {
                    var8 = this.field3861 + ((long) arg0);
                } else if (this.field3861 < ((long) this.field3873 + this.field3884) && (long) arg0 + this.field3861 >= (long) this.field3873 + this.field3884) {
                    var8 = (long) this.field3873 + this.field3884;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class416.method2491(arg1, (int) (var6 + (long) arg3 - this.field3861), this.field3871, (int) (var6 - this.field3884), var10);
                }
                this.field3861 += arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field3881 == -1L) {
                    this.field3881 = this.field3861;
                }
                class416.method2491(arg1, arg3, this.field3868, (int) (this.field3861 - this.field3881), arg0);
                this.field3861 += arg0;
                if (this.field3861 - this.field3881 > (long) this.field3867) {
                    this.field3867 = (int) (this.field3861 - this.field3881);
                }
                return;
            }
        } catch (IOException var12) {
            this.field3874 = -1L;
            throw var12;
        }
        if (arg2) {
            this.field3874 = 84L;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Ljava/io/File;", line = 437)
    private final File method1646(int arg0) {
        if (arg0 != -1) {
            this.method1646(41);
        }
        field3870++;
        return this.field3878.method1293(-1);
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljo;II)V", line = 592)
    public class288(class219 arg0, int arg1, int arg2) throws IOException {
        this.field3878 = arg0;
        this.field3862 = this.field3866 = arg0.method1296(1);
        this.field3871 = new byte[arg1];
        this.field3861 = 0L;
        this.field3868 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIIBLht;IZ)Lcq;", line = 455)
    public static final class325 method1647(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, class410 arg5, int arg6, boolean arg7) {
        field3875++;
        if (arg4 != 21) {
            field3864 = -0.61543155F;
        }
        if (!arg5.field5991 && (!class455.method2685(arg6, 20721) || !class455.method2685(arg0, 20721))) {
            return arg5.field5905 ? new class325(arg5, 34037, arg3, arg6, arg0, arg7, arg1, arg2) : new class325(arg5, arg3, arg6, arg0, class420.method2513(arg6, 0), class420.method2513(arg0, 0), arg1, arg2);
        } else {
            return new class325(arg5, 3553, arg3, arg6, arg0, arg7, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lmv;Lqa;Z)I", line = 480)
    public static final int method1648(class252 arg0, class162 arg1, boolean arg2) {
        field3877++;
        if (arg0.field3491 != -1) {
            return arg0.field3491;
        }
        if (arg0.field3504 != -1) {
            class501 var3 = arg1.field2312.method830(arg1.method450() ? arg0.field3504 : arg0.field3495, (byte) 71);
            if (!var3.field7371) {
                return var3.field7367;
            }
        }
        return arg2 ? -112 : arg0.field3503;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V", line = 524)
    private final void method1649(int arg0) throws IOException {
        field3880++;
        this.field3873 = arg0;
        if (this.field3874 != this.field3861) {
            this.field3878.method1294(this.field3861, 119);
            this.field3874 = this.field3861;
        }
        this.field3884 = this.field3861;
        while (this.field3871.length > this.field3873) {
            int var2 = this.field3871.length - this.field3873;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3878.method1298(false, this.field3871, var2, this.field3873);
            if (var3 == -1) {
                break;
            }
            this.field3874 += var3;
            this.field3873 += var3;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BJ)V", line = 563)
    public final void method1650(byte arg0, long arg1) throws IOException {
        field3876++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1646(-1));
        }
        if (arg0 <= 28) {
            this.method1642((byte) -32);
        }
        this.field3861 = arg1;
    }
}
