import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class258 {

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[Lmt;")
    public class83[] field3723 = new class83[100];

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[I")
    public int[] field3726 = new int[3];

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[I")
    public int[] field3731 = new int[100];

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "[Lda;")
    public class326[] field3732 = new class326[8];

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lpn;")
    public static class72 field3727;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Ldb;")
    public static class29 field3733;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lg;")
    public static class470 field3728;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field3722;

    static {
        new class40("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3725 = 0;
        field3727 = new class72(37, 7);
        field3733 = new class29("WTRC", 1);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1585(boolean arg0) {
        field3733 = null;
        field3728 = null;
        if (arg0) {
            field3727 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1586(int arg0, int arg1) {
        if (arg1 == -24134) {
            field3724++;
            if (class480.method2837((byte) -113, arg0)) {
                class73.method372(class284.field4130[arg0], 83, -1);
            }
        }
    }
}
