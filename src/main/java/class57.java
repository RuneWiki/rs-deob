import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class57 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[[I")
    public static int[][] field895 = new int[6][];

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    public static int[] field901 = new int[25];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Leo;")
    public static class484 field897;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field897 = null;
        if (arg0 != 1) {
            method392(true);
        }
        field901 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
    public static final int method391(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field894++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else if (arg2 <= 80) {
            return 100;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static final void method392(boolean arg0) {
        class241.field4163 = new class452[50];
        if (arg0) {
            method390(-124);
        }
        class238.field4104 = 0;
        field898++;
    }
}
