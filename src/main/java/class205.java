import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class205 extends class634 {

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    private int field2415 = 4096;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    private int field2419 = 4096;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    private int field2420 = 4096;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "[I")
    private int[] field2416 = new int[3];

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    private int field2417 = 409;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "Lpia;")
    public static class94 field2421 = new class94(81, 4);

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "Ldh;")
    public static class320 field2426 = new class320(113, 3);

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "[I")
    public static int[] field2428 = new int[8];

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "[Lcaa;")
    public static class302[] field2430 = new class302[4];

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "Lmo;")
    public static class746 field2427 = new class746();

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)V", line = 3)
    public static final void method1228(int arg0) {
        if (arg0 != 0) {
            method1229((byte) 30, 73, 105);
        }
        ++field2418;
        class430.field6248.method3541(arg0 ^ -647);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[[I", line = 14)
    public final int[][] method7(byte arg0, int arg1) {
        ++field2423;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = 4 / ((arg0 - -56) / 53);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class635.field9139 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field2416[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 > this.field2417) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field2416[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var16 > this.field2417) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field2416[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~this.field2417 > ~var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field2415 * var13 >> 12;
                            var10[var12] = this.field2420 * var15 >> 12;
                            var11[var12] = this.field2419 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILig;Z)V", line = 109)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method1458((byte) -104);
                            this.field2416[2] = class327.method1956(var5, 255) >> 12;
                            this.field2416[0] = class327.method1956(var5, 16711680) << 4;
                            this.field2416[1] = class327.method1956(var5, 65280) >> 4;
                        }
                    } else {
                        this.field2415 = arg1.method1476(-123);
                    }
                } else {
                    this.field2420 = arg1.method1476(25);
                }
            } else {
                this.field2419 = arg1.method1476(-92);
            }
        } else {
            this.field2417 = arg1.method1476(2);
        }
        ++field2425;
        if (arg2) {
            method1228(30);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 178)
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)Z", line = 183)
    public static final boolean method1229(byte arg0, int arg1, int arg2) {
        ++field2422;
        if (arg0 >= -2) {
            field2426 = null;
        }
        return ~(393216 & arg2) != -1 | class484.method2925(-12944, arg1, arg2) || class14.method68(arg2, arg1, 36161);
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V", line = 229)
    public static void method1230(byte arg0) {
        field2430 = null;
        if (arg0 != 127) {
            method1228(19);
        }
        field2428 = null;
        field2426 = null;
        field2427 = null;
        field2421 = null;
    }
}
