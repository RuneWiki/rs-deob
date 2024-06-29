import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class93 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lmb;")
    public static class84 field2313 = class79.method672(true, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public static int[] field2311 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lmb;")
    public static class84 field2320 = class79.method672(true, "Offline");

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lmb;")
    public static class84 field2323 = class79.method672(true, "null");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lsd;")
    public static class122 field2312;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lt;")
    public static class124 field2321;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field2319;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lmb;")
    public static final class84 method787(int arg0, int arg1) {
        if (arg0 != 22245) {
            field2313 = null;
        }
        field2315++;
        return class106.method884(false, 10, false, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method788(int arg0) {
        field2319 = null;
        field2321 = null;
        if (arg0 != 1) {
            method787(12, -110);
        }
        field2312 = null;
        field2313 = null;
        field2323 = null;
        field2320 = null;
        field2311 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class93() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lne;)V")
    public class93(class93 arg0) {
        this.field2314 = arg0.field2314;
        this.field2324 = arg0.field2324;
        this.field2317 = arg0.field2317;
        this.field2310 = arg0.field2310;
    }
}
