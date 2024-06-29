import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class134 extends class97 {

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lwd;")
    private static class150 field3144 = class2.method9(true, "M");

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lwd;")
    public static class150 field3147 = field3144;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lua;")
    public static class135 field3148 = new class135();

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field3156 = -1;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3160 = -1;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lwd;")
    public static class150 field3159 = class2.method9(true, "hel");

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field3161 = -1;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Li;")
    public static class56 field3157 = new class56(64);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
    public static int[] field3163 = new int[25];

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lu;")
    public class134 field3143;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lu;")
    public class134 field3151;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lv;")
    public static class140 field3150;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public final void method996(int arg0) {
        field3145++;
        if (this.field3143 == null) {
            return;
        }
        if (arg0 != -3) {
            field3148 = null;
        }
        this.field3143.field3151 = this.field3151;
        this.field3151.field3143 = this.field3143;
        this.field3143 = null;
        this.field3151 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field3150 = null;
        field3159 = null;
        field3163 = null;
        field3148 = null;
        field3157 = null;
        field3144 = null;
        if (!arg0) {
            field3160 = -55;
        }
        field3147 = null;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)I")
    public static final int method998(byte arg0) {
        field3152++;
        int var1 = class25.method205(class61.field1591, class17.field466, -23287, class46.field1248);
        if (arg0 == -72) {
            return var1 - class130.field3061 >= 800 || (class131.field3097[class17.field466][class61.field1591 >> 7][class46.field1248 >> 7] & 0x4) == 0 ? 3 : class17.field466;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static final void method999(byte arg0) {
        field3154++;
        class41.method294(-2607);
        class135.field3186 = true;
        class43.method332((byte) 36);
        if (class61.field1551) {
            field3150.method1052(class43.field1180, 239, 40, 0);
            field3150.method1052(class111.method786((byte) 126, new class150[] { class43.field1188, class72.field1806 }), 239, 60, 128);
        } else if (class46.field1251 == 1) {
            field3150.method1052(class28.field844, 239, 40, 0);
            field3150.method1052(class111.method786((byte) 35, new class150[] { class43.field1189, class72.field1806 }), 239, 60, 128);
        } else if (class46.field1251 == 2) {
            field3150.method1052(class74.field1847, 239, 40, 0);
            field3150.method1052(class111.method786((byte) 124, new class150[] { class43.field1189, class72.field1806 }), 239, 60, 128);
        } else if (class46.field1251 == 3) {
            if (class43.field1189 != class43.field1162) {
                class127.method952((byte) -98, class43.field1189);
                class43.field1162 = class43.field1189;
            }
            class140 var17 = class22.field646;
            class120.method874(0, 0, 463, 77);
            for (int var18 = 0; var18 < class21.field575; var18++) {
                int var19 = var18 * 14 + 18 - class119.field2769;
                if (var19 > 0 && var19 < 110) {
                    var17.method1052(class105.field2367[var18], 239, var19, 0);
                }
            }
            class120.method871();
            if (class21.field575 > 5) {
                class26.method211(77, class21.field575 * 14 + 7, 463, 0, 27714, class119.field2769);
            }
            if (class43.field1189.method1174((byte) -124) == 0) {
                field3150.method1052(class131.field3089, 239, 40, 255);
            } else if (class21.field575 == 0) {
                field3150.method1052(class104.field2352, 239, 40, 0);
            }
            var17.method1052(class111.method786((byte) 96, new class150[] { class43.field1189, class72.field1806 }), 239, 90, 0);
            class120.method867(0, 77, 479, 0);
        } else if (class46.field1251 == 4) {
            field3150.method1052(class43.field1187, 239, 40, 0);
            field3150.method1052(class111.method786((byte) -114, new class150[] { class43.field1189, class72.field1806 }), 239, 60, 128);
        } else if (class113.field2634 != null) {
            field3150.method1040(class113.field2634, 10, 20, 459, 40, 0, false, 1, 1, 0);
            field3150.method1052(class90.field2099, 239, 80, 128);
        } else if (class66.field1688 != -1) {
            boolean var1 = class148.method1135(0, class66.field1688, (byte) 116, 479, 2, 0, 96);
            if (!var1) {
                class40.field1067 = true;
            }
        } else if (class29.field882 == -1) {
            class140 var2 = class22.field646;
            class120.method874(0, 0, 463, 77);
            int var3 = 0;
            for (int var4 = 0; var4 < 100; var4++) {
                if (class38.field1042[var4] != null) {
                    int var6 = class133.field3121[var4];
                    int var7 = class99.field2253 + 70 - var3 * 14;
                    class150 var8 = class26.field790[var4];
                    byte var9 = 0;
                    if (var8 != null && var8.method1203(true, class109.field2521)) {
                        var9 = 1;
                        var8 = var8.method1196(5, -31851);
                    }
                    if (var8 != null && var8.method1203(true, class4.field81)) {
                        var9 = 2;
                        var8 = var8.method1196(5, -31851);
                    }
                    if (var6 == 0) {
                        var3++;
                        if (var7 > 0 && var7 < 110) {
                            var2.method1053(class38.field1042[var4], 4, var7, 0);
                        }
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || class135.field3183 == 0 || class135.field3183 == 1 && class133.method994(var8, false))) {
                        var3++;
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                class133.field3117[0].method803(var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                class133.field3117[1].method803(var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method1053(class111.method786((byte) 45, new class150[] { var8, class43.field1199 }), var10, var7, 0);
                            int var11 = var10 + var2.method1038(var8) + 8;
                            var2.method1053(class38.field1042[var4], var11, var7, 255);
                        }
                    }
                    if ((var6 == 3 || var6 == 7) && class119.field2755 == 0 && (var6 == 7 || class6.field151 == 0 || class6.field151 == 1 && class133.method994(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method1053(class70.field1776, var12, var7, 0);
                            int var13 = var12 + var2.method1038(class70.field1776);
                            int var14 = var13 + var2.method1036(32);
                            if (var9 == 1) {
                                class133.field3117[0].method803(var14, var7 - 12);
                                var14 += 14;
                            }
                            if (var9 == 2) {
                                class133.field3117[1].method803(var14, var7 - 12);
                                var14 += 14;
                            }
                            var2.method1053(class111.method786((byte) 107, new class150[] { var8, class43.field1199 }), var14, var7, 0);
                            int var15 = var14 + var2.method1038(var8) + 8;
                            var2.method1053(class38.field1042[var4], var15, var7, 8388608);
                        }
                        var3++;
                    }
                    if (var6 == 4 && (field3149 == 0 || field3149 == 1 && class133.method994(var8, false))) {
                        var3++;
                        if (var7 > 0 && var7 < 110) {
                            var2.method1053(class111.method786((byte) 9, new class150[] { var8, class8.field172, class38.field1042[var4] }), 4, var7, 8388736);
                        }
                    }
                    if (var6 == 5 && class119.field2755 == 0 && class6.field151 < 2) {
                        var3++;
                        if (var7 > 0 && var7 < 110) {
                            var2.method1053(class38.field1042[var4], 4, var7, 8388608);
                        }
                    }
                    if (var6 == 6 && class119.field2755 == 0 && class6.field151 < 2) {
                        var3++;
                        if (var7 > 0 && var7 < 110) {
                            var2.method1053(class111.method786((byte) -109, new class150[] { class108.field2477, class8.field172, var8, class43.field1199 }), 4, var7, 0);
                            var2.method1053(class38.field1042[var4], var2.method1038(class111.method786((byte) 38, new class150[] { class108.field2477, class8.field172, var8 })) + 12, var7, 8388608);
                        }
                    }
                    if (var6 == 8 && (field3149 == 0 || field3149 == 1 && class133.method994(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method1053(class111.method786((byte) -124, new class150[] { var8, class8.field172, class38.field1042[var4] }), 4, var7, 8270336);
                        }
                        var3++;
                    }
                }
            }
            class120.method871();
            class146.field3529 = var3 * 14 + 7;
            if (class146.field3529 < 78) {
                class146.field3529 = 78;
            }
            class26.method211(77, class146.field3529, 463, 0, 27714, class146.field3529 - class99.field2253 - 77);
            class150 var5;
            if (class46.field1244 == null || class46.field1244.field2555 == null) {
                var5 = class94.field2171;
            } else {
                var5 = class46.field1244.field2555;
            }
            var2.method1053(class111.method786((byte) -113, new class150[] { var5, class43.field1199 }), 4, 90, 0);
            var2.method1053(class111.method786((byte) -125, new class150[] { class43.field1193, class72.field1806 }), var2.method1038(class111.method786((byte) 121, new class150[] { var5, class73.field1813 })) + 6, 90, 255);
            class120.method867(0, 77, 479, 0);
        } else {
            boolean var16 = class148.method1135(0, class29.field882, (byte) 124, 479, 3, 0, 96);
            if (!var16) {
                class40.field1067 = true;
            }
        }
        if (class145.field3517 && class12.field305 == 2) {
            class135.method1004(-95);
        }
        class83.method600(15164);
        if (arg0 < 110) {
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILff;Lff;)I")
    public static final int method1000(int arg0, class42 arg1, class42 arg2) {
        field3142++;
        int var3 = arg0;
        if (arg1.method317(class94.field2178, class76.field1869, 5875)) {
            var3 = arg0 + 1;
        }
        if (arg2.method317(class94.field2178, class73.field1844, 5875)) {
            var3++;
        }
        if (arg2.method317(class94.field2178, class70.field1783, arg0 ^ 0x16F3)) {
            var3++;
        }
        if (arg2.method317(class94.field2178, class130.field3070, 5875)) {
            var3++;
        }
        if (arg2.method317(class94.field2178, class145.field3516, 5875)) {
            var3++;
        }
        if (arg2.method317(class94.field2178, class35.field966, 5875)) {
            var3++;
        }
        arg2.method317(class94.field2178, class76.field1875, 5875);
        arg2.method317(class94.field2178, class69.field1729, 5875);
        arg2.method317(class94.field2178, class21.field576, 5875);
        arg2.method317(class94.field2178, class49.field1303, 5875);
        arg2.method317(class94.field2178, class20.field525, arg0 + 5875);
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLhe;)V")
    public static final void method1001(byte arg0, class54 arg1) {
        field3155++;
        int var2 = 0;
        if (arg1.field1431 == 0) {
            var2 = class111.field2548.method938(arg1.field1422, arg1.field1429, arg1.field1414);
        }
        int var3 = -1;
        if (arg1.field1431 == 1) {
            var2 = class111.field2548.method892(arg1.field1422, arg1.field1429, arg1.field1414);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg1.field1431 == 2) {
            var2 = class111.field2548.method935(arg1.field1422, arg1.field1429, arg1.field1414);
        }
        int var6 = -15 / ((arg0 - 77) / 37);
        if (arg1.field1431 == 3) {
            var2 = class111.field2548.method902(arg1.field1422, arg1.field1429, arg1.field1414);
        }
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var7 = class111.field2548.method904(arg1.field1422, arg1.field1429, arg1.field1414, var2);
            var4 = var7 & 0x1F;
            var5 = var7 >> 6 & 0x3;
        }
        arg1.field1421 = var3;
        arg1.field1427 = var5;
        arg1.field1423 = var4;
    }
}
