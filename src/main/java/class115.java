import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class115 extends class573 {

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    private int field2053 = 0;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    private int field2058 = 0;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field2063 = 2000;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    private int field2052 = 4096;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    private int field2064 = 16;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "[[Z")
    public static boolean[][] field2054;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public static void method1017(byte arg0) {
        if (arg0 <= 34) {
            field2054 = null;
        }
        field2054 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
    public static final void method1018(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class361.field5368 != -1) {
                class173.method1301(class361.field5368, 0);
            }
            for (class601 var2 = (class601) class78.field1572.method2597((byte) 89); var2 != null; var2 = (class601) class78.field1572.method2594((byte) -122)) {
                if (!var2.method2589(300)) {
                    var2 = (class601) class78.field1572.method2597((byte) -107);
                    if (var2 == null) {
                        break;
                    }
                }
                class101.method937((byte) -71, false, true, var2);
            }
            class361.field5368 = -1;
            class78.field1572 = new class427(8);
            class682.method3834((byte) -71);
            class361.field5368 = class46.field1129;
            class268.method1751(false, false);
            class293.method1954(0);
            class683.method3845(class361.field5368);
        }
        ++field2060;
        class284.field4229 = "";
        class362.field5384 = "";
        class75.field1520 = false;
        class507.method3010((byte) 91);
        class139.field2461 = -1;
        class605.method3474(class617.field8961, 23637);
        class532.field7456 = new class602();
        class532.field7456.field8787[0] = class675.field9604 / 2;
        class532.field7456.field9815 = class218.field3316 * 512 / 2;
        class532.field7456.field9806 = class675.field9604 * 512 / 2;
        class537.field7518 = 0;
        class206.field3158 = 0;
        class532.field7456.field8785[0] = class218.field3316 / 2;
        if (!arg0) {
            field2054 = null;
        }
        if (~class423.field6123 == -3) {
            class537.field7518 = class448.field6449 << 9;
            class206.field3158 = class318.field4686 << 9;
        } else {
            class110.method1000(25701);
        }
        class593.method3382(-1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field2059;
        int[] var3 = super.field8321.method3164(arg0, arg1 ^ -121);
        if (arg1 != 1) {
            this.method617(119);
        }
        if (super.field8321.field7825) {
            int var4 = this.field2052 >> 1;
            int[][] var5 = super.field8321.method3163(arg1 + -127);
            Random var6 = new Random((long) this.field2053);
            for (int var7 = 0; var7 < this.field2063; ++var7) {
                int var8 = ~this.field2052 >= -1 ? this.field2058 : this.field2058 - var4 - -class468.method2795(var6, this.field2052, (byte) -88);
                int var9 = 255 & var8 >> 4;
                int var10 = class468.method2795(var6, class540.field7555, (byte) -117);
                int var11 = class468.method2795(var6, class419.field6037, (byte) -101);
                int var12 = var10 - -(class335.field5011[var9] * this.field2064 >> 12);
                int var13 = var11 - -(class370.field5489[var9] * this.field2064 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class468.method2795(var6, 4096, (byte) -114) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = class591.field8492 & var28;
                        int var31 = class189.field3019 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1019(int arg0, int arg1, byte arg2) {
        int var3 = -89 / ((arg2 - 18) / 63);
        ++field2061;
        return class381.method2373(arg1, arg0, 3164) | ~(arg0 & 393216) != -1 || class292.method1950(arg1, 7492, arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field2058 = -7;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field2052 = arg0.method723((byte) -25);
                        }
                    } else {
                        this.field2058 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field2064 = arg0.method732(-559537960);
                }
            } else {
                this.field2063 = arg0.method723((byte) -25);
            }
        } else {
            this.field2053 = arg0.method732(-559537960);
        }
        ++field2062;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field2055;
        if (arg0 != 4095) {
            this.field2058 = 28;
        }
        class136.method1117((byte) 63);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Lom;ZB)Lik;")
    public static final class193 method1020(String arg0, class344 arg1, boolean arg2, byte arg3) {
        ++field2056;
        if (arg3 != 19) {
            field2054 = null;
        }
        int var4 = arg1.method2228(arg0, 5781);
        if (~var4 == 0) {
            return new class193(0);
        } else {
            int[] var5 = arg1.method2231(var4, arg3 ^ 16);
            class193 var6 = new class193(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field3034 > var7) {
                    class61 var9 = new class61(arg1.method2216(var4, var5[var8++], true));
                    int var10 = var9.method730(-89);
                    int var11 = var9.method723((byte) -25);
                    int var12 = var9.method732(-559537960);
                    if (!arg2 && ~var12 == -2) {
                        --var6.field3034;
                    } else {
                        var6.field3036[var7] = var10;
                        var6.field3035[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILtea;)V")
    public static final void method1021(int arg0, int arg1, int arg2, class219 arg3) {
        class370 var4 = class43.method570(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5494 = arg3;
            int var5 = class697.field9813 == class485.field6947 ? 1 : 0;
            if (arg3.method522((byte) -36)) {
                if (arg3.method524(35)) {
                    class368.field5462[var5][class43.field1090[var5]++] = arg3;
                    return;
                }
                class148.field2552[var5][class338.field5048[var5]++] = arg3;
                return;
            }
            class7.field513[var5][class575.field8353[var5]++] = arg3;
        }
    }
}
