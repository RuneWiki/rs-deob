import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class426 {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public int field5987 = -1;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public int field5999 = -1;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public int field5994 = -1;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "[I")
    public static int[] field5997 = new int[4];

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Z")
    public static boolean field6001 = false;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public int field5992;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public int field5995;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public int field5998;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public static final void method2535(int arg0) {
        class476.field6766 = class157.field2343.field3723 + class157.field2343.field3724 + 2;
        class340.field5047 = class33.field439.field3724 + class33.field439.field3723 + 2;
        class543.field7607 = new String[500];
        field5996++;
        for (int var1 = arg0; var1 < class543.field7607.length; var1++) {
            class543.field7607[var1] = "";
        }
        class561.method3260(class674.field9551.method3825((byte) -10, class526.field7494), arg0 + 44);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
    public static final void method2536(int arg0, int arg1) {
        field6002++;
        if (arg0 != -1) {
            method2540(13);
        }
        if (class251.field3554 == null || arg1 > class251.field3554.length) {
            class251.field3554 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method2537(int arg0, String arg1) throws ClassNotFoundException {
        field6003++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg0 != -21514) {
            return null;
        } else if (arg1.equals("Z")) {
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

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public static void method2538(byte arg0) {
        if (arg0 != 65) {
            method2536(-7, -105);
        }
        field5997 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)Z")
    public static final boolean method2539(int arg0, int arg1, int arg2) {
        field6000++;
        int var3 = -54 / ((arg2 - 18) / 58);
        return (arg1 & 0x60000) != 0 | class605.method3488(arg0, arg1, true) || class17.method146(120, arg0, arg1);
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lli;)V")
    public class426(class449 arg0) {
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
    public static final void method2540(int arg0) {
        for (class4 var1 = (class4) class174.field2456.method2480(381); var1 != null; var1 = (class4) class174.field2456.method2476((byte) 18)) {
            if (var1.field49 > 1) {
                var1.field49 = 0;
                class648.field9117.method2362(var1, 0, ((class312) var1.field46.field5842.field3126).field4635);
                var1.field46.method2477(true);
            }
        }
        field5990++;
        class543.field7608 = 0;
        class27.field394 = 0;
        class551.field7826.method2503(10);
        class634.field8942.method387(-21125);
        class174.field2456.method2477(true);
        class422.field5962 = false;
        if (arg0 >= -117) {
            field6001 = true;
        }
    }
}
