import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class268 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lgr;")
    public class403 field3965 = new class403();

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Z")
    public boolean field3971 = false;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3970 = -1;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V")
    public static final void method1746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3964++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (arg2 <= 59) {
            return;
        }
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        class345.method2125(false, class49.field723[arg3], arg1 - arg4, arg1 + arg4, arg5);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class345.method2125(false, class49.field723[var21], var24, var23, arg5);
            class345.method2125(false, class49.field723[var22], var24, var23, arg5);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IZZ)I")
    public static final int method1747(String arg0, int arg1, boolean arg2, boolean arg3) {
        field3966++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = arg2;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
