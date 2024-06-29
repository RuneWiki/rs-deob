import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class150 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
    public static boolean field3423 = false;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lcb;")
    public static class17 field3428 = new class17(20);

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lod;")
    public static class101 field3435 = class46.method335(-67, "k");

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Lod;")
    public static class101 field3443 = class46.method335(78, "mapback");

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3437 = -1;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lod;")
    public static class101 field3441 = class46.method335(-88, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Z")
    public static boolean field3440 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lt;")
    public static class132 field3436;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[B")
    public byte[] field3426;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[B")
    public byte[] field3430;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[I")
    public static int[] field3434;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Lrd;")
    public static final class122 method1166(byte arg0) {
        class122 var1 = new class122();
        var1.field2695 = class32.field822[0];
        var1.field2689 = class34.field862;
        var1.field2690 = class138.field3173[0];
        var1.field2691 = class2.field31[0];
        var1.field2693 = field3434[0];
        field3425++;
        byte[] var2 = class67.field1503[0];
        int var3 = var1.field2693 * var1.field2690;
        var1.field2692 = new int[var3];
        var1.field2694 = class6.field94;
        if (arg0 != 99) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2692[var4] = class93.field1998[class41.method307(var2[var4], 255)];
        }
        class63.method433(4096);
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1167(byte arg0) {
        field3435 = null;
        field3441 = null;
        if (arg0 <= 43) {
            method1166((byte) 16);
        }
        field3428 = null;
        field3434 = null;
        field3436 = null;
        field3443 = null;
    }
}
