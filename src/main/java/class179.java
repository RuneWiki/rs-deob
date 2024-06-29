import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class179 extends class128 {

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Z")
    public volatile boolean field3029 = true;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Z")
    public static boolean field3027 = false;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "S")
    public static short field3036 = 32767;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Lcg;")
    public static class49 field3030;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Z")
    public boolean field3028;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "Z")
    public boolean field3033;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V", line = 16)
    public static final void method1375(int arg0) {
        field3034++;
        class83.method749(0, arg0, 111);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lne;Z)V", line = 29)
    public static final void method1376(class258 arg0, boolean arg1) {
        if (arg1) {
            field3032 = 35;
        }
        class77.method704(true, 200000, arg0);
        field3035++;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)V", line = 45)
    public static void method1377(int arg0) {
        if (arg0 != 0) {
            field3032 = -116;
        }
        field3030 = null;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)[B")
    public abstract byte[] method4(int arg0);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
    public abstract int method3(int arg0);
}
