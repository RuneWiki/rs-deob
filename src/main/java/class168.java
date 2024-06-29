import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class168 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lqe;")
    public static class179 field3029 = class206.method1380("Spielwelt erstellt)3", (byte) -128);

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lqe;")
    private static class179 field3030 = class206.method1380("RuneScape is loading )2 please wait)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lqe;")
    public static class179 field3028 = field3030;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lsg;")
    public static class201 field3031 = new class201(4);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public static int[] field3036 = new int[1000];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
    public static boolean field3035 = false;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lqe;")
    public static class179 field3034 = class206.method1380("::fps ", (byte) -127);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lfj;")
    public static class65 field3025;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
    public abstract void method471(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1072(int arg0) {
        if (arg0 < 90) {
            field3035 = true;
        }
        field3028 = null;
        field3031 = null;
        field3025 = null;
        field3034 = null;
        field3036 = null;
        field3029 = null;
        field3030 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIZZB)Lee;")
    public static final class49 method1073(boolean arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        field3032++;
        class12 var5 = null;
        if (class185.field3434 != null) {
            var5 = new class12(arg1, class185.field3434, class141.field2579[arg1], 1000000);
        }
        int var6 = 80 / ((arg4 + 12) / 59);
        return new class49(var5, class174.field3120, arg1, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
    public abstract void method473(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public abstract void method474(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
    public class168(int arg0, int arg1, int arg2) {
        this.field3033 = arg2;
        this.field3026 = arg0;
        this.field3027 = arg1;
    }
}
