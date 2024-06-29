import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class182 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
    private int[] field2485;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lcc;")
    public static class327 field2482 = new class327(64);

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2486 = -1;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[I")
    public static int[] field2484;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1330(byte arg0) {
        if (arg0 <= 100) {
            field2482 = (class327) null;
        }
        class145.field2020 = null;
        field2483++;
        class341.method2372(class233.field3340, 0, 0, (byte) -100, 0, class192.field2660, 0, class163.field2314, -1);
        if (class145.field2020 != null) {
            class23.method155(class300.field4411, -1412584499, (byte) -116, class100.field1311.field5198, class145.field2020, class192.field2660, class163.field2314, 0, class75.field996, 0);
            class145.field2020 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I", line = 29)
    public final int method1331(int arg0, int arg1) {
        field2490++;
        int var3 = (this.field2485.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 > -70) {
            method1334(5);
        }
        while (true) {
            int var5 = this.field2485[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2485[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I", line = 59)
    public static final int method1332(int arg0) {
        if (arg0 == 23421) {
            field2488++;
            return 6;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 80)
    public static final void method1333(byte arg0) {
        class117.field1529.method2282((byte) -104);
        field2489++;
        class315.field4641.method744(-15997);
        if (arg0 != -44) {
            method1334(125);
        }
        class276.field3959.method744(-15997);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 96)
    public static void method1334(int arg0) {
        if (arg0 <= -122) {
            field2482 = null;
            field2484 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([I)V", line = 110)
    public class182(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2485 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2485[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2485[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2485[var5 + var5] = arg0[var4];
            this.field2485[var5 - (-var5 - 1)] = var4++;
        }
    }
}
