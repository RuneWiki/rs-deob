import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class163 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Z")
    public boolean field2374 = true;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2366 = "Started 3d Library";

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2375 = " from your friend list first.";

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2379 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2367 = 2;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public static boolean field2380 = false;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lbk;")
    public static class54 field2373;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lij;")
    public static class69 field2371;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lca;")
    public static class83 field2378;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[[I")
    public static int[][] field2370;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2375 = null;
        field2371 = null;
        field2373 = null;
        field2370 = null;
        field2378 = null;
        field2366 = null;
        int var1 = -126 / ((arg0 + 38) / 51);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2369 = arg3;
        this.field2368 = arg1;
        this.field2372 = arg0;
        this.field2377 = arg5;
        this.field2376 = arg4;
        this.field2365 = arg2;
        this.field2374 = arg6;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
    public static int method1093(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
