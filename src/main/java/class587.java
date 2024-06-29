import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class587 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field8068 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[[I")
    public static int[][] field8071 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([[[Laf;IIBZI)Z")
    public static final boolean method3281(class651[][][] arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field8070++;
        byte var6 = arg4 ? 1 : (byte) (class426.field5928 & 0xFF);
        if (class361.field5210[class432.field5993][arg2][arg5] == var6) {
            return false;
        } else if ((class645.field9140[class432.field5993][arg2][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg3 >= -121) {
                field8068 = null;
            }
            class278.field3765[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class318.field4641[var7] = arg5;
            class361.field5210[class432.field5993][arg2][arg5] = var6;
            while (var35 != var8) {
                int var9 = class278.field3765[var8] & 0xFFFF;
                int var10 = class278.field3765[var8] >> 16 & 0xFF;
                int var11 = class278.field3765[var8] >> 24 & 0xFF;
                int var12 = class318.field4641[var8] & 0xFFFF;
                int var13 = (class318.field4641[var8] & 0xFFE59A) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class645.field9140[class432.field5993][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class432.field5993 + 1; var16 <= 3; var16++) {
                    if ((class645.field9140[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field9220 != null) {
                                int var20 = class667.method3700(var10, -20868);
                                if (arg0[var16][var9][var12].field9220.field1809 == var20 || arg0[var16][var9][var12].field9224 != null && arg0[var16][var9][var12].field9224.field1809 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class667.method3700(var11, -20868);
                                    if (arg0[var16][var9][var12].field9220.field1809 == var21 || arg0[var16][var9][var12].field9224 != null && arg0[var16][var9][var12].field9224.field1809 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class667.method3700(var13, -20868);
                                    if (arg0[var16][var9][var12].field9220.field1809 == var22 || arg0[var16][var9][var12].field9224 != null && arg0[var16][var9][var12].field9224.field1809 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class651 var23 = arg0[var16][var9][var12];
                            if (var23.field9228 != null) {
                                for (class82 var24 = var23.field9228; var24 != null; var24 = var24.field1024) {
                                    class293 var25 = var24.field1027;
                                    if (var25 instanceof class289) {
                                        class289 var26 = (class289) var25;
                                        int var27 = var26.method128((byte) 37);
                                        int var28 = var26.method126(20377);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class651 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field9228 != null) {
                            for (class82 var31 = var30.field9228; var31 != null; var31 = var31.field1024) {
                                class293 var32 = var31.field1027;
                                if (var32.field3928 != var32.field3921 || var32.field3923 != var32.field3920) {
                                    for (int var33 = var32.field3921; var33 <= var32.field3928; var33++) {
                                        for (int var34 = var32.field3920; var34 <= var32.field3923; var34++) {
                                            class361.field5210[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class361.field5210[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class397.field5666[class432.field5993 + 1].method150(var9, var12);
                    if (var17 > class197.field2603[arg1]) {
                        class197.field2603[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (var18 < class175.field2204[arg1]) {
                        class175.field2204[arg1] = var18;
                    } else if (var18 > class292.field3909[arg1]) {
                        class292.field3909[arg1] = var18;
                    }
                    if (var19 < class293.field3916[arg1]) {
                        class293.field3916[arg1] = var19;
                    } else if (var19 > class225.field2933[arg1]) {
                        class225.field2933[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class361.field5210[class432.field5993][var9 - 1][var12] != var6) {
                        class278.field3765[var35] = class288.method1722(-754974720, class288.method1722(1179648, var9 - 1));
                        class318.field4641[var35] = class288.method1722(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class361.field5210[class432.field5993][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class12.field113) {
                        if ((var9 - 1) >= 0 && class361.field5210[class432.field5993][var9 - 1][var12] != var6 && (class645.field9140[class432.field5993][var9][var12] & 0x4) == 0 && (class645.field9140[class432.field5993][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class278.field3765[var35] = class288.method1722(1375731712, class288.method1722(var9 - 1, 1179648));
                            class318.field4641[var35] = class288.method1722(var12, 1245184);
                            class361.field5210[class432.field5993][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class361.field5210[class432.field5993][var9][var12] != var6) {
                            class278.field3765[var35] = class288.method1722(318767104, class288.method1722(5373952, var9));
                            class318.field4641[var35] = class288.method1722(var12, 5439488);
                            class361.field5210[class432.field5993][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class588.field8082 && class361.field5210[class432.field5993][var9 + 1][var12] != var6 && (class645.field9140[class432.field5993][var9][var12] & 0x4) == 0 && (class645.field9140[class432.field5993][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class278.field3765[var35] = class288.method1722(-1845493760, class288.method1722(5373952, var9 + 1));
                            class318.field4641[var35] = class288.method1722(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class361.field5210[class432.field5993][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class588.field8082 > var9 + 1 && class361.field5210[class432.field5993][var9 + 1][var12] != var6) {
                        class278.field3765[var35] = class288.method1722(1392508928, class288.method1722(var9 + 1, 9568256));
                        class318.field4641[var35] = class288.method1722(9633792, var12);
                        class361.field5210[class432.field5993][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class361.field5210[class432.field5993][var9 - 1][var12] != var6 && (class645.field9140[class432.field5993][var9][var12] & 0x4) == 0 && (class645.field9140[class432.field5993][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class278.field3765[var35] = class288.method1722(class288.method1722(var9 - 1, 13762560), 301989888);
                            class318.field4641[var35] = class288.method1722(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class361.field5210[class432.field5993][var9 - 1][var12] = var6;
                        }
                        if (class361.field5210[class432.field5993][var9][var12] != var6) {
                            class278.field3765[var35] = class288.method1722(-1828716544, class288.method1722(13762560, var9));
                            class318.field4641[var35] = class288.method1722(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class361.field5210[class432.field5993][var9][var12] = var6;
                        }
                        if (class588.field8082 > (var9 + 1) && class361.field5210[class432.field5993][var9 + 1][var12] != var6 && (class645.field9140[class432.field5993][var9][var12] & 0x4) == 0 && (class645.field9140[class432.field5993][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class278.field3765[var35] = class288.method1722(-771751936, class288.method1722(var9 + 1, 9568256));
                            class318.field4641[var35] = class288.method1722(var12, 9633792);
                            class361.field5210[class432.field5993][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class197.field2603[arg1] != -1000000) {
                class197.field2603[arg1] += 10;
                class175.field2204[arg1] -= 50;
                class292.field3909[arg1] += 50;
                class225.field2933[arg1] += 50;
                class293.field3916[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method3282(byte arg0) {
        field8071 = null;
        int var1 = -108 / ((arg0 + 41) / 36);
        field8068 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public static final int method3283(int arg0, int arg1) {
        field8072++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0 != 1375731712) {
            method3283(-39, -112);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3284(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 != 3954) {
            return;
        }
        class204.field2681 = 0L;
        field8069++;
        int var5 = class42.method252(-128);
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class9.field103.method1992()) {
            arg4 = true;
        }
        class538.method3035(var5, arg0, arg3, arg2, arg4, (byte) -26);
    }
}
