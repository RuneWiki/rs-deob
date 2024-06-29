import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class244 extends class23 {

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    private int field4018 = 0;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "I")
    private int field4027 = 8192;

    @OriginalMember(owner = "client!qj", name = "pb", descriptor = "I")
    private int field4033 = 0;

    @OriginalMember(owner = "client!qj", name = "sb", descriptor = "I")
    private int field4036 = 2048;

    @OriginalMember(owner = "client!qj", name = "ub", descriptor = "I")
    private int field4038 = 12288;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "I")
    private int field4026 = 4096;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    private int field4025 = 2048;

    @OriginalMember(owner = "client!qj", name = "mb", descriptor = "I")
    public static int field4030 = 0;

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "Lqd;")
    public static class40 field4028 = class147.method1106("<col=ffff00>", (byte) -87);

    @OriginalMember(owner = "client!qj", name = "tb", descriptor = "[[I")
    public static int[][] field4037 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qj", name = "nb", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!qj", name = "qb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!qj", name = "rb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!qj", name = "vb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!qj", name = "lb", descriptor = "Z")
    public static boolean field4029;

    @OriginalMember(owner = "client!qj", name = "ob", descriptor = "[Lqd;")
    public static class40[] field4032;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "[Lmb;")
    public static class99[] field4024;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "[S")
    public static short[] field4019;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "[[[I")
    public static int[][][] field4020;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILsd;)V", line = 13)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            method1714(126, -112, 53, (byte) -107, -37);
        }
        if (arg0 == 0) {
            this.field4036 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field4018 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field4033 = arg2.method197(-1);
        } else if (arg0 == 3) {
            this.field4025 = arg2.method197(-1);
        } else if (arg0 == 4) {
            this.field4038 = arg2.method197(~arg1);
        } else if (arg0 == 5) {
            this.field4026 = arg2.method197(-1);
        } else if (arg0 == 6) {
            this.field4027 = arg2.method197(-1);
        }
        field4017++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 264)
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 102)
    public final void method61(byte arg0) {
        if (arg0 == 4) {
            field4022++;
            class50.method440((byte) 81);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIB)Z", line = 115)
    private final boolean method1713(int arg0, int arg1, byte arg2) {
        int var4 = (arg0 + arg1) * this.field4038 >> 12;
        field4034++;
        int var5 = class163.field2705[var4 * 255 >> 12 & 0xFF];
        if (arg2 != 41) {
            this.method1716(-37, 89, -127);
        }
        int var6 = (var5 << 12) / this.field4038;
        int var7 = (var6 << 12) / this.field4027;
        int var8 = this.field4026 * var7 >> 12;
        return arg1 - arg0 < var8 && (arg1 - arg0) > (-var8);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBI)I", line = 133)
    public static final int method1714(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 65536 - class203.field3216[arg4 * 1024 / arg0] >> 1;
        int var6 = -112 % ((-arg3 - 23) / 33);
        field4016++;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I", line = 149)
    public final int[] method32(byte arg0, int arg1) {
        field4021++;
        if (arg0 != -94) {
            field4020 = (int[][][]) ((int[][][]) null);
        }
        int[] var3 = this.field403.method724((byte) 64, arg1);
        if (this.field403.field1760) {
            int var4 = class150.field2509[arg1] - 2048;
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                int var6 = class315.field5345[var5] - 2048;
                int var7 = var6 + this.field4033;
                int var8 = var4 + this.field4025;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = this.field4018 + var4;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var6 + this.field4036;
                int var16 = var14 <= 2048 ? var14 : var14 - 4096;
                int var17 = var15 >= -2048 ? var15 : var15 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method1716(var16, var18, arg0 + 216) || this.method1713(var10, var12, (byte) 41) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 223)
    public static void method1715(byte arg0) {
        field4037 = (int[][]) null;
        field4032 = null;
        field4024 = null;
        if (arg0 > -18) {
            field4020 = (int[][][]) ((int[][][]) null);
        }
        field4020 = (int[][][]) null;
        field4019 = null;
        field4028 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)Z", line = 246)
    private final boolean method1716(int arg0, int arg1, int arg2) {
        field4035++;
        int var4 = (arg0 - arg1) * this.field4038 >> 12;
        if (arg2 <= 47) {
            this.field4025 = -23;
        }
        int var5 = class163.field2705[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field4038;
        int var7 = (var6 << 12) / this.field4027;
        int var8 = this.field4026 * var7 >> 12;
        return var8 > arg1 + arg0 && (arg0 + arg1) > (-var8);
    }
}
