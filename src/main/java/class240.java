import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class240 implements Runnable {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lnk;")
    private class206 field3466 = new class206();

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
    private boolean field3476 = false;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field3473 = 0;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3477;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3463 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ldp;")
    public static class174 field3469;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BILuf;)Lrl;")
    public final class263 method1747(int arg0, byte[] arg1, int arg2, class281 arg3) {
        field3475++;
        class263 var5 = new class263();
        var5.field3958 = arg1;
        var5.field2671 = (long) arg0;
        if (arg2 != 30361) {
            this.field3473 = -30;
        }
        var5.field3955 = arg3;
        var5.field5052 = false;
        var5.field3959 = 2;
        this.method1751(var5, arg2 - 30289);
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3476) {
            class206 var1 = this.field3466;
            class263 var2;
            synchronized (this.field3466) {
                var2 = (class263) this.field3466.method1558(-2);
                if (var2 == null) {
                    try {
                        this.field3466.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3473--;
            }
            try {
                if (var2.field3959 == 2) {
                    var2.field3955.method1991(-112, var2.field3958, (int) var2.field2671, var2.field3958.length);
                } else if (var2.field3959 == 3) {
                    var2.field3958 = var2.field3955.method1997(22359, (int) var2.field2671);
                }
            } catch (Exception var7) {
                class282.method2003((String) null, -24830, var7);
            }
            var2.field5053 = false;
        }
        field3464++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1748(int arg0) {
        if (arg0 != 0) {
            field3469 = null;
        }
        field3469 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLpe;Z)V")
    public static final void method1749(byte arg0, class390 arg1, boolean arg2) {
        field3468++;
        class419 var3 = arg1.method2476((byte) 75);
        if (arg1.field5695 == 0) {
            class399.field5870 = 0;
            arg1.field5693 = 0;
            class73.field1223 = -1;
            return;
        }
        if (arg1.field5620 != -1 && arg1.field5647 == 0) {
            class51 var4 = class113.method974(arg1.field5620, (byte) -95);
            if (arg1.field5698 > 0 && var4.field848 == 0) {
                arg1.field5693++;
                class399.field5870 = 0;
                class73.field1223 = -1;
                return;
            }
            if (arg1.field5698 <= 0 && var4.field839 == 0) {
                class73.field1223 = -1;
                class399.field5870 = 0;
                arg1.field5693++;
                return;
            }
        }
        if (arg0 >= -43) {
            return;
        }
        if (arg1.field5683 != -1 && arg1.field5605 <= class267.field4002) {
            class389 var5 = class321.method2140(arg1.field5683, (byte) -115);
            if (var5.field5590 && var5.field5597 != -1) {
                class51 var6 = class113.method974(var5.field5597, (byte) -74);
                if (arg1.field5698 > 0 && var6.field848 == 0) {
                    class73.field1223 = -1;
                    class399.field5870 = 0;
                    arg1.field5693++;
                    return;
                }
                if (arg1.field5698 <= 0 && var6.field839 == 0) {
                    arg1.field5693++;
                    class399.field5870 = 0;
                    class73.field1223 = -1;
                    return;
                }
            }
        }
        int var7 = arg1.field6520;
        int var8 = arg1.field6519;
        int var9 = arg1.field5694[arg1.field5695 - 1] * 128 + (arg1.method1070((byte) -50) * 64);
        int var10 = arg1.field5696[arg1.field5695 - 1] * 128 + arg1.method1070((byte) -50) * 64;
        if (!arg2 && var9 - var7 > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || var10 - var8 < -256) {
            arg1.field6520 = var9;
            class399.field5870 = 0;
            class73.field1223 = -1;
            arg1.field6519 = var10;
            return;
        }
        if (var9 <= var7) {
            if (var7 <= var9) {
                if (var10 > var8) {
                    arg1.method2469(-16384, 8192);
                } else if (var8 > var10) {
                    arg1.method2469(-16384, 0);
                }
            } else if (var10 > var8) {
                arg1.method2469(-16384, 6144);
            } else if (var8 <= var10) {
                arg1.method2469(-16384, 4096);
            } else {
                arg1.method2469(-16384, 2048);
            }
        } else if (var10 > var8) {
            arg1.method2469(-16384, 10240);
        } else if (var8 > var10) {
            arg1.method2469(-16384, 14336);
        } else {
            arg1.method2469(-16384, 12288);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg1 instanceof class98) {
            var12 = ((class98) arg1).field1545.field145;
        }
        if (var12) {
            int var13 = arg1.field5606 - arg1.field5623.field1305;
            if (var13 != 0 && arg1.field5625 == -1 && arg1.field5650 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg1.field5695 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg1.field5695 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg1.field5695 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg1.field5695 > 2) {
                var11 = 8;
            }
        }
        if (arg1.field5693 > 0 && arg1.field5695 > 1) {
            var11 = 8;
            arg1.field5693--;
        }
        byte var14 = arg1.field5701[arg1.field5695 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        class399.field5870 = 0;
        if (var3.field6075 != -1) {
            int var15 = var11 << 7;
            if (arg1.field5695 == 1) {
                int var16 = arg1.field5699 * arg1.field5699;
                int var17 = (arg1.field6520 <= var9 ? var9 - arg1.field6520 : arg1.field6520 - var9) << 7;
                int var18 = (arg1.field6519 > var10 ? arg1.field6519 - var10 : var10 - arg1.field6519) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var3.field6075 * 2 * var19;
                if (var20 < var16) {
                    arg1.field5699 /= 2;
                } else if (var16 / 2 > var19) {
                    arg1.field5699 -= var3.field6075;
                    if (arg1.field5699 < 0) {
                        arg1.field5699 = 0;
                    }
                } else if (var15 > arg1.field5699) {
                    arg1.field5699 += var3.field6075;
                    if (var15 < arg1.field5699) {
                        arg1.field5699 = var15;
                    }
                }
            } else if (var15 > arg1.field5699) {
                arg1.field5699 += var3.field6075;
                if (arg1.field5699 > var15) {
                    arg1.field5699 = var15;
                }
            } else if (arg1.field5699 > 0) {
                arg1.field5699 -= var3.field6075;
                if (arg1.field5699 < 0) {
                    arg1.field5699 = 0;
                }
            }
            var11 = arg1.field5699 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var7 < var9) {
            class399.field5870 |= 0x4;
            arg1.field6520 += var11;
            if (var9 < arg1.field6520) {
                arg1.field6520 = var9;
            }
        } else if (var9 < var7) {
            class399.field5870 |= 0x8;
            arg1.field6520 -= var11;
            if (var9 > arg1.field6520) {
                arg1.field6520 = var9;
            }
        }
        if (var10 > var8) {
            class399.field5870 |= 0x1;
            arg1.field6519 += var11;
            if (arg1.field6519 > var10) {
                arg1.field6519 = var10;
            }
        } else if (var10 < var8) {
            arg1.field6519 -= var11;
            class399.field5870 |= 0x2;
            if (arg1.field6519 < var10) {
                arg1.field6519 = var10;
            }
        }
        if (arg1.field6520 == var9 && arg1.field6519 == var10) {
            arg1.field5695--;
            if (arg1.field5698 > 0) {
                arg1.field5698--;
            }
        }
        if (var11 >= 8) {
            class73.field1223 = 2;
        } else {
            class73.field1223 = var14;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILuf;)Lrl;")
    public final class263 method1750(int arg0, int arg1, class281 arg2) {
        field3462++;
        class263 var4 = new class263();
        var4.field5052 = false;
        if (arg0 >= -11) {
            this.field3473 = -42;
        }
        var4.field2671 = (long) arg1;
        var4.field3955 = arg2;
        var4.field3959 = 3;
        this.method1751(var4, 3);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrl;I)V")
    private final void method1751(class263 arg0, int arg1) {
        field3474++;
        class206 var3 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.method1564((byte) 106, arg0);
            this.field3473++;
            this.field3466.notifyAll();
        }
        if (arg1 <= 0) {
            method1748(-109);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public final void method1752(byte arg0) {
        this.field3476 = true;
        field3472++;
        int var2 = 54 % ((-arg0 - 80) / 42);
        class206 var3 = this.field3466;
        synchronized (this.field3466) {
            this.field3466.notifyAll();
        }
        try {
            this.field3477.join();
        } catch (InterruptedException var4) {
        }
        this.field3477 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IILuf;)Lrl;")
    public final class263 method1753(int arg0, int arg1, class281 arg2) {
        field3465++;
        class263 var4 = new class263();
        var4.field3959 = 1;
        class206 var5 = this.field3466;
        synchronized (this.field3466) {
            if (arg0 != 2048) {
                return null;
            }
            class263 var7 = (class263) this.field3466.method1565(arg0 ^ 0x801);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg1 == var7.field2671 && var7.field3955 == arg2 && var7.field3959 == 2) {
                    var4.field5053 = false;
                    var4.field3958 = var7.field3958;
                    return var4;
                }
                var7 = (class263) this.field3466.method1562(-4);
            }
        }
        var4.field3958 = arg2.method1997(22359, arg1);
        var4.field5053 = false;
        var4.field5052 = true;
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BC)Z")
    public static final boolean method1754(byte arg0, char arg1) {
        if (arg0 != -91) {
            method1748(79);
        }
        field3471++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public static final void method1755(int arg0, byte arg1) {
        field3470++;
        client.field3636.method104(arg0, (byte) -34);
        if (arg1 != 52) {
            method1748(27);
        }
        class30.field436.method104(arg0, (byte) -34);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lvj;)V")
    public class240(class177 arg0) {
        class131 var2 = arg0.method1384(this, true, 5);
        while (var2.field2121 == 0) {
            class134.method1106(10L, 10);
        }
        if (var2.field2121 == 2) {
            throw new RuntimeException();
        }
        this.field3477 = (Thread) var2.field2125;
    }
}
