import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class129 extends class243 {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field2223 = 0;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lnk;")
    public static class326 field2213 = new class326(7, 7);

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field2226 = -1;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Z")
    public boolean field2221;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
    public static boolean field2225;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[I")
    public static int[] field2224;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)Z", line = 10)
    public final boolean method42(boolean arg0) {
        field2215++;
        if (arg0) {
            this.field2217 = 114;
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V", line = 25)
    public final void method36(boolean arg0) {
        if (!arg0) {
            field2220++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 37)
    public static void method995(byte arg0) {
        int var1 = -24 % ((67 - arg0) / 52);
        field2213 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 56)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        field2219++;
        if (arg0 != 0) {
            this.method39(113, -45, null, -98, 59, null, true);
        }
        throw new IllegalStateException();
    }
}
