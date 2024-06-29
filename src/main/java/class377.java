import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class377 {

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public int field5370 = 0;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public int field5373 = 0;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public volatile int field5371 = 0;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field5375 = new Object[5000];

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public volatile int field5366 = 0;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "[B")
    public byte[] field5374 = new byte[5000];

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[F")
    public float[] field5372 = new float[5000];

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[S")
    public static short[] field5368 = new short[256];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "[[B")
    public static byte[][] field5378;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "[[I")
    public static int[][] field5364;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
    public abstract void method1916(int arg0, int arg1);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2403(String arg0, int arg1) {
        field5379++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class134.method1029(arg0, (byte) 65);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 > -71) {
            method2408((byte) 108, -35);
        }
        while (var3 < class206.field2897) {
            String var4 = class56.field743[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class134.method1029(var4, (byte) 105);
            if (var5 != null && var5.equals(var2)) {
                class206.field2897--;
                for (int var6 = var3; var6 < class206.field2897; var6++) {
                    class56.field743[var6] = class56.field743[var6 + 1];
                    class366.field5231[var6] = class366.field5231[var6 + 1];
                    class275.field3973[var6] = class275.field3973[var6 + 1];
                    class64.field881[var6] = class64.field881[var6 + 1];
                    class206.field2904[var6] = class206.field2904[var6 + 1];
                    class15.field236[var6] = class15.field236[var6 + 1];
                }
                class108.field1383++;
                class444.field6344 = class428.field6095;
                class407.field5761.method2048(2040, 76);
                class407.field5761.method831(class276.method1873(true, arg0), (byte) -85);
                class407.field5761.method807((byte) 124, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lwa;ILwa;)V")
    public static final void method2404(class366 arg0, int arg1, class366 arg2) {
        if (arg1 < 61) {
            method2409(30);
        }
        field5377++;
        if (arg0.field5237 != null) {
            arg0.method2365(true);
        }
        arg0.field5237 = arg2;
        arg0.field5229 = arg2.field5229;
        arg0.field5237.field5229 = arg0;
        arg0.field5229.field5237 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lls;Z)V")
    public abstract void method1912(class74 arg0, boolean arg1);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIILpn;)V")
    public static final void method2405(int arg0, int arg1, int arg2, class446 arg3) {
        if (arg3.field4558 == arg0 && arg0 != -1) {
            class183 var4 = class110.method671(-21965, arg0);
            int var5 = var4.field2592;
            if (var5 == 1) {
                arg3.field4535 = arg2;
                arg3.field4547 = 0;
                arg3.field4564 = 0;
                arg3.field4566 = 0;
                arg3.field4575 = 1;
                class47.method311(arg3.field4463, arg3.field4466, arg3.field4566, true, false, var4);
            }
            if (var5 == 2) {
                arg3.field4564 = 0;
            }
        } else if (arg0 == -1 || arg3.field4558 == -1 || class110.method671(-21965, arg0).field2583 >= class110.method671(-21965, arg3.field4558).field2583) {
            arg3.field4575 = 1;
            arg3.field4564 = 0;
            arg3.field4558 = arg0;
            arg3.field4589 = arg3.field4599;
            arg3.field4566 = 0;
            arg3.field4535 = arg2;
            arg3.field4547 = 0;
            if (arg3.field4558 != -1) {
                class47.method311(arg3.field4463, arg3.field4466, arg3.field4566, true, false, class110.method671(-21965, arg3.field4558));
            }
        }
        if (arg1 > -122) {
            field5364 = null;
        }
        field5363++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IILjava/awt/Color;)V")
    public static final void method2406(Color arg0, String arg1, boolean arg2, Color arg3, int arg4, int arg5, Color arg6) {
        field5365++;
        try {
            Graphics var7 = class117.field1588.getGraphics();
            if (class34.field424 == null) {
                class34.field424 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class24.field307, class316.field4643);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class295.field4269 == null) {
                    class295.field4269 = class117.field1588.createImage(304, 34);
                }
                Graphics var8 = class295.field4269.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(arg4, 1, 301, 31);
                var8.fillRect((arg5 * 3) + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class34.field424);
                var8.setColor(arg3);
                var8.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
                var7.drawImage(class295.field4269, class24.field307 / 2 - 152, class316.field4643 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class24.field307 / 2 - 152;
                int var10 = class316.field4643 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class34.field424);
                var7.setColor(arg3);
                var7.drawString(arg1, (304 - (arg1.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class113.field1470 != null) {
                var7.setFont(class34.field424);
                var7.setColor(arg3);
                var7.drawString(class113.field1470, class24.field307 / 2 - (class113.field1470.length() * 6 / 2), class316.field4643 / 2 + -26);
            }
        } catch (Exception var12) {
            class117.field1588.repaint();
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method2407(String arg0, int arg1, byte arg2) {
        field5369++;
        class407.field5761.method2048(2040, 44);
        class110.field1422++;
        class407.field5761.method831(class276.method1873(true, arg0) + 1, (byte) -50);
        if (arg2 <= 58) {
            method2408((byte) -22, 3);
        }
        class407.field5761.method807((byte) 124, arg0);
        class407.field5761.method831(arg1, (byte) 119);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(FBIZLuh;)V")
    public abstract void method1911(float arg0, byte arg1, int arg2, boolean arg3, class92 arg4);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public abstract void method1917(byte arg0);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILls;)V")
    public abstract void method1919(int arg0, class74 arg1);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Lli;")
    public static final class247 method2408(byte arg0, int arg1) {
        field5376++;
        class247 var2 = (class247) class1.field2.method99(true, (long) arg1);
        if (arg0 != 67) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class409.field5872.method643(4, arg1, true);
            class247 var4 = new class247();
            if (var3 != null) {
                var4.method1724(arg1, new class130(var3), -1);
            }
            var4.method1725(arg1, false);
            class1.field2.method90(var4, (long) arg1, 0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method2409(int arg0) {
        field5378 = null;
        field5368 = null;
        if (arg0 != -747) {
            method2407((String) null, -71, (byte) 1);
        }
        field5364 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public abstract void method1913(boolean arg0);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
    public abstract void method1915(int arg0, byte arg1);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lls;B)V")
    public abstract void method1914(class74 arg0, byte arg1);
}
