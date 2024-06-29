import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class682 {

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lwq;")
    private class178 field9871 = new class178(64);

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Lwq;")
    public class178 field9887 = new class178(50);

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lwm;")
    public class590 field9889 = new class590(250);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Ljea;")
    private class474 field9890 = new class474();

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lla;")
    private class476 field9884;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public int field9879;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lla;")
    public class476 field9885;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
    private boolean field9881;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lun;")
    private class444 field9893;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field9873;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field9892;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field9891;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9895 = new String[] { method5006(method5005("7[lA_")), method5006(method5005("7[lJ_")), method5006(method5005("7[lM_")), method5006(method5005("7[lI_")), method5006(method5005("*\u001fl&\n")), method5006(method5005("?D.d")), method5006(method5005("7[lL_")), method5006(method5005("7[l4\u001e?X66_")), method5006(method5005("7[l@_")), method5006(method5005("7[lC_")), method5006(method5005("7[lN_")), method5006(method5005("7[lK_")), method5006(method5005("7[lO_")), method5006(method5005("7[lB_")) };

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Lel;")
    public static class573 field9877 = new class573(103, 3);

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public int field9894;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILha;ILee;Lha;ZLda;IIIZI)Lfs;")
    public final class581 method4994(int arg0, class66 arg1, int arg2, class704 arg3, class66 arg4, boolean arg5, class67 arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        try {
            field9872++;
            class581 var13 = this.method5001(arg3, -99, arg9, arg2, arg8, arg4, arg0, arg7);
            if (var13 != null) {
                return var13;
            }
            class530 var14 = this.method5000(arg7, (byte) 105);
            if (arg2 > 1 && var14.field7784 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg2 >= var14.field7787[var16] && var14.field7787[var16] != 0) {
                        var15 = var14.field7784[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method5000(var15, (byte) 53);
                }
            }
            int[] var17 = var14.method4001(arg8, arg0, arg5, arg3, arg11 ^ 0x1B78, arg2, arg6, arg9, arg1, arg4);
            if (var17 == null) {
                return null;
            }
            class581 var18;
            if (arg10) {
                var18 = arg1.method520(0, 36, var17, (byte) 41, 36, 32);
            } else {
                var18 = arg4.method520(0, 36, var17, (byte) 41, 36, 32);
            }
            if (arg11 != -1) {
                field9877 = null;
            }
            if (!arg10) {
                class474 var19 = new class474();
                var19.field6873 = arg3 != null;
                var19.field6880 = arg0;
                var19.field6881 = arg2;
                var19.field6875 = arg4.field688;
                var19.field6876 = arg7;
                var19.field6870 = arg9;
                var19.field6879 = arg8;
                this.field9889.method4389(arg11 ^ 0x5970, var19, var18);
            }
            return var18;
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field9895[3] + arg0 + ',' + (arg1 == null ? field9895[5] : field9895[4]) + ',' + arg2 + ',' + (arg3 == null ? field9895[5] : field9895[4]) + ',' + (arg4 == null ? field9895[5] : field9895[4]) + ',' + arg5 + ',' + (arg6 == null ? field9895[5] : field9895[4]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
    public final void method4995(int arg0, int arg1) {
        try {
            class178 var3 = this.field9871;
            synchronized (this.field9871) {
                this.field9871.method1557(arg0, (byte) -114);
            }
            field9888++;
            class178 var4 = this.field9887;
            synchronized (this.field9887) {
                this.field9887.method1557(arg0, (byte) -122);
            }
            class590 var5 = this.field9889;
            synchronized (this.field9889) {
                if (arg1 != 50) {
                    field9877 = null;
                }
                this.field9889.method4396(arg0, arg1 ^ 0x33);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9895[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)V")
    public final void method4996(boolean arg0, int arg1) {
        try {
            field9878++;
            if (arg0 != this.field9881) {
                this.field9881 = arg0;
                if (arg1 < 17) {
                    method4998(-102);
                }
                this.method5003((byte) -126);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9895[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public final void method4997(byte arg0) {
        try {
            field9883++;
            class178 var2 = this.field9871;
            synchronized (this.field9871) {
                this.field9871.method1569(arg0 + 10508);
            }
            class178 var3 = this.field9887;
            synchronized (this.field9887) {
                this.field9887.method1569(arg0 + 10508);
            }
            class590 var4 = this.field9889;
            synchronized (this.field9889) {
                if (arg0 != 66) {
                    this.field9890 = null;
                }
                this.field9889.method4392(14575);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9895[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static void method4998(int arg0) {
        try {
            if (arg0 == 9369) {
                field9877 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9895[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public final void method4999(int arg0) {
        try {
            field9886++;
            class590 var2 = this.field9889;
            synchronized (this.field9889) {
                this.field9889.method4400((byte) 105);
            }
            int var3 = -116 / ((-arg0 - 54) / 33);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9895[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)Lko;")
    public final class530 method5000(int arg0, byte arg1) {
        try {
            field9874++;
            class178 var3 = this.field9871;
            class530 var4;
            synchronized (this.field9871) {
                var4 = (class530) this.field9871.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field9884;
            byte[] var6;
            synchronized (this.field9884) {
                var6 = this.field9884.method3632(class476.method3633((byte) -97, arg0), class240.method2056(1, arg0), -14);
                if (arg1 <= 38) {
                    this.method5003((byte) -106);
                }
            }
            class530 var7 = new class530();
            var7.field7761 = arg0;
            var7.field7758 = this;
            var7.field7743 = new String[] { null, null, class309.field4855.method2616(false, this.field9879), null, null };
            var7.field7729 = new String[] { null, null, null, null, class309.field4856.method2616(false, this.field9879) };
            if (var6 != null) {
                var7.method4006(new class163(var6), false);
            }
            var7.method4003((byte) 45);
            if (var7.field7756 != -1) {
                var7.method3994(this.method5000(var7.field7788, (byte) 95), -104, this.method5000(var7.field7756, (byte) 78));
            }
            if (var7.field7793 != -1) {
                var7.method4012(113, this.method5000(var7.field7765, (byte) 40), this.method5000(var7.field7793, (byte) 66));
            }
            if (var7.field7742 != -1) {
                var7.method3997(-5, this.method5000(var7.field7726, (byte) 115), this.method5000(var7.field7742, (byte) 98));
            }
            if (!this.field9881 && var7.field7709) {
                var7.field7775 = class309.field4852.method2616(false, this.field9879);
                var7.field7743 = this.field9892;
                var7.field7751 = 0;
                var7.field7719 = false;
                var7.field7729 = this.field9891;
                var7.field7734 = null;
                if (var7.field7769 != null) {
                    boolean var8 = false;
                    for (class206 var9 = var7.field7769.method971(347); var9 != null; var9 = var7.field7769.method973(true)) {
                        class181 var10 = this.field9893.method3413((byte) -34, (int) var9.field3177);
                        if (var10.field2501) {
                            var9.method1824(1);
                        } else {
                            var8 = true;
                        }
                    }
                    if (!var8) {
                        var7.field7769 = null;
                    }
                }
            }
            class178 var11 = this.field9871;
            synchronized (this.field9871) {
                this.field9871.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field9895[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lee;IIIILha;II)Lfs;")
    public final class581 method5001(class704 arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6, int arg7) {
        try {
            if (arg1 > -13) {
                return null;
            }
            this.field9890.field6875 = arg5.field688;
            this.field9890.field6880 = arg6;
            this.field9890.field6879 = arg4;
            this.field9890.field6873 = arg0 != null;
            this.field9890.field6876 = arg7;
            this.field9890.field6881 = arg3;
            this.field9890.field6870 = arg2;
            field9876++;
            return (class581) this.field9889.method4393((byte) 74, this.field9890);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9895[13] + (arg0 == null ? field9895[5] : field9895[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field9895[5] : field9895[4]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method5002(int arg0) {
        try {
            field9880++;
            class178 var2 = this.field9887;
            synchronized (this.field9887) {
                this.field9887.method1559(arg0 ^ arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9895[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public final void method5003(byte arg0) {
        try {
            class178 var2 = this.field9871;
            synchronized (this.field9871) {
                if (arg0 != -126) {
                    this.field9871 = null;
                }
                this.field9871.method1559(0);
            }
            field9875++;
            class178 var3 = this.field9887;
            synchronized (this.field9887) {
                this.field9887.method1559(arg0 + 126);
            }
            class590 var4 = this.field9889;
            synchronized (this.field9889) {
                this.field9889.method4400((byte) 64);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9895[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public final void method5004(int arg0, int arg1) {
        try {
            field9882++;
            this.field9894 = arg1;
            class178 var3 = this.field9887;
            synchronized (this.field9887) {
                int var4 = -112 % ((arg0 + 9) / 42);
                this.field9887.method1559(0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9895[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lto;IZLun;Lla;Lla;)V")
    public class682(class8 arg0, int arg1, boolean arg2, class444 arg3, class476 arg4, class476 arg5) {
        try {
            this.field9884 = arg4;
            this.field9879 = arg1;
            this.field9885 = arg5;
            this.field9881 = arg2;
            this.field9893 = arg3;
            if (this.field9884 == null) {
                this.field9873 = 0;
            } else {
                int var7 = this.field9884.method3629((byte) 18) - 1;
                this.field9873 = this.field9884.method3646(var7, (byte) -83) + var7 * 256;
            }
            this.field9892 = new String[] { null, null, class309.field4855.method2616(false, this.field9879), null, null };
            this.field9891 = new String[] { null, null, null, null, class309.field4856.method2616(false, this.field9879) };
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9895[7] + (arg0 == null ? field9895[5] : field9895[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9895[5] : field9895[4]) + ',' + (arg4 == null ? field9895[5] : field9895[4]) + ',' + (arg5 == null ? field9895[5] : field9895[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5005(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5006(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
