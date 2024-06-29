import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class99 extends class301 {

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field1709 = new Object();

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    private int field1720 = 0;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "[Lkg;")
    private class57[] field1723 = new class57[0];

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    private int field1721 = 0;

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "Z")
    public static boolean field1724 = false;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!aaa", name = "H", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "[[I")
    public static int[][] field1716;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILkg;)V")
    public final void method845(int arg0, class57 arg1) {
        ++field1711;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = (float) arg0;
            Object var6 = this.field1709;
            byte var7;
            synchronized (this.field1709) {
                while (super.field4341 == 0) {
                    ++this.field1721;
                    this.field1709.wait();
                    --this.field1721;
                }
                var7 = super.field4343[super.field4351];
                if (~arg1.field811 <= -1) {
                    if (var7 < 0 || ~var7 < -4) {
                        var3 = true;
                    }
                } else if (~var7 <= -1 && var7 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field9389 = super.field4350[super.field4351];
                    var5 = super.field4342[super.field4351];
                    super.field4350[super.field4351] = null;
                    ++super.field4351;
                    --super.field4341;
                    if (~super.field4351 <= -5001) {
                        super.field4351 = 0;
                    }
                }
            }
            if (var3) {
                if (arg1.field811 >= 0) {
                    if (~var7 != -22) {
                        if (var7 == 20) {
                            class184 var8 = (class184) arg1.field9389;
                            if (var8.field2669 != null) {
                                var8.field2669.method266(class103.field1747, (byte) -40);
                            }
                            if (var8.field2653 != null) {
                                var8.field2653.method266(class103.field1747, (byte) -40);
                            }
                            if (var8.field2672 != null) {
                                var8.field2672.method266(class103.field1747, (byte) -40);
                            }
                            if (var8.field2666 != null) {
                                var8.field2666.method266(class103.field1747, (byte) -40);
                            }
                            if (var8.field2662 != null) {
                                var8.field2662.method266(class103.field1747, (byte) -40);
                            }
                            for (class277 var9 = var8.field2675; var9 != null; var9 = var9.field4045) {
                                var9.field4044.method266(class103.field1747, (byte) -40);
                            }
                        } else if (~var7 <= -31 && ~var7 >= -34) {
                            class103.field1747.method517(3000.0F, var5 * 1.5F);
                            ((class542) arg1.field9389).method691(class119.field1913, class389.field5811, class90.field1610, class183.field2645, ~(var7 + -30) == -1);
                        } else if (~var7 <= -41 && var7 <= 43) {
                            class103.field1747.method517(3000.0F, var5 * 1.5F);
                            ((class542) arg1.field9389).method691(class119.field1913, class389.field5811, class90.field1610, class604.field8600, var7 + -40 == 0);
                        } else if (~var7 != -23) {
                            if (var7 == 23) {
                                class103.field1747.method585();
                            } else if (~var7 != -25) {
                                if (~var7 <= -11 && var7 <= 13) {
                                    class103.field1747.method399(arg1.field811);
                                    arg1.field811 = -1;
                                }
                            } else {
                                class103.field1747.method586(0, (class637[]) null);
                            }
                        } else {
                            class103.field1747.method658(-1, 1583160, 40, 127);
                        }
                    } else {
                        class536.method3022(arg1, (class184) arg1.field9389);
                    }
                } else if (~var7 <= -1 && ~var7 >= -4) {
                    arg1.field811 = var7;
                    class103.field1747.method398(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field1709;
                synchronized (this.field1709) {
                    --super.field4345;
                    if (super.field4345 == 0) {
                        this.field1709.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
    public final void method846(byte arg0, int arg1) {
        ++field1718;
        Object var3 = this.field1709;
        synchronized (this.field1709) {
            int var4 = 46 % ((16 - arg0) / 57);
            super.field4343[super.field4340] = (byte) arg1;
            ++super.field4340;
            ++super.field4345;
            ++super.field4341;
            if (super.field4340 >= 5000) {
                super.field4340 = 0;
            }
            if (~this.field1721 < -1) {
                this.field1709.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
    private final void method847(boolean arg0, int arg1) {
        if (!arg0) {
            method856(-105);
        }
        super.field4343[super.field4340] = (byte) arg1;
        ++field1715;
        ++super.field4340;
        if (~super.field4340 <= -5001) {
            super.field4340 = 0;
        }
        ++super.field4341;
        ++super.field4345;
        if (~this.field1721 < -1) {
            Object var3 = this.field1709;
            synchronized (this.field1709) {
                this.field1709.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLsa;FII)V")
    public final void method848(boolean arg0, class542 arg1, float arg2, int arg3, int arg4) {
        ++field1719;
        Object var6 = this.field1709;
        synchronized (this.field1709) {
            super.field4343[super.field4340] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
            super.field4350[super.field4340] = arg1;
            if (arg4 == 5357) {
                super.field4342[super.field4340] = arg2;
                ++super.field4340;
                ++super.field4345;
                if (super.field4340 >= 5000) {
                    super.field4340 = 0;
                }
                ++super.field4341;
                if (~this.field1721 < -1) {
                    this.field1709.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
    public final void method849(byte arg0) {
        ++field1712;
        try {
            Object var2 = this.field1709;
            synchronized (this.field1709) {
                if (arg0 >= -76) {
                    method856(70);
                }
                while (super.field4345 != 0) {
                    this.field1709.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lbr;B)V")
    public final void method850(class184 arg0, byte arg1) {
        int var3 = -111 % ((arg1 - -34) / 37);
        Object var4 = this.field1709;
        synchronized (this.field1709) {
            --super.field4351;
            if (~super.field4351 > -1) {
                super.field4351 = 4999;
            }
            super.field4343[super.field4351] = 21;
            super.field4350[super.field4351] = arg0;
            ++super.field4341;
            ++super.field4345;
            if (this.field1721 > 0) {
                this.field1709.notifyAll();
            }
        }
        ++field1713;
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
    public static void method851(byte arg0) {
        if (arg0 == 96) {
            field1716 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILbr;)V")
    public final void method852(int arg0, class184 arg1) {
        Object var3 = this.field1709;
        synchronized (this.field1709) {
            super.field4343[super.field4340] = 20;
            super.field4350[super.field4340] = arg1;
            ++super.field4340;
            if (super.field4340 >= 5000) {
                super.field4340 = 0;
            }
            ++super.field4341;
            ++super.field4345;
            if (~this.field1721 < -1) {
                this.field1709.notifyAll();
            }
        }
        if (arg0 != 6186) {
            this.field1720 = -67;
        }
        ++field1725;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V")
    public final void method853(int arg0, byte arg1) {
        ++field1717;
        int var3 = 0;
        Object var4 = this.field1709;
        synchronized (this.field1709) {
            if (this.field1720 == arg0) {
                for (int var5 = 0; ~this.field1720 < ~var5; ++var5) {
                    this.method847(true, var3++);
                }
            } else if (arg1 == -98) {
                for (int var6 = 0; this.field1720 > var6; ++var6) {
                    this.field1723[var6].method464(1);
                }
                this.field1720 = arg0;
                this.field1723 = new class57[this.field1720];
                for (int var7 = 0; var7 < this.field1720; ++var7) {
                    this.field1723[var7] = new class57(this);
                    this.field1723[var7].method462(79);
                    this.method847(true, var3++);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLbr;)V")
    public final void method854(boolean arg0, class184 arg1) {
        Object var3 = this.field1709;
        synchronized (this.field1709) {
            super.field4343[super.field4340] = 21;
            super.field4350[super.field4340] = arg1;
            ++super.field4340;
            if (super.field4340 >= 5000) {
                super.field4340 = 0;
            }
            ++super.field4341;
            ++super.field4345;
            if (~this.field1721 < -1) {
                this.field1709.notifyAll();
            }
            if (!arg0) {
                this.field1709 = null;
            }
        }
        ++field1726;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public final void method855(int arg0) {
        if (arg0 > -28) {
            this.method850((class184) null, (byte) 30);
        }
        ++field1710;
        Object var2 = this.field1709;
        synchronized (this.field1709) {
            for (int var3 = 0; ~this.field1720 < ~var3; ++var3) {
                if (~this.field1723[var3].field811 <= -1) {
                    this.method857(0, this.field1723[var3].field811);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)Lvg;")
    public static final class75 method856(int arg0) {
        ++field1714;
        if (arg0 != 0) {
            field1724 = false;
        }
        try {
            return new class486();
        } catch (Throwable var2) {
            try {
                return (class75) Class.forName("aa").newInstance();
            } catch (Throwable var1) {
                return new class610();
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
    private final void method857(int arg0, int arg1) {
        ++field1722;
        super.field4343[super.field4340] = (byte) (arg1 - -10);
        ++super.field4340;
        if (super.field4340 >= 5000) {
            super.field4340 = 0;
        }
        ++super.field4341;
        ++super.field4345;
        if (arg0 < this.field1721) {
            Object var3 = this.field1709;
            synchronized (this.field1709) {
                this.field1709.notifyAll();
            }
        }
    }

    static {
        new class567("Player ", "Spieler ", "Joueur ", "Jogador ");
    }
}
