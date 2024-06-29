import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class305 extends class198 {

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field4969 = 4096;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    private int field4970 = 4096;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    private int field4971 = 4096;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[I")
    public static int[] field4974 = new int[100];

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field4972;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (arg1 != -2) {
            field4974 = null;
        }
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, arg0, (byte) 76);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class42.field590; ++var11) {
                int var12 = var8[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~var12 == ~var13 && var12 == var14) {
                    var6[var11] = this.field4970 * var13 >> 12;
                    var9[var11] = this.field4971 * var12 >> 12;
                    var10[var11] = this.field4969 * var14 >> 12;
                } else {
                    var6[var11] = this.field4970;
                    var9[var11] = this.field4971;
                    var10[var11] = this.field4969;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class183.field2835 = arg1;
        class90.field1391 = arg2;
        class35.field448 = arg3;
        class280.field4638 = new class154[arg0][class183.field2835][class90.field1391];
        class277.field4583 = new int[arg0][class183.field2835 + 1][class90.field1391 + 1];
        if (arg4) {
            class114.field1727 = new class154[1][class183.field2835][class90.field1391];
            class161.field2543 = new int[class183.field2835][class90.field1391];
            class304.field4965 = new int[1][class183.field2835 + 1][class90.field1391 + 1];
        } else {
            class114.field1727 = null;
            class161.field2543 = null;
            class304.field4965 = null;
        }
        class274.method1909(false);
        class75.field1179 = new class230[500];
        class262.field4328 = 0;
        class55.field741 = new class230[500];
        class82.field1297 = 0;
        class198.field3152 = new int[arg0][class183.field2835 + 1][class90.field1391 + 1];
        class207.field3309 = new class114[5000];
        class259.field4255 = 0;
        class24.field317 = new class114[100];
        class2.field12 = new boolean[class35.field448 + class35.field448 + 1][class35.field448 + class35.field448 + 1];
        class187.field2893 = new boolean[class35.field448 + class35.field448 + 2][class35.field448 + class35.field448 + 2];
        class148.field2318 = new byte[arg0][class183.field2835][class90.field1391];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field4973;
        int var4 = -28 / ((60 - arg0) / 61);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4969 = arg1.method1419(79);
                }
            } else {
                this.field4971 = arg1.method1419(75);
            }
        } else {
            this.field4970 = arg1.method1419(78);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class305() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
    public static void method2090(byte arg0) {
        if (arg0 <= 62) {
            method2090((byte) 24);
        }
        field4974 = null;
    }
}
