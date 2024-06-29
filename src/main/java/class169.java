import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class169 implements class763 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Llga;")
    private class47 field2164;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Ljava/lang/String;")
    private String field2167;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2168 = new String[] { method1426(method1425("Pda8i")), method1426(method1425("Pda6i")), method1426(method1425("Pda3i")), method1426(method1425("PdaM(Mk;Oi")), method1426(method1425("Mw#\u001d")), method1426(method1425("X,a_<")), method1426(method1425("Pda2i")), method1426(method1425("Pda9i")), method1426(method1425("Pda5i")), method1426(method1425("Pda4i")), method1426(method1425("Pda7i")), method1426(method1425("Pda0i")) };

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lsb;")
    public static class261 field2158 = new class261(34, -2);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Ltb;")
    public static class392 field2165;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Llga;")
    public static class47 field2159;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvo;II)I")
    public static final int method1418(class782 arg0, int arg1, int arg2) {
        try {
            field2166++;
            if (!client.method4957(arg0).method1181(arg1, arg2) && arg0.field11254 == null) {
                return -1;
            } else if (arg0.field11162 == null || arg1 >= arg0.field11162.length) {
                return -1;
            } else {
                return arg0.field11162[arg1];
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2168[7] + (arg0 == null ? field2168[4] : field2168[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Luw;")
    public final class706 method1254(int arg0) {
        try {
            field2162++;
            if (arg0 >= -92) {
                this.field2164 = null;
            }
            return class706.field9869;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2168[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
    public final int method1252(int arg0) {
        try {
            int var2 = 6 / ((-arg0 - 28) / 36);
            field2156++;
            return this.field2164.method532(this.field2167, 40) ? 100 : 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2168[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static void method1419(int arg0) {
        try {
            if (arg0 != -31402) {
                field2158 = null;
            }
            field2159 = null;
            field2158 = null;
            field2165 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2168[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static final void method1420(int arg0) {
        try {
            field2161++;
            if (arg0 == 34) {
                for (int var1 = 0; var1 < 5; var1++) {
                    class318.field4350[var1] = false;
                }
                class2.field28 = 0;
                class301.field4188 = -1;
                class171.field2267 = -1;
                class369.field5338 = 0;
                class326.field4462 = -1;
                class596.field8579 = 1;
                class444.field6552 = -1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2168[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static final void method1421(boolean arg0) {
        try {
            if (!arg0) {
                field2159 = null;
            }
            class786.field11354.method3344(18);
            field2160++;
            class238.field3445 = null;
            class385.field5631 = 1;
            class430.field6242 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2168[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method1422(byte arg0) {
        try {
            field2157++;
            client var1 = class572.field8287;
            synchronized (class572.field8287) {
                if (class321.field4374 == null) {
                    Container var2;
                    if (class543.field7942 != null) {
                        var2 = class543.field7942;
                    } else if (class290.field4091 == null) {
                        var2 = class743.field10561;
                    } else {
                        var2 = class290.field4091;
                    }
                    class792.field11523 = var2.getSize().width;
                    class40.field615 = var2.getSize().height;
                    if (class543.field7942 == var2) {
                        Insets var3 = class543.field7942.getInsets();
                        class40.field615 -= var3.top + var3.bottom;
                        class792.field11523 -= var3.left + var3.right;
                    }
                    if (class680.method4883(70) == 1) {
                        class391.field5700 = class500.field7304;
                        class232.field3346 = 0;
                        class711.field9998 = class791.field11507;
                        class349.field5061 = (class792.field11523 - class500.field7304) / 2;
                    } else {
                        class646.method4706(-104);
                    }
                    if (class398.field5793 != class35.field426) {
                        boolean var10000;
                        if (class391.field5700 < 1024 && class711.field9998 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    if (arg0 <= 14) {
                        field2159 = null;
                    }
                    class560.field8153.setSize(class391.field5700, class711.field9998);
                    if (class236.field3418 != null) {
                        if (class212.field3119) {
                            class437.method3408(class560.field8153, false);
                        } else {
                            class236.field3418.method168(class560.field8153, class391.field5700, class711.field9998);
                        }
                    }
                    if (class543.field7942 == var2) {
                        Insets var4 = class543.field7942.getInsets();
                        class560.field8153.setLocation(class349.field5061 + var4.left, class232.field3346 + var4.top);
                    } else {
                        class560.field8153.setLocation(class349.field5061, class232.field3346);
                    }
                    if (class572.field8291 != -1) {
                        class273.method2240(16664, true);
                    }
                    class595.method4389(8976);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field2168[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIILmca;I)V")
    public static final void method1423(byte arg0, int arg1, int arg2, int arg3, class576 arg4, int arg5) {
        try {
            field2155++;
            if (arg4.field8321 != -1 || arg4.field8326 != null) {
                int var6 = 0;
                int var7 = arg4.field8331 * class451.field6612.field9087.method2498(3) >> 8;
                if (arg3 > arg4.field8335) {
                    var6 += arg3 - arg4.field8335;
                } else if (arg3 < arg4.field8337) {
                    var6 += arg4.field8337 - arg3;
                }
                if (arg4.field8320 < arg1) {
                    var6 += arg1 - arg4.field8320;
                } else if (arg1 < arg4.field8338) {
                    var6 += arg4.field8338 - arg1;
                }
                if (arg4.field8328 == 0 || arg4.field8328 < (var6 - 256) || class451.field6612.field9087.method2498(arg0 ^ 0xFFFFFFF8) == 0 || arg4.field8340 != arg5) {
                    if (arg4.field8324 != null) {
                        class261.field3699.method4232(arg4.field8324);
                        arg4.field8354 = null;
                        arg4.field8324 = null;
                        arg4.field8345 = null;
                    }
                    if (arg4.field8333 != null) {
                        class261.field3699.method4232(arg4.field8333);
                        arg4.field8350 = null;
                        arg4.field8336 = null;
                        arg4.field8333 = null;
                    }
                } else {
                    var6 -= 256;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var8 = arg4.field8328 - arg4.field8322;
                    if (var8 < 0) {
                        var8 = arg4.field8328;
                    }
                    int var9 = var7;
                    int var10 = var6 - arg4.field8322;
                    if (var10 > 0 && var8 > 0) {
                        var9 = (var8 - var10) * var7 / var8;
                    }
                    class203.field2988.method1437((byte) -28);
                    int var11 = 8192;
                    int var12 = (arg4.field8337 + arg4.field8335) / 2 - arg3;
                    int var13 = (arg4.field8338 + arg4.field8320) / 2 - arg1;
                    if (var12 != 0 || var13 != 0) {
                        int var14 = -class57.field802 - (int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
                        if (var14 > 8192) {
                            var14 = 16384 - var14;
                        }
                        int var15;
                        if (var6 <= 0) {
                            var15 = 8192;
                        } else if (var6 < 4096) {
                            var15 = (var6 * 8192 / 4096) + 8192;
                        } else {
                            var15 = 16384;
                        }
                        var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
                    }
                    if (arg0 != -5) {
                        method1421(false);
                    }
                    if (arg4.field8324 != null) {
                        arg4.field8324.method920(var9);
                        arg4.field8324.method929(var11);
                    } else if (arg4.field8321 >= 0) {
                        int var16 = arg4.field8334 == 256 && arg4.field8352 == 256 ? 256 : class443.method3448(arg4.field8352, arg0 + 29948, arg4.field8334);
                        if (arg4.field8330) {
                            if (arg4.field8354 == null) {
                                arg4.field8354 = class186.method1539(class449.field6575, arg4.field8321);
                            }
                            if (arg4.field8354 != null) {
                                if (arg4.field8345 == null) {
                                    arg4.field8345 = arg4.field8354.method1537(new int[] { 22050 });
                                }
                                if (arg4.field8345 != null) {
                                    class93 var17 = class93.method915(arg4.field8345, var16, var9 << 6, var11);
                                    var17.method936(-1);
                                    class261.field3699.method4230(var17);
                                    arg4.field8324 = var17;
                                }
                            }
                        } else {
                            class373 var18 = class373.method2957(class395.field5736, arg4.field8321, 0);
                            if (var18 != null) {
                                class313 var19 = var18.method2959().method2495(class631.field8967);
                                class93 var20 = class93.method915(var19, var16, var9 << 6, var11);
                                var20.method936(-1);
                                class261.field3699.method4230(var20);
                                arg4.field8324 = var20;
                            }
                        }
                    }
                    if (arg4.field8333 != null) {
                        arg4.field8333.method920(var9);
                        arg4.field8333.method929(var11);
                        if (arg4.field8333.method4293(-125)) {
                            return;
                        }
                        arg4.field8350 = null;
                        arg4.field8336 = null;
                        arg4.field8333 = null;
                    } else if (arg4.field8326 != null && (arg4.field8341 -= arg2) <= 0) {
                        int var21 = arg4.field8334 == 256 && arg4.field8352 == 256 ? 256 : (int) ((double) (arg4.field8334 - arg4.field8352) * Math.random()) + arg4.field8352;
                        if (arg4.field8348) {
                            if (arg4.field8350 == null) {
                                int var26 = (int) ((double) arg4.field8326.length * Math.random());
                                arg4.field8350 = class186.method1539(class449.field6575, arg4.field8326[var26]);
                            }
                            if (arg4.field8350 == null) {
                                return;
                            }
                            if (arg4.field8336 == null) {
                                arg4.field8336 = arg4.field8350.method1537(new int[] { 22050 });
                            }
                            if (arg4.field8336 == null) {
                                return;
                            }
                            class93 var27 = class93.method915(arg4.field8336, var21, var9 << 6, var11);
                            var27.method936(0);
                            class261.field3699.method4230(var27);
                            arg4.field8341 = (int) ((double) (arg4.field8339 - arg4.field8349) * Math.random()) + arg4.field8349;
                            arg4.field8333 = var27;
                        } else {
                            int var22 = (int) ((double) arg4.field8326.length * Math.random());
                            class373 var23 = class373.method2957(class395.field5736, arg4.field8326[var22], 0);
                            if (var23 != null) {
                                class313 var24 = var23.method2959().method2495(class631.field8967);
                                class93 var25 = class93.method915(var24, var21, var9 << 6, var11);
                                var25.method936(0);
                                class261.field3699.method4230(var25);
                                arg4.field8341 = arg4.field8349 + ((int) ((double) (arg4.field8339 - arg4.field8349) * Math.random()));
                                arg4.field8333 = var25;
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field2168[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field2168[4] : field2168[5]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1424(int arg0, int arg1, int arg2, int arg3) {
        try {
            field2163++;
            class795.field11567.method740(arg0, arg2, arg3, class305.field4247);
            int var4 = class305.field4247[2];
            if (var4 < 50) {
                return false;
            } else {
                class305.field4247[2] = var4;
                class305.field4247[0] = class305.field4247[arg1] * class599.field8599 / var4 + class433.field6277;
                class305.field4247[1] = class305.field4247[1] * class667.field9417 / var4 + class796.field11573;
                return true;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2168[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Llga;Ljava/lang/String;)V")
    public class169(class47 arg0, String arg1) {
        try {
            this.field2164 = arg0;
            this.field2167 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2168[3] + (arg0 == null ? field2168[4] : field2168[5]) + ',' + (arg1 == null ? field2168[4] : field2168[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1425(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1426(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
