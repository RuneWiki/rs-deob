import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class299 extends class126 {

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
    public static boolean field4384 = true;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field4382 = 100;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method2050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 29) {
            field4382 = -62;
        }
        class194[] var7 = class219.field2903;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class194 var9 = var7[var8];
            if (var9 != null && var9.field2596 == 2) {
                class323.method2173((var9.field2597 - class7.field138 << 7) + var9.field2593, arg5, arg0 >> 1, 0, arg4, arg3 >> 1, var9.field2594 * 2, (var9.field2603 - class200.field2660 << 7) + var9.field2590);
                if (class375.field5458[0] > -1 && (class28.field418 % 20) < 10) {
                    class304.field4459[var9.field2592].method454(class375.field5458[0] + arg2 - 12, class375.field5458[1] + arg1 + -28);
                }
            }
        }
        field4376++;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I")
    public abstract int method110(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        field4379++;
        if (!arg0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 != -17506) {
            this.field4374 = 127;
        }
        field4375++;
        return false;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIII)V")
    public class299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4378 = arg3;
        this.field4383 = arg4;
        this.field4381 = arg5;
        this.field4380 = arg2;
        this.field4374 = arg0;
        this.field4377 = arg1;
        this.field4371 = arg6;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        field4372++;
        if (arg3 <= -106) {
            throw new IllegalStateException();
        }
    }
}
