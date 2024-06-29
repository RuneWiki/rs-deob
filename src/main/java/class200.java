import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class200 extends class539 {

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "Luc;")
    public static class27 field2951 = new class27(0, 0);

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "[I")
    public static int[] field2954 = new int[120];

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "[S")
    public static short[] field2958;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
    public int[] field2945;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
    public int[] field2946;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "[I")
    public int[] field2950;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "[Loaa;")
    public class260[] field2949;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "[Loaa;")
    public class260[] field2952;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "[[[B")
    public byte[][][] field2955;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field2951 = null;
        if (arg0 == -24056) {
            field2958 = null;
            field2954 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -28) {
            return;
        }
        if (arg4 <= class631.field8829 && arg0 >= class92.field1219) {
            boolean var6;
            if (class482.field6703 > arg2) {
                var6 = false;
                arg2 = class482.field6703;
            } else if (arg2 > class144.field2148) {
                var6 = false;
                arg2 = class144.field2148;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg1 < class482.field6703) {
                arg1 = class482.field6703;
                var7 = false;
            } else if (arg1 <= class144.field2148) {
                var7 = true;
            } else {
                arg1 = class144.field2148;
                var7 = false;
            }
            if (arg4 < class92.field1219) {
                arg4 = class92.field1219;
            } else {
                class548.method3012(arg1, (byte) 23, arg3, arg2, class476.field6655[arg4++]);
            }
            if (class631.field8829 >= arg0) {
                class548.method3012(arg1, (byte) 23, arg3, arg2, class476.field6655[arg0--]);
            } else {
                arg0 = class631.field8829;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class476.field6655[var8];
                    var9[arg2] = var9[arg1] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class476.field6655[var10][arg2] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class476.field6655[var11][arg1] = arg3;
                }
            }
        }
        field2947++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1347(byte arg0, String arg1) {
        field2953++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class548.method3013(arg1.charAt(var2), 7684)) {
            var2++;
        }
        if (arg0 >= -104) {
            return null;
        }
        while (var2 < var3 && class548.method3013(arg1.charAt(var3 - 1), 7684)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class237.method1498(0, var7)) {
                char var8 = class663.method3674(var7, 5409);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2954[var1] = var0 / 4;
        }
        field2957 = 0;
        field2958 = new short[] { -10304, 9104, -1, -1, -1 };
    }
}
