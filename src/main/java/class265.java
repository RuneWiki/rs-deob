import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class265 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
    public static boolean field3841 = false;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
    public static boolean field3845 = true;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[Lck;")
    public static class351[] field3846;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;)V")
    public static final void method1817(int arg0, int arg1, String arg2, Color arg3, Color arg4, boolean arg5, Color arg6) {
        try {
            Graphics var7 = class202.field2708.getGraphics();
            if (class366.field5296 == null) {
                class366.field5296 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class138.field1907, class92.field1294);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class398.field5925 == null) {
                    class398.field5925 = class202.field2708.createImage(304, 34);
                }
                Graphics var8 = class398.field5925.getGraphics();
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(2, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(arg0, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var8.setFont(class366.field5296);
                var8.setColor(arg4);
                var8.drawString(arg2, (304 - (arg2.length() * 6)) / 2, 22);
                var7.drawImage(class398.field5925, class138.field1907 / 2 - 152, class92.field1294 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class138.field1907 / 2 - 152;
                int var10 = class92.field1294 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg6);
                var7.fillRect(var9 + 2, var10 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(var9 + (arg1 * 3) + 2, var10 - -2, 300 - arg1 * 3, 30);
                var7.setFont(class366.field5296);
                var7.setColor(arg4);
                var7.drawString(arg2, var9 + ((304 - arg2.length() * 6) / 2), var10 + 22);
            }
            if (class73.field1047 != null) {
                var7.setFont(class366.field5296);
                var7.setColor(arg4);
                var7.drawString(class73.field1047, class138.field1907 / 2 - class73.field1047.length() * 6 / 2, class92.field1294 / 2 + -26);
            }
        } catch (Exception var12) {
            class202.field2708.repaint();
        }
        field3840++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIILba;I)Z")
    public static final boolean method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class270 arg9, int arg10) {
        field3843++;
        int var11 = arg7;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        if (arg8 != 303) {
            return false;
        }
        int var15 = arg7 - var13;
        class264.field3830[var13][var14] = 99;
        int var16 = arg4 - var14;
        class100.field1404[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class295.field4231[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class173.field2306[var10001] = arg4;
        int[][] var19 = arg9.field3914;
        while (var26 != var18) {
            var12 = class173.field2306[var18];
            var11 = class295.field4231[var18];
            int var20 = var11 - arg9.field3908;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var12 - arg9.field3915;
            if (arg3 == -4) {
                if (arg6 == var11 && arg10 == var12) {
                    class148.field2036 = var11;
                    class253.field3499 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class369.method2396(arg6, arg10, arg2, var11, 1, arg8 - 11257, 1, arg1, var12)) {
                    class253.field3499 = var12;
                    class148.field2036 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg9.method1842(1, arg2, arg0, arg10, arg8 + 13103, arg6, 1, var11, var12, arg1)) {
                    class148.field2036 = var11;
                    class253.field3499 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg9.method1856(arg0, 1, var11, var12, (byte) 57, arg1, arg6, arg10, arg2)) {
                    class148.field2036 = var11;
                    class253.field3499 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg9.method1859(arg10, arg3, false, arg5, 1, arg6, var11, var12)) {
                    class253.field3499 = var12;
                    class148.field2036 = var11;
                    return true;
                }
            } else if (arg9.method1848(var12, 1, arg5, arg10, var11, arg6, -13282, arg3)) {
                class253.field3499 = var12;
                class148.field2036 = var11;
                return true;
            }
            int var25 = class100.field1404[var21][var22] + 1;
            if (var21 > 0 && class264.field3830[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class295.field4231[var26] = var11 - 1;
                class173.field2306[var26] = var12;
                class264.field3830[var21 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class100.field1404[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class264.field3830[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class295.field4231[var26] = var11 + 1;
                class173.field2306[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class264.field3830[var21 + 1][var22] = 8;
                class100.field1404[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class264.field3830[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class295.field4231[var26] = var11;
                class173.field2306[var26] = var12 - 1;
                class264.field3830[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class100.field1404[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class264.field3830[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class295.field4231[var26] = var11;
                class173.field2306[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class264.field3830[var21][var22 + 1] = 4;
                class100.field1404[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class264.field3830[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class295.field4231[var26] = var11 - 1;
                class173.field2306[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class264.field3830[var21 - 1][var22 - 1] = 3;
                class100.field1404[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class264.field3830[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class295.field4231[var26] = var11 + 1;
                class173.field2306[var26] = var12 - 1;
                class264.field3830[var21 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class100.field1404[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class264.field3830[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class295.field4231[var26] = var11 - 1;
                class173.field2306[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class264.field3830[var21 - 1][var22 + 1] = 6;
                class100.field1404[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class264.field3830[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class295.field4231[var26] = var11 + 1;
                class173.field2306[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class264.field3830[var21 + 1][var22 + 1] = 12;
                class100.field1404[var21 + 1][var22 + 1] = var25;
            }
        }
        class253.field3499 = var12;
        class148.field2036 = var11;
        return false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1819(int arg0) {
        if (arg0 > -23) {
            method1817(-58, -7, (String) null, (Color) null, (Color) null, true, (Color) null);
        }
        field3846 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/awt/Frame;Lwd;)V")
    public static final void method1820(byte arg0, Frame arg1, class36 arg2) {
        field3844++;
        while (true) {
            class429 var3 = arg2.method246(arg1, (byte) -90);
            while (var3.field6308 == 0) {
                class144.method918(10L, true);
            }
            if (var3.field6308 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                if (arg0 > -123) {
                    field3845 = true;
                    return;
                }
                return;
            }
            class144.method918(100L, true);
        }
    }
}
