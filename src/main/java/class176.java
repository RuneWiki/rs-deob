import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class176 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lpf;")
    public static class17 field2839 = new class17(64);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "S")
    public short field2838;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
    public boolean field2837;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
    public boolean field2840;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Z")
    public boolean field2842;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
    public boolean field2843;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field2841;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field2845;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnk;I)V")
    public static final void method1293(class102 arg0, int arg1) {
        field2836++;
        if (arg0.field1642 != null) {
            arg0.field1642.field4333 = 0;
        }
        arg0.field1641 = false;
        if (arg1 != 0) {
            method1293((class102) null, 17);
        }
        for (class102 var2 = arg0.method105(); var2 != null; var2 = arg0.method109()) {
            method1293(var2, 0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
    public static final int method1294(int arg0, int arg1, int arg2) {
        class302 var3 = (class302) class21.field381.method987(-102, (long) arg1);
        field2844++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field4927.length > arg0) {
            return arg2 < 50 ? 74 : var3.field4927[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field2839 = null;
        field2841 = null;
        if (arg0 != 21442) {
            method1294(-73, 50, -12);
        }
        field2845 = null;
    }
}
