import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class472 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lfn;")
    public static class52 field6615 = new class52(1, 7);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ltm;")
    public static class112 field6617 = new class112("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lnb;")
    public class472 field6613;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lnb;")
    public class472 field6614;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lfn;")
    public static class52 field6619;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Z")
    public static boolean field6618;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 11)
    public static void method2772(int arg0) {
        field6615 = null;
        if (arg0 != 7) {
            field6619 = null;
        }
        field6617 = null;
        field6619 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 23)
    public final void method2773(int arg0) {
        field6612++;
        if (this.field6613 == null) {
            return;
        }
        this.field6613.field6614 = this.field6614;
        this.field6614.field6613 = this.field6613;
        this.field6614 = null;
        if (arg0 == 26979) {
            this.field6613 = null;
        }
    }
}
