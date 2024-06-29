import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class469 {

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    private int field6853;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field6849;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Llf;")
    public static class238 field6850 = new class238();

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lvt;")
    public static class304 field6851 = new class304(7500);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field6847++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 16)
    public static void method2840(int arg0) {
        field6851 = null;
        if (arg0 == 7500) {
            field6850 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZII)V", line = 29)
    public static final void method2841(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field6848++;
        if (!arg4) {
            return;
        }
        int var7 = arg0 + arg5;
        int var8 = arg3 - arg5;
        for (int var9 = arg0; var9 < var7; var9++) {
            class238.method1577(arg2, class664.field9322[var9], arg6, arg1, (byte) 126);
        }
        int var10 = arg6 - arg5;
        for (int var11 = arg3; var11 > var8; var11--) {
            class238.method1577(arg2, class664.field9322[var11], arg6, arg1, (byte) 122);
        }
        int var12 = arg1 + arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class664.field9322[var13];
            class238.method1577(arg2, var14, var12, arg1, (byte) 127);
            class238.method1577(arg2, var14, arg6, var10, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 73)
    public static final int method2842(boolean arg0) {
        field6846++;
        if (!arg0) {
            field6850 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I", line = 84)
    public final int method2843(boolean arg0) {
        if (arg0) {
            field6852++;
            return this.field6853;
        } else {
            return -28;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V", line = 104)
    public class469(int arg0, int arg1) {
        this.field6853 = arg0;
        this.field6849 = arg1;
    }
}
