import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class403 extends class501 {

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field5920 = new Object();

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "[Lhk;")
    private class67[] field5923 = new class67[0];

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    private int field5924 = 0;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    private int field5925 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Lqp;")
    public static class466 field5919;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "Lri;")
    public static class74 field5922;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BFILta;Z)V")
    public final void method2155(byte arg0, float arg1, int arg2, class142 arg3, boolean arg4) {
        ++field5905;
        Object var6 = this.field5920;
        synchronized (this.field5920) {
            super.field7370[super.field7379] = (byte) (arg4 ? arg2 + 40 : arg2 + 30);
            super.field7371[super.field7379] = arg3;
            super.field7372[super.field7379] = arg1;
            ++super.field7379;
            if (super.field7379 >= 5000) {
                super.field7379 = 0;
            }
            ++super.field7373;
            if (arg0 >= 33) {
                ++super.field7376;
                if (~this.field5925 < -1) {
                    this.field5920.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
    private final void method2427(int arg0, byte arg1) {
        ++field5907;
        super.field7370[super.field7379] = (byte) arg0;
        ++super.field7379;
        if (super.field7379 >= 5000) {
            super.field7379 = 0;
        }
        if (arg1 >= -24) {
            method2431((class338) null, 37, (int[]) null, (int[]) null, (byte) 50, 92);
        }
        ++super.field7376;
        ++super.field7373;
        if (this.field5925 > 0) {
            Object var3 = this.field5920;
            synchronized (this.field5920) {
                this.field5920.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILcu;Lya;ILhq;)Z")
    public static final boolean method2428(int arg0, int arg1, class146 arg2, class38 arg3, int arg4, class109 arg5) {
        ++field5921;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg4 != -25703) {
            field5919 = null;
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field2090 != null) {
            var6 = (-class350.field5122 + arg5.field1645 + arg2.field2104) * (-class350.field5142 + class350.field5126) / (class350.field5143 - class350.field5122) + class350.field5142;
            var8 = -((arg2.field2103 - (-arg5.field1644 - -class350.field5134)) * (-class350.field5129 + class350.field5140) / (-class350.field5134 + class350.field5127)) + class350.field5140;
            var7 = class350.field5142 - -((-class350.field5122 + arg5.field1645 + arg2.field2108) * (-class350.field5142 + class350.field5126) / (-class350.field5122 + class350.field5143));
            var9 = -((arg2.field2102 + arg5.field1644 + -class350.field5134) * (-class350.field5129 + class350.field5140) / (-class350.field5134 + class350.field5127)) + class350.field5140;
        }
        class16 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg2.field2113 != 0) {
            if (arg5.field1640 && arg2.field2080 != -1) {
                var10 = arg2.method976(arg3, true, true);
            } else {
                var10 = arg2.method976(arg3, false, true);
            }
            if (var10 != null) {
                var11 = arg5.field1643 + -(1 + var10.method84() >> 1);
                var12 = arg5.field1643 - -(var10.method84() + 1 >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg5.field1642 - (var10.method93() - -1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg5.field1642 + (1 + var10.method93() >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class75 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field2082 != null) {
            var15 = class158.method1049(arg2.field2092, -3);
            if (var15 != null) {
                var16 = class117.field1753.method2875(class411.field6016, 0, (class16[]) null, arg2.field2082, (int[]) null);
                int var23 = arg5.field1642;
                if (var10 == null) {
                    var17 = var23 - var15.method601() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method93() >> 1) - -(var15.method599() * var16));
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class411.field6016[var24];
                    if (~var24 > ~(var16 - 1)) {
                        var25 = var25.substring(0, var25.length() + -4);
                    }
                    int var26 = var15.method602(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field1643 - var18 / 2 + arg1;
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 - -arg1 + arg5.field1643;
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = var17 - -arg0;
                var22 = var17 + var16 * var15.method599() - -arg0;
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (~var7 <= ~class350.field5142 && ~var6 >= ~class350.field5126 && ~var9 <= ~class350.field5129 && var8 <= class350.field5140) {
            if (arg2.field2090 != null) {
                int[] var27 = new int[arg2.field2090.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg2.field2090[var28 * 2] - -arg5.field1645;
                    int var31 = arg2.field2090[var28 * 2 - -1] - -arg5.field1644;
                    var27[var28 * 2] = class350.field5142 - -((-class350.field5142 + class350.field5126) * (-class350.field5122 + var30) / (class350.field5143 - class350.field5122));
                    var27[var28 * 2 + 1] = class350.field5140 - (-class350.field5134 + var31) * (-class350.field5129 + class350.field5140) / (-class350.field5134 + class350.field5127);
                }
                class213.method1321(arg3, var27, arg2.field2075);
                for (int var29 = 0; ~(var27.length / 2 + -1) < ~var29; ++var29) {
                    arg3.method289(var27[var29 * 2 + 2], 1, var27[(var29 + 1) * 2 + 1], var27[var29 * 2], var27[var29 * 2 + 1], arg2.field2109);
                }
                arg3.method289(var27[0], arg4 ^ -25704, var27[1], var27[var27.length + -2], var27[var27.length + -1], arg2.field2109);
            }
            if (var10 != null) {
                if (~class222.field3167 < -1 && (class294.field4050 != -1 && class294.field4050 == arg5.field1639 || class346.field4955 != -1 && class346.field4955 == arg2.field2070)) {
                    int var32;
                    if (class193.field2756 > 50) {
                        var32 = (100 - class193.field2756) * 2;
                    } else {
                        var32 = class193.field2756 * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg3.method238((byte) -11, 7 + var10.method102() / 2, arg5.field1642, var33, arg5.field1643);
                    arg3.method238((byte) -11, var10.method102() / 2 + 5, arg5.field1642, var33, arg5.field1643);
                    arg3.method238((byte) -11, var10.method102() / 2 - -3, arg5.field1642, var33, arg5.field1643);
                    arg3.method238((byte) -11, 1 + var10.method102() / 2, arg5.field1642, var33, arg5.field1643);
                    arg3.method238((byte) -11, var10.method102() / 2, arg5.field1642, var33, arg5.field1643);
                }
                var10.method85(arg5.field1643 + -(var10.method84() >> 1), arg5.field1642 - (var10.method93() >> 1));
            }
            if (arg2.field2082 != null && var15 != null) {
                class220.method1369(var17, arg3, arg2, arg4 ^ 25726, var15, var18, var16, arg5);
            }
            if (~arg2.field2113 != 0 || arg2.field2082 != null) {
                class454 var34 = new class454(arg5);
                var34.field6667 = var14;
                var34.field6670 = var22;
                var34.field6673 = var12;
                var34.field6668 = var20;
                var34.field6676 = var13;
                var34.field6675 = var19;
                var34.field6664 = var21;
                var34.field6672 = var11;
                class212.field2958.method2809(var34, arg4 + 25705);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public final void method2153(int arg0, int arg1) {
        ++field5910;
        int var3 = 0;
        Object var4 = this.field5920;
        synchronized (this.field5920) {
            if (~this.field5924 == ~arg1) {
                for (int var5 = 0; this.field5924 > var5; ++var5) {
                    this.method2427(var3++, (byte) -58);
                }
            } else {
                if (arg0 != 5000) {
                    field5916 = -55;
                }
                for (int var6 = 0; ~this.field5924 < ~var6; ++var6) {
                    this.field5923[var6].method571(arg0 ^ 5000);
                }
                this.field5924 = arg1;
                this.field5923 = new class67[this.field5924];
                for (int var7 = 0; ~var7 > ~this.field5924; ++var7) {
                    this.field5923[var7] = new class67(this);
                    this.field5923[var7].method572(-66);
                    this.method2427(var3++, (byte) -82);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V")
    private final void method2429(int arg0, int arg1) {
        ++field5911;
        super.field7370[super.field7379] = (byte) (arg0 + 10);
        ++super.field7379;
        if (super.field7379 >= arg1) {
            super.field7379 = 0;
        }
        ++super.field7373;
        ++super.field7376;
        if (this.field5925 > 0) {
            Object var3 = this.field5920;
            synchronized (this.field5920) {
                this.field5920.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lhg;I)V")
    public final void method2154(class486 arg0, int arg1) {
        ++field5913;
        Object var3 = this.field5920;
        synchronized (this.field5920) {
            super.field7370[super.field7379] = 21;
            super.field7371[super.field7379] = arg0;
            ++super.field7379;
            ++super.field7373;
            if (~super.field7379 <= -5001) {
                super.field7379 = 0;
            }
            ++super.field7376;
            if (this.field5925 > 0) {
                this.field5920.notifyAll();
            }
        }
        if (arg1 != -4093) {
            this.method2427(-79, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public static void method2430(int arg0) {
        field5922 = null;
        if (arg0 >= -65) {
            method2430(13);
        }
        field5919 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lef;I[I[IBI)Lsj;")
    public static final class320 method2431(class338 arg0, int arg1, int[] arg2, int[] arg3, byte arg4, int arg5) {
        if (arg4 >= -127) {
            method2428(12, 54, (class146) null, (class38) null, 34, (class109) null);
        }
        ++field5906;
        byte[] var6 = new byte[arg1 * arg5];
        for (int var7 = 0; var7 < arg1; ++var7) {
            int var8 = arg5 * var7 + arg3[var7];
            for (int var9 = 0; arg2[var7] > var9; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class320(arg0, arg5, arg1, var6);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILhg;)V")
    public final void method2163(int arg0, class486 arg1) {
        Object var3 = this.field5920;
        synchronized (this.field5920) {
            super.field7370[super.field7379] = 20;
            if (arg0 != -11487) {
                return;
            }
            super.field7371[super.field7379] = arg1;
            ++super.field7379;
            ++super.field7373;
            ++super.field7376;
            if (~super.field7379 <= -5001) {
                super.field7379 = 0;
            }
            if (this.field5925 > 0) {
                this.field5920.notifyAll();
            }
        }
        ++field5917;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lhk;I)V")
    public final void method2432(class67 arg0, int arg1) {
        ++field5908;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field5920;
            byte var7;
            synchronized (this.field5920) {
                while (~super.field7373 == -1) {
                    ++this.field5925;
                    this.field5920.wait();
                    --this.field5925;
                }
                var7 = super.field7370[super.field7378];
                if (arg0.field912 >= 0) {
                    if (~var7 > -1 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field2767 = super.field7371[super.field7378];
                    var5 = super.field7372[super.field7378];
                    super.field7371[super.field7378] = null;
                    ++super.field7378;
                    --super.field7373;
                    if (super.field7378 >= 5000) {
                        super.field7378 = 0;
                    }
                }
            }
            if (var3) {
                if (arg0.field912 >= 0) {
                    if (var7 == 21) {
                        class315.method1837(arg0, (class486) arg0.field2767);
                    } else if (~var7 != -21) {
                        if (~var7 <= -31 && ~var7 >= -34) {
                            class449.field6615.method245(3000.0F, var5 * 1.5F);
                            ((class142) arg0.field2767).method362(class368.field5398, field5916, class110.field1656, class457.field6712, var7 - 30 == 0);
                        } else if (var7 >= 40 && var7 <= 43) {
                            class449.field6615.method245(3000.0F, var5 * 1.5F);
                            ((class142) arg0.field2767).method362(class368.field5398, field5916, class110.field1656, class414.field6042, ~(var7 + -40) == -1);
                        } else if (~var7 != -23) {
                            if (~var7 == -24) {
                                class449.field6615.method222();
                            } else if (var7 == 24) {
                                class449.field6615.method255(0, (class153[]) null);
                            } else if (~var7 <= -11 && ~var7 >= -14) {
                                class449.field6615.method326(arg0.field912);
                                arg0.field912 = -1;
                            }
                        } else {
                            class449.field6615.method327(-1, 1583160, 40, 127);
                        }
                    } else {
                        class486 var8 = (class486) arg0.field2767;
                        if (var8.field7114 != null) {
                            var8.field7114.method493(-118, class449.field6615);
                        }
                        if (var8.field7118 != null) {
                            var8.field7118.method493(-117, class449.field6615);
                        }
                        if (var8.field7103 != null) {
                            var8.field7103.method493(-116, class449.field6615);
                        }
                        if (var8.field7105 != null) {
                            var8.field7105.method493(-126, class449.field6615);
                        }
                        if (var8.field7100 != null) {
                            var8.field7100.method493(arg1 ^ 14787, class449.field6615);
                        }
                        for (class164 var9 = var8.field7115; var9 != null; var9 = var9.field2467) {
                            var9.field2468.method493(arg1 + 14650, class449.field6615);
                        }
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    arg0.field912 = var7;
                    class449.field6615.method221(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5920;
                synchronized (this.field5920) {
                    --super.field7376;
                    if (super.field7376 == 0) {
                        this.field5920.notifyAll();
                    }
                }
            }
        }
        if (arg1 != -14774) {
            this.method2162(-39);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lhg;Z)V")
    public final void method2158(class486 arg0, boolean arg1) {
        Object var3 = this.field5920;
        synchronized (this.field5920) {
            --super.field7378;
            if (super.field7378 < 0) {
                super.field7378 = 4999;
            }
            super.field7370[super.field7378] = 21;
            super.field7371[super.field7378] = arg0;
            ++super.field7373;
            ++super.field7376;
            if (~this.field5925 < -1) {
                this.field5920.notifyAll();
            }
            if (!arg1) {
                field5919 = null;
            }
        }
        ++field5912;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
    public final void method2156(int arg0) {
        try {
            Object var2 = this.field5920;
            synchronized (this.field5920) {
                if (arg0 != 5000) {
                    return;
                }
                while (super.field7376 != 0) {
                    this.field5920.wait();
                }
            }
        } catch (Exception var6) {
        }
        ++field5914;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final void method2162(int arg0) {
        ++field5909;
        if (arg0 != 5000) {
            this.field5920 = null;
        }
        Object var2 = this.field5920;
        synchronized (this.field5920) {
            for (int var3 = 0; var3 < this.field5924; ++var3) {
                if (~this.field5923[var3].field912 <= -1) {
                    this.method2429(this.field5923[var3].field912, 5000);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
    public final void method2164(byte arg0, int arg1) {
        Object var3 = this.field5920;
        synchronized (this.field5920) {
            super.field7370[super.field7379] = (byte) arg1;
            ++super.field7379;
            if (arg0 != -3) {
                this.method2162(-43);
            }
            ++super.field7376;
            ++super.field7373;
            if (~super.field7379 <= -5001) {
                super.field7379 = 0;
            }
            if (~this.field5925 < -1) {
                this.field5920.notifyAll();
            }
        }
        ++field5915;
    }

    static {
        new class466((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field5918 = 0;
        field5919 = new class466("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");
        field5922 = new class74(11, 18);
    }
}
