import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class222 {

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "Z")
    private boolean field3320 = true;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    private int field3312 = -1;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    private int field3319;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    private int field3323;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "[Lvs;")
    private class478[] field3310;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    private int field3326;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "[Lvs;")
    private class478[] field3322;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "Lvs;")
    private class478 field3313;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "J")
    public static long field3311 = -1L;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    private int field3317;

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "Lf;")
    private class257 field3318;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "Llq;")
    public static class292 field3324;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIILr;IIIIIZ)V", line = 4)
    public final void method1478(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field3316++;
        int var11 = arg1 + arg5 & 0x3FFF;
        if (this.field3326 == -1 || this.field3317 == 0) {
            arg3.method824(arg7, arg6, arg2, arg4, arg8, 0);
        } else {
            class377 var12 = class546.field8012.method2359(-125, this.field3326);
            if (this.field3318 == null && class546.field8012.method2363((byte) -123, this.field3326)) {
                int[] var13 = var12.field5225 ? class546.field8012.method2365(this.field3317, this.field3326, false, -84, 0.7F, this.field3317) : class546.field8012.method2360(this.field3317, false, this.field3326, (byte) 118, 0.7F, this.field3317);
                this.field3318 = arg3.method806(var13, 0, this.field3317, this.field3317, this.field3317);
            }
            if (var12.field5225) {
                arg3.method824(arg7, arg6, arg2, arg4, arg8, 0);
            }
            if (this.field3318 != null) {
                int var14 = var12.field5225 ? 1 : 0;
                int var15 = arg0 * arg4 / -4096;
                int var16;
                for (var16 = arg4 * var11 / 4096 + (arg2 - arg4) / 2; var16 > arg4; var16 -= arg4) {
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (var15 > arg4) {
                    var15 -= arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg2; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field3318.method1636(arg7 + var17, arg6 + var18, arg4, arg4, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3309 - 1; var19 >= 0; var19--) {
            this.field3322[var19].method2801(arg3, arg7, arg6, arg2, arg4, arg0, var11);
        }
        if (arg9) {
            this.method1480(null, (byte) -96, -56);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 90)
    public static void method1479(int arg0) {
        if (arg0 == -28190) {
            field3324 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lr;BI)Z", line = 104)
    public final boolean method1480(class98 arg0, byte arg1, int arg2) {
        if (this.field3312 != arg2) {
            this.field3312 = arg2;
            int var4 = class270.method1702(arg2, (byte) 33);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field3317 != var4) {
                this.field3317 = var4;
                this.field3318 = null;
            }
            if (this.field3310 != null) {
                this.field3309 = 0;
                int[] var5 = new int[this.field3310.length];
                for (int var6 = 0; var6 < this.field3310.length; var6++) {
                    class478 var7 = this.field3310[var6];
                    if (var7.method2798(this.field3321, this.field3319, this.field3323, this.field3312)) {
                        var5[this.field3309] = var7.field6849;
                        this.field3322[this.field3309++] = var7;
                    }
                }
                class8.method39((byte) -45, 0, var5, this.field3309 - 1, this.field3322);
            }
            this.field3320 = true;
        }
        int var8 = -127 % ((arg1 - 3) / 37);
        field3315++;
        boolean var9 = false;
        if (this.field3320) {
            this.field3320 = false;
            for (int var10 = this.field3309 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field3322[var10].method2799(arg0, this.field3313);
                this.field3320 |= !var11;
                var9 |= var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V", line = 182)
    public final void method1481(int arg0) {
        field3325++;
        if (this.field3310 != null) {
            for (int var2 = 0; var2 < this.field3310.length; var2++) {
                this.field3310[var2].method2797();
            }
        }
        this.field3318 = null;
        if (arg0 != -5168) {
            this.method1478(-27, -12, -7, null, 33, -9, 114, -5, 82, true);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I[Lvs;IIII)V", line = 221)
    public class222(int arg0, class478[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3319 = arg4;
        this.field3321 = arg3;
        this.field3323 = arg5;
        this.field3310 = arg1;
        this.field3326 = arg0;
        if (arg1 == null) {
            this.field3322 = null;
            this.field3313 = null;
        } else {
            this.field3322 = new class478[arg1.length];
            this.field3313 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
