import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class163 {

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public int field2167 = 2;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "Z")
    public boolean field2172 = false;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public int field2173 = 64;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public int field2168 = -1;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public int field2171 = 1;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public int field2177 = 64;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "Z")
    public boolean field2176 = false;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "Z")
    public static boolean field2174 = false;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "Lqp;")
    public static class586 field2175 = new class586(29, -1);

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Lica;")
    public static class205 field2178 = new class205(8);

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "Z")
    public static boolean field2181 = false;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "[I")
    public static int[] field2183 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "[C")
    public static char[] field2182 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "Ldda;")
    public static class597 field2179;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Ldda;")
    public static class597 field2180;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
    public static final boolean method948(int arg0, int arg1, int arg2) {
        if (arg2 != 11808) {
            method952((byte) 48);
        }
        field2170++;
        return class203.method1310((byte) -126, arg0, arg1) | (arg1 & 0x70000) != 0 || class517.method3074(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILps;B)V")
    private final void method949(int arg0, int arg1, class428 arg2, byte arg3) {
        if (arg3 > -61) {
            this.field2171 = -26;
        }
        field2169++;
        if (arg1 == 1) {
            this.field2168 = arg2.method2620(119);
            if (this.field2168 == 65535) {
                this.field2168 = -1;
                return;
            }
        } else if (arg1 == 2) {
            this.field2173 = arg2.method2620(106) + 1;
            this.field2177 = arg2.method2620(21) + 1;
            return;
        } else if (arg1 == 3) {
            arg2.method2570((byte) 57);
            return;
        } else if (arg1 == 4) {
            this.field2167 = arg2.method2561((byte) -14);
        } else {
            if (arg1 == 5) {
                this.field2171 = arg2.method2561((byte) 121);
            } else if (arg1 == 6) {
                this.field2176 = true;
                return;
            } else if (arg1 == 7) {
                this.field2172 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZILps;)V")
    public final void method950(boolean arg0, int arg1, class428 arg2) {
        while (true) {
            int var4 = arg2.method2561((byte) 115);
            if (var4 == 0) {
                if (arg0) {
                    return;
                }
                field2166++;
                return;
            }
            this.method949(arg1, var4, arg2, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static void method951(int arg0) {
        if (arg0 != 2) {
            method952((byte) 122);
        }
        field2182 = null;
        field2175 = null;
        field2178 = null;
        field2179 = null;
        field2183 = null;
        field2180 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
    public static final void method952(byte arg0) {
        if (arg0 == -23) {
            field2165++;
            class563.field8344.method2037(true);
        }
    }
}
