import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class676 extends class747 {

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "Z")
    private boolean field9371 = true;

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "Z")
    private boolean field9372 = true;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "Lbaa;")
    public static class130 field9376 = new class130(8);

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "[I")
    public static int[] field9377 = new int[50];

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!mea", name = "M", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!mea", name = "N", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!mea", name = "L", descriptor = "Luu;")
    public static class237 field9378;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method688(int arg0, int arg1) {
        ++field9375;
        int var3 = -104 / ((35 - arg0) / 58);
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var5 = this.method4158(0, !this.field9371 ? arg1 : -arg1 + class415.field5878, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field9372) {
                for (int var12 = 0; class73.field1095 > var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; class73.field1095 > var13; ++var13) {
                    var9[var13] = var6[-var13 + class73.field1097];
                    var10[var13] = var7[class73.field1097 - var13];
                    var11[var13] = var8[-var13 + class73.field1097];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ldc;II)V", line = 69)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field10281 = arg0.method505((byte) -119) == 1;
                }
            } else {
                this.field9371 = arg0.method505((byte) -119) == 1;
            }
        } else {
            this.field9372 = ~arg0.method505((byte) -119) == -2;
        }
        ++field9373;
        if (arg1 != 11608) {
            field9376 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V", line = 175)
    public class676() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method182(int arg0, int arg1) {
        if (arg1 >= -89) {
            method3810(-49);
        }
        ++field9379;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(33, !this.field9371 ? arg0 : class415.field5878 - arg0, 0);
            if (!this.field9372) {
                class245.method1647(var4, 0, var3, 0, class73.field1095);
            } else {
                for (int var5 = 0; var5 < class73.field1095; ++var5) {
                    var3[var5] = var4[-var5 + class73.field1097];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(B)V", line = 156)
    public static final void method3809(byte arg0) {
        if (arg0 <= -84) {
            class432.field6030.method3902(0);
            ++field9374;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V", line = 184)
    public static void method3810(int arg0) {
        if (arg0 != 0) {
            method3809((byte) 122);
        }
        field9377 = null;
        field9378 = null;
        field9376 = null;
    }
}
