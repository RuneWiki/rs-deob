import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class139 extends class123 {

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[I")
    public int[] field3389 = new int[] { -1 };

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[I")
    public int[] field3395 = new int[1];

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
    public static int[] field3388 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Loa;")
    public static class98 field3397 = class38.method349(255, "mod_icons");

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Loa;")
    public static class98 field3402 = class38.method349(255, "null");

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Loa;")
    private static class98 field3393 = class38.method349(255, "Loaded config");

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "Loa;")
    private static class98 field3405 = class38.method349(255, "Remove");

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Loa;")
    public static class98 field3386 = field3405;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field3391 = 0;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
    public static int[] field3406 = new int[500];

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Loa;")
    public static class98 field3403 = field3393;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3404 = 50;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "[I")
    public static int[] field3396 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "[I")
    public static int[] field3390 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
    public static int[] field3387 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "[I")
    public static int[] field3407 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "[I")
    public static int[] field3408 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "[I")
    public static int[] field3383 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "[I")
    public static int[] field3401 = new int[field3404];

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[Loa;")
    public static class98[] field3385 = new class98[field3404];

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Ltb;")
    public static class130 field3398;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Lde;")
    public static class27 field3394;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[Loc;")
    public static class100[] field3409;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "[[[B")
    public static byte[][][] field3392;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILb;)Loa;")
    public static final class98 method1122(int arg0, int arg1, class8 arg2) {
        field3384++;
        try {
            class98 var3 = new class98();
            var3.field2277 = arg2.method103(-23734);
            if (var3.field2277 > arg1) {
                var3.field2277 = arg1;
            }
            var3.field2255 = new byte[var3.field2277];
            arg2.field182 += class8.field162.method34(var3.field2277, arg2.field132, arg0 - 128, arg0, var3.field2255, arg2.field182);
            return var3;
        } catch (Exception var4) {
            return class132.field3138;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public static void method1123(byte arg0) {
        field3402 = null;
        field3401 = null;
        field3394 = null;
        field3385 = null;
        field3397 = null;
        field3406 = null;
        field3392 = null;
        field3383 = null;
        field3387 = null;
        field3409 = null;
        field3393 = null;
        field3405 = null;
        field3386 = null;
        field3398 = null;
        field3388 = null;
        field3408 = null;
        if (arg0 <= 56) {
            field3398 = null;
        }
        field3396 = null;
        field3407 = null;
        field3390 = null;
        field3403 = null;
    }
}
