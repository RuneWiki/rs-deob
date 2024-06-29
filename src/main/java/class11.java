import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class129 {

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
    public static int[] field188 = new int[32];

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lrd;")
    public static class173 field189 = class133.method843("Clientscript error in: ", -106);

    @OriginalMember(owner = "client!b", name = "y", descriptor = "Lrd;")
    public static class173 field185 = class133.method843("Schlie-8en", 25);

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[Lsa;")
    public static class180[] field178;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "[S")
    public static short[] field182;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Z")
    public static final boolean method68(boolean arg0, int arg1) {
        field179++;
        if (arg0) {
            field188 = null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method69(int arg0) {
        field185 = null;
        field189 = null;
        int var1 = -31 % ((arg0 + 23) / 40);
        field178 = null;
        field188 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
    public static final int method70(int arg0, int arg1) {
        field186++;
        if (arg0 >= -18) {
            field181 = 80;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        this.field184 = arg0;
        this.field183 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static final void method71(int arg0) {
        if (arg0 != -18070) {
            method69(-36);
        }
        field187++;
        if (class63.field1243 > 0) {
            class182.method1240(false);
        } else {
            class148.method978(40, 8780);
            class133.field2523 = class34.field738;
            class34.field738 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field188[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
