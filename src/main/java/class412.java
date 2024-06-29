import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class412 extends class80 {

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "Z")
    public boolean field6042 = true;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "[[Z")
    public static boolean[][] field6034 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "Lfg;")
    public static class83 field6036 = new class83("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "Luf;")
    public static class310 field6047 = new class310(56, -2);

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "Lus;")
    public class1 field6031;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "[I")
    private int[] field6026;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "[I")
    public int[] field6040;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field6027;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "[[I")
    private int[][] field6030;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Llh;B[I)V", line = 3)
    public final void method2449(class365 arg0, byte arg1, int[] arg2) {
        field6035++;
        if (this.field6026 == null) {
            return;
        }
        for (int var4 = 0; this.field6026.length > var4 && arg2.length > var4; var4++) {
            int var5 = this.method2459(var4, (byte) 115).field3187;
            if (var5 > 0) {
                arg0.method2105((long) arg2[var4], var5, (byte) 37);
            }
        }
        int var6 = 3 / ((-arg1 - 35) / 44);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I", line = 30)
    public static final int method2450(int arg0, int arg1) {
        field6038++;
        return arg1 == -4 ? arg0 >>> 7 : -51;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 42)
    public final void method2451(int arg0) {
        field6032++;
        if (this.field6040 != null) {
            for (int var2 = 0; var2 < this.field6040.length; var2++) {
                this.field6040[var2] = class25.method183(this.field6040[var2], 32768);
            }
        }
        if (arg0 != -7799) {
            field6044 = 26;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILlh;)Ljava/lang/String;", line = 63)
    public final String method2452(int arg0, class365 arg1) {
        if (arg0 != 8192) {
            this.field6042 = false;
        }
        field6043++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6026 != null) {
            for (int var4 = 0; var4 < this.field6026.length; var4++) {
                var3.append(this.field6027[var4]);
                var3.append(this.field6031.method4((byte) 104, arg1.method2091(arg0 - 8312, class352.method1948(this.field6026[var4], false).field3190), this.method2459(var4, (byte) 125), this.field6030[var4]));
            }
        }
        var3.append(this.field6027[this.field6027.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBLlh;)V", line = 97)
    private final void method2453(int arg0, byte arg1, class365 arg2) {
        field6029++;
        if (arg0 == 1) {
            this.field6027 = class96.method654(arg2.method2106(-1), '<', false);
        } else if (arg0 == 2) {
            int var9 = arg2.method2099(255);
            this.field6040 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field6040[var10] = arg2.method2062((byte) 14);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2099(255);
            this.field6030 = new int[var4][];
            this.field6026 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2062((byte) 14);
                class228 var7 = class352.method1948(var6, false);
                if (var7 != null) {
                    this.field6026[var5] = var6;
                    this.field6030[var5] = new int[var7.field3186];
                    for (int var8 = 0; var8 < var7.field3186; var8++) {
                        this.field6030[var5][var8] = arg2.method2062((byte) 14);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field6042 = false;
        }
        int var11 = 31 / ((63 - arg1) / 59);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(ILlh;)V", line = 172)
    public final void method2454(int arg0, class365 arg1) {
        if (arg0 != 0) {
            field6044 = -69;
        }
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                field6033++;
                return;
            }
            this.method2453(var3, (byte) -70, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 197)
    public static void method2455(int arg0) {
        field6034 = null;
        if (arg0 >= 7) {
            field6047 = null;
            field6036 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)Ljava/lang/String;", line = 221)
    public final String method2456(int arg0) {
        field6037++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field6027 == null) {
            return "";
        }
        if (arg0 >= -75) {
            this.field6040 = null;
        }
        var2.append(this.field6027[0]);
        for (int var3 = 1; var3 < this.field6027.length; var3++) {
            var2.append("...");
            var2.append(this.field6027[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLir;)V", line = 249)
    public static final void method2457(boolean arg0, class22 arg1) {
        field6041++;
        boolean var2 = arg0;
        if (class393.field5484 == arg1.field304 || arg1.field271 == -1 || arg1.field325 != 0) {
            var2 = true;
        } else {
            class467 var3 = class275.field3740.method1484(0, arg1.field271);
            if (var3.field6816 || var3.field6829[arg1.field273] < arg1.field335 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field304 - arg1.field287;
            int var5 = class393.field5484 - arg1.field287;
            int var6 = arg1.field346 * 128 + arg1.method167(-1) * 64;
            int var7 = arg1.field351 * 128 + (arg1.method167(-1) * 64);
            int var8 = arg1.field294 * 128 + (arg1.method167(-1) * 64);
            int var9 = arg1.field352 * 128 + (arg1.method167(-1) * 64);
            arg1.field466 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg1.field461 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field371 = 0;
        if (arg1.field293 == 0) {
            arg1.method169(!arg0, 8192);
        }
        if (arg1.field293 == 1) {
            arg1.method169(true, 12288);
        }
        if (arg1.field293 == 2) {
            arg1.method169(true, 0);
        }
        if (arg1.field293 == 3) {
            arg1.method169(true, 4096);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)I", line = 305)
    public final int method2458(byte arg0) {
        field6028++;
        if (this.field6026 == null) {
            return 0;
        } else {
            int var2 = -21 % ((arg0 + 12) / 45);
            return this.field6026.length;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Ltk;", line = 320)
    public final class228 method2459(int arg0, byte arg1) {
        field6039++;
        if (this.field6026 == null || arg0 < 0 || this.field6026.length < arg0) {
            return null;
        } else if (arg1 <= 111) {
            return null;
        } else {
            return class352.method1948(this.field6026[arg0], false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)I", line = 341)
    public final int method2460(int arg0, int arg1, int arg2) {
        if (arg2 > -47) {
            return -85;
        }
        field6046++;
        if (this.field6026 == null || arg1 < 0 || arg1 > this.field6026.length) {
            return -1;
        } else if (this.field6030[arg1] == null || arg0 < 0 || arg0 > this.field6030[arg1].length) {
            return -1;
        } else {
            return this.field6030[arg1][arg0];
        }
    }
}
