import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class451 extends class320 {

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[I")
    public static int[] field6740 = new int[100];

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Lbu;")
    public static class17 field6741;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "[[I")
    public static int[][] field6746;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lln;I)V")
    public static final void method2686(class256 arg0, int arg1) {
        field6744++;
        if (arg1 != 0) {
            field6738 = -57;
        }
        class69 var2 = (class69) class284.field4051.method171((byte) 75, (long) arg0.field7669);
        if (var2 == null) {
            return;
        }
        if (var2.field1181 != null) {
            class45.field837.method2035(var2.field1181);
            var2.field1181 = null;
        }
        var2.method2090(-1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2687(boolean arg0, long arg1) {
        field6747++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class330.field4983[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            if (!arg0) {
                method2690(-99);
            }
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
    public static final void method2688(int arg0, byte arg1) {
        field6745++;
        class54 var2 = class442.method2651(arg0, 6, -13208);
        var2.method476((byte) -44);
        if (arg1 != 87) {
            method2690(20);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIB)V")
    public static final void method2689(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6737++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        if (arg4 != -118) {
            method2690(87);
        }
        class179.method1269(class21.field430[arg3], arg2, arg0 - arg1, arg0 + arg1, 26985);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class21.field430[arg3 + var6];
                int[] var10 = class21.field430[arg3 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class179.method1269(var9, arg2, var12, var11, arg4 ^ 0xFFFF96E3);
                class179.method1269(var10, arg2, var12, var11, arg4 ^ 0xFFFF96E3);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class21.field430[arg3 + var5];
            int[] var16 = class21.field430[arg3 - var5];
            class179.method1269(var15, arg2, var14, var13, arg4 + 27103);
            class179.method1269(var16, arg2, var14, var13, 26985);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static void method2690(int arg0) {
        if (arg0 != 6) {
            method2690(52);
        }
        field6741 = null;
        field6740 = null;
        field6746 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
    public class451() {
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(I)V")
    public class451(int arg0) {
        this.field6742 = arg0;
    }
}
