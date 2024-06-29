import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class130 extends class121 {

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "Laca;")
    public class130 field1710;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "Laca;")
    public class130 field1716;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "Ldda;")
    public static class597 field1714;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIILdda;IZ)V")
    public static final void method804(int arg0, int arg1, int arg2, int arg3, class597 arg4, int arg5, boolean arg6) {
        class548.field8167 = arg5;
        class42.field504 = arg4;
        class534.field7910 = arg3;
        field1711++;
        class212.field3119 = arg6;
        class62.field731 = arg0;
        class636.field9266 = arg2;
        class110.field1406 = arg1;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)V")
    public final void method805(byte arg0) {
        field1715++;
        if (this.field1716 == null) {
            return;
        }
        this.field1716.field1710 = this.field1710;
        this.field1710.field1716 = this.field1716;
        this.field1710 = null;
        if (arg0 < 61) {
            this.field1710 = null;
        }
        this.field1716 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ldda;II)Lcb;")
    public static final class78 method806(class597 arg0, int arg1, int arg2) {
        field1709++;
        byte[] var3 = arg0.method3469(arg1, arg2 ^ 0x7C);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 0) {
                method806(null, -102, -77);
            }
            return new class78(var3);
        }
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)V")
    public static final void method807(byte arg0) {
        field1713++;
        if (!class242.field3546) {
            return;
        }
        class331.field4910 = null;
        class475.field7253 = null;
        class242.field3546 = false;
        if (arg0 < 9) {
            field1714 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "(B)V")
    public static void method808(byte arg0) {
        if (arg0 > -67) {
            field1714 = null;
        }
        field1714 = null;
    }
}
