import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class495 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Llc;")
    public static class435 field7115 = new class435(58, -2);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[[Z")
    public static boolean[][] field7121 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Llc;")
    public static class435 field7120 = new class435(70, 4);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[F")
    public static float[] field7124 = new float[16384];

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[F")
    public static float[] field7123 = new float[16384];

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "F")
    public static float field7122;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lka;")
    public class282 field7119;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lr;")
    public class704 field7117;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method3009(int arg0) {
        client.field6417 = null;
        field7116++;
        if (class416.field5919 && class184.method1305(1) != 1) {
            class259.method1721(0, -17748, 0, class369.field5392 == 3 || class369.field5392 == 7, class237.method1656(-113), class261.method1732(-7569));
        }
        int var1 = 0;
        int var2 = 0;
        if (class416.field5919) {
            var1 = class352.method2243(68);
            var2 = class695.method3915((byte) 86);
        }
        class548.method3298(arg0, var2, var1, var2, class565.field8187 + var2, class68.field1042 + var1, class346.field4771, var1, arg0 ^ 0x338DCA37);
        if (client.field6417 != null) {
            class530.method3212(class348.field5155, var1, var2, true, client.field6417, var2 + class565.field8187, class68.field1042 + var1, 20028, class94.field1345, class83.field1211.field2128, -1412584499);
            client.field6417 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method3010(int arg0) {
        field7115 = null;
        field7124 = null;
        field7121 = null;
        field7120 = null;
        field7123 = null;
        if (arg0 != -2) {
            method3010(83);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7123[var2] = (float) Math.sin((double) var2 * var0);
            field7124[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
