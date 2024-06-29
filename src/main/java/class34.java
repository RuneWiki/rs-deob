import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class34 {

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field652 = 0;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lpc;")
    public static class91 field651 = new class91(128);

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Ljf;")
    public static class229 field655 = class212.method1457((byte) 91, "<img=1>");

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[B")
    public static byte[] field656 = new byte[520];

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lek;")
    public static class185 field650;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[IBII)V", line = 24)
    public static final void method306(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field649++;
        arg0--;
        if (arg2 < 110) {
            return;
        }
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg1[var6] = arg4;
            int var7 = var6 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            arg0 = var12 + 1;
            arg1[arg0] = arg4;
        }
        while (var13 > arg0) {
            arg0++;
            arg1[arg0] = arg4;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 53)
    public static void method307(boolean arg0) {
        field656 = null;
        field651 = null;
        if (!arg0) {
            method307(true);
        }
        field655 = null;
        field650 = null;
    }
}
