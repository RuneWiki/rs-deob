import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class431 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field5989 = -2;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Llp;")
    public static class270 field5987 = new class270(0, 2, 2, 1);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Ldk;")
    public static class488 field5990 = new class488();

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method2482(int arg0, int arg1) {
        if (arg1 != 21284) {
            method2483((byte) 100);
        }
        field5986++;
        if (arg0 == 2 || arg0 == 59 || arg0 == 3 || arg0 == 23 || arg0 == 6) {
            return true;
        } else {
            return arg0 == 47 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 29)
    public static void method2483(byte arg0) {
        if (arg0 != 72) {
            method2485(false, (byte) 52);
        }
        field5990 = null;
        field5987 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 40)
    public static final void method2484(String arg0, int arg1, int arg2) {
        field5988++;
        class19 var3 = class364.method2236(1248116640, arg2, 3);
        var3.method110(12142);
        if (arg1 > -48) {
            method2484(null, -78, -65);
        }
        var3.field170 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZB)Z", line = 54)
    public static final boolean method2485(boolean arg0, byte arg1) {
        if (arg0) {
            method2484(null, -123, -104);
        }
        field5985++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class274.field3712[var2 - 128] != '\u0000';
        }
    }
}
