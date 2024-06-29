import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class347 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public int field4660 = 128;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public int field4664 = 128;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lit;")
    public static class555 field4657 = new class555();

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILqa;ZI)V")
    public static final void method2090(int arg0, class207 arg1, boolean arg2, int arg3) {
        field4663++;
        if (arg0 < 0 || arg3 < 0 || class107.field1643 == 0 || class593.field8555 == 0) {
            return;
        }
        arg1.method1365(class74.field1189, class483.field6818, class107.field1643, class593.field8555);
        arg1.method1308(class78.field1268, class231.field3282, class107.field1643, class593.field8555);
        class163 var4 = arg1.method1318();
        var4.method1040(class615.field8840, class309.field4176, class391.field5532, class309.field4171, class580.field7973, class532.field7451);
        arg1.method1355(var4);
        if (arg2) {
            return;
        }
        if (class608.field8767 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method1301();
            int var8 = (arg0 - class74.field1189) * var7 / class107.field1643;
            int var9 = (arg3 - class483.field6818) * var7 / class593.field8555;
            int var10 = arg1.method1282();
            int var11 = (arg0 - class74.field1189) * var10 / class107.field1643;
            int var12 = (arg3 - class483.field6818) * var10 / class593.field8555;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1042(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1042(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class32.field513 > var20 && class611.field8786 > var22) {
                    int var23 = class645.field9372.field6035;
                    if (var23 < 3 && (class80.field1299[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class608.field8767[var23].method1105(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class645.field9372.method337(0) - 1 << 6) >> 7;
                        var6 = (class645.field9372.method337(0) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class493.field6904 && (class226.field3238 & 0x40) != 0) {
                    class114 var24 = class512.method2969(class608.field8768, class103.field1566, (byte) 111);
                    if (var24 == null) {
                        class339.method2057((byte) -60);
                    } else {
                        class404.method2410(" ->", var6, (byte) -120, var5, 45, -1, true, 0L, class412.field5799, class65.field1111, false);
                    }
                } else {
                    if (class37.field767 == class163.field2363) {
                        class404.method2410("", var6, (byte) -120, var5, 49, -1, true, 0L, class98.field1501.method739(class173.field2491, -77), -1, false);
                    }
                    class32.field517++;
                    class404.method2410("", var6, (byte) -120, var5, 5, -1, true, 0L, class510.field7143, class153.field2308, false);
                }
            }
        }
        class555 var25 = class402.field5723;
        for (class254 var26 = (class254) var25.method3150(16); var26 != null; var26 = (class254) var25.method3147(16)) {
            if ((class37.field781 || class645.field9372.field6035 == var26.field3518) && var26.method1583(arg0, arg3, arg1, (byte) 114)) {
                if (var26.field3523 instanceof class188) {
                    class188 var27 = (class188) var26.field3523;
                    int var28 = var27.method337(0);
                    if ((var28 & 0x1) == 0 && (var27.field6037 & 0x7F) == 0 && (var27.field6029 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6037 & 0x7F) == 64 && (var27.field6029 & 0x7F) == 64) {
                        int var29 = var27.field6037 - (var27.method337(0) - 1 << 6);
                        int var30 = var27.field6029 - (var27.method337(0) - 1 << 6);
                        for (int var31 = 0; var31 < class480.field6764; var31++) {
                            class576 var38 = (class576) class278.field3837.method1242(0, (long) class586.field8386[var31]);
                            if (var38 != null) {
                                class109 var39 = var38.field7929;
                                if (class405.field5763 != var39.field592 && var39.field558) {
                                    int var40 = var39.field6037 - (var39.field1669.field8597 - 1 << 6);
                                    int var41 = var39.field6029 - (var39.field1669.field8597 - 1 << 6);
                                    if (var40 >= var29 && var39.field1669.field8597 <= var27.method337(0) - (var40 - var29 >> 7) && var41 >= var30 && var39.field1669.field8597 <= (var27.method337(0) - (var41 - var30 >> 7))) {
                                        class25.method291(var39, class645.field9372.field6035 != var26.field3518, (byte) -44);
                                        var39.field592 = class405.field5763;
                                    }
                                }
                            }
                        }
                        int var32 = class559.field7738;
                        int[] var33 = class358.field4825;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class188 var35 = class349.field4696[var33[var34]];
                            if (var35 != null && class405.field5763 != var35.field592 && var27 != var35 && var35.field558) {
                                int var36 = var35.field6037 - (var35.method337(0) - 1 << 6);
                                int var37 = var35.field6029 - (var35.method337(0) - 1 << 6);
                                if (var29 <= var36 && var35.method337(0) <= var27.method337(0) - (var36 - var29 >> 7) && var30 <= var37 && var35.method337(0) <= var27.method337(0) - (var37 - var30 >> 7)) {
                                    class590.method3459(class645.field9372.field6035 != var26.field3518, var35, 2098);
                                    var35.field592 = class405.field5763;
                                }
                            }
                        }
                    }
                    if (class405.field5763 == var27.field592) {
                        continue;
                    }
                    class590.method3459(class645.field9372.field6035 != var26.field3518, var27, 2098);
                    var27.field592 = class405.field5763;
                }
                if (var26.field3523 instanceof class109) {
                    class109 var42 = (class109) var26.field3523;
                    if (var42.field1669 != null) {
                        if ((var42.field1669.field8597 & 0x1) == 0 && (var42.field6037 & 0x7F) == 0 && (var42.field6029 & 0x7F) == 0 || (var42.field1669.field8597 & 0x1) == 1 && (var42.field6037 & 0x7F) == 64 && (var42.field6029 & 0x7F) == 64) {
                            int var43 = var42.field6037 - (var42.field1669.field8597 - 1 << 6);
                            int var44 = var42.field6029 - (var42.field1669.field8597 - 1 << 6);
                            for (int var45 = 0; var45 < class480.field6764; var45++) {
                                class576 var52 = (class576) class278.field3837.method1242(0, (long) class586.field8386[var45]);
                                if (var52 != null) {
                                    class109 var53 = var52.field7929;
                                    if (class405.field5763 != var53.field592 && var42 != var53 && var53.field558) {
                                        int var54 = var53.field6037 - (var53.field1669.field8597 - 1 << 6);
                                        int var55 = var53.field6029 - (var53.field1669.field8597 - 1 << 6);
                                        if (var54 >= var43 && (var42.field1669.field8597 - (var54 - var43 >> 7)) >= var53.field1669.field8597 && var44 <= var55 && var53.field1669.field8597 <= var42.field1669.field8597 - (var55 - var44 >> 7)) {
                                            class25.method291(var53, class645.field9372.field6035 != var26.field3518, (byte) -44);
                                            var53.field592 = class405.field5763;
                                        }
                                    }
                                }
                            }
                            int var46 = class559.field7738;
                            int[] var47 = class358.field4825;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class188 var49 = class349.field4696[var47[var48]];
                                if (var49 != null && class405.field5763 != var49.field592 && var49.field558) {
                                    int var50 = var49.field6037 - (var49.method337(0) - 1 << 6);
                                    int var51 = var49.field6029 - (var49.method337(0) - 1 << 6);
                                    if (var50 >= var43 && var49.method337(0) <= (var42.field1669.field8597 - (var50 - var43 >> 7)) && var51 >= var44 && var49.method337(0) <= (var42.field1669.field8597 - (var51 - var44 >> 7))) {
                                        class590.method3459(class645.field9372.field6035 != var26.field3518, var49, 2098);
                                        var49.field592 = class405.field5763;
                                    }
                                }
                            }
                        }
                        if (class405.field5763 == var42.field592) {
                            continue;
                        }
                        class25.method291(var42, class645.field9372.field6035 != var26.field3518, (byte) -44);
                        var42.field592 = class405.field5763;
                    }
                }
                if (var26.field3523 instanceof class119) {
                    int var56 = var26.field3526 + class519.field7304;
                    int var57 = class6.field80 + var26.field3522;
                    class93 var58 = (class93) class220.field3147.method1242(0, (long) (var56 | var26.field3518 << 28 | var57 << 14));
                    if (var58 != null) {
                        for (class335 var59 = (class335) var58.field1434.method467(3344); var59 != null; var59 = (class335) var58.field1434.method455((byte) -43)) {
                            class621 var60 = class181.field2574.method866(var59.field4461, (byte) 79);
                            if (!class493.field6904) {
                                if (class645.field9372.field6035 == var26.field3518) {
                                    String[] var61 = var60.field8898;
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        if (var61 != null && var61[var62] != null) {
                                            byte var63 = 0;
                                            if (var62 == 0) {
                                                var63 = 19;
                                            }
                                            int var64 = class212.field2998;
                                            if (var62 == 1) {
                                                var63 = 8;
                                            }
                                            if (var62 == 2) {
                                                var63 = 9;
                                            }
                                            if (var62 == 3) {
                                                var63 = 48;
                                            }
                                            if (var60.field8935 == var62) {
                                                var64 = var60.field8884;
                                            }
                                            if (var62 == 4) {
                                                var63 = 18;
                                            }
                                            if (var60.field8907 == var62) {
                                                var64 = var60.field8953;
                                            }
                                            class404.method2410("<col=ff9040>" + var60.field8924, var26.field3522, (byte) -120, var26.field3526, var63, -1, true, (long) var59.field4461, var61[var62], var64, false);
                                            class513.field7225++;
                                        }
                                    }
                                }
                                class627.field9152++;
                                class404.method2410("<col=ff9040>" + var60.field8924, var26.field3522, (byte) -120, var26.field3526, 1007, -1, true, (long) var59.field4461, class64.field1094.method739(class173.field2491, -102), class68.field1149, class645.field9372.field6035 != var26.field3518);
                            } else if (class645.field9372.field6035 == var26.field3518) {
                                class22 var65 = class328.field4396 == -1 ? null : class533.field7455.method3115(128, class328.field4396);
                                if ((class226.field3238 & 0x1) != 0 && (var65 == null || var60.method3628(class328.field4396, (byte) -61, var65.field323) != var65.field323)) {
                                    class41.field807++;
                                    class404.method2410(class494.field6922 + " -> <col=ff9040>" + var60.field8924, var26.field3522, (byte) -120, var26.field3526, 2, -1, true, (long) var59.field4461, class412.field5799, class65.field1111, false);
                                }
                            }
                        }
                    }
                }
                if (var26.field3523 instanceof class115) {
                    class115 var66 = (class115) var26.field3523;
                    class364 var67 = class18.field227.method1201((byte) 123, var66.method748(false));
                    if (var67.field4904 != null) {
                        var67 = var67.method2183(true, class189.field2681);
                    }
                    if (var67 != null) {
                        if (!class493.field6904) {
                            if (class645.field9372.field6035 == var26.field3518) {
                                String[] var68 = var67.field4937;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (var68[var69] != null) {
                                            short var70 = 0;
                                            int var71 = class212.field2998;
                                            if (var69 == 0) {
                                                var70 = 59;
                                            }
                                            if (var69 == 1) {
                                                var70 = 57;
                                            }
                                            if (var69 == 2) {
                                                var70 = 22;
                                            }
                                            if (var69 == 3) {
                                                var70 = 10;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1011;
                                            }
                                            if (var67.field4891 == var69) {
                                                var71 = var67.field4886;
                                            }
                                            if (var67.field4919 == var69) {
                                                var71 = var67.field4942;
                                            }
                                            class556.field7669++;
                                            class404.method2410("<col=00ffff>" + var67.field4880, var26.field3522, (byte) -120, var26.field3526, var70, -1, true, class221.method1420(var26.field3526, var26.field3522, arg2, var66), var68[var69], var71, false);
                                        }
                                    }
                                }
                            }
                            class404.method2410("<col=00ffff>" + var67.field4880, var26.field3522, (byte) -120, var26.field3526, 1008, -1, true, (long) var67.field4944, class64.field1094.method739(class173.field2491, 93), class68.field1149, class645.field9372.field6035 != var26.field3518);
                            class293.field4028++;
                        } else if (class645.field9372.field6035 == var26.field3518) {
                            class22 var72 = class328.field4396 == -1 ? null : class533.field7455.method3115(128, class328.field4396);
                            if ((class226.field3238 & 0x4) != 0 && (var72 == null || var67.method2185(class328.field4396, 8, var72.field323) != var72.field323)) {
                                class462.field6480++;
                                class404.method2410(class494.field6922 + " -> <col=00ffff>" + var67.field4880, var26.field3522, (byte) -120, var26.field3526, 58, -1, true, class221.method1420(var26.field3526, var26.field3522, false, var66), class412.field5799, class65.field1111, false);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILrm;)V")
    public final void method2091(int arg0, class347 arg1) {
        this.field4658 = arg1.field4658;
        if (arg0 > -74) {
            this.field4658 = 37;
        }
        this.field4661 = arg1.field4661;
        this.field4665 = arg1.field4665;
        this.field4660 = arg1.field4660;
        field4667++;
        this.field4666 = arg1.field4666;
        this.field4664 = arg1.field4664;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method2092(byte arg0) {
        field4657 = null;
        int var1 = 11 / ((-arg0 - 54) / 62);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BIILjava/lang/String;)I")
    public static final int method2093(byte[] arg0, int arg1, int arg2, String arg3) {
        field4659++;
        int var4 = arg3.length();
        int var5 = arg2;
        if (arg1 > -47) {
            method2092((byte) 32);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg3.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg0[var5++] = (byte) class73.method578(var7 >> 12, 224);
                arg0[var5++] = (byte) class73.method578(class589.method3454(4066, var7) >> 6, 128);
                arg0[var5++] = (byte) class73.method578(128, class589.method3454(63, var7));
            } else {
                arg0[var5++] = (byte) (class73.method578(var7, 12319) >> 6);
                arg0[var5++] = (byte) class73.method578(class589.method3454(63, var7), 128);
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Lrm;")
    public final class347 method2094(int arg0) {
        field4662++;
        return arg0 == 2 ? new class347(this.field4665, this.field4664, this.field4660, this.field4666, this.field4658, this.field4661) : null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
    public class347(int arg0) {
        this.field4665 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIII)V")
    private class347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4664 = arg1;
        this.field4660 = arg2;
        this.field4665 = arg0;
        this.field4666 = arg3;
        this.field4661 = arg5;
        this.field4658 = arg4;
    }

    static {
        new class104("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
