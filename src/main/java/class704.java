import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class704 extends class401 {

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public int field9956;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public int field9957;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "Z")
    public static boolean field9953 = false;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "Lci;")
    public static class414 field9959 = new class414("stellardawn", 1);

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "J")
    public static long field9961 = 0L;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public static int field9960;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "Lkl;")
    public static class70 field9958;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lsea;Z)V")
    public static final void method3941(class648 arg0, boolean arg1) {
        class477.field6581 = arg0;
        field9960++;
        if (arg1) {
            field9958 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)Z")
    public static final boolean method3942(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method3943(true);
        }
        field9955++;
        return class272.method1671(arg1, arg0, arg2 ^ 0xFFFFFFC8) & (class453.method2575(544, arg0, arg1) | (arg0 & 0x2000) != 0 | class356.method2044(arg0, arg1, (byte) 94));
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)V")
    public static void method3943(boolean arg0) {
        field9958 = null;
        field9959 = null;
        if (arg0) {
            method3942(29, 22, 27);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(II)V")
    public class704(int arg0, int arg1) {
        this.field9956 = arg1;
        this.field9957 = arg0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3944(String arg0, int arg1) {
        field9954++;
        if (arg0.equals("")) {
            return;
        }
        class34.field420++;
        class352 var2 = class290.method1786(98, class199.field2836, class354.field4701);
        if (arg1 == -16531) {
            var2.field4686.method2817(class705.method3947((byte) -47, arg0), true);
            var2.field4686.method2820(arg1 + 16495, arg0);
            class602.method3388(var2, (byte) 28);
        }
    }
}
