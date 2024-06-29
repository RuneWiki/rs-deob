import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class168 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[B")
    public static byte[] field2821 = new byte[520];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lve;")
    public static class255 field2822 = class87.method607(47, "Okay");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lwl;")
    public static class81 field2819 = new class81(64);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lve;")
    public static class255 field2826 = class87.method607(39, "Mem:");

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2825 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lve;")
    public static class255 field2824 = class87.method607(85, "b12_full");

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lve;")
    public static class255 field2828 = class87.method607(78, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lve;")
    public static class255 field2829 = class87.method607(32, " GMT");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    public static int[] field2827;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[Ldi;)V", line = 24)
    public static final void method1219(int arg0, class142[] arg1) {
        class215.field3650[arg0] = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 177)
    public static void method1220(int arg0) {
        field2827 = null;
        field2826 = null;
        field2828 = null;
        field2824 = null;
        field2829 = null;
        field2822 = null;
        field2821 = null;
        field2819 = null;
        if (arg0 > -96) {
            method1221(-102, -113);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 257)
    public static final void method1221(int arg0, int arg1) {
        for (class172 var2 = (class172) class74.field1222.method288((byte) -42); var2 != null; var2 = (class172) class74.field1222.method289(117)) {
            if ((var2.field3568 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1502((byte) -82);
            }
        }
        if (arg0 == 17) {
            field2820++;
        }
    }
}
