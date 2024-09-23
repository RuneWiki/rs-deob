import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KWOZHDOE")
public class class31 {

    @OriginalMember(owner = "KWOZHDOE", name = "a", descriptor = "I")
    private int field1045 = 974;

    @OriginalMember(owner = "KWOZHDOE", name = "k", descriptor = "[I")
    private int[] field1055 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "l", descriptor = "[I")
    private int[] field1056 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "m", descriptor = "[I")
    private int[] field1057 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "o", descriptor = "I")
    private int field1059 = 100;

    @OriginalMember(owner = "KWOZHDOE", name = "r", descriptor = "I")
    public int field1062 = 500;

    @OriginalMember(owner = "KWOZHDOE", name = "b", descriptor = "I")
    private static int field1046 = 1;

    @OriginalMember(owner = "KWOZHDOE", name = "w", descriptor = "[I")
    private static int[] field1067 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "x", descriptor = "[I")
    private static int[] field1068 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "y", descriptor = "[I")
    private static int[] field1069 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "z", descriptor = "[I")
    private static int[] field1070 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "A", descriptor = "[I")
    private static int[] field1071 = new int[5];

    @OriginalMember(owner = "KWOZHDOE", name = "n", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "KWOZHDOE", name = "s", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "KWOZHDOE", name = "p", descriptor = "LBMQRLUHC;")
    private class5 field1060;

    @OriginalMember(owner = "KWOZHDOE", name = "c", descriptor = "LYJSRODCC;")
    private class64 field1047;

    @OriginalMember(owner = "KWOZHDOE", name = "d", descriptor = "LYJSRODCC;")
    private class64 field1048;

    @OriginalMember(owner = "KWOZHDOE", name = "e", descriptor = "LYJSRODCC;")
    private class64 field1049;

    @OriginalMember(owner = "KWOZHDOE", name = "f", descriptor = "LYJSRODCC;")
    private class64 field1050;

    @OriginalMember(owner = "KWOZHDOE", name = "g", descriptor = "LYJSRODCC;")
    private class64 field1051;

    @OriginalMember(owner = "KWOZHDOE", name = "h", descriptor = "LYJSRODCC;")
    private class64 field1052;

    @OriginalMember(owner = "KWOZHDOE", name = "i", descriptor = "LYJSRODCC;")
    private class64 field1053;

    @OriginalMember(owner = "KWOZHDOE", name = "j", descriptor = "LYJSRODCC;")
    private class64 field1054;

    @OriginalMember(owner = "KWOZHDOE", name = "q", descriptor = "LYJSRODCC;")
    private class64 field1061;

    @OriginalMember(owner = "KWOZHDOE", name = "t", descriptor = "[I")
    private static int[] field1064;

    @OriginalMember(owner = "KWOZHDOE", name = "u", descriptor = "[I")
    private static int[] field1065;

    @OriginalMember(owner = "KWOZHDOE", name = "v", descriptor = "[I")
    private static int[] field1066;

    @OriginalMember(owner = "KWOZHDOE", name = "a", descriptor = "()V")
    public static final void method373() {
        field1065 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1065[var0] = 1;
            } else {
                field1065[var0] = -1;
            }
        }
        field1066 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1066[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1064 = new int[220500];
    }

    @OriginalMember(owner = "KWOZHDOE", name = "a", descriptor = "(II)[I")
    public final int[] method374(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1064[var3] = 0;
        }
        if (arg1 < 10) {
            return field1064;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1047.method573((byte) 0);
        this.field1048.method573((byte) 0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1049 != null) {
            this.field1049.method573((byte) 0);
            this.field1050.method573((byte) 0);
            var6 = (int) ((double) (this.field1049.field1634 - this.field1049.field1633) * 32.768D / var4);
            var7 = (int) ((double) this.field1049.field1633 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1051 != null) {
            this.field1051.method573((byte) 0);
            this.field1052.method573((byte) 0);
            var9 = (int) ((double) (this.field1051.field1634 - this.field1051.field1633) * 32.768D / var4);
            var10 = (int) ((double) this.field1051.field1633 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1055[var12] != 0) {
                field1067[var12] = 0;
                field1068[var12] = (int) ((double) this.field1057[var12] * var4);
                field1069[var12] = (this.field1055[var12] << 14) / 100;
                field1070[var12] = (int) ((double) (this.field1047.field1634 - this.field1047.field1633) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1056[var12]) / var4);
                field1071[var12] = (int) ((double) this.field1047.field1633 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1047.method574(arg0, true);
            int var42 = this.field1048.method574(arg0, true);
            if (this.field1049 != null) {
                int var43 = this.field1049.method574(arg0, true);
                int var44 = this.field1050.method574(arg0, true);
                var41 += this.method375(field1046, this.field1049.field1635, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1051 != null) {
                int var45 = this.field1051.method574(arg0, true);
                int var46 = this.field1052.method574(arg0, true);
                var42 = var42 * ((this.method375(field1046, this.field1051.field1635, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1055[var47] != 0) {
                    int var48 = field1068[var47] + var13;
                    if (var48 < arg0) {
                        field1064[var48] += this.method375(field1046, this.field1047.field1635, field1069[var47] * var42 >> 15, field1067[var47]);
                        field1067[var47] += (field1070[var47] * var41 >> 16) + field1071[var47];
                    }
                }
            }
        }
        if (this.field1053 != null) {
            this.field1053.method573((byte) 0);
            this.field1054.method573((byte) 0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1053.method574(arg0, true);
                int var19 = this.field1054.method574(arg0, true);
                int var20;
                if (var16) {
                    var20 = ((this.field1053.field1634 - this.field1053.field1633) * var18 >> 8) + this.field1053.field1633;
                } else {
                    var20 = ((this.field1053.field1634 - this.field1053.field1633) * var19 >> 8) + this.field1053.field1633;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1064[var17] = 0;
                }
            }
        }
        if (this.field1058 > 0 && this.field1059 > 0) {
            int var21 = (int) ((double) this.field1058 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1064[var22] += field1064[var22 - var21] * this.field1059 / 100;
            }
        }
        if (this.field1060.field37[0] > 0 || this.field1060.field37[1] > 0) {
            this.field1061.method573((byte) 0);
            int var23 = this.field1061.method574(arg0 + 1, true);
            int var24 = this.field1060.method58(-962, (float) var23 / 65536.0F, 0);
            int var25 = this.field1060.method58(-962, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1064[var24 + var26] * (long) class5.field44 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1064[var24 + var26 - var38 - 1] * (long) class5.field42[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1064[var26 - var39 - 1] * (long) class5.field42[1][var39] >> 16);
                    }
                    field1064[var26] = var37;
                    var23 = this.field1061.method574(arg0 + 1, true);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1064[var24 + var26] * (long) class5.field44 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1064[var24 + var26 - var35 - 1] * (long) class5.field42[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1064[var26 - var36 - 1] * (long) class5.field42[1][var36] >> 16);
                        }
                        field1064[var26] = var34;
                        var23 = this.field1061.method574(arg0 + 1, true);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1064[var24 + var26 - var31 - 1] * (long) class5.field42[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1064[var26 - var32 - 1] * (long) class5.field42[1][var32] >> 16);
                            }
                            field1064[var26] = var30;
                            this.field1061.method574(arg0 + 1, true);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1060.method58(-962, (float) var23 / 65536.0F, 0);
                    var25 = this.field1060.method58(-962, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1064[var40] < -32768) {
                field1064[var40] = -32768;
            }
            if (field1064[var40] > 32767) {
                field1064[var40] = 32767;
            }
        }
        return field1064;
    }

    @OriginalMember(owner = "KWOZHDOE", name = "a", descriptor = "(IIII)I")
    private final int method375(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 1 || arg0 > 1) {
            return 1;
        } else if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field1066[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field1065[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "KWOZHDOE", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public final void method376(class42 arg0, int arg1) {
        this.field1047 = new class64();
        this.field1047.method571(arg0, this.field1045);
        this.field1048 = new class64();
        this.field1048.method571(arg0, this.field1045);
        int var3 = arg0.method420();
        if (var3 != 0) {
            arg0.field1250--;
            this.field1049 = new class64();
            this.field1049.method571(arg0, this.field1045);
            this.field1050 = new class64();
            this.field1050.method571(arg0, this.field1045);
        }
        int var4 = arg0.method420();
        if (var4 != 0) {
            arg0.field1250--;
            this.field1051 = new class64();
            this.field1051.method571(arg0, this.field1045);
            this.field1052 = new class64();
            this.field1052.method571(arg0, this.field1045);
        }
        int var5 = arg0.method420();
        if (var5 != 0) {
            arg0.field1250--;
            this.field1053 = new class64();
            this.field1053.method571(arg0, this.field1045);
            this.field1054 = new class64();
            this.field1054.method571(arg0, this.field1045);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method434();
            if (var7 == 0) {
                break;
            }
            this.field1055[var6] = var7;
            this.field1056[var6] = arg0.method433();
            this.field1057[var6] = arg0.method434();
        }
        int var8 = 57 / arg1;
        this.field1058 = arg0.method434();
        this.field1059 = arg0.method434();
        this.field1062 = arg0.method422();
        this.field1063 = arg0.method422();
        this.field1060 = new class5();
        this.field1061 = new class64();
        this.field1060.method59((byte) 8, arg0, this.field1061);
    }
}
