import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class69 extends class401 {

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public int field935 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public int field934 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public int field936 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public int field930 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public int field931 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public int field937 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public int field939 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
    public int field941 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "Lwp;")
    public class163 field938;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field933 = -1;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "Z")
    public static boolean field928 = true;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "Lgca;")
    public static class227 field940 = new class227();

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Lsea;")
    public static class648 field932;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(Z)V")
    public static void method573(boolean arg0) {
        if (!arg0) {
            method573(false);
        }
        field932 = null;
        field940 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
    public final boolean method574(int arg0, int arg1, int arg2) {
        field929++;
        if (arg0 >= this.field936 && arg0 <= this.field934 && this.field931 <= arg2 && this.field939 >= arg2) {
            return true;
        } else {
            int var4 = 22 / ((arg1 - 36) / 62);
            return this.field930 <= arg0 && arg0 <= this.field941 && arg2 >= this.field937 && this.field935 >= arg2;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lwp;)V")
    public class69(class163 arg0) {
        this.field938 = arg0;
    }
}
