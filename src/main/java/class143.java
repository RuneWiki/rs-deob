import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class143 extends class183 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field2543;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[[I")
    public int[][] field2537;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "[Z")
    private boolean[] field2547;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
    public static int[] field2533 = new int[2048];

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Ldj;")
    private static class44 field2535 = class89.method650(255, "Existing User");

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Ldj;")
    private static class44 field2536 = class89.method650(255, " seconds)3");

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Ldj;")
    public static class44 field2540 = class89.method650(255, "l");

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Ldj;")
    public static class44 field2538 = class89.method650(255, "huffman");

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Ldj;")
    public static class44 field2548 = field2535;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Ldj;")
    public static class44 field2549 = field2536;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2542 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
    public static final void method945(int arg0, boolean arg1) {
        class54.field994 = -1;
        if (arg0 == 37) {
            class32.field565 = 3.0D;
        } else if (arg0 == 50) {
            class32.field565 = 4.0D;
        } else if (arg0 == 75) {
            class32.field565 = 6.0D;
        } else {
            class32.field565 = 8.0D;
        }
        field2544++;
        class54.field994 = -1;
        if (!arg1) {
            method946(-27);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static void method946(int arg0) {
        if (arg0 >= -55) {
            field2540 = null;
        }
        field2540 = null;
        field2548 = null;
        field2535 = null;
        field2536 = null;
        field2542 = null;
        field2538 = null;
        field2549 = null;
        field2533 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIILwd;IZJ)Z")
    public static final boolean method947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class234 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class66.field1205 || var20 >= class21.field355) {
                    return false;
                }
                class68 var21 = class32.field567[arg0][var13][var20];
                if (var21 != null && var21.field1300 >= 5) {
                    return false;
                }
            }
        }
        class106 var14 = new class106();
        var14.field1953 = arg11;
        var14.field1952 = arg0;
        var14.field1948 = arg5;
        var14.field1940 = arg6;
        var14.field1941 = arg7;
        var14.field1947 = arg8;
        var14.field1937 = arg9;
        var14.field1945 = arg1;
        var14.field1955 = arg2;
        var14.field1939 = arg1 + arg3 - 1;
        var14.field1936 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class32.field567[var18][var15][var16] == null) {
                        class32.field567[var18][var15][var16] = new class68(var18, var15, var16);
                    }
                }
                class68 var19 = class32.field567[arg0][var15][var16];
                var19.field1314[var19.field1300] = var14;
                var19.field1308[var19.field1300] = var17;
                var19.field1293 |= var17;
                var19.field1300++;
            }
        }
        if (arg10) {
            class98.field1812[class226.field4250++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static final void method948(byte arg0) {
        int var1 = -103 % ((arg0 - 4) / 38);
        class41.field771.method1179((byte) -94);
        field2545++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static final void method949(int arg0) {
        if (arg0 < 115) {
            return;
        }
        field2541++;
        if (class17.field309 != null) {
            class75 var1 = class17.field309;
            synchronized (class17.field309) {
                class17.field309 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I[B)V")
    public class143(int arg0, byte[] arg1) {
        this.field2532 = arg0;
        class66 var3 = new class66(arg1);
        this.field2543 = var3.method506(255);
        this.field2537 = new int[this.field2543][];
        this.field2547 = new boolean[this.field2543];
        this.field2539 = new int[this.field2543];
        for (int var4 = 0; var4 < this.field2543; var4++) {
            this.field2539[var4] = var3.method506(255);
        }
        for (int var5 = 0; var5 < this.field2543; var5++) {
            this.field2547[var5] = var3.method506(255) == 1;
        }
        for (int var6 = 0; var6 < this.field2543; var6++) {
            this.field2537[var6] = new int[var3.method506(255)];
        }
        for (int var7 = 0; var7 < this.field2543; var7++) {
            for (int var8 = 0; var8 < this.field2537[var7].length; var8++) {
                this.field2537[var7][var8] = var3.method506(255);
            }
        }
    }
}
