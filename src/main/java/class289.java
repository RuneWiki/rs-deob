import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class289 {

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "Lbg;")
    private class275 field4329 = new class275();

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "Lbg;")
    private class275 field4330 = new class275();

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Lbg;")
    private class275 field4333 = new class275();

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "Lbg;")
    private class275 field4335 = new class275();

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Lgk;")
    private class468 field4337 = new class468(4);

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "B")
    private byte field4343 = 0;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public volatile int field4345 = 0;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
    public volatile int field4346 = 0;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "Lgk;")
    private class468 field4344 = new class468(8);

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Laa;")
    public static class76 field4321 = new class76(58, 7);

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "Laa;")
    public static class76 field4334 = new class76(82, 5);

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "Luv;")
    public static class2 field4336 = new class2(33, -2);

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field4340 = -1;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "J")
    private long field4341;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "Lrp;")
    private class274 field4347;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "Lum;")
    private class83 field4338;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 3)
    public static void method1783(byte arg0) {
        if (arg0 < 23) {
            field4340 = -92;
        }
        field4321 = null;
        field4334 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lya;Lqj;III)V", line = 17)
    public static final void method1784(class11 arg0, class419 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class445.field6562) {
            class306 var5 = class236.field3305[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4577 != null && var5.field4577.method230(-22611)) {
                arg1.method224(arg0, 0, class324.field5060, 0, var5.field4577, -125, true);
            }
        }
        if (arg4 < class445.field6562) {
            class306 var6 = class236.field3305[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4577 != null && var6.field4577.method230(-22611)) {
                arg1.method224(arg0, 0, 0, class324.field5060, var6.field4577, -89, true);
            }
        }
        if (arg3 < class445.field6562 && arg4 < class167.field2473) {
            class306 var7 = class236.field3305[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4577 != null && var7.field4577.method230(-22611)) {
                arg1.method224(arg0, 0, class324.field5060, class324.field5060, var7.field4577, 96, true);
            }
        }
        if (arg3 < class445.field6562 && arg4 > 0) {
            class306 var8 = class236.field3305[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4577 != null && var8.field4577.method230(-22611)) {
                arg1.method224(arg0, 0, class324.field5060, -class324.field5060, var8.field4577, -38, true);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 64)
    public final void method1785(int arg0) {
        if (arg0 <= 42) {
            this.method1788(-18);
        }
        field4323++;
        if (this.field4338 != null) {
            this.field4338.method669((byte) 93);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I", line = 77)
    private final int method1786(int arg0) {
        field4326++;
        if (arg0 != -10321) {
            this.method1787(false, 91);
        }
        return this.field4333.method1712(0) + this.field4335.method1712(0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V", line = 89)
    public final void method1787(boolean arg0, int arg1) {
        field4328++;
        if (this.field4338 == null) {
            return;
        }
        try {
            this.field4337.field6830 = 0;
            this.field4337.method2754(arg0 ? 2 : 3, 5574);
            this.field4337.method2755(-86, 0);
            this.field4338.method658(14812, arg1, 4, this.field4337.field6868);
        } catch (IOException var4) {
            try {
                this.field4338.method669((byte) 91);
            } catch (Exception var3) {
            }
            this.field4346 = -2;
            this.field4345++;
            this.field4338 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V", line = 115)
    public final void method1788(int arg0) {
        field4327++;
        if (arg0 < 77) {
            this.method1791(-59);
        }
        if (this.field4338 != null) {
            this.field4338.method661(108);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)Z", line = 128)
    public final boolean method1789(byte arg0) {
        field4317++;
        if (arg0 != -111) {
            this.field4330 = null;
        }
        return this.method1786(-10321) >= 20;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)Z", line = 140)
    public final boolean method1790(byte arg0) {
        field4320++;
        if (this.field4338 != null) {
            long var2 = class381.method2281((byte) 94);
            int var4 = (int) (var2 - this.field4341);
            this.field4341 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4342 += var4;
            if (this.field4342 > 30000) {
                try {
                    this.field4338.method669((byte) 66);
                } catch (Exception var27) {
                }
                this.field4338 = null;
            }
        }
        if (this.field4338 == null) {
            return this.method1798(0) == 0 && this.method1786(-10321) == 0;
        }
        try {
            this.field4338.method663((byte) -7);
            if (arg0 >= -62) {
                this.method1791(-110);
            }
            for (class274 var5 = (class274) this.field4329.method1713(105); var5 != null; var5 = (class274) this.field4329.method1711(118)) {
                this.field4337.field6830 = 0;
                this.field4337.method2754(1, 5574);
                this.field4337.method2755(-99, (int) var5.field6102);
                this.field4338.method658(14812, 0, 4, this.field4337.field6868);
                this.field4330.method1708((byte) -8, var5);
            }
            for (class274 var6 = (class274) this.field4333.method1713(105); var6 != null; var6 = (class274) this.field4333.method1711(118)) {
                this.field4337.field6830 = 0;
                this.field4337.method2754(0, 5574);
                this.field4337.method2755(98, (int) var6.field6102);
                this.field4338.method658(14812, 0, 4, this.field4337.field6868);
                this.field4335.method1708((byte) -8, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4338.method668(-125);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4342 = 0;
                byte var9 = 0;
                if (this.field4347 == null) {
                    var9 = 8;
                } else if (this.field4347.field4091 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4347.field4087.field6868.length - this.field4347.field4090;
                    int var11 = 512 - this.field4347.field4091;
                    if (var10 - this.field4347.field4087.field6830 < var11) {
                        var11 = var10 - this.field4347.field4087.field6830;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field4338.method664(this.field4347.field4087.field6868, (byte) 108, this.field4347.field4087.field6830, var11);
                    if (this.field4343 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4347.field4087.field6868[this.field4347.field4087.field6830 + var12] = (byte) class286.method1773(this.field4347.field4087.field6868[this.field4347.field4087.field6830 + var12], this.field4343);
                        }
                    }
                    this.field4347.field4091 += var11;
                    this.field4347.field4087.field6830 += var11;
                    if (this.field4347.field4087.field6830 == var10) {
                        this.field4347.method2440(-86);
                        this.field4347.field7421 = false;
                        this.field4347 = null;
                    } else if (this.field4347.field4091 == 512) {
                        this.field4347.field4091 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4344.field6830;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field4338.method664(this.field4344.field6868, (byte) 94, this.field4344.field6830, var13);
                    if (this.field4343 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4344.field6868[this.field4344.field6830 + var14] = (byte) class286.method1773(this.field4344.field6868[this.field4344.field6830 + var14], this.field4343);
                        }
                    }
                    this.field4344.field6830 += var13;
                    if (var9 <= this.field4344.field6830) {
                        if (this.field4347 == null) {
                            this.field4344.field6830 = 0;
                            int var15 = this.field4344.method2765(97);
                            int var16 = this.field4344.method2727((byte) 43);
                            int var17 = this.field4344.method2765(67);
                            int var18 = this.field4344.method2722(false);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class274 var24;
                            if (var20) {
                                for (var24 = (class274) this.field4335.method1713(105); var24 != null && var24.field6102 != var21; var24 = (class274) this.field4335.method1711(64)) {
                                }
                            } else {
                                for (var24 = (class274) this.field4330.method1713(105); var24 != null && var24.field6102 != var21; var24 = (class274) this.field4330.method1711(87)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4347 = var24;
                            this.field4347.field4087 = new class468(var18 + var25 + this.field4347.field4090);
                            this.field4347.field4087.method2754(var19, 5574);
                            this.field4347.field4087.method2717(var18, 496598568);
                            this.field4344.field6830 = 0;
                            this.field4347.field4091 = 8;
                        } else if (this.field4347.field4091 != 0) {
                            throw new IOException();
                        } else if (this.field4344.field6868[0] == -1) {
                            this.field4347.field4091 = 1;
                            this.field4344.field6830 = 0;
                        } else {
                            this.field4347 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4338.method669((byte) 73);
            } catch (Exception var26) {
            }
            this.field4346 = -2;
            this.field4345++;
            this.field4338 = null;
            return this.method1798(0) == 0 && this.method1786(-10321) == 0;
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V", line = 420)
    private final void method1791(int arg0) {
        int var2 = 24 % ((arg0 + 65) / 34);
        field4316++;
        if (this.field4338 == null) {
            return;
        }
        try {
            this.field4337.field6830 = 0;
            this.field4337.method2754(6, 5574);
            this.field4337.method2755(125, 3);
            this.field4338.method658(14812, 0, 4, this.field4337.field6868);
        } catch (IOException var4) {
            try {
                this.field4338.method669((byte) 75);
            } catch (Exception var3) {
            }
            this.field4345++;
            this.field4338 = null;
            this.field4346 = -2;
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V", line = 446)
    public final void method1792(int arg0) {
        field4315++;
        if (this.field4338 == null) {
            return;
        }
        try {
            this.field4337.field6830 = 0;
            this.field4337.method2754(7, 5574);
            this.field4337.method2755(92, arg0);
            this.field4338.method658(14812, 0, 4, this.field4337.field6868);
        } catch (IOException var3) {
            try {
                this.field4338.method669((byte) 95);
            } catch (Exception var2) {
            }
            this.field4338 = null;
            this.field4346 = -2;
            this.field4345++;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZILum;)V", line = 474)
    public final void method1793(boolean arg0, int arg1, class83 arg2) {
        if (this.field4338 != null) {
            try {
                this.field4338.method669((byte) 37);
            } catch (Exception var8) {
            }
            this.field4338 = null;
        }
        if (arg1 < 10) {
            this.method1789((byte) 40);
        }
        field4319++;
        this.field4338 = arg2;
        this.method1791(-103);
        this.method1787(arg0, 0);
        this.field4344.field6830 = 0;
        this.field4347 = null;
        while (true) {
            class274 var4 = (class274) this.field4330.method1718((byte) -103);
            if (var4 == null) {
                while (true) {
                    class274 var5 = (class274) this.field4335.method1718((byte) -82);
                    if (var5 == null) {
                        if (this.field4343 != 0) {
                            try {
                                this.field4337.field6830 = 0;
                                this.field4337.method2754(4, 5574);
                                this.field4337.method2754(this.field4343, 5574);
                                this.field4337.method2777((byte) 74, 0);
                                this.field4338.method658(14812, 0, 4, this.field4337.field6868);
                            } catch (IOException var7) {
                                try {
                                    this.field4338.method669((byte) 99);
                                } catch (Exception var6) {
                                }
                                this.field4338 = null;
                                this.field4345++;
                                this.field4346 = -2;
                            }
                        }
                        this.field4342 = 0;
                        this.field4341 = class381.method2281((byte) 107);
                        return;
                    }
                    this.field4333.method1708((byte) -8, var5);
                }
            }
            this.field4329.method1708((byte) -8, var4);
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)Z", line = 543)
    public final boolean method1794(byte arg0) {
        if (arg0 == -1) {
            field4322++;
            return this.method1798(0) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILgo;)V", line = 562)
    public static final void method1795(int arg0, class310 arg1) {
        field4325++;
        class310 var2 = class367.method2185(arg1, (byte) -2);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class413.field6241;
            var4 = class155.field2347;
        } else {
            var3 = var2.field4736;
            var4 = var2.field4661;
        }
        class104.method786(var4, false, var3, -4400, arg1);
        if (arg0 < 8) {
            method1784(null, null, -53, 50, 27);
        }
        class494.method2937(var3, arg1, var4, (byte) 123);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIZB)Lrp;", line = 589)
    public final class274 method1796(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        if (arg2 >= -14) {
            field4339 = -48;
        }
        field4332++;
        long var6 = (long) ((arg0 << 16) + arg1);
        class274 var8 = new class274();
        var8.field4090 = arg4;
        var8.field6102 = var6;
        var8.field7419 = arg3;
        if (arg3) {
            if (this.method1798(0) >= 20) {
                throw new RuntimeException();
            }
            this.field4329.method1708((byte) -8, var8);
        } else if (this.method1786(-10321) < 20) {
            this.field4333.method1708((byte) -8, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V", line = 632)
    public final void method1797(int arg0) {
        try {
            this.field4338.method669((byte) 55);
            int var2 = -74 % ((arg0 - 86) / 39);
        } catch (Exception var3) {
        }
        field4318++;
        this.field4338 = null;
        this.field4343 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4345++;
        this.field4346 = -1;
    }

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)I", line = 661)
    public final int method1798(int arg0) {
        field4331++;
        if (arg0 != 0) {
            this.method1797(-60);
        }
        return this.field4329.method1712(0) + this.field4330.method1712(arg0);
    }
}
