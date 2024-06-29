import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Led;")
    public static class43 field474 = class191.method1219("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", false);

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Led;")
    private static class43 field477 = class191.method1219("Error loading your profile)3", false);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field478 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Led;")
    public static class43 field475 = field477;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    public static int[] field473;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method127(int arg0) {
        field473 = null;
        field477 = null;
        field475 = null;
        field474 = null;
        if (arg0 != 16) {
            method128(false, null, null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLwc;Lwc;)V")
    public static final void method128(boolean arg0, class202 arg1, class202 arg2) {
        field476++;
        if (class40.field755 == null) {
            class40.field755 = class106.method658(-11889, class64.field1315, class68.field1363, class157.field3171);
        }
        if (class145.field2973 == null) {
            class145.field2973 = class84.method512(class157.field3171, class91.field1812, class68.field1363, (byte) -47);
        }
        if (class50.field1017 == null) {
            class50.field1017 = class84.method512(class157.field3171, class53.field1072, class68.field1363, (byte) -47);
        }
        if (class47.field953 == null) {
            class47.field953 = class84.method512(class157.field3171, class204.field3980, class68.field1363, (byte) -47);
        }
        class168.method1046(0, 23, 765, 480, 0);
        class168.method1049(0, 0, 125, 23, 12425273, 9135624);
        class168.method1049(125, 0, 640, 23, 5197647, 2697513);
        arg1.method935(class191.field3726, 62, 15, 0, -1);
        if (class47.field953 != null) {
            class47.field953[1].method1163(140, 1);
            arg2.method954(class93.field1843, 152, 10, 16777215, -1);
            class47.field953[0].method1163(140, 12);
            arg2.method954(class61.field1257, 152, 21, 16777215, -1);
        }
        if (!arg0) {
            return;
        }
        if (class50.field1017 != null) {
            short var3 = 280;
            if (class105.field2016[0] == 0 && class119.field2384[0] == 0) {
                class50.field1017[2].method1163(var3, 4);
            } else {
                class50.field1017[0].method1163(var3, 4);
            }
            short var4 = 500;
            if (class105.field2016[0] == 0 && class119.field2384[0] == 1) {
                class50.field1017[3].method1163(var3 + 15, 4);
            } else {
                class50.field1017[1].method1163(var3 + 15, 4);
            }
            arg1.method954(class29.field530, var3 + 32, 17, 16777215, -1);
            short var5 = 610;
            short var6 = 390;
            if (class105.field2016[0] == 1 && class119.field2384[0] == 0) {
                class50.field1017[2].method1163(var6, 4);
            } else {
                class50.field1017[0].method1163(var6, 4);
            }
            if (class105.field2016[0] == 1 && class119.field2384[0] == 1) {
                class50.field1017[3].method1163(var6 + 15, 4);
            } else {
                class50.field1017[1].method1163(var6 + 15, 4);
            }
            arg1.method954(class171.field3406, var6 + 32, 17, 16777215, -1);
            if (class105.field2016[0] == 2 && class119.field2384[0] == 0) {
                class50.field1017[2].method1163(var4, 4);
            } else {
                class50.field1017[0].method1163(var4, 4);
            }
            if (class105.field2016[0] == 2 && class119.field2384[0] == 1) {
                class50.field1017[3].method1163(var4 + 15, 4);
            } else {
                class50.field1017[1].method1163(var4 + 15, 4);
            }
            arg1.method954(class36.field684, var4 + 32, 17, 16777215, -1);
            if (class105.field2016[0] == 3 && class119.field2384[0] == 0) {
                class50.field1017[2].method1163(var5, 4);
            } else {
                class50.field1017[0].method1163(var5, 4);
            }
            if (class105.field2016[0] == 3 && class119.field2384[0] == 1) {
                class50.field1017[3].method1163(var5 + 15, 4);
            } else {
                class50.field1017[1].method1163(var5 + 15, 4);
            }
            arg1.method954(class156.field3146, var5 + 32, 17, 16777215, -1);
        }
        class168.method1046(708, 4, 50, 16, 0);
        arg2.method935(class156.field3144, 733, 16, 16777215, -1);
        class89.field1784 = -1;
        if (class40.field755 == null) {
            return;
        }
        byte var7 = 88;
        int var8 = 765 / (var7 + 1);
        byte var9 = 19;
        int var10 = 480 / (var9 + 1);
        int var11;
        int var12;
        do {
            var11 = var8;
            if ((var8 - 1) * var10 >= class4.field88) {
                var8--;
            }
            var12 = var10;
            if (class4.field88 <= (var10 - 1) * var8) {
                var10--;
            }
            if (class4.field88 <= (var10 - 1) * var8) {
                var10--;
            }
        } while (var10 != var12 || var8 != var11);
        int var13 = (480 - var9 * var10) / (var10 - -1);
        int var14 = (765 - var7 * var8) / (var8 - -1);
        if (var13 > 5) {
            var13 = 5;
        }
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (480 - (var10 - 1) * var13 - var9 * var10) / 2;
        int var16 = (765 - var7 * var8 - (var8 - 1) * var14) / 2;
        int var17 = var16;
        int var18 = var15 + 23;
        int var19 = 0;
        for (int var20 = 0; var20 < class4.field88; var20++) {
            boolean var21 = true;
            class173 var22 = class107.field2058[var20];
            class43 var23 = class30.method161(var22.field3456, 10);
            if (var22.field3456 == -1) {
                var21 = false;
                var23 = class105.field2012;
            } else if (var22.field3456 > 1980) {
                var21 = false;
                var23 = class17.field282;
            }
            if (var17 <= class185.field3654 && class105.field1998 >= var18 && class185.field3654 < var7 + var17 && var9 + var18 > class105.field1998 && var21) {
                class89.field1784 = var20;
                class40.field755[var22.field3452 ? 1 : 0].method792(var17, var18, 128, 16777215);
            } else {
                class40.field755[var22.field3452 ? 1 : 0].method785(var17, var18);
            }
            if (class145.field2973 != null) {
                class145.field2973[(var22.field3452 ? 8 : 0) + var22.field3448].method1163(var17 + 29, var18);
            }
            arg1.method935(class30.method161(var22.field3458, 10), var17 + 15, var9 / 2 + var18 + 5, 0, -1);
            arg2.method935(var23, var17 + 60, var18 - -(var9 / 2) - -5, 268435455, -1);
            var18 += var9 + var13;
            var19++;
            if (var19 >= var10) {
                var17 += var7 + var14;
                var18 = var15 + 23;
                var19 = 0;
            }
        }
    }
}
