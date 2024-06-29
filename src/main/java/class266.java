import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class266 extends class145 {

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
    private boolean field3570 = true;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field3575 = 4096;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3571 = -1;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "[I")
    public static int[] field3574 = new int[128];

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3578 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3573 = null;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field3577 = -2;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "[B")
    public static byte[] field3576 = new byte[520];

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Lrk;")
    public static class427 field3568;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lrk;")
    public static class427 field3581;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method1709(int arg0, int arg1, int arg2, int arg3) {
        ++field3582;
        if (arg1 != -6179) {
            method1710(false);
        }
        if (~(8 & class7.field57[arg0][arg2][arg3]) != -1) {
            return 0;
        } else {
            return arg0 > 0 && ~(class7.field57[1][arg2][arg3] & 2) != -1 ? arg0 + -1 : arg0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V", line = 29)
    public static void method1710(boolean arg0) {
        field3573 = null;
        field3576 = null;
        if (arg0) {
            method1710(false);
        }
        field3581 = null;
        field3574 = null;
        field3568 = null;
        field3578 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 303)
    public class266() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lap;BI)V", line = 58)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field3572;
        int var4 = -25 % ((11 - arg1) / 52);
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field3570 = arg0.method1861((byte) -72) == 1;
            }
        } else {
            this.field3575 = arg0.method1853(-64);
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V", line = 93)
    public static final void method1711(byte arg0) {
        ++field3579;
        if (arg0 != -54) {
            method1710(false);
        }
        int var1 = class276.field3714.length;
        for (int var2 = 0; var1 > var2; ++var2) {
            if (class276.field3714[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; class396.field5545 > var4; ++var4) {
                    if (class131.field1873[var4] == class101.field1500[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class131.field1873[class396.field5545] = class101.field1500[var2];
                    var3 = class396.field5545++;
                }
                class289 var5 = new class289(class276.field3714[var2]);
                int var6 = 0;
                while (~class276.field3714[var2].length < ~var5.field3938 && ~var6 > -512 && ~class221.field3055 > -1024) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1853(-118);
                    int var9 = var8 >> 14;
                    int var10 = (8068 & var8) >> 7;
                    int var11 = var8 & 63;
                    int var12 = (class101.field1500[var2] >> 8) * 64 + -class283.field3794 + var10;
                    int var13 = (255 & class101.field1500[var2]) * 64 - class296.field3988 + var11;
                    class15 var14 = class330.method2102(var5.method1853(124), -113);
                    if (class298.field4012[var7] == null && (1 & var14.field129) > 0 && class329.field4471 == var9 && ~var12 <= -1 && ~class116.field1621 < ~(var14.field133 + var12) && ~var13 <= -1 && var14.field133 + var13 < class385.field5425) {
                        class298.field4012[var7] = new class127();
                        class298.field4012[var7].field4957 = var7;
                        class127 var15 = class298.field4012[var7];
                        class209.field2891[class221.field3055++] = var7;
                        var15.field4937 = class414.field5793;
                        var15.method993(var14, 128);
                        var15.method2282((byte) 101, var15.field1784.field133);
                        var15.field4953 = var15.field1784.field115 << 3;
                        if (~var15.field4953 == -1) {
                            var15.method2274((byte) -93, 0);
                        } else {
                            var15.method2274((byte) -65, class88.field1309[var15.field1784.field162 + -1]);
                        }
                        var15.method2272(true, 30867, var15.method2146(arg0 ^ -36), var12, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)[[I", line = 186)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field3580;
        if (!arg0) {
            method1709(-74, 72, -38, -52);
        }
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[] var4 = this.method1119(0, 0, arg1 + -1 & class402.field5610);
            int[] var5 = this.method1119(0, 0, arg1);
            int[] var6 = this.method1119(0, 0, class402.field5610 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class156.field2364 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3575;
                int var12 = (var5[var10 - -1 & class40.field606] + -var5[class40.field606 & var10 + -1]) * this.field3575;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                }
                if (this.field3570) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V", line = 267)
    public static final void method1712(boolean arg0) {
        ++field3569;
        if (!arg0) {
            method1712(false);
        }
        if (class76.field1136 != null) {
            class76.field1136.method1558(0);
        }
        if (class365.field5037 != null) {
            class365.field5037.method1558(0);
        }
        class124.method971(2, -124, class177.field2610, 22050);
        class76.field1136 = class121.method954(0, (byte) -102, class418.field5867, class30.field502, 22050);
        class76.field1136.method1562(class105.field1550, -1);
        class365.field5037 = class121.method954(1, (byte) -93, class418.field5867, class30.field502, 2048);
        class365.field5037.method1562(class315.field4277, -1);
    }
}
