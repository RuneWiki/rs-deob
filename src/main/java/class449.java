import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class449 {

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    private int field5655;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Lnba;")
    public static class278 field5650 = new class278();

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II[[[BIIIIIILoa;III)V", line = 6)
    public static final void method2454(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class650 arg9, int arg10, int arg11, int arg12) {
        if (arg3 <= 70) {
            method2457(25);
        }
        field5651++;
        if (arg5 == 0 || arg4 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg5 = 8;
        }
        arg9.method443(arg12, arg11, arg7, arg8, arg10, arg6, arg2[arg5 - 1][arg0], arg4, arg1);
    }

    @OriginalMember(owner = "client!cga", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field5656++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V", line = 58)
    public static void method2455(int arg0) {
        if (arg0 < 47) {
            method2455(-61);
        }
        field5650 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)I", line = 68)
    public final int method2456(boolean arg0) {
        if (arg0) {
            this.field5655 = -15;
        }
        field5653++;
        return this.field5655;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)Z", line = 80)
    public static final boolean method2457(int arg0) {
        field5652++;
        if (class180.field2123) {
            try {
                class104.method744(class95.field1241, "showVideoAd", 117);
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -40 % ((21 - arg0) / 35);
        return false;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(II)V", line = 99)
    public class449(int arg0, int arg1) {
        this.field5655 = arg0;
        this.field5654 = arg1;
    }
}
