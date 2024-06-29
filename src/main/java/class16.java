import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class16 {

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lec;")
    public static class40 field209 = new class40("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[Lul;")
    public static class329[] field211 = new class329[6];

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lec;")
    public static class40 field210 = new class40("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    public static int[] field213 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field214 = new int[16384];

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
    public static int[] field212 = new int[16384];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[[B")
    public static byte[][] field215;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field212[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field214[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lpc;", line = 9)
    public static final class37 method106(byte arg0, int arg1) {
        if (arg0 != -38) {
            method106((byte) -80, 43);
        }
        field206++;
        class37 var2 = (class37) class352.field5060.method1599((byte) 13, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class419.field6035.method2768(arg0 ^ 0x4FD2, arg1, 0);
        } else {
            var3 = class368.field5258.method2768(-20472, arg1 & 0x7FFF, 0);
        }
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method189(new class179(var3), 99);
        }
        if (arg1 >= 32768) {
            var4.method196((byte) 121);
        }
        class352.field5060.method1597(var4, (long) arg1, -30892);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lbh;B)V", line = 43)
    public static final void method107(class13 arg0, byte arg1) {
        arg0.field194 = null;
        field208++;
        if (arg1 <= 52) {
            field211 = null;
        }
        if (class20.field287 < 20) {
            class174.field2090.method2336(arg0, (byte) -56);
            class20.field287++;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)Z", line = 61)
    public static final boolean method108(boolean arg0, int arg1) {
        field207++;
        if (arg1 != -21811) {
            method106((byte) 4, -15);
        }
        boolean var2 = class231.field3205.method1373();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class231.field3205.method1398();
        } else if (!class231.field3205.method1393()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class487.field6914 = arg0;
            class120.method582(arg1 ^ 0x5533, class42.field512);
            return true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 101)
    public static void method109(byte arg0) {
        field212 = null;
        field214 = null;
        field213 = null;
        field209 = null;
        field215 = null;
        int var1 = 53 / ((37 - arg0) / 62);
        field210 = null;
        field211 = null;
    }
}
