import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class594 {

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Lh;")
    private class571 field8601 = new class571(128);

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lan;")
    private class21 field8600;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "Lej;")
    public static class104 field8599 = new class104("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method3518(int arg0) {
        if (arg0 == 13376) {
            field8599 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Lvo;")
    public final class37 method3519(int arg0, int arg1) {
        field8602++;
        class571 var3 = this.field8601;
        class37 var4;
        synchronized (this.field8601) {
            var4 = (class37) this.field8601.method3252((long) arg1, (byte) 52);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1) {
            this.method3519(106, -73);
        }
        byte[] var5 = this.field8600.method240(class490.method2846(arg1, (byte) -70), class118.method830((byte) 79, arg1), (byte) -124);
        class37 var6 = new class37();
        if (var5 != null) {
            var6.method388(new class11(var5), 2730);
        }
        class571 var7 = this.field8601;
        synchronized (this.field8601) {
            this.field8601.method3243(var6, (long) arg1, -84);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class594(class111 arg0, int arg1, class21 arg2) {
        this.field8600 = arg2;
        if (this.field8600 != null) {
            int var4 = this.field8600.method239(-34) - 1;
            this.field8600.method231(var4, -126);
        }
    }
}
