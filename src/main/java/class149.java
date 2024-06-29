import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class149 extends class84 {

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "Z")
    private boolean field2430 = true;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Z")
    private boolean field2428 = true;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field2426 = -1;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "Lnj;")
    public static class144 field2425 = new class144(16);

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "Lhl;")
    public static class40 field2433 = new class40(128);

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "J")
    public static long field2435 = 0L;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "Lhl;")
    public static class40 field2434 = new class40(64);

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field2422;
        if (arg1 != -18) {
            field2435 = 100L;
        }
        int[][] var3 = super.field1211.method193((byte) -13, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -41, this.field2430 ? -arg0 + class58.field822 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (!this.field2428) {
                for (int var11 = 0; ~var11 > ~class20.field221; ++var11) {
                    var7[var11] = var5[var11];
                    var10[var11] = var6[var11];
                    var9[var11] = var8[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class20.field221; ++var12) {
                    var7[var12] = var5[-var12 + class36.field497];
                    var10[var12] = var6[-var12 + class36.field497];
                    var9[var12] = var8[-var12 + class36.field497];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1056(String[] arg0, byte arg1) {
        ++field2421;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 > -112) {
            method1056((String[]) null, (byte) -95);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)J")
    public static final long method1057(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        return var3 != null && var3.field4532 != null ? var3.field4532.field2565 : 0L;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lbe;III)V")
    public static final void method1058(class29 arg0, int arg1, int arg2, int arg3) {
        ++field2423;
        if (~arg0.field1932 == ~arg3 && arg3 != -1) {
            class141 var4 = class285.method1939(arg3, 112);
            int var5 = var4.field2273;
            if (~var5 == -2) {
                arg0.field1969 = 0;
                arg0.field1941 = arg2;
                arg0.field1937 = 1;
                arg0.field1970 = 0;
                arg0.field1921 = 0;
                class263.method1845(arg0.field1921, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -62, var4);
            }
            if (~var5 == -3) {
                arg0.field1969 = 0;
            }
        } else if (arg3 == -1 || ~arg0.field1932 == 0 || class285.method1939(arg3, 112).field2278 >= class285.method1939(arg0.field1932, 112).field2278) {
            arg0.field1932 = arg3;
            arg0.field1941 = arg2;
            arg0.field1921 = 0;
            arg0.field1920 = arg0.field1933;
            arg0.field1970 = 0;
            arg0.field1969 = 0;
            arg0.field1937 = 1;
            if (arg0.field1932 != -1) {
                class263.method1845(arg0.field1921, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -41, class285.method1939(arg0.field1932, 112));
            }
        }
        if (arg1 <= 85) {
            method1059(-82, -1, -40, 42, -42);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class149() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2429;
        if (~class272.field4374 >= ~arg2 && class211.field3386 >= arg2) {
            int var5 = class281.method1924(false, class228.field3657, class207.field3328, arg3);
            int var6 = class281.method1924(false, class228.field3657, class207.field3328, arg4);
            class52.method396(arg0, arg1, var5, var6, arg2);
        }
        if (arg1 != -1) {
            field2433 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1217 = arg0.method1111(255) == 1;
                }
            } else {
                this.field2430 = arg0.method1111(255) == 1;
            }
        } else {
            this.field2428 = ~arg0.method1111(255) == -2;
        }
        if (arg1 < 87) {
            field2435 = -114L;
        }
        ++field2431;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILlc;)Z")
    public static final boolean method1060(int arg0, int arg1, class86 arg2) {
        ++field2427;
        byte[] var3 = arg2.method645(100, arg0);
        if (var3 == null) {
            return false;
        } else {
            int var4 = -4 % ((arg1 - -7) / 62);
            class121.method887(var3, -24725);
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2433 = null;
        field2434 = null;
        field2425 = null;
        int var1 = 85 / ((62 - arg0) / 47);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 > -125) {
            method1060(34, 46, (class86) null);
        }
        ++field2424;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, !this.field2430 ? arg1 : class58.field822 - arg1, false);
            if (!this.field2428) {
                class158.method1181(var4, 0, var3, 0, class20.field221);
            } else {
                for (int var5 = 0; class20.field221 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class36.field497];
                }
            }
        }
        return var3;
    }
}
