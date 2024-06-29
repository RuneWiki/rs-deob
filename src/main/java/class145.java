import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class145 extends class254 {

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Z")
    public static boolean field2074 = true;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field2079 = 1;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lij;")
    public static class69 field2077;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eh", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2088;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "[I")
    public int[] field2084;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "[I")
    public int[] field2085;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
    public int[] field2086;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "[Lbh;")
    public class239[] field2075;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "[Lbh;")
    public class239[] field2087;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[[[B")
    public byte[][][] field2073;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method970(byte arg0) {
        if (arg0 >= -103) {
            method970((byte) 36);
        }
        field2077 = null;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public static final void method971(int arg0) {
        try {
            Method var1 = (field2088 == null ? (field2088 = method975("java.lang.Runtime")) : field2088).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class154.field2251 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 20879) {
            method972((byte) -40, -112);
        }
        field2076++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
    public static final void method972(byte arg0, int arg1) {
        field2081++;
        class254.field3858.method258(arg1, (byte) 67);
        class283.field4513.method258(arg1, (byte) 78);
        int var2 = -77 / ((arg0 + 36) / 63);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(BI)Ltf;")
    public static final class224 method973(byte arg0, int arg1) {
        class224 var2 = (class224) class203.field2943.method263((byte) 113, (long) arg1);
        field2078++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field219.method1538(33, arg1, (byte) 102);
        class224 var4 = new class224();
        if (var3 != null) {
            var4.method1461(arg1, false, new class114(var3));
        }
        int var5 = -106 / ((arg0 - 49) / 58);
        class203.field2943.method255((long) arg1, var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method974(int arg0, String arg1) {
        field2082++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == 1) {
            for (int var2 = 0; var2 < class55.field836; var2++) {
                if (arg1.equalsIgnoreCase(class70.field1089[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 96;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method975(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
