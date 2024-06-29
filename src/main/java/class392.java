import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class392 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field5337;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    public int[] field5342;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "[I")
    public int[] field5338;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Z")
    public static boolean field5340 = true;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field5341 = 0;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field5343 = new Random();

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lhq;")
    public static class365 field5344 = new class365(4);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2436(int arg0, int arg1) {
        field5336++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= -26) {
            method2437(37);
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 59)
    public static void method2437(int arg0) {
        if (arg0 != -5) {
            field5341 = -66;
        }
        field5344 = null;
        field5343 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)I", line = 75)
    public static final int method2438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == arg6) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        int var8 = arg3 & 0x3;
        field5339++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return -arg5 - (-(7 - arg0) - 1);
        } else {
            return 1 + 7 - arg2 - arg4;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V", line = 104)
    public class392(int arg0) {
        this.field5337 = arg0;
        this.field5342 = new int[this.field5337];
        this.field5338 = new int[this.field5337];
    }
}
