import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class317 {

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lsi;")
    public class314 field5571 = new class314();

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lud;")
    public static class279 field5569 = class130.method1024("K", 255);

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lo;")
    public static class204 field5566 = new class204();

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field5573 = 0;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "[I")
    public static int[] field5577 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Lok;")
    public static class149 field5574;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lok;")
    public static class149 field5575;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lud;")
    public static class279 field5560;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Lsi;")
    private class314 field5576;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Lsi;", line = 5)
    public final class314 method2240(int arg0) {
        field5562++;
        if (arg0 != 1138) {
            field5577 = (int[]) null;
        }
        class314 var2 = this.field5576;
        if (this.field5571 == var2) {
            this.field5576 = null;
            return null;
        } else {
            this.field5576 = var2.field5538;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JZ)V", line = 29)
    public static final void method2241(long arg0, boolean arg1) {
        field5568++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class167.field3011 < 100 || class165.field2982) || class167.field3011 >= 200) {
            class59.method532(class304.field5397, class60.field1265, 0, 29437);
            return;
        }
        class279 var3 = class72.method631(arg0, 5702).method2016(-32);
        for (int var4 = 0; var4 < class167.field3011; var4++) {
            if (class287.field5123[var4] == arg0) {
                class59.method532(class115.method929(new class279[] { var3, class135.field2457 }, (byte) 60), class60.field1265, 0, 29437);
                return;
            }
        }
        for (int var5 = 0; var5 < class194.field3498; var5++) {
            if (class59.field1250[var5] == arg0) {
                class59.method532(class115.method929(new class279[] { class79.field1519, var3, class304.field5389 }, (byte) 60), class60.field1265, 0, 29437);
                return;
            }
        }
        if (var3.method1990((byte) 98, class72.field1420.field4197)) {
            class59.method532(class102.field1904, class60.field1265, 0, 29437);
            return;
        }
        class298.field5291++;
        class100.field1861[class167.field3011] = var3;
        class287.field5123[class167.field3011] = arg0;
        class247.field4383[class167.field3011] = 0;
        class179.field3250[class167.field3011] = class60.field1265;
        class26.field624[class167.field3011] = 0;
        class87.field1677[class167.field3011] = arg1;
        class162.field2923 = class249.field4443;
        class167.field3011++;
        class314.field5534.method1634(101, 0);
        class314.field5534.method490(arg0, 14886);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 97)
    public static void method2242(int arg0) {
        field5574 = null;
        field5566 = null;
        field5577 = null;
        field5560 = null;
        if (arg0 != 0) {
            method2241(39L, false);
        }
        field5569 = null;
        field5575 = null;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 122)
    public final void method2243(int arg0) {
        field5559++;
        while (true) {
            class314 var2 = this.field5571.field5538;
            if (this.field5571 == var2) {
                if (arg0 <= 63) {
                    field5575 = (class149) null;
                }
                this.field5576 = null;
                return;
            }
            var2.method2221(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)Lsi;", line = 164)
    public final class314 method2244(int arg0) {
        field5565++;
        if (arg0 != 29025) {
            return (class314) null;
        }
        class314 var2 = this.field5576;
        if (this.field5571 == var2) {
            this.field5576 = null;
            return null;
        } else {
            this.field5576 = var2.field5535;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)Lsi;", line = 190)
    public final class314 method2245(int arg0) {
        if (arg0 != -101) {
            return (class314) null;
        }
        field5561++;
        class314 var2 = this.field5571.field5535;
        if (this.field5571 == var2) {
            this.field5576 = null;
            return null;
        } else {
            this.field5576 = var2.field5535;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLsi;)V", line = 217)
    public final void method2246(boolean arg0, class314 arg1) {
        if (arg1.field5535 != null) {
            arg1.method2221(true);
        }
        arg1.field5535 = this.field5571.field5535;
        field5563++;
        arg1.field5538 = this.field5571;
        arg1.field5535.field5538 = arg1;
        arg1.field5538.field5535 = arg1;
        if (!arg0) {
            field5575 = (class149) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)Lsi;", line = 235)
    public final class314 method2247(int arg0) {
        field5564++;
        class314 var2 = this.field5571.field5538;
        if (this.field5571 == var2) {
            return null;
        }
        var2.method2221(true);
        if (arg0 <= 2) {
            method2242(14);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Lsi;", line = 254)
    public final class314 method2248(int arg0) {
        int var2 = 68 % ((arg0 - 36) / 59);
        field5570++;
        class314 var3 = this.field5571.field5538;
        if (this.field5571 == var3) {
            this.field5576 = null;
            return null;
        } else {
            this.field5576 = var3.field5538;
            return var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lsi;B)V", line = 279)
    public final void method2249(class314 arg0, byte arg1) {
        field5567++;
        if (arg0.field5535 != null) {
            arg0.method2221(true);
        }
        arg0.field5535 = this.field5571;
        arg0.field5538 = this.field5571.field5538;
        arg0.field5535.field5538 = arg0;
        if (arg1 <= 86) {
            method2241(6L, true);
        }
        arg0.field5538.field5535 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 324)
    public class317() {
        this.field5571.field5535 = this.field5571;
        this.field5571.field5538 = this.field5571;
    }
}
