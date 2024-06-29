import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class149 extends class123 {

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Z")
    public volatile boolean field2433 = true;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Z")
    public static boolean field2435 = true;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2437 = "Select";

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "Z")
    public boolean field2430;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Z")
    public boolean field2439;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[[Ltd;")
    public static class256[][] field2441;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)I", line = 6)
    public static final int method1126(int arg0, byte arg1) {
        field2438++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            if (arg1 != 18) {
                method1130(false, 12);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 24)
    public static void method1127(byte arg0) {
        field2437 = null;
        field2441 = (class256[][]) null;
        if (arg0 <= 107) {
            method1131((byte) 31, true, (Object) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1128(int arg0, int arg1) {
        field2436++;
        if (arg0 != -31323) {
            method1132(101, -97, 26, -123, -125, (class179) null, -51, 92L, false);
        }
        class170 var2 = class221.method1613(3, arg1, -8410);
        var2.method1267(arg0 ^ 0x7A26);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 51)
    public static final void method1129(String arg0, boolean arg1, byte arg2) {
        field2429++;
        if (arg2 < 56) {
            method1131((byte) -15, false, (Object) null);
        }
        if (!arg1) {
            try {
                class51.method419((byte) 89, class92.field1484.field1037, "loggedout");
            } catch (Throwable var8) {
            }
            try {
                class99.field1590.getAppletContext().showDocument(new URL(class99.field1590.getCodeBase(), arg0), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class162.field2623 && class253.field3719) {
            try {
                class51.method420(new Object[] { (new URL(class99.field1590.getCodeBase(), arg0)).toString() }, -10770, class92.field1484.field1037, "openjs");
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class99.field1590.getAppletContext().showDocument(new URL(class99.field1590.getCodeBase(), arg0), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V", line = 97)
    public static final void method1130(boolean arg0, int arg1) {
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        field2432++;
        class116.field1885 = 99;
        class258.field3829 = new int[var2][105][105];
        class55.field845 = new int[104];
        client.field4117 = new int[104];
        class201.field3096 = new byte[var2][104][104];
        class345.field5352 = new int[104];
        class174.field2799 = new int[104];
        class282.field4417 = new int[5];
        class260.field3875 = new byte[var2][104][104];
        class272.field4263 = new byte[var2][104][104];
        class307.field4870 = new int[104];
        int var3 = -21 / ((arg1 + 8) / 52);
        class253.field3745 = new byte[var2][105][105];
        class58.field872 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 149)
    public static final byte[] method1131(byte arg0, boolean arg1, Object arg2) {
        field2440++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != 115) {
            method1133((String) null, (byte) 20, true, 114, (Color) null);
        }
        if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg2);
            return arg1 ? class19.method204(true, var3) : var3;
        } else if (arg2 instanceof class311) {
            class311 var4 = (class311) arg2;
            return var4.method2198((byte) -24);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIILeh;IJZ)Z", line = 184)
    public static final boolean method1132(int arg0, int arg1, int arg2, int arg3, int arg4, class179 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class75.method596(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;BZILjava/awt/Color;)V", line = 223)
    public static final void method1133(String arg0, byte arg1, boolean arg2, int arg3, Color arg4) {
        field2434++;
        try {
            Graphics var5 = class334.field5197.getGraphics();
            if (class57.field859 == null) {
                class57.field859 = new Font("Helvetica", 1, 13);
                class115.field1871 = class334.field5197.getFontMetrics(class57.field859);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class211.field3314, class338.field5219);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class315.field4969 == null) {
                    class315.field4969 = class334.field5197.createImage(304, 34);
                }
                Graphics var6 = class315.field4969.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class57.field859);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class115.field1871.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class315.field4969, class211.field3314 / 2 - 152, class338.field5219 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class211.field3314 / 2 - 152;
                int var9 = class338.field5219 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg3 * 3) + 2, var9 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class57.field859);
                var5.setColor(Color.white);
                var5.drawString(arg0, (304 - class115.field1871.stringWidth(arg0)) / 2 + var8, var9 - -22);
            }
            if (arg1 < 37) {
                field2427 = -29;
            }
            if (class160.field2601 != null) {
                var5.setFont(class57.field859);
                var5.setColor(Color.white);
                var5.drawString(class160.field2601, class211.field3314 / 2 - class115.field1871.stringWidth(class160.field2601) / 2, class338.field5219 / 2 + -26);
            }
        } catch (Exception var12) {
            class334.field5197.repaint();
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
    public abstract int method615(byte arg0);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)[B")
    public abstract byte[] method612(int arg0);
}
