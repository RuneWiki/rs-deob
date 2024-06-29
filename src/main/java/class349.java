import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class349 extends class551 {

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public int field5062 = 0;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[Llt;")
    public static class255[] field5063 = new class255[32];

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lnj;")
    public static class487 field5060 = new class487("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[I")
    public static int[] field5064 = new int[13];

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "Lrb;")
    public static class352 field5067 = new class352(13, 0, 1, 0);

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Llda;")
    public static class192 field5066;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Ldda;")
    public static class597 field5065;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)V", line = 4)
    public static void method2137(int arg0) {
        if (arg0 != 1) {
            method2137(68);
        }
        field5065 = null;
        field5060 = null;
        field5067 = null;
        field5064 = null;
        field5066 = null;
        field5063 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLps;)V", line = 19)
    private final void method2138(int arg0, boolean arg1, class428 arg2) {
        field5059++;
        if (!arg1) {
            field5066 = null;
        }
        if (arg0 == 2) {
            this.field5062 = arg2.method2620(123);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILps;)V", line = 43)
    public final void method2139(int arg0, class428 arg1) {
        field5061++;
        if (arg0 != 25100) {
            method2137(107);
        }
        while (true) {
            int var3 = arg1.method2561((byte) -45);
            if (var3 == 0) {
                return;
            }
            this.method2138(var3, true, arg1);
        }
    }
}
