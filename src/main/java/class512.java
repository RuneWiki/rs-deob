import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class512 extends class328 {

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    private int field7089 = 4;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    private int field7090 = 4;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    public static int field7084 = -1;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "[F")
    public static float[] field7093 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "Lfa;")
    public static class482 field7091;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)I")
    public static final int method2868(int arg0) {
        ++field7085;
        if (class443.field6474 != null) {
            return 3;
        } else if (arg0 != 2) {
            return 38;
        } else {
            return class74.field1378 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field7083;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field7090 = arg2.method1738(255);
            }
        } else {
            this.field7089 = arg2.method1738(255);
        }
        if (arg0 <= 75) {
            this.method4(75, 98);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2869(int arg0, String arg1, boolean arg2) {
        class179.field2600.field8003 = 1;
        ++field7092;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        if (arg0 > -36) {
            method2870((byte) 73);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < class611.field8684.field3736; ++var6) {
            class381 var9 = class611.field8684.method1621((byte) -108, var6);
            if ((!arg2 || var9.field5609) && var9.field5596 == -1 && var9.field5631 == -1 && var9.field5665 == 0 && ~var9.field5658.toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 250) {
                    class66.field1114 = null;
                    class237.field3481 = -1;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class237.field3481 = var5;
        class66.field1114 = var4;
        class327.field4717 = 0;
        String[] var7 = new String[class237.field3481];
        for (int var8 = 0; class237.field3481 > var8; ++var8) {
            var7[var8] = class611.field8684.method1621((byte) -64, var4[var8]).field5658;
        }
        class70.method685(class66.field1114, var7, -1);
        class179.field2600.method3165(true);
        class179.field2600.field8003 = 2;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
    public class512() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int var3 = 63 / ((arg1 - 48) / 56);
        ++field7094;
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var5 = class449.field6539 / this.field7089;
            int var6 = class527.field7334 / this.field7090;
            int[] var7;
            if (~var6 >= -1) {
                var7 = this.method2042(0, 0, (byte) 119);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method2042(0, class527.field7334 * var8 / var6, (byte) 119);
            }
            for (int var9 = 0; class449.field6539 > var9; ++var9) {
                if (var5 <= 0) {
                    var4[var9] = var7[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var7[class449.field6539 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field7086;
        int var3 = 126 % ((arg1 - 46) / 54);
        int[][] var4 = super.field4725.method1886((byte) -111, arg0);
        if (super.field4725.field4371) {
            int var5 = class449.field6539 / this.field7089;
            int var6 = class527.field7334 / this.field7090;
            int[][] var7;
            if (var6 <= 0) {
                var7 = this.method2040(0, 0, 0);
            } else {
                int var8 = arg0 % var6;
                var7 = this.method2040(0, class527.field7334 * var8 / var6, 0);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~var15 > ~class449.field6539; ++var15) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class449.field6539 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)V")
    public static void method2870(byte arg0) {
        field7091 = null;
        if (arg0 == 107) {
            field7093 = null;
        }
    }
}
