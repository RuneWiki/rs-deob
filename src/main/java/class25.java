import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class25 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Z")
    public boolean field286 = false;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[I")
    private int[] field293 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field294 = -1;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field292 = 100;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
    private int[] field290;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
    private short[] field276;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[S")
    private short[] field279;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
    private short[] field280;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[S")
    private short[] field288;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[[Lwj;")
    public static class80[][] field295;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 5)
    public static void method163(int arg0) {
        field295 = (class80[][]) null;
        if (arg0 != 0) {
            method164(-56, -107, -88, (class239) null, -101);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILf;I)V", line = 17)
    public static final void method164(int arg0, int arg1, int arg2, class239 arg3, int arg4) {
        field285++;
        if (arg0 != 50) {
            method168(121, true, (Object) null);
        }
        if (class359.field5616 == arg3 || class66.field853 >= 400) {
            return;
        }
        String var11;
        if (arg3.field3461 == 0) {
            boolean var5 = true;
            if (class359.field5616.field3463 != -1 && arg3.field3463 != -1) {
                int var6 = arg3.field3477 >= class359.field5616.field3477 ? arg3.field3477 : class359.field5616.field3477;
                int var7 = class359.field5616.field3463 >= arg3.field3463 ? arg3.field3463 : class359.field5616.field3463;
                int var8 = var6 * 10 / 100 + (var7 + 5);
                int var9 = class359.field5616.field3477 - arg3.field3477;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class299.field4362 == 1 ? class132.field1793 : class190.field2630;
            if (arg3.field3453 <= arg3.field3477) {
                var11 = arg3.method1698((byte) -122) + (var5 ? class319.method2200(class359.field5616.field3477, (byte) -109, arg3.field3477) : "<col=ffffff>") + " (" + var10 + arg3.field3477 + ")";
            } else {
                var11 = arg3.method1698((byte) -122) + (var5 ? class319.method2200(class359.field5616.field3477, (byte) -109, arg3.field3477) : "<col=ffffff>") + " (" + var10 + arg3.field3477 + "+" + (arg3.field3453 - arg3.field3477) + ")";
            }
        } else {
            var11 = arg3.method1698((byte) -122) + " (" + class92.field1198 + arg3.field3461 + ")";
        }
        if (class339.field5304 == 1) {
            class148.method1140((long) arg2, arg4, arg1, class99.field1301 + " -> <col=ffffff>" + var11, class160.field2293, (short) 21, class343.field5342, (byte) -91);
            class170.field2364++;
        } else if (!class276.field3954) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class299.field4335[var12] != null) {
                    short var13 = 0;
                    boolean var14 = false;
                    class239.field3456++;
                    if (class299.field4362 == 0 && class299.field4335[var12].equalsIgnoreCase(class5.field52)) {
                        if (class359.field5616.field3477 < arg3.field3477) {
                            var13 = 2000;
                        }
                        if (class359.field5616.field3472 != 0 && arg3.field3472 != 0) {
                            if (class359.field5616.field3472 == arg3.field3472) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class135.field1847[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class333.field5155[var12];
                    short var16 = (short) (var13 + var15);
                    class148.method1140((long) arg2, arg4, arg1, "<col=ffffff>" + var11, class299.field4335[var12], var16, class88.field1116[var12], (byte) 89);
                }
            }
        } else if ((class119.field1579 & 0x8) != 0) {
            class335.field5239++;
            class148.method1140((long) arg2, arg4, arg1, class339.field5277 + " -> <col=ffffff>" + var11, class351.field5485, (short) 5, class274.field3932, (byte) 61);
        }
        for (int var17 = 0; var17 < class66.field853; var17++) {
            if (class156.field2169[var17] == 26) {
                class328.field4805[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lml;", line = 148)
    public final class197 method165(int arg0) {
        field289++;
        class197[] var2 = new class197[5];
        int var3 = 0;
        if (arg0 > -94) {
            field292 = -85;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field293[var4] != -1) {
                var2[var3++] = class197.method1430(class133.field1804, this.field293[var4], 0);
            }
        }
        class197 var5 = new class197(var2, var3);
        if (this.field276 != null) {
            for (int var6 = 0; var6 < this.field276.length; var6++) {
                var5.method1446(this.field276[var6], this.field279[var6]);
            }
        }
        if (this.field280 != null) {
            for (int var7 = 0; var7 < this.field280.length; var7++) {
                var5.method1431(this.field280[var7], this.field288[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lml;", line = 204)
    public final class197 method166(byte arg0) {
        field281++;
        if (this.field290 == null) {
            return null;
        }
        class197[] var2 = new class197[this.field290.length];
        if (arg0 < 85) {
            this.method167(-112, (class299) null, true);
        }
        for (int var3 = 0; var3 < this.field290.length; var3++) {
            var2[var3] = class197.method1430(class133.field1804, this.field290[var3], 0);
        }
        class197 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class197(var2, var2.length);
        }
        if (this.field276 != null) {
            for (int var5 = 0; var5 < this.field276.length; var5++) {
                var4.method1446(this.field276[var5], this.field279[var5]);
            }
        }
        if (this.field280 != null) {
            for (int var6 = 0; var6 < this.field280.length; var6++) {
                var4.method1431(this.field280[var6], this.field288[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILfd;Z)V", line = 265)
    private final void method167(int arg0, class299 arg1, boolean arg2) {
        if (!arg2) {
            method169((class119) null, false);
        }
        field291++;
        if (arg0 == 1) {
            this.field294 = arg1.method2096((byte) -122);
        } else if (arg0 == 2) {
            int var4 = arg1.method2096((byte) -122);
            this.field290 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field290[var5] = arg1.method2083((byte) -113);
            }
        } else if (arg0 == 3) {
            this.field286 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method2096((byte) -122);
            this.field279 = new short[var6];
            this.field276 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field276[var7] = (short) arg1.method2083((byte) -60);
                this.field279[var7] = (short) arg1.method2083((byte) -60);
            }
        } else if (arg0 == 41) {
            int var8 = arg1.method2096((byte) -122);
            this.field288 = new short[var8];
            this.field280 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field280[var9] = (short) arg1.method2083((byte) -20);
                this.field288[var9] = (short) arg1.method2083((byte) -85);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field293[arg0 - 60] = arg1.method2083((byte) -120);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 344)
    public static final byte[] method168(int arg0, boolean arg1, Object arg2) {
        if (arg0 != 19138) {
            return (byte[]) null;
        }
        field277++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg2);
            return arg1 ? class183.method1336(var3, -98) : var3;
        } else if (arg2 instanceof class152) {
            class152 var4 = (class152) arg2;
            return var4.method1090(-9747);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnh;Z)V", line = 378)
    public static final void method169(class119 arg0, boolean arg1) {
        class265.field3845.method415((byte) -116, arg0);
        while (true) {
            class119 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class119[][] var7;
            class119 var120;
            do {
                class119 var119;
                do {
                    class119 var118;
                    do {
                        class119 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class119) class265.field3845.method411(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1548);
                                            var3 = var2.field1556;
                                            var4 = var2.field1553;
                                            var5 = var2.field1561;
                                            var6 = var2.field1569;
                                            var7 = class345.field5367[var5];
                                            var8 = 0.0F;
                                            if (class47.field623) {
                                                if (class74.field978 == class161.field2296) {
                                                    int var9 = class143.field1992[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class118.field1542 != var10) {
                                                        class118.field1542 = var10;
                                                        class233.method1659(var10, 65535);
                                                        class41.method291(class91.method657(125));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class261.field3783 != var11) {
                                                        class261.field3783 = var11;
                                                        class240.method1706(3, var11);
                                                    }
                                                    int var12 = class185.field2517[0][var3 + 1][var4] + class185.field2517[0][var3][var4] + class185.field2517[0][var3][var4 + 1] + class185.field2517[0][var3 + 1][var4 + 1] >> 2;
                                                    class255.method1781(3, -var12, -100);
                                                    var8 = 201.5F;
                                                    class47.method370(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class47.method370(var8);
                                                }
                                            }
                                            if (!var2.field1574) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class119 var13 = class345.field5367[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1548) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class116.field1507 && var3 > class64.field800) {
                                                    class119 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1548 && (var14.field1574 || (var2.field1560 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class116.field1507 && var3 < class175.field2404 - 1) {
                                                    class119 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1548 && (var15.field1574 || (var2.field1560 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class288.field4178 && var4 > class16.field202) {
                                                    class119 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1548 && (var16.field1574 || (var2.field1560 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class288.field4178 && var4 < class3.field20 - 1) {
                                                    class119 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1548 && (var17.field1574 || (var2.field1560 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1574 = false;
                                            if (var2.field1571 != null) {
                                                class119 var18 = var2.field1571;
                                                if (class47.field623) {
                                                    class47.method370(201.5F - (float) (var18.field1569 + 1) * 50.0F);
                                                }
                                                if (var18.field1550 == null) {
                                                    if (var18.field1567 != null) {
                                                        if (class163.method1233(0, var3, var4)) {
                                                            class84.method618(var18.field1567, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, true);
                                                        } else {
                                                            class84.method618(var18.field1567, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class163.method1233(0, var3, var4)) {
                                                    class205.method1492(var18.field1550, 0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, true);
                                                } else {
                                                    class205.method1492(var18.field1550, 0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, false);
                                                }
                                                class231 var19 = var18.field1552;
                                                if (var19 != null) {
                                                    if (class47.field623) {
                                                        if ((var19.field3308 & var2.field1573) == 0) {
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                        } else {
                                                            class22.method144(var19.field3308, class181.field2479, class125.field1659, class338.field5269, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3309.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var19.field3306 - class181.field2479, var19.field3310 - class125.field1659, var19.field3304 - class338.field5269, var19.field3302, var5, (class187) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1563; var20++) {
                                                    class294 var21 = var18.field1549[var20];
                                                    if (var21 != null) {
                                                        if (class47.field623) {
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                        }
                                                        var21.field4275.method585(var21.field4272, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var21.field4280 - class181.field2479, var21.field4282 - class125.field1659, var21.field4288 - class338.field5269, var21.field4289, var5, (class187) null);
                                                    }
                                                }
                                                if (class47.field623) {
                                                    class47.method370(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1550 == null) {
                                                if (var2.field1567 != null) {
                                                    if (class163.method1233(var6, var3, var4)) {
                                                        class84.method618(var2.field1567, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class84.method618(var2.field1567, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, false);
                                                    }
                                                }
                                            } else if (class163.method1233(var6, var3, var4)) {
                                                class205.method1492(var2.field1550, var6, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1550.field1352 != 12345678 || class95.field1242 && var5 <= class348.field5430) {
                                                    class205.method1492(var2.field1550, var6, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class24 var23 = var2.field1577;
                                                if (var23 != null && (var23.field267 & 0x80000000L) != 0L) {
                                                    if (class47.field623 && var23.field275) {
                                                        class47.method370(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    var23.field269.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var23.field272 - class181.field2479, var23.field273 - class125.field1659, var23.field271 - class338.field5269, var23.field267, var5, (class187) null);
                                                    if (class47.field623 && var23.field275) {
                                                        class47.method370(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class231 var26 = var2.field1552;
                                            class66 var27 = var2.field1566;
                                            if (var26 != null || var27 != null) {
                                                if (class116.field1507 == var3) {
                                                    var24++;
                                                } else if (class116.field1507 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class288.field4178 == var4) {
                                                    var24 += 3;
                                                } else if (class288.field4178 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class206.field2864[var24];
                                                var2.field1573 = class179.field2443[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3308 & class7.field68[var24]) == 0) {
                                                    var2.field1557 = 0;
                                                } else if (var26.field3308 == 16) {
                                                    var2.field1557 = 3;
                                                    var2.field1562 = class84.field1076[var24];
                                                    var2.field1575 = 3 - var2.field1562;
                                                } else if (var26.field3308 == 32) {
                                                    var2.field1557 = 6;
                                                    var2.field1562 = class214.field3020[var24];
                                                    var2.field1575 = 6 - var2.field1562;
                                                } else if (var26.field3308 == 64) {
                                                    var2.field1557 = 12;
                                                    var2.field1562 = class28.field321[var24];
                                                    var2.field1575 = 12 - var2.field1562;
                                                } else {
                                                    var2.field1557 = 9;
                                                    var2.field1562 = class208.field2955[var24];
                                                    var2.field1575 = 9 - var2.field1562;
                                                }
                                                if ((var26.field3308 & var25) != 0 && !class331.method2299(var6, var3, var4, var26.field3308)) {
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    var26.field3309.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var26.field3306 - class181.field2479, var26.field3310 - class125.field1659, var26.field3304 - class338.field5269, var26.field3302, var5, (class187) null);
                                                }
                                                if ((var26.field3299 & var25) != 0 && !class331.method2299(var6, var3, var4, var26.field3299)) {
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    var26.field3305.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var26.field3306 - class181.field2479, var26.field3310 - class125.field1659, var26.field3304 - class338.field5269, var26.field3302, var5, (class187) null);
                                                }
                                            }
                                            if (var27 != null && !class3.method18(var6, var3, var4, var27.field848.method583())) {
                                                if (class47.field623) {
                                                    class47.method370(var8 - 0.5F);
                                                }
                                                if ((var27.field841 & var25) != 0) {
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    var27.field848.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var27.field838 + var27.field852 - class181.field2479, var27.field839 - class125.field1659, var27.field836 + var27.field837 - class338.field5269, var27.field851, var5, (class187) null);
                                                } else if (var27.field841 == 256) {
                                                    int var28 = var27.field838 - class181.field2479;
                                                    int var29 = var27.field839 - class125.field1659;
                                                    int var30 = var27.field836 - class338.field5269;
                                                    int var31 = var27.field843;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class47.field623) {
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                        }
                                                        var27.field848.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var27.field852 + var28, var29, var27.field837 + var30, var27.field851, var5, (class187) null);
                                                    } else if (var27.field845 != null) {
                                                        if (class47.field623) {
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                        }
                                                        var27.field845.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var28, var29, var30, var27.field851, var5, (class187) null);
                                                    }
                                                }
                                                if (class47.field623) {
                                                    class47.method370(var8);
                                                }
                                            }
                                            if (var22) {
                                                class24 var34 = var2.field1577;
                                                if (var34 != null && (var34.field267 & 0x80000000L) == 0L) {
                                                    if (class47.field623 && var34.field275) {
                                                        class47.method370(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    var34.field269.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var34.field272 - class181.field2479, var34.field273 - class125.field1659, var34.field271 - class338.field5269, var34.field267, var5, (class187) null);
                                                    if (class47.field623 && var34.field275) {
                                                        class47.method370(var8);
                                                    }
                                                }
                                                class183 var35 = var2.field1558;
                                                if (var35 != null && var35.field2499 == 0) {
                                                    if (class47.field623) {
                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                    }
                                                    if (var35.field2501 != null) {
                                                        var35.field2501.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var35.field2491 - class181.field2479, var35.field2502 - class125.field1659, var35.field2504 - class338.field5269, var35.field2494, var5, (class187) null);
                                                    }
                                                    if (var35.field2495 != null) {
                                                        var35.field2495.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var35.field2491 - class181.field2479, var35.field2502 - class125.field1659, var35.field2504 - class338.field5269, var35.field2494, var5, (class187) null);
                                                    }
                                                    if (var35.field2498 != null) {
                                                        var35.field2498.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var35.field2491 - class181.field2479, var35.field2502 - class125.field1659, var35.field2504 - class338.field5269, var35.field2494, var5, (class187) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1560;
                                            if (var36 != 0) {
                                                if (var3 < class116.field1507 && (var36 & 0x4) != 0) {
                                                    class119 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1548) {
                                                        class265.field3845.method415((byte) 29, var37);
                                                    }
                                                }
                                                if (var4 < class288.field4178 && (var36 & 0x2) != 0) {
                                                    class119 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1548) {
                                                        class265.field3845.method415((byte) -123, var38);
                                                    }
                                                }
                                                if (var3 > class116.field1507 && (var36 & 0x1) != 0) {
                                                    class119 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1548) {
                                                        class265.field3845.method415((byte) -101, var39);
                                                    }
                                                }
                                                if (var4 > class288.field4178 && (var36 & 0x8) != 0) {
                                                    class119 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1548) {
                                                        class265.field3845.method415((byte) 124, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1557 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1563; var42++) {
                                                if (class130.field1770 != var2.field1549[var42].field4273 && (var2.field1568[var42] & var2.field1557) == var2.field1562) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class231 var43 = var2.field1552;
                                                if (!class331.method2299(var6, var3, var4, var43.field3308)) {
                                                    if (class47.field623) {
                                                        label1037: {
                                                            if ((var43.field3302 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3306 - class181.field2479;
                                                                int var45 = var43.field3304 - class338.field5269;
                                                                int var46 = (int) (var43.field3302 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class300.field4413 - 1) {
                                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class66.field847 - 1 && var4 < class300.field4413 - 1) {
                                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class66.field847 - 1 && var4 > 0) {
                                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3309.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var43.field3306 - class181.field2479, var43.field3310 - class125.field1659, var43.field3304 - class338.field5269, var43.field3302, var5, (class187) null);
                                                }
                                                var2.field1557 = 0;
                                            }
                                        }
                                        if (!var2.field1555) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1563;
                                            var2.field1555 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class294 var50 = var2.field1549[var49];
                                                if (class130.field1770 != var50.field4273) {
                                                    for (int var51 = var50.field4283; var51 <= var50.field4285; var51++) {
                                                        for (int var52 = var50.field4287; var52 <= var50.field4276; var52++) {
                                                            class119 var53 = var7[var51][var52];
                                                            if (var53.field1574) {
                                                                var2.field1555 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field1557 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4283) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4285) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4287) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4276) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1557) == var2.field1575) {
                                                                    var2.field1555 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class279.field3978[var48++] = var50;
                                                    int var55 = class116.field1507 - var50.field4283;
                                                    int var56 = var50.field4285 - class116.field1507;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class288.field4178 - var50.field4287;
                                                    int var58 = var50.field4276 - class288.field4178;
                                                    if (var58 > var57) {
                                                        var50.field4269 = var55 + var58;
                                                    } else {
                                                        var50.field4269 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class294 var62 = class279.field3978[var61];
                                                    if (class130.field1770 != var62.field4273) {
                                                        if (var62.field4269 > var59) {
                                                            var59 = var62.field4269;
                                                            var60 = var61;
                                                        } else if (var62.field4269 == var59) {
                                                            int var63 = var62.field4280 - class181.field2479;
                                                            int var64 = var62.field4288 - class338.field5269;
                                                            int var65 = class279.field3978[var60].field4280 - class181.field2479;
                                                            int var66 = class279.field3978[var60].field4288 - class338.field5269;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class294 var67 = class279.field3978[var60];
                                                var67.field4273 = class130.field1770;
                                                if (!class234.method1663(var6, var67.field4283, var67.field4285, var67.field4287, var67.field4276, var67.field4275.method583())) {
                                                    if (class47.field623) {
                                                        if ((var67.field4289 & 0xFC000L) == 147456L) {
                                                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                                                            int var68 = var67.field4280 - class181.field2479;
                                                            int var69 = var67.field4288 - class338.field5269;
                                                            int var70 = (int) (var67.field4289 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class22.method142(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class22.method142(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class22.method142(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class22.method142(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class22.method140(class181.field2479, class125.field1659, class338.field5269, var5, var67.field4283, var67.field4287, var67.field4285, var67.field4276);
                                                        }
                                                    }
                                                    var67.field4275.method585(var67.field4272, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var67.field4280 - class181.field2479, var67.field4282 - class125.field1659, var67.field4288 - class338.field5269, var67.field4289, var5, (class187) null);
                                                }
                                                for (int var71 = var67.field4283; var71 <= var67.field4285; var71++) {
                                                    for (int var72 = var67.field4287; var72 <= var67.field4276; var72++) {
                                                        class119 var73 = var7[var71][var72];
                                                        if (var73.field1557 != 0) {
                                                            class265.field3845.method415((byte) -92, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1548) {
                                                            class265.field3845.method415((byte) -101, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1555) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field1555 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1572 != null) {
                                        if (class47.field623) {
                                            GL var75 = class47.field592;
                                            class47.method370(var8);
                                            class187.method1363(class181.field2479, class125.field1659, class338.field5269);
                                            int var76 = var2.field1556 * 128 + 64 - class181.field2479;
                                            int var77 = class74.field978[var5][var2.field1556][var2.field1553] - class125.field1659;
                                            int var78 = var2.field1553 * 128 + 64 - class338.field5269;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class74.field978[var5][var2.field1556][var2.field1553] - class74.field978[var5 + 1][var2.field1556][var2.field1553];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class287.field4122 * var78 - class167.field2338 * var76 >> 16;
                                            int var81 = class223.field3213 * var80 + class211.field2988 * var77 >> 16;
                                            int var82 = (class223.field3213 * 91 + class211.field2988 * 0 >> 16) + var81;
                                            int var83 = (class223.field3213 * -91 - class211.field2988 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class136 var85 = null;
                                            class32 var86 = null;
                                            int var87 = -1;
                                            class136 var88 = (class136) var2.field1572.method2497((byte) -85);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field1862 == null || var88.field1862.field398.field2565) {
                                                            var88.method623(76);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field1862.field398.field2568 & 0xFFL)) != var2.field1547) {
                                                            var2.field1572 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field1862;
                                                            var87 = var86.field376.field2061;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field1862 != var86 || var88.field1862.field376.field2061 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class187.field2598[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class187.field2599[var90] = 0;
                                                        }
                                                        class187.field2589 = 0;
                                                        for (class136 var91 = var85; var91 != var88; var91 = (class136) var91.field314) {
                                                            if (var91.field1862 != null) {
                                                                int var92 = (var91.field1850 >> 12) - class181.field2479;
                                                                int var93 = (var91.field1851 >> 12) - class125.field1659;
                                                                int var94 = (var91.field1853 >> 12) - class338.field5269;
                                                                int var95 = class287.field4122 * var94 - class167.field2338 * var92 >> 16;
                                                                int var96 = (class223.field3213 * var95 + class211.field2988 * var93 >> 16) - var83;
                                                                if (class187.field2598[var96] < 32) {
                                                                    class187.field2587[var96][class187.field2598[var96]++] = var91.field1857;
                                                                } else {
                                                                    if (class187.field2598[var96] == 32) {
                                                                        if (class187.field2589 == 32) {
                                                                            if (class187.field2571) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class187.field2598[var96] += class187.field2589++ + 1;
                                                                    }
                                                                    int var97 = class187.field2599[class187.field2598[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class187.field2596[class187.field2598[var96] - 32 - 1];
                                                                        int var10002 = class187.field2598[var96] - 32 - 1;
                                                                        int var10004 = class187.field2599[class187.field2598[var96] - 32 - 1];
                                                                        class187.field2599[var10002] = class187.field2599[class187.field2598[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field1857;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field1572.field5610 == var91.field314) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class187.field2556 && var86.field376.field2065 != -1) {
                                                            class350.field5467.method912(64, var86.field376.field2065);
                                                            var98 = true;
                                                        } else {
                                                            class47.method357(-1);
                                                        }
                                                        float var99 = (float) var87 * class187.field2602;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field398.method1357(var75, var84, var98, var86.field376.field2092);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field1862;
                                                            var87 = var88.field1862.field376.field2061;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class136) var2.field1572.method2500((byte) 38);
                                            }
                                            class187.method1364();
                                        } else {
                                            int var100 = class350.field5461 + class187.field2573;
                                            int var101 = class350.field5464 + class187.field2567;
                                            class27 var102 = var2.field1572.field5610;
                                            for (class27 var103 = var102.field314; var103 != var102; var103 = var103.field314) {
                                                class136 var104 = (class136) var103;
                                                if (var104.field1862 != null && !var104.field1862.field398.field2565) {
                                                    if ((byte) ((int) (var104.field1862.field398.field2568 & 0xFFL)) != var2.field1547) {
                                                        var2.field1572 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field1850 >> 12) - class181.field2479;
                                                    int var106 = (var104.field1851 >> 12) - class125.field1659;
                                                    int var107 = (var104.field1853 >> 12) - class338.field5269;
                                                    int var108 = class287.field4122 * var105 + class167.field2338 * var107 >> 16;
                                                    int var109 = class287.field4122 * var107 - class167.field2338 * var105 >> 16;
                                                    int var111 = class223.field3213 * var106 - class211.field2988 * var109 >> 16;
                                                    int var112 = class223.field3213 * var109 + class211.field2988 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class37.method232(var114, var115, (var104.field1862.field376.field2061 << 16) / var116, var104.field1854, var104.field1854 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1548);
                            } while (var2.field1557 != 0);
                            if (var3 > class116.field1507 || var3 <= class64.field800) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field1548);
                        if (var3 < class116.field1507 || var3 >= class175.field2404 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field1548);
                    if (var4 > class288.field4178 || var4 <= class16.field202) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field1548);
                if (var4 < class288.field4178 || var4 >= class3.field20 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field1548);
            var2.field1548 = false;
            class223.field3212--;
            class183 var121 = var2.field1558;
            if (var121 != null && var121.field2499 != 0) {
                if (class47.field623) {
                    class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                }
                if (var121.field2501 != null) {
                    var121.field2501.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var121.field2491 - class181.field2479, var121.field2502 - class125.field1659 - var121.field2499, var121.field2504 - class338.field5269, var121.field2494, var5, (class187) null);
                }
                if (var121.field2495 != null) {
                    var121.field2495.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var121.field2491 - class181.field2479, var121.field2502 - class125.field1659 - var121.field2499, var121.field2504 - class338.field5269, var121.field2494, var5, (class187) null);
                }
                if (var121.field2498 != null) {
                    var121.field2498.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var121.field2491 - class181.field2479, var121.field2502 - class125.field1659 - var121.field2499, var121.field2504 - class338.field5269, var121.field2494, var5, (class187) null);
                }
            }
            if (var2.field1573 != 0) {
                class66 var122 = var2.field1566;
                if (var122 != null && !class3.method18(var6, var3, var4, var122.field848.method583())) {
                    if ((var122.field841 & var2.field1573) != 0) {
                        if (class47.field623) {
                            class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                        }
                        var122.field848.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var122.field838 + var122.field852 - class181.field2479, var122.field839 - class125.field1659, var122.field836 + var122.field837 - class338.field5269, var122.field851, var5, (class187) null);
                    } else if (var122.field841 == 256) {
                        int var123 = var122.field838 - class181.field2479;
                        int var124 = var122.field839 - class125.field1659;
                        int var125 = var122.field836 - class338.field5269;
                        int var126 = var122.field843;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class47.field623) {
                                class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                            }
                            var122.field848.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var122.field852 + var123, var124, var122.field837 + var125, var122.field851, var5, (class187) null);
                        } else if (var122.field845 != null) {
                            if (class47.field623) {
                                class22.method139(class181.field2479, class125.field1659, class338.field5269, var5, var3, var4);
                            }
                            var122.field845.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var123, var124, var125, var122.field851, var5, (class187) null);
                        }
                    }
                }
                class231 var129 = var2.field1552;
                if (var129 != null) {
                    if ((var129.field3299 & var2.field1573) != 0 && !class331.method2299(var6, var3, var4, var129.field3299)) {
                        if (class47.field623) {
                            class22.method144(var129.field3299, class181.field2479, class125.field1659, class338.field5269, var6, var3, var4);
                        }
                        var129.field3305.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var129.field3306 - class181.field2479, var129.field3310 - class125.field1659, var129.field3304 - class338.field5269, var129.field3302, var5, (class187) null);
                    }
                    if ((var129.field3308 & var2.field1573) != 0 && !class331.method2299(var6, var3, var4, var129.field3308)) {
                        if (class47.field623) {
                            class22.method144(var129.field3308, class181.field2479, class125.field1659, class338.field5269, var6, var3, var4);
                        }
                        var129.field3309.method585(0, class211.field2988, class223.field3213, class167.field2338, class287.field4122, var129.field3306 - class181.field2479, var129.field3310 - class125.field1659, var129.field3304 - class338.field5269, var129.field3302, var5, (class187) null);
                    }
                }
            }
            if (var5 < class23.field258 - 1) {
                class119 var130 = class345.field5367[var5 + 1][var3][var4];
                if (var130 != null && var130.field1548) {
                    class265.field3845.method415((byte) -110, var130);
                }
            }
            if (var3 < class116.field1507) {
                class119 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field1548) {
                    class265.field3845.method415((byte) -110, var131);
                }
            }
            if (var4 < class288.field4178) {
                class119 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field1548) {
                    class265.field3845.method415((byte) -90, var132);
                }
            }
            if (var3 > class116.field1507) {
                class119 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field1548) {
                    class265.field3845.method415((byte) 56, var133);
                }
            }
            if (var4 > class288.field4178) {
                class119 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field1548) {
                    class265.field3845.method415((byte) -116, var134);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z", line = 1599)
    public final boolean method170(byte arg0) {
        field278++;
        if (this.field290 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= -102) {
            method169((class119) null, false);
        }
        for (int var3 = 0; var3 < this.field290.length; var3++) {
            if (!class133.field1804.method1087(this.field290[var3], true, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lwf;BI)V", line = 1628)
    public static final void method171(class333[] arg0, byte arg1, int arg2) {
        field287++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class333 var4 = arg0[var3];
            if (var4 != null && var4.field5142 == arg2 && (!var4.field5154 || !client.method898(var4))) {
                if (var4.field5105 == 0) {
                    if (!var4.field5154 && client.method898(var4) && class204.field2845 != var4) {
                        continue;
                    }
                    method171(arg0, (byte) -23, var4.field5109);
                    if (var4.field5187 != null) {
                        method171(var4.field5187, (byte) -23, var4.field5109);
                    }
                    class74 var5 = (class74) class272.field3900.method2279((long) var4.field5109, -128);
                    if (var5 != null) {
                        class160.method1223(-22845, var5.field982);
                    }
                }
                if (var4.field5105 == 6) {
                    if (var4.field5053 != -1 || var4.field5100 != -1) {
                        boolean var6 = class210.method1544(var4, (byte) -122);
                        int var7;
                        if (var6) {
                            var7 = var4.field5100;
                        } else {
                            var7 = var4.field5053;
                        }
                        if (var7 != -1) {
                            class314 var8 = class207.method1516(var7, arg1 + 149);
                            if (var8 != null) {
                                var4.field5074 += class186.field2551;
                                while (var8.field4627[var4.field5054] < var4.field5074) {
                                    var4.field5074 -= var8.field4627[var4.field5054];
                                    var4.field5054++;
                                    if (var4.field5054 >= var8.field4631.length) {
                                        var4.field5054 -= var8.field4636;
                                        if (var4.field5054 < 0 || var8.field4631.length <= var4.field5054) {
                                            var4.field5054 = 0;
                                        }
                                    }
                                    var4.field5218 = var4.field5054 + 1;
                                    if (var8.field4631.length <= var4.field5218) {
                                        var4.field5218 -= var8.field4636;
                                        if (var4.field5218 < 0 || var8.field4631.length <= var4.field5218) {
                                            var4.field5218 = -1;
                                        }
                                    }
                                    class142.method1097(-116, var4);
                                }
                            }
                        }
                    }
                    if (var4.field5078 != 0 && !var4.field5154) {
                        int var9 = var4.field5078 >> 16;
                        int var10 = class186.field2551 * var9;
                        int var11 = var4.field5078 << 16 >> 16;
                        var4.field5160 = var4.field5160 + var10 & 0x7FF;
                        int var12 = class186.field2551 * var11;
                        var4.field5210 = var4.field5210 + var12 & 0x7FF;
                        class142.method1097(35, var4);
                    }
                }
            }
        }
        if (arg1 != -23) {
            method169((class119) null, false);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLfd;)V", line = 1753)
    public final void method172(boolean arg0, class299 arg1) {
        while (true) {
            int var3 = arg1.method2096((byte) -122);
            if (var3 == 0) {
                if (!arg0) {
                    return;
                }
                field284++;
                return;
            }
            this.method167(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z", line = 1776)
    public final boolean method173(int arg0) {
        field282++;
        if (arg0 != -32390) {
            method168(-50, false, (Object) null);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field293[var3] != -1 && !class133.field1804.method1087(this.field293[var3], true, 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
