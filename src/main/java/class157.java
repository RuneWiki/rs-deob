import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class157 {

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1963 = new String[] { method1322(method1321("@r\u00131B")), method1322(method1321("@r\u0013\u0004\u0005clO\u0019\u0004W0")), method1322(method1321("@r\u0013L\u0003^qINB")) };

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lpj;")
    public static class157 field1949 = new class157(1);

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lpj;")
    public static class157 field1950 = new class157(2);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lpj;")
    public static class157 field1951 = new class157(4);

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lpj;")
    public static class157 field1952 = new class157(1);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Lpj;")
    public static class157 field1953 = new class157(2);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lpj;")
    public static class157 field1954 = new class157(4);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lpj;")
    public static class157 field1955 = new class157(2);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lpj;")
    public static class157 field1956 = new class157(4);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1958 = 1;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lwia;")
    public static class790 field1959 = new class790(28, 3);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
    public static volatile boolean field1962 = true;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "F")
    public static float field1957;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        try {
            field1948++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1963[1] + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 16)
    public static void method1320(int arg0) {
        try {
            field1959 = null;
            field1956 = null;
            field1949 = null;
            field1953 = null;
            field1950 = null;
            field1951 = null;
            field1955 = null;
            if (arg0 == 14394) {
                field1952 = null;
                field1954 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1963[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 33)
    private class157(int arg0) {
        try {
            this.field1946 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1963[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1321(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1322(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
