import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class168 extends class186 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[I")
    public static int[] field2563 = new int[4096];

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
    public static boolean field2564;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([[IB)V")
    public static final void method1161(int[][] arg0, byte arg1) {
        class42.field626 = arg0;
        if (arg1 != -121) {
            field2567 = -103;
        }
        field2560++;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public static void method1162(int arg0) {
        if (arg0 != -25306) {
            field2564 = false;
        }
        field2563 = null;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)[Lsn;")
    public static final class205[] method1163(int arg0) {
        field2559++;
        int var1 = 1 % ((arg0 - 11) / 58);
        return new class205[] { class122.field1890, class249.field3390, class273.field3707, class165.field2540, class196.field2875, class265.field3567, class235.field3261, class397.field5704, class323.field4433, class499.field7294, class126.field1964, class209.field2994, class497.field7272, class230.field3220, class169.field2580 };
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
    public static final void method1164(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class309.field4206[var1] = false;
        }
        field2562++;
        if (arg0 > -47) {
            return;
        }
        class50.field714 = 0;
        class247.field3363 = 1;
        class142.field2115 = -1;
        class137.field2067 = 0;
        class358.field5167 = -1;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIII)V")
    public class168(int arg0, int arg1, int arg2, int arg3) {
        this.field2558 = arg2;
        this.field2561 = arg1;
        this.field2566 = arg3;
        this.field2565 = arg0;
    }

    static {
        new class157("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field2564 = false;
        field2567 = -1;
    }
}
