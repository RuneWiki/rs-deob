import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class243 extends class51 {

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
    public static int[] field4003 = new int[256];

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Lph;")
    public static class229 field4005 = class266.method1858("::serverjs5drop", 0);

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4009 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Lfe;")
    public static class97 field4004 = new class97(32);

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Z")
    public static boolean field4013 = false;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "Lph;")
    private static class229 field4011 = class266.method1858("", 0);

    @OriginalMember(owner = "client!li", name = "W", descriptor = "Lph;")
    public static class229 field4010 = field4011;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "B")
    public byte field4007;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Lhb;")
    public class164 field4002;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "[Lka;")
    public static class293[] field4014;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "[[[B")
    public static byte[][][] field4012;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I", line = 5)
    public static int method1696(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V", line = 20)
    public static void method1697(int arg0) {
        field4011 = null;
        field4014 = null;
        field4004 = null;
        field4005 = null;
        field4010 = null;
        field4003 = null;
        field4012 = (byte[][][]) null;
        if (arg0 != -8) {
            method1697(-127);
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)[B", line = 38)
    public final byte[] method323(int arg0) {
        if (arg0 != 16777215) {
            field4014 = (class293[]) null;
        }
        field4001++;
        if (this.field725 || this.field4002.field2670 < this.field4002.field2668.length - this.field4007) {
            throw new RuntimeException();
        }
        return this.field4002.field2668;
    }

    @OriginalMember(owner = "client!li", name = "h", descriptor = "(I)I", line = 68)
    public final int method322(int arg0) {
        field4006++;
        int var2 = 88 % ((-arg0) / 58);
        return this.field4002 == null ? 0 : this.field4002.field2670 * 100 / (this.field4002.field2668.length - this.field4007);
    }
}
