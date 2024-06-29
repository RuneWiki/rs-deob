import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class624 {

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "B")
    public byte field8726;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "Z")
    public static boolean field8724 = false;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "Lhc;")
    public class142 field8736;

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "Lkfa;")
    public class603 field8729;

    @OriginalMember(owner = "client!lha", name = "l", descriptor = "Llha;")
    public class624 field8734;

    @OriginalMember(owner = "client!lha", name = "m", descriptor = "Lic;")
    public class699 field8735;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "Ljn;")
    public class719 field8728;

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "Ljn;")
    public class719 field8737;

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "Lwo;")
    public class744 field8730;

    @OriginalMember(owner = "client!lha", name = "p", descriptor = "Lwo;")
    public class744 field8738;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "S")
    public short field8727;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "S")
    public short field8732;

    @OriginalMember(owner = "client!lha", name = "k", descriptor = "S")
    public short field8733;

    @OriginalMember(owner = "client!lha", name = "q", descriptor = "S")
    public short field8739;

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "[Lqp;")
    public static class657[] field8731;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZLsba;)V")
    public static final void method3526(boolean arg0, class218 arg1) {
        field8725++;
        if (!class595.field8291) {
            return;
        }
        if (arg1.field2713 != null) {
            class218 var2 = class408.method2359((byte) 72, class631.field8779, class355.field4735);
            if (var2 != null) {
                class404 var3 = new class404();
                var3.field5710 = var2;
                var3.field5714 = arg1;
                var3.field5709 = arg1.field2713;
                class498.method2775(var3);
            }
        }
        class420.field5889++;
        if (arg0) {
            return;
        }
        class103 var4 = class752.method4186(260, class178.field2185, class449.field6285);
        var4.field1379.method3384(1571862888, arg1.field2708);
        var4.field1379.method3423(class355.field4735, 1571862888);
        var4.field1379.method3394(arg1.field2771, 17624);
        var4.field1379.method3423(arg1.field2769, 1571862888);
        var4.field1379.method3384(1571862888, class631.field8779);
        var4.field1379.method3437(class169.field2109, 128);
        class27.method104(arg0, var4);
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
    public static void method3527(int arg0) {
        if (arg0 != 4390) {
            field8731 = null;
        }
        field8731 = null;
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(I)V")
    public class624(int arg0) {
        this.field8726 = (byte) arg0;
    }

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
    public final void method3528(int arg0) {
        while (this.field8729 != null) {
            class603 var2 = this.field8729.field8413;
            this.field8729.method3335(2);
            this.field8729 = var2;
        }
        if (arg0 != 6730) {
            method3526(false, null);
        }
        field8723++;
    }
}
