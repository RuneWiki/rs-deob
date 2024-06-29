import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class560 extends class696 {

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field7822;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Lus;")
    public static class328 field7825 = new class328(75, 0);

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field7827 = 0;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[Lac;")
    public static class712[] field7826;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;IZ)I", line = 4)
    public static final int method3164(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            field7826 = null;
        }
        field7823++;
        return class726.method4027((byte) -8, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lgaa;III)V", line = 17)
    public static final void method3165(class460 arg0, int arg1, int arg2, int arg3) {
        class409.field5776 = arg3;
        field7824++;
        class349.field4521 = arg2;
        if (arg1 == 0) {
            class223.field2942 = arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 32)
    public static void method3166(byte arg0) {
        field7826 = null;
        field7825 = null;
        int var1 = -41 / ((arg0 + 55) / 61);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 47)
    public class560(int arg0) {
        this.field7822 = arg0;
    }
}
