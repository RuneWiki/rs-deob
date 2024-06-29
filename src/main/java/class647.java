import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class647 {

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
    private int[] field8727;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[B")
    private byte[] field8720;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    private int[] field8726;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lmw;")
    public static class517 field8724 = new class517(37, 7);

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lqj;")
    public static class535 field8730 = new class535(8);

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lmw;")
    public static class517 field8731 = new class517(51, 8);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8729;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field8732;

    // $FF: synthetic method
    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3596(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljs;IILsu;Lha;I)Z", line = 8)
    public static final boolean method3589(class349 arg0, int arg1, int arg2, class223 arg3, class66 arg4, int arg5) {
        field8721++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field5090 != null) {
            var9 = class752.field10173 - ((class752.field10173 - class752.field10186) * (arg0.field5059 + arg3.field2893 - class752.field10184) / (class752.field10172 - class752.field10184));
            var8 = class752.field10173 - ((arg0.field5093 + arg3.field2893 - class752.field10184) * (class752.field10173 - class752.field10186) / (class752.field10172 - class752.field10184));
            var6 = (class752.field10171 - class752.field10174) * (arg0.field5095 + arg3.field2889 - class752.field10170) / (class752.field10179 - class752.field10170) + class752.field10174;
            var7 = class752.field10174 + ((arg0.field5087 + arg3.field2889 - class752.field10170) * (class752.field10171 - class752.field10174) / (class752.field10179 - class752.field10170));
        }
        if (arg5 != -21133) {
            method3595((byte) -22);
        }
        class140 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field5077 != -1) {
            if (arg3.field2891 && arg0.field5053 != -1) {
                var10 = arg0.method2236((byte) -67, true, arg4);
            } else {
                var10 = arg0.method2236((byte) -67, false, arg4);
            }
            if (var10 != null) {
                var11 = arg3.field2888 - (var10.method343() + 1 >> 1);
                var12 = arg3.field2888 + (var10.method343() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field2886 - (var10.method340() + 1 >> 1);
                var14 = arg3.field2886 + (var10.method340() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class513 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg0.field5056 != null) {
            var15 = class327.method2111((byte) 17, arg0.field5082);
            if (var15 != null) {
                var16 = class687.field9196.method3621(null, null, class571.field7777, arg0.field5056, (byte) 74);
                int var24 = arg3.field2886 - ((class752.field10173 - class752.field10186) * arg0.field5094 / (class752.field10172 - class752.field10184));
                var17 = arg3.field2888 + ((class752.field10171 - class752.field10174) * arg0.field5064 / (class752.field10179 - class752.field10170));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2994() / 2;
                } else {
                    var18 = var24 - ((var10.method340() >> 1) + (var15.method2996() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class571.field7777[var25];
                    if ((var16 - 1) > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2995(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg2 - var19 / 2;
                var21 = var19 / 2 + var17 + arg2;
                if (var20 < var6) {
                    var6 = var20;
                }
                if (var7 < var21) {
                    var7 = var21;
                }
                var22 = arg1 + var18;
                var23 = var16 * var15.method2996() + var18 + arg1;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (var7 < class752.field10174 || class752.field10171 < var6 || class752.field10186 > var9 || var8 > class752.field10173) {
            return true;
        }
        class752.method4120(arg4, arg3, arg0);
        if (var10 != null) {
            if (class419.field6021 > 0 && (class672.field9007 != -1 && class672.field9007 == arg3.field2885 || class163.field2163 != -1 && class163.field2163 == arg0.field5098)) {
                int var28;
                if (class7.field54 <= 50) {
                    var28 = class7.field54 * 2;
                } else {
                    var28 = (100 - class7.field54) * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method523(var29, 1, var10.method350() / 2 + 7, arg3.field2886, arg3.field2888);
                arg4.method523(var29, arg5 ^ 0xFFFFAD72, var10.method350() / 2 + 5, arg3.field2886, arg3.field2888);
                arg4.method523(var29, arg5 + 21134, var10.method350() / 2 - -3, arg3.field2886, arg3.field2888);
                arg4.method523(var29, 1, var10.method350() / 2 + 1, arg3.field2886, arg3.field2888);
                arg4.method523(var29, 1, var10.method350() / 2, arg3.field2886, arg3.field2888);
            }
            var10.method968(arg3.field2888 - (var10.method343() >> 1), arg3.field2886 + -(var10.method340() >> 1));
        }
        if (arg0.field5056 != null && var15 != null) {
            class433.method2589(arg4, arg0, var16, var15, true, var18, var17, var19, arg3);
        }
        if (arg0.field5077 != -1 || arg0.field5056 != null) {
            class265 var30 = new class265(arg3);
            var30.field3896 = var22;
            var30.field3892 = var20;
            var30.field3897 = var12;
            var30.field3898 = var13;
            var30.field3890 = var23;
            var30.field3888 = var14;
            var30.field3893 = var11;
            var30.field3901 = var21;
            class735.field9966.method689(var30, 123);
        }
        return false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[BIII)I", line = 196)
    public final int method3590(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field8722++;
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg4 << 3;
        int var10 = -12 / ((arg3 + 50) / 61);
        while (arg5 < var8) {
            int var11 = arg2[arg5] & 0xFF;
            int var12 = this.field8727[var11];
            byte var13 = this.field8720[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            var9 += var13;
            int var18 = var15 + 24;
            arg0[var14] = (byte) (var7 = class670.method3699(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg0[var14] = (byte) (var7 = var12 >>> var15);
                if (var14 < var17) {
                    var15 -= 8;
                    var14++;
                    arg0[var14] = (byte) (var7 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg0[var14] = (byte) (var7 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg0[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 267)
    public static final void method3591() {
        for (int var0 = 0; var0 < class563.field7717; var0++) {
            if (!class489.field6818[var0]) {
                class447 var1 = class82.field1135[var0];
                class127 var2 = var1.field6422;
                int var3 = var1.field6434;
                int var4 = var2.method903((byte) -116) - class281.field4067;
                int var5 = (var4 * 2 >> class478.field6717) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method899(true) - var4 >> class478.field6717;
                int var9 = var2.method901((byte) -115) - var4 >> class478.field6717;
                int var10 = var2.method901((byte) -115) + var4 >> class478.field6717;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class247.field3229) {
                    var10 = class247.field3229 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6432[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class196.field2540) {
                        var16 = class196.field2540 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class539 var19 = class4.method28(var3, var17, var11, field8732 == null ? (field8732 = method3596("nga")) : field8732);
                        if (var19 != null && var19.field7461 != 0) {
                            if (var19.field7461 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6432[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6432[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6432[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6432[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class489.field6818[var0] = true;
                class645.field8694[var3].method189(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 446)
    public static void method3592(byte arg0) {
        if (arg0 <= 81) {
            field8731 = null;
        }
        field8730 = null;
        field8731 = null;
        field8724 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLaf;)V", line = 458)
    public static final void method3593(byte arg0, class459 arg1) {
        arg1.method2722(-115);
        field8725++;
        int var2 = class349.field5065;
        class758 var3 = class625.field8475 = class84.field1204[var2] = new class758();
        var3.field6146 = var2;
        int var4 = arg1.method2721(30, 1);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF307) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field6198[0] = var6 - class120.field1625;
        var3.field2802 = (var3.field6198[0] << 9) + (var3.method2563(-12840) << 8);
        var3.field6197[0] = var7 - class259.field3849;
        if (arg0 != 94) {
            return;
        }
        var3.field2810 = (var3.field6197[0] << 9) + (var3.method2563(arg0 ^ 0xFFFFCD86) << 8);
        class184.field2420 = var3.field2813 = var3.field2809 = var5;
        if (class49.method310(var3.field6198[0], var3.field6197[0], (byte) 46)) {
            var3.field2809++;
        }
        if (class243.field3193[var2] != null) {
            var3.method4155(false, class243.field3193[var2]);
        }
        class652.field8795 = 0;
        class497.field6986[class652.field8795++] = var2;
        class134.field1826[var2] = 0;
        class377.field5510 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2721(18, 1);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF72) >> 8;
                int var12 = var9 & 0xFF;
                class170 var13 = class637.field8588[var8] = new class170();
                var13.field2227 = -1;
                var13.field2225 = false;
                var13.field2229 = 0;
                var13.field2226 = false;
                var13.field2228 = (var11 << 14) + (var10 << 28) + var12;
                class537.field7440[class377.field5510++] = var8;
                class134.field1826[var8] = 0;
            }
        }
        arg1.method2717((byte) 116);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[BBI[BI)I", line = 536)
    public final int method3594(int arg0, byte[] arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 66 % ((arg2 - 69) / 56);
        field8723++;
        if (arg0 == 0) {
            return 0;
        }
        int var8 = 0;
        int var9 = arg0 + arg5;
        int var10 = arg3;
        while (true) {
            byte var11 = arg1[var10];
            if (var11 < 0) {
                var8 = this.field8726[var8];
            } else {
                var8++;
            }
            int var12;
            if ((var12 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var13;
            if ((var13 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var14;
            if ((var14 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var15;
            if ((var15 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var16;
            if ((var16 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (arg5 >= var9) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var17;
            if ((var17 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var18;
            if ((var18 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (var9 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field8726[var8];
            }
            int var19;
            if ((var19 = this.field8726[var8]) < 0) {
                arg4[arg5++] = (byte) (~var19);
                if (arg5 >= var9) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg3;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V", line = 687)
    public class647(byte[] arg0) {
        int var2 = arg0.length;
        this.field8727 = new int[var2];
        this.field8720 = arg0;
        this.field8726 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8727[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class670.method3699(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field8726[var14] == 0) {
                            this.field8726[var14] = var4;
                        }
                        var14 = this.field8726[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field8726.length) {
                        int[] var18 = new int[this.field8726.length * 2];
                        for (int var19 = 0; var19 < this.field8726.length; var19++) {
                            var18[var19] = this.field8726[var19];
                        }
                        this.field8726 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field8726[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 810)
    public static final void method3595(byte arg0) {
        field8728++;
        if (arg0 >= -90 || class344.field4821 != null && class10.field123 != null) {
            return;
        }
        class344.field4821 = new int[256];
        class10.field123 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class344.field4821[var1] = (int) (Math.sin(var2) * 4096.0D);
            class10.field123[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
