import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class231 extends class214 {

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field3252 = 4096;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private int field3254 = 4096;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    private int field3257 = 4096;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "Lfn;")
    public static class52 field3248 = new class52(22, -2);

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "[I")
    public static int[] field3260 = new int[14];

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field3263 = 2;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Lsq;")
    public static class454 field3258 = new class454(8);

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "[[Lws;")
    public static class38[][] field3256;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 <= -114) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field3254 = arg0.method2508(true);
                    }
                } else {
                    this.field3252 = arg0.method2508(true);
                }
            } else {
                this.field3257 = arg0.method2508(true);
            }
            ++field3251;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)I")
    public static final int method1449(int arg0, int arg1, int arg2) {
        ++field3250;
        int var3 = (arg2 & 127) * arg1 >> 7;
        if (arg0 != 4096) {
            method1452((byte) 17);
        }
        if (~var3 > -3) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        return (65408 & arg2) + var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILfc;II)Lss;")
    public static final class76 method1450(int arg0, class343 arg1, int arg2, int arg3) {
        ++field3261;
        if (arg0 < 39) {
            return null;
        } else {
            byte[] var4 = arg1.method2029(arg3, arg2, 0);
            return var4 == null ? null : new class76(var4);
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)V")
    public static final void method1451(boolean arg0) {
        if (!arg0) {
            field3256 = null;
        }
        class104 var1 = class267.field3716;
        synchronized (class267.field3716) {
            class267.field3716.method656(95);
        }
        ++field3249;
        class104 var2 = class21.field367;
        synchronized (class21.field367) {
            class21.field367.method656(118);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        if (arg0 == 42) {
            field3260 = null;
            field3248 = null;
            field3258 = null;
            field3256 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1453(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3253;
        long var6 = (long) ((!arg5 ? 0 : Integer.MIN_VALUE) | arg1);
        class459 var8 = (class459) class235.field3314.method2614(var6, 43);
        if (var8 == null) {
            var8 = new class459();
            class235.field3314.method2620(var6, var8, false);
        }
        if (~var8.field6464.length >= ~arg4) {
            int[] var9 = new int[arg4 - -1];
            int[] var10 = new int[arg4 - -1];
            for (int var11 = 0; var8.field6464.length > var11; ++var11) {
                var9[var11] = var8.field6464[var11];
                var10[var11] = var8.field6463[var11];
            }
            for (int var12 = var8.field6464.length; ~var12 > ~arg4; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6463 = var10;
            var8.field6464 = var9;
        }
        if (arg2 != 0) {
            method1452((byte) 69);
        }
        var8.field6464[arg4] = arg3;
        var8.field6463[arg4] = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field3255;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            field3248 = null;
        }
        if (super.field3030.field6644) {
            int[][] var4 = this.method1354(0, arg0, (byte) 23);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class399.field5585 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3257 * var12 >> 12;
                    var9[var11] = this.field3252 * var13 >> 12;
                    var10[var11] = this.field3254 * var14 >> 12;
                } else {
                    var8[var11] = this.field3257;
                    var9[var11] = this.field3252;
                    var10[var11] = this.field3254;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class231() {
        super(1, false);
    }
}
