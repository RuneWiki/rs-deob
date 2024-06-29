import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class273 extends class220 {

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "[I")
    public static int[] field3897 = new int[14];

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public static int field3894 = 0;

    @OriginalMember(owner = "client!vea", name = "E", descriptor = "Z")
    public static boolean field3903 = false;

    @OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
    public static int field3901 = 0;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "Lqfa;")
    public static class98 field3896 = new class98(13, 2);

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLwm;)V", line = 7)
    public static final void method1776(byte arg0, class564 arg1) {
        field3900++;
        int var2 = arg1.field7954 - class740.field10285;
        int var3 = arg1.field7972 * 512 + arg1.method1835((byte) 127) * 256;
        int var4 = arg1.field7980 * 512 + (arg1.method1835((byte) 127) * 256);
        arg1.field1264 += (var3 - arg1.field1264) / var2;
        arg1.field1250 += (var4 - arg1.field1250) / var2;
        arg1.field8012 = 0;
        if (arg1.field7933 == 0) {
            arg1.method3242(8192, 8192);
        }
        if (arg1.field7933 == 1) {
            arg1.method3242(arg0 + 8117, 12288);
        }
        if (arg0 != 75) {
            field3902 = 101;
        }
        if (arg1.field7933 == 2) {
            arg1.method3242(arg0 + 8117, 0);
        }
        if (arg1.field7933 == 3) {
            arg1.method3242(arg0 + 8117, 4096);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 40)
    public static final Object method1777(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 <= 70) {
            method1778(-54, 89, 68);
        }
        field3898++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class488.field6911) {
            try {
                class281 var3 = (class281) Class.forName("ce").getDeclaredConstructor().newInstance();
                var3.method1848(14, arg2);
                return var3;
            } catch (Throwable var4) {
                class488.field6911 = true;
            }
        }
        return arg1 ? class529.method3083(arg2, (byte) 95) : arg2;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ldp;Lfv;IIIIIIIII)V", line = 74)
    public class273(class3 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3899 = arg9;
        this.field3893 = arg10;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z", line = 86)
    public static final boolean method1778(int arg0, int arg1, int arg2) {
        if (arg0 <= 126) {
            return false;
        } else {
            field3895++;
            return (arg2 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)Lg;", line = 98)
    public final class153 method769(boolean arg0) {
        field3892++;
        if (arg0) {
            field3897 = null;
        }
        return class59.field723;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V", line = 116)
    public static void method1779(int arg0) {
        field3897 = null;
        field3896 = null;
        if (arg0 != 14) {
            method1778(-36, 21, -126);
        }
    }
}
