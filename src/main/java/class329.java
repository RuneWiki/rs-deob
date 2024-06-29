import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class329 {

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Ldg;")
    private class416 field4698 = new class416();

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "Ldr;")
    private class721 field4701 = new class721();

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Ldu;")
    private class360 field4699;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "F")
    public static float field4694;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(JBLdg;)V")
    public final void method1987(long arg0, byte arg1, class416 arg2) {
        if (this.field4700 == 0) {
            class416 var5 = this.field4701.method4056(896);
            var5.method3564(true);
            var5.method2414((byte) -26);
            if (this.field4698 == var5) {
                class416 var6 = this.field4701.method4056(896);
                var6.method3564(true);
                var6.method2414((byte) -26);
            }
        } else {
            this.field4700--;
        }
        if (arg1 < 82) {
            this.method1988(61L, 87);
        }
        field4697++;
        this.field4699.method2143(-1, arg2, arg0);
        this.field4701.method4050(arg2, -121);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(JI)Ldg;")
    public final class416 method1988(long arg0, int arg1) {
        field4693++;
        class416 var4 = (class416) this.field4699.method2135(arg0, (byte) 31);
        if (arg1 != -1) {
            field4694 = 0.52401733F;
        }
        if (var4 != null) {
            this.field4701.method4050(var4, -128);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
    public final void method1989(boolean arg0) {
        field4695++;
        if (arg0) {
            this.field4701.method4055((byte) -74);
            this.field4699.method2138(-1);
            this.field4698 = new class416();
            this.field4700 = this.field4702;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(JZ)V")
    public final void method1990(long arg0, boolean arg1) {
        field4696++;
        if (arg1) {
            this.method1990(13L, true);
        }
        class416 var4 = (class416) this.field4699.method2135(arg0, (byte) 31);
        if (var4 != null) {
            var4.method3564(true);
            var4.method2414((byte) -26);
            this.field4700++;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
    public class329(int arg0) {
        this.field4700 = arg0;
        this.field4702 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4699 = new class360(var2);
    }
}
