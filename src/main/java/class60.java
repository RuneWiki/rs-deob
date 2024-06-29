import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class60 extends class436 {

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Z")
    private boolean field839 = true;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
    private boolean field842 = true;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "Z")
    public static boolean field845 = true;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field840 = new Rectangle[100];

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field844 = "";

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "[I")
    public static int[] field847 = new int[14];

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "Ljava/lang/String;")
    public static String field850;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "Lsl;")
    public static class264 field851;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V")
    public static void method393(byte arg0) {
        field847 = null;
        field850 = null;
        int var1 = -101 / ((arg0 - 22) / 57);
        field840 = null;
        field851 = null;
        field844 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field843;
        if (arg0 != 34) {
            field851 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field6256 = ~arg2.method2429(arg0 + -34) == -2;
                }
            } else {
                this.field842 = arg2.method2429(0) == 1;
            }
        } else {
            this.field839 = ~arg2.method2429(0) == -2;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        if (arg0 != -13348) {
            field850 = null;
        }
        ++field846;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(this.field842 ? -arg1 + class190.field2634 : arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field839) {
                for (int var11 = 0; ~class43.field653 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class43.field653; ++var12) {
                    var8[var12] = var5[-var12 + class278.field3758];
                    var9[var12] = var6[-var12 + class278.field3758];
                    var10[var12] = var7[-var12 + class278.field3758];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field849;
        if (arg1 != 18338) {
            return null;
        } else {
            int[] var3 = super.field6258.method2688((byte) -112, arg0);
            if (super.field6258.field6138) {
                int[] var4 = this.method2729(0, 0, this.field842 ? -arg0 + class190.field2634 : arg0);
                if (this.field839) {
                    for (int var5 = 0; class43.field653 > var5; ++var5) {
                        var3[var5] = var4[-var5 + class278.field3758];
                    }
                } else {
                    class150.method1022(var4, 0, var3, 0, class43.field653);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
    public static final void method394(byte arg0, int[] arg1, Object[] arg2) {
        if (arg0 != 69) {
            field850 = null;
        }
        ++field841;
        class209.method1361(0, arg1.length - 1, arg1, 92, arg2);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field840[var0] = new Rectangle();
        }
        field850 = "flash3:";
    }
}
