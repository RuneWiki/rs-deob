import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class148 {

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field300 = -1;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Llt;")
    public static class475 field298 = new class475(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Lng;")
    public static class226 field302 = new class226(4);

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "Lri;")
    public static class73 field303 = new class73(34, 6);

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "[I")
    public static int[] field304;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field301;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            class520.method3074(var3, 0, class320.field4579, class456.field6752[arg1]);
        }
        if (arg0 >= -65) {
            field303 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public static final void method169(int arg0) {
        ++field299;
        int[] var1 = new int[class294.field4196.field1171];
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class294.field4196.field1171; ++var3) {
            class339 var5 = class294.field4196.method453(0, var3);
            if (~var5.field4820 <= -1 || var5.field4776 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 < 81) {
            field303 = null;
        }
        class57.field875 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class57.field875[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
    public static final void method170(int arg0, int arg1, byte arg2) {
        if (~class378.field5763 == -2) {
            class37.method214(class196.field2864, arg1, false, arg0);
        } else if (class378.field5763 == 2) {
            class451.method2722(arg0, arg1, -7197);
        }
        ++field296;
        class378.field5763 = 0;
        if (arg2 <= 13) {
            field303 = null;
        }
        class196.field2864 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method171(boolean arg0) {
        field302 = null;
        if (arg0) {
            field300 = -98;
        }
        field298 = null;
        field303 = null;
        field304 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lse;[I[II[I)V")
    public static final void method172(class167 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 <= 51) {
            method169(97);
        }
        for (int var5 = 0; arg2.length > var5; ++var5) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; ~var7 != -1 && ~var9 > ~arg0.field1968.length; ++var9) {
                if ((1 & var7) != 0) {
                    if (~var6 != 0) {
                        class329 var10 = class84.field1295.method1182(var6, 8);
                        int var11 = var10.field4668;
                        class315 var12 = arg0.field1968[var9];
                        if (var12 != null) {
                            if (~var12.field4488 == ~var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1968[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4500 = 0;
                                    var12.field4498 = 0;
                                    var12.field4495 = var8;
                                    var12.field4492 = 1;
                                    var12.field4494 = 0;
                                    class480.method2856(arg0.field1769, arg0.field1763, (byte) 58, arg0.field1768, false, var10, 0);
                                } else if (~var11 == -3) {
                                    var12.field4494 = 0;
                                }
                            } else if (var10.field4680 >= class84.field1295.method1182(var12.field4488, 8).field4680) {
                                var12 = arg0.field1968[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class315 var13 = arg0.field1968[var9] = new class315();
                            var13.field4498 = 0;
                            var13.field4488 = var6;
                            var13.field4494 = 0;
                            var13.field4495 = var8;
                            var13.field4492 = 1;
                            var13.field4500 = 0;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 58, arg0.field1768, false, var10, 0);
                        }
                    } else {
                        arg0.field1968[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field297;
    }
}
