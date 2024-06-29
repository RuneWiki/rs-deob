import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
    public static boolean field2373 = false;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lie;")
    public static class61 field2371 = new class61();

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Z")
    public static boolean field2378 = false;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lkd;")
    public static class73 field2381 = class126.method1070((byte) -66, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2375 = 1;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
    public static volatile long field2380 = 0L;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lkd;")
    public static class73 field2383 = class126.method1070((byte) -66, "Abbrechen");

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
    public static boolean field2376 = false;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lq;")
    public static class111 field2370;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lbc;")
    public static class11 field2377;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lbc;")
    public static class11 field2379;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lv;")
    public static class142 field2368;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[[B")
    public static byte[][] field2382;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method771(byte arg0) {
        field2369++;
        if (class21.field582 != null) {
            class21.field582.method405(2000);
        }
        if (class73.field1891 != null) {
            class73.field1891.method405(arg0 + 1950);
        }
        if (arg0 != 50) {
            field2381 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method772(int arg0, byte arg1, int arg2) {
        field2372++;
        if (arg0 == 0 && class107.field2651 == arg2) {
            return true;
        } else if (arg0 == 1 && class23.field671 == arg2) {
            return true;
        } else if ((arg0 == 2 || arg0 == 3) && class18.field517 == arg2) {
            return true;
        } else {
            return arg1 > -81;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static void method773(byte arg0) {
        field2382 = null;
        field2381 = null;
        field2377 = null;
        field2379 = null;
        field2370 = null;
        field2371 = null;
        field2368 = null;
        field2383 = null;
        if (arg0 != -84) {
            method772(-109, (byte) 61, 34);
        }
    }
}
