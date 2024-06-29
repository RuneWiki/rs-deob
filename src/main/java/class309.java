import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class309 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
    public static int[] field4655 = new int[50];

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field4659 = 0;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Lob;")
    public static class521 field4657 = new class521(33, -1);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[S")
    public static short[] field4660;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([II[I[ILwq;)V")
    public static final void method1976(int[] arg0, int arg1, int[] arg2, int[] arg3, class116 arg4) {
        if (arg1 != -3499) {
            field4660 = null;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg4.field1964.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1964[var9] = null;
                    } else {
                        class189 var10 = class242.field3846.method2238(var6, (byte) 78);
                        int var11 = var10.field3192;
                        class121 var12 = arg4.field1964[var9];
                        if (var12 != null) {
                            if (var12.field1815 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1964[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1822 = 0;
                                    var12.field1823 = 0;
                                    var12.field1820 = var8;
                                    var12.field1817 = 0;
                                    var12.field1816 = 1;
                                    class501.method2969(var10, arg4.field5837, false, 0, arg1 + 3428, arg4.field5826, arg4.field5833);
                                } else if (var11 == 2) {
                                    var12.field1817 = 0;
                                }
                            } else if (var10.field3175 >= class242.field3846.method2238(var12.field1815, (byte) 78).field3175) {
                                var12 = arg4.field1964[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class121 var13 = arg4.field1964[var9] = new class121();
                            var13.field1816 = 1;
                            var13.field1817 = 0;
                            var13.field1823 = 0;
                            var13.field1822 = 0;
                            var13.field1815 = var6;
                            var13.field1820 = var8;
                            class501.method2969(var10, arg4.field5837, false, 0, -114, arg4.field5826, arg4.field5833);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field4658++;
    }

    @OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4656++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4660 = null;
        if (arg0 != -30891) {
            method1976(null, 9, null, null, null);
        }
        field4655 = null;
        field4657 = null;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
    public class309(int arg0) {
        this.field4654 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;BLjava/awt/Color;Ljava/awt/Color;Z)V")
    public static final void method1978(Color arg0, int arg1, String arg2, byte arg3, Color arg4, Color arg5, boolean arg6) {
        try {
            Graphics var7 = class111.field1557.getGraphics();
            if (class58.field701 == null) {
                class58.field701 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class80.field1163, class76.field1105);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class458.field6661 == null) {
                    class458.field6661 = class111.field1557.createImage(304, 34);
                }
                Graphics var8 = class458.field6661.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var8.setFont(class58.field701);
                var8.setColor(arg0);
                var8.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
                var7.drawImage(class458.field6661, class80.field1163 / 2 - 152, class76.field1105 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class80.field1163 / 2 - 152;
                int var10 = class76.field1105 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var9 + 2, var10 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg1 * 3 + var9 + 2, var10 + 2, 300 - arg1 * 3, 30);
                var7.setFont(class58.field701);
                var7.setColor(arg0);
                var7.drawString(arg2, var9 + (304 - (arg2.length() * 6)) / 2, var10 + 22);
            }
            if (class483.field6942 != null) {
                var7.setFont(class58.field701);
                var7.setColor(arg0);
                var7.drawString(class483.field6942, class80.field1163 / 2 - class483.field6942.length() * 6 / 2, class76.field1105 / 2 + -26);
            }
        } catch (Exception var12) {
            class111.field1557.repaint();
        }
        if (arg3 != -37) {
            field4655 = null;
        }
        field4653++;
    }
}
