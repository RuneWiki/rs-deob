import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class25 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lsb;")
    public static class98 field488 = class47.method368("<img=0>", 0);

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lsb;")
    public static class98 field487 = class47.method368("::fpsoff", 0);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lsb;")
    public static class98 field483 = class47.method368("null", 0);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[Lsb;")
    public static class98[] field486 = new class98[1000];

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lsb;")
    public static class98 field491 = class47.method368("Null", 0);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lsb;")
    private static class98 field484 = class47.method368("Unable to find ", 0);

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lsb;")
    public static class98 field493 = field484;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[[[I")
    public static int[][][] field489;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILki;III)V")
    public static final void method262(int arg0, int arg1, int arg2, class255 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -30860) {
            method265((byte) -63);
        }
        class190.method1311(arg3.field4466, arg3.field4492, arg6, arg2, arg0, arg4, arg5, 56);
        field485++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lq;IIB)V")
    public static final void method263(class148 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 92) {
            field491 = null;
        }
        if (arg0.field2643 == 1) {
            class226.method1560(class233.field4011, arg0.field2754, (short) 20, (byte) 113, arg0.field2728, 0, 0L);
            class84.field1483++;
        }
        field492++;
        if (arg0.field2643 == 2 && !class56.field892) {
            class98 var4 = class207.method1397(-8701, arg0);
            if (var4 != null) {
                class226.method1560(class186.method1288(new class98[] { class98.field1693, arg0.field2697 }, 31618), var4, (short) 3, (byte) 116, arg0.field2728, -1, 0L);
                class70.field1122++;
            }
        }
        if (arg0.field2643 == 3) {
            class26.field497++;
            class226.method1560(class233.field4011, class46.field775, (short) 50, (byte) 118, arg0.field2728, 0, 0L);
        }
        if (arg0.field2643 == 4) {
            class226.method1560(class233.field4011, arg0.field2754, (short) 42, (byte) -44, arg0.field2728, 0, 0L);
            class8.field185++;
        }
        if (arg0.field2643 == 5) {
            class226.method1560(class233.field4011, arg0.field2754, (short) 25, (byte) 120, arg0.field2728, 0, 0L);
            class181.field3114++;
        }
        if (arg0.field2643 == 6 && class188.field3244 == null) {
            class226.method1560(class233.field4011, arg0.field2754, (short) 40, (byte) 122, arg0.field2728, -1, 0L);
            class263.field4618++;
        }
        if (arg0.field2665 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2597; var6++) {
                for (int var7 = 0; var7 < arg0.field2669; var7++) {
                    int var8 = (arg0.field2622 + 32) * var7;
                    int var9 = (arg0.field2652 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2627[var5];
                        var9 += arg0.field2685[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && var8 + 32 > arg1 && (var9 + 32) > arg2) {
                        class227.field3913 = var5;
                        class23.field470 = arg0;
                        if (arg0.field2632[var5] > 0) {
                            class245 var10 = class235.method1605(126, arg0.field2632[var5] - 1);
                            if (class111.field1975 == 1 && class136.method1024(client.method761(arg0), (byte) -16)) {
                                if (class198.field3411 != arg0.field2728 || class212.field3621 != var5) {
                                    class226.method1560(class186.method1288(new class98[] { class55.field879, class15.field291, var10.field4255 }, 31618), class210.field3603, (short) 10, (byte) 116, arg0.field2728, var5, (long) var10.field4294);
                                    class60.field981++;
                                }
                            } else if (!class56.field892 || !class136.method1024(client.method761(arg0), (byte) -16)) {
                                class34.field595++;
                                class98[] var11 = var10.field4296;
                                if (class78.field1389) {
                                    var11 = class92.method675(7759, var11);
                                }
                                if (class136.method1024(client.method761(arg0), (byte) -16)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class205.field3492++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 6;
                                            } else {
                                                var13 = 23;
                                            }
                                            class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), var11[var12], var13, (byte) 113, arg0.field2728, var5, (long) var10.field4294);
                                        } else if (var12 == 4) {
                                            class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), class71.field1160, (short) 23, (byte) -57, arg0.field2728, var5, (long) var10.field4294);
                                            class87.field1532++;
                                        }
                                    }
                                }
                                if (class44.method352(client.method761(arg0), 0)) {
                                    class102.field1809++;
                                    class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), class210.field3603, (short) 30, (byte) 122, arg0.field2728, var5, (long) var10.field4294);
                                }
                                if (class136.method1024(client.method761(arg0), (byte) -16) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class111.field1973++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 15;
                                            }
                                            if (var14 == 1) {
                                                var15 = 5;
                                            }
                                            if (var14 == 2) {
                                                var15 = 36;
                                            }
                                            class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), var11[var14], var15, (byte) 122, arg0.field2728, var5, (long) var10.field4294);
                                        }
                                    }
                                }
                                class98[] var16 = arg0.field2725;
                                if (class78.field1389) {
                                    var16 = class92.method675(7759, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class60.field1009++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 9;
                                            }
                                            if (var17 == 1) {
                                                var18 = 58;
                                            }
                                            if (var17 == 2) {
                                                var18 = 4;
                                            }
                                            if (var17 == 3) {
                                                var18 = 29;
                                            }
                                            if (var17 == 4) {
                                                var18 = 37;
                                            }
                                            class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), var16[var17], var18, (byte) -18, arg0.field2728, var5, (long) var10.field4294);
                                        }
                                    }
                                }
                                class226.method1560(class186.method1288(new class98[] { class243.field4214, var10.field4255 }, 31618), class102.field1817, (short) 1005, (byte) -97, arg0.field2728, var5, (long) var10.field4294);
                            } else if ((class12.field236 & 0x10) == 16) {
                                class155.field2834++;
                                class226.method1560(class186.method1288(new class98[] { class91.field1609, class15.field291, var10.field4255 }, 31618), class67.field1080, (short) 44, (byte) 122, arg0.field2728, var5, (long) var10.field4294);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2619) {
            return;
        }
        if (!class56.field892) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class98 var23 = class44.method350(-101, var19, arg0);
                if (var23 != null) {
                    class226.method1560(arg0.field2687, var23, (short) 1004, (byte) 115, arg0.field2728, arg0.field2651, (long) (var19 + 1));
                    class79.field1403++;
                }
            }
            class98 var20 = class207.method1397(-8701, arg0);
            if (var20 != null) {
                class70.field1122++;
                class226.method1560(arg0.field2687, var20, (short) 3, (byte) -104, arg0.field2728, arg0.field2651, 0L);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class98 var22 = class44.method350(-87, var21, arg0);
                if (var22 != null) {
                    class79.field1403++;
                    class226.method1560(arg0.field2687, var22, (short) 24, (byte) -85, arg0.field2728, arg0.field2651, (long) (var21 + 1));
                }
            }
            if (class119.method882(client.method761(arg0), 4305)) {
                class263.field4618++;
                class226.method1560(class233.field4011, class189.field3274, (short) 40, (byte) 125, arg0.field2728, arg0.field2651, 0L);
                return;
            }
            return;
        }
        if (class134.method1006(client.method761(arg0), (byte) -107) && (class12.field236 & 0x20) == 32) {
            class226.method1560(class186.method1288(new class98[] { class91.field1609, class126.field2265, arg0.field2687 }, 31618), class67.field1080, (short) 33, (byte) -9, arg0.field2728, arg0.field2651, 0L);
            class180.field3101++;
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)V")
    public static final void method264(int arg0, byte arg1) {
        class72.field1193 += arg0 * 128;
        field490++;
        short var2 = 256;
        if (class47.field784.length < class72.field1193) {
            class72.field1193 -= class47.field784.length;
            int var3 = (int) (Math.random() * 12.0D);
            class219.method1507(class169.field2992[var3], -20);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class87.field1549[var4 + var5] - (class47.field784[class47.field784.length - 1 & class72.field1193 + var4] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class87.field1549[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class87.field1549[var24 + var23] = 255;
                } else {
                    class87.field1549[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class71.field1147[var9] = class71.field1147[arg0 + var9];
        }
        if (arg1 < 100) {
            field484 = null;
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class71.field1147[var10] = (int) (Math.sin((double) class119.field2140 / 14.0D) * 16.0D + Math.sin((double) class119.field2140 / 15.0D) * 14.0D + Math.sin((double) class119.field2140 / 16.0D) * 12.0D);
            class119.field2140++;
        }
        int var11 = ((class236.field4071 & 0x1) + arg0) / 2;
        class146.field2558 += arg0;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class146.field2558; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class87.field1549[(var21 << 7) + var22] = 192;
        }
        class146.field2558 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class87.field1549[var20 + var11 + var19];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class87.field1549[var19 + var20 - (var11 + 1)];
                }
                if (var20 >= 0) {
                    class112.field1990[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > (var11 + var16)) {
                    var15 += class112.field1990[var11 * 128 + var14 + var17];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class112.field1990[var17 + var14 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class87.field1549[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method265(byte arg0) {
        field489 = null;
        field486 = null;
        field493 = null;
        field484 = null;
        field487 = null;
        field483 = null;
        field488 = null;
        int var1 = 122 / ((-arg0 - 33) / 60);
        field491 = null;
    }
}
