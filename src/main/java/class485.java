import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class485 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lpia;")
    public static class94 field6893 = new class94(52, 0);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6894 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[Lhu;")
    public static class131[] field6896;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 6)
    public static void method2929(int arg0) {
        if (arg0 != 0) {
            field6894 = 33;
        }
        field6893 = null;
        field6896 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLwp;)V", line = 20)
    public static final void method2930(byte arg0, class179 arg1) {
        field6892++;
        arg1.method1108(-123);
        int var2 = class701.field9893;
        class183 var3 = class90.field937 = class75.field792[var2] = new class183();
        var3.field7107 = var2;
        int var4 = arg1.method1102(255, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFEE8B) >> 14;
        var3.field7187[0] = var6 - class464.field6624;
        int var7 = var4 & 0x3FFF;
        var3.field4635 = (var3.field7187[0] << 9) + (var3.method1128(-1) << 8);
        var3.field7193[0] = var7 - class181.field2144;
        var3.field4629 = (var3.field7193[0] << 9) + (var3.method1128(-1) << 8);
        class122.field1278 = var3.field4628 = var3.field4633 = var5;
        if (class728.method4056(var3.field7193[0], var3.field7187[0], (byte) -113)) {
            var3.field4633++;
        }
        if (class633.field9108[var2] != null) {
            var3.method1134(class633.field9108[var2], (byte) 23);
        }
        class585.field8256 = 0;
        class399.field5459[class585.field8256++] = var2;
        class480.field6871[var2] = 0;
        class606.field8617 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1102(255, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class98 var13 = class603.field8577[var8] = new class98();
                var13.field1023 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1025 = 0;
                var13.field1027 = -1;
                var13.field1026 = false;
                class35.field376[class606.field8617++] = var8;
                class480.field6871[var8] = 0;
            }
        }
        if (arg0 != -35) {
            field6894 = 49;
        }
        arg1.method1106(-123);
    }
}
