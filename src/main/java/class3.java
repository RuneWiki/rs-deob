import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Ldj;")
    private static class44 field47 = class89.method650(255, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Ldj;")
    public static class44 field48 = field47;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[S")
    public static short[] field43;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method20(int arg0) {
        field48 = null;
        field43 = null;
        field47 = null;
        if (arg0 < 113) {
            method22((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method21(byte arg0) {
        int var1 = 0;
        if (arg0 > -23) {
            method24(null, null, -32, null, null);
        }
        while (class73.field1401 > var1) {
            int var10002 = class73.field1403[var1]--;
            if (class73.field1403[var1] >= -10) {
                label89: {
                    class16 var3 = class23.field378[var1];
                    if (var3 == null) {
                        var3 = class16.method142(class62.field1159, class163.field2821[var1], 0);
                        if (var3 == null) {
                            break label89;
                        }
                        class73.field1403[var1] += var3.method141();
                        class23.field378[var1] = var3;
                    }
                    if (class73.field1403[var1] < 0) {
                        label92: {
                            int var10;
                            if (class87.field1669[var1] == 0) {
                                var10 = class220.field3999;
                            } else {
                                int var4 = (class87.field1669[var1] & 0xFF) * 128;
                                int var5 = class87.field1669[var1] >> 16 & 0xFF;
                                int var6 = class87.field1669[var1] >> 8 & 0xFF;
                                int var7 = var5 * 128 + 64 - class96.field1774.field2260;
                                int var8 = var6 * 128 + 64 - class96.field1774.field2195;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var7 + var8 - 128;
                                if (var9 > var4) {
                                    class73.field1403[var1] = -100;
                                    break label92;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class226.field4254 / var4;
                            }
                            if (var10 > 0) {
                                class209 var11 = var3.method139().method1358(class135.field2409);
                                class100 var12 = class100.method721(var11, 100, var10);
                                var12.method716(class53.field966[var1] - 1);
                                class36.field634.method104(var12);
                            }
                            class73.field1403[var1] = -100;
                        }
                    }
                }
            } else {
                class73.field1401--;
                for (int var2 = var1; var2 < class73.field1401; var2++) {
                    class163.field2821[var2] = class163.field2821[var2 + 1];
                    class23.field378[var2] = class23.field378[var2 + 1];
                    class53.field966[var2] = class53.field966[var2 + 1];
                    class73.field1403[var2] = class73.field1403[var2 + 1];
                    class87.field1669[var2] = class87.field1669[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class197.field3490 && !class153.method991(-1)) {
            if (class87.field1667 != 0 && class73.field1386 != -1) {
                class178.method1128(class87.field1667, class73.field1386, false, 10000, 0, class211.field3797);
            }
            class197.field3490 = false;
        } else if (class87.field1667 != 0 && class73.field1386 != -1 && !class153.method991(-1)) {
            class215.field3900++;
            class200.field3542.method1170(63, (byte) -74);
            class200.field3542.method489(class73.field1386, -78);
            class73.field1386 = -1;
        }
        field39++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static final void method22(byte arg0) {
        field42++;
        if (class135.field2423 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class135.field2423 > 768) {
                    class57.field1072[var3] = class55.method395(1024 - class135.field2423, false, class181.field3152[var3], class151.field2636[var3]);
                } else if (class135.field2423 > 256) {
                    class57.field1072[var3] = class151.field2636[var3];
                } else {
                    class57.field1072[var3] = class55.method395(256 - class135.field2423, false, class151.field2636[var3], class181.field3152[var3]);
                }
            }
        } else if (class186.field3212 <= 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                class57.field1072[var1] = class181.field3152[var1];
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class186.field3212 > 768) {
                    class57.field1072[var2] = class55.method395(1024 - class186.field3212, false, class181.field3152[var2], class152.field2648[var2]);
                } else if (class186.field3212 > 256) {
                    class57.field1072[var2] = class152.field2648[var2];
                } else {
                    class57.field1072[var2] = class55.method395(256 - class186.field3212, false, class152.field2648[var2], class181.field3152[var2]);
                }
            }
        }
        int var4 = 0;
        short var5 = 256;
        int var6 = class210.field3757.field2693 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var5 - 1; var8++) {
            int var21 = (var5 - var8) * class154.field2680[var8] / var5 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var4 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class70.field1324[var4++];
                int var25 = class210.field3757.field2691[var6++];
                if (var24 == 0) {
                    class207.field3722.field2691[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class57.field1072[var24];
                    class207.field3722.field2691[var7++] = class29.method202(16711680, var27 * class29.method202(65280, var25) + class29.method202(65280, var28) * var24) + class29.method202(class29.method202(var25, 16711935) * var27 + var24 * class29.method202(16711935, var28), -16711936) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class207.field3722.field2691[var7++] = class210.field3757.field2691[var6++];
            }
            var6 += class210.field3757.field2693 - 128;
        }
        int var9 = 0;
        class207.field3722.method1015(0, 9);
        int var10 = class210.field3757.field2693 * 9 + 128;
        int var11 = 0;
        if (arg0 != 99) {
            return;
        }
        for (int var12 = 1; var12 < var5 - 1; var12++) {
            int var13 = (var5 - var12) * class154.field2680[var12] / var5 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var11++;
                var10--;
                class80.field1545.field2691[var10001] = class210.field3757.field2691[var10];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                var10--;
                int var16 = class210.field3757.field2691[var10];
                int var17 = class70.field1324[var9++];
                if (var17 == 0) {
                    class80.field1545.field2691[var11++] = var16;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class57.field1072[var17];
                    class80.field1545.field2691[var11++] = class29.method202(var17 * class29.method202(16711935, var20) + class29.method202(var16, 16711935) * var19, -16711936) + class29.method202(class29.method202(65280, var16) * var19 + var17 * class29.method202(var20, 65280), 16711680) >> 8;
                }
            }
            var9 += var13;
            var10 += class210.field3757.field2693 + 128;
        }
        class80.field1545.method1015(637, 9);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIB)I")
    public static final int method23(byte[] arg0, int arg1, byte arg2) {
        field45++;
        if (arg2 < 11) {
            method22((byte) -4);
        }
        return class160.method1038(arg0, arg1, 0, (byte) 60);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lve;Lve;ILve;Lve;)V")
    public static final void method24(class225 arg0, class225 arg1, int arg2, class225 arg3, class225 arg4) {
        class152.field2652 = arg1;
        class87.field1665 = arg3;
        class45.field855 = arg0;
        if (arg2 != 768) {
            field43 = null;
        }
        class190.field3289 = arg4;
        field41++;
        class4.field52 = new class223[class152.field2652.method1477(-17161)][];
        class157.field2744 = new boolean[class152.field2652.method1477(-17161)];
    }
}
