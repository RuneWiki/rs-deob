import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class25 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[[B")
    public static byte[][] field304 = new byte[1000][];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/lang/String;")
    public static String field309 = "slide:";

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[[Z")
    public static boolean[][] field313 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    public static int[] field311 = new int[1000];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public static volatile boolean field312 = true;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Z")
    public static boolean field305;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 4)
    public static void method163(boolean arg0) {
        field304 = (byte[][]) null;
        field309 = null;
        field311 = null;
        if (!arg0) {
            method165(-9, 39, 106);
        }
        field313 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 24)
    public static final String method164(byte arg0, long arg1) {
        field315++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != -47) {
                method163(true);
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class267.field4472[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Lwf;", line = 69)
    public static final class250 method165(int arg0, int arg1, int arg2) {
        field308++;
        if (arg2 != 24836) {
            return (class250) null;
        }
        class250 var3 = class13.method74(-21, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4171 == null || var3.field4171.length <= arg0) {
            return null;
        } else {
            return var3.field4171[arg0];
        }
    }
}
