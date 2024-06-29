import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class124 extends class154 {

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field2186 = 0;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[I")
    public static int[] field2210 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lhm;")
    public class101 field2205;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lok;")
    public class107 field2212;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lgb;")
    public static class213 field2207;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lmm;")
    public class22 field2193;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lmm;")
    public class22 field2213;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lqj;")
    public class231 field2208;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lud;")
    public static class38 field2197;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Z")
    public boolean field2187;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Z")
    public static boolean field2200;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[I")
    public int[] field2199;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V", line = 6)
    public final void method902(byte arg0) {
        int var2 = this.field2196;
        if (arg0 >= -110) {
            method909(-73);
        }
        field2216++;
        if (this.field2205 != null) {
            class101 var5 = this.field2205.method768(-50);
            if (var5 == null) {
                this.field2196 = -1;
                this.field2209 = 0;
                this.field2199 = null;
                this.field2203 = 0;
                this.field2189 = 0;
            } else {
                this.field2199 = var5.field1834;
                this.field2196 = var5.field1796;
                this.field2189 = var5.field1813 * 128;
                this.field2203 = var5.field1795;
                this.field2209 = var5.field1850;
            }
        } else if (this.field2212 != null) {
            int var3 = class245.method1675(this.field2212, 47);
            if (var2 != var3) {
                this.field2196 = var3;
                class151 var4 = this.field2212.field1906;
                if (var4.field2545 != null) {
                    var4 = var4.method1035(-6941);
                }
                if (var4 == null) {
                    this.field2189 = 0;
                } else {
                    this.field2189 = var4.field2544 * 128;
                }
            }
        } else if (this.field2208 != null) {
            this.field2196 = class169.method1116(this.field2208, 0);
            this.field2189 = this.field2208.field3979 * 128;
        }
        if (this.field2196 != var2 && this.field2193 != null) {
            class184.field3279.method112(this.field2193);
            this.field2193 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 79)
    public static final void method903(int arg0, int arg1) {
        if (arg0 == 37) {
            class313.field5302 = 3.0F;
        } else if (arg0 == 50) {
            class313.field5302 = 4.0F;
        } else if (arg0 == 75) {
            class313.field5302 = 6.0F;
        } else {
            class313.field5302 = 8.0F;
        }
        class299.field5122 = arg1;
        class299.field5122 = -1;
        field2192++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 107)
    public static final void method904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2198++;
        if (class145.field2453 == 0) {
            int var7 = class313.field5321;
            int var8 = class193.field3411;
            int var9 = class280.field4815;
            int var10 = class301.field5153;
            class42.field592++;
            int var11 = (var7 - var8) * (arg5 - arg3) / arg1 + var8;
            int var12 = (arg4 - arg6) * (var9 - var10) / arg2 + var10;
            if (class130.field2293 && (class42.field581 & 0x40) == 64) {
                class171 var13 = class10.method65(class23.field286, false, class247.field4280);
                if (var13 == null) {
                    class204.method1354(false);
                } else {
                    class201.method1335(class109.field1924, class271.field4696, var12, (byte) -128, 0L, var11, (short) 18);
                }
            } else {
                class201.method1335(class2.field18, class235.field4104, var12, (byte) -116, 0L, var11, (short) 41);
            }
        }
        if (arg0 != 1) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class122.field2171; var16++) {
            long var17 = class26.field318[var16];
            int var19 = ((int) var17 & 0x3F82) >> 7;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class72.method536(class272.field4704, var20, var19, var17)) {
                    class101 var23 = class123.method898(-935, var22);
                    if (var23.field1797 != null) {
                        var23 = var23.method768(-50);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class145.field2453 == 1) {
                        class201.method1335(class218.field3770, class100.method755(-6, new class258[] { class64.field1135, class8.field107, var23.field1831 }), var19, (byte) -116, var17, var20, (short) 37);
                        class72.field1268++;
                    } else if (!class130.field2293) {
                        class244.field4232++;
                        class258[] var24 = var23.field1838;
                        if (class153.field2617) {
                            var24 = class231.method1539(var24, (byte) 21);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    field2188++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 17;
                                    }
                                    if (var25 == 1) {
                                        var26 = 35;
                                    }
                                    if (var25 == 2) {
                                        var26 = 26;
                                    }
                                    if (var25 == 3) {
                                        var26 = 3;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class201.method1335(var24[var25], class100.method755(arg0 ^ 0xFFFFFFFB, new class258[] { class307.field5214, var23.field1831 }), var19, (byte) -106, var17, var20, var26);
                                }
                            }
                        }
                        class201.method1335(class42.field587, class100.method755(-6, new class258[] { class307.field5214, var23.field1831 }), var19, (byte) -111, (long) var23.field1801, var20, (short) 1001);
                    } else if ((class42.field581 & 0x4) == 4) {
                        class215.field3728++;
                        class201.method1335(class109.field1924, class100.method755(-6, new class258[] { class96.field1684, class8.field107, var23.field1831 }), var19, (byte) -111, var17, var20, (short) 28);
                    }
                }
                if (var21 == 1) {
                    class107 var27 = class16.field214[var22];
                    if (var27.field1906.field2548 == 1 && (var27.field912 & 0x7F) == 64 && (var27.field934 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class226.field3895; var28++) {
                            class107 var29 = class16.field214[class92.field1616[var28]];
                            if (var29 != null && var27 != var29 && var29.field1906.field2548 == 1 && var27.field912 == var29.field912 && var27.field934 == var29.field934) {
                                class76.method553(var29.field1906, var20, -112, var19, class92.field1616[var28]);
                            }
                        }
                        for (int var30 = 0; var30 < class14.field177; var30++) {
                            class231 var31 = class38.field527[class140.field2390[var30]];
                            if (var31 != null && var27.field912 == var31.field912 && var27.field934 == var31.field934) {
                                class194.method1311(var31, class140.field2390[var30], var19, arg0 + 4, var20);
                            }
                        }
                    }
                    class76.method553(var27.field1906, var20, 104, var19, var22);
                }
                if (var21 == 0) {
                    class231 var32 = class38.field527[var22];
                    if ((var32.field912 & 0x7F) == 64 && (var32.field934 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class226.field3895; var33++) {
                            class107 var34 = class16.field214[class92.field1616[var33]];
                            if (var34 != null && var34.field1906.field2548 == 1 && var32.field912 == var34.field912 && var32.field934 == var34.field934) {
                                class76.method553(var34.field1906, var20, 113, var19, class92.field1616[var33]);
                            }
                        }
                        for (int var35 = 0; var35 < class14.field177; var35++) {
                            class231 var36 = class38.field527[class140.field2390[var35]];
                            if (var36 != null && var32 != var36 && var32.field912 == var36.field912 && var32.field934 == var36.field934) {
                                class194.method1311(var36, class140.field2390[var35], var19, 5, var20);
                            }
                        }
                    }
                    class194.method1311(var32, var22, var19, 5, var20);
                }
                if (var21 == 3) {
                    class12 var37 = class82.field1386[class272.field4704][var20][var19];
                    if (var37 != null) {
                        for (class232 var38 = (class232) var37.method78((byte) 58); var38 != null; var38 = (class232) var37.method84(false)) {
                            int var39 = var38.field4024.field663;
                            class61 var40 = class186.method1256((byte) 124, var39);
                            if (class145.field2453 == 1) {
                                class130.field2299++;
                                class201.method1335(class218.field3770, class100.method755(-6, new class258[] { class64.field1135, class75.field1306, var40.field1053 }), var19, (byte) -114, (long) var39, var20, (short) 32);
                            } else if (!class130.field2293) {
                                class20.field238++;
                                class258[] var41 = var40.field1038;
                                if (class153.field2617) {
                                    var41 = class231.method1539(var41, (byte) 21);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        class87.field1481++;
                                        if (var42 == 0) {
                                            var43 = 24;
                                        }
                                        if (var42 == 1) {
                                            var43 = 14;
                                        }
                                        if (var42 == 2) {
                                            var43 = 2;
                                        }
                                        if (var42 == 3) {
                                            var43 = 59;
                                        }
                                        if (var42 == 4) {
                                            var43 = 45;
                                        }
                                        class201.method1335(var41[var42], class100.method755(-6, new class258[] { class191.field3375, var40.field1053 }), var19, (byte) -118, (long) var39, var20, var43);
                                    } else if (var42 == 2) {
                                        class258.field4472++;
                                        class201.method1335(class201.field3488, class100.method755(-6, new class258[] { class191.field3375, var40.field1053 }), var19, (byte) -111, (long) var39, var20, (short) 2);
                                    }
                                }
                                class201.method1335(class42.field587, class100.method755(-6, new class258[] { class191.field3375, var40.field1053 }), var19, (byte) -107, (long) var39, var20, (short) 1003);
                            } else if ((class42.field581 & 0x1) == 1) {
                                field2202++;
                                class201.method1335(class109.field1924, class100.method755(arg0 - 7, new class258[] { class96.field1684, class75.field1306, var40.field1053 }), var19, (byte) -123, (long) var39, var20, (short) 48);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[Ls;)V", line = 449)
    public static final void method905(int arg0, int arg1, class171[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class171 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2936 == 0) {
                    if (var4.field2982 != null) {
                        method905(arg0 ^ 0x0, arg1, var4.field2982);
                    }
                    class247 var5 = (class247) class276.field4750.method986((long) var4.field3061, 0);
                    if (var5 != null) {
                        class20.method134(var5.field4283, -29750, arg1);
                    }
                }
                if (arg1 == 0 && var4.field2943 != null) {
                    class42 var6 = new class42();
                    var6.field600 = var4.field2943;
                    var6.field598 = var4;
                    class193.method1303(200000, var6);
                }
                if (arg1 == 1 && var4.field3062 != null) {
                    if (var4.field2930 >= 0) {
                        class171 var7 = class263.method1844(var4.field3061, (byte) -70);
                        if (var7 == null || var7.field2982 == null || var4.field2930 >= var7.field2982.length || var7.field2982[var4.field2930] != var4) {
                            continue;
                        }
                    }
                    class42 var8 = new class42();
                    var8.field600 = var4.field3062;
                    var8.field598 = var4;
                    class193.method1303(200000, var8);
                }
            }
        }
        if (arg0 != -26462) {
            field2191 = 105;
        }
        field2217++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)I", line = 519)
    public static final int method906(boolean arg0, int arg1) {
        field2195++;
        long var2 = class25.method197(arg1 ^ 0xFFFFF2A6);
        for (class93 var4 = arg0 ? (class93) class103.field1875.method985(arg1 ^ 0x77) : (class93) class103.field1875.method983(-1); var4 != null; var4 = (class93) class103.field1875.method983(~arg1)) {
            if ((var4.field1641 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1641 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2642;
                    class227.field3917[var5] = class12.field157[var5];
                    var4.method1054((byte) 108);
                    return var5;
                }
                var4.method1054((byte) 95);
            }
        }
        if (arg1 == 0) {
            return -1;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 561)
    public static void method907(boolean arg0) {
        field2210 = null;
        field2197 = null;
        if (arg0) {
            field2210 = (int[]) null;
        }
        field2207 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lme;IIILjava/awt/Component;)Lcl;", line = 577)
    public static final class145 method908(class295 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field2206++;
        if (class83.field1408 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class145 var5 = (class145) Class.forName("fg").getDeclaredConstructor().newInstance();
                var5.field2468 = arg3;
                var5.field2442 = new int[(class125.field2227 ? 2 : 1) * 256];
                var5.method997(arg4);
                var5.field2465 = (arg3 & 0xFFFFFC00) + 1024;
                if (arg1 <= 45) {
                    field2200 = false;
                }
                if (var5.field2465 > 16384) {
                    var5.field2465 = 16384;
                }
                var5.method1008(var5.field2465);
                if (class96.field1685 > 0 && class190.field3365 == null) {
                    class190.field3365 = new class115();
                    class190.field3365.field2055 = arg0;
                    arg0.method2070(class96.field1685, class190.field3365, -117);
                }
                if (class190.field3365 != null) {
                    if (class190.field3365.field2061[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class190.field3365.field2061[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class158 var7 = new class158(arg0, arg2);
                    var7.field2442 = new int[(class125.field2227 ? 2 : 1) * 256];
                    var7.field2468 = arg3;
                    var7.method997(arg4);
                    var7.field2465 = 16384;
                    var7.method1008(var7.field2465);
                    if (class96.field1685 > 0 && class190.field3365 == null) {
                        class190.field3365 = new class115();
                        class190.field3365.field2055 = arg0;
                        arg0.method2070(class96.field1685, class190.field3365, -113);
                    }
                    if (class190.field3365 != null) {
                        if (class190.field3365.field2061[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class190.field3365.field2061[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class145();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 667)
    public static final void method909(int arg0) {
        field2190++;
        class91.field1596.method1157(4);
        if (arg0 > -1) {
            field2200 = true;
        }
    }
}
