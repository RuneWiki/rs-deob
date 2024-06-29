import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class512 extends class419 {

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field7504;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field7505;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public int field7503;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[I")
    public static int[] field7507 = new int[4096];

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field7506;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7507[var0] = class297.method1850(34, var0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIBII)V", line = 3)
    public static final void method3017(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field7506++;
        if (arg4 != -113) {
            field7507 = null;
        }
        int var7 = arg0 + arg2;
        int var8 = arg3 - arg2;
        for (int var9 = arg0; var9 < var7; var9++) {
            class94.method740(class306.field4574[var9], arg6, arg1, arg5, false);
        }
        int var10 = arg1 - arg2;
        for (int var11 = arg3; var11 > var8; var11--) {
            class94.method740(class306.field4574[var11], arg6, arg1, arg5, false);
        }
        int var12 = arg6 + arg2;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class306.field4574[var13];
            class94.method740(var14, arg6, var12, arg5, false);
            class94.method740(var14, var10, arg1, arg5, false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 52)
    public static void method3018(int arg0) {
        if (arg0 == 0) {
            field7507 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIII)V", line = 61)
    public class512(int arg0, int arg1, int arg2, int arg3) {
        this.field7504 = arg2;
        this.field7502 = arg3;
        this.field7505 = arg0;
        this.field7503 = arg1;
    }
}
