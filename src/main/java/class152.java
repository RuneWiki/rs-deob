import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class152 {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field2234 = -1;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field2241 = -1;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Z")
    public boolean field2250 = true;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    private int field2253 = -1;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[Ljava/lang/String;")
    public String[] field2245 = new String[5];

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
    public boolean field2238 = false;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field2242 = -1;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public int field2251 = 0;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field2240 = -1;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public int field2265 = -1;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field2252 = -1;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Z")
    public boolean field2237 = true;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "Z")
    public boolean field2266 = true;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    private int field2267 = -1;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public int field2262 = -1;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Ljf;")
    public static class216 field2261 = new class216(4);

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field2268 = -1;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "[I")
    public static int[] field2269 = new int[4096];

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2270;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "J")
    public static long field2273;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Ljava/lang/String;")
    public String field2243;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Ljava/lang/String;")
    public String field2259;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
    public int[] field2249;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lvh;")
    public static final class49 method1047(int arg0) {
        if (arg0 == 14) {
            field2257++;
            return class207.field3240;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lca;")
    public final class91 method1048(int arg0) {
        class91 var2 = (class91) class281.field4572.method1517((long) (this.field2267 | 0x20000), (byte) 91);
        field2254++;
        if (arg0 != 5505) {
            return null;
        } else if (var2 == null) {
            class74.field1123.method509(arg0 + 22130, this.field2267);
            class91 var3 = class92.method630(this.field2267, true, class74.field1123, 0);
            if (var3 != null) {
                var3.field2948 = 0;
                var3.field2951 = var3.field2946;
                var3.field2949 = 0;
                var3.field2945 = var3.field2952;
                class281.field4572.method1518(var3, (long) (this.field2267 | 0x20000), (byte) 75);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lim;II)V")
    private final void method1049(class170 arg0, int arg1, int arg2) {
        field2246++;
        int var4 = -21 % ((arg2 + 29) / 49);
        if (arg1 == 1) {
            this.field2241 = arg0.method1186((byte) -78);
        } else if (arg1 == 2) {
            this.field2252 = arg0.method1186((byte) -94);
        } else if (arg1 == 3) {
            this.field2243 = arg0.method1195(-1);
        } else if (arg1 == 4) {
            this.field2260 = arg0.method1212(460736848);
        } else if (arg1 == 5) {
            this.field2265 = arg0.method1212(460736848);
        } else if (arg1 == 6) {
            this.field2251 = arg0.method1218(-120);
        } else if (arg1 == 7) {
            int var7 = arg0.method1218(124);
            if ((var7 & 0x1) == 0) {
                this.field2266 = false;
            }
            if ((var7 & 0x2) == 2) {
                this.field2238 = true;
                return;
            }
        } else if (arg1 == 8) {
            this.field2250 = arg0.method1218(115) == 1;
            return;
        } else if (arg1 == 9) {
            this.field2234 = arg0.method1186((byte) -107);
            if (this.field2234 == 65535) {
                this.field2234 = -1;
            }
            this.field2253 = arg0.method1186((byte) -59);
            if (this.field2253 == 65535) {
                this.field2253 = -1;
            }
            this.field2247 = arg0.method1190(6345);
            this.field2264 = arg0.method1190(6345);
            return;
        } else if (arg1 < 10 || arg1 > 14) {
            if (arg1 != 15) {
                if (arg1 != 16) {
                    if (arg1 == 17) {
                        this.field2259 = arg0.method1195(-1);
                        return;
                    }
                    if (arg1 != 18) {
                        if (arg1 == 19) {
                            this.field2262 = arg0.method1186((byte) -77);
                            return;
                        }
                        if (arg1 != 20) {
                            if (arg1 == 21) {
                                this.field2256 = arg0.method1190(6345);
                            } else if (arg1 == 22) {
                                this.field2248 = arg0.method1190(6345);
                                return;
                            }
                            return;
                        }
                        this.field2240 = arg0.method1186((byte) -90);
                        if (this.field2240 == 65535) {
                            this.field2240 = -1;
                        }
                        this.field2242 = arg0.method1186((byte) -85);
                        if (this.field2242 == 65535) {
                            this.field2242 = -1;
                        }
                        this.field2263 = arg0.method1190(6345);
                        this.field2239 = arg0.method1190(6345);
                        return;
                    }
                    this.field2267 = arg0.method1186((byte) -112);
                    return;
                }
                this.field2237 = false;
                return;
            }
            int var5 = arg0.method1218(97);
            this.field2249 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field2249[var6] = arg0.method1193(-1);
            }
            this.field2258 = arg0.method1190(6345);
            this.field2255 = arg0.method1190(6345);
            return;
        } else {
            this.field2245[arg1 - 10] = arg0.method1195(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static void method1050(int arg0) {
        if (arg0 != -1) {
            method1047(-49);
        }
        field2270 = null;
        field2261 = null;
        field2269 = null;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Z")
    public final boolean method1051(int arg0) {
        if (arg0 != -8963) {
            return true;
        }
        field2233++;
        if (this.field2253 == -1 && this.field2234 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field2253 == -1) {
            var3 = class161.method1101(1357013281, this.field2234);
        } else {
            var3 = class299.field4770[this.field2253];
        }
        if (var3 < this.field2247 || var3 > this.field2264) {
            return false;
        } else if (this.field2242 == -1 && this.field2240 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2242 == -1) {
                var5 = class161.method1101(1357013281, this.field2240);
            } else {
                var5 = class299.field4770[this.field2242];
            }
            return var5 >= this.field2263 && var5 <= this.field2239;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZZ)Lci;")
    public final class189 method1052(int arg0, boolean arg1, boolean arg2) {
        field2244++;
        int var4 = arg1 ? this.field2252 : this.field2241;
        class189 var5 = (class189) class281.field4572.method1517((long) ((arg1 ? 65536 : 0) | var4), (byte) -121);
        if (var5 != null) {
            return var5;
        } else if (class74.field1123.method509(27635, var4)) {
            class91 var6 = class92.method630(var4, true, class74.field1123, 0);
            if (arg0 != -28744) {
                method1047(127);
            }
            if (var6 != null) {
                var6.field2951 = var6.field2946;
                var6.field2949 = 0;
                var6.field2948 = 0;
                var6.field2945 = var6.field2952;
                class281.field4572.method1518(var6, (long) ((arg1 ? 65536 : 0) | var4), (byte) 75);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lim;I)V")
    public final void method1053(class170 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1218(92);
            if (var3 == 0) {
                int var4 = 4 / ((arg1 - 62) / 44);
                field2235++;
                return;
            }
            this.method1049(arg0, var3, -118);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2269[var0] = class3.method20(var0, 40960);
        }
        field2272 = 0;
        field2270 = new CRC32();
        field2274 = 0;
    }
}
