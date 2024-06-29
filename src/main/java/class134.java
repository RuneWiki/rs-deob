import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class134 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Loh;")
    public static class258 field2318 = class153.method1046(" x ", 89);

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lkl;")
    public static class65 field2316;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[[[I")
    public static int[][][] field2317;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 20)
    public static void method948(int arg0) {
        if (arg0 != 22700) {
            method948(-30);
        }
        field2316 = null;
        field2318 = null;
        field2317 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZIIII)Lkl;", line = 38)
    public static final class65 method949(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2320++;
        int var7 = (arg1 ? 65536 : 0) + (arg2 - (-(arg4 << 17) - (arg5 << 19)));
        long var8 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class65 var10 = (class65) class308.field5224.method1159((byte) 122, var8);
        if (var10 != null) {
            return var10;
        }
        class266.field4629 = false;
        class65 var11 = class38.method284(false, arg3, (byte) -23, arg5, arg2, false, arg1, arg4);
        if (arg0 < 32) {
            field2318 = (class258) null;
        }
        if (var11 != null && !class266.field4629) {
            class308.field5224.method1163(var11, -1, var8);
        }
        return var11;
    }
}
