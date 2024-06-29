import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class653 implements class160 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Ldl;")
    private class70 field9434 = new class70(256);

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lla;")
    private class476 field9425;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "Lla;")
    private class476 field9426;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    private int field9431;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[Lmf;")
    private class439[] field9440;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9445 = new String[] { method4793(method4792("+l4t\u0000")), method4793(method4792("+l4v\u0000")), method4793(method4792("\"vvR")), method4793(method4792("7-4\u0010U")), method4793(method4792("\u0013pn_\\%`\u007fRM!ftJ[")), method4793(method4792("+l4x\u0000")), method4793(method4792("+l4u\u0000")), method4793(method4792("+l4z\u0000")), method4793(method4792("+l4\u0002A\"jn\u0000\u0000")), method4793(method4792("+l4{\u0000")), method4793(method4792("+l4y\u0000")), method4793(method4792("+l4w\u0000")), method4793(method4792("+l4|\u0000")), method4793(method4792("+l4}\u0000")), method4793(method4792("+l4\u007f\u0000")) };

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
    public static int[] field9432 = new int[3];

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lel;")
    public static class573 field9427 = new class573(111, 3);

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field9441 = -1;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method4787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (class676.field9807 <= arg4 && arg4 <= class381.field5786) {
                int var7 = class541.method4089(class200.field3119, class676.field9797, arg2, 18286);
                int var8 = class541.method4089(class200.field3119, class676.field9797, arg3, 18286);
                class45.method350(var8, var7, -119, arg1, arg4);
            }
            if (arg0 > -120) {
                field9432 = null;
            }
            field9424++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9445[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lij;", line = 26)
    private final class443 method4788(boolean arg0, int arg1) {
        try {
            field9436++;
            class46 var3 = this.field9434.method637((byte) -124, (long) arg1);
            if (var3 != null) {
                return (class443) var3;
            }
            byte[] var4 = this.field9426.method3638(115, arg1);
            if (var4 == null) {
                return null;
            }
            class443 var5 = new class443(new class163(var4));
            if (arg0) {
                this.field9434.method636(var5, 0, (long) arg1);
                return var5;
            } else {
                return null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9445[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIF)[I", line = 54)
    public final int[] method1364(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            field9438++;
            if (arg0 != -25656) {
                this.field9425 = null;
            }
            return this.method4788(true, arg2).method3402(this.field9425, 88, this, (double) arg5, arg4, arg3, arg1, this.field9440[arg2].field6477);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9445[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Lmf;", line = 65)
    public final class439 method1366(byte arg0, int arg1) {
        try {
            field9435++;
            if (arg0 >= -41) {
                this.field9434 = null;
            }
            return this.field9440[arg1];
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9445[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIIFII)[F", line = 76)
    public final float[] method1368(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        try {
            field9433++;
            if (arg5 != -8388) {
                this.method1366((byte) 64, -63);
            }
            return this.method4788(true, arg2).method3405(arg4, -100, this, this.field9425, this.field9440[arg2].field6477, arg1);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9445[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILd;Lha;)V", line = 88)
    public static final void method4789(int arg0, class160 arg1, class66 arg2) {
        try {
            field9430++;
            if (class161.field2149 != null) {
                if (class712.field10330 < 10) {
                    if (!class161.field2152.method3647(class161.field2149.field5553, 78)) {
                        class712.field10330 = class366.field5598.method3628((byte) 110, class161.field2149.field5553) / 10;
                        return;
                    }
                    class524.method3970(-4377);
                    class712.field10330 = 10;
                }
                if (class712.field10330 == 10) {
                    class161.field2167 = class161.field2149.field5565 >> 6 << 6;
                    class161.field2171 = class161.field2149.field5562 >> 6 << 6;
                    class161.field2172 = (class161.field2149.field5559 >> 6 << 6) - (class161.field2167 - 64);
                    class161.field2173 = (class161.field2149.field5555 >> 6 << 6) + 64 - class161.field2171;
                    int[] var3 = new int[3];
                    int var4 = -1;
                    int var5 = -1;
                    if (class161.field2149.method2946(class225.field3446.field6200, -1, (class225.field3446.field6197 >> 9) + class494.field7101, var3, (class225.field3446.field6211 >> 9) + class281.field4219)) {
                        var4 = var3[1] - class161.field2171;
                        var5 = var3[2] - class161.field2167;
                    }
                    if (!class376.field5731 && var4 >= 0 && var4 < class161.field2173 && var5 >= 0 && var5 < class161.field2172) {
                        int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                        int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                        class494.field7096 = var7;
                        class560.field8334 = var6;
                    } else if (class362.field5548 == -1 || class306.field4782 == -1) {
                        class161.field2149.method2948(class161.field2149.field5561 >> 14 & 0x3FFF, 122, var3, class161.field2149.field5561 & 0x3FFF);
                        class494.field7096 = var3[1] - class161.field2171;
                        class560.field8334 = var3[2] - class161.field2167;
                    } else {
                        class161.field2149.method2948(class362.field5548, -98, var3, class306.field4782);
                        class306.field4782 = -1;
                        class362.field5548 = -1;
                        class376.field5731 = false;
                        if (var3 != null) {
                            class494.field7096 = var3[1] - class161.field2171;
                            class560.field8334 = var3[2] - class161.field2167;
                        }
                    }
                    if (class161.field2149.field5557 == 37) {
                        class161.field2163 = 3.0F;
                        class161.field2159 = 3.0F;
                    } else if (class161.field2149.field5557 == 50) {
                        class161.field2163 = 4.0F;
                        class161.field2159 = 4.0F;
                    } else if (class161.field2149.field5557 == 75) {
                        class161.field2163 = 6.0F;
                        class161.field2159 = 6.0F;
                    } else if (class161.field2149.field5557 == 100) {
                        class161.field2163 = 8.0F;
                        class161.field2159 = 8.0F;
                    } else if (class161.field2149.field5557 == 200) {
                        class161.field2163 = 16.0F;
                        class161.field2159 = 16.0F;
                    } else {
                        class161.field2163 = 8.0F;
                        class161.field2159 = 8.0F;
                    }
                    class161.field2162 = (int) class161.field2163 >> 1;
                    class161.field2161 = class256.method2170(class161.field2162, -1);
                    class685.method5024(-1);
                    class161.method1375();
                    class728.field10550 = new class513();
                    class161.field2164 += (int) (Math.random() * 5.0D) - 2;
                    if (class161.field2164 < -8) {
                        class161.field2164 = -8;
                    }
                    class161.field2155 += (int) (Math.random() * 5.0D) - 2;
                    if (class161.field2164 > 8) {
                        class161.field2164 = 8;
                    }
                    if (class161.field2155 < -16) {
                        class161.field2155 = -16;
                    }
                    if (class161.field2155 > 16) {
                        class161.field2155 = 16;
                    }
                    class161.method1385(arg1, class161.field2164 >> 2 << 10, class161.field2155 >> 1);
                    class161.field2147.method621(36, 256, 1024);
                    class161.field2153.method4607(true, 256, 256);
                    class161.field2151.method3028(true, 4096);
                    class369.field5638.method4270(true, 256);
                    class712.field10330 = 20;
                } else {
                    int var8 = 79 / ((arg0 - 1) / 47);
                    if (class712.field10330 == 20) {
                        class549.method4140(-36, true);
                        class161.method1376(arg2, class161.field2164, class161.field2155);
                        class712.field10330 = 60;
                        class549.method4140(-105, true);
                        class270.method2235(118);
                    } else if (class712.field10330 == 60) {
                        if (class161.field2152.method3641(class161.field2149.field5553 + field9445[4], 1)) {
                            if (!class161.field2152.method3647(class161.field2149.field5553 + field9445[4], 87)) {
                                return;
                            }
                            class161.field2156 = class415.method3228(class161.field2152, class709.field10277, class161.field2149.field5553 + field9445[4], true);
                        } else {
                            class161.field2156 = new class408(0);
                        }
                        class161.method1371();
                        class712.field10330 = 70;
                        class549.method4140(-61, true);
                        class270.method2235(122);
                    } else if (class712.field10330 == 70) {
                        class753.field10965 = new class718(arg2, 11, true, class502.field7252);
                        class712.field10330 = 73;
                        class549.method4140(-47, true);
                        class270.method2235(126);
                    } else if (class712.field10330 == 73) {
                        class253.field3922 = new class718(arg2, 12, true, class502.field7252);
                        class712.field10330 = 76;
                        class549.method4140(-82, true);
                        class270.method2235(117);
                    } else if (class712.field10330 == 76) {
                        class628.field9194 = new class718(arg2, 14, true, class502.field7252);
                        class712.field10330 = 79;
                        class549.method4140(-51, true);
                        class270.method2235(117);
                    } else if (class712.field10330 == 79) {
                        class133.field1556 = new class718(arg2, 17, true, class502.field7252);
                        class712.field10330 = 82;
                        class549.method4140(-109, true);
                        class270.method2235(120);
                    } else if (class712.field10330 == 82) {
                        class647.field9369 = new class718(arg2, 19, true, class502.field7252);
                        class712.field10330 = 85;
                        class549.method4140(-20, true);
                        class270.method2235(127);
                    } else if (class712.field10330 == 85) {
                        class439.field6483 = new class718(arg2, 22, true, class502.field7252);
                        class712.field10330 = 88;
                        class549.method4140(-37, true);
                        class270.method2235(124);
                    } else if (class712.field10330 == 88) {
                        class253.field3929 = new class718(arg2, 26, true, class502.field7252);
                        class712.field10330 = 91;
                        class549.method4140(-72, true);
                        class270.method2235(121);
                    } else {
                        class643.field9315 = new class718(arg2, 30, true, class502.field7252);
                        class712.field10330 = 100;
                        class549.method4140(-59, true);
                        class270.method2235(116);
                        System.gc();
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9445[1] + arg0 + ',' + (arg1 == null ? field9445[2] : field9445[3]) + ',' + (arg2 == null ? field9445[2] : field9445[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Z", line = 316)
    public final boolean method1363(int arg0, byte arg1) {
        try {
            field9437++;
            int var3 = -115 % ((arg1 - 26) / 53);
            class443 var4 = this.method4788(true, arg0);
            return var4 != null && var4.method3406(this, this.field9425, 6775);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9445[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BIZFII)[I", line = 331)
    public final int[] method1365(byte arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        try {
            if (arg0 != -59) {
                field9441 = -49;
            }
            field9428++;
            return this.method4788(true, arg4).method3403((double) arg3, arg1, this, this.field9425, this.field9440[arg4].field6477, arg5, -124);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9445[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I", line = 348)
    public final int method1367(int arg0) {
        try {
            field9439++;
            int var2 = 71 % ((arg0 - 9) / 43);
            return this.field9431;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9445[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([[[Liia;IZIII)Z", line = 358)
    public static final boolean method4790(class96[][][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            field9429++;
            byte var6 = arg2 ? 1 : (byte) (class373.field5698 & 0xFF);
            if (class520.field7621[class520.field7618][arg5][arg1] == var6) {
                return false;
            } else if (arg3 != 1) {
                return true;
            } else if ((class184.field2545[class520.field7618][arg5][arg1] & 0x4) == 0) {
                return false;
            } else {
                byte var7 = 0;
                class95.field1073[var7] = arg5;
                int var8 = 0;
                int var37 = var7 + 1;
                class440.field6492[var7] = arg1;
                class520.field7621[class520.field7618][arg5][arg1] = var6;
                while (var37 != var8) {
                    int var9 = class95.field1073[var8] & 0xFFFF;
                    int var10 = (class95.field1073[var8] & 0xFF38D8) >> 16;
                    int var11 = class95.field1073[var8] >> 24 & 0xFF;
                    int var12 = class440.field6492[var8] & 0xFFFF;
                    int var13 = class440.field6492[var8] >> 16 & 0xFF;
                    var8 = var8 + 1 & 0xFFF;
                    boolean var14 = false;
                    if ((class184.field2545[class520.field7618][var9][var12] & 0x4) == 0) {
                        var14 = true;
                    }
                    boolean var15 = false;
                    if (arg0 != null) {
                        label296: for (int var16 = class520.field7618 + 1; var16 <= 3; var16++) {
                            if (arg0[var16] != null && (class184.field2545[var16][var9][var12] & 0x8) == 0) {
                                if (var14 && arg0[var16][var9][var12] != null) {
                                    if (arg0[var16][var9][var12].field1082 != null) {
                                        int var17 = class366.method2968(var10, false);
                                        if (arg0[var16][var9][var12].field1082.field4023 == var17 || arg0[var16][var9][var12].field1079 != null && arg0[var16][var9][var12].field1079.field4023 == var17) {
                                            continue;
                                        }
                                        if (var11 != 0) {
                                            int var18 = class366.method2968(var11, false);
                                            if (arg0[var16][var9][var12].field1082.field4023 == var18 || arg0[var16][var9][var12].field1079 != null && arg0[var16][var9][var12].field1079.field4023 == var18) {
                                                continue;
                                            }
                                        }
                                        if (var13 != 0) {
                                            int var19 = class366.method2968(var13, false);
                                            if (arg0[var16][var9][var12].field1082.field4023 == var19 || arg0[var16][var9][var12].field1079 != null && arg0[var16][var9][var12].field1079.field4023 == var19) {
                                                continue;
                                            }
                                        }
                                    }
                                    class96 var20 = arg0[var16][var9][var12];
                                    if (var20.field1085 != null) {
                                        for (class681 var21 = var20.field1085; var21 != null; var21 = var21.field9865) {
                                            class343 var22 = var21.field9867;
                                            if (var22 instanceof class583) {
                                                class583 var23 = (class583) var22;
                                                int var24 = var23.method1087(18636);
                                                int var25 = var23.method1097(false);
                                                if (var24 == 21) {
                                                    var24 = 19;
                                                }
                                                int var26 = var24 | var25 << 6;
                                                if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                    continue label296;
                                                }
                                            }
                                        }
                                    }
                                }
                                class96 var27 = arg0[var16][var9][var12];
                                if (var27 != null && var27.field1085 != null) {
                                    for (class681 var28 = var27.field1085; var28 != null; var28 = var28.field9865) {
                                        class343 var29 = var28.field9867;
                                        if (var29.field5335 != var29.field5330 || var29.field5329 != var29.field5325) {
                                            for (int var30 = var29.field5330; var30 <= var29.field5335; var30++) {
                                                for (int var31 = var29.field5329; var31 <= var29.field5325; var31++) {
                                                    class520.field7621[var16][var30][var31] = var6;
                                                }
                                            }
                                        }
                                    }
                                }
                                class520.field7621[var16][var9][var12] = var6;
                                var15 = true;
                            }
                        }
                    }
                    if (var15) {
                        int var32 = class555.field8261[class520.field7618 + 1].method2407(var12, var9, 25);
                        if (class152.field1872[arg4] < var32) {
                            class152.field1872[arg4] = var32;
                        }
                        int var33 = var9 << 9;
                        if (var33 < class334.field5223[arg4]) {
                            class334.field5223[arg4] = var33;
                        } else if (var33 > class639.field9287[arg4]) {
                            class639.field9287[arg4] = var33;
                        }
                        int var34 = var12 << 9;
                        if (var34 < class49.field556[arg4]) {
                            class49.field556[arg4] = var34;
                        } else if (class248.field3875[arg4] < var34) {
                            class248.field3875[arg4] = var34;
                        }
                    }
                    if (!var14) {
                        if (var9 >= 1 && class520.field7621[class520.field7618][var9 - 1][var12] != var6) {
                            class95.field1073[var37] = class544.method4107(class544.method4107(var9 - 1, 1179648), -754974720);
                            class440.field6492[var37] = class544.method4107(1245184, var12);
                            class520.field7621[class520.field7618][var9 - 1][var12] = var6;
                            var37 = var37 + 1 & 0xFFF;
                        }
                        int var10000 = ~class659.field9506;
                        var12++;
                        if (var10000 < ~var12) {
                            if ((var9 - 1) >= 0 && class520.field7621[class520.field7618][var9 - 1][var12] != var6 && (class184.field2545[class520.field7618][var9][var12] & 0x4) == 0 && (class184.field2545[class520.field7618][var9 - 1][var12 - 1] & 0x4) == 0) {
                                class95.field1073[var37] = class544.method4107(1375731712, class544.method4107(var9 - 1, 1179648));
                                class440.field6492[var37] = class544.method4107(var12, 1245184);
                                var37 = var37 + 1 & 0xFFF;
                                class520.field7621[class520.field7618][var9 - 1][var12] = var6;
                            }
                            if (class520.field7621[class520.field7618][var9][var12] != var6) {
                                class95.field1073[var37] = class544.method4107(class544.method4107(5373952, var9), 318767104);
                                class440.field6492[var37] = class544.method4107(5439488, var12);
                                class520.field7621[class520.field7618][var9][var12] = var6;
                                var37 = var37 + 1 & 0xFFF;
                            }
                            if (class648.field9378 > (var9 + 1) && class520.field7621[class520.field7618][var9 + 1][var12] != var6 && (class184.field2545[class520.field7618][var9][var12] & 0x4) == 0 && (class184.field2545[class520.field7618][var9 + 1][var12 - 1] & 0x4) == 0) {
                                class95.field1073[var37] = class544.method4107(class544.method4107(var9 + 1, 5373952), -1845493760);
                                class440.field6492[var37] = class544.method4107(var12, 5439488);
                                var37 = var37 + 1 & 0xFFF;
                                class520.field7621[class520.field7618][var9 + 1][var12] = var6;
                            }
                        }
                        var12--;
                        if (class648.field9378 > var9 + 1 && class520.field7621[class520.field7618][var9 + 1][var12] != var6) {
                            class95.field1073[var37] = class544.method4107(1392508928, class544.method4107(9568256, var9 + 1));
                            class440.field6492[var37] = class544.method4107(var12, 9633792);
                            class520.field7621[class520.field7618][var9 + 1][var12] = var6;
                            var37 = var37 + 1 & 0xFFF;
                        }
                        var12--;
                        if (var12 >= 0) {
                            if ((var9 - 1) >= 0 && class520.field7621[class520.field7618][var9 - 1][var12] != var6 && (class184.field2545[class520.field7618][var9][var12] & 0x4) == 0 && (class184.field2545[class520.field7618][var9 - 1][var12 + 1] & 0x4) == 0) {
                                class95.field1073[var37] = class544.method4107(301989888, class544.method4107(13762560, var9 - 1));
                                class440.field6492[var37] = class544.method4107(var12, 13828096);
                                var37 = var37 + 1 & 0xFFF;
                                class520.field7621[class520.field7618][var9 - 1][var12] = var6;
                            }
                            if (class520.field7621[class520.field7618][var9][var12] != var6) {
                                class95.field1073[var37] = class544.method4107(class544.method4107(var9, 13762560), -1828716544);
                                class440.field6492[var37] = class544.method4107(13828096, var12);
                                var37 = var37 + 1 & 0xFFF;
                                class520.field7621[class520.field7618][var9][var12] = var6;
                            }
                            if (class648.field9378 > (var9 + 1) && class520.field7621[class520.field7618][var9 + 1][var12] != var6 && (class184.field2545[class520.field7618][var9][var12] & 0x4) == 0 && (class184.field2545[class520.field7618][var9 + 1][var12 + 1] & 0x4) == 0) {
                                class95.field1073[var37] = class544.method4107(class544.method4107(9568256, var9 + 1), -771751936);
                                class440.field6492[var37] = class544.method4107(9633792, var12);
                                class520.field7621[class520.field7618][var9 + 1][var12] = var6;
                                var37 = var37 + 1 & 0xFFF;
                            }
                        }
                    }
                }
                if (class152.field1872[arg4] != -1000000) {
                    class152.field1872[arg4] += 40;
                    class334.field5223[arg4] -= 512;
                    class639.field9287[arg4] += 512;
                    class248.field3875[arg4] += 512;
                    class49.field556[arg4] -= 512;
                }
                return true;
            }
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field9445[6] + (arg0 == null ? field9445[2] : field9445[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 686)
    public static void method4791(int arg0) {
        try {
            field9432 = null;
            field9427 = null;
            if (arg0 != 0) {
                method4790(null, 73, false, 109, -5, 79);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9445[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lla;Lla;Lla;)V", line = 709)
    public class653(class476 arg0, class476 arg1, class476 arg2) {
        try {
            this.field9425 = arg2;
            this.field9426 = arg1;
            class163 var4 = new class163(arg0.method3632(0, 0, -122));
            this.field9431 = var4.method1445((byte) 103);
            this.field9440 = new class439[this.field9431];
            for (int var5 = 0; var5 < this.field9431; var5++) {
                if (var4.method1455((byte) 62) == 1) {
                    this.field9440[var5] = new class439();
                }
            }
            for (int var6 = 0; var6 < this.field9431; var6++) {
                if (this.field9440[var6] != null) {
                    this.field9440[var6].field6474 = var4.method1455((byte) 62) == 0;
                }
            }
            for (int var7 = 0; var7 < this.field9431; var7++) {
                if (this.field9440[var7] != null) {
                    this.field9440[var7].field6481 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var8 = 0; var8 < this.field9431; var8++) {
                if (this.field9440[var8] != null) {
                    this.field9440[var8].field6471 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var9 = 0; var9 < this.field9431; var9++) {
                if (this.field9440[var9] != null) {
                    this.field9440[var9].field6480 = var4.method1414(1);
                }
            }
            for (int var10 = 0; var10 < this.field9431; var10++) {
                if (this.field9440[var10] != null) {
                    this.field9440[var10].field6476 = var4.method1414(1);
                }
            }
            for (int var11 = 0; var11 < this.field9431; var11++) {
                if (this.field9440[var11] != null) {
                    this.field9440[var11].field6467 = var4.method1414(1);
                }
            }
            for (int var12 = 0; var12 < this.field9431; var12++) {
                if (this.field9440[var12] != null) {
                    this.field9440[var12].field6461 = var4.method1414(1);
                }
            }
            for (int var13 = 0; var13 < this.field9431; var13++) {
                if (this.field9440[var13] != null) {
                    this.field9440[var13].field6472 = (short) var4.method1445((byte) 126);
                }
            }
            for (int var14 = 0; var14 < this.field9431; var14++) {
                if (this.field9440[var14] != null) {
                    this.field9440[var14].field6475 = var4.method1414(1);
                }
            }
            for (int var15 = 0; var15 < this.field9431; var15++) {
                if (this.field9440[var15] != null) {
                    this.field9440[var15].field6466 = var4.method1414(1);
                }
            }
            for (int var16 = 0; var16 < this.field9431; var16++) {
                if (this.field9440[var16] != null) {
                    this.field9440[var16].field6479 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var17 = 0; var17 < this.field9431; var17++) {
                if (this.field9440[var17] != null) {
                    this.field9440[var17].field6477 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var18 = 0; var18 < this.field9431; var18++) {
                if (this.field9440[var18] != null) {
                    this.field9440[var18].field6469 = var4.method1414(1);
                }
            }
            for (int var19 = 0; var19 < this.field9431; var19++) {
                if (this.field9440[var19] != null) {
                    this.field9440[var19].field6463 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var20 = 0; var20 < this.field9431; var20++) {
                if (this.field9440[var20] != null) {
                    this.field9440[var20].field6470 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var21 = 0; var21 < this.field9431; var21++) {
                if (this.field9440[var21] != null) {
                    this.field9440[var21].field6468 = var4.method1455((byte) 62) == 1;
                }
            }
            for (int var22 = 0; var22 < this.field9431; var22++) {
                if (this.field9440[var22] != null) {
                    this.field9440[var22].field6464 = var4.method1455((byte) 62);
                }
            }
            for (int var23 = 0; var23 < this.field9431; var23++) {
                if (this.field9440[var23] != null) {
                    this.field9440[var23].field6462 = var4.method1453((byte) 100);
                }
            }
            for (int var24 = 0; var24 < this.field9431; var24++) {
                if (this.field9440[var24] != null) {
                    this.field9440[var24].field6478 = var4.method1455((byte) 62);
                }
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field9445[8] + (arg0 == null ? field9445[2] : field9445[3]) + ',' + (arg1 == null ? field9445[2] : field9445[3]) + ',' + (arg2 == null ? field9445[2] : field9445[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4792(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!go", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4793(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
