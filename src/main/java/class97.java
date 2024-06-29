import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class4 {

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    private int field2223 = 0;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field2225 = 1;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Loa;")
    public static class98 field2227 = class38.method349(255, "(U1");

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Loa;")
    private static class98 field2226 = class38.method349(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Loa;")
    public static class98 field2221 = class38.method349(255, "logo");

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "Loa;")
    public static class98 field2238 = class38.method349(255, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "Loa;")
    public static class98 field2245 = class38.method349(255, "Side panel redrawn");

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "Loa;")
    public static class98 field2228 = class38.method349(255, "T");

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "Loa;")
    public static class98 field2242 = field2226;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "Loa;")
    public static class98 field2239 = class38.method349(255, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "Z")
    public static volatile boolean field2220 = true;

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    public static volatile int field2235 = 0;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "Ln;")
    public static class90 field2236 = new class90(64);

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "Loa;")
    public static class98 field2248 = class38.method349(255, "blinken2:");

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Lgb;")
    public static class45 field2231;

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "Lmd;")
    public static class87 field2244;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "[Loc;")
    public static class100[] field2241;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static final void method772(int arg0) {
        class105.field2385.method734(-224779128);
        field2237++;
        if (arg0 == 1) {
            class114.field2566.method734(arg0 - 224779129);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lb;II)V")
    public final void method773(class8 arg0, int arg1, int arg2) {
        if (arg2 != 255) {
            field2235 = -75;
        }
        while (true) {
            int var4 = arg0.method62((byte) 80);
            if (var4 == 0) {
                field2224++;
                return;
            }
            this.method774(var4, arg0, arg1, arg2 ^ 0xFFFFFF01);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILb;II)V")
    private final void method774(int arg0, class8 arg1, int arg2, int arg3) {
        if (~arg0 == arg3) {
            this.field2223 = arg1.method56(-19856);
        }
        field2219++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(ZI)V")
    public static final void method775(boolean arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 127) {
            field2228 = null;
        }
        while (class130.field3024 > var2) {
            class150 var3 = class38.field935[class90.field2073[var2]];
            int var4 = (class90.field2073[var2] << 14) + 536870912;
            if (var3 != null && var3.method450(-2289) && arg0 == var3.field3709.field3344 && var3.field3709.method1114(67)) {
                int var5 = var3.field3657 >> 7;
                int var6 = var3.field3667 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    label72: {
                        if (var3.field3660 == 1 && (var3.field3657 & 0x7F) == 64 && (var3.field3667 & 0x7F) == 64) {
                            if (class5.field76[var5][var6] == class127.field2854) {
                                break label72;
                            }
                            class5.field76[var5][var6] = class127.field2854;
                        }
                        if (!var3.field3709.field3351) {
                            var4 += Integer.MIN_VALUE;
                        }
                        class138.field3373.method256(class114.field2572, var3.field3657, var3.field3667, class31.method305(-106, var3.field3660 * 64 + var3.field3667 - 64, class114.field2572, (var3.field3660 - 1) * 64 + var3.field3657), var3.field3660 * 64 - 4, var3, var3.field3620, var4, var3.field3639);
                    }
                }
            }
            var2++;
        }
        field2233++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public final void method776(boolean arg0) {
        if (!arg0) {
            field2242 = null;
        }
        field2240++;
        this.method777(24405, this.field2223);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    private final void method777(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 != 24405) {
            this.method776(false);
        }
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        field2230++;
        double var9 = var3;
        if (var7 > var3) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        if (var9 < var5) {
            var9 = var5;
        }
        double var15 = var3;
        if (var7 < var3) {
            var15 = var7;
        }
        if (var15 > var5) {
            var15 = var5;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field2232 = (int) (var17 * 256.0D);
        if (this.field2232 < 0) {
            this.field2232 = 0;
        } else if (this.field2232 > 255) {
            this.field2232 = 255;
        }
        if (var9 != var15) {
            if (var3 == var9) {
                var11 = (var7 - var5) / (var9 - var15);
            } else if (var7 == var9) {
                var11 = (var5 - var3) / (var9 - var15) + 2.0D;
            } else if (var5 == var9) {
                var11 = (var3 - var7) / (var9 - var15) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        this.field2222 = (int) (var13 * 256.0D);
        double var19 = var11 / 6.0D;
        if (var17 > 0.5D) {
            this.field2243 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2243 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field2243 < 1) {
            this.field2243 = 1;
        }
        if (this.field2222 < 0) {
            this.field2222 = 0;
        } else if (this.field2222 > 255) {
            this.field2222 = 255;
        }
        this.field2229 = (int) ((double) this.field2243 * var19);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field2221 = null;
        if (arg0 != -75) {
            field2245 = null;
        }
        field2245 = null;
        field2231 = null;
        field2228 = null;
        field2238 = null;
        field2226 = null;
        field2236 = null;
        field2248 = null;
        field2244 = null;
        field2242 = null;
        field2239 = null;
        field2241 = null;
        field2227 = null;
    }
}
