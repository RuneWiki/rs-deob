import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class71 extends class35 {

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    private int field868 = 0;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "Ldu;")
    private class360 field873 = new class360(16);

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    private int field881 = 0;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "Lro;")
    private class2 field882 = new class2();

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "J")
    private long field886 = 0L;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "Lmi;")
    private class498 field877;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "Z")
    private boolean field884;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "Lro;")
    private class2 field883;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "Ltk;")
    private class348 field880;

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "Z")
    private boolean field887;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "Lmi;")
    private class498 field855;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "Leia;")
    private class244 field871;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "[B")
    private byte[] field870;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Lnf;")
    private class578 field859;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "[C")
    private static char[] field857 = new char[64];

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "Lqia;")
    private class20 field878;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "Z")
    private boolean field885;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[B")
    private byte[] field862;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field857[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field857[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field857[var2] = (char) (var2 + 48 - 52);
        }
        field857[63] = '/';
        field857[62] = '+';
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)I", line = 4)
    public final int method576(int arg0) {
        if (arg0 != 9312) {
            return 63;
        }
        field879++;
        if (this.method290(-65) == null) {
            return this.field859 == null ? 0 : this.field859.method3170(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)[B", line = 25)
    public final byte[] method291(int arg0, int arg1) {
        field874++;
        class578 var3 = this.method578(arg0, -23661, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method3171(arg1);
            var3.method3564(true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V", line = 45)
    public final void method577(int arg0) {
        field856++;
        if (this.field877 == null) {
            return;
        }
        this.field885 = true;
        int var2 = 66 / ((arg0 - 9) / 42);
        if (this.field883 == null) {
            this.field883 = new class2();
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Lnf;", line = 62)
    private final class578 method578(int arg0, int arg1, int arg2) {
        field861++;
        class578 var4 = (class578) this.field873.method2135((long) arg0, (byte) 31);
        if (var4 != null && arg2 == 0 && !var4.field7583 && var4.field7580) {
            var4.method3564(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field877 == null || this.field862[arg0] == -1) {
                    if (this.field880.method2094(0)) {
                        return null;
                    }
                    var4 = this.field880.method2093(true, (byte) 2, this.field866, arg0, 22013);
                } else {
                    var4 = this.field871.method1519(this.field877, -3, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field877 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field871.method1523((byte) 127, arg0, this.field877);
            } else if (arg2 == 2) {
                if (this.field877 == null) {
                    throw new RuntimeException();
                }
                if (this.field862[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field880.method2084(arg1 + 23756)) {
                    return null;
                }
                var4 = this.field880.method2093(false, (byte) 2, this.field866, arg0, 22013);
            } else {
                throw new RuntimeException();
            }
            this.field873.method2143(-1, var4, (long) arg0);
        }
        if (var4.field7580) {
            return null;
        }
        byte[] var5 = var4.method3171(arg1 ^ arg1);
        if (!var4 instanceof class634) {
            try {
                label157: {
                    if (var5 != null && var5.length > 2) {
                        class54.field658.reset();
                        class54.field658.update(var5, 0, var5.length - 2);
                        int var12 = (int) class54.field658.getValue();
                        if (this.field878.field353[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field878.field334 == null || this.field878.field334[arg0] == null) {
                            break label157;
                        }
                        byte[] var13 = this.field878.field334[arg0];
                        byte[] var14 = class468.method2643(arg1 ^ 0xFFFFA393, var5, var5.length - 2, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label157;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field880.field4909 = 0;
                this.field880.field4910 = 0;
            } catch (RuntimeException var18) {
                this.field880.method2090((byte) 96);
                var4.method3564(true);
                if (var4.field7583 && !this.field880.method2094(0)) {
                    class700 var16 = this.field880.method2093(true, (byte) 2, this.field866, arg0, 22013);
                    this.field873.method2143(-1, var16, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field878.field338[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field878.field338[arg0];
            if (this.field877 != null) {
                this.field871.method1517(arg0, this.field877, 1, var5);
                if (this.field862[arg0] != 1) {
                    this.field868++;
                    this.field862[arg0] = 1;
                }
            }
            if (!var4.field7583) {
                var4.method3564(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class54.field658.reset();
            class54.field658.update(var5, 0, var5.length - 2);
            int var6 = (int) class54.field658.getValue();
            if (this.field878.field353[arg0] != var6) {
                throw new RuntimeException();
            }
            if (this.field878.field334 != null && this.field878.field334[arg0] != null) {
                byte[] var7 = this.field878.field334[arg0];
                byte[] var8 = class468.method2643(0, var5, var5.length - 2, 0);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field878.field338[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field862[arg0] != 1) {
                this.field868++;
                this.field862[arg0] = 1;
            }
            if (!var4.field7583) {
                var4.method3564(true);
            }
            return var4;
        } catch (Exception var17) {
            this.field862[arg0] = -1;
            var4.method3564(true);
            if (var4.field7583 && !this.field880.method2094(arg1 + 23661)) {
                class700 var11 = this.field880.method2093(true, (byte) 2, this.field866, arg0, 22013);
                this.field873.method2143(-1, var11, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)I", line = 326)
    public final int method579(int arg0) {
        field867++;
        int var2 = 108 % ((-arg0 - 2) / 54);
        return this.field868;
    }

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I", line = 336)
    public final int method580(int arg0) {
        if (arg0 == 100) {
            field858++;
            return this.field878 == null ? 0 : this.field878.field341;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Lqia;", line = 350)
    public final class20 method290(int arg0) {
        field865++;
        if (this.field878 != null) {
            return this.field878;
        }
        if (this.field859 == null) {
            if (this.field880.method2094(0)) {
                return null;
            }
            this.field859 = this.field880.method2093(true, (byte) 0, 255, this.field866, 22013);
        }
        if (this.field859.field7580) {
            return null;
        }
        if (arg0 >= -10) {
            this.field855 = null;
        }
        byte[] var2 = this.field859.method3171(0);
        if (this.field859 instanceof class634) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field878 = new class20(var2, this.field872, this.field870);
                if (this.field878.field335 != this.field875) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field878 = null;
                if (this.field880.method2094(0)) {
                    this.field859 = null;
                } else {
                    this.field859 = this.field880.method2093(true, (byte) 0, 255, this.field866, 22013);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field878 = new class20(var2, this.field872, this.field870);
            } catch (RuntimeException var4) {
                this.field880.method2090((byte) 126);
                this.field878 = null;
                if (this.field880.method2094(0)) {
                    this.field859 = null;
                } else {
                    this.field859 = this.field880.method2093(true, (byte) 0, 255, this.field866, 22013);
                }
                return null;
            }
            if (this.field855 != null) {
                this.field871.method1517(this.field866, this.field855, 1, var2);
            }
        }
        if (this.field877 != null) {
            this.field862 = new byte[this.field878.field354];
            this.field868 = 0;
        }
        this.field859 = null;
        return this.field878;
    }

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "(I)V", line = 450)
    public final void method581(int arg0) {
        if (arg0 != 0) {
            this.method577(66);
        }
        field860++;
        if (this.field883 != null) {
            if (this.method290(arg0 - 42) == null) {
                return;
            }
            if (this.field884) {
                boolean var2 = true;
                for (class656 var3 = this.field883.method21(2); var3 != null; var3 = this.field883.method9(arg0 - 128)) {
                    int var5 = (int) var3.field8680;
                    if (this.field862[var5] == 0) {
                        this.method578(var5, arg0 ^ 0xFFFFA393, 1);
                    }
                    if (this.field862[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3564(true);
                    }
                }
                while (this.field878.field343.length > this.field881) {
                    if (this.field878.field343[this.field881] == 0) {
                        this.field881++;
                    } else {
                        if (this.field871.field3416 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field862[this.field881] == 0) {
                            this.method578(this.field881, arg0 ^ 0xFFFFA393, 1);
                        }
                        if (this.field862[this.field881] == 0) {
                            class656 var4 = new class656();
                            var4.field8680 = this.field881;
                            this.field883.method11(var4, -104);
                            var2 = false;
                        }
                        this.field881++;
                    }
                }
                if (var2) {
                    this.field884 = false;
                    this.field881 = 0;
                }
            } else if (this.field885) {
                boolean var6 = true;
                for (class656 var7 = this.field883.method21(2); var7 != null; var7 = this.field883.method9(arg0 - 128)) {
                    int var9 = (int) var7.field8680;
                    if (this.field862[var9] != 1) {
                        this.method578(var9, -23661, 2);
                    }
                    if (this.field862[var9] == 1) {
                        var7.method3564(true);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field878.field343.length > this.field881) {
                    if (this.field878.field343[this.field881] == 0) {
                        this.field881++;
                    } else {
                        if (this.field880.method2084(46)) {
                            var6 = false;
                            break;
                        }
                        if (this.field862[this.field881] != 1) {
                            this.method578(this.field881, arg0 - 23661, 2);
                        }
                        if (this.field862[this.field881] != 1) {
                            class656 var8 = new class656();
                            var8.field8680 = this.field881;
                            var6 = false;
                            this.field883.method11(var8, -91);
                        }
                        this.field881++;
                    }
                }
                if (var6) {
                    this.field881 = 0;
                    this.field885 = false;
                }
            } else {
                this.field883 = null;
            }
        }
        if (!this.field887 || this.field886 > class375.method2193(116)) {
            return;
        }
        for (class578 var10 = (class578) this.field873.method2144(true); var10 != null; var10 = (class578) this.field873.method2146(false)) {
            if (!var10.field7580) {
                if (var10.field7581) {
                    if (!var10.field7583) {
                        throw new RuntimeException();
                    }
                    var10.method3564(true);
                } else {
                    var10.field7581 = true;
                }
            }
        }
        this.field886 = class375.method2193(116) + 1000L;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I", line = 626)
    public final int method287(int arg0, int arg1) {
        field869++;
        class578 var3 = (class578) this.field873.method2135((long) arg0, (byte) 31);
        if (var3 == null) {
            return arg1 == 1113 ? 0 : -113;
        } else {
            return var3.method3170(0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V", line = 648)
    public final void method288(byte arg0, int arg1) {
        if (arg0 != 76) {
            return;
        }
        field876++;
        if (this.field877 == null) {
            return;
        }
        for (class656 var3 = this.field882.method21(2); var3 != null; var3 = this.field882.method9(-128)) {
            if ((long) arg1 == var3.field8680) {
                return;
            }
        }
        class656 var4 = new class656();
        var4.field8680 = arg1;
        this.field882.method11(var4, -107);
    }

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "(I)I", line = 681)
    public final int method582(int arg0) {
        field863++;
        if (this.field878 == null) {
            return 0;
        } else if (this.field884) {
            if (arg0 <= 52) {
                method583(37);
            }
            class656 var2 = this.field883.method21(2);
            return var2 == null ? 0 : (int) var2.field8680;
        } else {
            return this.field878.field341;
        }
    }

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "(I)V", line = 738)
    public static void method583(int arg0) {
        if (arg0 != 1) {
            method583(126);
        }
        field857 = null;
    }

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "(I)V", line = 748)
    public final void method584(int arg0) {
        field864++;
        if (this.field883 == null || this.method290(-77) == null) {
            return;
        }
        for (class656 var2 = this.field882.method21(arg0); var2 != null; var2 = this.field882.method9(-127)) {
            int var3 = (int) var2.field8680;
            if (var3 < 0 || this.field878.field354 <= var3 || this.field878.field343[var3] == 0) {
                var2.method3564(true);
            } else {
                if (this.field862[var3] == 0) {
                    this.method578(var3, -23661, 1);
                }
                if (this.field862[var3] == -1) {
                    this.method578(var3, -23661, 2);
                }
                if (this.field862[var3] == 1) {
                    var2.method3564(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ILmi;Lmi;Ltk;Leia;I[BIZ)V", line = 817)
    public class71(int arg0, class498 arg1, class498 arg2, class348 arg3, class244 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field877 = arg1;
        this.field866 = arg0;
        if (this.field877 == null) {
            this.field884 = false;
        } else {
            this.field884 = true;
            this.field883 = new class2();
        }
        this.field880 = arg3;
        this.field887 = arg8;
        this.field855 = arg2;
        this.field871 = arg4;
        this.field872 = arg5;
        this.field875 = arg7;
        this.field870 = arg6;
        if (this.field855 != null) {
            this.field859 = this.field871.method1519(this.field855, -3, this.field866);
        }
    }
}
