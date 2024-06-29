import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class99 {

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static volatile int field2360 = 0;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Lr;")
    private static class118 field2368 = class153.method1136(100, "Login server offline)3");

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Lr;")
    public static class118 field2371 = class153.method1136(75, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Lr;")
    public static class118 field2364 = class153.method1136(98, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Lr;")
    private static class118 field2362 = class153.method1136(92, "Attack");

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "Lr;")
    private static class118 field2381 = class153.method1136(120, "Invalid username or password)3");

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lr;")
    public static class118 field2363 = field2368;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "Lr;")
    public static class118 field2378 = null;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Z")
    public static boolean field2380 = false;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lr;")
    public static class118 field2361 = field2381;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "[Z")
    public static boolean[] field2383 = new boolean[8];

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field2384 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lr;")
    public static class118 field2367 = class153.method1136(106, "(U2");

    @OriginalMember(owner = "client!of", name = "M", descriptor = "[S")
    public static short[] field2377 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!of", name = "X", descriptor = "Lr;")
    public static class118 field2388 = field2362;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lhd;")
    public static class53 field2370;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "[I")
    public int[] field2373;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[I")
    public int[] field2376;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[Lbd;")
    public class12[] field2379;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "[Lbd;")
    public class12[] field2385;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "[[[B")
    public byte[][][] field2382;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public static final void method785(byte arg0) {
        class62.field1440.method394(12693);
        field2372++;
        if (arg0 < 16) {
            field2384 = -92;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lr;Lr;IB)V")
    public static final void method786(class118 arg0, class118 arg1, int arg2, byte arg3) {
        field2365++;
        class53.method481(null, arg2, arg0, (byte) 1, arg1);
        if (arg3 >= -125) {
            field2363 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method787(boolean arg0) {
        field2364 = null;
        if (!arg0) {
            field2375 = -9;
        }
        field2378 = null;
        field2367 = null;
        field2368 = null;
        field2361 = null;
        field2388 = null;
        field2371 = null;
        field2381 = null;
        field2363 = null;
        field2362 = null;
        field2377 = null;
        field2383 = null;
        field2370 = null;
    }
}
