import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class118 {

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "Z")
    private boolean field77 = false;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    private int field78 = -1;

    @OriginalMember(owner = "client!ad", name = "Hb", descriptor = "Z")
    private volatile boolean field96 = false;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!ad", name = "Eb", descriptor = "Lcb;")
    private class15 field93;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lcb;")
    private class15 field73;

    @OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
    public static int field90 = 1;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!ad", name = "xb", descriptor = "Lo;")
    public static class84 field86 = class15.method124("backright2", 255);

    @OriginalMember(owner = "client!ad", name = "Fb", descriptor = "Lo;")
    public static class84 field94 = class15.method124(" @whi@", 255);

    @OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
    public static int field89 = -1;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ad", name = "wb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ad", name = "zb", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ad", name = "Cb", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ad", name = "Db", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ad", name = "Gb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lp;")
    public static class89 field74;

    @OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
    public static int[] field98;

    @OriginalMember(owner = "client!ad", name = "Ib", descriptor = "[Z")
    private volatile boolean[] field97;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 5)
    public static final void method19(int arg0, Graphics arg1) {
        ++field75;
        if (arg0 >= -86) {
            field80 = -16;
        }
        class73.field1536.method705(0, arg1, 17, 357);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lcb;Lcb;IZZZ)V", line = 16)
    public class5(class15 arg0, class15 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field77 = arg5;
        this.field69 = arg2;
        this.field93 = arg0;
        this.field73 = arg1;
        class4.method17(127, this, this.field69);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)I", line = 38)
    public static final int method20(int arg0, int arg1, int arg2) {
        ++field71;
        int var3 = -128 + (class128.method989(4, arg2 + 45365, arg1 + 91923, true) - -(class128.method989(2, arg2 - -10294, arg1 + 37821, true) + -128 >> 1)) + (-128 + class128.method989(1, arg2, arg1, true) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + arg0;
        if (~var4 > -11) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 56)
    public final void method21(byte arg0, int arg1) {
        if (this.field93 != null && this.field97 != null && this.field97[arg1]) {
            class75.method559(this, this.field93, true, arg1);
        } else {
            class58.method473(arg1, arg0 ^ 94, this, super.field2621[arg1], (byte) 2, true, this.field69);
        }
        if (arg0 != 2) {
            this.field78 = 10;
        }
        ++field92;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lud;Lo;BLo;)[Lqb;", line = 72)
    public static final class96[] method22(class118 arg0, class84 arg1, byte arg2, class84 arg3) {
        if (arg2 != -58) {
            field86 = null;
        }
        int var4 = arg0.method921((byte) -18, arg1);
        int var5 = arg0.method913(false, arg3, var4);
        ++field82;
        return class8.method70(var5, arg0, var4, 93);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lge;I)V", line = 87)
    public static final void method23(class41 arg0, int arg1) {
        if (arg1 != 1196625736) {
            field74 = null;
        }
        int var2 = 0;
        ++field70;
        if (~arg0.field834 == -1) {
            var2 = class112.field2427.method845(arg0.field822, arg0.field823, arg0.field827);
        }
        if (arg0.field834 == 1) {
            var2 = class112.field2427.method805(arg0.field822, arg0.field823, arg0.field827);
        }
        int var3 = -1;
        if (arg0.field834 == 2) {
            var2 = class112.field2427.method815(arg0.field822, arg0.field823, arg0.field827);
        }
        int var4 = 0;
        if (arg0.field834 == 3) {
            var2 = class112.field2427.method844(arg0.field822, arg0.field823, arg0.field827);
        }
        int var5 = 0;
        if (var2 != 0) {
            var3 = (536857799 & var2) >> 14;
            int var6 = class112.field2427.method835(arg0.field822, arg0.field823, arg0.field827, var2);
            var5 = (203 & var6) >> 6;
            var4 = 31 & var6;
        }
        arg0.field826 = var3;
        arg0.field837 = var5;
        arg0.field844 = var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 140)
    public final void method24(int arg0, int arg1) {
        if (arg1 != -28304) {
            this.method24(-33, 56);
        }
        class128.method994(this.field69, 1171938384, arg0);
        ++field68;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I", line = 152)
    public final int method25(byte arg0) {
        if (arg0 <= 19) {
            method34((byte) 44);
        }
        ++field91;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field2588.length; ++var4) {
            if (~super.field2610[var4] < -1) {
                var2 += 100;
                var3 += this.method26(var4, (byte) -11);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)I", line = 186)
    private final int method26(int arg0, byte arg1) {
        ++field81;
        int var3 = -18 / ((49 - arg1) / 33);
        if (super.field2588[arg0] != null) {
            return 100;
        } else {
            return this.field97[arg0] ? 100 : class38.method337(this.field69, arg0, 1365004144);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I", line = 212)
    public final int method27(byte arg0) {
        ++field88;
        if (arg0 < 37) {
            this.field78 = -76;
        }
        if (this.field96) {
            return 100;
        } else if (super.field2588 != null) {
            return 99;
        } else {
            int var2 = class38.method337(255, this.field69, 1365004144);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V", line = 248)
    private final void method28(byte arg0) {
        this.field97 = new boolean[super.field2588.length];
        for (int var2 = 0; this.field97.length > var2; ++var2) {
            this.field97[var2] = false;
        }
        ++field79;
        if (this.field93 == null) {
            this.field96 = true;
        } else {
            this.field78 = -1;
            for (int var3 = 0; this.field97.length > var3; ++var3) {
                if (~super.field2610[var3] < -1) {
                    class60.method483(var3, (byte) 55, this, this.field93);
                    this.field78 = var3;
                }
            }
            if (arg0 < 70) {
                this.method24(-90, 47);
            }
            if (this.field78 == -1) {
                this.field96 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BZZII)V", line = 295)
    public final void method29(byte[] arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        ++field87;
        if (!arg2) {
            arg0[arg0.length + -2] = (byte) (super.field2574[arg3] >> 8);
            arg0[arg0.length - 1] = (byte) super.field2574[arg3];
            if (this.field93 != null) {
                class101.method767(arg0, 20165, arg3, this.field93);
                this.field97[arg3] = true;
            }
            if (arg1) {
                super.field2588[arg3] = arg0;
            }
        } else {
            if (this.field96) {
                throw new RuntimeException();
            }
            if (this.field73 != null) {
                class101.method767(arg0, 20165, this.field69, this.field73);
            }
            this.method907(arg0, 0);
            this.method28((byte) 94);
        }
        int var6 = -4 % ((57 - arg4) / 52);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZI)V", line = 339)
    public final void method30(boolean arg0, int arg1) {
        ++field85;
        this.field83 = arg1;
        if (!arg0) {
            method20(7, -42, 37);
        }
        if (this.field73 != null) {
            class75.method559(this, this.field73, arg0, this.field69);
        } else {
            class58.method473(this.field69, 102, this, this.field83, (byte) 0, true, 255);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)I", line = 369)
    public static final int method31(int arg0, int arg1, int arg2) {
        ++field76;
        int var3 = arg0 - -(arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + arg2;
        return var5 >> 19 & 255;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lmc;Lo;I)Lo;", line = 385)
    public static final class84 method32(class75 arg0, class84 arg1, int arg2) {
        if (~arg1.method670(class69.field1484, (byte) 95) != 0) {
            label42: while (true) {
                int var3 = arg1.method670(class86.field1968, (byte) 95);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method670(class57.field1181, (byte) 95);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method670(class80.field1699, (byte) 95);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg1.method670(class117.field2572, (byte) 95);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method670(class82.field1761, (byte) 95);
                                                if (var7 == -1) {
                                                    break label42;
                                                }
                                                arg1 = class97.method746(0, new class84[] { arg1.method650(var7, -32, 0), class119.method926(class128.method993(4, 22562, arg0), true), arg1.method655(arg2 + 28414, var7 + 2) });
                                            }
                                        }
                                        arg1 = class97.method746(0, new class84[] { arg1.method650(var6, -32, 0), class119.method926(class128.method993(3, 22562, arg0), true), arg1.method655(28418, var6 + 2) });
                                    }
                                }
                                arg1 = class97.method746(arg2 ^ 4, new class84[] { arg1.method650(var5, arg2 + -36, 0), class119.method926(class128.method993(2, 22562, arg0), true), arg1.method655(28418, var5 - -2) });
                            }
                        }
                        arg1 = class97.method746(0, new class84[] { arg1.method650(var4, -32, 0), class119.method926(class128.method993(1, 22562, arg0), true), arg1.method655(28418, var4 + 2) });
                    }
                }
                arg1 = class97.method746(0, new class84[] { arg1.method650(var3, -32, 0), class119.method926(class128.method993(0, 22562, arg0), true), arg1.method655(28418, var3 - -2) });
            }
        }
        if (arg2 != 4) {
            return null;
        } else {
            ++field72;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lcb;I[BBZ)V", line = 468)
    public final void method33(class15 arg0, int arg1, byte[] arg2, byte arg3, boolean arg4) {
        ++field95;
        if (this.field73 != arg0) {
            if (!arg4 && ~this.field78 == ~arg1) {
                this.field96 = true;
            }
            if (arg2 == null || ~arg2.length >= -3) {
                this.field97[arg1] = false;
                if (this.field77 || arg4) {
                    class58.method473(arg1, arg3 + 95, this, super.field2621[arg1], (byte) 2, arg4, this.field69);
                }
                return;
            }
            class99.field2102.reset();
            class99.field2102.update(arg2, 0, arg2.length + -2);
            int var6 = (int) class99.field2102.getValue();
            int var7 = ((arg2[arg2.length + -2] & 255) << 8) + (255 & arg2[arg2.length + -1]);
            if (super.field2621[arg1] != var6 || super.field2574[arg1] != var7) {
                this.field97[arg1] = false;
                if (this.field77 || arg4) {
                    class58.method473(arg1, 73, this, super.field2621[arg1], (byte) 2, arg4, this.field69);
                }
                return;
            }
            this.field97[arg1] = true;
            if (arg4) {
                super.field2588[arg1] = arg2;
            }
        } else {
            if (this.field96) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class58.method473(this.field69, 80, this, this.field83, (byte) 0, true, 255);
                return;
            }
            class99.field2102.reset();
            class99.field2102.update(arg2, 0, arg2.length);
            int var8 = (int) class99.field2102.getValue();
            if (this.field83 != var8) {
                class58.method473(this.field69, arg3 + 107, this, this.field83, (byte) 0, true, 255);
                return;
            }
            this.method907(arg2, 0);
            this.method28((byte) 76);
        }
        if (arg3 != 2) {
            field94 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 563)
    public static void method34(byte arg0) {
        field74 = null;
        field98 = null;
        field94 = null;
        field86 = null;
        if (arg0 <= 71) {
            method20(-120, -15, 43);
        }
    }
}
