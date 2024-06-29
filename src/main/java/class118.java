import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class118 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Leka;")
    public static class654 field1597;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method706(int arg0) {
        if (arg0 != 5) {
            field1597 = null;
        }
        field1597 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method707(int arg0) {
        field1598++;
        int var1 = -119 % ((arg0 - 10) / 40);
        for (int var2 = 0; var2 < 5; var2++) {
            class420.field5545[var2] = false;
        }
        class455.field5968 = class439.field5770;
        class209.field2883 = -1;
        class422.field5554 = class148.field1890;
        class580.field7339 = class693.field8900;
        class38.field433 = class97.field1309;
        class552.field6974 = 0;
        class507.field6476 = 5;
        class532.field6737 = class463.field6022;
        class29.field255 = 0;
        class57.field764 = class232.field3122;
        class721.field9472 = -1;
        class525.field6679 = -1;
        class524.field6672 = -1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method708(int arg0, int arg1) {
        for (class337 var2 = class14.field145.method2610((byte) -29); var2 != null; var2 = class14.field145.method2620(0)) {
            if ((long) arg1 == (var2.field4108 >> 48 & 0xFFFFL)) {
                var2.method1946(-10364);
            }
        }
        if (arg0 != -1489937552) {
            method706(124);
        }
        field1599++;
    }
}
