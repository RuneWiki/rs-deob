import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class121 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
    public static boolean field1978 = false;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1979 = "glow3:";

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 9)
    public static final void method968(String arg0, byte arg1, boolean arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        field1976++;
        int var5 = var3 + 6;
        int var6 = class107.field1756.method1489(arg0, 250);
        int var7 = 87 % ((arg1 + 1) / 35);
        int var8 = class107.field1756.method1470(arg0, 250) * 13;
        if (class162.field2623) {
            class114.method887(var4 - var3, var5 - var3, var3 + var6 + var3, var8 - (-var3 - var3), 0);
            class114.method897(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var8 - -var3, 16777215);
        } else {
            class33.method288(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var8 + var3, 0);
            class33.method293(var4 - var3, var5 - var3, var3 + var6 + var3, var8 - (-var3 - var3), 16777215);
        }
        class107.field1756.method1476(arg0, var4, var5, var6, var8, 16777215, -1, 1, 1, 0);
        class318.method2250(var3 + var6 + var3, -99, var3 - -var3 + var8, var4 - var3, -var3 + var5);
        if (!arg2) {
            class280.method1972(var4, var5, (byte) 107, var8, var6);
        } else if (class162.field2623) {
            class162.method1201();
        } else {
            try {
                Graphics var9 = class334.field5197.getGraphics();
                class101.field1666.method1290(-1, var9, 0, 0);
            } catch (Exception var11) {
                class334.field5197.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 64)
    public static void method969(int arg0) {
        if (arg0 >= -46) {
            field1979 = (String) null;
        }
        field1979 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V", line = 77)
    public static final void method970(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1974++;
        if (class182.field2882 == 0) {
            class20.field370.method1418(arg0, (byte) 127);
        } else {
            class164.field2663 = arg0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V", line = 106)
    public static final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        class323.method2273(arg4 - arg5, arg0, class221.field3443[arg3], arg4 + arg5, 90);
        field1975++;
        int var7 = arg5 * arg5;
        int var8 = arg1;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg1 << 1;
        int var13 = var9 - (var12 - arg2) * var11;
        int var14 = var7 << 2;
        int var15 = var9 << 2;
        int var16 = (1 - var12) * var7 + var10;
        int var17 = ((arg1 << 1) - 3) * var11;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg1 - 1) * var14;
        while (var8 > 0) {
            if (var16 < 0) {
                while (var16 < 0) {
                    var16 += var18;
                    var13 += var19;
                    var6++;
                    var18 += var15;
                    var19 += var15;
                }
            }
            var8--;
            int var21 = arg3 + var8;
            if (var13 < 0) {
                var13 += var19;
                var16 += var18;
                var19 += var15;
                var6++;
                var18 += var15;
            }
            int var22 = arg3 - var8;
            var16 += -var20;
            var13 += -var17;
            var17 -= var14;
            int var23 = arg4 - var6;
            int var24 = arg4 + var6;
            class323.method2273(var23, arg0, class221.field3443[var22], var24, 78);
            var20 -= var14;
            class323.method2273(var23, arg0, class221.field3443[var21], var24, arg2 ^ 0x65);
        }
    }
}
