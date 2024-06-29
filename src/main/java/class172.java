import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class172 extends class64 {

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lid;")
    public static class149 field3175 = class60.method382("ul", (byte) 55);

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "J")
    public long field3174;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Lei;")
    public class172 field3172;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Lei;")
    public class172 field3178;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lsa;")
    public static class260 field3169;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Lld;")
    public static class79 field3176;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field3176 = null;
        field3175 = null;
        field3169 = null;
        int var1 = 86 / ((arg0 - 77) / 32);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public final void method1230(int arg0) {
        if (arg0 != 24120) {
            field3175 = null;
        }
        field3177++;
        if (this.field3178 != null) {
            this.field3178.field3172 = this.field3172;
            this.field3172.field3178 = this.field3178;
            this.field3172 = null;
            this.field3178 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIB)I")
    public static final int method1231(int arg0, int arg1, byte arg2) {
        field3170++;
        if (arg2 < 110) {
            field3173 = -104;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
