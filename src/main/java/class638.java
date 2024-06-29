import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class638 {

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field8960 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field8963 = 1407;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Leda;")
    public static class14 field8958 = new class14(5);

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lfu;")
    public class638 field8961;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "Lfu;")
    public class638 field8962;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
    public static void method3609(int arg0) {
        field8960 = null;
        field8958 = null;
        if (arg0 != -22693) {
            method3609(37);
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    public final void method3610(int arg0) {
        field8959++;
        if (this.field8961 == null) {
            return;
        }
        if (arg0 != -25057) {
            field8960 = null;
        }
        this.field8961.field8962 = this.field8962;
        this.field8962.field8961 = this.field8961;
        this.field8962 = null;
        this.field8961 = null;
    }
}
