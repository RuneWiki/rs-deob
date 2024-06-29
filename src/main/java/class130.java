import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class130 extends class175 {

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    private int field2275 = 1;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    private int field2279 = 204;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    private int field2286 = 1;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lij;")
    private static class50 field2276 = class78.method578(123, "Tue");

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lij;")
    private static class50 field2282 = class78.method578(124, "Wed");

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lij;")
    private static class50 field2278 = class78.method578(122, "Loaded textures");

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lij;")
    private static class50 field2277 = class78.method578(127, "Sat");

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "Lij;")
    private static class50 field2283 = class78.method578(123, "Mon");

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lij;")
    public static class50 field2288 = field2278;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lij;")
    private static class50 field2287 = class78.method578(122, "Sun");

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Lij;")
    private static class50 field2285 = class78.method578(127, "Fri");

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lij;")
    private static class50 field2292 = class78.method578(126, "Thu");

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "[Lij;")
    public static class50[] field2274 = new class50[] { field2287, field2283, field2276, field2282, field2292, field2285, field2277 };

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[[[B")
    public static byte[][][] field2280;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        class182.field3004.method841(-81);
        if (arg0 <= -64) {
            ++field2273;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field2284;
        if (arg0) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field2279 = arg2.method1441(-105);
                    }
                } else {
                    this.field2286 = arg2.method1487(255);
                }
            } else {
                this.field2275 = arg2.method1487(255);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            field2277 = null;
        }
        ++field2290;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            for (int var4 = 0; ~class211.field3514 < ~var4; ++var4) {
                int var5 = class29.field616[arg0];
                int var6 = class129.field2272[var4];
                int var7 = this.field2286 * var5 >> 12;
                int var8 = var6 % (4096 / this.field2275) * this.field2275;
                int var9 = this.field2275 * var6 >> 12;
                int var10 = var5 % (4096 / this.field2286) * this.field2286;
                if (var10 < this.field2279) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (~var9 < -4) {
                        var9 -= 4;
                    }
                    if (~var9 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field2279) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field2279 < ~var8) {
                    int var11;
                    for (var11 = var9 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    public static void method923(byte arg0) {
        field2288 = null;
        field2277 = null;
        field2276 = null;
        if (arg0 != -68) {
            method922((byte) -112);
        }
        field2280 = null;
        field2285 = null;
        field2282 = null;
        field2292 = null;
        field2274 = null;
        field2283 = null;
        field2287 = null;
        field2278 = null;
    }
}
