import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class72 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field1035 = false;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[Z")
    public static boolean[] field1040 = new boolean[5];

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Z")
    public static boolean field1036 = false;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field1037 = new int[2];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field1041;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lnh;Lnh;B)I")
    public static final int method476(class305 arg0, class305 arg1, byte arg2) {
        field1038++;
        int var3 = 0;
        if (arg1.method2056(true, class230.field3603)) {
            var3++;
        }
        if (arg1.method2056(true, class224.field3493)) {
            var3++;
        }
        if (arg1.method2056(true, class25.field391)) {
            var3++;
        }
        if (arg0.method2056(true, class230.field3603)) {
            var3++;
        }
        if (arg0.method2056(true, class224.field3493)) {
            var3++;
        }
        if (arg2 == 110) {
            if (arg0.method2056(true, class25.field391)) {
                var3++;
            }
            return var3;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method477(int arg0, int arg1) {
        field1034++;
        if (~arg0 == arg1 || !class311.method2104(arg1 + 96, arg0)) {
            return;
        }
        class178[] var2 = class262.field4214[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class178 var4 = var2[var3];
            if (var4.field2527 != null) {
                class272 var5 = new class272();
                var5.field4340 = var4.field2527;
                var5.field4337 = var4;
                class229.method1513(2000000, (byte) -122, var5);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method478(boolean arg0) {
        field1041 = null;
        field1040 = null;
        field1037 = null;
        if (!arg0) {
            method476((class305) null, (class305) null, (byte) 48);
        }
    }
}
