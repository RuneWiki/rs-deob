import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class145 extends class152 {

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field2295;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "[Lri;")
    public static class39[] field2289 = new class39[14];

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "Lpa;")
    public static class141 field2294 = new class141();

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2297 = "Loading sprites - ";

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "Lib;")
    public static class56 field2292;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        field2297 = null;
        if (arg0 <= -87) {
            field2289 = null;
            field2292 = null;
            field2294 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1012(byte arg0, String arg1) {
        int var2 = arg1.length();
        field2293++;
        long var3 = 0L;
        int var5 = 118 % ((arg0 + 65) / 56);
        for (int var6 = 0; var6 < var2; var6++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var6) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1013(long arg0, int arg1) {
        field2296++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 <= 18) {
                field2292 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class94.field1191[(int) (var7 - (arg0 * 37L))];
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

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method898(byte arg0) {
        field2291++;
        return arg0 <= 54 ? null : this.field2295;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)Z")
    public final boolean method899(byte arg0) {
        field2290++;
        int var2 = -116 % ((-arg0 - 81) / 44);
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class145(Object arg0) {
        this.field2295 = arg0;
    }
}
