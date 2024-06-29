import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class97 extends class202 {

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field1583 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1575 = 2;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lac;")
    public class135 field1598;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lwe;")
    public class15 field1591;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Lff;")
    public class18 field1595;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lff;")
    public class18 field1596;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Lbl;")
    public class33 field1599;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    public boolean field1577;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    public int[] field1582;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "[Ld;")
    public static class238[] field1597;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method715(int arg0) {
        field1585++;
        int var2 = this.field1584;
        if (this.field1598 != null) {
            class135 var5 = this.field1598.method953(66);
            if (var5 == null) {
                this.field1593 = 0;
                this.field1576 = 0;
                this.field1580 = 0;
                this.field1582 = null;
                this.field1584 = -1;
            } else {
                this.field1576 = var5.field2163;
                this.field1582 = var5.field2177;
                this.field1593 = var5.field2220;
                this.field1580 = var5.field2213 * 128;
                this.field1584 = var5.field2216;
            }
        } else if (this.field1591 != null) {
            int var3 = class281.method1896(this.field1591, (byte) -74);
            if (var2 != var3) {
                this.field1584 = var3;
                class107 var4 = this.field1591.field258;
                if (var4.field1716 != null) {
                    var4 = var4.method775(false);
                }
                if (var4 == null) {
                    this.field1580 = 0;
                } else {
                    this.field1580 = var4.field1738 * 128;
                }
            }
        } else if (this.field1599 != null) {
            this.field1584 = class64.method452((byte) 88, this.field1599);
            this.field1580 = this.field1599.field510 * 128;
        }
        if (arg0 <= -20 && this.field1584 != var2 && this.field1596 != null) {
            class195.field3123.method1707(this.field1596);
            this.field1596 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method716(int arg0, int arg1, int arg2) {
        if (arg1 != -5029) {
            method717((class134) null, false);
        }
        field1581++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwi;Z)V")
    public static final void method717(class134 arg0, boolean arg1) {
        class113.field1894.method855(false, arg0);
        while (true) {
            class134 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class134[][] var7;
            class134 var66;
            do {
                class134 var65;
                do {
                    class134 var64;
                    do {
                        class134 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class134) class113.field1894.method845((byte) -104);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2135);
                                            var3 = var2.field2137;
                                            var4 = var2.field2144;
                                            var5 = var2.field2138;
                                            var6 = var2.field2136;
                                            var7 = class288.field4563[var5];
                                            if (!var2.field2154) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class134 var8 = class288.field4563[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2135) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class8.field105 && var3 > class230.field3790) {
                                                    class134 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2135 && (var9.field2154 || (var2.field2145 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class8.field105 && var3 < class244.field3908 - 1) {
                                                    class134 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2135 && (var10.field2154 || (var2.field2145 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class214.field3496 && var4 > class235.field3825) {
                                                    class134 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2135 && (var11.field2154 || (var2.field2145 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class214.field3496 && var4 < class220.field3605 - 1) {
                                                    class134 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2135 && (var12.field2154 || (var2.field2145 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2154 = false;
                                            if (var2.field2152 != null) {
                                                class134 var13 = var2.field2152;
                                                if (var13.field2141 == null) {
                                                    if (var13.field2150 != null) {
                                                        if (class188.method1286(0, var3, var4)) {
                                                            class161.method1119(var13.field2150, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, true);
                                                        } else {
                                                            class161.method1119(var13.field2150, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class188.method1286(0, var3, var4)) {
                                                    class36.method296(var13.field2141, 0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, true);
                                                } else {
                                                    class36.method296(var13.field2141, 0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, false);
                                                }
                                                class229 var14 = var13.field2133;
                                                if (var14 != null) {
                                                    var14.field3775.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var14.field3788 - class4.field47, var14.field3781 - class11.field157, var14.field3774 - class21.field353, var14.field3779, var5, (class130) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2151; var15++) {
                                                    class289 var16 = var13.field2153[var15];
                                                    if (var16 != null) {
                                                        var16.field4581.method117(var16.field4578, class227.field3756, class28.field443, class211.field3444, class253.field4033, var16.field4570 - class4.field47, var16.field4580 - class11.field157, var16.field4577 - class21.field353, var16.field4574, var5, (class130) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2141 == null) {
                                                if (var2.field2150 != null) {
                                                    if (class188.method1286(var6, var3, var4)) {
                                                        class161.method1119(var2.field2150, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class161.method1119(var2.field2150, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, false);
                                                    }
                                                }
                                            } else if (class188.method1286(var6, var3, var4)) {
                                                class36.method296(var2.field2141, var6, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2141.field857 != 12345678 || class5.field57 && var5 <= class122.field1987) {
                                                    class36.method296(var2.field2141, var6, class227.field3756, class28.field443, class211.field3444, class253.field4033, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class42 var18 = var2.field2140;
                                                if (var18 != null && (var18.field786 & 0x80000000L) != 0L) {
                                                    var18.field789.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var18.field787 - class4.field47, var18.field783 - class11.field157, var18.field788 - class21.field353, var18.field786, var5, (class130) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class229 var21 = var2.field2133;
                                            class278 var22 = var2.field2143;
                                            if (var21 != null || var22 != null) {
                                                if (class8.field105 == var3) {
                                                    var19++;
                                                } else if (class8.field105 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class214.field3496 == var4) {
                                                    var19 += 3;
                                                } else if (class214.field3496 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class178.field2802[var19];
                                                var2.field2147 = class211.field3441[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3772 & class157.field2546[var19]) == 0) {
                                                    var2.field2134 = 0;
                                                } else if (var21.field3772 == 16) {
                                                    var2.field2134 = 3;
                                                    var2.field2148 = class247.field3946[var19];
                                                    var2.field2139 = 3 - var2.field2148;
                                                } else if (var21.field3772 == 32) {
                                                    var2.field2134 = 6;
                                                    var2.field2148 = class25.field419[var19];
                                                    var2.field2139 = 6 - var2.field2148;
                                                } else if (var21.field3772 == 64) {
                                                    var2.field2134 = 12;
                                                    var2.field2148 = class128.field2074[var19];
                                                    var2.field2139 = 12 - var2.field2148;
                                                } else {
                                                    var2.field2134 = 9;
                                                    var2.field2148 = class170.field2707[var19];
                                                    var2.field2139 = 9 - var2.field2148;
                                                }
                                                if ((var21.field3772 & var20) != 0 && !class221.method1506(var6, var3, var4, var21.field3772)) {
                                                    var21.field3775.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var21.field3788 - class4.field47, var21.field3781 - class11.field157, var21.field3774 - class21.field353, var21.field3779, var5, (class130) null);
                                                }
                                                if ((var21.field3778 & var20) != 0 && !class221.method1506(var6, var3, var4, var21.field3778)) {
                                                    var21.field3784.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var21.field3788 - class4.field47, var21.field3781 - class11.field157, var21.field3774 - class21.field353, var21.field3779, var5, (class130) null);
                                                }
                                            }
                                            if (var22 != null && !class41.method351(var6, var3, var4, var22.field4390.method119())) {
                                                if ((var22.field4391 & var20) != 0) {
                                                    var22.field4390.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var22.field4382 + var22.field4369 - class4.field47, var22.field4379 - class11.field157, var22.field4384 + var22.field4374 - class21.field353, var22.field4372, var5, (class130) null);
                                                } else if (var22.field4391 == 256) {
                                                    int var23 = var22.field4382 - class4.field47;
                                                    int var24 = var22.field4379 - class11.field157;
                                                    int var25 = var22.field4384 - class21.field353;
                                                    int var26 = var22.field4378;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4390.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var22.field4369 + var23, var24, var22.field4374 + var25, var22.field4372, var5, (class130) null);
                                                    } else if (var22.field4375 != null) {
                                                        var22.field4375.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var23, var24, var25, var22.field4372, var5, (class130) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class42 var29 = var2.field2140;
                                                if (var29 != null && (var29.field786 & 0x80000000L) == 0L) {
                                                    var29.field789.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var29.field787 - class4.field47, var29.field783 - class11.field157, var29.field788 - class21.field353, var29.field786, var5, (class130) null);
                                                }
                                                class235 var30 = var2.field2149;
                                                if (var30 != null && var30.field3833 == 0) {
                                                    if (var30.field3823 != null) {
                                                        var30.field3823.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var30.field3824 - class4.field47, var30.field3840 - class11.field157, var30.field3832 - class21.field353, var30.field3839, var5, (class130) null);
                                                    }
                                                    if (var30.field3827 != null) {
                                                        var30.field3827.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var30.field3824 - class4.field47, var30.field3840 - class11.field157, var30.field3832 - class21.field353, var30.field3839, var5, (class130) null);
                                                    }
                                                    if (var30.field3828 != null) {
                                                        var30.field3828.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var30.field3824 - class4.field47, var30.field3840 - class11.field157, var30.field3832 - class21.field353, var30.field3839, var5, (class130) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2145;
                                            if (var31 != 0) {
                                                if (var3 < class8.field105 && (var31 & 0x4) != 0) {
                                                    class134 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2135) {
                                                        class113.field1894.method855(false, var32);
                                                    }
                                                }
                                                if (var4 < class214.field3496 && (var31 & 0x2) != 0) {
                                                    class134 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2135) {
                                                        class113.field1894.method855(false, var33);
                                                    }
                                                }
                                                if (var3 > class8.field105 && (var31 & 0x1) != 0) {
                                                    class134 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2135) {
                                                        class113.field1894.method855(false, var34);
                                                    }
                                                }
                                                if (var4 > class214.field3496 && (var31 & 0x8) != 0) {
                                                    class134 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2135) {
                                                        class113.field1894.method855(false, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2134 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2151; var37++) {
                                                if (class20.field344 != var2.field2153[var37].field4566 && (var2.field2146[var37] & var2.field2134) == var2.field2148) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class229 var38 = var2.field2133;
                                                if (!class221.method1506(var6, var3, var4, var38.field3772)) {
                                                    var38.field3775.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var38.field3788 - class4.field47, var38.field3781 - class11.field157, var38.field3774 - class21.field353, var38.field3779, var5, (class130) null);
                                                }
                                                var2.field2134 = 0;
                                            }
                                        }
                                        if (!var2.field2142) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2151;
                                            var2.field2142 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class289 var42 = var2.field2153[var41];
                                                if (class20.field344 != var42.field4566) {
                                                    for (int var43 = var42.field4567; var43 <= var42.field4573; var43++) {
                                                        for (int var44 = var42.field4575; var44 <= var42.field4571; var44++) {
                                                            class134 var45 = var7[var43][var44];
                                                            if (var45.field2154) {
                                                                var2.field2142 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2134 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4567) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4573) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4575) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4571) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2134) == var2.field2139) {
                                                                    var2.field2142 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class87.field1394[var40++] = var42;
                                                    int var47 = class8.field105 - var42.field4567;
                                                    int var48 = var42.field4573 - class8.field105;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class214.field3496 - var42.field4575;
                                                    int var50 = var42.field4571 - class214.field3496;
                                                    if (var50 > var49) {
                                                        var42.field4579 = var47 + var50;
                                                    } else {
                                                        var42.field4579 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class289 var54 = class87.field1394[var53];
                                                    if (class20.field344 != var54.field4566) {
                                                        if (var54.field4579 > var51) {
                                                            var51 = var54.field4579;
                                                            var52 = var53;
                                                        } else if (var54.field4579 == var51) {
                                                            int var55 = var54.field4570 - class4.field47;
                                                            int var56 = var54.field4577 - class21.field353;
                                                            int var57 = class87.field1394[var52].field4570 - class4.field47;
                                                            int var58 = class87.field1394[var52].field4577 - class21.field353;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class289 var59 = class87.field1394[var52];
                                                var59.field4566 = class20.field344;
                                                if (!class164.method1128(var6, var59.field4567, var59.field4573, var59.field4575, var59.field4571, var59.field4581.method119())) {
                                                    var59.field4581.method117(var59.field4578, class227.field3756, class28.field443, class211.field3444, class253.field4033, var59.field4570 - class4.field47, var59.field4580 - class11.field157, var59.field4577 - class21.field353, var59.field4574, var5, (class130) null);
                                                }
                                                for (int var60 = var59.field4567; var60 <= var59.field4573; var60++) {
                                                    for (int var61 = var59.field4575; var61 <= var59.field4571; var61++) {
                                                        class134 var62 = var7[var60][var61];
                                                        if (var62.field2134 != 0) {
                                                            class113.field1894.method855(false, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2135) {
                                                            class113.field1894.method855(false, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2142) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2142 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2135);
                            } while (var2.field2134 != 0);
                            if (var3 > class8.field105 || var3 <= class230.field3790) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2135);
                        if (var3 < class8.field105 || var3 >= class244.field3908 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2135);
                    if (var4 > class214.field3496 || var4 <= class235.field3825) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2135);
                if (var4 < class214.field3496 || var4 >= class220.field3605 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2135);
            var2.field2135 = false;
            class66.field1095--;
            class235 var67 = var2.field2149;
            if (var67 != null && var67.field3833 != 0) {
                if (var67.field3823 != null) {
                    var67.field3823.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var67.field3824 - class4.field47, var67.field3840 - class11.field157 - var67.field3833, var67.field3832 - class21.field353, var67.field3839, var5, (class130) null);
                }
                if (var67.field3827 != null) {
                    var67.field3827.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var67.field3824 - class4.field47, var67.field3840 - class11.field157 - var67.field3833, var67.field3832 - class21.field353, var67.field3839, var5, (class130) null);
                }
                if (var67.field3828 != null) {
                    var67.field3828.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var67.field3824 - class4.field47, var67.field3840 - class11.field157 - var67.field3833, var67.field3832 - class21.field353, var67.field3839, var5, (class130) null);
                }
            }
            if (var2.field2147 != 0) {
                class278 var68 = var2.field2143;
                if (var68 != null && !class41.method351(var6, var3, var4, var68.field4390.method119())) {
                    if ((var68.field4391 & var2.field2147) != 0) {
                        var68.field4390.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var68.field4382 + var68.field4369 - class4.field47, var68.field4379 - class11.field157, var68.field4384 + var68.field4374 - class21.field353, var68.field4372, var5, (class130) null);
                    } else if (var68.field4391 == 256) {
                        int var69 = var68.field4382 - class4.field47;
                        int var70 = var68.field4379 - class11.field157;
                        int var71 = var68.field4384 - class21.field353;
                        int var72 = var68.field4378;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field4390.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var68.field4369 + var69, var70, var68.field4374 + var71, var68.field4372, var5, (class130) null);
                        } else if (var68.field4375 != null) {
                            var68.field4375.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var69, var70, var71, var68.field4372, var5, (class130) null);
                        }
                    }
                }
                class229 var75 = var2.field2133;
                if (var75 != null) {
                    if ((var75.field3778 & var2.field2147) != 0 && !class221.method1506(var6, var3, var4, var75.field3778)) {
                        var75.field3784.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var75.field3788 - class4.field47, var75.field3781 - class11.field157, var75.field3774 - class21.field353, var75.field3779, var5, (class130) null);
                    }
                    if ((var75.field3772 & var2.field2147) != 0 && !class221.method1506(var6, var3, var4, var75.field3772)) {
                        var75.field3775.method117(0, class227.field3756, class28.field443, class211.field3444, class253.field4033, var75.field3788 - class4.field47, var75.field3781 - class11.field157, var75.field3774 - class21.field353, var75.field3779, var5, (class130) null);
                    }
                }
            }
            if (var5 < class156.field2537 - 1) {
                class134 var76 = class288.field4563[var5 + 1][var3][var4];
                if (var76 != null && var76.field2135) {
                    class113.field1894.method855(false, var76);
                }
            }
            if (var3 < class8.field105) {
                class134 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2135) {
                    class113.field1894.method855(false, var77);
                }
            }
            if (var4 < class214.field3496) {
                class134 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2135) {
                    class113.field1894.method855(false, var78);
                }
            }
            if (var3 > class8.field105) {
                class134 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2135) {
                    class113.field1894.method855(false, var79);
                }
            }
            if (var4 > class214.field3496) {
                class134 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2135) {
                    class113.field1894.method855(false, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
    public static final void method718(int arg0, int arg1) {
        field1589++;
        if (arg1 != 2) {
            method719(false);
        }
        class259 var2 = class213.method1464((byte) -113, arg0, 1);
        var2.method1772((byte) 117);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V")
    public static void method719(boolean arg0) {
        field1597 = null;
        if (arg0) {
            field1597 = null;
        }
    }
}
