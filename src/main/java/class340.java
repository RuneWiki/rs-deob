import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 extends class27 {

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field5260 = 4;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field5261 = 4;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field5259 = 0;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "F")
    public static float field5258;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method19(int arg0, int arg1) {
        field5254++;
        if (arg0 != -28941) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int var4 = class209.field3053 / this.field5260;
            int var5 = class184.field2642 / this.field5261;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method168(0, -120, class184.field2642 * var6 / var5);
            } else {
                var7 = this.method168(0, 100, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class209.field3053; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class209.field3053 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var11[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[I", line = 81)
    public final int[] method18(int arg0, byte arg1) {
        int[] var3 = this.field375.method2087(-76, arg0);
        if (arg1 != -62) {
            this.method19(-56, -36);
        }
        field5256++;
        if (this.field375.field4382) {
            int var4 = class209.field3053 / this.field5260;
            int var5 = class184.field2642 / this.field5261;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method164(class184.field2642 * var6 / var5, 25, 0);
            } else {
                var7 = this.method164(0, 68, 0);
            }
            for (int var8 = 0; var8 < class209.field3053; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class209.field3053 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 138)
    public class340() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILsb;I)V", line = 145)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            return;
        }
        if (arg2 == 0) {
            this.field5260 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field5261 = arg1.method1319(255);
        }
        field5257++;
    }
}
