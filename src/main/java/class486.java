import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class486 {

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lae;")
    private class40 field6447;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Ld;")
    private class329 field6441;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLae;)V")
    public final void method2632(byte arg0, class40 arg1) {
        if (arg0 != -104) {
            field6442 = -74;
        }
        field6444++;
        this.field6447 = arg1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILpl;IIJZII)V")
    public static final void method2633(int arg0, class612 arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6, int arg7) {
        class608.field8547 = arg6;
        class531.field7173 = arg5;
        class679.field9552 = arg4;
        class235.field2946 = 1;
        class316.field4061 = arg1;
        class119.field1527 = arg2;
        class436.field5443 = arg3;
        class149.field1920 = arg0;
        class223.field2774 = arg7;
        field6445++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Ld;")
    public final class329 method2634(int arg0) {
        if (arg0 != -15840) {
            this.field6447 = null;
        }
        field6443++;
        class329 var2 = this.field6441;
        if (this.field6447.field541 == var2) {
            this.field6441 = null;
            return null;
        } else {
            this.field6441 = var2.field4201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Ld;")
    public final class329 method2635(int arg0) {
        field6440++;
        class329 var2 = this.field6447.field541.field4201;
        if (this.field6447.field541 == var2) {
            this.field6441 = null;
            return null;
        } else {
            int var3 = -1 / ((arg0 - 39) / 53);
            this.field6441 = var2.field4201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class486() {
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lae;)V")
    public class486(class40 arg0) {
        this.field6447 = arg0;
    }
}
