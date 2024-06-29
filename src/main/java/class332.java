import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class332 extends class744 {

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "I")
    private int field4235 = 0;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "Z")
    public static boolean field4236 = true;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public static int field4238 = 0;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
    public static int[] field4237 = new int[5];

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V", line = 8)
    public static void method1919(int arg0) {
        if (arg0 < 20) {
            method1920(70, (class724) null);
        }
        field4237 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lnd;Lwm;)V", line = 19)
    public class332(class547 arg0, class566 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILrl;)V", line = 26)
    public static final void method1920(int arg0, class724 arg1) {
        ++field4234;
        int var2 = 105 / ((20 - arg0) / 53);
        class357 var3 = (class357) class600.field8352.method1160((long) arg1.field189, 120);
        if (var3 != null) {
            if (var3.field4617 != null) {
                class307.field4055.method1319(var3.field4617);
                var3.field4617 = null;
            }
            var3.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZB)V", line = 54)
    public final void method368(boolean arg0, byte arg1) {
        ++field4233;
        int var3 = super.field10375.field7249.method735(0, super.field10372.method142(), class482.field6548) - -super.field10375.field7250;
        int var4 = super.field10375.field7239.method3397(super.field10372.method149(), class478.field6509, -94) - -super.field10375.field7247;
        if (arg1 >= -57) {
            method1920(-110, (class724) null);
        }
        super.field10372.method2765((float) (var3 + super.field10372.method142() / 2), (float) (super.field10372.method149() / 2 + var4), 4096, this.field4235);
        this.field4235 += ((class566) super.field10375).field7946;
    }
}
