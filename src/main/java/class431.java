import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class431 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Z")
    public boolean field6017;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
    public static int[] field6023 = new int[3];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "F")
    public static float field6018;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lvc;")
    public class288 field6021;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Lvc;")
    public class288 field6026;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
    public boolean field6022;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z")
    public final boolean method2474(boolean arg0) {
        field6024++;
        if (arg0) {
            return this.field6022 && !this.field6017;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lwca;[[BI)V")
    public static final void method2475(class630 arg0, byte[][] arg1, int arg2) {
        if (arg2 != 7) {
            field6018 = 0.9716647F;
        }
        for (int var3 = 0; var3 < arg0.field3985; var3++) {
            class466.method2634(arg2 - 2);
            for (int var4 = 0; var4 < (class401.field5620 >> 3); var4++) {
                for (int var5 = 0; var5 < class257.field3508 >> 3; var5++) {
                    int var6 = class281.field3846[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3029206) >> 24;
                        if (!arg0.field3981 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class111.field1540.length; var12++) {
                                if (class111.field1540[var12] == var11 && arg1[var12] != null) {
                                    arg0.method3532(class151.field2218, var8, (var10 & 0x7) * 8, var3, -72, arg1[var12], (var9 & 0x7) * 8, class334.field4506, var5 * 8, var7, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field6025++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method2476(byte arg0) {
        field6023 = null;
        if (arg0 > -70) {
            field6018 = 0.029571913F;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I")
    public static final int method2477(boolean arg0, int arg1, int arg2) {
        field6020++;
        if (arg0) {
            return 0;
        }
        class373 var3 = class687.method3877(arg2, arg0, arg1 + 899225105);
        if (var3 == null) {
            return class557.field7504.method303(arg2, 16264).field7543;
        }
        int var4 = 0;
        if (arg1 != -899225085) {
            field6018 = 0.16953632F;
        }
        for (int var5 = 0; var5 < var3.field5021.length; var5++) {
            if (var3.field5021[var5] == -1) {
                var4++;
            }
        }
        return var4 + class557.field7504.method303(arg2, 16264).field7543 - var3.field5021.length;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method2478(int arg0) {
        if (this.field6026 != null) {
            this.field6026.method1122(-1620);
        }
        field6019++;
        this.field6022 = false;
        if (arg0 != -95837245) {
            this.field6022 = true;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
    public static final void method2479(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class520.field7082 = class401.field5619.method203() > 0;
        class260.field3544 = arg15;
        class167.field2435 = arg1 >> class588.field8259;
        class353.field4699 = arg3 >> class588.field8259;
        class703.field9952 = arg1;
        class33.field416 = arg3;
        class599.field8372 = arg2;
        class361.field4763 = class167.field2435 - class36.field428;
        if (class361.field4763 < 0) {
            class550.field7440 = -class361.field4763;
            class361.field4763 = 0;
        } else {
            class550.field7440 = 0;
        }
        class154.field2265 = class353.field4699 - class36.field428;
        if (class154.field2265 < 0) {
            class293.field4026 = -class154.field2265;
            class154.field2265 = 0;
        } else {
            class293.field4026 = 0;
        }
        class601.field8384 = class36.field428 + class167.field2435;
        if (class601.field8384 > class335.field4511) {
            class601.field8384 = class335.field4511;
        }
        class400.field5612 = class36.field428 + class353.field4699;
        if (class400.field5612 > class643.field8878) {
            class400.field5612 = class643.field8878;
        }
        boolean[][] var16 = class147.field2093;
        boolean[][] var17 = class133.field1903;
        if (class260.field3544) {
            for (int var18 = 0; var18 < class36.field428 + class36.field428 + 2; var18++) {
                for (int var21 = 0; var21 < class36.field428 + class36.field428 + 2; var21++) {
                    int var22 = class167.field2435 + var18 - class36.field428;
                    int var23 = class353.field4699 + var21 - class36.field428;
                    if (var22 >= 0 && var23 >= 0 && var22 < class335.field4511 && var23 < class643.field8878) {
                        int var24 = var22 << class588.field8259;
                        int var25 = var23 << class588.field8259;
                        int var26 = class497.field6766[class497.field6766.length - 1].method332(var23, 1, var22) - (0x3E8 << class588.field8259 - 7);
                        int var27 = class52.field606 == null ? class497.field6766[0].method332(var23, 1, var22) + class631.field8750 : class52.field606[0].method332(var23, 1, var22) + class631.field8750;
                        class133.field1903[var18][var21] = class401.field5619.method145(var24, var26, var25, var24, var27, var25);
                    } else {
                        class133.field1903[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class36.field428 + class36.field428 + 1; var19++) {
                for (int var20 = 0; var20 < class36.field428 + class36.field428 + 1; var20++) {
                    class147.field2093[var19][var20] = class133.field1903[var19][var20] || class133.field1903[var19 + 1][var20] || class133.field1903[var19][var20 + 1] || class133.field1903[var19 + 1][var20 + 1];
                }
            }
            class219.field3069 = arg5;
            class171.field2478 = arg6;
            class16.field168 = arg7;
            class532.field7195 = arg8;
            class367.field4940 = arg9;
            class613.method3429(class401.field5619, true, arg10);
        } else {
            if (class158.field2311 == null) {
                class158.field2311 = new boolean[class335.field4511 + class335.field4511 + 1][class643.field8878 + class335.field4511 + 1];
                for (int var28 = 0; var28 < class158.field2311.length; var28++) {
                    for (int var29 = 0; var29 < class158.field2311[0].length; var29++) {
                        class158.field2311[var28][var29] = true;
                    }
                }
            }
            class133.field1903 = class158.field2311;
            class147.field2093 = class158.field2311;
            class361.field4763 = 0;
            class154.field2265 = 0;
            class601.field8384 = class335.field4511;
            class400.field5612 = class643.field8878;
            class547.field7414 = 0;
        }
        class513.method2940(class401.field5619, 0);
        for (class614 var30 = (class614) class300.field4089.method3898((byte) -101); var30 != null; var30 = (class614) class300.field4089.method3902(true)) {
            var30.method3074((byte) 48);
            class417.method2413(false, var30);
        }
        if (class520.field7082) {
            for (int var31 = 0; var31 < class53.field609; var31++) {
                class334.field4501[var31].method924(arg14, arg0, (byte) 95);
            }
        }
        if (class17.field174) {
            class43.field510 = class401.field5619.method124();
            class401.field5619.method174(class88.field1279);
            int var32 = (class88.field1279[2] - class88.field1279[0]) / class259.field3519;
            for (int var33 = 0; var33 < class259.field3519 - 1; var33++) {
                class645.field8917[var33] = (var33 + 1) * var32 + class479.field6610[var33];
            }
            for (int var34 = 0; var34 < class494.field6736.length; var34++) {
                class494.field6736[var34].method1134();
            }
        }
        if (class310.field4290 != null) {
            if (class17.field174) {
                class32.method306(0);
            }
            class503.method2881(true);
            class401.field5619.method137(-1, 1583160, 40, 127);
            class571.method3271(true, arg4, arg10, arg11);
            if (class17.field174) {
                class48.method391();
            }
            class401.field5619.method143();
            class503.method2881(false);
        }
        class571.method3271(false, arg4, arg10, arg11);
        if (class17.field174) {
            for (int var35 = 0; var35 < class107.field1493; var35++) {
                class497.field6756[var35] = class598.field8354[var35];
            }
            class32.method306(0);
            for (int var36 = 0; var36 < class494.field6736.length; var36++) {
                class494.field6736[var36].method1134();
            }
        }
        if (class17.field174) {
            class48.method391();
            for (int var37 = 0; var37 < class107.field1493; var37++) {
                class598.field8354[var37] = class497.field6756[var37];
            }
            if (class152.field2223 == 2) {
                int var10002;
                if (class160.field2319[0] < class160.field2319[1]) {
                    if (class645.field8917[0] + class479.field6610[0] > class88.field1279[0]) {
                        var10002 = class479.field6610[0]++;
                    }
                } else if (class160.field2319[0] > class160.field2319[1] && class645.field8917[0] + class479.field6610[0] < class88.field1279[2]) {
                    var10002 = class479.field6610[0]--;
                }
            }
        }
        if (!class260.field3544) {
            class147.field2093 = var16;
            class133.field1903 = var17;
        }
        class467.method2637();
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Z)V")
    public class431(boolean arg0) {
        this.field6017 = arg0;
    }
}
