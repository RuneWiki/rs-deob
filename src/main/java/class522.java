import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class522 extends class667 {

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "Lwc;")
    public static class66 field7394;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "[Lwea;")
    private class155[] field7392;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field7396;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (arg0) {
            field7394 = null;
        }
        if (super.field9357.field5178) {
            int var4 = class77.field1455;
            int var5 = class694.field9758;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field9357.method2309((byte) 122);
            this.method3094(19788, var6);
            for (int var8 = 0; ~class694.field9758 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class77.field1455; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class555.method3246(var15, 255) << 4;
                    var12[var14] = class555.method3246(var15 >> 4, 4080);
                    var11[var14] = class555.method3246(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[[I)V")
    private final void method3094(int arg0, int[][] arg1) {
        ++field7397;
        int var3 = class77.field1455;
        int var4 = class694.field9758;
        class77.method774(-107, arg1);
        class517.method3078(0, 0, 14, class77.field1453, class439.field6131);
        if (this.field7392 != null) {
            for (int var5 = 0; ~var5 > ~this.field7392.length; ++var5) {
                class155 var6 = this.field7392[var5];
                int var7 = var6.field2333;
                int var8 = var6.field2329;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method5(var4, -118, var3);
                    } else {
                        var6.method4(var3, false, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method3(var3, var4, (byte) -30);
                }
            }
        }
        if (arg0 != 19788) {
            field7394 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            if (~arg2 == -1) {
                this.field7392 = new class155[arg0.method273(255)];
                for (int var4 = 0; this.field7392.length > var4; ++var4) {
                    int var5 = arg0.method273(255);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (~var5 == -4) {
                                    this.field7392[var4] = class181.method1296(arg0, 18550);
                                }
                            } else {
                                this.field7392[var4] = class224.method1554(arg0, -23677);
                            }
                        } else {
                            this.field7392[var4] = class468.method2839(arg0, -1);
                        }
                    } else {
                        this.field7392[var4] = class273.method1800(-2, arg0);
                    }
                }
            } else if (arg2 == 1) {
                super.field9344 = arg0.method273(255) == 1;
            }
            ++field7395;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field7400;
        if (arg0 > -87) {
            return null;
        } else {
            int[] var3 = super.field9355.method1744(arg1, -2);
            if (super.field9355.field3728) {
                this.method3094(19788, super.field9355.method1746((byte) 118));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method3095(int arg0) {
        field7394 = null;
        int var1 = -124 % ((1 - arg0) / 59);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Leq;B)V")
    public static final void method3096(class209 arg0, byte arg1) {
        class299.field4155 = arg0.method1482(-1, "p11_full");
        ++field7398;
        if (arg1 > -44) {
            field7393 = -61;
        }
        class590.field8281 = arg0.method1482(-1, "p12_full");
        class515.field7339 = arg0.method1482(-1, "b12_full");
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class522() {
        super(0, true);
    }
}
