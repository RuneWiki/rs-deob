import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class653 extends class72 {

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lqe;")
    public static class465 field9199 = new class465(57, -1);

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Z")
    public static boolean field9200 = false;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method3685(boolean arg0) {
        if (!arg0) {
            method3687((byte) -30);
        }
        field9199 = null;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)I")
    public final int method3686(int arg0) {
        if (arg0 != 27669) {
            this.method55(-19);
        }
        ++field9198;
        return super.field1282;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public final void method59(int arg0, int arg1) {
        ++field9202;
        super.field1282 = arg0;
        if (arg1 != 3) {
            this.method55(-43);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method3687(byte arg0) {
        ++field9195;
        int var1 = -1 / ((arg0 - 56) / 62);
        for (class226 var2 = (class226) class476.field6811.method1522(true); var2 != null; var2 = (class226) class476.field6811.method1527((byte) 103)) {
            if (~var2.field3234 == 0) {
                var2.field3222 = 0;
                if (var2.field3237 >= 0 && var2.field3225 >= 0 && var2.field3237 < class174.field2540 && var2.field3225 < class716.field9999) {
                    class224.method1550(var2, 59);
                }
            } else {
                var2.method3617(1);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 >= 30) {
            ++field9196;
            if (~super.field1282 != -2 && super.field1282 != 0) {
                super.field1282 = this.method60(-3271);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lcq;)V")
    public class653(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(ILcq;)V")
    public class653(int arg0, class464 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            return 15;
        } else {
            ++field9201;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I")
    public final int method58(int arg0, int arg1) {
        ++field9203;
        if (arg1 != 11260) {
            field9199 = null;
        }
        return 1;
    }
}
