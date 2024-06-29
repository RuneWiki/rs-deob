import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class150 extends class60 {

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "[J")
    public static long[] field2460 = new long[32];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ltk;")
    public class266 field2445;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Ltk;")
    public class266 field2458;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Ljava/lang/String;")
    public String field2442;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Z")
    public boolean field2443;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2450;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 13)
    public static final String method1134(int arg0, long arg1) {
        field2447++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 44 / ((8 - arg0) / 34);
            int var4 = 0;
            long var5 = arg1;
            while (var5 != 0L) {
                var5 /= 37L;
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class339.field5241[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    var10 = ' ';
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1135(int arg0) {
        field2453++;
        if (arg0 != 0) {
            method1136(-96);
        }
        class44.field694.method2282((byte) -126);
        class64.field933.method2282((byte) -122);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 77)
    public static final void method1136(int arg0) {
        if (arg0 != 37) {
            field2460 = (long[]) null;
        }
        class247.field3680.method2283((byte) 77);
        field2452++;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)V", line = 93)
    public static void method1137(boolean arg0) {
        field2460 = null;
        if (!arg0) {
            field2455 = -85;
        }
    }
}
