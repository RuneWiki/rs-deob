import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class171 extends class172 {

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[B")
    public byte[] field3153;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Lid;")
    public static class149 field3158 = class60.method382("", (byte) 19);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "J")
    public static long field3157 = 0L;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lid;")
    public static class149 field3155 = field3158;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lid;")
    public static class149 field3154 = field3158;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field3152 = 10;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lve;")
    public static class189 field3150 = new class189(64);

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field3161 = 50;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "[I")
    public static int[] field3164 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "[I")
    public static int[] field3163 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[I")
    public static int[] field3162 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "[I")
    public static int[] field3166 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "[I")
    public static int[] field3160 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "[Lid;")
    public static class149[] field3167 = new class149[field3161];

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "[I")
    public static int[] field3168 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
    public static int[] field3165 = new int[field3161];

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method1226(int arg0) {
        field3156++;
        if (arg0 < -44) {
            class138.field2520.method1291(0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIBI[[[Lra;I)Z")
    public static final boolean method1227(boolean arg0, int arg1, byte arg2, int arg3, class231[][][] arg4, int arg5) {
        field3151++;
        byte var6 = arg0 ? 1 : (byte) (class86.field1567 & 0xFF);
        if (class135.field2449[class277.field4948][arg5][arg1] == var6) {
            return false;
        } else if ((class69.field1215[class277.field4948][arg5][arg1] & 0x4) == 0) {
            return false;
        } else {
            if (arg2 != 79) {
                method1227(false, -63, (byte) -104, -11, (class231[][][]) null, 83);
            }
            byte var7 = 0;
            int var8 = 0;
            class16.field231[var7] = arg5;
            int var31 = var7 + 1;
            class119.field2032[var7] = arg1;
            class135.field2449[class277.field4948][arg5][arg1] = var6;
            while (var31 != var8) {
                int var9 = class16.field231[var8] & 0xFFFF;
                int var10 = (class16.field231[var8] & 0xFF5289) >> 16;
                int var11 = class16.field231[var8] >> 24 & 0xFF;
                int var12 = (class119.field2032[var8] & 0xFF3613) >> 16;
                boolean var13 = false;
                boolean var14 = false;
                int var15 = class119.field2032[var8] & 0xFFFF;
                if ((class69.field1215[class277.field4948][var9][var15] & 0x4) == 0) {
                    var14 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                label229: for (int var16 = class277.field4948 + 1; var16 <= 3; var16++) {
                    if ((class69.field1215[var16][var9][var15] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var15] != null) {
                            if (arg4[var16][var9][var15].field4053 != null) {
                                int var19 = class131.method914(var10, -13520);
                                if (arg4[var16][var9][var15].field4053.field2205 == var19 || arg4[var16][var9][var15].field4053.field2204 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class131.method914(var11, -13520);
                                    if (arg4[var16][var9][var15].field4053.field2205 == var20 || arg4[var16][var9][var15].field4053.field2204 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class131.method914(var12, -13520);
                                    if (arg4[var16][var9][var15].field4053.field2205 == var21 || arg4[var16][var9][var15].field4053.field2204 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var15].field4061 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var15].field4047; var22++) {
                                    int var23 = (int) (arg4[var16][var9][var15].field4061[var22].field338 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg4[var16][var9][var15].field4061[var22].field338 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class231 var26 = arg4[var16][var9][var15];
                        if (var26 != null && var26.field4047 > 0) {
                            for (int var27 = 0; var27 < var26.field4047; var27++) {
                                class23 var28 = var26.field4061[var27];
                                if (var28.field331 != var28.field318 || var28.field342 != var28.field330) {
                                    for (int var29 = var28.field318; var29 <= var28.field331; var29++) {
                                        for (int var30 = var28.field330; var30 <= var28.field342; var30++) {
                                            class135.field2449[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class135.field2449[var16][var9][var15] = var6;
                    }
                }
                if (var13) {
                    if (class151.field2749[arg3] < class189.field3393[class277.field4948 + 1][var9][var15]) {
                        class151.field2749[arg3] = class189.field3393[class277.field4948 + 1][var9][var15];
                    }
                    int var17 = var15 << 7;
                    int var18 = var9 << 7;
                    if (class190.field3409[arg3] > var18) {
                        class190.field3409[arg3] = var18;
                    } else if (class24.field355[arg3] < var18) {
                        class24.field355[arg3] = var18;
                    }
                    if (class94.field1661[arg3] > var17) {
                        class94.field1661[arg3] = var17;
                    } else if (class216.field3808[arg3] < var17) {
                        class216.field3808[arg3] = var17;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class135.field2449[class277.field4948][var9 - 1][var15] != var6) {
                        class16.field231[var31] = class40.method238(-754974720, class40.method238(var9 - 1, 1179648));
                        class119.field2032[var31] = class40.method238(1245184, var15);
                        var31 = var31 + 1 & 0xFFF;
                        class135.field2449[class277.field4948][var9 - 1][var15] = var6;
                    }
                    var15++;
                    if (var15 < 104) {
                        if ((var9 - 1) >= 0 && class135.field2449[class277.field4948][var9 - 1][var15] != var6 && (class69.field1215[class277.field4948][var9][var15] & 0x4) == 0 && (class69.field1215[class277.field4948][var9 - 1][var15 - 1] & 0x4) == 0) {
                            class16.field231[var31] = class40.method238(1375731712, class40.method238(1179648, var9 - 1));
                            class119.field2032[var31] = class40.method238(var15, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class135.field2449[class277.field4948][var9 - 1][var15] = var6;
                        }
                        if (class135.field2449[class277.field4948][var9][var15] != var6) {
                            class16.field231[var31] = class40.method238(class40.method238(var9, 5373952), 318767104);
                            class119.field2032[var31] = class40.method238(var15, 5439488);
                            class135.field2449[class277.field4948][var9][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class135.field2449[class277.field4948][var9 + 1][var15] != var6 && (class69.field1215[class277.field4948][var9][var15] & 0x4) == 0 && (class69.field1215[class277.field4948][var9 + 1][var15 - 1] & 0x4) == 0) {
                            class16.field231[var31] = class40.method238(-1845493760, class40.method238(5373952, var9 + 1));
                            class119.field2032[var31] = class40.method238(var15, 5439488);
                            class135.field2449[class277.field4948][var9 + 1][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var15--;
                    if ((var9 + 1) < 104 && class135.field2449[class277.field4948][var9 + 1][var15] != var6) {
                        class16.field231[var31] = class40.method238(class40.method238(9568256, var9 + 1), 1392508928);
                        class119.field2032[var31] = class40.method238(var15, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class135.field2449[class277.field4948][var9 + 1][var15] = var6;
                    }
                    var15--;
                    if (var15 >= 0) {
                        if ((var9 - 1) >= 0 && class135.field2449[class277.field4948][var9 - 1][var15] != var6 && (class69.field1215[class277.field4948][var9][var15] & 0x4) == 0 && (class69.field1215[class277.field4948][var9 - 1][var15 + 1] & 0x4) == 0) {
                            class16.field231[var31] = class40.method238(class40.method238(var9 - 1, 13762560), 301989888);
                            class119.field2032[var31] = class40.method238(13828096, var15);
                            class135.field2449[class277.field4948][var9 - 1][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class135.field2449[class277.field4948][var9][var15] != var6) {
                            class16.field231[var31] = class40.method238(-1828716544, class40.method238(13762560, var9));
                            class119.field2032[var31] = class40.method238(13828096, var15);
                            class135.field2449[class277.field4948][var9][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class135.field2449[class277.field4948][var9 + 1][var15] != var6 && (class69.field1215[class277.field4948][var9][var15] & 0x4) == 0 && (class69.field1215[class277.field4948][var9 + 1][var15 + 1] & 0x4) == 0) {
                            class16.field231[var31] = class40.method238(class40.method238(var9 + 1, 9568256), -771751936);
                            class119.field2032[var31] = class40.method238(var15, 9633792);
                            class135.field2449[class277.field4948][var9 + 1][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class151.field2749[arg3] != -1000000) {
                class151.field2749[arg3] += 10;
                class190.field3409[arg3] -= 50;
                class24.field355[arg3] += 50;
                class216.field3808[arg3] += 50;
                class94.field1661[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
    public class171(byte[] arg0) {
        this.field3153 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method1228(boolean arg0) {
        field3168 = null;
        field3158 = null;
        field3166 = null;
        if (arg0) {
            field3168 = null;
        }
        field3164 = null;
        field3163 = null;
        field3150 = null;
        field3167 = null;
        field3155 = null;
        field3165 = null;
        field3162 = null;
        field3160 = null;
        field3154 = null;
    }
}
