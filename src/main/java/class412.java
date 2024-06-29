import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class412 {

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lfi;")
    public class35 field5951 = new class35();

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field5943 = 0;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5947 = 0;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5945 = 0;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "F")
    public static float field5953 = 1024.0F;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "[I")
    public static int[] field5962 = new int[4];

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "Lfi;")
    private class35 field5961;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)Lfi;")
    public final class35 method2451(byte arg0) {
        field5956++;
        if (arg0 > -93) {
            field5943 = 82;
        }
        class35 var2 = this.field5961;
        if (this.field5951 == var2) {
            this.field5961 = null;
            return null;
        } else {
            this.field5961 = var2.field435;
            return var2;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILat;)V")
    public final void method2452(int arg0, class412 arg1) {
        this.method2466(arg0 ^ 0xFFFFECEE, this.field5951.field434, arg1);
        field5946++;
        if (arg0 != -4912) {
            this.method2459(-92);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLfi;)V")
    public final void method2453(byte arg0, class35 arg1) {
        if (arg1.field435 != null) {
            arg1.method283(2);
        }
        field5964++;
        if (arg0 <= -82) {
            arg1.field434 = this.field5951;
            arg1.field435 = this.field5951.field435;
            arg1.field435.field434 = arg1;
            arg1.field434.field435 = arg1;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Lfi;")
    public final class35 method2454(byte arg0) {
        field5949++;
        class35 var2 = this.field5951.field435;
        if (this.field5951 == var2) {
            this.field5961 = null;
            return null;
        }
        this.field5961 = var2.field435;
        if (arg0 < 111) {
            method2455((byte) -6);
        }
        return var2;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V")
    public static void method2455(byte arg0) {
        int var1 = 116 / ((-arg0 - 77) / 32);
        field5962 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lfi;")
    public final class35 method2456(int arg0) {
        if (arg0 != 32101) {
            this.method2456(-107);
        }
        field5965++;
        class35 var2 = this.field5951.field434;
        if (this.field5951 == var2) {
            this.field5961 = null;
            return null;
        } else {
            this.field5961 = var2.field434;
            return var2;
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(B)Lfi;")
    public final class35 method2457(byte arg0) {
        field5958++;
        class35 var2 = this.field5951.field434;
        if (this.field5951 == var2) {
            return null;
        }
        var2.method283(2);
        if (arg0 != 75) {
            this.method2451((byte) -100);
        }
        return var2;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Z")
    public final boolean method2458(int arg0) {
        field5955++;
        int var2 = 67 / ((27 - arg0) / 61);
        return this.field5951.field434 == this.field5951;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
    public final void method2459(int arg0) {
        while (true) {
            class35 var2 = this.field5951.field434;
            if (this.field5951 == var2) {
                field5944++;
                this.field5961 = null;
                if (arg0 != 300) {
                    this.method2466(126, (class35) null, (class412) null);
                    return;
                }
                return;
            }
            var2.method283(2);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I")
    public static final int method2460(int arg0, int arg1, int arg2) {
        field5963++;
        if (arg1 == 1 || arg1 == 3) {
            return class315.field4744[arg0 & 0x3];
        } else {
            int var3 = 80 / ((arg2 - 8) / 36);
            return class111.field1567[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Lfi;")
    public final class35 method2461(int arg0) {
        if (arg0 != 301) {
            this.method2459(-114);
        }
        field5950++;
        class35 var2 = this.field5961;
        if (this.field5951 == var2) {
            this.field5961 = null;
            return null;
        } else {
            this.field5961 = var2.field434;
            return var2;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Z)V")
    public static final void method2462(String arg0, int arg1, Color arg2, Color arg3, int arg4, Color arg5, boolean arg6) {
        field5960++;
        try {
            Graphics var7 = class378.field5618.getGraphics();
            if (class429.field6118 == null) {
                class429.field6118 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class342.field5115, class233.field3411);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class304.field4532 == null) {
                    class304.field4532 = class378.field5618.createImage(304, 34);
                }
                Graphics var8 = class304.field4532.getGraphics();
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg4 * 3, 30);
                if (arg1 != 255) {
                    method2462((String) null, 47, (Color) null, (Color) null, 61, (Color) null, false);
                }
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
                var8.setFont(class429.field6118);
                var8.setColor(arg5);
                var8.drawString(arg0, (304 - (arg0.length() * 6)) / 2, 22);
                var7.drawImage(class304.field4532, class342.field5115 / 2 - 152, class233.field3411 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class342.field5115 / 2 - 152;
                int var10 = class233.field3411 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg4 * 3 + var9 + 2, var10 - -2, 300 - (arg4 * 3), 30);
                var7.setFont(class429.field6118);
                var7.setColor(arg5);
                var7.drawString(arg0, var9 + ((304 - (arg0.length() * 6)) / 2), var10 - -22);
            }
            if (class197.field2962 != null) {
                var7.setFont(class429.field6118);
                var7.setColor(arg5);
                var7.drawString(class197.field2962, class342.field5115 / 2 - class197.field2962.length() * 6 / 2, class233.field3411 / 2 + -26);
            }
        } catch (Exception var12) {
            class378.field5618.repaint();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
    public static int method2463(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)I")
    public final int method2464(boolean arg0) {
        field5959++;
        if (!arg0) {
            this.method2454((byte) 98);
        }
        int var2 = 0;
        class35 var3 = this.field5951.field434;
        while (this.field5951 != var3) {
            var3 = var3.field434;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(BLfi;)V")
    public final void method2465(byte arg0, class35 arg1) {
        if (arg1.field435 != null) {
            arg1.method283(2);
        }
        field5952++;
        arg1.field434 = this.field5951.field434;
        arg1.field435 = this.field5951;
        if (arg0 != 108) {
            field5957 = -62;
        }
        arg1.field435.field434 = arg1;
        arg1.field434.field435 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILfi;Lat;)V")
    private final void method2466(int arg0, class35 arg1, class412 arg2) {
        int var4 = -10 / ((arg0 + 25) / 59);
        field5948++;
        class35 var5 = this.field5951.field435;
        this.field5951.field435 = arg1.field435;
        arg1.field435.field434 = this.field5951;
        if (this.field5951 != arg1) {
            arg1.field435 = arg2.field5951.field435;
            arg1.field435.field434 = arg1;
            var5.field434 = arg2.field5951;
            arg2.field5951.field435 = var5;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
    public class412() {
        this.field5951.field435 = this.field5951;
        this.field5951.field434 = this.field5951;
    }
}
