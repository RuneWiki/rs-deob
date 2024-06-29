import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lud;")
    private class143 field2257 = new class143(256);

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lud;")
    private class143 field2274 = new class143(256);

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lc;")
    private class15 field2272;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lc;")
    private class15 field2256;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lod;")
    public static class101 field2265 = class46.method335(114, "title)3jpg");

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2258 = -1;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lod;")
    public static class101 field2266 = class46.method335(112, "scape main");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lod;")
    private static class101 field2273 = class46.method335(-128, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lod;")
    public static class101 field2262 = field2273;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lcc;")
    public static class18 field2259;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[I)Lre;")
    private final class123 method750(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg1 ^ ((arg2 & 0xB0000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        if (arg0 != -1441304464) {
            return null;
        }
        field2269++;
        class123 var9 = (class123) this.field2274.method1141(var7, arg0 ^ 0x55E88F8F);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class14 var10 = class14.method99(this.field2256, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class123 var11 = var10.method100();
            this.field2274.method1137((byte) -89, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field2696.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[I)Lre;")
    public final class123 method751(int arg0, int arg1, int[] arg2) {
        field2263++;
        if (arg0 >= -30) {
            return null;
        } else if (this.field2272.method106(58) == 1) {
            return this.method753(arg2, 0, arg1, -122);
        } else if (this.field2272.method112(arg1, 1) == 1) {
            return this.method753(arg2, arg1, 0, -117);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method752(byte arg0) {
        class126.field2793.method135(0);
        field2261++;
        if (arg0 < 88) {
            field2268 = 102;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIII)Lre;")
    private final class123 method753(int[] arg0, int arg1, int arg2, int arg3) {
        field2267++;
        int var5 = (arg1 >>> 12 | (arg1 & 0x30000FFF) << 4) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class123 var9 = (class123) this.field2274.method1141(var7, -1);
        if (arg3 >= -77) {
            method755(null, (byte) -19);
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class128 var10 = (class128) this.field2257.method1141(var7, -1);
            if (var10 == null) {
                var10 = class128.method992(this.field2272, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field2257.method1137((byte) -89, var7, var10);
            }
            class123 var11 = var10.method985(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method959(11835);
                this.field2274.method1137((byte) -89, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field2265 = null;
        field2262 = null;
        field2266 = null;
        if (arg0 <= -63) {
            field2259 = null;
            field2273 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lc;B)V")
    public static final void method755(class15 arg0, byte arg1) {
        if (arg1 < 121) {
            field2264 = 20;
        }
        class98.field2122 = arg0;
        field2271++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B[II)Lre;")
    public final class123 method756(byte arg0, int[] arg1, int arg2) {
        field2270++;
        if (this.field2256.method106(-27) == 1) {
            return this.method750(-1441304464, arg2, 0, arg1);
        }
        int var4 = -75 % ((-arg0 - 15) / 45);
        if (this.field2256.method112(arg2, 1) != 1) {
            throw new RuntimeException();
        }
        return this.method750(-1441304464, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method757(int arg0) {
        class35.field884 = new class78();
        if (arg0 != -27986) {
            method755(null, (byte) 34);
        }
        field2260++;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lc;Lc;)V")
    public class105(class15 arg0, class15 arg1) {
        this.field2272 = arg1;
        this.field2256 = arg0;
    }
}
