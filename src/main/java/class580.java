import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class580 extends class501 {

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lcv;")
    public class488 field8539;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field8538 = 0;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Llp;")
    public static class331 field8537;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lha;")
    public static class53 field8536;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 7)
    public static void method3466(byte arg0) {
        field8537 = null;
        if (arg0 == -15) {
            field8536 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Ljava/lang/String;", line = 20)
    public static final String method3467(int arg0, int arg1) {
        field8534++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class228.field3337.method3408(72, class63.field795) + " (" + var2 + ")</col>";
        } else {
            if (arg1 <= 4) {
                field8536 = null;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class86.field1233.method3408(126, class63.field795) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lcv;)V", line = 52)
    public class580(class488 arg0) {
        this.field8539 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 60)
    public static final void method3468(byte arg0) {
        class599.field8841 = 0;
        field8535++;
        boolean var1 = class632.field9278.method1032((byte) -33) == 1;
        int var2 = class632.field9278.method1045(true);
        int var3 = class632.field9278.method1042((byte) 119);
        int var4 = class632.field9278.method1061(-124);
        class479.method2886(true);
        class18.method118(-28206, var4);
        int var5 = (class333.field4615 - class632.field9278.field2177) / 16;
        class555.field8270 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class555.field8270[var6][var10] = class632.field9278.method1026(-917302120);
            }
        }
        class490.field6977 = new byte[var5][];
        class25.field247 = null;
        class406.field5551 = new byte[var5][];
        class2.field12 = new byte[var5][];
        class92.field1374 = new int[var5];
        class8.field81 = new int[var5];
        class451.field6353 = new int[var5];
        class365.field5036 = new int[var5];
        class618.field9132 = null;
        class58.field741 = new byte[var5][];
        class340.field4706 = new int[var5];
        if (arg0 != 38) {
            method3466((byte) -8);
        }
        int var7 = 0;
        for (int var8 = (var3 - (class146.field2125 >> 4)) / 8; var8 <= (((class146.field2125 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var2 - (class410.field5609 >> 4)) / 8; var9 <= ((class410.field5609 >> 4) + var2) / 8; var9++) {
                class340.field4706[var7] = (var8 << 8) + var9;
                class451.field6353[var7] = class282.field3952.method1967(-1, "m" + var8 + "_" + var9);
                class365.field5036[var7] = class282.field3952.method1967(-1, "l" + var8 + "_" + var9);
                class8.field81[var7] = class282.field3952.method1967(-1, "um" + var8 + "_" + var9);
                class92.field1374[var7] = class282.field3952.method1967(class354.method2138(arg0, -39), "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class221.method1427(var2, 8, 10, var3, var1);
    }
}
