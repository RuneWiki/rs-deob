import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class349 extends class303 {

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field4777 = new Object();

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    private int field4782 = 0;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "[Lqf;")
    private class235[] field4785 = new class235[0];

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    private int field4784 = 0;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Z")
    public static boolean field4767 = false;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Lfn;")
    public static class52 field4773 = new class52(97, 3);

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field4786 = 0;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field4788 = 1;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Led;")
    public static class449 field4779;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2085(byte arg0) {
        ++field4774;
        class83 var1 = (class83) class70.field1038.method2823(61);
        if (arg0 > -124) {
            method2087(-12, 116, -65, 111, 98, -101);
        }
        while (var1 != null) {
            var1.method570();
            var1 = (class83) class70.field1038.method2818(0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLui;)V", line = 22)
    public final void method818(byte arg0, class406 arg1) {
        Object var3 = this.field4777;
        synchronized (this.field4777) {
            super.field4153[super.field4145] = 20;
            super.field4152[super.field4145] = arg1;
            ++super.field4145;
            if (~super.field4145 <= -5001) {
                super.field4145 = 0;
            }
            ++super.field4147;
            int var4 = -118 / ((arg0 - -60) / 49);
            ++super.field4151;
            if (~this.field4784 < -1) {
                this.field4777.notifyAll();
            }
        }
        ++field4768;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB[B)I", line = 45)
    public static final int method2086(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field4766;
        int var4 = -1;
        if (arg2 < 111) {
            method2086(-100, 95, (byte) -88, (byte[]) null);
        }
        for (int var5 = arg1; var5 < arg0; ++var5) {
            var4 = var4 >>> 8 ^ class56.field904[(arg3[var5] ^ var4) & 255];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lui;B)V", line = 73)
    public final void method812(class406 arg0, byte arg1) {
        Object var3 = this.field4777;
        synchronized (this.field4777) {
            super.field4153[super.field4145] = 21;
            super.field4152[super.field4145] = arg0;
            ++super.field4145;
            ++super.field4151;
            ++super.field4147;
            if (~super.field4145 <= -5001) {
                super.field4145 = 0;
            }
            if (this.field4784 > 0) {
                this.field4777.notifyAll();
            }
            if (arg1 != 10) {
                field4773 = null;
            }
        }
        ++field4775;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 98)
    public final void method813(int arg0, int arg1) {
        ++field4783;
        if (arg0 > -75) {
            this.field4782 = 9;
        }
        int var3 = 0;
        Object var4 = this.field4777;
        synchronized (this.field4777) {
            if (~this.field4782 == ~arg1) {
                for (int var5 = 0; ~this.field4782 < ~var5; ++var5) {
                    this.method2089(var3++, (byte) 76);
                }
            } else {
                for (int var6 = 0; ~this.field4782 < ~var6; ++var6) {
                    this.field4785[var6].method1478(-1);
                }
                this.field4782 = arg1;
                this.field4785 = new class235[this.field4782];
                for (int var7 = 0; ~this.field4782 < ~var7; ++var7) {
                    this.field4785[var7] = new class235(this);
                    this.field4785[var7].method1476((byte) -12);
                    this.method2089(var3++, (byte) 60);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lui;I)V", line = 149)
    public final void method816(class406 arg0, int arg1) {
        ++field4765;
        Object var3 = this.field4777;
        synchronized (this.field4777) {
            --super.field4149;
            if (~super.field4149 > -1) {
                super.field4149 = 4999;
            }
            super.field4153[super.field4149] = 21;
            super.field4152[super.field4149] = arg0;
            ++super.field4151;
            if (arg1 < -123) {
                ++super.field4147;
                if (this.field4784 > 0) {
                    this.field4777.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIII)V", line = 175)
    public static final void method2087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class287.field3916 = arg1;
        ++field4787;
        class294.field4057 = arg3;
        class7.field124 = arg4;
        class165.field2435 = arg2;
        class175.field2569 = arg5;
        if (arg0 != 22434) {
            method2087(50, -34, 108, 43, 24, -106);
        }
        if (~class165.field2435 <= -101) {
            int var6 = class175.field2569 * 128 + 64;
            int var7 = class294.field4057 * 128 + 64;
            int var8 = class418.method2441(var7, class76.field1161, var6, -16778) + -class7.field124;
            int var9 = -class436.field5982 + var6;
            int var10 = -class183.field2665 + var8;
            int var11 = -class106.field1525 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class160.field2306 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
            class200.field2873 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11));
            class259.field3618 = 0;
            if (class160.field2306 < 1024) {
                class160.field2306 = 1024;
            }
            if (~class160.field2306 < -3073) {
                class160.field2306 = 3072;
            }
        }
        class375.field5312 = 2;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V", line = 223)
    private final void method2088(int arg0, byte arg1) {
        super.field4153[super.field4145] = (byte) (arg0 + 10);
        ++field4780;
        ++super.field4145;
        ++super.field4151;
        ++super.field4147;
        if (arg1 != 2) {
            this.method811(-109, -100);
        }
        if (~super.field4145 <= -5001) {
            super.field4145 = 0;
        }
        if (~this.field4784 < -1) {
            Object var3 = this.field4777;
            synchronized (this.field4777) {
                this.field4777.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIFLdh;Z)V", line = 250)
    public final void method810(int arg0, int arg1, float arg2, class269 arg3, boolean arg4) {
        ++field4778;
        Object var6 = this.field4777;
        synchronized (this.field4777) {
            super.field4153[super.field4145] = (byte) (arg4 ? arg1 + 40 : arg1 + 30);
            super.field4152[super.field4145] = arg3;
            super.field4148[super.field4145] = arg2;
            ++super.field4145;
            if (arg0 != -7792) {
                this.field4777 = null;
            }
            ++super.field4147;
            ++super.field4151;
            if (super.field4145 >= 5000) {
                super.field4145 = 0;
            }
            if (this.field4784 > 0) {
                this.field4777.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V", line = 277)
    public final void method814(int arg0) {
        try {
            Object var2 = this.field4777;
            synchronized (this.field4777) {
                if (arg0 != -13417) {
                    method2085((byte) -31);
                }
                while (super.field4147 != 0) {
                    this.field4777.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field4776;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 301)
    public final void method817(boolean arg0) {
        ++field4764;
        Object var2 = this.field4777;
        synchronized (this.field4777) {
            if (!arg0) {
                this.method2089(-67, (byte) 97);
            }
            for (int var3 = 0; var3 < this.field4782; ++var3) {
                if (~this.field4785[var3].field3320 <= -1) {
                    this.method2088(this.field4785[var3].field3320, (byte) 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)V", line = 324)
    private final void method2089(int arg0, byte arg1) {
        ++field4769;
        super.field4153[super.field4145] = (byte) arg0;
        ++super.field4145;
        if (arg1 < 25) {
            this.method814(126);
        }
        if (super.field4145 >= 5000) {
            super.field4145 = 0;
        }
        ++super.field4147;
        ++super.field4151;
        if (this.field4784 > 0) {
            Object var3 = this.field4777;
            synchronized (this.field4777) {
                this.field4777.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lqf;Z)V", line = 353)
    public final void method2090(class235 arg0, boolean arg1) {
        ++field4772;
        boolean var3 = false;
        boolean var23 = false;
        label386: {
            try {
                var23 = true;
                boolean var4 = false;
                if (arg1) {
                    float var5 = 0.0F;
                    Object var6 = this.field4777;
                    byte var7;
                    synchronized (this.field4777) {
                        while (~super.field4151 == -1) {
                            ++this.field4784;
                            this.field4777.wait();
                            --this.field4784;
                        }
                        var7 = super.field4153[super.field4149];
                        if (arg0.field3320 >= 0) {
                            if (~var7 > -1 || var7 > 3) {
                                var3 = true;
                            }
                        } else if (var7 >= 0 && ~var7 >= -4) {
                            var3 = true;
                        }
                        if (var3) {
                            arg0.field3062 = super.field4152[super.field4149];
                            var5 = super.field4148[super.field4149];
                            super.field4152[super.field4149] = null;
                            ++super.field4149;
                            if (~super.field4149 <= -5001) {
                                super.field4149 = 0;
                            }
                            --super.field4151;
                        }
                    }
                    if (var3) {
                        if (~arg0.field3320 <= -1) {
                            if (~var7 == -22) {
                                class432.method2526(arg0, (class406) arg0.field3062);
                                var23 = false;
                            } else if (~var7 != -21) {
                                if (~var7 <= -31 && var7 <= 33) {
                                    class259.field3611.method1144(3000.0F, var5 * 1.5F);
                                    ((class269) arg0.field3062).method703(class381.field5398, class8.field171, class125.field1713, class435.field5973, var7 + -30 == 0);
                                    var23 = false;
                                } else if (var7 >= 40 && var7 <= 43) {
                                    class259.field3611.method1144(3000.0F, var5 * 1.5F);
                                    ((class269) arg0.field3062).method703(class381.field5398, class8.field171, class125.field1713, class451.field6194, var7 + -40 == 0);
                                    var23 = false;
                                } else if (~var7 != -23) {
                                    if (~var7 != -24) {
                                        if (var7 != 24) {
                                            if (~var7 <= -11) {
                                                if (var7 <= 13) {
                                                    class259.field3611.method1141(arg0.field3320);
                                                    arg0.field3320 = -1;
                                                    var23 = false;
                                                } else {
                                                    var23 = false;
                                                }
                                            } else {
                                                var23 = false;
                                            }
                                        } else {
                                            class259.field3611.method1083(0, (class488[]) null);
                                            var23 = false;
                                        }
                                    } else {
                                        class259.field3611.method1091();
                                        var23 = false;
                                    }
                                } else {
                                    class259.field3611.method1116(-1, 1583160, 40, 127);
                                    var23 = false;
                                }
                            } else {
                                class406 var8 = (class406) arg0.field3062;
                                if (var8.field5617 != null) {
                                    var8.field5617.method197(class259.field3611, 125);
                                }
                                if (var8.field5624 != null) {
                                    var8.field5624.method197(class259.field3611, -121);
                                }
                                if (var8.field5625 != null) {
                                    var8.field5625.method197(class259.field3611, 126);
                                }
                                if (var8.field5608 != null) {
                                    var8.field5608.method197(class259.field3611, -82);
                                }
                                if (var8.field5621 != null) {
                                    var8.field5621.method197(class259.field3611, 125);
                                }
                                for (class146 var9 = var8.field5613; var9 != null; var9 = var9.field2066) {
                                    var9.field2062.method197(class259.field3611, -5);
                                }
                                var23 = false;
                            }
                        } else if (var7 >= 0) {
                            if (~var7 >= -4) {
                                arg0.field3320 = var7;
                                class259.field3611.method1087(var7);
                                var23 = false;
                            } else {
                                var23 = false;
                            }
                        } else {
                            var23 = false;
                        }
                    } else {
                        Thread.yield();
                        var23 = false;
                    }
                    break label386;
                }
                Object var10000 = null;
                var23 = false;
            } catch (Exception var28) {
                var23 = false;
                break label386;
            } finally {
                if (var23) {
                    Object var15 = null;
                    if (var3) {
                        Object var16 = this.field4777;
                        synchronized (this.field4777) {
                            --super.field4147;
                            if (super.field4147 == 0) {
                                this.field4777.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field4777;
                synchronized (this.field4777) {
                    --super.field4147;
                    if (super.field4147 == 0) {
                        this.field4777.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field4777;
            synchronized (this.field4777) {
                --super.field4147;
                if (super.field4147 == 0) {
                    this.field4777.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 520)
    public static void method2091(byte arg0) {
        field4773 = null;
        if (arg0 != -80) {
            method2093((byte) 98);
        }
        field4779 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLjava/awt/Component;I)Lfs;", line = 532)
    public static final class208 method2092(boolean arg0, Component arg1, int arg2) {
        if (arg2 != -1) {
            field4786 = -25;
        }
        ++field4770;
        return new class409(arg1, arg0);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 544)
    public static final void method2093(byte arg0) {
        class2.field18.method1154(((float) class400.field5591 * 0.1F + 0.7F) * class236.field3330);
        ++field4781;
        class2.field18.method1153(class228.field3228, class465.field6533, class466.field6543, (float) class42.field720, (float) class372.field5272, (float) class479.field6784);
        class2.field18.method1064(class350.field4795);
        if (arg0 != -102) {
            field4767 = true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V", line = 560)
    public final void method811(int arg0, int arg1) {
        Object var3 = this.field4777;
        synchronized (this.field4777) {
            super.field4153[super.field4145] = (byte) arg1;
            ++super.field4145;
            ++super.field4147;
            ++super.field4151;
            if (~super.field4145 <= -5001) {
                super.field4145 = 0;
            }
            if (~this.field4784 < -1) {
                this.field4777.notifyAll();
            }
        }
        ++field4771;
        if (arg0 != 4) {
            field4773 = null;
        }
    }
}
