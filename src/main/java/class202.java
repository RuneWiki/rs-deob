import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class202 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    private int[] field3423;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Lbd;")
    public static class162 field3428 = class17.method142(0, ")4");

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 15)
    public static void method1505(int arg0) {
        if (arg0 != 0) {
            method1505(-4);
        }
        field3428 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([I)V", line = 25)
    public class202(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3423 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3423[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3423[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3423[var5 + var5] = arg0[var4];
            this.field3423[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 66)
    public static final void method1506(byte arg0) {
        class49.method357(16753037);
        if (arg0 < 75) {
            method1506((byte) -50);
        }
        class90.method683(9);
        class235.method1670((byte) -18);
        field3429++;
        class55.method392((byte) -17);
        class224.method1623((byte) -97);
        class242.method1718(-2132607698);
        class194.method1433(50);
        class1.method1((byte) 121);
        class286.method1975(-116);
        class209.method1531(1);
        class141.method1098((byte) -81);
        class67.method475((byte) -74);
        class66.method473(13690);
        class165.method1298((byte) -20);
        if (!class117.field2159) {
            ((class17) class312.field5271).method150(-2);
        }
        class144.field2608.method1384(-10506);
        class213.field3577.method1147(76);
        class143.field2574.method1147(111);
        class151.field2693.method1147(53);
        class157.field2764.method1147(80);
        class91.field1614.method1147(92);
        class178.field3047.method1147(114);
        class158.field2782.method1147(118);
        class35.field577.method1147(84);
        class105.field1920.method1147(89);
        class67.field1081.method1147(36);
        class97.field1768.method1147(119);
        class136.field2427.method1529(false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)I", line = 117)
    public final int method1507(byte arg0, int arg1) {
        int var3 = (this.field3423.length >> 1) - 1;
        if (arg0 > -93) {
            method1505(-113);
        }
        int var4 = arg1 & var3;
        field3427++;
        while (true) {
            int var5 = this.field3423[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3423[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
