import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class180 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lda;")
    public static class275 field3092 = class255.method1672(117, "Loading world list data");

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Lda;")
    public static class275 field3091 = class255.method1672(100, ":tradereq:");

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lda;")
    public static class275 field3096 = class255.method1672(97, "");

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lda;")
    public static class275 field3089 = class255.method1672(110, "(U3");

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lma;")
    public static class105 field3088;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3097++;
        for (class249 var5 = (class249) class277.field4835.method550(-117); var5 != null; var5 = (class249) class277.field4835.method545(104)) {
            class189.method1252(arg2, arg4, arg1, arg0, var5, arg3 + 16777216);
        }
        if (arg3 != -16777216) {
            field3096 = null;
        }
        for (class249 var6 = (class249) class135.field2387.method550(arg3 ^ 0xFFFFA2); var6 != null; var6 = (class249) class135.field2387.method545(arg3 ^ 0xFF000068)) {
            byte var10 = 1;
            if (var6.field4384.field1788 == var6.field4384.field1736) {
                var10 = 0;
            } else if (var6.field4384.field1788 == var6.field4384.field1761) {
                var10 = 2;
            }
            if (var6.field4389 != var10) {
                int var11 = class133.method977(var6.field4384, -1);
                if (var6.field4392 != var11) {
                    if (var6.field4380 != null) {
                        class258.field4522.method1426(var6.field4380);
                        var6.field4380 = null;
                    }
                    var6.field4392 = var11;
                }
                var6.field4389 = var10;
            }
            var6.field4374 = var6.field4384.field1770;
            var6.field4388 = var6.field4384.field1770 + (var6.field4384.method750((byte) -120) * 64);
            var6.field4377 = var6.field4384.field1758;
            var6.field4381 = var6.field4384.field1758 + (var6.field4384.method750((byte) -118) * 64);
            class189.method1252(arg2, arg4, arg1, arg0, var6, 0);
        }
        for (class249 var7 = (class249) class35.field566.method1864((byte) -103); var7 != null; var7 = (class249) class35.field566.method1869(-1)) {
            byte var8 = 1;
            if (var7.field4395.field1788 == var7.field4395.field1736) {
                var8 = 0;
            } else if (var7.field4395.field1788 == var7.field4395.field1761) {
                var8 = 2;
            }
            if (var7.field4389 != var8) {
                int var9 = class256.method1676((byte) -127, var7.field4395);
                if (var7.field4392 != var9) {
                    if (var7.field4380 != null) {
                        class258.field4522.method1426(var7.field4380);
                        var7.field4380 = null;
                    }
                    var7.field4392 = var9;
                }
                var7.field4389 = var8;
            }
            var7.field4374 = var7.field4395.field1770;
            var7.field4388 = var7.field4395.field1770 + (var7.field4395.method750((byte) -121) * 64);
            var7.field4377 = var7.field4395.field1758;
            var7.field4381 = var7.field4395.field1758 + (var7.field4395.method750((byte) -110) * 64);
            class189.method1252(arg2, arg4, arg1, arg0, var7, 0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method1208(boolean arg0) {
        field3089 = null;
        field3088 = null;
        field3096 = null;
        if (!arg0) {
            method1209(false);
        }
        field3092 = null;
        field3091 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)[Lrk;")
    public static final class20[] method1209(boolean arg0) {
        class20[] var1 = new class20[class151.field2633];
        for (int var2 = 0; var2 < class151.field2633; var2++) {
            var1[var2] = new class20(class267.field4646, class250.field4419, class114.field2010[var2], class246.field4357[var2], class152.field2662[var2], class32.field480[var2], class67.field1101[var2], class270.field4695);
        }
        if (!arg0) {
            field3091 = null;
        }
        class134.method978(65);
        field3094++;
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Lce;")
    public static final class112 method1210(int arg0, int arg1, int arg2, int arg3) {
        class112 var4 = new class112();
        field3093++;
        var4.field1977 = arg2;
        var4.field1978 = arg3;
        class267.field4633.method1867(true, (long) arg1, var4);
        class144.method1029(arg2, 1);
        class229 var5 = class261.method1709(arg1, -114);
        if (var5 != null) {
            class40.method231(var5, arg0 ^ 0xFFFFA239);
        }
        if (class45.field754 != null) {
            class40.method231(class45.field754, 0);
            class45.field754 = null;
        }
        int var6 = class52.field863;
        int var7 = 0;
        if (arg0 != -24007) {
            method1207(-1, -84, 107, -116, -78);
        }
        while (var6 > var7) {
            if (class30.method181(class137.field2400[var7], (byte) 60)) {
                class17.method89(var7, 1);
            }
            var7++;
        }
        if (class52.field863 == 1) {
            class63.field1051 = false;
            class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
        } else {
            class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
            int var8 = class93.field1599.method113(class52.field878);
            for (int var9 = 0; var9 < class52.field863; var9++) {
                int var10 = class93.field1599.method113(class269.method1774(var9, (byte) -127));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class6.field84 = var8 + 8;
            class29.field445 = class52.field863 * 15 + 22;
        }
        if (var5 != null) {
            class92.method666(var5, false, -1811);
        }
        class146.method1042(arg2, arg0 ^ 0xFFFFA24B);
        if (class166.field2881 != -1) {
            class37.method222(1, class166.field2881, (byte) -101);
        }
        return var4;
    }
}
