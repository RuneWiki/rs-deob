import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class238 extends class59 {

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Z")
    private boolean field3932 = true;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Z")
    private boolean field3938 = true;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "[I")
    public static int[] field3934 = new int[64];

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
    public static boolean field3931 = true;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field3937 = 0;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "F")
    public static float field3933;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lka;")
    public static class293 field3941;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 211)
    public class238() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V", line = 16)
    public static void method1682(byte arg0) {
        field3934 = null;
        if (arg0 != 11) {
            field3934 = (int[]) null;
        }
        field3941 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILhb;)V", line = 30)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field3936++;
        if (arg1 == 0) {
            this.field3932 = arg2.method1178(8) == 1;
        } else if (arg1 == 1) {
            this.field3938 = arg2.method1178(8) == 1;
        } else if (arg1 == 2) {
            this.field841 = arg2.method1178(arg0 - 107) == 1;
        }
        if (arg0 != 115) {
            field3931 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I", line = 78)
    public final int[][] method116(int arg0, int arg1) {
        field3935++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, this.field3938 ? class33.field544 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3932) {
                for (int var11 = 0; var11 < class293.field4789; var11++) {
                    var7[var11] = var5[class4.field51 - var11];
                    var9[var11] = var8[class4.field51 - var11];
                    var10[var11] = var6[class4.field51 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class293.field4789; var12++) {
                    var7[var12] = var5[var12];
                    var9[var12] = var8[var12];
                    var10[var12] = var6[var12];
                }
            }
        }
        return arg1 == 4588 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[I", line = 156)
    public final int[] method63(boolean arg0, int arg1) {
        field3940++;
        if (!arg0) {
            field3931 = false;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(this.field3938 ? class33.field544 - arg1 : arg1, 0, (byte) -23);
            if (this.field3932) {
                for (int var5 = 0; var5 < class293.field4789; var5++) {
                    var3[var5] = var4[class4.field51 - var5];
                }
            } else {
                class42.method316(var4, 0, var3, 0, class293.field4789);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)I", line = 196)
    public static final int method1683(int arg0, byte arg1, int arg2) {
        int var3 = class93.method696(arg2 - 1, 116, arg0 - 1) + (class93.method696(arg2 + 1, 83, arg0 - 1) - (-class93.method696(arg2 - 1, 87, arg0 + 1) - class93.method696(arg2 + 1, 75, arg0 + 1)));
        field3939++;
        int var4 = -82 / ((-arg1 - 9) / 54);
        int var5 = class93.method696(arg2 - 1, 89, arg0) - (-class93.method696(arg2 + 1, 96, arg0) + (-class93.method696(arg2, 126, arg0 - 1) - class93.method696(arg2, 68, arg0 + 1)));
        int var6 = class93.method696(arg2, 105, arg0);
        return var3 / 16 - (-(var5 / 8) - var6 / 4);
    }
}
