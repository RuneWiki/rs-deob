import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class124 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lo;")
    public static class227 field2072 = new class227();

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    public static int[] field2082 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Z")
    public static boolean field2083 = false;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lph;")
    public static class229 field2080 = class266.method1858(":chalreq:", 0);

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Lbh;")
    public static class265 field2085 = null;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lsi;")
    public static class66 field2079;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Z")
    public static boolean field2084;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Ljm;", line = 11)
    public static final class134 method917(byte arg0) {
        field2078++;
        if (arg0 >= -18) {
            method918(67);
        }
        return class52.field747 >= class240.field3967.length ? null : class240.field3967[class52.field747++];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 40)
    public static void method918(int arg0) {
        field2082 = null;
        field2079 = null;
        field2072 = null;
        field2080 = null;
        if (arg0 >= -71) {
            field2085 = (class265) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 66)
    public static final void method919(byte arg0) {
        if (arg0 != 81) {
            method917((byte) 53);
        }
        for (class123 var1 = (class123) class186.field3023.method1580((byte) -39); var1 != null; var1 = (class123) class186.field3023.method1579((byte) 28)) {
            class256 var2 = var1.field2069;
            if (class298.field4849 != var2.field4284 || var2.field4285) {
                var1.method598(30);
            } else if (var2.field4291 <= class319.field5393) {
                var2.method1781(4, class69.field1106);
                if (var2.field4285) {
                    var1.method598(56);
                } else {
                    class237.method1670(var2.field4284, var2.field4293, var2.field4271, var2.field4286, 60, var2, 0, -1L, false);
                }
            }
        }
        field2075++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Ldm;", line = 109)
    public static final class191 method920(int arg0, int arg1) {
        class191 var2 = (class191) class235.field3882.method1413((long) arg1, true);
        field2073++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class121.field2040.method523(-74, class294.method1997((byte) 69, arg1), class168.method1236((byte) -119, arg1));
        if (arg0 != -84) {
            return (class191) null;
        }
        class191 var4 = new class191();
        var4.field3135 = arg1;
        if (var3 != null) {
            var4.method1345(arg0 + 212, new class164(var3));
        }
        var4.method1336(false);
        if (var4.field3141 != -1) {
            var4.method1341(method920(-84, var4.field3148), (byte) -63, method920(-84, var4.field3141));
        }
        if (var4.field3164 != -1) {
            var4.method1335((byte) -105, method920(arg0, var4.field3127), method920(arg0, var4.field3164));
        }
        if (!class217.field3561 && var4.field3123) {
            var4.field3110 = null;
            var4.field3142 = false;
            var4.field3149 = null;
            var4.field3169 = 0;
            var4.field3154 = class25.field334;
        }
        class235.field3882.method1419((long) arg1, 5216, var4);
        return var4;
    }
}
