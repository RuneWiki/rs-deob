import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class514 extends class274 {

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field7447 = new Object();

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    private int field7451 = 0;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "[Lnt;")
    private class149[] field7458 = new class149[0];

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    private int field7461 = 0;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)V", line = 5)
    public final void method1416(byte arg0, int arg1) {
        ++field7449;
        int var3 = 0;
        Object var4 = this.field7447;
        synchronized (this.field7447) {
            if (this.field7451 == arg1) {
                for (int var5 = 0; var5 < this.field7451; ++var5) {
                    this.method3073(var3++, -75);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field7451; ++var6) {
                    this.field7458[var6].method985(-4344);
                }
                this.field7451 = arg1;
                int var7 = -17 % ((-51 - arg0) / 47);
                this.field7458 = new class149[this.field7451];
                for (int var8 = 0; this.field7451 > var8; ++var8) {
                    this.field7458[var8] = new class149(this);
                    this.field7458[var8].method986((byte) -125);
                    this.method3073(var3++, -93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lta;IIFZ)V", line = 54)
    public final void method1414(class143 arg0, int arg1, int arg2, float arg3, boolean arg4) {
        Object var6 = this.field7447;
        synchronized (this.field7447) {
            super.field3438[super.field3435] = (byte) (!arg4 ? arg1 + 30 : arg1 + 40);
            super.field3444[super.field3435] = arg0;
            super.field3440[super.field3435] = arg3;
            ++super.field3435;
            if (arg2 != 12214) {
                field7456 = 57;
            }
            ++super.field3433;
            if (~super.field3435 <= -5001) {
                super.field3435 = 0;
            }
            ++super.field3436;
            if (~this.field7461 < -1) {
                this.field7447.notifyAll();
            }
        }
        ++field7453;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)I", line = 79)
    public static final int method3069(int arg0, String arg1) {
        ++field7445;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var2 > var4; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 <= 127) {
                ++var3;
            } else if (var5 > 2047) {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 121)
    public final void method1420(byte arg0) {
        if (arg0 <= 53) {
            field7456 = 77;
        }
        Object var2 = this.field7447;
        synchronized (this.field7447) {
            int var3 = 0;
            while (true) {
                if (this.field7451 <= var3) {
                    break;
                }
                if (~this.field7458[var3].field1881 <= -1) {
                    this.method3071(true, this.field7458[var3].field1881);
                }
                ++var3;
            }
        }
        ++field7450;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lnt;B)V", line = 146)
    public final void method3070(class149 arg0, byte arg1) {
        ++field7457;
        boolean var3 = false;
        try {
            boolean var4 = false;
            int var5 = -84 % ((-15 - arg1) / 57);
            float var6 = 0.0F;
            Object var7 = this.field7447;
            byte var8;
            synchronized (this.field7447) {
                while (~super.field3436 == -1) {
                    ++this.field7461;
                    this.field7447.wait();
                    --this.field7461;
                }
                var8 = super.field3438[super.field3442];
                if (arg0.field1881 >= 0) {
                    if (~var8 > -1 || ~var8 < -4) {
                        var3 = true;
                    }
                } else if (var8 >= 0 && var8 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field3138 = super.field3444[super.field3442];
                    var6 = super.field3440[super.field3442];
                    super.field3444[super.field3442] = null;
                    ++super.field3442;
                    --super.field3436;
                    if (super.field3442 >= 5000) {
                        super.field3442 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (arg0.field1881 < 0) {
                if (~var8 <= -1 && var8 <= 3) {
                    arg0.field1881 = var8;
                    class481.field7025.method279(var8);
                }
            } else if (~var8 == -22) {
                class315.method1847(arg0, (class490) arg0.field3138);
            } else if (var8 != 20) {
                if (var8 >= 30 && var8 <= 33) {
                    class481.field7025.method338(3000.0F, var6 * 1.5F);
                    ((class143) arg0.field3138).method386(class255.field3246, class139.field1797, class230.field2929, class38.field501, ~(var8 + -30) == -1);
                } else if (var8 >= 40 && ~var8 >= -44) {
                    class481.field7025.method338(3000.0F, var6 * 1.5F);
                    ((class143) arg0.field3138).method386(class255.field3246, class139.field1797, class230.field2929, class473.field6847, var8 + -40 == 0);
                } else if (~var8 == -23) {
                    class481.field7025.method317(-1, 1583160, 40, 127);
                } else if (var8 != 23) {
                    if (var8 != 24) {
                        if (var8 >= 10 && var8 <= 13) {
                            class481.field7025.method285(arg0.field1881);
                            arg0.field1881 = -1;
                        }
                    } else {
                        class481.field7025.method311(0, (class256[]) null);
                    }
                } else {
                    class481.field7025.method329();
                }
            } else {
                class490 var9 = (class490) arg0.field3138;
                if (var9.field7126 != null) {
                    var9.field7126.method192(class481.field7025, 1);
                }
                if (var9.field7130 != null) {
                    var9.field7130.method192(class481.field7025, 1);
                }
                if (var9.field7138 != null) {
                    var9.field7138.method192(class481.field7025, 1);
                }
                if (var9.field7137 != null) {
                    var9.field7137.method192(class481.field7025, 1);
                }
                if (var9.field7131 != null) {
                    var9.field7131.method192(class481.field7025, 1);
                }
                for (class376 var10 = var9.field7127; var10 != null; var10 = var10.field4952) {
                    var10.field4953.method192(class481.field7025, 1);
                }
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field7447;
                synchronized (this.field7447) {
                    --super.field3433;
                    if (~super.field3433 == -1) {
                        this.field7447.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 310)
    private final void method3071(boolean arg0, int arg1) {
        ++field7454;
        super.field3438[super.field3435] = (byte) (arg1 + 10);
        ++super.field3435;
        ++super.field3433;
        ++super.field3436;
        if (!arg0) {
            this.method1414((class143) null, 105, -97, -0.85915047F, true);
        }
        if (~super.field3435 <= -5001) {
            super.field3435 = 0;
        }
        if (this.field7461 > 0) {
            Object var3 = this.field7447;
            synchronized (this.field7447) {
                this.field7447.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BIIIIIII)V", line = 335)
    public static final void method3072(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7459;
        if (arg0 != 70) {
            method3069(108, (String) null);
        }
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class63.field827 - -((-class63.field827 + class470.field6819) * var8 / 100);
        int var10 = arg6 * var9 >> 8;
        int var11 = -arg5 + 16384 & 16383;
        int var12 = -arg2 + 16384 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class36.field443[var11] * -var10 >> 15;
            var15 = class36.field478[var11] * var10 >> 15;
        }
        if (~var12 != -1) {
            var13 = class36.field443[var12] * var15 >> 15;
            var15 = class36.field478[var12] * var15 >> 15;
        }
        class347.field4462 = 0;
        class286.field3665 = -var14 + arg4;
        class365.field4747 = arg2;
        class310.field3971 = arg1 - var13;
        class80.field1030 = arg5;
        class193.field2500 = -var15 + arg7;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 391)
    public final void method1421(int arg0, int arg1) {
        ++field7446;
        Object var3 = this.field7447;
        synchronized (this.field7447) {
            super.field3438[super.field3435] = (byte) arg1;
            ++super.field3435;
            if (arg0 <= super.field3435) {
                super.field3435 = 0;
            }
            ++super.field3433;
            ++super.field3436;
            if (this.field7461 > 0) {
                this.field7447.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lev;I)V", line = 411)
    public final void method1417(class490 arg0, int arg1) {
        Object var3 = this.field7447;
        synchronized (this.field7447) {
            super.field3438[super.field3435] = 20;
            super.field3444[super.field3435] = arg0;
            ++super.field3435;
            ++super.field3433;
            ++super.field3436;
            if (arg1 != 5000) {
                return;
            }
            if (~super.field3435 <= -5001) {
                super.field3435 = 0;
            }
            if (~this.field7461 < -1) {
                this.field7447.notifyAll();
            }
        }
        ++field7448;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V", line = 436)
    private final void method3073(int arg0, int arg1) {
        ++field7452;
        super.field3438[super.field3435] = (byte) arg0;
        ++super.field3435;
        ++super.field3433;
        ++super.field3436;
        if (~super.field3435 <= -5001) {
            super.field3435 = 0;
        }
        if (arg1 > -73) {
            this.method1417((class490) null, -17);
        }
        if (this.field7461 > 0) {
            Object var3 = this.field7447;
            synchronized (this.field7447) {
                this.field7447.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILev;)V", line = 463)
    public final void method1415(int arg0, class490 arg1) {
        Object var3 = this.field7447;
        synchronized (this.field7447) {
            --super.field3442;
            if (arg0 != -12933) {
                return;
            }
            if (~super.field3442 > -1) {
                super.field3442 = 4999;
            }
            super.field3438[super.field3442] = 21;
            super.field3444[super.field3442] = arg1;
            ++super.field3436;
            ++super.field3433;
            if (this.field7461 > 0) {
                this.field7447.notifyAll();
            }
        }
        ++field7455;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 491)
    public final void method1422(int arg0) {
        try {
            if (arg0 != 255) {
                this.field7458 = null;
            }
            Object var2 = this.field7447;
            synchronized (this.field7447) {
                while (~super.field3433 != -1) {
                    this.field7447.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field7460;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILev;)V", line = 514)
    public final void method1419(int arg0, class490 arg1) {
        Object var3 = this.field7447;
        synchronized (this.field7447) {
            super.field3438[super.field3435] = 21;
            super.field3444[super.field3435] = arg1;
            ++super.field3435;
            if (super.field3435 >= 5000) {
                super.field3435 = 0;
            }
            ++super.field3433;
            ++super.field3436;
            if (this.field7461 > 0) {
                this.field7447.notifyAll();
            }
        }
        if (arg0 != 1911) {
            this.field7451 = -98;
        }
        ++field7444;
    }
}
