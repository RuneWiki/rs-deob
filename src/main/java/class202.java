import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class202 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field2625 = 128;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field2631 = 128;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lud;")
    public static class27 field2630 = new class27(1, 2, 2, 0);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lhd;")
    public static final class523 method1268(int arg0, int arg1, int arg2) {
        field2620++;
        class523 var3 = class310.method1810(arg0, 1182823664);
        if (~arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field7717 == null || arg1 >= var3.field7717.length) {
            return null;
        } else {
            return var3.field7717[arg1];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lle;I)V")
    public final void method1269(class202 arg0, int arg1) {
        if (arg1 != -15492) {
            return;
        }
        this.field2626 = arg0.field2626;
        field2624++;
        this.field2628 = arg0.field2628;
        this.field2631 = arg0.field2631;
        this.field2621 = arg0.field2621;
        this.field2625 = arg0.field2625;
        this.field2623 = arg0.field2623;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lle;")
    public final class202 method1270(byte arg0) {
        field2627++;
        int var2 = 47 % ((arg0 - 44) / 52);
        return new class202(this.field2621, this.field2631, this.field2625, this.field2626, this.field2623, this.field2628);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1271(int arg0) {
        if (arg0 != 0) {
            field2633 = -102;
        }
        field2630 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        class503.field7268 = false;
        class116.field1569 = null;
        field2632++;
        class68.method604(-9192);
        if (arg0 >= -113) {
            field2629 = -89;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method1273(int arg0, boolean arg1) {
        class50.field664 = arg0;
        field2622++;
        class24.field352 = -1;
        if (arg1) {
            class118.field1593 = 3;
            class298.field3833 = 100;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class202(int arg0) {
        this.field2621 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
    private class202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2626 = arg3;
        this.field2631 = arg1;
        this.field2621 = arg0;
        this.field2625 = arg2;
        this.field2628 = arg5;
        this.field2623 = arg4;
    }

    static {
        new class335(" days.", " Tage.", " jours.", " dias.");
    }
}
