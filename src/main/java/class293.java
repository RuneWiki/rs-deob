import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class293 extends class239 {

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
    public static boolean field3815 = true;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Luv;")
    public static class3 field3819 = new class3(53, 2);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lkr;")
    public static class329 field3813;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Z")
    public boolean field3822;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public static final void method1796(int arg0, byte arg1) {
        class538.method2991(-1);
        field3821++;
        class241.method1502(true);
        class190.method1215(arg0, true, (byte) -106);
        class509.method2845(class301.field3918, 117, class24.field433, class532.field7434);
        class84.method475(class301.field3918, class24.field433, 0);
        class530.method2956((byte) -86);
        class164.method890((byte) -56, class44.field632);
        int var2 = -43 / (-arg1 / 58);
        class145.method794((byte) 124);
        class113.method609(0);
        if (class630.field9188 == 2) {
            class597.method3438((byte) 124, 3);
        } else if (class630.field9188 == 6) {
            class597.method3438((byte) 124, 7);
        } else if (class630.field9188 == 9) {
            class597.method3438((byte) 124, 10);
            return;
        } else if (class630.field9188 == 1) {
            class36.method218((byte) -100, class301.field3918, class24.field433);
            return;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Luq;[II[III)Lnca;")
    public static final class54 method1797(class313 arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field3817++;
        int var6 = 86 / ((arg2 + 24) / 40);
        byte[] var7 = new byte[arg4 * arg5];
        for (int var8 = 0; var8 < arg4; var8++) {
            int var9 = arg5 * var8 + arg1[var8];
            for (int var10 = 0; var10 < arg3[var8]; var10++) {
                var7[var9++] = -1;
            }
        }
        return new class54(arg0, arg5, arg4, var7);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field3819 = null;
        if (arg0 == 30674) {
            field3813 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 == 52) {
            field3811++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([BII)[B")
    public static final byte[] method1799(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -16960) {
            method1799(null, -105, 21);
        }
        field3818++;
        byte[] var3 = new byte[arg1];
        class205.method1311(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        field3812++;
        if (arg1 < 67) {
            this.method56((byte) 98);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        field3810++;
        return arg0 == -1 ? false : false;
    }
}
