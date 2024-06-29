import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class398 {

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5798 = new String[] { method3122(method3121("\u0016F[<M\\")), method3122(method3121("\u001aTV~")), method3122(method3121("\u000f\u000f\u0014<v")), method3122(method3121("\u0016F[<I\\")), method3122(method3121("\u0016F[<H\\")), method3122(method3121("\u0016F[<N\\")), method3122(method3121("\u0016F[<O\\")), method3122(method3121("\u0016F[<J\\")) };

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "Lu;")
    public static class741 field5793 = new class741(method3122(method3121("8hlW")), "", "", 0);

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field5794 = 0;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "D")
    public static double field5792;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "Lbda;")
    public class181 field5790;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Lcu;")
    public static class66 field5796;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(B)V", line = 5)
    public static void method3115(byte arg0) {
        try {
            if (arg0 < -123) {
                field5796 = null;
                field5793 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5798[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BII)Z", line = 17)
    public static final boolean method3116(byte arg0, int arg1, int arg2) {
        try {
            field5788++;
            if (arg0 != -33) {
                method3120((byte) 70);
            }
            return false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5798[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILha;IIIB)V", line = 29)
    public static final void method3117(int arg0, int arg1, class18 arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            if ((class732.field10451 == null || class385.field5626 == null || class108.field1416 == null) && class524.field7640.method530(false, class557.field8109) && class524.field7640.method530(false, class701.field9806) && class524.field7640.method530(false, class526.field7656)) {
                class66 var7 = class66.method704(class524.field7640, class701.field9806, 0);
                class385.field5626 = arg2.method231(var7, true);
                var7.method695();
                class716.field10200 = arg2.method231(var7, true);
                class732.field10451 = arg2.method231(class66.method704(class524.field7640, class557.field8109, 0), true);
                class66 var8 = class66.method704(class524.field7640, class526.field7656, 0);
                class108.field1416 = arg2.method231(var8, true);
                var8.method695();
                class501.field7322 = arg2.method231(var8, true);
            }
            field5787++;
            if (class732.field10451 != null && class385.field5626 != null && class108.field1416 != null) {
                int var9 = (arg0 - (class108.field1416.method1376() * 2)) / class732.field10451.method1376();
                for (int var10 = 0; var10 < var9; var10++) {
                    class732.field10451.method3074(arg1 - (-class108.field1416.method1376() - (class732.field10451.method1376() * var10)), -class732.field10451.method1377() + arg5 + arg4);
                }
                int var11 = (arg4 - arg3 - class108.field1416.method1377()) / class385.field5626.method1377();
                for (int var12 = 0; var12 < var11; var12++) {
                    class385.field5626.method3074(arg1, arg3 + (arg5 + (var12 * class385.field5626.method1377())));
                    class716.field10200.method3074(arg1 + arg0 - class716.field10200.method1376(), arg5 + arg3 + class385.field5626.method1377() * var12);
                }
                class108.field1416.method3074(arg1, arg4 + arg5 - class108.field1416.method1377());
                class501.field7322.method3074(arg0 + arg1 - class108.field1416.method1376(), -class108.field1416.method1377() + arg4 + arg5);
            }
            int var13 = 76 % ((arg6 + 63) / 51);
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field5798[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5798[1] : field5798[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 89)
    public static final void method3118(int arg0) {
        try {
            field5789++;
            class251 var1 = class391.field5710;
            synchronized (class391.field5710) {
                if (arg0 != 3) {
                    method3120((byte) 42);
                }
                class391.field5710.method2047(11914);
            }
            class251 var2 = class270.field3827;
            synchronized (class270.field3827) {
                class270.field3827.method2047(11914);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5798[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V", line = 111)
    public static final void method3119(boolean arg0, int arg1) {
        try {
            class265.field3738++;
            field5786++;
            class274 var2 = class375.method2969((byte) 1, class221.field3202, class60.field916.field11100);
            if (arg1 != -27370) {
                method3120((byte) 125);
            }
            class60.field916.method5608(var2, 29867);
            for (class509 var3 = (class509) class104.field1375.method3696(0); var3 != null; var3 = (class509) class104.field1375.method3697(-90)) {
                if (!var3.method4293(arg1 + 27270)) {
                    var3 = (class509) class104.field1375.method3696(0);
                    if (var3 == null) {
                        break;
                    }
                }
                if (var3.field7473 == 0) {
                    class394.method3082(var3, true, arg0, -4438);
                }
            }
            if (class500.field7302 != null) {
                class97.method959(class500.field7302, -1);
                class500.field7302 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5798[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 163)
    public static final void method3120(byte arg0) {
        try {
            field5795++;
            if (class559.field8139 == 3) {
                class699.method5035(4, 31754);
            } else if (class559.field8139 == 7) {
                class699.method5035(8, 31754);
            } else if (class559.field8139 == 9) {
                class699.method5035(10, 31754);
            } else if (class559.field8139 == 11) {
                class699.method5035(12, 31754);
            }
            if (arg0 != 20) {
                method3116((byte) 48, -51, 17);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5798[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3121(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3122(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
