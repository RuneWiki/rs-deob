import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class218 implements class263 {

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lfm;")
    private class53 field3127 = new class53(256);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lkm;")
    private class133 field3115;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lkm;")
    private class133 field3116;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[Lqi;")
    private class234[] field3124;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    public static boolean field3118 = true;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lhi;")
    public static class192 field3123 = new class192();

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
    public static int[] field3130 = new int[32];

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "F")
    public static float field3125;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(II)Lqi;", line = 7)
    public final class234 method1504(int arg0, int arg1) {
        if (arg1 == 23925) {
            field3121++;
            return this.field3124[arg0];
        } else {
            return (class234) null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "(II)Lwb;", line = 26)
    public class274 method1444(int arg0, int arg1) {
        field3120++;
        class36 var3 = this.field3127.method365((long) arg1, 35);
        if (var3 != null) {
            return (class274) var3;
        }
        if (arg0 != 1) {
            this.field3124 = (class234[]) null;
        }
        byte[] var4 = this.field3115.method948((byte) 96, arg1);
        if (var4 == null) {
            return null;
        } else {
            class274 var5 = new class274(new class316(var4));
            this.field3127.method369(0, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLkm;Lkm;II)Lrk;", line = 50)
    public static final class277 method1505(byte arg0, class133 arg1, class133 arg2, int arg3, int arg4) {
        field3122++;
        if (arg0 < 64) {
            return (class277) null;
        } else if (class129.method931(arg4, arg3, arg2, (byte) 85)) {
            return class311.method2133(arg1.method955(arg3, arg4, -21853), (byte) -98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "(II)V", line = 65)
    public static final void method1506(int arg0, int arg1) {
        int var2 = 24 % ((arg0 - 3) / 61);
        field3119++;
        class210.field3038.method720(arg1, 1088);
        class1.field10.method720(arg1, 1088);
        class68.field935.method720(arg1, 1088);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 85)
    public static void method1507(int arg0) {
        if (arg0 >= -53) {
            method1507(-117);
        }
        field3123 = null;
        field3130 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z", line = 104)
    public final boolean method1508(int arg0, byte arg1) {
        field3117++;
        class274 var3 = this.method1444(1, arg0);
        if (arg1 == -76) {
            return var3 != null && var3.method1888(this.field3116, false, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFBIZI)[I", line = 117)
    public final int[] method1509(int arg0, float arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        field3126++;
        return arg2 == -2 ? this.method1444(1, arg3).method1889(this.field3116, arg5, -95, arg4, (double) arg1, this, arg0, this.field3124[arg3].field3311) : (int[]) null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lkm;Lkm;Lkm;)V", line = 132)
    public class218(class133 arg0, class133 arg1, class133 arg2) {
        this.field3115 = arg1;
        this.field3116 = arg2;
        class316 var4 = new class316(arg0.method955(0, 0, -21853));
        int var5 = var4.method2220((byte) 110);
        this.field3124 = new class234[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2219(16448) == 1) {
                this.field3124[var6] = new class234();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3124[var7] != null) {
                this.field3124[var7].field3314 = var4.method2219(16448) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3124[var8] != null) {
                this.field3124[var8].field3307 = var4.method2219(16448) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3124[var9] != null) {
                this.field3124[var9].field3315 = var4.method2219(16448) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3124[var10] != null) {
                this.field3124[var10].field3322 = var4.method2219(16448) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3124[var11] != null) {
                this.field3124[var11].field3312 = var4.method2192(3);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3124[var12] != null) {
                this.field3124[var12].field3309 = var4.method2192(3);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3124[var13] != null) {
                this.field3124[var13].field3301 = var4.method2192(3);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3124[var14] != null) {
                this.field3124[var14].field3306 = var4.method2192(3);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3124[var15] != null) {
                this.field3124[var15].field3299 = (short) var4.method2220((byte) 105);
            }
        }
        if (var4.field4777 < var4.field4798.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3124[var16] != null) {
                    var4.method2192(3);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3124[var17] != null) {
                    var4.method2192(3);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3124[var18] != null) {
                    var4.method2219(16448);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3124[var19] != null) {
                    this.field3124[var19].field3311 = var4.method2219(16448) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3124[var20] != null) {
                    var4.method2192(3);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3124[var21] != null) {
                    var4.method2219(16448);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3124[var22] != null) {
                    var4.method2219(16448);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3124[var23] != null) {
                    var4.method2219(16448);
                }
            }
        }
    }
}
