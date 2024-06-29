import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class44 {

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field690 = 50;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field682 = 2;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    public static int[] field687 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[I")
    public static int[] field692 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
    public static int[] field694 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    public static int[] field683 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    public static int[] field686 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[Lli;")
    public static class185[] field697 = new class185[field690];

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
    public static int[] field685 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "[I")
    public static int[] field696 = new int[field690];

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lae;")
    public static class238 field695 = new class238(64);

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "[Z")
    public static boolean[] field700 = new boolean[100];

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Lli;")
    public static class185 field704 = class245.method1649("<col=ffffff> )4 ", -56);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lhi;")
    public static class250 field684;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Lhi;")
    public static class250 field703;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static final void method267(int arg0) {
        for (class271 var1 = (class271) class87.field1715.method192(123); var1 != null; var1 = (class271) class87.field1715.method189(0)) {
            int var3 = var1.field4811;
            if (class127.method912(var3, (byte) -110)) {
                boolean var4 = true;
                class82[] var5 = class136.field2557[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1572;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var1.field1278;
                    class82 var8 = class116.method805(1, var7);
                    if (var8 != null) {
                        class229.method1581(var8, false);
                    }
                }
            }
        }
        field689++;
        int var2 = -2 / ((arg0 + 28) / 52);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public static final void method268(int arg0, int arg1) {
        field688++;
        class18 var2 = (class18) class152.field2871.method195(39, (long) arg0);
        if (arg1 != -13478) {
            method273(115, 30, -1, 55, -50, -119);
        }
        if (var2 != null) {
            var2.method476(arg1 ^ 0xFFFFCB2E);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method269(int arg0) {
        field692 = null;
        if (arg0 > -31) {
            method268(-107, 71);
        }
        field694 = null;
        field697 = null;
        field703 = null;
        field687 = null;
        field685 = null;
        field700 = null;
        field695 = null;
        field686 = null;
        field684 = null;
        field696 = null;
        field704 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIZ)I")
    public static final int method270(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field691++;
        if (arg4) {
            method271(111L, (byte) 45);
        }
        int var5 = 65536 - class167.field3112[arg1 * 1024 / arg0] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JB)V")
    public static final void method271(long arg0, byte arg1) {
        field693++;
        if (arg0 == 0L) {
            return;
        }
        if (class127.field2276 >= 100) {
            class1.method5(class20.field336, 0, true, class14.field239);
            return;
        }
        class185 var3 = class271.method1859((byte) -108, arg0).method1334(38);
        int var4 = 53 / ((11 - arg1) / 40);
        for (int var5 = 0; var5 < class127.field2276; var5++) {
            if (class165.field3088[var5] == arg0) {
                class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { var3, class224.field4105 }));
                return;
            }
        }
        for (int var6 = 0; var6 < class126.field2253; var6++) {
            if (class259.field4602[var6] == arg0) {
                class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { class6.field141, var3, class153.field2897 }));
                return;
            }
        }
        if (var3.method1329(class241.field4310.field3514, (byte) 22)) {
            class1.method5(class20.field336, 0, true, class65.field1134);
            return;
        }
        class184.field3391++;
        class165.field3088[class127.field2276] = arg0;
        class64.field1118[class127.field2276++] = class271.method1859((byte) -108, arg0);
        class130.field2323 = class38.field593;
        class182.field3349.method577(0, 0);
        class182.field3349.method870(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLli;)I")
    public static final int method272(boolean arg0, class185 arg1) {
        field699++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (!arg0) {
            field700 = null;
        }
        while (var2 < class126.field2253) {
            if (arg1.method1312(class128.field2290[var2], -30055)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field698++;
        int var6 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg4);
        int var7 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg3);
        int var8 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg5);
        if (arg1 <= 100) {
            method269(-71);
        }
        int var9 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class157.method1116(arg0, var8, var9, class145.field2757[var10], -73);
        }
    }
}
