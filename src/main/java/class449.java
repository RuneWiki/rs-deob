import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class449 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "[I")
    public static int[] field6171 = new int[500];

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field6173;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lul;")
    public static class364 field6177;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lica;")
    public class391 field6174;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "[I")
    public int[] field6176;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lpaa;B)V")
    public static final void method2697(class712 arg0, byte arg1) {
        field6170++;
        if (arg1 < 12) {
            field6171 = null;
        }
        class712 var2 = class101.method686(-1, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class582.field8281;
            var4 = class58.field807;
        } else {
            var3 = var2.field10011;
            var4 = var2.field9966;
        }
        class242.method1540(var4, false, -123, arg0, var3);
        class665.method3816(var4, var3, arg0, (byte) 50);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method2698(byte arg0) {
        field6171 = null;
        field6177 = null;
        int var1 = -62 / ((21 - arg0) / 52);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
    public static final void method2699(byte arg0) {
        field6175++;
        class143.method936(class674.field9500.field5120.method3602(0), true);
        int var1 = (class24.field266 >> 12) + (class179.field2535 >> 3);
        class392.field5459 = class473.field6483.field9501 = 0;
        int var2 = (class510.field7109 >> 3) + (class235.field3250 >> 12);
        class473.field6483.method3788(8, 18305, 8);
        byte var3 = 18;
        class86.field1193 = new int[var3];
        class682.field9590 = new byte[var3][];
        class556.field7846 = new byte[var3][];
        class57.field801 = new int[var3][4];
        class9.field85 = new int[var3];
        class713.field10118 = new int[var3];
        class683.field9594 = new byte[var3][];
        class53.field749 = new int[var3];
        class592.field8537 = new int[var3];
        class175.field2387 = new byte[var3][];
        class594.field8557 = new byte[var3][];
        int var4 = 53 % ((arg0 + 18) / 34);
        class378.field5269 = new int[var3];
        int var5 = 0;
        for (int var6 = (var1 - (class514.field7179 >> 4)) / 8; var6 <= (((class514.field7179 >> 4) + var1) / 8); var6++) {
            for (int var9 = (var2 - (class456.field6281 >> 4)) / 8; var9 <= ((class456.field6281 >> 4) + var2) / 8; var9++) {
                int var10 = (var6 << 8) + var9;
                class592.field8537[var5] = var10;
                class53.field749[var5] = class281.field3729.method3311((byte) -24, "m" + var6 + "_" + var9);
                class86.field1193[var5] = class281.field3729.method3311((byte) -24, "l" + var6 + "_" + var9);
                class9.field85[var5] = class281.field3729.method3311((byte) -24, "n" + var6 + "_" + var9);
                class713.field10118[var5] = class281.field3729.method3311((byte) -24, "um" + var6 + "_" + var9);
                class378.field5269[var5] = class281.field3729.method3311((byte) -24, "ul" + var6 + "_" + var9);
                if (class9.field85[var5] == -1) {
                    class53.field749[var5] = -1;
                    class86.field1193[var5] = -1;
                    class713.field10118[var5] = -1;
                    class378.field5269[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class9.field85.length; var7++) {
            class9.field85[var7] = -1;
            class53.field749[var7] = -1;
            class86.field1193[var7] = -1;
            class713.field10118[var7] = -1;
            class378.field5269[var7] = -1;
        }
        byte var8;
        if (class213.field3004 == 3) {
            var8 = 4;
        } else {
            var8 = 8;
        }
        class92.method555(512, var8, var1, var2, false);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILwu;IZIIJ)V")
    public static final void method2700(int arg0, int arg1, class557 arg2, int arg3, boolean arg4, int arg5, int arg6, long arg7) {
        class670.field9424 = arg6;
        field6172++;
        class703.field9783 = arg0;
        class539.field7539 = null;
        class308.field3973 = 10000;
        class355.field4565 = arg2;
        class108.field1548 = arg5;
        class736.field10292 = 1;
        class470.field6423 = arg3;
        if (arg1 != -1183060724) {
            method2698((byte) -72);
        }
        class419.field5818 = arg7;
        class298.field3896 = arg4;
    }
}
