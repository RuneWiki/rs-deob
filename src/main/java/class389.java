import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class389 {

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Lwg;")
    private class58 field5402 = new class58(64);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Lkr;")
    private class329 field5396;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "Lkr;")
    private class329 field5403;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "Lf;")
    public static class493 field5394 = new class493(0, -1);

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Lim;")
    public static class353 field5399 = new class353(104, -2);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "Lpe;")
    public static class157 field5395;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[BIIIIII[B)V")
    public static final void method2345(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field5400++;
        int var9 = -(arg3 >> 2);
        if (arg4 != -6573) {
            return;
        }
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg2++]);
                int var14 = arg6++;
                arg8[var14] = (byte) (arg8[var14] - arg1[arg2++]);
                int var15 = arg6++;
                arg8[var15] = (byte) (arg8[var15] - arg1[arg2++]);
                int var16 = arg6++;
                arg8[var16] = (byte) (arg8[var16] - arg1[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg2++]);
            }
            arg6 += arg7;
            arg2 += arg0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method2346(int arg0) {
        field5399 = null;
        field5394 = null;
        field5395 = null;
        if (arg0 < 63) {
            field5405 = -50;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
    public static final boolean method2347(int arg0, int arg1, int arg2) {
        field5397++;
        if (arg1 != 0) {
            method2345(21, null, 65, 44, -69, 72, 14, -11, null);
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(ILkr;Lkr;)V")
    public class389(int arg0, class329 arg1, class329 arg2) {
        this.field5396 = arg2;
        this.field5403 = arg1;
        if (this.field5403 != null) {
            this.field5403.method2064(0, 0);
        }
        if (this.field5396 != null) {
            this.field5396.method2064(0, 0);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)I")
    public static final int method2348(int arg0, int arg1) {
        field5404++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1 < 21) {
            return 38;
        } else {
            return class136.method713(arg0, true);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)Lnq;")
    public final class598 method2349(int arg0, int arg1) {
        field5393++;
        class598 var3 = (class598) this.field5402.method323((long) arg1, -19814);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field5403.method2054(true, 0, arg1);
        } else {
            var4 = this.field5396.method2054(true, 0, arg1 & 0x7FFF);
        }
        class598 var5 = new class598();
        if (var4 != null) {
            var5.method3443(new class551(var4), arg0 ^ 0x8200);
        }
        if (arg0 <= arg1) {
            var5.method3442(arg0 ^ 0x8142);
        }
        this.field5402.method316((long) arg1, (byte) -114, var5);
        return var5;
    }
}
