import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class144 extends class117 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Ls;")
    public static class196 field2081 = new class196(512);

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lsl;")
    public static class40 field2088;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "Lnf;")
    public static class61 field2087;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[I")
    public int[] field2075;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[I")
    public int[] field2077;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    public int[] field2080;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[Laj;")
    public class210[] field2076;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[Laj;")
    public class210[] field2086;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[[[B")
    public byte[][][] field2083;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I", line = 7)
    public static final int method1033(int arg0, int arg1) {
        field2085++;
        class309 var2 = class185.method1286(false, arg1);
        if (arg0 != 1) {
            field2087 = (class61) null;
        }
        int var3 = var2.field4623;
        int var4 = var2.field4622;
        int var5 = var2.field4621;
        int var6 = class267.field4067[var4 - var5];
        return class227.field3423[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 33)
    public static final String method1034(int arg0, String arg1) {
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        if (arg0 != 512) {
            method1034(-101, (String) null);
        }
        byte var4 = 2;
        field2089++;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class89.method705((byte) 111, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 94)
    public static void method1035(byte arg0) {
        field2088 = null;
        field2087 = null;
        field2081 = null;
        if (arg0 != 70) {
            field2087 = (class61) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 109)
    public static final Class method1036(byte arg0, String arg1) throws ClassNotFoundException {
        field2078++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else if (arg0 < 43) {
            return (Class) null;
        } else {
            return Class.forName(arg1);
        }
    }
}
