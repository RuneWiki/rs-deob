import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class668 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
    public static boolean field9503 = false;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "B")
    public byte field9506;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field9496;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ldh;")
    public static class320 field9500;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ljava/lang/String;")
    public String field9495;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/lang/String;")
    public String field9499;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ljava/lang/String;")
    public String field9501;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public String field9502;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)I", line = 6)
    public static final int method3793(boolean arg0, int arg1) {
        field9505++;
        if (arg1 != 11468) {
            method3794(0);
        }
        int var2 = class3.field27;
        if (var2 == 0) {
            return arg0 ? 0 : class261.field3241;
        } else if (var2 == 1) {
            return class261.field3241;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 50)
    public static final int method3794(int arg0) {
        field9497++;
        return arg0 == 0 ? class188.field2237.method4048(~arg0) : -105;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 61)
    public static final void method3795(int arg0) {
        class559.field7988.method3541(-647);
        if (arg0 != 162) {
            field9500 = null;
        }
        field9498++;
        class657.field9393.method3541(arg0 ^ 0xFFFFFDDB);
        class203.field2402.method3541(-647);
        class336.field4318.method3541(arg0 ^ 0xFFFFFDDB);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 75)
    public static void method3796(byte arg0) {
        if (arg0 > 13) {
            field9500 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V", line = 100)
    public static final void method3797(int arg0, byte arg1) {
        int var2 = 7 / ((-arg1 - 33) / 51);
        class387.field5371 = arg0;
        field9504++;
        class620 var3 = class132.field1443;
        synchronized (class132.field1443) {
            class132.field1443.method3549(0);
        }
        class620 var4 = class529.field7530;
        synchronized (class529.field7530) {
            class529.field7530.method3549(0);
        }
    }
}
