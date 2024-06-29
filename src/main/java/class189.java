import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class189 {

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Z")
    public static boolean field2305 = false;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "Z")
    public static boolean field2310 = false;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "Ljk;")
    public static class585 field2306 = new class585(42, 0);

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Ljc;")
    public class406 field2302;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "[I")
    public int[] field2304;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1167(int arg0, long arg1) {
        field2308++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != -5252) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class566.field8281[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lrda;BIII)V")
    public static final void method1168(class613 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2309++;
        int var5 = arg0.field2689[0];
        int var6 = arg0.field2686[0];
        if (var5 < 0 || var5 >= class473.field6604 || var6 < 0 || class205.field2465 <= var6 || arg2 < 0 || arg2 >= class473.field6604 || arg4 < 0 || class205.field2465 <= arg4) {
            return;
        }
        if (arg3 <= 2) {
            method1169((byte) 95);
        }
        int var7 = class564.method3297(true, (byte) -47, arg2, arg4, arg0.method1284((byte) -124), class349.field4642[arg0.field532], class190.field2322, var6, 0, class566.field8283, var5, 0, -4, 0, 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method3512(14380, class566.field8283[var8], arg1, class190.field2322[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)Lwa;")
    public static final class566 method1169(byte arg0) {
        field2307++;
        try {
            if (arg0 != 39) {
                method1169((byte) -106);
            }
            return (class566) Class.forName("vq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public static void method1170(int arg0) {
        if (arg0 != -22253) {
            field2310 = true;
        }
        field2306 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lun;B)Lkda;")
    public static final class356 method1171(class389 arg0, byte arg1) {
        field2303++;
        if (arg1 >= -19) {
            field2306 = null;
        }
        int var2 = arg0.method2260(-32);
        return new class356(var2);
    }
}
