import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class619 extends class613 {

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field8867 = new Object();

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    private int field8871 = 0;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[Lqj;")
    private class434[] field8874 = new class434[0];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    private int field8873 = 0;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Lej;")
    public static class104 field8877 = new class104("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[[I")
    public static int[][] field8864;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method2858(int arg0) {
        ++field8878;
        try {
            Object var2 = this.field8867;
            synchronized (this.field8867) {
                while (~super.field8819 != -1) {
                    this.field8867.wait();
                }
                if (arg0 > -83) {
                    this.field8867 = null;
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIIZI)V")
    public static final void method3603(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field8866;
        long var6 = (long) (arg3 | (!arg4 ? 0 : Integer.MIN_VALUE));
        class133 var8 = (class133) class641.field9319.method1242(0, var6);
        if (var8 == null) {
            var8 = new class133();
            class641.field9319.method1241(var8, var6, -128);
        }
        if (arg1) {
            field8864 = null;
        }
        if (~arg2 <= ~var8.field2115.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var8.field2115.length > var11; ++var11) {
                var9[var11] = var8.field2115[var11];
                var10[var11] = var8.field2116[var11];
            }
            for (int var12 = var8.field2115.length; var12 < arg2; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2115 = var9;
            var8.field2116 = var10;
        }
        var8.field2115[arg2] = arg0;
        var8.field2116[arg2] = arg5;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILbo;)V")
    public final void method2854(int arg0, class622 arg1) {
        Object var3 = this.field8867;
        synchronized (this.field8867) {
            --super.field8816;
            if (super.field8816 < 0) {
                super.field8816 = 4999;
            }
            super.field8822[super.field8816] = 21;
            super.field8821[super.field8816] = arg1;
            ++super.field8819;
            ++super.field8814;
            if (this.field8871 > 0) {
                this.field8867.notifyAll();
            }
        }
        if (arg0 < 48) {
            this.method2853(-1.4446274F, 6, -37, (class174) null, false);
        }
        ++field8859;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method3604(int arg0) {
        if (arg0 == -26259) {
            field8877 = null;
            field8864 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public final void method2863(int arg0, int arg1) {
        Object var3 = this.field8867;
        synchronized (this.field8867) {
            super.field8822[super.field8818] = (byte) arg0;
            ++super.field8818;
            if (super.field8818 >= 5000) {
                super.field8818 = 0;
            }
            ++super.field8819;
            ++super.field8814;
            if (arg1 < this.field8871) {
                this.field8867.notifyAll();
            }
        }
        ++field8869;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLbo;)V")
    public final void method2852(boolean arg0, class622 arg1) {
        Object var3 = this.field8867;
        synchronized (this.field8867) {
            super.field8822[super.field8818] = 20;
            super.field8821[super.field8818] = arg1;
            if (!arg0) {
                return;
            }
            ++super.field8818;
            ++super.field8814;
            ++super.field8819;
            if (~super.field8818 <= -5001) {
                super.field8818 = 0;
            }
            if (this.field8871 > 0) {
                this.field8867.notifyAll();
            }
        }
        ++field8868;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    private final void method3605(byte arg0, int arg1) {
        super.field8822[super.field8818] = (byte) arg1;
        ++field8876;
        ++super.field8818;
        if (super.field8818 >= 5000) {
            super.field8818 = 0;
        }
        ++super.field8819;
        if (arg0 != 46) {
            this.field8871 = 15;
        }
        ++super.field8814;
        if (~this.field8871 < -1) {
            Object var3 = this.field8867;
            synchronized (this.field8867) {
                this.field8867.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ldaa;I)Lnd;")
    public static final class466 method3606(class11 arg0, int arg1) {
        arg0.method110((byte) 75);
        ++field8861;
        int var2 = arg0.method110((byte) 101);
        class466 var3 = class529.method3036(-4564, var2);
        var3.field6566 = arg0.method110((byte) 108);
        int var4 = arg0.method110((byte) 53);
        for (int var5 = arg1; var4 > var5; ++var5) {
            int var6 = arg0.method110((byte) 28);
            var3.method6(arg0, -5062, var6);
        }
        var3.method7(arg1 ^ -806066388);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(FIILsa;Z)V")
    public final void method2853(float arg0, int arg1, int arg2, class174 arg3, boolean arg4) {
        Object var6 = this.field8867;
        synchronized (this.field8867) {
            super.field8822[super.field8818] = (byte) (!arg4 ? arg2 + 30 : arg2 + 40);
            super.field8821[super.field8818] = arg3;
            super.field8817[super.field8818] = arg0;
            if (arg1 < 7) {
                field8864 = null;
            }
            ++super.field8818;
            if (~super.field8818 <= -5001) {
                super.field8818 = 0;
            }
            ++super.field8819;
            ++super.field8814;
            if (this.field8871 > 0) {
                this.field8867.notifyAll();
            }
        }
        ++field8862;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbo;Z)V")
    public final void method2865(class622 arg0, boolean arg1) {
        Object var3 = this.field8867;
        synchronized (this.field8867) {
            super.field8822[super.field8818] = 21;
            super.field8821[super.field8818] = arg0;
            ++super.field8818;
            ++super.field8814;
            ++super.field8819;
            if (super.field8818 >= 5000) {
                super.field8818 = 0;
            }
            if (!arg1) {
                this.method2865((class622) null, false);
            }
            if (~this.field8871 < -1) {
                this.field8867.notifyAll();
            }
        }
        ++field8865;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method2855(int arg0) {
        if (arg0 < 122) {
            field8877 = null;
        }
        ++field8872;
        Object var2 = this.field8867;
        synchronized (this.field8867) {
            for (int var3 = 0; this.field8873 > var3; ++var3) {
                if (this.field8874[var3].field6182 >= 0) {
                    this.method3608(this.field8874[var3].field6182, -16935);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqj;I)V")
    public final void method3607(class434 arg0, int arg1) {
        ++field8870;
        boolean var3 = false;
        try {
            if (arg1 != -958) {
                field8864 = null;
            }
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field8867;
            byte var7;
            synchronized (this.field8867) {
                while (super.field8814 == 0) {
                    ++this.field8871;
                    this.field8867.wait();
                    --this.field8871;
                }
                var7 = super.field8822[super.field8816];
                if (~arg0.field6182 <= -1) {
                    if (var7 < 0 || var7 > 3) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field7099 = super.field8821[super.field8816];
                    var5 = super.field8817[super.field8816];
                    super.field8821[super.field8816] = null;
                    ++super.field8816;
                    --super.field8814;
                    if (~super.field8816 <= -5001) {
                        super.field8816 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field6182 > -1) {
                if (~var7 <= -1 && var7 <= 3) {
                    arg0.field6182 = var7;
                    class329.field4405.method1280(var7);
                }
            } else if (var7 != 21) {
                if (~var7 == -21) {
                    class622 var8 = (class622) arg0.field7099;
                    if (var8.field8985 != null) {
                        var8.field8985.method487(class329.field4405, (byte) 21);
                    }
                    if (var8.field8982 != null) {
                        var8.field8982.method487(class329.field4405, (byte) 21);
                    }
                    if (var8.field8981 != null) {
                        var8.field8981.method487(class329.field4405, (byte) 21);
                    }
                    if (var8.field8977 != null) {
                        var8.field8977.method487(class329.field4405, (byte) 21);
                    }
                    if (var8.field8979 != null) {
                        var8.field8979.method487(class329.field4405, (byte) 21);
                    }
                    for (class559 var9 = var8.field8973; var9 != null; var9 = var9.field7736) {
                        var9.field7742.method487(class329.field4405, (byte) 21);
                    }
                } else if (var7 >= 30 && ~var7 >= -34) {
                    class329.field4405.method1333(3000.0F, var5 * 1.5F);
                    ((class174) arg0.field7099).method1099(class120.field1970, class546.field7561, class325.field4377, class69.field1172, ~(var7 + -30) == -1);
                } else if (~var7 <= -41 && var7 <= 43) {
                    class329.field4405.method1333(3000.0F, var5 * 1.5F);
                    ((class174) arg0.field7099).method1099(class120.field1970, class546.field7561, class325.field4377, class270.field3764, var7 + -40 == 0);
                } else if (~var7 != -23) {
                    if (~var7 != -24) {
                        if (~var7 != -25) {
                            if (var7 >= 10 && ~var7 >= -14) {
                                class329.field4405.method1330(arg0.field6182);
                                arg0.field6182 = -1;
                            }
                        } else {
                            class329.field4405.method1311(0, (class223[]) null);
                        }
                    } else {
                        class329.field4405.method1352();
                    }
                } else {
                    class329.field4405.method1336(-1, 1583160, 40, 127);
                }
            } else {
                class315.method1964(arg0, (class622) arg0.field7099);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field8867;
                synchronized (this.field8867) {
                    --super.field8819;
                    if (~super.field8819 == -1) {
                        this.field8867.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
    public final void method2856(int arg0, byte arg1) {
        ++field8863;
        int var3 = 0;
        Object var4 = this.field8867;
        synchronized (this.field8867) {
            if (this.field8873 == arg0) {
                for (int var5 = 0; ~var5 > ~this.field8873; ++var5) {
                    this.method3605((byte) 46, var3++);
                }
            } else {
                for (int var6 = 0; ~this.field8873 < ~var6; ++var6) {
                    this.field8874[var6].method2580((byte) -31);
                }
                if (arg1 > -122) {
                    this.method2856(-5, (byte) 113);
                }
                this.field8873 = arg0;
                this.field8874 = new class434[this.field8873];
                for (int var7 = 0; ~var7 > ~this.field8873; ++var7) {
                    this.field8874[var7] = new class434(this);
                    this.field8874[var7].method2581(995242791);
                    this.method3605((byte) 46, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    private final void method3608(int arg0, int arg1) {
        super.field8822[super.field8818] = (byte) (arg0 + 10);
        ++field8875;
        ++super.field8818;
        if (arg1 != -16935) {
            this.field8874 = null;
        }
        ++super.field8814;
        ++super.field8819;
        if (super.field8818 >= 5000) {
            super.field8818 = 0;
        }
        if (~this.field8871 < -1) {
            Object var3 = this.field8867;
            synchronized (this.field8867) {
                this.field8867.notifyAll();
            }
        }
    }
}
