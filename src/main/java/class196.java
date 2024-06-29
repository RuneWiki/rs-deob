import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class196 extends class460 {

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "Z")
    public static boolean field2308 = false;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2307 = -50;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field2303;
        if (arg0 != -24566) {
            field2308 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 < -110) {
            ++field2306;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 == 0) {
            ++field2302;
            super.field5744.method3140(1, false);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[I[I)V")
    public static final void method1149(int arg0, int[] arg1, int[] arg2) {
        ++field2311;
        if (arg2 != null && arg1 != null) {
            class613.field8336 = arg2;
            class514.field6535 = new int[arg2.length];
            class634.field8599 = new byte[arg2.length][][];
            for (int var3 = arg0; ~class613.field8336.length < ~var3; ++var3) {
                class634.field8599[var3] = new byte[arg1[var3]][];
            }
        } else {
            class613.field8336 = null;
            class634.field8599 = null;
            class514.field6535 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        ++field2309;
        if (arg0 < 100) {
            field2308 = false;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        int var4 = 9 / ((arg1 - 25) / 59);
        super.field5744.method3194((byte) 75, arg2);
        ++field2304;
        super.field5744.method3134(104, arg0);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Ljaa;)V")
    public class196(class576 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lji;I)Lie;")
    public static final class6 method1150(class572 arg0, int arg1) {
        ++field2312;
        int var2 = arg0.method3097((byte) 12);
        class580 var3 = class682.method3772((byte) -123)[arg0.method3097((byte) 12)];
        class241 var4 = class457.method2517(false)[arg0.method3097((byte) 12)];
        int var5 = arg0.method3086(65280);
        int var6 = arg0.method3086(65280);
        int var7 = arg0.method3031(-1);
        if (arg1 <= 34) {
            method1150((class572) null, -34);
        }
        int var8 = arg0.method3031(-1);
        int var9 = arg0.method3064(-2031091464);
        int var10 = arg0.method3064(-2031091464);
        int var11 = arg0.method3064(-2031091464);
        boolean var12 = arg0.method3097((byte) 12) == 1;
        return new class6(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        ++field2310;
        super.field5744.method3140(1, true);
        if (arg1 != -32460) {
            field2308 = true;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            if (class377.field4848 >= arg0 && ~arg5 <= ~class125.field1524) {
                boolean var6;
                if (class292.field3700 <= arg1) {
                    if (arg1 > class337.field4186) {
                        arg1 = class337.field4186;
                        var6 = false;
                    } else {
                        var6 = true;
                    }
                } else {
                    arg1 = class292.field3700;
                    var6 = false;
                }
                boolean var7;
                if (arg3 < class292.field3700) {
                    arg3 = class292.field3700;
                    var7 = false;
                } else if (~arg3 < ~class337.field4186) {
                    arg3 = class337.field4186;
                    var7 = false;
                } else {
                    var7 = true;
                }
                if (~arg0 <= ~class125.field1524) {
                    class390.method2223(arg1, arg2, class30.field364[arg0++], (byte) -103, arg3);
                } else {
                    arg0 = class125.field1524;
                }
                if (class377.field4848 >= arg5) {
                    class390.method2223(arg1, arg2, class30.field364[arg5--], (byte) -120, arg3);
                } else {
                    arg5 = class377.field4848;
                }
                if (var6 && var7) {
                    for (int var8 = arg0; ~var8 >= ~arg5; ++var8) {
                        int[] var9 = class30.field364[var8];
                        var9[arg1] = var9[arg3] = arg2;
                    }
                } else if (!var6) {
                    if (var7) {
                        for (int var10 = arg0; arg5 >= var10; ++var10) {
                            class30.field364[var10][arg3] = arg2;
                        }
                    }
                } else {
                    for (int var11 = arg0; arg5 >= var11; ++var11) {
                        class30.field364[var11][arg1] = arg2;
                    }
                }
            }
            ++field2305;
        }
    }
}
