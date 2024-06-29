import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class432 extends class404 {

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    private int field5403;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    private int field5405;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    private int field5398;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lwp;")
    public static class453 field5404 = new class453(86, 8);

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[S")
    public static short[] field5407 = new short[256];

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field5406 = 7000;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method2277(byte arg0) {
        field5404 = null;
        int var1 = 1 % ((65 - arg0) / 60);
        field5407 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
    public final void method1912(int arg0, int arg1, int arg2) {
        ++field5401;
        if (arg2 != 4) {
            this.method1912(40, -113, 34);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
    public final void method1911(int arg0, byte arg1, int arg2) {
        ++field5400;
        int var4 = this.field5405 * arg0 >> 12;
        int var5 = this.field5398 * arg0 >> 12;
        int var6 = this.field5403 * arg2 >> 12;
        int var7 = this.field5399 * arg2 >> 12;
        if (arg1 != -34) {
            this.field5403 = 97;
        }
        class497.method2675(-110, var6, var7, super.field5064, super.field5067, var4, super.field5068, var5);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method1910(int arg0, int arg1, int arg2) {
        ++field5402;
        int var4 = this.field5405 * arg0 >> 12;
        int var5 = this.field5398 * arg0 >> 12;
        if (arg1 == -21716) {
            int var6 = this.field5403 * arg2 >> 12;
            int var7 = this.field5399 * arg2 >> 12;
            class572.method3159(var4, var6, super.field5067, -19170, var5, var7);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
    public class432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5399 = arg3;
        this.field5403 = arg1;
        this.field5405 = arg0;
        this.field5398 = arg2;
    }
}
