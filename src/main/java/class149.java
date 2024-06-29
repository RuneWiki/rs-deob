import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class149 extends class98 {

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    private int field1822 = 0;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    private int field1825 = 0;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    private int field1826 = 1;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "Liq;")
    public static class362 field1830 = new class362("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!up", name = "U", descriptor = "J")
    public static long field1831 = -1L;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1825 = 101;
        }
        ++field1828;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class268.field3811 > var6; ++var6) {
                int var7 = class189.field2722[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field1822 == 0) {
                    var9 = (-var4 + var7) * this.field1826;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1826 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field1825 != 0) {
                    if (this.field1825 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class299.field4191[(4089 & var12) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(II)I")
    public static final int method899(int arg0, int arg1) {
        if (arg0 != -8648) {
            return 62;
        } else {
            ++field1823;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class149() {
        super(0, true);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBLrd;ZLjava/lang/String;)V")
    public static final void method900(boolean arg0, byte arg1, class185 arg2, boolean arg3, String arg4) {
        ++field1824;
        if (arg3) {
            if (class185.field2678.startsWith("win") && class185.field2686 != 3) {
                String var5 = null;
                if (arg2.field2685 != null) {
                    var5 = arg2.field2685.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class315 var6 = class12.method90(8, arg4, arg2, 0);
                    class276.field3919 = arg4;
                    class403.field5788 = var6;
                    class376.field5287 = arg2;
                    return;
                }
            }
            if (class185.field2678.startsWith("mac")) {
                String var7 = null;
                if (arg2.field2685 != null) {
                    var7 = arg2.field2685.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg0) {
                    class12.method90(8, arg4, arg2, 1);
                    return;
                }
            }
            class12.method90(8, arg4, arg2, 2);
        } else {
            class12.method90(8, arg4, arg2, 3);
        }
        if (arg1 < 25) {
            method899(33, -95);
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public final void method188(int arg0) {
        ++field1829;
        if (arg0 == 1) {
            class55.method315((byte) 42);
        }
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public static void method901(int arg0) {
        if (arg0 < 99) {
            method899(-34, 107);
        }
        field1830 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 == 0) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -4) {
                        this.field1826 = arg1.method1574(arg2 + -108);
                    }
                } else {
                    this.field1825 = arg1.method1574(-113);
                }
            } else {
                this.field1822 = arg1.method1574(-9);
            }
            ++field1827;
        }
    }
}
