import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class688 extends class634 {

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "B")
    public byte field9482 = 5;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field9478 = 0;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[I")
    public static int[] field9472 = new int[8];

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[I")
    public static int[] field9479 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Ldr;")
    public static class675 field9470 = new class675(16, -2);

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "Ldr;")
    public static class675 field9484 = new class675(114, -1);

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "Lcga;")
    public static class449 field9485 = new class449(70, -1);

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "Lcga;")
    public static class449 field9486 = new class449(62, 15);

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field9469;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field9471;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public int field9475;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public int field9476;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public int field9480;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public int field9483;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Lcs;")
    public static class318 field9477;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "Z")
    public boolean field9481;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZIIILjava/lang/String;JLjava/lang/String;III)V")
    public static final void method3802(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, long arg6, String arg7, int arg8, int arg9, int arg10) {
        field9468++;
        if (!class367.field4752 && class638.field8648 < 500) {
            int var12 = ~arg9 == arg4 ? class530.field6684 : arg9;
            class501 var13 = new class501(arg5, arg7, var12, arg3, arg2, arg6, arg10, arg8, arg1, arg0);
            class345.field4438.method1904(var13, -72);
            class638.field8648++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)V")
    public static void method3803(byte arg0) {
        field9484 = null;
        field9486 = null;
        int var1 = -121 % ((arg0 + 64) / 51);
        field9477 = null;
        field9479 = null;
        field9470 = null;
        field9472 = null;
        field9485 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lpfa;B)V")
    public static final void method3804(class275 arg0, byte arg1) {
        class354.field4576 = arg0.method1651("p11_full", (byte) 77);
        field9474++;
        client.field3562 = arg0.method1651("p12_full", (byte) 77);
        if (arg1 == -123) {
            class303.field3837 = arg0.method1651("b12_full", (byte) 77);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V")
    public static final void method3805(boolean arg0, int arg1) {
        class103.field1316 = -1;
        class227.field2939 = arg1;
        field9473++;
        class80.field1043 = -1;
        if (!arg0) {
            class460.method2531((byte) 44);
        }
    }
}
