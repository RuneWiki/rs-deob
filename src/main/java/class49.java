import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 extends class4 {

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
    public int field1111 = 0;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "Loa;")
    public static class98 field1095 = class38.method349(255, "ams");

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "Loa;")
    public static class98 field1102 = class38.method349(255, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "Loa;")
    private static class98 field1106 = class38.method349(255, "Error loading your profile)3");

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "Loa;")
    public static class98 field1107 = class38.method349(255, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "Loa;")
    public static class98 field1109 = class38.method349(255, "titlebutton");

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Loa;")
    public static class98 field1103 = field1106;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "Ln;")
    public static class90 field1110 = new class90(50);

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lcf;")
    public static class21 field1096;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static final void method414(int arg0) {
        field1101++;
        class21.method190((byte) -39);
        class79.field1736 = true;
        class11.method121(arg0);
        if (class126.field2826) {
            class71.field1480.method388(class145.field3505, 239, 40, 0);
            class71.field1480.method388(class102.method840(new class98[] { class145.field3502, class57.field1267 }, 10), 239, 60, 128);
        } else if (class149.field3691 == 1) {
            class71.field1480.method388(class123.field2737, 239, 40, 0);
            class71.field1480.method388(class102.method840(new class98[] { class145.field3530, class57.field1267 }, 10), 239, 60, 128);
        } else if (class149.field3691 == 2) {
            class71.field1480.method388(class117.field2607, 239, 40, 0);
            class71.field1480.method388(class102.method840(new class98[] { class145.field3530, class57.field1267 }, 10), 239, 60, 128);
        } else if (class149.field3691 == 3) {
            if (class145.field3530 != class145.field3516) {
                class113.method916(class145.field3530, -9243);
                class145.field3516 = class145.field3530;
            }
            class45 var1 = class97.field2231;
            class7.method52(0, 0, 463, 77);
            for (int var2 = 0; var2 < class71.field1465; var2++) {
                int var3 = var2 * 14 + 18 - class79.field1739;
                if (var3 > 0 && var3 < 110) {
                    var1.method388(class140.field3419[var2], 239, var3, 0);
                }
            }
            class7.method39();
            if (class71.field1465 > 5) {
                class118.method936(77, 0, 26882, class71.field1465 * 14 + 7, class79.field1739, 463);
            }
            if (class145.field3530.method790(arg0 + 122) == 0) {
                class71.field1480.method388(class58.field1293, 239, 40, 255);
            } else if (class71.field1465 == 0) {
                class71.field1480.method388(class119.field2681, 239, 40, 0);
            }
            var1.method388(class102.method840(new class98[] { class145.field3530, class57.field1267 }, 10), 239, 90, 0);
            class7.method43(0, 77, 479, 0);
        } else if (class149.field3691 == 4) {
            class71.field1480.method388(class145.field3518, 239, 40, 0);
            class71.field1480.method388(class102.method840(new class98[] { class145.field3530, class57.field1267 }, 10), 239, 60, 128);
        } else if (class39.field945 != null) {
            class71.field1480.method387(class39.field945, 10, 20, 459, 40, 0, false, 1, 1, 0);
            class71.field1480.method388(class75.field1610, 239, 80, 128);
        } else if (class71.field1462 != -1) {
            boolean var19 = class35.method334(2, 479, 0, arg0 + 10616, class71.field1462, 96, 0);
            if (!var19) {
                class15.field306 = true;
            }
        } else if (class83.field1923 == -1) {
            class45 var5 = class97.field2231;
            int var6 = 0;
            class7.method52(0, 0, 463, 77);
            for (int var7 = 0; var7 < 100; var7++) {
                if (class141.field3449[var7] != null) {
                    int var9 = class44.field999 + 70 - var6 * 14;
                    int var10 = class148.field3670[var7];
                    class98 var11 = class65.field1397[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.method792((byte) -84, class48.field1093)) {
                        var11 = var11.method781(0, 5);
                        var12 = 1;
                    }
                    if (var11 != null && var11.method792((byte) -84, class52.field1165)) {
                        var12 = 2;
                        var11 = var11.method781(0, 5);
                    }
                    if (var10 == 0) {
                        if (var9 > 0 && var9 < 110) {
                            var5.method391(class141.field3449[var7], 4, var9, 0);
                        }
                        var6++;
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || class80.field1749 == 0 || class80.field1749 == 1 && class129.method1036(0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class87.field1984[0].method830(var13, var9 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class87.field1984[1].method830(var13, var9 - 12);
                                var13 += 14;
                            }
                            var5.method391(class102.method840(new class98[] { var11, class126.field2809 }, 10), var13, var9, 0);
                            int var14 = var13 + var5.method398(var11) + 8;
                            var5.method391(class141.field3449[var7], var14, var9, 255);
                        }
                        var6++;
                    }
                    if ((var10 == 3 || var10 == 7) && class63.field1344 == 0 && (var10 == 7 || class54.field1193 == 0 || class54.field1193 == 1 && class129.method1036(0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            byte var15 = 4;
                            var5.method391(class114.field2574, var15, var9, 0);
                            int var16 = var15 + var5.method398(class114.field2574);
                            int var17 = var16 + var5.method396(32);
                            if (var12 == 1) {
                                class87.field1984[0].method830(var17, var9 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class87.field1984[1].method830(var17, var9 - 12);
                                var17 += 14;
                            }
                            var5.method391(class102.method840(new class98[] { var11, class126.field2809 }, 10), var17, var9, 0);
                            int var18 = var17 + var5.method398(var11) + 8;
                            var5.method391(class141.field3449[var7], var18, var9, 8388608);
                        }
                        var6++;
                    }
                    if (var10 == 4 && (class67.field1433 == 0 || class67.field1433 == 1 && class129.method1036(0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            var5.method391(class102.method840(new class98[] { var11, class36.field900, class141.field3449[var7] }, 10), 4, var9, 8388736);
                        }
                        var6++;
                    }
                    if (var10 == 5 && class63.field1344 == 0 && class54.field1193 < 2) {
                        if (var9 > 0 && var9 < 110) {
                            var5.method391(class141.field3449[var7], 4, var9, 8388608);
                        }
                        var6++;
                    }
                    if (var10 == 6 && class63.field1344 == 0 && class54.field1193 < 2) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method391(class102.method840(new class98[] { class73.field1540, class36.field900, var11, class126.field2809 }, 10), 4, var9, 0);
                            var5.method391(class141.field3449[var7], var5.method398(class102.method840(new class98[] { class73.field1540, class36.field900, var11 }, 10)) + 12, var9, 8388608);
                        }
                    }
                    if (var10 == 8 && (class67.field1433 == 0 || class67.field1433 == 1 && class129.method1036(0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            var5.method391(class102.method840(new class98[] { var11, class36.field900, class141.field3449[var7] }, 10), 4, var9, 8270336);
                        }
                        var6++;
                    }
                }
            }
            class7.method39();
            class67.field1434 = var6 * 14 + 7;
            if (class67.field1434 < 78) {
                class67.field1434 = 78;
            }
            class118.method936(77, 0, 26882, class67.field1434, class67.field1434 - class44.field999 - 77, 463);
            class98 var8;
            if (class73.field1536 == null || class73.field1536.field1212 == null) {
                var8 = class80.field1744;
            } else {
                var8 = class73.field1536.field1212;
            }
            var5.method391(class102.method840(new class98[] { var8, class126.field2809 }, 10), 4, 90, 0);
            var5.method391(class102.method840(new class98[] { class145.field3497, class57.field1267 }, 10), var5.method398(class102.method840(new class98[] { var8, class4.field69 }, 10)) + 6, 90, 255);
            class7.method43(0, 77, 479, 0);
        } else {
            boolean var4 = class35.method334(3, 479, 0, 10616, class83.field1923, 96, 0);
            if (!var4) {
                class15.field306 = true;
            }
        }
        if (class145.field3529 && field1099 == 2) {
            class67.method550(arg0 ^ 0xFFFFFF93);
        }
        class120.method953(false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILb;I)V")
    private final void method415(int arg0, class8 arg1, int arg2) {
        if (arg0 != -5532) {
            this.method419(true, null);
        }
        if (arg2 == 5) {
            this.field1111 = arg1.method68(-2);
        }
        field1100++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)Ltd;")
    public static final class132 method416(boolean arg0, int arg1, int arg2) {
        class132 var3 = class117.method932(arg1, (byte) -116);
        field1097++;
        if (arg2 == -1) {
            return var3;
        } else if (arg0) {
            return var3 == null || var3.field3113 == null || arg2 >= var3.field3113.length ? null : var3.field3113[arg2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLtb;)V")
    public static final void method417(byte arg0, class130 arg1) {
        class135.field3304 = arg1;
        if (arg0 != -44) {
            method420(-55, (byte) -22);
        }
        field1108++;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V")
    public static void method418(byte arg0) {
        field1109 = null;
        field1103 = null;
        if (arg0 < 89) {
            field1106 = null;
        }
        field1095 = null;
        field1107 = null;
        field1106 = null;
        field1102 = null;
        field1096 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLb;)V")
    public final void method419(boolean arg0, class8 arg1) {
        field1105++;
        while (true) {
            int var3 = arg1.method62((byte) 92);
            if (var3 == 0) {
                if (arg0) {
                    method414(3);
                    return;
                } else {
                    return;
                }
            }
            this.method415(-5532, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method420(int arg0, byte arg1) {
        field1104++;
        class117.field2610 += arg0 * 128;
        if (class79.field1738.length < class117.field2610) {
            class117.field2610 -= class79.field1738.length;
            int var2 = (int) (Math.random() * 12.0D);
            class86.method707((byte) 71, class139.field3409[var2]);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = (var3 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var27 = class57.field1261[var4 + var6] - class79.field1738[var4 + class117.field2610 & class79.field1738.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class57.field1261[var4++] = var27;
        }
        if (arg1 != 4) {
            method420(47, (byte) 45);
        }
        for (int var8 = var3 - arg0; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class57.field1261[var24 + var25] = 255;
                } else {
                    class57.field1261[var24 + var25] = 0;
                }
            }
        }
        if (class5.field71 > 0) {
            class5.field71 -= arg0 * 4;
        }
        if (field1098 > 0) {
            field1098 -= arg0 * 4;
        }
        if (class5.field71 == 0 && field1098 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                field1098 = 1024;
            }
            if (var9 == 0) {
                class5.field71 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg0; var10++) {
            class98.field2251[var10] = class98.field2251[arg0 + var10];
        }
        for (int var11 = var3 - arg0; var11 < var3; var11++) {
            class98.field2251[var11] = (int) (Math.sin((double) class38.field938 / 14.0D) * 16.0D + Math.sin((double) class38.field938 / 15.0D) * 14.0D + Math.sin((double) class38.field938 / 16.0D) * 12.0D);
            class38.field938++;
        }
        class39.field950 += arg0;
        int var12 = ((class119.field2680 & 0x1) + arg0) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class39.field950 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class57.field1261[var22 + (var23 << 7)] = 192;
        }
        class39.field950 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class57.field1261[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class57.field1261[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class105.field2408[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var12 + var17) {
                    var16 += class105.field2408[var15 + var12 * 128 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class105.field2408[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class57.field1261[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
