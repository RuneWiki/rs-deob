import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class89 extends class138 {

    @OriginalMember(owner = "client!ui", name = "Db", descriptor = "[[[Lvc;")
    public static class129[][][] field1388 = new class129[4][104][104];

    @OriginalMember(owner = "client!ui", name = "Hb", descriptor = "Lce;")
    private static class126 field1392 = class206.method1445(-7923, "Loaded fonts");

    @OriginalMember(owner = "client!ui", name = "Ob", descriptor = "Lce;")
    public static class126 field1399 = field1392;

    @OriginalMember(owner = "client!ui", name = "Fb", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ui", name = "Gb", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ui", name = "Ib", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ui", name = "Jb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ui", name = "Lb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ui", name = "Pb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ui", name = "Qb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ui", name = "Rb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ui", name = "Sb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ui", name = "Kb", descriptor = "J")
    public static long field1395;

    @OriginalMember(owner = "client!ui", name = "Eb", descriptor = "Lih;")
    public class304 field1389;

    @OriginalMember(owner = "client!ui", name = "Mb", descriptor = "[I")
    public static int[] field1397;

    @OriginalMember(owner = "client!ui", name = "Nb", descriptor = "[[Lbi;")
    public static class201[][] field1398;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BS)Z", line = 5)
    public static final boolean method621(byte arg0, short arg1) {
        if (arg0 != -3) {
            method621((byte) 21, (short) -59);
        }
        field1403++;
        if (arg1 == 19 || arg1 == 58 || arg1 == 44 || arg1 == 35 || arg1 == 18 || arg1 == 20 || arg1 == 42 || arg1 == 37) {
            return true;
        } else if (arg1 == 41 || arg1 == 36 || arg1 == 1001 || arg1 == 1005) {
            return true;
        } else if (arg1 == 33 || arg1 == 39 || arg1 == 10 || arg1 == 22 || arg1 == 49) {
            return true;
        } else {
            return arg1 == 45 || arg1 == 48 || arg1 == 31 || arg1 == 16 || arg1 == 21 || arg1 == 57;
        }
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V", line = 43)
    public static final void method622(int arg0) {
        field1400++;
        while (class227.field3834.method1237(class315.field5404, false) >= 11) {
            int var1 = class227.field3834.method1241(11, -122);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class85.field1352[var1] == null) {
                var2 = true;
                class85.field1352[var1] = new class301();
                if (class229.field3861[var1] != null) {
                    class85.field1352[var1].method2023((byte) -128, class229.field3861[var1]);
                }
            }
            class166.field2958[class239.field4036++] = var1;
            class301 var3 = class85.field1352[var1];
            var3.field2447 = class249.field4174;
            int var4 = class55.field838[class227.field3834.method1241(3, arg0 ^ 0xFFFFFFB2)];
            if (var2) {
                var3.field2444 = var3.field2483 = var4;
            }
            int var5 = class227.field3834.method1241(5, arg0 ^ 0x3F);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class227.field3834.method1241(1, 65);
            int var7 = class227.field3834.method1241(1, -109);
            if (var7 == 1) {
                class139.field2526[class206.field3528++] = var1;
            }
            int var8 = class227.field3834.method1241(5, -126);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method2027(class286.field4744.field2460[0] + var5, var6 == 1, class286.field4744.field2471[0] + var8, 0);
        }
        class227.field3834.method1243(arg0 ^ 0xFFFF8BAA);
        if (arg0 != 50) {
            method621((byte) -19, (short) 56);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)V", line = 110)
    public static final void method623(int arg0, int arg1) {
        field1391++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class58.field900 += arg1 * 128;
        if (class317.field5439.length < class58.field900) {
            class58.field900 -= class317.field5439.length;
            int var3 = (int) (Math.random() * 12.0D);
            class82.method581(5672, class250.field4180[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class120.field2018[var4 + var5] - class317.field5439[class317.field5439.length - 1 & var4 - -class58.field900] * arg1 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class120.field2018[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class120.field2018[var10 + var11] = 255;
                } else {
                    class120.field2018[var10 + var11] = 0;
                }
            }
        }
        if (arg0 != 50) {
            method621((byte) 124, (short) 15);
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class296.field4925[var13] = class296.field4925[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class296.field4925[var14] = (int) (Math.sin((double) class20.field269 / 14.0D) * 16.0D + Math.sin((double) class20.field269 / 15.0D) * 14.0D + Math.sin((double) class20.field269 / 16.0D) * 12.0D);
            class20.field269++;
        }
        class39.field615 += arg1;
        int var15 = ((class249.field4174 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class39.field615; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class120.field2018[(var18 << 7) + var17] = 192;
        }
        class39.field615 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class120.field2018[var15 + var21 + var22];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class120.field2018[var21 - (var15 - var22) - 1];
                }
                if (var22 >= 0) {
                    class285.field4724[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class285.field4724[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class285.field4724[var23 + var26 - var15 * 128 - 128];
                }
                if (var25 >= 0) {
                    class120.field2018[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V", line = 294)
    public static void method624(int arg0) {
        if (arg0 != -24914) {
            return;
        }
        field1399 = null;
        field1388 = (class129[][][]) null;
        field1397 = null;
        field1392 = null;
        field1398 = (class201[][]) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lih;I)V", line = 308)
    public final void method625(class304 arg0, int arg1) {
        if (arg1 != 18) {
            method623(57, -10);
        }
        this.field1389 = arg0;
        field1396++;
        if (this.field2451 != null) {
            this.field2451.method1472();
        }
    }

    @OriginalMember(owner = "client!ui", name = "finalize", descriptor = "()V", line = 324)
    protected final void finalize() {
        field1390++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()I", line = 337)
    public final int method225() {
        field1402++;
        return this.field2467;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V", line = 345)
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1393++;
        if (this.field1389 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Z", line = 370)
    public final boolean method626(int arg0) {
        field1394++;
        if (this.field1389 == null) {
            return false;
        } else {
            int var2 = -11 / ((-arg0 - 29) / 58);
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIJILqj;)V", line = 386)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10) {
        field1401++;
        if (this.field1389 == null) {
            return;
        }
        class294 var13 = this.field2476 != -1 && this.field2449 == 0 ? class110.method721(-126, this.field2476) : null;
        class294 var14 = this.field2501 == -1 || this.field2501 == this.field2441 && var13 != null ? null : class110.method721(-125, this.field2501);
        class196 var15 = this.field1389.method2048(false, var13, this.field2509, this.field2503, var14);
        if (var15 == null) {
            return;
        }
        this.field2467 = var15.method225();
        class304 var16 = this.field1389;
        if (var16.field5059 != null) {
            var16 = var16.method2038((byte) 116);
        }
        if (class32.field472 && var16.field5116) {
            class196 var17 = class186.method1343(this.field2461, this.field2505, var15, this.field1389.field5072, this.field1389.field5104, var14 == null ? var13 : var14, 1, this.field1389.field5071, this.field1389.field5083, arg0, this.field2487, this.field2440, this.field1389.field5109, var14 == null ? this.field2509 : this.field2503);
            if (class56.field846) {
                float var18 = class56.method376();
                float var19 = class56.method379();
                class56.method356();
                class56.method353(var18, var19 - 150.0F);
                var17.method241(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2451);
                class56.method360();
                class56.method353(var18, var19);
            } else {
                var17.method241(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2451);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field1389.field5103 != 0 || this.field1389.field5067 != 0) {
            int var23 = class236.field3985[arg0];
            int var24 = class236.field3971[arg0];
            short var25 = this.field1389.field5103;
            int var26 = -var25 / 2;
            short var27 = this.field1389.field5067;
            int var28 = -var27 / 2;
            int var29 = var24 * var28 - (var23 * var26) >> 16;
            int var30 = var23 * var28 + var24 * var26 >> 16;
            int var31 = var25 / 2;
            int var32 = class174.method1265(this.field2487 + var29, 8100, class131.field2250, this.field2461 + var30);
            int var33 = -var27 / 2;
            int var34 = var23 * var33 + (var24 * var31) >> 16;
            int var35 = var24 * var33 - (var23 * var31) >> 16;
            int var36 = class174.method1265(this.field2487 + var35, 8100, class131.field2250, this.field2461 + var34);
            int var37 = -var25 / 2;
            int var38 = var27 / 2;
            int var39 = var24 * var38 - var23 * var37 >> 16;
            int var40 = var23 * var38 + (var24 * var37) >> 16;
            int var41 = class174.method1265(this.field2487 + var39, 8100, class131.field2250, this.field2461 + var40);
            int var42 = var25 / 2;
            int var43 = var27 / 2;
            int var44 = var23 * var43 + var24 * var42 >> 16;
            int var45 = var24 * var43 - (var23 * var42) >> 16;
            int var46 = class174.method1265(this.field2487 + var45, 8100, class131.field2250, this.field2461 + var44);
            int var47 = var32 + var46;
            int var48 = var36 < var46 ? var36 : var46;
            int var49 = var41 >= var46 ? var46 : var41;
            int var50 = var41 <= var32 ? var41 : var32;
            int var51 = var32 >= var36 ? var36 : var32;
            if (var27 != 0) {
                var22 = (int) (Math.atan2((double) (var51 - var49), (double) var27) * 325.95D) & 0x7FF;
                if (var22 != 0) {
                    var15.method218(var22);
                }
            }
            if (var25 != 0) {
                var20 = (int) (Math.atan2((double) (var50 - var48), (double) var25) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method212(var20);
                }
            }
            if (var36 + var41 < var47) {
                var47 = var36 + var41;
            }
            var21 = (var47 >> 1) - this.field2440;
            if (var21 != 0) {
                var15.method240(0, var21, 0);
            }
        }
        class196 var52 = null;
        if (this.field2445 != -1 && this.field2477 != -1) {
            class168 var53 = class173.method1261(false, this.field2445);
            var52 = var53.method1224((byte) 56, this.field2477);
            if (var52 != null) {
                var52.method240(0, -this.field2495, 0);
                if (var53.field2974) {
                    if (var22 != 0) {
                        var52.method218(var22);
                    }
                    if (var20 != 0) {
                        var52.method212(var20);
                    }
                    if (var21 != 0) {
                        var52.method240(0, var21, 0);
                    }
                }
            }
        }
        if (!class56.field846) {
            if (var52 != null) {
                var15 = ((class38) var15).method224(var52);
            }
            if (this.field1389.field5109 == 1) {
                var15.field3364 = true;
            }
            var15.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2451);
            return;
        }
        if (this.field1389.field5109 == 1) {
            var15.field3364 = true;
        }
        var15.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2451);
        if (var52 != null) {
            if (this.field1389.field5109 == 1) {
                var52.field3364 = true;
            }
            var52.method241(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2451);
        }
    }
}
