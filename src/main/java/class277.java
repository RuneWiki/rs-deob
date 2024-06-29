import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class277 extends class223 {

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    private int field4402 = 4096;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    private int field4403 = 4096;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    private int field4400 = 4096;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "[I")
    private int[] field4406 = new int[3];

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    private int field4407 = 409;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "[C")
    public static char[] field4399 = new char[128];

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1890(byte arg0, String arg1) {
        ++field4404;
        if (arg0 >= 99) {
            if (class53.field835 >= 2) {
                if (arg1.equalsIgnoreCase("::gc")) {
                    class28.method226((byte) -81);
                    for (int var2 = 0; var2 < 10; ++var2) {
                        System.gc();
                    }
                    Runtime var3 = Runtime.getRuntime();
                    int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                    class247.method1671(0, "mem=" + var4 + "k", -1, (String) null);
                }
                if (arg1.equalsIgnoreCase("::mm")) {
                    class28.method226((byte) -117);
                    for (int var5 = 0; var5 < 10; ++var5) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                    class247.method1671(0, "Memory before cleanup=" + var7 + "k", -1, (String) null);
                    class307.method2057((byte) 29);
                    class28.method226((byte) 37);
                    for (int var8 = 0; ~var8 > -11; ++var8) {
                        System.gc();
                    }
                    int var9 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                    class247.method1671(0, "Memory after cleanup=" + var9 + "k", -1, (String) null);
                }
                if (arg1.equalsIgnoreCase("::pcachesize")) {
                    class247.method1671(0, "Number of player models in cache:" + class272.method1864((byte) 112), -1, (String) null);
                }
                if (arg1.equalsIgnoreCase("::clientdrop")) {
                    class28.method235(0);
                }
                if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                    class210.field3249.method832((byte) 9);
                }
                if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                    class210.field3249.method828((byte) -94);
                }
                if (arg1.equalsIgnoreCase("::breakcon")) {
                    class123.field1863.method19((byte) -73);
                    class301.field4848.method1308(770);
                    class210.field3249.method824((byte) 38);
                }
                if (arg1.equalsIgnoreCase("::replacecanvas")) {
                    class128.field1917 = true;
                }
                if (arg1.equalsIgnoreCase("::rebuild")) {
                    class248.method1679(25, 2);
                }
                if (arg1.equalsIgnoreCase("::fpson")) {
                    class86.field1276 = true;
                }
                if (arg1.equalsIgnoreCase("::fpsoff")) {
                    class86.field1276 = false;
                }
                if (arg1.startsWith("::setba")) {
                    class84.field1259 = class297.method1995(arg1.substring(8), -122);
                    class67.method543(class123.field1863, (byte) -82);
                    class24.field426 = false;
                }
                if (arg1.startsWith("::setparticles")) {
                    class249.method1684(class297.method1995(arg1.substring(15), -97));
                    class67.method543(class123.field1863, (byte) -28);
                    class24.field426 = false;
                }
                if (arg1.startsWith("::fps ") && ~class110.field1709 != -1) {
                    class232.method1599(class297.method1995(arg1.substring(6), -103), -128);
                }
                if (arg1.equalsIgnoreCase("::errortest")) {
                    throw new RuntimeException();
                }
                if (arg1.startsWith("::rect_debug")) {
                    class5.field79 = class297.method1995(arg1.substring(12).trim(), -120);
                    class247.method1671(0, "rect_debug=" + class5.field79, -1, (String) null);
                }
                if (arg1.equalsIgnoreCase("::qa_op_test")) {
                    class136.field2057 = true;
                }
                arg1.startsWith("::hdr");
                if (arg1.equalsIgnoreCase("::tween")) {
                    if (!class305.field4896) {
                        class305.field4896 = true;
                        class247.method1671(0, "Forced tweening ENABLED!", -1, (String) null);
                    } else {
                        class305.field4896 = false;
                        class247.method1671(0, "Forced tweening disabled.", -1, (String) null);
                    }
                }
                if (arg1.equalsIgnoreCase("::shiftclick")) {
                    if (!class101.field1582) {
                        System.out.println("Shift-click ENABLED!");
                        class101.field1582 = true;
                    } else {
                        System.out.println("Shift-click disabled.");
                        class101.field1582 = false;
                    }
                }
                if (arg1.equalsIgnoreCase("::getcgcoord")) {
                    class247.method1671(0, "x:" + (class263.field4168.field4725 >> 7) + " z:" + (class263.field4168.field4709 >> 7) + " groundh:" + class233.field3684[class130.field1941][class263.field4168.field4725 >> 7][class263.field4168.field4709 >> 7], -1, (String) null);
                }
            }
            ++class183.field2894;
            class240.field3826.method1762(242, true);
            class240.field3826.method305(-1 + arg1.length(), true);
            class240.field3826.method288(arg1.substring(2), (byte) -43);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method304((byte) 84);
                            this.field4406[2] = class118.method863(255, var5) >> 12;
                            this.field4406[0] = class118.method863(267386880, var5 << 4);
                            this.field4406[1] = class118.method863(var5 >> 4, 4080);
                        }
                    } else {
                        this.field4400 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field4403 = arg0.method260((byte) -67);
                }
            } else {
                this.field4402 = arg0.method260((byte) -67);
            }
        } else {
            this.field4407 = arg0.method260((byte) -67);
        }
        ++field4401;
        if (arg2 != 102) {
            method1890((byte) -33, (String) null);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field4398;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (arg0 <= 0) {
            this.method37((class31) null, -63, (byte) 94);
        }
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class250.field4008 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4406[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field4407) {
                    var7[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var8[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4406[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field4407 > ~var15) {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = -this.field4406[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field4407 < var17) {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var7[var11] = this.field4400 * var12 >> 12;
                            var10[var11] = this.field4403 * var14 >> 12;
                            var9[var11] = this.field4402 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static void method1891(boolean arg0) {
        field4399 = null;
        if (arg0) {
            field4399 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }
}
