import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class534 {

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
    public static boolean field7517 = false;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "J")
    public static volatile long field7519 = 0L;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "Lhv;")
    public static class518 field7515;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V", line = 3)
    public static void method3103(byte arg0) {
        field7515 = null;
        int var1 = -114 / ((47 - arg0) / 55);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(CZ)Z", line = 13)
    public static final boolean method3104(char arg0, boolean arg1) {
        field7518++;
        if (arg1) {
            field7515 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lkd;IBI)V", line = 26)
    public static final void method3105(class280 arg0, int arg1, byte arg2, int arg3) {
        field7514++;
        if (arg2 != 4) {
            method3103((byte) 7);
        }
        int[] var4 = new int[4];
        class255.method1691(var4, 0, var4.length, arg1);
        class573.method3286(arg2 ^ 0xFFFFFFFB, var4, arg3, arg0);
    }
}
