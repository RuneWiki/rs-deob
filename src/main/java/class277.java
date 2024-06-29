import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class277 extends class182 {

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Z")
    private boolean field4511 = true;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Z")
    private boolean field4513 = true;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Z")
    public static boolean field4519 = true;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Z")
    public static boolean field4510;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I", line = 15)
    public final int[][] method122(int arg0, int arg1) {
        field4512++;
        int[][] var3 = this.field3152.method1953(arg0, 117);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(this.field4511 ? class194.field3266 - arg0 : arg0, (byte) 68, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field4513) {
                for (int var12 = 0; var12 < class26.field672; var12++) {
                    var8[var12] = var5[class53.field1056 - var12];
                    var10[var12] = var7[class53.field1056 - var12];
                    var9[var12] = var6[class53.field1056 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class26.field672; var11++) {
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                    var9[var11] = var6[var11];
                }
            }
        }
        if (arg1 != 4944) {
            method1962(0, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 80)
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Z", line = 91)
    public static final boolean method1962(int arg0, boolean arg1) {
        field4518++;
        byte var2 = 0;
        byte var3 = 0;
        if (class278.field4526 == null) {
            if (class241.field4016 || class180.field2960 == null) {
                class278.field4526 = new class288(512, 512);
            } else {
                class278.field4526 = (class288) class180.field2960;
            }
            int[] var4 = class278.field4526.field4697;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var9 = var2 + 1; var9 < 103 - var2; var9++) {
                    if ((class282.field4615[arg0][var9][var7] & 0x18) == 0) {
                        class91.method700(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class282.field4615[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class91.method700(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class103.field1900 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class146.method1000(arg0, var2 + var10, var3 + var11);
                    if (var12 == 0L) {
                        var12 = class177.method1256(arg0, var2 + var10, var3 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class272.method1923(arg0, var10 + var2, var11 - -var3);
                    }
                    if (var12 == 0L) {
                        var12 = class23.method202(arg0, var2 + var10, var3 + var11);
                    }
                    if (var12 != 0L) {
                        class238 var14 = class1.method7((int) (var12 >>> 32) & Integer.MAX_VALUE, 25);
                        if (!var14.field3911 || class235.field3852) {
                            int var15 = var14.field3893;
                            if (var14.field3937 != null) {
                                for (int var16 = 0; var16 < var14.field3937.length; var16++) {
                                    if (var14.field3937[var16] != -1) {
                                        class238 var17 = class1.method7(var14.field3937[var16], 25);
                                        if (var17.field3893 >= 0) {
                                            var15 = var17.field3893;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                class1 var19 = class125.method901(var15, (byte) -31);
                                if (var19 != null && var19.field10) {
                                    var18 = true;
                                }
                                int var20 = var11 + var3;
                                int var21 = var2 + var10;
                                if (var18) {
                                    int[][] var22 = class23.field576[arg0].field4451;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var21 > 0 && (var10 - 3) < var21 && (var22[var21 - 1][var20] & 0x2C0108) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 1 && var21 < 103 && var10 + 3 > var21 && (var22[var21 + 1][var20] & 0x2C0180) == 0) {
                                            var21++;
                                        }
                                        if (var24 == 2 && var20 > 0 && var20 > var11 - 3 && (var22[var21][var20 - 1] & 0x2C0102) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 3 && var20 < 103 && var20 < (var11 + 3) && (var22[var21][var20 + 1] & 0x2C0120) == 0) {
                                            var20++;
                                        }
                                    }
                                }
                                class287.field4693[class103.field1900] = var14.field3896;
                                class289.field4703[class103.field1900] = var21 - var2;
                                class7.field249[class103.field1900] = var20 - var3;
                                class103.field1900++;
                            }
                        }
                    }
                }
            }
        }
        class278.field4526.method2053();
        int var25 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var26 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class282.field4615[arg0][var2 + var28][var27 + var3] & 0x18) == 0 && !class316.method2276(var25, var28, -23841, var2, var3, var26, arg0, var27)) {
                    if (class241.field4016) {
                        class270.field4403 = null;
                    } else {
                        class285.field4666.method612(-85);
                    }
                    return false;
                }
                if (arg0 < 3 && (class282.field4615[arg0 + 1][var28 + var2][var3 + var27] & 0x8) != 0 && !class316.method2276(var25, var28, -23841, var2, var3, var26, arg0 + 1, var27)) {
                    if (class241.field4016) {
                        class270.field4403 = null;
                    } else {
                        class285.field4666.method612(-76);
                    }
                    return false;
                }
            }
        }
        if (arg1) {
            method1966(-28, -124);
        }
        if (class241.field4016) {
            int[] var29 = class278.field4526.field4697;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class180.field2960 = new class265(class278.field4526);
        } else {
            class180.field2960 = class278.field4526;
        }
        if (class241.field4016) {
            class270.field4403 = null;
        } else {
            class285.field4666.method612(-124);
        }
        class278.field4526 = null;
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 346)
    public static final void method1963(int arg0) {
        if (arg0 == -5993) {
            class83.field1433.method895(128);
            field4514++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILg;III)V", line = 357)
    public static final void method1964(int arg0, class181 arg1, int arg2, int arg3, int arg4) {
        if (class241.field4016) {
            class337.method2385(arg0, arg2, arg0 + arg1.field3024, arg1.field2972 + arg2);
        }
        if (class174.field2885 >= 3) {
            if (class241.field4016) {
                class75 var5 = arg1.method1266(37, false);
                if (var5 != null) {
                    var5.method568(arg0, arg2);
                }
            } else {
                class270.method1896(arg0, arg2, 0, arg1.field3015, arg1.field2973);
            }
        } else if (class241.field4016) {
            ((class265) class269.field4390).method1858(arg0, arg2, arg1.field3024, arg1.field2972, class269.field4390.field1353 / 2, class269.field4390.field1356 / 2, (int) class354.field5652, 256, (class265) arg1.method1266(106, false));
        } else {
            ((class288) class269.field4390).method1295(arg0, arg2, arg1.field3024, arg1.field2972, class269.field4390.field1353 / 2, class269.field4390.field1356 / 2, (int) class354.field5652, 256, arg1.field3015, arg1.field2973);
        }
        class117.field2084[arg3] = true;
        field4515++;
        if (arg4 <= 16) {
            field4517 = -72;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I", line = 395)
    public final int[] method125(int arg0, int arg1) {
        field4516++;
        if (arg0 != 2) {
            field4517 = -9;
        }
        int[] var3 = this.field3166.method775(arg1, arg0 + 123);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(this.field4511 ? class194.field3266 - arg1 : arg1, 0, arg0 ^ 0xFFFFFFB5);
            if (this.field4513) {
                for (int var5 = 0; var5 < class26.field672; var5++) {
                    var3[var5] = var4[class53.field1056 - var5];
                }
            } else {
                class89.method685(var4, 0, var3, 0, class26.field672);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V", line = 434)
    public static final void method1965(int arg0, byte arg1) {
        field4507++;
        class83.field1433.method896(arg0, (byte) -89);
        if (arg1 >= -52) {
            field4510 = false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Loe;IB)V", line = 455)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field4513 = arg0.method1005((byte) 122) == 1;
        } else if (arg1 == 1) {
            this.field4511 = arg0.method1005((byte) 122) == 1;
        } else if (arg1 == 2) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        if (arg2 != 60) {
            field4517 = -61;
        }
        field4520++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I", line = 495)
    public static final int method1966(int arg0, int arg1) {
        if (arg0 == 127) {
            field4508++;
            return arg1 & 0x7F;
        } else {
            return -41;
        }
    }
}
