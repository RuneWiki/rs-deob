import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class724 {

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lbu;")
    public static class21 field10023 = new class21(5, -1);

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "[[[B")
    public static byte[][][] field10022;

    static {
        new class174("", 73);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method4061(int arg0) {
        field10022 = null;
        field10023 = null;
        if (arg0 <= 5) {
            method4061(-46);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILvn;)V", line = 25)
    public static final void method4062(int arg0, int arg1, class330 arg2) {
        field10024++;
        if (arg0 <= 35) {
            field10023 = null;
        }
        int var3 = -1;
        int var4 = 0;
        if (class192.field2961 < arg2.field4629) {
            class745.method4148(arg2, (byte) -69);
        } else if (arg2.field4658 >= class192.field2961) {
            class338.method2144(true, arg2);
        } else {
            class549.method3280(5, arg2, false);
            var4 = class206.field3194;
            var3 = class348.field4868;
        }
        if (arg2.field5742 < 512 || arg2.field5746 < 512 || ((class768.field10571 - 1) * 512) <= arg2.field5742 || arg2.field5746 >= class350.field4898 * 512 - 512) {
            arg2.field4604 = -1;
            arg2.field4629 = 0;
            arg2.field4609 = null;
            var4 = 0;
            var3 = -1;
            arg2.field4658 = 0;
            arg2.field5742 = arg2.field4670[0] * 512 + arg2.method2102(true) * 256;
            arg2.field5746 = arg2.field4672[0] * 512 + arg2.method2102(true) * 256;
            arg2.method2105(0);
            for (int var5 = 0; var5 < arg2.field4638.length; var5++) {
                arg2.field4638[var5].field10142 = -1;
            }
        }
        if (class210.field3250 == arg2 && (arg2.field5742 < 6144 || arg2.field5746 < 6144 || arg2.field5742 >= (class768.field10571 - 12) * 512 || ((class350.field4898 - 12) * 512) <= arg2.field5746)) {
            arg2.field4629 = 0;
            arg2.field4658 = 0;
            var3 = -1;
            arg2.field4609 = null;
            var4 = 0;
            arg2.field4604 = -1;
            arg2.field5742 = arg2.field4670[0] * 512 + (arg2.method2102(true) * 256);
            arg2.field5746 = arg2.field4672[0] * 512 + arg2.method2102(true) * 256;
            arg2.method2105(0);
            for (int var6 = 0; var6 < arg2.field4638.length; var6++) {
                arg2.field4638[var6].field10142 = -1;
            }
        }
        int var7 = class281.method1822(19594, arg2);
        class216.method1485(arg2, true);
        class31.method257((byte) 57, var4, var3, arg2, var7);
        class622.method3587(var3, arg2, -20365);
        class275.method1780(32, arg2);
    }
}
