import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class488 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Loo;")
    public static class629 field6982 = new class629(12, 8);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lqe;")
    public static class469 field6983 = new class469(13, 1);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[Luba;")
    public static class432[] field6985 = new class432[1024];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ[F)[F", line = 4)
    public static final float[] method2924(int arg0, boolean arg1, float[] arg2) {
        field6981++;
        if (arg1) {
            float[] var3 = new float[arg0];
            class319.method2018(arg2, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 19)
    public static void method2925(byte arg0) {
        field6985 = null;
        field6983 = null;
        field6982 = null;
        int var1 = 30 % ((17 - arg0) / 33);
    }
}
