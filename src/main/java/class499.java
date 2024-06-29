import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class499 extends class216 {

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    private int field6988;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field6990;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    private int field6991;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Ljf;")
    public static class640 field6985 = new class640(4, 7);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V", line = 9)
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field6987;
        int var4 = this.field6988 * arg2 >> 12;
        int var5 = this.field6991 * arg2 >> 12;
        int var6 = this.field6994 * arg1 >> 12;
        int var7 = this.field6990 * arg1 >> 12;
        class172.method1072(super.field3062, var4, var5, var7, super.field3063, arg0, super.field3060, var6);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V", line = 25)
    public class499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6988 = arg0;
        this.field6994 = arg1;
        this.field6990 = arg3;
        this.field6991 = arg2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V", line = 36)
    public final void method327(int arg0, byte arg1, int arg2) {
        if (arg1 != 23) {
            this.field6991 = -7;
        }
        ++field6992;
        int var4 = this.field6988 * arg2 >> 12;
        int var5 = this.field6991 * arg2 >> 12;
        int var6 = this.field6994 * arg0 >> 12;
        int var7 = this.field6990 * arg0 >> 12;
        class474.method2818(var6, super.field3063, var4, 23090, var5, var7);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 57)
    public final void method330(int arg0, int arg1, int arg2) {
        ++field6993;
        if (arg2 != 382254306) {
            method2988(-57);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 72)
    public static void method2988(int arg0) {
        field6985 = null;
        if (arg0 != 16777215) {
            field6989 = 126;
        }
    }
}
