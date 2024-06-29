import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class191 extends class183 {

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[B")
    public byte[] field3300;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Ldj;")
    private static class44 field3295 = class89.method650(255, "green:");

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Ldj;")
    public static class44 field3299 = field3295;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Ldj;")
    private static class44 field3303 = class89.method650(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Ldj;")
    public static class44 field3294 = field3295;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Ldj;")
    public static class44 field3296 = field3303;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ldj;ILdj;Ldj;)V")
    public static final void method1198(class44 arg0, int arg1, class44 arg2, class44 arg3) {
        if (arg1 != -704657370) {
            method1201(88, -66, 36, 115, (byte) 16, true);
        }
        class182.field3172 = arg2;
        field3302++;
        class182.field3163 = arg3;
        class182.field3170 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        field3301++;
        class104.field1894.method1179((byte) -78);
        class160.field2764.method676(0);
        class175.field3036.method676(0);
        int var1 = -22 % ((arg0 - 1) / 38);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
    public class191(byte[] arg0) {
        this.field3300 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field3299 = null;
        if (arg0 == 1528084688) {
            field3296 = null;
            field3295 = null;
            field3294 = null;
            field3303 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIBZ)Lod;")
    public static final class155 method1201(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field3304++;
        long var6 = ((long) arg1 << 40) + (arg5 ? 137438953472L : 0L) + ((long) arg3 << 16) + (long) arg0 + ((long) arg2 << 38);
        class155 var8 = (class155) class74.field1431.method1178(var6, arg4 + 14108);
        if (arg4 != 68) {
            return null;
        } else if (var8 == null) {
            class155 var9 = class235.method1536(arg2, arg3, arg0, arg1, false, false, (byte) -126, arg5);
            if (var9 != null) {
                class74.field1431.method1183((byte) 123, var9, var6);
            }
            return var9;
        } else {
            return var8;
        }
    }
}
