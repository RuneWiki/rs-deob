import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class314 extends class204 {

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
    public static boolean field4487 = false;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field4490 = -1;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field4492 = 0;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field4491 = -1;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method1983(int arg0, int arg1) {
        class36.field540 = -1;
        field4483++;
        class25.field441 = arg1;
        class410.field6034 = 3;
        class421.field6199 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)[Lao;")
    public static final class188[] method1984(int arg0) {
        if (arg0 == -1) {
            field4486++;
            return new class188[] { class151.field2308, class432.field6298, class402.field5900, class500.field7354, class44.field673, class343.field5229, class412.field6056, class301.field4288, class6.field84, class37.field572, class132.field2034, class167.field2504, class93.field1528, class114.field1816, class380.field5664, class522.field7663, class526.field7730, class108.field1676, class26.field448, class466.field6855, class523.field7696, class147.field2162, class435.field6323, class43.field656, class453.field6715, class33.field516, class48.field729, class119.field1875, class246.field3565, class437.field6345, class267.field3869, class139.field2095, class390.field5791, class226.field3303, class347.field5261, class160.field2423, class453.field6711, client.field2878, class479.field7025, class134.field2065, class465.field6839, class4.field74, class439.field6406, class106.field1664, class17.field270, class14.field239, class25.field442, class390.field5793, class455.field6732, class523.field7699, class64.field1131, class524.field7703, class74.field1241, class256.field3690, class408.field5988, class416.field6150, class163.field2464, class133.field2040, class89.field1494, class206.field2964, class378.field5631, class31.field498, class333.field5115, class253.field3643, class435.field6320, class275.field3985, class212.field3065, class270.field3917, class420.field6184, class325.field4978, class480.field7035, class322.field4927, class522.field7676, class301.field4289, class525.field7720, class469.field6907, class372.field5571, class439.field6397, class353.field5344, class47.field719, class143.field2117, class178.field2701, class482.field7068, class182.field2742, class170.field2546, class425.field6228, class320.field4571, class442.field6488, class414.field6084, class98.field1596, class380.field5669, class226.field3299, class412.field6070, class343.field5236, class381.field5672, class308.field4398, class372.field5576, class522.field7662, class504.field7403, class22.field387, class259.field3735, class416.field6152, class417.field6161, class246.field3570, class33.field518, class35.field533, class420.field6180, class17.field269, class438.field6381, class290.field4161 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public static final void method1985(int arg0) {
        field4493++;
        for (int var1 = arg0; var1 < class420.field6182; var1++) {
            class310 var2 = class375.field5603[var1];
            if (var2.field4437 == 2) {
                if (var2.field4431 == null) {
                    var2.field4440 = Integer.MIN_VALUE;
                } else {
                    class124.field1920.method232(var2.field4431);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIB)I")
    public static final int method1986(int arg0, boolean arg1, int arg2, byte arg3) {
        field4485++;
        class78 var4 = class192.method1311(arg0, arg1, -29496);
        int var5 = -74 % ((arg3 + 52) / 40);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var4.field1306.length) {
            return var4.field1306[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method1987(boolean arg0) {
        field4484++;
        if (class39.field587) {
            class39.field587 = arg0;
            class257.field3697 = null;
            class112.field1783 = null;
        }
    }
}
