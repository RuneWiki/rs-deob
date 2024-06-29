import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class517 extends class529 {

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field7677 = -1;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Llm;")
    public static class31 field7676 = new class31(4, 4);

    @OriginalMember(owner = "client!n", name = "q", descriptor = "D")
    public static double field7680 = -1.0D;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lbi;")
    public static class104 field7679 = new class104(69, -1);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field7681 = 0;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method3106(int arg0) {
        if (arg0 <= -83) {
            field7676 = null;
            field7679 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIFZIII)[I")
    public static final int[] method3107(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field7678++;
        int[] var8 = new int[arg6];
        class416 var9 = new class416();
        var9.field6303 = (int) (arg3 * 4096.0F);
        int var10 = -17 % ((-arg1 - 23) / 56);
        var9.field6310 = arg0;
        var9.field6317 = arg2;
        var9.field6300 = arg5;
        var9.field6307 = arg4;
        var9.field6321 = arg7;
        var9.method51(-80);
        class454.method2856(true, arg6, 1);
        var9.method2660((byte) 105, 0, var8);
        return var8;
    }
}
