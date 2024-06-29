import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class233 extends class167 {

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    private int field4188 = 8192;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    private int field4191 = 0;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    private int field4202 = 4096;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    private int field4187 = 2048;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    private int field4201 = 12288;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    private int field4205 = 2048;

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "I")
    private int field4208 = 0;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "Lkh;")
    private static class117 field4194 = class224.method1450((byte) -49, "wave2:");

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lkh;")
    public static class117 field4198 = field4194;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "Lkh;")
    public static class117 field4207 = field4194;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "[[[B")
    public static byte[][][] field4200 = new byte[4][104][104];

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "Lpb;")
    public static class166 field4197;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public static void method1503(int arg0) {
        if (arg0 == 0) {
            field4207 = null;
            field4198 = null;
            field4200 = null;
            field4197 = null;
            field4194 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)Z")
    private final boolean method1504(boolean arg0, int arg1, int arg2) {
        int var4 = (-arg1 + arg2) * this.field4201 >> 12;
        if (!arg0) {
            this.field4187 = -102;
        }
        int var5 = class60.field1218[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4201;
        ++field4195;
        int var7 = (var6 << 12) / this.field4188;
        int var8 = this.field4202 * var7 >> 12;
        return arg1 + arg2 < var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    private static final void method1505(boolean arg0) {
        for (int var1 = 0; class215.field3914 > var1; ++var1) {
            int var2 = class203.field3679[var1];
            class207 var3 = class1.field18[var2];
            int var4 = class18.field511.method998(111);
            if ((var4 & 8) != 0) {
                int var5 = class18.field511.method988(42);
                if (~var5 == -65536) {
                    var5 = -1;
                }
                int var6 = class18.field511.method1033(-128);
                class106.method708(var6, true, var5, var3);
            }
            if (~(1 & var4) != -1) {
                var3.field4263 = class18.field511.method1038(92);
                var3.field4217 = 100;
            }
            if ((var4 & 32) != 0) {
                var3.field4245 = class18.field511.method988(110);
                var3.field4237 = class18.field511.method1049((byte) 98);
            }
            if ((128 & var4) != 0) {
                var3.field4233 = class18.field511.method1019((byte) -114);
                int var7 = class18.field511.method1026(false);
                if (~var3.field4233 == -65536) {
                    var3.field4233 = -1;
                }
                var3.field4248 = 0;
                var3.field4222 = (65535 & var7) + class44.field966;
                var3.field4209 = 0;
                var3.field4253 = var7 >> 16;
                if (~var3.field4222 < ~class44.field966) {
                    var3.field4209 = -1;
                }
            }
            if (~(2 & var4) != -1) {
                var3.field4280 = class18.field511.method1004(255);
                if (~var3.field4280 == -65536) {
                    var3.field4280 = -1;
                }
            }
            if (~(var4 & 16) != -1) {
                var3.field3718 = class56.method429(0, class18.field511.method1004(255));
                var3.field4257 = var3.field3718.field2047;
                var3.field4238 = var3.field3718.field2028;
                var3.field4265 = var3.field3718.field2045;
                var3.field4273 = var3.field3718.field2018;
                var3.field4250 = var3.field3718.field2038;
                var3.field4251 = var3.field3718.field2051;
                var3.field4262 = var3.field3718.field2033;
                var3.field4247 = var3.field3718.field2017;
                var3.field4256 = var3.field3718.field2055;
            }
            if (~(var4 & 64) != -1) {
                int var8 = class18.field511.method1045((byte) 58);
                int var9 = class18.field511.method1045((byte) 78);
                var3.method1514(var8, (byte) -119, var9, class44.field966);
            }
            if ((var4 & 4) != 0) {
                int var10 = class18.field511.method1042(true);
                int var11 = class18.field511.method998(117);
                var3.method1514(var10, (byte) -119, var11, class44.field966);
                var3.field4235 = class44.field966 + 300;
                var3.field4215 = class18.field511.method1045((byte) 102);
            }
        }
        if (!arg0) {
            field4193 = -106;
        }
        ++field4206;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
    public static final void method1506(int arg0, int arg1, byte arg2) {
        if (arg2 > -11) {
            method1503(12);
        }
        ++field4196;
        int[] var3 = new int[4];
        var3[0] = arg1;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg0;
        for (int var6 = 0; ~var6 > -5; ++var6) {
            if (class71.field1358[var6] != arg1) {
                var3[var5] = class71.field1358[var6];
                var4[var5] = class25.field616[var6];
                ++var5;
            }
        }
        class25.field616 = var4;
        class71.field1358 = var3;
        class57.method437(class202.field3655, class202.field3655.length - 1, 0, (byte) 40);
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static final void method1507(int arg0) {
        class66.field1265 = 0;
        ++field4203;
        class215.field3914 = 0;
        if (arg0 == -20765) {
            class57.method436(true);
            class247.method1618(-126);
            method1505(true);
            for (int var1 = 0; ~var1 > ~class66.field1265; ++var1) {
                int var3 = class137.field2483[var1];
                if (class44.field966 != class1.field18[var3].field4226) {
                    class1.field18[var3].field3718 = null;
                    class1.field18[var3] = null;
                }
            }
            if (~class30.field722 != ~class18.field511.field2643) {
                throw new RuntimeException("gnp1 pos:" + class18.field511.field2643 + " psize:" + class30.field722);
            } else {
                for (int var2 = 0; ~var2 > ~class61.field1229; ++var2) {
                    if (class1.field18[class21.field565[var2]] == null) {
                        throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class61.field1229);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        ++field4192;
        if (super.field3013.field4085) {
            int var4 = class143.field2583[arg1] - 2048;
            for (int var5 = 0; ~class115.field2146 < ~var5; ++var5) {
                int var6 = class70.field1350[var5] + -2048;
                int var7 = this.field4191 + var6;
                int var8 = this.field4208 + var4;
                int var9 = var8 < -2048 ? var8 - -4096 : var8;
                int var10 = var6 - -this.field4205;
                int var11 = var7 < -2048 ? var7 + 4096 : var7;
                int var12 = var9 <= 2048 ? var9 : var9 + -4096;
                int var13 = var11 > 2048 ? var11 + -4096 : var11;
                int var14 = var4 - -this.field4187;
                int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var16 = var10 >= -2048 ? var10 : var10 - -4096;
                int var17 = ~var15 < -2049 ? var15 - 4096 : var15;
                int var18 = var16 <= 2048 ? var16 : var16 + -4096;
                var3[var5] = !this.method1504(true, var18, var12) && !this.method1508(var17, var13, 300) ? 0 : 4096;
            }
        }
        if (arg0 != -96) {
            this.field4188 = 100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)Z")
    private final boolean method1508(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field4201 >> 12;
        int var5 = class60.field1218[255 & var4 * 255 >> 12];
        ++field4190;
        int var6 = (var5 << 12) / this.field4201;
        int var7 = (var6 << 12) / this.field4188;
        int var8 = this.field4202 * var7 >> 12;
        if (arg2 != 300) {
            return false;
        } else {
            return ~var8 < ~(-arg1 + arg0) && -var8 < -arg1 + arg0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        class212.method1395((byte) 79);
        int var2 = 43 / ((arg0 - -18) / 59);
        ++field4189;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4204 = 43;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field4188 = arg0.method1049((byte) 124);
                                }
                            } else {
                                this.field4202 = arg0.method1049((byte) 90);
                            }
                        } else {
                            this.field4201 = arg0.method1049((byte) 117);
                        }
                    } else {
                        this.field4187 = arg0.method1049((byte) 94);
                    }
                } else {
                    this.field4191 = arg0.method1049((byte) 124);
                }
            } else {
                this.field4208 = arg0.method1049((byte) 126);
            }
        } else {
            this.field4205 = arg0.method1049((byte) 117);
        }
        ++field4199;
    }
}
