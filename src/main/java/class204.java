import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class204 extends class195 {

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Lbo;")
    public static class453 field2814 = new class453(16);

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[I")
    public static int[] field2817 = new int[13];

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)Z", line = 3)
    public static final boolean method1350(byte arg0) {
        int var1 = 81 / ((-arg0 - 65) / 53);
        field2812++;
        class138 var2 = (class138) class186.field2547.field3397.field6090;
        if (var2 == null || class186.field2547.field3397 == var2) {
            return false;
        } else {
            if (var2.field1777 >= 2000) {
                var2.field1777 -= 2000;
            }
            return var2.field1777 == 1008;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 30)
    public static void method1351(int arg0) {
        field2814 = null;
        if (arg0 <= 51) {
            method1351(-54);
        }
        field2817 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IC)Z", line = 45)
    public static final boolean method1352(int arg0, char arg1) {
        if (arg0 == -98) {
            field2813++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 69)
    public static final void method1353(boolean arg0) {
        field2815++;
        if (arg0) {
            method1352(-17, (char) 65438);
        }
        for (int var1 = 0; var1 < class421.field6124; var1++) {
            int var2 = class298.field4500[var1];
            class163 var3 = class388.field5670[var2];
            int var4 = class27.field471.method2233((byte) 104);
            if ((var4 & 0x8) != 0) {
                var4 += class27.field471.method2233((byte) 104) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class27.field471.method2265(arg0);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class27.field471.method2262(true);
                class190.method1266(var3, (byte) 127, var5, var6);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field2206.method1252(111)) {
                    class322.method2120(var3, (byte) -108);
                }
                var3.method1106(class43.method309((byte) 2, class27.field471.method2230(1939718792)), (byte) -125);
                var3.method1088(true, var3.field2206.field2590);
                var3.field2166 = var3.field2206.field2617 << 3;
                if (var3.field2206.method1252(117)) {
                    class273.method1809(var3.field2189[0], var3, 0, (byte) -108, var3.field2190[0], (class212) null, class268.field3973, (class317) null);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class27.field471.method2265(false);
                int var8 = class27.field471.method2226(-1);
                if (var7 == 65535) {
                    var7 = -1;
                }
                boolean var9 = true;
                if (var7 != -1 && var3.field2142 != -1) {
                    if (var3.field2142 == var7) {
                        class235 var14 = class263.method1762(var7, arg0);
                        if (var14.field3263 && var14.field3271 != -1) {
                            class233 var15 = class73.method597(var14.field3271, -1);
                            int var16 = var15.field3239;
                            if (var16 == 0) {
                                var9 = false;
                            } else if (var16 == 1) {
                                var9 = true;
                            } else if (var16 == 2) {
                                var3.field2173 = 0;
                                var9 = false;
                            }
                        }
                    } else {
                        class235 var10 = class263.method1762(var7, false);
                        class235 var11 = class263.method1762(var3.field2142, false);
                        if (var10.field3271 != -1 && var11.field3271 != -1) {
                            class233 var12 = class73.method597(var10.field3271, -1);
                            class233 var13 = class73.method597(var11.field3271, -1);
                            if (var12.field3250 < var13.field3250) {
                                var9 = false;
                            }
                        }
                    }
                }
                if (var9) {
                    var3.field2142 = var7;
                    var3.field2135 = var8 >> 16;
                    var3.field2165 = 1;
                    var3.field2160 = (var8 & 0xFFFF) + class231.field3179;
                    var3.field2117 = 0;
                    var3.field2113 = 0;
                    if (class231.field3179 < var3.field2160) {
                        var3.field2113 = -1;
                    }
                    if (var3.field2142 != -1 && class231.field3179 == var3.field2160) {
                        int var17 = class263.method1762(var3.field2142, false).field3271;
                        if (var17 != -1) {
                            class233 var18 = class73.method597(var17, -1);
                            if (var18 != null && var18.field3242 != null) {
                                class379.method2476(0, false, false, var3.field5930, var18, var3.field5921);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field2179 = class27.field471.method2230(1939718792);
                if (var3.field2179 == 65535) {
                    var3.field2179 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var19 = class27.field471.method2233((byte) 104);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                int[] var22 = new int[var19];
                for (int var23 = 0; var23 < var19; var23++) {
                    int var24 = class27.field471.method2239(-1076227960);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    var20[var23] = var24;
                    var21[var23] = class27.field471.method2238(122);
                    var22[var23] = class27.field471.method2230(1939718792);
                }
                class165.method1114(-90, var22, var21, var3, var20);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2104 = class27.field471.method2261((byte) 69);
                var3.field2128 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var25 = class27.field471.method2223(-1);
                int var26 = class27.field471.method2238(98);
                var3.method1090(var26, (byte) 125, class231.field3179, var25);
                var3.field2174 = class231.field3179 + 300;
                var3.field2182 = class27.field471.method2207(119);
            }
            if ((var4 & 0x100) != 0) {
                int var27 = class27.field471.method2228(-128);
                var3.field2121 = class27.field471.method2233((byte) 104);
                var3.field2112 = class27.field471.method2233((byte) 104);
                var3.field2138 = var27 & 0x7FFF;
                var3.field2147 = (var27 & 0x8000) != 0;
                var3.field2176 = class231.field3179 + var3.field2138 + var3.field2121;
            }
            if ((var4 & 0x400) != 0) {
                var3.field2133 = class27.field471.method2228(-128);
                var3.field2108 = class27.field471.method2239(-1076227960);
            }
            if ((var4 & 0x4) != 0) {
                int var28 = class27.field471.method2223(-1);
                int var29 = class27.field471.method2262(true);
                var3.method1090(var29, (byte) 126, class231.field3179, var28);
            }
        }
    }
}
