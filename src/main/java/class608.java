import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class608 {

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "Z")
    private boolean field8658 = true;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    private int field8646 = -1;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "[Ltm;")
    private class334[] field8651;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    private int field8648;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    private int field8652;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    private int field8647;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "[Ltm;")
    private class334[] field8667;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "Ltm;")
    private class334 field8662;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "D")
    public static double field8649;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    private int field8645;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    private int field8661;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Lcw;")
    private class21 field8663;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "Lhaa;")
    public static class311 field8668;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Loq;")
    public static class742 field8657;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public final void method3551(int arg0) {
        if (this.field8651 != null) {
            for (int var2 = 0; var2 < this.field8651.length; var2++) {
                this.field8651[var2].method1938();
            }
        }
        if (arg0 == 0) {
            field8656++;
            this.field8663 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I")
    public static final int method3552(int arg0) {
        field8654++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class379.field5339.field8732 && !class379.field5339.field8720) {
            if (class613.field8710.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
            var1 = true;
        }
        if (class202.field2916) {
            var2 = false;
        }
        if (class620.field8828) {
            var1 = false;
        }
        if (class235.field3256) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class471.method2808(96);
        }
        int var4 = arg0;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class477.method2825(1000, 2, -50);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class477.method2825(1000, 3, arg0 ^ 0x31);
                if (class674.field9500.field5158.method1006(0) == 3) {
                    class702 var7 = class96.field1401.method568();
                    long var8 = var7.field9775 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field9777;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class477.method2825(1000, 1, -50);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class471.method2808(arg0 ^ 0x77);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var11 < var4) {
            return class184.method1229(5000, var4);
        } else if (var12 > var11) {
            return class574.method3419(3, 10, var12);
        } else {
            return class574.method3419(1, 10, var11);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lha;IZ)Z")
    public final boolean method3553(class545 arg0, int arg1, boolean arg2) {
        field8660++;
        if (this.field8646 != arg1) {
            this.field8646 = arg1;
            int var4 = class655.method3787((byte) 120, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8645 != var4) {
                this.field8663 = null;
                this.field8645 = var4;
            }
            if (this.field8651 != null) {
                this.field8661 = 0;
                int[] var5 = new int[this.field8651.length];
                for (int var6 = 0; var6 < this.field8651.length; var6++) {
                    class334 var7 = this.field8651[var6];
                    if (var7.method1935(this.field8653, this.field8652, this.field8647, this.field8646)) {
                        var5[this.field8661] = var7.field4272;
                        this.field8667[this.field8661++] = var7;
                    }
                }
                class469.method2791(this.field8661 - 1, 0, var5, 9116, this.field8667);
            }
            this.field8658 = true;
        }
        boolean var8 = arg2;
        if (this.field8658) {
            this.field8658 = false;
            for (int var9 = this.field8661 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8667[var9].method1932(arg0, this.field8662);
                this.field8658 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIIIIII)I")
    public static final int method3554(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -59 % ((-arg0 - 2) / 36);
        field8655++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        int var9 = arg6 & 0x3;
        if (var9 == 0) {
            return arg4;
        } else if (var9 == 1) {
            return arg2;
        } else if (var9 == 2) {
            return 1 + 7 - arg1 - arg4;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)V")
    public static final void method3555(int arg0, boolean arg1) {
        field8666++;
        class29.field372 = arg0;
        class313.field4031 = -1;
        class313.field4031 = -1;
        class577.method3446((byte) 82);
        if (arg1) {
            method3557(73);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)I")
    public static final int method3556(int arg0, int arg1) {
        field8650++;
        return arg1 <= 92 ? -118 : arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
    public static final void method3557(int arg0) {
        field8665++;
        if (class622.field8847 == null) {
            return;
        }
        if (arg0 != -8092) {
            field8649 = -0.32809305114007464D;
        }
        try {
            String var1 = class622.field8847.getParameter("cookiehost");
            int var2 = (int) (class224.method1457((byte) -62) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            class208.method1377("document.cookie=\"" + var3 + "\"", (byte) -32, class622.field8847);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lha;IIIIIIIII)V")
    public final void method3558(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg7 + arg1 & 0x3FFF;
        field8664++;
        if (this.field8648 == -1 || this.field8645 == 0) {
            arg0.method2194(arg5, arg6, arg4, arg8, arg3, 0);
        } else {
            class468 var12 = class674.field9505.method91(this.field8648, -22805);
            if (this.field8663 == null && class674.field9505.method86((byte) 117, this.field8648)) {
                int[] var13 = var12.field6393 == 2 ? class674.field9505.method89(0.7F, true, false, this.field8645, this.field8648, this.field8645) : class674.field9505.method87(false, this.field8645, 0.7F, this.field8645, true, this.field8648);
                this.field8663 = arg0.method3258(var13, 1, 0, this.field8645, this.field8645, this.field8645);
            }
            if (var12.field6393 == 2) {
                arg0.method2194(arg5, arg6, arg4, arg8, arg3, 0);
            }
            if (this.field8663 != null) {
                int var14 = var12.field6393 == 2 ? 1 : 0;
                int var15 = arg2 * arg8 / -4096;
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
                        this.field8663.method110(var17 + arg5, arg6 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        if (arg9 != 23206) {
            this.field8647 = -87;
        }
        for (int var19 = this.field8661 - 1; var19 >= 0; var19--) {
            this.field8667[var19].method1941(arg0, arg5, arg6, arg4, arg8, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
    public static void method3559(int arg0) {
        if (arg0 == 3) {
            field8668 = null;
            field8657 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I[Ltm;IIII)V")
    public class608(int arg0, class334[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8651 = arg1;
        this.field8648 = arg0;
        this.field8652 = arg4;
        this.field8647 = arg5;
        this.field8653 = arg3;
        if (arg1 == null) {
            this.field8662 = null;
            this.field8667 = null;
        } else {
            this.field8667 = new class334[arg1.length];
            this.field8662 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
