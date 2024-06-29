import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class174 extends class240 {

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public static int[] field2363 = new int[14];

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[B")
    public static byte[] field2368 = new byte[520];

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lhi;")
    public static class192 field2372 = new class192();

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Z")
    public static boolean field2373 = false;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V", line = 8)
    public final void method501(int arg0, int arg1, int arg2) {
        int var4 = this.field2362 * arg1 >> 12;
        field2370++;
        int var5 = this.field2364 * arg1 >> 12;
        int var6 = this.field2369 * arg2 >> 12;
        int var7 = this.field2365 * arg2 >> 12;
        if (arg0 == -4621) {
            class121.method879(var6, var4, var7, var5, 109, this.field3401);
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V", line = 29)
    public final void method495(int arg0, int arg1, int arg2) {
        field2366++;
        if (arg2 != 24998) {
            method1214((byte) 59);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIII)V", line = 38)
    public class174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2365 = arg3;
        this.field2369 = arg1;
        this.field2362 = arg0;
        this.field2364 = arg2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 51)
    public static void method1213(byte arg0) {
        if (arg0 == -7) {
            field2363 = null;
            field2368 = null;
            field2372 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V", line = 64)
    public final void method499(int arg0, int arg1, int arg2) {
        field2367++;
        if (arg1 != 6893) {
            this.field2364 = 89;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Ljava/lang/String;", line = 80)
    public static final String method1214(byte arg0) {
        field2371++;
        String var1 = "www";
        if (arg0 > -120) {
            return (String) null;
        }
        if (class6.field46 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class165.field2262 != null) {
            var2 = "/p=" + class165.field2262;
        }
        return "http://" + var1 + ".runescape.com/l=" + class202.field2874 + "/a=" + class169.field2297 + var2 + "/";
    }
}
