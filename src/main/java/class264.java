import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class264 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Luf;")
    public static class168 field4465 = class148.method1019(-1720, "http:)4)4");

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lfj;")
    public static class283 field4469;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 4)
    public static void method1835(byte arg0) {
        field4465 = null;
        field4469 = null;
        int var1 = -93 / ((arg0 - 68) / 34);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZB)V", line = 25)
    public static final void method1836(boolean arg0, byte arg1) {
        if (arg1 == 16) {
            field4468++;
            class136.method949(arg0, class299.field5069, -118, class19.field221, class14.field142);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILuf;)I", line = 45)
    public static final int method1837(int arg0, class168 arg1) {
        int var2 = -63 / ((arg0 - 27) / 63);
        field4471++;
        return arg1.method1167(false) + 1;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIIZ)V", line = 75)
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4464 = arg5;
        this.field4463 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Z", line = 99)
    public static final boolean method1838(int arg0, int arg1) {
        if (arg1 < 21) {
            field4469 = (class283) null;
        }
        field4470++;
        return (arg0 & 0x1) != 0;
    }
}
