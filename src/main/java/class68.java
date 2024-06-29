import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class68 extends class117 {

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    private int field1152 = 4096;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Z")
    private boolean field1156 = true;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "Lhh;")
    public static class163 field1153 = class137.method1065("<col=ffffff>", 17);

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "[I")
    public static int[] field1150;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field1154;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -69);
        if (!arg1) {
            return null;
        } else {
            if (super.field2228.field3221) {
                int[] var4 = this.method932(arg0 + -1 & class258.field4520, false, 0);
                int[] var5 = this.method932(arg0, false, 0);
                int[] var6 = this.method932(class258.field4520 & arg0 + 1, false, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var3[1];
                for (int var10 = 0; class143.field2702 > var10; ++var10) {
                    int var11 = (var5[class54.field884 & var10 + 1] + -var5[class54.field884 & var10 + -1]) * this.field1152;
                    int var12 = (var6[var10] - var4[var10]) * this.field1152;
                    int var13 = var11 >> 12;
                    int var14 = var12 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var13 * var13 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = 16777216 / var17;
                        var19 = var12 / var17;
                        var20 = var11 / var17;
                    } else {
                        var20 = 0;
                        var19 = 0;
                        var18 = 0;
                    }
                    if (this.field1156) {
                        var18 = (var18 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                        var19 = 2048 - -(var19 >> 1);
                    }
                    var7[var10] = var20;
                    var9[var10] = var19;
                    var8[var10] = var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1153 = null;
        if (arg0 != 2048) {
            field1150 = null;
        }
        field1150 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLhh;B)V")
    public static final void method473(boolean arg0, class163 arg1, byte arg2) {
        if (arg2 != -99) {
            field1150 = null;
        }
        byte var3 = 4;
        int var4 = 6 - -var3;
        int var5 = var3 + 6;
        ++field1155;
        int var6 = class12.field192.method580(arg1, 250);
        int var7 = class12.field192.method587(arg1, 250) * 13;
        class206.method1483(-var3 + var5, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7, 0);
        class206.method1471(-var3 + var5, var4 - var3, var6 - -var3 + var3, var3 + var7 - -var3, 16777215);
        class12.field192.method576(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class89.method690(-var3 + var5, var7 - -var3 + var3, var3 + var6 - -var3, arg2 ^ -99, -var3 + var4);
        if (arg0) {
            try {
                Graphics var8 = class202.field3675.getGraphics();
                class128.field2496.method693(0, var8, 125, 0);
            } catch (Exception var9) {
                class202.field3675.repaint();
            }
        } else {
            class75.method550(var4, arg2 ^ -99, var6, var5, var7);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field1149;
        if (arg0 != 0) {
            this.method90(-109, false);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field1156 = arg2.method622(true) == 1;
            }
        } else {
            this.field1152 = arg2.method658(89);
        }
    }
}
