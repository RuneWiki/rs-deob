import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class680 extends class633 {

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lqfa;")
    public static class85 field9647 = new class85(52, 0);

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "[B")
    private byte[] field9642;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
    public static final int method3821(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field9646++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else {
            if (arg3 > -93) {
                method3825((byte) 46);
            }
            return var4 == 2 ? 4095 - arg2 : arg0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method3822(int arg0) {
        if (arg0 <= 107) {
            method3821(67, -53, -127, 76);
        }
        field9647 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
    public final void method2013(byte arg0, int arg1, int arg2) {
        field9640++;
        int var4 = 126 % ((14 - arg1) / 52);
        byte var5 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var6 = arg2 * 2;
        int var10001 = var6;
        int var7 = var6 + 1;
        this.field9642[var10001] = var5;
        this.field9642[var7] = var5;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3823(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -8198) {
            this.field9642 = null;
        }
        this.field9642 = new byte[arg0 * arg1 * arg2 * 2];
        field9644++;
        this.method1439(arg0, arg1, true, arg2);
        return this.field9642;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class680() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZIILus;[B)Ldea;")
    public static final class225 method3824(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class1 arg6, byte[] arg7) {
        if (arg0 != 2) {
            return null;
        }
        field9643++;
        if (!arg6.field350 && (!class141.method1144(0, arg1) || !class141.method1144(0, arg4))) {
            return arg6.field259 ? new class225(arg6, 34037, arg5, arg1, arg4, arg3, arg7, arg2) : new class225(arg6, arg5, arg1, arg4, class455.method2740(-1675135295, arg1), class455.method2740(-1675135295, arg4), arg7, arg2);
        } else {
            return new class225(arg6, 3553, arg5, arg1, arg4, arg3, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static final void method3825(byte arg0) {
        field9645++;
        if (class30.field938 == null) {
            return;
        }
        if (arg0 != 66) {
            field9647 = null;
        }
        class119.field2122 = new class284();
        class119.field2122.method1875(class30.field938, arg0 ^ 0xFFFFAA44, class30.field938.field4591, class30.field938.field4595.method1733(255, class140.field2466), class540.field7550);
        class583.field8431 = new Thread(class119.field2122, "");
        class583.field8431.start();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
    public static final int method3826(int arg0, int arg1) {
        if (arg0 >= -25) {
            field9647 = null;
        }
        field9641++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
