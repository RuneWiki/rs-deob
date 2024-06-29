import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class381 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lmr;")
    public static class132 field5092 = new class132();

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[I")
    public static int[] field5093 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Ldb;")
    public static class298 field5094 = new class298(85, 0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIBI)V")
    public static final void method2224(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5089++;
        class402 var5 = class142.method1037(17916);
        var5.field5354.method1980(-345277664, class597.field7925.field9432);
        var5.field5354.method1980(-345277664, arg4);
        var5.field5354.method1980(-345277664, arg0);
        var5.field5354.method2031((byte) 54, arg1);
        var5.field5354.method2031((byte) 54, arg2);
        if (arg3 != 109) {
            method2224(-48, 29, -34, (byte) -40, -43);
        }
        class36.method278(0, var5);
        class623.field8247 = -3;
        class568.field7546 = 0;
        class639.field8597 = 1;
        class162.field2551 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method2225(int arg0) {
        field5092 = null;
        field5094 = null;
        int var1 = 21 % ((arg0 - 50) / 51);
        field5093 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static final void method2226(byte arg0) {
        if (class394.field5189 != null) {
            class394.field5189.method1463(216930648);
        }
        field5091++;
        if (class107.field1579 != null) {
            class107.field1579.method1463(216930648);
        }
        int var1 = 16 / ((arg0 - 43) / 62);
    }
}
