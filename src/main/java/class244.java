import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class244 extends class82 {

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    private int field3134 = 4096;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field3133 = 0;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Lcea;")
    public static class180 field3135 = new class180("M", "M", "M", "M");

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field3141 = 0;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "F")
    public static float field3142;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[I", line = 6)
    public final int[] method201(int arg0, int arg1) {
        ++field3137;
        if (arg1 != 12218) {
            this.method201(-88, -65);
        }
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            for (int var5 = 0; ~var5 > ~class629.field9033; ++var5) {
                int var6 = var4[var5];
                if (~this.field3136 < ~var6) {
                    var3[var5] = this.field3136;
                } else if (var6 > this.field3134) {
                    var3[var5] = this.field3134;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILos;)V", line = 50)
    public final void method198(int arg0, int arg1, class374 arg2) {
        int var4 = -12 % ((-69 - arg1) / 42);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field999 = arg2.method2129(-87) == 1;
                }
            } else {
                this.field3134 = arg2.method2136(false);
            }
        } else {
            this.field3136 = arg2.method2136(false);
        }
        ++field3139;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 114)
    public class244() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 97)
    public static void method1384(byte arg0) {
        if (arg0 > -91) {
            field3135 = null;
        }
        field3135 = null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I", line = 119)
    public final int[][] method481(int arg0, int arg1) {
        if (arg0 != 1000) {
            this.field3136 = -75;
        }
        ++field3138;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class629.field9033; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field3136 > var12) {
                    var8[var11] = this.field3136;
                } else if (var12 > this.field3134) {
                    var8[var11] = this.field3134;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 <= ~this.field3136) {
                    if (~var13 >= ~this.field3134) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field3134;
                    }
                } else {
                    var9[var11] = this.field3136;
                }
                if (var14 < this.field3136) {
                    var10[var11] = this.field3136;
                } else if (~var14 >= ~this.field3134) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field3134;
                }
            }
        }
        return var3;
    }
}
