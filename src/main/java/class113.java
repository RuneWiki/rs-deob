import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class113 {

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private int field1927 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private int field1929 = -1;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lmc;")
    private class170 field1920 = new class170();

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Z")
    public boolean field1935 = false;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    private int field1925;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[[[I")
    private int[][][] field1922;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[Lvf;")
    private class292[] field1926;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lwa;")
    private static class75 field1928 = class66.method560("skill)2", false);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lwa;")
    public static class75 field1913 = field1928;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1930 = -1;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public static int[] field1918;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lqj;", line = 6)
    public static final class238 method871(byte arg0) {
        if (arg0 >= -25) {
            return (class238) null;
        } else {
            class49 var1 = new class49(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], class42.field687[0], class191.field3184);
            class235.method1713(0);
            field1933++;
            return var1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 32)
    public static void method872(int arg0) {
        if (arg0 != 1913) {
            method871((byte) 23);
        }
        field1928 = null;
        field1918 = null;
        field1913 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 44)
    public static final void method873(byte arg0) {
        if (arg0 <= 36) {
            field1924 = -102;
        }
        for (int var1 = -1; var1 < class229.field3894; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class65.field1131[var1];
            }
            class96 var3 = class169.field2842[var2];
            if (var3 != null) {
                class29.method200(0, var3, var3.method739(0));
            }
        }
        field1916++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)[[I", line = 83)
    public final int[][] method874(boolean arg0, int arg1) {
        field1931++;
        if (arg0) {
            return (int[][]) ((int[][]) null);
        } else if (this.field1934 == this.field1925) {
            this.field1935 = this.field1926[arg1] == null;
            this.field1926[arg1] = class59.field990;
            return this.field1922[arg1];
        } else if (this.field1925 == 1) {
            this.field1935 = this.field1929 != arg1;
            this.field1929 = arg1;
            return this.field1922[0];
        } else {
            class292 var3 = this.field1926[arg1];
            if (var3 == null) {
                this.field1935 = true;
                if (this.field1925 <= this.field1927) {
                    class292 var4 = (class292) this.field1920.method1254(16);
                    var3 = new class292(arg1, var4.field5019);
                    this.field1926[var4.field5012] = null;
                    var4.method1527(83);
                } else {
                    var3 = new class292(arg1, this.field1927);
                    this.field1927++;
                }
                this.field1926[arg1] = var3;
            } else {
                this.field1935 = false;
            }
            this.field1920.method1260(var3, false);
            return this.field1922[var3.field5019];
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 145)
    public final void method875(int arg0) {
        field1923++;
        for (int var2 = arg0; var2 < this.field1925; var2++) {
            this.field1922[var2][0] = null;
            this.field1922[var2][1] = null;
            this.field1922[var2][2] = null;
            this.field1922[var2] = (int[][]) null;
        }
        this.field1926 = null;
        this.field1922 = (int[][][]) null;
        this.field1920.method1261(arg0 ^ 0x2);
        this.field1920 = null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)[[[I", line = 173)
    public final int[][][] method876(int arg0) {
        field1917++;
        if (this.field1934 != this.field1925) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -33) {
            return (int[][][]) ((int[][][]) null);
        }
        while (var2 < this.field1925) {
            this.field1926[var2] = class59.field990;
            var2++;
        }
        return this.field1922;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII)V", line = 194)
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class123.field2061 = arg4;
        class41.field654 = arg2;
        class14.field190 = arg5;
        class152.field2607 = arg0;
        field1919++;
        class87.field1432 = arg3;
        if (arg1 != -1) {
            return;
        }
        if (class123.field2061 >= 100) {
            int var6 = class152.field2607 * 128 + 64;
            int var7 = class14.field190 * 128 + 64;
            int var8 = class32.method217(var6, var7, true, class67.field1174) - class87.field1432;
            int var9 = var7 - class9.field121;
            int var10 = var6 - class245.field4120;
            int var11 = var8 - class228.field3825;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + (var9 * var9)));
            class232.field3931 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class87.field1433 = (int) (Math.atan2((double) var10, (double) var9) * -325.949D) & 0x7FF;
            if (class232.field3931 < 128) {
                class232.field3931 = 128;
            }
            if (class232.field3931 > 383) {
                class232.field3931 = 383;
            }
        }
        class163.field2777 = 2;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(III)V", line = 794)
    public class113(int arg0, int arg1, int arg2) {
        this.field1925 = arg0;
        this.field1922 = new int[this.field1925][3][arg2];
        this.field1934 = arg1;
        this.field1926 = new class292[this.field1934];
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V", line = 275)
    public static final void method878(int arg0) {
        if (client.field4016 == 32) {
            class136.field2328.method501(0);
            int var1 = class136.field2328.method481((byte) 66);
            class136.field2328.method495(arg0 ^ 0xFFFFFFFE);
            class136.field2328.method517(arg0 - 14112);
            class136.field2328.method474((byte) 104);
            class136.field2328.method488(0);
            class136.field2328.method477(arg0 + 125);
            class136.field2328.method485((byte) -2);
            class136.field2328.method491(8);
            class136.field2328.method495(-3);
            if (class88.field1460 != var1) {
            }
        }
        field1932++;
        if (client.field4016 == 126) {
            int var2 = class136.field2328.method501(0);
            int var3 = (var2 >> 4 & 0x7) + class238.field4001;
            int var4 = (var2 & 0x7) + class296.field5077;
            int var5 = class136.field2328.method485((byte) -2);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class136.field2328.method501(0);
            int var7 = class136.field2328.method501(0);
            int var8 = var6 & 0x7;
            int var9 = var6 >> 4 & 0xF;
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                int var10 = var9 + 1;
                if (var3 - var10 <= class279.field4831.field3236[0] && (var3 + var10) >= class279.field4831.field3236[0] && class279.field4831.field3205[0] >= var4 - var10 && (var4 + var10) >= class279.field4831.field3205[0] && class285.field4909 != 0 && var8 > 0 && class311.field5301 < 50 && var5 != -1) {
                    class268.field4641[class311.field5301] = var5;
                    class130.field2242[class311.field5301] = var8;
                    class39.field588[class311.field5301] = var7;
                    class262.field4393[class311.field5301] = null;
                    class93.field1515[class311.field5301] = (var3 << 16) + (var4 << 8) + var9;
                    class311.field5301++;
                }
            }
        } else if (client.field4016 == 88) {
            int var99 = class136.field2328.method488(0);
            int var100 = ((var99 & 0x7D) >> 4) + class238.field4001;
            int var101 = (var99 & 0x7) + class296.field5077;
            int var102 = class136.field2328.method481((byte) 125);
            if (var102 == 65535) {
                var102 = -1;
            }
            int var103 = class136.field2328.method507(-124);
            int var104 = var103 & 0x3;
            int var105 = var103 >> 2;
            int var106 = class143.field2464[var105];
            class291.method2032(var102, var105, var106, var104, var101, class67.field1174, var100, arg0 + 67);
        } else if (client.field4016 == 175) {
            int var91 = class136.field2328.method485((byte) -2);
            int var92 = class136.field2328.method501(0);
            int var93 = ((var92 & 0x7A) >> 4) + class238.field4001;
            int var94 = (var92 & 0x7) + class296.field5077;
            int var95 = class136.field2328.method501(arg0 - 3);
            int var96 = var95 & 0x3;
            int var97 = var95 >> 2;
            int var98 = class143.field2464[var97];
            if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                class310.method2109(var94, var97, 0, (byte) 39, var96, class67.field1174, var93, var98, var91, -1);
            }
        } else {
            if (arg0 != 3) {
                field1915 = 35;
            }
            if (client.field4016 == 244) {
                int var11 = class136.field2328.method501(0);
                int var12 = ((var11 & 0xF7) >> 4) + class238.field4001 * 2;
                int var13 = (var11 & 0xF) + class296.field5077 * 2;
                int var14 = var12 + class136.field2328.method511(-118);
                int var15 = var13 + class136.field2328.method511(arg0 - 123);
                int var16 = class136.field2328.method487((byte) -83);
                int var17 = class136.field2328.method485((byte) -2);
                int var18 = class136.field2328.method501(0) * 4;
                int var19 = class136.field2328.method501(0) * 4;
                int var20 = class136.field2328.method485((byte) -2);
                int var21 = class136.field2328.method485((byte) -2);
                int var22 = class136.field2328.method501(0);
                int var23 = class136.field2328.method501(0);
                if (var12 >= 0 && var13 >= 0 && var12 < 208 && var13 < 208 && var14 >= 0 && var15 >= 0 && var14 < 208 && var15 < 208 && var17 != 65535) {
                    int var24 = var14 * 64;
                    int var25 = var13 * 64;
                    int var26 = var15 * 64;
                    int var27 = var12 * 64;
                    class246 var28 = new class246(var17, class67.field1174, var27, var25, class32.method217(var27, var25, true, class67.field1174) - var18, class143.field2463 + var20, class143.field2463 + var21, var22, var23, var16, var19);
                    var28.method1777(1, var24, class143.field2463 + var20, var26, class32.method217(var24, var26, true, class67.field1174) - var19);
                    class311.field5302.method1251(new class212(var28), -127);
                }
            } else if (client.field4016 == 168) {
                int var84 = class136.field2328.method507(-120);
                int var85 = ((var84 & 0x7F) >> 4) + class238.field4001;
                int var86 = (var84 & 0x7) + class296.field5077;
                int var87 = class136.field2328.method479(arg0 + 120);
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = class143.field2464[var88];
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    class310.method2109(var86, var88, 0, (byte) 49, var89, class67.field1174, var85, var90, -1, -1);
                }
            } else if (client.field4016 == 240) {
                int var29 = class136.field2328.method501(arg0 ^ 0x3);
                int var30 = (var29 & 0x7) + class296.field5077;
                int var31 = class238.field4001 + (var29 >> 4 & 0x7);
                int var32 = class136.field2328.method511(arg0 ^ 0xFFFFFF89) + var31;
                int var33 = var30 + class136.field2328.method511(arg0 ^ 0xFFFFFF8E);
                int var34 = class136.field2328.method487((byte) -111);
                int var35 = class136.field2328.method485((byte) -2);
                int var36 = class136.field2328.method501(0) * 4;
                int var37 = class136.field2328.method501(arg0 - 3) * 4;
                int var38 = class136.field2328.method485((byte) -2);
                int var39 = class136.field2328.method485((byte) -2);
                int var40 = class136.field2328.method501(arg0 - 3);
                int var41 = class136.field2328.method501(0);
                if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104 && var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var35 != 65535) {
                    int var42 = var30 * 128 + 64;
                    int var43 = var33 * 128 + 64;
                    int var44 = var31 * 128 + 64;
                    int var45 = var32 * 128 + 64;
                    class246 var46 = new class246(var35, class67.field1174, var44, var42, class32.method217(var44, var42, true, class67.field1174) - var36, class143.field2463 + var38, class143.field2463 + var39, var40, var41, var34, var37);
                    var46.method1777(1, var45, var38 + class143.field2463, var43, class32.method217(var45, var43, true, class67.field1174) - var37);
                    class311.field5302.method1251(new class212(var46), arg0 ^ 0xFFFFFF84);
                }
            } else if (client.field4016 == 135) {
                int var75 = class136.field2328.method501(0);
                int var76 = class238.field4001 + ((var75 & 0x72) >> 4);
                int var77 = class296.field5077 + (var75 & 0x7);
                int var78 = class136.field2328.method485((byte) -2);
                int var79 = class136.field2328.method485((byte) -2);
                int var80 = class136.field2328.method485((byte) -2);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class170 var81 = class130.field2245[class67.field1174][var76][var77];
                    if (var81 != null) {
                        for (class306 var82 = (class306) var81.method1250(true); var82 != null; var82 = (class306) var81.method1256((byte) -127)) {
                            class123 var83 = var82.field5228;
                            if ((var78 & 0x7FFF) == var83.field2055 && var83.field2062 == var79) {
                                var83.field2062 = var80;
                                break;
                            }
                        }
                        class90.method712(var76, arg0 + 125, var77);
                    }
                }
            } else if (client.field4016 == 194) {
                int var47 = class136.field2328.method481((byte) 114);
                int var48 = class136.field2328.method501(arg0 ^ 0x3);
                int var49 = (var48 >> 4 & 0x7) + class238.field4001;
                int var50 = (var48 & 0x7) + class296.field5077;
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    class170 var51 = class130.field2245[class67.field1174][var49][var50];
                    if (var51 != null) {
                        for (class306 var52 = (class306) var51.method1250(true); var52 != null; var52 = (class306) var51.method1256((byte) -122)) {
                            if ((var47 & 0x7FFF) == var52.field5228.field2055) {
                                var52.method1527(46);
                                break;
                            }
                        }
                        if (var51.method1250(true) == null) {
                            class130.field2245[class67.field1174][var49][var50] = null;
                        }
                        class90.method712(var49, 128, var50);
                    }
                }
            } else if (client.field4016 == 220) {
                int var69 = class136.field2328.method481((byte) -107);
                int var70 = class136.field2328.method474((byte) 104);
                int var71 = class136.field2328.method501(0);
                int var72 = (var71 >> 4 & 0x7) + class238.field4001;
                int var73 = (var71 & 0x7) + class296.field5077;
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    class123 var74 = new class123();
                    var74.field2055 = var70;
                    var74.field2062 = var69;
                    if (class130.field2245[class67.field1174][var72][var73] == null) {
                        class130.field2245[class67.field1174][var72][var73] = new class170();
                    }
                    class130.field2245[class67.field1174][var72][var73].method1251(new class306(var74), -126);
                    class90.method712(var72, 128, var73);
                }
            } else if (client.field4016 == 222) {
                int var60 = class136.field2328.method501(0);
                int var61 = ((var60 & 0x73) >> 4) + class238.field4001;
                int var62 = (var60 & 0x7) + class296.field5077;
                int var63 = class136.field2328.method485((byte) -2);
                int var64 = class136.field2328.method501(0);
                int var65 = class136.field2328.method485((byte) -2);
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    int var66 = var61 * 128 + 64;
                    int var67 = var62 * 128 + 64;
                    class172 var68 = new class172(var63, class67.field1174, var66, var67, class32.method217(var66, var67, true, class67.field1174) - var64, var65, class143.field2463);
                    class5.field52.method1251(new class218(var68), -118);
                }
            } else if (client.field4016 == 50) {
                int var53 = class136.field2328.method481((byte) -124);
                int var54 = class136.field2328.method474((byte) 104);
                int var55 = class136.field2328.method507(arg0 ^ 0xFFFFFF88);
                int var56 = (var55 & 0x7) + class296.field5077;
                int var57 = class238.field4001 + ((var55 & 0x7E) >> 4);
                int var58 = class136.field2328.method485((byte) -2);
                if (var57 >= 0 && var56 >= 0 && var57 < 104 && var56 < 104 && class88.field1460 != var58) {
                    class123 var59 = new class123();
                    var59.field2062 = var53;
                    var59.field2055 = var54;
                    if (class130.field2245[class67.field1174][var57][var56] == null) {
                        class130.field2245[class67.field1174][var57][var56] = new class170();
                    }
                    class130.field2245[class67.field1174][var57][var56].method1251(new class306(var59), -123);
                    class90.method712(var57, 128, var56);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lwa;Lja;I)I", line = 779)
    public static final int method879(class75 arg0, class60 arg1, int arg2) {
        int var3 = arg1.field1012;
        field1914++;
        arg1.method530(arg0.field1280, false);
        arg1.field1012 += class87.field1437.method1402(arg1.field1012, arg1.field997, arg0.field1296, arg0.field1280, arg2 ^ 0xFFFFB4CC, arg2);
        return arg1.field1012 - var3;
    }
}
