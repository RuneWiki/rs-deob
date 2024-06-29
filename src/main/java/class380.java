import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pka")
public class class380 {

    @OriginalMember(owner = "client!pka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5551 = new String[] { method3006(method3005("\"jw\u0012[z")), method3006(method3005("\"jw\u0012Yz")), method3006(method3005("r,(")), method3006(method3005("<tzP")), method3006(method3005(")/8\u0012e")), method3006(method3005("nbyP%4gpZ~4?6\u00138")), method3006(method3005("\"jw\u0012Zz")) };

    @OriginalMember(owner = "client!pka", name = "d", descriptor = "Lru;")
    public static class62 field5548 = new class62(0, 0);

    @OriginalMember(owner = "client!pka", name = "c", descriptor = "I")
    public static int field5550 = -1;

    @OriginalMember(owner = "client!pka", name = "a", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!pka", name = "b", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!pka", name = "a", descriptor = "(ILha;)V", line = 5)
    public static final void method3002(int arg0, class18 arg1) {
        try {
            if (arg0 == -25433) {
                field5547++;
                if ((class72.field1049 >= 2 || class351.field5091) && class543.field7943 == null) {
                    String var2;
                    if (class351.field5091 && class72.field1049 < 2) {
                        var2 = class268.field3795 + class537.field7862.method4068((byte) -93, class405.field5883) + class109.field1426 + field5551[2];
                    } else if (class113.field1460 && class496.field7286.method2604(81, true) && class72.field1049 > 2) {
                        var2 = class105.method1003((byte) -92, class44.field639);
                    } else {
                        class228 var3 = class44.field639;
                        if (var3 == null) {
                            return;
                        }
                        var2 = class105.method1003((byte) -120, var3);
                        int[] var4 = null;
                        if (class279.method2274(var3.field3311, (byte) -120)) {
                            var4 = class153.field1955.method3237((int) var3.field3299, 0).field5428;
                        } else if (var3.field3313 != -1) {
                            var4 = class153.field1955.method3237(var3.field3313, arg0 + 25433).field5428;
                        } else if (class161.method1354(var3.field3311, 2353)) {
                            class527 var6 = (class527) class479.field7063.method3693(false, (long) ((int) var3.field3299));
                            if (var6 != null) {
                                class717 var7 = var6.field7672;
                                class134 var8 = var7.field10229;
                                if (var8.field1659 != null) {
                                    var8 = var8.method1178(class734.field10459, (byte) -86);
                                }
                                if (var8 != null) {
                                    var4 = var8.field1700;
                                }
                            }
                        } else if (class572.method4258((byte) -56, var3.field3311)) {
                            class789 var5 = class101.field1359.method2832(arg0 + 25556, (int) (var3.field3299 >>> 32 & 0x7FFFFFFFL));
                            if (var5.field11465 != null) {
                                var5 = var5.method5688(arg0 ^ 0xFFFF9CD6, class734.field10459);
                            }
                            if (var5 != null) {
                                var4 = var5.field11395;
                            }
                        }
                        if (var4 != null) {
                            var2 = var2 + class222.method1864(arg0 + 25433, var4);
                        }
                    }
                    if (class72.field1049 > 2) {
                        var2 = var2 + field5551[5] + (class72.field1049 - 2) + class537.field7855.method4068((byte) -90, class405.field5883);
                    }
                    if (class234.field3384 != null) {
                        class216 var10 = class234.field3384.method5626(arg1, arg0 ^ 0xFFFF9CA7);
                        if (var10 == null) {
                            var10 = class200.field2954;
                        }
                        var10.method1833(class342.field4978, class234.field3384.field11128, class234.field3384.field11295, 874490438, var2, class240.field3465, class234.field3384.field11244, class263.field3723, class234.field3384.field11163, class799.field11609, class234.field3384.field11141, class776.field11071, class23.field273, class276.field3894, class234.field3384.field11192);
                        class376.method2982(class240.field3465[3], class240.field3465[2], class240.field3465[0], class240.field3465[1], 9532);
                    } else if (class789.field11387 != null && class544.field7978 == class378.field5530) {
                        int var9 = class200.field2954.method1824(0, class342.field4978, class23.field273, class652.field9266 + 16, var2, class799.field11609, 16777215, class78.field1098 + 4, 0, class776.field11071);
                        class376.method2982(16, class520.field7584.method1368(var2, arg0 + 25346) + var9, class78.field1098 + 4, class652.field9266, arg0 + 34965);
                        return;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5551[1] + arg0 + ',' + (arg1 == null ? field5551[3] : field5551[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!pka", name = "a", descriptor = "(I)V", line = 108)
    public static void method3003(int arg0) {
        try {
            int var1 = -74 % ((arg0 - 30) / 47);
            field5548 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5551[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIILft;II)Ljava/awt/Frame;", line = 119)
    public static final Frame method3004(int arg0, int arg1, int arg2, class188 arg3, int arg4, int arg5) {
        try {
            field5549++;
            if (!arg3.method1574(true)) {
                return null;
            } else if (arg4 > -37) {
                return null;
            } else {
                if (arg2 == 0) {
                    class189[] var6 = class282.method2294(127, arg3);
                    if (var6 == null) {
                        return null;
                    }
                    boolean var7 = false;
                    for (int var8 = 0; var8 < var6.length; var8++) {
                        if (var6[var8].field2514 == arg1 && var6[var8].field2519 == arg5 && (arg0 == 0 || var6[var8].field2512 == arg0) && (!var7 || arg2 < var6[var8].field2511)) {
                            var7 = true;
                            arg2 = var6[var8].field2511;
                        }
                    }
                    if (!var7) {
                        return null;
                    }
                }
                class328 var9 = arg3.method1566(arg5, true, arg1, arg0, arg2);
                while (var9.field4486 == 0) {
                    class449.method3474(20817, 10L);
                }
                Frame var10 = (Frame) var9.field4487;
                if (var10 == null) {
                    return null;
                } else if (var9.field4486 == 2) {
                    class653.method4747(var10, 1, arg3);
                    return null;
                } else {
                    return var10;
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5551[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5551[3] : field5551[4]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3005(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3006(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
