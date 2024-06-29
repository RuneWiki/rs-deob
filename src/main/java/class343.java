import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class343 extends class293 {

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field4905 = new Object();

    @OriginalMember(owner = "client!t", name = "x", descriptor = "[Lia;")
    private class392[] field4910 = new class392[0];

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    private int field4914 = 0;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field4919 = 0;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4907 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4920;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
    private final void method2081(boolean arg0, int arg1) {
        super.field4353[super.field4362] = (byte) (arg1 + 10);
        ++field4917;
        ++super.field4362;
        if (!arg0) {
            field4907 = null;
        }
        if (~super.field4362 <= -5001) {
            super.field4362 = 0;
        }
        ++super.field4352;
        ++super.field4354;
        if (~this.field4914 < -1) {
            Object var3 = this.field4905;
            synchronized (this.field4905) {
                this.field4905.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)B")
    public static final byte method2082(int arg0, int arg1, int arg2) {
        ++field4901;
        if (~arg1 != -10) {
            return 0;
        } else {
            if (arg0 <= 125) {
                method2087((byte) 118, (class51) null, (byte[][]) null);
            }
            return (byte) (~(arg2 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZLmi;F)V")
    public final void method709(int arg0, int arg1, boolean arg2, class443 arg3, float arg4) {
        Object var6 = this.field4905;
        synchronized (this.field4905) {
            super.field4353[super.field4362] = (byte) (!arg2 ? arg1 + 30 : arg1 + 40);
            super.field4358[super.field4362] = arg3;
            if (arg0 != 5) {
                this.method708(-3, -17);
            }
            super.field4357[super.field4362] = arg4;
            ++super.field4362;
            ++super.field4352;
            if (~super.field4362 <= -5001) {
                super.field4362 = 0;
            }
            ++super.field4354;
            if (this.field4914 > 0) {
                this.field4905.notifyAll();
            }
        }
        ++field4918;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
    public final void method708(int arg0, int arg1) {
        ++field4900;
        int var3 = 0;
        Object var4 = this.field4905;
        synchronized (this.field4905) {
            if (this.field4919 == arg1) {
                for (int var5 = 0; this.field4919 > var5; ++var5) {
                    this.method2083(70, var3++);
                }
                return;
            }
            for (int var6 = 0; this.field4919 > var6; ++var6) {
                this.field4910[var6].method2356(5);
            }
            this.field4919 = arg1;
            this.field4910 = new class392[this.field4919];
            int var7 = 0;
            while (true) {
                if (~this.field4919 >= ~var7) {
                    break;
                }
                this.field4910[var7] = new class392(this);
                this.field4910[var7].method2355((byte) 83);
                this.method2083(arg0 + 76, var3++);
                ++var7;
            }
        }
        if (arg0 != 14) {
            method2087((byte) 100, (class51) null, (byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
    private final void method2083(int arg0, int arg1) {
        ++field4913;
        super.field4353[super.field4362] = (byte) arg1;
        ++super.field4362;
        if (super.field4362 >= 5000) {
            super.field4362 = 0;
        }
        ++super.field4354;
        ++super.field4352;
        if (~this.field4914 < -1) {
            Object var3 = this.field4905;
            synchronized (this.field4905) {
                this.field4905.notifyAll();
            }
        }
        if (arg0 < 42) {
            method2082(-116, 73, 3);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIII)V")
    public static final void method2084(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; class358.field5172 > var5; ++var5) {
            Rectangle var6 = class18.field235[var5];
            if (arg1 < var6.x + var6.width && arg1 + arg2 > var6.x && var6.y - -var6.height > arg3 && var6.y < arg3 + arg4) {
                class61.field764[var5] = true;
            }
        }
        if (!arg0) {
            method2088(false);
        }
        ++field4912;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method710(int arg0) {
        if (arg0 != 100) {
            this.method709(78, -80, false, (class443) null, -1.1657232F);
        }
        try {
            Object var2 = this.field4905;
            synchronized (this.field4905) {
                while (~super.field4354 != -1) {
                    this.field4905.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field4915;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILqa;)V")
    public final void method713(int arg0, class263 arg1) {
        Object var3 = this.field4905;
        synchronized (this.field4905) {
            --super.field4351;
            if (~super.field4351 > -1) {
                super.field4351 = 4999;
            }
            super.field4353[super.field4351] = 21;
            super.field4358[super.field4351] = arg1;
            ++super.field4354;
            ++super.field4352;
            if (~this.field4914 < -1) {
                this.field4905.notifyAll();
            }
        }
        int var4 = 68 % ((arg0 - 7) / 57);
        ++field4904;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Lqa;I)V")
    public final void method714(class263 arg0, int arg1) {
        Object var3 = this.field4905;
        synchronized (this.field4905) {
            super.field4353[super.field4362] = 21;
            super.field4358[super.field4362] = arg0;
            ++super.field4362;
            ++super.field4352;
            if (~super.field4362 <= -5001) {
                super.field4362 = 0;
            }
            if (arg1 < 66) {
                return;
            }
            ++super.field4354;
            if (this.field4914 > 0) {
                this.field4905.notifyAll();
            }
        }
        ++field4916;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lia;B)V")
    public final void method2085(class392 arg0, byte arg1) {
        ++field4908;
        boolean var3 = false;
        if (arg1 != 21) {
            this.field4910 = null;
        }
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field4905;
            byte var7;
            synchronized (this.field4905) {
                while (super.field4352 == 0) {
                    ++this.field4914;
                    this.field4905.wait();
                    --this.field4914;
                }
                var7 = super.field4353[super.field4351];
                if (~arg0.field5582 > -1) {
                    if (var7 >= 0 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (~var7 > -1 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field3722 = super.field4358[super.field4351];
                    var5 = super.field4357[super.field4351];
                    super.field4358[super.field4351] = null;
                    ++super.field4351;
                    if (super.field4351 >= 5000) {
                        super.field4351 = 0;
                    }
                    --super.field4352;
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg0.field5582 >= 0) {
                if (var7 == 21) {
                    class80.method402(arg0, (class263) arg0.field3722);
                } else if (var7 == 20) {
                    class263 var8 = (class263) arg0.field3722;
                    if (var8.field3783 != null) {
                        var8.field3783.method27(arg1 ^ 21, class415.field5985);
                    }
                    if (var8.field3780 != null) {
                        var8.field3780.method27(0, class415.field5985);
                    }
                    if (var8.field3784 != null) {
                        var8.field3784.method27(0, class415.field5985);
                    }
                    if (var8.field3782 != null) {
                        var8.field3782.method27(0, class415.field5985);
                    }
                    if (var8.field3798 != null) {
                        var8.field3798.method27(arg1 ^ 21, class415.field5985);
                    }
                    for (class248 var9 = var8.field3801; var9 != null; var9 = var9.field3490) {
                        var9.field3487.method27(0, class415.field5985);
                    }
                } else if (~var7 <= -31 && ~var7 >= -34) {
                    class415.field5985.method1498(3000.0F, var5 * 1.5F);
                    ((class443) arg0.field3722).method1867(class352.field5065, class25.field345, class218.field3071, class115.field1413, ~(var7 + -30) == -1);
                } else if (var7 >= 40 && ~var7 >= -44) {
                    class415.field5985.method1498(3000.0F, var5 * 1.5F);
                    ((class443) arg0.field3722).method1867(class352.field5065, class25.field345, class218.field3071, class241.field3311, ~(var7 + -40) == -1);
                } else if (~var7 != -23) {
                    if (~var7 == -24) {
                        class415.field5985.method1480();
                    } else if (~var7 == -25) {
                        class415.field5985.method1370(0, (class190[]) null);
                    } else if (var7 >= 10 && var7 <= 13) {
                        class415.field5985.method1408(arg0.field5582);
                        arg0.field5582 = -1;
                    }
                } else {
                    class415.field5985.method1482(-1, 1583160, 40, 127);
                }
            } else if (var7 >= 0 && var7 <= 3) {
                arg0.field5582 = var7;
                class415.field5985.method1381(var7);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field4905;
                synchronized (this.field4905) {
                    --super.field4354;
                    if (~super.field4354 == -1) {
                        this.field4905.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqa;I)V")
    public final void method715(class263 arg0, int arg1) {
        ++field4903;
        Object var3 = this.field4905;
        synchronized (this.field4905) {
            super.field4353[super.field4362] = 20;
            super.field4358[super.field4362] = arg0;
            ++super.field4362;
            ++super.field4354;
            ++super.field4352;
            if (~super.field4362 <= -5001) {
                super.field4362 = 0;
            }
            if (arg1 > -63) {
                this.method706(-54, 43);
            }
            if (~this.field4914 < -1) {
                this.field4905.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method2086(byte arg0) {
        field4920 = null;
        field4907 = null;
        if (arg0 != -66) {
            method2087((byte) -63, (class51) null, (byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public final void method716(int arg0) {
        ++field4906;
        Object var2 = this.field4905;
        synchronized (this.field4905) {
            int var3 = 0;
            while (true) {
                if (~var3 <= ~this.field4919) {
                    break;
                }
                if (this.field4910[var3].field5582 >= 0) {
                    this.method2081(true, this.field4910[var3].field5582);
                }
                ++var3;
            }
        }
        if (arg0 != -31042) {
            this.method714((class263) null, -57);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
    public final void method706(int arg0, int arg1) {
        ++field4911;
        Object var3 = this.field4905;
        synchronized (this.field4905) {
            super.field4353[super.field4362] = (byte) arg1;
            ++super.field4362;
            if (arg0 != -8173) {
                field4907 = null;
            }
            ++super.field4354;
            ++super.field4352;
            if (~super.field4362 <= -5001) {
                super.field4362 = 0;
            }
            if (this.field4914 > 0) {
                this.field4905.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLkt;[[B)V")
    public static final void method2087(byte arg0, class51 arg1, byte[][] arg2) {
        ++field4909;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class179 var11 = new class179(var10);
                int var12 = class217.field3034[var5] >> 8;
                int var13 = class217.field3034[var5] & 255;
                int var14 = var12 * 64 + -class93.field1163;
                int var15 = var13 * 64 + -class349.field5023;
                class199.method1094((byte) -47);
                arg1.method1072(var14, class349.field5023, class174.field2093, class93.field1163, var15, -19305, var11);
                arg1.method274(var3, var11, class231.field3205, (byte) -105, var14, var15);
                if (!arg1.field2692 && ~(class366.field5243 / 8) == ~var12 && class312.field4565 / 8 == var13) {
                    if (var3[0] == -1) {
                        class381.field5395 = null;
                    } else {
                        class381.field5395 = class128.field1576.method1325(var3[0], var3[1], class459.field6482, var3[2], var3[3], (byte) -126);
                        class352.field5064 = var3[4];
                    }
                }
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class217.field3034[var6] >> 8) * 64 + -class93.field1163;
            int var8 = (class217.field3034[var6] & 255) * 64 + -class349.field5023;
            byte[] var9 = arg2[var6];
            if (var9 == null && ~class312.field4565 > -801) {
                class199.method1094((byte) -47);
                arg1.method1061(var7, 64, var8, (byte) -117, 64);
            }
        }
        if (arg0 <= 18) {
            method2087((byte) 20, (class51) null, (byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)Ldf;")
    public static final class89 method2088(boolean arg0) {
        ++field4902;
        class89 var1 = (class89) class183.field2358.method2862(2);
        if (var1 != null) {
            var1.method702((byte) -114);
            var1.method104((byte) -80);
            return var1;
        } else {
            if (arg0) {
                field4907 = null;
            }
            class89 var2;
            do {
                var2 = (class89) class388.field5549.method2862(2);
                if (var2 == null) {
                    return null;
                }
                if (var2.method450((byte) -65) > class434.method2591(-19310)) {
                    return null;
                }
                var2.method702((byte) -114);
                var2.method104((byte) -61);
            } while (~(var2.field199 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }
}
