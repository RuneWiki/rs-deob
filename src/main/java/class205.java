import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class205 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lgh;")
    public static class54 field2827 = new class54(2, 4, 4, 0);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field2829;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2831;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field2832;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "[I")
    public static int[] field2830;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1391(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;IILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 12)
    public static final void method1387(String arg0, int arg1, int arg2, Color arg3, Color arg4, Color arg5) {
        field2828++;
        try {
            Graphics var6 = class678.field8763.getGraphics();
            if (class273.field3580 == null) {
                class273.field3580 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class594.field7548 == null) {
                    class594.field7548 = class678.field8763.createImage(class372.field4550, class463.field6021);
                }
                Graphics var7 = class594.field7548.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class372.field4550, class463.field6021);
                int var8 = class372.field4550 / 2 - 152;
                int var9 = class463.field6021 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                if (arg2 != -3251) {
                    field2830 = null;
                }
                var7.setFont(class273.field3580);
                var7.setColor(arg3);
                var7.drawString(arg0, (304 - arg0.length() * 6) / 2 + var8, var9 + 22);
                if (class212.field2922 != null) {
                    var7.setFont(class273.field3580);
                    var7.setColor(arg3);
                    var7.drawString(class212.field2922, class372.field4550 / 2 - (class212.field2922.length() * 6 / 2), class463.field6021 / 2 + -26);
                }
                var6.drawImage(class594.field7548, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class372.field4550, class463.field6021);
                int var10 = class372.field4550 / 2 - 152;
                int var11 = class463.field6021 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 - -2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg1 * 3) + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class273.field3580);
                var6.setColor(arg3);
                if (class212.field2922 != null) {
                    var6.setFont(class273.field3580);
                    var6.setColor(arg3);
                    var6.drawString(class212.field2922, class372.field4550 / 2 - (class212.field2922.length() * 6 / 2), class463.field6021 / 2 - 26);
                }
                var6.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class678.field8763.repaint();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V", line = 101)
    public static final void method1388(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2826++;
        for (int var5 = 0; var5 < class547.field6839; var5++) {
            Rectangle var6 = class393.field5181[var5];
            if (arg1 < var6.x + var6.width && var6.x < (arg1 + arg4) && arg3 < (var6.y + var6.height) && arg2 + arg3 > var6.y) {
                class454.field5919[var5] = true;
            }
        }
        class548.method2967(arg1, arg2 + arg3, arg3, (byte) -108, arg1 + arg4);
        if (arg0 < 40) {
            field2830 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 126)
    public static void method1389(int arg0) {
        field2827 = null;
        field2830 = null;
        int var1 = -107 / ((arg0 + 13) / 40);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 137)
    public static final synchronized void method1390(int arg0) {
        field2829++;
        if (class73.field996 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 != -24359) {
                field2830 = null;
            }
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field2831 == null ? (field2831 = method1391("java.lang.String")) : field2831, field2832 == null ? (field2832 = method1391("java.lang.Class")) : field2832);
            class73.field996 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
