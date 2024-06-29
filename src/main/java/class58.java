import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class58 {

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lhb;")
    public class154 field808 = new class154();

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field812 = 0;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field799 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Lhb;")
    private class154 field813;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lnh;")
    public static class305 field806;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        field799 = null;
        int var1 = -65 / ((arg0 - 76) / 45);
        field806 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZI)I")
    public static final int method360(int arg0, int arg1, boolean arg2, int arg3) {
        field809++;
        if (class185.field2812 == null) {
            return 0;
        }
        if (arg2) {
            method359(70);
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class164.field2333[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var7) * class185.field2812[var6][var4][var5] + class185.field2812[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = arg0 & 0x7F;
        int var10 = (128 - var7) * class185.field2812[var6][var4][var5 + 1] + class185.field2812[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)I")
    public static final int method361(int arg0) {
        if (arg0 != 2) {
            field799 = null;
        }
        field798++;
        return 2;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Lhb;")
    public final class154 method362(boolean arg0) {
        class154 var2 = this.field813;
        if (arg0) {
            method360(34, 26, false, -114);
        }
        field805++;
        if (this.field808 == var2) {
            this.field813 = null;
            return null;
        } else {
            this.field813 = var2.field2144;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Lhb;")
    public final class154 method363(int arg0) {
        field804++;
        class154 var2 = this.field808.field2137;
        if (arg0 != 128) {
            this.method362(false);
        }
        if (this.field808 == var2) {
            this.field813 = null;
            return null;
        } else {
            this.field813 = var2.field2137;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Lhb;")
    public final class154 method364(int arg0) {
        field811++;
        class154 var2 = this.field808.field2144;
        if (arg0 <= 112) {
            this.method370((byte) 3, (class154) null);
        }
        if (this.field808 == var2) {
            return null;
        } else {
            var2.method962(128);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method365(byte arg0) {
        while (true) {
            class154 var2 = this.field808.field2144;
            if (this.field808 == var2) {
                field802++;
                int var3 = -41 / ((arg0 - 8) / 46);
                this.field813 = null;
                return;
            }
            var2.method962(128);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILam;)I")
    public static final int method366(int arg0, class314 arg1) {
        field814++;
        if (arg0 != 3640) {
            return 46;
        }
        int var2 = arg1.field5065;
        class85 var3 = arg1.method1685(0);
        if (arg1.field4102 == var3.field1201) {
            var2 = arg1.field5064;
        } else if (arg1.field4102 == var3.field1199 || arg1.field4102 == var3.field1223 || arg1.field4102 == var3.field1220 || arg1.field4102 == var3.field1214) {
            var2 = arg1.field5055;
        } else if (arg1.field4102 == var3.field1192 || arg1.field4102 == var3.field1229 || arg1.field4102 == var3.field1217 || arg1.field4102 == var3.field1231) {
            var2 = arg1.field5050;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lhb;")
    public final class154 method367(byte arg0) {
        field803++;
        class154 var2 = this.field813;
        if (this.field808 == var2) {
            this.field813 = null;
            return null;
        }
        if (arg0 != 119) {
            field812 = 81;
        }
        this.field813 = var2.field2137;
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLhb;)V")
    public final void method368(byte arg0, class154 arg1) {
        int var3 = 100 / ((arg0 - 58) / 59);
        if (arg1.field2137 != null) {
            arg1.method962(128);
        }
        arg1.field2137 = this.field808;
        field801++;
        arg1.field2144 = this.field808.field2144;
        arg1.field2137.field2144 = arg1;
        arg1.field2144.field2137 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Lhb;")
    public final class154 method369(byte arg0) {
        field800++;
        if (arg0 >= -73) {
            this.method367((byte) -54);
        }
        class154 var2 = this.field808.field2144;
        if (this.field808 == var2) {
            this.field813 = null;
            return null;
        } else {
            this.field813 = var2.field2144;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BLhb;)V")
    public final void method370(byte arg0, class154 arg1) {
        if (arg0 != -22) {
            field807 = 93;
        }
        field810++;
        if (arg1.field2137 != null) {
            arg1.method962(arg0 ^ 0xFFFFFF6A);
        }
        arg1.field2137 = this.field808.field2137;
        arg1.field2144 = this.field808;
        arg1.field2137.field2144 = arg1;
        arg1.field2144.field2137 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class58() {
        this.field808.field2137 = this.field808;
        this.field808.field2144 = this.field808;
    }
}
