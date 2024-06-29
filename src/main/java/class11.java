import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class11 extends class299 {

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[B")
    public static byte[] field123 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "Liq;")
    public static class134 field130;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "[B")
    private byte[] field122;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
    public final void method71(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field135 = -90;
        }
        field136++;
        if (arg2 == 0) {
            this.field135 = this.field132 - (arg0 >= 0 ? arg0 : -arg0);
            this.field129 = 4096;
            this.field135 = this.field135 * this.field135 >> 12;
            this.field128 = this.field135;
            return;
        }
        this.field129 = this.field135 * this.field126 >> 12;
        if (this.field129 < 0) {
            this.field129 = 0;
        } else if (this.field129 > 4096) {
            this.field129 = 4096;
        }
        this.field135 = this.field132 - (arg0 >= 0 ? arg0 : -arg0);
        this.field135 = this.field135 * this.field135 >> 12;
        this.field135 = this.field135 * this.field129 >> 12;
        this.field128 += this.field135 * this.field134 >> 12;
        this.field134 = this.field134 * this.field121 >> 12;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
    public void method72(int arg0, byte arg1) {
        this.field122[arg0] = arg1;
        field133++;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field126 = (int) (arg7 * 4096.0F);
        this.field132 = (int) (arg6 * 4096.0F);
        this.field134 = this.field121 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
    public static void method73(int arg0) {
        field123 = null;
        int var1 = -5 / ((arg0 + 27) / 51);
        field130 = null;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        this.field128 >>= 0x4;
        if (arg0 != 15535) {
            this.method75(35);
        }
        this.field134 = this.field121;
        field127++;
        if (this.field128 < 0) {
            this.field128 = 0;
        } else if (this.field128 > 255) {
            this.field128 = 255;
        }
        this.method72(this.field125++, (byte) this.field128);
        this.field128 = 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public final void method75(int arg0) {
        this.field128 = arg0;
        this.field125 = 0;
        field131++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BIIIIII)V")
    public static final void method76(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field120++;
        int var7 = class198.method1192(class189.field2831, class204.field3060, arg1, -3);
        int var8 = class198.method1192(class189.field2831, class204.field3060, arg4, -3);
        int var9 = class198.method1192(class192.field2917, class39.field497, arg3, arg0 - 84);
        int var10 = class198.method1192(class192.field2917, class39.field497, arg6, arg0 ^ 0xFFFFFFAC);
        int var11 = class198.method1192(class189.field2831, class204.field3060, arg1 + arg5, -3);
        int var12 = class198.method1192(class189.field2831, class204.field3060, arg4 - arg5, arg0 + -84);
        for (int var13 = var7; var13 < var11; var13++) {
            class379.method2285(125, class292.field4448[var13], var10, arg2, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class379.method2285(124, class292.field4448[var14], var10, arg2, var9);
        }
        int var15 = class198.method1192(class192.field2917, class39.field497, arg3 + arg5, -3);
        if (arg0 != 81) {
            return;
        }
        int var16 = class198.method1192(class192.field2917, class39.field497, arg6 - arg5, -3);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class292.field4448[var17];
            class379.method2285(arg0 ^ 0x2F, var18, var15, arg2, var9);
            class379.method2285(126, var18, var10, arg2, var16);
        }
    }
}
