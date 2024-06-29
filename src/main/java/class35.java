import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field672 = 10;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    public static int[] field674 = new int[2048];

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[Lf;")
    public static class529[] field675;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method362();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method363(int arg0) {
        field674 = null;
        int var1 = -22 / ((arg0 + 25) / 36);
        field675 = null;
    }

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method364(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method365(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method366(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method367(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method368(int arg0) {
        field677++;
        if (arg0 != -12713) {
            field672 = 104;
        }
        if (class212.field3040) {
            return;
        }
        if (class443.field6623.field601) {
            class455.field6790 = ((int) class455.field6790 - 17 & 0xFFFFFFF0);
        } else {
            class168.field2614 += (-class168.field2614 - 12.0F) / 2.0F;
        }
        class212.field3040 = true;
        class157.field2461 = true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method369(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method370(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method371(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class377 method372(int arg0, int arg1, class377 arg2);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method373(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method375(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method376(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lgj;BLjq;Lqa;)V")
    public static final void method377(class447 arg0, byte arg1, class353 arg2, class162 arg3) {
        field671++;
        class529 var4 = arg0.method2669(arg3, 131072);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method96();
        if (var4.method109() > var5) {
            var5 = var4.method109();
        }
        byte var6 = 10;
        int var7 = arg2.field5398;
        int var8 = arg2.field5395;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field6674 != null) {
            var9 = class389.field5853.method2134(class41.field737, null, arg0.field6674, 0, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class41.field737[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class138.field2221.method2234(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class138.field2221.method2236() * var9 + class138.field2221.method2232() / 2;
        }
        if (arg1 > -10) {
            field672 = 82;
        }
        int var15 = var5 / 2 + arg2.field5398;
        int var16 = arg2.field5395;
        if (class509.field7505 + var5 > var7) {
            var15 = var10 / 2 + var5 / 2 + class509.field7505 + var6 + 5;
            var7 = class509.field7505;
        } else if (var7 > (class509.field7509 - var5)) {
            var15 = class509.field7509 - (var5 / 2) - (var10 / 2 - -5 + var6);
            var7 = class509.field7509 - var5;
        }
        if (var8 < class509.field7511 + var5) {
            var8 = class509.field7511;
            var16 = var5 / 2 + class509.field7511 + var6;
        } else if (class509.field7515 - var5 < var8) {
            var16 = class509.field7515 - var6 - var11 - (var5 / 2);
            var8 = class509.field7515 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field5398), (double) (var8 - arg2.field5395)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3139((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field6674 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var9 * class138.field2221.method2236() + var16 + 3;
            var20 = var10 + var18 + 10;
            if (arg0.field6706 != 0) {
                arg3.method1200(arg0.field6706, var21 - var16, var18, var16, var20 - var18, 10);
            }
            if (arg0.field6691 != 0) {
                arg3.method1196(var20 - var18, var18, (byte) -113, var21 - var16, arg0.field6691, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class41.field737[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class138.field2221.method2235(arg3, var23, var15, var16, arg0.field6699, true);
                var16 += class138.field2221.method2236();
            }
        }
        if (arg0.field6679 == -1 && arg0.field6674 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class514 var25 = new class514(arg2);
        var25.field7550 = var21;
        var25.field7552 = var20;
        var25.field7561 = var19;
        var25.field7554 = var7 + var24;
        var25.field7557 = var18;
        var25.field7551 = var8 + var24;
        var25.field7555 = var8 - var24;
        var25.field7560 = var7 - var24;
        class329.field4971.method2417(-8, var25);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lfk;[I)V")
    public abstract void method378(class462 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        this.field673 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field679++;
        }
        this.field678 = arg1;
        this.field676 = 0x1 << this.field679;
    }
}
