import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class274 extends class476 {

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[[I")
    public int[][] field3716;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
    public int[] field3713;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
    public int[] field3712;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[Z")
    public boolean[] field3715;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "S")
    public static short field3708 = 1;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[I")
    public static int[] field3714 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lrb;")
    public static class283 field3719 = new class283(110, 4);

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[[I")
    public static int[][] field3720 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[I")
    public static int[] field3723 = new int[14];

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Z")
    public static boolean field3721 = false;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[I")
    public static int[] field3722 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Lhv;")
    public static class149 field3724;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[Lbf;")
    public static class182[] field3725;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILhi;)V")
    public static final void method1602(int arg0, class45 arg1) {
        if (arg0 == 14) {
            field3709++;
            class17.field275.method190(arg1.method303(arg0 + 2034), -19465);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        field3720 = null;
        field3724 = null;
        field3714 = null;
        field3719 = null;
        field3723 = null;
        field3722 = null;
        if (arg0 != -45) {
            method1605(92, -62);
        }
        field3725 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)I")
    public static final int method1604(int arg0, byte arg1) {
        field3711++;
        int var8 = arg0 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        int var7 = -108 / ((67 - arg1) / 36);
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method1605(int arg0, int arg1) {
        field3710++;
        class314 var2 = class177.method1213(false, arg1, arg0);
        var2.method1811((byte) 86);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I[B)V")
    public class274(int arg0, byte[] arg1) {
        this.field3718 = arg0;
        class319 var3 = new class319(arg1);
        this.field3717 = var3.method1869(-75);
        this.field3716 = new int[this.field3717][];
        this.field3713 = new int[this.field3717];
        this.field3712 = new int[this.field3717];
        this.field3715 = new boolean[this.field3717];
        for (int var4 = 0; var4 < this.field3717; var4++) {
            this.field3713[var4] = var3.method1869(-71);
        }
        for (int var5 = 0; var5 < this.field3717; var5++) {
            this.field3715[var5] = var3.method1869(-118) == 1;
        }
        for (int var6 = 0; var6 < this.field3717; var6++) {
            this.field3712[var6] = var3.method1844(-115);
        }
        for (int var7 = 0; var7 < this.field3717; var7++) {
            this.field3716[var7] = new int[var3.method1869(-128)];
        }
        for (int var8 = 0; var8 < this.field3717; var8++) {
            for (int var9 = 0; var9 < this.field3716[var8].length; var9++) {
                this.field3716[var8][var9] = var3.method1869(-66);
            }
        }
    }
}
