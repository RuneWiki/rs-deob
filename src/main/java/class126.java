import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class126 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lrd;")
    public static class173 field2369 = class133.method843("Schrifts-=tze geladen)3", 23);

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lrd;")
    public static class173 field2379 = class133.method843("Cabbage", -109);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lrd;")
    public static class173 field2364 = class133.method843("Untersuchen", -89);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field2368 = new Random();

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lrd;")
    public static class173 field2390 = class133.method843("compass", 43);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[[[B")
    public static byte[][][] field2384;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field2369 = null;
        field2384 = null;
        field2390 = null;
        if (arg0 <= -24) {
            field2368 = null;
            field2364 = null;
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3) {
        field2375++;
        class165 var4 = class29.method231(arg3, arg0, -1);
        if (var4 != null && var4.field3065 != null) {
            class117 var5 = new class117();
            var5.field2174 = var4.field3065;
            var5.field2155 = var4;
            class189.method1265(-3256, var5);
        }
        class42.field864 = arg0;
        class36.field780 = arg2;
        class182.field3582 = true;
        class131.field2475 = arg3;
        if (arg1 <= 80) {
            method805(125, 60, 29, -86);
        }
        class209.method1379(1, var4);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
    public static final int method806(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method807(int arg0) {
        field2370++;
        int[] var1 = new int[class64.field1262];
        int var2 = 0;
        for (int var3 = 0; var3 < class64.field1262; var3++) {
            class19 var5 = class195.method1298(1639, var3);
            if (var5.field437 >= 0 || var5.field432 >= 0) {
                var1[var2++] = var3;
            }
        }
        class31.field664 = new int[var2];
        if (arg0 != -1) {
            method806(-54, -41);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class31.field664[var4] = var1[var4];
        }
    }
}
