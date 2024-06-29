import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class212 {

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Z")
    private boolean field3096 = true;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    private int field3100 = -1;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    private int field3098;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    private int field3106;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "[Loo;")
    private class440[] field3104;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "[Loo;")
    private class440[] field3103;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "Loo;")
    private class440 field3107;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "F")
    public static float field3101;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "Lf;")
    private class529 field3108;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public final void method1482(byte arg0) {
        if (arg0 <= 39) {
            this.method1482((byte) 84);
        }
        field3105++;
        if (this.field3104 != null) {
            for (int var2 = 0; var2 < this.field3104.length; var2++) {
                this.field3104[var2].method2655();
            }
        }
        this.field3108 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)V")
    public static final void method1483(byte arg0, int arg1) {
        field3094++;
        if (arg0 != -70) {
            field3101 = -0.68381923F;
        }
        class338 var2 = class230.method1580(1, -1332166328, arg1);
        var2.method2052(100);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IC)Z")
    public static final boolean method1484(int arg0, char arg1) {
        int var2 = 103 / ((arg0 + 37) / 61);
        field3095++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILqa;IIIIBIII)V")
    public final void method1485(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        int var11 = arg4 + arg0 & 0x3FFF;
        field3093++;
        if (this.field3097 == -1) {
            arg1.method1036(arg7, arg3, arg5, arg9, arg2, 0);
        } else {
            class321 var12 = class266.field3894.method838(true, this.field3097);
            if (this.field3108 == null && class266.field3894.method839(this.field3097, (byte) 43)) {
                int[] var13 = var12.field4596 ? class266.field3894.method837(this.field3102, false, this.field3102, 0.7F, (byte) -37, this.field3097) : class266.field3894.method836(false, this.field3102, this.field3102, 70, this.field3097, 0.7F);
                this.field3108 = arg1.method1078(var13, 0, this.field3102, this.field3102, this.field3102);
            }
            if (!var12.field4596) {
                arg1.method1036(arg7, arg3, arg5, arg9, arg2, 0);
            }
            if (this.field3108 != null) {
                int var14 = var12.field4596 ? 0 : 1;
                int var15 = arg8 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg5 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var15 > arg9) {
                    var15 -= arg9;
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg5; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field3108.method106(var17 + arg7, var18 - -arg3, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = -4 / ((-arg6 - 4) / 42);
        for (int var20 = this.field3099 - 1; var20 >= 0; var20--) {
            this.field3103[var20].method2656(arg1, arg7, arg3, arg5, arg9, arg8, var11);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BLqa;I)Z")
    public final boolean method1486(byte arg0, class162 arg1, int arg2) {
        if (this.field3100 != arg2) {
            this.field3100 = arg2;
            int var4 = class476.method2841(arg2, true);
            if (arg2 < var4) {
                var4 = class293.method1867(arg2, -210300991);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3102 != var4) {
                this.field3108 = null;
                this.field3102 = var4;
            }
            if (this.field3104 != null) {
                this.field3099 = 0;
                int[] var5 = new int[this.field3104.length];
                for (int var6 = 0; var6 < this.field3104.length; var6++) {
                    class440 var7 = this.field3104[var6];
                    if (var7.method2658(this.field3106, this.field3098, this.field3092, this.field3100)) {
                        var5[this.field3099] = var7.field6574;
                        this.field3103[this.field3099++] = var7;
                    }
                }
                class1.method2(this.field3099 - 1, 0, (byte) -49, this.field3103, var5);
            }
            this.field3096 = true;
        }
        field3109++;
        if (arg0 < 60) {
            method1484(-102, (char) 65510);
        }
        boolean var8 = false;
        if (this.field3096) {
            this.field3096 = false;
            for (int var9 = this.field3099 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3103[var9].method2660(arg1, this.field3107);
                var8 |= var10;
                this.field3096 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I[Loo;IIII)V")
    public class212(int arg0, class440[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3097 = arg0;
        this.field3098 = arg4;
        this.field3092 = arg5;
        this.field3106 = arg3;
        this.field3104 = arg1;
        if (arg1 == null) {
            this.field3103 = null;
            this.field3107 = null;
        } else {
            this.field3103 = new class440[arg1.length];
            this.field3107 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
