import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class293 extends class82 {

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "[I")
    public static int[] field4607 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field4618 = -1;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4621 = "wave2:";

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[I")
    public static int[] field4619 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "B")
    public static byte field4624;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "F")
    public static float field4617;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field4608;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lam;")
    public static class180 field4610;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[I")
    public int[] field4606;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[I")
    public int[] field4614;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "[I")
    public static int[] field4620;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "[I")
    public int[] field4623;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "[Lng;")
    public class78[] field4613;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "[Lng;")
    public class78[] field4622;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[[[B")
    public byte[][][] field4611;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILfl;)Llh;")
    public static final class295 method1938(int arg0, class248 arg1) {
        class295 var2 = new class295();
        var2.field4671 = arg1.method1575(false);
        if (arg0 <= 116) {
            field4619 = null;
        }
        field4616++;
        var2.field4676 = class231.method1473((byte) -33, var2.field4671);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
    public static final void method1939(byte arg0) {
        class59.field936.method1669(12345678);
        if (arg0 == -65) {
            field4615++;
            class32.field468.method366((byte) 9);
            class272.field4089.method366((byte) 9);
        }
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V")
    public static void method1940(int arg0) {
        field4619 = null;
        field4607 = null;
        field4621 = null;
        if (arg0 == -1006) {
            field4620 = null;
            field4610 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "(I)Z")
    public static final boolean method1941(int arg0) {
        field4609++;
        if (class282.field4211 == 0) {
            return arg0 == -30235 ? class86.field1383.method252((byte) -60) : false;
        } else {
            return true;
        }
    }
}
