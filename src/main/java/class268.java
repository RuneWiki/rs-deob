import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class268 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Llc;")
    public static class143 field4797 = class66.method374("Atteindre", -1);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Llc;")
    public static class143 field4805 = class66.method374("::qa_op_test", -1);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Llc;")
    public static class143 field4800 = class66.method374("mapflag", -1);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
    public static boolean field4804 = true;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[[I")
    public static int[][] field4808 = new int[104][104];

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public static boolean field4806 = true;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lli;")
    public static class191 field4799 = new class191();

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field4809 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Llc;")
    public static class143 field4810 = class66.method374("0", -1);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lda;")
    public static class102 field4803;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lqk;")
    public class51 field4802;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZI[[[Lch;I)Z")
    public static final boolean method1777(int arg0, int arg1, boolean arg2, int arg3, class120[][][] arg4, int arg5) {
        if (arg5 != -105) {
            method1779(83);
        }
        field4798++;
        byte var6 = arg2 ? 1 : (byte) (class141.field2460 & 0xFF);
        if (class36.field623[class170.field3044][arg3][arg0] == var6) {
            return false;
        } else if ((class231.field4225[class170.field3044][arg3][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class221.field4000[var7] = arg3;
            int var31 = var7 + 1;
            class1.field28[var7] = arg0;
            int var8 = 0;
            class36.field623[class170.field3044][arg3][arg0] = var6;
            while (var31 != var8) {
                int var9 = class221.field4000[var8] & 0xFFFF;
                int var10 = (class221.field4000[var8] & 0xFFD116) >> 16;
                int var11 = class1.field28[var8] & 0xFFFF;
                int var12 = class221.field4000[var8] >> 24 & 0xFF;
                int var13 = class1.field28[var8] >> 16 & 0xFF;
                boolean var14 = false;
                if ((class231.field4225[class170.field3044][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label229: for (int var16 = class170.field3044 + 1; var16 <= 3; var16++) {
                    if ((class231.field4225[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var11] != null) {
                            if (arg4[var16][var9][var11].field2131 != null) {
                                int var19 = class95.method556(var10, 640914416);
                                if (arg4[var16][var9][var11].field2131.field1100 == var19 || arg4[var16][var9][var11].field2131.field1104 == var19) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var20 = class95.method556(var12, 640914416);
                                    if (arg4[var16][var9][var11].field2131.field1100 == var20 || arg4[var16][var9][var11].field2131.field1104 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class95.method556(var13, 640914416);
                                    if (arg4[var16][var9][var11].field2131.field1100 == var21 || arg4[var16][var9][var11].field2131.field1104 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var11].field2144 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var11].field2134; var22++) {
                                    int var23 = (int) (arg4[var16][var9][var11].field2144[var22].field3928 >> 14 & 0x3FL);
                                    int var24 = (int) (arg4[var16][var9][var11].field2144[var22].field3928 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var12 != 0 && var12 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class120 var26 = arg4[var16][var9][var11];
                        if (var26 != null && var26.field2134 > 0) {
                            for (int var27 = 0; var27 < var26.field2134; var27++) {
                                class211 var28 = var26.field2144[var27];
                                if (var28.field3933 != var28.field3931 || var28.field3919 != var28.field3918) {
                                    for (int var29 = var28.field3931; var29 <= var28.field3933; var29++) {
                                        for (int var30 = var28.field3919; var30 <= var28.field3918; var30++) {
                                            class36.field623[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class36.field623[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    int var17 = var9 << 7;
                    if (class42.field707[arg1] < class192.field3535[class170.field3044 + 1][var9][var11]) {
                        class42.field707[arg1] = class192.field3535[class170.field3044 + 1][var9][var11];
                    }
                    int var18 = var11 << 7;
                    if (var17 < class63.field1196[arg1]) {
                        class63.field1196[arg1] = var17;
                    } else if (class159.field2863[arg1] < var17) {
                        class159.field2863[arg1] = var17;
                    }
                    if (var18 < class13.field245[arg1]) {
                        class13.field245[arg1] = var18;
                    } else if (var18 > class158.field2858[arg1]) {
                        class158.field2858[arg1] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class36.field623[class170.field3044][var9 - 1][var11] != var6) {
                        class221.field4000[var31] = class119.method729(-754974720, class119.method729(var9 - 1, 1179648));
                        class1.field28[var31] = class119.method729(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class36.field623[class170.field3044][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var9 - 1) >= 0 && class36.field623[class170.field3044][var9 - 1][var11] != var6 && (class231.field4225[class170.field3044][var9][var11] & 0x4) == 0 && (class231.field4225[class170.field3044][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class221.field4000[var31] = class119.method729(1375731712, class119.method729(1179648, var9 - 1));
                            class1.field28[var31] = class119.method729(1245184, var11);
                            class36.field623[class170.field3044][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class36.field623[class170.field3044][var9][var11] != var6) {
                            class221.field4000[var31] = class119.method729(class119.method729(5373952, var9), 318767104);
                            class1.field28[var31] = class119.method729(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class36.field623[class170.field3044][var9][var11] = var6;
                        }
                        if (var9 + 1 < 104 && class36.field623[class170.field3044][var9 + 1][var11] != var6 && (class231.field4225[class170.field3044][var9][var11] & 0x4) == 0 && (class231.field4225[class170.field3044][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class221.field4000[var31] = class119.method729(class119.method729(var9 + 1, 5373952), -1845493760);
                            class1.field28[var31] = class119.method729(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class36.field623[class170.field3044][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class36.field623[class170.field3044][var9 + 1][var11] != var6) {
                        class221.field4000[var31] = class119.method729(class119.method729(9568256, var9 + 1), 1392508928);
                        class1.field28[var31] = class119.method729(var11, 9633792);
                        class36.field623[class170.field3044][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var9 - 1 >= 0 && class36.field623[class170.field3044][var9 - 1][var11] != var6 && (class231.field4225[class170.field3044][var9][var11] & 0x4) == 0 && (class231.field4225[class170.field3044][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class221.field4000[var31] = class119.method729(class119.method729(13762560, var9 - 1), 301989888);
                            class1.field28[var31] = class119.method729(13828096, var11);
                            class36.field623[class170.field3044][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class36.field623[class170.field3044][var9][var11] != var6) {
                            class221.field4000[var31] = class119.method729(class119.method729(var9, 13762560), -1828716544);
                            class1.field28[var31] = class119.method729(var11, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class36.field623[class170.field3044][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class36.field623[class170.field3044][var9 + 1][var11] != var6 && (class231.field4225[class170.field3044][var9][var11] & 0x4) == 0 && (class231.field4225[class170.field3044][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class221.field4000[var31] = class119.method729(-771751936, class119.method729(9568256, var9 + 1));
                            class1.field28[var31] = class119.method729(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class36.field623[class170.field3044][var9 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class42.field707[arg1] != -1000000) {
                class42.field707[arg1] += 10;
                class63.field1196[arg1] -= 50;
                class159.field2863[arg1] += 50;
                class158.field2858[arg1] += 50;
                class13.field245[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lrb;BZ)V")
    public static final void method1778(class193 arg0, byte arg1, boolean arg2) {
        if (arg2) {
            int var3 = class269.field4820;
            int var4 = var3 * 956 / 503;
            class271.field4835.method1065((class10.field222 - var4) / 2, 0, var4, var3);
            class79.field1438.method598(class10.field222 / 2 - class79.field1438.field3940 / 2, 18);
        }
        arg0.method1325(class191.field3511, class10.field222 / 2, class269.field4820 / 2 - 26, 16777215, -1);
        int var5 = class269.field4820 / 2 - 18;
        if (arg1 != -55) {
            return;
        }
        field4801++;
        class260.method1729(class10.field222 / 2 - 152, var5, 304, 34, 9179409);
        class260.method1729(class10.field222 / 2 - 151, var5 + 1, 302, 32, 0);
        class260.method1726(class10.field222 / 2 - 150, var5 + 2, class43.field876 * 3, 30, 9179409);
        class260.method1726(class43.field876 * 3 + (class10.field222 / 2 - 150), var5 - -2, 300 - class43.field876 * 3, 30, 0);
        arg0.method1325(class194.field3592, class10.field222 / 2, class269.field4820 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method1779(int arg0) {
        field4808 = null;
        field4805 = null;
        field4799 = null;
        field4797 = null;
        field4800 = null;
        field4803 = null;
        field4810 = null;
        if (arg0 != 19) {
            field4797 = null;
        }
    }
}
