import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class147 extends class82 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[B")
    public byte[] field2138;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
    public static boolean field2139 = true;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Ljf;")
    public static class65 field2144;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(JIIZI)Ljava/lang/String;")
    public static final String method892(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2143++;
        if (arg4 != -24421) {
            field2141 = -65;
        }
        char var6 = '.';
        boolean var7 = false;
        char var8 = ',';
        if (arg1 == 0) {
            var6 = ',';
            var8 = '.';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 < 0L) {
            arg0 = -arg0;
            var7 = true;
        }
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var8);
        }
        if (arg1 == 2) {
            var6 = ' ';
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (48 - (((int) arg0 * 10) - var13)));
            if (arg0 == 0L) {
                if (var7) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Z")
    public static final boolean method893(int arg0, byte arg1) {
        if (arg1 != 13) {
            method896(false, -48, (Color) null, true, (String) null);
        }
        field2145++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([B)V")
    public class147(byte[] arg0) {
        this.field2138 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lfg;Z)V")
    public static final void method894(class12 arg0, boolean arg1) {
        class222 var2 = null;
        try {
            class78 var3 = arg0.method59((byte) -33, "runescape");
            while (var3.field1249 == 0) {
                class250.method1643(1, 1L);
            }
            if (var3.field1249 == 1) {
                var2 = (class222) var3.field1250;
                class248 var4 = class62.method422(11);
                var2.method1425(0, (byte) -81, var4.field3723, var4.field3748);
            }
        } catch (Exception var6) {
        }
        field2146++;
        try {
            if (var2 != null) {
                var2.method1422(-1);
            }
            if (!arg1) {
                field2139 = false;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    public static void method895(int arg0) {
        field2144 = null;
        if (arg0 != 46) {
            field2140 = -96;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZILjava/awt/Color;ZLjava/lang/String;)V")
    public static final void method896(boolean arg0, int arg1, Color arg2, boolean arg3, String arg4) {
        field2147++;
        try {
            Graphics var5 = class47.field762.getGraphics();
            if (class115.field1751 == null) {
                class115.field1751 = new Font("Helvetica", 1, 13);
                class200.field3046 = class47.field762.getFontMetrics(class115.field1751);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class77.field1245, class180.field2748);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class89.field1409 == null) {
                    class89.field1409 = class47.field762.createImage(304, 34);
                }
                Graphics var6 = class89.field1409.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                if (!arg0) {
                    return;
                }
                var6.setFont(class115.field1751);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class200.field3046.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class89.field1409, class77.field1245 / 2 - 152, class180.field2748 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class77.field1245 / 2 - 152;
                int var8 = class180.field2748 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect((arg1 * 3) + var7 + 2, var8 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class115.field1751);
                var5.setColor(Color.white);
                var5.drawString(arg4, (304 - class200.field3046.stringWidth(arg4)) / 2 + var7, var8 + 22);
            }
            if (class134.field1964 != null) {
                var5.setFont(class115.field1751);
                var5.setColor(Color.white);
                var5.drawString(class134.field1964, class77.field1245 / 2 - class200.field3046.stringWidth(class134.field1964) / 2, class180.field2748 / 2 + -26);
            }
        } catch (Exception var10) {
            class47.field762.repaint();
        }
    }
}
