import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class623 extends class401 {

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field8646;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field8645;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Llga;")
    public static class663 field8642 = new class663(10);

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[I")
    public static int[] field8651 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field8647;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V", line = 3)
    public static final void method3460(int arg0, Color arg1, Color arg2, String arg3, int arg4, Color arg5) {
        field8650++;
        try {
            Graphics var6 = class611.field8473.getGraphics();
            if (class410.field5823 == null) {
                class410.field5823 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class261.field3550 == null) {
                    class261.field3550 = class611.field8473.createImage(class222.field3096, class340.field4553);
                }
                Graphics var7 = class261.field3550.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class222.field3096, class340.field4553);
                int var8 = class222.field3096 / 2 - 152;
                int var9 = class340.field4553 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(arg4 + var8, var9 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class410.field5823);
                var7.setColor(arg2);
                var7.drawString(arg3, var8 + ((304 - (arg3.length() * 6)) / 2), var9 + 22);
                if (class84.field1245 != null) {
                    var7.setFont(class410.field5823);
                    var7.setColor(arg2);
                    var7.drawString(class84.field1245, class222.field3096 / 2 - (class84.field1245.length() * 6 / 2), class340.field4553 / 2 + -26);
                }
                var6.drawImage(class261.field3550, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class222.field3096, class340.field4553);
                int var10 = class222.field3096 / 2 - 152;
                int var11 = class340.field4553 / 2 - 18;
                var6.setColor(arg1);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class410.field5823);
                var6.setColor(arg2);
                if (class84.field1245 != null) {
                    var6.setFont(class410.field5823);
                    var6.setColor(arg2);
                    var6.drawString(class84.field1245, class222.field3096 / 2 - class84.field1245.length() * 6 / 2, class340.field4553 / 2 + -26);
                }
                var6.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class611.field8473.repaint();
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 92)
    public static void method3461(boolean arg0) {
        if (!arg0) {
            field8651 = null;
            field8642 = null;
            field8647 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lf;I)V", line = 105)
    public static final void method3462(class702[] arg0, int arg1) {
        field8643++;
        class130.field1864 = arg0.length;
        class599.field8362 = new int[class130.field1864 + 10];
        class66.field862 = new class702[class130.field1864 + 10];
        class359.method2052(arg0, 0, class66.field862, 0, class130.field1864);
        if (arg1 != -18469) {
            field8649 = 6;
        }
        for (int var2 = 0; var2 < class130.field1864; var2++) {
            class599.field8362[var2] = class66.field862[var2].method1661();
        }
        for (int var3 = class130.field1864; var3 < class66.field862.length; var3++) {
            class599.field8362[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V", line = 135)
    public class623(int arg0, int arg1) {
        this.field8646 = arg0;
        this.field8645 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lks;IB)V", line = 144)
    public static final void method3463(class403 arg0, int arg1, byte arg2) {
        field8641++;
        if (class166.field2420 >= 50 || arg0 == null || arg0.field5645 == null || arg0.field5645.length <= arg1 || arg0.field5645[arg1] == null) {
            return;
        }
        int var3 = arg0.field5645[arg1][0];
        if (arg2 != 36) {
            field8649 = -28;
        }
        int var4 = var3 >> 8;
        if (arg0.field5645[arg1].length > 1) {
            int var5 = (int) (Math.random() * (double) arg0.field5645[arg1].length);
            if (var5 > 0) {
                var4 = arg0.field5645[arg1][var5];
            }
        }
        int var6 = (var3 & 0xF4) >> 5;
        int var7 = 256;
        if (arg0.field5666 != null && arg0.field5663 != null) {
            var7 = class159.method1127(true, arg0.field5666[arg1], arg0.field5663[arg1]);
        }
        if (arg0.field5654) {
            class586.method3335(var7, var6, 0, false, var4, 255, 0);
        } else {
            class589.method3348(0, 255, var6, true, var7, var4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 187)
    public static final void method3464(byte arg0) {
        if (arg0 <= 46) {
            method3464((byte) -10);
        }
        field8648++;
        try {
            if (class450.field6183 == 1) {
                int var1 = class224.field3124.method2090((byte) 122);
                if (var1 > 0 && class224.field3124.method2103((byte) -108)) {
                    int var2 = var1 - class686.field9799;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class224.field3124.method2084((byte) -78, var2);
                    return;
                }
                class224.field3124.method2099((byte) 62);
                class224.field3124.method2074(false);
                class479.field6600 = null;
                if (class4.field34 == null) {
                    class450.field6183 = 0;
                } else {
                    class450.field6183 = 2;
                }
                class233.field3228 = null;
            }
            if (class450.field6183 == 3) {
                int var3 = class224.field3124.method2090((byte) 123);
                if (var3 < class129.field1848 && class224.field3124.method2103((byte) -108)) {
                    int var4 = class500.field6814 + var3;
                    if (var4 > class129.field1848) {
                        var4 = class129.field1848;
                    }
                    class224.field3124.method2084((byte) -78, var4);
                } else {
                    class450.field6183 = 0;
                    class500.field6814 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class224.field3124.method2099((byte) 62);
            class233.field3228 = null;
            class479.field6600 = null;
            class4.field34 = null;
            class123.field1688 = null;
            class450.field6183 = 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLjava/lang/String;II)V", line = 258)
    public static final void method3465(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
        field8644++;
        if (arg0 < 126) {
            field8651 = null;
        }
        class523.method2985(arg1, arg3, arg2, null, false, false, arg4);
    }
}
