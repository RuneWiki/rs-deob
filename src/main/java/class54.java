import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class54 extends class302 {

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field681 = 0;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "S")
    public static short field678 = 320;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lfj;")
    public static class290 field673;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Color;BZILjava/lang/String;)V", line = 7)
    public static final void method354(Color arg0, byte arg1, boolean arg2, int arg3, String arg4) {
        try {
            Graphics var5 = class315.field4764.getGraphics();
            if (class234.field3523 == null) {
                class234.field3523 = new Font("Helvetica", 1, 13);
                class172.field2579 = class315.field4764.getFontMetrics(class234.field3523);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class136.field2071, class251.field3747);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                int var6 = -17 / ((arg1 + 27) / 50);
                if (class91.field1364 == null) {
                    class91.field1364 = class315.field4764.createImage(304, 34);
                }
                Graphics var7 = class91.field1364.getGraphics();
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect((arg3 * 3) + 2, 2, 300 - (arg3 * 3), 30);
                var7.setFont(class234.field3523);
                var7.setColor(Color.white);
                var7.drawString(arg4, (304 - class172.field2579.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class91.field1364, class136.field2071 / 2 - 152, class251.field3747 / 2 + -18, (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = class136.field2071 / 2 - 152;
                int var10 = class251.field3747 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(var9 - (-(arg3 * 3) - 2), var10 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class234.field3523);
                var5.setColor(Color.white);
                var5.drawString(arg4, var9 + ((304 - class172.field2579.stringWidth(arg4)) / 2), var10 + 22);
            }
            if (class145.field2200 != null) {
                var5.setFont(class234.field3523);
                var5.setColor(Color.white);
                var5.drawString(class145.field2200, class136.field2071 / 2 - class172.field2579.stringWidth(class145.field2200) / 2, class251.field3747 / 2 - 26);
            }
        } catch (Exception var13) {
            class315.field4764.repaint();
        }
        field679++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIBII)V", line = 76)
    public static final void method355(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = 115 / ((-arg3 - 29) / 45);
        if (arg4 >= class157.field2357 && arg5 <= class184.field2761 && arg2 >= class185.field2769 && class166.field2494 >= arg1) {
            class204.method1398(arg5, arg1, arg0, arg4, arg2, 96);
        } else {
            class22.method144(arg0, arg5, arg4, arg1, 5, arg2);
        }
        field676++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V", line = 93)
    public static final void method356(int arg0, int arg1) {
        class169 var2 = class101.method712(arg0, arg1, 2089666400);
        field677++;
        var2.method1178((byte) 3);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 105)
    public static void method357(byte arg0) {
        field673 = null;
        int var1 = -73 % ((-arg0 - 17) / 50);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)I", line = 118)
    public static final int method358(int arg0, int arg1) {
        field683++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 != 320) {
            method354((Color) null, (byte) 122, true, -122, (String) null);
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Llm;ILlm;)V", line = 173)
    public static final void method359(class210 arg0, int arg1, class210 arg2) {
        field674++;
        class94.field1425 = arg2;
        class252.field3763 = arg0;
        if (arg1 != 1) {
            method360(-31);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 201)
    public static final void method360(int arg0) {
        class218 var1 = (class218) class164.field2468.method1109(55);
        if (arg0 >= 0) {
            method358(7, -11);
        }
        while (var1 != null) {
            if (var1.field3324 > 0) {
                var1.field3324--;
            }
            if (var1.field3324 != 0) {
                if (var1.field3316 > 0) {
                    var1.field3316--;
                }
                if (var1.field3316 == 0 && var1.field3331 >= 1 && var1.field3330 >= 1 && var1.field3331 <= 102 && var1.field3330 <= 102 && (var1.field3323 < 0 || class114.method786(var1.field3322, var1.field3323, false))) {
                    class310.method2148(var1.field3320, var1.field3322, var1.field3323, var1.field3331, var1.field3327, 0, var1.field3318, var1.field3330);
                    var1.field3316 = -1;
                    if (var1.field3323 == var1.field3315 && var1.field3315 == -1) {
                        var1.method714(-66);
                    } else if (var1.field3323 == var1.field3315 && var1.field3329 == var1.field3327 && var1.field3326 == var1.field3322) {
                        var1.method714(106);
                    }
                }
            } else if (var1.field3315 < 0 || class114.method786(var1.field3326, var1.field3315, false)) {
                class310.method2148(var1.field3320, var1.field3326, var1.field3315, var1.field3331, var1.field3329, 0, var1.field3318, var1.field3330);
                var1.method714(-107);
            }
            var1 = (class218) class164.field2468.method1115((byte) 109);
        }
        field672++;
    }
}
