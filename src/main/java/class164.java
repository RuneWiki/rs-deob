import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class164 {

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "Lefa;")
    public class184 field2590 = new class184();

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field2593 = -1;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "Lmia;")
    public static class63 field2602 = new class63(46, 3);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "Lefa;")
    private class184 field2598;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lefa;B)V", line = 4)
    public final void method1192(class184 arg0, byte arg1) {
        if (arg0.field2819 != null) {
            arg0.method1304((byte) 7);
        }
        field2601++;
        arg0.field2819 = this.field2590;
        if (arg1 == -119) {
            arg0.field2812 = this.field2590.field2812;
            arg0.field2819.field2812 = arg0;
            arg0.field2812.field2819 = arg0;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 23)
    public static void method1193(byte arg0) {
        if (arg0 <= 105) {
            field2604 = -100;
        }
        field2602 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Lefa;", line = 34)
    public final class184 method1194(int arg0) {
        if (arg0 != 46) {
            this.method1203(null, (byte) -126);
        }
        field2589++;
        class184 var2 = this.field2598;
        if (this.field2590 == var2) {
            this.field2598 = null;
            return null;
        } else {
            this.field2598 = var2.field2819;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)Lefa;", line = 54)
    public final class184 method1195(int arg0) {
        field2596++;
        class184 var2 = this.field2590.field2812;
        if (arg0 != 0) {
            this.method1192(null, (byte) -18);
        }
        if (this.field2590 == var2) {
            this.field2598 = null;
            return null;
        } else {
            this.field2598 = var2.field2812;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)I", line = 74)
    public final int method1196(int arg0) {
        field2595++;
        if (arg0 != -2) {
            field2593 = -65;
        }
        int var2 = 0;
        class184 var3 = this.field2590.field2812;
        while (this.field2590 != var3) {
            var3 = var3.field2812;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)Z", line = 96)
    public final boolean method1197(int arg0) {
        field2600++;
        if (arg0 != 0) {
            field2593 = 117;
        }
        return this.field2590.field2812 == this.field2590;
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)Lefa;", line = 108)
    public final class184 method1198(byte arg0) {
        field2586++;
        if (arg0 < 35) {
            return null;
        }
        class184 var2 = this.field2590.field2812;
        if (this.field2590 == var2) {
            return null;
        } else {
            var2.method1304((byte) 7);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)I", line = 139)
    public static final int method1199(int arg0, int arg1, int arg2) {
        if (arg2 != 65408) {
            method1204(-25);
        }
        field2588++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V", line = 340)
    public class164() {
        this.field2590.field2819 = this.field2590;
        this.field2590.field2812 = this.field2590;
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V", line = 165)
    public final void method1200(int arg0) {
        if (arg0 <= 40) {
            return;
        }
        while (true) {
            class184 var2 = this.field2590.field2812;
            if (this.field2590 == var2) {
                field2599++;
                this.field2598 = null;
                return;
            }
            var2.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)Lefa;", line = 191)
    public final class184 method1201(int arg0) {
        if (arg0 != 2) {
            this.method1205(true);
        }
        field2603++;
        class184 var2 = this.field2598;
        if (this.field2590 == var2) {
            this.field2598 = null;
            return null;
        } else {
            this.field2598 = var2.field2812;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lada;I)V", line = 213)
    public final void method1202(class164 arg0, int arg1) {
        this.method1206(this.field2590.field2812, (byte) 72, arg0);
        if (arg1 > -78) {
            this.method1194(52);
        }
        field2605++;
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(Lefa;B)V", line = 227)
    public final void method1203(class184 arg0, byte arg1) {
        field2587++;
        int var3 = 65 % ((arg1 - 23) / 49);
        if (arg0.field2819 != null) {
            arg0.method1304((byte) 7);
        }
        arg0.field2812 = this.field2590;
        arg0.field2819 = this.field2590.field2819;
        arg0.field2819.field2812 = arg0;
        arg0.field2812.field2819 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V", line = 248)
    public static final void method1204(int arg0) {
        field2594++;
        class390 var1 = null;
        try {
            class197 var2 = class179.field2759.method4060("2", true, (byte) 53);
            while (var2.field2986 == 0) {
                class277.method1759(1L, -103);
            }
            if (var2.field2986 == 1) {
                var1 = (class390) var2.field2990;
                byte[] var3 = new byte[(int) var1.method2505((byte) 94)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2500(var3, var4, (byte) 103, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class206.method1398(-2, new class645(var3));
            }
        } catch (Exception var7) {
        }
        if (arg0 != 0) {
            return;
        }
        try {
            if (var1 != null) {
                var1.method2504(arg0 - 70);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Lefa;", line = 298)
    public final class184 method1205(boolean arg0) {
        field2592++;
        if (arg0) {
            method1199(61, -17, 16);
        }
        class184 var2 = this.field2590.field2819;
        if (this.field2590 == var2) {
            this.field2598 = null;
            return null;
        } else {
            this.field2598 = var2.field2819;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lefa;BLada;)V", line = 320)
    private final void method1206(class184 arg0, byte arg1, class164 arg2) {
        field2597++;
        class184 var4 = this.field2590.field2819;
        int var5 = 8 % ((-arg1 - 28) / 37);
        this.field2590.field2819 = arg0.field2819;
        arg0.field2819.field2812 = this.field2590;
        if (this.field2590 != arg0) {
            arg0.field2819 = arg2.field2590.field2819;
            arg0.field2819.field2812 = arg0;
            arg2.field2590.field2819 = var4;
            var4.field2812 = arg2.field2590;
        }
    }
}
