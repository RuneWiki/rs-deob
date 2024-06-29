import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class233 extends class249 {

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lmb;")
    public static class96 field3989 = class243.method1708(" )2> <col=ff9040>", (byte) 126);

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "[Z")
    public static boolean[] field3990 = new boolean[112];

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "Lmb;")
    public static class96 field4000 = class243.method1708("http:)4)4", (byte) 94);

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field3999 = 127;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field3993;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[I")
    public int[] field3988;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
    public int[] field3994;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
    public int[] field4001;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[I")
    public static int[] field4003;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[Lic;")
    public class263[] field3996;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[Lic;")
    public class263[] field3997;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "[[[B")
    public byte[][][] field3987;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1581(byte arg0, byte[] arg1) {
        int var2 = 73 / ((arg0 - 37) / 60);
        field4002++;
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class102.method772(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field3990 = null;
        if (arg0 != -8) {
            field4003 = null;
        }
        field4000 = null;
        field4003 = null;
        field3989 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1583(String arg0, int arg1) throws ClassNotFoundException {
        field3995++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg1 != 0) {
            return null;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
