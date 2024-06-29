import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class169 extends class170 {

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    private int field2937 = 0;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    private int field2943 = 0;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    private int field2955 = 0;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Ls;")
    public static class261 field2936 = new class261(100);

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Lmh;")
    public static class128 field2946 = class22.method156(122, "");

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "Lmh;")
    public static class128 field2949 = class22.method156(127, "floorshadows");

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lmh;")
    public static class128 field2945 = class22.method156(125, "Fertigkeit: ");

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "Lmh;")
    private static class128 field2950 = class22.method156(124, "Unable to find ");

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "Lmh;")
    public static class128 field2953 = field2950;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "Lmh;")
    private static class128 field2954 = class22.method156(123, "Loaded wordpack");

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "Lmh;")
    public static class128 field2951 = field2954;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field2934;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    private int field2952;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Color;IBZLmh;)V", line = 6)
    public static final void method1130(Color arg0, int arg1, byte arg2, boolean arg3, class128 arg4) {
        try {
            Graphics var5 = class203.field3589.getGraphics();
            if (class199.field3477 == null) {
                class199.field3477 = new Font("Helvetica", 1, 13);
                class150.field2578 = class203.field3589.getFontMetrics(class199.field3477);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class199.field3465, class16.field420);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class116.field1962 == null) {
                    class116.field1962 = class203.field3589.createImage(304, 34);
                }
                Graphics var6 = class116.field1962.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class199.field3477);
                if (arg2 != 77) {
                    field2936 = (class261) null;
                }
                var6.setColor(Color.white);
                arg4.method859(var6, (304 - arg4.method857((byte) 67, class150.field2578)) / 2, 22, -24650);
                var5.drawImage(class116.field1962, class199.field3465 / 2 - 152, class16.field420 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class199.field3465 / 2 - 152;
                int var9 = class16.field420 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class199.field3477);
                var5.setColor(Color.white);
                arg4.method859(var5, var8 + (304 - arg4.method857((byte) 67, class150.field2578)) / 2, var9 - -22, -24650);
            }
            if (class261.field4523 != null) {
                var5.setFont(class199.field3477);
                var5.setColor(Color.white);
                class261.field4523.method859(var5, class199.field3465 / 2 - class261.field4523.method857((byte) 67, class150.field2578) / 2, class16.field420 / 2 + -26, -24650);
            }
        } catch (Exception var12) {
            class203.field3589.repaint();
        }
        field2933++;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 83)
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILbg;B)V", line = 89)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            return;
        }
        field2938++;
        if (arg0 == 0) {
            this.field2955 = arg1.method1354(2);
        } else if (arg0 == 1) {
            this.field2937 = (arg1.method1326((byte) 116) << 12) / 100;
        } else if (arg0 == 2) {
            this.field2943 = (arg1.method1326((byte) 125) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBII)V", line = 142)
    private final void method1131(int arg0, byte arg1, int arg2, int arg3) {
        field2940++;
        int var5 = arg2 >= arg3 ? arg2 : arg3;
        int var6 = arg2 > arg3 ? arg3 : arg2;
        int var7 = arg0 >= var6 ? var6 : arg0;
        int var8 = arg0 > var5 ? arg0 : var5;
        this.field2952 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (arg1 > -25) {
            this.method63(-119, (class194) null, (byte) 59);
        }
        if (var9 <= 0) {
            this.field2939 = 0;
        } else {
            int var10 = (var8 - arg3 << 12) / var9;
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (var8 - arg0 << 12) / var9;
            if (arg3 == var8) {
                this.field2939 = arg2 == var7 ? var12 + 20480 : -var11 + 4096;
            } else if (arg2 == var8) {
                this.field2939 = arg0 == var7 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field2939 = arg3 == var7 ? var11 + 12288 : -var10 + 20480;
            }
            this.field2939 /= 6;
        }
        if (this.field2952 > 0 && this.field2952 < 4096) {
            this.field2934 = (var9 << 12) / (this.field2952 <= 2048 ? this.field2952 * 2 : 8192 - this.field2952 * 2);
        } else {
            this.field2934 = 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[[I", line = 197)
    public final int[][] method62(int arg0, int arg1) {
        field2941++;
        int var3 = 80 % ((arg1 + 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[][] var5 = this.method1139(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; var12 < class185.field3225; var12++) {
                this.method1131(var7[var12], (byte) -127, var8[var12], var6[var12]);
                this.field2934 += this.field2937;
                this.field2939 += this.field2955;
                if (this.field2934 < 0) {
                    this.field2934 = 0;
                }
                this.field2952 += this.field2943;
                if (this.field2934 > 4096) {
                    this.field2934 = 4096;
                }
                while (this.field2939 < 0) {
                    this.field2939 += 4096;
                }
                while (this.field2939 > 4096) {
                    this.field2939 -= 4096;
                }
                if (this.field2952 < 0) {
                    this.field2952 = 0;
                }
                if (this.field2952 > 4096) {
                    this.field2952 = 4096;
                }
                this.method1133(true, this.field2952, this.field2939, this.field2934);
                var9[var12] = this.field2935;
                var11[var12] = this.field2942;
                var10[var12] = this.field2947;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 269)
    public static void method1132(int arg0) {
        field2954 = null;
        field2945 = null;
        field2946 = null;
        field2951 = null;
        field2949 = null;
        field2950 = null;
        if (arg0 == -26) {
            field2936 = null;
            field2953 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIII)V", line = 290)
    private final void method1133(boolean arg0, int arg1, int arg2, int arg3) {
        field2944++;
        if (!arg0) {
            this.method62(101, 55);
        }
        int var5 = arg1 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (var5 <= 0) {
            this.field2935 = this.field2942 = this.field2947 = arg1;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = arg1 + arg1 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field2947 = var7;
            this.field2942 = var14;
            this.field2935 = var5;
        } else if (var9 == 1) {
            this.field2947 = var7;
            this.field2935 = var15;
            this.field2942 = var5;
        } else if (var9 == 2) {
            this.field2947 = var14;
            this.field2942 = var5;
            this.field2935 = var7;
        } else if (var9 == 3) {
            this.field2942 = var15;
            this.field2947 = var5;
            this.field2935 = var7;
        } else if (var9 == 4) {
            this.field2935 = var14;
            this.field2947 = var5;
            this.field2942 = var7;
        } else if (var9 == 5) {
            this.field2935 = var5;
            this.field2942 = var7;
            this.field2947 = var15;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Ljd;", line = 404)
    public static final class133 method1134(int arg0, int arg1) {
        class133 var2 = (class133) class56.field1071.method1836((long) arg1, arg0 - 2);
        if (arg0 != 2) {
            method1132(-22);
        }
        field2948++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class71.field1321.method2155(class177.method1212(arg1, 6), class296.method2026(arg1, (byte) 111), (byte) 70);
        class133 var4 = new class133();
        var4.field2311 = arg1;
        if (var3 != null) {
            var4.method888((byte) 48, new class194(var3));
        }
        class56.field1071.method1835((byte) -81, (long) arg1, var4);
        return var4;
    }
}
