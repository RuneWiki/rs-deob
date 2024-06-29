import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class118 extends class60 {

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1906 = -1;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1914 = "Loading fonts - ";

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1908 = new CRC32();

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[I")
    public static int[] field1916 = new int[100];

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[Len;")
    public static class47[] field1909;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 12)
    public static final void method925(Component arg0, byte arg1) {
        arg0.removeKeyListener(class24.field411);
        field1913++;
        arg0.removeFocusListener(class24.field411);
        class175.field2805 = -1;
        int var2 = 83 / ((arg1 - 61) / 52);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 25)
    public static void method926(byte arg0) {
        field1916 = null;
        field1914 = null;
        if (arg0 < 98) {
            method926((byte) -89);
        }
        field1909 = null;
        field1908 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V", line = 38)
    public class118(int arg0, int arg1) {
        this.field1910 = arg1;
        this.field1912 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Laj;I)Lgk;", line = 50)
    public static final class8 method927(class1 arg0, int arg1) {
        if (arg1 != 3776) {
            field1908 = (CRC32) null;
        }
        field1915++;
        return new class8(arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method41((byte) -66), arg0.method4(true), arg0.method4(true), arg0.method15((byte) 61));
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 75)
    public static final String method928(String arg0, int arg1) {
        field1911++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        int var4 = arg1;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class296.method2097(var6, 402);
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
}
