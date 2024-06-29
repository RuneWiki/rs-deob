import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class150 extends class231 {

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
    public static int[] field2377 = new int[5];

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lck;")
    public static class119 field2376 = class298.method1987((byte) 67, "ProSavage");

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "J")
    public static long field2379 = 0L;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lck;")
    public static class119 field2383 = class298.method1987((byte) 82, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2385 = 0;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Z")
    public static boolean field2387 = false;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2381 = -1;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lck;")
    public static class119 field2388 = null;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
    public static int[] field2382;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
    public static int[] field2386;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[[[Li;")
    public static class104[][][] field2390;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 11)
    public static void method968(int arg0) {
        field2377 = null;
        field2386 = null;
        field2376 = null;
        if (arg0 != -1) {
            method970((class36) null, (class36) null, (class36) null, 75);
        }
        field2383 = null;
        field2390 = (class104[][][]) null;
        field2388 = null;
        field2382 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2378++;
        int var7 = class197.method1264(-101, arg0, class108.field1650, class236.field3800);
        int var8 = class197.method1264(-128, arg6, class108.field1650, class236.field3800);
        int var9 = class197.method1264(-99, arg4, class79.field1226, class59.field957);
        int var10 = class197.method1264(-120, arg1, class79.field1226, class59.field957);
        int var11 = class197.method1264(-122, arg0 + arg3, class108.field1650, class236.field3800);
        int var12 = class197.method1264(-97, arg6 - arg3, class108.field1650, class236.field3800);
        for (int var13 = var7; var13 < var11; var13++) {
            class36.method282(var10, var9, arg5, class256.field4113[var13], 26175);
        }
        int var14 = -64 / ((4 - arg2) / 47);
        for (int var15 = var8; var15 > var12; var15--) {
            class36.method282(var10, var9, arg5, class256.field4113[var15], 26175);
        }
        int var16 = class197.method1264(-105, arg3 + arg4, class79.field1226, class59.field957);
        int var17 = class197.method1264(-125, arg1 - arg3, class79.field1226, class59.field957);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class256.field4113[var18];
            class36.method282(var16, var9, arg5, var19, 26175);
            class36.method282(var10, var17, arg5, var19, 26175);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lva;Lva;Lva;I)V", line = 103)
    public static final void method970(class36 arg0, class36 arg1, class36 arg2, int arg3) {
        int var4 = 42 % ((arg3 + 40) / 39);
        class174.field2786 = arg2;
        client.field1397 = arg1;
        class196.field3145 = arg0;
        field2384++;
    }
}
