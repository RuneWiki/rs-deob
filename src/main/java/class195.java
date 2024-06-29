import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class195 extends class263 {

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    private int field2868 = 32768;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "Laa;")
    public static class76 field2876;

    @OriginalMember(owner = "client!js", name = "P", descriptor = "Lfs;")
    public static class288 field2877;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!js", name = "L", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB)B")
    public static final byte method1288(int arg0, int arg1, byte arg2) {
        int var3 = 125 / ((arg2 - 26) / 38);
        ++field2870;
        if (~arg1 != -10) {
            return 0;
        } else {
            return (byte) ((1 & arg0) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V")
    public static final void method1289(boolean arg0) {
        ++field2867;
        class191.method1270(0);
        class436.method2565(-86);
        if (arg0) {
            method1288(50, 98, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILgo;IB)V")
    public static final void method1290(int arg0, class310 arg1, int arg2, byte arg3) {
        ++field2875;
        if (arg3 <= -8) {
            if (arg1 != null) {
                if (arg1.field4725 != null) {
                    class120 var4 = new class120();
                    var4.field1832 = arg1.field4725;
                    var4.field1833 = arg1;
                    class64.method449(var4);
                }
                class112.field1718 = arg1.field4729;
                class179.field2655 = arg1.field4675;
                class242.field3379 = arg2;
                class98.field1510 = arg1.field4792;
                class532.field7837 = arg1.field4665;
                class20.field303 = arg0;
                class302.field4504 = true;
                class327.field5118 = arg1.field4643;
                class292.method1812(-14307, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field2872;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (arg1 >= -45) {
            return null;
        } else {
            if (super.field3912.field6681) {
                int[] var4 = this.method1644(0, 1, arg0);
                int[] var5 = this.method1644(0, 2, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; class367.field5597 > var9; ++var9) {
                    int var10 = (1046561 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field2868 >> 12;
                    int var12 = class14.field188[var10] * var11 >> 12;
                    int var13 = class498.field7386[var10] * var11 >> 12;
                    int var14 = class83.field1326 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg0 & class142.field2133;
                    int[][] var16 = this.method1646(0, 2, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        class200.method1326(85);
        ++field2869;
        if (arg0 != 110) {
            method1288(74, 104, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V")
    public static final void method1291(int arg0, int arg1, int arg2, int arg3) {
        ++field2871;
        if (arg0 == -2) {
            class43.field559.method2717(arg3, 496598568);
            class43.field559.method2773((byte) 125, arg2);
            class43.field559.method2742((byte) -83, arg1);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field2873;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field3927 = ~arg2.method2765(71) == -2;
            }
        } else {
            this.field2868 = arg2.method2727((byte) 43) << 4;
        }
        if (!arg1) {
            field2876 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public static void method1292(int arg0) {
        if (arg0 != 3) {
            field2877 = null;
        }
        field2876 = null;
        field2877 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field2874;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 1, arg0);
            int[] var5 = this.method1644(0, 2, arg0);
            for (int var6 = 0; var6 < class367.field5597; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field2868 >> 12;
                int var9 = class14.field188[var7] * var8 >> 12;
                int var10 = class498.field7386[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class83.field1326;
                int var12 = arg0 - -(var10 >> 12) & class142.field2133;
                int[] var13 = this.method1644(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        if (arg1 < 40) {
            field2877 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class195() {
        super(3, false);
    }

    static {
        new class456("", 76);
        field2876 = new class76(20, 3);
        field2877 = new class288(128);
    }
}
