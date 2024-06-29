import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class328 {

    @OriginalMember(owner = "client!kda", name = "F", descriptor = "Luo;")
    private class494 field4532 = null;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "Lnh;")
    private class637 field4513;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "Z")
    private boolean field4524;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!kda", name = "B", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!kda", name = "L", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!kda", name = "M", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!kda", name = "N", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!kda", name = "O", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!kda", name = "P", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!kda", name = "Q", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!kda", name = "R", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "Lfp;")
    public static class271 field4536;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "[Ljava/lang/Object;")
    private Object[] field4534;

    @OriginalMember(owner = "client!kda", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4537;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B[III)Z")
    private final boolean method1957(byte arg0, int[] arg1, int arg2, int arg3) {
        field4517++;
        if (!this.method1978(17548, arg3)) {
            return false;
        } else if (arg0 != 25) {
            return true;
        } else if (this.field4534[arg3] == null) {
            return false;
        } else {
            int var5 = this.field4532.field7018[arg3];
            int[] var6 = this.field4532.field7020[arg3];
            if (this.field4537[arg3] == null) {
                this.field4537[arg3] = new Object[this.field4532.field7032[arg3]];
            }
            Object[] var7 = this.field4537[arg3];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var11 = class585.method3481(0, this.field4534[arg3], false);
            } else {
                var11 = class585.method3481(arg0 - 25, this.field4534[arg3], true);
                class148 var12 = new class148(var11);
                var12.method1043(5, arg1, (byte) 73, var12.field2146.length);
            }
            byte[] var13;
            try {
                var13 = class132.method914((byte) 83, var11);
            } catch (RuntimeException var49) {
                throw class429.method2512(var49, "T3 - " + (arg1 != null) + "," + arg3 + "," + var11.length + "," + class68.method533(var11, var11.length, 0) + "," + class68.method533(var11, var11.length - 2, 0) + "," + this.field4532.field7030[arg3] + "," + this.field4532.field7015);
            }
            if (this.field4524) {
                this.field4534[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4501 == 0) {
                    var7[var15] = class609.method3579(var13, 136, false);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4501 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class148 var19 = new class148(var13);
                int var20 = 0;
                int var21 = 0;
                var19.field2177 = var18;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method1026(arg0 ^ 0xC9531481);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg2 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field2177 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method1026(-917302120);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg2 == var32) {
                            class648.method3737(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * 4 * var34;
                class148 var36 = new class148(var13);
                int[] var37 = new int[var5];
                var36.field2177 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method1026(-917302120);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field2177 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method1026(-917302120);
                        class648.method3737(var13, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field4501 == 0) {
                        var7[var48] = class609.method3579(var41[var47], class354.method2138(arg0, 145), false);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Z")
    private final boolean method1958(int arg0, int arg1, int arg2) {
        if (arg0 != 4721) {
            this.field4537 = null;
        }
        field4507++;
        if (!this.method1986(23977)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field4532.field7032.length && this.field4532.field7032[arg1] > arg2) {
            return true;
        } else if (class507.field7199) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
    public static void method1959(boolean arg0) {
        field4536 = null;
        if (!arg0) {
            method1985(-14, 1, -24, null);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
    public final int method1960(byte arg0) {
        field4541++;
        if (!this.method1986(23977)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 <= 42) {
            method1991(38, 8, (byte) 51);
        }
        for (int var4 = 0; var4 < this.field4534.length; var4++) {
            if (this.field4532.field7018[var4] > 0) {
                var3 += this.method1961(var4, (byte) -122);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)I")
    private final int method1961(int arg0, byte arg1) {
        field4540++;
        if (!this.method1978(17548, arg0)) {
            return 0;
        } else if (this.field4534[arg0] == null) {
            int var3 = -12 % ((arg1 - 19) / 47);
            return this.field4513.method2941(arg0, false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1962(int arg0, String arg1) {
        if (arg0 != 12010) {
            this.method1968((byte) 34);
        }
        field4516++;
        if (this.method1986(23977)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4532.field7026.method2366(class427.method2505(var3, arg0 - 12010), (byte) -97);
            return this.method1961(var4, (byte) -81);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lfw;Lnj;)V")
    public static final void method1963(class51 arg0, class205 arg1) {
        if (!arg1.field3032) {
            return;
        }
        short var2 = arg1.field3041;
        short var3 = arg1.field3035;
        byte var4 = arg1.field3042;
        byte var5 = arg1.field3036;
        int var6 = (var2 << class115.field1626) + class402.field5500;
        int var7 = (var3 << class115.field1626) + class402.field5500;
        class205[][] var8 = class420.field5697[var4];
        float var9;
        if (class165.field2609 == class114.field1609) {
            class193.field2864.method453(class207.field3077[0].method1233(var6, var7), class255.method1639(var2, var3), class606.method3565(var2, var3), class487.method2916(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class193.field2864.method422(3000.0F, var9 * 1.5F);
        if (arg1.field3028) {
            if (class187.field2791) {
                if (var4 > 0) {
                    class205 var10 = class420.field5697[var4 - 1][var2][var3];
                    if (var10 != null && var10.field3032) {
                        return;
                    }
                }
                if (var2 <= class297.field4092 && var2 > class583.field8555) {
                    class205 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field3032 && (var11.field3028 || (arg1.field3038 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class297.field4092 && var2 < class162.field2557 - 1) {
                    class205 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field3032 && (var12.field3028 || (arg1.field3038 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class18.field169 && var3 > class334.field4628) {
                    class205 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field3032 && (var13.field3028 || (arg1.field3038 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class18.field169 && var3 < class140.field1987 - 1) {
                    class205 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field3032 && (var14.field3028 || (arg1.field3038 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class187.field2791 = true;
            }
            arg1.field3028 = false;
            if (arg1.field3025 != null) {
                class205 var15 = arg1.field3025;
                class193.field2864.method422(3000.0F, (201.5F - (float) (var15.field3036 + 1) * 50.0F) * 1.5F);
                if (!class190.method1303(var15.field3036, var2, var3)) {
                    class165.field2609[var15.field3036].method583(var2, var3);
                }
                class113 var16 = var15.field3047;
                if (var16 != null) {
                    if (class330.field4555) {
                        if ((var16.field1595 & arg1.field3049) == 0) {
                            class623.method3644(arg0, var4, var2, var3);
                        } else {
                            class77.method596(arg0, var16.field1595, var5, var2, var3);
                        }
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    var16.method181(87, class193.field2864);
                }
                for (class636 var17 = var15.field3029; var17 != null; var17 = var17.field9302) {
                    class577 var18 = var17.field9299;
                    if (var18 != null) {
                        if (class330.field4555) {
                            class623.method3644(arg0, var4, var2, var3);
                            class193.field2864.method429(arg0.field594, arg0.field597);
                        }
                        var18.method181(88, class193.field2864);
                    }
                }
                class193.field2864.method422(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class190.method1303(var5, var2, var3);
            if (var19) {
                class165.field2609[var5].method583(var2, var3);
                class238 var20 = arg1.field3045;
                if (var20 != null && var20.field3427) {
                    if (var20.field3424) {
                        class193.field2864.method422(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var21 = var20.method181(73, class193.field2864);
                    if (var21 != null) {
                        var21.field1030 = var20;
                        var21.field1023 = var4;
                        var21.field1029 = var2;
                        var21.field1024 = var3;
                        class42.field491.method2241((byte) 66, var21);
                    }
                    if (var20.field3424) {
                        class193.field2864.method422(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class113 var24 = arg1.field3047;
            class323 var25 = arg1.field3040;
            if (var24 != null || var25 != null) {
                if (class297.field4092 == var2) {
                    var22++;
                } else if (class297.field4092 < var2) {
                    var22 += 2;
                }
                if (class18.field169 == var3) {
                    var22 += 3;
                } else if (class18.field169 > var3) {
                    var22 += 6;
                }
                var23 = class182.field2742[var22];
                arg1.field3049 = class479.field6809[var22];
            }
            if (var24 != null) {
                if ((var24.field1595 & class474.field6696[var22]) == 0) {
                    arg1.field3039 = 0;
                } else if (var24.field1595 == 16) {
                    arg1.field3039 = 3;
                    arg1.field3026 = class333.field4601[var22];
                    arg1.field3031 = (byte) (3 - arg1.field3026);
                } else if (var24.field1595 == 32) {
                    arg1.field3039 = 6;
                    arg1.field3026 = class569.field8399[var22];
                    arg1.field3031 = (byte) (6 - arg1.field3026);
                } else if (var24.field1595 == 64) {
                    arg1.field3039 = 12;
                    arg1.field3026 = class522.field7452[var22];
                    arg1.field3031 = (byte) (12 - arg1.field3026);
                } else {
                    arg1.field3039 = 9;
                    arg1.field3026 = class409.field5588[var22];
                    arg1.field3031 = (byte) (9 - arg1.field3026);
                }
                if ((var24.field1595 & var23) != 0 && !class428.method2509(var5, var2, var3, var24.field1595)) {
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var26 = var24.method181(109, class193.field2864);
                    if (var26 != null) {
                        var26.field1030 = var24;
                        var26.field1023 = var4;
                        var26.field1029 = var2;
                        var26.field1024 = var3;
                        class42.field491.method2241((byte) 66, var26);
                    }
                }
                class113 var27 = arg1.field3037;
                if (var27 != null && (var27.field1595 & var23) != 0 && !class428.method2509(var5, var2, var3, var27.field1595)) {
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var28 = var27.method181(96, class193.field2864);
                    if (var28 != null) {
                        var28.field1030 = var27;
                        var28.field1023 = var4;
                        var28.field1029 = var2;
                        var28.field1024 = var3;
                        class42.field491.method2241((byte) 66, var28);
                    }
                }
            }
            if (var25 != null && !class287.method1784(var5, var2, var3, var25.method1941(false))) {
                class323 var29 = arg1.field3050;
                class193.field2864.method422(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field4455 & var23) != 0) {
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var30 = var25.method181(58, class193.field2864);
                    if (var30 != null) {
                        var30.field1030 = var25;
                        var30.field1023 = var4;
                        var30.field1029 = var2;
                        var30.field1024 = var3;
                        class42.field491.method2241((byte) 66, var30);
                    }
                } else if (var25.field4455 == 256) {
                    int var31 = var25.field4446 - class103.field1488;
                    int var32 = var25.field4457 - class311.field4288;
                    int var33 = var25.field4452;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    if (var35 < var34) {
                        class77 var36 = var25.method181(101, class193.field2864);
                        if (var36 != null) {
                            var36.field1030 = var25;
                            var36.field1023 = var4;
                            var36.field1029 = var2;
                            var36.field1024 = var3;
                            class42.field491.method2241((byte) 66, var36);
                        }
                    } else if (var29 != null) {
                        class77 var37 = var29.method181(109, class193.field2864);
                        if (var37 != null) {
                            var37.field1030 = var29;
                            var37.field1023 = var4;
                            var37.field1029 = var2;
                            var37.field1024 = var3;
                            class42.field491.method2241((byte) 66, var37);
                        }
                    }
                }
                class193.field2864.method422(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class238 var38 = arg1.field3045;
                if (var38 != null && !var38.field3427) {
                    if (var38.field3424) {
                        class193.field2864.method422(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var39 = var38.method181(103, class193.field2864);
                    if (var39 != null) {
                        var39.field1030 = var38;
                        var39.field1023 = var4;
                        var39.field1029 = var2;
                        var39.field1024 = var3;
                        class42.field491.method2241((byte) 66, var39);
                    }
                    if (var38.field3424) {
                        class193.field2864.method422(3000.0F, var9 * 1.5F);
                    }
                }
                class553 var40 = arg1.field3043;
                if (var40 != null && !var40.field8238) {
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var41 = var40.method181(116, class193.field2864);
                    if (var41 != null) {
                        var41.field1030 = var40;
                        var41.field1023 = var4;
                        var41.field1029 = var2;
                        var41.field1024 = var3;
                        class42.field491.method2241((byte) 66, var41);
                    }
                }
            }
            byte var42 = arg1.field3038;
            if (var42 != 0) {
                if (var2 < class297.field4092 && (var42 & 0x4) != 0) {
                    class205 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field3032) {
                        class451.field6356.method929(var43, (byte) 47);
                    }
                }
                if (var3 < class18.field169 && (var42 & 0x2) != 0) {
                    class205 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field3032) {
                        class451.field6356.method929(var44, (byte) -108);
                    }
                }
                if (var2 > class297.field4092 && (var42 & 0x1) != 0) {
                    class205 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field3032) {
                        class451.field6356.method929(var45, (byte) -124);
                    }
                }
                if (var3 > class18.field169 && (var42 & 0x8) != 0) {
                    class205 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field3032) {
                        class451.field6356.method929(var46, (byte) -125);
                    }
                }
            }
        }
        if (arg1.field3039 != 0) {
            boolean var47 = true;
            for (class636 var48 = arg1.field3029; var48 != null; var48 = var48.field9302) {
                if (class213.field3139 != var48.field9299.field8498 && (var48.field9301 & arg1.field3039) == arg1.field3026) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class113 var49 = arg1.field3047;
                if (!class428.method2509(var5, var2, var3, var49.field1595)) {
                    if (class330.field4555) {
                        label682: {
                            if (var49.field1595 >= 16) {
                                int var50 = var2 - class297.field4092;
                                int var51 = var3 - class18.field169;
                                if (var49.field1595 == 16) {
                                    int var52 = var50 - class402.field5500;
                                    int var53 = class402.field5500 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class384.field5282) {
                                        class623.method3644(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1595 == 32) {
                                    int var54 = class402.field5500 + var50;
                                    int var55 = class402.field5500 + var51;
                                    if (var55 < -var54 && var2 < class145.field2083 && var3 < class384.field5282) {
                                        class623.method3644(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1595 == 64) {
                                    int var56 = class402.field5500 + var50;
                                    int var57 = var51 - class402.field5500;
                                    if (var57 > var56 && var2 < class145.field2083 && var3 > 0) {
                                        class623.method3644(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field1595 == 128) {
                                    int var58 = var50 - class402.field5500;
                                    int var59 = var51 - class402.field5500;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class623.method3644(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class623.method3644(arg0, var4, var2, var3);
                        }
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var60 = var49.method181(28, class193.field2864);
                    if (var60 != null) {
                        var60.field1030 = var49;
                        var60.field1023 = var4;
                        var60.field1029 = var2;
                        var60.field1024 = var3;
                        class42.field491.method2241((byte) 66, var60);
                    }
                }
                arg1.field3039 = 0;
            }
        }
        if (arg1.field3034) {
            try {
                arg1.field3034 = false;
                int var61 = 0;
                label625: for (class636 var62 = arg1.field3029; var62 != null; var62 = var62.field9302) {
                    class577 var63 = var62.field9299;
                    if (class213.field3139 != var63.field8498) {
                        for (int var64 = var63.field8504; var64 <= var63.field8508; var64++) {
                            for (int var65 = var63.field8509; var65 <= var63.field8499; var65++) {
                                class205 var66 = var8[var64][var65];
                                if (var66.field3028) {
                                    arg1.field3034 = true;
                                    continue label625;
                                }
                                if (var66.field3039 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field8504) {
                                        var67++;
                                    }
                                    if (var64 < var63.field8508) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field8509) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field8499) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field3039) == arg1.field3031) {
                                        arg1.field3034 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class297.field4092 - var63.field8504;
                        int var69 = var63.field8508 - class297.field4092;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class18.field169 - var63.field8509;
                        int var71 = var63.field8499 - class18.field169;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field598[var61] = var63;
                        arg0.field592[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class577 var75 = arg0.field598[var74];
                        if (class213.field3139 != var75.field8498) {
                            int var76 = arg0.field592[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field8496 - class103.field1488;
                                int var78 = var75.field8500 - class311.field4288;
                                int var79 = arg0.field598[var73].field8496 - class103.field1488;
                                int var80 = arg0.field598[var73].field8500 - class311.field4288;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class577 var81 = arg0.field598[var73];
                    var81.field8498 = class213.field3139;
                    if (!class261.method1661(var5, var81.field8504, var81.field8508, var81.field8509, var81.field8499, var81.method177((byte) 40))) {
                        if (class330.field4555) {
                            if (var81.field8494 == 0) {
                                class488.method2928(arg0, var4, var81.field8504, var81.field8509, var81.field8508, var81.field8499);
                            } else {
                                class623.method3644(arg0, var4, var2, var3);
                                int var82 = var2 - class297.field4092;
                                int var83 = var3 - class18.field169;
                                if (var81.field8494 == 2) {
                                    if (var83 > -var82) {
                                        class37.method232(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class37.method232(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class37.method232(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class37.method232(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class193.field2864.method429(arg0.field594, arg0.field597);
                        }
                        class77 var84 = var81.method181(58, class193.field2864);
                        if (var84 != null) {
                            var84.field1030 = var81;
                            var84.field1023 = var4;
                            var84.field1029 = var81.field8504;
                            var84.field1024 = var81.field8509;
                            class42.field491.method2241((byte) 66, var84);
                        }
                    }
                    for (int var85 = var81.field8504; var85 <= var81.field8508; var85++) {
                        for (int var86 = var81.field8509; var86 <= var81.field8499; var86++) {
                            class205 var87 = var8[var85][var86];
                            if (var87.field3039 != 0) {
                                class451.field6356.method929(var87, (byte) 61);
                            } else if ((var2 != var85 || var3 != var86) && var87.field3032) {
                                class451.field6356.method929(var87, (byte) -122);
                            }
                        }
                    }
                }
                if (arg1.field3034) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field3034 = false;
            }
        }
        if (arg1.field3030 != null && (byte) (class190.field2820 & 0xFF) == arg1.field3053) {
            class283 var88 = arg1.field3030;
            int var89 = class165.field2609[var4].method1239(var2, var3);
            int var90;
            if (var4 < class348.field4772 - 1) {
                var90 = class165.field2609[var4].method1239(var2, var3) - class165.field2609[var4 + 1].method1239(var2, var3);
            } else {
                var90 = 0x8 << class115.field1626;
            }
            class130.field1800.method341(var6, var89, var7, arg0.field593);
            int var91 = arg0.field593[2];
            class130.field1800.method341(var6, var89 - var90, var7, arg0.field593);
            int var92 = arg0.field593[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class101.field1469;
            int var96 = class101.field1469 + var94;
            var88.field3964 = var95;
            var88.field3963 = var96;
            var88.field3962 = true;
            class193.field2864.method488(var88);
        }
        if (!arg1.field3032) {
            return;
        }
        if (arg1.field3039 != 0) {
            return;
        }
        if (var2 <= class297.field4092 && var2 > class583.field8555) {
            class205 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field3032) {
                return;
            }
        }
        if (var2 >= class297.field4092 && var2 < class162.field2557 - 1) {
            class205 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field3032) {
                return;
            }
        }
        if (var3 <= class18.field169 && var3 > class334.field4628) {
            class205 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field3032) {
                return;
            }
        }
        if (var3 >= class18.field169 && var3 < class140.field1987 - 1) {
            class205 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field3032) {
                return;
            }
        }
        arg1.field3032 = false;
        class303.field4179--;
        class553 var101 = arg1.field3043;
        if (var101 != null && var101.field8238) {
            if (class330.field4555) {
                class623.method3644(arg0, var4, var2, var3);
                class193.field2864.method429(arg0.field594, arg0.field597);
            }
            class77 var102 = var101.method181(114, class193.field2864);
            if (var102 != null) {
                var102.field1030 = var101;
                var102.field1023 = var4;
                var102.field1029 = var2;
                var102.field1024 = var3;
                class42.field491.method2241((byte) 66, var102);
            }
        }
        if (arg1.field3049 != 0) {
            class323 var103 = arg1.field3040;
            if (var103 != null && !class287.method1784(var5, var2, var3, var103.method1941(false))) {
                if ((var103.field4455 & arg1.field3049) != 0) {
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class77 var104 = var103.method181(92, class193.field2864);
                    if (var104 != null) {
                        var104.field1030 = var103;
                        var104.field1023 = var4;
                        var104.field1029 = var2;
                        var104.field1024 = var3;
                        class42.field491.method2241((byte) 66, var104);
                    }
                } else if (var103.field4455 == 256) {
                    int var105 = var103.field4446 - class103.field1488;
                    int var106 = var103.field4457 - class311.field4288;
                    int var107 = var103.field4452;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class330.field4555) {
                        class623.method3644(arg0, var4, var2, var3);
                        class193.field2864.method429(arg0.field594, arg0.field597);
                    }
                    class323 var110 = arg1.field3050;
                    if (var109 > var108) {
                        class77 var111 = var103.method181(23, class193.field2864);
                        if (var111 != null) {
                            var111.field1030 = var103;
                            var111.field1023 = var4;
                            var111.field1029 = var2;
                            var111.field1024 = var3;
                            class42.field491.method2241((byte) 66, var111);
                        }
                    } else if (var110 != null) {
                        class77 var112 = var110.method181(46, class193.field2864);
                        if (var112 != null) {
                            var112.field1030 = var110;
                            var112.field1023 = var4;
                            var112.field1029 = var2;
                            var112.field1024 = var3;
                            class42.field491.method2241((byte) 66, var112);
                        }
                    }
                }
            }
            class113 var113 = arg1.field3047;
            class113 var114 = arg1.field3037;
            if (var114 != null && (var114.field1595 & arg1.field3049) != 0 && !class428.method2509(var5, var2, var3, var114.field1595)) {
                if (class330.field4555) {
                    class77.method596(arg0, var114.field1595, var4, var2, var3);
                    class193.field2864.method429(arg0.field594, arg0.field597);
                }
                class77 var115 = var114.method181(29, class193.field2864);
                if (var115 != null) {
                    var115.field1030 = var114;
                    var115.field1023 = var4;
                    var115.field1029 = var2;
                    var115.field1024 = var3;
                    class42.field491.method2241((byte) 66, var115);
                }
            }
            if (var113 != null && (var113.field1595 & arg1.field3049) != 0 && !class428.method2509(var5, var2, var3, var113.field1595)) {
                if (class330.field4555) {
                    class77.method596(arg0, var113.field1595, var4, var2, var3);
                    class193.field2864.method429(arg0.field594, arg0.field597);
                }
                class77 var116 = var113.method181(122, class193.field2864);
                if (var116 != null) {
                    var116.field1030 = var113;
                    var116.field1023 = var4;
                    var116.field1029 = var2;
                    var116.field1024 = var3;
                    class42.field491.method2241((byte) 66, var116);
                }
            }
        }
        if (var4 < class348.field4772 - 1) {
            class205 var117 = class420.field5697[var4 + 1][var2][var3];
            if (var117 != null && var117.field3032) {
                class451.field6356.method934(var117, (byte) -28);
            }
        }
        if (var2 < class297.field4092) {
            class205 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field3032) {
                class451.field6356.method929(var118, (byte) -128);
            }
        }
        if (var3 < class18.field169) {
            class205 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field3032) {
                class451.field6356.method929(var119, (byte) 57);
            }
        }
        if (var2 > class297.field4092) {
            class205 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field3032) {
                class451.field6356.method929(var120, (byte) 97);
            }
        }
        if (var3 > class18.field169) {
            class205 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field3032) {
                class451.field6356.method929(var121, (byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
    public static final boolean method1964(int arg0) {
        field4520++;
        if (arg0 != 1) {
            return true;
        }
        if (class192.field2854) {
            try {
                class640.method3702(class442.field5896.field4568, (byte) 39, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
    private final void method1965(int arg0, int arg1) {
        if (arg1 == 1) {
            this.field4513.method2938(arg0, (byte) -18);
            field4514++;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method1966(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field4534 = null;
        }
        field4519++;
        return this.method1992(null, arg1, arg0, (byte) 58);
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1967(int arg0, String arg1) {
        field4503++;
        if (!this.method1986(23977)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4532.field7026.method2366(class427.method2505(var3, 0), (byte) -105);
        if (this.method1978(17548, var4)) {
            return arg0 == -1 ? var4 : 101;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
    public final boolean method1968(byte arg0) {
        field4502++;
        if (!this.method1986(23977)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 69) {
            method1963(null, null);
        }
        while (this.field4532.field7022.length > var3) {
            int var4 = this.field4532.field7022[var3];
            if (this.field4534[var4] == null) {
                this.method1979(var4, arg0 - 69);
                if (this.field4534[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(Z)V")
    public final void method1969(boolean arg0) {
        field4522++;
        if (this.field4537 != null) {
            for (int var2 = 0; var2 < this.field4537.length; var2++) {
                this.field4537[var2] = null;
            }
        }
        if (arg0) {
            this.method1962(-99, null);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1970(String arg0, byte arg1) {
        field4504++;
        if (this.method1986(23977)) {
            int var3 = -36 % ((arg1 + 7) / 46);
            String var4 = arg0.toLowerCase();
            int var5 = this.field4532.field7026.method2366(class427.method2505(var4, 0), (byte) -110);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(II)I")
    public final int method1971(int arg0, int arg1) {
        field4511++;
        if (arg0 != 3) {
            this.field4524 = true;
        }
        if (this.method1986(arg0 ^ 0x5DAA)) {
            int var3 = this.field4532.field7026.method2366(arg1, (byte) -119);
            return this.method1978(17548, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public final void method1972(int arg0) {
        field4508++;
        if (arg0 != 22156) {
            this.method1989(null, 126, null);
        }
        if (this.field4534 != null) {
            for (int var2 = 0; var2 < this.field4534.length; var2++) {
                this.field4534[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BI)I")
    public static final int method1973(byte arg0, int arg1) {
        field4530++;
        return arg0 == 69 ? arg1 >>> 8 : 55;
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
    public final int method1974(int arg0) {
        field4523++;
        if (this.method1986(arg0 ^ 0xFFFF83DD)) {
            return arg0 == -8588 ? this.field4532.field7032.length : 1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(II)I")
    public final int method1975(int arg0, int arg1) {
        field4535++;
        if (arg0 < 27) {
            return -104;
        } else if (this.method1978(17548, arg1)) {
            return this.field4532.field7032[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)Z")
    public final boolean method1976(int arg0, boolean arg1) {
        field4544++;
        if (!this.method1978(17548, arg0)) {
            return false;
        } else if (this.field4534[arg0] != null) {
            return true;
        } else if (arg1) {
            this.method1979(arg0, 0);
            return this.field4534[arg0] != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1977(int arg0, String arg1, String arg2) {
        field4533++;
        if (!this.method1986(23977)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4532.field7026.method2366(class427.method2505(var4, arg0 - 1), (byte) -125);
        if (arg0 != 1) {
            this.field4513 = null;
        }
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field4532.field7024[var6].method2366(class427.method2505(var5, 0), (byte) -123);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(II)Z")
    private final boolean method1978(int arg0, int arg1) {
        if (arg0 != 17548) {
            this.method1983(67);
        }
        field4526++;
        if (!this.method1986(23977)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field4532.field7032.length && this.field4532.field7032[arg1] != 0) {
            return true;
        } else if (class507.field7199) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "(II)V")
    private final void method1979(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (this.field4524) {
            this.field4534[arg0] = this.field4513.method2937(arg0, class354.method2138(arg1, -1));
        } else {
            this.field4534[arg0] = class609.method3579(this.field4513.method2937(arg0, -1), 136, false);
        }
        field4505++;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIB)Z")
    public final boolean method1980(int arg0, int arg1, byte arg2) {
        field4525++;
        if (!this.method1958(4721, arg1, arg0)) {
            return false;
        }
        if (arg2 > -5) {
            this.field4524 = false;
        }
        if (this.field4537[arg1] != null && this.field4537[arg1][arg0] != null) {
            return true;
        } else if (this.field4534[arg1] == null) {
            this.method1979(arg1, 0);
            return this.field4534[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZI)Z")
    public final boolean method1981(boolean arg0, int arg1) {
        field4538++;
        if (!arg0) {
            this.method1992(null, -55, -106, (byte) 53);
        }
        if (!this.method1986(23977)) {
            return false;
        } else if (this.field4532.field7032.length == 1) {
            return this.method1980(arg1, 0, (byte) -49);
        } else if (!this.method1978(17548, arg1)) {
            return false;
        } else if (this.field4532.field7032[arg1] == 1) {
            return this.method1980(0, arg1, (byte) -36);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZZ)V")
    public final void method1982(int arg0, boolean arg1, boolean arg2) {
        field4515++;
        if (!this.method1986(23977)) {
            return;
        }
        if (arg1) {
            this.field4532.field7026 = null;
            this.field4532.field7017 = null;
        }
        if (arg2) {
            this.field4532.field7024 = null;
            this.field4532.field7021 = null;
        }
        int var4 = 64 / ((28 - arg0) / 45);
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)I")
    public final int method1983(int arg0) {
        field4528++;
        if (!this.method1986(23977)) {
            throw new IllegalStateException("");
        }
        if (arg0 >= -32) {
            this.field4534 = null;
        }
        return this.field4532.field7015;
    }

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "(II)[B")
    public final byte[] method1984(int arg0, int arg1) {
        field4509++;
        if (!this.method1986(arg0 + 22307)) {
            return null;
        }
        if (arg0 != 1670) {
            this.field4534 = null;
        }
        if (this.field4532.field7032.length == 1) {
            return this.method1966(arg1, 0, true);
        } else if (!this.method1978(17548, arg1)) {
            return null;
        } else if (this.field4532.field7032[arg1] == 1) {
            return this.method1966(0, arg1, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILsm;)V")
    public static final void method1985(int arg0, int arg1, int arg2, class238 arg3) {
        class205 var4 = class441.method2562(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field3045 = arg3;
        }
    }

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)Z")
    private final boolean method1986(int arg0) {
        field4518++;
        if (this.field4532 == null) {
            this.field4532 = this.field4513.method2939((byte) 110);
            if (this.field4532 == null) {
                return false;
            }
            this.field4537 = new Object[this.field4532.field7025][];
            this.field4534 = new Object[this.field4532.field7025];
        }
        if (arg0 != 23977) {
            this.method1994(-89, -38);
        }
        return true;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1987(byte arg0, String arg1) {
        int var3 = 70 / ((arg0 - 25) / 55);
        field4512++;
        if (this.method1986(23977)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field4532.field7026.method2366(class427.method2505(var4, 0), (byte) -90);
            return this.method1976(var5, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILub;)V")
    public static final void method1988(int arg0, class20 arg1) {
        class215.field3166 = arg1;
        field4543++;
        if (arg0 != 6) {
            method1959(false);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method1989(String arg0, int arg1, String arg2) {
        field4531++;
        if (arg1 != -8002) {
            this.method1961(-41, (byte) 26);
        }
        if (!this.method1986(23977)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4532.field7026.method2366(class427.method2505(var4, 0), (byte) -123);
        if (this.method1978(17548, var6)) {
            int var7 = this.field4532.field7024[var6].method2366(class427.method2505(var5, 0), (byte) -89);
            return this.method1980(var7, var6, (byte) -68);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method1990(String arg0, int arg1, String arg2) {
        field4539++;
        if (!this.method1986(arg1 ^ 0x5DA9)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4532.field7026.method2366(class427.method2505(var4, arg1 + arg1), (byte) -124);
        if (this.method1978(17548, var6)) {
            int var7 = this.field4532.field7024[var6].method2366(class427.method2505(var5, arg1), (byte) -107);
            return this.method1966(var7, var6, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(IIB)Z")
    public static final boolean method1991(int arg0, int arg1, byte arg2) {
        int var3 = -3 / ((60 - arg2) / 49);
        field4506++;
        return class82.method622((byte) 85, arg0, arg1) | (arg1 & 0x70000) != 0 || class47.method294(arg0, arg1, 1119090531);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([IIIB)[B")
    public final byte[] method1992(int[] arg0, int arg1, int arg2, byte arg3) {
        field4542++;
        if (!this.method1958(4721, arg1, arg2)) {
            return null;
        }
        if (this.field4537[arg1] == null || this.field4537[arg1][arg2] == null) {
            boolean var5 = this.method1957((byte) 25, arg0, arg2, arg1);
            if (!var5) {
                this.method1979(arg1, 0);
                boolean var6 = this.method1957((byte) 25, arg0, arg2, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        int var7 = 119 % ((arg3 - 5) / 53);
        byte[] var8 = class585.method3481(0, this.field4537[arg1][arg2], false);
        if (this.field4501 == 1) {
            this.field4537[arg1][arg2] = null;
            if (this.field4532.field7032[arg1] == 1) {
                this.field4537[arg1] = null;
            }
        } else if (this.field4501 == 2) {
            this.field4537[arg1] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lnh;ZI)V")
    public class328(class637 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4501 = arg2;
        this.field4513 = arg0;
        this.field4524 = arg1;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(BI)V")
    public final void method1993(byte arg0, int arg1) {
        field4521++;
        if (arg0 == 50 && this.method1978(17548, arg1) && this.field4537 != null) {
            this.field4537[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "(II)[I")
    public final int[] method1994(int arg0, int arg1) {
        if (arg0 > -50) {
            this.method1976(48, false);
        }
        field4510++;
        if (!this.method1978(17548, arg1)) {
            return null;
        }
        int[] var3 = this.field4532.field7020[arg1];
        if (var3 == null) {
            var3 = new int[this.field4532.field7018[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(BLjava/lang/String;)V")
    public final void method1995(byte arg0, String arg1) {
        field4527++;
        if (arg0 != -118) {
            this.field4532 = null;
        }
        if (this.method1986(23977)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4532.field7026.method2366(class427.method2505(var3, 0), (byte) -107);
            this.method1965(var4, 1);
        }
    }
}
