import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class78 extends class508 {

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Lad;")
    public static class11 field994 = new class11(64);

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field999 = -1;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "[S")
    public static short[] field1001 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[I")
    public static int[] field998 = new int[2];

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "Loi;")
    public static class169 field1000 = new class169("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Lhb;")
    public static class250 field1002 = new class250(4, 3);

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field1003 = 1;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "[I")
    public int[] field996;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method448(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z")
    public static final boolean method449(int arg0, int arg1, int arg2) {
        field995++;
        int var3 = -93 % ((-arg1 - 17) / 49);
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)V")
    public static final void method450(byte arg0, int arg1) {
        field993++;
        if (!class495.method2961(arg1, 113)) {
            return;
        }
        class423[] var2 = class296.field3842[arg1];
        if (arg0 <= 85) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class423 var4 = var2[var3];
            if (var4 != null) {
                var4.field5807 = 1;
                var4.field5691 = 0;
                var4.field5667 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
    public static final void method451(byte arg0) {
        field988++;
        class109.field1514.method99(8);
        int var1 = class109.field1514.method100((byte) -99, 8);
        if (class16.field264 > var1) {
            for (int var2 = var1; var2 < class16.field264; var2++) {
                class208.field2706[class450.field6264++] = class414.field5507[var2];
            }
        }
        if (class16.field264 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class16.field264 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var5 = class414.field5507[var3];
            class295 var6 = class527.field7791[var5];
            int var7 = class109.field1514.method100((byte) 39, 1);
            if (var7 == 0) {
                class414.field5507[class16.field264++] = var5;
                var6.field5232 = class264.field3353;
            } else {
                int var8 = class109.field1514.method100((byte) -122, 2);
                if (var8 == 0) {
                    class414.field5507[class16.field264++] = var5;
                    var6.field5232 = class264.field3353;
                    class9.field96[class24.field428++] = var5;
                } else if (var8 == 1) {
                    class414.field5507[class16.field264++] = var5;
                    var6.field5232 = class264.field3353;
                    int var9 = class109.field1514.method100((byte) 109, 3);
                    var6.method1774(var9, 1, -2);
                    int var10 = class109.field1514.method100((byte) 14, 1);
                    if (var10 == 1) {
                        class9.field96[class24.field428++] = var5;
                    }
                } else if (var8 == 2) {
                    class414.field5507[class16.field264++] = var5;
                    var6.field5232 = class264.field3353;
                    if (class109.field1514.method100((byte) -76, 1) == 1) {
                        int var11 = class109.field1514.method100((byte) 121, 3);
                        var6.method1774(var11, 2, -44);
                        int var12 = class109.field1514.method100((byte) -75, 3);
                        var6.method1774(var12, 2, 111);
                    } else {
                        int var13 = class109.field1514.method100((byte) 65, 3);
                        var6.method1774(var13, 0, -18);
                    }
                    int var14 = class109.field1514.method100((byte) -111, 1);
                    if (var14 == 1) {
                        class9.field96[class24.field428++] = var5;
                    }
                } else if (var8 == 3) {
                    class208.field2706[class450.field6264++] = var5;
                }
            }
        }
        int var4 = -116 / ((10 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method452(int arg0) {
        field994 = null;
        field1002 = null;
        field1001 = null;
        field998 = null;
        field1000 = null;
        int var1 = 5 % ((67 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method453(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method454(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field990++;
        if (arg1 != -30347) {
            return;
        }
        int var8 = arg2 + 1;
        class183.method1212(arg3, class333.field4265[arg2], true, arg5, arg0);
        int var9 = arg4 - 1;
        class183.method1212(arg3, class333.field4265[arg4], true, arg5, arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class333.field4265[var6];
            var7[arg5] = var7[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
    public static final void method456(int arg0, Object[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 <= 85) {
            return;
        }
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg3[var10] < var7 + (var10 & var9)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method456(89, arg1, var6 - 1, arg3, arg4);
            method456(120, arg1, arg2, arg3, var6 + 1);
        }
        field989++;
    }
}
