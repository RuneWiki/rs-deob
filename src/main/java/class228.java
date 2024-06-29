import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class228 extends class397 {

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    private int field3202 = 3072;

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
    private int field3207 = 2048;

    @OriginalMember(owner = "client!du", name = "N", descriptor = "I")
    private int field3204 = 1024;

    @OriginalMember(owner = "client!du", name = "O", descriptor = "[I")
    public static int[] field3205 = new int[14];

    @OriginalMember(owner = "client!du", name = "M", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!du", name = "P", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!du", name = "R", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!du", name = "U", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!du", name = "S", descriptor = "Loj;")
    public static class246 field3209;

    @OriginalMember(owner = "client!du", name = "T", descriptor = "[I")
    public static int[] field3210;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(B)V")
    public static void method1399(byte arg0) {
        if (arg0 != -25) {
            field3210 = null;
        }
        field3210 = null;
        field3209 = null;
        field3205 = null;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field3208;
        int[] var3 = super.field5854.method465(arg1, 103);
        if (arg0 != -780833076) {
            this.field3204 = -7;
        }
        if (super.field5854.field991) {
            int[] var4 = this.method2376(arg0 + 780833174, 0, arg1);
            for (int var5 = 0; var5 < class164.field2152; ++var5) {
                var3[var5] = this.field3204 - -(var4[var5] * this.field3207 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        this.field3207 = -this.field3204 + this.field3202;
        if (arg0 != 255) {
            this.field3202 = 72;
        }
        ++field3211;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field3203;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field5859 = ~arg2.method941((byte) 124) == -2;
                }
            } else {
                this.field3202 = arg2.method993((byte) -69);
            }
        } else {
            this.field3204 = arg2.method993((byte) -87);
        }
        if (arg1 != 80) {
            this.field3207 = 73;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field3206;
        if (arg0 < 81) {
            this.method31(61, -56);
        }
        int[][] var3 = super.field5848.method1692(arg1, 73);
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -99, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class164.field2152 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3207 >> 12) + this.field3204;
                var9[var11] = this.field3204 - -(var6[var11] * this.field3207 >> 12);
                var10[var11] = (var7[var11] * this.field3207 >> 12) + this.field3204;
            }
        }
        return var3;
    }
}
