import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class245 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
    public static volatile boolean field3532 = true;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    public static int[] field3537 = new int[1];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Luh;")
    public static class112 field3534;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field3534 = null;
        field3537 = null;
        if (arg0 != -49) {
            field3534 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1570(int arg0, int arg1, byte arg2) {
        int var3 = 113 % ((arg2 + 41) / 58);
        field3536++;
        return (arg0 & 0x60000) != 0 | class204.method1369(arg1, arg0, (byte) -124) || class108.method805(arg0, -64, arg1) || class445.method2702((byte) -126, arg0, arg1);
    }
}
