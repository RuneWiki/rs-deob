import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class208 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[Lrn;")
    public static class294[] field3361 = new class294[14];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 9)
    public static final String method1407(String arg0, String arg1, String arg2, int arg3) {
        field3367++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = arg2.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg0.indexOf(arg1, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        int var11 = -115 % ((arg3 + 33) / 33);
        StringBuffer var12 = new StringBuffer(var7);
        int var13 = 0;
        while (true) {
            int var14 = arg0.indexOf(arg1, var13);
            if (var14 < 0) {
                var12.append(arg0.substring(var13));
                return var12.toString();
            }
            var12.append(arg0.substring(var13, var14));
            var12.append(arg2);
            var13 = var5 + var14;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)Lke;", line = 68)
    public static final class125 method1408(byte arg0, int arg1) {
        if (arg0 != 17) {
            field3365 = -1;
        }
        field3366++;
        class125 var2 = (class125) class128.field2200.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class292.field4475.method2036(class69.method536(true, arg1), class209.method1412(arg1, arg0 - 27386), (byte) 28);
        class125 var4 = new class125();
        if (var3 != null) {
            var4.method830(new class202(var3), false);
        }
        class128.field2200.method2369((long) arg1, -28759, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 94)
    public static void method1409(byte arg0) {
        field3361 = null;
        if (arg0 < 96) {
            method1407((String) null, (String) null, (String) null, 106);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 104)
    public static final void method1410(byte arg0) {
        class8.field165++;
        if (arg0 < 25) {
            return;
        }
        class14.field263.method80(206, (byte) 113);
        field3364++;
        for (class222 var1 = (class222) class185.field3013.method306(0); var1 != null; var1 = (class222) class185.field3013.method300(1)) {
            if (var1.field3511 == 0) {
                class203.method1363((byte) 122, true, var1);
            }
        }
        if (class317.field4795 != null) {
            class317.method2183((byte) -7, class317.field4795);
            class317.field4795 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V", line = 140)
    public static final void method1411(int arg0, int arg1, int arg2, int arg3) {
        field3363++;
        class2 var4 = class212.method1433(arg2, 11, -13802);
        var4.method13((byte) -1);
        var4.field39 = arg3;
        var4.field43 = arg0;
        if (arg1 > -76) {
            method1410((byte) 76);
        }
    }
}
