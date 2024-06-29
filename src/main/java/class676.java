import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class676 {

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    private int field9380 = -1;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Z")
    private boolean field9386 = true;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    private int field9371;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    private int field9370;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "[Lgd;")
    private class344[] field9378;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    private int field9382;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    private int field9379;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "[Lgd;")
    private class344[] field9375;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "Lgd;")
    private class344 field9383;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Lhda;")
    public static class752 field9377 = new class752(5, 4);

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "Lkaa;")
    public static class47 field9385 = new class47(0, 4);

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "Z")
    public static boolean field9388 = false;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    private int field9373;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    private int field9376;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Lhu;")
    private class133 field9372;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "[Lwm;")
    public static class565[] field9384;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public final void method3764(byte arg0) {
        if (this.field9378 != null) {
            for (int var2 = 0; var2 < this.field9378.length; var2++) {
                this.field9378[var2].method2059();
            }
        }
        field9381++;
        this.field9372 = null;
        if (arg0 != -21) {
            field9377 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3765(int arg0) {
        if (arg0 != 0) {
            field9384 = null;
        }
        field9384 = null;
        field9385 = null;
        field9377 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILha;)Z")
    public final boolean method3766(int arg0, int arg1, class59 arg2) {
        if (this.field9380 != arg1) {
            this.field9380 = arg1;
            int var4 = class658.method3571(arg0 + 27688, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field9376 != var4) {
                this.field9372 = null;
                this.field9376 = var4;
            }
            if (this.field9378 != null) {
                this.field9373 = 0;
                int[] var5 = new int[this.field9378.length];
                for (int var6 = 0; var6 < this.field9378.length; var6++) {
                    class344 var7 = this.field9378[var6];
                    if (var7.method2058(this.field9371, this.field9370, this.field9379, this.field9380)) {
                        var5[this.field9373] = var7.field4840;
                        this.field9375[this.field9373++] = var7;
                    }
                }
                class104.method779(this.field9373 - 1, 0, true, var5, this.field9375);
            }
            this.field9386 = true;
        }
        field9387++;
        if (arg0 != 2) {
            method3765(-13);
        }
        boolean var8 = false;
        if (this.field9386) {
            this.field9386 = false;
            for (int var9 = this.field9373 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field9375[var9].method2053(arg2, this.field9383);
                var8 |= var10;
                this.field9386 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILha;IBIIII)V")
    public final void method3767(int arg0, int arg1, int arg2, class59 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg2 + arg4 & 0x3FFF;
        field9374++;
        if (this.field9382 == -1 || this.field9376 == 0) {
            arg3.method504(arg1, arg8, arg9, arg7, arg0, 0);
        } else {
            class758 var12 = class513.field6801.method91(this.field9382, (byte) 124);
            if (this.field9372 == null && class513.field6801.method85(this.field9382, -32345)) {
                int[] var13 = var12.field10541 == 2 ? class513.field6801.method92(false, (byte) 71, this.field9376, this.field9376, 0.7F, this.field9382) : class513.field6801.method86(-122, this.field9376, 0.7F, false, this.field9382, this.field9376);
                this.field9372 = arg3.method450(this.field9376, (byte) 99, this.field9376, var13, 0, this.field9376);
            }
            if (var12.field10541 == 2) {
                arg3.method504(arg1, arg8, arg9, arg7, arg0, 0);
            }
            if (this.field9372 != null) {
                int var14 = var12.field10541 == 2 ? 1 : 0;
                int var15 = arg6 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg9 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg9; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field9372.method1033(arg1 + var17, arg8 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = 41 / ((-arg5 - 64) / 47);
        for (int var20 = this.field9373 - 1; var20 >= 0; var20--) {
            this.field9375[var20].method2060(arg3, arg1, arg8, arg9, arg7, arg6, var11);
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I[Lgd;IIII)V")
    public class676(int arg0, class344[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9371 = arg3;
        this.field9370 = arg4;
        this.field9378 = arg1;
        this.field9382 = arg0;
        this.field9379 = arg5;
        if (arg1 == null) {
            this.field9375 = null;
            this.field9383 = null;
        } else {
            this.field9375 = new class344[arg1.length];
            this.field9383 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
