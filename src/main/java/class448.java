import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class448 extends class45 {

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public int field6560;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "[Z")
    public boolean[] field6568;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "[[I")
    public int[][] field6566;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
    public int[] field6563;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
    public int[] field6569;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Llm;")
    public static class347 field6567;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "Llm;")
    public static class347 field6573;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "[I")
    public static int[] field6562;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)I")
    public static final int method2814(byte arg0) {
        field6571++;
        int var1 = -49 / ((4 - arg0) / 59);
        return 15;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILwm;BI)V")
    public static final void method2815(int arg0, int arg1, int arg2, int arg3, class298 arg4, byte arg5, int arg6) {
        class83.method579(arg6, arg4.field740, arg1, 57, arg3, 0, arg4.field734, arg0, arg2);
        if (arg5 >= 54) {
            field6561++;
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
    public static void method2816(byte arg0) {
        field6573 = null;
        field6567 = null;
        if (arg0 < 4) {
            field6573 = null;
        }
        field6562 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(I[B)V")
    public class448(int arg0, byte[] arg1) {
        this.field6572 = arg0;
        class228 var3 = new class228(arg1);
        this.field6560 = var3.method1348(-122);
        this.field6568 = new boolean[this.field6560];
        this.field6566 = new int[this.field6560][];
        this.field6563 = new int[this.field6560];
        this.field6569 = new int[this.field6560];
        for (int var4 = 0; var4 < this.field6560; var4++) {
            this.field6563[var4] = var3.method1348(-90);
        }
        for (int var5 = 0; var5 < this.field6560; var5++) {
            this.field6568[var5] = var3.method1348(-101) == 1;
        }
        for (int var6 = 0; var6 < this.field6560; var6++) {
            this.field6569[var6] = var3.method1343(255);
        }
        for (int var7 = 0; var7 < this.field6560; var7++) {
            this.field6566[var7] = new int[var3.method1348(-102)];
        }
        for (int var8 = 0; var8 < this.field6560; var8++) {
            for (int var9 = 0; var9 < this.field6566[var8].length; var9++) {
                this.field6566[var8][var9] = var3.method1348(-114);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method2817(byte arg0, String arg1) {
        field6564++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != -122) {
            field6570 = 117;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }
}
