import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class147 extends class88 {

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
    public int[] field3394 = new int[5];

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public int field3398 = 0;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "[Led;")
    public class33[] field3396 = new class33[5];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3400 = 255;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Ltd;")
    public static class136 field3408 = class145.method1172("titlebox", 45);

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lk;")
    public static class69 field3383 = new class69();

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "J")
    public static long field3409 = 0L;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Ltd;")
    private static class136 field3415 = class145.method1172("shake:", 45);

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Ltd;")
    public static class136 field3411 = field3415;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "[I")
    public static int[] field3414 = new int[128];

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "Ltd;")
    public static class136 field3412 = field3415;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Lpc;")
    public class107 field3393;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "Lpd;")
    public static class108 field3413;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Lrb;")
    public class120 field3404;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lvc;")
    public class147 field3392;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lea;")
    public class30 field3395;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "Lhb;")
    public class51 field3402;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Li;")
    public class56 field3391;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Ln;")
    public class90 field3389;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Z")
    public boolean field3388;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Z")
    public boolean field3406;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "Z")
    public boolean field3407;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        field3415 = null;
        if (arg0 < 89) {
            field3414 = null;
        }
        field3408 = null;
        field3414 = null;
        field3383 = null;
        field3413 = null;
        field3412 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z[Ltd;)[Ltd;")
    public static final class136[] method1182(boolean arg0, class136[] arg1) {
        field3380++;
        if (!arg0) {
            field3409 = -65L;
        }
        class136[] var2 = new class136[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class79.method570(0, new class136[] { class19.method140(var3, -100), class11.field200 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class79.method570(0, new class136[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static final void method1183(int arg0) {
        if (arg0 != 128) {
            field3383 = null;
        }
        class108.field2550.method1165((byte) -73);
        field3381++;
        class110.field2578.method1165((byte) -73);
        class143.field3315.method1165((byte) -73);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(III)V")
    public class147(int arg0, int arg1, int arg2) {
        this.field3403 = arg1;
        this.field3387 = arg2;
        this.field3385 = this.field3399 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILke;I)V")
    public static final void method1184(int arg0, int arg1, class74 arg2, int arg3) {
        field3382++;
        if (class38.field894 != null || class96.field2267 || (arg2 == null || class91.method682((byte) 85, arg2) == null)) {
            return;
        }
        class38.field894 = arg2;
        class39.field903 = class91.method682((byte) 41, arg2);
        class49.field1115 = arg0;
        class8.field134 = arg3;
        class151.field3459 = false;
        class37.field865 = arg1;
    }
}
