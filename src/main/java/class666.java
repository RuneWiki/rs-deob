import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class666 {

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Lqj;")
    private class535 field8931 = new class535(128);

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Luq;")
    private class172 field8925;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[[I")
    public static int[][] field8928 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Z")
    public static boolean field8927 = false;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[Z")
    public static boolean[] field8921 = new boolean[200];

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
    public static int[] field8929 = new int[3];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 4)
    public final void method3666(int arg0) {
        field8924++;
        class535 var2 = this.field8931;
        synchronized (this.field8931) {
            this.field8931.method3113(-127);
        }
        if (arg0 != 0) {
            this.field8931 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V", line = 17)
    public final void method3667(int arg0, int arg1) {
        field8922++;
        class535 var3 = this.field8931;
        synchronized (this.field8931) {
            this.field8931.method3101(false, arg1);
            if (arg0 <= 21) {
                field8921 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 31)
    public static void method3668(byte arg0) {
        field8921 = null;
        if (arg0 != -33) {
            method3668((byte) 125);
        }
        field8929 = null;
        field8928 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 45)
    public final void method3669(int arg0) {
        if (arg0 != 2) {
            field8921 = null;
        }
        field8930++;
        class535 var2 = this.field8931;
        synchronized (this.field8931) {
            this.field8931.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZZ)I", line = 63)
    public static final int method3670(int arg0, int arg1, boolean arg2, boolean arg3) {
        field8923++;
        class358 var4 = class559.method3192(arg1, arg3, Integer.MIN_VALUE);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field5210.length) {
            if (arg2) {
                method3668((byte) -99);
            }
            return var4.field5210[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)Lco;", line = 92)
    public final class130 method3671(int arg0, int arg1) {
        field8926++;
        class535 var3 = this.field8931;
        class130 var4;
        synchronized (this.field8931) {
            var4 = (class130) this.field8931.method3109((byte) 124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field8925;
        byte[] var7;
        synchronized (this.field8925) {
            if (arg1 >= -57) {
                return null;
            }
            var7 = this.field8925.method1188(1, -18047, arg0);
        }
        class130 var8 = new class130();
        if (var7 != null) {
            var8.method921(110, new class254(var7));
        }
        class535 var9 = this.field8931;
        synchronized (this.field8931) {
            this.field8931.method3108((long) arg0, 16337, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 134)
    public class666(class263 arg0, int arg1, class172 arg2) {
        this.field8925 = arg2;
        this.field8925.method1175(1, (byte) 92);
    }
}
