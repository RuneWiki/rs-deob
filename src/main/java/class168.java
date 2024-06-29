import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class168 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
    public static boolean field2445 = false;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lpg;")
    public static class492 field2438 = new class492(31, 3);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
    public static int[] field2446 = new int[50];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1181(int arg0) {
        if (arg0 != -5909) {
            method1181(-6);
        }
        field2446 = null;
        field2438 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIII)V", line = 24)
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2440++;
        if (arg1 == arg6 && arg0 == arg5 && arg3 == arg7 && arg2 == arg8) {
            class268.method1713(arg4, arg6, arg5, arg8, 5090, arg7);
        } else {
            int var10 = arg6;
            int var11 = arg5;
            int var12 = arg6 * 3;
            int var13 = arg5 * 3;
            int var14 = arg1 * 3;
            int var15 = arg0 * 3;
            int var16 = arg3 * 3;
            int var17 = arg2 * 3;
            int var18 = arg7 + var14 - arg6 - var16;
            int var19 = var15 + arg8 - var17 - arg5;
            int var20 = var16 - var14 - (-var12 + var14);
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = arg5 + (var30 + var32 + var28 >> 12);
                class268.method1713(arg4, var10, var11, var34, 5090, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg9 != 264031916) {
            method1182(-97, -124, -18, 99, -122, -104, -63, -88, 20, -31);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 99)
    public static final void method1183(byte arg0) {
        field2436++;
        if (class260.field3628 != null) {
            return;
        }
        int var1 = class272.field3781;
        int var2 = class341.field5383;
        int var3 = class503.field7496 - class7.field112 - var1;
        int var4 = 51 / (arg0 / 57);
        int var5 = class529.field7811 - var2 - class486.field7136;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class452.field6646 == null) {
                var6 = class419.field6254.field6861;
            } else {
                var6 = class452.field6646;
            }
            int var7 = 0;
            int var8 = 0;
            if (class452.field6646 == var6) {
                Insets var9 = class452.field6646.getInsets();
                var8 = var9.top;
                var7 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class529.field7811);
            }
            if (var2 > 0) {
                var10.fillRect(var7, var8, class503.field7496, var2);
            }
            if (var3 > 0) {
                var10.fillRect(class503.field7496 + var7 - var3, var8, var3, class529.field7811);
            }
            if (var5 > 0) {
                var10.fillRect(var7, var8 - (var5 - class529.field7811), class503.field7496, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }
}
