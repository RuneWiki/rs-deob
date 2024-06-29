import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class244 extends class83 {

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "[I")
    public static int[] field3153 = new int[5];

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3159;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lho;IILrd;BIILwg;)V")
    public static final void method1483(class102 arg0, int arg1, int arg2, class223 arg3, byte arg4, int arg5, int arg6, class295 arg7) {
        ++field3151;
        if (arg4 == -123) {
            class433 var8 = new class433();
            var8.field6141 = arg5 << 7;
            var8.field6145 = arg6;
            var8.field6144 = arg1 << 7;
            if (arg0 == null) {
                if (arg7 == null) {
                    if (arg3 != null) {
                        var8.field6154 = arg3;
                        var8.field6157 = arg3.method1366((byte) -88) + arg5 << 7;
                        var8.field6155 = arg3.method1366((byte) -120) + arg1 << 7;
                        var8.field6140 = class153.method1005(arg3, 124);
                        var8.field6143 = arg3.field2837 << 7;
                        var8.field6137 = arg3.field2821;
                        class437.field6263.method2019((byte) -92, var8, (long) arg3.field4890);
                        return;
                    }
                } else {
                    var8.field6139 = arg7;
                    class477 var9 = arg7.field3773;
                    if (var9.field6922 != null) {
                        var8.field6131 = true;
                        var9 = var9.method2903(-1, class491.field7160);
                    }
                    if (var9 != null) {
                        var8.field6157 = var9.field6921 + arg5 << 7;
                        var8.field6155 = var9.field6921 + arg1 << 7;
                        var8.field6140 = class19.method170(false, arg7);
                        var8.field6137 = var9.field6925;
                        var8.field6143 = var9.field6971 << 7;
                    }
                    class149.field1884.method163(var8, arg4 ^ -123);
                }
            } else {
                var8.field6151 = arg0;
                int var10 = arg0.field1272;
                int var11 = arg0.field1282;
                if (~arg2 == -2 || ~arg2 == -4) {
                    var11 = arg0.field1272;
                    var10 = arg0.field1282;
                }
                var8.field6142 = arg0.field1232;
                var8.field6143 = arg0.field1268 << 7;
                var8.field6137 = arg0.field1314;
                var8.field6155 = arg1 - -var11 << 7;
                var8.field6157 = arg5 + var10 << 7;
                var8.field6140 = arg0.field1293;
                var8.field6149 = arg0.field1264;
                var8.field6146 = arg0.field1236;
                if (arg0.field1291 != null) {
                    var8.field6131 = true;
                    var8.method2539((byte) 35);
                }
                if (var8.field6142 != null) {
                    var8.field6130 = var8.field6146 + (int) ((double) (-var8.field6146 + var8.field6149) * Math.random());
                }
                class144.field1850.method163(var8, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        ++field3161;
        int var4 = this.field3160 * arg0 >> 12;
        int var5 = this.field3152 * arg0 >> 12;
        int var6 = this.field3154 * arg1 >> 12;
        if (arg2 == 0) {
            int var7 = this.field3158 * arg1 >> 12;
            class488.method2962(arg2 ^ 16, super.field1048, var4, var6, var5, var7);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIII)V")
    public static final void method1484(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3156;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class33.method242(arg2 + arg3, class147.field1870, class237.field3019, (byte) -128);
        int var10 = class33.method242(-arg3 + arg2, class147.field1870, class237.field3019, (byte) -128);
        class184.method1160(class387.field5088[arg4], -7, arg0, var9, var10);
        if (arg1 > 70) {
            while (var6 > var5) {
                var8 += 2;
                var7 += var8;
                if (var7 > 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = arg4 - var6;
                    int var12 = arg4 + var6;
                    if (~class533.field7845 >= ~var12 && var11 <= class289.field3694) {
                        int var13 = class33.method242(arg2 - -var5, class147.field1870, class237.field3019, (byte) -128);
                        int var14 = class33.method242(-var5 + arg2, class147.field1870, class237.field3019, (byte) -128);
                        if (class289.field3694 >= var12) {
                            class184.method1160(class387.field5088[var12], -7, arg0, var13, var14);
                        }
                        if (~class533.field7845 >= ~var11) {
                            class184.method1160(class387.field5088[var11], -7, arg0, var13, var14);
                        }
                    }
                }
                ++var5;
                int var15 = -var5 + arg4;
                int var16 = arg4 - -var5;
                if (~class533.field7845 >= ~var16 && var15 <= class289.field3694) {
                    int var17 = class33.method242(arg2 + var6, class147.field1870, class237.field3019, (byte) -128);
                    int var18 = class33.method242(-var6 + arg2, class147.field1870, class237.field3019, (byte) -128);
                    if (~class289.field3694 <= ~var16) {
                        class184.method1160(class387.field5088[var16], -7, arg0, var17, var18);
                    }
                    if (~var15 <= ~class533.field7845) {
                        class184.method1160(class387.field5088[var15], -7, arg0, var17, var18);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        ++field3155;
        int var4 = this.field3160 * arg0 >> 12;
        int var5 = this.field3152 * arg0 >> 12;
        int var6 = this.field3154 * arg1 >> 12;
        int var7 = this.field3158 * arg1 >> 12;
        if (arg2 != 22742) {
            field3153 = null;
        }
        class53.method524(super.field1052, false, var7, super.field1048, super.field1044, var6, var4, var5);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)V")
    public final void method679(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field3158 = 54;
        }
        ++field3162;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIII)V")
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3154 = arg1;
        this.field3158 = arg3;
        this.field3160 = arg0;
        this.field3152 = arg2;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public static final void method1485(int arg0) {
        if (~class269.field3401 <= -1) {
            long var1 = class504.method3034((byte) -95);
            class269.field3401 = (int) ((long) class269.field3401 - (-class183.field2399 + var1));
            if (~class269.field3401 >= -1) {
                class513.field7437 = class1.field10.field7740;
                class75.field972 = class1.field10.field7748;
                class379.field4988 = class1.field10.field7746;
                class378.field4975 = class1.field10.field7739;
                class269.field3401 = -1;
                class510.field7367 = class1.field10.field7745;
                class450.field6492 = class1.field10.field7741;
                class414.field5898 = class1.field10.field7736;
                class274.field3443 = class1.field10.field7742;
                class299.field3853 = class1.field10.field7734;
                class108.field1358 = class1.field10.field7733;
            } else {
                int var3 = (class269.field3401 << 8) / class321.field4077;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class75.field972 = (-16711936 & (class219.field2795 & 16711935) * var3 - -((class1.field10.field7748 & 16711935) * var4)) - -((65280 & class219.field2795) * var3 + (class1.field10.field7748 & 65280) * var4 & 16711680) >>> 8;
                class274.field3443 = (class1.field10.field7742 - class141.field1831) * var6 + class141.field1831;
                class414.field5898 = (class1.field10.field7736 - class280.field3559) * var6 + class280.field3559;
                class510.field7367 = ((class213.field2743 & 65280) * var3 + (65280 & class1.field10.field7745) * var4 & 16711680) + ((class213.field2743 & 16711935) * var3 + (16711935 & class1.field10.field7745) * var4 & -16711936) >>> 8;
                class108.field1358 = (class1.field10.field7733 - class342.field4322) * var6 + class342.field4322;
                class513.field7437 = class394.field5287 * var3 + class1.field10.field7740 * var4 >> 8;
                class378.field4975 = (class1.field10.field7739 - class180.field2385) * var6 + class180.field2385;
                class379.field4988 = (-class175.field2276 + class1.field10.field7746) * var6 + class175.field2276;
                class450.field6492 = (class1.field10.field7741 - class534.field7856) * var6 + class534.field7856;
                if (class53.field708 != class1.field10.field7734) {
                    class299.field3853 = class303.field3890.method273(class53.field708, class1.field10.field7734, var6, class299.field3853);
                }
            }
            class183.field2399 = var1;
        }
        ++field3157;
        if (arg0 != 16711680) {
            method1486(8);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static void method1486(int arg0) {
        field3159 = null;
        if (arg0 > -126) {
            method1484(90, (byte) 70, 84, -32, -106);
        }
        field3153 = null;
    }
}
