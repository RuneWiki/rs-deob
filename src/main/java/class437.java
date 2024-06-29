import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class437 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public static int[] field6394 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "[Llg;")
    public static class20[] field6391;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)I")
    public abstract int method136(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public abstract void method137(byte arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V")
    public static final void method2701(int arg0, boolean arg1) {
        class114 var2 = class424.field6221;
        synchronized (class424.field6221) {
            class424.field6221.method614(-123, arg0);
        }
        if (!arg1) {
            field6394 = null;
        }
        field6393++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)J")
    public abstract long method139(boolean arg0);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
    public static void method2702(boolean arg0) {
        if (!arg0) {
            field6394 = null;
            field6391 = null;
        }
    }
}
