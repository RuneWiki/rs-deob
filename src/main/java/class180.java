import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class180 extends class205 {

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "Ljava/lang/String;")
    public String field3061;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Lvu;")
    public class677 field3055;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Ltm;")
    public static class334 field3058 = new class334(14, 12);

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field3060 = 1;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I", line = 3)
    public final int method1393(byte arg0) {
        field3062++;
        if (this.field3055.field9552.field3449 == this.field3055.field9552) {
            if (arg0 <= 18) {
                method1395(null, 38, null);
            }
            return -1;
        } else {
            return ((class208) this.field3055.field9552.field3449).field3488;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Loj;I)Z", line = 18)
    public final boolean method1394(class208 arg0, int arg1) {
        field3059++;
        arg0.method1507(1);
        boolean var3 = true;
        if (arg1 != 32749) {
            this.method1397(null, false);
        }
        class208 var4 = (class208) this.field3055.method3772(true);
        while (var4 != null) {
            if (class37.method211(var4.field3488, arg1 - 32868, arg0.field3488)) {
                class272.method1788(var4, false, arg0);
                this.field3056++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class208) this.field3055.method3780(23774);
            var3 = false;
        }
        this.field3055.method3779(-14068, arg0);
        this.field3056++;
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([II[J)V", line = 51)
    public static final void method1395(int[] arg0, int arg1, long[] arg2) {
        class452.method2772(arg2.length + arg1, arg2, 0, (byte) -29, arg0);
        field3057++;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(B)V", line = 60)
    public static void method1396(byte arg0) {
        if (arg0 < 27) {
            method1395(null, -30, null);
        }
        field3058 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Loj;Z)Z", line = 73)
    public final boolean method1397(class208 arg0, boolean arg1) {
        field3054++;
        if (arg1) {
            this.method1394(null, -112);
        }
        int var3 = this.method1393((byte) 72);
        arg0.method1507(1);
        this.field3056--;
        if (this.field3056 != 0) {
            return var3 != this.method1393((byte) 44);
        }
        this.method636((byte) 97);
        this.method1507(1);
        class124.field1898--;
        class206.field3455.method67(arg0.field3476, this, -6772);
        return false;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 105)
    public class180(String arg0) {
        this.field3061 = arg0;
        this.field3055 = new class677();
    }
}
