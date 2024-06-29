import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class384 {

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    private int field5532 = -1;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
    private boolean field5534 = true;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    private int field5531;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    private int field5522;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    private int field5530;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[Ldb;")
    private class176[] field5521;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    private int field5524;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[Ldb;")
    private class176[] field5518;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Ldb;")
    private class176 field5533;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    private int field5519;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    private int field5520;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lsg;")
    private class226 field5529;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public static int[] field5523;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
    public static final void method2437(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5, int arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class290.field4056[var8] = class290.field4056[var8 - 1];
            class338.field4649[var8] = class338.field4649[var8 - 1];
            class347.field4757[var8] = class347.field4757[var8 - 1];
            class453.field6327[var8] = class453.field6327[var8 - 1];
            class211.field2946[var8] = class211.field2946[var8 - 1];
            class364.field5134[var8] = class364.field5134[var8 - 1];
            class195.field2685[var8] = class195.field2685[var8 - 1];
        }
        if (arg1 != 1) {
            return;
        }
        field5527++;
        class290.field4056[0] = arg5;
        class338.field4649[0] = arg6;
        class347.field4757[0] = arg2;
        class453.field6327[0] = arg7;
        class211.field2946[0] = arg0;
        class195.field2685[0] = arg3;
        class142.field2035 = class367.field5186;
        class251.field3545++;
        class364.field5134[0] = arg4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method2438(int arg0) {
        field5528++;
        if (this.field5521 != null) {
            for (int var2 = 0; var2 < this.field5521.length; var2++) {
                this.field5521[var2].method1157();
            }
        }
        if (arg0 == 0) {
            this.field5529 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public static void method2439(boolean arg0) {
        field5523 = null;
        if (!arg0) {
            method2437((String) null, -51, (String) null, 48, (String) null, 76, 5, (String) null);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILuo;I)Z")
    public final boolean method2440(int arg0, class345 arg1, int arg2) {
        if (this.field5532 != arg2) {
            this.field5532 = arg2;
            int var4 = class438.method2748((byte) 118, arg2);
            if (var4 > arg2) {
                var4 = class414.method2594(arg2, (byte) -125);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field5520 != var4) {
                this.field5520 = var4;
                this.field5529 = null;
            }
            if (this.field5521 != null) {
                this.field5519 = 0;
                int[] var5 = new int[this.field5521.length];
                for (int var6 = 0; var6 < this.field5521.length; var6++) {
                    class176 var7 = this.field5521[var6];
                    if (var7.method1154(this.field5530, this.field5522, this.field5531, this.field5532)) {
                        var5[this.field5519] = var7.field2405;
                        this.field5518[this.field5519++] = var7;
                    }
                }
                class247.method1667(var5, this.field5518, (byte) -128, 0, this.field5519 - 1);
            }
            this.field5534 = true;
        }
        field5526++;
        boolean var8 = false;
        if (arg0 != 1) {
            method2437((String) null, -68, (String) null, 107, (String) null, 74, 35, (String) null);
        }
        if (this.field5534) {
            this.field5534 = false;
            for (int var9 = this.field5519 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5518[var9].method1159(arg1, this.field5533);
                this.field5534 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[Ldb;IIII)V")
    public class384(int arg0, class176[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5531 = arg5;
        this.field5522 = arg4;
        this.field5530 = arg3;
        this.field5521 = arg1;
        this.field5524 = arg0;
        if (arg1 == null) {
            this.field5518 = null;
            this.field5533 = null;
        } else {
            this.field5518 = new class176[arg1.length];
            this.field5533 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIILuo;I)V")
    public final void method2441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class345 arg8, int arg9) {
        int var11 = arg5 + arg7 & 0x3FFF;
        field5525++;
        if (this.field5524 == -1) {
            arg8.method56(arg6, arg9, arg2, arg1, arg3, 0);
        } else {
            class454 var12 = class291.field4080.method469(this.field5524, (byte) -95);
            if (this.field5529 == null && class291.field4080.method473(this.field5524, 127)) {
                int[] var13 = var12.field6485 ? class291.field4080.method472(this.field5520, (byte) -72, 0.7F, false, this.field5524, this.field5520) : class291.field4080.method468(this.field5520, 0.7F, -24250, this.field5520, this.field5524, false);
                this.field5529 = arg8.method128(var13, 0, this.field5520, this.field5520, this.field5520);
            }
            if (!var12.field6485) {
                arg8.method56(arg6, arg9, arg2, arg1, arg3, 0);
            }
            if (this.field5529 != null) {
                int var14 = var12.field6485 ? 0 : 1;
                int var15 = arg1 * arg4 / -4096;
                int var16;
                for (var16 = arg1 * var11 / 4096 + (arg2 - arg1) / 2; var16 > arg1; var16 -= arg1) {
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (var15 > arg1) {
                    var15 -= arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg2; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field5529.method588(arg6 + var17, arg9 + var18, arg1, arg1, 0, 0, var14);
                    }
                }
            }
        }
        if (arg0 > -31) {
            method2439(false);
        }
        for (int var19 = this.field5519 - 1; var19 >= 0; var19--) {
            this.field5518[var19].method1161(arg8, arg6, arg9, arg2, arg1, arg4, var11);
        }
    }
}
