import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class213 {

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "[B")
    public static byte[] field3059 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Lbg;")
    public static class324 field3062 = new class324(4, -1);

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "Lbf;")
    public static class372 field3065;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "[[B")
    public static byte[][] field3061;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)Ljg;")
    public static final class224 method1460(boolean arg0, int arg1) {
        field3064++;
        if (!arg0) {
            method1460(false, 67);
        }
        class224 var2 = (class224) class195.field2846.method1115((long) arg1, (byte) 58);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field1919.method2363(arg1, 0, 105);
        class224 var4 = new class224();
        if (var3 != null) {
            var4.method1526(8554, arg1, new class65(var3));
        }
        class195.field2846.method1107(1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method1461(byte arg0) {
        field3065 = null;
        field3059 = null;
        if (arg0 == 98) {
            field3062 = null;
            field3061 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(JI)V")
    public static final void method1462(long arg0, int arg1) {
        if (arg1 != -5184) {
            method1460(false, 105);
        }
        field3058++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class370.method2284(63, arg0 - 1L);
            class370.method2284(29, 1L);
        } else {
            class370.method2284(arg1 + 5236, arg0);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method1463(int[] arg0, int arg1) {
        field3060++;
        if (arg1 <= 123) {
            field3062 = null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class489.field7188;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class358 var5 = class11.field128.method1567((byte) -118, arg0[var4]);
            if (var5.field4989 != -1) {
                class16 var6 = (class16) class400.field5935.method1115((long) var5.field4989, (byte) 58);
                if (var6 == null) {
                    class218 var7 = class218.method1488(class240.field3533, var5.field4989, 0);
                    if (var7 != null) {
                        var6 = class225.field3300.method389(var7, true);
                        class400.field5935.method1107(1, (long) var5.field4989, var6);
                    }
                }
                if (var6 != null) {
                    class436.field6393[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    static {
        new class331(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field3065 = new class372(13, 3);
    }
}
