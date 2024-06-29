import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class278 extends class114 {

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field3929 = -1;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3930 = new String[] { method2269(method2268("'j_F")), method2269(method2268("*s\u001dim")), method2269(method2268("21\u001d\u00048")), method2269(method2268("*s\u001dhm")), method2269(method2268("*s\u001dom")), method2269(method2268("*s\u001dnm")), method2269(method2268("*s\u001dkm")) };

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lui;")
    public static class251 field3926 = new class251(64);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lsb;")
    public static class261 field3928 = new class261(127, 5);

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
    public static final void method2265(boolean arg0) {
        try {
            field3926.method2043(arg0);
            field3927++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3930[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIILjka;IIIILha;I)V")
    public static final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4, class228 arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10, int arg11) {
        try {
            if (arg11 < arg4 && arg9 + arg11 > arg4 && arg1 > arg0 - 13 && arg1 < arg0 + 3 && arg5.field3295) {
                arg6 = arg8;
            }
            field3925++;
            int[] var12 = null;
            if (class279.method2274(arg5.field3311, (byte) -120)) {
                var12 = class153.field1955.method3237((int) arg5.field3299, 0).field5428;
            } else if (arg5.field3313 != -1) {
                var12 = class153.field1955.method3237(arg5.field3313, 0).field5428;
            } else if (class161.method1354(arg5.field3311, 2353)) {
                class527 var14 = (class527) class479.field7063.method3693(false, (long) ((int) arg5.field3299));
                if (var14 != null) {
                    class717 var15 = var14.field7672;
                    class134 var16 = var15.field10229;
                    if (var16.field1659 != null) {
                        var16 = var16.method1178(class734.field10459, (byte) -114);
                    }
                    if (var16 != null) {
                        var12 = var16.field1700;
                    }
                }
            } else if (class572.method4258((byte) -67, arg5.field3311)) {
                class789 var13 = class101.field1359.method2832(122, (int) (arg5.field3299 >>> 32 & 0x7FFFFFFFL));
                if (var13.field11465 != null) {
                    var13 = var13.method5688(49, class734.field10459);
                }
                if (var13 != null) {
                    var12 = var13.field11395;
                }
            }
            String var17 = class105.method1003((byte) 123, arg5);
            if (var12 != null) {
                var17 = var17 + class222.method1864(arg7, var12);
            }
            class200.field2954.method1834(arg6, 62, arg0, arg11 + 3, class342.field4978, var17, class776.field11071, arg7);
            if (arg5.field3308) {
                class621.field8840.method3074(arg11 + (class520.field7584.method1368(var17, -119) + 5), arg0 + -12);
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field3930[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field3930[0] : field3930[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field3930[0] : field3930[2]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            field3923++;
            if (arg0 == 95) {
                arg1.method2321(this.field3929, 0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3930[5] + arg0 + ',' + (arg1 == null ? field3930[0] : field3930[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method2267(int arg0) {
        try {
            if (arg0 != -30684) {
                method2266(48, -109, -98, 100, -58, null, 119, -52, 43, -71, null, -56);
            }
            field3926 = null;
            field3928 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3930[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg1 != -27800) {
                this.method116(null, -59);
            }
            field3924++;
            this.field3929 = arg0.method5116((byte) -113);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3930[6] + (arg0 == null ? field3930[0] : field3930[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2268(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2269(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
