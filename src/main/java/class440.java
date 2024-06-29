import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class440 extends class367 implements class278 {

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Lof;")
    public class367 field6032;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "[I")
    public static int[] field6042 = new int[2];

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Lfc;")
    public static class343 field6035;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Lfc;")
    public static class343 field6040;

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIILof;)V")
    public class440(int arg0, int arg1, int arg2, class367 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field6032 = arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lkm;I)V")
    public final void method216(class487 arg0, int arg1) {
        field6025++;
        int var3 = -16 / ((arg1 + 12) / 60);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILkm;IZILkj;B)V")
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        field6037++;
        if (arg6 != 59) {
            field6040 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lba;")
    public static final class265 method2554(int arg0, int arg1, int arg2) {
        field6029++;
        if (arg1 != 2) {
            return null;
        }
        class265 var3 = (class265) class3.field33.method2614((long) arg0 | (long) arg2 << 32, -85);
        if (var3 == null) {
            var3 = new class265(arg2, arg0);
            class3.field33.method2620(var3.field2608, var3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
    public final int method215(int arg0) {
        field6026++;
        return arg0 == -11524 ? 0 : 87;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lkm;BII)Z")
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        field6027++;
        return arg1 < 123 ? false : false;
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)Z")
    public final boolean method195(int arg0) {
        field6033++;
        if (arg0 <= 91) {
            this.method193((class487) null, 91);
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lkm;II)Lab;")
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        field6030++;
        int var4 = 78 / ((arg1 + 12) / 47);
        return null;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(Lkm;I)Lto;")
    public final class370 method193(class487 arg0, int arg1) {
        if (arg1 >= -6) {
            return null;
        } else {
            field6044++;
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Lkm;I)V")
    public final void method197(class487 arg0, int arg1) {
        int var3 = 72 % ((64 - arg1) / 59);
        field6039++;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
    public final int method219(int arg0) {
        if (arg0 != -17942) {
            field6035 = null;
        }
        field6036++;
        return 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method202(byte arg0) {
        field6043++;
        if (arg0 <= 42) {
            field6042 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public static void method2555(byte arg0) {
        field6040 = null;
        field6042 = null;
        field6035 = null;
        if (arg0 != 20) {
            field6040 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        if (arg0 < 24) {
            return false;
        } else {
            field6038++;
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)I")
    public final int method211(boolean arg0) {
        if (arg0) {
            field6031++;
            return 0;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method217(boolean arg0) {
        field6028++;
        if (arg0) {
            this.method215(3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lkm;I)V")
    public final void method218(class487 arg0, int arg1) {
        field6034++;
        if (arg1 > -73) {
            field6040 = null;
        }
    }
}
