import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class148 extends class287 {

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "Z")
    public boolean field2270 = true;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "[Lhv;")
    public static class149[] field2269 = new class149[30];

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "[[B")
    public static byte[][] field2265 = new byte[1000][];

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2266 = new String[100];

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "Lkc;")
    public static class157 field2271 = new class157("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "Lrv;")
    public class223 field2272;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "[I")
    public int[] field2275;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "[I")
    private int[] field2278;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field2264;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "[[I")
    private int[][] field2273;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B[ILsv;)V", line = 5)
    public final void method1062(byte arg0, int[] arg1, class319 arg2) {
        field2276++;
        if (this.field2278 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2278.length && var4 < arg1.length; var4++) {
            int var5 = this.method1064(var4, (byte) -120).field113;
            if (var5 > 0) {
                arg2.method1839((long) arg1[var4], (byte) -109, var5);
            }
        }
        if (arg0 != -77) {
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)Ljava/lang/String;", line = 35)
    public final String method1063(int arg0) {
        field2277++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2264 == null) {
            return "";
        }
        var2.append(this.field2264[0]);
        if (arg0 < 50) {
            field2271 = null;
        }
        for (int var3 = 1; var3 < this.field2264.length; var3++) {
            var2.append("...");
            var2.append(this.field2264[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)Lde;", line = 62)
    public final class10 method1064(int arg0, byte arg1) {
        field2281++;
        if (this.field2278 == null || arg0 < 0 || arg0 > this.field2278.length) {
            return null;
        } else {
            if (arg1 > -105) {
                this.field2270 = false;
            }
            return class125.method907(13864, this.field2278[arg0]);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBI)I", line = 82)
    public final int method1065(int arg0, byte arg1, int arg2) {
        field2274++;
        int var4 = 124 % ((-arg1 - 39) / 43);
        if (this.field2278 == null || arg0 < 0 || this.field2278.length < arg0) {
            return -1;
        } else if (this.field2273[arg0] == null || arg2 < 0 || this.field2273[arg0].length < arg2) {
            return -1;
        } else {
            return this.field2273[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V", line = 107)
    public static void method1066(byte arg0) {
        field2266 = null;
        field2271 = null;
        field2265 = null;
        if (arg0 != 95) {
            field2265 = null;
        }
        field2269 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZZ)Z", line = 130)
    public static final boolean method1067(boolean arg0, boolean arg1) {
        field2262++;
        if (!arg0) {
            return false;
        }
        boolean var2 = class275.field3737.method549();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class275.field3737.method491();
        } else if (!class275.field3737.method500()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class76.field1075.field3679 = arg1;
            class76.field1075.method1098(-9, class346.field4985);
            return true;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILsv;I)V", line = 166)
    private final void method1068(int arg0, class319 arg1, int arg2) {
        field2263++;
        if (arg0 != 0) {
            this.field2275 = null;
        }
        if (arg2 == 1) {
            this.field2264 = class139.method982('<', (byte) 10, arg1.method1871(arg0 ^ 0x61));
        } else if (arg2 == 2) {
            int var9 = arg1.method1869(arg0 - 79);
            this.field2275 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2275[var10] = arg1.method1844(-105);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1869(-99);
            this.field2273 = new int[var4][];
            this.field2278 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1844(-112);
                class10 var7 = class125.method907(arg0 ^ 0x3628, var6);
                if (var7 != null) {
                    this.field2278[var5] = var6;
                    this.field2273[var5] = new int[var7.field114];
                    for (int var8 = 0; var8 < var7.field114; var8++) {
                        this.field2273[var5][var8] = arg1.method1844(class373.method2233(arg0, -116));
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2270 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V", line = 242)
    public final void method1069(int arg0) {
        int var2 = -71 / ((arg0 - 53) / 49);
        if (this.field2275 != null) {
            for (int var3 = 0; var3 < this.field2275.length; var3++) {
                this.field2275[var3] = class219.method1367(this.field2275[var3], 32768);
            }
        }
        field2279++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lsv;B)V", line = 262)
    public final void method1070(class319 arg0, byte arg1) {
        if (arg1 < 5) {
            return;
        }
        field2280++;
        while (true) {
            int var3 = arg0.method1869(-79);
            if (var3 == 0) {
                return;
            }
            this.method1068(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lsv;I)Ljava/lang/String;", line = 284)
    public final String method1071(class319 arg0, int arg1) {
        field2267++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2278 != null) {
            for (int var4 = 0; var4 < this.field2278.length; var4++) {
                var3.append(this.field2264[var4]);
                var3.append(this.field2272.method1388(this.field2273[var4], (byte) -29, this.method1064(var4, (byte) -116), arg0.method1880(class125.method907(13864, this.field2278[var4]).field112, 255)));
            }
        }
        var3.append(this.field2264[this.field2264.length - 1]);
        int var5 = -94 / ((-arg1 - 13) / 42);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(B)I", line = 323)
    public final int method1072(byte arg0) {
        if (arg0 < 52) {
            return -94;
        } else {
            field2282++;
            return this.field2278 == null ? 0 : this.field2278.length;
        }
    }
}
