import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class414 extends class312 {

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field5878 = new Object();

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "[Lnc;")
    private class18[] field5884 = new class18[0];

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    private int field5883 = 0;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    private int field5881 = 0;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
    public static boolean field5867 = true;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[Lkh;")
    public static class11[] field5864 = new class11[2048];

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field5882 = 0;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field5885 = 0;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Lnq;")
    public static class268 field5875;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "[[[B")
    public static byte[][][] field5879;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V", line = 5)
    private final void method2593(int arg0, int arg1) {
        ++field5865;
        super.field4273[super.field4265] = (byte) (arg1 - -10);
        ++super.field4265;
        if (~super.field4265 <= -5001) {
            super.field4265 = 0;
        }
        ++super.field4262;
        ++super.field4276;
        if (this.field5883 > 0) {
            Object var3 = this.field5878;
            synchronized (this.field5878) {
                this.field5878.notifyAll();
            }
        }
        if (arg0 <= 111) {
            this.method2008(0.32482392F, 120, (class242) null, true, -27);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 30)
    public final void method2013(int arg0) {
        ++field5877;
        try {
            Object var2 = this.field5878;
            synchronized (this.field5878) {
                while (super.field4276 != 0) {
                    this.field5878.wait();
                }
                if (arg0 >= -74) {
                    this.method2009(51, (class125) null);
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V", line = 52)
    public final void method2010(byte arg0, int arg1) {
        ++field5868;
        if (arg0 > -36) {
            this.method2013(30);
        }
        Object var3 = this.field5878;
        synchronized (this.field5878) {
            super.field4273[super.field4265] = (byte) arg1;
            ++super.field4265;
            if (~super.field4265 <= -5001) {
                super.field4265 = 0;
            }
            ++super.field4262;
            ++super.field4276;
            if (this.field5883 > 0) {
                this.field5878.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljd;Z)V", line = 76)
    public final void method2006(class125 arg0, boolean arg1) {
        if (!arg1) {
            this.field5883 = -5;
        }
        ++field5873;
        Object var3 = this.field5878;
        synchronized (this.field5878) {
            super.field4273[super.field4265] = 21;
            super.field4266[super.field4265] = arg0;
            ++super.field4265;
            if (~super.field4265 <= -5001) {
                super.field4265 = 0;
            }
            ++super.field4262;
            ++super.field4276;
            if (~this.field5883 < -1) {
                this.field5878.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I", line = 104)
    public static final int method2594(int arg0, byte arg1) {
        ++field5870;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 != -125) {
            return -36;
        } else {
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lnc;I)V", line = 123)
    public final void method2595(class18 arg0, int arg1) {
        ++field5866;
        boolean var3 = false;
        boolean var23 = false;
        label384: {
            try {
                var23 = true;
                boolean var4 = false;
                if (arg1 == 20343) {
                    float var5 = 0.0F;
                    Object var6 = this.field5878;
                    byte var7;
                    synchronized (this.field5878) {
                        while (super.field4262 == 0) {
                            ++this.field5883;
                            this.field5878.wait();
                            --this.field5883;
                        }
                        var7 = super.field4273[super.field4264];
                        if (arg0.field326 < 0) {
                            if (var7 >= 0 && ~var7 >= -4) {
                                var3 = true;
                            }
                        } else if (~var7 > -1 || var7 > 3) {
                            var3 = true;
                        }
                        if (var3) {
                            arg0.field3520 = super.field4266[super.field4264];
                            var5 = super.field4269[super.field4264];
                            super.field4266[super.field4264] = null;
                            ++super.field4264;
                            --super.field4262;
                            if (~super.field4264 <= -5001) {
                                super.field4264 = 0;
                            }
                        }
                    }
                    if (!var3) {
                        Thread.yield();
                        var23 = false;
                    } else if (arg0.field326 >= 0) {
                        if (var7 == 21) {
                            class180.method1176(arg0, (class125) arg0.field3520);
                            var23 = false;
                        } else if (~var7 != -21) {
                            if (~var7 <= -31 && var7 <= 33) {
                                class387.field5557.method80(3000.0F, var5 * 1.5F);
                                ((class242) arg0.field3520).method731(class357.field4890, class405.field5768, class305.field4213, class194.field2654, ~(var7 + -30) == -1);
                                var23 = false;
                            } else if (var7 >= 40 && var7 <= 43) {
                                class387.field5557.method80(3000.0F, var5 * 1.5F);
                                ((class242) arg0.field3520).method731(class357.field4890, class405.field5768, class305.field4213, class34.field528, var7 + -40 == 0);
                                var23 = false;
                            } else if (var7 != 22) {
                                if (var7 != 23) {
                                    if (~var7 == -25) {
                                        class387.field5557.method113(0, (class24[]) null);
                                        var23 = false;
                                    } else if (var7 >= 10) {
                                        if (~var7 >= -14) {
                                            class387.field5557.method103(arg0.field326);
                                            arg0.field326 = -1;
                                            var23 = false;
                                        } else {
                                            var23 = false;
                                        }
                                    } else {
                                        var23 = false;
                                    }
                                } else {
                                    class387.field5557.method43();
                                    var23 = false;
                                }
                            } else {
                                class387.field5557.method111(-1, 1583160, 40);
                                var23 = false;
                            }
                        } else {
                            class125 var8 = (class125) arg0.field3520;
                            if (var8.field1756 != null) {
                                var8.field1756.method678(class387.field5557, -22948);
                            }
                            if (var8.field1761 != null) {
                                var8.field1761.method678(class387.field5557, -22948);
                            }
                            if (var8.field1740 != null) {
                                var8.field1740.method678(class387.field5557, arg1 ^ -5845);
                            }
                            if (var8.field1750 != null) {
                                var8.field1750.method678(class387.field5557, -22948);
                            }
                            if (var8.field1739 != null) {
                                var8.field1739.method678(class387.field5557, -22948);
                            }
                            for (class123 var9 = var8.field1749; var9 != null; var9 = var9.field1711) {
                                var9.field1709.method678(class387.field5557, arg1 + -43291);
                            }
                            var23 = false;
                        }
                    } else if (var7 >= 0) {
                        if (~var7 >= -4) {
                            arg0.field326 = var7;
                            class387.field5557.method110(var7);
                            var23 = false;
                        } else {
                            var23 = false;
                        }
                    } else {
                        var23 = false;
                    }
                    break label384;
                }
                Object var10000 = null;
                var23 = false;
            } catch (Exception var28) {
                var23 = false;
                break label384;
            } finally {
                if (var23) {
                    Object var15 = null;
                    if (var3) {
                        Object var16 = this.field5878;
                        synchronized (this.field5878) {
                            --super.field4276;
                            if (super.field4276 == 0) {
                                this.field5878.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field5878;
                synchronized (this.field5878) {
                    --super.field4276;
                    if (super.field4276 == 0) {
                        this.field5878.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field5878;
            synchronized (this.field5878) {
                --super.field4276;
                if (super.field4276 == 0) {
                    this.field5878.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V", line = 295)
    private final void method2596(int arg0, int arg1) {
        super.field4273[super.field4265] = (byte) arg0;
        ++field5880;
        ++super.field4265;
        ++super.field4276;
        ++super.field4262;
        if (super.field4265 >= 5000) {
            super.field4265 = 0;
        }
        if (~this.field5883 < -1) {
            Object var3 = this.field5878;
            synchronized (this.field5878) {
                this.field5878.notifyAll();
            }
        }
        if (arg1 != 0) {
            method2597(120);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 325)
    public static void method2597(int arg0) {
        if (arg0 == 9714) {
            field5875 = null;
            field5879 = null;
            field5864 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjd;)V", line = 339)
    public final void method2007(byte arg0, class125 arg1) {
        ++field5874;
        Object var3 = this.field5878;
        synchronized (this.field5878) {
            super.field4273[super.field4265] = 20;
            if (arg0 < -107) {
                super.field4266[super.field4265] = arg1;
                ++super.field4265;
                ++super.field4262;
                ++super.field4276;
                if (super.field4265 >= 5000) {
                    super.field4265 = 0;
                }
                if (~this.field5883 < -1) {
                    this.field5878.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 363)
    public final void method2011(int arg0, int arg1) {
        ++field5886;
        int var3 = 0;
        Object var4 = this.field5878;
        synchronized (this.field5878) {
            if (this.field5881 == arg1) {
                for (int var5 = 0; var5 < this.field5881; ++var5) {
                    this.method2596(var3++, 0);
                }
            } else {
                for (int var6 = 0; ~this.field5881 < ~var6; ++var6) {
                    this.field5884[var6].method252((byte) -92);
                }
                this.field5881 = arg1;
                this.field5884 = new class18[this.field5881];
                for (int var7 = 0; ~this.field5881 < ~var7; ++var7) {
                    this.field5884[var7] = new class18(this);
                    this.field5884[var7].method250(20716);
                    this.method2596(var3++, 0);
                }
                if (arg0 != -28353) {
                    this.field5884 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 415)
    public final void method2012(boolean arg0) {
        Object var2 = this.field5878;
        synchronized (this.field5878) {
            if (arg0) {
                this.method2593(31, -105);
            }
            int var3 = 0;
            while (true) {
                if (~this.field5881 >= ~var3) {
                    break;
                }
                if (~this.field5884[var3].field326 <= -1) {
                    this.method2593(123, this.field5884[var3].field326);
                }
                ++var3;
            }
        }
        ++field5871;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(FILij;ZI)V", line = 438)
    public final void method2008(float arg0, int arg1, class242 arg2, boolean arg3, int arg4) {
        Object var6 = this.field5878;
        synchronized (this.field5878) {
            super.field4273[super.field4265] = (byte) (!arg3 ? arg1 + 30 : arg1 + 40);
            super.field4266[super.field4265] = arg2;
            super.field4269[super.field4265] = arg0;
            ++super.field4265;
            ++super.field4276;
            ++super.field4262;
            if (super.field4265 >= arg4) {
                super.field4265 = 0;
            }
            if (~this.field5883 < -1) {
                this.field5878.notifyAll();
            }
        }
        ++field5876;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BB)Lks;", line = 472)
    public static final class253 method2598(byte[] arg0, byte arg1) {
        ++field5869;
        class253 var2 = new class253();
        int var3 = 48 / ((29 - arg1) / 53);
        class11 var4 = new class11(arg0);
        var4.field191 = var4.field230.length + -2;
        int var5 = var4.method174(255);
        int var6 = var4.field230.length - var5 + -14;
        var4.field191 = var6;
        int var7 = var4.method185(25239);
        var2.field3569 = var4.method174(255);
        var2.field3566 = var4.method174(255);
        var2.field3570 = var4.method174(255);
        var2.field3558 = var4.method174(255);
        int var8 = var4.method172((byte) 52);
        if (var8 > 0) {
            var2.field3567 = new class129[var8];
            for (int var9 = 0; var8 > var9; ++var9) {
                int var10 = var4.method174(255);
                class129 var11 = new class129(class438.method2748((byte) 119, var10));
                var2.field3567[var9] = var11;
                while (~(var10--) < -1) {
                    int var12 = var4.method185(25239);
                    int var13 = var4.method185(25239);
                    var11.method883((byte) -54, (long) var12, new class406(var13));
                }
            }
        }
        var4.field191 = 0;
        var2.field3562 = var4.method189(255);
        var2.field3571 = new int[var7];
        var2.field3565 = new String[var7];
        var2.field3557 = new int[var7];
        int var14 = 0;
        while (~var6 < ~var4.field191) {
            int var15 = var4.method174(255);
            if (~var15 != -4) {
                if (~var15 > -101 && var15 != 21 && ~var15 != -39 && ~var15 != -40) {
                    var2.field3571[var14] = var4.method185(25239);
                } else {
                    var2.field3571[var14] = var4.method172((byte) 52);
                }
            } else {
                var2.field3565[var14] = var4.method171(-9265).intern();
            }
            var2.field3557[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjd;)V", line = 560)
    public final void method2009(int arg0, class125 arg1) {
        ++field5872;
        Object var3 = this.field5878;
        synchronized (this.field5878) {
            --super.field4264;
            if (arg0 > super.field4264) {
                super.field4264 = 4999;
            }
            super.field4273[super.field4264] = 21;
            super.field4266[super.field4264] = arg1;
            ++super.field4276;
            ++super.field4262;
            if (~this.field5883 < -1) {
                this.field5878.notifyAll();
            }
        }
    }
}
