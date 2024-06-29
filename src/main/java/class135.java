import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class135 extends class235 {

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public int field1767 = -1;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Lqi;")
    public static class406 field1766 = new class406(8);

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "J")
    public static long field1771 = -1L;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Ljava/lang/String;")
    public String field1764;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Ljava/lang/String;")
    public String field1765;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)V")
    public static final void method852(int arg0, int arg1, byte arg2) {
        if (arg2 != 18) {
            method853((byte) 69);
        }
        ++field1769;
        class45 var3 = class354.method2094(arg1, (byte) -83, 6);
        var3.method260(9188);
        var3.field504 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V")
    public static void method853(byte arg0) {
        if (arg0 <= 15) {
            field1771 = -114L;
        }
        field1766 = null;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)Lhb;")
    public final class520 method854(int arg0) {
        ++field1768;
        if (arg0 != 8) {
            this.field1765 = null;
        }
        return class474.field6599[super.field3423];
    }
}
