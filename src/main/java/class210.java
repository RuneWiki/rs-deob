import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class210 extends class192 {

    @OriginalMember(owner = "client!kn", name = "Jb", descriptor = "Ljava/lang/String;")
    public static String field3427 = "wave:";

    @OriginalMember(owner = "client!kn", name = "Pb", descriptor = "[I")
    public static int[] field3433 = new int[100];

    @OriginalMember(owner = "client!kn", name = "Yb", descriptor = "Ltl;")
    public static class222 field3442 = new class222(16);

    @OriginalMember(owner = "client!kn", name = "dc", descriptor = "Ljava/lang/String;")
    public static String field3447 = "yellow:";

    @OriginalMember(owner = "client!kn", name = "cc", descriptor = "Z")
    public static boolean field3446 = false;

    @OriginalMember(owner = "client!kn", name = "Kb", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!kn", name = "Lb", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!kn", name = "Mb", descriptor = "I")
    private int field3430;

    @OriginalMember(owner = "client!kn", name = "Nb", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!kn", name = "Ob", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!kn", name = "Qb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!kn", name = "Rb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!kn", name = "Sb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!kn", name = "Tb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!kn", name = "Ub", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!kn", name = "Vb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!kn", name = "Wb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!kn", name = "Zb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!kn", name = "ac", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!kn", name = "Xb", descriptor = "Lcg;")
    private class48 field3441;

    @OriginalMember(owner = "client!kn", name = "bc", descriptor = "Ljava/awt/Image;")
    public static Image field3445;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "(B)V", line = 4)
    public final void method1531(byte arg0) {
        if (arg0 <= -12) {
            this.field3129 = (this.field3430 + 7) / 8;
            field3436++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "(I)V", line = 17)
    public static void method1532(int arg0) {
        field3433 = null;
        if (arg0 >= -94) {
            field3427 = (String) null;
        }
        field3427 = null;
        field3445 = null;
        field3447 = null;
        field3442 = null;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(BI)I", line = 32)
    public final int method1533(byte arg0, int arg1) {
        int var3 = -9 % ((arg0 - 26) / 61);
        field3444++;
        return arg1 * 8 - this.field3430;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([BIBI)V", line = 42)
    public final void method1534(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 94) {
            for (int var5 = 0; var5 < arg1; var5++) {
                arg0[arg3 + var5] = (byte) (this.field3128[this.field3129++] - this.field3441.method335((byte) -120));
            }
            field3438++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V", line = 58)
    public class210(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(BI)I", line = 70)
    public final int method1535(byte arg0, int arg1) {
        field3443++;
        int var3 = this.field3430 >> 3;
        int var4 = 8 - (this.field3430 & 0x7);
        int var5 = 0;
        this.field3430 += arg1;
        if (arg0 <= 5) {
            this.method1538((int[]) null, true);
        }
        while (var4 < arg1) {
            var5 += (class219.field3517[var4] & this.field3128[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class219.field3517[var4] & this.field3128[var3]) + var5;
        } else {
            var6 = (this.field3128[var3] >> var4 - arg1 & class219.field3517[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "(I)V", line = 111)
    public final void method1536(int arg0) {
        this.field3430 = this.field3129 * 8;
        field3439++;
        if (arg0 >= -6) {
            field3446 = true;
        }
    }

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "(I)I", line = 124)
    public final int method1537(int arg0) {
        if (arg0 != 255) {
            field3446 = false;
        }
        field3437++;
        return this.field3128[this.field3129++] - this.field3441.method335((byte) -117) & 0xFF;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([IZ)V", line = 137)
    public final void method1538(int[] arg0, boolean arg1) {
        field3431++;
        this.field3441 = new class48(arg0);
        if (arg1) {
            method1532(86);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)Z", line = 159)
    public static final boolean method1539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3428++;
        long var8 = class155.method1079(arg3, arg5 + arg7, arg1 - -arg6);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = (int) var8 >> 20 & 0x3;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class149 var13 = class291.method2043(var12, 23006);
            if (var13.field2222 == -1) {
                int var14 = arg0;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int[] var15 = class216.field3480;
                int var16 = (52736 - (arg1 * 512)) * 4 + (arg7 * 4) + 24624;
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class245.method1741(arg6, arg5, arg1, var13, arg7, true, var11)) {
                return false;
            }
        }
        long var17 = class98.method694(arg3, arg5 + arg7, arg1 - -arg6);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class149 var22 = class291.method2043(var21, 23006);
            if (var22.field2222 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class216.field3480;
                    int var25 = arg7 * 4 + ((103 - arg1) * 4 * 512) + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 2 + 512] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 1536 + 3] = var23;
                    }
                }
            } else if (!class245.method1741(arg6, arg5, arg1, var22, arg7, true, var19)) {
                return false;
            }
        }
        if (arg4 > -96) {
            return false;
        }
        long var26 = class303.method2120(arg3, arg5 + arg7, arg1 + arg6);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class149 var30 = class291.method2043(var29, 23006);
            if (var30.field2222 != -1 && !class245.method1741(arg6, arg5, arg1, var30, arg7, true, var28)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "(I)V", line = 374)
    public static final void method1540(int arg0) {
        field3429++;
        class116.method808(false, 4);
        System.gc();
        class173.method1180(25, 65280);
        if (arg0 != -29908) {
            field3432 = 61;
        }
    }

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "(II)V", line = 398)
    public final void method1541(int arg0, int arg1) {
        int var3 = 44 / ((arg0 + 13) / 37);
        this.field3128[this.field3129++] = (byte) (arg1 + this.field3441.method335((byte) 84));
        field3435++;
    }
}
