import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class195 extends class145 {

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(III)V")
    private final void method1396(int arg0, int arg1, int arg2) {
        ++field2795;
        int var4 = class229.field3181[arg1];
        int var5 = class134.field1902[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class335.field4545 = arg1;
            class305.field4134 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class305.field4134 = arg1;
            class335.field4545 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class305.field4134 = arg1;
            class335.field4545 = -arg0 + class156.field2364;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class305.field4134 = -arg0 + class81.field1209;
            class335.field4545 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class335.field4545 = -arg1 + class156.field2364;
            class305.field4134 = -arg0 + class81.field1209;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class335.field4545 = -arg0 + class156.field2364;
            class305.field4134 = class81.field1209 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class335.field4545 = arg0;
            class305.field4134 = -arg1 + class81.field1209;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class335.field4545 = -arg1 + class156.field2364;
            class305.field4134 = arg0;
        }
        class305.field4134 &= class402.field5610;
        class335.field4545 &= class40.field606;
        int var7 = -58 / ((arg2 - 82) / 41);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2794;
        int var3 = -86 % ((arg1 - 16) / 49);
        int[] var4 = super.field2218.method1614(92, arg0);
        if (super.field2218.field3396) {
            for (int var5 = 0; var5 < class156.field2364; ++var5) {
                this.method1396(arg0, var5, 123);
                int[] var6 = this.method1119(0, 0, class305.field4134);
                var4[var5] = var6[class335.field4545];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field2793;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (!arg0) {
            return null;
        } else {
            if (super.field2217.field5771) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class156.field2364; ++var7) {
                    this.method1396(arg1, var7, 126);
                    int[][] var8 = this.method1121(class305.field4134, 0, 2);
                    var4[var7] = var8[0][class335.field4545];
                    var5[var7] = var8[1][class335.field4545];
                    var6[var7] = var8[2][class335.field4545];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field2205 = arg0.method1861((byte) -72) == 1;
        }
        int var4 = -46 / ((arg1 - 11) / 52);
        ++field2792;
    }
}
