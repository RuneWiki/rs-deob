import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class301 extends class447 {

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Z")
    public volatile boolean field4169 = true;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
    public static boolean field4167 = false;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field4173 = -1;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Lqj;")
    public static class296 field4166;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Z")
    public boolean field4165;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Z")
    public boolean field4174;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)I", line = 3)
    public static final int method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        field4168++;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 1 + 7 - arg2 - arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg5 - arg1;
        } else {
            int var9 = 50 % ((arg6 - 42) / 36);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZ)V", line = 36)
    public static final void method1938(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == 1007) {
            class111.method737(10, arg1, arg2);
        } else if (arg0 == 1009) {
            class111.method737(11, arg1, arg2);
        } else if (arg0 == 1012) {
            class111.method737(12, arg1, arg2);
        } else if (arg0 == 1005) {
            class111.method737(13, arg1, arg2);
        } else if (arg0 == 1011) {
            class111.method737(14, arg1, arg2);
        }
        field4171++;
        if (!arg3) {
            method1940((byte) -21, (class296) null);
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V", line = 67)
    public static void method1939(int arg0) {
        if (arg0 <= 63) {
            field4167 = true;
        }
        field4166 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLqj;)V", line = 84)
    public static final void method1940(byte arg0, class296 arg1) {
        class64.field994 = arg1;
        if (arg0 > -126) {
            field4166 = null;
        }
        field4172++;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)I")
    public abstract int method965(byte arg0);

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)[B")
    public abstract byte[] method961(int arg0);
}
