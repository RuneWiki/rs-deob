import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class17 {

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "Leda;")
    public static class116 field261 = new class116(15, -1);

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "Lvo;")
    public static class345 field263;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    public static void method196(byte arg0) {
        int var1 = 34 % ((48 - arg0) / 63);
        field261 = null;
        field263 = null;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
    public abstract void method65(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V")
    public abstract void method66(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIZ)V")
    public abstract void method64(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(III)V")
    public class17(int arg0, int arg1, int arg2) {
        this.field262 = arg0;
        this.field260 = arg2;
        this.field259 = arg1;
    }
}
