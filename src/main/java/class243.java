import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class243 extends class270 {

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    private int field4127 = 1;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    private int field4128 = 1;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "[J")
    public static long[] field4129 = new long[1000];

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field4131 = -2;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "Led;")
    public static class49 field4134 = new class49(16);

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
    public static int field4138 = 0;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4132;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1706(int arg0) {
        field4130++;
        if (class237.field4063 == 194) {
            int var98 = class75.field1223.method702(-1);
            int var99 = (var98 >> 4 & 0x7) + class230.field3995;
            int var100 = (var98 & 0x7) + class37.field572;
            int var101 = class75.field1223.method721(95);
            int var102 = class75.field1223.method721(111);
            int var103 = class75.field1223.method721(41);
            if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                class52 var104 = class7.field72[class7.field85][var99][var100];
                if (var104 != null) {
                    for (class301 var105 = (class301) var104.method334(arg0 + 7889); var105 != null; var105 = (class301) var104.method335((byte) 102)) {
                        class41 var106 = var105.field5187;
                        if ((var101 & 0x7FFF) == var106.field629 && var106.field620 == var102) {
                            var106.field620 = var103;
                            break;
                        }
                    }
                    class262.method1815(var100, var99, (byte) -77);
                }
            }
        } else if (class237.field4063 == 62) {
            int var1 = class75.field1223.method702(arg0 ^ 0x67C1);
            int var2 = ((var1 & 0x7F) >> 4) + class230.field3995;
            int var3 = (var1 & 0x7) + class37.field572;
            int var4 = class75.field1223.method721(66);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class75.field1223.method702(-1);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class75.field1223.method702(arg0 + 26561);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var9 = var6 + 1;
                if ((var2 - var9) <= class268.field4551.field3828[0] && (var2 + var9) >= class268.field4551.field3828[0] && (var3 - var9) <= class268.field4551.field3846[0] && var3 + var9 >= class268.field4551.field3846[0] && class114.field1902 != 0 && var7 > 0 && class39.field603 < 50 && var4 != -1) {
                    class164.field2653[class39.field603] = var4;
                    class261.field4382[class39.field603] = var7;
                    class37.field524[class39.field603] = var8;
                    class162.field2624[class39.field603] = null;
                    class151.field2383[class39.field603] = (var2 << 16) + (var3 << 8) + var6;
                    class39.field603++;
                }
            }
        } else {
            if (class237.field4063 == 92) {
                class75.field1223.method720(true);
                class75.field1223.method748(arg0 + 26559);
                int var10 = class75.field1223.method748(arg0 ^ 0x67C3);
                class75.field1223.method743((byte) 110);
                class75.field1223.method732(97);
                class75.field1223.method739(true);
                class75.field1223.method748(arg0 + 26559);
                class75.field1223.method746(arg0 ^ 0xFFFF98BE);
                class75.field1223.method746(128);
                class75.field1223.method691(128);
                if (class156.field2523 != var10) {
                }
            }
            if (arg0 == -26562) {
                if (class237.field4063 == 95) {
                    int var11 = class75.field1223.method702(-1);
                    int var12 = class230.field3995 + (var11 >> 4 & 0x7);
                    int var13 = (var11 & 0x7) + class37.field572;
                    int var14 = var12 + class75.field1223.method743((byte) 27);
                    int var15 = var13 + class75.field1223.method743((byte) 37);
                    int var16 = class75.field1223.method699((byte) -54);
                    int var17 = class75.field1223.method721(97);
                    int var18 = class75.field1223.method702(-1) * 4;
                    int var19 = class75.field1223.method702(-1) * 4;
                    int var20 = class75.field1223.method721(126);
                    int var21 = class75.field1223.method721(110);
                    int var22 = class75.field1223.method702(-1);
                    int var23 = class75.field1223.method702(-1);
                    if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var17 != 65535) {
                        int var24 = var14 * 128 + 64;
                        int var25 = var12 * 128 + 64;
                        int var26 = var15 * 128 + 64;
                        int var27 = var13 * 128 + 64;
                        class125 var28 = new class125(var17, class7.field85, var25, var27, class165.method1186((byte) -58, var27, var25, class7.field85) - var18, class199.field3367 + var20, class199.field3367 + var21, var22, var23, var16, var19);
                        var28.method949((byte) -128, var24, class165.method1186((byte) -58, var26, var24, class7.field85) - var19, var26, class199.field3367 + var20);
                        class38.field580.method330(new class281(var28), -72);
                    }
                } else if (class237.field4063 == 17) {
                    int var90 = class75.field1223.method744(119);
                    int var91 = var90 >> 2;
                    int var92 = var90 & 0x3;
                    int var93 = class60.field869[var91];
                    int var94 = class75.field1223.method702(-1);
                    int var95 = (var94 >> 4 & 0x7) + class230.field3995;
                    int var96 = (var94 & 0x7) + class37.field572;
                    int var97 = class75.field1223.method748(-3);
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        class221.method1573(var96, var93, var92, -1, class7.field85, 32048, var97, var91, 0, var95);
                    }
                } else if (class237.field4063 == 42) {
                    int var81 = class75.field1223.method702(-1);
                    int var82 = class230.field3995 + ((var81 & 0x7C) >> 4);
                    int var83 = class37.field572 + (var81 & 0x7);
                    int var84 = class75.field1223.method721(39);
                    int var85 = class75.field1223.method702(-1);
                    int var86 = class75.field1223.method721(71);
                    if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                        int var87 = var83 * 128 + 64;
                        int var88 = var82 * 128 + 64;
                        class194 var89 = new class194(var84, class7.field85, var88, var87, class165.method1186((byte) -58, var87, var88, class7.field85) - var85, var86, class199.field3367);
                        class241.field4113.method330(new class277(var89), -70);
                    }
                } else if (class237.field4063 == 98) {
                    int var75 = class75.field1223.method702(-1);
                    int var76 = (var75 & 0x7) + class37.field572;
                    int var77 = ((var75 & 0x7B) >> 4) + class230.field3995;
                    int var78 = class75.field1223.method721(arg0 ^ 0xFFFF987C);
                    if (var77 >= 0 && var76 >= 0 && var77 < 104 && var76 < 104) {
                        class52 var79 = class7.field72[class7.field85][var77][var76];
                        if (var79 != null) {
                            for (class301 var80 = (class301) var79.method334(-18673); var80 != null; var80 = (class301) var79.method335((byte) 109)) {
                                if ((var78 & 0x7FFF) == var80.field5187.field629) {
                                    var80.method1444((byte) 89);
                                    break;
                                }
                            }
                            if (var79.method334(-18673) == null) {
                                class7.field72[class7.field85][var77][var76] = null;
                            }
                            class262.method1815(var76, var77, (byte) -77);
                        }
                    }
                } else if (class237.field4063 == 61) {
                    int var29 = class75.field1223.method702(-1);
                    int var30 = (var29 >> 4 & 0xF) + class230.field3995 * 2;
                    int var31 = (var29 & 0xF) + class37.field572 * 2;
                    int var32 = var30 + class75.field1223.method743((byte) 74);
                    int var33 = var31 + class75.field1223.method743((byte) 110);
                    int var34 = class75.field1223.method699((byte) -128);
                    int var35 = class75.field1223.method721(109);
                    int var36 = class75.field1223.method702(-1) * 4;
                    int var37 = class75.field1223.method702(-1) * 4;
                    int var38 = class75.field1223.method721(26);
                    int var39 = class75.field1223.method721(82);
                    int var40 = class75.field1223.method702(-1);
                    int var41 = class75.field1223.method702(-1);
                    if (var30 >= 0 && var31 >= 0 && var30 < 208 && var31 < 208 && var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var35 != 65535) {
                        int var42 = var33 * 64;
                        int var43 = var30 * 64;
                        int var44 = var31 * 64;
                        int var45 = var32 * 64;
                        class125 var46 = new class125(var35, class7.field85, var43, var44, class165.method1186((byte) -58, var44, var43, class7.field85) - var36, var38 - -class199.field3367, class199.field3367 + var39, var40, var41, var34, var37);
                        var46.method949((byte) -126, var45, class165.method1186((byte) -58, var42, var45, class7.field85) - var37, var42, class199.field3367 + var38);
                        class38.field580.method330(new class281(var46), 96);
                    }
                } else if (class237.field4063 == 120) {
                    int var67 = class75.field1223.method721(96);
                    if (var67 == 65535) {
                        var67 = -1;
                    }
                    int var68 = class75.field1223.method744(113);
                    int var69 = var68 >> 2;
                    int var70 = var68 & 0x3;
                    int var71 = class60.field869[var69];
                    int var72 = class75.field1223.method739(true);
                    int var73 = ((var72 & 0x76) >> 4) + class230.field3995;
                    int var74 = (var72 & 0x7) + class37.field572;
                    class85.method649(class7.field85, var74, var70, var71, false, var73, var67, var69);
                } else if (class237.field4063 == 58) {
                    int var47 = class75.field1223.method739(true);
                    int var48 = (var47 & 0x7) + class37.field572;
                    int var49 = ((var47 & 0x74) >> 4) + class230.field3995;
                    int var50 = class75.field1223.method691(128);
                    int var51 = class75.field1223.method691(128);
                    int var52 = class75.field1223.method734(false);
                    if (var49 >= 0 && var48 >= 0 && var49 < 104 && var48 < 104 && class156.field2523 != var50) {
                        class41 var53 = new class41();
                        var53.field620 = var52;
                        var53.field629 = var51;
                        if (class7.field72[class7.field85][var49][var48] == null) {
                            class7.field72[class7.field85][var49][var48] = new class52();
                        }
                        class7.field72[class7.field85][var49][var48].method330(new class301(var53), 84);
                        class262.method1815(var48, var49, (byte) -77);
                    }
                } else if (class237.field4063 == 80) {
                    int var60 = class75.field1223.method720(true);
                    int var61 = var60 >> 2;
                    int var62 = class60.field869[var61];
                    int var63 = var60 & 0x3;
                    int var64 = class75.field1223.method720(true);
                    int var65 = (var64 >> 4 & 0x7) + class230.field3995;
                    int var66 = class37.field572 + (var64 & 0x7);
                    if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                        class221.method1573(var66, var62, var63, -1, class7.field85, arg0 ^ 0xFFFFE50E, -1, var61, 0, var65);
                    }
                } else if (class237.field4063 == 72) {
                    int var54 = class75.field1223.method720(true);
                    int var55 = ((var54 & 0x74) >> 4) + class230.field3995;
                    int var56 = class37.field572 + (var54 & 0x7);
                    int var57 = class75.field1223.method721(116);
                    int var58 = class75.field1223.method734(false);
                    if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                        class41 var59 = new class41();
                        var59.field620 = var57;
                        var59.field629 = var58;
                        if (class7.field72[class7.field85][var55][var56] == null) {
                            class7.field72[class7.field85][var55][var56] = new class52();
                        }
                        class7.field72[class7.field85][var55][var56].method330(new class301(var59), 48);
                        class262.method1815(var56, var55, (byte) -77);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I", line = 510)
    public final int[] method6(int arg0, int arg1) {
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = this.field4127 - (-this.field4127 - 1);
            int var5 = this.field4128 + this.field4128 + 1;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][] var8 = new int[var5][];
            for (int var9 = arg1 - this.field4128; var9 <= this.field4128 + arg1; var9++) {
                int[] var10 = this.method1850(0, arg0 ^ 0x4905, class307.field5268 & var9);
                int[] var11 = new int[class109.field1770];
                int var12 = 0;
                for (int var13 = -this.field4127; var13 <= this.field4127; var13++) {
                    var12 += var10[var13 & class49.field717];
                }
                int var14 = 0;
                while (var14 < class109.field1770) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class49.field717 & var14 - this.field4127];
                    var14++;
                    var12 = var10[this.field4127 + var14 & class49.field717] + var15;
                }
                var8[var9 + this.field4128 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class109.field1770; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var5; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        if (arg0 != 18693) {
            field4136 = -13;
        }
        field4135++;
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)[[I", line = 596)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            this.method6(-63, 107);
        }
        field4137++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int var4 = this.field4128 - (-this.field4128 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field4127 + this.field4127 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field4128; var9 <= (arg1 + this.field4128); var9++) {
                int var10 = 0;
                int[][] var11 = this.method1855(false, class307.field5268 & var9, 0);
                int[][] var12 = new int[3][class109.field1770];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var11[0];
                int[] var16 = var11[1];
                int[] var17 = var11[2];
                for (int var18 = -this.field4127; var18 <= this.field4127; var18++) {
                    int var19 = class49.field717 & var18;
                    var13 += var16[var19];
                    var10 += var15[var19];
                    var14 += var17[var19];
                }
                int[] var20 = var12[1];
                int[] var21 = var12[2];
                int[] var22 = var12[0];
                int var23 = 0;
                while (class109.field1770 > var23) {
                    var22[var23] = var7 * var10 >> 16;
                    var20[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var14 >> 16;
                    int var24 = var23 - this.field4127 & class49.field717;
                    var23++;
                    int var25 = var14 - var17[var24];
                    int var26 = var10 - var15[var24];
                    int var27 = var13 - var16[var24];
                    int var28 = class49.field717 & this.field4127 + var23;
                    var13 = var16[var28] + var27;
                    var14 = var17[var28] + var25;
                    var10 = var15[var28] + var26;
                }
                var8[var9 + this.field4128 - arg1] = var12;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[0];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class109.field1770; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[2][var32];
                    var35 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var30[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var35 >> 16;
                var31[var32] = var5 * var34 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lmi;II)V", line = 738)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field4133++;
        int var4 = -28 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field4127 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field4128 = arg0.method702(-1);
        } else if (arg1 == 2) {
            this.field4588 = arg0.method702(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 801)
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "(B)V", line = 808)
    public static void method1707(byte arg0) {
        int var1 = -88 % ((arg0 + 22) / 45);
        field4134 = null;
        field4132 = null;
        field4129 = null;
    }
}
