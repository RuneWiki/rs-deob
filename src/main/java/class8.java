import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    private int[] field131 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Lfga;")
    public static class254 field128 = new class254();

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field138 = -2;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Lun;")
    public class420 field137;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[I")
    private int[] field140;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "[S")
    private short[] field129;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "[S")
    private short[] field134;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[S")
    private short[] field136;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "[S")
    private short[] field139;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIBIIII)V", line = 4)
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field133++;
        if (arg3 == arg6 && arg0 == arg8 && arg4 == arg9 && arg1 == arg2) {
            class56.method515(arg3, 18084, arg7, arg2, arg9, arg0);
        } else {
            int var10 = arg3;
            int var11 = arg0;
            int var12 = arg3 * 3;
            int var13 = arg0 * 3;
            int var14 = arg6 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg1 * 3;
            int var18 = arg9 + var14 - var16 - arg3;
            int var19 = arg2 + var15 - var17 - arg0;
            int var20 = var16 + var12 - (var14 + var14);
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg3;
                int var34 = (var30 + var32 + var28 >> 12) + arg0;
                class56.method515(var10, 18084, arg7, var34, var33, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg5 != 31) {
            method46(107);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z", line = 83)
    public final boolean method43(int arg0) {
        field132++;
        boolean var2 = true;
        class209 var3 = this.field137.field5903;
        synchronized (this.field137.field5903) {
            if (arg0 != 13) {
                method46(-103);
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field131[var4] != -1 && !this.field137.field5903.method1469((byte) -113, this.field131[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z", line = 110)
    public final boolean method44(int arg0) {
        field125++;
        if (this.field140 == null) {
            return true;
        }
        if (arg0 > -71) {
            field138 = 68;
        }
        boolean var2 = true;
        class209 var3 = this.field137.field5903;
        synchronized (this.field137.field5903) {
            for (int var4 = 0; var4 < this.field140.length; var4++) {
                if (!this.field137.field5903.method1469((byte) -128, this.field140[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Lww;", line = 139)
    public final class729 method45(byte arg0) {
        field127++;
        if (arg0 <= 60) {
            this.field136 = null;
        }
        class729[] var2 = new class729[5];
        int var3 = 0;
        class209 var4 = this.field137.field5903;
        synchronized (this.field137.field5903) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field131[var5] != -1) {
                    var2[var3++] = class337.method2148(-14907, this.field131[var5], this.field137.field5903, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field10196 < 13) {
                var2[var6].method4058(2, 0);
            }
        }
        class729 var7 = new class729(var2, var3);
        if (this.field134 != null) {
            for (int var8 = 0; var8 < this.field134.length; var8++) {
                var7.method4062(-111, this.field134[var8], this.field136[var8]);
            }
        }
        if (this.field139 != null) {
            for (int var9 = 0; var9 < this.field139.length; var9++) {
                var7.method4060((byte) 127, this.field129[var9], this.field139[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 209)
    public static void method46(int arg0) {
        if (arg0 != 4104) {
            method42(-41, -61, -71, -67, 53, (byte) 97, -17, -17, -4, 56);
        }
        field128 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILud;)V", line = 233)
    public final void method47(int arg0, class35 arg1) {
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                if (arg0 >= -24) {
                    return;
                }
                field130++;
                return;
            }
            this.method49(arg1, (byte) -121, var3);
        }
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Lww;", line = 268)
    public final class729 method48(int arg0) {
        field126++;
        if (this.field140 == null) {
            return null;
        }
        class729[] var2 = new class729[this.field140.length];
        class209 var3 = this.field137.field5903;
        synchronized (this.field137.field5903) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field140.length) {
                    break;
                }
                var2[var4] = class337.method2148(-14907, this.field140[var4], this.field137.field5903, 0);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field140.length; var5++) {
            if (var2[var5].field10196 < 13) {
                var2[var5].method4058(2, 0);
            }
        }
        class729 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class729(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field134 != null) {
            for (int var7 = 0; var7 < this.field134.length; var7++) {
                var6.method4062(-67, this.field134[var7], this.field136[var7]);
            }
        }
        if (this.field139 != null) {
            for (int var8 = 0; var8 < this.field139.length; var8++) {
                var6.method4060((byte) 126, this.field129[var8], this.field139[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lud;BI)V", line = 342)
    private final void method49(class35 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method273(255);
        } else if (arg2 == 2) {
            int var8 = arg0.method273(255);
            this.field140 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field140[var9] = arg0.method253(-13900);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method273(255);
                this.field136 = new short[var6];
                this.field134 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field134[var7] = (short) arg0.method253(class349.method2193(arg1, 13875));
                    this.field136[var7] = (short) arg0.method253(arg1 - 13779);
                }
            } else if (arg2 == 41) {
                int var4 = arg0.method273(arg1 + 376);
                this.field129 = new short[var4];
                this.field139 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field139[var5] = (short) arg0.method253(-13900);
                    this.field129[var5] = (short) arg0.method253(class349.method2193(arg1, 13875));
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field131[arg2 - 60] = arg0.method253(arg1 - 13779);
            }
        }
        field135++;
        if (arg1 != -121) {
            this.method43(50);
        }
    }
}
