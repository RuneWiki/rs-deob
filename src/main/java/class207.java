import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class class207 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2818 = -1;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[Lcr;")
    public static class343[] field2816 = new class343[6];

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Luk;")
    public abstract class142 method1309(byte arg0);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1310(int arg0, int arg1);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLlm;)Z")
    public static final boolean method1311(byte arg0, class290 arg1) {
        field2820++;
        if (arg1 == null) {
            return false;
        } else if (arg1.field4139) {
            if (arg0 != 117) {
                field2814 = -67;
            }
            if (!arg1.method1853(arg0 ^ 0xFFFFE339)) {
                return false;
            } else if (class264.field3704.method1204((byte) -120, (long) arg1.field4126) == null) {
                return class195.field2647.method1204((byte) -122, (long) arg1.field4144) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
    public static final void method1312(byte arg0) {
        class329.field4707.method2052(0);
        if (arg0 >= -64) {
            field2816 = null;
        }
        field2815++;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static void method1313(byte arg0) {
        if (arg0 == -65) {
            field2816 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public static final void method1314(int arg0, int arg1, int arg2) {
        if (arg1 < 8) {
            field2814 = 98;
        }
        field2821++;
        class348 var3 = class385.method2464(7, 1302, arg2);
        var3.method2216((byte) 23);
        var3.field5093 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method1315(int arg0) {
        class412.field5955.method2052(0);
        field2819++;
        class396.field5782.method2052(0);
        class21.field216.method2052(0);
        if (arg0 <= 40) {
            method1313((byte) -59);
        }
        class252.field3405.method2052(0);
        class147.field2055.method2052(0);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)I")
    public abstract int method1316(int arg0, int arg1);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public abstract void method1317(int arg0, byte arg1);
}
