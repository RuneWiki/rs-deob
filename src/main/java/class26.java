import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class26 extends class36 {

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field327 = 0;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Lqc;")
    public static class99 field330 = new class99(64);

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field332 = 7759444;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILcg;)V", line = 6)
    public final void method152(int arg0, class316 arg1) {
        int var3 = -110 / ((32 - arg0) / 62);
        field329++;
        while (true) {
            int var4 = arg1.method2219(16448);
            if (var4 == 0) {
                return;
            }
            this.method154(arg1, (byte) -101, var4);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIIIII)V", line = 27)
    public static final void method153(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -42) {
            return;
        }
        if (arg0 >= class206.field2952 && class259.field3813 >= arg3 && arg5 >= class101.field1397 && arg2 <= class44.field536) {
            if (arg6 == 1) {
                class36.method204(arg5, arg2, arg3, 79, arg4, arg0);
            } else {
                class315.method2153(arg3, 1, arg6, arg4, arg0, arg5, arg2);
            }
        } else if (arg6 == 1) {
            class31.method178(121, arg5, arg2, arg3, arg4, arg0);
        } else {
            class264.method1797((byte) -83, arg3, arg5, arg2, arg6, arg0, arg4);
        }
        field325++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lcg;BI)V", line = 60)
    private final void method154(class316 arg0, byte arg1, int arg2) {
        field326++;
        int var4 = -67 % ((-arg1 - 9) / 41);
        if (arg2 == 2) {
            this.field327 = arg0.method2220((byte) 92);
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 79)
    public static void method155(int arg0) {
        if (arg0 != 1) {
            field331 = 61;
        }
        field330 = null;
    }
}
