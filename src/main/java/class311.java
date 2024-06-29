import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class311 implements class346 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lri;")
    private class97 field4903;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lpg;")
    public class682 field4904;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
    public static boolean field4901 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "J")
    public static long field4902;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lf;")
    public class702 field4898;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method2134(int arg0, byte arg1, int arg2) {
        field4900++;
        if (arg1 < 91) {
            method2134(16, (byte) -46, -71);
        }
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V", line = 16)
    public void method1066(boolean arg0, int arg1) {
        if (arg1 != -5506) {
            this.method587(-103);
        }
        if (arg0) {
            int var3 = this.field4904.field9566.method1799(arg1 ^ 0xFFFFEA64, this.field4898.method1076(), class585.field8333) + this.field4904.field9561;
            int var4 = this.field4904.field9572.method2550(this.field4898.method1079(), true, class95.field1487) + this.field4904.field9562;
            this.field4898.method3960(var3, var4);
        }
        field4899++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z", line = 40)
    public final boolean method585(byte arg0) {
        if (arg0 < 119) {
            field4901 = true;
        }
        field4905++;
        return this.field4903.method942(0, this.field4904.field9570);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lri;Lpg;)V", line = 53)
    public class311(class97 arg0, class682 arg1) {
        this.field4903 = arg0;
        this.field4904 = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 65)
    public final void method587(int arg0) {
        this.field4898 = class592.method3456(this.field4904.field9570, true, this.field4903);
        field4906++;
        if (arg0 != 22478) {
            field4901 = false;
        }
    }
}
