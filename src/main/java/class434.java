import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class434 extends class447 {

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "[B")
    public byte[] field6232;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field6236 = -9017772;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
    public static int[] field6235 = new int[14];

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
    public static int[] field6233 = new int[2];

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lqj;")
    public static class296 field6231;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[S")
    public static short[] field6239;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Lpe;", line = 6)
    public static final class362 method2723(boolean arg0, int arg1) {
        field6237++;
        class362 var2 = (class362) class57.field817.method567((byte) 127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class280.field3833.method1920(arg1, false, 5);
        class362 var4 = new class362();
        if (var3 != null) {
            var4.method2334(32, new class371(var3));
        }
        if (!arg0) {
            method2723(false, 29);
        }
        class57.field817.method565(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILaa;IILcj;BII)Llf;", line = 39)
    public static final class130 method2724(int arg0, class281 arg1, int arg2, int arg3, class412 arg4, byte arg5, int arg6, int arg7) {
        class76.field1192.field3055 = arg2;
        class76.field1192.field3062 = arg3;
        class76.field1192.field3060 = arg4 != null;
        class76.field1192.field3063 = arg1.field3847;
        class76.field1192.field3051 = arg0;
        class76.field1192.field3059 = arg7;
        if (arg5 != -78) {
            method2723(true, 67);
        }
        class76.field1192.field3052 = arg6;
        field6238++;
        return (class130) class362.field5075.method1677(false, class76.field1192);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V", line = 64)
    public class434(byte[] arg0) {
        this.field6232 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 79)
    public static void method2725(int arg0) {
        field6235 = null;
        field6239 = null;
        if (arg0 < -66) {
            field6231 = null;
            field6233 = null;
        }
    }
}
