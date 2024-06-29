import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class391 extends class458 {

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "Lug;")
    public class392 field5919 = new class392();

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Lci;")
    public class311 field5927 = new class311();

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "Lua;")
    private class470 field5924;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[SB)[S")
    public static final short[] method2412(int arg0, short[] arg1, byte arg2) {
        field5916++;
        short[] var3 = new short[arg0];
        class73.method593(arg1, 0, var3, 0, arg0);
        return arg2 == 99 ? var3 : null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)I")
    public static final int method2413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            method2414(true, null);
        }
        field5921++;
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg3 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg3 : arg4);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLqa;)V")
    public static final void method2414(boolean arg0, class162 arg1) {
        field5922++;
        if (arg0) {
            method2413(0, -42, 19, -123, -89);
        }
        if (class197.field2903) {
            class448.method2680(arg1, -2);
        } else {
            class42.method414(113, arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    public final void method2041(int arg0) {
        field5917++;
        this.field5927.method2041(arg0);
        for (class14 var2 = (class14) this.field5919.method2427(108); var2 != null; var2 = (class14) this.field5919.method2422(-125)) {
            if (!this.field5924.method2793(var2, true)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field233) {
                        this.method2415(false, var3, var2);
                        var2.field233 -= var3;
                        break;
                    }
                    this.method2415(false, var2.field233, var2);
                    var3 -= var2.field233;
                } while (!this.field5924.method2817(var3, 0, (byte) 126, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "()Lbl;")
    public final class458 method2044() {
        field5914++;
        class14 var1;
        do {
            var1 = (class14) this.field5919.method2422(-122);
            if (var1 == null) {
                return null;
            }
        } while (var1.field237 == null);
        return var1.field237;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZILqk;)V")
    private final void method2415(boolean arg0, int arg1, class14 arg2) {
        if ((this.field5924.field7054[arg2.field235] & 0x4) != 0 && arg2.field236 < 0) {
            int var4 = this.field5924.field7032[arg2.field235] / class256.field3725;
            int var5 = (var4 + 1048575 - arg2.field224) / var4;
            arg2.field224 = arg1 * var4 + arg2.field224 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field5924.field7015[arg2.field235] == 0) {
                    arg2.field237 = class493.method2952(arg2.field221, arg2.field237.method2944(), arg2.field237.method2950(), arg2.field237.method2943());
                } else {
                    arg2.field237 = class493.method2952(arg2.field221, arg2.field237.method2944(), 0, arg2.field237.method2943());
                    this.field5924.method2795(arg2, -67, ~arg2.field240.field2400[arg2.field216] > -1);
                }
                if (arg2.field240.field2400[arg2.field216] < 0) {
                    arg2.field237.method2948(-1);
                }
                arg1 = arg2.field224 / var4;
            }
        }
        if (!arg0) {
            field5918++;
            arg2.field237.method2041(arg1);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "([III)V")
    public final void method2037(int[] arg0, int arg1, int arg2) {
        field5926++;
        this.field5927.method2037(arg0, arg1, arg2);
        for (class14 var4 = (class14) this.field5919.method2427(118); var4 != null; var4 = (class14) this.field5919.method2422(-100)) {
            if (!this.field5924.method2793(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field233) {
                        this.method2416(var5 + var6, arg0, (byte) -12, var5, var4, var6);
                        var4.field233 -= var6;
                        break;
                    }
                    this.method2416(var5 + var6, arg0, (byte) -12, var5, var4, var4.field233);
                    var5 += var4.field233;
                    var6 -= var4.field233;
                } while (!this.field5924.method2817(var6, var5, (byte) 122, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "()I")
    public final int method2034() {
        field5923++;
        return 0;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[IBILqk;I)V")
    private final void method2416(int arg0, int[] arg1, byte arg2, int arg3, class14 arg4, int arg5) {
        field5925++;
        if ((this.field5924.field7054[arg4.field235] & 0x4) != 0 && arg4.field236 < 0) {
            int var7 = this.field5924.field7032[arg4.field235] / class256.field3725;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field224) / var7;
                if (arg5 < var8) {
                    arg4.field224 += arg5 * var7;
                    break;
                }
                arg4.field237.method2037(arg1, arg3, var8);
                arg4.field224 += var7 * var8 - 1048576;
                arg5 -= var8;
                arg3 += var8;
                int var9 = class256.field3725 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class493 var11 = arg4.field237;
                if (this.field5924.field7015[arg4.field235] == 0) {
                    arg4.field237 = class493.method2952(arg4.field221, var11.method2944(), var11.method2950(), var11.method2943());
                } else {
                    arg4.field237 = class493.method2952(arg4.field221, var11.method2944(), 0, var11.method2943());
                    this.field5924.method2795(arg4, arg2 ^ 0x2C, arg4.field240.field2400[arg4.field216] < 0);
                    arg4.field237.method2960(var9, var11.method2950());
                }
                if (arg4.field240.field2400[arg4.field216] < 0) {
                    arg4.field237.method2948(-1);
                }
                var11.method2969(var9);
                var11.method2037(arg1, arg3, arg0 - arg3);
                if (var11.method2961()) {
                    this.field5927.method2039(var11);
                }
            }
        }
        arg4.field237.method2037(arg1, arg3, arg5);
        if (arg2 != -12) {
            this.field5924 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "()Lbl;")
    public final class458 method2033() {
        field5920++;
        class14 var1 = (class14) this.field5919.method2427(122);
        if (var1 == null) {
            return null;
        } else if (var1.field237 == null) {
            return this.method2044();
        } else {
            return var1.field237;
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lua;)V")
    public class391(class470 arg0) {
        this.field5924 = arg0;
    }
}
