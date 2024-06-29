import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class227 extends class205 {

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Ljava/util/Random;")
    public static Random field3205 = new Random();

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "[I")
    public static int[] field3210 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Laq;")
    public static class385 field3213;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I")
    public static final int method1431(byte arg0) {
        if (arg0 != 68) {
            method1433(-84, true, -106, -57, -14);
        }
        ++field3208;
        return 2;
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static void method1432(int arg0) {
        if (arg0 != 4080) {
            field3210 = null;
        }
        field3205 = null;
        field3210 = null;
        field3213 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field3207;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644 && this.method1296(-31701)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2932 * super.field2932;
            for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                int var9 = super.field2940[var7 - -(var8 % super.field2939)];
                var6[var8] = class347.method2074(var9 << 4, 4080);
                var5[var8] = class347.method2074(65280, var9) >> 4;
                var4[var8] = class347.method2074(var9, 16711680) >> 12;
            }
        }
        return arg1 != 92 ? null : var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIII)I")
    public static final int method1433(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3206;
        if (arg1) {
            field3210 = null;
        }
        int var5 = -class432.field5957[arg2 * 8192 / arg3] + 65536 >> 1;
        return ((-var5 + 65536) * arg0 >> 16) + (arg4 * var5 >> 16);
    }
}
