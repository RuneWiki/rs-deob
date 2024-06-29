import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class37 {

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    private int field4 = 1;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    private int field3 = 204;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    private int field8 = 1;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "Ldd;")
    public static class35 field2 = class180.method1196((byte) -55, " ");

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "Lja;")
    public static class90 field11 = new class90(5000);

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field12 = 1;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3 = arg2.method256((byte) -78);
                }
            } else {
                this.field8 = arg2.method221(-124);
            }
        } else {
            this.field4 = arg2.method221(-104);
        }
        if (arg1 != 1) {
            this.method7((byte) -117, 119);
        }
        ++field1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvc;B)V")
    public static final void method2(class200 arg0, byte arg1) {
        if (arg1 < -35) {
            class46.method419(200000, false, arg0);
            ++field9;
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field2 = null;
        if (arg0 < 50) {
            method6(-54, -58, 44, 42);
        }
        field11 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfe;IIIIIII)V")
    public static final void method4(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class4.field78;
        int var10;
        int var11 = var10 = (arg7 << 7) - class29.field590;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class126.field2746[arg1][arg6][arg7] - class2.field22;
        int var17 = class126.field2746[arg1][arg6 + 1][arg7] - class2.field22;
        int var18 = class126.field2746[arg1][arg6 + 1][arg7 + 1] - class2.field22;
        int var19 = class126.field2746[arg1][arg6][arg7 + 1] - class2.field22;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 >= 50) {
            int var26 = arg4 * var10 + arg5 * var13 >> 16;
            int var27 = arg5 * var10 - arg4 * var13 >> 16;
            int var29 = arg3 * var17 - arg2 * var27 >> 16;
            int var30 = arg2 * var17 + arg3 * var27 >> 16;
            if (var30 >= 50) {
                int var32 = arg4 * var15 + arg5 * var12 >> 16;
                int var33 = arg5 * var15 - arg4 * var12 >> 16;
                int var35 = arg3 * var18 - arg2 * var33 >> 16;
                int var36 = arg2 * var18 + arg3 * var33 >> 16;
                if (var36 >= 50) {
                    int var38 = arg4 * var14 + arg5 * var8 >> 16;
                    int var39 = arg5 * var14 - arg4 * var8 >> 16;
                    int var41 = arg3 * var19 - arg2 * var39 >> 16;
                    int var42 = arg2 * var19 + arg3 * var39 >> 16;
                    if (var42 >= 50) {
                        int var44 = (var20 << 9) / var24 + class11.field207;
                        int var45 = (var23 << 9) / var24 + class11.field208;
                        int var46 = (var26 << 9) / var30 + class11.field207;
                        int var47 = (var29 << 9) / var30 + class11.field208;
                        int var48 = (var32 << 9) / var36 + class11.field207;
                        int var49 = (var35 << 9) / var36 + class11.field208;
                        int var50 = (var38 << 9) / var42 + class11.field207;
                        int var51 = (var41 << 9) / var42 + class11.field208;
                        class11.field205 = 0;
                        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
                            if (class80.field1865 && class72.method577(class74.field1781, class111.field2456, var49, var51, var47, var48, var50, var46)) {
                                class188.field3817 = arg6;
                                class68.field1595 = arg7;
                            }
                            class11.field213 = false;
                            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class11.field209 || var50 > class11.field209 || var46 > class11.field209) {
                                class11.field213 = true;
                            }
                            if (arg0.field1396 == -1) {
                                if (arg0.field1411 != 12345678) {
                                    class11.method83(var49, var51, var47, var48, var50, var46, arg0.field1411, arg0.field1403, arg0.field1391);
                                }
                            } else if (!class154.field3173) {
                                if (arg0.field1393) {
                                    class11.method75(var49, var51, var47, var48, var50, var46, arg0.field1411, arg0.field1403, arg0.field1391, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1396);
                                } else {
                                    class11.method75(var49, var51, var47, var48, var50, var46, arg0.field1411, arg0.field1403, arg0.field1391, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field1396);
                                }
                            } else {
                                int var52 = class11.field217.method829(529, arg0.field1396);
                                class11.method83(var49, var51, var47, var48, var50, var46, class182.method1209(var52, arg0.field1411), class182.method1209(var52, arg0.field1403), class182.method1209(var52, arg0.field1391));
                            }
                        }
                        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) > 0) {
                            if (class80.field1865 && class72.method577(class74.field1781, class111.field2456, var45, var47, var51, var44, var46, var50)) {
                                class188.field3817 = arg6;
                                class68.field1595 = arg7;
                            }
                            class11.field213 = false;
                            if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class11.field209 || var46 > class11.field209 || var50 > class11.field209) {
                                class11.field213 = true;
                            }
                            if (arg0.field1396 == -1) {
                                if (arg0.field1407 != 12345678) {
                                    class11.method83(var45, var47, var51, var44, var46, var50, arg0.field1407, arg0.field1391, arg0.field1403);
                                    return;
                                }
                            } else {
                                if (!class154.field3173) {
                                    class11.method75(var45, var47, var51, var44, var46, var50, arg0.field1407, arg0.field1391, arg0.field1403, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1396);
                                    return;
                                }
                                int var53 = class11.field217.method829(529, arg0.field1396);
                                class11.method83(var45, var47, var51, var44, var46, var50, class182.method1209(var53, arg0.field1407), class182.method1209(var53, arg0.field1391), class182.method1209(var53, arg0.field1403));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method5(byte arg0, String arg1) throws ClassNotFoundException {
        ++field6;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 <= 89) {
                field13 = -108;
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = class191.field3853[arg0][arg1][arg2];
        if (var4 != null) {
            class150 var5 = var4.field1231;
            if (var5 != null) {
                var5.field3125 = var5.field3125 * arg3 / 16;
                var5.field3138 = var5.field3138 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field5;
        if (arg0 != 75) {
            field11 = null;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            for (int var4 = 0; ~var4 > ~class72.field1719; ++var4) {
                int var5 = class22.field450[arg1];
                int var6 = class118.field2622[var4];
                int var7 = this.field4 * var6 >> 12;
                int var8 = var5 % (4096 / this.field8) * this.field8;
                int var9 = this.field8 * var5 >> 12;
                int var10 = var6 % (4096 / this.field4) * this.field4;
                if (this.field3 > var8) {
                    for (var7 -= var9; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3 > var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field3) {
                    int var11;
                    for (var11 = var7 - var9; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILgi;)V")
    public static final void method8(int arg0, int arg1, class69 arg2) {
        ++field10;
        class187.method1240(true, arg1, arg2.field1664, arg2.field1676);
        int var3 = 80 % ((-17 - arg0) / 49);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(III)Z")
    public static final boolean method9(int arg0, int arg1, int arg2) {
        int var3 = class57.field1432[arg0][arg1][arg2];
        if (-class101.field2232 == var3) {
            return false;
        } else if (class101.field2232 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class120.method857(var4 + 1, class126.field2746[arg0][arg1][arg2], var5 + 1) && class120.method857(var4 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg2], var5 + 1) && class120.method857(var4 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class120.method857(var4 + 1, class126.field2746[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class57.field1432[arg0][arg1][arg2] = class101.field2232;
                return true;
            } else {
                class57.field1432[arg0][arg1][arg2] = -class101.field2232;
                return false;
            }
        }
    }
}
