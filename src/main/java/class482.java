import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class482 extends class107 {

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lmc;")
    public static class78 field6652 = new class78(21, 6);

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field6655 = 0;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[Ljd;")
    public static class139[] field6654;

    static {
        new class225("", 73);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lr;BLr;Lr;Lr;)V", line = 6)
    public static final void method2810(class110 arg0, byte arg1, class110 arg2, class110 arg3, class110 arg4) {
        class69.field949 = arg4;
        field6653++;
        int var5 = 123 % ((23 - arg1) / 59);
        class47.field639 = arg3;
        class383.field5271 = arg2;
        class104.field1511 = arg0;
        class146.field2099 = new class464[class47.field639.method705((byte) -94)][];
        class248.field3308 = new boolean[class47.field639.method705((byte) -90)];
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 35)
    public static void method2811(int arg0) {
        if (arg0 != 73) {
            method2810((class110) null, (byte) -46, (class110) null, (class110) null, (class110) null);
        }
        field6652 = null;
        field6654 = null;
    }
}
