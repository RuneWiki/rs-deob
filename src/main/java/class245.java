import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class245 {

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field3464 = 0;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lig;")
    public static class206 field3462 = new class206(58, 8);

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field3466 = -1;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 13)
    public static void method1627(int arg0) {
        int var1 = -15 / ((3 - arg0) / 40);
        field3462 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III[B)I", line = 23)
    public static final int method1628(int arg0, int arg1, int arg2, byte[] arg3) {
        field3463++;
        if (arg0 <= 65) {
            method1629(null, (byte) 10, null);
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class70.field751[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 49)
    public static final void method1629(String[] arg0, byte arg1, short[] arg2) {
        field3465++;
        class638.method3634(arg0, arg2, arg0.length - 1, 0, -122);
        if (arg1 != 109) {
            field3464 = -1;
        }
    }
}
