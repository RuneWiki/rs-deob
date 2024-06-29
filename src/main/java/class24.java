import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class24 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lqd;")
    public static class37 field316 = new class37(20);

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
    public static boolean field320 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lik;")
    public static class225 field321;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    public static boolean field323;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[S")
    public static short[] field322;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)J")
    public static final long method176(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 == null || var3.field1930 == null ? 0L : var3.field1930.field1578;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method177(int arg0, String arg1) throws ClassNotFoundException {
        field318++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 != 4472) {
                method179(74);
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
    public static final int method178(int arg0) {
        field317++;
        if (arg0 != -16648) {
            field320 = false;
        }
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Lvd;")
    public static final class117 method179(int arg0) {
        field314++;
        class117 var1 = new class117(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], class263.field3965[0], class128.field1883);
        if (arg0 < 70) {
            return null;
        } else {
            class290.method1935(0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)I")
    public static final int method180(int arg0, int arg1, boolean arg2) {
        field315++;
        if (arg2) {
            return 31;
        } else {
            int var3 = arg0 >> 31 & arg1 - 1;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static void method181(int arg0) {
        field321 = null;
        if (arg0 == -1) {
            field322 = null;
            field316 = null;
        }
    }
}
