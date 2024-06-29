import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class95 extends class335 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    private int field1522 = 4;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    private int field1529 = 4;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "[I")
    public static int[] field1528 = new int[500];

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "F")
    public static float field1524;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Ll;")
    public static class133 field1527;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V", line = 7)
    public static void method711(int arg0) {
        field1528 = null;
        if (arg0 != 0) {
            method712(-48, -73, (byte) -6, 85);
        }
        field1527 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIBI)Lnd;", line = 18)
    public static final class61 method712(int arg0, int arg1, byte arg2, int arg3) {
        field1530++;
        class61 var4 = new class61();
        var4.field982 = arg3;
        var4.field985 = arg1;
        class276.field4257.method1227(var4, 0, (long) arg0);
        class332.method2302(arg3, false);
        class220 var5 = class68.method524((byte) -104, arg0);
        if (var5 != null) {
            class26.method241(3095, var5);
        }
        if (class303.field4728 != null) {
            class26.method241(3095, class303.field4728);
            class303.field4728 = null;
        }
        int var6 = class301.field4706;
        if (arg2 >= -124) {
            return (class61) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class279.method1912(class233.field3689[var7], -8)) {
                class17.method138(9572, var7);
            }
        }
        if (class301.field4706 == 1) {
            class339.field5305 = false;
            class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
        } else {
            class55.method450(class308.field4792, class40.field604, true, class131.field2058, class112.field1737);
            int var8 = class344.field5343.method2228(class174.field2630);
            for (int var9 = 0; var9 < class301.field4706; var9++) {
                int var10 = class344.field5343.method2228(class288.method1979(var9, -42));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class131.field2058 = var8 + 8;
            class112.field1737 = (class238.field3786 ? 26 : 22) + class301.field4706 * 15;
        }
        if (var5 != null) {
            class96.method714(false, (byte) 71, var5);
        }
        class110.method824(0, arg3);
        if (class331.field5160 != -1) {
            class256.method1758(true, class331.field5160, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)Lkh;", line = 97)
    public static final class166 method713(boolean arg0) {
        class166 var1 = new class166(34);
        field1521++;
        var1.method1132((byte) 29, 11);
        var1.method1132((byte) 29, class289.field4507);
        var1.method1132((byte) 29, class242.field3876 ? 1 : 0);
        var1.method1132((byte) 29, class289.field4503 ? 1 : 0);
        var1.method1132((byte) 29, class260.field4071 ? 1 : 0);
        var1.method1132((byte) 29, class59.field962 ? 1 : 0);
        var1.method1132((byte) 29, class170.field2565 ? 1 : 0);
        var1.method1132((byte) 29, class274.field4244 ? 1 : 0);
        var1.method1132((byte) 29, class232.field3674 ? 1 : 0);
        var1.method1132((byte) 29, class217.field3303 ? 1 : 0);
        var1.method1132((byte) 29, class289.field4509);
        var1.method1132((byte) 29, class208.field3191 ? 1 : 0);
        var1.method1132((byte) 29, class300.field4691 ? 1 : 0);
        var1.method1132((byte) 29, class152.field2291 ? 1 : 0);
        var1.method1132((byte) 29, class89.field1422);
        var1.method1132((byte) 29, class188.field2815 ? 1 : 0);
        var1.method1132((byte) 29, class1.field20);
        var1.method1132((byte) 29, class289.field4502);
        var1.method1132((byte) 29, class201.field3016);
        var1.method1150(class298.field4598, -628562744);
        var1.method1150(class259.field4057, -628562744);
        var1.method1132((byte) 29, class64.method488());
        var1.method1174((byte) -32, class270.field4209);
        var1.method1132((byte) 29, class322.field5029);
        var1.method1132((byte) 29, class55.field925 ? 1 : 0);
        var1.method1132((byte) 29, class139.field2170 ? 1 : 0);
        var1.method1132((byte) 29, class331.field5144);
        if (arg0) {
            return (class166) null;
        } else {
            var1.method1132((byte) 29, class34.field512 ? 1 : 0);
            var1.method1132((byte) 29, class210.field3208 ? 1 : 0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I", line = 145)
    public final int[][] method249(int arg0, byte arg1) {
        field1531++;
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int var4 = class75.field1213 / this.field1529;
            int var5 = class105.field1630 / this.field1522;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method2328(class75.field1213 * var6 / var4, false, 0);
            } else {
                var7 = this.method2328(0, false, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var3[0];
            int[] var11 = var7[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class105.field1630; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class105.field1630 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var10[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var11[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILkh;I)V", line = 221)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1522 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field1529 = arg1.method1178(0);
        }
        field1523++;
        if (arg2 <= 51) {
            this.field1529 = -83;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 252)
    public class95() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[I", line = 264)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            method713(false);
        }
        field1526++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = class105.field1630 / this.field1522;
            int var5 = class75.field1213 / this.field1529;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2330(0, true, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2330(class75.field1213 * var7 / var5, true, 0);
            }
            for (int var8 = 0; var8 < class105.field1630; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class105.field1630 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
