import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class111 extends class125 {

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public int field2255 = 0;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[I")
    public static int[] field2253 = new int[256];

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Ljd;")
    public static class92 field2254 = class202.method1325((byte) 90, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "[I")
    public static int[] field2257 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "[I")
    public static int[] field2268 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Ljd;")
    public static class92 field2264 = class202.method1325((byte) 90, "<col=80ff00>");

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Ljd;")
    private static class92 field2259 = class202.method1325((byte) 90, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Ljd;")
    public static class92 field2260 = field2259;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Ljd;")
    public static class92 field2258 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "[Lsc;")
    public static class173[] field2269;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public static void method752(int arg0) {
        field2264 = null;
        field2269 = null;
        field2260 = null;
        field2258 = null;
        field2257 = null;
        field2268 = null;
        field2254 = null;
        field2259 = null;
        if (arg0 == 0) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lh;I)Ljd;")
    public static final class92 method753(class70 arg0, int arg1) {
        field2261++;
        return arg1 == 32767 ? class172.method1141(arg0, 32767, (byte) -8) : null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
    public static final void method754(int arg0, boolean arg1) {
        field2252++;
        for (int var2 = 0; var2 < class96.field1928; var2++) {
            long var3 = (long) class39.field893[var2] << 32 | 0x20000000L;
            class129 var5 = class107.field2187[class39.field893[var2]];
            if (var5 != null && var5.method24(arg0 ^ 0x24) && var5.field2592.field1944 == arg1 && var5.field2592.method670(-126)) {
                int var6 = var5.field246 >> 7;
                int var7 = var5.field208 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field211 == 1 && (var5.field246 & 0x7F) == 64 && (var5.field208 & 0x7F) == 64) {
                        if (class108.field2230[var6][var7] == class126.field2545) {
                            continue;
                        }
                        class108.field2230[var6][var7] = class126.field2545;
                    }
                    if (!var5.field2592.field1941) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field248 = class118.method804(var5.field211 * 64 + var5.field246 - 64, class81.field1639, var5.field211 * 64 + var5.field208 - 64, 0);
                    class113.method762(class81.field1639, var5.field246, var5.field208, var5.field248, var5.field211 * 64 - 4, var5, var5.field234, var3, var5.field213);
                }
            }
        }
        if (arg0 != 64) {
            field2251 = 9;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLh;)V")
    public final void method755(byte arg0, class70 arg1) {
        while (true) {
            int var3 = arg1.method443(255);
            if (var3 == 0) {
                if (arg0 < 121) {
                    field2260 = null;
                }
                field2256++;
                return;
            }
            this.method756(arg1, 5849, var3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lh;II)V")
    private final void method756(class70 arg0, int arg1, int arg2) {
        if (arg1 != 5849) {
            field2269 = null;
        }
        field2267++;
        if (arg2 == 2) {
            this.field2255 = arg0.method442(-21351);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method757(int arg0, int arg1) {
        if (arg1 != -1972819574) {
            method752(-93);
        }
        field2262++;
        return arg0 >>> 10;
    }
}
