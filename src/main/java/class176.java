import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class176 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "[I")
    public static int[] field3102 = new int[50];

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Lmh;")
    public static class128 field3104 = class22.method156(124, " (X");

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
    public static int[] field3101;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 33)
    public static void method1210(int arg0) {
        field3104 = null;
        field3101 = null;
        if (arg0 <= -5) {
            field3102 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lah;", line = 53)
    public static final class196 method1211(int arg0, int arg1) {
        field3105++;
        if (arg0 != 50) {
            return (class196) null;
        }
        class196 var2 = (class196) class106.field1808.method1443((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class47.field950.method2155(client.method1651(arg1, -29987), class260.method1828(arg1, (byte) -85), (byte) 70);
        class196 var4 = new class196();
        if (var3 != null) {
            var4.method1374(new class194(var3), (byte) 13);
        }
        class106.field1808.method1442(arg0 ^ 0xFFFFFFCD, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLkk;)Lkk;")
    public abstract class223 method336(byte arg0, class223 arg1);
}
