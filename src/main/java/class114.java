import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class114 extends class123 {

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "[B")
    public byte[] field2712;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lvc;")
    private static class137 field2708 = class45.method325("Add friend", -46);

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lvc;")
    public static class137 field2695 = class45.method325("sich mit einer anderen Welt zu verbinden)3", -46);

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lvc;")
    private static class137 field2702 = class45.method325("Your account is already logged in)3", -46);

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "Lvc;")
    public static class137 field2713 = class45.method325("(U", -46);

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lvc;")
    public static class137 field2705 = class45.method325("Wen m-Ochten Sie entfernen?", -46);

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    public static int field2711 = -1;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "Lvc;")
    public static class137 field2710 = class45.method325("W-=hlen Sie eine Option", -46);

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Lvc;")
    private static class137 field2691 = class45.method325("Loading game screen )2 ", -46);

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "Lvc;")
    public static class137 field2715 = field2708;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Lvc;")
    public static class137 field2696 = field2702;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Lvc;")
    public static class137 field2699 = field2691;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lvc;")
    private static class137 field2692 = class45.method325("Loading )2 please wait)3", -46);

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lvc;")
    public static class137 field2723 = field2692;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Z")
    public static boolean field2707 = true;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "Lvc;")
    private static class137 field2718 = class45.method325(" is already on your friend list", -46);

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lvc;")
    public static class137 field2693 = field2718;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lvc;")
    public static class137 field2704 = class45.method325("Ihr Spielkonto wurde deaktiviert)3", -46);

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "Z")
    public static boolean field2725 = true;

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "Lvc;")
    private static class137 field2720 = class45.method325("Loaded gamescreen", -46);

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "Lvc;")
    public static class137 field2721 = field2720;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "[I")
    public static int[] field2694;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
    public static final void method885(byte arg0, int arg1) {
        field2724++;
        if (!class131.method963(14251)) {
            return;
        }
        int var2 = -82 / ((48 - arg0) / 57);
        if (class104.field2408) {
            class75.field1687 = arg1;
        } else {
            class86.method636(88, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Ltd;")
    public static final class126 method886(int arg0, int arg1) {
        class126 var2 = (class126) class84.field1894.method758((long) arg1, (byte) -117);
        field2714++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field2425.method668(arg0, arg0 ^ 0xFFFFFF2C, arg1);
        class126 var4 = new class126();
        var4.field2966 = arg1;
        if (var3 != null) {
            var4.method940(arg0 ^ 0x3, new class109(var3));
        }
        var4.method948(1);
        if (var4.field2961) {
            var4.field2917 = false;
            var4.field2919 = false;
        }
        class84.field1894.method760(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2697++;
        class30.field663[0].method394(arg2, arg5);
        int var6 = (arg1 - 32) * arg1 / arg4;
        if (arg0 != -7519) {
            return;
        }
        class30.field663[1].method394(arg2, arg1 + arg5 - 16);
        class62.method454(arg2, arg5 + 16, 16, arg1 - 32, class59.field1252);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg3 / (arg4 - arg1);
        class62.method454(arg2, arg5 + var7 + 16, 16, var6, class59.field1274);
        class62.method452(arg2, arg5 + var7 + 16, var6, class84.field1882);
        class62.method452(arg2 + 1, arg5 - -var7 + 16, var6, class84.field1882);
        class62.method453(arg2, var7 + arg5 + 16, 16, class84.field1882);
        class62.method453(arg2, arg5 + var7 + 17, 16, class84.field1882);
        class62.method452(arg2 + 15, var7 + 16 + arg5, var6, class2.field45);
        class62.method452(arg2 + 14, arg5 - -var7 + 17, var6 - 1, class2.field45);
        class62.method453(arg2, arg5 + var6 + var7 + 15, 16, class2.field45);
        class62.method453(arg2 + 1, arg5 + 14 - -var7 - -var6, 15, class2.field45);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLnb;I)Lvd;")
    public static final class138 method888(int arg0, byte arg1, class88 arg2, int arg3) {
        int var4 = -48 / ((arg1 + 75) / 45);
        field2716++;
        return class8.method55(arg2, arg3, 94, arg0) ? class80.method586(true) : null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        this.field2712 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lnb;Lnb;ILnb;)V")
    public static final void method889(class88 arg0, class88 arg1, int arg2, class88 arg3) {
        class108.field2509 = arg0;
        field2703++;
        class33.field719 = arg1;
        class105.field2440 = arg3;
        if (arg2 >= -108) {
            method888(18, (byte) -7, null, 90);
        }
        class36.field795 = new class85[class108.field2509.method661(127)][];
        class102.field2386 = new boolean[class108.field2509.method661(126)];
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method890(int arg0) {
        field2705 = null;
        field2692 = null;
        field2694 = null;
        field2720 = null;
        field2713 = null;
        field2723 = null;
        field2715 = null;
        field2695 = null;
        int var1 = -17 / ((arg0 - 27) / 50);
        field2708 = null;
        field2691 = null;
        field2696 = null;
        field2704 = null;
        field2702 = null;
        field2718 = null;
        field2721 = null;
        field2699 = null;
        field2710 = null;
        field2693 = null;
    }
}
