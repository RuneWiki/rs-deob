import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class193 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2693 = new String[8];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIBLjava/lang/String;)V")
    public static final void method1343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, String arg7) {
        int var8 = 5 / ((-arg6 - 75) / 47);
        field2696++;
        class38 var9 = new class38();
        var9.field427 = arg7;
        var9.field429 = arg3;
        var9.field428 = arg0;
        var9.field432 = arg1;
        var9.field425 = class693.field8900 + arg5;
        var9.field424 = arg2;
        var9.field421 = arg4;
        class21.field195.method855(0, var9);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field2693 = null;
        if (arg0 != 0) {
            method1346((byte) 2);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Z")
    public static final boolean method1345(int arg0) {
        field2695++;
        if (arg0 == -1) {
            return class693.field8903 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static final void method1346(byte arg0) {
        field2694++;
        if (arg0 <= -39) {
            class115.field1513 = true;
        }
    }
}
