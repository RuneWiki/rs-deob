import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class71 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lub;")
    private static class227 field1247 = class257.method1749("flash2:", 17263);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
    public static int[] field1252 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1249 = -1;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lub;")
    public static class227 field1253 = field1247;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Z")
    public static boolean field1256 = true;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[Z")
    public static boolean[] field1248 = new boolean[200];

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lub;")
    public static class227 field1245 = field1247;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "[S")
    public static short[] field1255 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method429(int arg0, String arg1) throws ClassNotFoundException {
        field1244++;
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
        } else {
            int var2 = 87 % ((arg0 + 7) / 32);
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z")
    public static final boolean method430(int arg0, int arg1) {
        if (arg1 != 22891) {
            method430(90, 42);
        }
        field1243++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static final void method431(boolean arg0) {
        if (arg0) {
            field1250++;
            class25.field414.method1723(-4173);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1252 = null;
        field1247 = null;
        field1248 = null;
        field1245 = null;
        field1255 = null;
        if (arg0 != -23646) {
            field1249 = 55;
        }
        field1253 = null;
    }
}
