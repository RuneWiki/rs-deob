import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class209 {

    @OriginalMember(owner = "client!rk", name = "Hb", descriptor = "Lri;")
    public static class73 field265 = new class73(79, 12);

    @OriginalMember(owner = "client!rk", name = "Kb", descriptor = "Z")
    public static boolean field268 = false;

    @OriginalMember(owner = "client!rk", name = "Lb", descriptor = "Lki;")
    public static class498 field269 = new class498(23, 3);

    @OriginalMember(owner = "client!rk", name = "Fb", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!rk", name = "Gb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!rk", name = "Ib", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!rk", name = "Jb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "(I)V", line = 3)
    public static void method156(int arg0) {
        field265 = null;
        field269 = null;
        if (arg0 > -9) {
            method156(9);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(FI)V", line = 16)
    public final void method157(float arg0, int arg1) {
        int var3 = 64 / ((arg1 - -15) / 48);
        ++field263;
        int var4 = NativeStream.floatToRawIntBits(arg0);
        super.field3036[super.field3037++] = (byte) (var4 >> 24);
        super.field3036[super.field3037++] = (byte) (var4 >> 16);
        super.field3036[super.field3037++] = (byte) (var4 >> 8);
        super.field3036[super.field3037++] = (byte) var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([IIII[I)V", line = 32)
    public static final void method158(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 != 1) {
            field269 = null;
        }
        ++field266;
        if (arg3 < arg1) {
            int var5 = (arg3 - -arg1) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg1; ++var10) {
                if ((var9 & var10) + var7 > arg0[var10]) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method158(arg0, var6 - 1, 1, arg3, arg4);
            method158(arg0, arg1, 1, var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(FB)V", line = 88)
    public final void method159(float arg0, byte arg1) {
        ++field264;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field3036[super.field3037++] = (byte) var3;
        super.field3036[super.field3037++] = (byte) (var3 >> 8);
        super.field3036[super.field3037++] = (byte) (var3 >> 16);
        if (arg1 != -37) {
            this.method159(0.34394237F, (byte) -49);
        }
        super.field3036[super.field3037++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V", line = 106)
    public class25(int arg0) {
        super(arg0);
    }
}
