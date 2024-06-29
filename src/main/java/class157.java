import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class157 {

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "Lfr;")
    private class375 field2259 = new class375();

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "Lgm;")
    private class108 field2266 = new class108();

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    private int field2262;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lkea;")
    private class213 field2264;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "[[I")
    public static int[][] field2261 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "[I")
    public static int[] field2268 = new int[13];

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1089(int arg0) {
        field2263++;
        if (class554.field7847 != null || arg0 != 0) {
            return;
        }
        int var1 = class142.field2102;
        int var2 = class525.field7410;
        int var3 = class319.field4702 - class487.field6930 - var1;
        int var4 = class443.field6457 - class31.field494 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class683.field9634 != null) {
                var5 = class683.field9634;
            } else if (class421.field6129 == null) {
                var5 = class108.field1660;
            } else {
                var5 = class421.field6129;
            }
            int var6 = 0;
            int var7 = 0;
            if (class683.field9634 == var5) {
                Insets var8 = class683.field9634.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class443.field6457);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class319.field4702, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class319.field4702 + var6 - var3, var7, var3, class443.field6457);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class443.field6457 + var7 - var4, class319.field4702, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V", line = 70)
    public final void method1090(int arg0) {
        field2265++;
        this.field2266.method846((byte) 115);
        this.field2264.method1409((byte) 119);
        this.field2259 = new class375();
        if (arg0 < 103) {
            this.method1097(48L, (byte) 39);
        }
        this.field2262 = this.field2269;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZ)Z", line = 84)
    public static final boolean method1091(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2268 = null;
        }
        field2258++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        class550 var3 = class101.field1572.method2617((byte) -99, arg0);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method3110(true, arg1);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V", line = 105)
    public static void method1092(boolean arg0) {
        field2268 = null;
        if (arg0) {
            field2268 = null;
        }
        field2261 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 121)
    public static final String method1093(String arg0, byte arg1) {
        field2270++;
        String var2 = class369.method2237(class273.method1801(arg0, -124), true);
        if (arg1 >= -102) {
            method1092(true);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V", line = 137)
    public static final void method1094(int arg0) {
        field2257++;
        if (class282.field4228.method162()) {
            class282.field4228.method111(class31.field486);
            class169.method1163(110);
            class282.field4228.method124(class31.field486);
            class282.field4228.method143(class31.field486);
        } else {
            class33.method363(-30052, class328.field4859);
        }
        class158.method1100(-107);
        if (arg0 != 4897) {
            field2261 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(JBLfr;)V", line = 168)
    public final void method1095(long arg0, byte arg1, class375 arg2) {
        if (arg1 > -106) {
            this.field2262 = -75;
        }
        field2256++;
        if (this.field2262 == 0) {
            class375 var5 = this.field2266.method847(0);
            var5.method3678(-1);
            var5.method2258((byte) 112);
            if (this.field2259 == var5) {
                class375 var6 = this.field2266.method847(0);
                var6.method3678(-1);
                var6.method2258((byte) 126);
            }
        } else {
            this.field2262--;
        }
        this.field2264.method1403((byte) -18, arg2, arg0);
        this.field2266.method852(true, arg2);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ)I", line = 197)
    public static final int method1096(int arg0, boolean arg1) {
        if (arg1) {
            method1089(-29);
        }
        field2255++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(I)V", line = 260)
    public class157(int arg0) {
        this.field2269 = arg0;
        this.field2262 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2264 = new class213(var2);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)Lfr;", line = 223)
    public final class375 method1097(long arg0, byte arg1) {
        field2260++;
        class375 var4 = (class375) this.field2264.method1405(arg0, (byte) -27);
        if (arg1 != -121) {
            this.field2266 = null;
        }
        if (var4 != null) {
            this.field2266.method852(true, var4);
        }
        return var4;
    }
}
