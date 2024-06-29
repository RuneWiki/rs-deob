import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class515 extends class255 implements Runnable {

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public int field7570 = -1;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "Z")
    private boolean field7571 = true;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Lms;")
    private class529 field7574;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "[I")
    public static int[] field7572 = new int[2048];

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Lhh;")
    public static class84 field7577;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Lhh;")
    public static class84 field7580;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "[I")
    public static int[] field7579;

    @OriginalMember(owner = "client!au", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (this.field7571) {
            this.field7574.method3138(true, this);
        }
        field7575++;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 19)
    public static void method3051(int arg0) {
        if (arg0 < 0) {
            method3051(-55);
        }
        field7579 = null;
        field7580 = null;
        field7572 = null;
        field7577 = null;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lms;)V", line = 149)
    public class515(class529 arg0) {
        this.field7574 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lqa;Lha;IIIII)V", line = 44)
    public static final void method3052(class162 arg0, class41 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class334.field5130 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class246.field3560) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class254.field3675 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class165 var15 = class36.field545[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class529.field7807[var12].method271(var13, var14) + class529.field7807[var12].method271(var13 + 1, var14) + class529.field7807[var12].method271(var13, var14 + 1) + class529.field7807[var12].method271(var13 + 1, var14 + 1)) / 4 - (class529.field7807[arg2].method271(arg3, arg4) + class529.field7807[arg2].method271(arg3 + 1, arg4) + class529.field7807[arg2].method271(arg3, arg4 + 1) + class529.field7807[arg2].method271(arg3 + 1, arg4 + 1)) / 4;
                                    class524 var17 = var15.field2480;
                                    class524 var18 = var15.field2484;
                                    if (var17 != null && var17.method121(26923)) {
                                        arg1.method111(var16, (var13 - arg3) * class427.field6246 + (1 - arg5) * class495.field7211, arg0, 43, var7, var17, (var14 - arg4) * class427.field6246 + (1 - arg6) * class495.field7211);
                                    }
                                    if (var18 != null && var18.method121(26923)) {
                                        arg1.method111(var16, (var13 - arg3) * class427.field6246 + (1 - arg5) * class495.field7211, arg0, 103, var7, var18, (var14 - arg4) * class427.field6246 + (1 - arg6) * class495.field7211);
                                    }
                                    for (class525 var19 = var15.field2490; var19 != null; var19 = var19.field7716) {
                                        class370 var20 = var19.field7711;
                                        if (var20 != null && var20.method121(26923) && (var20.field5532 == var13 || var8 == var13) && (var20.field5535 == var14 || var10 == var14)) {
                                            int var21 = var20.field5542 + 1 - var20.field5532;
                                            int var22 = var20.field5540 + 1 - var20.field5535;
                                            arg1.method111(var16, (var20.field5532 - arg3) * class427.field6246 + (var21 - arg5) * class495.field7211, arg0, 122, var7, var20, (var20.field5535 - arg4) * class427.field6246 + (var22 - arg6) * class495.field7211);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 139)
    public final void method3053(int arg0) {
        if (arg0 <= 29) {
            method3055(6, -2, 9, -74, -0.81025064F, null, 2.5499232F, 2.2812684F, -3, 0.32741407F, -0.9952224F, 68, null);
        }
        field7573++;
        this.field7571 = false;
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V", line = 157)
    public final void method3054(int arg0) {
        (new Thread(this, "a")).start();
        field7576++;
        if (arg0 != 1) {
            field7579 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIFLee;FFIFFI[B)V", line = 170)
    public static final void method3055(int arg0, int arg1, int arg2, int arg3, float arg4, class475 arg5, float arg6, float arg7, int arg8, float arg9, float arg10, int arg11, byte[] arg12) {
        for (int var13 = arg0; var13 < arg3; var13++) {
            class353.method2287(arg3, arg5, (byte) 75, arg7, arg8, var13, arg4, arg11, arg10, arg2, arg12, arg1, arg9, arg6);
            arg1 += arg8 * arg11;
        }
        field7578++;
    }
}
