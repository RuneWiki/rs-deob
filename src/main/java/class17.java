import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class17 extends class60 {

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[B")
    public byte[] field335;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lpk;")
    public static class120 field339;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg1) >= class310.field4897 && arg1 + arg3 <= class180.field2862 && arg4 - arg1 >= class104.field1719 && arg1 + arg4 <= class333.field5188) {
            class55.method468(arg0 - 3276, arg2, arg3, arg1, arg4);
        } else {
            class57.method474(arg2, 26, arg4, arg1, arg3);
        }
        field338++;
        if (arg0 != 3371) {
            field339 = (class120) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 31)
    public static void method196(byte arg0) {
        if (arg0 == 79) {
            field339 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V", line = 44)
    public static final void method197(byte arg0, int arg1) {
        if (arg0 >= -18) {
            method195(-46, 15, 72, -9, 57);
        }
        field336++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class314.method2214(-93);
        } else if (arg1 == 2) {
            class339.method2353(100);
        } else if (arg1 == 3) {
            class152.method1143((byte) 30);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V", line = 73)
    public class17(byte[] arg0) {
        this.field335 = arg0;
    }
}
