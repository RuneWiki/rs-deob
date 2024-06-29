import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class133 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lea;")
    public static class40 field2766;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lig;")
    public static class80 field2777;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[[S")
    public static short[][] field2767;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lna;I)V")
    public static final void method855(class119 arg0, int arg1) {
        field2783++;
        if (client.field559 == arg0.field2333 || arg0.field2351 == -1 || arg0.field2355 != 0 || arg0.field2375 + 1 > class175.method1101(arg0.field2351, true).field3991[arg0.field2360]) {
            int var2 = arg0.field2333 - arg0.field2365;
            int var3 = arg0.field2370 * 128 + arg0.field2327 * 64;
            int var4 = client.field559 - arg0.field2365;
            int var5 = arg0.field2313 * 128 + arg0.field2327 * 64;
            int var6 = arg0.field2358 * 128 + arg0.field2327 * 64;
            arg0.field2347 = ((var2 - var4) * var3 + var4 * var6) / var2;
            int var7 = arg0.field2373 * 128 + arg0.field2327 * 64;
            arg0.field2328 = ((var2 - var4) * var5 + var4 * var7) / var2;
        }
        if (arg0.field2318 == 0) {
            arg0.field2372 = 1024;
        }
        arg0.field2317 = 0;
        if (arg0.field2318 == 1) {
            arg0.field2372 = 1536;
        }
        if (arg1 != 1024) {
            method855(null, -55);
        }
        if (arg0.field2318 == 2) {
            arg0.field2372 = 0;
        }
        if (arg0.field2318 == 3) {
            arg0.field2372 = 512;
        }
        arg0.field2352 = arg0.field2372;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method856(int arg0) {
        field2766 = null;
        if (arg0 != -1) {
            field2767 = null;
        }
        field2777 = null;
        field2767 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljg;II)Led;")
    public static final class43 method857(class89 arg0, int arg1, int arg2) {
        field2781++;
        try {
            if (arg1 < 27) {
                field2767 = null;
            }
            class43 var3 = new class43();
            var3.field818 = arg0.method533((byte) 75);
            if (var3.field818 > arg2) {
                var3.field818 = arg2;
            }
            var3.field844 = new byte[var3.field818];
            arg0.field1727 += class143.field2946.method928(var3.field844, arg0.field1727, (byte) -115, 0, var3.field818, arg0.field1769);
            return var3;
        } catch (Exception var4) {
            return class67.field1340;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lob;")
    public static final class129 method858(int arg0, int arg1, int arg2) {
        field2779++;
        class129 var3 = class124.method801((byte) -36, arg1);
        if (arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field2626 == null || var3.field2626.length <= arg2) {
            return null;
        } else {
            return var3.field2626[arg2];
        }
    }
}
