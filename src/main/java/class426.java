import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class426 extends class186 {

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field5964 = 0;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "[Z")
    public static boolean[] field5967 = new boolean[8];

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "Z")
    public static boolean field5971 = false;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "Len;")
    public static class290 field5966 = new class290("", 17);

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "F")
    public static float field5972;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "Lsea;")
    public static class648 field5969;

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class426(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 11)
    public static void method2454(byte arg0) {
        if (arg0 > 118) {
            field5966 = null;
            field5969 = null;
            field5967 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(FB)V", line = 25)
    public final void method73(float arg0, byte arg1) {
        super.field2703 = arg0;
        if (arg1 != -111) {
            method2455(-56, false, -98);
        }
        ++field5968;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZI)Z", line = 43)
    public static final boolean method2455(int arg0, boolean arg1, int arg2) {
        ++field5965;
        if (!arg1) {
            return true;
        } else {
            return ~(arg2 & 262144) != -1 | class59.method489(arg2, arg0, 45) || class302.method1839((byte) 93, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIB)V", line = 61)
    public final void method74(int arg0, int arg1, int arg2, byte arg3) {
        super.field2701 = arg0;
        super.field2699 = arg2;
        int var5 = -81 / ((20 - arg3) / 57);
        super.field2708 = arg1;
        ++field5963;
    }
}
