import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class736 extends class196 {

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "[B")
    public byte[] field10169;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "Z")
    public static boolean field10165 = false;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "Lju;")
    public static class137 field10166 = new class137(7, 16);

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
    public int field10158;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
    public int field10161;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
    public int field10162;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
    public int field10164;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "Lkh;")
    public static class17 field10167;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "Lsh;")
    public static class77 field10168;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBIIIII)V", line = 6)
    public final void method4082(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10160++;
        int var8 = 0;
        if (arg4 != arg5) {
            var8 = (arg6 - arg2 << 16) / (arg5 - arg4);
        }
        int var9 = 0;
        int var10 = -14 / ((28 - arg1) / 49);
        if (arg3 != arg5) {
            var9 = (arg0 - arg6 << 16) / (arg3 - arg5);
        }
        int var11 = 0;
        if (arg3 != arg4) {
            var11 = (arg2 - arg0 << 16) / (arg4 - arg3);
        }
        if (arg5 >= arg4 && arg3 >= arg4) {
            if (arg5 < arg3) {
                int var12;
                int var13 = var12 = arg2 << 16;
                int var14 = arg6 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var8;
                    var13 -= arg4 * var11;
                    arg4 = 0;
                }
                if (arg5 < 0) {
                    var14 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg4 == arg5 || var8 <= var11) && (arg4 != arg5 || var9 >= var11)) {
                    int var18 = arg3 - arg5;
                    int var19 = arg5 - arg4;
                    int var20 = this.field10161 * arg4;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var20, var14 >> 16, var13 >> 16);
                                var14 += var9;
                                var13 += var11;
                                var20 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var20, var12 >> 16, var13 >> 16);
                        var13 += var11;
                        var12 += var8;
                        var20 += this.field10161;
                    }
                } else {
                    int var15 = arg3 - arg5;
                    int var16 = arg5 - arg4;
                    int var17 = this.field10161 * arg4;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var17, var13 >> 16, var14 >> 16);
                                var14 += var9;
                                var13 += var11;
                                var17 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var17, var13 >> 16, var12 >> 16);
                        var12 += var8;
                        var17 += this.field10161;
                        var13 += var11;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                int var23 = arg0 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var11;
                    var21 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg3 < 0) {
                    var23 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg3 != arg4 && var11 < var8 || arg3 == arg4 && var9 > var8) {
                    int var24 = arg5 - arg3;
                    int var25 = arg3 - arg4;
                    int var26 = this.field10161 * arg4;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var26, var23 >> 16, var21 >> 16);
                                var26 += this.field10161;
                                var23 += var9;
                                var21 += var8;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var26, var22 >> 16, var21 >> 16);
                        var21 += var8;
                        var26 += this.field10161;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg5 - arg3;
                    int var28 = arg3 - arg4;
                    int var29 = this.field10161 * arg4;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var29, var21 >> 16, var23 >> 16);
                                var23 += var9;
                                var21 += var8;
                                var29 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var29, var21 >> 16, var22 >> 16);
                        var21 += var8;
                        var22 += var11;
                        var29 += this.field10161;
                    }
                }
            }
        } else if (arg5 <= arg3) {
            if (arg3 >= arg4) {
                int var30;
                int var31 = var30 = arg6 << 16;
                int var32 = arg2 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 < 0) {
                    var32 -= arg4 * var11;
                    arg4 = 0;
                }
                if (var8 < var9) {
                    int var33 = arg3 - arg4;
                    int var34 = arg4 - arg5;
                    int var35 = this.field10161 * arg5;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var35, var32 >> 16, var30 >> 16);
                                var30 += var9;
                                var32 += var11;
                                var35 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var35, var31 >> 16, var30 >> 16);
                        var30 += var9;
                        var35 += this.field10161;
                        var31 += var8;
                    }
                } else {
                    int var36 = arg3 - arg4;
                    int var37 = arg4 - arg5;
                    int var38 = this.field10161 * arg5;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var38, var30 >> 16, var32 >> 16);
                                var32 += var11;
                                var38 += this.field10161;
                                var30 += var9;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var38, var30 >> 16, var31 >> 16);
                        var30 += var9;
                        var38 += this.field10161;
                        var31 += var8;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg6 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var41 = arg0 << 16;
                if (arg3 < 0) {
                    var41 -= arg3 * var11;
                    arg3 = 0;
                }
                if (arg3 != arg5 && var9 > var8 || arg3 == arg5 && var8 > var11) {
                    int var42 = arg4 - arg3;
                    int var43 = arg3 - arg5;
                    int var44 = this.field10161 * arg5;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var44, var40 >> 16, var41 >> 16);
                                var41 += var11;
                                var40 += var8;
                                var44 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var44, var40 >> 16, var39 >> 16);
                        var44 += this.field10161;
                        var39 += var9;
                        var40 += var8;
                    }
                } else {
                    int var45 = arg4 - arg3;
                    int var46 = arg3 - arg5;
                    int var47 = this.field10161 * arg5;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class16.method97(0, (byte) -97, this.field10169, var47, var41 >> 16, var40 >> 16);
                                var41 += var11;
                                var40 += var8;
                                var47 += this.field10161;
                            }
                        }
                        class16.method97(0, (byte) -97, this.field10169, var47, var39 >> 16, var40 >> 16);
                        var40 += var8;
                        var47 += this.field10161;
                        var39 += var9;
                    }
                }
            }
        } else if (arg4 >= arg5) {
            int var48;
            int var49 = var48 = arg0 << 16;
            int var50 = arg6 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var9;
                var48 -= arg3 * var11;
                arg3 = 0;
            }
            if (arg5 < 0) {
                var50 -= arg5 * var8;
                arg5 = 0;
            }
            if (var11 <= var9) {
                int var51 = arg4 - arg5;
                int var52 = arg5 - arg3;
                int var53 = this.field10161 * arg3;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class16.method97(0, (byte) -97, this.field10169, var53, var48 >> 16, var50 >> 16);
                            var53 += this.field10161;
                            var48 += var11;
                            var50 += var8;
                        }
                    }
                    class16.method97(0, (byte) -97, this.field10169, var53, var48 >> 16, var49 >> 16);
                    var48 += var11;
                    var49 += var9;
                    var53 += this.field10161;
                }
            } else {
                int var54 = arg4 - arg5;
                int var55 = arg5 - arg3;
                int var56 = this.field10161 * arg3;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class16.method97(0, (byte) -97, this.field10169, var56, var50 >> 16, var48 >> 16);
                            var56 += this.field10161;
                            var50 += var8;
                            var48 += var11;
                        }
                    }
                    class16.method97(0, (byte) -97, this.field10169, var56, var49 >> 16, var48 >> 16);
                    var56 += this.field10161;
                    var48 += var11;
                    var49 += var9;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg0 << 16;
            int var59 = arg2 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var11;
                var58 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg4 < 0) {
                var59 -= arg4 * var8;
                arg4 = 0;
            }
            if (var11 > var9) {
                int var60 = arg5 - arg4;
                int var61 = arg4 - arg3;
                int var62 = this.field10161 * arg3;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class16.method97(0, (byte) -97, this.field10169, var62, var58 >> 16, var59 >> 16);
                            var58 += var9;
                            var59 += var8;
                            var62 += this.field10161;
                        }
                    }
                    class16.method97(0, (byte) -97, this.field10169, var62, var58 >> 16, var57 >> 16);
                    var62 += this.field10161;
                    var57 += var11;
                    var58 += var9;
                }
            } else {
                int var63 = arg5 - arg4;
                int var64 = arg4 - arg3;
                int var65 = this.field10161 * arg3;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class16.method97(0, (byte) -97, this.field10169, var65, var59 >> 16, var58 >> 16);
                            var58 += var9;
                            var65 += this.field10161;
                            var59 += var8;
                        }
                    }
                    class16.method97(0, (byte) -97, this.field10169, var65, var57 >> 16, var58 >> 16);
                    var57 += var11;
                    var65 += this.field10161;
                    var58 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 451)
    public static final void method4083(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field10156++;
        class17 var5 = class326.method2066(arg2, arg0, 102);
        if (var5 == null) {
            return;
        }
        if (var5.field246 != null) {
            class255 var6 = new class255();
            var6.field3583 = var5;
            var6.field3588 = arg4;
            var6.field3592 = arg3;
            var6.field3586 = var5.field246;
            class76.method644(var6);
        }
        if (class753.field10398 != 10) {
            return;
        }
        if (arg1 != -26207) {
            method4083(-44, 82, 116, null, 18);
        }
        if (!client.method2010(var5).method3887(arg4 - 1, 8616)) {
            return;
        }
        if (arg4 == 1) {
            class347.field4678++;
            class537 var7 = class476.method2729(class407.field5589, (byte) -46, class551.field7498);
            class193.method1405(arg0, var7, var5.field355, arg2, arg1 + 30323);
            class173.method1314(false, var7);
        }
        if (arg4 == 2) {
            class744.field10275++;
            class537 var8 = class476.method2729(class610.field8518, (byte) -46, class551.field7498);
            class193.method1405(arg0, var8, var5.field355, arg2, 4116);
            class173.method1314(false, var8);
        }
        if (arg4 == 3) {
            class718.field9877++;
            class537 var9 = class476.method2729(class388.field5328, (byte) -46, class551.field7498);
            class193.method1405(arg0, var9, var5.field355, arg2, 4116);
            class173.method1314(false, var9);
        }
        if (arg4 == 4) {
            class606.field8455++;
            class537 var10 = class476.method2729(class634.field8773, (byte) -46, class551.field7498);
            class193.method1405(arg0, var10, var5.field355, arg2, 4116);
            class173.method1314(false, var10);
        }
        if (arg4 == 5) {
            class199.field3010++;
            class537 var11 = class476.method2729(class72.field1060, (byte) -46, class551.field7498);
            class193.method1405(arg0, var11, var5.field355, arg2, 4116);
            class173.method1314(false, var11);
        }
        if (arg4 == 6) {
            class594.field8342++;
            class537 var12 = class476.method2729(class107.field1694, (byte) -46, class551.field7498);
            class193.method1405(arg0, var12, var5.field355, arg2, arg1 + 30323);
            class173.method1314(false, var12);
        }
        if (arg4 == 7) {
            class715.field9840++;
            class537 var13 = class476.method2729(class199.field3009, (byte) -46, class551.field7498);
            class193.method1405(arg0, var13, var5.field355, arg2, arg1 ^ 0xFFFF89B5);
            class173.method1314(false, var13);
        }
        if (arg4 == 8) {
            class401.field5520++;
            class537 var14 = class476.method2729(class478.field6458, (byte) -46, class551.field7498);
            class193.method1405(arg0, var14, var5.field355, arg2, arg1 ^ 0xFFFF89B5);
            class173.method1314(false, var14);
        }
        if (arg4 == 9) {
            class752.field10365++;
            class537 var15 = class476.method2729(class447.field6142, (byte) -46, class551.field7498);
            class193.method1405(arg0, var15, var5.field355, arg2, arg1 ^ 0xFFFF89B5);
            class173.method1314(false, var15);
        }
        if (arg4 == 10) {
            class327.field4458++;
            class537 var16 = class476.method2729(class661.field9151, (byte) -46, class551.field7498);
            class193.method1405(arg0, var16, var5.field355, arg2, 4116);
            class173.method1314(false, var16);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 583)
    public final void method4084(byte arg0) {
        field10157++;
        int var2 = -84 % ((arg0 - 62) / 57);
        int var3 = -1;
        int var4 = this.field10169.length - 8;
        while (var4 > var3) {
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
            var3++;
            this.field10169[var3] = 0;
        }
        while (var3 < (this.field10169.length - 1)) {
            var3++;
            this.field10169[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V", line = 611)
    public static void method4085(int arg0) {
        int var1 = -60 / ((arg0 - 60) / 51);
        field10167 = null;
        field10166 = null;
        field10168 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)Z", line = 626)
    public final boolean method4086(int arg0, int arg1, byte arg2) {
        if (arg2 != 23) {
            field10165 = true;
        }
        field10159++;
        return this.field10169.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V", line = 645)
    public final void method4087(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10162 = arg3;
        field10163++;
        this.field10164 = arg4;
        this.field10161 = arg0 - arg4;
        this.field10158 = arg2 - arg3;
        int var6 = 46 / ((arg1 - 42) / 62);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lsf;II)V", line = 667)
    public class736(class551 arg0, int arg1, int arg2) {
        this.field10169 = new byte[arg1 * arg2];
    }
}
