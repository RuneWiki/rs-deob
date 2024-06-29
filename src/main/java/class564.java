import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class564 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Z")
    private boolean field8354 = true;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    private int field8358 = -1;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[Luf;")
    private class382[] field8364;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field8350;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    private int field8351;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private int field8353;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    private int field8352;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[Luf;")
    private class382[] field8346;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Luf;")
    private class382 field8359;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field8362 = 0;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Luk;")
    public static class219 field8347 = new class219(16);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private int field8348;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    private int field8361;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lada;")
    public static class144 field8360;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lha;")
    private class53 field8356;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field8355;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILqa;IIZIIII)V", line = 3)
    public final void method3381(int arg0, int arg1, class208 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg6 + arg9 & 0x3FFF;
        field8349++;
        if (this.field8352 == -1) {
            arg2.method498(arg0, arg1, arg4, arg8, arg3, 0);
        } else {
            class471 var12 = class117.field1645.method110(this.field8352, (byte) 102);
            if (this.field8356 == null && class117.field1645.method109(this.field8352, 1680)) {
                int[] var13 = var12.field6645 ? class117.field1645.method111(this.field8361, false, this.field8361, 6925, this.field8352, 0.7F) : class117.field1645.method113(this.field8361, false, -4074, this.field8361, 0.7F, this.field8352);
                this.field8356 = arg2.method466(var13, 0, this.field8361, this.field8361, this.field8361);
            }
            if (var12.field6645) {
                arg2.method498(arg0, arg1, arg4, arg8, arg3, 0);
            }
            if (this.field8356 != null) {
                int var14 = var12.field6645 ? 1 : 0;
                int var15 = arg7 * arg8 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg4 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (arg8 < var15) {
                    var15 -= arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg4; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field8356.method314(arg0 + var17, arg1 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8348 - 1; var19 >= 0; var19--) {
            this.field8346[var19].method2273(arg2, arg0, arg1, arg4, arg8, arg7, var11);
        }
        if (!arg5) {
            this.field8351 = 57;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lqa;II)Z", line = 81)
    public final boolean method3382(class208 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field8348 = 126;
        }
        field8363++;
        if (this.field8358 != arg2) {
            this.field8358 = arg2;
            int var4 = class496.method2959(arg2, arg1 ^ 0xFFFFFFB7);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8361 != var4) {
                this.field8361 = var4;
                this.field8356 = null;
            }
            if (this.field8364 != null) {
                this.field8348 = 0;
                int[] var5 = new int[this.field8364.length];
                for (int var6 = 0; var6 < this.field8364.length; var6++) {
                    class382 var7 = this.field8364[var6];
                    if (var7.method2272(this.field8353, this.field8350, this.field8351, this.field8358)) {
                        var5[this.field8348] = var7.field5250;
                        this.field8346[this.field8348++] = var7;
                    }
                }
                class199.method1335(this.field8346, this.field8348 - 1, (byte) -127, 0, var5);
            }
            this.field8354 = true;
        }
        boolean var8 = false;
        if (this.field8354) {
            this.field8354 = false;
            for (int var9 = this.field8348 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8346[var9].method2274(arg0, this.field8359);
                var8 |= var10;
                this.field8354 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 170)
    public final void method3383(int arg0) {
        field8365++;
        if (arg0 != -15860) {
            method3384(-119);
        }
        if (this.field8364 != null) {
            for (int var2 = 0; var2 < this.field8364.length; var2++) {
                this.field8364[var2].method2282();
            }
        }
        this.field8356 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[Luf;IIII)V", line = 241)
    public class564(int arg0, class382[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8364 = arg1;
        this.field8350 = arg4;
        this.field8351 = arg5;
        this.field8353 = arg3;
        this.field8352 = arg0;
        if (arg1 == null) {
            this.field8346 = null;
            this.field8359 = null;
        } else {
            this.field8346 = new class382[arg1.length];
            this.field8359 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 206)
    public static void method3384(int arg0) {
        field8355 = null;
        field8360 = null;
        field8347 = null;
        if (arg0 != 512) {
            field8360 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V", line = 222)
    public static final void method3385(int arg0, int arg1) {
        field8357++;
        if (class325.method1953(arg1, (byte) 86)) {
            class141.method970(-1, -122, class302.field4135[arg1]);
            if (arg0 >= -30) {
                method3384(-71);
            }
        }
    }
}
