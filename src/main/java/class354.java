import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class354 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
    private boolean field4557 = true;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    private int field4562 = -1;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "[Ltt;")
    private class61[] field4565;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    private int field4555;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Ltt;")
    private class61 field4563;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[Ltt;")
    private class61[] field4567;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
    public static boolean field4556 = false;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Ldq;")
    public static class493 field4552 = new class493(61, -2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    private int field4564;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    private int field4566;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Ll;")
    private class16 field4546;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lqn;")
    public static class47 field4558;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZZ)Ljava/lang/String;", line = 18)
    public static final String method2030(int arg0, int arg1, boolean arg2, boolean arg3) {
        field4548++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg1;
            if (arg3) {
                field4558 = null;
            }
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lya;IIIIIIIII)V", line = 69)
    public final void method2031(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4547++;
        int var11 = arg5 + arg8 & 0x3FFF;
        if (this.field4551 == -1) {
            arg0.method308(arg4, arg6, arg7, arg2, arg9, 0);
        } else {
            class139 var12 = class227.field2915.method1642(this.field4551, 127);
            if (this.field4546 == null && class227.field2915.method1638(124, this.field4551)) {
                int[] var13 = var12.field1783 ? class227.field2915.method1641(false, arg3 ^ 0xA52, this.field4566, 0.7F, this.field4566, this.field4551) : class227.field2915.method1640(this.field4566, 0.7F, this.field4566, (byte) -24, false, this.field4551);
                this.field4546 = arg0.method299(var13, 0, this.field4566, this.field4566, this.field4566);
            }
            if (!var12.field1783) {
                arg0.method308(arg4, arg6, arg7, arg2, arg9, 0);
            }
            if (this.field4546 != null) {
                int var14 = var12.field1783 ? 0 : 1;
                int var15 = arg1 * arg2 / -4096;
                int var16;
                for (var16 = (arg7 - arg2) / 2 + (arg2 * var11 / 4096); var16 > arg2; var16 -= arg2) {
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg7; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field4546.method135(arg4 + var17, arg6 + var18, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field4564 - 1;
        if (arg3 == 16334) {
            while (var19 >= 0) {
                this.field4567[var19].method560(arg0, arg4, arg6, arg7, arg2, arg1, var11);
                var19--;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 150)
    public static void method2032(int arg0) {
        if (arg0 != 48) {
            method2030(45, 60, false, true);
        }
        field4552 = null;
        field4558 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILya;)V", line = 161)
    public static final void method2033(int arg0, class38 arg1) {
        field4544++;
        if (class163.field2075) {
            class152.method995((byte) 32, arg1);
        } else {
            class361.method2073(-29, arg1);
        }
        if (arg0 != -1) {
            method2033(25, null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 176)
    public final void method2034(byte arg0) {
        if (this.field4565 != null) {
            for (int var2 = 0; var2 < this.field4565.length; var2++) {
                this.field4565[var2].method568();
            }
        }
        field4560++;
        if (arg0 <= 75) {
            method2030(121, 31, true, true);
        }
        this.field4546 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[Ltt;IIII)V", line = 216)
    public class354(int arg0, class61[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4565 = arg1;
        this.field4551 = arg0;
        this.field4549 = arg4;
        this.field4550 = arg5;
        this.field4555 = arg3;
        if (arg1 == null) {
            this.field4563 = null;
            this.field4567 = null;
        } else {
            this.field4567 = new class61[arg1.length];
            this.field4563 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lya;IZ)Z", line = 242)
    public final boolean method2035(class38 arg0, int arg1, boolean arg2) {
        field4561++;
        if (this.field4562 != arg1) {
            this.field4562 = arg1;
            int var4 = class60.method550(109, arg1);
            if (arg1 < var4) {
                var4 = class231.method1404(arg1, 1);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4566 != var4) {
                this.field4546 = null;
                this.field4566 = var4;
            }
            if (this.field4565 != null) {
                this.field4564 = 0;
                int[] var5 = new int[this.field4565.length];
                for (int var6 = 0; var6 < this.field4565.length; var6++) {
                    class61 var7 = this.field4565[var6];
                    if (var7.method562(this.field4555, this.field4549, this.field4550, this.field4562)) {
                        var5[this.field4564] = var7.field804;
                        this.field4567[this.field4564++] = var7;
                    }
                }
                class441.method2590(this.field4567, this.field4564 - 1, var5, -106, 0);
            }
            this.field4557 = true;
        }
        if (!arg2) {
            return true;
        }
        boolean var8 = false;
        if (this.field4557) {
            this.field4557 = false;
            for (int var9 = this.field4564 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4567[var9].method561(arg0, this.field4563);
                var8 |= var10;
                this.field4557 |= !var10;
            }
        }
        return var8;
    }
}
