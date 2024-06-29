import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class31 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lwb;")
    private static class130 field866 = class26.method212("wishes to trade with you)3", -32376);

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lwb;")
    private static class130 field865 = class26.method212("Message", -32376);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lwb;")
    public static class130 field867 = field866;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Lwb;")
    private static class130 field873 = class26.method212("Login", -32376);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lwb;")
    public static class130 field861 = field873;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lwb;")
    public static class130 field872 = class26.method212("mapmarker", -32376);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lwb;")
    public static class130 field875 = field865;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field871 = new Object();

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
    public static int[] field878 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    public static int[] field877 = new int[5];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lmc;")
    public static class75 field864;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
    public static int[] field869;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
    public static int[] field876;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 12)
    public static void method247(int arg0) {
        field871 = null;
        field861 = null;
        field873 = null;
        field875 = null;
        field872 = null;
        if (arg0 > -51) {
            method247(5);
        }
        field864 = null;
        field865 = null;
        field867 = null;
        field877 = null;
        field878 = null;
        field876 = null;
        field866 = null;
        field869 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lab;", line = 50)
    public static final class3 method248(int arg0, int arg1) {
        field870++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & arg0;
        if (class105.field2549[var2] == null || class105.field2549[var2][var3] == null) {
            boolean var4 = class52.method446(var2, (byte) -104);
            if (!var4) {
                return null;
            }
        }
        return class105.field2549[var2][var3];
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V", line = 71)
    public static final void method249(int arg0, int arg1) {
        field863++;
        if (!class52.method446(arg1, (byte) -128)) {
            return;
        }
        class3[] var2 = class105.field2549[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class3 var4 = var2[var3];
            if (var4 != null) {
                var4.field135 = 0;
                var4.field126 = 0;
            }
        }
        if (arg0 < 45) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[Luc;I[BIIIIBLfc;I)V", line = 133)
    public static final void method250(int arg0, class121[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, class34 arg9, int arg10) {
        field868++;
        class36 var11 = new class36(arg3);
        int var12 = -1;
        if (arg8 >= -106) {
            return;
        }
        while (true) {
            int var13 = var11.method331(-127);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method331(81);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method365((byte) -125);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg4 == var18 && arg7 <= var17 && var17 < arg7 + 8 && arg5 <= var16 && var16 < arg5 + 8) {
                    class109 var22 = class32.method256(6, var12);
                    int var23 = class120.method919((byte) 60, arg0, var16 & 0x7, var20, var22.field2647, var17 & 0x7, var22.field2664) + arg6;
                    int var24 = arg10 + class98.method732(var22.field2664, arg0, var17 & 0x7, var16 & 0x7, var20, (byte) -113, var22.field2647);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class121 var25 = null;
                        int var26 = arg2;
                        if ((class56.field1435[1][var23][var24] & 0x2) == 2) {
                            var26 = arg2 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg1[var26];
                        }
                        class112.method858(var12, arg2, arg0 + var20 & 0x3, arg9, var23, var24, (byte) 59, var21, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIILwc;I)V", line = 220)
    public static final void method251(boolean arg0, int arg1, int arg2, class131 arg3, int arg4) {
        class32.field897.method181(14664);
        class106.field2569.method744(0, 0);
        arg3.method1006(class32.field898, 55, 28, 16777215, true);
        field862++;
        if (arg1 == 0) {
            arg3.method1006(class98.field2361, 55, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg3.method1006(class72.field1845, 55, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg3.method1006(class4.field160, 55, 41, 16711680, true);
        }
        if (arg1 == 3) {
            arg3.method1006(class40.field1127, 55, 41, 65535, true);
        }
        arg3.method1006(class6.field222, 184, 28, 16777215, true);
        if (arg4 == 0) {
            arg3.method1006(class98.field2361, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg3.method1006(class72.field1845, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg3.method1006(class4.field160, 184, 41, 16711680, true);
        }
        arg3.method1006(class75.field1885, 324, 28, 16777215, true);
        if (arg2 == 0) {
            arg3.method1006(class98.field2361, 324, 41, 65280, true);
        }
        if (arg0) {
            return;
        }
        if (arg2 == 1) {
            arg3.method1006(class72.field1845, 324, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method1006(class4.field160, 324, 41, 16711680, true);
        }
        arg3.method999(class59.field1509, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class84.field2003.getGraphics();
            class32.field897.method187(453, var5, -26826, 0);
        } catch (Exception var6) {
            class84.field2003.repaint();
        }
    }
}
