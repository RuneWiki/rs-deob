import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class181 {

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lo;")
    private class15 field3153 = new class15();

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lce;")
    public static class126 field3151 = class206.method1445(-7923, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lce;")
    public static class126 field3141 = class206.method1445(-7923, "brillant3:");

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lce;")
    public static class126 field3143 = class206.method1445(-7923, "OK");

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lie;")
    public static class2 field3157 = null;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lce;")
    public static class126 field3158 = class206.method1445(-7923, "<col=ffffff>");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lo;")
    private class15 field3155;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
    public static int[] field3146;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lo;", line = 14)
    public final class15 method1292(boolean arg0) {
        field3144++;
        class15 var2 = this.field3153.field205;
        if (this.field3153 == var2) {
            this.field3155 = null;
            return null;
        } else if (arg0) {
            this.field3155 = var2.field205;
            return var2;
        } else {
            return (class15) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lo;", line = 34)
    public final class15 method1293(int arg0) {
        if (arg0 != 2) {
            method1299((class313) null, (class313) null, (byte) 10);
        }
        field3156++;
        class15 var2 = this.field3155;
        if (this.field3153 == var2) {
            this.field3155 = null;
            return null;
        } else {
            this.field3155 = var2.field205;
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V", line = 54)
    public static final void method1294(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3148++;
        if (class125.field2109 != null) {
            class125.field2109.method1056((byte) -90);
        }
        if (class118.field1993 != null) {
            class118.field1993.method1056((byte) -90);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILo;)V", line = 71)
    public final void method1295(int arg0, class15 arg1) {
        field3142++;
        if (arg1.field203 != null) {
            arg1.method85(114);
        }
        int var3 = -97 % ((arg0 + 60) / 39);
        arg1.field203 = this.field3153.field203;
        arg1.field205 = this.field3153;
        arg1.field203.field205 = arg1;
        arg1.field205.field203 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lo;", line = 88)
    public final class15 method1296(byte arg0) {
        field3149++;
        if (arg0 >= -32) {
            method1298((byte) 116);
        }
        class15 var2 = this.field3153.field205;
        if (this.field3153 == var2) {
            return null;
        } else {
            var2.method85(119);
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)I", line = 110)
    public final int method1297(byte arg0) {
        field3154++;
        int var2 = 0;
        if (arg0 >= -22) {
            return 29;
        }
        class15 var3 = this.field3153.field205;
        while (this.field3153 != var3) {
            var3 = var3.field205;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V", line = 156)
    public static void method1298(byte arg0) {
        field3146 = null;
        field3141 = null;
        field3143 = null;
        field3151 = null;
        field3158 = null;
        if (arg0 == 102) {
            field3157 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcc;Lcc;B)V", line = 180)
    public static final void method1299(class313 arg0, class313 arg1, byte arg2) {
        class142.field2570 = arg1;
        field3152++;
        if (arg2 > -13) {
            method1300((byte) -54);
        }
        class259.field4349 = arg0;
        class264.field4403 = class259.field4349.method2165(0, 3);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 333)
    public class181() {
        this.field3153.field205 = this.field3153;
        this.field3153.field203 = this.field3153;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)Lce;", line = 198)
    public static final class126 method1300(byte arg0) {
        field3150++;
        class126 var1 = class270.field4555;
        if (class194.field3305 != 0) {
            var1 = class242.field4100;
        }
        class126 var2 = class224.field3772;
        if (arg0 <= 121) {
            method1300((byte) 74);
        }
        if (class23.field321 != null) {
            var2 = class12.method69(new class126[] { class174.field3076, class23.field321 }, (byte) 124);
        }
        return class12.method69(new class126[] { class76.field1236, var1, class199.field3403, class195.method1386((byte) 20, class226.field3813), class252.field4212, class195.method1386((byte) 20, class126.field2121), var2, class278.field4634 }, (byte) 116);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 242)
    public final void method1301(int arg0) {
        field3145++;
        while (true) {
            class15 var2 = this.field3153.field205;
            if (this.field3153 == var2) {
                if (arg0 > -104) {
                    method1300((byte) -125);
                }
                this.field3155 = null;
                return;
            }
            var2.method85(77);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLjava/awt/Color;ZLce;)V", line = 264)
    public static final void method1302(int arg0, byte arg1, Color arg2, boolean arg3, class126 arg4) {
        field3147++;
        try {
            if (arg1 != -72) {
                method1300((byte) 69);
            }
            Graphics var5 = class24.field342.getGraphics();
            if (class30.field421 == null) {
                class30.field421 = new Font("Helvetica", 1, 13);
                class294.field4904 = class24.field342.getFontMetrics(class30.field421);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class7.field87, class1.field6);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class137.field2428 == null) {
                    class137.field2428 = class24.field342.createImage(304, 34);
                }
                Graphics var6 = class137.field2428.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class30.field421);
                var6.setColor(Color.white);
                arg4.method853((byte) -73, 22, (304 - arg4.method868(0, class294.field4904)) / 2, var6);
                var5.drawImage(class137.field2428, class7.field87 / 2 - 152, class1.field6 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class1.field6 / 2 - 18;
                int var9 = class7.field87 / 2 - 152;
                var5.setColor(arg2);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class30.field421);
                var5.setColor(Color.white);
                arg4.method853((byte) 118, var8 + 22, (-arg4.method868(0, class294.field4904) + 304) / 2 + var9, var5);
            }
            if (class12.field163 != null) {
                var5.setFont(class30.field421);
                var5.setColor(Color.white);
                class12.field163.method853((byte) -73, class1.field6 / 2 - 26, class7.field87 / 2 + -(class12.field163.method868(arg1 ^ 0xFFFFFFB8, class294.field4904) / 2), var5);
            }
        } catch (Exception var12) {
            class24.field342.repaint();
        }
    }
}
