import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class164 extends class307 {

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public int[] field2717 = new int[] { -1 };

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "[I")
    public int[] field2725 = new int[] { 0 };

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lqd;")
    public static class40 field2718 = class147.method1106("lila:", (byte) -62);

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Lqd;")
    public static class40 field2721 = class147.method1106("leuchten3:", (byte) -88);

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field2720 = 0;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 33)
    public static void method1239(int arg0) {
        if (arg0 <= 73) {
            method1241(41, (byte) 57);
        }
        field2721 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 45)
    public static final void method1240(int arg0, boolean arg1) {
        if (arg0 == -1 && !class101.field1775) {
            class188.method1356((byte) 91);
        } else if (arg0 != -1 && (class217.field3611 != arg0 || !class134.method994((byte) -108)) && class90.field1636 != 0 && !class101.field1775) {
            class211.method1485(arg0, 2, class199.field3189, 113, 0, class90.field1636, false);
        }
        class217.field3611 = arg0;
        field2724++;
        if (!arg1) {
            method1239(-128);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[F", line = 77)
    public static final float[] method1241(int arg0, byte arg1) {
        float var2 = class273.method1894() + class273.method1888();
        field2723++;
        int var3 = class273.method1889();
        class221.field3676[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFF7347) >> 16) / 255.0F;
        float var5 = (float) ((var3 & 0xFFDA) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        int var7 = -110 / ((arg1 + 25) / 34);
        float var8 = 0.58823526F;
        class221.field3676[1] = var5 * ((float) class276.method1923(arg0 >> 8, 255) / 255.0F) * var8 * var2;
        class221.field3676[2] = var2 * (float) class276.method1923(255, arg0) / 255.0F * var6 * var8;
        class221.field3676[0] = var2 * var8 * (float) class276.method1923(255, arg0 >> 16) / 255.0F * var4;
        return class221.field3676;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lve;III)V", line = 110)
    public static final void method1242(class258 arg0, int arg1, int arg2, int arg3) {
        field2716++;
        if (arg0.field1519 == arg1 && arg1 != -1) {
            class300 var4 = class20.method128(48, arg1);
            int var5 = var4.field5020;
            if (var5 == 1) {
                arg0.field1534 = 0;
                arg0.field1529 = arg3;
                arg0.field1525 = 0;
                arg0.field1546 = 0;
                class185.method1338(var4, arg0.field1531, -31987, class255.field4233 == arg0, arg0.field1497, arg0.field1534);
            }
            if (var5 == 2) {
                arg0.field1525 = 0;
            }
        } else if (arg1 == -1 || arg0.field1519 == -1 || class20.method128(110, arg1).field5029 >= class20.method128(104, arg0.field1519).field5029) {
            arg0.field1534 = 0;
            arg0.field1490 = arg0.field1516;
            arg0.field1546 = 0;
            arg0.field1525 = 0;
            arg0.field1529 = arg3;
            arg0.field1519 = arg1;
            if (arg0.field1519 != -1) {
                class185.method1338(class20.method128(65, arg0.field1519), arg0.field1531, -31987, class255.field4233 == arg0, arg0.field1497, arg0.field1534);
            }
        }
        if (arg2 != 1103216) {
            field2719 = 33;
        }
    }
}
