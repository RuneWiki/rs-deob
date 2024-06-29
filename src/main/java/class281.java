import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class281 extends InputStream {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    public static int[] field4266 = new int[128];

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4262 = "flash3:";

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field4261 = 10;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[Z")
    public static boolean[][] field4270 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1961(int arg0, int arg1) {
        class280.method1960(class280.field4260, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field4272++;
        class280.method1958(-50.0F, -60.0F, -50.0F);
        if (arg1 != 1) {
            method1964(35);
        }
        class280.method1957(class280.field4255, 0);
        class280.method1951();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)I", line = 20)
    public static final int method1962(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4263++;
        if (~var4 == arg2) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method1963(boolean arg0) {
        int var1 = class217.field3299.method632(class154.field2312);
        if (!arg0) {
            field4261 = 65;
        }
        field4271++;
        for (int var2 = 0; var2 < class190.field2829; var2++) {
            int var3 = class217.field3299.method632(class163.method1152(-84, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class190.field2829 * 15 + 21;
        int var5 = class317.field4783 - var1 / 2;
        int var6 = class121.field1897;
        if (var4 + var6 > class251.field3747) {
            var6 = class251.field3747 - var4;
        }
        if (class136.field2071 < var5 + var1) {
            var5 = class136.field2071 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class115.field1761 == 1) {
            if (class317.field4783 == class136.field2066 && class121.field1897 == class103.field1642) {
                class5.field27 = true;
                class176.field2609 = class190.field2829 * 15 + (class30.field401 ? 26 : 22);
                class115.field1761 = 0;
                class23.field347 = var6;
                class242.field3633 = var5;
                class163.field2466 = var1;
            }
        } else if (class317.field4783 == class207.field3140 && class28.field387 == class121.field1897) {
            class242.field3633 = var5;
            class115.field1761 = 0;
            class176.field2609 = (class30.field401 ? 26 : 22) + class190.field2829 * 15;
            class163.field2466 = var1;
            class5.field27 = true;
            class23.field347 = var6;
        } else {
            class115.field1761 = 1;
            class136.field2066 = class207.field3140;
            class103.field1642 = class28.field387;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 138)
    public static final void method1964(int arg0) {
        field4269++;
        int var1 = class301.field4604;
        int var2 = class147.field2210;
        int var3 = class13.field152 - var2 - class136.field2071;
        int var4 = class40.field480 - class251.field3747 - var1;
        if (var2 > 0 || var3 > 0 || var1 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class90.field1344 != null) {
                    var5 = class90.field1344;
                } else if (class106.field1661 == null) {
                    var5 = class274.field4200.field3963;
                } else {
                    var5 = class106.field1661;
                }
                int var6 = 0;
                int var7 = 0;
                if (class106.field1661 == var5) {
                    Insets var8 = class106.field1661.getInsets();
                    var7 = var8.left;
                    var6 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var2 > 0) {
                    var9.fillRect(var7, var6, var2, class40.field480);
                }
                if (var1 > 0) {
                    var9.fillRect(var7, var6, class13.field152, var1);
                }
                if (var3 > 0) {
                    var9.fillRect(var7 + class13.field152 - var3, var6, var3, class40.field480);
                }
                if (var4 > 0) {
                    var9.fillRect(var7, class40.field480 + var6 - var4, class13.field152, var4);
                }
            } catch (Exception var11) {
            }
        }
        if (arg0 != -19123) {
            method1962(75, 0, 76, -16);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BI)Z", line = 211)
    public static final boolean method1965(byte[] arg0, int arg1) {
        field4265++;
        class263 var2 = new class263(arg0);
        if (arg1 != 26) {
            field4261 = -66;
        }
        int var3 = var2.method1787(false);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1787(false) == 1;
        if (var4) {
            class243.method1652(var2, false);
        }
        class176.method1220(var2, 0);
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V", line = 237)
    public static final void method1966(int arg0, int arg1) {
        if (arg1 != -50) {
            field4264 = -8;
        }
        class284.field4295.method2174(arg1 - 12584, arg0);
        field4267++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 256)
    public static void method1967(int arg0) {
        field4270 = (boolean[][]) null;
        if (arg0 < 55) {
            field4262 = (String) null;
        }
        field4266 = null;
        field4262 = null;
    }

    @OriginalMember(owner = "client!ph", name = "read", descriptor = "()I", line = 268)
    public final int read() {
        class93.method662(-553, 30000L);
        field4273++;
        return -1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V", line = 282)
    public static final void method1968(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4268++;
        class169 var5 = class101.method712(arg0, arg3, 2089666400);
        var5.method1183(false);
        var5.field2530 = arg1;
        var5.field2543 = arg4;
        var5.field2542 = arg2;
    }
}
