import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class447 implements class415 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lwu;")
    private class404 field6132;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public static final void method2562(int arg0, int arg1) {
        field6134++;
        class19 var2 = class364.method2236(1248116640, arg0, arg1);
        var2.method104(arg1 + 9);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        field6130++;
        if (arg0 != -29581) {
            this.method191((byte) 127);
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        field6131++;
        if (arg0 > -5) {
            method2562(-103, -92);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lwu;)V")
    public class447(class404 arg0) {
        this.field6132 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZB)V")
    public final void method277(boolean arg0, byte arg1) {
        if (arg0) {
            class301 var3 = class622.field8452;
            int var4 = this.field6132.field5716.method536(class384.field5582, -26620, 12) + this.field6132.field5718;
            int var5 = this.field6132.field5715.method2304(class432.field5995, 0, 65535) + this.field6132.field5720;
            if (class618.field8412 == this.field6132.field5715) {
                var3.method1815(this.field6132.field5713, -104, var5, this.field6132.field5717, var4, this.field6132.field5719);
            } else if (class128.field1626 == this.field6132.field5715) {
                var3.method1802(var5, this.field6132.field5719, this.field6132.field5713, var4, this.field6132.field5717, -28812);
            } else if (class483.field6508 == this.field6132.field5715) {
                var3.method1803(this.field6132.field5713, this.field6132.field5719, var4, var5, (byte) 123, this.field6132.field5717);
            }
        }
        field6133++;
        if (arg1 >= -13) {
            this.field6132 = null;
        }
    }
}
