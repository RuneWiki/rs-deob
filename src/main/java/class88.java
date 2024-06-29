import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class88 {

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "Ldfa;")
    public class165 field920;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "Loh;")
    public static class404 field921;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "Loia;")
    public class88 field922;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Lvba;")
    public final class40 method609(int arg0) {
        field926++;
        return arg0 == 0 ? class299.method1770(true, this.field924) : null;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V")
    public static void method610(int arg0) {
        field921 = null;
        if (arg0 != -9643) {
            method610(-79);
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(IB)Loia;")
    public final class88 method611(int arg0, byte arg1) {
        field925++;
        if (arg1 != 42) {
            this.field928 = -90;
        }
        return new class88(this.field924, arg0);
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(II)V")
    public class88(int arg0, int arg1) {
        this.field927 = arg1;
        this.field924 = arg0;
    }
}
