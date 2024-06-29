import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[C")
    public static char[] field1045 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1046 = 0;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lvd;")
    public static class4 field1051 = new class4(32);

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    public static int[] field1052 = new int[32];

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public static boolean field1053;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Z")
    public static boolean field1055;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lke;")
    public static class110 field1044;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1052 = null;
        field1044 = null;
        if (arg0 <= -31) {
            field1051 = null;
            field1045 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method480(int arg0, int arg1) {
        field1047++;
        if (arg1 != 111) {
            field1053 = false;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public static final void method481(int arg0, int arg1) {
        class280 var2 = class181.method1180(arg0, 0, 12);
        field1048++;
        var2.method1871((byte) 26);
        if (arg1 <= 120) {
            method482(-109);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static final void method482(int arg0) {
        class296.field4663.method546(-90762264);
        if (arg0 == -3801) {
            field1050++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static final void method483(int arg0) {
        field1042++;
        int var1 = class54.field787.method824(class92.field1277);
        for (int var2 = 0; var2 < class68.field925; var2++) {
            int var6 = class54.field787.method824(class41.method273(0, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class68.field925 * 15 + 21;
        int var4 = class203.field2830 - (var1 / 2);
        int var5 = class193.field2678;
        if (class197.field2739 < (var5 + var3)) {
            var5 = class197.field2739 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class275.field4263 < (var1 + var4)) {
            var4 = class275.field4263 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class297.field4687 == arg0) {
            if (class203.field2830 == class176.field2475 && class193.field2678 == class178.field2494) {
                class180.field2516 = var5;
                class40.field593 = var4;
                class15.field146 = true;
                class224.field3406 = (class137.field1925 ? 26 : 22) + class68.field925 * 15;
                class175.field2458 = var1;
                class297.field4687 = 0;
            }
        } else if (class27.field344 == class203.field2830 && class81.field1112 == class193.field2678) {
            class15.field146 = true;
            class180.field2516 = var5;
            class224.field3406 = (class137.field1925 ? 26 : 22) + class68.field925 * 15;
            class40.field593 = var4;
            class297.field4687 = 0;
            class175.field2458 = var1;
        } else {
            class297.field4687 = 1;
            class176.field2475 = class27.field344;
            class178.field2494 = class81.field1112;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)V")
    public static final void method484(boolean arg0, int arg1) {
        field1049++;
        class240.method1607(class212.field3193, arg0, class197.field2739, -28, class275.field4263);
        if (arg1 != 2295) {
            field1051 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1052[var1] = var0 - 1;
            var0 += var0;
        }
        field1053 = true;
        field1054 = -1;
        field1055 = false;
    }
}
