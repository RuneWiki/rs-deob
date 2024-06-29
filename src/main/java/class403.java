import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class403 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Ljj;")
    public static class156 field5890 = new class156(16);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5896 = -11713997;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Ldp;")
    public static class174 field5892;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[[B")
    public static byte[][] field5895;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)I", line = 4)
    public static final int method2555(byte arg0, int arg1, int arg2) {
        int var3 = 22 / ((arg0 - 69) / 43);
        field5893++;
        class188 var4 = (class188) class319.field4606.method1219((long) arg1, -101);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field2780.length > arg2) {
            return var4.field2780[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2556(int arg0) {
        class276.method1968(-53);
        field5891++;
        class89.method667(81);
        class452.method2817(81);
        class123.method1040(-59);
        class393.method2506((byte) 110);
        class358.method2297(false);
        class297.method2067((byte) 35);
        class292.method2042(arg0 + arg0);
        class242.method1765(-61);
        class209.method1577(80);
        class277.method1975(0);
        class402.method2551(34);
        class21.method142(-113);
        class221.method1695(-1);
        class186.method1449(false);
        class106.method942((byte) 53);
        class417.method2612((byte) -61);
        class1.method2((byte) 4);
        class30.method229(arg0 ^ 0xFFFFB1C8);
        class373.method2381(65);
        class191.method1475(13388);
        class319.method2137(19805);
        if (class331.field4762 != 0) {
            for (int var1 = 0; var1 < class275.field4144.length; var1++) {
                class275.field4144[var1] = null;
            }
            class39.field609 = 0;
        }
        class86.method655(-65);
        class407.method2573((byte) 79);
        class34.method249(8);
        class117.method996(18952);
        class375.method2385(35);
        class216.field3192.method106((byte) -121);
        class73.field1235.method764();
        class7.field89.method2230(2);
        class109.method956((byte) 67);
        class362.field5159.method1343(-122);
        class399.field5867.method1343(-91);
        class217.field3222.method1343(arg0 ^ 0xFFFFFF93);
        class240.field3469.method1343(-128);
        class176.field2622.method1343(-123);
        class119.field1862.method1343(-90);
        class446.field6501.method1343(-82);
        class270.field4043.method1343(-75);
        class100.field1561.method1343(-87);
        class446.field6488.method1343(-77);
        class74.field1282.method1343(-84);
        class151.field2312.method1343(-110);
        class132.field2126.method1343(-97);
        class275.field4139.method1343(-107);
        class109.field1780.method1343(-111);
        class273.field4105.method1343(-96);
        class238.field3425.method1343(arg0 - 96);
        class361.field5141.method1343(arg0 ^ 0xFFFFFFB5);
        class247.field3585.method1343(-67);
        class40.field620.method1343(-106);
        class48.field783.method1343(-99);
        class28.field422.method1343(-74);
        class12.field208.method1343(-94);
        class49.field785.method1343(-126);
        class390.field5644.method1343(-80);
        class323.field4659.method1343(-108);
        class394.field5753.method1343(-105);
        class293.field4352.method1343(-118);
        class347.field4910.method1343(-110);
        class329.field4734.method106((byte) -122);
        class257.field3722.method106((byte) -104);
        class441.field6403.method106((byte) -113);
        class409.field5959.method106((byte) -104);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B)[B", line = 109)
    public static final byte[] method2557(int arg0, byte[] arg1) {
        field5889++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -20378) {
            byte[] var2 = new byte[arg1.length];
            class82.method637(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 127)
    public static void method2558(byte arg0) {
        field5895 = null;
        field5892 = null;
        if (arg0 != -104) {
            method2555((byte) -121, 103, -59);
        }
        field5890 = null;
    }
}
