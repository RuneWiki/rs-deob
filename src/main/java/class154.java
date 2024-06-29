import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class154 {

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
    public static boolean field2387 = false;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "J")
    public long field2381;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lgh;")
    public class248 field2385;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lgh;")
    public class248 field2386;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lgh;")
    public class248 field2389;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 10)
    public static final String method1118(int arg0, long arg1) {
        field2388++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 <= 109) {
                field2392 = -14;
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class191.field3047[(int) (var7 - (arg1 * 37L))];
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

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z", line = 62)
    public static final boolean method1119(byte arg0) {
        field2380++;
        if (class109.field1458) {
            return true;
        } else if (arg0 == 16) {
            return class184.field2982;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V", line = 77)
    public static final void method1120(int arg0, byte arg1) {
        if (arg1 != -47) {
            field2382 = -122;
        }
        class341.field5305 = new int[arg0];
        class335.field5220 = new int[arg0];
        class282.field4366 = new int[arg0];
        field2384++;
        class259.field4078 = new int[arg0];
        class42.field570 = new int[arg0];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLug;)V", line = 101)
    public static final void method1121(boolean arg0, class253 arg1) {
        if (arg0) {
            field2392 = 13;
        }
        class156.field2418 = arg1;
        field2390++;
    }
}
