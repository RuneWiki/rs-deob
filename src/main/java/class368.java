import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class368 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public int field4745;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lpw;")
    public static class89 field4744 = new class89(1);

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Len;")
    public static class368 field4751 = new class368(2);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 5)
    public static void method2116(int arg0) {
        field4751 = null;
        field4744 = null;
        if (arg0 != 12) {
            field4752 = -111;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V", line = 18)
    public static final void method2117(int arg0, int arg1, int arg2) {
        field4746++;
        class367 var3 = class573.method3057(arg0, arg1, 2);
        var3.method2115(1);
        var3.field4735 = arg2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 29)
    public static final void method2118(byte arg0) {
        field4743++;
        class390.field4990.method3171(34);
        class691.field9440.method2209(true);
        class381.field4890.method695((byte) -86);
        class524.field6827.setBackground(Color.black);
        class378.field4846 = -1;
        class390.field4990 = class475.method2622((byte) 121, class524.field6827);
        class691.field9440 = class110.method844(class524.field6827, arg0 ^ 0x15, true);
        if (arg0 != 20) {
            field4749 = -66;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V", line = 47)
    public static final void method2119(int arg0, int arg1) {
        field4750++;
        class367 var2 = class573.method3057(12, arg0, 2);
        var2.method2113(18);
        if (arg1 < 75) {
            method2116(62);
        }
    }

    @OriginalMember(owner = "client!en", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field4747++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I)V", line = 67)
    public class368(int arg0) {
        this.field4745 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Ljba;", line = 81)
    public static final class138 method2120(boolean arg0) {
        field4748++;
        if (class202.field2638.length > class636.field8842) {
            return class202.field2638[class636.field8842++];
        } else {
            if (arg0) {
                field4752 = 46;
            }
            return null;
        }
    }
}
