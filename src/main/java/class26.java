import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class26 extends class3 {

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    private int field391 = 2048;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    private int field389 = 4096;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    private int field385 = 2048;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    private int field395 = 12288;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    private int field400 = 0;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
    private int field403 = 8192;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    private int field401 = 0;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static volatile int field394 = 0;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lfh;IZ)V", line = 6)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field390++;
        if (arg2) {
            this.method25((byte) 26, 93);
        }
        if (arg1 == 0) {
            this.field391 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field401 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field400 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field385 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field395 = arg0.method2250(-1613178296);
        } else if (arg1 == 5) {
            this.field389 = arg0.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field403 = arg0.method2250(-1613178296);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)[I", line = 86)
    public final int[] method25(byte arg0, int arg1) {
        if (arg0 < 57) {
            return (int[]) null;
        }
        field397++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1] - 2048;
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                int var6 = class163.field2591[var5] - 2048;
                int var7 = this.field391 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = var4 + this.field401;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = this.field400 + var6;
                int var13 = var4 + this.field385;
                int var14 = var11 > 2048 ? var11 - 4096 : var11;
                int var15 = var12 < -2048 ? var12 + 4096 : var12;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var13 >= -2048 ? var13 : var13 + 4096;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method224(var14, var9, -41) || this.method225(31426, var16, var18) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 140)
    public static final void method222(int arg0) {
        int var1 = 0;
        field392++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class342.method2417(var3, class264.field4230, true, var2, var1, -41)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 57) {
            method228((byte[]) null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILjava/lang/String;)I", line = 173)
    public static final int method223(int arg0, String arg1) {
        field387++;
        return arg0 == 1 ? arg1.length() + 1 : 119;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 345)
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(III)Z", line = 189)
    private final boolean method224(int arg0, int arg1, int arg2) {
        field388++;
        int var4 = 25 / ((16 - arg2) / 49);
        int var5 = (arg0 - arg1) * this.field395 >> 12;
        int var6 = class18.field225[(var5 * 255 & 0xFFF92) >> 12];
        int var7 = (var6 << 12) / this.field395;
        int var8 = (var7 << 12) / this.field403;
        int var9 = this.field389 * var8 >> 12;
        return var9 > (arg0 + arg1) && arg0 + arg1 > -var9;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(III)Z", line = 208)
    private final boolean method225(int arg0, int arg1, int arg2) {
        field384++;
        int var4 = (arg1 + arg2) * this.field395 >> 12;
        int var5 = class18.field225[var4 * 255 >> 12 & 0xFF];
        if (arg0 != 31426) {
            this.field395 = -27;
        }
        int var6 = (var5 << 12) / this.field395;
        int var7 = (var6 << 12) / this.field403;
        int var8 = this.field389 * var7 >> 12;
        return (arg2 - arg1) < var8 && arg2 - arg1 > -var8;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZIZ)V", line = 227)
    public static final void method226(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (class245.field3886) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class221.field3421 - class221.field3401) * var6 / 100 + class221.field3401;
            if (var7 < class49.field703) {
                var7 = class49.field703;
            } else if (class287.field4798 < var7) {
                var7 = class287.field4798;
            }
            int var8 = arg0 * var7 * 512 / (arg1 * 334);
            if (var8 < class9.field114) {
                short var9 = class9.field114;
                var7 = arg1 * var9 * 334 / (arg0 * 512);
                if (var7 > class287.field4798) {
                    var7 = class287.field4798;
                    int var10 = arg0 * 512 * var7 / (var9 * 334);
                    int var11 = (arg1 - var10) / 2;
                    if (arg3) {
                        class335.method2379();
                        class335.method2380(arg2, arg4, var11, arg0, 0);
                        class335.method2380(arg1 + arg2 - var11, arg4, var11, arg0, 0);
                    }
                    arg2 += var11;
                    arg1 -= var11 * 2;
                }
            } else if (class295.field4902 < var8) {
                short var12 = class295.field4902;
                var7 = arg1 * var12 * 334 / (arg0 * 512);
                if (var7 < class49.field703) {
                    var7 = class49.field703;
                    int var13 = arg1 * var12 * 334 / (var7 * 512);
                    int var14 = (arg0 - var13) / 2;
                    if (arg3) {
                        class335.method2379();
                        class335.method2380(arg2, arg4, arg1, var14, 0);
                        class335.method2380(arg2, arg4 + arg0 - var14, arg1, var14, 0);
                    }
                    arg0 -= var14 * 2;
                    arg4 += var14;
                }
            }
            class269.field4438 = arg0 * var7 / 334;
        }
        class315.field5192 = (short) arg1;
        class279.field4596 = arg4;
        class229.field3605 = (short) arg0;
        field396++;
        class153.field2481 = arg2;
        if (!arg5) {
            field399 = -115;
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V", line = 328)
    public final void method20(byte arg0) {
        field402++;
        int var2 = 9 % ((-arg0 - 20) / 58);
        class291.method2061(0);
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)V", line = 350)
    public static final void method227(byte arg0) {
        if (arg0 != -17) {
            return;
        }
        if (class274.field4513.toLowerCase().indexOf("microsoft") == -1) {
            class347.field5563[91] = 42;
            class347.field5563[47] = 73;
            class347.field5563[59] = 57;
            class347.field5563[61] = 27;
            class347.field5563[46] = 72;
            class347.field5563[93] = 43;
            class347.field5563[45] = 26;
            if (class274.field4520 == null) {
                class347.field5563[222] = 59;
                class347.field5563[192] = 58;
            } else {
                class347.field5563[192] = 28;
                class347.field5563[222] = 58;
                class347.field5563[520] = 59;
            }
            class347.field5563[44] = 71;
            class347.field5563[92] = 74;
        } else {
            class347.field5563[188] = 71;
            class347.field5563[220] = 74;
            class347.field5563[190] = 72;
            class347.field5563[219] = 42;
            class347.field5563[187] = 27;
            class347.field5563[186] = 57;
            class347.field5563[189] = 26;
            class347.field5563[192] = 58;
            class347.field5563[191] = 73;
            class347.field5563[221] = 43;
            class347.field5563[222] = 59;
            class347.field5563[223] = 28;
        }
        field398++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([BB)V", line = 407)
    public static final void method228(byte[] arg0, byte arg1) {
        field386++;
        class313 var2 = new class313(arg0);
        var2.field5137 = arg0.length - 2;
        class2.field9 = var2.method2250(-1613178296);
        class105.field1522 = new byte[class2.field9][];
        class104.field1505 = new boolean[class2.field9];
        class18.field228 = new int[class2.field9];
        class233.field3709 = new byte[class2.field9][];
        class28.field419 = new int[class2.field9];
        class94.field1379 = new int[class2.field9];
        class322.field5289 = new int[class2.field9];
        var2.field5137 = arg0.length - (class2.field9 * 8) - 7;
        class300.field4961 = var2.method2250(-1613178296);
        class96.field1400 = var2.method2250(-1613178296);
        int var3 = (var2.method2224(-126) & 0xFF) + 1;
        for (int var4 = 0; var4 < class2.field9; var4++) {
            class18.field228[var4] = var2.method2250(-1613178296);
        }
        for (int var5 = 0; var5 < class2.field9; var5++) {
            class28.field419[var5] = var2.method2250(-1613178296);
        }
        for (int var6 = 0; var6 < class2.field9; var6++) {
            class322.field5289[var6] = var2.method2250(-1613178296);
        }
        for (int var7 = 0; var7 < class2.field9; var7++) {
            class94.field1379[var7] = var2.method2250(-1613178296);
        }
        int var8 = -106 / ((19 - arg1) / 32);
        var2.field5137 = arg0.length + 3 - (class2.field9 * 8) - (var3 * 3) - 7;
        class201.field3085 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class201.field3085[var9] = var2.method2249(-118);
            if (class201.field3085[var9] == 0) {
                class201.field3085[var9] = 1;
            }
        }
        var2.field5137 = 0;
        for (int var10 = 0; var10 < class2.field9; var10++) {
            int var11 = class322.field5289[var10];
            int var12 = class94.field1379[var10];
            int var13 = var11 * var12;
            boolean var14 = false;
            byte[] var15 = new byte[var13];
            byte[] var16 = new byte[var13];
            class105.field1522[var10] = var15;
            class233.field3709[var10] = var16;
            int var17 = var2.method2224(-121);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var13; var23++) {
                    var15[var23] = var2.method2200(-77);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var13; var24++) {
                        byte var25 = var16[var24] = var2.method2200(-83);
                        var14 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label89: while (true) {
                    if (var18 >= var11) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var20 = 0;
                        while (true) {
                            if (var11 <= var20) {
                                break label89;
                            }
                            for (int var21 = 0; var21 < var12; var21++) {
                                byte var22 = var16[var11 * var21 + var20] = var2.method2200(-83);
                                var14 |= var22 != -1;
                            }
                            var20++;
                        }
                    }
                    for (int var19 = 0; var19 < var12; var19++) {
                        var15[var18 + (var11 * var19)] = var2.method2200(87);
                    }
                    var18++;
                }
            }
            class104.field1505[var10] = var14;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IC)B", line = 574)
    public static final byte method229(int arg0, char arg1) {
        field393++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return arg0 <= 93 ? -41 : var2;
    }
}
