import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class581 extends class685 {

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "Lgda;")
    public class268 field8395;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8399 = new String[] { method4312(method4311("Z\u00185N\u001e\u0016")), method4312(method4311("Z\u00185N\u001d\u0016")), method4312(method4311("P\u000e8\f")), method4312(method4311("EUzN!")), method4312(method4311("Z\u00185N`W\u0015=\u0014b\u0016")) };

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lu;")
    public static class741 field8393 = new class741(method4312(method4311("r4\u0017!\u0010")), "", method4312(method4311("R\u00147\u00010")), 4);

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjava/lang/String;ZB)V", line = 9)
    public static final void method4309(int arg0, String arg1, boolean arg2, byte arg3) {
        try {
            class632.method4618(true);
            field8398++;
            if (arg0 == 0) {
                class236.field3418 = class325.method2569(class560.field8153, 0, class194.field2701, class608.field8716, class451.field6612.field9132.method2747(3) * 2, 0);
                if (arg1 != null) {
                    class236.field3418.method243(0);
                    class161 var4 = class85.method854((byte) -118, class717.field10218, 0, class151.field1933);
                    class216 var5 = class236.field3418.method145(var4, class66.method694(class524.field7640, class717.field10218, 0), true);
                    class595.method4389(8976);
                    class649.method4730(2, var4, arg1, var5, class236.field3418, true);
                }
            } else {
                class18 var6 = null;
                if (arg1 != null) {
                    var6 = class325.method2569(class560.field8153, 0, class194.field2701, class608.field8716, 0, 0);
                    var6.method243(0);
                    class161 var7 = class85.method854((byte) -118, class717.field10218, 0, class151.field1933);
                    class216 var8 = var6.method145(var7, class66.method694(class524.field7640, class717.field10218, 0), true);
                    class595.method4389(8976);
                    class649.method4730(2, var7, arg1, var8, var6, true);
                }
                boolean var26 = false;
                label253: {
                    try {
                        var26 = true;
                        class236.field3418 = class325.method2569(class560.field8153, arg0, class194.field2701, class608.field8716, class451.field6612.field9132.method2747(3) * 2, 0);
                        if (arg1 != null) {
                            var6.method243(0);
                            class161 var9 = class85.method854((byte) -108, class717.field10218, 0, class151.field1933);
                            class216 var10 = var6.method145(var9, class66.method694(class524.field7640, class717.field10218, 0), true);
                            class595.method4389(8976);
                            class649.method4730(2, var9, arg1, var10, var6, true);
                        }
                        if (class236.field3418.method140()) {
                            boolean var11 = true;
                            try {
                                var11 = class799.field11611.field337 > 256;
                            } catch (Throwable var30) {
                            }
                            class348 var12;
                            if (var11) {
                                var12 = class236.field3418.method214(146800640);
                            } else {
                                var12 = class236.field3418.method214(104857600);
                            }
                            class236.field3418.method207(var12);
                            var26 = false;
                        } else {
                            var26 = false;
                        }
                        break label253;
                    } catch (Throwable var31) {
                        int var13 = class451.field6612.field9134.method4717(3);
                        if (var13 == 2) {
                            class615.field8784 = true;
                        }
                        class451.field6612.method4681(0, class451.field6612.field9134, (byte) -111);
                        method4309(var13, arg1, arg2, (byte) -117);
                        Object var10000 = null;
                        var26 = false;
                    } finally {
                        if (var26) {
                            Object var18 = null;
                            if (var6 != null) {
                                try {
                                    var6.method177((byte) -87);
                                } catch (Throwable var28) {
                                }
                            }
                        }
                    }
                    if (var6 != null) {
                        try {
                            var6.method177((byte) -87);
                        } catch (Throwable var27) {
                        }
                    }
                    return;
                }
                Object var17 = null;
                if (var6 != null) {
                    try {
                        var6.method177((byte) -87);
                    } catch (Throwable var29) {
                    }
                }
            }
            class451.field6612.field9134.method4719((byte) -93, !arg2);
            class451.field6612.method4681(arg0, class451.field6612.field9134, (byte) -111);
            class606.method4475(-1);
            class236.field3418.method154(10000);
            class236.field3418.method209(32);
            class151.field1925 = class236.field3418.method221();
            class572.field8293 = class236.field3418.method221();
            class502.method3843(true);
            class236.field3418.method199(class451.field6612.field9093.method4921(3) == 1);
            if (class236.field3418.method166()) {
                class599.method4416(class451.field6612.field9130.method2195(3) == 1, -13304);
            }
            if (arg3 > -114) {
                field8396 = 66;
            }
            class111.method1041((byte) 118, class14.field187 >> 3, class236.field3418, class625.field8929 >> 3);
            class180.method1498((byte) 94);
            class679.field9530 = null;
            class381.field5555 = true;
            class460.field6709 = false;
            class761.method5514((byte) -63);
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field8399[1] + arg0 + ',' + (arg1 == null ? field8399[2] : field8399[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 132)
    public static void method4310(int arg0) {
        try {
            field8393 = null;
            int var1 = -42 % ((65 - arg0) / 55);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8399[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lml;II[B)V", line = 141)
    public class581(class194 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field8395 = class172.method1453(34037, arg2, arg3, false, arg0, arg1, 6406, 6406);
            this.field8395.method1065(false, (byte) 120, false);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8399[4] + (arg0 == null ? field8399[2] : field8399[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8399[2] : field8399[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4311(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4312(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
