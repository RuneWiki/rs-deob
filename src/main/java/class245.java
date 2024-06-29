import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class245 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[[B")
    public static byte[][] field4022 = new byte[50][];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lbd;")
    public static class37 field4023 = new class37();

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4029 = "cyan:";

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Lgl;")
    public static class356[] field4021;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[[S")
    public static short[][] field4028;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method1706(int arg0) {
        field4024++;
        class97.method725((byte) 125);
        class231.method1638(2015625216);
        class110.method816(-35);
        class33.method218(arg0 - 1086237534);
        class43.method290(false);
        class139.method1017((byte) -105);
        class230.method1636(true);
        class143.method1043(-50);
        class238.method1683(arg0 + 40394);
        if (arg0 != -25568) {
            return;
        }
        class71.method444(4389);
        class369.method2371(85);
        class79.method499(-95);
        class353.method2298(-26235);
        class433.method2676((byte) -115);
        class19.method145(1024);
        class421.method2622(15185);
        class1.method4(arg0 + 25440);
        class217.method1553(-121);
        class275.method1856(arg0 ^ 0xFFFF9C3C);
        class301.method2025(255);
        class106.method801(true);
        class340.method2236((byte) -54);
        class104.method788((byte) 51);
        class427.field6300.method336(arg0 + 25676);
        class214.field3439.method336(arg0 ^ 0x638C);
        class272.field4367.method336(86);
        class209.field3362.method336(93);
        class17.field229.method336(-73);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIZ)I")
    public static final int method1707(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field4028 = null;
        }
        field4025++;
        int var5 = 65536 - class258.field4173[arg3 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method1708(int arg0) {
        field4029 = null;
        field4028 = null;
        field4022 = null;
        field4023 = null;
        field4021 = null;
        if (arg0 > -125) {
            field4028 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLno;)V")
    public static final void method1709(byte arg0, class418 arg1) {
        field4026++;
        if (arg0 == 83 && !class262.field4214) {
            arg1.method1120(85);
            class144.field2267--;
        }
    }
}
