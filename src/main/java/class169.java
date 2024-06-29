import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class169 implements class248 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lne;")
    private class118 field2438 = new class118(256);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lnl;")
    private class435 field2443;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lnl;")
    private class435 field2455;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lkb;")
    private class308[] field2448;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[Lqi;")
    public static class430[] field2449 = new class430[4];

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Z")
    public static boolean field2453 = true;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lap;")
    public static class310 field2450 = new class310(42, 3);

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2451++;
        int var8 = class67.method630(0, arg1, class151.field2091, class444.field6338);
        int var9 = class67.method630(0, arg7, class151.field2091, class444.field6338);
        int var10 = class67.method630(0, arg0, class103.field1457, class295.field4153);
        if (arg5 != -21895) {
            return;
        }
        int var11 = class67.method630(0, arg3, class103.field1457, class295.field4153);
        int var12 = class67.method630(0, arg1 + arg6, class151.field2091, class444.field6338);
        int var13 = class67.method630(0, arg7 - arg6, class151.field2091, class444.field6338);
        for (int var14 = var8; var14 < var12; var14++) {
            class61.method558(var11, -10647, class373.field5141[var14], var10, arg4);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class61.method558(var11, -10647, class373.field5141[var15], var10, arg4);
        }
        int var16 = class67.method630(0, arg0 + arg6, class103.field1457, class295.field4153);
        int var17 = class67.method630(0, arg3 - arg6, class103.field1457, class295.field4153);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class373.field5141[var18];
            class61.method558(var16, -10647, var19, var10, arg4);
            class61.method558(var17, arg5 + 11248, var19, var16, arg2);
            class61.method558(var11, arg5 ^ 0x7C10, var19, var17, arg4);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
    public final boolean method1223(int arg0, int arg1) {
        field2442++;
        if (arg0 != -29838) {
            this.method1226(107, -53, true, 1.0861952F, -75, 105);
        }
        class379 var3 = this.method1233(arg1, -2);
        return var3 != null && var3.method2312(this.field2455, true, this);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Lkb;")
    public final class308 method1224(byte arg0, int arg1) {
        field2457++;
        if (arg0 != 110) {
            field2450 = null;
        }
        return this.field2448[arg1];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZBZ)V")
    public static final void method1225(boolean arg0, byte arg1, boolean arg2) {
        if (arg2) {
            class86.field1216--;
            if (class86.field1216 == 0) {
                class21.field227 = null;
            }
        }
        if (arg0) {
            class227.field3263--;
            if (class227.field3263 == 0) {
                class439.field6229 = null;
            }
        }
        field2439++;
        if (arg1 < 8) {
            method1234(-81, (byte[]) null, -74, 47, 76, 63);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZFII)[I")
    public final int[] method1226(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field2445++;
        if (arg1 != -20) {
            method1227((byte) 113);
        }
        return this.method1233(arg5, -2).method2309(this.field2448[arg5].field4367, arg4, this, (double) arg3, arg0, (byte) -96, this.field2455);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field2449 = null;
        field2450 = null;
        int var1 = -94 / ((-arg0 - 18) / 57);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIIF)[F")
    public final float[] method1228(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
        int var7 = -122 % ((arg3 + 5) / 50);
        field2458++;
        return this.method1233(arg1, -2).method2307(false, arg4, this.field2455, this.field2448[arg1].field4367, this, arg0);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public static final int method1229(int arg0, int arg1) {
        if (arg0 <= 3) {
            return -76;
        } else {
            field2452++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)I")
    public static final int method1230(int arg0, int arg1) {
        field2444++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 != 0) {
            field2449 = null;
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIZIF)[I")
    public final int[] method1231(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        if (arg4 != -22414) {
            field2450 = null;
        }
        field2440++;
        return this.method1233(arg0, arg4 + 22412).method2310(arg2, this.field2455, arg1, this, 255, arg3, this.field2448[arg0].field4367, (double) arg5);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)I")
    public static final int method1232(int arg0, int arg1) {
        field2447++;
        if (arg0 < 96) {
            return 0;
        } else {
            if (arg1 != -4203) {
                field2449 = null;
            }
            return arg0 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(II)Luj;")
    private final class379 method1233(int arg0, int arg1) {
        field2441++;
        class47 var3 = this.field2438.method917(-6700, (long) arg0);
        if (var3 != null) {
            return (class379) var3;
        }
        if (arg1 != -2) {
            this.method1231(-16, -88, 17, true, -123, -0.4609997F);
        }
        byte[] var4 = this.field2443.method2650((byte) -72, arg0);
        if (var4 == null) {
            return null;
        } else {
            class379 var5 = new class379(new class161(var4));
            this.field2438.method922((long) arg0, 86, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[BIIII)Z")
    public static final boolean method1234(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 3 / ((-arg0 - 87) / 34);
        field2456++;
        boolean var7 = true;
        class161 var8 = new class161(arg1);
        int var9 = -1;
        label68: while (true) {
            int var10 = var8.method1141(11160);
            if (var10 == 0) {
                return var7;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                int var16;
                class267 var19;
                do {
                    int var17;
                    int var18;
                    do {
                        do {
                            do {
                                do {
                                    while (var12) {
                                        int var20 = var8.method1133(0);
                                        if (var20 == 0) {
                                            continue label68;
                                        }
                                        var8.method1172((byte) -122);
                                    }
                                    int var13 = var8.method1133(0);
                                    if (var13 == 0) {
                                        continue label68;
                                    }
                                    var11 += var13 - 1;
                                    int var14 = var11 & 0x3F;
                                    int var15 = var11 >> 6 & 0x3F;
                                    var16 = var8.method1172((byte) -109) >> 2;
                                    var17 = arg4 + var15;
                                    var18 = arg3 + var14;
                                } while (var17 <= 0);
                            } while (var18 <= 0);
                        } while (var17 >= (arg2 - 1));
                    } while (arg5 - 1 <= var18);
                    var19 = class468.field6599.method506(-122, var9);
                } while (var16 == 22 && !class181.field2743 && var19.field3902 == 0 && var19.field3847 != 1 && !var19.field3899);
                var12 = true;
                if (!var19.method1807((byte) -121)) {
                    class448.field6381++;
                    var7 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lnl;Lnl;Lnl;)V")
    public class169(class435 arg0, class435 arg1, class435 arg2) {
        this.field2443 = arg1;
        this.field2455 = arg2;
        class161 var4 = new class161(arg0.method2633(0, 0, 109));
        int var5 = var4.method1134(-16848);
        this.field2448 = new class308[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1172((byte) -122) == 1) {
                this.field2448[var6] = new class308();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2448[var7] != null) {
                this.field2448[var7].field4375 = var4.method1172((byte) -126) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2448[var8] != null) {
                this.field2448[var8].field4370 = var4.method1172((byte) 46) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2448[var9] != null) {
                this.field2448[var9].field4361 = var4.method1172((byte) 65) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2448[var10] != null) {
                this.field2448[var10].field4371 = var4.method1172((byte) 6) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2448[var11] != null) {
                this.field2448[var11].field4364 = var4.method1152(-1910700904);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2448[var12] != null) {
                this.field2448[var12].field4369 = var4.method1152(-1910700904);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2448[var13] != null) {
                this.field2448[var13].field4368 = var4.method1152(-1910700904);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2448[var14] != null) {
                this.field2448[var14].field4373 = var4.method1152(-1910700904);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2448[var15] != null) {
                this.field2448[var15].field4365 = (short) var4.method1134(-16848);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2448[var16] != null) {
                this.field2448[var16].field4363 = var4.method1152(-1910700904);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2448[var17] != null) {
                this.field2448[var17].field4360 = var4.method1152(-1910700904);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2448[var18] != null) {
                this.field2448[var18].field4376 = var4.method1172((byte) 122) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2448[var19] != null) {
                this.field2448[var19].field4367 = var4.method1172((byte) -118) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2448[var20] != null) {
                this.field2448[var20].field4362 = var4.method1152(-1910700904);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2448[var21] != null) {
                this.field2448[var21].field4366 = var4.method1172((byte) 46) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2448[var22] != null) {
                this.field2448[var22].field4377 = var4.method1172((byte) -117) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2448[var23] != null) {
                this.field2448[var23].field4372 = var4.method1172((byte) 118) == 1;
            }
        }
    }
}
