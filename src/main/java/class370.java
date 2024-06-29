import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class370 {

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "Z")
    public static boolean field5657 = false;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Lof;")
    public static class446 field5653 = new class446("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field5638;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field5646;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field5647;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public int field5649;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public int field5651;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public int field5652;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public int field5655;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public int field5658;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lgw;")
    public static class117 field5640;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "Luu;")
    public static class191 field5659;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 3)
    public static void method2347(int arg0) {
        field5659 = null;
        if (arg0 != 10) {
            field5640 = null;
        }
        field5653 = null;
        field5640 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V", line = 28)
    public static final void method2348(int arg0, int arg1) {
        field5636++;
        class330 var2 = class112.field1560;
        synchronized (class112.field1560) {
            if (arg0 != 10) {
                field5653 = null;
            }
            class112.field1560.method2140(arg0 - 117, arg1);
        }
        class330 var3 = class491.field7249;
        synchronized (class491.field7249) {
            class491.field7249.method2140(-108, arg1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;)I", line = 51)
    public static final int method2349(int arg0, String arg1) {
        if (arg0 != 10) {
            field5659 = null;
        }
        field5637++;
        return class163.method1051(arg1, 10, false, true);
    }
}
