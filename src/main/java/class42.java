import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class42 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lgf;")
    private class155 field638 = new class155();

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Loe;")
    private class65 field649 = new class65();

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Luj;")
    private class132 field650;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field640 = "glow1:";

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[Lbf;")
    public static class31[] field639 = new class31[14];

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field646 = -1;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method246(boolean arg0) {
        if (!arg0) {
            field640 = null;
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lgf;JI)V")
    public final void method247(class155 arg0, long arg1, int arg2) {
        if (this.field648 == 0) {
            class155 var5 = this.field649.method451(-46);
            var5.method993(32);
            var5.method1174(-25741);
            if (this.field638 == var5) {
                class155 var6 = this.field649.method451(-40);
                var6.method993(32);
                var6.method1174(-25741);
            }
        } else {
            this.field648--;
        }
        this.field650.method986(arg1, true, arg0);
        this.field649.method449((byte) -64, arg0);
        int var7 = -75 / ((-arg2 - 20) / 41);
        field634++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method248(byte arg0, String arg1) {
        if (arg0 >= -51) {
            field639 = null;
        }
        class160.method1192("", 0, 0, "", arg1, 1464);
        field633++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lob;")
    public final class134 method249(byte arg0) {
        int var2 = 111 / ((-arg0 - 26) / 33);
        field645++;
        return this.field650.method981(-1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIILda;IZJ)Z")
    public static final boolean method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class312 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class245.field4123 == class183.field2929;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class21.field379 || var24 >= class28.field479) {
                    return false;
                }
                class174 var25 = class90.field1498[arg0][var15][var24];
                if (var25 != null && var25.field2814 >= 5) {
                    return false;
                }
            }
        }
        class73 var16 = new class73();
        var16.field1278 = arg11;
        var16.field1265 = arg0;
        var16.field1284 = arg5;
        var16.field1268 = arg6;
        var16.field1272 = arg7;
        var16.field1262 = arg8;
        var16.field1273 = arg9;
        var16.field1270 = arg1;
        var16.field1266 = arg2;
        var16.field1269 = arg1 + arg3 - 1;
        var16.field1276 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class90.field1498[var22][var17][var20] == null) {
                        class90.field1498[var22][var17][var20] = new class174(var22, var17, var20);
                    }
                }
                class174 var23 = class90.field1498[arg0][var17][var20];
                var23.field2812[var23.field2814] = var16;
                var23.field2801[var23.field2814] = var21;
                var23.field2819 |= var21;
                var23.field2814++;
                if (var13 && class86.field1429[var17][var20] != 0) {
                    var14 = class86.field1429[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class86.field1429[var18][var19] == 0) {
                        class86.field1429[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class140.field2310[class118.field1990++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lob;")
    public final class134 method251(int arg0) {
        if (arg0 < 107) {
            this.method249((byte) 75);
        }
        field641++;
        return this.field650.method982(-9570);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JZ)Lgf;")
    public final class155 method252(long arg0, boolean arg1) {
        field642++;
        class155 var4 = (class155) this.field650.method987(-91, arg0);
        if (arg1) {
            method248((byte) -97, (String) null);
        }
        if (var4 != null) {
            this.field649.method449((byte) -64, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method253(int arg0) {
        this.field649.method455(arg0 ^ 0xFFFFA95E);
        if (arg0 != 0) {
            field636 = -101;
        }
        this.field650.method990((byte) 44);
        this.field638 = new class155();
        this.field648 = this.field647;
        field637++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILjava/awt/Color;ZLjava/lang/String;)V")
    public static final void method254(int arg0, int arg1, Color arg2, boolean arg3, String arg4) {
        try {
            Graphics var5 = class5.field125.getGraphics();
            if (class51.field861 == null) {
                class51.field861 = new Font("Helvetica", 1, 13);
                class132.field2183 = class5.field125.getFontMetrics(class51.field861);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class155.field2567, class182.field2901);
            }
            if (arg0 >= -99) {
                field639 = null;
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class196.field3160 == null) {
                    class196.field3160 = class5.field125.createImage(304, 34);
                }
                Graphics var6 = class196.field3160.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class51.field861);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class132.field2183.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class196.field3160, class155.field2567 / 2 - 152, class182.field2901 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class155.field2567 / 2 - 152;
                int var8 = class182.field2901 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 + (arg1 * 3) + 2, var8 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class51.field861);
                var5.setColor(Color.white);
                var5.drawString(arg4, var7 + (304 - class132.field2183.stringWidth(arg4)) / 2, var8 - -22);
            }
            if (class194.field3111 != null) {
                var5.setFont(class51.field861);
                var5.setColor(Color.white);
                var5.drawString(class194.field3111, class155.field2567 / 2 - (class132.field2183.stringWidth(class194.field3111) / 2), class182.field2901 / 2 - 26);
            }
        } catch (Exception var10) {
            class5.field125.repaint();
        }
        field644++;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method255(byte arg0, String arg1) {
        field643++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -95) {
            method250(-12, -34, 78, 61, 14, 87, 113, 101, (class312) null, -123, true, 33L);
        }
        for (int var2 = 0; var2 < class86.field1425; var2++) {
            if (arg1.equalsIgnoreCase(class122.field2043[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class152.field2533[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field647 = arg0;
        this.field648 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field650 = new class132(var2);
    }
}
