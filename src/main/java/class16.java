import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class16 extends class132 {

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Z")
    private boolean field182 = false;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    private int field193 = 0;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field199 = -32768;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    private int field206 = -1;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    private int field184 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "Lom;")
    private class125 field211;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Lqc;")
    public static class99 field196 = new class99(4);

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "D")
    private double field181;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "D")
    private double field183;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "D")
    public double field186;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "D")
    private double field188;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "D")
    private double field190;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "D")
    public double field204;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "D")
    private double field214;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "D")
    public double field217;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "Lsa;")
    private class265 field220;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 5)
    public static final void method99(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class129 var1;
            class256 var3;
            do {
                var1 = (class129) class240.field3398.method1350((byte) -127);
                if (var1 == null) {
                    field205++;
                    return;
                }
                if (var1.field1771 >= 0) {
                    int var2 = var1.field1771 - 1;
                    var3 = class42.field484[var2];
                } else {
                    int var4 = -var1.field1771 - 1;
                    if (class306.field4593 == var4) {
                        var3 = class173.field2356;
                    } else {
                        var3 = class169.field2306[var4];
                    }
                }
            } while (var3 == null);
            class302 var5 = class153.method1106(var1.field1770, (byte) -94);
            int var6;
            int var7;
            if (var1.field1767 == 1 || var1.field1767 == 3) {
                var6 = var5.field4520;
                var7 = var5.field4479;
            } else {
                var6 = var5.field4479;
                var7 = var5.field4520;
            }
            int var8 = var1.field1764 + (var7 >> 1);
            if (class251.field3603 >= 3) {
            }
            int var9 = (var6 >> 1) + var1.field1773;
            int var10 = var1.field1764 + (var7 + 1 >> 1);
            int var11 = (var6 + 1 >> 1) + var1.field1773;
            int[][] var12 = class333.field5020[class251.field3603];
            int var13 = var12[var8][var9] + var12[var10][var9] + var12[var10][var11] + var12[var8][var11] >> 2;
            class132 var14 = null;
            int var15 = class185.field2557[var1.field1774];
            if (var15 == 0) {
                class7 var19 = class190.method1333(class251.field3603, var1.field1764, var1.field1773);
                if (var19 != null) {
                    var14 = var19.field57;
                }
            } else if (var15 == 1) {
                class269 var18 = class7.method40(class251.field3603, var1.field1764, var1.field1773);
                if (var18 != null) {
                    var14 = var18.field3987;
                }
            } else if (var15 == 2) {
                class280 var17 = class52.method360(class251.field3603, var1.field1764, var1.field1773);
                if (var17 != null) {
                    var14 = var17.field4199;
                }
            } else if (var15 == 3) {
                class306 var16 = class344.method2380(class251.field3603, var1.field1764, var1.field1773);
                if (var16 != null) {
                    var14 = var16.field4586;
                }
            }
            if (var14 != null) {
                class252.method1720(var15, var1.field1773, var1.field1766 + 1, var1.field1764, 0, 0, var1.field1779 + 1, (byte) 60, class251.field3603, -1);
                var3.field3767 = var13;
                var3.field3712 = var1.field1773 * 128 + var6 * 64;
                var3.field3673 = var1.field1764 * 128 + (var7 * 64);
                var3.field3717 = var14;
                int var20 = var1.field1762;
                int var21 = var1.field1768;
                int var22 = var1.field1769;
                if (var20 < var22) {
                    int var23 = var22;
                    var22 = var20;
                    var20 = var23;
                }
                var3.field3754 = var1.field1764 + var22;
                var3.field3691 = var1.field1766 + class329.field4966;
                var3.field3747 = var1.field1764 + var20;
                int var24 = var1.field1777;
                var3.field3748 = var1.field1779 + class329.field4966;
                if (var24 < var21) {
                    int var25 = var21;
                    var21 = var24;
                    var24 = var25;
                }
                var3.field3764 = var1.field1773 + var21;
                var3.field3729 = var1.field1773 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 177)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field185++;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V", line = 187)
    public final void method101(int arg0, int arg1) {
        this.field204 += (double) arg0 * this.field188;
        field197++;
        this.field217 += (double) arg0 * this.field190;
        if (this.field212 == -1) {
            this.field186 += (double) arg0 * this.field183;
        } else {
            this.field186 += this.field181 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field183;
            this.field183 += (double) arg0 * this.field181;
        }
        this.field182 = true;
        if (arg1 != -13983) {
            this.field187 = -65;
        }
        this.field187 = (int) (Math.atan2(this.field188, this.field190) * 325.949D) + 1024 & 0x7FF;
        this.field203 = (int) (Math.atan2(this.field183, this.field214) * 325.949D) & 0x7FF;
        if (this.field211 == null) {
            return;
        }
        this.field184 += arg0;
        while (true) {
            do {
                do {
                    if (this.field184 <= this.field211.field1706[this.field193]) {
                        return;
                    }
                    this.field184 -= this.field211.field1706[this.field193];
                    this.field193++;
                    if (this.field193 >= this.field211.field1707.length) {
                        this.field193 -= this.field211.field1687;
                        if (this.field193 < 0 || this.field211.field1707.length <= this.field193) {
                            this.field193 = 0;
                        }
                    }
                    this.field206 = this.field193 + 1;
                } while (this.field211.field1707.length > this.field206);
                this.field206 -= this.field211.field1687;
            } while (this.field206 >= 0 && this.field206 < this.field211.field1707.length);
            this.field206 = -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 2170)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field180 = arg1;
        this.field215 = arg10;
        this.field201 = arg5;
        this.field212 = arg7;
        this.field213 = arg6;
        this.field200 = arg3;
        this.field194 = arg0;
        this.field209 = arg2;
        this.field189 = arg4;
        this.field218 = arg8;
        this.field202 = arg9;
        this.field182 = false;
        int var12 = class336.method2329(-86, this.field194).field4662;
        if (var12 == -1) {
            this.field211 = null;
        } else {
            this.field211 = class52.method361(true, var12);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII[Lin;ZIIII)V", line = 252)
    public static final void method102(int arg0, int arg1, int arg2, int arg3, class344[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field198++;
        if (class67.field908) {
            class102.method753(arg1, arg6, arg9, arg7);
        } else {
            class38.method220(arg1, arg6, arg9, arg7);
            class184.method1290();
        }
        if (arg5) {
            method99(-39);
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class344 var11 = arg4[var10];
            if (var11 != null && (var11.field5246 == arg0 || arg0 == -1412584499 && class134.field1852 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class333.field5009[class231.field3266] = var11.field5183 + arg2;
                    class262.field3852[class231.field3266] = var11.field5315 + arg8;
                    class66.field868[class231.field3266] = var11.field5334;
                    class234.field3318[class231.field3266] = var11.field5293;
                    var12 = class231.field3266++;
                } else {
                    var12 = arg3;
                }
                var11.field5230 = var12;
                var11.field5336 = class329.field4966;
                if (!var11.field5267 || !client.method815(var11)) {
                    if (var11.field5317 > 0) {
                        class92.method692(-117, var11);
                    }
                    int var13 = var11.field5183 + arg2;
                    int var14 = var11.field5315 + arg8;
                    int var15 = var11.field5288;
                    if (class63.field823 && (client.method821(var11).field4426 != 0 || var11.field5316 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class134.field1852 == var11) {
                        if (arg0 != -1412584499 && !var11.field5356) {
                            class165.field2259 = arg4;
                            class343.field5165 = arg2;
                            class210.field3043 = arg8;
                            continue;
                        }
                        if (!var11.field5356) {
                            var15 = 128;
                        }
                        if (class174.field2373 && class262.field3855) {
                            int var16 = class206.field2962;
                            int var17 = class282.field4220;
                            int var18 = var16 - class112.field1527;
                            int var19 = var17 - class172.field2346;
                            if (class130.field1788 > var18) {
                                var18 = class130.field1788;
                            }
                            if (class31.field377 > var19) {
                                var19 = class31.field377;
                            }
                            if (var18 + var11.field5334 > class130.field1788 + class21.field281.field5334) {
                                var18 = class130.field1788 + class21.field281.field5334 - var11.field5334;
                            }
                            if (var11.field5293 + var19 > class31.field377 + class21.field281.field5293) {
                                var19 = class21.field281.field5293 + class31.field377 - var11.field5293;
                            }
                            var14 = var19;
                            var13 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field5316 == 2) {
                        var24 = arg9;
                        var21 = arg1;
                        var25 = arg7;
                        var20 = arg6;
                    } else {
                        var20 = arg6 < var14 ? var14 : arg6;
                        var21 = var13 > arg1 ? var13 : arg1;
                        int var22 = var14 + var11.field5293;
                        int var23 = var11.field5334 + var13;
                        if (var11.field5316 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var23 >= arg9 ? arg9 : var23;
                        var25 = arg7 > var22 ? var22 : arg7;
                    }
                    if (!var11.field5267 || var24 > var21 && var25 > var20) {
                        if (var11.field5317 != 0) {
                            if (var11.field5317 == 1337 || var11.field5317 == 1403) {
                                class271.field4051 = var13;
                                class198.field2782 = var11;
                                class153.field2130 = var14;
                                class85.method657((byte) -37, var11.field5334, var11.field5293, var11.field5317 == 1403, var13, var14);
                                class121.field1644[var12] = true;
                                if (class67.field908) {
                                    class102.method753(arg1, arg6, arg9, arg7);
                                } else {
                                    class38.method220(arg1, arg6, arg9, arg7);
                                }
                                continue;
                            }
                            if (var11.field5317 == 1338) {
                                if (!var11.method2366((byte) -45)) {
                                    continue;
                                }
                                method106(-15442, var13, var14, var11, var12);
                                if (class67.field908) {
                                    class102.method753(arg1, arg6, arg9, arg7);
                                } else {
                                    class38.method220(arg1, arg6, arg9, arg7);
                                }
                                if (class72.field996 != 0 && class72.field996 != 3 || class100.field1380 || class55.field751 < var21 || class82.field1189 < var20 || var24 <= class55.field751 || class82.field1189 >= var25) {
                                    continue;
                                }
                                int var127 = class55.field751 - var13;
                                int var128 = class82.field1189 - var14;
                                int var129 = var11.field5283[var128];
                                if (var127 < var129 || (var11.field5202[var128] + var129) < var127) {
                                    continue;
                                }
                                int var130 = var127 - var11.field5334 / 2;
                                int var131 = var128 - var11.field5293 / 2;
                                int var132 = (int) class89.field1257 + class264.field3859 & 0x7FF;
                                int var133 = class184.field2538[var132];
                                int var134 = (class252.field3618 + 256) * var133 >> 8;
                                int var135 = class184.field2532[var132];
                                int var136 = (class252.field3618 + 256) * var135 >> 8;
                                int var137 = var130 * var136 + var131 * var134 >> 11;
                                int var138 = var137 + (class173.field2356.field3745 - (class173.field2356.method1653(-1) - 1) * 64) >> 7;
                                int var139 = var131 * var136 - (var130 * var134) >> 11;
                                int var140 = class173.field2356.field3679 + 64 - (var139 + class173.field2356.method1653(-1) * 64) >> 7;
                                if (class124.field1676 && (class172.field2348 & 0x40) != 0) {
                                    class344 var141 = class20.method128(115, class52.field697, class219.field3146);
                                    if (var141 == null) {
                                        class173.method1209(false);
                                    } else {
                                        class237.method1632((short) 47, class128.field1753, class282.field4224, var140, 1L, 108, " ->", var138);
                                    }
                                    continue;
                                }
                                if (class39.field448 == 1) {
                                    class237.method1632((short) 60, -1, class274.field4107, var140, 1L, 118, "", var138);
                                }
                                class237.method1632((short) 43, -1, class7.field70, var140, 1L, -97, "", var138);
                                continue;
                            }
                            if (var11.field5317 == 1339) {
                                if (var11.method2366((byte) -13)) {
                                    class123.method886(119, var11, var13, var12, var14);
                                    if (class67.field908) {
                                        class102.method753(arg1, arg6, arg9, arg7);
                                    } else {
                                        class38.method220(arg1, arg6, arg9, arg7);
                                    }
                                }
                                continue;
                            }
                            if (var11.field5317 == 1400) {
                                class115.method853(-1, var13, var11.field5293, var14, var11.field5334);
                                class121.field1644[var12] = true;
                                class304.field4571[var12] = true;
                                if (class67.field908) {
                                    class102.method753(arg1, arg6, arg9, arg7);
                                } else {
                                    class38.method220(arg1, arg6, arg9, arg7);
                                }
                                continue;
                            }
                            if (var11.field5317 == 1401) {
                                class126.method914(var14, (byte) 58, var13, var11.field5293, var11.field5334);
                                class121.field1644[var12] = true;
                                class304.field4571[var12] = true;
                                if (class67.field908) {
                                    class102.method753(arg1, arg6, arg9, arg7);
                                } else {
                                    class38.method220(arg1, arg6, arg9, arg7);
                                }
                                continue;
                            }
                            if (var11.field5317 == 1402) {
                                if (!class67.field908) {
                                    class107.method784(var14, var13, 256);
                                    class121.field1644[var12] = true;
                                    class304.field4571[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field5317 == 1405) {
                                if (!class221.field3165) {
                                    continue;
                                }
                                int var26 = var11.field5334 + var13;
                                int var27 = var14 + 15;
                                class312.field4716.method1899("Fps:" + class201.field2858, var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var142 = var27 + 15;
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class312.field4716.method1899("Mem:" + var29 + "k", var26, var142, var30, -1);
                                var27 = var142 + 15;
                                if (class67.field908) {
                                    int var31 = 16776960;
                                    int var32 = (class180.field2414 - (-class180.field2409 - class180.field2412)) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class312.field4716.method1899("Card:" + var32 + "k", var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 0;
                                int var34 = 16776960;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 29; var37++) {
                                    var33 += class201.field2855[var37].method1868(8984);
                                    var35 += class201.field2855[var37].method1870(255);
                                    var36 += class201.field2855[var37].method1874(0);
                                }
                                int var38 = var36 * 100 / var33;
                                int var39 = var35 * 10000 / var33;
                                String var40 = "Cache:" + class138.method998(2, 0, 57, (long) var39, true) + "% (" + var38 + "%)";
                                class37.field426.method1899(var40, var26, var27, var34, -1);
                                class121.field1644[var12] = true;
                                class304.field4571[var12] = true;
                                var27 += 12;
                                continue;
                            }
                            if (var11.field5317 == 1406) {
                                class290.field4324 = var11;
                                class242.field3451 = var13;
                                class56.field775 = var14;
                                continue;
                            }
                        }
                        if (!class100.field1380) {
                            if (var11.field5316 == 0 && var11.field5229 && var21 <= class55.field751 && class82.field1189 >= var20 && var24 > class55.field751 && var25 > class82.field1189 && !class63.field823) {
                                class204.field2938 = 1;
                                class111.field1487[0] = class251.field3602;
                                class54.field722[0] = 1004;
                                class135.field1868[0] = class42.field485;
                                class88.field1251[0] = "";
                            }
                            if (class55.field751 >= var21 && class82.field1189 >= var20 && var24 > class55.field751 && var25 > class82.field1189) {
                                class167.method1187(-4904, class55.field751 - var13, var11, class82.field1189 - var14);
                            }
                        }
                        if (var11.field5316 == 0) {
                            if (!var11.field5267 && client.method815(var11) && class339.field5095 != var11) {
                                continue;
                            }
                            if (!var11.field5267) {
                                if (var11.field5200 - var11.field5293 < var11.field5195) {
                                    var11.field5195 = var11.field5200 - var11.field5293;
                                }
                                if (var11.field5195 < 0) {
                                    var11.field5195 = 0;
                                }
                            }
                            if (class67.field908 && var11.field5317 == 1407) {
                                class40.method245(var13, var14, var11.field5334, var11.field5293);
                            }
                            method102(var11.field5206, var21, var13 - var11.field5203, var12, arg4, false, var20, var25, var14 - var11.field5195, var24);
                            if (var11.field5248 != null) {
                                method102(var11.field5206, var21, var13 - var11.field5203, var12, var11.field5248, false, var20, var25, var14 - var11.field5195, var24);
                            }
                            class48 var41 = (class48) class211.field3056.method111(-103, (long) var11.field5206);
                            if (var41 != null) {
                                if (var41.field594 == 0 && !class100.field1380 && var21 <= class55.field751 && class82.field1189 >= var20 && var24 > class55.field751 && var25 > class82.field1189 && !class63.field823) {
                                    class111.field1487[0] = class251.field3602;
                                    class88.field1251[0] = "";
                                    class54.field722[0] = 1004;
                                    class204.field2938 = 1;
                                    class135.field1868[0] = class42.field485;
                                }
                                class221.method1564(var13, var14, var12, var21, false, var25, var41.field595, var20, var24);
                            }
                            if (class67.field908 && var11.field5317 == 1407) {
                                class40.method248();
                            }
                            if (class67.field908) {
                                class102.method753(arg1, arg6, arg9, arg7);
                            } else {
                                class38.method220(arg1, arg6, arg9, arg7);
                                class184.method1290();
                            }
                        }
                        if (class288.field4285[var12] || class194.field2677 > 1) {
                            if (var11.field5316 == 0 && !var11.field5267 && var11.field5293 < var11.field5200) {
                                class149.method1078(var11.field5334 + var13, var11.field5195, var11.field5200, var14, var11.field5293, arg5);
                            }
                            if (var11.field5316 != 1) {
                                if (var11.field5316 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field5236; var43++) {
                                        for (int var44 = 0; var44 < var11.field5305; var44++) {
                                            int var45 = (var11.field5256 + 32) * var43 + var14;
                                            int var46 = (var11.field5198 + 32) * var44 + var13;
                                            if (var42 < 20) {
                                                var45 += var11.field5326[var42];
                                                var46 += var11.field5235[var42];
                                            }
                                            if (var11.field5278[var42] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var11.field5278[var42] - 1;
                                                if (arg1 < var46 + 32 && arg9 > var46 && (var45 + 32) > arg6 && arg7 > var45 || class291.field4348 == var11 && class336.field5064 == var42) {
                                                    class170 var51;
                                                    if (class1.field15 == 1 && class236.field3348 == var42 && class15.field177 == var11.field5206) {
                                                        var51 = class242.method1663(var50, (class64) null, var11.field5221, false, 2, var11.field5237[var42], 0);
                                                    } else {
                                                        var51 = class242.method1663(var50, (class64) null, var11.field5221, false, 1, var11.field5237[var42], 3153952);
                                                    }
                                                    if (class184.field2542) {
                                                        class121.field1644[var12] = true;
                                                    }
                                                    if (var51 == null) {
                                                        class255.method1741(var11, false);
                                                    } else if (class291.field4348 == var11 && class336.field5064 == var42) {
                                                        int var52 = class282.field4220 - class1.field9;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        int var53 = class206.field2962 - class210.field3040;
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (class196.field2734 < 5) {
                                                            var53 = 0;
                                                            var52 = 0;
                                                        }
                                                        var51.method836(var46 + var53, var45 + var52, 128);
                                                        if (arg0 != -1) {
                                                            class344 var54 = arg4[arg0 & 0xFFFF];
                                                            int var55;
                                                            int var56;
                                                            if (class67.field908) {
                                                                var55 = class102.field1399;
                                                                var56 = class102.field1400;
                                                            } else {
                                                                var55 = class38.field428;
                                                                var56 = class38.field427;
                                                            }
                                                            if (var56 > var45 + var52 && var54.field5195 > 0) {
                                                                int var57 = (var56 - var45 - var52) * class287.field4278 / 3;
                                                                if (var57 > class287.field4278 * 10) {
                                                                    var57 = class287.field4278 * 10;
                                                                }
                                                                if (var54.field5195 < var57) {
                                                                    var57 = var54.field5195;
                                                                }
                                                                var54.field5195 -= var57;
                                                                class1.field9 += var57;
                                                                class255.method1741(var54, false);
                                                            }
                                                            if (var45 + var52 + 32 > var55 && var54.field5195 < var54.field5200 - var54.field5293) {
                                                                int var58 = (var45 + 32 - (var55 - var52)) * class287.field4278 / 3;
                                                                if (var58 > class287.field4278 * 10) {
                                                                    var58 = class287.field4278 * 10;
                                                                }
                                                                if ((var54.field5200 - var54.field5293 - var54.field5195) < var58) {
                                                                    var58 = var54.field5200 - var54.field5293 - var54.field5195;
                                                                }
                                                                class1.field9 -= var58;
                                                                var54.field5195 += var58;
                                                                class255.method1741(var54, false);
                                                            }
                                                        }
                                                    } else if (class342.field5129 == var11 && class232.field3275 == var42) {
                                                        var51.method836(var46, var45, 128);
                                                    } else {
                                                        var51.method840(var46, var45);
                                                    }
                                                }
                                            } else if (var11.field5321 != null && var42 < 20) {
                                                class170 var47 = var11.method2371((byte) 89, var42);
                                                if (var47 != null) {
                                                    var47.method840(var46, var45);
                                                } else if (class340.field5106) {
                                                    class255.method1741(var11, false);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field5316 == 3) {
                                    int var59;
                                    if (class145.method1044(var11, (byte) -49)) {
                                        var59 = var11.field5330;
                                        if (class339.field5095 == var11 && var11.field5310 != 0) {
                                            var59 = var11.field5310;
                                        }
                                    } else {
                                        var59 = var11.field5281;
                                        if (class339.field5095 == var11 && var11.field5286 != 0) {
                                            var59 = var11.field5286;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field5338) {
                                            if (class67.field908) {
                                                class102.method738(var13, var14, var11.field5334, var11.field5293, var59);
                                            } else {
                                                class38.method224(var13, var14, var11.field5334, var11.field5293, var59);
                                            }
                                        } else if (class67.field908) {
                                            class102.method750(var13, var14, var11.field5334, var11.field5293, var59);
                                        } else {
                                            class38.method216(var13, var14, var11.field5334, var11.field5293, var59);
                                        }
                                    } else if (var11.field5338) {
                                        if (class67.field908) {
                                            class102.method745(var13, var14, var11.field5334, var11.field5293, var59, 256 - (var15 & 0xFF));
                                        } else {
                                            class38.method231(var13, var14, var11.field5334, var11.field5293, var59, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class67.field908) {
                                        class102.method755(var13, var14, var11.field5334, var11.field5293, var59, 256 - (var15 & 0xFF));
                                    } else {
                                        class38.method214(var13, var14, var11.field5334, var11.field5293, var59, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field5316 == 4) {
                                    class277 var60 = var11.method2372(class141.field1935, -43);
                                    if (var60 != null) {
                                        String var61 = var11.field5301;
                                        int var62;
                                        if (class145.method1044(var11, (byte) -49)) {
                                            var62 = var11.field5330;
                                            if (class339.field5095 == var11 && var11.field5310 != 0) {
                                                var62 = var11.field5310;
                                            }
                                            if (var11.field5276.length() > 0) {
                                                var61 = var11.field5276;
                                            }
                                        } else {
                                            var62 = var11.field5281;
                                            if (class339.field5095 == var11 && var11.field5286 != 0) {
                                                var62 = var11.field5286;
                                            }
                                        }
                                        if (var11.field5267 && var11.field5302 != -1) {
                                            class198 var63 = class115.method854((byte) 43, var11.field5302);
                                            var61 = var63.field2757;
                                            if (var61 == null) {
                                                var61 = "null";
                                            }
                                            if ((var63.field2818 == 1 || var11.field5215 != 1) && var11.field5215 != -1) {
                                                var61 = "<col=ff9040>" + var61 + "</col> x" + class20.method126(var11.field5215, (byte) 93);
                                            }
                                        }
                                        if (class187.field2591 == var11) {
                                            var62 = var11.field5281;
                                            var61 = class71.field969;
                                        }
                                        if (!var11.field5267) {
                                            var61 = class36.method207(var11, (byte) 43, var61);
                                        }
                                        var60.method1902(var61, var13, var14, var11.field5334, var11.field5293, var62, var11.field5323 ? 0 : -1, var11.field5212, var11.field5178, var11.field5190);
                                    } else if (class340.field5106) {
                                        class255.method1741(var11, false);
                                    }
                                } else if (var11.field5316 == 5) {
                                    if (!var11.field5267) {
                                        class170 var80 = var11.method2370(true, class145.method1044(var11, (byte) -49));
                                        if (var80 != null) {
                                            var80.method840(var13, var14);
                                        } else if (class340.field5106) {
                                            class255.method1741(var11, false);
                                        }
                                    } else if (var11.field5207 >= 0) {
                                        class49 var79 = var11.method2369((byte) -19);
                                        if (class67.field908) {
                                            var79.method310(0, var13, var14, var11.field5334, var11.field5293, var11.field5251, var11.field5263, 0);
                                        } else {
                                            var79.method305(0, var13, var14, var11.field5334, var11.field5293, var11.field5251, var11.field5263, 0);
                                        }
                                    } else {
                                        class170 var64;
                                        if (var11.field5302 == -1) {
                                            var64 = var11.method2370(!arg5, false);
                                        } else if (var11.field5244 && class173.field2356.field3422 != null) {
                                            var64 = class242.method1663(var11.field5302, class173.field2356.field3422, var11.field5221, false, var11.field5204, var11.field5215, var11.field5277);
                                        } else {
                                            var64 = class242.method1663(var11.field5302, (class64) null, var11.field5221, false, var11.field5204, var11.field5215, var11.field5277);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.field2319;
                                            int var66 = var64.field2325;
                                            if (var11.field5340) {
                                                int var67 = (var11.field5334 + var65 - 1) / var65;
                                                int var68 = (var11.field5293 + var66 - 1) / var66;
                                                if (class67.field908) {
                                                    class102.method742(var13, var14, var11.field5334 + var13, var11.field5293 + var14);
                                                    class328 var69 = (class328) var64;
                                                    boolean var70 = class343.method2364((byte) 64, var64.field2323);
                                                    boolean var71 = class343.method2364((byte) 64, var64.field2317);
                                                    if (var70 && var71) {
                                                        if (var15 == 0) {
                                                            var69.method2295(var13, var14, var67, var68);
                                                        } else {
                                                            var69.method2291(var13, var14, 256 - (var15 & 0xFF), var67, var68);
                                                        }
                                                    } else if (var70) {
                                                        for (int var72 = 0; var72 < var68; var72++) {
                                                            if (var15 == 0) {
                                                                var69.method2295(var13, var66 * var72 + var14, var67, 1);
                                                            } else {
                                                                var69.method2291(var13, var66 * var72 + var14, -(var15 & 0xFF) + 256, var67, 1);
                                                            }
                                                        }
                                                    } else if (var71) {
                                                        for (int var75 = 0; var75 < var67; var75++) {
                                                            if (var15 == 0) {
                                                                var69.method2295(var13 + (var65 * var75), var14, 1, var68);
                                                            } else {
                                                                var69.method2291(var65 * var75 + var13, var14, 256 - (var15 & 0xFF), 1, var68);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var73 = 0; var73 < var67; var73++) {
                                                            for (int var74 = 0; var74 < var68; var74++) {
                                                                if (var15 == 0) {
                                                                    var64.method840(var65 * var73 + var13, var66 * var74 + var14);
                                                                } else {
                                                                    var64.method836(var65 * var73 + var13, var14 - -(var66 * var74), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class102.method753(arg1, arg6, arg9, arg7);
                                                } else {
                                                    class38.method217(var13, var14, var11.field5334 + var13, var14 - -var11.field5293);
                                                    for (int var76 = 0; var76 < var67; var76++) {
                                                        for (int var77 = 0; var77 < var68; var77++) {
                                                            if (var11.field5290 != 0) {
                                                                var64.method1201(var11.field5290, var65 / 2 + var65 * var76 + var13, var66 / 2 + (var14 - -(var66 * var77)), 92, 4096);
                                                            } else if (var15 == 0) {
                                                                var64.method840(var13 + (var65 * var76), var66 * var77 + var14);
                                                            } else {
                                                                var64.method836(var65 * var76 + var13, var14 - -(var66 * var77), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class38.method220(arg1, arg6, arg9, arg7);
                                                }
                                            } else {
                                                int var78 = var11.field5334 * 4096 / var65;
                                                if (var11.field5290 != 0) {
                                                    var64.method1201(var11.field5290, var13 + (var11.field5334 / 2), var11.field5293 / 2 + var14, 40, var78);
                                                } else if (var15 != 0) {
                                                    var64.method838(var13, var14, var11.field5334, var11.field5293, 256 - (var15 & 0xFF));
                                                } else if (var11.field5334 == var65 && var11.field5293 == var66) {
                                                    var64.method840(var13, var14);
                                                } else {
                                                    var64.method837(var13, var14, var11.field5334, var11.field5293);
                                                }
                                            }
                                        } else if (class340.field5106) {
                                            class255.method1741(var11, arg5);
                                        }
                                    }
                                } else if (var11.field5316 == 6) {
                                    boolean var81 = class145.method1044(var11, (byte) -49);
                                    class345 var82 = null;
                                    int var83;
                                    if (var81) {
                                        var83 = var11.field5253;
                                    } else {
                                        var83 = var11.field5272;
                                    }
                                    int var84 = 0;
                                    if (var11.field5302 != -1) {
                                        class198 var85 = class115.method854((byte) -121, var11.field5302);
                                        if (var85 != null) {
                                            class198 var86 = var85.method1401(var11.field5215, false);
                                            class125 var87 = var83 == -1 ? null : class52.method361(true, var83);
                                            if (var11.field5244 && class173.field2356.field3422 != null) {
                                                var82 = var86.method1408(111, var11.field5233, 1, class173.field2356.field3422, var87, var11.field5205, var11.field5328);
                                            } else {
                                                var82 = var86.method1408(111, var11.field5233, 1, (class64) null, var87, var11.field5205, var11.field5328);
                                            }
                                            if (var82 == null) {
                                                class255.method1741(var11, false);
                                            } else {
                                                var84 = -var82.method105() / 2;
                                            }
                                        }
                                    } else if (var11.field5304 == 5) {
                                        if (var11.field5201 == -1) {
                                            var82 = class266.field3882.method430(0, (class125) null, (class108[]) null, -1, -1, -1, (class125) null, 0, true, -1, (byte) 100);
                                        } else {
                                            int var88 = var11.field5201 & 0x7FF;
                                            if (class306.field4593 == var88) {
                                                var88 = 2047;
                                            }
                                            class241 var89 = class169.field2306[var88];
                                            class125 var90 = var83 == -1 ? null : class52.method361(true, var83);
                                            if (var89 != null && ((int) class77.method584(var89.field3439, 117) << 11) == (var11.field5201 & 0xFFFFF800)) {
                                                var82 = var89.field3422.method430(0, var90, (class108[]) null, -1, -1, 0, (class125) null, 0, true, var11.field5205, (byte) 46);
                                            }
                                        }
                                    } else if (var83 == -1) {
                                        var82 = var11.method2365(var81, class173.field2356.field3422, -1, -1, true, (class125) null, 0);
                                        if (var82 == null && class340.field5106) {
                                            class255.method1741(var11, false);
                                        }
                                    } else {
                                        class125 var91 = class52.method361(true, var83);
                                        var82 = var11.method2365(var81, class173.field2356.field3422, var11.field5205, var11.field5328, !arg5, var91, var11.field5233);
                                        if (var82 == null && class340.field5106) {
                                            class255.method1741(var11, arg5);
                                        }
                                    }
                                    if (var82 != null) {
                                        int var92;
                                        if (var11.field5194 > 0) {
                                            var92 = (var11.field5334 << 8) / var11.field5194;
                                        } else {
                                            var92 = 256;
                                        }
                                        int var93;
                                        if (var11.field5174 <= 0) {
                                            var93 = 256;
                                        } else {
                                            var93 = (var11.field5293 << 8) / var11.field5174;
                                        }
                                        int var94 = var13 - (-(var11.field5334 / 2) - (var11.field5273 * var92 >> 8));
                                        int var95 = (var11.field5295 * var93 >> 8) + var11.field5293 / 2 + var14;
                                        if (class67.field908) {
                                            if (var11.field5181) {
                                                class67.method466(var94, var95, var11.field5171, var11.field5231, var92, var93);
                                            } else {
                                                class67.method465(var94, var95, var92, var93);
                                                class67.method491((float) var11.field5291, (float) var11.field5231 * 1.5F);
                                            }
                                            class67.method483();
                                            class67.method459(true);
                                            class67.method476(false);
                                            class54.method371(-60, class297.field4401);
                                            if (class287.field4275) {
                                                class102.method748();
                                                class67.method487();
                                                class102.method753(arg1, arg6, arg9, arg7);
                                                class287.field4275 = false;
                                            }
                                            if (var11.field5191) {
                                                class67.method475();
                                            }
                                            int var98 = class184.field2532[var11.field5172] * var11.field5171 >> 16;
                                            int var99 = class184.field2538[var11.field5172] * var11.field5171 >> 16;
                                            if (var11.field5267) {
                                                var82.method329(0, var11.field5241, var11.field5176, var11.field5172, var11.field5329, var84 + var99 + var11.field5349, var11.field5349 + var98, -1L);
                                            } else {
                                                var82.method329(0, var11.field5241, 0, var11.field5172, 0, var99, var98, -1L);
                                            }
                                            if (var11.field5191) {
                                                class67.method482();
                                            }
                                        } else {
                                            class184.method1287(var94, var95);
                                            int var96 = class184.field2532[var11.field5172] * var11.field5171 >> 16;
                                            int var97 = class184.field2538[var11.field5172] * var11.field5171 >> 16;
                                            if (!var11.field5267) {
                                                var82.method329(0, var11.field5241, 0, var11.field5172, 0, var97, var96, -1L);
                                            } else if (var11.field5181) {
                                                ((class50) var82).method341(0, var11.field5241, var11.field5176, var11.field5172, var11.field5329, var97 - (-var84 - var11.field5349), var11.field5349 + var96, var11.field5171);
                                            } else {
                                                var82.method329(0, var11.field5241, var11.field5176, var11.field5172, var11.field5329, var97 + var11.field5349 + var84, var11.field5349 + var96, -1L);
                                            }
                                            class184.method1295();
                                        }
                                    }
                                } else {
                                    if (var11.field5316 == 7) {
                                        class277 var100 = var11.method2372(class141.field1935, -14);
                                        if (var100 == null) {
                                            if (class340.field5106) {
                                                class255.method1741(var11, false);
                                            }
                                            continue;
                                        }
                                        int var101 = 0;
                                        for (int var102 = 0; var102 < var11.field5236; var102++) {
                                            for (int var103 = 0; var103 < var11.field5305; var103++) {
                                                if (var11.field5278[var101] > 0) {
                                                    class198 var104 = class115.method854((byte) 29, var11.field5278[var101] - 1);
                                                    String var105;
                                                    if (var104.field2818 != 1 && var11.field5237[var101] == 1) {
                                                        var105 = "<col=ff9040>" + var104.field2757 + "</col>";
                                                    } else {
                                                        var105 = "<col=ff9040>" + var104.field2757 + "</col> x" + class20.method126(var11.field5237[var101], (byte) 93);
                                                    }
                                                    int var106 = (var11.field5198 + 115) * var103 + var13;
                                                    int var107 = var14 + ((var11.field5256 + 12) * var102);
                                                    if (var11.field5212 == 0) {
                                                        var100.method1911(var105, var106, var107, var11.field5281, var11.field5323 ? 0 : -1);
                                                    } else if (var11.field5212 == 1) {
                                                        var100.method1909(var105, var106 + 57, var107, var11.field5281, var11.field5323 ? 0 : -1);
                                                    } else {
                                                        var100.method1899(var105, var106 + 114, var107, var11.field5281, var11.field5323 ? 0 : -1);
                                                    }
                                                }
                                                var101++;
                                            }
                                        }
                                    }
                                    if (var11.field5316 == 8 && class186.field2572 == var11 && class59.field800 == class330.field4983) {
                                        int var108 = 0;
                                        int var109 = 0;
                                        String var110 = var11.field5301;
                                        class277 var111 = class312.field4716;
                                        String var112 = class36.method207(var11, (byte) 121, var110);
                                        while (var112.length() > 0) {
                                            int var113 = var112.indexOf("<br>");
                                            String var114;
                                            if (var113 == -1) {
                                                var114 = var112;
                                                var112 = "";
                                            } else {
                                                var114 = var112.substring(0, var113);
                                                var112 = var112.substring(var113 + 4);
                                            }
                                            int var115 = var111.method1904(var114);
                                            var108 += var111.field4143 + 1;
                                            if (var115 > var109) {
                                                var109 = var115;
                                            }
                                        }
                                        var108 += 7;
                                        var109 += 6;
                                        int var116 = var14 + var11.field5293 + 5;
                                        if (var108 + var116 > arg7) {
                                            var116 = arg7 - var108;
                                        }
                                        int var117 = var13 + var11.field5334 - (var109 + 5);
                                        if ((var13 + 5) > var117) {
                                            var117 = var13 + 5;
                                        }
                                        if ((var109 + var117) > arg9) {
                                            var117 = arg9 - var109;
                                        }
                                        if (class67.field908) {
                                            class102.method738(var117, var116, var109, var108, 16777120);
                                            class102.method750(var117, var116, var109, var108, 0);
                                        } else {
                                            class38.method224(var117, var116, var109, var108, 16777120);
                                            class38.method216(var117, var116, var109, var108, 0);
                                        }
                                        int var118 = var111.field4143 + var116 + 2;
                                        String var119 = var11.field5301;
                                        String var120 = class36.method207(var11, (byte) 43, var119);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf("<br>");
                                            String var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = "";
                                            } else {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            }
                                            var111.method1911(var122, var117 + 3, var118, 0, -1);
                                            var118 += var111.field4143 + 1;
                                        }
                                    }
                                    if (var11.field5316 == 9) {
                                        int var123;
                                        int var124;
                                        int var125;
                                        int var126;
                                        if (var11.field5280) {
                                            var126 = var11.field5293 + var14;
                                            var125 = var14;
                                            var124 = var13;
                                            var123 = var11.field5334 + var13;
                                        } else {
                                            var123 = var13 + var11.field5334;
                                            var124 = var13;
                                            var125 = var11.field5293 + var14;
                                            var126 = var14;
                                        }
                                        if (var11.field5177 == 1) {
                                            if (class67.field908) {
                                                class102.method752(var124, var126, var123, var125, var11.field5281);
                                            } else {
                                                class38.method229(var124, var126, var123, var125, var11.field5281);
                                            }
                                        } else if (class67.field908) {
                                            class102.method746(var124, var126, var123, var125, var11.field5281, var11.field5177);
                                        } else {
                                            class38.method215(var124, var126, var123, var125, var11.field5281, var11.field5177);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIIII)V", line = 1556)
    public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field195++;
        if (!this.field182) {
            double var6 = (double) (arg1 - this.field200);
            double var8 = (double) (arg2 - this.field209);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field204 = (double) this.field218 * var8 / var10 + (double) this.field209;
            this.field186 = (double) this.field189;
            this.field217 = (double) this.field218 * var6 / var10 + (double) this.field200;
        }
        if (arg3 != 2) {
            this.field186 = 1.4817880821254505D;
        }
        double var12 = (double) (this.field213 + 1 - arg4);
        this.field188 = ((double) arg2 - this.field204) / var12;
        this.field190 = ((double) arg1 - this.field217) / var12;
        this.field214 = Math.sqrt(this.field190 * this.field190 + this.field188 * this.field188);
        if (this.field212 == -1) {
            this.field183 = ((double) arg0 - this.field186) / var12;
        } else {
            if (!this.field182) {
                this.field183 = -this.field214 * Math.tan((double) this.field212 * 0.02454369D);
            }
            this.field181 = ((double) arg0 - this.field186 - (this.field183 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 1600)
    public static void method104(int arg0) {
        field196 = null;
        if (arg0 != 1412584498) {
            method106(-75, -127, -26, (class344) null, 34);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()I", line = 1615)
    public final int method105() {
        field208++;
        return this.field199;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILin;I)V", line = 1625)
    private static final void method106(int arg0, int arg1, int arg2, class344 arg3, int arg4) {
        class15.method98(-116);
        field210++;
        if (class67.field908) {
            class102.method753(arg1, arg2, arg3.field5334 + arg1, arg3.field5293 + arg2);
        } else {
            class38.method220(arg1, arg2, arg3.field5334 + arg1, arg2 - -arg3.field5293);
        }
        if (arg0 != -15442) {
            field191 = -43;
        }
        if (class72.field996 != 2 && class72.field996 != 5 && class256.field3699 != null) {
            int var5 = class173.field2356.field3745 / 32 + 48;
            int var6 = 464 - (class173.field2356.field3679 / 32);
            int var7 = (int) class89.field1257 + class264.field3859 & 0x7FF;
            if (class67.field908) {
                ((class328) class256.field3699).method2292(arg1, arg2, arg3.field5334, arg3.field5293, var5, var6, var7, class252.field3618 + 256, (class328) arg3.method2370(true, false));
            } else {
                ((class178) class256.field3699).method842(arg1, arg2, arg3.field5334, arg3.field5293, var5, var6, var7, class252.field3618 + 256, arg3.field5283, arg3.field5202);
            }
            if (class111.field1506 != null) {
                for (int var8 = 0; var8 < class111.field1506.field2397; var8++) {
                    if (class111.field1506.method1224(arg0 ^ 0x3C6A, var8)) {
                        int var9 = (((class111.field1506.field2389[var8] & 0xFFFFD3F) >> 14) - class132.field1809) * 4 + 2 - (class173.field2356.field3745 / 32);
                        int var10 = ((class111.field1506.field2389[var8] & 0x3FFF) - class296.field4394) * 4 + 2 - (class173.field2356.field3679 / 32);
                        int var11 = class184.field2532[var7];
                        int var12 = var11 * 256 / (class252.field3618 + 256);
                        int var13 = class184.field2538[var7];
                        int var14 = var13 * 256 / (class252.field3618 + 256);
                        int var15 = var10 * var12 - (var9 * var14) >> 16;
                        int var16 = var9 * var12 + var10 * var14 >> 16;
                        class277 var17 = class37.field426;
                        if (class111.field1506.method1220(-64, var8) == 1) {
                            var17 = class312.field4716;
                        }
                        if (class111.field1506.method1220(arg0 + 15351, var8) == 2) {
                            var17 = class204.field2946;
                        }
                        int var18 = var17.method1919(class111.field1506.field2390[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (-arg3.field5334 <= var19 && var19 <= arg3.field5334 && -arg3.field5293 <= var15 && arg3.field5293 >= var15) {
                            int var20 = 16777215;
                            if (class111.field1506.field2401[var8] != -1) {
                                var20 = class111.field1506.field2401[var8];
                            }
                            if (class67.field908) {
                                class102.method751((class328) arg3.method2370(true, false));
                            } else {
                                class38.method227(arg3.field5283, arg3.field5202);
                            }
                            var17.method1918(class111.field1506.field2390[var8], arg3.field5334 / 2 + arg1 + var19, arg3.field5293 / 2 + -var15 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class67.field908) {
                                class102.method739();
                            } else {
                                class38.method225();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class333.field5021; var21++) {
                int var22 = class208.field3000[var21] * 4 + 2 - (class173.field2356.field3679 / 32);
                int var23 = class221.field3173[var21] * 4 + 2 - (class173.field2356.field3745 / 32);
                class302 var24 = class153.method1106(class130.field1790[var21], (byte) -68);
                if (var24.field4519 != null) {
                    var24 = var24.method2066((byte) -84);
                    if (var24 == null || var24.field4529 == -1) {
                        continue;
                    }
                }
                class76.method562(class148.field2056[var24.field4529], arg1, arg2, arg3, var22, true, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class192 var27 = class246.field3544[class251.field3603][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class173.field2356.field3679 / 32);
                        int var29 = var25 * 4 + 2 - class173.field2356.field3745 / 32;
                        class76.method562(class216.field3090[0], arg1, arg2, arg3, var28, true, var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class338.field5084; var30++) {
                class329 var31 = class42.field484[class257.field3807[var30]];
                if (var31 != null && var31.method1652((byte) -50)) {
                    class181 var32 = var31.field4961;
                    if (var32 != null && var32.field2476 != null) {
                        var32 = var32.method1266((byte) -19);
                    }
                    if (var32 != null && var32.field2471 && var32.field2461) {
                        int var33 = var31.field3745 / 32 - (class173.field2356.field3745 / 32);
                        int var34 = var31.field3679 / 32 - (class173.field2356.field3679 / 32);
                        if (var32.field2486 == -1) {
                            class76.method562(class216.field3090[1], arg1, arg2, arg3, var34, true, var33);
                        } else {
                            class76.method562(class148.field2056[var32.field2486], arg1, arg2, arg3, var34, true, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class292.field4352; var35++) {
                class241 var36 = class169.field2306[class4.field35[var35]];
                if (var36 != null && var36.method1652((byte) -50)) {
                    int var37 = var36.field3679 / 32 - (class173.field2356.field3679 / 32);
                    int var38 = var36.field3745 / 32 - class173.field2356.field3745 / 32;
                    boolean var39 = false;
                    long var40 = class77.method584(var36.field3439, 113);
                    for (int var42 = 0; var42 < class44.field535; var42++) {
                        if (class89.field1254[var42] == var40 && class344.field5271[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class324.field4917; var44++) {
                        if (class344.field5239[var44].field2522 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class173.field2356.field3445 != 0 && var36.field3445 != 0 && class173.field2356.field3445 == var36.field3445) {
                        var45 = true;
                    }
                    if (var39) {
                        class76.method562(class216.field3090[3], arg1, arg2, arg3, var37, true, var38);
                    } else if (var43) {
                        class76.method562(class216.field3090[5], arg1, arg2, arg3, var37, true, var38);
                    } else if (var45) {
                        class76.method562(class216.field3090[4], arg1, arg2, arg3, var37, true, var38);
                    } else {
                        class76.method562(class216.field3090[2], arg1, arg2, arg3, var37, true, var38);
                    }
                }
            }
            class324[] var46 = class294.field4367;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class324 var48 = var46[var47];
                if (var48 != null && var48.field4910 != 0 && class329.field4966 % 20 < 10) {
                    if (var48.field4910 == 1 && var48.field4906 >= 0 && var48.field4906 < class42.field484.length) {
                        class329 var49 = class42.field484[var48.field4906];
                        if (var49 != null) {
                            int var50 = var49.field3745 / 32 - (class173.field2356.field3745 / 32);
                            int var51 = var49.field3679 / 32 - class173.field2356.field3679 / 32;
                            class138.method997(-113, arg3, var48.field4915, 360000, arg1, arg2, var51, var50);
                        }
                    }
                    if (var48.field4910 == 2) {
                        int var52 = (var48.field4914 - class132.field1809) * 4 + 2 - (class173.field2356.field3745 / 32);
                        int var53 = var48.field4905 * 4;
                        int var54 = var53 * var53;
                        int var55 = (var48.field4923 - class296.field4394) * 4 + (2 - class173.field2356.field3679 / 32);
                        class138.method997(-56, arg3, var48.field4915, var54, arg1, arg2, var55, var52);
                    }
                    if (var48.field4910 == 10 && var48.field4906 >= 0 && var48.field4906 < class169.field2306.length) {
                        class241 var56 = class169.field2306[var48.field4906];
                        if (var56 != null) {
                            int var57 = var56.field3679 / 32 - (class173.field2356.field3679 / 32);
                            int var58 = var56.field3745 / 32 - class173.field2356.field3745 / 32;
                            class138.method997(-86, arg3, var48.field4915, 360000, arg1, arg2, var57, var58);
                        }
                    }
                }
            }
            if (class167.field2278 != 0) {
                int var59 = class167.field2278 * 4 + 2 - (class173.field2356.field3745 / 32 - -2 - class173.field2356.method1653(arg0 + 15441) * 2);
                int var60 = class288.field4282 * 4 + ((class173.field2356.method1653(-1) + -1) * 2) + 2 - (class173.field2356.field3679 / 32);
                class76.method562(class208.field2998, arg1, arg2, arg3, var60, true, var59);
            }
            if (class67.field908) {
                class102.method738(arg3.field5334 / 2 + (arg1 - 1), arg3.field5293 / 2 + arg2 + -1, 3, 3, 16777215);
            } else {
                class38.method224(arg3.field5334 / 2 + arg1 - 1, arg3.field5293 / 2 + arg2 + -1, 3, 3, 16777215);
            }
        } else if (class67.field908) {
            class170 var61 = arg3.method2370(true, false);
            if (var61 != null) {
                var61.method840(arg1, arg2);
            }
        } else {
            class38.method212(arg1, arg2, 0, arg3.field5283, arg3.field5202);
        }
        class304.field4571[arg4] = true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILfj;)V", line = 1975)
    public static final void method107(int arg0, int arg1, int arg2, int arg3, class241 arg4) {
        field192++;
        if (class173.field2356 == arg4 || class204.field2938 >= 400) {
            return;
        }
        String var5;
        if (arg4.field3413 == 0) {
            boolean var6 = true;
            if (class173.field2356.field3437 != -1 && arg4.field3437 != -1) {
                int var7 = arg4.field3416 >= class173.field2356.field3416 ? arg4.field3416 : class173.field2356.field3416;
                int var8 = class173.field2356.field3416 - arg4.field3416;
                int var9 = class173.field2356.field3437 >= arg4.field3437 ? arg4.field3437 : class173.field2356.field3437;
                int var10 = var7 * 10 / 100 + var9 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var8 > var10) {
                    var6 = false;
                }
            }
            String var11 = class39.field448 == 1 ? class61.field812 : class250.field3585;
            if (arg4.field3433 <= arg4.field3416) {
                var5 = arg4.method1656(-1) + (var6 ? class170.method1200((byte) 126, arg4.field3416, class173.field2356.field3416) : "<col=ffffff>") + " (" + var11 + arg4.field3416 + ")";
            } else {
                var5 = arg4.method1656(~arg0) + (var6 ? class170.method1200((byte) 124, arg4.field3416, class173.field2356.field3416) : "<col=ffffff>") + " (" + var11 + arg4.field3416 + "+" + (arg4.field3433 - arg4.field3416) + ")";
            }
        } else {
            var5 = arg4.method1656(-1) + " (" + class145.field2006 + arg4.field3413 + ")";
        }
        if (class1.field15 == 1) {
            class237.method1632((short) 26, class166.field2269, class189.field2606, arg1, (long) arg3, 86, class148.field2052 + " -> <col=ffffff>" + var5, arg2);
            class221.field3185++;
        } else if (!class124.field1676) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class210.field3039[var12] != null) {
                    class130.field1781++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class39.field448 == 0 && class210.field3039[var12].equalsIgnoreCase(class160.field2194)) {
                        if (class173.field2356.field3416 < arg4.field3416) {
                            var14 = 2000;
                        }
                        if (class173.field2356.field3445 != 0 && arg4.field3445 != 0) {
                            if (class173.field2356.field3445 == arg4.field3445) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class176.field2393[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class342.field5118[var12];
                    short var16 = (short) (var14 + var15);
                    class237.method1632(var16, class253.field3630[var12], class210.field3039[var12], arg1, (long) arg3, -103, "<col=ffffff>" + var5, arg2);
                }
            }
        } else if ((class172.field2348 & 0x8) != 0) {
            class237.method1632((short) 20, class128.field1753, class282.field4224, arg1, (long) arg3, 107, class266.field3880 + " -> <col=ffffff>" + var5, arg2);
            class190.field2620++;
        }
        for (int var17 = arg0; var17 < class204.field2938; var17++) {
            if (class54.field722[var17] == 43) {
                class88.field1251[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 2108)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field216++;
        class345 var13 = this.method109(false);
        if (var13 != null) {
            var13.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field220);
            this.field199 = var13.method105();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)Lq;", line = 2151)
    private final class345 method109(boolean arg0) {
        field207++;
        if (arg0) {
            this.method105();
        }
        class309 var2 = class336.method2329(-62, this.field194);
        class345 var3 = var2.method2122(this.field193, -12, this.field206, this.field184);
        if (var3 == null) {
            return null;
        } else {
            var3.method344(this.field203);
            return var3;
        }
    }
}
