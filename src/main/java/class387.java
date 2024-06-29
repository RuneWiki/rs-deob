import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class387 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
    public static int[] field5358 = new int[13];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lbu;")
    public static class21 field5356 = new class21(85, 1);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "J")
    public static long field5361;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method2414(int arg0) {
        if (arg0 != 0) {
            field5362 = 83;
        }
        field5356 = null;
        field5358 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2415(int arg0, byte arg1, int arg2) {
        if (arg1 >= -49) {
            field5358 = null;
        }
        field5360++;
        return class618.method3572(arg2, arg0, (byte) 122) | (arg0 & 0x70000) != 0 || class759.method4216(true, arg0, arg2);
    }

    @OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5363++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
    public static final void method2416(int[] arg0, byte arg1, Object[] arg2) {
        class249.method1640(true, arg2, arg0, arg0.length - 1, 0);
        if (arg1 < -85) {
            field5357++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
    public class387(int arg0) {
        this.field5359 = arg0;
    }
}
