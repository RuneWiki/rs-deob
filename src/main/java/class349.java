import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class349 {

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field4779 = 128;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field4781 = 128;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field4776;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4786 = 13156520;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4783 = new CRC32();

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Luf;")
    public static class310 field4788 = new class310(72, 12);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 3)
    public static void method1932(int arg0) {
        field4783 = null;
        if (arg0 == 12) {
            field4788 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLlh;)Lfj;", line = 15)
    public static final class466 method1933(byte arg0, class365 arg1) {
        if (arg0 < 107) {
            method1932(-86);
        }
        field4785++;
        class466 var2 = new class466();
        var2.field6801 = arg1.method2062((byte) 14);
        var2.field6798 = class517.field7602.method2((byte) -47, var2.field6801);
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V", line = 67)
    public class349(int arg0) {
        this.field4776 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V", line = 74)
    private class349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4779 = arg1;
        this.field4776 = arg0;
        this.field4781 = arg2;
        this.field4780 = arg3;
        this.field4777 = arg4;
        this.field4778 = arg5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lod;", line = 38)
    public final class349 method1934(boolean arg0) {
        field4784++;
        if (!arg0) {
            field4789 = -20;
        }
        return new class349(this.field4776, this.field4779, this.field4781, this.field4780, this.field4777, this.field4778);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)[Luf;", line = 57)
    public static final class310[] method1935(boolean arg0) {
        if (!arg0) {
            method1935(false);
        }
        field4782++;
        return new class310[] { class400.field5570, class273.field3716, class233.field3225, class116.field1573, class52.field705, class465.field6788, class388.field5452, class330.field4497, class249.field3454, class21.field244, class150.field2113, class384.field5395, class86.field1189, class97.field1338, class125.field1714, class341.field4710, class77.field1114, class250.field3475, class511.field7518, class133.field1933, class413.field6057, class438.field6390, class234.field3235, class58.field783, class272.field3702, class224.field3151, class247.field3444, class308.field4226, class507.field7446, class68.field973, class172.field2465, class172.field2458, class66.field906, class508.field7460, class415.field6082, class305.field4182, class25.field388, class138.field1978, class314.field4304, class212.field3018, class307.field4204, class158.field2261, class418.field6106, class121.field1669, class515.field7560, client.field2799, class234.field3247, class464.field6749, class241.field3342, class255.field3538, class442.field6433, class360.field4942, class253.field3523, class196.field2828, class209.field2965, class472.field6898, class412.field6047, class413.field6068, class288.field3879, class186.field2588, class96.field1330, class446.field6460, class127.field1734, class213.field3032, class140.field1991, class521.field7683, class461.field6704, class4.field50, class511.field7517, class423.field6182, class107.field1465, class36.field505, field4788, class275.field3734, class519.field7646, class247.field3440, class471.field6886, class86.field1182, class244.field3403, class53.field742, class245.field3409, class207.field2936, class269.field3685, class522.field7684, class341.field4711, class253.field3524, class521.field7674, class157.field2238, class410.field5826, class93.field1246, class108.field1474, class507.field7459, class92.field1232, class471.field6892, class400.field5573, class138.field1961, class119.field1628, class321.field4440, class151.field2130, class517.field7588, class366.field5136, class112.field1525, class67.field927, class103.field1411, class83.field1156, class215.field3057, class488.field7132, class306.field4200, class252.field3509, class79.field1132 };
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lod;I)V", line = 88)
    public final void method1936(class349 arg0, int arg1) {
        this.field4781 = arg0.field4781;
        this.field4776 = arg0.field4776;
        this.field4777 = arg0.field4777;
        this.field4779 = arg0.field4779;
        field4787++;
        this.field4780 = arg0.field4780;
        if (arg1 != 74) {
            this.field4776 = -5;
        }
        this.field4778 = arg0.field4778;
    }
}
