import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class443 extends class297 {

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    private int field6296 = 0;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    private int field6304 = 0;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    private int field6308 = 0;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field6289 = 0;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field6291 = 0;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field6305 = -1;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "Z")
    public static boolean field6309 = false;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    private int field6292;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    private int field6295;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "I")
    private int field6298;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    private int field6302;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    private int field6306;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    private int field6307;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 4)
    public static final void method2663(byte arg0) {
        if (arg0 != 98) {
            field6294 = 46;
        }
        class112.field1938.method244(class507.field7057, class480.field6703, class537.field7432);
        ++field6293;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 25)
    public class443() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)Let;", line = 28)
    public static final class594 method2664(int arg0) {
        ++field6301;
        if (arg0 != 2681) {
            field6309 = true;
        }
        class594 var1 = (class594) class376.field5331.method2344(-47);
        if (var1 != null) {
            var1.method2314((byte) 81);
            var1.method115(true);
            return var1;
        } else {
            class594 var2;
            do {
                var2 = (class594) class704.field9498.method2344(-87);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method3382((byte) -51) < ~class554.method3190(-59)) {
                    return null;
                }
                var2.method2314((byte) 113);
                var2.method115(true);
            } while ((Long.MIN_VALUE & var2.field235) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 70)
    public static final void method2665(int arg0, String arg1) {
        ++field6297;
        if (arg1 != null) {
            if ((field6289 < 200 || class643.field8857) && ~field6289 > -201) {
                String var3 = class115.method1015(2, arg1);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~field6289; ++var4) {
                        String var9 = class115.method1015(2, class648.field8912[var4]);
                        if (var9 != null && var9.equals(var3)) {
                            class356.method2237(arg1 + class497.field6929.method2936(class607.field8336, 544), false, 4);
                            return;
                        }
                        if (class128.field2162[var4] != null) {
                            String var10 = class115.method1015(2, class128.field2162[var4]);
                            if (var10 != null && var10.equals(var3)) {
                                class356.method2237(arg1 + class497.field6929.method2936(class607.field8336, 544), false, 4);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; var5 < class324.field4501; ++var5) {
                        String var7 = class115.method1015(2, class99.field1767[var5]);
                        if (var7 != null && var7.equals(var3)) {
                            class356.method2237(class497.field6934.method2936(class607.field8336, 544) + arg1 + class497.field6935.method2936(class607.field8336, 544), false, 4);
                            return;
                        }
                        if (class438.field6245[var5] != null) {
                            String var8 = class115.method1015(2, class438.field6245[var5]);
                            if (var8 != null && var8.equals(var3)) {
                                class356.method2237(class497.field6934.method2936(class607.field8336, 544) + arg1 + class497.field6935.method2936(class607.field8336, 544), false, 4);
                                return;
                            }
                        }
                    }
                    if (class115.method1015(2, class58.field1147.field8189).equals(var3)) {
                        class356.method2237(class497.field6932.method2936(class607.field8336, 544), false, 4);
                    } else {
                        ++class499.field6970;
                        class564 var6 = class227.method1594(class49.field1039, class72.field1320, -85);
                        var6.field7778.method1526(false, class621.method3541(arg1, -65));
                        var6.field7778.method1481((byte) -5, arg1);
                        class167.method1260(123, var6);
                        if (arg0 > -31) {
                            method2664(-4);
                        }
                    }
                }
            } else {
                class356.method2237(class497.field6901.method2936(class607.field8336, 544), false, 4);
                String var2 = class497.field6902.method2936(class607.field8336, 544);
                if (var2 != null) {
                    class356.method2237(var2, false, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)[[I", line = 176)
    public final int[][] method18(int arg0, int arg1) {
        ++field6299;
        int[][] var3 = super.field4166.method2180(-105, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) 50, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class525.field7275 < ~var11; ++var11) {
                this.method2666(var5[var11], var6[var11], (byte) 82, var7[var11]);
                this.field6307 += this.field6296;
                this.field6306 += this.field6308;
                this.field6295 += this.field6304;
                while (this.field6306 < 0) {
                    this.field6306 += 4096;
                }
                if (this.field6307 < 0) {
                    this.field6307 = 0;
                }
                while (this.field6306 > 4096) {
                    this.field6306 -= 4096;
                }
                if (~this.field6295 > -1) {
                    this.field6295 = 0;
                }
                if (this.field6307 > 4096) {
                    this.field6307 = 4096;
                }
                if (this.field6295 > 4096) {
                    this.field6295 = 4096;
                }
                this.method2667(this.field6295, this.field6306, (byte) -120, this.field6307);
                var8[var11] = this.field6292;
                var9[var11] = this.field6302;
                var10[var11] = this.field6298;
            }
        }
        if (arg1 != -1564599039) {
            field6305 = 25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBI)V", line = 263)
    private final void method2666(int arg0, int arg1, byte arg2, int arg3) {
        ++field6300;
        int var5 = arg1 >= arg0 ? arg1 : arg0;
        if (arg2 == 82) {
            int var6 = arg3 <= var5 ? var5 : arg3;
            int var7 = ~arg1 < ~arg0 ? arg0 : arg1;
            int var8 = arg3 >= var7 ? var7 : arg3;
            this.field6295 = (var6 + var8) / 2;
            int var9 = var6 - var8;
            if (~var9 < -1) {
                int var10 = (-arg0 + var6 << 12) / var9;
                int var11 = (-arg1 + var6 << 12) / var9;
                int var12 = (-arg3 + var6 << 12) / var9;
                if (arg0 == var6) {
                    this.field6306 = ~arg1 != ~var8 ? -var11 + 4096 : var12 + 20480;
                } else if (~arg1 != ~var6) {
                    this.field6306 = arg0 != var8 ? -var10 + 20480 : 12288 - -var11;
                } else {
                    this.field6306 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
                }
                this.field6306 /= 6;
            } else {
                this.field6306 = 0;
            }
            if (~this.field6295 < -1 && this.field6295 < 4096) {
                this.field6307 = (var9 << 12) / (this.field6295 > 2048 ? 8192 - this.field6295 * 2 : this.field6295 * 2);
            } else {
                this.field6307 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIBI)V", line = 320)
    private final void method2667(int arg0, int arg1, byte arg2, int arg3) {
        ++field6303;
        int var5 = 31 / ((arg2 - -74) / 40);
        int var6 = ~arg0 < -2049 ? arg0 - (arg0 * arg3 >> 12) + arg3 : (4096 - -arg3) * arg0 >> 12;
        if (var6 <= 0) {
            this.field6292 = this.field6302 = this.field6298 = arg0;
        } else {
            int var7 = arg1 * 6;
            int var8 = -var6 + arg0 - -arg0;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = var6 - var14;
            if (var10 != 0) {
                if (var10 != 1) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (~var10 != -5) {
                                if (~var10 == -6) {
                                    this.field6292 = var6;
                                    this.field6298 = var16;
                                    this.field6302 = var8;
                                }
                            } else {
                                this.field6302 = var8;
                                this.field6292 = var15;
                                this.field6298 = var6;
                            }
                        } else {
                            this.field6302 = var16;
                            this.field6292 = var8;
                            this.field6298 = var6;
                        }
                    } else {
                        this.field6298 = var15;
                        this.field6292 = var8;
                        this.field6302 = var6;
                    }
                } else {
                    this.field6298 = var8;
                    this.field6292 = var16;
                    this.field6302 = var6;
                }
            } else {
                this.field6302 = var15;
                this.field6292 = var6;
                this.field6298 = var8;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lcea;II)V", line = 430)
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field6290;
        if (arg2 == 31015) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field6304 = (arg0.method1536(arg2 + -31101) << 12) / 100;
                    }
                } else {
                    this.field6296 = (arg0.method1536(-83) << 12) / 100;
                }
            } else {
                this.field6308 = arg0.method1520(13638);
            }
        }
    }
}
