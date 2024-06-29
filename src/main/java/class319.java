import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class319 extends class86 {

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    private int field5449 = 0;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Z")
    private boolean field5462 = false;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private int field5451 = -1;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    private int field5484 = 0;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field5473 = -32768;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    private int field5458;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    private int field5477;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    private int field5491;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    private int field5478;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field5459;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field5450;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Ltk;")
    private class249 field5485;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field5463 = 0;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
    public static boolean field5471 = true;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "J")
    public static volatile long field5488 = 0L;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "D")
    private double field5448;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "D")
    public double field5454;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "D")
    private double field5467;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "D")
    private double field5474;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "D")
    public double field5476;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "D")
    private double field5480;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "D")
    public double field5482;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "D")
    private double field5483;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public int field5486;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lga;")
    private class19 field5470;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lve;")
    public static class266 field5464;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 6)
    public static void method2211(boolean arg0) {
        if (arg0) {
            field5464 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILpb;BII)V", line = 20)
    public static final void method2212(int arg0, class78 arg1, byte arg2, int arg3, int arg4) {
        field5469++;
        class224 var5 = (class224) class147.field2306.method264(-17);
        if (arg2 != -73) {
            method2211(true);
        }
        while (var5 != null) {
            if (var5.field3539 == arg4 && (arg0 * 128) == var5.field3553 && arg3 * 128 == var5.field3532 && var5.field3546.field1226 == arg1.field1226) {
                if (var5.field3537 != null) {
                    class301.field5195.method1313(var5.field3537);
                    var5.field3537 = null;
                }
                if (var5.field3540 != null) {
                    class301.field5195.method1313(var5.field3540);
                    var5.field3540 = null;
                }
                var5.method1006(-1024);
                return;
            }
            var5 = (class224) class147.field2306.method263(4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 359)
    public class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field5453 = arg6;
        this.field5458 = arg2;
        this.field5481 = arg9;
        this.field5477 = arg0;
        this.field5466 = arg1;
        this.field5491 = arg7;
        this.field5478 = arg3;
        this.field5462 = false;
        this.field5459 = arg10;
        this.field5450 = arg8;
        this.field5487 = arg5;
        this.field5472 = arg4;
        int var12 = class236.method1582((byte) 42, this.field5477).field5168;
        if (var12 == -1) {
            this.field5485 = null;
        } else {
            this.field5485 = client.method1731(var12, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Z", line = 63)
    public static final boolean method2213(byte arg0, int arg1) {
        if (arg0 > -63) {
            field5463 = 66;
        }
        field5456++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V", line = 81)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5475++;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lak;", line = 90)
    private final class311 method2214(int arg0) {
        field5455++;
        if (arg0 >= -6) {
            return (class311) null;
        }
        class300 var2 = class236.method1582((byte) 42, this.field5477);
        class311 var3 = var2.method2114(this.field5451, (byte) -30, this.field5484, this.field5449);
        if (var3 == null) {
            return null;
        } else {
            var3.method1644(this.field5479);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(BI)V", line = 111)
    public final void method2215(byte arg0, int arg1) {
        this.field5482 += (double) arg1 * this.field5448;
        this.field5454 += (double) arg1 * this.field5480;
        field5489++;
        this.field5462 = true;
        if (this.field5491 == -1) {
            this.field5476 += (double) arg1 * this.field5474;
        } else {
            this.field5476 += this.field5467 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field5474;
            this.field5474 += (double) arg1 * this.field5467;
        }
        this.field5486 = (int) (Math.atan2(this.field5448, this.field5480) * 325.949D) + 1024 & 0x7FF;
        this.field5479 = (int) (Math.atan2(this.field5474, this.field5483) * 325.949D) & 0x7FF;
        if (arg0 != -59) {
            this.method676(121, 74, -127, 12, -105, -18, 65, 117, 43L, 84, (class19) null);
        }
        if (this.field5485 == null) {
            return;
        }
        this.field5449 += arg1;
        while (true) {
            do {
                do {
                    if (this.field5449 <= this.field5485.field4076[this.field5484]) {
                        return;
                    }
                    this.field5449 -= this.field5485.field4076[this.field5484];
                    this.field5484++;
                    if (this.field5484 >= this.field5485.field4051.length) {
                        this.field5484 -= this.field5485.field4070;
                        if (this.field5484 < 0 || this.field5485.field4051.length <= this.field5484) {
                            this.field5484 = 0;
                        }
                    }
                    this.field5451 = this.field5484 + 1;
                } while (this.field5485.field4051.length > this.field5451);
                this.field5451 -= this.field5485.field4070;
            } while (this.field5451 >= 0 && this.field5451 < this.field5485.field4051.length);
            this.field5451 = -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIII)V", line = 169)
    public final void method2216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field5462) {
            double var6 = (double) (arg0 - this.field5478);
            double var8 = (double) (arg4 - this.field5458);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field5476 = (double) this.field5472;
            this.field5454 = (double) this.field5450 * var6 / var10 + (double) this.field5478;
            this.field5482 = (double) this.field5450 * var8 / var10 + (double) this.field5458;
        }
        field5461++;
        double var12 = (double) (arg1 + this.field5453 - arg2);
        this.field5480 = ((double) arg0 - this.field5454) / var12;
        this.field5448 = ((double) arg4 - this.field5482) / var12;
        this.field5483 = Math.sqrt(this.field5480 * this.field5480 + this.field5448 * this.field5448);
        if (this.field5491 == -1) {
            this.field5474 = ((double) arg3 - this.field5476) / var12;
        } else {
            if (!this.field5462) {
                this.field5474 = -this.field5483 * Math.tan((double) this.field5491 * 0.02454369D);
            }
            this.field5467 = ((double) arg3 - this.field5476 - this.field5474 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 232)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
        class311 var13 = this.method2214(-126);
        field5490++;
        if (var13 != null) {
            var13.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5470);
            this.field5473 = var13.method679();
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(BI)V", line = 258)
    public static final void method2217(byte arg0, int arg1) {
        if (arg0 <= -25) {
            field5447++;
            class94.field1533.method1985(-128, arg1);
            class263.field4299.method1985(-126, arg1);
            class307.field5291.method1985(-127, arg1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I", line = 272)
    public final int method679() {
        field5460++;
        return this.field5473;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)V", line = 280)
    public static final void method2218(byte arg0, int arg1, int arg2, int arg3) {
        field5468++;
        if (arg0 > 114) {
            class120 var4 = class293.method2059(4, 9, arg1);
            var4.method833((byte) 33);
            var4.field1877 = arg3;
            var4.field1876 = arg2;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBILve;)[Lqf;", line = 312)
    public static final class148[] method2219(int arg0, byte arg1, int arg2, class266 arg3) {
        field5465++;
        if (class196.method1317(arg3, arg0, arg2, -30901)) {
            return arg1 == 11 ? class276.method1951(-26802) : (class148[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I", line = 331)
    public static final int method2220(int arg0, int arg1, int arg2) {
        int var3 = 96 / ((arg2 + 75) / 33);
        field5452++;
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }
}
