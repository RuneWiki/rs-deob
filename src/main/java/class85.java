import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class85 {

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Llh;")
    public static class100 field1343 = class245.method1489(false);

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Z")
    public static boolean field1348 = false;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "[I")
    public static int[] field1345 = new int[4096];

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "[I")
    public static int[] field1347;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static void method677(int arg0) {
        if (arg0 >= 43) {
            field1343 = null;
            field1347 = null;
            field1345 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLgk;I)V")
    public static final void method678(boolean arg0, class468 arg1, int arg2) {
        if (class107.field1593 != null) {
            try {
                class107.field1593.method908(0L, (byte) -128);
                class107.field1593.method909(24, arg2, arg1.field6868, 16711680);
            } catch (Exception var3) {
            }
        }
        if (!arg0) {
            field1345 = null;
        }
        field1340++;
    }

    static {
        new class456("", 73);
    }
}
