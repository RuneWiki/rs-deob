import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class76 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[Lpe;")
    public class431[] field1028 = new class431[100];

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
    public int[] field1032 = new int[100];

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public int[] field1037 = new int[3];

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[Lvp;")
    public class124[] field1034 = new class124[8];

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lgk;")
    public static class331 field1033 = new class331(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljava/lang/Object;")
    public Object field1040;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIZZ)V", line = 24)
    public static final void method711(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class251.field3700 = 0L;
        field1038++;
        if (arg4) {
            field1039 = -128;
        }
        int var5 = class114.method920((byte) -123);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class225.field3300.method300()) {
            arg3 = true;
        }
        class125.method985(arg0, var5, (byte) -45, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 47)
    public static void method712(byte arg0) {
        field1033 = null;
        if (arg0 != 123) {
            field1039 = -54;
        }
    }
}
