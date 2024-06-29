import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class85 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    public static int[] field1533 = new int[14];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
    public static boolean field1532 = false;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field1538 = -1;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field1536 = -1;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field1534;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static final void method555(byte arg0) {
        class133.field2307 = null;
        if (arg0 <= 1) {
            field1530 = 72;
        }
        class77.field1253 = null;
        field1529++;
        class177.field2922 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method556(int arg0) {
        class168.field2778.method199(53, 8);
        class168.field2778.method682(method557(false), 22555);
        class81.field1403++;
        field1537++;
        if (arg0 != 0) {
            field1533 = null;
        }
        class168.field2778.method639(class267.field4324, arg0 ^ 0x3BA3);
        class168.field2778.method639(class4.field38, 15267);
        class168.field2778.method682(class172.field2820, 22555);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
    public static final int method557(boolean arg0) {
        field1531++;
        return arg0 ? -73 : 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIB)V")
    public static final void method558(int arg0, int arg1, int arg2, byte arg3) {
        field1535++;
        if (arg1 == 0) {
            class172.field2831++;
            class168.field2778.method199(86, 124);
            class168.field2778.method682(5, 22555);
        }
        if (arg1 == 1) {
            class24.field373++;
            class168.field2778.method199(225, -88);
            class168.field2778.method682(19, 22555);
        }
        class168.field2778.method639(class126.field2206 + arg2, 15267);
        class168.field2778.method639(class255.field4162 + arg0, 15267);
        class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
        class79.field1364 = arg2;
        class53.field927 = arg0;
        if (arg3 > -39) {
            method557(true);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method559(int arg0, String arg1) {
        if (arg0 != -1) {
            return 114;
        }
        field1528++;
        for (int var2 = 0; var2 < class52.field915.length; var2++) {
            if (class52.field915[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static void method560(int arg0) {
        field1534 = null;
        int var1 = -49 / ((arg0 - 18) / 45);
        field1533 = null;
    }
}
