import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class36 {

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
    private int[] field442 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "[I")
    private int[] field460 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lnba;")
    private class78 field461;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Z")
    public boolean field458;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lnn;")
    private class655 field444;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[[[B")
    public byte[][][] field445;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "[[[B")
    private byte[][][] field436;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "[[[B")
    private byte[][][] field452;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[[[B")
    private byte[][][] field432;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[[[B")
    private byte[][][] field434;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "[[[I")
    public int[][][] field456;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field465 = new String[] { method375(method374("NJUG\b")), method375(method374("NJUX\b")), method375(method374("QV\u0017{")), method375(method374("D\rU9]")), method375(method374("NJUB\b")), method375(method374("NJUE\b")), method375(method374("NJUZ\b")), method375(method374("NJU+IQJ\u000f)\b")), method375(method374("NJUF\b")), method375(method374("NJU@\b")), method375(method374("NJU[\b")), method375(method374("NJUY\b")), method375(method374("NJUD\b")), method375(method374("NJUA\b")), method375(method374("NJUC\b")) };

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lcb;")
    public static class700 field443 = new class700();

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lmv;")
    public static class125 field462 = new class125(70, 3);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field464 = 2;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Lcu;")
    public static class66 field446;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "Ljava/lang/String;")
    public static String field463;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[[[B")
    public byte[][][] field447;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBI)V")
    public final void method362(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field437++;
            int var6 = 0;
            if (arg3 != -96) {
                this.field455 = -40;
            }
            while (var6 < this.field440) {
                this.method369(arg2, var6, arg0, arg1, -1, arg4);
                var6++;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field465[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Z[[BILfn;[[BLha;IIILnga;[[BIII)V")
    private final void method363(boolean[] arg0, byte[][] arg1, int arg2, class97 arg3, byte[][] arg4, class18 arg5, int arg6, int arg7, int arg8, class461 arg9, byte[][] arg10, int arg11, int arg12, int arg13) {
        try {
            if (arg13 > 23) {
                field459++;
                boolean[] var15 = arg9 != null && arg9.field6733 ? class292.field4115[arg12] : class737.field10499[arg12];
                if (arg7 > 0) {
                    if (arg6 > 0) {
                        int var16 = arg10[arg6 - 1][arg7 - 1] & 0xFF;
                        if (var16 > 0) {
                            class461 var17 = this.field461.method783(var16 - 1, (byte) 97);
                            if (var17.field6726 != -1 && var17.field6733) {
                                byte var18 = arg1[arg6 - 1][arg7 - 1];
                                int var19 = arg4[arg6 - 1][arg7 - 1] * 2 + 4 & 0x7;
                                int var20 = class126.method1123(arg5, var17, (byte) -12);
                                if (class108.field1421[var18][var19]) {
                                    class124.field1561[0] = var17.field6726;
                                    class682.field9573[0] = var20;
                                    class518.field7580[0] = var17.field6728;
                                    class627.field8947[0] = var17.field6727;
                                    class52.field732[0] = var17.field6725;
                                    class758.field10831[0] = 256;
                                }
                            }
                        }
                    }
                    if (arg8 - 1 > arg6) {
                        int var21 = arg10[arg6 + 1][arg7 - 1] & 0xFF;
                        if (var21 > 0) {
                            class461 var22 = this.field461.method783(var21 - 1, (byte) 97);
                            if (var22.field6726 != -1 && var22.field6733) {
                                byte var23 = arg1[arg6 + 1][arg7 - 1];
                                int var24 = arg4[arg6 + 1][arg7 - 1] * 2 + 6 & 0x7;
                                int var25 = class126.method1123(arg5, var22, (byte) -12);
                                if (class108.field1421[var23][var24]) {
                                    class124.field1561[2] = var22.field6726;
                                    class682.field9573[2] = var25;
                                    class518.field7580[2] = var22.field6728;
                                    class627.field8947[2] = var22.field6727;
                                    class52.field732[2] = var22.field6725;
                                    class758.field10831[2] = 512;
                                }
                            }
                        }
                    }
                }
                if (arg7 < (arg2 - 1)) {
                    if (arg6 > 0) {
                        int var26 = arg10[arg6 - 1][arg7 + 1] & 0xFF;
                        if (var26 > 0) {
                            class461 var27 = this.field461.method783(var26 - 1, (byte) 97);
                            if (var27.field6726 != -1 && var27.field6733) {
                                byte var28 = arg1[arg6 - 1][arg7 + 1];
                                int var29 = arg4[arg6 - 1][arg7 + 1] * 2 + 2 & 0x7;
                                int var30 = class126.method1123(arg5, var27, (byte) -12);
                                if (class108.field1421[var28][var29]) {
                                    class124.field1561[6] = var27.field6726;
                                    class682.field9573[6] = var30;
                                    class518.field7580[6] = var27.field6728;
                                    class627.field8947[6] = var27.field6727;
                                    class52.field732[6] = var27.field6725;
                                    class758.field10831[6] = 64;
                                }
                            }
                        }
                    }
                    if ((arg8 - 1) > arg6) {
                        int var31 = arg10[arg6 + 1][arg7 + 1] & 0xFF;
                        if (var31 > 0) {
                            class461 var32 = this.field461.method783(var31 - 1, (byte) 97);
                            if (var32.field6726 != -1 && var32.field6733) {
                                byte var33 = arg1[arg6 + 1][arg7 + 1];
                                int var34 = arg4[arg6 + 1][arg7 + 1] * 2 & 0x7;
                                int var35 = class126.method1123(arg5, var32, (byte) -12);
                                if (class108.field1421[var33][var34]) {
                                    class124.field1561[4] = var32.field6726;
                                    class682.field9573[4] = var35;
                                    class518.field7580[4] = var32.field6728;
                                    class627.field8947[4] = var32.field6727;
                                    class52.field732[4] = var32.field6725;
                                    class758.field10831[4] = 128;
                                }
                            }
                        }
                    }
                }
                if (arg7 > 0) {
                    int var36 = arg10[arg6][arg7 - 1] & 0xFF;
                    if (var36 > 0) {
                        class461 var37 = this.field461.method783(var36 - 1, (byte) 97);
                        if (var37.field6726 != -1) {
                            byte var38 = arg1[arg6][arg7 - 1];
                            byte var39 = arg4[arg6][arg7 - 1];
                            if (var37.field6733) {
                                int var40 = 2;
                                int var41 = (var39 * 2) + 4;
                                int var42 = class126.method1123(arg5, var37, (byte) -12);
                                for (int var43 = 0; var43 < 3; var43++) {
                                    var40 &= 0x7;
                                    var41 &= 0x7;
                                    if (class108.field1421[var38][var41] && class52.field732[var40] <= var37.field6725) {
                                        class124.field1561[var40] = var37.field6726;
                                        class682.field9573[var40] = var42;
                                        class518.field7580[var40] = var37.field6728;
                                        class627.field8947[var40] = var37.field6727;
                                        if (class52.field732[var40] == var37.field6725) {
                                            class758.field10831[var40] = class10.method71(class758.field10831[var40], 32);
                                        } else {
                                            class758.field10831[var40] = 32;
                                        }
                                        class52.field732[var40] = var37.field6725;
                                    }
                                    var41++;
                                    var40--;
                                }
                                if (!var15[arg11 & 0x3]) {
                                    arg0[0] = class292.field4115[var38][class434.method3377(var39 + 2, 3)];
                                }
                            } else if (!var15[arg11 & 0x3]) {
                                arg0[0] = class737.field10499[var38][class434.method3377(3, var39 + 2)];
                            }
                        }
                    }
                }
                if ((arg2 - 1) > arg7) {
                    int var44 = arg10[arg6][arg7 + 1] & 0xFF;
                    if (var44 > 0) {
                        class461 var45 = this.field461.method783(var44 - 1, (byte) 97);
                        if (var45.field6726 != -1) {
                            byte var46 = arg1[arg6][arg7 + 1];
                            byte var47 = arg4[arg6][arg7 + 1];
                            if (var45.field6733) {
                                int var48 = 4;
                                int var49 = var47 * 2 + 2;
                                int var50 = class126.method1123(arg5, var45, (byte) -12);
                                for (int var51 = 0; var51 < 3; var51++) {
                                    var49 &= 0x7;
                                    var48 &= 0x7;
                                    if (class108.field1421[var46][var49] && var45.field6725 >= class52.field732[var48]) {
                                        class124.field1561[var48] = var45.field6726;
                                        class682.field9573[var48] = var50;
                                        class518.field7580[var48] = var45.field6728;
                                        class627.field8947[var48] = var45.field6727;
                                        if (class52.field732[var48] == var45.field6725) {
                                            class758.field10831[var48] = class10.method71(class758.field10831[var48], 16);
                                        } else {
                                            class758.field10831[var48] = 16;
                                        }
                                        class52.field732[var48] = var45.field6725;
                                    }
                                    var48++;
                                    var49--;
                                }
                                if (!var15[arg11 + 2 & 0x3]) {
                                    arg0[2] = class292.field4115[var46][class434.method3377(-(-var47), 3)];
                                }
                            } else if (!var15[arg11 + 2 & 0x3]) {
                                arg0[2] = class737.field10499[var46][class434.method3377(var47, 3)];
                            }
                        }
                    }
                }
                if (arg6 > 0) {
                    int var52 = arg10[arg6 - 1][arg7] & 0xFF;
                    if (var52 > 0) {
                        class461 var53 = this.field461.method783(var52 - 1, (byte) 97);
                        if (var53.field6726 != -1) {
                            byte var54 = arg1[arg6 - 1][arg7];
                            byte var55 = arg4[arg6 - 1][arg7];
                            if (var53.field6733) {
                                int var56 = 6;
                                int var57 = (var55 * 2) + 4;
                                int var58 = class126.method1123(arg5, var53, (byte) -12);
                                for (int var59 = 0; var59 < 3; var59++) {
                                    var56 &= 0x7;
                                    var57 &= 0x7;
                                    if (class108.field1421[var54][var57] && var53.field6725 >= class52.field732[var56]) {
                                        class124.field1561[var56] = var53.field6726;
                                        class682.field9573[var56] = var58;
                                        class518.field7580[var56] = var53.field6728;
                                        class627.field8947[var56] = var53.field6727;
                                        if (class52.field732[var56] == var53.field6725) {
                                            class758.field10831[var56] = class10.method71(class758.field10831[var56], 8);
                                        } else {
                                            class758.field10831[var56] = 8;
                                        }
                                        class52.field732[var56] = var53.field6725;
                                    }
                                    var56++;
                                    var57--;
                                }
                                if (!var15[arg11 + 3 & 0x3]) {
                                    arg0[3] = class292.field4115[var54][class434.method3377(var55 + 1, 3)];
                                }
                            } else if (!var15[arg11 + 3 & 0x3]) {
                                arg0[3] = class737.field10499[var54][class434.method3377(var55 + 1, 3)];
                            }
                        }
                    }
                }
                if (arg6 < (arg8 - 1)) {
                    int var60 = arg10[arg6 + 1][arg7] & 0xFF;
                    if (var60 > 0) {
                        class461 var61 = this.field461.method783(var60 - 1, (byte) 97);
                        if (var61.field6726 != -1) {
                            byte var62 = arg1[arg6 + 1][arg7];
                            byte var63 = arg4[arg6 + 1][arg7];
                            if (var61.field6733) {
                                int var64 = 4;
                                int var65 = var63 * 2 + 6;
                                int var66 = class126.method1123(arg5, var61, (byte) -12);
                                for (int var67 = 0; var67 < 3; var67++) {
                                    var65 &= 0x7;
                                    var64 &= 0x7;
                                    if (class108.field1421[var62][var65] && var61.field6725 >= class52.field732[var64]) {
                                        class124.field1561[var64] = var61.field6726;
                                        class682.field9573[var64] = var66;
                                        class518.field7580[var64] = var61.field6728;
                                        class627.field8947[var64] = var61.field6727;
                                        if (class52.field732[var64] == var61.field6725) {
                                            class758.field10831[var64] = class10.method71(class758.field10831[var64], 4);
                                        } else {
                                            class758.field10831[var64] = 4;
                                        }
                                        class52.field732[var64] = var61.field6725;
                                    }
                                    var64--;
                                    var65++;
                                }
                                if (!var15[arg11 + 1 & 0x3]) {
                                    arg0[1] = class292.field4115[var62][class434.method3377(var63 + 3, 3)];
                                }
                            } else if (!var15[arg11 + 1 & 0x3]) {
                                arg0[1] = class737.field10499[var62][class434.method3377(var63 + 3, 3)];
                            }
                        }
                    }
                }
                if (arg9 != null) {
                    int var68 = class126.method1123(arg5, arg9, (byte) -12);
                    if (arg9.field6733) {
                        for (int var69 = 0; var69 < 8; var69++) {
                            int var70 = var69 - arg11 * 2 & 0x7;
                            if (class108.field1421[arg12][var69] && class52.field732[var70] <= arg9.field6725) {
                                class124.field1561[var70] = arg9.field6726;
                                class682.field9573[var70] = var68;
                                class518.field7580[var70] = arg9.field6728;
                                class627.field8947[var70] = arg9.field6727;
                                if (class52.field732[var70] == arg9.field6725) {
                                    class758.field10831[var70] = class10.method71(class758.field10831[var70], 2);
                                } else {
                                    class758.field10831[var70] = 2;
                                }
                                class52.field732[var70] = arg9.field6725;
                            }
                        }
                        return;
                    }
                }
            }
        } catch (RuntimeException var72) {
            throw class665.method4799(var72, field465[12] + (arg0 == null ? field465[2] : field465[3]) + ',' + (arg1 == null ? field465[2] : field465[3]) + ',' + arg2 + ',' + (arg3 == null ? field465[2] : field465[3]) + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + (arg5 == null ? field465[2] : field465[3]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field465[2] : field465[3]) + ',' + (arg10 == null ? field465[2] : field465[3]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ls;ILs;Lha;)V")
    public final void method364(class751 arg0, int arg1, class751 arg2, class18 arg3) {
        try {
            field454++;
            int[][] var5 = new int[this.field453][this.field455];
            if (class560.field8150 == null || class560.field8150.length != this.field455) {
                class796.field11578 = new int[this.field455];
                class503.field7338 = new int[this.field455];
                class747.field10651 = new int[this.field455];
                class358.field5209 = new int[this.field455];
                class560.field8150 = new int[this.field455];
            }
            for (int var6 = 0; var6 < this.field440; var6++) {
                for (int var7 = 0; var7 < this.field455; var7++) {
                    class560.field8150[var7] = 0;
                    class796.field11578[var7] = 0;
                    class503.field7338[var7] = 0;
                    class747.field10651[var7] = 0;
                    class358.field5209[var7] = 0;
                }
                for (int var8 = -5; var8 < this.field453; var8++) {
                    for (int var9 = 0; var9 < this.field455; var9++) {
                        int var10 = var8 + 5;
                        int var10002;
                        if (var10 < this.field453) {
                            int var11 = this.field432[var6][var10][var9] & 0xFF;
                            if (var11 > 0) {
                                class97 var12 = this.field444.method4761(true, var11 - 1);
                                class560.field8150[var9] += var12.field1318;
                                class796.field11578[var9] += var12.field1312;
                                class503.field7338[var9] += var12.field1313;
                                class747.field10651[var9] += var12.field1311;
                                var10002 = class358.field5209[var9]++;
                            }
                        }
                        int var13 = var8 - 5;
                        if (var13 >= 0) {
                            int var14 = this.field432[var6][var13][var9] & 0xFF;
                            if (var14 > 0) {
                                class97 var15 = this.field444.method4761(true, var14 - 1);
                                class560.field8150[var9] -= var15.field1318;
                                class796.field11578[var9] -= var15.field1312;
                                class503.field7338[var9] -= var15.field1313;
                                class747.field10651[var9] -= var15.field1311;
                                var10002 = class358.field5209[var9]--;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        int var16 = 0;
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        int var20 = 0;
                        for (int var21 = -5; var21 < this.field455; var21++) {
                            int var22 = var21 + 5;
                            if (var22 < this.field455) {
                                var16 += class560.field8150[var22];
                                var18 += class503.field7338[var22];
                                var20 += class358.field5209[var22];
                                var19 += class747.field10651[var22];
                                var17 += class796.field11578[var22];
                            }
                            int var23 = var21 - 5;
                            if (var23 >= 0) {
                                var17 -= class796.field11578[var23];
                                var16 -= class560.field8150[var23];
                                var19 -= class747.field10651[var23];
                                var20 -= class358.field5209[var23];
                                var18 -= class503.field7338[var23];
                            }
                            if (var21 >= 0 && var19 > 0 && var20 > 0) {
                                var5[var8][var21] = class225.method1880(var18 / var20, var17 / var20, var16 * 256 / var19, (byte) 72);
                            }
                        }
                    }
                }
                if (class459.field6683) {
                    this.method372(var5, var6 == 0 ? arg0 : null, var6, arg3, class107.field1413[var6], 0, var6 == 0 ? arg2 : null);
                } else {
                    this.method366(var5, false, arg3, class107.field1413[var6], var6 == 0 ? arg2 : null, var6, var6 == 0 ? arg0 : null);
                }
                this.field432[var6] = null;
                this.field434[var6] = null;
                this.field452[var6] = null;
                this.field436[var6] = null;
            }
            if (!this.field458) {
                if (class577.field8358 != 0) {
                    class721.method5219();
                }
                if (class418.field6028) {
                    class449.method3472();
                }
            }
            for (int var24 = 0; var24 < this.field440; var24++) {
                class107.field1413[var24].method2469();
            }
            if (arg1 != -31047) {
                this.method363(null, null, 14, null, null, null, 27, 68, -5, null, null, 46, -100, -6);
            }
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field465[8] + (arg0 == null ? field465[2] : field465[3]) + ',' + arg1 + ',' + (arg2 == null ? field465[2] : field465[3]) + ',' + (arg3 == null ? field465[2] : field465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIILjc;II[Luda;II)V")
    public final void method365(int arg0, boolean arg1, int arg2, int arg3, class711 arg4, int arg5, int arg6, class302[] arg7, int arg8, int arg9) {
        try {
            field457++;
            int var11 = (arg5 & 0x7) * 8;
            int var12 = (arg2 & 0x7) * 8;
            if (!this.field458) {
                class302 var13 = arg7[arg8];
                for (int var14 = 0; var14 < 8; var14++) {
                    for (int var15 = 0; var15 < 8; var15++) {
                        int var16 = class152.method1293((byte) -110, var15 & 0x7, var14 & 0x7, arg9) + arg6;
                        int var17 = arg0 + class470.method3608(var14 & 0x7, var15 & 0x7, arg9, -122);
                        if (var16 > 0 && this.field453 - 1 > var16 && var17 > 0 && (this.field455 - 1) > var17) {
                            var13.method2425(0, var16, var17);
                        }
                    }
                }
            }
            int var18 = (arg5 & 0xFFFFFFF8) << 3;
            int var19 = (arg2 & 0xFFFFFFF8) << 3;
            byte var20 = 0;
            byte var21 = 0;
            if (arg9 == 1) {
                var21 = 1;
            } else if (arg9 == 2) {
                var21 = 1;
                var20 = 1;
            } else if (arg9 == 3) {
                var20 = 1;
            }
            int var22 = 0;
            if (arg1) {
                while (var22 < this.field440) {
                    for (int var23 = 0; var23 < 64; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            if (arg3 == var22 && var23 >= var11 && var23 <= var11 + 8 && var12 <= var24 && (var12 + 8) >= var24) {
                                int var25;
                                int var26;
                                if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                                    if (arg9 == 0) {
                                        var25 = var23 + arg6 - var11;
                                        var26 = var24 + arg0 - var12;
                                    } else if (arg9 == 1) {
                                        var26 = var11 + arg0 - (var23 - 8);
                                        var25 = var24 - (var12 - arg6);
                                    } else if (arg9 == 2) {
                                        var25 = var11 + arg6 + 8 - var23;
                                        var26 = var12 + (arg0 - -8) - var24;
                                    } else {
                                        var25 = arg6 + var12 + 8 - var24;
                                        var26 = arg0 - (var11 - var23);
                                    }
                                    this.method371(var25, true, 0, 0, arg8, 0, arg4, var19 + var24, 81, var18 + var23, var26);
                                } else {
                                    var25 = class152.method1293((byte) -97, var24 & 0x7, var23 & 0x7, arg9) + arg6;
                                    var26 = class470.method3608(var23 & 0x7, var24 & 0x7, arg9, -124) + arg0;
                                    this.method371(var25, false, var21, var20, arg8, arg9, arg4, var19 + var24, 81, var18 + var23, var26);
                                }
                                if (var23 == 63 || var24 == 63) {
                                    byte var27 = 1;
                                    if (var23 == 63 && var24 == 63) {
                                        var27 = 3;
                                    }
                                    for (int var28 = 0; var28 < var27; var28++) {
                                        int var29 = var23;
                                        int var30 = var24;
                                        if (var28 == 0) {
                                            var29 = var23 == 63 ? 64 : var23;
                                            var30 = var24 == 63 ? 64 : var24;
                                        } else if (var28 == 1) {
                                            var29 = 64;
                                        } else if (var28 == 2) {
                                            var30 = 64;
                                        }
                                        int var31;
                                        int var32;
                                        if (arg9 == 0) {
                                            var31 = var29 + arg6 - var11;
                                            var32 = arg0 - (var12 - var30);
                                        } else if (arg9 == 1) {
                                            var32 = -var29 - (-var11 - arg0 - 8);
                                            var31 = arg6 + var30 - var12;
                                        } else if (arg9 == 2) {
                                            var32 = arg0 + 8 - (var30 - var12);
                                            var31 = arg6 + var11 + 8 - var29;
                                        } else {
                                            var32 = arg0 - (var11 - var29);
                                            var31 = var12 + arg6 + 8 - var30;
                                        }
                                        if (var31 >= 0 && var31 < this.field453 && var32 >= 0 && this.field455 > var32) {
                                            this.field456[arg8][var31][var32] = this.field456[arg8][var20 + var25][var21 + var26];
                                        }
                                    }
                                }
                            } else {
                                this.method371(-1, false, 0, 0, 0, 0, arg4, 0, 81, 0, -1);
                            }
                        }
                    }
                    var22++;
                }
            }
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field465[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field465[2] : field465[3]) + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([[IZLha;Ls;Ls;ILs;)V")
    private final void method366(int[][] arg0, boolean arg1, class18 arg2, class751 arg3, class751 arg4, int arg5, class751 arg6) {
        try {
            for (int var8 = 0; var8 < this.field453; var8++) {
                for (int var9 = 0; var9 < this.field455; var9++) {
                    if (class599.field8601 == -1 || class676.method4844(var9, !arg1, var8, class599.field8601, arg5)) {
                        byte var10 = this.field452[arg5][var8][var9];
                        byte var11 = this.field436[arg5][var8][var9];
                        int var12 = this.field434[arg5][var8][var9] & 0xFF;
                        int var13 = this.field432[arg5][var8][var9] & 0xFF;
                        class461 var14 = var12 == 0 ? null : this.field461.method783(var12 - 1, (byte) 97);
                        if (var10 == 0 && var14 == null) {
                            var10 = 12;
                        }
                        class97 var15 = var13 == 0 ? null : this.field444.method4761(true, var13 - 1);
                        class461 var16 = var14;
                        if (var14 != null && var14.field6726 == -1 && var14.field6720 == -1) {
                            var16 = var14;
                            var14 = null;
                        }
                        if (var14 != null || var15 != null) {
                            int var17 = class222.field3218[var10];
                            int var18 = class768.field10974[var10];
                            int var19 = (var15 == null ? 0 : var17) + (var14 == null ? 0 : var18);
                            int var20 = 0;
                            int var21 = 0;
                            int var22 = var14 == null ? -1 : var14.field6728;
                            int var23 = var15 == null ? -1 : var15.field1314;
                            int[] var24 = new int[var19];
                            int[] var25 = new int[var19];
                            int[] var26 = new int[var19];
                            int[] var27 = new int[var19];
                            int[] var28 = new int[var19];
                            int[] var29 = new int[var19];
                            int[] var30 = var14 == null || var14.field6720 == -1 ? null : new int[var19];
                            if (var14 == null) {
                                var21 += var18;
                            } else {
                                for (int var31 = 0; var31 < var18; var31++) {
                                    var24[var20] = class701.field9805[var10][var21];
                                    var25[var20] = class772.field11003[var10][var21];
                                    var26[var20] = class558.field8124[var10][var21];
                                    var28[var20] = var22;
                                    var29[var20] = var14.field6727;
                                    var27[var20] = var14.field6726;
                                    if (var30 != null) {
                                        var30[var20] = var14.field6720;
                                    }
                                    var20++;
                                    var21++;
                                }
                                if (!this.field458 && arg5 == 0) {
                                    class21.method261(var8, var9, var14.field6718, var14.field6722 * 8, var14.field6731);
                                }
                            }
                            if (var15 != null) {
                                for (int var32 = 0; var32 < var17; var32++) {
                                    var24[var20] = class701.field9805[var10][var21];
                                    var25[var20] = class772.field11003[var10][var21];
                                    var26[var20] = class558.field8124[var10][var21];
                                    var28[var20] = var23;
                                    var29[var20] = var15.field1307;
                                    var27[var20] = arg0[var8][var9];
                                    if (var30 != null) {
                                        var30[var20] = var27[var20];
                                    }
                                    var21++;
                                    var20++;
                                }
                            }
                            int var33 = this.field460.length;
                            int[] var34 = new int[var33];
                            int[] var35 = new int[var33];
                            int[] var36 = arg6 == null ? null : new int[var33];
                            int[] var37 = arg6 == null && arg4 == null ? null : new int[var33];
                            for (int var38 = 0; var38 < var33; var38++) {
                                int var39 = this.field460[var38];
                                int var40 = this.field442[var38];
                                if (var11 == 0) {
                                    var34[var38] = var39;
                                    var35[var38] = var40;
                                } else if (var11 == 1) {
                                    var34[var38] = var40;
                                    var35[var38] = 512 - var39;
                                } else if (var11 == 2) {
                                    var34[var38] = 512 - var39;
                                    var35[var38] = 512 - var40;
                                } else if (var11 == 3) {
                                    var34[var38] = 512 - var40;
                                    var35[var38] = var39;
                                }
                                if (var36 != null && class108.field1421[var10][var38]) {
                                    int var43 = (var8 << 9) + var34[var38];
                                    int var44 = (var9 << 9) + var35[var38];
                                    var36[var38] = arg6.method5440((byte) 15, var43, var44) - arg3.method5440((byte) 15, var43, var44);
                                }
                                if (var37 != null) {
                                    if (arg6 != null && !class108.field1421[var10][var38]) {
                                        int var45 = (var8 << 9) + var34[var38];
                                        int var46 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg3.method5440((byte) 15, var45, var46) - arg6.method5440((byte) 15, var45, var46);
                                    } else if (arg4 != null && !class150.field1921[var10][var38]) {
                                        int var47 = (var8 << 9) + var34[var38];
                                        int var48 = (var9 << 9) + var35[var38];
                                        var37[var38] = arg4.method5440((byte) 15, var47, var48) - arg3.method5440((byte) 15, var47, var48);
                                    }
                                }
                            }
                            int var49 = arg3.method5442(var8, var9, 31844);
                            int var50 = arg3.method5442(var8 + 1, var9, 31844);
                            int var51 = arg3.method5442(var8 + 1, var9 + 1, 31844);
                            int var52 = arg3.method5442(var8, var9 + 1, 31844);
                            boolean var53 = class23.method275(1, var8, var9);
                            if (var53 && arg5 > 1 || !var53 && arg5 > 0) {
                                boolean var54 = true;
                                if (var15 != null && !var15.field1321) {
                                    var54 = false;
                                } else if (var13 == 0 && var10 != 0) {
                                    var54 = false;
                                } else if (var12 > 0 && var16 != null && !var16.field6732) {
                                    var54 = false;
                                }
                                if (var54 && var49 == var50 && var49 == var51 && var49 == var52) {
                                    this.field445[arg5][var8][var9] = (byte) class10.method71(this.field445[arg5][var8][var9], 4);
                                }
                            }
                            int var55 = 0;
                            int var56 = 0;
                            int var57 = 0;
                            if (this.field458) {
                                var55 = class667.method4805(var8, var9);
                                var56 = class496.method3816(var8, var9);
                                var57 = class429.method3333(var8, var9);
                            }
                            arg3.method2474(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var55, var56, var57, false);
                            class608.method4488(arg5, var8, var9);
                        }
                    }
                }
            }
            if (arg1) {
                this.field432 = null;
            }
            field450++;
        } catch (RuntimeException var59) {
            throw class665.method4799(var59, field465[6] + (arg0 == null ? field465[2] : field465[3]) + ',' + arg1 + ',' + (arg2 == null ? field465[2] : field465[3]) + ',' + (arg3 == null ? field465[2] : field465[3]) + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + arg5 + ',' + (arg6 == null ? field465[2] : field465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B[[II)V")
    public final void method367(byte arg0, int[][] arg1, int arg2) {
        try {
            field451++;
            int[][] var4 = this.field456[arg2];
            for (int var5 = 0; var5 < this.field453 + 1; var5++) {
                for (int var6 = 0; var6 < (this.field455 + 1); var6++) {
                    var4[var5][var6] += arg1[var5][var6];
                }
            }
            if (arg0 != -48) {
                this.method372(null, null, 34, null, null, -72, null);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field465[4] + arg0 + ',' + (arg1 == null ? field465[2] : field465[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljc;III[Luda;II)V")
    public final void method368(class711 arg0, int arg1, int arg2, int arg3, class302[] arg4, int arg5, int arg6) {
        try {
            if (!this.field458) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class302 var9 = arg4[var8];
                    for (int var10 = 0; var10 < 64; var10++) {
                        for (int var11 = 0; var11 < 64; var11++) {
                            int var12 = arg2 + var10;
                            int var13 = arg5 + var11;
                            if (var12 >= 0 && var12 < this.field453 && var13 >= 0 && this.field455 > var13) {
                                var9.method2425(0, var12, var13);
                            }
                        }
                    }
                }
            }
            field435++;
            int var14 = arg2 + arg3;
            int var15 = arg1 + arg5;
            for (int var16 = arg6; var16 < this.field440; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    for (int var18 = 0; var18 < 64; var18++) {
                        this.method371(arg2 + var17, false, 0, 0, var16, 0, arg0, var15 + var18, 81, var14 + var17, arg5 + var18);
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field465[10] + (arg0 == null ? field465[2] : field465[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
    public final void method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            for (int var7 = arg2; var7 < arg2 + arg0; var7++) {
                for (int var8 = arg3; var8 < arg3 + arg5; var8++) {
                    if (var8 >= 0 && var8 < this.field453 && var7 >= 0 && var7 < this.field455) {
                        this.field456[arg1][var8][var7] = arg1 <= 0 ? 0 : this.field456[arg1 - 1][var8][var7] - 960;
                    }
                }
            }
            field438++;
            if (arg3 > 0 && this.field453 > arg3) {
                for (int var9 = arg2 + 1; var9 < arg2 + arg0; var9++) {
                    if (var9 >= 0 && this.field455 > var9) {
                        this.field456[arg1][arg3][var9] = this.field456[arg1][arg3 - 1][var9];
                    }
                }
            }
            if (arg2 > 0 && this.field455 > arg2) {
                for (int var10 = arg3 + 1; var10 < arg3 + arg5; var10++) {
                    if (var10 >= 0 && var10 < this.field453) {
                        this.field456[arg1][var10][arg2] = this.field456[arg1][var10][arg2 - 1];
                    }
                }
            }
            if (~arg3 <= arg4 && arg2 >= 0 && arg3 < this.field453 && arg2 < this.field455) {
                if (arg1 == 0) {
                    if (arg3 > 0 && this.field456[arg1][arg3 - 1][arg2] != 0) {
                        this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3 - 1][arg2];
                        return;
                    }
                    if (arg2 > 0 && this.field456[arg1][arg3][arg2 - 1] != 0) {
                        this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3][arg2 - 1];
                        return;
                    }
                    if (arg3 > 0 && arg2 > 0 && this.field456[arg1][arg3 - 1][arg2 - 1] != 0) {
                        this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3 - 1][arg2 - 1];
                        return;
                    }
                    return;
                }
                if (arg3 > 0 && this.field456[arg1 - 1][arg3 - 1][arg2] != this.field456[arg1][arg3 - 1][arg2]) {
                    this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3 - 1][arg2];
                    return;
                }
                if (arg2 > 0 && this.field456[arg1][arg3][arg2 - 1] != this.field456[arg1 - 1][arg3][arg2 - 1]) {
                    this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3][arg2 - 1];
                    return;
                }
                if (arg3 > 0 && arg2 > 0 && this.field456[arg1 - 1][arg3 - 1][arg2 - 1] != this.field456[arg1][arg3 - 1][arg2 - 1]) {
                    this.field456[arg1][arg3][arg2] = this.field456[arg1][arg3 - 1][arg2 - 1];
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field465[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([Luda;Lha;B[[[I)V")
    public final void method370(class302[] arg0, class18 arg1, byte arg2, int[][][] arg3) {
        try {
            if (!this.field458) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 0; var6 < this.field453; var6++) {
                        for (int var7 = 0; var7 < this.field455; var7++) {
                            if ((class76.field1089[var5][var6][var7] & 0x1) != 0) {
                                int var8 = var5;
                                if ((class76.field1089[1][var6][var7] & 0x2) != 0) {
                                    var8 = var5 - 1;
                                }
                                if (var8 >= 0) {
                                    arg0[var8].method2419((byte) 71, var6, var7);
                                }
                            }
                        }
                    }
                }
            }
            field441++;
            if (arg2 == -8) {
                for (int var9 = 0; var9 < this.field440; var9++) {
                    int var10 = 0;
                    int var11 = 0;
                    if (!this.field458) {
                        if (class418.field6028) {
                            var10 |= 0x2;
                        }
                        if (class375.field5481) {
                            var11 |= 0x8;
                        }
                        if (class577.field8358 != 0) {
                            if (var9 == 0 | class113.field1459) {
                                var11 |= 0x10;
                            }
                            var10 |= 0x1;
                        }
                    }
                    if (class418.field6028) {
                        var11 |= 0x7;
                    }
                    if (!class297.field4147) {
                        var11 |= 0x20;
                    }
                    int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field456[var9] : arg3[var9];
                    class376.method2979(var9, arg1.method206(this.field453, this.field455, this.field456[var9], var12, 512, var10, var11));
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field465[1] + (arg0 == null ? field465[2] : field465[3]) + ',' + (arg1 == null ? field465[2] : field465[3]) + ',' + arg2 + ',' + (arg3 == null ? field465[2] : field465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIIIILjc;IIII)V")
    private final void method371(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class711 arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            if (arg8 != 81) {
                method373(123);
            }
            field449++;
            if (arg5 == 1) {
                arg2 = 1;
            } else if (arg5 == 2) {
                arg2 = 1;
                arg3 = 1;
            } else if (arg5 == 3) {
                arg3 = 1;
            }
            if (arg0 >= 0 && this.field453 > arg0 && arg10 >= 0 && arg10 < this.field455) {
                if (!this.field458 && !arg1) {
                    class76.field1089[arg4][arg0][arg10] = 0;
                }
                while (true) {
                    int var12 = arg6.method5128(arg8 ^ 0x51);
                    if (var12 == 0) {
                        if (this.field458) {
                            this.field456[0][arg0 + arg3][arg10 + arg2] = 0;
                            return;
                        } else if (arg4 == 0) {
                            this.field456[0][arg0 + arg3][arg2 + arg10] = -class748.method5418(arg7 + 556238, arg9 + 932731, (byte) 17) * 8 << 2;
                            return;
                        } else {
                            this.field456[arg4][arg0 + arg3][arg10 + arg2] = this.field456[arg4 - 1][arg0 + arg3][arg10 + arg2] - 960;
                            return;
                        }
                    }
                    if (var12 == 1) {
                        int var13 = arg6.method5128(0);
                        if (!this.field458) {
                            if (var13 == 1) {
                                var13 = 0;
                            }
                            if (arg4 != 0) {
                                this.field456[arg4][arg0 + arg3][arg2 + arg10] = this.field456[arg4 - 1][arg0 + arg3][arg10 + arg2] - (var13 * 8 << 2);
                                return;
                            }
                            this.field456[0][arg0 + arg3][arg2 + arg10] = -var13 * 8 << 2;
                            return;
                        }
                        this.field456[0][arg0 + arg3][arg10 + arg2] = var13 * 8 << 2;
                        return;
                    }
                    if (var12 <= 49) {
                        if (arg1) {
                            arg6.method5128(0);
                        } else {
                            this.field434[arg4][arg0][arg10] = arg6.method5125((byte) -79);
                            this.field452[arg4][arg0][arg10] = (byte) ((var12 - 2) / 4);
                            this.field436[arg4][arg0][arg10] = (byte) class434.method3377(3, arg5 + var12 - 2);
                        }
                    } else if (var12 <= 81) {
                        if (!this.field458 && !arg1) {
                            class76.field1089[arg4][arg0][arg10] = (byte) (var12 - 49);
                        }
                    } else if (!arg1) {
                        this.field432[arg4][arg0][arg10] = (byte) (var12 - 81);
                    }
                }
            } else {
                while (true) {
                    int var14 = arg6.method5128(0);
                    if (var14 == 0) {
                        return;
                    }
                    if (var14 == 1) {
                        arg6.method5128(arg8 - 81);
                        return;
                    }
                    if (var14 <= 49) {
                        arg6.method5128(0);
                    }
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field465[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field465[2] : field465[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([[ILs;ILha;Ls;ILs;)V")
    private final void method372(int[][] arg0, class751 arg1, int arg2, class18 arg3, class751 arg4, int arg5, class751 arg6) {
        try {
            field448++;
            byte[][] var8 = this.field452[arg2];
            byte[][] var9 = this.field436[arg2];
            byte[][] var10 = this.field432[arg2];
            byte[][] var11 = this.field434[arg2];
            for (int var12 = arg5; var12 < this.field453; var12++) {
                int var13 = this.field453 - 1 > var12 ? var12 + 1 : var12;
                for (int var14 = 0; var14 < this.field455; var14++) {
                    int var15 = var14 < this.field455 - 1 ? var14 + 1 : var14;
                    if (class599.field8601 == -1 || class676.method4844(var14, true, var12, class599.field8601, arg2)) {
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
                            class461 var26 = var21 == 0 ? null : this.field461.method783(var21 - 1, (byte) 97);
                            if (var19 == 0 && var26 == null) {
                                var19 = 12;
                            }
                            class97 var27 = var22 == 0 ? null : this.field444.method4761(true, var22 - 1);
                            class461 var28 = var26;
                            if (var26 != null) {
                                if (var26.field6726 == -1 && var26.field6720 == -1) {
                                    var28 = var26;
                                    var26 = null;
                                } else if (var27 != null && var19 != 0) {
                                    var17 = var26.field6733;
                                }
                            }
                            if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field453 > var12 && var14 < this.field455) {
                                byte var29 = 0;
                                byte var30 = 0;
                                byte var31 = 0;
                                byte var32 = 0;
                                int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                                int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                                int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                                int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                                if (var10[var12][var14 - 1] == var22) {
                                    var33++;
                                    var35++;
                                } else {
                                    var33--;
                                    var35--;
                                }
                                if (var10[var13][var14] == var22) {
                                    var33++;
                                    var34++;
                                } else {
                                    var34--;
                                    var33--;
                                }
                                if (var10[var12][var15] == var22) {
                                    var36++;
                                    var34++;
                                } else {
                                    var34--;
                                    var36--;
                                }
                                if (var10[var12 - 1][var14] == var22) {
                                    var35++;
                                    var36++;
                                } else {
                                    var36--;
                                    var35--;
                                }
                                int var37 = var35 - var34;
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                int var38 = var33 - var36;
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var37 == var38) {
                                    var37 = arg4.method5442(var12, var14, 31844) - arg4.method5442(var13, var15, 31844);
                                    if (var37 < 0) {
                                        var37 = -var37;
                                    }
                                    var38 = arg4.method5442(var13, var14, 31844) - arg4.method5442(var12, var15, 31844);
                                    if (var38 < 0) {
                                        var38 = -var38;
                                    }
                                }
                                var20 = var37 >= var38 ? 0 : 1;
                            }
                            for (int var39 = 0; var39 < 13; var39++) {
                                class52.field732[var39] = -1;
                                class758.field10831[var39] = 1;
                            }
                            boolean[] var40 = var26 != null && var26.field6733 ? class292.field4115[var19] : class737.field10499[var19];
                            this.method363(var18, var8, this.field455, var27, var9, arg3, var12, var14, this.field453, var26, var11, var20, var19, 101);
                            boolean var41 = var26 != null && var26.field6726 != var26.field6720;
                            if (!var41) {
                                for (int var42 = 0; var42 < 8; var42++) {
                                    if (class52.field732[var42] >= 0 && class682.field9573[var42] != class124.field1561[var42]) {
                                        var41 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var40[var20 + 1 & 0x3]) {
                                var18[1] = class305.method2448(var18[1], class434.method3377(class758.field10831[2], class758.field10831[4]) == 0);
                            }
                            if (!var40[var20 + 3 & 0x3]) {
                                var18[3] = class305.method2448(var18[3], class434.method3377(class758.field10831[6], class758.field10831[0]) == 0);
                            }
                            if (!var40[var20 & 0x3]) {
                                var18[0] = class305.method2448(var18[0], class434.method3377(class758.field10831[2], class758.field10831[0]) == 0);
                            }
                            if (!var40[var20 + 2 & 0x3]) {
                                var18[2] = class305.method2448(var18[2], class434.method3377(class758.field10831[6], class758.field10831[4]) == 0);
                            }
                            if (!var17 && (var19 == 0 || var19 == 12)) {
                                if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var18[0] = var18[3] = false;
                                    var20 = 0;
                                } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                    var20 = 3;
                                    var19 = var19 == 0 ? 13 : 14;
                                    var18[0] = var18[1] = false;
                                } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var20 = 2;
                                    var18[1] = var18[2] = false;
                                } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                    var19 = var19 == 0 ? 13 : 14;
                                    var18[2] = var18[3] = false;
                                    var20 = 1;
                                }
                            }
                            boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                            int[] var44 = null;
                            int var45;
                            int[] var46;
                            int var47;
                            int[] var48;
                            int[] var49;
                            if (var43) {
                                var45 = var26 == null ? 0 : class768.field10974[var19];
                                var49 = class772.field11003[var19];
                                var48 = class701.field9805[var19];
                                var46 = class558.field8124[var19];
                                var47 = var27 == null ? 0 : class222.field3218[var19];
                            } else if (var17) {
                                var45 = var26 == null ? 0 : class424.field6121[var19];
                                var46 = class778.field11080[var19];
                                var47 = var27 == null ? 0 : class12.field164[var19];
                                var44 = class282.field3976[var19];
                                var48 = class701.field9803[var19];
                                var49 = class311.field4272[var19];
                            } else {
                                var44 = class587.field8477[var19];
                                var45 = var26 == null ? 0 : class692.field9682[var19];
                                var46 = class53.field741[var19];
                                var48 = class122.field1545[var19];
                                var47 = var27 == null ? 0 : class285.field4008[var19];
                                var49 = class326.field4463[var19];
                            }
                            int var50 = var45 + var47;
                            if (var50 <= 0) {
                                class608.method4488(arg2, var12, var14);
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
                                int[] var61 = arg1 == null && arg6 == null ? null : new int[var53];
                                int var62 = -1;
                                int var63 = -1;
                                int var64 = 256;
                                if (var26 != null) {
                                    var64 = var26.field6727;
                                    var63 = var26.field6728;
                                    var62 = var26.field6726;
                                    int var65 = class126.method1123(arg3, var26, (byte) -12);
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        boolean var67 = false;
                                        byte var68;
                                        if (var18[-var20 & 0x3] && var44[0] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 1;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 1;
                                            class30.field390[4] = var49[var51];
                                            var68 = 6;
                                            class30.field390[5] = var46[var51];
                                        } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 5;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 5;
                                            class30.field390[4] = var49[var51];
                                            var68 = 6;
                                            class30.field390[5] = var46[var51];
                                        } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 3;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 3;
                                            class30.field390[4] = var49[var51];
                                            class30.field390[5] = var46[var51];
                                            var68 = 6;
                                        } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 7;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 7;
                                            class30.field390[4] = var49[var51];
                                            class30.field390[5] = var46[var51];
                                            var68 = 6;
                                        } else {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = var49[var51];
                                            var68 = 3;
                                            class30.field390[2] = var46[var51];
                                        }
                                        for (int var69 = 0; var69 < var68; var69++) {
                                            int var70 = class30.field390[var69];
                                            int var71 = var70 - var20 * 2 & 0x7;
                                            int var72 = this.field460[var70];
                                            int var73 = this.field442[var70];
                                            int var74;
                                            int var75;
                                            if (var20 == 1) {
                                                var74 = 512 - var72;
                                                var75 = var73;
                                            } else if (var20 == 2) {
                                                var75 = 512 - var72;
                                                var74 = 512 - var73;
                                            } else if (var20 == 3) {
                                                var75 = 512 - var73;
                                                var74 = var72;
                                            } else {
                                                var74 = var73;
                                                var75 = var72;
                                            }
                                            var55[var52] = var75;
                                            var56[var52] = var74;
                                            if (var60 != null && class108.field1421[var19][var70]) {
                                                int var76 = (var12 << 9) + var75;
                                                int var77 = (var14 << 9) + var74;
                                                var60[var52] = arg1.method5440((byte) 15, var76, var77) - arg4.method5440((byte) 15, var76, var77);
                                            }
                                            if (var61 != null) {
                                                if (arg1 != null && !class108.field1421[var19][var70]) {
                                                    int var80 = (var12 << 9) + var75;
                                                    int var81 = (var14 << 9) + var74;
                                                    var61[var52] = arg4.method5440((byte) 15, var80, var81) - arg1.method5440((byte) 15, var80, var81);
                                                } else if (arg6 != null && !class150.field1921[var19][var70]) {
                                                    int var78 = (var12 << 9) + var75;
                                                    int var79 = (var14 << 9) + var74;
                                                    var61[var52] = arg6.method5440((byte) 15, var78, var79) - arg4.method5440((byte) 15, var78, var79);
                                                }
                                            }
                                            if (var70 < 8 && class52.field732[var71] > var26.field6725) {
                                                if (var54 != null) {
                                                    var54[var52] = class682.field9573[var71];
                                                }
                                                var59[var52] = class627.field8947[var71];
                                                var58[var52] = class518.field7580[var71];
                                                var57[var52] = class124.field1561[var71];
                                            } else {
                                                if (var54 != null) {
                                                    var54[var52] = var65;
                                                }
                                                var58[var52] = var26.field6728;
                                                var59[var52] = var26.field6727;
                                                var57[var52] = var62;
                                            }
                                            var52++;
                                        }
                                        var51++;
                                    }
                                    if (!this.field458 && arg2 == 0) {
                                        class21.method261(var12, var14, var26.field6718, var26.field6722 * 8, var26.field6731);
                                    }
                                    if (var19 != 12 && var26.field6726 != -1 && var26.field6730) {
                                        var16 = true;
                                    }
                                } else if (var43) {
                                    var51 += class768.field10974[var19];
                                } else if (var17) {
                                    var51 += class424.field6121[var19];
                                } else {
                                    var51 += class692.field9682[var19];
                                }
                                if (var27 != null) {
                                    if (var23 == 0) {
                                        var23 = var22;
                                    }
                                    if (var24 == 0) {
                                        var24 = var22;
                                    }
                                    if (var25 == 0) {
                                        var25 = var22;
                                    }
                                    class97 var82 = this.field444.method4761(true, var22 - 1);
                                    class97 var83 = this.field444.method4761(true, var23 - 1);
                                    class97 var84 = this.field444.method4761(true, var24 - 1);
                                    class97 var85 = this.field444.method4761(true, var25 - 1);
                                    for (int var86 = 0; var86 < var47; var86++) {
                                        boolean var87 = false;
                                        byte var88;
                                        if (var18[-var20 & 0x3] && var44[0] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 1;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 1;
                                            class30.field390[4] = var49[var51];
                                            class30.field390[5] = var46[var51];
                                            var88 = 6;
                                        } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 5;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 5;
                                            class30.field390[4] = var49[var51];
                                            var88 = 6;
                                            class30.field390[5] = var46[var51];
                                        } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 3;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 3;
                                            class30.field390[4] = var49[var51];
                                            var88 = 6;
                                            class30.field390[5] = var46[var51];
                                        } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = 7;
                                            class30.field390[2] = var46[var51];
                                            class30.field390[3] = 7;
                                            class30.field390[4] = var49[var51];
                                            var88 = 6;
                                            class30.field390[5] = var46[var51];
                                        } else {
                                            class30.field390[0] = var48[var51];
                                            class30.field390[1] = var49[var51];
                                            var88 = 3;
                                            class30.field390[2] = var46[var51];
                                        }
                                        var51++;
                                        for (int var89 = 0; var89 < var88; var89++) {
                                            int var90 = class30.field390[var89];
                                            int var91 = var90 - var20 * 2 & 0x7;
                                            int var92 = this.field460[var90];
                                            int var93 = this.field442[var90];
                                            int var94;
                                            int var95;
                                            if (var20 == 1) {
                                                var94 = var93;
                                                var95 = 512 - var92;
                                            } else if (var20 == 2) {
                                                var95 = 512 - var93;
                                                var94 = 512 - var92;
                                            } else if (var20 == 3) {
                                                var94 = 512 - var93;
                                                var95 = var92;
                                            } else {
                                                var94 = var92;
                                                var95 = var93;
                                            }
                                            var55[var52] = var94;
                                            var56[var52] = var95;
                                            if (var60 != null && class108.field1421[var19][var90]) {
                                                int var96 = (var12 << 9) + var94;
                                                int var97 = (var14 << 9) + var95;
                                                var60[var52] = arg1.method5440((byte) 15, var96, var97) - arg4.method5440((byte) 15, var96, var97);
                                            }
                                            if (var61 != null) {
                                                if (arg1 != null && !class108.field1421[var19][var90]) {
                                                    int var100 = (var12 << 9) + var94;
                                                    int var101 = (var14 << 9) + var95;
                                                    var61[var52] = arg4.method5440((byte) 15, var100, var101) - arg1.method5440((byte) 15, var100, var101);
                                                } else if (arg6 != null && !class150.field1921[var19][var90]) {
                                                    int var98 = (var12 << 9) + var94;
                                                    int var99 = (var14 << 9) + var95;
                                                    var61[var52] = arg6.method5440((byte) 15, var98, var99) - arg4.method5440((byte) 15, var98, var99);
                                                }
                                            }
                                            if (var90 < 8 && class52.field732[var91] >= 0) {
                                                if (var54 != null) {
                                                    var54[var52] = class682.field9573[var91];
                                                }
                                                var59[var52] = class627.field8947[var91];
                                                var58[var52] = class518.field7580[var91];
                                                var57[var52] = class124.field1561[var91];
                                            } else {
                                                if (var17 && class108.field1421[var19][var90]) {
                                                    var58[var52] = var63;
                                                    var59[var52] = var64;
                                                    var57[var52] = var62;
                                                } else if (var94 == 0 && var95 == 0) {
                                                    var57[var52] = arg0[var12][var14];
                                                    var58[var52] = var82.field1314;
                                                    var59[var52] = var82.field1307;
                                                } else if (var94 == 0 && var95 == 512) {
                                                    var57[var52] = arg0[var12][var15];
                                                    var58[var52] = var83.field1314;
                                                    var59[var52] = var83.field1307;
                                                } else if (var94 == 512 && var95 == 512) {
                                                    var57[var52] = arg0[var13][var15];
                                                    var58[var52] = var84.field1314;
                                                    var59[var52] = var84.field1307;
                                                } else if (var94 == 512 && var95 == 0) {
                                                    var57[var52] = arg0[var13][var14];
                                                    var58[var52] = var85.field1314;
                                                    var59[var52] = var85.field1307;
                                                } else {
                                                    if (var94 < 256) {
                                                        if (var95 < 256) {
                                                            var58[var52] = var82.field1314;
                                                            var59[var52] = var82.field1307;
                                                        } else {
                                                            var58[var52] = var83.field1314;
                                                            var59[var52] = var83.field1307;
                                                        }
                                                    } else if (var95 < 256) {
                                                        var58[var52] = var85.field1314;
                                                        var59[var52] = var85.field1307;
                                                    } else {
                                                        var58[var52] = var84.field1314;
                                                        var59[var52] = var84.field1307;
                                                    }
                                                    int var102 = class226.method1886((byte) -125, arg0[var13][var14], var94 << 7 >> 9, arg0[var12][var14]);
                                                    int var103 = class226.method1886((byte) -23, arg0[var13][var15], var94 << 7 >> 9, arg0[var12][var15]);
                                                    var57[var52] = class226.method1886((byte) -122, var103, var95 << 7 >> 9, var102);
                                                }
                                                if (var54 != null) {
                                                    var54[var52] = var57[var52];
                                                }
                                            }
                                            var52++;
                                        }
                                    }
                                    if (var19 != 0 && var27.field1316) {
                                        var16 = true;
                                    }
                                }
                                int var104 = arg4.method5442(var12, var14, 31844);
                                int var105 = arg4.method5442(var13, var14, 31844);
                                int var106 = arg4.method5442(var13, var15, 31844);
                                int var107 = arg4.method5442(var12, var15, 31844);
                                boolean var108 = class23.method275(1, var12, var14);
                                if (var108 && arg2 > 1 || !var108 && arg2 > 0) {
                                    boolean var109 = true;
                                    if (var27 != null && !var27.field1321) {
                                        var109 = false;
                                    } else if (var22 == 0 && var19 != 0) {
                                        var109 = false;
                                    } else if (var21 > 0 && var28 != null && !var28.field6732) {
                                        var109 = false;
                                    }
                                    if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                        this.field445[arg2][var12][var14] = (byte) class10.method71(this.field445[arg2][var12][var14], 4);
                                    }
                                }
                                int var110 = 0;
                                int var111 = 0;
                                int var112 = 0;
                                if (this.field458) {
                                    var110 = class667.method4805(var12, var14);
                                    var111 = class496.method3816(var12, var14);
                                    var112 = class429.method3333(var12, var14);
                                }
                                arg4.method2480(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                                class608.method4488(arg2, var12, var14);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var114) {
            throw class665.method4799(var114, field465[11] + (arg0 == null ? field465[2] : field465[3]) + ',' + (arg1 == null ? field465[2] : field465[3]) + ',' + arg2 + ',' + (arg3 == null ? field465[2] : field465[3]) + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + arg5 + ',' + (arg6 == null ? field465[2] : field465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        try {
            field446 = null;
            field463 = null;
            if (arg0 != 2) {
                method373(-6);
            }
            field443 = null;
            field462 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field465[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIZLnba;Lnn;)V")
    public class36(int arg0, int arg1, int arg2, boolean arg3, class78 arg4, class655 arg5) {
        try {
            this.field461 = arg4;
            this.field458 = arg3;
            this.field455 = arg2;
            this.field453 = arg1;
            this.field444 = arg5;
            this.field440 = arg0;
            this.field445 = new byte[this.field440][this.field453 + 1][this.field455 + 1];
            this.field436 = new byte[this.field440][this.field453][this.field455];
            this.field452 = new byte[this.field440][this.field453][this.field455];
            this.field432 = new byte[this.field440][this.field453][this.field455];
            this.field434 = new byte[this.field440][this.field453][this.field455];
            this.field456 = new int[this.field440][this.field453 + 1][this.field455 + 1];
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field465[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field465[2] : field465[3]) + ',' + (arg5 == null ? field465[2] : field465[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method374(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method375(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
