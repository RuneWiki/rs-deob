import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class239 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    public static int[] field4117 = new int[5];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Z")
    public static boolean field4115 = false;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljd;")
    private static class85 field4118 = class221.method1499("Your ignore list is full)3 Max of 100 users)3", (byte) 100);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field4124 = -1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Ljd;")
    public static class85 field4116 = field4118;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Ljd;")
    public static class85 field4127 = class221.method1499("Art", (byte) -89);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljd;")
    public static class85 field4126 = class221.method1499("Welt", (byte) 125);

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lwe;")
    public static class15 field4119 = new class15();

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljd;")
    public static class85 field4129 = class221.method1499("<)4col>", (byte) -105);

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[I")
    public static int[] field4130 = new int[128];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lge;")
    public static class68 field4122;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[[[B")
    public static byte[][][] field4121;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1626(int arg0) {
        field4126 = null;
        field4127 = null;
        if (arg0 != -64) {
            field4130 = null;
        }
        field4129 = null;
        field4122 = null;
        field4121 = null;
        field4118 = null;
        field4117 = null;
        field4116 = null;
        field4130 = null;
        field4119 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Ljk;")
    public static final class240 method1627(int arg0, int arg1) {
        class240 var2 = (class240) class234.field4044.method1472((long) arg0, -27162);
        field4123++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field3938.method464(-1, 11, arg0);
        class240 var4 = new class240();
        if (var3 != null) {
            var4.method1637(1589471216, new class247(var3));
        }
        if (arg1 <= 27) {
            field4115 = false;
        }
        class234.field4044.method1468(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4114++;
        if (arg0 <= 40) {
            field4115 = false;
        }
        for (int var5 = 0; var5 < class22.field307; var5++) {
            if (arg1 < (class54.field947[var5] + class146.field2493[var5]) && arg1 + arg4 > class146.field2493[var5] && (class253.field4364[var5] + class246.field4201[var5]) > arg2 && class253.field4364[var5] < (arg2 + arg3)) {
                class217.field3803[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljd;II)V")
    public static final void method1629(class85 arg0, int arg1, int arg2) {
        field4125++;
        class171 var3 = class85.method579(2, 0, arg2);
        var3.method1140(-28981);
        if (arg1 != 25358) {
            field4121 = null;
        }
        var3.field2952 = arg0;
    }
}
