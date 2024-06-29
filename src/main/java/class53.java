import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class53 implements Runnable {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
    public boolean field834 = true;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field835 = new Object();

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field838 = 0;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public int[] field840 = new int[500];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[I")
    public int[] field841 = new int[500];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Z")
    public static boolean field828 = false;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Z")
    public static boolean field833 = false;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field839 = "red:";

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lvh;")
    public static class53 field831;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 7)
    public static final void method389(int arg0, int arg1) {
        field829++;
        class4 var2 = class67.method510(arg0 ^ 0x33, 3, arg1);
        if (arg0 != 50) {
            field839 = (String) null;
        }
        var2.method6(arg0 ^ 0xCD);
    }

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V", line = 27)
    public final void run() {
        field837++;
        while (this.field834) {
            Object var1 = this.field835;
            synchronized (this.field835) {
                if (this.field838 < 500) {
                    this.field841[this.field838] = class203.field3225;
                    this.field840[this.field838] = class278.field4309;
                    this.field838++;
                }
            }
            class279.method1991(89, 50L);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 54)
    public static final String method390(int arg0, String arg1) {
        if (arg0 != 1) {
            field831 = (class53) null;
        }
        field827++;
        String var2 = class74.method555((byte) -98, class36.method281(arg0 + 49, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 71)
    public static final void method391(byte arg0) {
        field830++;
        class219.field3511.method1837(126);
        if (arg0 != 29) {
            method389(-106, 31);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([[FIBII[[IIIIFI[[FI[[FZ[[IILdb;)I", line = 84)
    public static final int method392(float[][] arg0, int arg1, byte arg2, int arg3, int arg4, int[][] arg5, int arg6, int arg7, int arg8, float arg9, int arg10, float[][] arg11, int arg12, float[][] arg13, boolean arg14, int[][] arg15, int arg16, class186 arg17) {
        int var18 = -88 / ((arg2 + 75) / 50);
        if (arg7 == 1) {
            int var20 = arg4;
            arg4 = arg8;
            arg8 = 128 - var20;
        } else if (arg7 == 2) {
            arg8 = 128 - arg8;
            arg4 = 128 - arg4;
        } else if (arg7 == 3) {
            int var19 = arg4;
            arg4 = 128 - arg8;
            arg8 = var19;
        }
        field832++;
        int var21;
        float var22;
        float var23;
        float var24;
        if (arg4 == 0 && arg8 == 0) {
            var21 = arg10;
            var22 = arg0[arg1][arg16];
            var23 = arg13[arg1][arg16];
            var24 = arg11[arg1][arg16];
        } else if (arg4 == 128 && arg8 == 0) {
            var24 = arg11[arg1 + 1][arg16];
            var23 = arg13[arg1 + 1][arg16];
            var21 = arg3;
            var22 = arg0[arg1 + 1][arg16];
        } else if (arg4 == 128 && arg8 == 128) {
            var22 = arg0[arg1 + 1][arg16 + 1];
            var23 = arg13[arg1 + 1][arg16 + 1];
            var24 = arg11[arg1 + 1][arg16 + 1];
            var21 = arg6;
        } else if (arg4 == 0 && arg8 == 128) {
            var21 = arg12;
            var22 = arg0[arg1][arg16 + 1];
            var24 = arg11[arg1][arg16 + 1];
            var23 = arg13[arg1][arg16 + 1];
        } else {
            float var25 = (float) arg4 / 128.0F;
            float var26 = arg11[arg1][arg16];
            float var27 = arg13[arg1][arg16];
            float var28 = (arg11[arg1 + 1][arg16] - var26) * var25 + var26;
            float var29 = (float) arg8 / 128.0F;
            float var30 = arg0[arg1][arg16];
            float var31 = (arg13[arg1 + 1][arg16] - var27) * var25 + var27;
            float var32 = (arg0[arg1 + 1][arg16] - var30) * var25 + var30;
            float var33 = arg13[arg1][arg16 + 1];
            float var34 = (arg13[arg1 + 1][arg16 + 1] - var33) * var25 + var33;
            var23 = (var34 - var31) * var29 + var31;
            float var35 = arg11[arg1][arg16 + 1];
            float var36 = arg0[arg1][arg16 + 1];
            float var37 = (arg0[arg1 + 1][arg16 + 1] - var36) * var25 + var36;
            var22 = (var37 - var32) * var29 + var32;
            float var38 = (arg11[arg1 + 1][arg16 + 1] - var35) * var25 + var35;
            int var39 = class191.method1413(arg4, arg10, arg3, 28702);
            var24 = (var38 - var28) * var29 + var28;
            int var40 = class191.method1413(arg4, arg12, arg6, 28702);
            var21 = class191.method1413(arg8, var39, var40, 28702);
        }
        int var41 = (arg16 << 7) + arg8;
        int var42 = (arg1 << 7) + arg4;
        int var43 = class205.method1500(1164571624, arg4, arg1, arg8, arg5, arg16);
        return arg17.method1397(var42, var43, var41, var23, var22, var24, arg14 ? var21 & 0xFFFFFF00 : var21, arg15 == null ? 0.0F : (float) (var43 - class205.method1500(1164571624, arg4, arg1, arg8, arg15, arg16)) / arg9);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 195)
    public static void method393(boolean arg0) {
        field831 = null;
        field839 = null;
        if (arg0) {
            method390(4, (String) null);
        }
    }
}
