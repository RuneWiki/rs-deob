import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class233 {

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Z")
    private boolean field2771;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
    private boolean field2769;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "Llja;")
    public static class744 field2775 = new class744(69, -1);

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2779 = -1;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Lmo;")
    public static class780 field2780 = new class780();

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[[I")
    public static int[][] field2781;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIILha;II)V")
    public static final void method1431(int arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5) {
        field2776++;
        arg3.method556(arg2, arg0, arg2 + arg4, arg0 - -arg5);
        arg3.method600(arg2, arg0, 785580130, -16777216, arg5, arg4);
        if (class121.field1557 < 100) {
            return;
        }
        float var6 = (float) class9.field179 / (float) class9.field166;
        int var7 = arg4;
        int var8 = arg5;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg4 - var7) / 2 + arg2;
        int var10 = (arg5 - var8) / 2 + arg0;
        if (arg1 >= -30) {
            method1435(-33);
        }
        if (class188.field2271 == null || arg4 != class188.field2271.method1640() || class188.field2271.method1637() != arg5) {
            class9.method151(class9.field176, class9.field179 + class9.field178, class9.field176 - -class9.field166, class9.field178, var9, var10, var7 + var9, var8 + var10);
            class9.method165(arg3);
            class188.field2271 = arg3.method644(var9, var10, var7, var8, false);
        }
        class188.field2271.method1838(var9, var10);
        int var11 = class47.field627 * var7 / class9.field166;
        int var12 = class336.field4157 * var8 / class9.field179;
        int var13 = class566.field7800 * var7 / class9.field166 + var9;
        int var14 = var8 + var10 - class487.field6807 * var8 / class9.field179 - var12;
        int var15 = -1996554240;
        if (class672.field9229 == class421.field5604) {
            var15 = -1996488705;
        }
        arg3.method645(var13, var14, var11, var12, var15, 1);
        arg3.method633(var13, var14, var11, var12, var15, 0);
        if (class446.field5988 <= 0) {
            return;
        }
        int var16;
        if (class720.field10105 > 50) {
            var16 = 500 - (class720.field10105 * 5);
        } else {
            var16 = class720.field10105 * 5;
        }
        for (class625 var17 = (class625) class9.field156.method2725(37); var17 != null; var17 = (class625) class9.field156.method2726(-127)) {
            class305 var18 = class9.field143.method4140(36, var17.field8567);
            if (class635.method3579(var18, 1)) {
                if (class587.field7997 == var17.field8567) {
                    int var21 = var9 + (var17.field8574 * var7 / class9.field166);
                    int var22 = (class9.field179 - var17.field8572) * var8 / class9.field179 + var10;
                    arg3.method600(var21 - 2, var22 + -2, 785580130, var16 << 24 | 0xFFFF00, 4, 4);
                } else if (class137.field1713 != -1 && class137.field1713 == var18.field3657) {
                    int var19 = var17.field8574 * var7 / class9.field166 + var9;
                    int var20 = (class9.field179 - var17.field8572) * var8 / class9.field179 + var10;
                    arg3.method600(var19 - 2, var20 + -2, 785580130, var16 << 24 | 0xFFFF00, 4, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)Z")
    public final boolean method1432(int arg0) {
        if (arg0 == 2) {
            field2767++;
            return this.field2769;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public final int method1433(int arg0) {
        field2768++;
        if (arg0 != -20366) {
            field2780 = null;
        }
        return this.field2774;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public static void method1434(int arg0) {
        field2781 = null;
        if (arg0 != 256) {
            method1436(102, (byte) -102, -44, 1);
        }
        field2780 = null;
        field2775 = null;
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
    public static final void method1435(int arg0) {
        field2770++;
        if (class612.field8225 != null) {
            try {
                class612.field8225.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 != 4) {
            field2781 = null;
        }
        class612.field8225 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBII)Lkg;")
    public static final class287 method1436(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 71) {
            return null;
        }
        field2772++;
        class727 var4 = class107.field1351[arg0][arg2][arg3];
        if (var4 == null) {
            return null;
        }
        class287 var5 = null;
        int var6 = -1;
        for (class10 var7 = var4.field10174; var7 != null; var7 = var7.field186) {
            class712 var8 = var7.field187;
            if (var8 instanceof class287) {
                class287 var9 = (class287) var8;
                int var10 = (var9.method1665(1720746760) * 256 + 252) - 256;
                int var11 = var9.field823 - var10 >> 9;
                int var12 = var9.field813 - var10 >> 9;
                int var13 = var9.field823 + var10 >> 9;
                int var14 = var9.field813 + var10 >> 9;
                if (arg2 >= var11 && var12 <= arg3 && arg2 <= var13 && var14 >= arg3) {
                    int var15 = (var14 + 1 - arg3) * (var13 + 1 - arg2);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Z")
    public final boolean method1437(int arg0) {
        field2773++;
        return arg0 > -58 ? false : this.field2771;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
    public final int method1438(boolean arg0) {
        if (arg0) {
            this.method1433(65);
        }
        field2777++;
        return this.field2778;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ZIIZ)V")
    public class233(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field2774 = arg2;
        this.field2771 = arg0;
        this.field2778 = arg1;
        this.field2769 = arg3;
    }
}
