import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class34 extends class128 {

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "J")
    public long field514;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
    public static int[] field512 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Luf;")
    public static class177 field516 = new class177();

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
    public static int[] field517 = new int[1000];

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lhg;")
    public static class220 field513;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lrm;")
    public static class45 field520;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[[Lag;")
    public static class211[][] field519;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static void method223(int arg0) {
        field512 = null;
        field517 = null;
        field516 = null;
        field513 = null;
        field519 = null;
        field520 = null;
        if (arg0 != -3) {
            method223(-19);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method224(int arg0, int arg1) {
        if (arg1 != -3) {
            method223(-41);
        }
        class213.field3529.method1262(arg0, arg1 + 2739);
        class72.field1214.method1262(arg0, arg1 + 2739);
        field515++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field511++;
        if ((arg2 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg4;
            arg4 = var7;
        }
        int var8 = arg0 & arg1;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg3;
        } else {
            return 7 + 1 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class34() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(J)V")
    public class34(long arg0) {
        this.field514 = arg0;
    }
}
