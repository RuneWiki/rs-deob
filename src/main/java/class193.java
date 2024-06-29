import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class193 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
    public static int[] field2665 = new int[100];

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
    public static boolean field2667 = false;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2666 = "glow3:";

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field2669 = 1;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field2670 = new Random();

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static volatile int field2671 = 0;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 12)
    public static final String method1398(boolean arg0, long arg1) {
        field2668++;
        if (arg0) {
            method1399(0, 92, 4, -71, (class260) null, -105L, (class260) null, (class260) null);
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
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
                char var9 = class237.field3433[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILvc;JLvc;Lvc;)V", line = 63)
    public static final void method1399(int arg0, int arg1, int arg2, int arg3, class260 arg4, long arg5, class260 arg6, class260 arg7) {
        class183 var9 = new class183();
        var9.field2498 = arg4;
        var9.field2491 = arg1 * 128 + 64;
        var9.field2504 = arg2 * 128 + 64;
        var9.field2502 = arg3;
        var9.field2494 = arg5;
        var9.field2501 = arg6;
        var9.field2495 = arg7;
        int var10 = 0;
        class119 var11 = class345.field5367[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1563; var12++) {
                class294 var13 = var11.field1549[var12];
                if ((var13.field4289 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4275.method583();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2499 = -var10;
        if (class345.field5367[arg0][arg1][arg2] == null) {
            class345.field5367[arg0][arg1][arg2] = new class119(arg0, arg1, arg2);
        }
        class345.field5367[arg0][arg1][arg2].field1558 = var9;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 122)
    public static void method1400(int arg0) {
        field2666 = null;
        if (arg0 != 64) {
            method1399(-90, -53, -118, 99, (class260) null, -12L, (class260) null, (class260) null);
        }
        field2670 = null;
        field2665 = null;
    }
}
