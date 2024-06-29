import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class310 extends class405 {

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    private int field4455;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    private int field4458;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4452 = new String[100];

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "J")
    public static long field4461 = 0L;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V", line = 3)
    public final void method1405(int arg0, int arg1, int arg2) {
        ++field4456;
        int var4 = this.field4455 * arg2 >> 12;
        int var5 = -29 / ((-71 - arg0) / 53);
        int var6 = this.field4458 * arg2 >> 12;
        int var7 = this.field4454 * arg1 >> 12;
        int var8 = this.field4459 * arg1 >> 12;
        class630.method3467(var4, var8, super.field5644, var6, var7, super.field5641, 51);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBI)V", line = 26)
    public final void method1404(int arg0, byte arg1, int arg2) {
        ++field4453;
        if (arg1 != -72) {
            this.field4459 = -74;
        }
        int var4 = this.field4455 * arg0 >> 12;
        int var5 = this.field4458 * arg0 >> 12;
        int var6 = this.field4454 * arg2 >> 12;
        int var7 = this.field4459 * arg2 >> 12;
        class383.method2271(var7, var4, (byte) -124, var5, var6, super.field5642);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 47)
    public static void method1907(byte arg0) {
        field4452 = null;
        int var1 = 29 / ((-76 - arg0) / 33);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIII)V", line = 58)
    public class310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4454 = arg1;
        this.field4455 = arg0;
        this.field4459 = arg3;
        this.field4458 = arg2;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V", line = 72)
    public static final void method1908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg2 > -32) {
            field4452 = null;
        }
        while (~var5 > ~class601.field7899) {
            Rectangle var6 = class179.field2712[var5];
            if (~arg1 > ~(var6.x - -var6.width) && ~var6.x > ~(arg1 + arg4) && ~(var6.y + var6.height) < ~arg3 && arg0 + arg3 > var6.y) {
                class12.field192[var5] = true;
            }
            ++var5;
        }
        ++field4457;
        class62.method539(arg1 - -arg4, arg1, (byte) -86, arg0 + arg3, arg3);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V", line = 100)
    public final void method1403(int arg0, int arg1, int arg2) {
        ++field4460;
        int var4 = this.field4455 * arg0 >> 12;
        int var5 = this.field4458 * arg0 >> 12;
        int var6 = this.field4454 * arg2 >> 12;
        if (arg1 == 2) {
            int var7 = this.field4459 * arg2 >> 12;
            class140.method1073(var5, super.field5644, var4, var7, super.field5641, var6, super.field5642, (byte) -47);
        }
    }
}
