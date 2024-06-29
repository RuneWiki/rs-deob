import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class289 extends class10 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Loi;")
    public class53 field4353;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "F")
    public static float field4356 = 0.25F;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Lhn;")
    public static class509 field4354 = null;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "F")
    public static float field4360;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Lgq;")
    public static class358 field4359;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "[Lta;")
    public static class145[] field4358;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lad;I)V")
    public static final void method1863(class295 arg0, int arg1) {
        field4357++;
        if (!class307.field4631 && arg1 < -63) {
            arg0.method2677(-22491);
            class382.field5752--;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lkd;II[B)V")
    public class289(class188 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4353 = class100.method806((byte) -102, arg1, 6406, arg2, false, arg0, 6406, arg3);
        this.field4353.method2270(false, false, 10243);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lcl;Z)I")
    public static final int method1864(class177 arg0, boolean arg1) {
        field4361++;
        int var2 = arg0.field2659;
        class376 var3 = arg0.method948(!arg1);
        if (!arg1) {
            return -104;
        }
        if (arg0.field1926) {
            var2 = arg0.field2666;
        } else if (arg0.field1925 == var3.field5662 || arg0.field1925 == var3.field5672 || arg0.field1925 == var3.field5673 || arg0.field1925 == var3.field5650) {
            var2 = arg0.field2668;
        } else if (arg0.field1925 == var3.field5652 || arg0.field1925 == var3.field5643 || arg0.field1925 == var3.field5648 || arg0.field1925 == var3.field5638) {
            var2 = arg0.field2676;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public static void method1865(int arg0) {
        field4354 = null;
        field4358 = null;
        field4359 = null;
        if (arg0 != 12961) {
            method1863(null, -37);
        }
    }

    static {
        new class234("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }
}
