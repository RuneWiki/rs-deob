import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class225 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
    public static boolean field3571 = true;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3572 = "glow2:";

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "S")
    public static short field3579 = 205;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[I")
    public static int[] field3580 = new int[5];

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[[B")
    public static byte[][] field3574;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[[[B")
    public static byte[][][] field3573;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;")
    public static final String method1567(String[] arg0, int arg1, byte arg2, int arg3) {
        field3575++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg2 != 11) {
                field3578 = 94;
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1568(String arg0, int arg1) throws ClassNotFoundException {
        field3577++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
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
            if (arg1 != 5) {
                method1569(88);
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1569(int arg0) {
        field3573 = null;
        field3580 = null;
        if (arg0 == 25924) {
            field3574 = null;
            field3572 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        class111.field1696.method145(-85);
        field3576++;
        if (arg0 == 19472) {
            class6.field54.method145(-95);
        }
    }
}
