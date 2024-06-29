import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class721 extends class634 {

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
    private int field10107 = 1;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    private int field10113 = 0;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    private int field10112 = 0;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "Lqd;")
    public static class447 field10114 = class158.method978(-121);

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "[F")
    public static float[] field10117 = new float[16384];

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "[F")
    public static float[] field10116 = new float[16384];

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "[Lwc;")
    public static class66[] field10118 = new class66[14];

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    public static int field10119 = 0;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "[I")
    public static int[] field10115;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 <= 65) {
            this.field10107 = -29;
        }
        ++field10110;
        class581.method3345((byte) 89);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field10109;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int var4 = class164.field1840[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class635.field9139; ++var6) {
                int var7 = class246.field2980[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field10113 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field10107 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field10107;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field10112 == -1) {
                    var12 = class230.field2686[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field10112 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 >= -55) {
            this.field10112 = -38;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)V")
    public static void method4022(int arg0) {
        field10117 = null;
        if (arg0 != 0) {
            method4022(-127);
        }
        field10116 = null;
        field10115 = null;
        field10118 = null;
        field10114 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field10111;
        if (arg2) {
            method4022(90);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field10107 = arg1.method1423(-113);
                }
            } else {
                this.field10112 = arg1.method1423(-79);
            }
        } else {
            this.field10113 = arg1.method1423(-64);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class721() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
    public static final void method4023(int arg0, int arg1) {
        ++field10108;
        class47 var2 = class258.method1546(arg1, arg0, (byte) 121);
        var2.method274(false);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field10117[var2] = (float) Math.sin((double) var2 * var0);
            field10116[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
