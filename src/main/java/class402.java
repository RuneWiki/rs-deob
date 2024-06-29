import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class402 extends class263 {

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    private int field6077 = 10;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field6073 = 0;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    private int field6082 = 2048;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "[I")
    public static int[] field6076 = new int[1000];

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "[I")
    public static int[] field6069 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Laa;")
    public static class76 field6081 = new class76(15, 3);

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
    private int[] field6070;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
    private int[] field6072;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field6080;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int var4 = class170.field2509[arg0];
            if (this.field6073 != 0) {
                for (int var5 = 0; ~var5 > ~class367.field5597; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class379.field5711[var5];
                    int var9 = this.field6073;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = 2048 - -(var4 + var8 + -4096 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field6077 < ~var10; ++var10) {
                        if (~this.field6072[var10] >= ~var6 && ~var6 > ~this.field6072[var10 + 1]) {
                            if (var6 < this.field6070[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field6077 > var12; ++var12) {
                    if (var4 >= this.field6072[var12] && this.field6072[var12 + 1] > var4) {
                        if (var4 < this.field6070[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class442.method2591(var3, 0, class367.field5597, var11);
            }
        }
        if (arg1 < 40) {
            method2429((byte) -31, -73, 97, 19, -107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        ++field6079;
        this.method2430((byte) 107);
        if (arg0 != 110) {
            method2427(13);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public static void method2427(int arg0) {
        field6069 = null;
        field6081 = null;
        if (arg0 != 4096) {
            method2427(111);
        }
        field6076 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CI)Z")
    public static final boolean method2428(char arg0, int arg1) {
        if (arg1 != 1) {
            field6069 = null;
        }
        ++field6075;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (~arg0 != -1) {
                char[] var2 = class269.field4005;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6073 = arg2.method2765(52);
                }
            } else {
                this.field6082 = arg2.method2727((byte) 43);
            }
        } else {
            this.field6077 = arg2.method2765(119);
        }
        if (!arg1) {
            this.field6077 = 90;
        }
        ++field6074;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIIII)V")
    public static final void method2429(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6071;
        int var5 = 0;
        if (arg0 != -127) {
            field6081 = null;
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class375.method2223(false, arg2 - -arg4, class102.field1544, class297.field4427);
        int var10 = class375.method2223(false, -arg4 + arg2, class102.field1544, class297.field4427);
        class94.method740(class306.field4574[arg1], var10, var9, arg3, false);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg1;
                int var12 = arg1 - -var6;
                if (~class305.field4555 >= ~var12 && class286.field4290 >= var11) {
                    int var13 = class375.method2223(false, arg2 + var5, class102.field1544, class297.field4427);
                    int var14 = class375.method2223(false, -var5 + arg2, class102.field1544, class297.field4427);
                    if (~class286.field4290 <= ~var12) {
                        class94.method740(class306.field4574[var12], var14, var13, arg3, false);
                    }
                    if (~class305.field4555 >= ~var11) {
                        class94.method740(class306.field4574[var11], var14, var13, arg3, false);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg1;
            int var16 = arg1 + var5;
            if (~var16 <= ~class305.field4555 && var15 <= class286.field4290) {
                int var17 = class375.method2223(false, arg2 + var6, class102.field1544, class297.field4427);
                int var18 = class375.method2223(false, -var6 + arg2, class102.field1544, class297.field4427);
                if (~var16 >= ~class286.field4290) {
                    class94.method740(class306.field4574[var16], var18, var17, arg3, false);
                }
                if (var15 >= class305.field4555) {
                    class94.method740(class306.field4574[var15], var18, var17, arg3, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class402() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    private final void method2430(byte arg0) {
        ++field6083;
        this.field6070 = new int[this.field6077 + 1];
        this.field6072 = new int[this.field6077 - -1];
        if (arg0 != 107) {
            this.field6082 = 71;
        }
        int var2 = 0;
        int var3 = 4096 / this.field6077;
        int var4 = this.field6082 * var3 >> 12;
        for (int var5 = 0; this.field6077 > var5; ++var5) {
            this.field6072[var5] = var2;
            this.field6070[var5] = var2 + var4;
            var2 += var3;
        }
        this.field6072[this.field6077] = 4096;
        this.field6070[this.field6077] = this.field6070[0] + 4096;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static final void method2431(int arg0) {
        ++field6078;
        if (arg0 != 18740) {
            method2431(127);
        }
        class432.field6402.method2293(false);
    }
}
