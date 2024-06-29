import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class135 {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lpd;")
    private static class94 field3317 = class28.method249(120, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lpd;")
    public static class94 field3320 = field3317;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lpd;")
    private static class94 field3322 = class28.method249(69, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lpd;")
    public static class94 field3311 = class28.method249(96, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Z")
    public static boolean field3323 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lpd;")
    public static class94 field3318 = field3322;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lpd;")
    public static class94 field3324 = class28.method249(85, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Ls;")
    public static class111 field3310;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lla;")
    public static class66 field3319;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[Ltc;")
    public static class116[] field3321;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method1064(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 != 7) {
            field3312 = 76;
        }
        field3315++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZBLpd;Lpd;)V", line = 28)
    public static final void method1065(boolean arg0, byte arg1, class94 arg2, class94 arg3) {
        if (class9.field249) {
            class9.field249 = false;
            class46.method342((byte) -49);
            class87.method638((byte) 127);
            class19.method149(false);
            class90.method676((byte) -126);
            class66.method494(class102.field2569, class2.field58, class112.field2835, -1, class97.field2473);
            class17.method128(class45.field1108 == -1, class42.field1065, -1, class92.field2361, (byte) 35);
            class37.field955 = true;
            class6.field111 = true;
            class63.field1532 = true;
        }
        class33.method272(101);
        field3308++;
        short var4 = 151;
        int var6 = var4 - 3;
        if (arg1 != 124) {
            method1065(true, (byte) -4, null, null);
        }
        class112.field2835.method120(arg2, 257, var6, 0);
        class112.field2835.method120(arg2, 256, var6 - 1, 16777215);
        if (arg3 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class112.field2835.method118(arg3) + 4;
                class130.method1028(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class112.field2835.method120(arg3, 257, var6, 0);
            class112.field2835.method120(arg3, 256, var6 - 1, 16777215);
        }
        class45.method341(false);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 80)
    public static final void method1066(int arg0) {
        class113.method839(null, false, 0, 116);
        field3309++;
        if (arg0 > -78) {
            method1066(104);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 98)
    public static void method1067(boolean arg0) {
        field3317 = null;
        if (arg0) {
            method1065(false, (byte) -40, null, null);
        }
        field3318 = null;
        field3324 = null;
        field3311 = null;
        field3321 = null;
        field3322 = null;
        field3319 = null;
        field3320 = null;
        field3310 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 122)
    public static final void method1068(byte arg0) {
        int var1 = 13 / ((arg0 - 11) / 58);
        class111.field2773.method1013(-1);
        field3316++;
        class28.field793.method1013(-1);
        class9.field253.method1013(-1);
    }
}
