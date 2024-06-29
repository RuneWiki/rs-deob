import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class37 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lsb;")
    private static class98 field624 = class47.method368("wishes to trade with you)3", 0);

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lsb;")
    public static class98 field623 = field624;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Z")
    public static boolean field621 = false;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field622 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lqh;")
    public static class24 field625 = null;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field627 = 127;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lsb;")
    public static class98 field626 = class47.method368("null", 0);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Laf;")
    public static class150 field618;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[IIII)V")
    public static final void method305(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field620++;
        int var6 = arg2 - 1;
        int var5 = arg0 + var6;
        arg4--;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (arg4 < var6) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method306(int arg0) {
        field622 = null;
        field626 = null;
        if (arg0 != -31938) {
            field623 = null;
        }
        field623 = null;
        field624 = null;
        field618 = null;
        field625 = null;
    }
}
