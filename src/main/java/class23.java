import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class23 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lnb;")
    public static class120 field350 = new class120(128);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    public static int[] field353 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lkb;")
    public static class93 field355 = class76.method390("(U", 0);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lkb;")
    public static class93 field352 = class76.method390("Versteckt", 0);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field356 = 0;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lof;")
    public static class133 field351;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Lob;")
    public static final class129 method131(boolean arg0) {
        field348++;
        class129 var1 = new class129();
        var1.field2447 = class133.field2557;
        if (!arg0) {
            method131(false);
        }
        var1.field2446 = class64.field1010[0];
        var1.field2451 = class100.field1844[0];
        var1.field2445 = class82.field1513[0];
        var1.field2448 = class189.field3700;
        var1.field2449 = class153.field2993[0];
        int var2 = var1.field2451 * var1.field2446;
        var1.field2450 = new int[var2];
        byte[] var3 = class35.field577[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field2450[var4] = class103.field1895[class91.method479(var3[var4], 255)];
        }
        class206.method1340(-23557);
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
    public static final void method132(boolean arg0) {
        class76.field1376.method676(30626);
        if (arg0) {
            field349++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method133(int arg0) {
        if (arg0 < 76) {
            return;
        }
        field350 = null;
        field353 = null;
        field355 = null;
        field351 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[B)V")
    public abstract void method134(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)[B")
    public abstract byte[] method135(byte arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public static final void method136(int arg0, int arg1, int arg2) {
        if (class79.field1408 != 0 && arg0 != -1) {
            class46.method246(class79.field1408, 0, arg0, class104.field1921, (byte) 127, false);
            class171.field3393 = true;
        }
        field354++;
        if (arg2 != 22607) {
            method132(true);
        }
    }
}
