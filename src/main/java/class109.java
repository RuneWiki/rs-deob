import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class109 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILij;JLij;Lij;)V")
    public static final void method800(int arg0, int arg1, int arg2, int arg3, class166 arg4, long arg5, class166 arg6, class166 arg7) {
        class39 var9 = new class39();
        var9.field782 = arg4;
        var9.field786 = arg1 * 128 + 64;
        var9.field773 = arg2 * 128 + 64;
        var9.field767 = arg3;
        var9.field771 = arg5;
        var9.field776 = arg6;
        var9.field765 = arg7;
        int var10 = 0;
        class177 var11 = class75.field1463[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3012; var12++) {
                class154 var13 = var11.field3017[var12];
                if ((var13.field2702 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2698.method2();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field788 = -var10;
        if (class75.field1463[arg0][arg1][arg2] == null) {
            class75.field1463[arg0][arg1][arg2] = new class177(arg0, arg1, arg2);
        }
        class75.field1463[arg0][arg1][arg2].field3019 = var9;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method801(int arg0) {
        if (arg0 != 29995) {
            method801(-127);
        }
        class187.field3246.method833(0);
        class253.field4349.method833(arg0 - 29995);
        class187.field3245.method833(0);
        field2026++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static final void method802() {
        int var0 = class79.field1546[class189.field3257];
        class217[] var1 = class79.field1548[class189.field3257];
        class20.field420 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class217 var3 = var1[var2];
            if (class242.field4196 != null) {
                for (int var4 = 0; var4 < class242.field4196.length; var4++) {
                    if (class242.field4196[var4] != -1000000 && (var3.field3670 <= class242.field4196[var4] || var3.field3683 <= class242.field4196[var4]) && (var3.field3680 <= class1.field9[var4] || var3.field3667 <= class1.field9[var4]) && (var3.field3680 >= class175.field2984[var4] || var3.field3667 >= class175.field2984[var4]) && (var3.field3669 <= class71.field1402[var4] || var3.field3689 <= class71.field1402[var4]) && (var3.field3669 >= class62.field1276[var4] || var3.field3689 >= class62.field1276[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field3668 == 1) {
                int var5 = var3.field3687 + class11.field212 - class207.field3546;
                if (var5 >= 0 && var5 <= class11.field212 + class11.field212) {
                    int var6 = var3.field3684 + class11.field212 - class228.field3836;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field3685 + class11.field212 - class228.field3836;
                    if (var7 > class11.field212 + class11.field212) {
                        var7 = class11.field212 + class11.field212;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class14.field315[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class26.field512 - var3.field3680;
                        if (var9 > 32) {
                            var3.field3690 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field3690 = 2;
                            var9 = -var9;
                        }
                        var3.field3671 = (var3.field3669 - class224.field3765 << 8) / var9;
                        var3.field3672 = (var3.field3689 - class224.field3765 << 8) / var9;
                        var3.field3674 = (var3.field3670 - class18.field393 << 8) / var9;
                        var3.field3679 = (var3.field3683 - class18.field393 << 8) / var9;
                        class179.field3090[class20.field420++] = var3;
                    }
                }
            } else if (var3.field3668 == 2) {
                int var10 = var3.field3684 + class11.field212 - class228.field3836;
                if (var10 >= 0 && var10 <= class11.field212 + class11.field212) {
                    int var11 = var3.field3687 + class11.field212 - class207.field3546;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field3686 + class11.field212 - class207.field3546;
                    if (var12 > class11.field212 + class11.field212) {
                        var12 = class11.field212 + class11.field212;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class14.field315[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class224.field3765 - var3.field3669;
                        if (var14 > 32) {
                            var3.field3690 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field3690 = 4;
                            var14 = -var14;
                        }
                        var3.field3678 = (var3.field3680 - class26.field512 << 8) / var14;
                        var3.field3666 = (var3.field3667 - class26.field512 << 8) / var14;
                        var3.field3674 = (var3.field3670 - class18.field393 << 8) / var14;
                        var3.field3679 = (var3.field3683 - class18.field393 << 8) / var14;
                        class179.field3090[class20.field420++] = var3;
                    }
                }
            } else if (var3.field3668 == 4) {
                int var15 = var3.field3670 - class18.field393;
                if (var15 > 128) {
                    int var16 = var3.field3684 + class11.field212 - class228.field3836;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field3685 + class11.field212 - class228.field3836;
                    if (var17 > class11.field212 + class11.field212) {
                        var17 = class11.field212 + class11.field212;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field3687 + class11.field212 - class207.field3546;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field3686 + class11.field212 - class207.field3546;
                        if (var19 > class11.field212 + class11.field212) {
                            var19 = class11.field212 + class11.field212;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class14.field315[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field3690 = 5;
                            var3.field3678 = (var3.field3680 - class26.field512 << 8) / var15;
                            var3.field3666 = (var3.field3667 - class26.field512 << 8) / var15;
                            var3.field3671 = (var3.field3669 - class224.field3765 << 8) / var15;
                            var3.field3672 = (var3.field3689 - class224.field3765 << 8) / var15;
                            class179.field3090[class20.field420++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBI)I")
    public static final int method803(int arg0, int arg1, byte arg2, int arg3) {
        field2024++;
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = 122 % ((arg2 - 50) / 54);
        int var7 = arg0;
        int var8 = arg3 & 0x7F;
        if (arg0 < 3 && (class233.field4007[1][var5][var4] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var9 = (128 - var8) * class243.field4208[var7][var5][var4] + class243.field4208[var7][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class243.field4208[var7][var5][var4 + 1] + (class243.field4208[var7][var5 + 1][var4 + 1] * var8) >> 7;
        int var11 = arg1 & 0x7F;
        return (128 - var11) * var9 + var10 * var11 >> 7;
    }
}
