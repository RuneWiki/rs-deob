import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class341 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field5378 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
    public static boolean field5379 = false;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lui;")
    public static class375 field5380 = new class375("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "[I")
    public static int[] field5384 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5383 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5382;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILtl;I)V", line = 5)
    private final void method2194(int arg0, class91 arg1, int arg2) {
        field5376++;
        if (arg0 != 1) {
            field5382 = null;
        }
        if (arg2 == 5) {
            this.field5378 = arg1.method631(10494);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 22)
    public static void method2195(byte arg0) {
        field5380 = null;
        field5384 = null;
        if (arg0 < -79) {
            field5382 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z", line = 36)
    public static final boolean method2196(int arg0, int arg1) {
        if (arg0 == 0) {
            field5377++;
            return arg1 >= 12 && arg1 <= 17;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILtl;)V", line = 47)
    public final void method2197(int arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field5381++;
                if (arg0 != 0) {
                    field5382 = null;
                    return;
                }
                return;
            }
            this.method2194(arg0 + 1, arg1, var3);
        }
    }
}
