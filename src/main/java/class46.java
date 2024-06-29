import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class273 {

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class46() {
        this(4096);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field835;
        if (arg2 != 5) {
            this.method2((class136) null, -107, -17);
        }
        if (arg1 == 0) {
            this.field837 = (arg0.method1012(4) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            this.method2((class136) null, 22, 15);
        }
        ++field838;
        int[] var3 = super.field4359.method387((byte) -125, arg1);
        if (super.field4359.field833) {
            class68.method532(var3, 0, class26.field458, this.field837);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        super(0, true);
        this.field837 = 4096;
        this.field837 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Loh;")
    public static final class248 method396(int arg0, byte arg1) {
        class248 var2 = (class248) class184.field3034.method1155((long) arg0, true);
        ++field836;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class104.field1588.method900(class107.method797(21, arg0), class256.method1712(arg0, true), false);
            class248 var4 = new class248();
            var4.field3893 = arg0;
            if (arg1 != 63) {
                method396(35, (byte) -83);
            }
            if (var3 != null) {
                var4.method1652(new class136(var3), (byte) 3);
            }
            var4.method1651((byte) 31);
            if (!class65.field1069 && var4.field3951) {
                var4.field3902 = null;
            }
            if (var4.field3927) {
                var4.field3909 = false;
                var4.field3892 = 0;
            }
            class184.field3034.method1161(var4, (byte) -127, (long) arg0);
            return var4;
        }
    }
}
