import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class21 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[I")
    public static int[] field324 = new int[5];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lci;")
    public static class60 field330 = new class60();

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field332 = "slide:";

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field333 = -1;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field331;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[[B")
    public static byte[][] field335;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method145(long arg0, int arg1) {
        field325++;
        if (arg1 != 32481) {
            field335 = null;
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class77.field1258[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method146(long arg0, byte arg1) {
        field329++;
        int var3 = -7 / ((arg1 + 40) / 51);
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class77.field1258[(int) (var8 - (arg0 * 37L))];
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

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BS)Z")
    public static final boolean method147(byte arg0, short arg1) {
        field328++;
        if (arg1 == 4 || arg1 == 9 || arg1 == 44 || arg1 == 24 || arg1 == 39 || arg1 == 46 || arg1 == 2 || arg1 == 10) {
            return true;
        } else if (arg1 == 26 || arg1 == 45 || arg1 == 1007 || arg1 == 1001) {
            return true;
        } else {
            if (arg0 < 41) {
                field324 = null;
            }
            if (arg1 == 40 || arg1 == 48 || arg1 == 29 || arg1 == 13 || arg1 == 25) {
                return true;
            } else {
                return arg1 == 19 || arg1 == 3 || arg1 == 42 || arg1 == 49 || arg1 == 50 || arg1 == 22;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method148(int arg0) {
        field335 = null;
        field324 = null;
        field330 = null;
        field332 = null;
        field331 = null;
        if (arg0 != 0) {
            field324 = null;
        }
    }
}
