import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class170 {

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lda;")
    private static class275 field2954 = class255.method1672(99, "Dec");

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lda;")
    private static class275 field2962 = class255.method1672(96, "Feb");

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lda;")
    private static class275 field2959 = class255.method1672(125, "Jul");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lda;")
    private static class275 field2958 = class255.method1672(100, "Oct");

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lda;")
    private static class275 field2966 = class255.method1672(119, "Aug");

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lda;")
    private static class275 field2957 = class255.method1672(124, "May");

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lda;")
    private static class275 field2963 = class255.method1672(118, "Sep");

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lda;")
    public static class275 field2968 = class255.method1672(114, ")3");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lda;")
    private static class275 field2965 = class255.method1672(99, "Jun");

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lda;")
    private static class275 field2970 = class255.method1672(114, "Jan");

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Lda;")
    private static class275 field2975 = class255.method1672(123, "Mar");

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "Lda;")
    private static class275 field2972 = class255.method1672(113, "Apr");

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lda;")
    private static class275 field2960 = class255.method1672(123, "wave:");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lda;")
    public static class275 field2956 = field2960;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lda;")
    private static class275 field2967 = class255.method1672(116, "Nov");

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "Lda;")
    public static class275 field2974 = field2960;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[Lda;")
    public static class275[] field2949 = new class275[] { field2970, field2962, field2975, field2972, field2957, field2965, field2959, field2966, field2963, field2958, field2967, field2954 };

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lma;")
    public static class105 field2950;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lba;")
    public static class257 field2961;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        field2973++;
        if (class204.field3468 != null || class262.field4558 != null || arg0 != -27035) {
            return;
        }
        int var1 = class87.field1475;
        if (class63.field1051) {
            if (var1 != 1) {
                int var6 = class213.field3617;
                int var7 = class44.field746;
                if (var7 < class157.field2769 - 10 || var7 > (class6.field84 + class157.field2769 + 10) || (class23.field366 - 10) > var6 || class29.field445 + class23.field366 + 10 < var6) {
                    class63.field1051 = false;
                    class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class157.field2769;
            int var9 = class23.field366;
            int var10 = class6.field84;
            int var11 = class162.field2834;
            int var12 = class185.field3174;
            int var13 = -1;
            for (int var14 = 0; var14 < class52.field863; var14++) {
                int var15 = (class52.field863 - var14 - 1) * 15 + var9 + 31;
                if (var11 > var8 && (var8 + var10) > var11 && var15 - 13 < var12 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class67.method450(-112, var13);
            }
            class63.field1051 = false;
            class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
            return;
        }
        if (var1 == 1 && class52.field863 > 0) {
            short var2 = class137.field2400[class52.field863 - 1];
            if (var2 == 36 || var2 == 57 || var2 == 17 || var2 == 45 || var2 == 25 || var2 == 37 || var2 == 9 || var2 == 14 || var2 == 18 || var2 == 21 || var2 == 22 || var2 == 1002) {
                int var3 = class161.field2820[class52.field863 - 1];
                int var4 = class13.field196[class52.field863 - 1];
                class229 var5 = class261.method1709(var4, -112);
                if (class172.method1174(-1, client.method635(var5)) || class240.method1579((byte) 51, client.method635(var5))) {
                    class161.field2822 = false;
                    class116.field2069 = 0;
                    if (class204.field3468 != null) {
                        class40.method231(class204.field3468, 0);
                    }
                    class204.field3468 = class261.method1709(var4, arg0 ^ 0x69F0);
                    class94.field1608 = var3;
                    field2951 = class185.field3174;
                    class156.field2712 = class162.field2834;
                    class40.method231(class204.field3468, 0);
                    return;
                }
            }
        }
        if (var1 == 1 && (class3.field31 == 1 && class52.field863 > 2 || class80.method520(class52.field863 - 1, false))) {
            var1 = 2;
        }
        if (var1 == 2 && class52.field863 > 0 || class145.field2546 == 1) {
            class113.method830((byte) 126);
        }
        if (var1 == 1 && class52.field863 > 0 || class145.field2546 == 2) {
            class63.method434(0);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILfd;)V")
    public static final void method1163(int arg0, int arg1, int arg2, class229 arg3) {
        int var4 = 10 / ((-arg2 - 27) / 41);
        if (arg3.field3963 == 1) {
            class171.field2978++;
            class246.method1619(0L, 0, class79.field1301, arg3.field3934, arg3.field3879, (byte) -70, (short) 47);
        }
        field2948++;
        if (arg3.field3963 == 2 && !class144.field2523) {
            class275 var5 = class244.method1592(106, arg3);
            if (var5 != null) {
                class246.method1619(0L, -1, class197.method1291(new class275[] { class89.field1506, arg3.field3967 }, -30025), var5, arg3.field3879, (byte) -70, (short) 8);
                class238.field4152++;
            }
        }
        if (arg3.field3963 == 3) {
            class1.field15++;
            class246.method1619(0L, 0, class79.field1301, class122.field2197, arg3.field3879, (byte) -70, (short) 39);
        }
        if (arg3.field3963 == 4) {
            class246.method1619(0L, 0, class79.field1301, arg3.field3934, arg3.field3879, (byte) -70, (short) 23);
            class134.field2380++;
        }
        if (arg3.field3963 == 5) {
            class246.method1619(0L, 0, class79.field1301, arg3.field3934, arg3.field3879, (byte) -70, (short) 1);
            class147.field2573++;
        }
        if (arg3.field3963 == 6 && class45.field754 == null) {
            class77.field1277++;
            class246.method1619(0L, -1, class79.field1301, arg3.field3934, arg3.field3879, (byte) -70, (short) 11);
        }
        if (arg3.field3858 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg3.field3951; var7++) {
                for (int var8 = 0; var8 < arg3.field3986; var8++) {
                    int var9 = (arg3.field3973 + 32) * var8;
                    int var10 = (arg3.field4014 + 32) * var7;
                    if (var6 < 20) {
                        var9 += arg3.field3974[var6];
                        var10 += arg3.field3979[var6];
                    }
                    if (var9 <= arg0 && arg1 >= var10 && var9 + 32 > arg0 && (var10 + 32) > arg1) {
                        class123.field2200 = var6;
                        class255.field4501 = arg3;
                        if (arg3.field4007[var6] > 0) {
                            class245 var11 = class210.method1352(121, arg3.field4007[var6] - 1);
                            if (class190.field3272 == 1 && class226.method1466(-1, client.method635(arg3))) {
                                if (class156.field2750 != arg3.field3879 || class4.field61 != var6) {
                                    class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class210.field3550, class77.field1268, var11.field4322 }, -30025), class165.field2869, arg3.field3879, (byte) -70, (short) 24);
                                    class109.field1891++;
                                }
                            } else if (!class144.field2523 || !class226.method1466(-1, client.method635(arg3))) {
                                class275[] var12 = var11.field4312;
                                if (class181.field3099) {
                                    var12 = class271.method1785(var12, (byte) 110);
                                }
                                class102.field1698++;
                                if (class226.method1466(-1, client.method635(arg3))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class189.field3259++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 18;
                                            } else {
                                                var14 = 21;
                                            }
                                            class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), var12[var13], arg3.field3879, (byte) -70, var14);
                                        } else if (var13 == 4) {
                                            class85.field1400++;
                                            class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), class189.field3268, arg3.field3879, (byte) -70, (short) 21);
                                        }
                                    }
                                }
                                if (class122.method891(client.method635(arg3), false)) {
                                    class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), class165.field2869, arg3.field3879, (byte) -70, (short) 22);
                                    class82.field1333++;
                                }
                                if (class226.method1466(-1, client.method635(arg3)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            byte var16 = 0;
                                            class167.field2891++;
                                            if (var15 == 0) {
                                                var16 = 37;
                                            }
                                            if (var15 == 1) {
                                                var16 = 9;
                                            }
                                            if (var15 == 2) {
                                                var16 = 14;
                                            }
                                            class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), var12[var15], arg3.field3879, (byte) -70, var16);
                                        }
                                    }
                                }
                                class275[] var17 = arg3.field3926;
                                if (class181.field3099) {
                                    var17 = class271.method1785(var17, (byte) 110);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class141.field2488++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 36;
                                            }
                                            if (var18 == 1) {
                                                var19 = 57;
                                            }
                                            if (var18 == 2) {
                                                var19 = 17;
                                            }
                                            if (var18 == 3) {
                                                var19 = 45;
                                            }
                                            if (var18 == 4) {
                                                var19 = 25;
                                            }
                                            class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), var17[var18], arg3.field3879, (byte) -70, var19);
                                        }
                                    }
                                }
                                class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class215.field3668, var11.field4322 }, -30025), class248.field4368, arg3.field3879, (byte) -70, (short) 1002);
                            } else if ((class150.field2619 & 0x10) == 16) {
                                class246.method1619((long) var11.field4320, var6, class197.method1291(new class275[] { class19.field266, class77.field1268, var11.field4322 }, -30025), class103.field1715, arg3.field3879, (byte) -70, (short) 38);
                                class1.field13++;
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg3.field3884) {
            return;
        }
        if (!class144.field2523) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class275 var24 = class193.method1266(var20, -126, arg3);
                if (var24 != null) {
                    class246.method1619((long) (var20 + 1), arg3.field3943, arg3.field4005, var24, arg3.field3879, (byte) -70, (short) 1001);
                    class265.field4618++;
                }
            }
            class275 var21 = class244.method1592(108, arg3);
            if (var21 != null) {
                class238.field4152++;
                class246.method1619(0L, arg3.field3943, arg3.field4005, var21, arg3.field3879, (byte) -70, (short) 8);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class275 var23 = class193.method1266(var22, -127, arg3);
                if (var23 != null) {
                    class246.method1619((long) (var22 + 1), arg3.field3943, arg3.field4005, var23, arg3.field3879, (byte) -70, (short) 3);
                    class265.field4618++;
                }
            }
            if (!class219.method1411(0, client.method635(arg3))) {
                return;
            }
            class77.field1277++;
            class246.method1619(0L, arg3.field3943, class79.field1301, class112.field1981, arg3.field3879, (byte) -70, (short) 11);
        } else if (class100.method715(-90, client.method635(arg3)) && (class150.field2619 & 0x20) == 32) {
            class246.method1619(0L, arg3.field3943, class197.method1291(new class275[] { class19.field266, class31.field471, arg3.field4005 }, -30025), class103.field1715, arg3.field3879, (byte) -70, (short) 34);
            class49.field822++;
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JZII)Lda;")
    public static final class275 method1164(long arg0, boolean arg1, int arg2, int arg3) {
        field2952++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg0 / (long) arg2;
        int var7 = 1;
        while (var5 != 0L) {
            var5 /= (long) arg2;
            var7++;
        }
        int var8 = var7;
        if (arg0 < 0L || arg1) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 != -2) {
            method1162(-9);
        }
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg0 % (long) arg2);
            arg0 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class275 var11 = new class275();
        var11.field4749 = var9;
        var11.field4752 = var8;
        return var11;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2971++;
        if (arg2 != 16441) {
            method1164(8L, true, -19, -122);
        }
        class47.method297(arg4, arg1, arg0 + arg4, arg1 - -arg3);
        class47.method299(arg4, arg1, arg0, arg3, 0);
        if (class95.field1628 < 100) {
            return;
        }
        if (class69.field1110 == null || class69.field1110.field3084 != arg0 || class69.field1110.field3085 != arg3) {
            class259 var5 = new class259(arg0, arg3);
            class47.method291(var5.field4527, arg0, arg3);
            class78.method510(class255.field4497, 0, arg2 ^ 0xFFFFDD11, arg3, class5.field67, arg0, 0, 0, 0);
            class69.field1110 = var5;
            class240.field4215.method1016((byte) -52);
        }
        class69.field1110.method719(arg4, arg1);
        int var6 = class178.field3072 * arg0 / class255.field4497;
        int var7 = class246.field4335 * arg3 / class5.field67 + arg1;
        int var8 = class153.field2688 * arg3 / class5.field67;
        int var9 = class240.field4222 * arg0 / class255.field4497 + arg4;
        class47.method283(var9, var7, var6, var8, 16711680, 128);
        class47.method298(var9, var7, var6, var8, 16711680);
        if (class29.field446 <= 0 || (class29.field446 % 10) >= 5) {
            return;
        }
        for (class143 var10 = (class143) class134.field2386.method550(-78); var10 != null; var10 = (class143) class134.field2386.method545(104)) {
            if (class32.field484 == var10.field2513) {
                int var11 = var10.field2508 * arg0 / class255.field4497 + arg4;
                int var12 = var10.field2505 * arg3 / class5.field67 + arg1;
                class47.method299(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field2960 = null;
        field2956 = null;
        field2957 = null;
        field2966 = null;
        field2950 = null;
        field2970 = null;
        field2975 = null;
        field2967 = null;
        field2954 = null;
        if (arg0 <= 30) {
            field2958 = null;
        }
        field2965 = null;
        field2961 = null;
        field2972 = null;
        field2968 = null;
        field2959 = null;
        field2963 = null;
        field2949 = null;
        field2962 = null;
        field2958 = null;
        field2974 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1167(int arg0, int arg1, int arg2, int arg3) {
        if (class231.method1498(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class34.method205(var4 + 1, class92.field1575[arg0][arg1][arg2] + arg3, var5 + 1) && class34.method205(var4 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class34.method205(var4 + 128 - 1, class92.field1575[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class34.method205(var4 + 1, class92.field1575[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lwa;")
    public static final class131 method1168(int arg0, int arg1) {
        class131 var2 = (class131) class153.field2681.method252(true, (long) arg1);
        field2953++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class269.field4678.method775(1, arg1 & 0x7FFF, -24799);
        } else {
            var3 = class151.field2636.method775(1, arg1, -24799);
        }
        class131 var4 = new class131();
        if (var3 != null) {
            var4.method961(-119, new class85(var3));
        }
        if (arg0 <= arg1) {
            var4.method964((byte) -70);
        }
        class153.field2681.method251(var4, (byte) 94, (long) arg1);
        return var4;
    }
}
