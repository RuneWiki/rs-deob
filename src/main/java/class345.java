import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class345 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public int[] field5478 = new int[6];

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[[B")
    public byte[][] field5488 = new byte[6][258];

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[B")
    public byte[] field5502 = new byte[256];

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[Z")
    public boolean[] field5490 = new boolean[16];

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[I")
    public int[] field5489 = new int[257];

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "[B")
    public byte[] field5506 = new byte[18002];

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field5499 = 0;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[[I")
    public int[][] field5485 = new int[6][258];

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "[B")
    public byte[] field5507 = new byte[4096];

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
    public int[] field5509 = new int[16];

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[[I")
    public int[][] field5498 = new int[6][258];

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[B")
    public byte[] field5496 = new byte[18002];

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "[[I")
    public int[][] field5512 = new int[6][258];

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[Z")
    public boolean[] field5495 = new boolean[256];

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field5511 = 0;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    public int[] field5500 = new int[256];

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5501 = 0;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "J")
    public static long field5493 = 0L;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "B")
    public byte field5484;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field5477;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field5479;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field5480;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public int field5508;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field5513;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lth;")
    public static class57 field5494;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[B")
    public byte[] field5483;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "[B")
    public byte[] field5487;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method2428(int arg0, byte arg1) {
        field5505++;
        if (class274.field4541 == null) {
            class274.field4541 = new byte[4][104][104];
        }
        if (arg0 != 104) {
            field5494 = (class57) null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class274.field4541[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILkf;II)V", line = 94)
    public static final void method2429(int arg0, int arg1, int arg2, class170 arg3, int arg4, int arg5) {
        field5504++;
        if (arg3.field2714 == -1 && arg3.field2699 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field2705 < arg4) {
            var6 += arg4 - arg3.field2705;
        } else if (arg3.field2711 > arg4) {
            var6 += arg3.field2711 - arg4;
        }
        if (arg5 > arg3.field2716) {
            var6 += arg5 - arg3.field2716;
        } else if (arg5 < arg3.field2695) {
            var6 += arg3.field2695 - arg5;
        }
        int var7 = class272.field4520 * arg3.field2696 >> 8;
        if (~arg3.field2704 == arg1 || (var6 - 64) > arg3.field2704 || class272.field4520 == 0 || arg3.field2710 != arg2) {
            if (arg3.field2713 != null) {
                class245.field4030.method2163(arg3.field2713);
                arg3.field2713 = null;
            }
            if (arg3.field2698 != null) {
                class245.field4030.method2163(arg3.field2698);
                arg3.field2698 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field2704 - var6) * var7 / arg3.field2704;
        if (arg3.field2713 != null) {
            arg3.field2713.method1066(var8);
        } else if (arg3.field2714 >= 0) {
            class85 var9 = class85.method680(class220.field3557, arg3.field2714, 0);
            if (var9 != null) {
                class110 var10 = var9.method677().method840(class320.field5092);
                class139 var11 = class139.method1072(var10, 100, var8);
                var11.method1079(-1);
                class245.field4030.method2162(var11);
                arg3.field2713 = var11;
            }
        }
        if (arg3.field2698 != null) {
            arg3.field2698.method1066(var8);
            if (!arg3.field2698.method331((byte) 48)) {
                arg3.field2698 = null;
            }
        } else if (arg3.field2699 != null && (arg3.field2707 -= arg0) <= 0) {
            int var12 = (int) ((double) arg3.field2699.length * Math.random());
            class85 var13 = class85.method680(class220.field3557, arg3.field2699[var12], 0);
            if (var13 != null) {
                class110 var14 = var13.method677().method840(class320.field5092);
                class139 var15 = class139.method1072(var14, 100, var8);
                var15.method1079(0);
                class245.field4030.method2162(var15);
                arg3.field2698 = var15;
                arg3.field2707 = (int) ((double) (arg3.field2709 - arg3.field2712) * Math.random()) + arg3.field2712;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 256)
    public static void method2430(boolean arg0) {
        if (arg0) {
            field5494 = null;
        }
    }
}
