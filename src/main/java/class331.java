import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class331 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lte;")
    public class320 field5269 = new class320();

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field5267 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
    public static boolean field5268 = false;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
    public static int[] field5275 = new int[4096];

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5282;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lte;")
    private class320 field5281;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lte;", line = 5)
    public final class320 method2291(int arg0) {
        class320 var2 = this.field5281;
        field5270++;
        int var3 = 126 % ((1 - arg0) / 60);
        if (this.field5269 == var2) {
            this.field5281 = null;
            return null;
        } else {
            this.field5281 = var2.field5068;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 25)
    public static final void method2292(Component arg0, boolean arg1) {
        field5279++;
        arg0.addMouseListener(class119.field2062);
        arg0.addMouseMotionListener(class119.field2062);
        arg0.addFocusListener(class119.field2062);
        if (!arg1) {
            method2294(35, -123, -87, 27);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Lte;", line = 42)
    public final class320 method2293(int arg0) {
        field5274++;
        class320 var2 = this.field5269.field5065;
        if (arg0 != 14585) {
            this.field5269 = (class320) null;
        }
        if (this.field5269 == var2) {
            this.field5281 = null;
            return null;
        } else {
            this.field5281 = var2.field5065;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)Z", line = 64)
    public static final boolean method2294(int arg0, int arg1, int arg2, int arg3) {
        if (class31.method291(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class317.method2182(var4 + 1, class137.field2487[arg0][arg1][arg2] + arg3, var5 + 1) && class317.method2182(var4 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class317.method2182(var4 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class317.method2182(var4 + 1, class137.field2487[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lte;B)V", line = 80)
    public final void method2295(class320 arg0, byte arg1) {
        if (arg0.field5065 != null) {
            arg0.method2195(-1);
        }
        arg0.field5065 = this.field5269;
        arg0.field5068 = this.field5269.field5068;
        arg0.field5065.field5068 = arg0;
        arg0.field5068.field5065 = arg0;
        field5271++;
        int var3 = -31 % ((-arg1 - 23) / 59);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Z", line = 101)
    public final boolean method2296(int arg0) {
        if (arg0 >= -32) {
            method2292((Component) null, false);
        }
        field5265++;
        return this.field5269.field5068 == this.field5269;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5275[var0] = class120.method1020((byte) -119, var0);
        }
        field5276 = 0;
        field5282 = "Cancel";
        field5280 = 0;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lte;", line = 119)
    public final class320 method2297(int arg0) {
        field5273++;
        if (arg0 != 14204) {
            this.method2301((byte) 71);
        }
        class320 var2 = this.field5269.field5068;
        if (this.field5269 == var2) {
            this.field5281 = null;
            return null;
        } else {
            this.field5281 = var2.field5068;
            return var2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lte;", line = 142)
    public final class320 method2298(byte arg0) {
        int var2 = -9 % ((arg0 + 29) / 37);
        field5264++;
        class320 var3 = this.field5281;
        if (this.field5269 == var3) {
            this.field5281 = null;
            return null;
        } else {
            this.field5281 = var3.field5065;
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lpi;B)Lkk;", line = 162)
    public static final class256 method2299(class336 arg0, byte arg1) {
        field5266++;
        if (arg1 != 115) {
            method2299((class336) null, (byte) 81);
        }
        return new class256(arg0.method2326(-122), arg0.method2326(-81), arg0.method2326(69), arg0.method2326(127), arg0.method2317(arg1 + 21688), arg0.method2364(-9069));
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V", line = 184)
    public static void method2300(int arg0) {
        if (arg0 <= 10) {
            field5276 = 67;
        }
        field5275 = null;
        field5282 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lte;", line = 198)
    public final class320 method2301(byte arg0) {
        class320 var2 = this.field5269.field5068;
        field5263++;
        if (this.field5269 == var2) {
            return null;
        }
        if (arg0 < 80) {
            field5277 = -83;
        }
        var2.method2195(-1);
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V", line = 214)
    public final void method2302(int arg0) {
        if (arg0 != 128) {
            method2299((class336) null, (byte) -17);
        }
        while (true) {
            class320 var2 = this.field5269.field5068;
            if (this.field5269 == var2) {
                this.field5281 = null;
                field5272++;
                return;
            }
            var2.method2195(-1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLte;)V", line = 237)
    public final void method2303(byte arg0, class320 arg1) {
        if (arg0 != -124) {
            this.field5281 = (class320) null;
        }
        if (arg1.field5065 != null) {
            arg1.method2195(-1);
        }
        field5278++;
        arg1.field5065 = this.field5269.field5065;
        arg1.field5068 = this.field5269;
        arg1.field5065.field5068 = arg1;
        arg1.field5068.field5065 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 286)
    public class331() {
        this.field5269.field5065 = this.field5269;
        this.field5269.field5068 = this.field5269;
    }
}
