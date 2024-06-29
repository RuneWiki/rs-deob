import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class123 extends class44 {

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field2282 = 0;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    public int[] field2297 = new int[5];

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[Lcd;")
    public class25[] field2289 = new class25[5];

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[Llh;")
    public static class108[] field2279 = new class108[50];

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lkb;")
    private static class93 field2276 = class76.method390("Account locked as we suspect it has been stolen)3", 0);

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lkb;")
    public static class93 field2277 = field2276;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lmf;")
    public class115 field2294;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Lne;")
    public class123 field2283;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lnh;")
    public class126 field2281;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Lbg;")
    public class18 field2295;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Laa;")
    public class2 field2301;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Lic;")
    public class77 field2290;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Ljd;")
    public class86 field2280;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Z")
    public boolean field2284;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
    public boolean field2288;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Z")
    public boolean field2296;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method703(byte arg0) {
        if (arg0 >= 49) {
            field2276 = null;
            field2277 = null;
            field2279 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static final void method704(byte arg0) {
        field2278++;
        if (class149.field2878.toLowerCase().indexOf("microsoft") == -1) {
            class24.field364[45] = 26;
            class24.field364[47] = 73;
            class24.field364[46] = 72;
            class24.field364[91] = 42;
            class24.field364[61] = 27;
            class24.field364[59] = 57;
            class24.field364[44] = 71;
            if (class149.field2869 == null) {
                class24.field364[222] = 59;
                class24.field364[192] = 58;
            } else {
                class24.field364[192] = 28;
                class24.field364[222] = 58;
                class24.field364[520] = 59;
            }
            class24.field364[92] = 74;
            class24.field364[93] = 43;
        } else {
            class24.field364[190] = 72;
            class24.field364[186] = 57;
            class24.field364[189] = 26;
            class24.field364[188] = 71;
            class24.field364[219] = 42;
            class24.field364[191] = 73;
            class24.field364[221] = 43;
            class24.field364[187] = 27;
            class24.field364[222] = 59;
            class24.field364[220] = 74;
            class24.field364[192] = 58;
            class24.field364[223] = 28;
        }
        if (arg0 <= 53) {
            field2277 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class123(int arg0, int arg1, int arg2) {
        this.field2291 = this.field2303 = arg0;
        this.field2286 = arg1;
        this.field2287 = arg2;
    }
}
