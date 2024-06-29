import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class445 {

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "Lsb;")
    private class93 field6086;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "Lwu;")
    public static class557 field6084;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)I")
    public static final int method2653(int arg0, int arg1) {
        if (arg0 > -17) {
            method2654((byte) 46);
        }
        field6083++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!oha", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6088++;
        this.field6086.method557(-20828, this.field6085);
        super.finalize();
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public static void method2654(byte arg0) {
        field6084 = null;
        if (arg0 != -6) {
            method2654((byte) 20);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZLpaa;I)V")
    public static final void method2655(int arg0, boolean arg1, class712 arg2, int arg3) {
        field6087++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field10028 != null) {
            class700 var4 = new class700();
            var4.field9757 = arg2.field10028;
            var4.field9745 = arg2;
            class318.method1840(var4);
        }
        class220.field3109 = arg2.field9953;
        class626.field8934 = arg0;
        class101.field1454 = arg2.field10047;
        class13.field187 = arg1;
        class565.field8033 = arg2.field9957;
        class545.field7705 = arg3;
        class724.field10190 = arg2.field10026;
        class480.field6527 = arg2.field9998;
        class116.method764(arg2, -1176833464);
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lsb;II)V")
    public class445(class93 arg0, int arg1, int arg2) {
        this.field6085 = arg2;
        this.field6086 = arg0;
    }
}
