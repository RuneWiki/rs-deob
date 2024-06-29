import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class507 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field7449 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method2993(int arg0) {
        if (arg0 != 13) {
            field7449 = 114;
        }
        class97.method758(class378.field5693, false);
        field7451++;
        class148.field2230++;
        class43.field559.method2777((byte) 74, class209.field3019);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lgo;Lgo;B)V")
    public static final void method2994(class310 arg0, class310 arg1, byte arg2) {
        class146.field2198++;
        if (arg2 != 118) {
            field7449 = 34;
        }
        field7450++;
        class97.method758(class26.field389, false);
        class43.field559.method2717(arg1.field4643, arg2 + 496598450);
        class43.field559.method2773((byte) 106, arg1.field4665);
        class43.field559.method2739(arg0.field4675, (byte) -41);
        class43.field559.method2717(arg0.field4643, arg2 ^ 0x1D997E5E);
        class43.field559.method2742((byte) 123, arg0.field4665);
        class43.field559.method2773((byte) 113, arg1.field4675);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method2995(byte arg0) {
        class59.field813.method3140(-3945);
        field7448++;
        if (arg0 != 38) {
            method2995((byte) 89);
        }
        class293.field4386.method2000((byte) 89);
        class239.field3348.method422(0);
        class119.field1824.method249(arg0 ^ 0x14);
        class373.field5641.method770(true);
        class164.field2437.method1745(-127);
        class510.field7490.method572(17544);
        class443.field6509.method2025(true);
        class41.field539.method2509((byte) 67);
        class233.field3279.method219(16);
        class159.field2391.method384((byte) -119);
        class274.field4086.method339((byte) -66);
        class36.field497.method694(false);
        class526.field7776.method2480(-65);
        class260.field3873.method2679(29745);
        class69.field925.method1801(70);
        class119.field1821.method2875((byte) -43);
        class25.field372.method1411(-116);
        class312.field4844.method1063(arg0 ^ 0x6D);
        class152.field2317.method1452(-59);
        class171.method1182(-1933252411);
        class477.method2841(10);
        class465.method2700(false);
        class44.method340((byte) -116);
        class125.field1877.method2287(66);
        class32.field451.method2287(122);
        class145.field2185.method2287(80);
        class309.field4635.method2287(arg0 ^ 0x43);
        class64.field868.method2287(123);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
    public static final void method2996(int arg0, byte arg1) {
        field7447++;
        class382 var2 = class169.field2484;
        synchronized (class169.field2484) {
            class169.field2484.method2294(arg0, true);
        }
        class382 var3 = class146.field2199;
        synchronized (class146.field2199) {
            class146.field2199.method2294(arg0, true);
        }
        if (arg1 != 97) {
            method2996(14, (byte) -73);
        }
    }
}
