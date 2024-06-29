import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class125 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[[S")
    public static short[][] field2253 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Ltg;")
    public static class184 field2252 = class135.method812("jolt", 3);

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2260 = -1;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ltg;")
    private static class184 field2257 = class135.method812("go back to the main RuneScape webpage", 3);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Ltg;")
    public static class184 field2248 = field2257;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lna;")
    public static class124 field2261;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lvb;")
    public static class197 field2259;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lj;")
    public static class87 field2247;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
    public static boolean field2255;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[Lsc;")
    public static class171[] field2250;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
    public static final int method756(int arg0, int arg1, int arg2) {
        field2245++;
        int var3 = 1;
        if (arg2 <= 99) {
            field2257 = null;
        }
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method757(int arg0) {
        if (arg0 != 1) {
            field2253 = null;
        }
        field2252 = null;
        field2257 = null;
        field2248 = null;
        field2250 = null;
        field2253 = null;
        field2259 = null;
        field2261 = null;
        field2247 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method758(int arg0) {
        for (int var1 = arg0; var1 < class87.field1610; var1++) {
            int var2 = class103.field1881[var1];
            class67 var3 = class57.field1024[var2];
            int var4 = class21.field394.method588((byte) -101);
            if ((var4 & 0x8) != 0) {
                var4 += class21.field394.method588((byte) -125) << 8;
            }
            class101.method629(var2, var3, var4, -101);
        }
        field2258++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILud;BBIZI)V")
    public static final void method759(int arg0, class190 arg1, byte arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 != -77) {
            method758(-116);
        }
        long var7 = (long) ((arg6 << 16) + arg4);
        field2249++;
        class83 var9 = (class83) class9.field159.method51(var7, -101);
        if (var9 != null) {
            return;
        }
        class83 var10 = (class83) class212.field4101.method51(var7, 88);
        if (var10 != null) {
            return;
        }
        class83 var11 = (class83) class81.field1455.method51(var7, arg2 ^ 0xFFFFFFC4);
        if (var11 == null) {
            if (!arg5) {
                class83 var12 = (class83) class175.field3318.method51(var7, -127);
                if (var12 != null) {
                    return;
                }
            }
            class83 var13 = new class83();
            var13.field1486 = arg0;
            var13.field1474 = arg1;
            var13.field1485 = arg3;
            if (arg5) {
                class9.field159.method55((byte) -99, var13, var7);
                class73.field1370++;
            } else {
                class2.field45.method921(0, var13);
                class81.field1455.method55((byte) -78, var13, var7);
                class132.field2394++;
            }
        } else if (arg5) {
            var11.method628((byte) -51);
            class9.field159.method55((byte) -74, var11, var7);
            class73.field1370++;
            class132.field2394--;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILfb;IJZ)Z")
    public static final boolean method760(int arg0, int arg1, int arg2, int arg3, int arg4, class52 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class138.method856(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
