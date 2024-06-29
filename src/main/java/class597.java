import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class597 extends class127 implements class246 {

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lew;")
    private class240 field8280;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Z")
    public static boolean field8275 = false;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field8283 = 0;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field8284 = -1;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Lew;")
    public final class240 method1516(byte arg0) {
        if (arg0 <= 99) {
            this.method1518((byte) 26, true);
        }
        ++field8279;
        return this.field8280;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lck;Lew;Z)V")
    public class597(class221 arg0, class240 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field8280 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method818(int arg0, byte arg1) {
        int var3 = -89 % ((49 - arg1) / 34);
        super.method818(this.field8280.field3090 * arg0, (byte) 99);
        ++field8285;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
    public final boolean method1517(byte arg0) {
        if (arg0 < 115) {
            this.method1517((byte) 45);
        }
        ++field8277;
        return super.method820(6667, super.field1525.field2892);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1518(byte arg0, boolean arg1) {
        if (arg0 < 49) {
            field8283 = -11;
        }
        ++field8274;
        return super.method822(arg1, super.field1525.field2892, (byte) 112);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
    public final int method819(byte arg0) {
        ++field8282;
        return arg0 >= -108 ? -114 : super.method819((byte) -127);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
    public static final boolean method3299(int arg0, int arg1, int arg2) {
        ++field8281;
        if (arg1 == 11) {
            arg1 = 10;
        }
        class290 var3 = class358.field5112.method890(arg0, false);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        int var4 = -15 / ((-18 - arg2) / 55);
        return var3.method1741(-92, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method474(int arg0) {
        super.method474(-79);
        ++field8278;
        if (arg0 > -74) {
            this.method1516((byte) -59);
        }
    }
}
