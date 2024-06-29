import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class51 extends class439 {

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field598 = new Object();

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private int field604 = 0;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "[Lwj;")
    private class200[] field602 = new class200[0];

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    private int field608 = 0;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field597;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILos;)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, class337 arg4) {
        arg4.field4596 = (arg1 << 7) + 64;
        arg4.field4586 = arg3;
        arg4.field4594 = (arg2 << 7) + 64;
        class316 var5 = class347.field4722[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class272 var7 = var5.field4256; var7 != null; var7 = var7.field3514) {
                if (var7.field3512.field1522) {
                    int var8 = var7.field3512.method246((byte) 110);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field4586 += var6;
                arg4.field4588 = true;
            }
        }
        if (class347.field4722[arg0][arg1][arg2] == null) {
            class75.method443(arg0, arg1, arg2);
        }
        class347.field4722[arg0][arg1][arg2].field4254 = arg4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILsq;)V")
    public final void method282(int arg0, class316 arg1) {
        Object var3 = this.field598;
        synchronized (this.field598) {
            if (arg0 > -5) {
                field597 = null;
            }
            super.field6040[super.field6034] = 21;
            super.field6031[super.field6034] = arg1;
            ++super.field6034;
            ++super.field6037;
            ++super.field6039;
            if (super.field6034 >= 5000) {
                super.field6034 = 0;
            }
            if (this.field604 > 0) {
                this.field598.notifyAll();
            }
        }
        ++field601;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLip;FZI)V")
    public final void method283(boolean arg0, class279 arg1, float arg2, boolean arg3, int arg4) {
        ++field589;
        Object var6 = this.field598;
        synchronized (this.field598) {
            super.field6040[super.field6034] = (byte) (arg3 ? arg4 + 40 : arg4 + 30);
            super.field6031[super.field6034] = arg1;
            super.field6038[super.field6034] = arg2;
            ++super.field6034;
            ++super.field6037;
            if (super.field6034 >= 5000) {
                super.field6034 = 0;
            }
            ++super.field6039;
            if (~this.field604 < -1) {
                this.field598.notifyAll();
            }
            if (arg0) {
                method296((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
    private final void method284(int arg0, byte arg1) {
        ++field599;
        if (arg1 <= 61) {
            field593 = -25;
        }
        super.field6040[super.field6034] = (byte) (arg0 + 10);
        ++super.field6034;
        ++super.field6039;
        if (~super.field6034 <= -5001) {
            super.field6034 = 0;
        }
        ++super.field6037;
        if (~this.field604 < -1) {
            Object var3 = this.field598;
            synchronized (this.field598) {
                this.field598.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method285(int arg0) {
        field597 = null;
        if (arg0 != -1) {
            field597 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public final void method286(byte arg0) {
        ++field607;
        try {
            Object var2 = this.field598;
            synchronized (this.field598) {
                while (super.field6039 != 0) {
                    this.field598.wait();
                }
                if (arg0 <= 3) {
                    field593 = 47;
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lwj;B)V")
    public final void method287(class200 arg0, byte arg1) {
        ++field605;
        boolean var3 = false;
        try {
            boolean var4 = false;
            if (arg1 <= 90) {
                this.field598 = null;
            }
            float var5 = 0.0F;
            Object var6 = this.field598;
            byte var7;
            synchronized (this.field598) {
                while (~super.field6037 == -1) {
                    ++this.field604;
                    this.field598.wait();
                    --this.field604;
                }
                var7 = super.field6040[super.field6036];
                if (~arg0.field2358 > -1) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || var7 > 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field496 = super.field6031[super.field6036];
                    var5 = super.field6038[super.field6036];
                    super.field6031[super.field6036] = null;
                    ++super.field6036;
                    if (~super.field6036 <= -5001) {
                        super.field6036 = 0;
                    }
                    --super.field6037;
                }
            }
            if (var3) {
                if (~arg0.field2358 > -1) {
                    if (~var7 <= -1 && var7 <= 3) {
                        arg0.field2358 = var7;
                        class131.field1498.method759(var7);
                    }
                } else if (~var7 != -22) {
                    if (var7 == 20) {
                        class316 var8 = (class316) arg0.field496;
                        if (var8.field4268 != null) {
                            var8.field4268.method138((byte) 99, class131.field1498);
                        }
                        if (var8.field4269 != null) {
                            var8.field4269.method138((byte) 97, class131.field1498);
                        }
                        if (var8.field4259 != null) {
                            var8.field4259.method138((byte) 96, class131.field1498);
                        }
                        if (var8.field4266 != null) {
                            var8.field4266.method138((byte) 121, class131.field1498);
                        }
                        if (var8.field4255 != null) {
                            var8.field4255.method138((byte) 126, class131.field1498);
                        }
                        for (class272 var9 = var8.field4256; var9 != null; var9 = var9.field3514) {
                            var9.field3512.method138((byte) 82, class131.field1498);
                        }
                    } else if (var7 >= 30 && ~var7 >= -34) {
                        class131.field1498.method773(3000.0F, var5 * 1.5F);
                        ((class279) arg0.field496).method1046(class325.field4341, class121.field1381, class347.field4720, class140.field1628, var7 + -30 == 0);
                    } else if (~var7 <= -41 && ~var7 >= -44) {
                        class131.field1498.method773(3000.0F, var5 * 1.5F);
                        ((class279) arg0.field496).method1046(class325.field4341, class121.field1381, class347.field4720, class446.field6218, ~(var7 + -40) == -1);
                    } else if (var7 == 22) {
                        class131.field1498.method686(-1, 1583160, 40);
                    } else if (~var7 == -24) {
                        class131.field1498.method710();
                    } else if (var7 == 24) {
                        class131.field1498.method784(0, (class92[]) null);
                    } else if (var7 >= 10 && ~var7 >= -14) {
                        class131.field1498.method743(arg0.field2358);
                        arg0.field2358 = -1;
                    }
                } else {
                    class137.method884(arg0, (class316) arg0.field496);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field598;
                synchronized (this.field598) {
                    --super.field6039;
                    if (~super.field6039 == -1) {
                        this.field598.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IB)V")
    private final void method288(int arg0, byte arg1) {
        int var3 = 4 % (arg1 / 59);
        super.field6040[super.field6034] = (byte) arg0;
        ++field603;
        ++super.field6034;
        ++super.field6037;
        ++super.field6039;
        if (super.field6034 >= 5000) {
            super.field6034 = 0;
        }
        if (this.field604 > 0) {
            Object var4 = this.field598;
            synchronized (this.field598) {
                this.field598.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)I")
    public static final int method289(byte arg0, int arg1) {
        if (arg0 != 44) {
            method293(false, (byte) -40);
        }
        ++field606;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIIIII)V")
    public static final void method290(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field588;
        int var7 = class65.method376(class53.field624, class118.field1356, arg6, (byte) -117);
        if (arg1 == -59) {
            int var8 = class65.method376(class53.field624, class118.field1356, arg4, (byte) 109);
            int var9 = class65.method376(class295.field3937, class427.field5844, arg5, (byte) 85);
            int var10 = class65.method376(class295.field3937, class427.field5844, arg0, (byte) -50);
            int var11 = class65.method376(class53.field624, class118.field1356, arg3 + arg6, (byte) 127);
            int var12 = class65.method376(class53.field624, class118.field1356, -arg3 + arg4, (byte) 85);
            for (int var13 = var7; ~var13 > ~var11; ++var13) {
                class384.method2394(arg2, 126, class228.field2877[var13], var10, var9);
            }
            for (int var14 = var8; ~var14 < ~var12; --var14) {
                class384.method2394(arg2, 121, class228.field2877[var14], var10, var9);
            }
            int var15 = class65.method376(class295.field3937, class427.field5844, arg5 - -arg3, (byte) -86);
            int var16 = class65.method376(class295.field3937, class427.field5844, -arg3 + arg0, (byte) 89);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class228.field2877[var17];
                class384.method2394(arg2, arg1 ^ -83, var18, var15, var9);
                class384.method2394(arg2, 119, var18, var10, var16);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLsq;)V")
    public final void method291(byte arg0, class316 arg1) {
        Object var3 = this.field598;
        synchronized (this.field598) {
            super.field6040[super.field6034] = 20;
            if (arg0 != 7) {
                return;
            }
            super.field6031[super.field6034] = arg1;
            ++super.field6034;
            if (~super.field6034 <= -5001) {
                super.field6034 = 0;
            }
            ++super.field6037;
            ++super.field6039;
            if (~this.field604 < -1) {
                this.field598.notifyAll();
            }
        }
        ++field590;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLwo;)V")
    public static final void method292(byte arg0, class285 arg1) {
        class223.field2800 = arg1;
        ++field595;
        if (arg0 < 57) {
            method292((byte) 75, (class285) null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
    public static final void method293(boolean arg0, byte arg1) {
        ++class2.field20;
        class427.field5837.method2162(false, 19);
        ++field591;
        for (class244 var2 = (class244) class282.field3678.method2222(0); var2 != null; var2 = (class244) class282.field3678.method2215(false)) {
            if (!var2.method262((byte) 45)) {
                var2 = (class244) class282.field3678.method2222(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3240 == 0) {
                class277.method1741(true, arg0, var2, 1);
            }
        }
        if (arg1 < 26) {
            method292((byte) -55, (class285) null);
        }
        if (class40.field485 != null) {
            class303.method1923(class40.field485, 10240);
            class40.field485 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public final void method294(int arg0, int arg1) {
        ++field596;
        int var3 = 0;
        Object var4 = this.field598;
        synchronized (this.field598) {
            if (~this.field608 == ~arg0) {
                for (int var5 = 0; var5 < this.field608; ++var5) {
                    this.method288(var3++, (byte) -123);
                }
            } else {
                for (int var6 = arg1; this.field608 > var6; ++var6) {
                    this.field602[var6].method1232(121);
                }
                this.field608 = arg0;
                this.field602 = new class200[this.field608];
                for (int var7 = 0; ~var7 > ~this.field608; ++var7) {
                    this.field602[var7] = new class200(this);
                    this.field602[var7].method1233((byte) 113);
                    this.method288(var3++, (byte) 78);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lsq;I)V")
    public final void method295(class316 arg0, int arg1) {
        Object var3 = this.field598;
        synchronized (this.field598) {
            --super.field6036;
            if (super.field6036 < 0) {
                super.field6036 = 4999;
            }
            if (arg1 != -4802) {
                this.method291((byte) 63, (class316) null);
            }
            super.field6040[super.field6036] = 21;
            super.field6031[super.field6036] = arg0;
            ++super.field6037;
            ++super.field6039;
            if (this.field604 > 0) {
                this.field598.notifyAll();
            }
        }
        ++field592;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static final void method296(byte arg0) {
        ++field600;
        for (class186 var1 = (class186) class432.field5895.method1690((byte) -110); var1 != null; var1 = (class186) class432.field5895.method1699((byte) 114)) {
            if (var1.field2152 > 0) {
                --var1.field2152;
            }
            if (~var1.field2152 != -1) {
                if (~var1.field2148 < -1) {
                    --var1.field2148;
                }
                if (var1.field2148 == 0 && ~var1.field2150 <= -2 && ~var1.field2157 <= -2 && class22.field232 + -2 >= var1.field2150 && class196.field2329 + -2 >= var1.field2157 && (var1.field2153 < 0 || class291.method1863(false, var1.field2153, var1.field2154))) {
                    class307.method1947(var1.field2150, var1.field2154, var1.field2143, -1, var1.field2145, (byte) -127, var1.field2156, var1.field2157, var1.field2153);
                    var1.field2148 = -1;
                    if (~var1.field2153 == ~var1.field2149 && ~var1.field2149 == 0) {
                        var1.method263(false);
                    } else if (~var1.field2153 == ~var1.field2149 && ~var1.field2155 == ~var1.field2145 && var1.field2154 == var1.field2144) {
                        var1.method263(false);
                    }
                }
            } else if (~var1.field2149 > -1 || class291.method1863(false, var1.field2149, var1.field2144)) {
                class307.method1947(var1.field2150, var1.field2144, var1.field2143, -1, var1.field2155, (byte) -109, var1.field2156, var1.field2157, var1.field2149);
                var1.method263(false);
            }
        }
        if (arg0 >= -39) {
            method285(98);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        ++field594;
        Object var2 = this.field598;
        synchronized (this.field598) {
            for (int var3 = 0; ~this.field608 < ~var3; ++var3) {
                if (this.field602[var3].field2358 >= 0) {
                    this.method284(this.field602[var3].field2358, (byte) 64);
                }
            }
            if (arg0 != 20883) {
                this.method287((class200) null, (byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
    public final void method298(int arg0, int arg1) {
        Object var3 = this.field598;
        synchronized (this.field598) {
            super.field6040[super.field6034] = (byte) arg1;
            ++super.field6034;
            ++super.field6039;
            if (arg0 <= 15) {
                this.method294(116, 70);
            }
            if (super.field6034 >= 5000) {
                super.field6034 = 0;
            }
            ++super.field6037;
            if (this.field604 > 0) {
                this.field598.notifyAll();
            }
        }
        ++field609;
    }
}
