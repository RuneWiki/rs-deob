import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class401 extends class337 {

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    private int field5965 = 585;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field5961 = 0;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "D")
    public static double field5959 = -1.0D;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "Luq;")
    public static class114 field5962;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "Llm;")
    public static class348 field5963;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIII)V", line = 6)
    public static final void method2511(byte arg0, int arg1, int arg2, int arg3) {
        ++field5966;
        class211 var4 = class452.method2749(11, 127, arg3);
        var4.method1463(arg0 ^ -63);
        var4.field3441 = arg1;
        if (arg0 == -63) {
            var4.field3440 = arg2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V", line = 21)
    public static final void method2512(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 != -1013) {
            if (~arg1 != -1003) {
                if (arg1 != 1008) {
                    if (arg1 == 1011) {
                        class192.method1345(class375.field5617, arg2, arg0);
                    } else if (arg1 == 1009) {
                        class192.method1345(class157.field2377, arg2, arg0);
                    }
                } else {
                    class192.method1345(class484.field6962, arg2, arg0);
                }
            } else {
                class192.method1345(class102.field1474, arg2, arg0);
            }
        } else {
            class192.method1345(class195.field3268, arg2, arg0);
        }
        if (arg3 != 1011) {
            method2513(true, -105, 29);
        }
        ++field5960;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 50)
    public static final String method2513(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field5967;
            return arg0 && arg2 >= 0 ? class173.method1166(10, arg0, -127, arg2) : Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILhp;)V", line = 66)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field5964;
        int var4 = -10 % ((arg0 - 82) / 40);
        if (arg1 == 0) {
            this.field5965 = arg2.method1511(-66);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[I", line = 93)
    public final int[] method179(int arg0, byte arg1) {
        ++field5958;
        int[] var3 = super.field5007.method512(arg0, arg1 ^ -11);
        if (arg1 != -11) {
            return null;
        } else {
            if (super.field5007.field687) {
                int var4 = class505.field7381[arg0];
                for (int var5 = 0; ~class402.field5977 < ~var5; ++var5) {
                    int var6 = class109.field1530[var5];
                    if (this.field5965 < var6 && ~var6 > ~(4096 - this.field5965) && var4 > -this.field5965 + 2048 && 2048 - -this.field5965 > var4) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field5965 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (-this.field5965 + 2048 < var6 && var6 < this.field5965 + 2048) {
                        int var11 = var4 + -2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field5965;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field5965 + 2048);
                    } else if (~this.field5965 >= ~var4 && ~var4 >= ~(-this.field5965 + 4096)) {
                        if (~var6 <= ~this.field5965 && var6 <= -this.field5965 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field5965 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field5965;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field5965 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 173)
    public class401() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 183)
    public static void method2514(byte arg0) {
        field5962 = null;
        field5963 = null;
        if (arg0 != 82) {
            field5963 = null;
        }
    }
}
