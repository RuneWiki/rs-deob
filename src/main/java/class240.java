import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class240 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Loa;")
    public static class99 field4134 = class221.method1463(2844, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4142 = 0;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
    public static int[] field4156 = new int[128];

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Loa;")
    public static class99 field4151 = class221.method1463(2844, "(U5");

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Loa;")
    public static class99 field4158 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Loa;")
    public static class99 field4159 = class221.method1463(2844, " ");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "Ltg;")
    public static class182 field4157;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Loa;")
    public static class99 field4149;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[B")
    public byte[] field4135;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[B")
    public byte[] field4138;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[Lpi;")
    public static class139[] field4145;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method1561(byte arg0) {
        field4145 = null;
        field4156 = null;
        field4151 = null;
        field4158 = null;
        field4157 = null;
        field4149 = null;
        field4159 = null;
        field4134 = null;
        if (arg0 != -15) {
            field4133 = 112;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILtg;IIIZ)V")
    public static final void method1562(int arg0, class182 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4153++;
        class47.field790 = arg2;
        class161.field2860 = arg1;
        class34.field614 = 10000;
        class145.field2546 = arg0;
        class48.field797 = arg3;
        class90.field1545 = arg5;
        class53.field873 = arg4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIZIIIZ)Lpi;")
    public static final class139 method1563(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4140++;
        class166 var8 = class222.method1468(arg1 ^ 0xFFFFB594, arg4);
        if (arg2 > 1 && var8.field2961 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2932[var10] <= arg2 && var8.field2932[var10] != 0) {
                    var9 = var8.field2961[var10];
                }
            }
            if (var9 != -1) {
                var8 = class222.method1468(1, var9);
            }
        }
        class27 var11 = var8.method1129((byte) 3);
        if (var11 == null) {
            return null;
        }
        if (arg1 != -19051) {
            field4149 = null;
        }
        class4 var12 = null;
        if (var8.field2904 != -1) {
            var12 = (class4) method1563(false, -19051, 10, true, var8.field2925, 0, 1, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2924 != -1) {
            var12 = (class4) method1563(false, -19051, arg2, false, var8.field2967, arg5, arg6, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class68.field1141;
        int var14 = class68.field1139;
        int[] var15 = new int[4];
        int var16 = class68.field1140;
        class68.method448(var15);
        class4 var17 = new class4(36, 32);
        class68.method467(var17.field35, 36, 32);
        class134.method900();
        class134.method909(16, 16);
        int var18 = var8.field2945;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg6 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class134.field2346 = false;
        int var19 = class134.field2339[var8.field2959] * var18 >> 16;
        int var20 = class134.field2344[var8.field2959] * var18 >> 16;
        var11.method223(0, var8.field2941, var8.field2942, var8.field2959, var8.field2948, var19 + var8.field2956 - (var11.method226() / 2), var8.field2956 + var20, -1L);
        if (arg6 >= 1) {
            var17.method33(1);
            if (arg6 >= 2) {
                var17.method33(16777215);
            }
            class68.method467(var17.field35, 36, 32);
        }
        if (arg5 != 0) {
            var17.method34(arg5);
        }
        if (var8.field2904 != -1) {
            var12.method38(0, 0);
        } else if (var8.field2924 != -1) {
            class68.method467(var12.field35, 36, 32);
            var17.method38(0, 0);
            var17 = var12;
        }
        if (arg0 && (var8.field2920 == 1 || arg2 != 1) && arg2 != -1) {
            class125.field2199.method487(class65.method431((byte) 29, arg2), 0, 9, 16776960, 1);
        }
        class68.method467(var13, var16, var14);
        class68.method460(var15);
        class134.method900();
        class134.field2346 = true;
        return var17;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method1564(int arg0) {
        field4147++;
        if (class289.field5058 != null || class42.field717 != null) {
            return;
        }
        int var1 = class21.field243;
        if (class244.field4209) {
            if (var1 != 1) {
                int var6 = class172.field3054;
                int var7 = class38.field656;
                if (class90.field1539 - 10 > var6 || (class238.field4114 + class90.field1539 + 10) < var6 || var7 < class284.field4938 - 10 || class284.field4938 + class217.field3769 + 10 < var7) {
                    class244.field4209 = false;
                    class62.method408(class90.field1539, class217.field3769, arg0 ^ 0x42, class284.field4938, class238.field4114);
                }
            }
            if (var1 == 1) {
                int var8 = class90.field1539;
                int var9 = class284.field4938;
                int var10 = class238.field4114;
                int var11 = class122.field2133;
                int var12 = -1;
                int var13 = class11.field97;
                for (int var14 = 0; var14 < class258.field4497; var14++) {
                    int var15 = (class258.field4497 - var14 - 1) * 15 + var9 + 31;
                    if (var8 < var13 && var13 < (var8 + var10) && var11 > (var15 - 13) && var15 + 3 > var11) {
                        var12 = var14;
                    }
                }
                if (var12 != -1) {
                    class175.method1172((byte) 27, var12);
                }
                class244.field4209 = false;
                class62.method408(class90.field1539, class217.field3769, 121, class284.field4938, class238.field4114);
            }
        } else {
            if (var1 == 1 && class258.field4497 > 0) {
                short var2 = class258.field4502[class258.field4497 - 1];
                if (var2 == 38 || var2 == 24 || var2 == 26 || var2 == 48 || var2 == 9 || var2 == 13 || var2 == 36 || var2 == 43 || var2 == 32 || var2 == 14 || var2 == 29 || var2 == 1007) {
                    int var3 = class258.field4495[class258.field4497 - 1];
                    int var4 = class83.field1451[class258.field4497 - 1];
                    class107 var5 = class22.method131(var4, 1538872048);
                    if (class204.method1373(arg0 ^ 0xFFFFFBB3, client.method1066(var5)) || class256.method1654((byte) 109, client.method1066(var5))) {
                        class95.field1601 = 0;
                        class144.field2543 = false;
                        if (class289.field5058 != null) {
                            class238.method1555(class289.field5058, 10555);
                        }
                        class289.field5058 = class22.method131(var4, arg0 + 1538872010);
                        class204.field3545 = var3;
                        class276.field4864 = class122.field2133;
                        class218.field3798 = class11.field97;
                        class238.method1555(class289.field5058, 10555);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class143.field2522 == 1 && class258.field4497 > 2 || class132.method887((byte) 119, class258.field4497 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class258.field4497 > 0 || class244.field4218 == 1) {
                class78.method549(111);
            }
            if (var1 == 1 && class258.field4497 > 0 || class244.field4218 == 2) {
                class216.method1442(-22297);
            }
        }
        if (arg0 != 38) {
            method1563(true, -27, -10, true, -23, -22, 5, true);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)J")
    public static final long method1565(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3748; var4++) {
            class77 var5 = var3.field3743[var4];
            if ((var5.field1372 >> 29 & 0x3L) == 2L && var5.field1362 == arg1 && var5.field1357 == arg2) {
                return var5.field1372;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1566(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class197.field3437 <= arg1 - arg2 && arg1 + arg2 <= class79.field1395 && class178.field3101 <= (arg3 - arg2) && arg2 + arg3 <= class137.field2414) {
            class85.method583(arg4, arg1, arg3, arg6, arg0, arg2, 0);
        } else {
            class3.method22(arg4, arg3, 91, arg0, arg2, arg1, arg6);
        }
        field4136++;
        if (arg5 >= -41) {
            field4154 = -119;
        }
    }
}
