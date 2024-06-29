import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class678 extends class425 {

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "Ljv;")
    public static class71 field9627 = new class71();

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field9629 = 500;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "J")
    public long field9628;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lcm;")
    public class678 field9624;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Lcm;")
    public class678 field9625;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3812(byte arg0) {
        field9627 = null;
        if (arg0 != -119) {
            method3812((byte) -106);
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method3813(int arg0) {
        field9623++;
        if (this.field9625 == null) {
            return;
        }
        int var2 = 9 / ((-arg0 - 32) / 59);
        this.field9625.field9624 = this.field9624;
        this.field9624.field9625 = this.field9625;
        this.field9625 = null;
        this.field9624 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)Z")
    public static final boolean method3814(byte arg0, int arg1, int arg2) {
        field9622++;
        if (arg0 == 107) {
            return (arg1 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Z")
    public final boolean method3815(boolean arg0) {
        if (arg0) {
            this.field9624 = null;
        }
        field9621++;
        return this.field9625 != null;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Lqj;")
    public static final class473 method3816(int arg0) {
        if (arg0 >= -90) {
            method3814((byte) 46, 19, 85);
        }
        field9626++;
        if (class407.field5880 == null || class594.field8549 == null) {
            return null;
        }
        for (class473 var1 = (class473) class594.field8549.method797(303); var1 != null; var1 = (class473) class594.field8549.method797(303)) {
            class288 var2 = class407.field5864.method3355(var1.field6709, (byte) -122);
            if (var2 != null && var2.field4303 && var2.method1923(class407.field5870, 31846)) {
                return var1;
            }
        }
        return null;
    }
}
