import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class509 {

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lso;")
    private class330 field7380 = new class330();

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field7376;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    private int field7377;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lqh;")
    private class50 field7374;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field7372 = 0;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field7387 = 1;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field7393;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hn", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field7394;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLpt;)V")
    private final void method3030(byte arg0, class371 arg1) {
        field7385++;
        int var3 = -46 / ((arg0 + 6) / 54);
        if (arg1 != null) {
            arg1.method2674(true);
            arg1.method3022((byte) 54);
            this.field7376 += arg1.field5042;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
    public static final void method3031(int arg0, int arg1) {
        field7392++;
        class509 var2 = class374.field5067;
        synchronized (class374.field5067) {
            class374.field5067.method3036(arg1, (byte) -16);
            int var3 = -117 % ((arg0 + 61) / 52);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method3032(int arg0, long arg1) {
        field7388++;
        class371 var4 = (class371) this.field7374.method295(arg1, -114);
        if (arg0 != 3589) {
            this.field7380 = null;
        }
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method188(21051);
        if (var5 == null) {
            var4.method2674(true);
            var4.method3022((byte) 54);
            this.field7376 += var4.field5042;
            return null;
        }
        if (var4.method187(arg0 ^ 0xE07)) {
            class34 var6 = new class34(var5, var4.field5042);
            this.field7374.method291(var4.field6348, var6, -69);
            this.field7380.method1938(true, var6);
            var6.field7348 = 0L;
            var4.method2674(true);
            var4.method3022((byte) 54);
        } else {
            this.field7380.method1938(true, var4);
            var4.field7348 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IJ)V")
    private final void method3033(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method3040((byte) -100);
        }
        field7389++;
        class371 var4 = (class371) this.field7374.method295(arg1, -115);
        this.method3030((byte) 62, var4);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public final void method3034(byte arg0) {
        if (arg0 <= 66) {
            field7386 = -59;
        }
        for (class371 var2 = (class371) this.field7380.method1937(false); var2 != null; var2 = (class371) this.field7380.method1932(-2)) {
            if (var2.method187(2)) {
                var2.method2674(true);
                var2.method3022((byte) 54);
                this.field7376 += var2.field5042;
            }
        }
        field7393++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(JILjava/lang/Object;I)V")
    private final void method3035(long arg0, int arg1, Object arg2, int arg3) {
        field7381++;
        if (this.field7377 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method3033(0, arg0);
        this.field7376 -= arg3;
        while (this.field7376 < 0) {
            class371 var7 = (class371) this.field7380.method1934((byte) 48);
            this.method3030((byte) 98, var7);
        }
        class34 var6 = new class34(arg2, arg3);
        this.field7374.method291(arg0, var6, -72);
        if (arg1 != 29543) {
            this.method3036(13, (byte) -21);
        }
        this.field7380.method1938(true, var6);
        var6.field7348 = 0L;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
    public final void method3036(int arg0, byte arg1) {
        field7384++;
        if (arg1 >= -10 || class283.field3746 == null) {
            return;
        }
        for (class371 var3 = (class371) this.field7380.method1937(false); var3 != null; var3 = (class371) this.field7380.method1932(-2)) {
            if (var3.method187(2)) {
                if (var3.method188(21051) == null) {
                    var3.method2674(true);
                    var3.method3022((byte) 54);
                    this.field7376++;
                }
            } else if (((long) arg0) < (++var3.field7348)) {
                class371 var4 = class283.field3746.method1471(var3, false);
                this.field7374.method291(var3.field6348, var4, -104);
                class445.method2748(var3, var4, 29359);
                var3.method2674(true);
                var3.method3022((byte) 54);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Llr;[II[I[I)V")
    public static final void method3037(class531 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg0.field1218.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1218[var9] = null;
                    } else {
                        class260 var10 = class7.field97.method2951(var6, -13765);
                        int var11 = var10.field3475;
                        class533 var12 = arg0.field1218[var9];
                        if (var12 != null) {
                            if (var12.field7847 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1218[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field7842 = 0;
                                    var12.field7843 = var8;
                                    var12.field7844 = 0;
                                    var12.field7841 = 0;
                                    var12.field7845 = 1;
                                    class276.method1678(var10, arg0.field3695, arg0.field3704, (byte) 101, arg0.field3694, class96.field1170 == arg0, 0);
                                } else if (var11 == 2) {
                                    var12.field7844 = 0;
                                }
                            } else if (var10.field3478 >= class7.field97.method2951(var12.field7847, -13765).field3478) {
                                var12 = arg0.field1218[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class533 var13 = arg0.field1218[var9] = new class533();
                            var13.field7844 = 0;
                            var13.field7847 = var6;
                            var13.field7842 = 0;
                            var13.field7843 = var8;
                            var13.field7841 = 0;
                            var13.field7845 = 1;
                            class276.method1678(var10, arg0.field3695, arg0.field3704, (byte) 86, arg0.field3694, class96.field1170 == arg0, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field7370++;
        if (arg2 <= 125) {
            field7372 = -50;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
    public final int method3038(int arg0) {
        field7369++;
        int var2 = arg0;
        for (class371 var3 = (class371) this.field7380.method1937(false); var3 != null; var3 = (class371) this.field7380.method1932(-2)) {
            if (!var3.method187(2)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V")
    public class509(int arg0) {
        this.field7376 = arg0;
        this.field7377 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field7374 = new class50(var2);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
    public final int method3039(int arg0) {
        field7378++;
        if (arg0 != 4) {
            this.method3030((byte) -27, null);
        }
        return this.field7376;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
    public final int method3040(byte arg0) {
        field7371++;
        int var2 = -19 % ((-arg0 - 66) / 52);
        return this.field7377;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lza;II)Z")
    public static final boolean method3041(class287 arg0, int arg1, int arg2) {
        field7375++;
        int var3 = (class308.field4128 - 104) / arg2;
        int var4 = (class426.field6200 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class90.method497(var6, var51, 0, var52, arg1)) {
                        int var53 = var52;
                        if (class381.method2330(false, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class517.method3094(var53, var51, 1, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class6.field75 = arg0.method1218(var7, 0, 512, 512, 512);
        class517.method3091(256);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) - (-((int) (Math.random() * 20.0D)) + -238) - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class217.field2956][class217.field2956];
        for (int var13 = var3; var13 < var3 + 104; var13 += class217.field2956) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class217.field2956) {
                arg0.method1182(0, 0, class217.field2956 * 4, class217.field2956 * 4);
                arg0.method1145(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class217.field2956; var44++) {
                        for (int var50 = 0; var50 < class217.field2956; var50++) {
                            var12[var44][var50] = class90.method497(var13 + var44, var36 + var50, 0, var37, arg1);
                        }
                    }
                    class14.field152[var37].method219(0, 0, 1024, var13, var36, class217.field2956 + var13, var36 - -class217.field2956, var12);
                    if (!class71.field915) {
                        for (int var45 = -4; var45 < class217.field2956; var45++) {
                            for (int var46 = -4; var46 < class217.field2956; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class90.method497(var47, var48, 0, var37, arg1)) {
                                    int var49 = var37;
                                    if (class381.method2330(false, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class468.method2857((byte) 81, var47, var49, arg0, var45 * 4, var10, var9, var48, (class217.field2956 - var46) * 4 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class71.field915) {
                    class106 var38 = class96.field1223[arg1];
                    for (int var39 = 0; var39 < class217.field2956; var39++) {
                        for (int var40 = 0; var40 < class217.field2956; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field1421[var41 - var38.field1444][var42 - var38.field1440];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method1717(4, var39 * 4, 4, -1713569622, -22794, (class217.field2956 - var40) * 4 - 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method1718(var39 * 4, 4, (class217.field2956 - var40) * 4 - 4, -1713569622, false);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method1720(4, var39 * 4 + 3, -26028, -1713569622, (class217.field2956 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method1718(var39 * 4, 4, (class217.field2956 - var40) * 4 + 3 - 4, -1713569622, false);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method1720(4, var39 * 4, arg2 - 26030, -1713569622, (class217.field2956 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg0.method1153(0, 0, class217.field2956 * 4, class217.field2956 * 4, var11, 2);
                class6.field75.method8((var13 - var3) * 4 + 48, -(class217.field2956 * 4) + 464 + -((-var4 + var36) * 4), class217.field2956 * 4, class217.field2956 * 4, 0, 0);
            }
        }
        arg0.method1206();
        arg0.method1145(-16777215);
        class104.method628(-120);
        class175.field2258 = 0;
        class351.field4683.method984(false);
        if (!class71.field915) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class90.method497(var14, var20, 0, var21, arg1)) {
                            class448 var22 = (class448) class434.method2671(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class448) class365.method2172(var21, var14, var20, field7394 == null ? (field7394 = method3048("mh")) : field7394);
                            }
                            if (var22 == null) {
                                var22 = (class448) class48.method279(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class448) class107.method663(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class70 var23 = class123.field1593.method2920(var22.method46(arg2 ^ 0xFFFFFF9B), 19219);
                                if (!var23.field895 || class48.field508) {
                                    int var24 = var23.field862;
                                    if (var23.field848 != null) {
                                        for (int var25 = 0; var25 < var23.field848.length; var25++) {
                                            if (var23.field848[var25] != -1) {
                                                class70 var26 = class123.field1593.method2920(var23.field848[var25], arg2 + 19217);
                                                if (var26.field862 >= 0) {
                                                    var24 = var26.field862;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class48 var28 = class60.field698.method993(var24, -21143);
                                            if (var28 != null && var28.field539) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class96.field1223[var21].field1421;
                                            int var32 = class96.field1223[var21].field1444;
                                            int var33 = class96.field1223[var21].field1440;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 103 > var29 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 103) && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class447.field6512[class175.field2258] = var23.field834;
                                        class190.field2456[class175.field2258] = var29;
                                        class374.field5077[class175.field2258] = var30;
                                        class175.field2258++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class212.field2884 != null) {
                class517.field7627.field4921 = 1;
                class60.field698.method997(64, (byte) 125, 1024);
                for (int var15 = 0; var15 < class212.field2884.field5038; var15++) {
                    int var16 = class212.field2884.field5039[var15];
                    if (var16 >> 28 == class96.field1170.field3695) {
                        int var17 = ((var16 & 0xFFFCC97) >> 14) - class357.field4867;
                        int var18 = (var16 & 0x3FFF) - class418.field6074;
                        if (var17 >= 0 && var17 < class308.field4128 && var18 >= 0 && var18 < class426.field6200) {
                            class351.field4683.method975(arg2 ^ 0x2, new class488(var15));
                        } else {
                            class48 var19 = class60.field698.method993(class212.field2884.field5035[var15], arg2 - 21145);
                            if (var19.field537 != null && var19.field502 + var17 >= 0 && class308.field4128 > var19.field529 + var17 && var19.field540 + var18 >= 0 && class426.field6200 > (var18 + var19.field535)) {
                                class351.field4683.method975(0, new class488(var15));
                            }
                        }
                    }
                }
                class60.field698.method997(64, (byte) 110, 128);
                class517.field7627.field4921 = 2;
                class517.field7627.method2150(arg2 ^ 0x79);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjk;II)V")
    public static final void method3042(boolean arg0, class450 arg1, int arg2, int arg3) {
        field7391++;
        class144 var4 = arg1.method2787(class343.field4596, (byte) 73);
        if (var4 == null) {
            return;
        }
        class343.field4596.method1182(arg2, arg3, arg1.field6612 + arg2, arg3 - -arg1.field6573);
        if (!arg0) {
            return;
        }
        if (class111.field1481 < 3) {
            class331.field4392.method152((float) arg1.field6612 / 2.0F + (float) arg2, (float) arg1.field6573 / 2.0F + (float) arg3, 4096, ((int) (-class143.field1907) & 0x3FFF) << 2, var4, arg2, arg3);
        } else {
            class343.field4596.method1220(-16777216, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3043(int arg0) {
        field7382++;
        if (arg0 != -2679) {
            this.field7377 = 82;
        }
        class371 var2 = (class371) this.field7374.method300((byte) -126);
        while (var2 != null) {
            Object var3 = var2.method188(21051);
            if (var3 != null) {
                return var3;
            }
            class371 var4 = var2;
            var2 = (class371) this.field7374.method301(-113);
            var4.method2674(true);
            var4.method3022((byte) 54);
            this.field7376 += var2.field5042;
        }
        return null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
    public static final void method3044(byte arg0) {
        field7379++;
        class9.field109.method293((byte) 87);
        if (arg0 > -84) {
            method3031(-31, 78);
        }
        class90.field1079.method1933(-2);
        class81.field990.method1933(-2);
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
    public final void method3045(int arg0) {
        this.field7380.method1933(-2);
        field7383++;
        if (arg0 == 48) {
            this.field7374.method293((byte) -107);
            this.field7376 = this.field7377;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method3046(long arg0, Object arg1, int arg2) {
        field7390++;
        this.method3035(arg0, arg2 + 29542, arg1, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3047(int arg0) {
        int var2 = 46 / ((-arg0 - 46) / 32);
        field7368++;
        class371 var3 = (class371) this.field7374.method301(-123);
        while (var3 != null) {
            Object var4 = var3.method188(21051);
            if (var4 != null) {
                return var4;
            }
            class371 var5 = var3;
            var3 = (class371) this.field7374.method301(-125);
            var5.method2674(true);
            var5.method3022((byte) 54);
            this.field7376 += var3.field5042;
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3048(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
