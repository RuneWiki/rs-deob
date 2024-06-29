import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class430 extends class154 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field5862;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    public boolean field5866;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lft;")
    public class4 field5868;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field5861 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lsea;")
    public static class726 field5863;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
    public boolean field5860;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
    public boolean field5864;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
    public boolean field5865;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method2525(int arg0) {
        if (arg0 == 0) {
            field5863 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILft;IZ)V")
    public class430(int arg0, class4 arg1, int arg2, boolean arg3) {
        this.field5862 = arg2;
        this.field5866 = arg3;
        this.field5868 = arg1;
        this.field5867 = arg0;
    }
}
