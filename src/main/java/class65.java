import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class65 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public int[] field863;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    public int[] field864;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    public static boolean field865;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field859;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
    public static void method446(int arg0) {
        field859 = null;
        if (arg0 != 0) {
            field859 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V", line = 26)
    public class65(int arg0) {
        this.field860 = arg0;
        this.field863 = new int[this.field860];
        this.field864 = new int[this.field860];
    }
}
