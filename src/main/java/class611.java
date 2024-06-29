import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class611 {

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    private int field8599 = 0;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
    private int[] field8600 = new int[1600];

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "[I")
    private int[] field8611 = new int[64];

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[[Led;")
    private class119[][] field8615 = new class119[1600][64];

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "[[Led;")
    private class119[][] field8614 = new class119[64][768];

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "[I")
    private int[] field8616 = new int[8191];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lada;")
    private class278 field8596;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lsu;")
    private class155 field8601;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "Lsu;")
    private class155 field8605;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Lmda;")
    private class17 field8602;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Lfg;")
    public static class174 field8613;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Ltf;")
    public static class701 field8606;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Ltf;")
    public static class701 field8610;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqw;Lmj;IZ)V")
    public final void method3401(class332 arg0, class344 arg1, int arg2, boolean arg3) {
        field8617++;
        if (arg1.field4511 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method3404(0, arg1, arg2);
        } else {
            this.method3408(false, arg1);
        }
        if (arg3) {
            field8613 = null;
        }
        float var5 = arg1.field4511.field7532;
        float var6 = arg1.field4511.field7557;
        float var7 = arg1.field4511.field7533;
        float var8 = arg1.field4511.field7514;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class536 var12 = arg0.field4171.field760;
            for (class536 var13 = var12.field7499; var13 != var12; var13 = var13.field7499) {
                class119 var14 = (class119) var13;
                int var15 = (int) ((float) (var14.field1335 >> 12) * var7 + (float) (var14.field1337 >> 12) * var5 + (float) (var14.field1328 >> 12) * var6 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field8616[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class258.method1532(var16, false) + 1 - class617.field8700;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class536 var18 = var12.field7499;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field8599 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field8600[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field8611[var24] = 0;
                }
                while (var12 != var18) {
                    class119 var25 = (class119) var18;
                    if (var22) {
                        var21 = var25.field1332;
                        var22 = false;
                        var20 = var25.field1331;
                    }
                    if (var19 > 0 && (var25.field1331 != var20 || var25.field1332 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field8616[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field8600[var26] >= 64) {
                            label98: {
                                if (this.field8600[var26] == 64) {
                                    if (this.field8599 == 64) {
                                        break label98;
                                    }
                                    this.field8600[var26] += (this.field8599++) + 1;
                                }
                                this.field8614[this.field8600[var26] - 64 - 1][this.field8611[this.field8600[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field8615[var26][this.field8600[var26]++] = var25;
                        }
                    }
                    var18 = var18.field7499;
                }
                arg1.method2008(false, 93, var20 < 0 ? -1 : var20, false);
                if (var21 && class414.field5557 != arg1.field4596) {
                    arg1.method949(class414.field5557);
                } else if (arg1.field4596 != 1.0F) {
                    arg1.method949(1.0F);
                }
                this.method3402(var16, arg1, 5716);
            }
        } catch (Exception var27) {
        }
        this.method3410(arg1, (byte) 81);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILmj;I)V")
    private final void method3402(int arg0, class344 arg1, int arg2) {
        field8603++;
        int var4 = 0;
        class537 var5 = arg1.method2032(arg2 - 5674);
        float var6 = var5.field7520;
        float var7 = var5.field7527;
        float var8 = var5.field7541;
        float var9 = var5.field7537;
        float var10 = var5.field7529;
        float var11 = var5.field7546;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        if (arg2 != 5716) {
            this.field8615 = null;
        }
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field8601.method354(true, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method1980((byte) -74, var21);
        if (Stream.method3480()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field8600[var48] > 64 ? 64 : this.field8600[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class119 var63 = this.field8615[var48][var50];
                        int var64 = var63.field1330;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field1337 >> 12);
                        float var70 = (float) (var63.field1328 >> 12);
                        float var71 = (float) (var63.field1335 >> 12);
                        int var72 = var63.field1333 >> 12;
                        var22.method3469((float) (-var72) * var12 + var69);
                        var22.method3469((float) (-var72) * var13 + var70);
                        var22.method3469((float) (-var72) * var14 + var71);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var65, var66, var67, var68);
                        } else {
                            var22.method3477(var65, var66, var67, var68);
                        }
                        var22.method3469(0.0F);
                        var22.method3469(0.0F);
                        var22.method3469((float) var72 * var15 + var69);
                        var22.method3469((float) var72 * var16 + var70);
                        var22.method3469((float) var72 * var17 + var71);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var65, var66, var67, var68);
                        } else {
                            var22.method3477(var65, var66, var67, var68);
                        }
                        var22.method3469(1.0F);
                        var22.method3469(0.0F);
                        var22.method3469((float) var72 * var12 + var69);
                        var22.method3469((float) var72 * var13 + var70);
                        var22.method3469((float) var72 * var14 + var71);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var65, var66, var67, var68);
                        } else {
                            var22.method3477(var65, var66, var67, var68);
                        }
                        var22.method3469(1.0F);
                        var22.method3469(1.0F);
                        var22.method3469((float) var72 * var18 + var69);
                        var22.method3469((float) var72 * var19 + var70);
                        var22.method3469((float) var72 * var20 + var71);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var65, var66, var67, var68);
                        } else {
                            var22.method3477(var65, var66, var67, var68);
                        }
                        var22.method3469(0.0F);
                        var22.method3469(1.0F);
                        var4++;
                    }
                    if (this.field8600[var48] > 64) {
                        int var51 = this.field8600[var48] - 64 - 1;
                        for (int var52 = this.field8611[var51] - 1; var52 >= 0; var52--) {
                            class119 var53 = this.field8614[var51][var52];
                            int var54 = var53.field1330;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field1337 >> 12);
                            float var60 = (float) (var53.field1328 >> 12);
                            float var61 = (float) (var53.field1335 >> 12);
                            int var62 = var53.field1333 >> 12;
                            var22.method3469((float) (-var62) * var12 + var59);
                            var22.method3469((float) (-var62) * var13 + var60);
                            var22.method3469((float) (-var62) * var14 + var61);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var55, var56, var57, var58);
                            } else {
                                var22.method3477(var55, var56, var57, var58);
                            }
                            var22.method3469(0.0F);
                            var22.method3469(0.0F);
                            var22.method3469((float) var62 * var15 + var59);
                            var22.method3469((float) var62 * var16 + var60);
                            var22.method3469((float) var62 * var17 + var61);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var55, var56, var57, var58);
                            } else {
                                var22.method3477(var55, var56, var57, var58);
                            }
                            var22.method3469(1.0F);
                            var22.method3469(0.0F);
                            var22.method3469((float) var62 * var12 + var59);
                            var22.method3469((float) var62 * var13 + var60);
                            var22.method3469((float) var62 * var14 + var61);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var55, var56, var57, var58);
                            } else {
                                var22.method3477(var55, var56, var57, var58);
                            }
                            var22.method3469(1.0F);
                            var22.method3469(1.0F);
                            var22.method3469((float) var62 * var18 + var59);
                            var22.method3469((float) var62 * var19 + var60);
                            var22.method3469((float) var62 * var20 + var61);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var55, var56, var57, var58);
                            } else {
                                var22.method3477(var55, var56, var57, var58);
                            }
                            var22.method3469(0.0F);
                            var4++;
                            var22.method3469(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field8600[var23] <= 64 ? this.field8600[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class119 var38 = this.field8615[var23][var25];
                        int var39 = var38.field1330;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field1337 >> 12);
                        float var45 = (float) (var38.field1328 >> 12);
                        float var46 = (float) (var38.field1335 >> 12);
                        int var47 = var38.field1333 >> 12;
                        var22.method3475((float) (-var47) * var12 + var44);
                        var22.method3475((float) (-var47) * var13 + var45);
                        var22.method3475((float) (-var47) * var14 + var46);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var40, var41, var42, var43);
                        } else {
                            var22.method3477(var40, var41, var42, var43);
                        }
                        var22.method3475(0.0F);
                        var22.method3475(0.0F);
                        var22.method3475((float) var47 * var15 + var44);
                        var22.method3475((float) var47 * var16 + var45);
                        var22.method3475((float) var47 * var17 + var46);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var40, var41, var42, var43);
                        } else {
                            var22.method3477(var40, var41, var42, var43);
                        }
                        var22.method3475(1.0F);
                        var22.method3475(0.0F);
                        var22.method3475((float) var47 * var12 + var44);
                        var22.method3475((float) var47 * var13 + var45);
                        var22.method3475((float) var47 * var14 + var46);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var40, var41, var42, var43);
                        } else {
                            var22.method3477(var40, var41, var42, var43);
                        }
                        var22.method3475(1.0F);
                        var22.method3475(1.0F);
                        var22.method3475((float) var47 * var18 + var44);
                        var22.method3475((float) var47 * var19 + var45);
                        var22.method3475((float) var47 * var20 + var46);
                        if (arg1.field4519 == 0) {
                            var22.method3473(var40, var41, var42, var43);
                        } else {
                            var22.method3477(var40, var41, var42, var43);
                        }
                        var22.method3475(0.0F);
                        var22.method3475(1.0F);
                        var4++;
                    }
                    if (this.field8600[var23] > 64) {
                        int var26 = this.field8600[var23] - 65;
                        for (int var27 = this.field8611[var26] - 1; var27 >= 0; var27--) {
                            class119 var28 = this.field8614[var26][var27];
                            int var29 = var28.field1330;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field1337 >> 12);
                            float var35 = (float) (var28.field1328 >> 12);
                            float var36 = (float) (var28.field1335 >> 12);
                            int var37 = var28.field1333 >> 12;
                            var22.method3475((float) (-var37) * var12 + var34);
                            var22.method3475((float) (-var37) * var13 + var35);
                            var22.method3475((float) (-var37) * var14 + var36);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var30, var31, var32, var33);
                            } else {
                                var22.method3477(var30, var31, var32, var33);
                            }
                            var22.method3475(0.0F);
                            var22.method3475(0.0F);
                            var22.method3475((float) var37 * var15 + var34);
                            var22.method3475((float) var37 * var16 + var35);
                            var22.method3475((float) var37 * var17 + var36);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var30, var31, var32, var33);
                            } else {
                                var22.method3477(var30, var31, var32, var33);
                            }
                            var22.method3475(1.0F);
                            var22.method3475(0.0F);
                            var22.method3475((float) var37 * var12 + var34);
                            var22.method3475((float) var37 * var13 + var35);
                            var22.method3475((float) var37 * var14 + var36);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var30, var31, var32, var33);
                            } else {
                                var22.method3477(var30, var31, var32, var33);
                            }
                            var22.method3475(1.0F);
                            var22.method3475(1.0F);
                            var22.method3475((float) var37 * var18 + var34);
                            var22.method3475((float) var37 * var19 + var35);
                            var22.method3475((float) var37 * var20 + var36);
                            if (arg1.field4519 == 0) {
                                var22.method3473(var30, var31, var32, var33);
                            } else {
                                var22.method3477(var30, var31, var32, var33);
                            }
                            var22.method3475(0.0F);
                            var22.method3475(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3472();
        if (this.field8601.method357(-28830)) {
            arg1.method1281(this.field8601, 0, arg2 ^ 0x163A);
            arg1.method1281(this.field8605, 1, arg2 ^ 0x162F);
            arg1.method1285(true, this.field8596);
            arg1.method1276(0, var4 * 2, var4 * 4, false, class538.field7582, this.field8602, 0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public final void method3403(int arg0) {
        field8607++;
        this.field8601.method74((byte) 127);
        if (arg0 != -4906) {
            this.field8615 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(ILmj;I)V")
    private final void method3404(int arg0, class344 arg1, int arg2) {
        field8597++;
        class414.field5557 = arg1.field4596;
        arg1.method2016(9, (float) arg2);
        arg1.method2003(16);
        if (arg0 != 0) {
            field8606 = null;
        }
        arg1.method2034((byte) 41, false);
        arg1.method2029(arg0 ^ 0x7, false);
        arg1.method2011(false);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZI)V")
    public static final void method3405(int arg0, boolean arg1, int arg2) {
        if (class436.field6154 != arg0) {
            class684.field9645 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class684.field9645[var3] = (var3 << 12) / arg0;
            }
            class436.field6154 = arg0;
            class204.field2414 = arg0 - 1;
            class674.field9391 = arg0 * 32;
        }
        if (arg1) {
            field8613 = null;
        }
        field8612++;
        if (class407.field5435 == arg2) {
            return;
        }
        if (class436.field6154 == arg2) {
            class695.field9740 = class684.field9645;
        } else {
            class695.field9740 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class695.field9740[var4] = (var4 << 12) / arg2;
            }
        }
        class407.field5435 = arg2;
        class156.field1746 = arg2 - 1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)I")
    public static final int method3406(byte arg0, int arg1) {
        int var2 = -119 / ((arg0 + 27) / 59);
        field8604++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public static void method3407(int arg0) {
        field8613 = null;
        field8610 = null;
        field8606 = null;
        if (arg0 != 5439) {
            method3405(-41, false, -54);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLmj;)V")
    private final void method3408(boolean arg0, class344 arg1) {
        field8608++;
        class414.field5557 = arg1.field4596;
        arg1.method2021(0);
        arg1.method2034((byte) 41, arg0);
        arg1.method2029(7, false);
        arg1.method2011(arg0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILmj;)V")
    public final void method3409(int arg0, class344 arg1) {
        field8609++;
        if (arg0 == -16645) {
            this.field8601.method353(786336, 24, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lmj;B)V")
    private final void method3410(class344 arg0, byte arg1) {
        if (arg1 != 81) {
            method3407(71);
        }
        field8598++;
        arg0.method2029(arg1 ^ 0x56, true);
        arg0.method2034((byte) 41, true);
        if (class414.field5557 != arg0.field4596) {
            arg0.method949(class414.field5557);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lmj;)V")
    public class611(class344 arg0) {
        this.field8596 = arg0.method1279(-106, new class436[] { new class436(new class615[] { class615.field8653, class615.field8663, class615.field8665 }), new class436(class615.field8658) });
        this.field8601 = arg0.method1283(true, -1);
        this.field8605 = arg0.method1283(false, -1);
        this.field8605.method353(393168, 12, (byte) 82);
        this.field8602 = arg0.method1326(-97, false);
        this.field8602.method73(49146, (byte) -55);
        Buffer var2 = this.field8602.method75(true, 21281);
        if (var2 != null) {
            Stream var3 = arg0.method1980((byte) -74, var2);
            if (Stream.method3480()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3468(var7);
                    var3.method3468(var7 + 1);
                    var3.method3468(var7 + 2);
                    var3.method3468(var7 + 2);
                    var3.method3468(var7 + 3);
                    var3.method3468(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3478(var5);
                    var3.method3478(var5 + 1);
                    var3.method3478(var5 + 2);
                    var3.method3478(var5 + 2);
                    var3.method3478(var5 + 3);
                    var3.method3478(var5);
                }
            }
            var3.method3472();
            this.field8602.method71(-26305);
        }
        Buffer var8 = this.field8605.method354(true, true);
        if (var8 != null) {
            Stream var9 = arg0.method1980((byte) -74, var8);
            if (Stream.method3480()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3469(0.0F);
                    var9.method3469(-1.0F);
                    var9.method3469(0.0F);
                    var9.method3469(0.0F);
                    var9.method3469(-1.0F);
                    var9.method3469(0.0F);
                    var9.method3469(0.0F);
                    var9.method3469(-1.0F);
                    var9.method3469(0.0F);
                    var9.method3469(0.0F);
                    var9.method3469(-1.0F);
                    var9.method3469(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3475(0.0F);
                    var9.method3475(-1.0F);
                    var9.method3475(0.0F);
                    var9.method3475(0.0F);
                    var9.method3475(-1.0F);
                    var9.method3475(0.0F);
                    var9.method3475(0.0F);
                    var9.method3475(-1.0F);
                    var9.method3475(0.0F);
                    var9.method3475(0.0F);
                    var9.method3475(-1.0F);
                    var9.method3475(0.0F);
                }
            }
            var9.method3472();
            this.field8605.method357(-28830);
        }
    }
}
