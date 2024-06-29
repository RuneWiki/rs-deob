import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class264 {

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    private int field112 = 0;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field110 = 4096;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "Lcf;")
    private static class93 field104 = class147.method1066("Face here", -48);

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Lcf;")
    public static class93 field106 = class147.method1066("Shift)2click disabled)3", -48);

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "Lcf;")
    public static class93 field109 = field104;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "Lhg;")
    public static class177 field105;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "[Lcf;")
    public static class93[] field115;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        int[] var3 = super.field4716.method532((byte) 95, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            for (int var5 = 0; var5 < class176.field3060; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field112 >= ~var6 && ~var6 >= ~this.field110 ? 4096 : 0;
            }
        }
        ++field108;
        return arg1 >= -83 ? null : var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lhg;II)[Luf;")
    public static final class173[] method34(class177 arg0, int arg1, int arg2) {
        ++field114;
        if (!class231.method1581((byte) 106, arg0, arg1)) {
            return null;
        } else {
            return arg2 > -65 ? null : class6.method24((byte) -40);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltg;I)Ltg;")
    public static final class181 method35(class181 arg0, int arg1) {
        ++field103;
        if (~arg0.field3321 != arg1) {
            return client.method1114(-20985, arg0.field3321);
        } else {
            int var2 = arg0.field3219 >>> 16;
            class127 var3 = new class127(class255.field4610);
            for (class214 var4 = (class214) var3.method929(110); var4 != null; var4 = (class214) var3.method930(127)) {
                if (~var4.field3912 == ~var2) {
                    return client.method1114(-20985, (int) var4.field4006);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class8() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
    public static void method36(int arg0) {
        if (arg0 == 3552) {
            field109 = null;
            field115 = null;
            field106 = null;
            field104 = null;
            field105 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 > 11) {
            ++field116;
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field110 = arg2.method1891(-115);
                }
            } else {
                this.field112 = arg2.method1891(-120);
            }
        }
    }
}
