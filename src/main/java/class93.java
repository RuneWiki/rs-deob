import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class93 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1413 = "Loaded sprites";

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1415 = "green:";

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1412 = 64;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lec;")
    public static class25 field1411 = new class25(64);

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    public static int[] field1417 = new int[2];

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Log;")
    public static class241 field1416;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/String;Lma;)I")
    public static final int method604(int arg0, String arg1, class202 arg2) {
        field1414++;
        if (arg0 != 29087) {
            method604(72, (String) null, (class202) null);
        }
        int var3 = arg2.field3272;
        byte[] var4 = class177.method1188(arg0 - 14784, arg1);
        arg2.method1447((byte) 38, var4.length);
        arg2.field3272 += class36.field470.method717(var4.length, var4, 0, -1, arg2.field3234, arg2.field3272);
        return arg2.field3272 - var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static int method605(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1411 = null;
        field1416 = null;
        field1417 = null;
        if (arg0 == 21671) {
            field1413 = null;
            field1415 = null;
        }
    }
}
