import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class535 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Lqe;")
    public static class469 field7671 = new class469(106, 4);

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
    public static int[] field7675 = new int[1];

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILrg;)Lhu;", line = 5)
    public static final class132 method3137(int arg0, class645 arg1) {
        field7674++;
        int var2 = arg1.method3745(-6314);
        class651 var3 = class43.method300(false)[arg1.method3745(arg0 ^ 0x4DE5)];
        class713 var4 = class478.method2882(39)[arg1.method3745(-6314)];
        int var5 = arg1.method3756(65536);
        int var6 = arg1.method3756(65536);
        int var7 = arg1.method3712((byte) 107);
        int var8 = arg1.method3712((byte) 51);
        if (arg0 != -21837) {
            method3138(120);
        }
        int var9 = arg1.method3720(-19541);
        int var10 = arg1.method3720(-19541);
        int var11 = arg1.method3720(-19541);
        boolean var12 = arg1.method3745(-6314) == 1;
        return new class132(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I", line = 41)
    public static final int method3138(int arg0) {
        field7673++;
        return arg0 < 70 ? 2 : class34.field352;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 57)
    public static void method3139(int arg0) {
        field7675 = null;
        field7671 = null;
        int var1 = 21 % ((-arg0 - 4) / 34);
    }
}
