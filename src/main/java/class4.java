import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class4 extends InputStream {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field40 = 0;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "[I")
    public static int[] field47 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class2.field22 = arg3;
        if (arg0 != -1234757663) {
            method29(4, 104, 21, (byte) -37, 49, -18);
        }
        class244.field3844 = arg2;
        field39++;
        class344.field5460 = arg1;
        class337.field5389 = arg4;
    }

    @OriginalMember(owner = "client!lo", name = "read", descriptor = "()I", line = 20)
    public final int read() {
        field41++;
        class19.method140(30000L, 16711680);
        return -1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 37)
    public static void method28(byte arg0) {
        field47 = null;
        if (arg0 > -15) {
            field47 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIBII)V", line = 52)
    public static final void method29(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field43++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        if (arg3 != -23) {
            field40 = -16;
        }
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var9 + var10;
        int var14 = var8 - (var12 - 1) * var11;
        int var15 = var9 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class244.field3844 <= arg4 && class2.field22 >= arg4) {
            int var20 = class112.method728(arg2 + arg1, class337.field5389, class344.field5460, arg3 - 103);
            int var21 = class112.method728(arg2 - arg1, class337.field5389, class344.field5460, -24);
            class278.method1986(var21, class347.field5501[arg4], arg0, var20, (byte) -99);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var17;
                    var17 += var16;
                    var14 += var19;
                    var19 += var16;
                }
            }
            var7--;
            int var23 = arg4 - var7;
            if (var14 < 0) {
                var14 += var19;
                var6++;
                var13 += var17;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var18 -= var15;
            var13 += -var22;
            var22 -= var15;
            int var24 = arg4 + var7;
            if (class244.field3844 <= var24 && class2.field22 >= var23) {
                int var25 = class112.method728(arg2 + var6, class337.field5389, class344.field5460, -100);
                int var26 = class112.method728(arg2 - var6, class337.field5389, class344.field5460, arg3 - 18);
                if (var23 >= class244.field3844) {
                    class278.method1986(var26, class347.field5501[var23], arg0, var25, (byte) 86);
                }
                if (var24 <= class2.field22) {
                    class278.method1986(var26, class347.field5501[var24], arg0, var25, (byte) -69);
                }
            }
        }
    }
}
