import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class210 extends RuntimeException {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljava/lang/String;")
    public String field3430;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3429;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "S")
    public static short field3431 = 256;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3434 = "purple:";

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lqg;")
    public static class104 field3436;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lqh;")
    public static class201 field3433;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1448(int arg0) {
        field3436 = null;
        field3434 = null;
        field3433 = null;
        if (arg0 != 0) {
            method1451(true, -82, 20, 33, -126);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3427++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg7;
        if (arg1 != var8) {
            int var13 = class69.field1147[var8];
            int var14 = class69.field1137[var8];
            var11 = -arg7 * var13 >> 16;
            var12 = arg7 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class69.field1147[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class69.field1137[var9];
            var12 = var12 * var16 >> 16;
        }
        class99.field1625 = arg0 - var12;
        class54.field925 = arg6 - var10;
        class200.field3187 = arg4;
        class202.field3242 = arg3;
        class17.field301 = arg2 - var11;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1450(int arg0, String arg1) {
        class122.method883(false, (byte) -106);
        field3435++;
        class99.method726(0, arg1);
        if (arg0 != -3591) {
            field3437 = -57;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class210(Throwable arg0, String arg1) {
        this.field3430 = arg1;
        this.field3429 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIIII)V")
    public static final void method1451(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class56.method420(class29.field452[arg4], arg2, -7, arg3 - arg1, arg1 + arg3);
        field3432++;
        int var5 = arg1;
        if (arg0) {
            return;
        }
        int var6 = -arg1;
        int var7 = 0;
        int var8 = -1;
        while (var7 < var5) {
            var7++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class29.field452[arg4 + var5];
                int[] var10 = class29.field452[arg4 - var5];
                int var11 = arg3 + var7;
                int var12 = arg3 - var7;
                class56.method420(var9, arg2, -7, var12, var11);
                class56.method420(var10, arg2, -7, var12, var11);
            }
            int var13 = arg3 + var5;
            int var14 = arg3 - var5;
            int[] var15 = class29.field452[arg4 + var7];
            int[] var16 = class29.field452[arg4 - var7];
            class56.method420(var15, arg2, -7, var14, var13);
            class56.method420(var16, arg2, -7, var14, var13);
        }
    }
}
