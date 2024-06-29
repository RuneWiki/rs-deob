import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 implements class65 {

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lbb;")
    private class9 field115 = new class9();

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    private int field129 = 0;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    private int field131 = 128;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "D")
    private double field127 = 1.0D;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lhe;")
    private class47 field130;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "[Lt;")
    private class110[] field124;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field109 = -1;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field118 = 20;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[Lib;")
    public static class50[] field110 = new class50[16384];

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field114 = -1;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lw;")
    public static class125 field107;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lfa;")
    public static class32 field112;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)V", line = 5)
    public final void method44(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field124.length; var3++) {
            class110 var4 = this.field124[var3];
            if (var4 != null && var4.field2468 != 0 && var4.field2475) {
                var4.method806(arg1);
                var4.field2475 = false;
            }
        }
        field122++;
        if (arg0 != 17) {
            method50(null, null, -105, 109);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI[BZ)V", line = 37)
    public static final void method45(byte arg0, int arg1, byte[] arg2, boolean arg3) {
        field116++;
        if (class5.field89 == null) {
            return;
        }
        int var4 = 64 % ((-arg0 - 12) / 49);
        if (class66.field1594 >= 0) {
            class5.field89.method140(true);
            class66.field1594 = -1;
            class48.field1162 = null;
            class97.field2164 = 20;
            class28.field711 = 0;
        }
        if (arg2 == null) {
            return;
        }
        if (class97.field2164 > 0) {
            class5.field89.method142(arg1, (byte) 50);
            class97.field2164 = 0;
        }
        class66.field1594 = arg1;
        class5.field89.method139(arg1, arg2, 0, arg3);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(DZ)V", line = 79)
    public final void method46(double arg0, boolean arg1) {
        if (!arg1) {
            this.method53(-19, 19);
        }
        field106++;
        this.field127 = arg0;
        this.method48(-27241);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 91)
    public static void method47(byte arg0) {
        field107 = null;
        if (arg0 != -104) {
            method50(null, null, 72, -29);
        }
        field112 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 103)
    public final void method48(int arg0) {
        field123++;
        int var2 = 0;
        if (arg0 != -27241) {
            return;
        }
        while (this.field124.length > var2) {
            if (this.field124[var2] != null) {
                this.field124[var2].method805();
            }
            var2++;
        }
        this.field115 = new class9();
        this.field129 = this.field128;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 130)
    public static final Class method49(int arg0, String arg1) throws ClassNotFoundException {
        field125++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != 0) {
                method50(null, null, 85, 34);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Color;Lva;II)V", line = 172)
    public static final void method50(Color arg0, class121 arg1, int arg2, int arg3) {
        field120++;
        try {
            Graphics var4 = class46.field1079.getGraphics();
            if (class60.field1441 == null) {
                class60.field1441 = new Font("Helvetica", 1, 13);
                class115.field2625 = class46.field1079.getFontMetrics(class60.field1441);
            }
            if (arg2 != 21722) {
                field117 = 0;
            }
            if (class48.field1149) {
                class48.field1149 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class42.field962, class63.field1537);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class116.field2633 == null) {
                    class116.field2633 = class46.field1079.createImage(304, 34);
                }
                Graphics var5 = class116.field2633.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class60.field1441);
                var5.setColor(Color.white);
                arg1.method941((byte) 124, (304 - arg1.method945(class115.field2625, arg2 ^ 0x54B4)) / 2, 22, var5);
                var4.drawImage(class116.field2633, class42.field962 / 2 - 152, class63.field1537 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class42.field962 / 2 - 152;
                int var7 = class63.field1537 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class60.field1441);
                var4.setColor(Color.white);
                arg1.method941((byte) 91, var6 + (304 - arg1.method945(class115.field2625, 119)) / 2, var7 - -22, var4);
            }
        } catch (Exception var9) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I", line = 243)
    public final int method51(int arg0, byte arg1) {
        field111++;
        if (arg1 >= -94) {
            return -123;
        } else if (this.field124[arg0] == null) {
            return 0;
        } else {
            return this.field124[arg0].field2466;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)Z", line = 266)
    public final boolean method52(int arg0, int arg1) {
        field113++;
        int var3 = -94 % ((arg1 - 15) / 43);
        return this.field124[arg0].field2467;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Z", line = 277)
    public final boolean method53(int arg0, int arg1) {
        field121++;
        if (arg1 != 15390) {
            method50(null, null, -4, -80);
        }
        return this.field131 == 64;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I", line = 298)
    public final int[] method54(int arg0, int arg1) {
        class110 var3 = this.field124[arg1];
        field108++;
        if (var3 != null) {
            if (var3.field2476 != null) {
                this.field115.method63(var3, arg0 - 5369);
                var3.field2475 = true;
                return var3.field2476;
            }
            boolean var4 = var3.method807(this.field127, this.field131, this.field130);
            if (var4) {
                if (this.field129 == 0) {
                    class110 var5 = (class110) this.field115.method60((byte) 126);
                    var5.method805();
                } else {
                    this.field129--;
                }
                this.field115.method63(var3, arg0 - 5369);
                var3.field2475 = true;
                return var3.field2476;
            }
        }
        if (arg0 != 5370) {
            this.method51(12, (byte) 68);
        }
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lhe;Lhe;IDI)V", line = 373)
    public class8(class47 arg0, class47 arg1, int arg2, double arg3, int arg4) {
        this.field127 = arg3;
        this.field128 = arg2;
        this.field131 = arg4;
        this.field130 = arg1;
        this.field129 = this.field128;
        int[] var7 = arg0.method333(0, 85);
        int var8 = var7.length;
        this.field124 = new class110[arg0.method328(0, false)];
        for (int var9 = 0; var9 < var8; var9++) {
            class113 var10 = new class113(arg0.method315(0, true, var7[var9]));
            this.field124[var7[var9]] = new class110(var10);
        }
    }
}
