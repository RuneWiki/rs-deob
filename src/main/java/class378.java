import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class378 extends class194 {

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    private int field5135 = 1024;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    private int field5136 = 1024;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field5137 = 0;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    private int field5145 = 81;

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "I")
    private int field5148 = 8;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    private int field5144 = 409;

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "I")
    private int field5149 = 204;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
    private int field5147 = 4;

    @OriginalMember(owner = "client!nl", name = "eb", descriptor = "[S")
    public static short[] field5151 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!nl", name = "hb", descriptor = "[[B")
    public static byte[][] field5154;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    private int field5130;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    private int field5140;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!nl", name = "fb", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!nl", name = "gb", descriptor = "I")
    private int field5153;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "[I")
    private int[] field5139;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "[[I")
    private int[][] field5138;

    @OriginalMember(owner = "client!nl", name = "db", descriptor = "[[I")
    private int[][] field5150;

    static {
        new class72("From", "Von:", "De", "De");
        field5154 = new byte[250][];
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(III)Laq;", line = 4)
    public static final class453 method2346(int arg0, int arg1, int arg2) {
        ++field5133;
        class453 var3 = class195.method1212(arg2, (byte) 49);
        if (arg1 == -1) {
            return var3;
        } else if (var3 != null && var3.field6350 != null && ~var3.field6350.length < ~arg1) {
            return arg0 != -23490 ? null : var3.field6350[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 25)
    public static void method2347(byte arg0) {
        if (arg0 >= -38) {
            method2351(-54, (class131) null, (byte) -22, (class446) null, (class298) null, -56, -94, 15);
        }
        field5154 = null;
        field5151 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V", line = 36)
    public static final void method2348(int arg0, int arg1, byte arg2) {
        class419.field5717 = -class224.field2825 + arg1;
        if (arg2 <= 65) {
            field5154 = null;
        }
        class157.field1832 = -class224.field2815 + arg0;
        ++field5131;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILbg;)V", line = 50)
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field5152;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field5135 = arg2.method1587((byte) -102);
                                    }
                                } else {
                                    this.field5145 = arg2.method1587((byte) -102);
                                }
                            } else {
                                this.field5137 = arg2.method1587((byte) -102);
                            }
                        } else {
                            this.field5136 = arg2.method1587((byte) -102);
                        }
                    } else {
                        this.field5149 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field5144 = arg2.method1587((byte) -102);
                }
            } else {
                this.field5148 = arg2.method1563(-128);
            }
        } else {
            this.field5147 = arg2.method1563(-128);
        }
        int var5 = -71 / ((52 - arg1) / 61);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lml;B)V", line = 140)
    public static final void method2349(class23 arg0, byte arg1) {
        ++field5141;
        arg0.field239 = null;
        if (arg1 >= 53) {
            if (class299.field3985 < 20) {
                class228.field2881.method1833(arg0, 10209);
                ++class299.field3985;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I", line = 160)
    public final int[] method55(int arg0, int arg1) {
        ++field5134;
        int var3 = 18 % ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = 0;
            int var6;
            for (var6 = class249.field3283[arg0] + this.field5137; ~var6 > -1; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (this.field5148 > var5 && this.field5139[var5] <= var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = (var5 & 1) == 0;
            int var9 = this.field5139[var5];
            int var10 = this.field5139[var5 + -1];
            if (this.field5140 + var10 < var6 && var6 < var9 - this.field5140) {
                for (int var11 = 0; ~var11 > ~class138.field1579; ++var11) {
                    int var12 = 0;
                    int var13 = var8 ? this.field5136 : -this.field5136;
                    int var14;
                    for (var14 = class277.field3585[var11] - -(this.field5130 * var13 >> 12); ~var14 > -1; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field5147 && var14 >= this.field5150[var7][var12]) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field5150[var7][var12];
                    int var17 = this.field5150[var7][var15];
                    if (~var14 < ~(this.field5140 + var17) && -this.field5140 + var16 > var14) {
                        var4[var11] = this.field5138[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class114.method665(var4, 0, class138.field1579, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V", line = 267)
    private final void method2350(int arg0) {
        ++field5146;
        Random var2 = new Random((long) this.field5148);
        this.field5140 = this.field5145 / 2;
        this.field5153 = 4096 / this.field5148;
        this.field5130 = 4096 / this.field5147;
        int var3 = this.field5130 / 2;
        this.field5139 = new int[this.field5148 + 1];
        this.field5138 = new int[this.field5148][this.field5147];
        this.field5150 = new int[this.field5148][this.field5147 - -1];
        int var4 = this.field5153 / 2;
        this.field5139[0] = 0;
        int var5 = 0;
        if (arg0 != -3550) {
            this.method54(58, -6, (class242) null);
        }
        while (this.field5148 > var5) {
            if (var5 > 0) {
                int var6 = this.field5153;
                int var7 = (-2048 + class174.method1096(-20548, var2, 4096)) * this.field5149 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5139[var5] = this.field5139[var5 + -1] - -var8;
            }
            this.field5150[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field5147; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field5130;
                    int var11 = (-2048 + class174.method1096(arg0 ^ 23966, var2, 4096)) * this.field5144 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5150[var5][var9] = this.field5150[var5][var9 - 1] - -var12;
                }
                this.field5138[var5][var9] = ~this.field5135 >= -1 ? 4096 : 4096 + -class174.method1096(-20548, var2, this.field5135);
            }
            this.field5150[var5][this.field5147] = 4096;
            ++var5;
        }
        this.field5139[this.field5148] = 4096;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 330)
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILbe;BLnd;Lpi;III)V", line = 336)
    public static final void method2351(int arg0, class131 arg1, byte arg2, class446 arg3, class298 arg4, int arg5, int arg6, int arg7) {
        ++field5143;
        if (arg2 == -6) {
            class237 var8 = new class237();
            var8.field3114 = arg6 * 128;
            var8.field3112 = arg7 * 128;
            var8.field3123 = arg5;
            if (arg3 == null) {
                if (arg4 != null) {
                    var8.field3115 = arg4;
                    class307 var11 = arg4.field3971;
                    if (var11.field4113 != null) {
                        var8.field3111 = true;
                        var11 = var11.method1946((byte) -32);
                    }
                    if (var11 != null) {
                        var8.field3124 = (var11.field4106 + arg7) * 128;
                        var8.field3122 = (arg6 - -var11.field4106) * 128;
                        var8.field3125 = class406.method2527(-116, arg4);
                        var8.field3120 = var11.field4179 * 128;
                        var8.field3107 = var11.field4122;
                    }
                    class59.field748.method1696(false, var8);
                } else if (arg1 != null) {
                    var8.field3126 = arg1;
                    var8.field3122 = 128 * (arg6 + arg1.method841(true));
                    var8.field3124 = (arg1.method841(true) + arg7) * 128;
                    var8.field3125 = class414.method2557(arg1, (byte) -77);
                    var8.field3120 = arg1.field1464 * 128;
                    var8.field3107 = arg1.field1467;
                    class321.field4310.method2227(var8, arg2 ^ 8220, (long) arg1.field2445);
                }
            } else {
                var8.field3110 = arg3;
                int var9 = arg3.field6244;
                int var10 = arg3.field6170;
                if (~arg0 == -2 || arg0 == 3) {
                    var10 = arg3.field6244;
                    var9 = arg3.field6170;
                }
                var8.field3122 = (arg6 + var9) * 128;
                var8.field3119 = arg3.field6194;
                var8.field3117 = arg3.field6175;
                var8.field3107 = arg3.field6234;
                var8.field3120 = arg3.field6201 * 128;
                var8.field3124 = (arg7 + var10) * 128;
                var8.field3125 = arg3.field6173;
                var8.field3121 = arg3.field6211;
                if (arg3.field6233 != null) {
                    var8.field3111 = true;
                    var8.method1521(-18541);
                }
                if (var8.field3117 != null) {
                    var8.field3106 = var8.field3119 + (int) (Math.random() * (double) (var8.field3121 - var8.field3119));
                }
                class314.field4232.method1696(false, var8);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 428)
    public final void method280(int arg0) {
        int var2 = 1 % ((arg0 - 28) / 63);
        this.method2350(-3550);
        ++field5132;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V", line = 449)
    public static final void method2352(int arg0, byte arg1) {
        ++field5142;
        class12 var2 = class390.method2422(341555040, arg0, 8);
        var2.method65(arg1 ^ -111);
        if (arg1 != 31) {
            field5151 = null;
        }
    }
}
