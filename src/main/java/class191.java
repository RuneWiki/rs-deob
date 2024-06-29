import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class191 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ltg;")
    private static class184 field3715 = class135.method812("Close", 3);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3712 = -1;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[Ltg;")
    public static class184[] field3710 = new class184[1000];

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Ltg;")
    private static class184 field3727 = class135.method812("Sorry invited players only)3", 3);

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Ltg;")
    public static class184 field3720 = field3727;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[I")
    public static int[] field3725 = new int[128];

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Ltg;")
    public static class184 field3730 = field3715;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3733 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "J")
    public long field3721;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lvb;")
    public static class197 field3719;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lfb;")
    public class52 field3716;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lfb;")
    public class52 field3722;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lfb;")
    public class52 field3728;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[Lrh;")
    public static class167[] field3714;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[[[B")
    public static byte[][][] field3724;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILvb;Lvb;Lvb;)V")
    public static final void method1221(int arg0, class197 arg1, class197 arg2, class197 arg3) {
        field3718++;
        if (arg0 != 64) {
            method1221(32, null, null, null);
        }
        class69.field1321 = arg3.method1261(class39.field741, (byte) -121);
        class14.field261 = arg2.method1261(class111.field2022, (byte) -121);
        class120.field2158 = arg2.method1261(class40.field745, (byte) 122);
        class19.field359 = arg2.method1261(class44.field834, (byte) 36);
        class34.field594 = arg2.method1261(class60.field1116, (byte) -124);
        class138.field2501 = arg2.method1261(class32.field542, (byte) 112);
        class36.field683 = arg2.method1261(class116.field2097, (byte) 16);
        class82.field1470 = arg2.method1261(class9.field164, (byte) -117);
        class18.field332 = arg2.method1261(class55.field987, (byte) 36);
        class97.field1783 = arg2.method1261(class82.field1461, (byte) 38);
        class182.field3509 = arg2.method1261(class161.field2897, (byte) -124);
        class21.field389 = arg1.method1261(class190.field3696, (byte) -128);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZ)V")
    public static final void method1222(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3727 = null;
        }
        if (class201.field3889 != arg1) {
            class131.field2381 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class131.field2381[var3] = (var3 << 12) / arg1;
            }
            class51.field937 = arg1 - 1;
            class201.field3889 = arg1;
        }
        field3729++;
        if (class114.field2074 == arg0) {
            return;
        }
        class37.field698 = new int[arg0];
        for (int var4 = 0; var4 < arg0; var4++) {
            class37.field698[var4] = (var4 << 12) / arg0;
        }
        class173.field3274 = arg0 - 1;
        class114.field2074 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILde;)V")
    public static final void method1223(int arg0, class35 arg1) {
        field3713++;
        if (class161.field2903 == arg1.field632 || arg1.field612 == -1 || arg1.field630 != 0 || arg1.field595 + 1 > class83.method465(arg1.field612, -1).field3638[arg1.field600]) {
            int var2 = arg1.field632 - arg1.field620;
            int var3 = class161.field2903 - arg1.field620;
            int var4 = arg1.field657 * 128 + arg1.field651 * 64;
            int var5 = arg1.field665 * 128 + arg1.field651 * 64;
            int var6 = arg1.field651 * 64 + arg1.field608 * 128;
            arg1.field635 = ((var2 - var3) * var6 + var3 * var4) / var2;
            int var7 = arg1.field618 * 128 + arg1.field651 * 64;
            arg1.field614 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0 != 128) {
            field3725 = null;
        }
        if (arg1.field603 == 0) {
            arg1.field649 = 1024;
        }
        arg1.field664 = 0;
        if (arg1.field603 == 1) {
            arg1.field649 = 1536;
        }
        if (arg1.field603 == 2) {
            arg1.field649 = 0;
        }
        if (arg1.field603 == 3) {
            arg1.field649 = 512;
        }
        arg1.field647 = arg1.field649;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lrh;Loe;IIIII)V")
    public static final void method1224(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3717++;
        if (arg1 == null) {
            return;
        }
        int var7 = class38.field716 + class2.field39 & 0x7FF;
        int var8 = Math.max(arg0.field3045 / 2, arg0.field3089 / 2) + 10;
        int var9 = arg2 * arg2 + arg4 * arg4;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class23.field422[var7];
        int var11 = class23.field434[var7];
        int var12 = var11 * 256 / (class182.field3491 + 256);
        if (arg5 == 128) {
            int var13 = var10 * 256 / (class182.field3491 + 256);
            int var14 = arg2 * var12 - arg4 * var13 >> 16;
            int var15 = arg2 * var13 + arg4 * var12 >> 16;
            arg1.method843(arg0.field3045 / 2 + arg6 + var15 - arg1.field2495 / 2, -(arg1.field2496 / 2) + arg3 - (-(arg0.field3089 / 2) - -var14), arg0.field3093, arg0.field3024);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field3725 = null;
        field3715 = null;
        field3720 = null;
        field3730 = null;
        field3719 = null;
        field3710 = null;
        field3727 = null;
        if (arg0 != -1) {
            field3727 = null;
        }
        field3724 = null;
        field3714 = null;
    }
}
