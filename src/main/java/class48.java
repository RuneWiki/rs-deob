import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class48 {

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[F")
    public static float[] field727 = new float[4];

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "D")
    public static double field723;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Lnb;")
    public class319 field725;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lgs;")
    public class48 field726;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)[Lsca;")
    public static final class49[] method368(byte arg0) {
        field729++;
        int var1 = 76 / ((14 - arg0) / 46);
        return new class49[] { class589.field7858, class334.field4862, class31.field488 };
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method369(int arg0) {
        if (arg0 == 15435) {
            field727 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public final void method370(int arg0) {
        field724++;
        if (class365.field5313 >= 500) {
            return;
        }
        if (arg0 != -25016) {
            field722 = 33;
        }
        this.field725 = null;
        this.field726 = class736.field10189;
        class365.field5313++;
        class736.field10189 = this;
    }
}
