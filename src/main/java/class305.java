import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class305 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lgr;")
    public class326 field4561 = new class326();

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
    public boolean field4564 = false;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4558 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Luc;")
    public static class51 field4560 = new class51(64);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field4567 = 0;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lpq;")
    public static class50 field4565;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 3)
    public static void method2037(int arg0) {
        field4560 = null;
        if (arg0 != 24047) {
            method2039(-97, -118);
        }
        field4565 = null;
        field4558 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBLjava/lang/String;I)V", line = 34)
    public static final void method2038(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        field4559++;
        class248 var5 = class416.method2626(211655864, arg1, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field3532 != null) {
            class452 var6 = new class452();
            var6.field6558 = arg3;
            var6.field6571 = var5;
            var6.field6573 = arg4;
            var6.field6570 = var5.field3532;
            class293.method1989(var6);
        }
        boolean var7 = true;
        if (var5.field3624 > 0) {
            var7 = class142.method983(var5, true);
        }
        int var8 = 73 % (-arg2 / 41);
        if (!var7 || !client.method402(var5).method1470((byte) 65, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class173.field2352++;
            class140.field1797.method1833(-20379, 71);
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 2) {
            class140.field1797.method1833(-20379, 183);
            class212.field2913++;
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 3) {
            class24.field437++;
            class140.field1797.method1833(-20379, 218);
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 4) {
            class140.field1797.method1833(-20379, 28);
            class239.field3352++;
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 5) {
            class140.field1797.method1833(-20379, 231);
            class297.field4490++;
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 6) {
            class231.field3188++;
            class140.field1797.method1833(-20379, 230);
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 7) {
            class421.field6120++;
            class140.field1797.method1833(-20379, 121);
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 8) {
            class140.field1797.method1833(-20379, 158);
            class309.field4579++;
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 9) {
            class274.field4031++;
            class140.field1797.method1833(-20379, 229);
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
        if (arg4 == 10) {
            class140.field1797.method1833(-20379, 50);
            class212.field2917++;
            class140.field1797.method2240((byte) -88, arg1);
            class140.field1797.method2250(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I", line = 174)
    public static final int method2039(int arg0, int arg1) {
        field4563++;
        return arg1 == -7 ? arg0 & 0x7F : -123;
    }
}
