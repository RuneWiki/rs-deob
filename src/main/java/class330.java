import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class330 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lna;")
    private class29 field5141 = new class29();

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5138 = 0;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5150 = "glow2:";

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5148 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lna;")
    private class29 field5147;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2278(int arg0, int arg1) {
        if (arg0 == -18) {
            class98.field1495.method1625(arg1, (byte) 23);
            field5144++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lna;B)V", line = 27)
    public final void method2279(class29 arg0, byte arg1) {
        if (arg0.field419 != null) {
            arg0.method189(0);
        }
        field5137++;
        arg0.field417 = this.field5141;
        arg0.field419 = this.field5141.field419;
        arg0.field419.field417 = arg0;
        if (arg1 >= -63) {
            this.method2284(-113);
        }
        arg0.field417.field419 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLjava/lang/String;ZLjava/awt/Color;I)V", line = 47)
    public static final void method2280(byte arg0, String arg1, boolean arg2, Color arg3, int arg4) {
        field5146++;
        try {
            Graphics var5 = class338.field5247.getGraphics();
            if (class327.field5101 == null) {
                class327.field5101 = new Font("Helvetica", 1, 13);
                class105.field1590 = class338.field5247.getFontMetrics(class327.field5101);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class160.field2601, class210.field3432);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class210.field3445 == null) {
                    class210.field3445 = class338.field5247.createImage(304, 34);
                }
                Graphics var6 = class210.field3445.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg4 * 3) + 2, 2, 300 - arg4 * 3, 30);
                var6.setFont(class327.field5101);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class105.field1590.stringWidth(arg1)) / 2, 22);
                if (arg0 != 91) {
                    return;
                }
                var5.drawImage(class210.field3445, class160.field2601 / 2 - 152, class210.field3432 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class160.field2601 / 2 - 152;
                int var9 = class210.field3432 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - arg4 * 3, 30);
                var5.setFont(class327.field5101);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - class105.field1590.stringWidth(arg1)) / 2 + var8, var9 - -22);
            }
            if (class292.field4596 != null) {
                var5.setFont(class327.field5101);
                var5.setColor(Color.white);
                var5.drawString(class292.field4596, class160.field2601 / 2 - class105.field1590.stringWidth(class292.field4596) / 2, class210.field3432 / 2 + -26);
            }
        } catch (Exception var12) {
            class338.field5247.repaint();
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 251)
    public class330() {
        this.field5141.field417 = this.field5141;
        this.field5141.field419 = this.field5141;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 124)
    public final void method2281(int arg0) {
        field5145++;
        while (true) {
            class29 var2 = this.field5141.field417;
            if (this.field5141 == var2) {
                this.field5147 = null;
                if (arg0 < 5) {
                    this.method2279((class29) null, (byte) -49);
                }
                return;
            }
            var2.method189(0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 147)
    public static void method2282(int arg0) {
        field5150 = null;
        int var1 = -58 % ((-arg0 - 61) / 53);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Lna;", line = 168)
    public final class29 method2283(int arg0) {
        class29 var2 = this.field5141.field417;
        field5140++;
        if (this.field5141 == var2) {
            return null;
        }
        var2.method189(0);
        if (arg0 != 33) {
            method2282(44);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I", line = 184)
    public final int method2284(int arg0) {
        field5139++;
        if (arg0 != 5916) {
            return -121;
        }
        int var2 = 0;
        class29 var3 = this.field5141.field417;
        while (this.field5141 != var3) {
            var3 = var3.field417;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lna;", line = 206)
    public final class29 method2285(boolean arg0) {
        class29 var2 = this.field5147;
        if (arg0) {
            this.method2284(34);
        }
        field5143++;
        if (this.field5141 == var2) {
            this.field5147 = null;
            return null;
        } else {
            this.field5147 = var2.field417;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Lna;", line = 227)
    public final class29 method2286(int arg0) {
        field5142++;
        if (arg0 != -31893) {
            return (class29) null;
        }
        class29 var2 = this.field5141.field417;
        if (this.field5141 == var2) {
            this.field5147 = null;
            return null;
        } else {
            this.field5147 = var2.field417;
            return var2;
        }
    }
}
