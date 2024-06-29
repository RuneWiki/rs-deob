import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class250 extends class71 {

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "[I")
    public static int[] field4452 = new int[99];

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Lja;")
    public static class64 field4455;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "[Lud;")
    public static class279[] field4457;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[[[I")
    public static int[][][] field4458;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4452[var1] = var0 / 4;
        }
        field4459 = 0;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V", line = 13)
    public static void method1787(int arg0) {
        field4458 = (int[][][]) null;
        field4457 = null;
        if (arg0 > -37) {
            field4455 = (class64) null;
        }
        field4452 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIILsf;IJ)Z", line = 27)
    public static final boolean method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class108 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class78.method655(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 48)
    public class250() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(III)Lwb;", line = 52)
    public static final class153 method1789(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class153 var4 = var3.field3442;
            var3.field3442 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZIIIZII)V", line = 63)
    public static final void method1790(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            field4458 = (int[][][]) ((int[][][]) null);
        }
        if (arg5 < arg2) {
            int var7 = (arg2 + arg5) / 2;
            int var8 = arg5;
            class42 var9 = class58.field1233[var7];
            class58.field1233[var7] = class58.field1233[arg2];
            class58.field1233[arg2] = var9;
            for (int var10 = arg5; var10 < arg2; var10++) {
                if (class190.method1446(var9, class58.field1233[var10], arg4, arg0, arg3, arg6 - 37, arg1) <= 0) {
                    class42 var11 = class58.field1233[var10];
                    class58.field1233[var10] = class58.field1233[var8];
                    class58.field1233[var8++] = var11;
                }
            }
            class58.field1233[arg2] = class58.field1233[var8];
            class58.field1233[var8] = var9;
            method1790(arg0, arg1, var8 - 1, arg3, arg4, arg5, arg6 ^ 0x0);
            method1790(arg0, arg1, arg2, arg3, arg4, var8 + 1, 0);
        }
        field4454++;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)[I", line = 132)
    public final int[] method199(int arg0, byte arg1) {
        field4456++;
        if (arg1 > -69) {
            method1790(false, -85, 4, 65, true, 125, -66);
        }
        return class133.field2424;
    }
}
