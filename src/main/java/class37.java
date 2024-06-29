import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NYZQPNXB")
public class class37 {

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "B")
    private byte field1216 = -78;

    @OriginalMember(owner = "client!NYZQPNXB", name = "c", descriptor = "I")
    private int field1217 = 23345;

    @OriginalMember(owner = "client!NYZQPNXB", name = "d", descriptor = "Z")
    private boolean field1218 = false;

    @OriginalMember(owner = "client!NYZQPNXB", name = "e", descriptor = "LBEBSUZBY;")
    public class7 field1219 = new class7();

    @OriginalMember(owner = "client!NYZQPNXB", name = "f", descriptor = "LBEBSUZBY;")
    private class7 field1220;

    @OriginalMember(owner = "client!NYZQPNXB", name = "<init>", descriptor = "(I)V")
    public class37(int arg0) {
        this.field1219.field140 = this.field1219;
        this.field1219.field141 = this.field1219;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(LBEBSUZBY;)V")
    public void method337(class7 arg0) {
        if (arg0.field141 != null) {
            arg0.method41();
        }
        arg0.field141 = this.field1219.field141;
        arg0.field140 = this.field1219;
        arg0.field141.field140 = arg0;
        arg0.field140.field141 = arg0;
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(ILBEBSUZBY;)V")
    public void method338(int arg0, class7 arg1) {
        if (arg1.field141 != null) {
            arg1.method41();
        }
        arg1.field141 = this.field1219;
        if (arg0 > 0) {
            arg1.field140 = this.field1219.field140;
            arg1.field141.field140 = arg1;
            arg1.field140.field141 = arg1;
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "()LBEBSUZBY;")
    public class7 method339() {
        class7 var1 = this.field1219.field140;
        if (this.field1219 == var1) {
            return null;
        } else {
            var1.method41();
            return var1;
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "()LBEBSUZBY;")
    public class7 method340() {
        class7 var1 = this.field1219.field140;
        if (this.field1219 == var1) {
            this.field1220 = null;
            return null;
        } else {
            this.field1220 = var1.field140;
            return var1;
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(B)LBEBSUZBY;")
    public class7 method341(byte arg0) {
        if (arg0 != -60) {
            this.field1215 = !this.field1215;
        }
        class7 var2 = this.field1219.field141;
        if (this.field1219 == var2) {
            this.field1220 = null;
            return null;
        } else {
            this.field1220 = var2.field141;
            return var2;
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "a", descriptor = "(I)LBEBSUZBY;")
    public class7 method342(int arg0) {
        class7 var2 = this.field1220;
        if (arg0 <= 0) {
            this.field1218 = !this.field1218;
        }
        if (this.field1219 == var2) {
            this.field1220 = null;
            return null;
        } else {
            this.field1220 = var2.field140;
            return var2;
        }
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "b", descriptor = "(I)LBEBSUZBY;")
    public class7 method343(int arg0) {
        class7 var2 = this.field1220;
        if (this.field1219 == var2) {
            this.field1220 = null;
            return null;
        }
        this.field1220 = var2.field141;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "client!NYZQPNXB", name = "c", descriptor = "()V")
    public void method344() {
        if (this.field1219.field140 == this.field1219) {
            return;
        }
        while (true) {
            class7 var1 = this.field1219.field140;
            if (this.field1219 == var1) {
                return;
            }
            var1.method41();
        }
    }
}
