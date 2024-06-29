import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class173 extends class31 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lhf;")
    public class277 field2592;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLsg;)V")
    public static final void method1217(byte arg0, class279 arg1) {
        if (arg0 <= 107) {
            method1219((byte) 67);
        }
        field2591++;
        for (class211 var2 = (class211) class293.field4353.method863(-1); var2 != null; var2 = (class211) class293.field4353.method865(-1)) {
            if (var2.field3168 == arg1) {
                if (var2.field3183 != null) {
                    class504.field7295.method1587(var2.field3183);
                    var2.field3183 = null;
                }
                var2.method421(22071);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lbt;II[B)V")
    public class173(class33 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2592 = class152.method1080(arg3, 127, false, arg2, arg0, 6406, arg1, 6406);
        this.field2592.method1226(false, false, (byte) -57);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lsg;Z)I")
    public static final int method1218(class279 arg0, boolean arg1) {
        field2593++;
        class311 var2 = arg0.field4157;
        if (var2.field4631 != null) {
            var2 = var2.method1972(class84.field1335, (byte) -92);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4635;
        if (!arg1) {
            field2594 = -106;
        }
        class236 var4 = arg0.method139((byte) 118);
        if (arg0.field240) {
            var3 = var2.field4639;
        } else if (arg0.field248 == var4.field3515 || arg0.field248 == var4.field3554 || arg0.field248 == var4.field3524 || arg0.field248 == var4.field3533) {
            var3 = var2.field4580;
        } else if (arg0.field248 == var4.field3553 || arg0.field248 == var4.field3544 || arg0.field248 == var4.field3522 || arg0.field248 == var4.field3542) {
            var3 = var2.field4643;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1219(byte arg0) {
        field2595++;
        if (arg0 < 39) {
            field2594 = -110;
        }
        if (class37.field799 == 8) {
            class170.method1206(1, 4);
        } else if (class37.field799 == 4 || class37.field799 == 5) {
            class170.method1206(1, 2);
        } else if (class37.field799 == 11) {
            class170.method1206(1, 2);
            return;
        }
    }
}
