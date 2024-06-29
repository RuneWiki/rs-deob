import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class453 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field6807 = 0;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lvg;")
    public static class49 field6805 = new class49(20);

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
    public static boolean field6808 = false;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZI)V", line = 5)
    public static final void method2844(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg0 << 3;
        field6806++;
        int var6 = arg1 << 3;
        if (class126.field2062 == 2) {
            class13.field197 = var6;
            class523.field7598 = var5;
            class617.field8744 = var4;
        }
        class37.field514 = var5;
        class162.field2746 = var6;
        class220.method1634((byte) 28);
        class328.field5085 = arg2;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 29)
    public static void method2845(byte arg0) {
        field6805 = null;
        if (arg0 != -55) {
            field6807 = -59;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I", line = 40)
    public static int method2846(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
