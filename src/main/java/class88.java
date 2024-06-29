import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class88 extends class5 {

    @OriginalMember(owner = "client!od", name = "W", descriptor = "Z")
    public boolean field2227 = true;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public int field2232 = 0;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public int field2235 = -1;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
    public int field2245 = -1;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "[B")
    public static byte[] field2230 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Lhb;")
    public static class44 field2234 = class102.method810("Stufe)2", -28606);

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "[[B")
    public static byte[][] field2229 = new byte[1000][];

    @OriginalMember(owner = "client!od", name = "U", descriptor = "Lhb;")
    public static class44 field2225 = class102.method810(":tradereq:", -28606);

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "Z")
    public static boolean field2251 = false;

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "Z")
    public static boolean field2247 = false;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "Lhb;")
    public static class44 field2244 = class102.method810("Privater Chat", -28606);

    @OriginalMember(owner = "client!od", name = "xb", descriptor = "Lhb;")
    private static class44 field2254 = class102.method810("To", -28606);

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "Lhb;")
    public static class44 field2241 = field2254;

    @OriginalMember(owner = "client!od", name = "Ab", descriptor = "Lhb;")
    public static class44 field2257 = class102.method810("cross", -28606);

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "Lhb;")
    private static class44 field2250 = class102.method810("flash3:", -28606);

    @OriginalMember(owner = "client!od", name = "yb", descriptor = "Lhb;")
    private static class44 field2255 = class102.method810("No response from server)3", -28606);

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Lhb;")
    public static class44 field2248 = field2255;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Lhb;")
    public static class44 field2249 = field2250;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!od", name = "wb", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!od", name = "zb", descriptor = "Lr;")
    public static class102 field2256;

    @OriginalMember(owner = "client!od", name = "vb", descriptor = "Lpc;")
    public static class93 field2252;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBLwd;I)V", line = 4)
    private final void method711(int arg0, byte arg1, class131 arg2, int arg3) {
        field2240++;
        if (arg0 == 1) {
            this.field2232 = arg2.method974(255);
        } else if (arg0 == 2) {
            this.field2245 = arg2.method971(true);
        } else if (arg0 == 5) {
            this.field2227 = false;
        } else if (arg0 == 7) {
            this.field2235 = arg2.method974(255);
        }
        int var5 = 7 / ((8 - arg1) / 57);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V", line = 60)
    private final void method712(int arg0, byte arg1) {
        field2242++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 != -77) {
            field2250 = null;
        }
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2246 = (int) (var15 * 256.0D);
        if (this.field2246 < 0) {
            this.field2246 = 0;
        } else if (this.field2246 > 255) {
            this.field2246 = 255;
        }
        this.field2237 = (int) (var17 * 256.0D);
        if (this.field2237 < 0) {
            this.field2237 = 0;
        } else if (this.field2237 > 255) {
            this.field2237 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field2224 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V", line = 149)
    public static final void method713(byte arg0, int arg1) {
        class21.field449 += arg1;
        field2238++;
        while (class94.field2391 <= class21.field449) {
            class21.field449 -= class94.field2391;
            class128.field3085 -= class128.field3085 >> 2;
        }
        class128.field3085 -= arg1 * 1000;
        int var2 = -29 / ((-arg0 - 44) / 33);
        if (class128.field3085 < 0) {
            class128.field3085 = 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 181)
    public static final void method714(int arg0) {
        class44.field1103.method335((byte) -125);
        field2231++;
        if (arg0 != 23391) {
            method718(70, 20);
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V", line = 194)
    public final void method715(int arg0) {
        if (this.field2235 != arg0) {
            this.method712(this.field2235, (byte) -77);
            this.field2243 = this.field2237;
            this.field2228 = this.field2224;
            this.field2253 = this.field2246;
        }
        field2239++;
        this.method712(this.field2232, (byte) -77);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILwd;I)V", line = 210)
    public final void method716(int arg0, class131 arg1, int arg2) {
        if (arg0 != -20927) {
            field2256 = null;
        }
        field2226++;
        while (true) {
            int var4 = arg1.method971(true);
            if (var4 == 0) {
                return;
            }
            this.method711(var4, (byte) -92, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 253)
    public static void method717(byte arg0) {
        field2257 = null;
        field2225 = null;
        field2254 = null;
        field2244 = null;
        field2249 = null;
        field2241 = null;
        field2255 = null;
        field2230 = null;
        field2229 = null;
        field2256 = null;
        field2234 = null;
        if (arg0 == 15) {
            field2252 = null;
            field2248 = null;
            field2250 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lud;", line = 321)
    public static final class121 method718(int arg0, int arg1) {
        class121 var2 = (class121) class94.field2390.method330((long) arg1, -1);
        field2233++;
        if (var2 != null) {
            return var2;
        }
        class121 var3 = class84.method685(false, (byte) -114, arg1, class130.field3109, class89.field2267);
        int var4 = -120 % ((arg0 + 73) / 32);
        if (var3 != null) {
            class94.field2390.method332(var3, 0, (long) arg1);
        }
        return var3;
    }
}
