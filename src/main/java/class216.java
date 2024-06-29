import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class216 extends class354 {

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    private int field3046 = 4096;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "Lni;")
    public static class367 field3044 = new class367(1, -1);

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
    public static int[] field3048 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "[F")
    public static float[] field3047 = new float[16];

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field3049;
        if (arg0 >= -74) {
            field3044 = null;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 120, 0, class423.field6453 & arg1 + -1);
            int[] var5 = this.method2275((byte) 101, 0, arg1);
            int[] var6 = this.method2275((byte) 103, 0, class423.field6453 & arg1 + 1);
            for (int var7 = 0; class531.field7814 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3046;
                int var9 = (var5[class179.field2409 & var7 - -1] - var5[var7 - 1 & class179.field2409]) * this.field3046;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field3045;
        if (~arg1 == -1) {
            this.field3046 = arg0.method1074(-635989152);
        }
        if (arg2 != 1638) {
            field3048 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)V")
    public static void method1479(boolean arg0) {
        field3048 = null;
        field3044 = null;
        field3047 = null;
        if (!arg0) {
            method1479(false);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, true);
    }

    static {
        new class446((String) null, "geschickt werden.", (String) null, (String) null);
    }
}
