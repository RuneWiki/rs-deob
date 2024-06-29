import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class158 extends class74 {

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    private int field2431 = 4096;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field2434 = 0;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "Luf;")
    public static class176 field2427;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "Lqd;")
    public static class3 field2433;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1245 = ~arg1.method333((byte) -59) == -2;
                }
            } else {
                this.field2431 = arg1.method293(98);
            }
        } else {
            this.field2425 = arg1.method293(92);
        }
        if (arg0 != -79) {
            field2434 = -51;
        }
        ++field2430;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)J")
    public static final long method1069(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        return var3 != null && var3.field356 != null ? var3.field356.field3820 : 0L;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
    public static void method1070(int arg0) {
        if (arg0 != 1) {
            method1072(6, (byte) 6, -108, (class176) null);
        }
        field2433 = null;
        field2427 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/lang/String;I[SIZ)V")
    public static final void method1071(String[] arg0, int arg1, short[] arg2, int arg3, boolean arg4) {
        if (~arg3 > ~arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg3; arg1 > var9; ++var9) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (1 & var9)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method1071(arg0, var6 + -1, arg2, arg3, false);
            method1071(arg0, arg1, arg2, var6 - -1, false);
        }
        ++field2432;
        if (arg4) {
            method1071((String[]) null, 125, (short[]) null, 92, false);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBILuf;)[Ldi;")
    public static final class179[] method1072(int arg0, byte arg1, int arg2, class176 arg3) {
        if (arg1 <= 37) {
            return null;
        } else {
            ++field2424;
            return !class261.method1750(arg3, arg0, arg2, (byte) 26) ? null : class144.method995(3);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        int[][] var3 = super.field1248.method269(false, arg0);
        ++field2429;
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class178.field2662 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (this.field2425 > var13) {
                    var7[var11] = this.field2425;
                } else if (this.field2431 < var13) {
                    var7[var11] = this.field2431;
                } else {
                    var7[var11] = var13;
                }
                if (this.field2425 > var12) {
                    var10[var11] = this.field2425;
                } else if (~this.field2431 <= ~var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field2431;
                }
                if (var14 >= this.field2425) {
                    if (~var14 >= ~this.field2431) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field2431;
                    }
                } else {
                    var9[var11] = this.field2425;
                }
            }
        }
        return arg1 >= -112 ? null : var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            return null;
        } else {
            ++field2435;
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                int[] var4 = this.method590(0, 0, arg1);
                for (int var5 = 0; ~class178.field2662 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 <= ~this.field2425) {
                        if (~this.field2431 <= ~var6) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field2431;
                        }
                    } else {
                        var3[var5] = this.field2425;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)Lnb;")
    public static final class212 method1073(byte arg0) {
        ++field2428;
        try {
            return arg0 != 48 ? null : (class212) Class.forName("jj").newInstance();
        } catch (Throwable var1) {
            return new class225();
        }
    }
}
