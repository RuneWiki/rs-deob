import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class504 extends class101 {

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "Lee;")
    public static class706 field6974 = new class706(8);

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "[I")
    public static int[] field6976 = new int[2];

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 4)
    public static void method2925(int arg0) {
        field6974 = null;
        if (arg0 >= -28) {
            method2927(true);
        }
        field6976 = null;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V", line = 17)
    public static final void method2926(int arg0) {
        field6975++;
        int var1 = class571.field7608;
        int[] var2 = class79.field1136;
        for (int var3 = arg0; var3 < var1; var3++) {
            class73 var4 = class599.field8149[var2[var3]];
            if (var4 != null) {
                class574.method3208(var4.method655(-128), -88, var4);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)[Lrda;", line = 52)
    public static final class692[] method2927(boolean arg0) {
        field6973++;
        if (arg0) {
            field6976 = null;
        }
        return new class692[] { class632.field8826, class357.field5223, class432.field6132 };
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public abstract int method1038(int arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)I")
    public abstract int method1035(int arg0);

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)I")
    public abstract int method1036(int arg0);

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)I")
    public abstract int method1037(int arg0);

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)J")
    public abstract long method1039(int arg0);
}
