import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class186 extends class33 {

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "[I")
    public static int[] field2693 = new int[4096];

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
    public static int[] field2695;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
    public static int field2697;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2693[var0] = class129.method1009(var0, -105);
        }
        field2695 = new int[1000];
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V", line = 4)
    public static void method1248(int arg0) {
        if (arg0 != -32486) {
            field2696 = -27;
        }
        field2693 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 25)
    public static final String method1249(int arg0, long arg1) {
        field2697++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 > -97) {
            method1250(null, -41, -25);
        }
        if ((arg1 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            char var9 = class449.field6538[(int) (var7 - (arg1 * 37L))];
            if (var9 == '_') {
                int var10 = var6.length() - 1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = ' ';
            }
            var6.append(var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 85)
    public static final void method1250(String arg0, int arg1, int arg2) {
        field2694++;
        class21 var3 = class601.method3413(arg1, 3, (byte) 124);
        if (arg2 <= -83) {
            var3.method230(18340);
            var3.field299 = arg0;
        }
    }
}
