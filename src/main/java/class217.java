import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class217 extends class69 {

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljava/lang/String;")
    public String field3477;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "S")
    public static short field3476 = 32767;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3474 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "[Z")
    public static boolean[] field3482 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lgb;")
    public static class152 field3478;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        class113.field1955 = null;
        field3473++;
        class237.method1558(0, class113.field1944, (byte) 92, class107.field1856, 0, -1, class97.field1469, 0, 0);
        if (class113.field1955 != null) {
            class97.method695(-1412584499, class107.field1856, class264.field4212.field1564, class151.field2453, class97.field1469, arg0 ^ 0x4AD2, 0, class113.field1955, 0, class82.field1137);
            class113.field1955 = null;
        }
        if (arg0 != 19160) {
            field3478 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class217() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class217(String arg0, int arg1) {
        this.field3477 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method1442(byte arg0) {
        field3482 = null;
        if (arg0 <= 78) {
            method1444(8, 6, 94, -68);
        }
        field3478 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public static final void method1443(int arg0, int arg1, int arg2) {
        field3475++;
        class283 var3 = class46.method360(arg0, -68, arg1);
        var3.method1893(0);
        var3.field4528 = arg2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public static final void method1444(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 26) {
            method1442((byte) -57);
        }
        String var4 = "::tele " + arg3 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        field3481++;
        System.out.println(var4);
        class29.method203(var4, (byte) 63);
    }
}
