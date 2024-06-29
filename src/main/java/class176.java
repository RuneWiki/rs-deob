import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class176 extends class99 {

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    private int field3093 = 4096;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field3089 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "[I")
    public static int[] field3088 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[I")
    public static int[] field3099 = new int[4096];

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Z")
    public static volatile boolean field3098 = false;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lr;")
    private static class66 field3101 = class93.method641(43, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Lr;")
    public static class66 field3097 = field3101;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "Z")
    public static boolean field3095 = true;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lfi;")
    public static class33 field3094 = new class33(0, 0);

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "[J")
    public static long[] field3104 = new long[200];

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Lpb;")
    public static class114 field3090;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "Lsg;")
    public static class247 field3106;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Laf;")
    public static class39 field3103;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILr;)I")
    public static final int method1183(int arg0, class66 arg1) {
        ++field3096;
        if (arg1 == null) {
            return -1;
        } else {
            int var2 = 0;
            if (arg0 != 31601) {
                method1185((byte) 66, 93, 122);
            }
            while (~var2 > ~class173.field3058) {
                if (arg1.method470(false, class233.field4077[var2])) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3097 = null;
        field3088 = null;
        if (arg0 > -65) {
            method1186(-106, 49, 57, 32, 5, 110, 104, -2, (class20) null, 88, true, 60L);
        }
        field3090 = null;
        field3099 = null;
        field3103 = null;
        field3106 = null;
        field3101 = null;
        field3104 = null;
        field3094 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        int[] var3 = super.field1943.method749(false, arg1);
        ++field3100;
        if (arg0 != -61) {
            field3094 = null;
        }
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, class45.field833 & arg1 - 1, 29149);
            int[] var5 = this.method682(0, arg1, 29149);
            int[] var6 = this.method682(0, class45.field833 & arg1 + 1, 29149);
            for (int var7 = 0; ~class199.field3432 < ~var7; ++var7) {
                int var8 = (var5[class98.field1914 & var7 - -1] + -var5[class98.field1914 & var7 + -1]) * this.field3093;
                int var9 = (var6[var7] + -var4[var7]) * this.field3093;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)I")
    public static final int method1185(byte arg0, int arg1, int arg2) {
        ++field3091;
        int var3 = 0;
        int var4 = -40 % ((-47 - arg0) / 34);
        while (~arg2 < -1) {
            var3 = var3 << 1 | 1 & arg1;
            --arg2;
            arg1 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1185((byte) 95, 101, 33);
        }
        ++field3102;
        if (arg1 == 0) {
            this.field3093 = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIILa;IZJ)Z")
    public static final boolean method1186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class20 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class70.field1409 == class30.field453;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class40.field629 || var24 >= class11.field136) {
                    return false;
                }
                class16 var25 = class110.field2124[arg0][var15][var24];
                if (var25 != null && var25.field219 >= 5) {
                    return false;
                }
            }
        }
        class44 var16 = new class44();
        var16.field780 = arg11;
        var16.field786 = arg0;
        var16.field799 = arg5;
        var16.field787 = arg6;
        var16.field789 = arg7;
        var16.field779 = arg8;
        var16.field792 = arg9;
        var16.field791 = arg1;
        var16.field790 = arg2;
        var16.field775 = arg1 + arg3 - 1;
        var16.field771 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class110.field2124[var22][var17][var20] == null) {
                        class110.field2124[var22][var17][var20] = new class16(var22, var17, var20);
                    }
                }
                class16 var23 = class110.field2124[arg0][var17][var20];
                var23.field220[var23.field219] = var16;
                var23.field214[var23.field219] = var21;
                var23.field216 |= var21;
                ++var23.field219;
                if (var13 && class7.field59[var17][var20] != 0) {
                    var14 = class7.field59[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class7.field59[var18][var19] == 0) {
                        class7.field59[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class80.field1564[class224.field3831++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILub;IBI)V")
    public static final void method1187(int arg0, class231 arg1, int arg2, byte arg3, int arg4) {
        ++field3092;
        if (arg3 == 18) {
            for (class217 var5 = (class217) class259.field4539.method873((byte) 76); var5 != null; var5 = (class217) class259.field4539.method870((byte) 109)) {
                if (var5.field3721 == arg2 && ~(arg4 * 128) == ~var5.field3746 && ~(arg0 * 128) == ~var5.field3733 && ~var5.field3727.field4064 == ~arg1.field4064) {
                    if (var5.field3722 != null) {
                        class206.field3528.method1031(var5.field3722);
                        var5.field3722 = null;
                    }
                    if (var5.field3731 != null) {
                        class206.field3528.method1031(var5.field3731);
                        var5.field3731 = null;
                    }
                    var5.method560(arg3 ^ -17540);
                    return;
                }
            }
        }
    }
}
