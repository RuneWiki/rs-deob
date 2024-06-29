import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class298 {

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public int field4094 = 8;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public int field4090 = 16777215;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public int field4096;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "Z")
    public boolean field4097;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIZII)V", line = 9)
    public static final void method1747(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4098++;
        int var6 = arg1 - arg5;
        int var7 = arg4 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class236.method1453(arg5, arg0, (byte) 16, arg1, arg2);
            }
        } else if (var6 == 0) {
            class519.method3098(arg2, arg0, arg5, arg4, -92);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg3) {
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg0;
                    int var10 = arg4;
                    arg0 = arg5;
                    arg4 = arg1;
                    arg5 = var9;
                    arg1 = var10;
                }
                if (arg0 > arg4) {
                    int var11 = arg0;
                    arg0 = arg4;
                    int var12 = arg5;
                    arg5 = arg1;
                    arg4 = var11;
                    arg1 = var12;
                }
                int var13 = arg5;
                int var14 = arg4 - arg0;
                int var15 = arg1 - arg5;
                int var16 = -(var14 >> 1);
                int var17 = arg1 <= arg5 ? -1 : 1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg0; var19 <= arg4; var19++) {
                        var16 += var15;
                        class437.field6400[var19][var13] = arg2;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg0; var18 <= arg4; var18++) {
                        class437.field6400[var13][var18] = arg2;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILsi;)V", line = 129)
    public final void method1748(int arg0, class391 arg1) {
        field4100++;
        if (arg0 != 14776) {
            this.field4094 = 4;
        }
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                return;
            }
            this.method1750(var3, -52, arg1);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILem;Lya;)V", line = 158)
    public static final void method1749(int arg0, int arg1, int arg2, class150 arg3, class38 arg4) {
        field4089++;
        class10 var5 = arg3.method1012(false, arg4);
        int var6 = -33 % ((arg2 - 68) / 56);
        if (var5 == null) {
            return;
        }
        arg4.method279(arg1, arg0, arg3.field2204 + arg1, arg3.field2322 + arg0);
        if (class18.field238 == 2 || class18.field238 == 5 || class230.field3253 == null) {
            arg4.method291(-16777216, var5, arg1, arg0);
            return;
        }
        int var7;
        int var8;
        int var9;
        int var10;
        if (class491.field7168 == 4) {
            var7 = (int) (-class498.field7255) & 0x3FFF;
            var8 = 4096;
            var9 = class177.field2621;
            var10 = class405.field5940;
        } else {
            var10 = class316.field4324.field1732;
            var9 = class316.field4324.field1735;
            var7 = (int) (-class498.field7255) + class302.field4143 & 0x3FFF;
            var8 = 4096 - (class162.field2435 * 16);
        }
        int var11 = var10 / 32 + (48 - (class527.field7799 * 2 - 208));
        int var12 = class422.field6182 * 4 + 48 - (class422.field6182 * 2 - 208) - (var9 / 32);
        class230.field3253.method96((float) arg3.field2204 / 2.0F + (float) arg1, (float) arg3.field2322 / 2.0F + (float) arg0, (float) var11, (float) var12, var8, var7 << 2, var5, arg1, arg0);
        for (class500 var13 = (class500) class434.field6361.method2818((byte) -37); var13 != null; var13 = (class500) class434.field6361.method2820((byte) -58)) {
            int var55 = var13.field7369;
            int var56 = ((class398.field5823.field6043[var55] & 0xFFFF286) >> 14) - class510.field7566;
            int var57 = (class398.field5823.field6043[var55] & 0x3FFF) - class14.field204;
            int var58 = var56 * 4 + 2 - (var10 / 32);
            int var59 = var57 * 4 - ((var9 / 32) - 2);
            class409.method2450(arg3, class398.field5823.field6038[var55], var58, arg4, arg1, var5, 32, arg0, var59);
        }
        for (int var14 = 0; var14 < class168.field2514; var14++) {
            int var52 = class26.field351[var14] * 4 + (2 - var10 / 32);
            int var53 = class515.field7615[var14] * 4 + 2 - (var9 / 32);
            class220 var54 = class78.field1141.method2103(class95.field1461[var14], true);
            if (var54.field3080 != null) {
                var54 = var54.method1362(true, class421.field6166);
                if (var54 == null || var54.field3129 == -1) {
                    continue;
                }
            }
            class409.method2450(arg3, var54.field3129, var52, arg4, arg1, var5, 32, arg0, var53);
        }
        for (class135 var15 = (class135) class36.field457.method1494(0); var15 != null; var15 = (class135) class36.field457.method1493((byte) 98)) {
            int var49 = (int) (var15.field3615 >> 28 & 0x3L);
            if (class242.field3385 == var49) {
                int var50 = (int) (var15.field3615 & 0x3FFFL) * 4 + (2 - var10 / 32);
                int var51 = (int) (var15.field3615 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class315.method1835(var50, 0, var5, arg1, class157.field2386[0], var51, arg0, arg3);
            }
        }
        for (int var16 = 0; var16 < class275.field3772; var16++) {
            class502 var45 = class378.field5533[class65.field899[var16]];
            if (var45 != null && var45.method2942((byte) -123) && class316.field4324.field1738 == var45.field1738) {
                class79 var46 = var45.field7387;
                if (var46 != null && var46.field1143 != null) {
                    var46 = var46.method646(0, class421.field6166);
                }
                if (var46 != null && var46.field1153 && var46.field1148) {
                    int var47 = var45.field1732 / 32 - (var10 / 32);
                    int var48 = var45.field1735 / 32 - (var9 / 32);
                    if (var46.field1200 == -1) {
                        class315.method1835(var47, 0, var5, arg1, class157.field2386[1], var48, arg0, arg3);
                    } else {
                        class409.method2450(arg3, var46.field1200, var47, arg4, arg1, var5, 32, arg0, var48);
                    }
                }
            }
        }
        int var17 = class375.field5498;
        int[] var18 = class397.field5793;
        for (int var19 = 0; var19 < var17; var19++) {
            class438 var37 = class12.field182[var18[var19]];
            if (var37 != null && var37.method2579((byte) -123) && class316.field4324 != var37 && class316.field4324.field1738 == var37.field1738) {
                int var38 = var37.field1732 / 32 - (var10 / 32);
                int var39 = var37.field1735 / 32 - (var9 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class174.field2588; var41++) {
                    if (var37.field6421.equals(class258.field3597[var41]) && class434.field6365[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class465.field6831; var43++) {
                    if (var37.field6421.equals(class290.field4026[var43].field1323)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class316.field4324.field6412 != 0 && var37.field6412 != 0 && class316.field4324.field6412 == var37.field6412) {
                    var44 = true;
                }
                if (var37.field6413) {
                    class315.method1835(var38, 0, var5, arg1, class157.field2386[6], var39, arg0, arg3);
                } else if (var40) {
                    class315.method1835(var38, 0, var5, arg1, class157.field2386[3], var39, arg0, arg3);
                } else if (var42) {
                    class315.method1835(var38, 0, var5, arg1, class157.field2386[5], var39, arg0, arg3);
                } else if (var44) {
                    class315.method1835(var38, 0, var5, arg1, class157.field2386[4], var39, arg0, arg3);
                } else {
                    class315.method1835(var38, 0, var5, arg1, class157.field2386[2], var39, arg0, arg3);
                }
            }
        }
        class371[] var20 = class218.field3046;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class371 var24 = var20[var21];
            if (var24 != null && var24.field5433 != 0 && class441.field6516 % 20 < 10) {
                if (var24.field5433 == 1 && var24.field5428 >= 0 && class378.field5533.length > var24.field5428) {
                    class502 var25 = class378.field5533[var24.field5428];
                    if (var25 != null) {
                        int var26 = var25.field1732 / 32 - var10 / 32;
                        int var27 = var25.field1735 / 32 - (var9 / 32);
                        class258.method1554(arg1, var26, 360000L, arg0, var5, 10, var27, arg3, var24.field5435);
                    }
                }
                if (var24.field5433 == 2) {
                    int var28 = var24.field5423 / 32 - (var10 / 32);
                    int var29 = var24.field5422 / 32 - (var9 / 32);
                    long var30 = (long) (var24.field5430 << 5);
                    long var32 = var30 * var30;
                    class258.method1554(arg1, var28, var32, arg0, var5, 10, var29, arg3, var24.field5435);
                }
                if (var24.field5433 == 10 && var24.field5428 >= 0 && var24.field5428 < class12.field182.length) {
                    class438 var34 = class12.field182[var24.field5428];
                    if (var34 != null) {
                        int var35 = var34.field1732 / 32 - (var10 / 32);
                        int var36 = var34.field1735 / 32 - (var9 / 32);
                        class258.method1554(arg1, var35, 360000L, arg0, var5, 10, var36, arg3, var24.field5435);
                    }
                }
            }
        }
        if (class491.field7168 == 4) {
            return;
        }
        if (class228.field3244 != 0) {
            int var22 = class228.field3244 * 4 + (class316.field4324.method626((byte) 120) * 2) + 2 - (var10 / 32) - 2;
            int var23 = class285.field3961 * 4 + (class316.field4324.method626((byte) 120) + -1) * 2 + 2 - (var9 / 32);
            class315.method1835(var22, 0, var5, arg1, class526.field7788[class445.field6555 ? 1 : 0], var23, arg0, arg3);
        }
        arg4.method325(arg1 + (arg3.field2204 / 2) - 1, 3, -1, 1, arg0 + (arg3.field2322 / 2) - 1, 3);
        return;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILsi;)V", line = 457)
    private final void method1750(int arg0, int arg1, class391 arg2) {
        field4093++;
        if (arg1 >= -19) {
            return;
        }
        if (arg0 == 1) {
            this.field4094 = arg2.method2353((byte) 73);
        } else if (arg0 == 2) {
            this.field4097 = true;
        } else if (arg0 == 3) {
            this.field4096 = arg2.method2311((byte) 123);
            this.field4095 = arg2.method2311((byte) 123);
            this.field4092 = arg2.method2311((byte) -1);
        } else if (arg0 == 4) {
            this.field4091 = arg2.method2348(-2);
        } else if (arg0 == 5) {
            this.field4099 = arg2.method2353((byte) 120);
        } else if (arg0 == 6) {
            this.field4090 = arg2.method2338(true);
            return;
        }
    }
}
