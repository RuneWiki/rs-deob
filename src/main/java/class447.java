import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class447 extends class393 {

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "[Lhu;")
    public static class472[] field6677 = new class472[128];

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Ldw;")
    public static class403 field6676 = new class403("", 15);

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Z")
    public static boolean field6678 = false;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method278(int arg0, int arg1) {
        ++field6675;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942 && this.method2459(9067)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field6017 * super.field6017;
            for (int var8 = 0; ~var8 > ~class402.field6113; ++var8) {
                int var9 = super.field6010[var8 % super.field6018 + var7];
                var6[var8] = class344.method2224(255, var9) << 4;
                var5[var8] = class344.method2224(var9 >> 4, 4080);
                var4[var8] = class344.method2224(var9, 16711680) >> 12;
            }
        }
        int var10 = -60 / ((arg0 - -40) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V", line = 56)
    public static void method2685(byte arg0) {
        field6677 = null;
        field6676 = null;
        if (arg0 >= -31) {
            field6676 = null;
        }
    }
}
