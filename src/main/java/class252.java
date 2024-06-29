import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class252 extends class363 {

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "Ljava/lang/String;")
    public String field3239;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "[C")
    public char[] field3240;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "[C")
    public char[] field3248;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "[I")
    public int[] field3243;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "[Ld;")
    public static class140[] field3250;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "[[[B")
    public static byte[][][] field3249;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZC)I", line = 3)
    public final int method1514(boolean arg0, char arg1) {
        field3251++;
        if (this.field3243 == null) {
            return -1;
        } else if (arg0) {
            return -87;
        } else {
            for (int var3 = 0; var3 < this.field3243.length; var3++) {
                if (this.field3240[var3] == arg1) {
                    return this.field3243[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 27)
    public final void method1515(byte arg0) {
        if (this.field3246 != null) {
            for (int var2 = 0; var2 < this.field3246.length; var2++) {
                this.field3246[var2] = class364.method2113(this.field3246[var2], 32768);
            }
        }
        field3247++;
        if (arg0 != -98) {
            this.method1514(true, (char) 65416);
        }
        if (this.field3243 != null) {
            for (int var3 = 0; var3 < this.field3243.length; var3++) {
                this.field3243[var3] = class364.method2113(this.field3243[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILji;I)V", line = 57)
    private final void method1516(int arg0, class572 arg1, int arg2) {
        field3254++;
        if (arg2 < 111) {
            field3241 = 92;
        }
        if (arg0 == 1) {
            this.field3239 = arg1.method3072(255);
        } else if (arg0 == 2) {
            int var7 = arg1.method3097((byte) 12);
            this.field3243 = new int[var7];
            this.field3240 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3243[var8] = arg1.method3031(-1);
                byte var9 = arg1.method3083(255);
                this.field3240[var8] = var9 == 0 ? 0 : class171.method1030(var9, true);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method3097((byte) 12);
            this.field3248 = new char[var4];
            this.field3246 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3246[var5] = arg1.method3031(-1);
                byte var6 = arg1.method3083(255);
                this.field3248[var5] = var6 == 0 ? 0 : class171.method1030(var6, true);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILji;)V", line = 120)
    public final void method1517(int arg0, class572 arg1) {
        field3253++;
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method1521(-66, null, true);
                    return;
                }
            }
            this.method1516(var3, arg1, arg0 + 122);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z", line = 140)
    public static final boolean method1518(int arg0, int arg1, int arg2) {
        field3245++;
        if (arg2 != 540800) {
            method1521(114, null, false);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)V", line = 167)
    public static final void method1519(int arg0, int arg1, byte arg2) {
        field3252++;
        int var3 = class36.field540.method127(class671.field9138.method3726((byte) 43, class71.field912), (byte) -32);
        if (arg2 != -8) {
            return;
        }
        for (class501 var4 = (class501) class345.field4438.method1909(true); var4 != null; var4 = (class501) class345.field4438.method1916((byte) 95)) {
            int var8 = class645.method3610(var4, 107);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class638.field8648 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (var6 + var3 > class309.field3890) {
            var6 = class309.field3890 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class491.field6129 < (var5 + arg1)) {
            var7 = class491.field6129 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class284.field3593 = var6;
        class367.field4752 = true;
        class465.field5774 = var7;
        class484.field6012 = class638.field8648 * 16 + (class353.field4564 ? 26 : 22);
        class559.field6988 = var3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(CI)I", line = 218)
    public final int method1520(char arg0, int arg1) {
        field3244++;
        if (this.field3246 == null) {
            return -1;
        } else if (arg1 == 2) {
            for (int var3 = 0; var3 < this.field3246.length; var3++) {
                if (this.field3248[var3] == arg0) {
                    return this.field3246[var3];
                }
            }
            return -1;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 247)
    public static final void method1521(int arg0, String arg1, boolean arg2) {
        if (arg2) {
            class417.method2324("", "", "", arg1, 0, (byte) -95, arg0);
            field3242++;
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V", line = 261)
    public static void method1522(int arg0) {
        if (arg0 <= -97) {
            field3249 = null;
            field3250 = null;
        }
    }
}
