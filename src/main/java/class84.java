import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class84 extends class522 {

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field1144 = new Object();

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "[Lls;")
    private class110[] field1151 = new class110[0];

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    private int field1146 = 0;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "Loa;")
    public static class33 field1153;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "Lrg;")
    public static class398 field1154;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Lsp;")
    public static class514 field1147;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
    private final void method538(byte arg0, int arg1) {
        ++field1145;
        super.field7719[super.field7716] = (byte) arg1;
        ++super.field7716;
        ++super.field7721;
        ++super.field7713;
        if (super.field7716 >= 5000) {
            super.field7716 = 0;
        }
        if (arg0 < -87) {
            if (this.field1146 > 0) {
                Object var3 = this.field1144;
                synchronized (this.field1144) {
                    this.field1144.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(BI)V")
    private final void method539(byte arg0, int arg1) {
        super.field7719[super.field7716] = (byte) (arg1 + 10);
        ++field1149;
        ++super.field7716;
        ++super.field7713;
        if (~super.field7716 <= -5001) {
            super.field7716 = 0;
        }
        ++super.field7721;
        if (this.field1146 > 0) {
            Object var3 = this.field1144;
            synchronized (this.field1144) {
                this.field1144.notifyAll();
            }
        }
        if (arg0 != 51) {
            method550(-9, 56);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static void method540(byte arg0) {
        int var1 = -46 % ((arg0 - 1) / 60);
        field1154 = null;
        field1147 = null;
        field1153 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILdr;)V")
    public final void method541(int arg0, class420 arg1) {
        Object var3 = this.field1144;
        synchronized (this.field1144) {
            super.field7719[super.field7716] = 21;
            super.field7714[super.field7716] = arg1;
            ++super.field7716;
            ++super.field7713;
            ++super.field7721;
            if (arg0 != -2) {
                method540((byte) 126);
            }
            if (~super.field7716 <= -5001) {
                super.field7716 = 0;
            }
            if (~this.field1146 < -1) {
                this.field1144.notifyAll();
            }
        }
        ++field1141;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lna;ZFIZ)V")
    public final void method542(class206 arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        Object var6 = this.field1144;
        synchronized (this.field1144) {
            if (!arg1) {
                return;
            }
            super.field7719[super.field7716] = (byte) (!arg4 ? arg3 + 30 : arg3 + 40);
            super.field7714[super.field7716] = arg0;
            super.field7722[super.field7716] = arg2;
            ++super.field7716;
            if (~super.field7716 <= -5001) {
                super.field7716 = 0;
            }
            ++super.field7713;
            ++super.field7721;
            if (~this.field1146 < -1) {
                this.field1144.notifyAll();
            }
        }
        ++field1142;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
    public final void method543(boolean arg0, int arg1) {
        ++field1155;
        Object var3 = this.field1144;
        synchronized (this.field1144) {
            super.field7719[super.field7716] = (byte) arg1;
            ++super.field7716;
            ++super.field7721;
            if (arg0) {
                field1153 = null;
            }
            if (~super.field7716 <= -5001) {
                super.field7716 = 0;
            }
            ++super.field7713;
            if (~this.field1146 < -1) {
                this.field1144.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZIIIII)V")
    public static final void method544(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1143;
        int var6 = arg3 - arg2;
        int var7 = arg5 - arg4;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class103.method691(arg4, arg1, arg2, 77, arg5);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg4;
                    int var10 = arg5;
                    arg4 = arg2;
                    arg2 = var9;
                    arg5 = arg3;
                    arg3 = var10;
                }
                if (arg5 < arg4) {
                    int var11 = arg4;
                    arg4 = arg5;
                    int var12 = arg2;
                    arg5 = var11;
                    arg2 = arg3;
                    arg3 = var12;
                }
                int var13 = arg2;
                if (arg0) {
                    method544(true, 112, 21, 38, 42, -87);
                }
                int var14 = -arg4 + arg5;
                int var15 = -arg2 + arg3;
                int var16 = -(var14 >> 1);
                int var17 = arg2 < arg3 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (!var8) {
                    for (int var18 = arg4; arg5 >= var18; ++var18) {
                        class23.field356[var13][var18] = arg1;
                        var16 += var15;
                        if (~var16 < -1) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg4; var19 <= arg5; ++var19) {
                        var16 += var15;
                        class23.field356[var19][var13] = arg1;
                        if (~var16 < -1) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class346.method2207(arg2, -115, arg3, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Ldr;B)V")
    public final void method545(class420 arg0, byte arg1) {
        ++field1156;
        Object var3 = this.field1144;
        synchronized (this.field1144) {
            super.field7719[super.field7716] = 20;
            super.field7714[super.field7716] = arg0;
            ++super.field7716;
            if (~super.field7716 <= -5001) {
                super.field7716 = 0;
            }
            if (arg1 != -13) {
                field1153 = null;
            }
            ++super.field7721;
            ++super.field7713;
            if (~this.field1146 < -1) {
                this.field1144.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        ++field1157;
        try {
            Object var2 = this.field1144;
            synchronized (this.field1144) {
                if (arg0 == 0) {
                    while (~super.field7721 != -1) {
                        this.field1144.wait();
                    }
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method547(int arg0, int arg1) {
        ++field1150;
        int var3 = 0;
        Object var4 = this.field1144;
        synchronized (this.field1144) {
            if (~this.field1148 == ~arg1) {
                for (int var5 = 0; ~var5 > ~this.field1148; ++var5) {
                    this.method538((byte) -126, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field1148; ++var6) {
                    this.field1151[var6].method725(true);
                }
                this.field1148 = arg1;
                if (arg0 == 5754) {
                    this.field1151 = new class110[this.field1148];
                    for (int var7 = 0; ~this.field1148 < ~var7; ++var7) {
                        this.field1151[var7] = new class110(this);
                        this.field1151[var7].method727(-127);
                        this.method538((byte) -122, var3++);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lls;B)V")
    public final void method548(class110 arg0, byte arg1) {
        ++field1158;
        boolean var3 = false;
        boolean var25 = false;
        label382: {
            try {
                try {
                    label383: {
                        var25 = true;
                        boolean var4 = false;
                        float var5 = 0.0F;
                        Object var6 = this.field1144;
                        byte var7;
                        synchronized (this.field1144) {
                            while (super.field7713 == 0) {
                                ++this.field1146;
                                this.field1144.wait();
                                --this.field1146;
                            }
                            var7 = super.field7719[super.field7718];
                            if (~arg0.field1544 > -1) {
                                if (var7 >= 0 && var7 <= 3) {
                                    var3 = true;
                                }
                            } else if (var7 < 0 || ~var7 < -4) {
                                var3 = true;
                            }
                            if (arg1 > -77) {
                                Object var10000 = null;
                                var25 = false;
                                break label383;
                            }
                            if (var3) {
                                arg0.field6572 = super.field7714[super.field7718];
                                var5 = super.field7722[super.field7718];
                                super.field7714[super.field7718] = null;
                                ++super.field7718;
                                --super.field7713;
                                if (super.field7718 >= 5000) {
                                    super.field7718 = 0;
                                }
                            }
                        }
                        if (!var3) {
                            Thread.yield();
                            var25 = false;
                        } else if (~arg0.field1544 > -1) {
                            if (~var7 <= -1) {
                                if (var7 <= 3) {
                                    arg0.field1544 = var7;
                                    class351.field5447.method1105(var7);
                                    var25 = false;
                                } else {
                                    var25 = false;
                                }
                            } else {
                                var25 = false;
                            }
                        } else if (~var7 == -22) {
                            class156.method1010(arg0, (class420) arg0.field6572);
                            var25 = false;
                        } else if (~var7 != -21) {
                            if (var7 >= 30 && var7 <= 33) {
                                class351.field5447.method1087(3000.0F, var5 * 1.5F);
                                ((class206) arg0.field6572).method858(class10.field149, class29.field458, class75.field1021, class11.field171, ~(var7 + -30) == -1);
                                var25 = false;
                            } else if (~var7 <= -41 && ~var7 >= -44) {
                                class351.field5447.method1087(3000.0F, var5 * 1.5F);
                                ((class206) arg0.field6572).method858(class10.field149, class29.field458, class75.field1021, class25.field408, var7 - 40 == 0);
                                var25 = false;
                            } else if (var7 == 22) {
                                class351.field5447.method1103(-1, 1583160, 40, 127);
                                var25 = false;
                            } else if (~var7 != -24) {
                                if (~var7 == -25) {
                                    class351.field5447.method1106(0, (class471[]) null);
                                    var25 = false;
                                } else if (~var7 <= -11) {
                                    if (~var7 >= -14) {
                                        class351.field5447.method1131(arg0.field1544);
                                        arg0.field1544 = -1;
                                        var25 = false;
                                    } else {
                                        var25 = false;
                                    }
                                } else {
                                    var25 = false;
                                }
                            } else {
                                class351.field5447.method1044();
                                var25 = false;
                            }
                        } else {
                            class420 var8 = (class420) arg0.field6572;
                            if (var8.field6261 != null) {
                                var8.field6261.method62((byte) -126, class351.field5447);
                            }
                            if (var8.field6271 != null) {
                                var8.field6271.method62((byte) -126, class351.field5447);
                            }
                            if (var8.field6277 != null) {
                                var8.field6277.method62((byte) -126, class351.field5447);
                            }
                            if (var8.field6283 != null) {
                                var8.field6283.method62((byte) -126, class351.field5447);
                            }
                            if (var8.field6260 != null) {
                                var8.field6260.method62((byte) -126, class351.field5447);
                            }
                            for (class115 var9 = var8.field6273; var9 != null; var9 = var9.field1600) {
                                var9.field1594.method62((byte) -126, class351.field5447);
                            }
                            var25 = false;
                        }
                    }
                } catch (Exception var30) {
                    var25 = false;
                }
                break label382;
            } finally {
                if (var25) {
                    Object var17 = null;
                    if (var3) {
                        Object var18 = this.field1144;
                        synchronized (this.field1144) {
                            --super.field7721;
                            if (~super.field7721 == -1) {
                                this.field1144.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var14 = this.field1144;
                synchronized (this.field1144) {
                    --super.field7721;
                    if (~super.field7721 == -1) {
                        this.field1144.notifyAll();
                    }
                }
            }
            return;
        }
        Object var15 = null;
        if (var3) {
            Object var16 = this.field1144;
            synchronized (this.field1144) {
                --super.field7721;
                if (~super.field7721 == -1) {
                    this.field1144.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ldr;B)V")
    public final void method549(class420 arg0, byte arg1) {
        Object var3 = this.field1144;
        synchronized (this.field1144) {
            --super.field7718;
            if (super.field7718 < 0) {
                super.field7718 = 4999;
            }
            super.field7719[super.field7718] = 21;
            super.field7714[super.field7718] = arg0;
            ++super.field7721;
            ++super.field7713;
            if (this.field1146 > 0) {
                this.field1144.notifyAll();
            }
            if (arg1 > -31) {
                this.method542((class206) null, true, -0.57569456F, -111, false);
            }
        }
        ++field1152;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)Z")
    public static final boolean method550(int arg0, int arg1) {
        if (arg0 < 105) {
            field1153 = null;
        }
        ++field1140;
        if (arg1 != 59 && arg1 != 49 && arg1 != 57 && arg1 != 5 && ~arg1 != -20) {
            return arg1 == 18 || arg1 == 1004;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method551(byte arg0) {
        Object var2 = this.field1144;
        synchronized (this.field1144) {
            int var3 = 0;
            while (true) {
                if (var3 >= this.field1148) {
                    break;
                }
                if (this.field1151[var3].field1544 >= 0) {
                    this.method539((byte) 51, this.field1151[var3].field1544);
                }
                ++var3;
            }
        }
        ++field1159;
        int var4 = 6 % ((-9 - arg0) / 58);
    }
}
