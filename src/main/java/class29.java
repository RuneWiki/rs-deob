import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lje;")
    public static class67 field510 = class85.method592(255, "Lade)3)3)3");

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lje;")
    private static class67 field515 = class85.method592(255, "The server is being updated)3");

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lje;")
    public static class67 field511 = field515;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lje;")
    public static class67 field520 = class85.method592(255, " x ");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lje;")
    public static class67 field519 = class85.method592(255, "sl_back");

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lje;")
    public static class67 field521 = class85.method592(255, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lje;")
    private static class67 field524 = class85.method592(255, "No reply from loginserver)3");

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lje;")
    public static class67 field523 = field524;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lqb;")
    public static class113 field517;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field512++;
        class8.method60(arg0, arg1, arg0 + arg4, arg1 - -arg3);
        class96.method751();
        class117.field2636++;
        class3.method13(true, false);
        class154.method1170(true, false);
        class3.method13(false, false);
        class154.method1170(false, false);
        class19.method135((byte) -81);
        class86.method606(23977);
        if (!class26.field474) {
            int var5 = class47.field874 + class148.field3385 & 0x7FF;
            int var6 = class40.field735;
            if (class103.field2326 / 256 > var6) {
                var6 = class103.field2326 / 256;
            }
            if (class151.field3453[4] && var6 < class116.field2629[4] + 128) {
                var6 = class116.field2629[4] + 128;
            }
            class128.method982(class58.field1171, class114.method924(class37.field667.field2957, class128.field2817, class37.field667.field2963, arg2 ^ 0xAC2) - 50, (byte) 91, var6, class6.field137, var5, var6 * 3 + 600);
        }
        int var7;
        if (class26.field474) {
            var7 = class68.method500(512);
        } else {
            var7 = class39.method241(127);
        }
        if (arg2 != -2730) {
            field519 = null;
        }
        int var8 = class101.field2274;
        int var9 = class3.field42;
        int var10 = class152.field3486;
        int var11 = class46.field853;
        int var12 = class83.field1828;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class151.field3453[var13]) {
                int var16 = (int) (Math.random() * (double) (class89.field1970[var13] * 2 + 1) + Math.sin((double) class40.field722[var13] / 100.0D * (double) class116.field2628[var13]) * (double) class116.field2629[var13] - (double) class89.field1970[var13]);
                if (var13 == 1) {
                    class3.field42 += var16;
                }
                if (var13 == 3) {
                    class83.field1828 = class83.field1828 + var16 & 0x7FF;
                }
                if (var13 == 0) {
                    class101.field2274 += var16;
                }
                if (var13 == 4) {
                    class46.field853 += var16;
                    if (class46.field853 < 128) {
                        class46.field853 = 128;
                    }
                    if (class46.field853 > 383) {
                        class46.field853 = 383;
                    }
                }
                if (var13 == 2) {
                    class152.field3486 += var16;
                }
            }
        }
        int var14 = class135.field3070;
        int var15 = class104.field2361;
        if (arg0 <= var14 && var14 < arg0 + arg4 && var15 >= arg1 && var15 < arg1 + arg3) {
            class5.field134 = class104.field2361 - arg1;
            class5.field126 = class135.field3070 - arg0;
            class5.field131 = true;
            class5.field117 = 0;
        } else {
            class5.field117 = 0;
            class5.field131 = false;
        }
        class67.method485(arg2 + 2728);
        class8.method70(arg0, arg1, arg4, arg3, 0);
        class67.method485(-2);
        class134.field3044.method343(class101.field2274, class3.field42, class152.field3486, class46.field853, class83.field1828, var7);
        class67.method485(-2);
        class134.field3044.method334();
        class86.method608(arg4, arg3, false, arg1, arg0);
        class150.method1150(arg1, 111, arg0);
        ((class69) class96.field2158).method503(class60.field1204, (byte) -102);
        class3.method15(arg3, (byte) 118, arg1, arg4, arg0);
        class3.field42 = var9;
        class46.field853 = var11;
        class83.field1828 = var12;
        class152.field3486 = var10;
        class101.field2274 = var8;
        if (class101.field2277 && class149.method1144(false, true, -518) == 0) {
            class101.field2277 = false;
        }
        if (class101.field2277) {
            class8.method70(arg0, arg1, arg4, arg3, 0);
            class6.method56(false, class39.field703, arg2 + 17219);
        }
        if (!class101.field2277 && !class12.field222 && var14 >= arg0 && arg0 + arg4 > var14 && var15 >= arg1 && arg1 + arg3 > var15) {
            class112.method895(var14, arg0, false, arg1, var15);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method190(byte arg0) {
        field515 = null;
        field520 = null;
        field524 = null;
        field517 = null;
        field519 = null;
        field521 = null;
        field510 = null;
        if (arg0 > -76) {
            method191(4);
        }
        field523 = null;
        field511 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method191(int arg0) {
        field514++;
        class30.field541.method767(1);
        class106.field2427.method767(1);
        int var1 = 55 % ((11 - arg0) / 38);
    }
}
