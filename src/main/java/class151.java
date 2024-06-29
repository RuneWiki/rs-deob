import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class151 extends class128 {

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[Lim;")
    public class179[] field2347 = new class179[5];

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public int field2358 = 0;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "[I")
    public int[] field2368 = new int[5];

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[I")
    public static int[] field2351 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2341 = "white:";

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
    public static int[] field2365 = new int[5];

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "B")
    public byte field2345;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public int field2357;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "Lbf;")
    public class108 field2367;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Llm;")
    public class151 field2360;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Lji;")
    public class154 field2356;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "Lrb;")
    public class176 field2366;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "Lvj;")
    public class188 field2364;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Lcc;")
    public class209 field2352;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Ln;")
    public static class233 field2342;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Lnc;")
    public class259 field2355;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Lmf;")
    public class29 field2362;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "Z")
    public boolean field2359;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "Z")
    public boolean field2361;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "Z")
    public boolean field2363;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "[Lim;")
    public static class179[] field2343;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "[[[B")
    public static byte[][][] field2369;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(III)V")
    public class151(int arg0, int arg1, int arg2) {
        this.field2348 = arg1;
        this.field2353 = this.field2354 = arg0;
        this.field2350 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method1041(byte arg0) {
        field2365 = null;
        if (arg0 != 2) {
            method1041((byte) 48);
        }
        field2342 = null;
        field2369 = null;
        field2351 = null;
        field2343 = null;
        field2341 = null;
    }
}
