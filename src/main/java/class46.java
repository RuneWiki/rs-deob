import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public abstract class class46 {

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lij;")
    public static class421 field547;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "[I")
    public static int[] field546;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "[Z")
    public static boolean[] field544;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
    public abstract void method300(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZII)V")
    public abstract void method301(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method302(int arg0) {
        field544 = null;
        field547 = null;
        field546 = null;
        if (arg0 <= 55) {
            method302(29);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(III)V")
    public class46(int arg0, int arg1, int arg2) {
        this.field548 = arg2;
        this.field549 = arg0;
        this.field545 = arg1;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(III)V")
    public abstract void method303(int arg0, int arg1, int arg2);
}
