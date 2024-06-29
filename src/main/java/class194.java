import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class194 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field2902 = 0;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
    public static boolean field2898 = false;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "D")
    public static double field2903 = -1.0D;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Z")
    public static boolean field2908 = false;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2907 = "Loaded wordpack";

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Z")
    public static boolean field2904 = false;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lf;")
    public static class329 field2910 = null;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[B")
    public static byte[] field2909;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 4)
    public static final String method1337(long arg0, int arg1) {
        field2906++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else if (arg1 == 1) {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var5);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class153.field2305[(int) (var7 - (arg0 * 37L))];
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
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 57)
    public static void method1338(int arg0) {
        field2910 = null;
        field2909 = null;
        field2907 = null;
        if (arg0 != 0) {
            field2909 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method1339(boolean arg0) {
        field2905++;
        int var1 = class207.field3137.method24((byte) -122, 8);
        if (var1 < class56.field706) {
            for (int var2 = var1; var2 < class56.field706; var2++) {
                class88.field1311[class287.field4332++] = class20.field239[var2];
            }
        }
        if (var1 > class56.field706) {
            throw new RuntimeException("gppov1");
        }
        class56.field706 = 0;
        if (!arg0) {
            field2903 = 0.7304888254964742D;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class20.field239[var3];
            class195 var5 = class241.field3592[var4];
            int var6 = class207.field3137.method24((byte) -122, 1);
            if (var6 == 0) {
                class20.field239[class56.field706++] = var4;
                var5.field1498 = class304.field4641;
            } else {
                int var7 = class207.field3137.method24((byte) -122, 2);
                if (var7 == 0) {
                    class20.field239[class56.field706++] = var4;
                    var5.field1498 = class304.field4641;
                    class278.field4234[class230.field3476++] = var4;
                } else if (var7 == 1) {
                    class20.field239[class56.field706++] = var4;
                    var5.field1498 = class304.field4641;
                    int var8 = class207.field3137.method24((byte) -122, 3);
                    var5.method693(1, -4, var8);
                    int var9 = class207.field3137.method24((byte) -122, 1);
                    if (var9 == 1) {
                        class278.field4234[class230.field3476++] = var4;
                    }
                } else if (var7 == 2) {
                    class20.field239[class56.field706++] = var4;
                    var5.field1498 = class304.field4641;
                    if (class207.field3137.method24((byte) -122, 1) == 1) {
                        int var11 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(2, -4, var11);
                        int var12 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(2, -4, var12);
                    } else {
                        int var10 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(0, -4, var10);
                    }
                    int var13 = class207.field3137.method24((byte) -122, 1);
                    if (var13 == 1) {
                        class278.field4234[class230.field3476++] = var4;
                    }
                } else if (var7 == 3) {
                    class88.field1311[class287.field4332++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lod;", line = 206)
    public static final class212 method1340(Throwable arg0, String arg1) {
        field2901++;
        class212 var2;
        if (arg0 instanceof class212) {
            var2 = (class212) arg0;
            var2.field3219 = var2.field3219 + ' ' + arg1;
        } else {
            var2 = new class212(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 243)
    public static final void method1341(int arg0) {
        field2900++;
        class154.field2317.method2176((byte) -44);
        if (arg0 == 0) {
            class311.field4732.method2176((byte) -122);
            class184.field2757.method2176((byte) -90);
            class94.field1412.method2176((byte) -72);
        }
    }
}
