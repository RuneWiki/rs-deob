import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class510 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lug;")
    private class392 field7526;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lpi;")
    public static class342 field7523 = new class342("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7529 = 0;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lug;")
    public static class392 field7530 = new class392();

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lrn;")
    public static class174 field7532 = new class174(50, 3);

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Lrn;")
    public static class174 field7533 = new class174(57, -1);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lqg;")
    private class320 field7527;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lqg;")
    public final class320 method3055(int arg0) {
        field7531++;
        int var2 = -114 / ((arg0 - 35) / 50);
        class320 var3 = this.field7527;
        if (this.field7526.field5929 == var3) {
            this.field7527 = null;
            return null;
        } else {
            this.field7527 = var3.field4901;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lqg;")
    public final class320 method3056(boolean arg0) {
        if (arg0) {
            return null;
        }
        field7528++;
        class320 var2 = this.field7526.field5929.field4901;
        if (this.field7526.field5929 == var2) {
            this.field7527 = null;
            return null;
        } else {
            this.field7527 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static void method3057(int arg0) {
        if (arg0 != 57) {
            method3057(8);
        }
        field7532 = null;
        field7533 = null;
        field7523 = null;
        field7530 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILug;)V")
    public final void method3058(int arg0, class392 arg1) {
        if (arg0 != 50) {
            field7529 = -71;
        }
        field7524++;
        this.field7526 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class510() {
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lug;)V")
    public class510(class392 arg0) {
        this.field7526 = arg0;
    }
}
