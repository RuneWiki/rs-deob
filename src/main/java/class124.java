import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class124 extends class424 {

    @OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
    private int field1870 = 4;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    private int field1868 = 4;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "Lhc;")
    public static class368 field1865 = new class368("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!hr", name = "R", descriptor = "Lhc;")
    public static class368 field1869 = new class368("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!hr", name = "W", descriptor = "[I")
    public static int[] field1874 = new int[1000];

    @OriginalMember(owner = "client!hr", name = "X", descriptor = "[I")
    public static int[] field1875 = new int[50];

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!hr", name = "T", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hr", name = "V", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!hr", name = "Y", descriptor = "[[I")
    public static int[][] field1876;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
    public static final void method947(int arg0) {
        class88.field1250 = null;
        class334.field4532 = null;
        class221.field3103 = null;
        class62.field836 = false;
        if (arg0 == 1) {
            class25.field320 = null;
            class359.field4975 = null;
            ++field1867;
            class136.method1018((byte) 96);
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V")
    public static void method948(byte arg0) {
        field1869 = null;
        int var1 = 6 / ((38 - arg0) / 36);
        field1874 = null;
        field1875 = null;
        field1876 = null;
        field1865 = null;
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)V")
    public static final void method949(int arg0) {
        ++field1864;
        if (arg0 != 7) {
            field1869 = null;
        }
        class113.field1742.method2522((byte) 19);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
    public static final void method950(boolean arg0) {
        class75.field1068.method1150(113);
        ++field1866;
        int var1 = class75.field1068.method1146((byte) -76, 1);
        if (~var1 != -1) {
            int var2 = class75.field1068.method1146((byte) -108, 2);
            if (var2 == 0) {
                class251.field3505[class418.field5783++] = 2047;
            } else {
                if (!arg0) {
                    field1869 = null;
                }
                if (~var2 == -2) {
                    int var3 = class75.field1068.method1146((byte) -83, 3);
                    class359.field4970.method2616(22271, var3, 1);
                    int var4 = class75.field1068.method1146((byte) -108, 1);
                    if (var4 == 1) {
                        class251.field3505[class418.field5783++] = 2047;
                    }
                } else if (~var2 == -3) {
                    if (class75.field1068.method1146((byte) -73, 1) != 1) {
                        int var5 = class75.field1068.method1146((byte) -86, 3);
                        class359.field4970.method2616(22271, var5, 0);
                    } else {
                        int var6 = class75.field1068.method1146((byte) -90, 3);
                        class359.field4970.method2616(22271, var6, 2);
                        int var7 = class75.field1068.method1146((byte) -79, 3);
                        class359.field4970.method2616(22271, var7, 2);
                    }
                    int var8 = class75.field1068.method1146((byte) -91, 1);
                    if (var8 == 1) {
                        class251.field3505[class418.field5783++] = 2047;
                    }
                } else if (var2 == 3) {
                    int var9 = class75.field1068.method1146((byte) -124, 7);
                    int var10 = class75.field1068.method1146((byte) -91, 7);
                    int var11 = class75.field1068.method1146((byte) -123, 1);
                    if (~var11 == -2) {
                        class251.field3505[class418.field5783++] = 2047;
                    }
                    class343.field4623 = class75.field1068.method1146((byte) -91, 2);
                    int var12 = class75.field1068.method1146((byte) -109, 1);
                    class359.field4970.method2609(var12 == 1, var10, class343.field4623, var9, (byte) 102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field1872;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int var4 = class303.field4135 / this.field1868;
            int var5 = class423.field5866 / this.field1870;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method2624(true, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2624(true, 0, class423.field5866 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class303.field4135 < ~var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class303.field4135 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            method947(-123);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1870 = arg0.method2306((byte) 76);
            }
        } else {
            this.field1868 = arg0.method2306((byte) 83);
        }
        ++field1863;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field1871;
        int[] var3 = super.field5892.method783(arg0, (byte) 108);
        if (super.field5892.field1427) {
            int var4 = class303.field4135 / this.field1868;
            int var5 = class423.field5866 / this.field1870;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2621(0, -122, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2621(0, -116, class423.field5866 * var7 / var5);
            }
            for (int var8 = 0; class303.field4135 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class303.field4135 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return arg1 != -10 ? null : var3;
    }
}
