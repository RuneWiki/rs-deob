import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class283 extends class276 {

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public int field4630 = 0;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public int field4629 = -1;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "[I")
    public static int[] field4624 = new int[8];

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        if (arg0 >= -90) {
            method1848((byte) 57);
        }
        field4624 = null;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public static final void method1848(byte arg0) {
        class194.field3037 = 0;
        field4620++;
        int var1 = class506.field7365.method132(107);
        int var2 = class506.field7365.method126((byte) -78);
        int var3 = class506.field7365.method132(39);
        boolean var4 = class506.field7365.method173(-1278512920) == 1;
        class79.method579((byte) -98);
        class344.method2214(var2, 36);
        int var5 = (class195.field3050 - class506.field7365.field301) / 16;
        class52.field845 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class52.field845[var6][var10] = class506.field7365.method143(-3230);
            }
        }
        class162.field2567 = new byte[var5][];
        class496.field7243 = null;
        class503.field7345 = new byte[var5][];
        class160.field2565 = new int[var5];
        class435.field6508 = new int[var5];
        class505.field7360 = null;
        class397.field6073 = new int[var5];
        class23.field328 = new int[var5];
        class101.field1671 = new int[var5];
        class197.field3092 = new byte[var5][];
        class53.field855 = new byte[var5][];
        int var7 = 0;
        if (arg0 >= -18) {
            field4624 = null;
        }
        for (int var8 = (var3 - (class217.field3775 >> 4)) / 8; var8 <= ((class217.field3775 >> 4) + var3) / 8; var8++) {
            for (int var9 = (var1 - (class277.field4548 >> 4)) / 8; var9 <= ((class277.field4548 >> 4) + var1) / 8; var9++) {
                class23.field328[var7] = (var8 << 8) + var9;
                class101.field1671[var7] = class388.field5971.method2927("m" + var8 + "_" + var9, -35);
                class160.field2565[var7] = class388.field5971.method2927("l" + var8 + "_" + var9, -123);
                class397.field6073[var7] = class388.field5971.method2927("um" + var8 + "_" + var9, -126);
                class435.field6508[var7] = class388.field5971.method2927("ul" + var8 + "_" + var9, -21);
                var7++;
            }
        }
        class239.method1642(10, var4, -11, var1, var3);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
    public static final void method1849(boolean arg0, byte arg1) {
        field4619++;
        if (arg1 <= 1) {
            field4624 = null;
        }
        if (class250.field4263.length() == 0) {
            return;
        }
        class333.method2097(110, "--> " + class250.field4263);
        class320.method2029(class250.field4263, false, (byte) 126, arg0);
        class158.field2549 = 0;
        class160.field2564 = 0;
        class250.field4263 = "";
    }
}
