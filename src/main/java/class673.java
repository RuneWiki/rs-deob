import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class673 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field9447;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lqaa;")
    public static class27 field9446 = new class27(79, -1);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9443;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JLjava/lang/String;IBJZLjava/lang/String;IZIZII)V")
    public static final void method3807(long arg0, String arg1, int arg2, byte arg3, long arg4, boolean arg5, String arg6, int arg7, boolean arg8, int arg9, boolean arg10, int arg11, int arg12) {
        field9450++;
        if (arg3 > -23) {
            field9443 = null;
        }
        if (!class34.field450 && class409.field5682 < 500) {
            int var15 = arg11 == -1 ? class458.field6611 : arg11;
            class66 var16 = new class66(arg6, arg1, var15, arg7, arg12, arg4, arg2, arg9, arg5, arg10, arg0, arg8);
            class706.method3957(var16, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9444++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method3808(int arg0) {
        field9443 = null;
        if (arg0 != -7156) {
            field9446 = null;
        }
        field9446 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)I")
    public static final int method3809(int arg0, int arg1, int arg2, int arg3) {
        field9445++;
        if ((class435.field6078[arg0][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class435.field6078[1][arg2][arg3] & 0x2) == 0) {
            if (arg1 < 50) {
                method3809(-101, 95, -90, -108);
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
    public static final boolean method3810(int arg0, int arg1, int arg2) {
        field9449++;
        int var3 = -12 / ((82 - arg0) / 38);
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class673(String arg0, int arg1) {
        this.field9447 = arg1;
    }
}
