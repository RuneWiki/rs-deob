import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class480 extends IOException {

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6713 = 0;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "[I")
    public static int[] field6716;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 4)
    public static void method2853(int arg0) {
        field6716 = null;
        if (arg0 != -1) {
            method2855((byte) 7, 51, 2, -46);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 16)
    public static final boolean method2854(byte arg0, String arg1) {
        if (arg0 < 41) {
            method2854((byte) -61, null);
        }
        field6717++;
        return class543.method3210((byte) 127, arg1, 10, true);
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 29)
    public class480(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BIII)I", line = 35)
    public static final int method2855(byte arg0, int arg1, int arg2, int arg3) {
        field6712++;
        if (arg0 != 62) {
            field6713 = 101;
        }
        if ((class124.field1585[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class124.field1585[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }
}
