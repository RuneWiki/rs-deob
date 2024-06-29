import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class160 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2579 = -1;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
    public static int[] field2581 = new int[14];

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Laa;")
    public static class339 field2586;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 3)
    public static void method1142(int arg0) {
        field2586 = null;
        if (arg0 != 2) {
            method1146(true, -110, true);
        }
        field2581 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V", line = 15)
    public static final void method1143(byte arg0, int arg1) {
        field2583++;
        if (!class1.method16(arg1, 1465669104)) {
            return;
        }
        class388[] var2 = class419.field6326[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class388 var4 = var2[var3];
            if (var4 != null) {
                var4.field5678 = 1;
                var4.field5747 = 0;
                var4.field5672 = 0;
            }
        }
        if (arg0 >= -87) {
            field2581 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;", line = 50)
    public final String toString() {
        field2577++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 59)
    public static final byte[] method1144(boolean arg0, int arg1, Object arg2) {
        field2580++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 <= 65) {
            method1145(-37, -56, 31);
        }
        if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class151.method1110(var3, 115) : var3;
        } else if (arg2 instanceof class476) {
            class476 var4 = (class476) arg2;
            return var4.method2799(-13873);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z", line = 96)
    public static final boolean method1145(int arg0, int arg1, int arg2) {
        field2582++;
        int var3 = -73 % ((arg1 - 26) / 44);
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)V", line = 114)
    public static final void method1146(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 301) {
            method1147(null, null, false, null, -70, false, null);
        }
        field2584++;
        if (arg2) {
            class81.field1679--;
            if (class81.field1679 == 0) {
                class97.field1892 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class325.field4940--;
        if (class325.field4940 == 0) {
            class198.field3177 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;ZLjava/awt/Color;IZLjava/awt/Color;)V", line = 144)
    public static final void method1147(String arg0, Color arg1, boolean arg2, Color arg3, int arg4, boolean arg5, Color arg6) {
        field2578++;
        try {
            Graphics var7 = class262.field4007.getGraphics();
            if (class28.field457 == null) {
                class28.field457 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class71.field1415, class65.field1330);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class196.field3148 == null) {
                    class196.field3148 = class262.field4007.createImage(304, 34);
                }
                Graphics var8 = class196.field3148.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg4 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg4 * 3) + 2, 2, 300 - (arg4 * 3), 30);
                var8.setFont(class28.field457);
                var8.setColor(arg1);
                var8.drawString(arg0, (304 - (arg0.length() * 6)) / 2, 22);
                var7.drawImage(class196.field3148, class71.field1415 / 2 - 152, class65.field1330 / 2 + -18, null);
                if (!arg2) {
                    method1147(null, null, false, null, 13, false, null);
                }
            } catch (Exception var11) {
                int var9 = class71.field1415 / 2 - 152;
                int var10 = class65.field1330 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(var9 + (arg4 * 3) + 2, var10 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class28.field457);
                var7.setColor(arg1);
                var7.drawString(arg0, (304 - arg0.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class430.field6424 != null) {
                var7.setFont(class28.field457);
                var7.setColor(arg1);
                var7.drawString(class430.field6424, class71.field1415 / 2 - (class430.field6424.length() * 6 / 2), class65.field1330 / 2 - 26);
            }
        } catch (Exception var12) {
            class262.field4007.repaint();
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V", line = 230)
    public class160(int arg0) {
        this.field2585 = arg0;
    }
}
