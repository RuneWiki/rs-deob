import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class427 extends class118 {

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field6275 = 8192;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field6279 = 12288;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field6280 = 0;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private int field6281 = 2048;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    private int field6287 = 2048;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field6276 = 4096;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    private int field6286 = 0;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Lwl;")
    public static class452 field6283 = new class452(70, 8);

    @OriginalMember(owner = "client!va", name = "X", descriptor = "[I")
    public static int[] field6288 = new int[5];

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "Ljg;")
    public static class241 field6289 = new class241(5);

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field6292 = -50;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field6293 = -1;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "[I")
    public static int[] field6294 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Ljg;")
    public static class241 field6296 = new class241(64);

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public static int field6297 = -1;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Liq;")
    public static class134 field6274;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Liq;")
    public static class134 field6277;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field6282;
        if (arg0 != 1) {
            return null;
        } else {
            int[] var3 = super.field1537.method2395(30963, arg1);
            if (super.field1537.field5756) {
                int var4 = class160.field2210[arg1] + -2048;
                for (int var5 = 0; ~class440.field6474 < ~var5; ++var5) {
                    int var6 = class6.field73[var5] - 2048;
                    int var7 = this.field6287 + var6;
                    int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                    int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                    int var10 = var4 - -this.field6280;
                    int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                    int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                    int var13 = this.field6286 + var6;
                    int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                    int var16 = var4 - -this.field6281;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                    var3[var5] = !this.method2632(var12, 83, var9) && !this.method2630(var15, 57, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (arg0 > 103) {
            class316.method1927((byte) 101);
            ++field6291;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)Z")
    private final boolean method2630(int arg0, int arg1, int arg2) {
        ++field6285;
        int var4 = (arg2 - -arg0) * this.field6279 >> 12;
        int var5 = -28 / ((-15 - arg1) / 57);
        int var6 = class47.field582[(var4 * 255 & 1045623) >> 12];
        int var7 = (var6 << 12) / this.field6279;
        int var8 = (var7 << 12) / this.field6275;
        int var9 = this.field6276 * var8 >> 12;
        return var9 > -arg0 + arg2 && ~(-var9) > ~(-arg0 + arg2);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public static final void method2631(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field6290;
        class170 var5 = class455.method2827(arg2, arg1, arg4);
        if (var5 != null) {
            if (var5.field2547 != null) {
                class327 var6 = new class327();
                var6.field4909 = var5;
                var6.field4915 = arg0;
                var6.field4908 = var5.field2547;
                var6.field4907 = arg3;
                class384.method2316(var6);
            }
            boolean var7 = true;
            if (~var5.field2473 != -1) {
                var7 = class310.method1890(var5, (byte) 0);
            }
            if (var7) {
                if (client.method2796(var5).method1904(arg3 + -1, 36)) {
                    if (arg3 == 1) {
                        ++class109.field1438;
                        class177.method1082(class47.field574, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (arg3 == 2) {
                        ++class132.field1685;
                        class177.method1082(class90.field1272, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (~arg3 == -4) {
                        ++class90.field1275;
                        class177.method1082(class347.field5177, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (arg3 == 4) {
                        ++class310.field4670;
                        class177.method1082(class137.field1846, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (arg3 == 5) {
                        class177.method1082(class458.field6790, 0);
                        ++class170.field2607;
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (~arg3 == -7) {
                        class177.method1082(class131.field1672, 0);
                        ++class221.field3369;
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (arg3 == 7) {
                        class177.method1082(class288.field4379, 0);
                        ++class186.field2792;
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (~arg3 == -9) {
                        ++class17.field232;
                        class177.method1082(class180.field2711, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (arg3 == 9) {
                        ++class272.field4166;
                        class177.method1082(class312.field4705, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                    if (~arg3 == -11) {
                        ++class415.field6172;
                        class177.method1082(class319.field4822, 0);
                        class360.method2170(arg2, arg4, (byte) 12, var5.field2592);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(III)Z")
    private final boolean method2632(int arg0, int arg1, int arg2) {
        ++field6284;
        int var4 = -28 % ((arg1 - -40) / 32);
        int var5 = (-arg2 + arg0) * this.field6279 >> 12;
        int var6 = class47.field582[(1045997 & var5 * 255) >> 12];
        int var7 = (var6 << 12) / this.field6279;
        int var8 = (var7 << 12) / this.field6275;
        int var9 = this.field6276 * var8 >> 12;
        return var9 > arg0 + arg2 && arg0 + arg2 > -var9;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lci;")
    public static final class100 method2633(int arg0) {
        if (arg0 != -13735) {
            field6293 = 99;
        }
        ++field6278;
        try {
            return (class100) Class.forName("hd").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field6273;
        if (arg1 != 1) {
            method2634(true);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field6275 = arg2.method2323(arg1 ^ -18);
                                }
                            } else {
                                this.field6276 = arg2.method2323(-49);
                            }
                        } else {
                            this.field6279 = arg2.method2323(-121);
                        }
                    } else {
                        this.field6281 = arg2.method2323(-19);
                    }
                } else {
                    this.field6286 = arg2.method2323(-6);
                }
            } else {
                this.field6280 = arg2.method2323(-17);
            }
        } else {
            this.field6287 = arg2.method2323(-7);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class427() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public static void method2634(boolean arg0) {
        field6289 = null;
        field6283 = null;
        field6296 = null;
        field6294 = null;
        field6277 = null;
        if (arg0) {
            field6297 = 27;
        }
        field6288 = null;
        field6274 = null;
    }
}
