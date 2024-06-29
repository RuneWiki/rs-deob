import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class210 extends class130 {

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[B")
    public byte[] field3782;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
    public static int[] field3785 = new int[50];

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Lqj;")
    public static class196 field3790 = class80.method502(" weitere Optionen", -48);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lbk;")
    public static class136 field3784;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[S")
    public static short[] field3781;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIIIII)V")
    public static final void method1453(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class61 var6 = class249.field4410[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class129 var7 = var6.field833;
        if (var7 != null) {
            int var8 = var7.field1829;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class140 var10 = var6.field827;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2143;
        int var12 = var10.field2144;
        int var13 = var10.field2147;
        int var14 = var10.field2158;
        int[] var15 = class83.field1205[var11];
        int[] var16 = class91.field1338[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class210(byte[] arg0) {
        this.field3782 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public static final void method1454(int arg0, int arg1) {
        if (arg1 < 122) {
            method1456(-71);
        }
        field3789++;
        class249 var2 = (class249) class110.field1562.method1551(32768, (long) arg0);
        if (var2 != null) {
            var2.method797((byte) 123);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3781 = null;
        field3784 = null;
        field3785 = null;
        field3790 = null;
        if (arg0 != 128) {
            method1453(null, 24, 39, 90, 25, 2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static final void method1456(int arg0) {
        if (arg0 != 0) {
            method1454(49, 63);
        }
        class238.field4223.method1529(382);
        field3786++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLdj;)V")
    public static final void method1457(boolean arg0, class137 arg1) {
        field3783++;
        arg1.field2063 = arg1.field2091;
        if (arg1.field2071 == 0) {
            arg1.field2076 = 0;
            return;
        }
        if (arg1.field2086 != -1 && arg1.field2084 == 0) {
            class149 var2 = class116.method704(arg1.field2086, -10304);
            if (arg1.field2104 > 0 && var2.field2363 == 0) {
                arg1.field2076++;
                return;
            }
            if (arg1.field2104 <= 0 && var2.field2381 == 0) {
                arg1.field2076++;
                return;
            }
        }
        int var3 = arg1.field2081;
        int var4 = arg1.field2102[arg1.field2071 - 1] * 128 + arg1.field2049 * 64;
        int var5 = arg1.field2085;
        int var6 = arg1.field2046[arg1.field2071 - 1] * 128 + arg1.field2049 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field2085 = var6;
            arg1.field2081 = var4;
            return;
        }
        if (var4 <= var3) {
            if (var3 <= var4) {
                if (var5 < var6) {
                    arg1.field2077 = 1024;
                } else if (var6 < var5) {
                    arg1.field2077 = 0;
                }
            } else if (var5 < var6) {
                arg1.field2077 = 768;
            } else if (var5 > var6) {
                arg1.field2077 = 256;
            } else {
                arg1.field2077 = 512;
            }
        } else if (var6 > var5) {
            arg1.field2077 = 1280;
        } else if (var6 < var5) {
            arg1.field2077 = 1792;
        } else {
            arg1.field2077 = 1536;
        }
        int var7 = arg1.field2077 - arg1.field2096 & 0x7FF;
        if (arg0) {
            return;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field2097;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field2082;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field2052;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field2074;
        }
        if (var8 == -1) {
            var8 = arg1.field2082;
        }
        boolean var10 = true;
        arg1.field2063 = var8;
        if (arg1 instanceof class164) {
            var10 = ((class164) arg1).field2648.field1595;
        }
        if (var10) {
            if (arg1.field2096 != arg1.field2077 && arg1.field2075 == -1 && arg1.field2062 != 0) {
                var9 = 2;
            }
            if (arg1.field2071 > 2) {
                var9 = 6;
            }
            if (arg1.field2071 > 3) {
                var9 = 8;
            }
            if (arg1.field2076 > 0 && arg1.field2071 > 1) {
                var9 = 8;
                arg1.field2076--;
            }
        } else {
            if (arg1.field2071 > 1) {
                var9 = 6;
            }
            if (arg1.field2071 > 2) {
                var9 = 8;
            }
            if (arg1.field2076 > 0 && arg1.field2071 > 1) {
                var9 = 8;
                arg1.field2076--;
            }
        }
        if (arg1.field2073[arg1.field2071 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var5) {
            arg1.field2085 += var9;
            if (var6 < arg1.field2085) {
                arg1.field2085 = var6;
            }
        } else if (var5 > var6) {
            arg1.field2085 -= var9;
            if (arg1.field2085 < var6) {
                arg1.field2085 = var6;
            }
        }
        if (var9 >= 8 && arg1.field2082 == arg1.field2063 && arg1.field2065 != -1) {
            arg1.field2063 = arg1.field2065;
        }
        if (var3 < var4) {
            arg1.field2081 += var9;
            if (var4 < arg1.field2081) {
                arg1.field2081 = var4;
            }
        } else if (var3 > var4) {
            arg1.field2081 -= var9;
            if (arg1.field2081 < var4) {
                arg1.field2081 = var4;
            }
        }
        if (arg1.field2081 != var4 || arg1.field2085 != var6) {
            return;
        }
        arg1.field2071--;
        if (arg1.field2104 > 0) {
            arg1.field2104--;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)Lta;")
    public static final class161 method1458(int arg0, int arg1) {
        class161 var2 = (class161) class44.field514.method1537((long) arg1, false);
        field3787++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field4044.method842(16, (byte) 35, arg1);
        class161 var4 = new class161();
        if (arg0 <= 48) {
            method1458(42, -72);
        }
        if (var3 != null) {
            var4.method1012(new class56(var3), 64);
        }
        class44.field514.method1532(true, (long) arg1, var4);
        return var4;
    }
}
