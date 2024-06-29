import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class600 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lwp;")
    public static class453 field8415 = new class453(36, 10);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[S")
    public static short[] field8417 = new short[256];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lf;")
    public static class536 field8418;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lpl;")
    public static class612 field8416;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3292(int arg0) {
        field8418 = null;
        int var1 = -105 / ((arg0 + 53) / 55);
        field8415 = null;
        field8417 = null;
        field8416 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public static final void method3293(boolean arg0, int arg1) {
        field8414++;
        if (class469.field5963 == null || class469.field5963.length < arg1) {
            class469.field5963 = new int[arg1];
        }
        if (!arg0) {
            field8418 = null;
        }
    }
}
