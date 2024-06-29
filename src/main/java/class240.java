import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class240 extends class330 {

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lfi;")
    public static class331 field3257 = new class331(8);

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lro;")
    public static class1 field3262 = new class1();

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
    public boolean field3258;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[[Z")
    public static boolean[][] field3264;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 5)
    public static void method1530(byte arg0) {
        field3257 = null;
        field3262 = null;
        field3264 = null;
        if (arg0 != -60) {
            field3264 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lbk;B)Lqn;", line = 18)
    public static final class40 method1531(class211 arg0, byte arg1) {
        if (arg1 == 109) {
            field3253++;
            return new class40(arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1344((byte) -4), arg0.method1353(100), arg0.method1342((byte) -127));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V", line = 30)
    public final void method224(int arg0) {
        field3254++;
        int var2 = -25 / ((arg0 - 52) / 46);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILen;IBLfs;IZ)V", line = 44)
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        field3259++;
        if (arg3 == -42) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZIII)V", line = 56)
    public static final void method1532(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field3261++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class436.field6392 - class33.field308) * var6 / 100 + class33.field308;
        if (var7 < class235.field3197) {
            var7 = class235.field3197;
        } else if (class369.field5413 < var7) {
            var7 = class369.field5413;
        }
        int var8 = var7 * 512 * arg3 / (arg0 * 334);
        if (var8 < class344.field5062) {
            short var12 = class344.field5062;
            var7 = arg0 * 334 * var12 / (arg3 * 512);
            if (var7 > class369.field5413) {
                var7 = class369.field5413;
                int var13 = var7 * 512 * arg3 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class218.field2991.method957();
                    class218.field2991.method1150((byte) 111, arg4, arg5, arg3, var14, -16777216);
                    class218.field2991.method1150((byte) 108, arg4, arg0 + arg5 - var14, arg3, var14, -16777216);
                }
                arg5 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class10.field118) {
            short var9 = class10.field118;
            var7 = var9 * 334 * arg0 / (arg3 * 512);
            if (class235.field3197 > var7) {
                var7 = class235.field3197;
                int var10 = var9 * 334 * arg0 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg2) {
                    class218.field2991.method957();
                    class218.field2991.method1150((byte) 126, arg4, arg5, var11, arg0, -16777216);
                    class218.field2991.method1150((byte) 109, arg3 + arg4 - var11, arg5, var11, arg0, -16777216);
                }
                arg4 += var11;
                arg3 -= var11 * 2;
            }
        }
        class24.field242 = arg5;
        class34.field336 = (short) arg3;
        if (arg1 != -7509) {
            method1531((class211) null, (byte) 106);
        }
        class220.field3020 = (short) arg0;
        class38.field393 = arg4;
        class108.field1249 = arg3 * var7 / 334;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Z", line = 154)
    public final boolean method217(int arg0) {
        int var2 = 43 / ((arg0 + 60) / 37);
        field3256++;
        return false;
    }
}
