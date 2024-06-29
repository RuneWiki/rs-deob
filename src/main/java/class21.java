import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 extends class507 {

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[[B")
    public static byte[][] field197 = new byte[250][];

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[F")
    public static float[] field198 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Loq;")
    public class242 field201;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Ljava/lang/String;")
    public String field186;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[I")
    public int[] field190;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "[I")
    public int[] field203;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[Lqh;")
    public class50[] field199;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field193;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)V")
    public static final void method116(int arg0, int arg1, byte arg2, int arg3) {
        field189++;
        if (arg2 != -16) {
            field197 = null;
        }
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class74.method431(false, arg2 - 94, var4, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V")
    public static final void method117(Color arg0, boolean arg1, Color arg2, boolean arg3, String arg4, int arg5, Color arg6) {
        try {
            Graphics var7 = class60.field701.getGraphics();
            if (class64.field738 == null) {
                class64.field738 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class372.field5051, class430.field6244);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (arg1) {
                    return;
                }
                if (class516.field7506 == null) {
                    class516.field7506 = class60.field701.createImage(304, 34);
                }
                Graphics var8 = class516.field7506.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class64.field738);
                var8.setColor(arg2);
                var8.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
                var7.drawImage(class516.field7506, class372.field5051 / 2 - 152, class430.field6244 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class372.field5051 / 2 - 152;
                int var10 = class430.field6244 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class64.field738);
                var7.setColor(arg2);
                var7.drawString(arg4, (304 - (arg4.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class95.field1147 != null) {
                var7.setFont(class64.field738);
                var7.setColor(arg2);
                var7.drawString(class95.field1147, class372.field5051 / 2 - (class95.field1147.length() * 6 / 2), class430.field6244 / 2 + -26);
            }
        } catch (Exception var12) {
            class60.field701.repaint();
        }
        field194++;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public static void method118(boolean arg0) {
        if (!arg0) {
            field198 = null;
            field197 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIILas;II)Z")
    public static final boolean method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8, int arg9, int arg10) {
        field202++;
        int var11 = arg5;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class360.field4889[var13][var14] = 99;
        int var16 = arg7 - var14;
        class71.field913[var13][var14] = 0;
        byte var17 = 0;
        class476.field7051[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class490.field7182[var10001] = arg7;
        if (arg9 != -1) {
            return false;
        }
        int[][] var19 = arg8.field1421;
        while (var26 != var18) {
            var12 = class490.field7182[var18];
            var11 = class476.field7051[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg8.field1444;
            int var23 = var12 - arg8.field1440;
            if (arg1 == -4) {
                if (arg4 == var11 && arg10 == var12) {
                    class407.field5849 = var12;
                    class79.field966 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class415.method2541(var12, var11, 2, arg6, arg2, 2, arg4, true, arg10)) {
                    class79.field966 = var11;
                    class407.field5849 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg8.method645(var12, var11, arg10, 2, arg2, (byte) -40, 2, arg0, arg4, arg6)) {
                    class79.field966 = var11;
                    class407.field5849 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg8.method644(arg6, arg10, arg4, 2, var12, arg0, arg2, var11, 0)) {
                    class79.field966 = var11;
                    class407.field5849 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg8.method650(2, arg3, arg9 - 10855, arg4, arg1, var12, arg10, var11)) {
                    class79.field966 = var11;
                    class407.field5849 = var12;
                    return true;
                }
            } else if (arg8.method651(arg1, var12, 2, arg4, arg10, arg3, 25507, var11)) {
                class79.field966 = var11;
                class407.field5849 = var12;
                return true;
            }
            int var25 = class71.field913[var20][var21] + 1;
            if (var20 > 0 && class360.field4889[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 - 1][var21] = 2;
                class71.field913[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class360.field4889[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 + 1][var21] = 8;
                class71.field913[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class360.field4889[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class476.field7051[var26] = var11;
                class490.field7182[var26] = var12 - 1;
                class360.field4889[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class360.field4889[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class476.field7051[var26] = var11;
                class490.field7182[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20][var21 + 1] = 4;
                class71.field913[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class360.field4889[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 - 1][var21 - 1] = 3;
                class71.field913[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class360.field4889[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12 - 1;
                class360.field4889[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class360.field4889[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12 + 1;
                class360.field4889[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class360.field4889[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 + 1][var21 + 1] = 12;
                class71.field913[var20 + 1][var21 + 1] = var25;
            }
        }
        class79.field966 = var11;
        class407.field5849 = var12;
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        field188++;
        if (class119.field1559 != null) {
            return;
        }
        int var1 = class470.field6965;
        int var2 = class325.field4330;
        int var3 = class155.field2037 - var1 - class372.field5051;
        if (arg0 != -103) {
            method121(59, (byte) 116, 92);
        }
        int var4 = class461.field6876 - var2 - class430.field6244;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class173.field2224 == null) {
                var5 = class381.field5518.field1828;
            } else {
                var5 = class173.field2224;
            }
            int var6 = 0;
            int var7 = 0;
            if (class173.field2224 == var5) {
                Insets var8 = class173.field2224.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class461.field6876);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class155.field2037, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class155.field2037 + var6 - var3, var7, var3, class461.field6876);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class461.field6876 + var7 - var4, class155.field2037, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
    public static final void method121(int arg0, byte arg1, int arg2) {
        field187++;
        class184 var3 = class277.method1682(arg0, 1, -110);
        var3.method1069(true);
        var3.field2393 = arg2;
        int var4 = -70 / ((arg1 - 35) / 40);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3) {
        field196++;
        int var4 = class319.field4256.field4655 * arg2 >> 8;
        if (arg1 != var4 && arg3 != -1) {
            class525.method3124(false, 1, arg3, 0, class154.field2017, var4);
            class401.field5809 = true;
        }
    }
}
