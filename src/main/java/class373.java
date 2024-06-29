import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class373 {

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "J")
    public long field5241;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lck;")
    private class221 field5242;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field5240 = -1;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "[I")
    public static int[] field5247 = new int[1];

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Lus;")
    public static class328 field5244 = new class328(21, 3);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Lbh;")
    public static class429 field5246;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 4)
    public static void method2271(byte arg0) {
        field5244 = null;
        field5246 = null;
        field5247 = null;
        if (arg0 != -24) {
            field5246 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        field5243++;
        this.field5242.method1382(this.field5241, -4042);
        super.finalize();
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)I", line = 28)
    public static final int method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field5245++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 8 - arg2 - arg1;
        } else if (arg4 == 21) {
            return var7 == 2 ? -arg5 - (arg6 - 1 - 7) : arg1;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lck;JI)V", line = 64)
    public class373(class221 arg0, long arg1, int arg2) {
        this.field5241 = arg1;
        this.field5242 = arg0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Ljaa;", line = 79)
    public static final class266 method2273(int arg0) {
        field5239++;
        if (arg0 >= -45) {
            return null;
        } else if (class236.field3049 < class303.field3903.length) {
            return class303.field3903[class236.field3049++];
        } else {
            return null;
        }
    }
}
