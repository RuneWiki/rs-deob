import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class618 {

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "Lgm;")
    private class108 field8611 = new class108();

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "Lgm;")
    private class108 field8615 = new class108();

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "Lgm;")
    private class108 field8617 = new class108();

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "Lgm;")
    private class108 field8618 = new class108();

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "Lmo;")
    private class695 field8619 = new class695(4);

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "B")
    private byte field8626 = 0;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
    public volatile int field8623 = 0;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
    public volatile int field8625 = 0;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "Lmo;")
    private class695 field8624 = new class695(8);

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    private int field8622;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "J")
    private long field8621;

    @OriginalMember(owner = "client!aga", name = "D", descriptor = "Luh;")
    private class150 field8627;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "Lmea;")
    private class393 field8620;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZZI)V", line = 4)
    public static final void method3427(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class181.field2560--;
            if (class181.field2560 == 0) {
                class689.field9703 = null;
            }
        }
        if (arg2 > -57) {
            return;
        }
        if (arg1) {
            class23.field321--;
            if (class23.field321 == 0) {
                class437.field6386 = null;
            }
        }
        field8607++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)I", line = 31)
    public final int method3428(int arg0) {
        int var2 = 109 % ((-arg0 - 68) / 54);
        field8612++;
        return this.field8611.method845((byte) 82) + this.field8615.method845((byte) 82);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIZLpu;)V", line = 41)
    public static final void method3429(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class522 arg6) {
        if (arg2 != 4) {
            method3429(-93, -120, -108, -63, -101, false, null);
        }
        field8610++;
        if (arg3 <= 0) {
            class345.method2142(arg0, arg1, 0, arg6, arg5, arg4);
            return;
        }
        class596.field8425 = arg0;
        class208.field2929 = arg6;
        class313.field4623 = 1;
        class666.field9405 = arg5;
        class594.field8392 = arg4;
        class685.field9652 = arg1;
        class599.field8465 = class323.field4762.method409(-1) / arg3;
        if (class599.field8465 < 1) {
            class599.field8465 = 1;
            return;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 73)
    public final void method3430(int arg0) {
        field8609++;
        if (this.field8620 != null) {
            this.field8620.method2426(arg0 - 2);
        }
        if (arg0 != 0) {
            this.field8621 = 108L;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(FB)F", line = 86)
    public static final float method3431(float arg0, byte arg1) {
        if (arg1 > -49) {
            return 1.135007F;
        } else {
            field8613++;
            return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V", line = 97)
    private final void method3432(int arg0) {
        field8604++;
        if (this.field8620 == null) {
            return;
        }
        try {
            this.field8619.field9761 = 0;
            this.field8619.method3853((byte) 51, 6);
            if (arg0 != 8) {
                this.method3433((byte) 126);
            }
            this.field8619.method3831((byte) -122, 3);
            this.field8620.method2419(this.field8619.field9796, -107, 4, 0);
        } catch (IOException var3) {
            try {
                this.field8620.method2426(-2);
            } catch (Exception var2) {
            }
            this.field8625 = -2;
            this.field8623++;
            this.field8620 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 129)
    public final void method3433(byte arg0) {
        field8614++;
        if (arg0 < 28) {
            this.method3437(46);
        }
        if (this.field8620 != null) {
            this.field8620.method2422(-116);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)I", line = 146)
    private final int method3434(int arg0) {
        if (arg0 != 658788624) {
            this.field8619 = null;
        }
        field8603++;
        return this.field8617.method845((byte) 82) + this.field8618.method845((byte) 82);
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Z", line = 157)
    public final boolean method3435(byte arg0) {
        if (arg0 < 109) {
            this.method3443(40, true);
        }
        field8601++;
        return this.method3428(58) >= 20;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)V", line = 170)
    public final void method3436(byte arg0) {
        field8608++;
        if (this.field8620 == null) {
            return;
        }
        try {
            this.field8619.field9761 = 0;
            this.field8619.method3853((byte) 51, 7);
            this.field8619.method3831((byte) -124, 0);
            this.field8620.method2419(this.field8619.field9796, 33, 4, 0);
        } catch (IOException var4) {
            try {
                this.field8620.method2426(-2);
            } catch (Exception var3) {
            }
            this.field8620 = null;
            this.field8623++;
            this.field8625 = -2;
        }
        int var2 = -51 / ((arg0 - 20) / 50);
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V", line = 197)
    public final void method3437(int arg0) {
        try {
            this.field8620.method2426(-2);
        } catch (Exception var2) {
        }
        field8616++;
        this.field8625 = -1;
        this.field8623++;
        this.field8626 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        this.field8620 = null;
    }

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "(I)V", line = 212)
    public static final void method3438(int arg0) {
        class106.field1642 = new class603[50];
        field8599++;
        if (arg0 == -29197) {
            class8.field83 = 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBBZ)Luh;", line = 224)
    public final class150 method3439(int arg0, int arg1, byte arg2, byte arg3, boolean arg4) {
        field8605++;
        if (arg2 >= -57) {
            this.field8621 = 66L;
        }
        long var6 = (long) ((arg0 << 16) + arg1);
        class150 var8 = new class150();
        var8.field2718 = arg4;
        var8.field2174 = arg3;
        var8.field5344 = var6;
        if (arg4) {
            if (this.method3428(23) >= 20) {
                throw new RuntimeException();
            }
            this.field8611.method852(true, var8);
        } else if (this.method3434(658788624) < 20) {
            this.field8617.method852(true, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZLmea;)V", line = 269)
    public final void method3440(int arg0, boolean arg1, class393 arg2) {
        if (arg0 != -27117) {
            this.field8619 = null;
        }
        if (this.field8620 != null) {
            try {
                this.field8620.method2426(-2);
            } catch (Exception var8) {
            }
            this.field8620 = null;
        }
        field8602++;
        this.field8620 = arg2;
        this.method3432(arg0 + 27125);
        this.method3443(0, arg1);
        this.field8624.field9761 = 0;
        this.field8627 = null;
        while (true) {
            class150 var4 = (class150) this.field8615.method847(0);
            if (var4 == null) {
                while (true) {
                    class150 var5 = (class150) this.field8618.method847(arg0 ^ 0xFFFF9613);
                    if (var5 == null) {
                        if (this.field8626 != 0) {
                            try {
                                this.field8619.field9761 = 0;
                                this.field8619.method3853((byte) 51, 4);
                                this.field8619.method3853((byte) 51, this.field8626);
                                this.field8619.method3852(false, 0);
                                this.field8620.method2419(this.field8619.field9796, arg0 ^ 0xFFFF962A, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field8620.method2426(-2);
                                } catch (Exception var6) {
                                }
                                this.field8625 = -2;
                                this.field8620 = null;
                                this.field8623++;
                            }
                        }
                        this.field8622 = 0;
                        this.field8621 = class490.method2840(true);
                        return;
                    }
                    this.field8617.method852(true, var5);
                }
            }
            this.field8611.method852(true, var4);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)Z", line = 340)
    public final boolean method3441(byte arg0) {
        if (this.field8620 != null) {
            long var2 = class490.method2840(true);
            int var4 = (int) (var2 - this.field8621);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field8621 = var2;
            this.field8622 += var4;
            if (this.field8622 > 30000) {
                try {
                    this.field8620.method2426(-2);
                } catch (Exception var28) {
                }
                this.field8620 = null;
            }
        }
        field8600++;
        int var5 = 123 / ((15 - arg0) / 38);
        if (this.field8620 == null) {
            return this.method3428(-126) == 0 && this.method3434(658788624) == 0;
        }
        try {
            this.field8620.method2420(false);
            for (class150 var6 = (class150) this.field8611.method849((byte) 102); var6 != null; var6 = (class150) this.field8611.method854((byte) 91)) {
                this.field8619.field9761 = 0;
                this.field8619.method3853((byte) 51, 1);
                this.field8619.method3831((byte) -122, (int) var6.field5344);
                this.field8620.method2419(this.field8619.field9796, -126, 4, 0);
                this.field8615.method852(true, var6);
            }
            for (class150 var7 = (class150) this.field8617.method849((byte) -118); var7 != null; var7 = (class150) this.field8617.method854((byte) 113)) {
                this.field8619.field9761 = 0;
                this.field8619.method3853((byte) 51, 0);
                this.field8619.method3831((byte) -128, (int) var7.field5344);
                this.field8620.method2419(this.field8619.field9796, -118, 4, 0);
                this.field8618.method852(true, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field8620.method2425(-107);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field8622 = 0;
                byte var10 = 0;
                if (this.field8627 == null) {
                    var10 = 8;
                } else if (this.field8627.field2176 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field8627.field2177.field9796.length - this.field8627.field2174;
                    int var12 = 512 - this.field8627.field2176;
                    if (var11 - this.field8627.field2177.field9761 < var12) {
                        var12 = var11 - this.field8627.field2177.field9761;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field8620.method2418(0, this.field8627.field2177.field9796, var12, this.field8627.field2177.field9761);
                    if (this.field8626 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field8627.field2177.field9796[this.field8627.field2177.field9761 + var13] = (byte) class189.method1273(this.field8627.field2177.field9796[this.field8627.field2177.field9761 + var13], this.field8626);
                        }
                    }
                    this.field8627.field2177.field9761 += var12;
                    this.field8627.field2176 += var12;
                    if (this.field8627.field2177.field9761 == var11) {
                        this.field8627.method2258((byte) 120);
                        this.field8627.field2717 = false;
                        this.field8627 = null;
                    } else if (this.field8627.field2176 == 512) {
                        this.field8627.field2176 = 0;
                    }
                } else {
                    int var14 = var10 - this.field8624.field9761;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field8620.method2418(0, this.field8624.field9796, var14, this.field8624.field9761);
                    if (this.field8626 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field8624.field9796[this.field8624.field9761 + var15] = (byte) class189.method1273(this.field8624.field9796[this.field8624.field9761 + var15], this.field8626);
                        }
                    }
                    this.field8624.field9761 += var14;
                    if (this.field8624.field9761 >= var10) {
                        if (this.field8627 == null) {
                            this.field8624.field9761 = 0;
                            int var16 = this.field8624.method3826(false);
                            int var17 = this.field8624.method3847((byte) 118);
                            int var18 = this.field8624.method3826(false);
                            int var19 = this.field8624.method3880(8);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class150 var25;
                            if (var21) {
                                for (var25 = (class150) this.field8618.method849((byte) -113); var25 != null && var25.field5344 != var22; var25 = (class150) this.field8618.method854((byte) 114)) {
                                }
                            } else {
                                for (var25 = (class150) this.field8615.method849((byte) -122); var25 != null && var25.field5344 != var22; var25 = (class150) this.field8615.method854((byte) 116)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field8627 = var25;
                            this.field8627.field2177 = new class695(this.field8627.field2174 + var26 + var19);
                            this.field8627.field2177.method3853((byte) 51, var20);
                            this.field8627.field2177.method3868(var19, -318419336);
                            this.field8624.field9761 = 0;
                            this.field8627.field2176 = 8;
                        } else if (this.field8627.field2176 != 0) {
                            throw new IOException();
                        } else if (this.field8624.field9796[0] == -1) {
                            this.field8627.field2176 = 1;
                            this.field8624.field9761 = 0;
                        } else {
                            this.field8627 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field8620.method2426(-2);
            } catch (Exception var27) {
            }
            this.field8620 = null;
            this.field8625 = -2;
            this.field8623++;
            return this.method3428(-123) == 0 && this.method3434(658788624) == 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)Z", line = 619)
    public final boolean method3442(boolean arg0) {
        if (arg0) {
            this.method3433((byte) -32);
        }
        field8606++;
        return this.method3434(658788624) >= 20;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZ)V", line = 630)
    public final void method3443(int arg0, boolean arg1) {
        field8598++;
        if (this.field8620 == null) {
            return;
        }
        try {
            this.field8619.field9761 = 0;
            this.field8619.method3853((byte) 51, arg1 ? 2 : 3);
            this.field8619.method3831((byte) -124, arg0);
            this.field8620.method2419(this.field8619.field9796, arg0 ^ 0x15, 4, 0);
        } catch (IOException var4) {
            try {
                this.field8620.method2426(-2);
            } catch (Exception var3) {
            }
            this.field8623++;
            this.field8620 = null;
            this.field8625 = -2;
        }
    }
}
