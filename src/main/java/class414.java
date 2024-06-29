import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class414 extends class518 {

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    private int field6282;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field6285;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    private int field6280;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    private int field6283;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6279 = -1;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[Lqf;")
    public static class593[] field6281;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static final void method2611(boolean arg0) {
        ++field6286;
        if (class40.field440 != class197.field2667) {
            if (!arg0) {
                field6279 = 113;
            }
            try {
                class314.method2067(-24319, "tbrefresh", class254.field3624);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
    public final void method223(int arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            method2612((byte) 125);
        }
        ++field6288;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIII)V")
    public class414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6282 = arg2;
        this.field6285 = arg3;
        this.field6280 = arg1;
        this.field6283 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field6280 = -104;
        }
        ++field6284;
        int var4 = this.field6283 * arg0 >> 12;
        int var5 = this.field6282 * arg0 >> 12;
        int var6 = this.field6280 * arg2 >> 12;
        int var7 = this.field6285 * arg2 >> 12;
        class296.method1983(var7, var5, super.field7535, var4, super.field7537, super.field7534, var6, -127);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)V")
    public final void method224(int arg0, int arg1, boolean arg2) {
        ++field6287;
        int var4 = this.field6283 * arg0 >> 12;
        int var5 = this.field6282 * arg0 >> 12;
        if (!arg2) {
            this.field6285 = -83;
        }
        int var6 = this.field6280 * arg1 >> 12;
        int var7 = this.field6285 * arg1 >> 12;
        class310.method2053(super.field7537, var7, var6, var5, 256, var4);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2612(byte arg0) {
        if (arg0 <= -9) {
            field6281 = null;
        }
    }
}
