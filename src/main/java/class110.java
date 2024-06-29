import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class110 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[J")
    public static long[] field1659 = new long[200];

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    public static int[] field1653;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public static int[] field1660;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lfc;IIIZ)V", line = 4)
    public void method835(class110 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1661++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 14)
    public static void method836(boolean arg0) {
        field1660 = null;
        field1653 = null;
        field1659 = null;
        if (!arg0) {
            method843(-112);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 26)
    public static final void method837(byte arg0) {
        field1664++;
        if (class8.field120) {
            return;
        }
        class16.field207 = true;
        if (class152.field2305) {
            class243.field3695 = (float) ((int) class243.field3695 + 191 & 0xFFFFFF80);
        } else {
            class101.field1459 += (24.0F - class101.field1459) / 2.0F;
        }
        if (arg0 != 94) {
            method841((byte) -125);
        }
        class8.field120 = true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Ldd;", line = 53)
    public static final class322 method838(int arg0, int arg1) {
        field1663++;
        if (arg0 != 27468) {
            return (class322) null;
        }
        class322 var2 = (class322) class153.field2311.method747((long) arg1, (byte) 115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field4634.method696(arg1, (byte) 113, 30);
        class322 var4 = new class322();
        if (var3 != null) {
            var4.method2235(arg0 ^ 0x6B49, arg1, new class254(var3));
        }
        class153.field2311.method744(var4, -15692, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Ll;", line = 78)
    public static final class10 method839(int arg0, int arg1) {
        field1666++;
        if (arg1 >= -92) {
            method845((byte) -10);
        }
        class10 var2 = (class10) class233.field3540.method747((long) arg0, (byte) 104);
        if (var2 != null) {
            return var2;
        }
        class10 var3 = class16.method119(false, class135.field2050, class85.field1237, -22403, arg0);
        if (var3 != null) {
            class233.field3540.method744(var3, -15692, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILvl;)V", line = 99)
    public static final void method840(int arg0, class6 arg1) {
        field1655++;
        class55 var2 = null;
        try {
            class208 var3 = arg1.method64("runescape", -127);
            while (var3.field3185 == 0) {
                class324.method2252(-24861, 1L);
            }
            if (var3.field3185 == 1) {
                var2 = (class55) var3.field3186;
                class254 var4 = class220.method1569((byte) -80);
                var2.method397(var4.field3866, (byte) -37, var4.field3840, 0);
            }
            if (arg0 >= -39) {
                field1659 = (long[]) null;
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method395(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Z", line = 136)
    public static final boolean method841(byte arg0) {
        field1662++;
        if (arg0 != 88) {
            method845((byte) -25);
        }
        return class73.field1058 ? true : class314.field4871;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 159)
    public static final void method842(String arg0, int arg1) {
        field1667++;
        if (class295.field4546 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                client.method1001(1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class262.method1840((String) null, "mem=" + var4 + "k", 0, -55);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                client.method1001(-9);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class262.method1840((String) null, "Memory before cleanup=" + var7 + "k", 0, -88);
                method843(-128);
                client.method1001(93);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class262.method1840((String) null, "Memory after cleanup=" + var9 + "k", 0, -91);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class262.method1840((String) null, "Number of player models in cache:" + class181.method1352(false), 0, -101);
            }
            if (class73.field1058 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class80.field1185);
                System.out.println("oncard_2d:" + class80.field1184);
                System.out.println("oncard_texture:" + class80.field1186);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class299.method2061(0);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class340.field5285.method777((byte) 118);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class340.field5285.method776(arg1 + 27263);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class330.field5074.method50(88);
                class1.field20.method1650(-1);
                class340.field5285.method778((byte) 89);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class229.field3496 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class101.method758(127, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class262.field4045 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class262.field4045 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class181.method1356(-1, 0, arg1 ^ 0x5AF2, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class181.method1356(-1, 1, arg1 + 23096, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class181.method1356(-1, 2, -65, false, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class181.method1356(1024, 3, -105, false, 768);
            }
            if (arg0.startsWith("::setba")) {
                class245.field3705 = class129.method990(arg0.substring(8), 92);
                method840(arg1 + 23138, class330.field5074);
                class157.field2380 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class249.method1700(class129.method990(arg0.substring(15), arg1 ^ 0xFFFFA544));
                method840(-97, class330.field5074);
                class157.field2380 = false;
            }
            if (arg0.startsWith("::fps ") && class312.field4837 != 0) {
                class335.method2339(class129.method990(arg0.substring(6), 112), 30);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class8.field122 = class129.method990(arg0.substring(12).trim(), 30);
                class262.method1840((String) null, "rect_debug=" + class8.field122, 0, -65);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class335.field5216 = true;
            }
            if (arg0.startsWith("::hdr") && class73.field1058 && !class1.method8(arg1 ^ 0xFFFFA462, !class20.method162())) {
                class262.method1840((String) null, "Failed to enable hdr", 0, -128);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class231.field3527) {
                    class231.field3527 = false;
                    class262.method1840((String) null, "Forced tweening disabled.", 0, -61);
                } else {
                    class231.field3527 = true;
                    class262.method1840((String) null, "Forced tweening ENABLED!", 0, -90);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class1.field1) {
                    System.out.println("Shift-click disabled.");
                    class1.field1 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class1.field1 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class262.method1840((String) null, "x:" + (class39.field575.field4713 >> 7) + " z:" + (class39.field575.field4731 >> 7) + " groundh:" + class203.field3111[class265.field4112][class39.field575.field4713 >> 7][class39.field575.field4731 >> 7], 0, -51);
            }
        }
        if (arg1 != -23198) {
            method845((byte) 10);
        }
        class226.field3451++;
        class85.field1236.method1141((byte) 92, 224);
        class85.field1236.method1752(arg0.length() - 1, -107);
        class85.field1236.method1766(0, arg0.substring(2));
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 374)
    public static final void method843(int arg0) {
        if (arg0 != -128) {
            return;
        }
        field1657++;
        if (!class73.field1058 || class47.field654) {
            return;
        }
        class79[][][] var1 = class213.field3262;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class79[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class79 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1179 != null && var6.field1179.field5305 instanceof class140) {
                            class140 var7 = (class140) var6.field1179.field5305;
                            if ((var6.field1179.field5292 & Long.MIN_VALUE) == 0L) {
                                var7.method1057(false, true, true, true, false, true, true);
                            } else {
                                var7.method1057(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field1175 != null) {
                            if (var6.field1175.field2402 instanceof class140) {
                                class140 var8 = (class140) var6.field1175.field2402;
                                if ((var6.field1175.field2400 & Long.MIN_VALUE) == 0L) {
                                    var8.method1057(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1057(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1175.field2398 instanceof class140) {
                                class140 var9 = (class140) var6.field1175.field2398;
                                if ((Long.MIN_VALUE & var6.field1175.field2400) == 0L) {
                                    var9.method1057(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1057(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field1161 != null) {
                            if (var6.field1161.field511 instanceof class140) {
                                class140 var10 = (class140) var6.field1161.field511;
                                if ((Long.MIN_VALUE & var6.field1161.field512) == 0L) {
                                    var10.method1057(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1057(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1161.field508 instanceof class140) {
                                class140 var11 = (class140) var6.field1161.field508;
                                if ((var6.field1161.field512 & Long.MIN_VALUE) == 0L) {
                                    var11.method1057(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1057(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field1169; var12++) {
                            if (var6.field1157[var12].field3480 instanceof class140) {
                                class140 var13 = (class140) var6.field1157[var12].field3480;
                                if ((var6.field1157[var12].field3482 & Long.MIN_VALUE) == 0L) {
                                    var13.method1057(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1057(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class47.field654 = true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lfc;", line = 516)
    public class110 method844(int arg0, int arg1, int arg2) {
        field1665++;
        return this;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V", line = 532)
    public static final void method845(byte arg0) {
        int var1 = -79 % ((-arg0 - 8) / 38);
        field1654++;
        if (class322.field4964) {
            return;
        }
        class16.field207 = true;
        if (class152.field2305) {
            class307.field4786 = (float) ((int) class307.field4786 - 17 & 0xFFFFFFF0);
        } else {
            class283.field4400 += (-12.0F - class283.field4400) / 2.0F;
        }
        class322.field4964 = true;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()Z", line = 555)
    public boolean method846() {
        field1658++;
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public abstract void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public abstract int method565();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3, int arg4);
}
