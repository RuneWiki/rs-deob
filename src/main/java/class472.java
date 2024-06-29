import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class472 implements class762 {

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Laj;")
    private class333 field6522;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Laj;")
    private class333 field6521;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Ljl;")
    private class286 field6516;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6514 = 0;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "Lda;")
    private class66 field6519;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
    public static final int method2776(int arg0) {
        field6515++;
        if (arg0 < 78) {
            field6514 = -2;
        }
        return class786.field10820;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ)V")
    public final void method1500(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field6516.field4223.method3160(this.field6516.field4220, class124.field1786, (byte) -91) + this.field6516.field4214;
            int var4 = this.field6516.field4224.method3543(0, class710.field9945, this.field6516.field4225) + this.field6516.field4210;
            this.field6519.method574(this.field6516.field4216, 0, 0, null, var3, -1, this.field6516.field4222, this.field6516.field4215, this.field6516.field4220, this.field6516.field4225, this.field6516.field4226, this.field6516.field4227, this.field6516.field4211, null, null, var4);
        }
        field6517++;
        if (arg0 >= -93) {
            this.method16(82);
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        field6518++;
        boolean var2 = true;
        if (arg0 != 20662) {
            this.field6519 = null;
        }
        if (!this.field6522.method2104(-126, this.field6516.field4217)) {
            var2 = false;
        }
        if (!this.field6521.method2104(117, this.field6516.field4217)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Laj;Laj;Ljl;)V")
    public class472(class333 arg0, class333 arg1, class286 arg2) {
        this.field6522 = arg0;
        this.field6521 = arg1;
        this.field6516 = arg2;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        field6520++;
        class255 var2 = class194.method1335(this.field6521, -5707, this.field6516.field4217);
        this.field6519 = class379.field5542.method545(var2, class508.method2943(this.field6522, this.field6516.field4217), true);
        if (arg0 <= 36) {
            field6514 = -105;
        }
    }
}
