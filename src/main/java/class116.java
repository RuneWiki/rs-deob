import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class116 extends class306 {

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "Z")
    private boolean field1611 = true;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "Z")
    private boolean field1606 = true;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
    public static int[] field1608 = new int[14];

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "[I")
    public static int[] field1612 = new int[100];

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "F")
    public static float field1609;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lwd;")
    public static class93 field1615;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[Lje;")
    public static class84[] field1614;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 7)
    public static void method752(int arg0) {
        field1608 = null;
        field1615 = null;
        field1614 = null;
        if (arg0 == -20262) {
            field1612 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 317)
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lrj;I)[Lje;", line = 37)
    public static final class84[] method753(class22 arg0, int arg1) {
        field1610++;
        if (!arg0.method170(0)) {
            return new class84[0];
        }
        class153 var2 = arg0.method157(-128);
        while (var2.field2419 == 0) {
            class19.method140(10L, 16711680);
        }
        if (var2.field2419 == 2) {
            return new class84[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2421);
        class84[] var4 = new class84[var3.length >> 2];
        if (arg1 != 1344872514) {
            field1609 = -0.14541101F;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class84 var6 = new class84();
            var4[var5] = var6;
            var6.field1100 = var3[var5 << 2];
            var6.field1095 = var3[(var5 << 2) + 1];
            var6.field1091 = var3[(var5 << 2) + 2];
            var6.field1097 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I", line = 83)
    public final int[] method47(int arg0, int arg1) {
        field1613++;
        int[] var3 = this.field4757.method903(arg0, -68);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(this.field1611 ? class56.field663 - arg0 : arg0, (byte) 126, 0);
            if (this.field1606) {
                for (int var5 = 0; var5 < class31.field367; var5++) {
                    var3[var5] = var4[class311.field4878 - var5];
                }
            } else {
                class8.method55(var4, 0, var3, 0, class31.field367);
            }
        }
        return arg1 == -1546337535 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[[I", line = 117)
    public final int[][] method681(int arg0, byte arg1) {
        field1605++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 117, this.field1611 ? class56.field663 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[1];
            if (this.field1606) {
                for (int var11 = 0; var11 < class31.field367; var11++) {
                    var7[var11] = var5[class311.field4878 - var11];
                    var9[var11] = var10[class311.field4878 - var11];
                    var8[var11] = var6[class311.field4878 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class31.field367; var12++) {
                    var7[var12] = var5[var12];
                    var9[var12] = var10[var12];
                    var8[var12] = var6[var12];
                }
            }
        }
        if (arg1 != -119) {
            this.method47(-78, 101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILlf;I)V", line = 188)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field1607++;
        if (arg0 != -15334) {
            this.method45(95, (class143) null, -88);
        }
        if (arg2 == 0) {
            this.field1606 = arg1.method1043(true) == 1;
        } else if (arg2 == 1) {
            this.field1611 = arg1.method1043(true) == 1;
        } else if (arg2 == 2) {
            this.field4759 = arg1.method1043(true) == 1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lia;IIIIIIII)V", line = 238)
    public static final void method754(class234 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1616++;
        int var9 = arg6 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg0.field3590;
            var11 = arg0.field3577;
        } else {
            var10 = arg0.field3577;
            var11 = arg0.field3590;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14 = (arg4 << 7) + (var11 << 6);
        if (arg7 > -4) {
            field1608 = (int[]) null;
        }
        int var15 = 0;
        int[][] var16 = class72.field902[arg5];
        int var17 = (arg1 << 7) + (var10 << 6);
        int var18;
        int var19;
        if (arg4 + var11 <= 104) {
            var18 = arg4 + (var11 >> 1);
            var19 = arg4 + (var11 + 1 >> 1);
        } else {
            var19 = arg4 + 1;
            var18 = arg4;
        }
        int var20 = var16[var12][var19] + var16[var13][var19] + var16[var12][var18] + var16[var13][var18] >> 2;
        if (arg5 != 0) {
            int[][] var21 = class72.field902[0];
            var15 = var20 - (var21[var12][var19] + var21[var13][var18] + var21[var13][var19] + var21[var12][var18] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class72.field902[arg5 + 1];
        }
        class19 var23 = arg0.method1622((byte) -108, false, arg8, arg6, (class270) null, true, var14, var16, var20, var17, var22);
        class358.method2463(var23.field227, var17 - arg3, var15, var14 - arg2);
    }
}
