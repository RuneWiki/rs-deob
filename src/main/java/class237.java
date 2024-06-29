import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class237 extends class195 {

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    private int field3809 = 4096;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lck;")
    public static class119 field3805 = class298.method1987((byte) 97, "<col=00ff80>");

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "Lua;")
    public static class276 field3811 = null;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "Z")
    public static boolean field3810 = false;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lck;")
    private static class119 field3806 = class298.method1987((byte) 78, "Location");

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "Lck;")
    public static class119 field3808 = field3806;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Lrg;")
    public static class235 field3803;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "[I")
    public static int[] field3802;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "[Lbe;")
    public static class81[] field3801;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([IJII)Lck;", line = 5)
    public static final class119 method1517(int[] arg0, long arg1, int arg2, int arg3) {
        field3807++;
        if (class97.field1483 != null) {
            class119 var5 = class97.field1483.method107(arg1, (byte) -56, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 != -1) {
            field3810 = true;
        }
        return arg2 == 5 ? class147.method963((byte) 0, arg1).method785(116) : class68.method494(arg1, 10);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)[I", line = 45)
    public final int[] method11(int arg0, boolean arg1) {
        field3804++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (arg1) {
            this.method13((class3) null, -37, 76);
        }
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 118, class59.field945 & arg0 - 1);
            int[] var5 = this.method1253(0, 123, arg0);
            int[] var6 = this.method1253(0, 126, arg0 + 1 & class59.field945);
            for (int var7 = 0; var7 < class157.field2504; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3809;
                int var9 = (var5[class254.field4088 & var7 + 1] - var5[var7 - 1 & class254.field4088]) * this.field3809;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V", line = 99)
    public static void method1518(int arg0) {
        field3806 = null;
        field3802 = null;
        if (arg0 > -25) {
            field3808 = (class119) null;
        }
        field3808 = null;
        field3801 = null;
        field3805 = null;
        field3803 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 119)
    public static final void method1519(byte arg0) {
        field3812++;
        if (arg0 != -75) {
            field3803 = (class235) null;
        }
        while (true) {
            class156 var1 = class82.field1256;
            class210 var2;
            synchronized (class82.field1256) {
                var2 = (class210) class299.field5052.method991(arg0 + 16771576);
            }
            if (var2 == null) {
                return;
            }
            var2.field3355.method179(var2.field3354, var2.field3359, (int) var2.field1218, false, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lfj;II)V", line = 142)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3809 = arg0.method63((byte) 1);
        }
        if (arg1 >= -117) {
            field3805 = (class119) null;
        }
        field3813++;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 155)
    public class237() {
        super(1, true);
    }
}
