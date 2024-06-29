import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 implements class336 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[[I")
    public static int[][] field505 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lwm;")
    public static class524 field507;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lufa;")
    public static class632 field508;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[[Z")
    public static boolean[][] field503;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method466(int arg0) {
        if (arg0 != 5) {
            method466(-126);
        }
        field507 = null;
        field508 = null;
        field505 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lui;IJ[I)Ljava/lang/String;")
    public final String method467(class210 arg0, int arg1, long arg2, int[] arg3) {
        field506++;
        if (arg1 != -31656) {
            method468(true, null);
        }
        if (class399.field6174 == arg0) {
            class57 var6 = class7.field113.method3047(arg3[0], (byte) 94);
            return var6.method660(-123, (int) arg2);
        } else if (class615.field8736 == arg0 || class522.field7571 == arg0) {
            class117 var7 = class91.field1083.method2859((int) arg2, (byte) 124);
            return var7.field1869;
        } else if (class314.field4926 == arg0 || class200.field3251 == arg0 || class366.field5744 == arg0) {
            return class7.field113.method3047(arg3[0], (byte) 111).method660(-125, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLie;)Ljava/lang/String;")
    public static final String method468(boolean arg0, class6 arg1) {
        field504++;
        if (arg0) {
            field503 = null;
        }
        return class126.method1105((byte) 55, arg1, 32767);
    }
}
