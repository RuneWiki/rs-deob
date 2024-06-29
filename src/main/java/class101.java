import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class101 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[[I")
    public static int[][] field1683 = new int[104][104];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public static int[] field1681;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[[[I")
    public static int[][][] field1682;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method740(boolean arg0) {
        field1681 = null;
        field1682 = null;
        if (arg0) {
            method740(true);
        }
        field1683 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ[B)Ldf;")
    public static final class51 method741(int arg0, int arg1, boolean arg2, byte[] arg3) {
        class51 var4 = new class51();
        var4.field813 = new byte[arg0];
        field1679++;
        var4.field855 = 0;
        if (!arg2) {
            field1681 = null;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field813[var4.field855++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZILwc;)V")
    public static final void method742(int arg0, boolean arg1, int arg2, class213 arg3) {
        if (arg1) {
            method742(37, false, -53, (class213) null);
        }
        if (arg3.field3584 == 1) {
            class185.method1313(arg3.field3703, 0L, arg3.field3606, (short) 37, class43.field696, 0, -501);
            class170.field2775++;
        }
        field1680++;
        if (arg3.field3584 == 2 && !class93.field1532) {
            class51 var4 = class183.method1298(31942, arg3);
            if (var4 != null) {
                class46.field738++;
                class185.method1313(arg3.field3703, 0L, var4, (short) 39, class20.method104(-120, new class51[] { class182.field3008, arg3.field3621 }), -1, -501);
            }
        }
        if (arg3.field3584 == 3) {
            class227.field3970++;
            class185.method1313(arg3.field3703, 0L, class109.field1856, (short) 7, class43.field696, 0, -501);
        }
        if (arg3.field3584 == 4) {
            class185.method1313(arg3.field3703, 0L, arg3.field3606, (short) 16, class43.field696, 0, -501);
            class84.field1412++;
        }
        if (arg3.field3584 == 5) {
            class41.field642++;
            class185.method1313(arg3.field3703, 0L, arg3.field3606, (short) 57, class43.field696, 0, -501);
        }
        if (arg3.field3584 == 6 && class1.field3 == null) {
            class87.field1448++;
            class185.method1313(arg3.field3703, 0L, arg3.field3606, (short) 30, class43.field696, -1, -501);
        }
        if (arg3.field3623 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3694; var6++) {
                for (int var7 = 0; var7 < arg3.field3540; var7++) {
                    int var8 = (arg3.field3678 + 32) * var7;
                    int var9 = (arg3.field3670 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field3646[var5];
                        var8 += arg3.field3554[var5];
                    }
                    if (var8 <= arg2 && arg0 >= var9 && arg2 < var8 + 32 && arg0 < var9 + 32) {
                        class180.field2965 = var5;
                        class221.field3829 = arg3;
                        if (arg3.field3543[var5] > 0) {
                            class222 var10 = class219.method1508(arg3.field3543[var5] - 1, (byte) 118);
                            if (class175.field2871 == 1 && class227.method1563(20039, client.method1061(arg3))) {
                                if (class261.field4559 != arg3.field3703 || class145.field2418 != var5) {
                                    class108.field1809++;
                                    class185.method1313(arg3.field3703, (long) var10.field3859, class183.field3031, (short) 32, class20.method104(121, new class51[] { class181.field2990, class263.field4606, var10.field3907 }), var5, -501);
                                }
                            } else if (!class93.field1532 || !class227.method1563(20039, client.method1061(arg3))) {
                                class242.field4197++;
                                class51[] var11 = var10.field3908;
                                if (class23.field348) {
                                    var11 = class89.method675(-14182, var11);
                                }
                                if (class227.method1563(20039, client.method1061(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class146.field2429++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 40;
                                            } else {
                                                var13 = 10;
                                            }
                                            class185.method1313(arg3.field3703, (long) var10.field3859, var11[var12], var13, class20.method104(-122, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                                        } else if (var12 == 4) {
                                            class185.method1313(arg3.field3703, (long) var10.field3859, class29.field425, (short) 10, class20.method104(-105, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                                            class67.field1092++;
                                        }
                                    }
                                }
                                if (class123.method926(client.method1061(arg3), 108)) {
                                    class185.method1313(arg3.field3703, (long) var10.field3859, class183.field3031, (short) 8, class20.method104(-96, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                                    class188.field3146++;
                                }
                                if (class227.method1563(20039, client.method1061(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 33;
                                            }
                                            if (var14 == 1) {
                                                var15 = 4;
                                            }
                                            class42.field669++;
                                            if (var14 == 2) {
                                                var15 = 12;
                                            }
                                            class185.method1313(arg3.field3703, (long) var10.field3859, var11[var14], var15, class20.method104(85, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                                        }
                                    }
                                }
                                class51[] var16 = arg3.field3657;
                                if (class23.field348) {
                                    var16 = class89.method675(-14182, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class248.field4359++;
                                            if (var17 == 0) {
                                                var18 = 6;
                                            }
                                            if (var17 == 1) {
                                                var18 = 58;
                                            }
                                            if (var17 == 2) {
                                                var18 = 34;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 51;
                                            }
                                            class185.method1313(arg3.field3703, (long) var10.field3859, var16[var17], var18, class20.method104(-126, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                                        }
                                    }
                                }
                                class185.method1313(arg3.field3703, (long) var10.field3859, class36.field545, (short) 1006, class20.method104(11, new class51[] { class82.field1370, var10.field3907 }), var5, -501);
                            } else if ((class170.field2788 & 0x10) == 16) {
                                class185.method1313(arg3.field3703, (long) var10.field3859, class261.field4562, (short) 1, class20.method104(-99, new class51[] { class22.field336, class263.field4606, var10.field3907 }), var5, -501);
                                class53.field914++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3574) {
            return;
        }
        if (!class93.field1532) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class51 var23 = class211.method1444(var19, arg3, -3004);
                if (var23 != null) {
                    class42.field666++;
                    class185.method1313(arg3.field3703, (long) (var19 + 1), var23, (short) 1002, arg3.field3687, arg3.field3568, -501);
                }
            }
            class51 var20 = class183.method1298(31942, arg3);
            if (var20 != null) {
                class185.method1313(arg3.field3703, 0L, var20, (short) 39, arg3.field3687, arg3.field3568, -501);
                class46.field738++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class51 var22 = class211.method1444(var21, arg3, -3004);
                if (var22 != null) {
                    class185.method1313(arg3.field3703, (long) (var21 + 1), var22, (short) 26, arg3.field3687, arg3.field3568, -501);
                    class42.field666++;
                }
            }
            if (!class211.method1441(122, client.method1061(arg3))) {
                return;
            }
            class87.field1448++;
            class185.method1313(arg3.field3703, 0L, class123.field2087, (short) 30, class43.field696, arg3.field3568, -501);
        } else if (class33.method166(client.method1061(arg3), (byte) 127) && (class170.field2788 & 0x20) == 32) {
            class185.method1313(arg3.field3703, 0L, class261.field4562, (short) 35, class20.method104(-110, new class51[] { class22.field336, class265.field4646, arg3.field3687 }), arg3.field3568, -501);
            class257.field4476++;
            return;
        }
    }
}
