import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class317 {

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Laf;")
    private class22 field4491;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Z")
    public boolean field4478;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Ldi;")
    private class300 field4486;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[[[B")
    private byte[][][] field4479;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[[[B")
    private byte[][][] field4468;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[[[B")
    public byte[][][] field4487;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[[[B")
    private byte[][][] field4466;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[[[I")
    public int[][][] field4484;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[[[B")
    private byte[][][] field4471;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
    public static int[] field4463 = new int[2048];

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4477 = null;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljava/awt/Font;")
    public static Font field4492;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[[[B")
    public byte[][][] field4462;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkk;IIIII[Lpf;)V")
    public final void method2008(class161 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class18[] arg6) {
        if (!this.field4478) {
            for (int var8 = 0; var8 < 4; var8++) {
                class18 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg2 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field4465 > var12 && var13 >= 0 && var13 < this.field4488) {
                            var9.method124(arg3 ^ 0x76D6, var12, var13);
                        }
                    }
                }
            }
        }
        field4489++;
        if (arg3 != 4807) {
            method2012(-59, 57, -98, -35, 0.87850446F, -36, false, -81);
        }
        int var14 = arg1 + arg2;
        int var15 = arg4 + arg5;
        for (int var16 = 0; var16 < this.field4474; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2016(var18 + arg4, 0, var14 + var17, false, var16, 0, arg0, (byte) 60, arg2 + var17, 0, var15 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lij;Lij;[[ILvc;ILij;I)V")
    private final void method2009(class241 arg0, class241 arg1, int[][] arg2, class89 arg3, int arg4, class241 arg5, int arg6) {
        field4485++;
        byte[][] var8 = this.field4471[arg6];
        byte[][] var9 = this.field4468[arg6];
        byte[][] var10 = this.field4466[arg6];
        byte[][] var11 = this.field4479[arg6];
        for (int var12 = 0; var12 < this.field4465; var12++) {
            int var13 = this.field4465 - 1 <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field4488; var14++) {
                int var15 = var14 >= this.field4488 - 1 ? var14 : var14 + 1;
                if (class442.field6292 == -1 || class190.method1339(0, var14, class442.field6292, arg6, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class261 var26 = var21 == 0 ? null : this.field4491.method158(var21 - 1, true);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class354 var27 = var22 == 0 ? null : this.field4486.method1934(var22 - 1, (byte) 99);
                        class261 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3758 == -1 && var26.field3741 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3743;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field4465 > var12 && var14 < this.field4488) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var35 = 0;
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method591(var12, var14) - arg0.method591(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method591(var13, var14) - arg0.method591(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class419.field5820[var39] = -1;
                            class219.field3178[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3743 ? class181.field2738[var19] : class39.field533[var19];
                        this.method2015(var12, var27, var9, var26, var8, 1, var20, var14, var11, var18, this.field4488, arg3, this.field4465, var19);
                        boolean var41 = var26 != null && var26.field3758 != var26.field3741;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class419.field5820[var42] >= 0 && class486.field6875[var42] != class385.field5277[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class53.method504(var18[1], class88.method739(class219.field3178[4], class219.field3178[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class53.method504(var18[3], class88.method739(class219.field3178[0], class219.field3178[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class53.method504(var18[0], class88.method739(class219.field3178[0], class219.field3178[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class53.method504(var18[2], class88.method739(class219.field3178[6], class219.field3178[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                                var20 = 3;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var46 = class293.field4142[var19];
                            var48 = var27 == null ? 0 : class47.field712[var19];
                            var47 = class117.field1621[var19];
                            var49 = class238.field3490[var19];
                            var45 = var26 == null ? 0 : class267.field3923[var19];
                        } else if (var17) {
                            var45 = var26 == null ? 0 : class200.field2954[var19];
                            var46 = class205.field3008[var19];
                            var47 = class309.field4389[var19];
                            var44 = class157.field2238[var19];
                            var48 = var27 == null ? 0 : class149.field2055[var19];
                            var49 = class482.field6818[var19];
                        } else {
                            var44 = class39.field527[var19];
                            var45 = var26 == null ? 0 : class353.field4856[var19];
                            var48 = var27 == null ? 0 : class106.field1495[var19];
                            var46 = class76.field1130[var19];
                            var49 = class200.field2971[var19];
                            var47 = class390.field5385[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class143.method1028(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg1 == null ? null : new int[var53];
                            int[] var61 = arg1 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3758;
                                var63 = arg3.method452() ? var26.field3751 : var26.field3752;
                                var64 = var26.field3756;
                                int var65 = class20.method146(var26, arg3, -1);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 1;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 1;
                                        class55.field818[4] = var49[var51];
                                        var98 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 5;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 5;
                                        class55.field818[4] = var49[var51];
                                        var98 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 3;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 3;
                                        class55.field818[4] = var49[var51];
                                        var98 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 7;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 7;
                                        class55.field818[4] = var49[var51];
                                        var98 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = var49[var51];
                                        class55.field818[2] = var46[var51];
                                        var98 = 3;
                                    }
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class55.field818[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = class206.field3010[var100];
                                        int var103 = class74.field1059[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class412.field5650[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg1.method590(var106, var107) - arg0.method590(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class412.field5650[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg0.method590(var108, var109) - arg1.method590(var108, var109);
                                            } else if (arg5 != null && !class73.field1053[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg5.method590(var110, var111) - arg0.method590(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3742 < class419.field5820[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class486.field6875[var101];
                                            }
                                            var59[var52] = class450.field6407[var101];
                                            var58[var52] = class347.field4789[var101];
                                            var57[var52] = class385.field5277[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method452() ? var26.field3751 : var26.field3752;
                                            var59[var52] = var26.field3756;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field4478 && arg6 == 0) {
                                    class93.method782(var12, var14, var26.field3738, var26.field3757 * 8, var26.field3759);
                                }
                                if (var19 != 12 && var26.field3758 != -1 && var26.field3740) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class267.field3923[var19];
                            } else if (var17) {
                                var51 += class200.field2954[var19];
                            } else {
                                var51 += class353.field4856[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class354 var67 = this.field4486.method1934(var22 - 1, (byte) 98);
                                class354 var68 = this.field4486.method1934(var23 - 1, (byte) 125);
                                class354 var69 = this.field4486.method1934(var24 - 1, (byte) 82);
                                class354 var70 = this.field4486.method1934(var25 - 1, (byte) 103);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 1;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 1;
                                        class55.field818[4] = var49[var51];
                                        var73 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 5;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 5;
                                        class55.field818[4] = var49[var51];
                                        var73 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 3;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 3;
                                        class55.field818[4] = var49[var51];
                                        var73 = 6;
                                        class55.field818[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = 7;
                                        class55.field818[2] = var46[var51];
                                        class55.field818[3] = 7;
                                        class55.field818[4] = var49[var51];
                                        class55.field818[5] = var46[var51];
                                        var73 = 6;
                                    } else {
                                        class55.field818[0] = var47[var51];
                                        class55.field818[1] = var49[var51];
                                        var73 = 3;
                                        class55.field818[2] = var46[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class55.field818[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = class206.field3010[var75];
                                        int var78 = class74.field1059[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class412.field5650[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg1.method590(var81, var82) - arg0.method590(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg1 != null && !class412.field5650[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg0.method590(var83, var84) - arg1.method590(var83, var84);
                                            } else if (arg5 != null && !class73.field1053[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg5.method590(var85, var86) - arg0.method590(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class419.field5820[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class486.field6875[var76];
                                            }
                                            var59[var52] = class450.field6407[var76];
                                            var58[var52] = class347.field4789[var76];
                                            var57[var52] = class385.field5277[var76];
                                        } else {
                                            if (var17 && class412.field5650[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg2[var12][var14];
                                                var58[var52] = var67.field4858;
                                                var59[var52] = var67.field4868;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg2[var12][var15];
                                                var58[var52] = var68.field4858;
                                                var59[var52] = var68.field4868;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg2[var13][var15];
                                                var58[var52] = var69.field4858;
                                                var59[var52] = var69.field4868;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg2[var13][var14];
                                                var58[var52] = var70.field4858;
                                                var59[var52] = var70.field4868;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field4858;
                                                        var59[var52] = var68.field4868;
                                                    } else {
                                                        var58[var52] = var67.field4858;
                                                        var59[var52] = var67.field4868;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var70.field4858;
                                                    var59[var52] = var70.field4868;
                                                } else {
                                                    var58[var52] = var69.field4858;
                                                    var59[var52] = var69.field4868;
                                                }
                                                int var87 = class20.method148(arg2[var12][var14], true, var80 << 7 >> 7, arg2[var13][var14]);
                                                int var88 = class20.method148(arg2[var12][var15], true, var80 << 7 >> 7, arg2[var13][var15]);
                                                var57[var52] = class20.method148(var87, true, var79 << 7 >> 7, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field4862) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg0.method591(var12, var14);
                            int var90 = arg0.method591(var13, var14);
                            int var91 = arg0.method591(var13, var15);
                            int var92 = arg0.method591(var12, var15);
                            if (arg6 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3748) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field4487[arg6][var12][var14] = (byte) class142.method1024(this.field4487[arg6][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field4478) {
                                var94 = class46.method476(var12, var14);
                                var95 = class193.method1345(var12, var14);
                                var96 = class318.method2027(var12, var14);
                            }
                            arg0.method579(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class143.method1028(arg6, var12, var14);
                        }
                    }
                }
            }
        }
        if (arg4 != 5) {
            this.field4479 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([[III)V")
    public final void method2010(int[][] arg0, int arg1, int arg2) {
        field4473++;
        int[][] var4 = this.field4484[arg2];
        if (arg1 < 99) {
            return;
        }
        for (int var5 = 0; var5 < this.field4465 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field4488 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public final void method2011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4480++;
        int var7 = 64 % ((arg1 - 26) / 58);
        for (int var8 = arg2; var8 < arg2 + arg0; var8++) {
            for (int var11 = arg4; var11 < (arg3 + arg4); var11++) {
                if (var11 >= 0 && this.field4465 > var11 && var8 >= 0 && var8 < this.field4488) {
                    this.field4484[arg5][var11][var8] = arg5 > 0 ? this.field4484[arg5 - 1][var11][var8] - 240 : 0;
                }
            }
        }
        if (arg4 > 0 && arg4 < this.field4465) {
            for (int var9 = arg2 + 1; var9 < arg0 + arg2; var9++) {
                if (var9 >= 0 && this.field4488 > var9) {
                    this.field4484[arg5][arg4][var9] = this.field4484[arg5][arg4 - 1][var9];
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field4488) {
            for (int var10 = arg4 + 1; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && var10 < this.field4465) {
                    this.field4484[arg5][var10][arg2] = this.field4484[arg5][var10][arg2 - 1];
                }
            }
        }
        if (arg4 < 0 || arg2 < 0 || arg4 >= this.field4465 || this.field4488 <= arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 > 0 && this.field4484[arg5][arg4 - 1][arg2] != 0) {
                this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4 - 1][arg2];
                return;
            }
            if (arg2 > 0 && this.field4484[arg5][arg4][arg2 - 1] != 0) {
                this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4][arg2 - 1];
                return;
            }
            if (arg4 <= 0 || arg2 <= 0 || this.field4484[arg5][arg4 - 1][arg2 - 1] == 0) {
                return;
            }
            this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4 - 1][arg2 - 1];
        } else if (arg4 <= 0 || this.field4484[arg5 - 1][arg4 - 1][arg2] == this.field4484[arg5][arg4 - 1][arg2]) {
            if (arg2 > 0 && this.field4484[arg5 - 1][arg4][arg2 - 1] != this.field4484[arg5][arg4][arg2 - 1]) {
                this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4][arg2 - 1];
                return;
            }
            if (arg4 > 0 && arg2 > 0 && this.field4484[arg5][arg4 - 1][arg2 - 1] != this.field4484[arg5 - 1][arg4 - 1][arg2 - 1]) {
                this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4 - 1][arg2 - 1];
                return;
            }
        } else {
            this.field4484[arg5][arg4][arg2] = this.field4484[arg5][arg4 - 1][arg2];
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIFIZI)[I")
    public static final int[] method2012(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7) {
        field4472++;
        int[] var8 = new int[arg0];
        class15 var9 = new class15();
        var9.field127 = (int) (arg4 * 4096.0F);
        var9.field142 = arg1;
        var9.field135 = arg5;
        var9.field143 = arg7;
        var9.field138 = arg6;
        var9.field134 = arg2;
        var9.method95(-8);
        class168.method1219(arg0, 1, (byte) -12);
        var9.method91(var8, 0, arg3 - 31164);
        if (arg3 != 7) {
            method2022(34);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BC)Z")
    public static final boolean method2013(byte arg0, char arg1) {
        if (arg0 > 0) {
            field4463 = null;
        }
        field4482++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lpf;IIIIIIBILkk;)V")
    public final void method2014(class18[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class161 arg9) {
        field4470++;
        int var11 = (arg6 & 0x7) * 8;
        int var12 = (arg8 & 0x7) * 8;
        if (!this.field4478) {
            class18 var13 = arg0[arg4];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg1 + class372.method2270(arg2, var15 & 0x7, var14 & 0x7, 1);
                    int var17 = class46.method473(arg2, var15 & 0x7, var14 & 0x7, 115) + arg3;
                    if (var16 > 0 && this.field4465 - 1 > var16 && var17 > 0 && var17 < (this.field4488 - 1)) {
                        var13.method124(25617, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg6 & 0xFFFFFFF8) << 3;
        int var19 = (arg8 & 0xFFFFFFF8) << 3;
        if (arg7 < 38) {
            return;
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg2 == 1) {
            var21 = 1;
        } else if (arg2 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg2 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field4474; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg5 != var22 || var11 > var23 || var23 > var11 + 8 || var12 > var24 || var12 + 8 < var24) {
                        this.method2016(-1, 0, 0, false, 0, 0, arg9, (byte) 60, -1, 0, 0);
                    } else if (var11 + 8 == var23 || (var12 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg2 == 0) {
                            var31 = var24 + arg3 - var12;
                            var32 = var23 + arg1 - var11;
                        } else if (arg2 == 1) {
                            var31 = arg3 + 8 - (-var11 + var23);
                            var32 = var24 + arg1 - var12;
                        } else if (arg2 == 2) {
                            var31 = var12 + arg3 + 8 - var24;
                            var32 = var11 + arg1 + 8 - var23;
                        } else {
                            var31 = var23 - (var11 - arg3);
                            var32 = var12 + arg1 + 8 - var24;
                        }
                        this.method2016(var31, 0, var18 + var23, true, arg4, 0, arg9, (byte) 60, var32, 0, var19 + var24);
                    } else {
                        int var25 = arg1 + class372.method2270(arg2, var24 & 0x7, var23 & 0x7, 1);
                        int var26 = arg3 + class46.method473(arg2, var24 & 0x7, var23 & 0x7, -87);
                        this.method2016(var26, var20, var18 + var23, false, arg4, arg2, arg9, (byte) 60, var25, var21, var19 + var24);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg2 == 0) {
                                var29 = var28 + arg3 - var12;
                                var30 = arg1 + var27 - var11;
                            } else if (arg2 == 1) {
                                var30 = var28 + arg1 - var12;
                                var29 = var11 + arg3 + 8 - var27;
                            } else if (arg2 == 2) {
                                var29 = var12 - (var28 - arg3 - 8);
                                var30 = -var27 - (-var11 - (arg1 + 8));
                            } else {
                                var29 = var27 - (var11 - arg3);
                                var30 = var12 + arg1 + 8 - var28;
                            }
                            if (var30 >= 0 && this.field4465 > var30 && var29 >= 0 && var29 < this.field4488) {
                                this.field4484[arg4][var30][var29] = this.field4484[arg4][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILei;[[BLdu;[[BIII[[B[ZILvc;II)V")
    private final void method2015(int arg0, class354 arg1, byte[][] arg2, class261 arg3, byte[][] arg4, int arg5, int arg6, int arg7, byte[][] arg8, boolean[] arg9, int arg10, class89 arg11, int arg12, int arg13) {
        field4476++;
        if (arg3 != null && arg1 != null || arg1 != null && arg13 == 12 || arg3 != null && arg13 == 0) {
            boolean[] var15 = arg3 != null && arg3.field3743 ? class181.field2738[arg13] : class39.field533[arg13];
            if (arg7 > 0) {
                if (arg0 > 0) {
                    int var16 = arg8[arg0 - 1][arg7 - 1] & 0xFF;
                    if (var16 > 0) {
                        class261 var17 = this.field4491.method158(var16 - 1, true);
                        if (var17.field3758 != -1 && var17.field3743) {
                            byte var18 = arg4[arg0 - 1][arg7 - 1];
                            int var19 = arg2[arg0 - 1][arg7 - 1] * 2 + 4 & 0x7;
                            int var20 = class20.method146(var17, arg11, -1);
                            if (class412.field5650[var18][var19]) {
                                class385.field5277[0] = var17.field3758;
                                class486.field6875[0] = var20;
                                class347.field4789[0] = arg11.method452() ? var17.field3751 : var17.field3752;
                                class450.field6407[0] = var17.field3756;
                                class419.field5820[0] = var17.field3742;
                                class219.field3178[0] = 256;
                            }
                        }
                    }
                }
                if (arg0 < arg12 - 1) {
                    int var21 = arg8[arg0 + 1][arg7 - 1] & 0xFF;
                    if (var21 > 0) {
                        class261 var22 = this.field4491.method158(var21 - 1, true);
                        if (var22.field3758 != -1 && var22.field3743) {
                            byte var23 = arg4[arg0 + 1][arg7 - 1];
                            int var24 = arg2[arg0 + 1][arg7 - 1] * 2 + 6 & 0x7;
                            int var25 = class20.method146(var22, arg11, -1);
                            if (class412.field5650[var23][var24]) {
                                class385.field5277[2] = var22.field3758;
                                class486.field6875[2] = var25;
                                class347.field4789[2] = arg11.method452() ? var22.field3751 : var22.field3752;
                                class450.field6407[2] = var22.field3756;
                                class419.field5820[2] = var22.field3742;
                                class219.field3178[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg7 < (arg10 - 1)) {
                if (arg0 > 0) {
                    int var26 = arg8[arg0 - 1][arg7 + 1] & 0xFF;
                    if (var26 > 0) {
                        class261 var27 = this.field4491.method158(var26 - 1, true);
                        if (var27.field3758 != -1 && var27.field3743) {
                            byte var28 = arg4[arg0 - 1][arg7 + 1];
                            int var29 = arg2[arg0 - 1][arg7 + 1] * 2 + 2 & 0x7;
                            int var30 = class20.method146(var27, arg11, -1);
                            if (class412.field5650[var28][var29]) {
                                class385.field5277[6] = var27.field3758;
                                class486.field6875[6] = var30;
                                class347.field4789[6] = arg11.method452() ? var27.field3751 : var27.field3752;
                                class450.field6407[6] = var27.field3756;
                                class419.field5820[6] = var27.field3742;
                                class219.field3178[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 - 1 > arg0) {
                    int var31 = arg8[arg0 + 1][arg7 + 1] & 0xFF;
                    if (var31 > 0) {
                        class261 var32 = this.field4491.method158(var31 - 1, true);
                        if (var32.field3758 != -1 && var32.field3743) {
                            byte var33 = arg4[arg0 + 1][arg7 + 1];
                            int var34 = -(-(arg2[arg0 + 1][arg7 + 1] * 2)) & 0x7;
                            int var35 = class20.method146(var32, arg11, -1);
                            if (class412.field5650[var33][var34]) {
                                class385.field5277[4] = var32.field3758;
                                class486.field6875[4] = var35;
                                class347.field4789[4] = arg11.method452() ? var32.field3751 : var32.field3752;
                                class450.field6407[4] = var32.field3756;
                                class419.field5820[4] = var32.field3742;
                                class219.field3178[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg7 > 0) {
                int var36 = arg8[arg0][arg7 - 1] & 0xFF;
                if (var36 > 0) {
                    class261 var37 = this.field4491.method158(var36 - 1, true);
                    if (var37.field3758 != -1) {
                        byte var38 = arg4[arg0][arg7 - 1];
                        byte var39 = arg2[arg0][arg7 - 1];
                        if (var37.field3743) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class20.method146(var37, arg11, -1);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class412.field5650[var38][var41] && var37.field3742 >= class419.field5820[var40]) {
                                    class385.field5277[var40] = var37.field3758;
                                    class486.field6875[var40] = var42;
                                    class347.field4789[var40] = arg11.method452() ? var37.field3751 : var37.field3752;
                                    class450.field6407[var40] = var37.field3756;
                                    if (class419.field5820[var40] == var37.field3742) {
                                        class219.field3178[var40] = class142.method1024(class219.field3178[var40], 32);
                                    } else {
                                        class219.field3178[var40] = 32;
                                    }
                                    class419.field5820[var40] = var37.field3742;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg6 & 0x3]) {
                                arg9[0] = class181.field2738[var38][class88.method739(var39 + 2, 3)];
                            }
                        } else if (!var15[-(-arg6) & 0x3]) {
                            arg9[0] = class39.field533[var38][class88.method739(var39 + 2, 3)];
                        }
                    }
                }
            }
            if (arg7 < arg10 - 1) {
                int var44 = arg8[arg0][arg7 + 1] & 0xFF;
                if (var44 > 0) {
                    class261 var45 = this.field4491.method158(var44 - 1, true);
                    if (var45.field3758 != -1) {
                        byte var46 = arg4[arg0][arg7 + 1];
                        byte var47 = arg2[arg0][arg7 + 1];
                        if (var45.field3743) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class20.method146(var45, arg11, -1);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class412.field5650[var46][var49] && class419.field5820[var48] <= var45.field3742) {
                                    class385.field5277[var48] = var45.field3758;
                                    class486.field6875[var48] = var50;
                                    class347.field4789[var48] = arg11.method452() ? var45.field3751 : var45.field3752;
                                    class450.field6407[var48] = var45.field3756;
                                    if (class419.field5820[var48] == var45.field3742) {
                                        class219.field3178[var48] = class142.method1024(class219.field3178[var48], 16);
                                    } else {
                                        class219.field3178[var48] = 16;
                                    }
                                    class419.field5820[var48] = var45.field3742;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg6 + 2 & 0x3]) {
                                arg9[2] = class181.field2738[var46][class88.method739(var47, 3)];
                            }
                        } else if (!var15[arg6 + 2 & 0x3]) {
                            arg9[2] = class39.field533[var46][class88.method739(var47, 3)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var52 = arg8[arg0 - 1][arg7] & 0xFF;
                if (var52 > 0) {
                    class261 var53 = this.field4491.method158(var52 - 1, true);
                    if (var53.field3758 != -1) {
                        byte var54 = arg4[arg0 - 1][arg7];
                        byte var55 = arg2[arg0 - 1][arg7];
                        if (var53.field3743) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class20.method146(var53, arg11, -1);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class412.field5650[var54][var57] && var53.field3742 >= class419.field5820[var56]) {
                                    class385.field5277[var56] = var53.field3758;
                                    class486.field6875[var56] = var58;
                                    class347.field4789[var56] = arg11.method452() ? var53.field3751 : var53.field3752;
                                    class450.field6407[var56] = var53.field3756;
                                    if (class419.field5820[var56] == var53.field3742) {
                                        class219.field3178[var56] = class142.method1024(class219.field3178[var56], 8);
                                    } else {
                                        class219.field3178[var56] = 8;
                                    }
                                    class419.field5820[var56] = var53.field3742;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg6 + 3 & 0x3]) {
                                arg9[3] = class181.field2738[var54][class88.method739(var55 + 1, 3)];
                            }
                        } else if (!var15[arg6 + 3 & 0x3]) {
                            arg9[3] = class39.field533[var54][class88.method739(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg0 < arg12 - 1) {
                int var60 = arg8[arg0 + 1][arg7] & 0xFF;
                if (var60 > 0) {
                    class261 var61 = this.field4491.method158(var60 - 1, true);
                    if (var61.field3758 != -1) {
                        byte var62 = arg4[arg0 + 1][arg7];
                        byte var63 = arg2[arg0 + 1][arg7];
                        if (var61.field3743) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class20.method146(var61, arg11, -1);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class412.field5650[var62][var65] && class419.field5820[var64] <= var61.field3742) {
                                    class385.field5277[var64] = var61.field3758;
                                    class486.field6875[var64] = var66;
                                    class347.field4789[var64] = arg11.method452() ? var61.field3751 : var61.field3752;
                                    class450.field6407[var64] = var61.field3756;
                                    if (class419.field5820[var64] == var61.field3742) {
                                        class219.field3178[var64] = class142.method1024(class219.field3178[var64], 4);
                                    } else {
                                        class219.field3178[var64] = 4;
                                    }
                                    class419.field5820[var64] = var61.field3742;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg6 + 1 & 0x3]) {
                                arg9[1] = class181.field2738[var62][class88.method739(3, var63 + 3)];
                            }
                        } else if (!var15[arg6 + 1 & 0x3]) {
                            arg9[1] = class39.field533[var62][class88.method739(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg5 != 1 || arg3 == null) {
            return;
        }
        int var68 = class20.method146(arg3, arg11, -1);
        if (!arg3.field3743) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg6 * 2) & 0x7;
            if (class412.field5650[arg13][var69] && class419.field5820[var70] <= arg3.field3742) {
                class385.field5277[var70] = arg3.field3758;
                class486.field6875[var70] = var68;
                class347.field4789[var70] = arg11.method452() ? arg3.field3751 : arg3.field3752;
                class450.field6407[var70] = arg3.field3756;
                if (class419.field5820[var70] == arg3.field3742) {
                    class219.field3178[var70] = class142.method1024(class219.field3178[var70], 2);
                } else {
                    class219.field3178[var70] = 2;
                }
                class419.field5820[var70] = arg3.field3742;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIILkk;BIII)V")
    private final void method2016(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class161 arg6, byte arg7, int arg8, int arg9, int arg10) {
        if (arg5 == 1) {
            arg9 = 1;
        } else if (arg5 == 2) {
            arg1 = 1;
            arg9 = 1;
        } else if (arg5 == 3) {
            arg1 = 1;
        }
        field4483++;
        if (arg8 >= 0 && arg8 < this.field4465 && arg0 >= 0 && arg0 < this.field4488) {
            if (!this.field4478 && !arg3) {
                class372.field5120[arg4][arg8][arg0] = 0;
            }
            while (true) {
                int var12 = arg6.method1172((byte) -128);
                if (var12 == 0) {
                    if (this.field4478) {
                        this.field4484[0][arg8 + arg1][arg0 + arg9] = 0;
                    } else if (arg4 == 0) {
                        this.field4484[0][arg1 + arg8][arg0 + arg9] = -class59.method528(arg2 + 932731, (byte) 116, arg10 + 556238) * 8;
                    } else {
                        this.field4484[arg4][arg1 + arg8][arg0 + arg9] = this.field4484[arg4 - 1][arg1 + arg8][arg0 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg6.method1172((byte) 72);
                    if (this.field4478) {
                        this.field4484[0][arg1 + arg8][arg0 + arg9] = var13 * 8;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg4 == 0) {
                            this.field4484[0][arg1 + arg8][arg0 + arg9] = -var13 * 8;
                        } else {
                            this.field4484[arg4][arg1 + arg8][arg0 + arg9] = this.field4484[arg4 - 1][arg8 + arg1][arg0 + arg9] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg3) {
                        arg6.method1172((byte) -19);
                    } else {
                        this.field4479[arg4][arg8][arg0] = arg6.method1152(-1910700904);
                        this.field4471[arg4][arg8][arg0] = (byte) ((var12 - 2) / 4);
                        this.field4468[arg4][arg8][arg0] = (byte) class88.method739(arg5 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field4478 && !arg3) {
                        class372.field5120[arg4][arg8][arg0] = (byte) (var12 - 49);
                    }
                } else if (!arg3) {
                    this.field4466[arg4][arg8][arg0] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg6.method1172((byte) -7);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg6.method1172((byte) -125);
                    break;
                }
                if (var14 <= 49) {
                    arg6.method1172((byte) -109);
                }
            }
        }
        if (arg7 != 60) {
            this.field4491 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILij;)V")
    private static final void method2017(int arg0, class241 arg1) {
        class340.field4692[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lij;Lij;Lij;[[ILvc;II)V")
    private final void method2018(class241 arg0, class241 arg1, class241 arg2, int[][] arg3, class89 arg4, int arg5, int arg6) {
        if (arg6 != -13581) {
            return;
        }
        for (int var8 = 0; var8 < this.field4465; var8++) {
            for (int var9 = 0; var9 < this.field4488; var9++) {
                if (class442.field6292 == -1 || class190.method1339(0, var9, class442.field6292, arg5, var8)) {
                    byte var10 = this.field4471[arg5][var8][var9];
                    byte var11 = this.field4468[arg5][var8][var9];
                    int var12 = this.field4479[arg5][var8][var9] & 0xFF;
                    int var13 = this.field4466[arg5][var8][var9] & 0xFF;
                    class261 var14 = var12 == 0 ? null : this.field4491.method158(var12 - 1, true);
                    class354 var15 = var13 == 0 ? null : this.field4486.method1934(var13 - 1, (byte) 78);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class267.field3923[var10];
                        var16 = var15 == null ? 0 : class47.field712[var10];
                    } else if (var14 != null) {
                        var17 = class267.field3923[var10];
                    } else if (var15 != null) {
                        var16 = class267.field3923[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3758 == -1 && var14.field3741 == -1 && var14.field3751 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg4.method452() ? var14.field3751 : var14.field3752;
                            if (class398.field5461) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3756;
                                if (var14.field3758 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3758;
                                }
                                if (var14.field3741 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field3741;
                                }
                                var19++;
                            }
                            if (!this.field4478 && arg5 == 0) {
                                class93.method782(var8, var9, var14.field3738, var14.field3757 * 8, var14.field3759);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field4858;
                            if (class398.field5461) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field4868;
                                var20[var19] = arg3[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = class206.field3010.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg2 == null ? null : new int[var31];
                        int[] var35 = arg2 == null && arg1 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = class206.field3010[var36];
                            int var46 = class74.field1059[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class412.field5650[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg2.method590(var49, var50) - arg0.method590(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg2 != null && !class412.field5650[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method590(var51, var52) - arg2.method590(var51, var52);
                                } else if (arg1 != null && !class73.field1053[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg1.method590(var53, var54) - arg0.method590(var53, var54);
                                }
                            }
                        }
                        int var37 = arg0.method591(var8, var9);
                        int var38 = arg0.method591(var8 + 1, var9);
                        int var39 = arg0.method591(var8 + 1, var9 + 1);
                        int var40 = arg0.method591(var8, var9 + 1);
                        if (arg5 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3748) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field4487[arg5][var8][var9] = (byte) class142.method1024(this.field4487[arg5][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field4478) {
                            var42 = class46.method476(var8, var9);
                            var43 = class193.method1345(var8, var9);
                            var44 = class318.method2027(var8, var9);
                        }
                        arg0.method578(var8, var9, var32, var34, var33, var35, class117.field1621[var10], class238.field3490[var10], class293.field4142[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class143.method1028(arg5, var8, var9);
                    }
                }
            }
        }
        field4469++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIZ)Laa;")
    public static final class48 method2019(byte arg0, int arg1, boolean arg2) {
        field4467++;
        long var3 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg1);
        if (arg0 != -109) {
            method2012(73, 9, -84, 49, 0.32830766F, -17, false, 87);
        }
        return (class48) class389.field5383.method1104(-128, var3);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method2020(byte arg0) {
        field4481++;
        for (int var1 = 0; var1 < class372.field5120.length; var1++) {
            for (int var2 = 0; var2 < class372.field5120[0].length; var2++) {
                for (int var3 = 0; var3 < class372.field5120[0][0].length; var3++) {
                    class372.field5120[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 != 83) {
            field4463 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public final void method2021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4464++;
        int var6 = 2 % ((arg0 - 15) / 39);
        for (int var7 = 0; var7 < this.field4474; var7++) {
            this.method2011(arg4, 125, arg3, arg2, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method2022(int arg0) {
        field4477 = null;
        field4463 = null;
        field4492 = null;
        if (arg0 <= 53) {
            field4463 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[Lpf;Lvc;[[[I)V")
    public final void method2023(byte arg0, class18[] arg1, class89 arg2, int[][][] arg3) {
        field4490++;
        if (!this.field4478) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field4465; var6++) {
                    for (int var7 = 0; var7 < this.field4488; var7++) {
                        if ((class372.field5120[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class372.field5120[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method125((byte) -78, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        int var9 = -18 / ((48 - arg0) / 32);
        for (int var10 = 0; var10 < this.field4474; var10++) {
            int var11 = 0;
            int var12 = 0;
            if (!this.field4478) {
                if (class361.field4977) {
                    var12 |= 0x8;
                }
                if (class392.field5411) {
                    var11 |= 0x2;
                }
                if (class37.field402 != 0) {
                    var11 |= 0x1;
                    if (class414.field5685 | var10 == 0) {
                        var12 |= 0x10;
                    }
                }
            }
            if (class392.field5411) {
                var12 |= 0x7;
            }
            int[][] var13 = arg3 == null || var10 >= arg3.length ? this.field4484[var10] : arg3[var10];
            method2017(var10, arg2.method456(this.field4465, this.field4488, this.field4484[var10], var13, 128, var11, var12));
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIZLaf;Ldi;)V")
    public class317(int arg0, int arg1, int arg2, boolean arg3, class22 arg4, class300 arg5) {
        this.field4491 = arg4;
        this.field4488 = arg2;
        this.field4474 = arg0;
        this.field4478 = arg3;
        this.field4486 = arg5;
        this.field4465 = arg1;
        this.field4479 = new byte[this.field4474][this.field4465][this.field4488];
        this.field4468 = new byte[this.field4474][this.field4465][this.field4488];
        this.field4487 = new byte[this.field4474][this.field4465 + 1][this.field4488 + 1];
        this.field4466 = new byte[this.field4474][this.field4465][this.field4488];
        this.field4484 = new int[this.field4474][this.field4465 + 1][this.field4488 + 1];
        this.field4471 = new byte[this.field4474][this.field4465][this.field4488];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lij;Lij;BLvc;)V")
    public final void method2024(class241 arg0, class241 arg1, byte arg2, class89 arg3) {
        field4475++;
        if (class54.field803 == null || class54.field803.length != this.field4488) {
            class54.field803 = new int[this.field4488];
            class266.field3833 = new int[this.field4488];
            class388.field5324 = new int[this.field4488];
            class142.field1979 = new int[this.field4488];
            class103.field1437 = new int[this.field4488];
        }
        int[][] var5 = new int[this.field4465][this.field4488];
        if (arg2 < 90) {
            this.method2010((int[][]) null, -98, 51);
        }
        for (int var6 = 0; var6 < this.field4474; var6++) {
            for (int var8 = 0; var8 < this.field4488; var8++) {
                class54.field803[var8] = 0;
                class103.field1437[var8] = 0;
                class142.field1979[var8] = 0;
                class388.field5324[var8] = 0;
                class266.field3833[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field4465; var9++) {
                for (int var10 = 0; var10 < this.field4488; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field4465) {
                        int var20 = this.field4466[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class354 var21 = this.field4486.method1934(var20 - 1, (byte) 81);
                            class54.field803[var10] += var21.field4869;
                            class103.field1437[var10] += var21.field4870;
                            class142.field1979[var10] += var21.field4861;
                            class388.field5324[var10] += var21.field4860;
                            var10002 = class266.field3833[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field4466[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class354 var24 = this.field4486.method1934(var23 - 1, (byte) 109);
                            class54.field803[var10] -= var24.field4869;
                            class103.field1437[var10] -= var24.field4870;
                            class142.field1979[var10] -= var24.field4861;
                            class388.field5324[var10] -= var24.field4860;
                            var10002 = class266.field3833[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field4488; var16++) {
                        int var17 = var16 + 5;
                        if (this.field4488 > var17) {
                            var12 += class103.field1437[var17];
                            var14 += class388.field5324[var17];
                            var11 += class54.field803[var17];
                            var15 += class266.field3833[var17];
                            var13 += class142.field1979[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class103.field1437[var18];
                            var14 -= class388.field5324[var18];
                            var11 -= class54.field803[var18];
                            var15 -= class266.field3833[var18];
                            var13 -= class142.field1979[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class82.method701(-19925, var13 / var15, var12 / var15, var11 * 256 / var14);
                        }
                    }
                }
            }
            if (class414.field5686) {
                this.method2009(class340.field4692[var6], var6 == 0 ? arg0 : null, var5, arg3, 5, var6 == 0 ? arg1 : null, var6);
            } else {
                this.method2018(class340.field4692[var6], var6 == 0 ? arg1 : null, var6 == 0 ? arg0 : null, var5, arg3, var6, -13581);
            }
            this.field4466[var6] = null;
            this.field4479[var6] = null;
            this.field4471[var6] = null;
            this.field4468[var6] = null;
        }
        if (!this.field4478) {
            if (class37.field402 != 0) {
                class212.method1442();
            }
            if (class392.field5411) {
                client.method535();
            }
        }
        for (int var7 = 0; var7 < this.field4474; var7++) {
            class340.field4692[var7].method580();
        }
    }
}
