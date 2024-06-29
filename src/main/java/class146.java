import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class146 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[[I")
    public static int[][] field2789 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lig;")
    public static class93 field2787 = new class93(64);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lph;")
    public static class166 field2791 = new class166(5);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBIII)V")
    public static final void method920(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2788++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = class22.method209(class112.field2107, arg3 + arg4, arg1 + 47, class127.field2448);
        int var8 = -arg3;
        int var9 = -1;
        if (arg1 != 55) {
            method922(null, (byte) 22, -32);
        }
        int var10 = class22.method209(class112.field2107, arg4 - arg3, 94, class127.field2448);
        class81.method532(var10, arg0, class156.field2981[arg2], var7, -7);
        while (var6 > var5) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (var12 >= class129.field2514 && var11 <= class230.field4322) {
                    int var13 = class22.method209(class112.field2107, arg4 + var5, 113, class127.field2448);
                    int var14 = class22.method209(class112.field2107, arg4 - var5, -125, class127.field2448);
                    if (class230.field4322 >= var12) {
                        class81.method532(var14, arg0, class156.field2981[var12], var13, -7);
                    }
                    if (class129.field2514 <= var11) {
                        class81.method532(var14, arg0, class156.field2981[var11], var13, -7);
                    }
                }
            }
            var5++;
            int var15 = arg2 + var5;
            int var16 = arg2 - var5;
            if (class129.field2514 <= var15 && var16 <= class230.field4322) {
                int var17 = class22.method209(class112.field2107, arg4 + var6, 110, class127.field2448);
                int var18 = class22.method209(class112.field2107, arg4 - var6, -76, class127.field2448);
                if (var15 <= class230.field4322) {
                    class81.method532(var18, arg0, class156.field2981[var15], var17, arg1 - 62);
                }
                if (var16 >= class129.field2514) {
                    class81.method532(var18, arg0, class156.field2981[var16], var17, -7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)J")
    public static final long method921(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        return var3 == null || var3.field2306 == null ? 0L : var3.field2306.field1767;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lab;BI)Ljd;")
    public static final class101 method922(class3 arg0, byte arg1, int arg2) {
        if (arg1 != 14) {
            field2791 = null;
        }
        byte[] var3 = arg0.method28((byte) -70, arg2);
        field2786++;
        return var3 == null ? null : new class101(var3);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)Lca;")
    public static final class23 method923(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2299; var4++) {
            class23 var5 = var3.field2297[var4];
            if ((var5.field536 >> 29 & 0x3L) == 2L && var5.field534 == arg1 && var5.field539 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method924(byte arg0) {
        field2791 = null;
        if (arg0 >= -36) {
            field2787 = null;
        }
        field2787 = null;
        field2789 = null;
    }
}
