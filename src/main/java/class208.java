import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public abstract class class208 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method1302(byte arg0) {
        int var2 = -119 % ((arg0 + 58) / 53);
        field2956++;
        return this.method1303(255) || this.method1306(255) || this.method1308((byte) -88);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I", line = 25)
    public static final int method1307(int arg0, int arg1) {
        field2955++;
        if (arg1 <= 95) {
            method1310(-55);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)[Lhk;", line = 41)
    public static final class460[] method1310(int arg0) {
        int var1 = -6 % ((-arg0 - 12) / 54);
        field2954++;
        return new class460[] { class430.field5930, class430.field5931, class430.field5932, class430.field5933, class430.field5934, class430.field5935, class430.field5936, class430.field5937, class430.field5938, class430.field5939 };
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
    public abstract int method1301(int arg0);

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
    public abstract boolean method1303(int arg0);

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public abstract void method1304(byte arg0);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)I")
    public abstract int method1305(int arg0);

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z")
    public abstract boolean method1306(int arg0);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)Z")
    public abstract boolean method1308(byte arg0);

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Lwc;")
    public abstract class161 method1309(int arg0);

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(B)V")
    public abstract void method1311(byte arg0);
}
