import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class305 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lkga;")
    public class511 field4224 = null;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lta;")
    public class200 field4226 = null;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4229 = 503;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lqw;")
    public static class71 field4228 = new class71(8, 17);

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "F")
    public static float field4230;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1844(int arg0, byte arg1) {
        int var2 = -101 % ((arg1 + 19) / 47);
        field4227++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lta;)V", line = 61)
    public class305(class200 arg0) {
        this.field4226 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lta;Lkga;)V", line = 68)
    public class305(class200 arg0, class511 arg1) {
        this.field4224 = arg1;
        this.field4226 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 20)
    public static void method1845(byte arg0) {
        if (arg0 != -51) {
            method1845((byte) 46);
        }
        field4228 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILgba;)V", line = 38)
    public static final void method1846(int arg0, int arg1, int arg2, class625 arg3) {
        field4225++;
        if (arg0 >= -26) {
            return;
        }
        class217 var4 = arg3.method3431(0, class10.field197);
        if (var4 == null) {
            return;
        }
        class10.field197.method421(arg2, arg1, arg3.field8350 + arg2, arg1 - -arg3.field8361);
        if (class504.field6729 >= 3) {
            class10.field197.method397(-16777216, var4, arg2, arg1);
        } else {
            class115.field1980.method2639((float) arg3.field8350 / 2.0F + (float) arg2, (float) arg3.field8361 / 2.0F + (float) arg1, 4096, (int) (-class42.field602) & 0x3FFF << 2, var4, arg2, arg1);
        }
    }
}
