import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class133 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[B")
    private byte[] field2083;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
    private int[] field2086;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2082 = "Walk here";

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2084 = "Loading interfaces - ";

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lgf;")
    public static class140 field2085;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Lbf;")
    public static class58 field2093;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[B[BB)I", line = 20)
    public final int method971(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, byte arg5) {
        field2089++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var11;
            if ((var11 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var12;
            if ((var12 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var13;
            if ((var13 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var14;
            if ((var14 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var15;
            if ((var15 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var16;
            if ((var16 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var17;
            if ((var17 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2086[var8];
            }
            int var18;
            if ((var18 = this.field2086[var8]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg5 != 127) {
            this.field2090 = (int[]) null;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 168)
    public static final void method972(int arg0) {
        field2094++;
        if (arg0 == 23028) {
            class24.field327.method702((byte) 123);
            class172.field2858.method702((byte) 123);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 187)
    public static final void method973(String arg0, byte arg1, int arg2) {
        field2088++;
        String var3 = class320.method2250((byte) -76, class329.method2301(arg0, 1));
        if (arg1 != 117) {
            method975(83, (class263) null);
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class275.field4435; var5++) {
            class334 var6 = class74.field1049[class160.field2656[var5]];
            if (var6 != null && var6.field5216 != null && var6.field5216.equalsIgnoreCase(var3)) {
                if (arg2 == 1) {
                    class247.field3897++;
                    class194.field3175.method2375(27, arg1 - 117);
                    class194.field3175.method257(-2, 0);
                    class194.field3175.method266(class160.field2656[var5], false);
                } else if (arg2 == 4) {
                    class221.field3549++;
                    class194.field3175.method2375(58, 0);
                    class194.field3175.method257(arg1 - 119, 0);
                    class194.field3175.method266(class160.field2656[var5], false);
                } else if (arg2 == 5) {
                    class258.field4139++;
                    class194.field3175.method2375(1, 0);
                    class194.field3175.method253(class160.field2656[var5], 58);
                    class194.field3175.method232(0, (byte) -113);
                } else if (arg2 == 6) {
                    class160.field2655++;
                    class194.field3175.method2375(161, 0);
                    class194.field3175.method257(-2, 0);
                    class194.field3175.method253(class160.field2656[var5], 63);
                } else if (arg2 == 7) {
                    class260.field4159++;
                    class194.field3175.method2375(251, 0);
                    class194.field3175.method287(0, class160.field2656[var5]);
                    class194.field3175.method240((byte) -124, 0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class155.method1109(class120.field1827 + var3, 0, "", (byte) -47);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BIII[B)I", line = 268)
    public final int method974(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = 0;
        field2091++;
        int var8 = arg4 << 3;
        int var9 = arg2 + arg3;
        if (arg0 != 255) {
            this.field2086 = (int[]) null;
        }
        while (var9 > arg2) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field2090[var10];
            byte var12 = this.field2083[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 & 0x7;
            int var14 = var7 & -var13 >> 31;
            int var15 = var8 >> 3;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg1[var15] = (byte) (var7 = class122.method882(var14, var11 >>> var17));
            if (var15 < var16) {
                var15++;
                var13 = var17 - 8;
                arg1[var15] = (byte) (var7 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg1[var15] = (byte) (var7 = var11 >>> var13);
                    if (var16 > var15) {
                        var13 -= 8;
                        var15++;
                        arg1[var15] = (byte) (var7 = var11 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg1[var15] = (byte) (var7 = var11 << -var13);
                        }
                    }
                }
            }
            var8 += var12;
            arg2++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V", line = 341)
    public class133(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field2083 = arg0;
        this.field2086 = new int[8];
        this.field2090 = new int[var3];
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field2090[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class122.method882(var12, var11);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field2086[var14] == 0) {
                            this.field2086[var14] = var4;
                        }
                        var14 = this.field2086[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field2086.length) {
                        int[] var18 = new int[this.field2086.length * 2];
                        for (int var19 = 0; var19 < this.field2086.length; var19++) {
                            var18[var19] = this.field2086[var19];
                        }
                        this.field2086 = var18;
                    }
                }
                this.field2086[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILrf;)V", line = 469)
    public static final void method975(int arg0, class263 arg1) {
        field2087++;
        if (arg1.field4185 == 0) {
            return;
        }
        class17 var2 = arg1.method1876((byte) 125);
        if (arg1.field4198 != -1 && arg1.field4198 < 32768) {
            class234 var3 = class99.field1445[arg1.field4198];
            if (var3 != null) {
                int var4 = arg1.field4255 - var3.field4255;
                int var5 = arg1.field4264 - var3.field4264;
                if (var4 != 0 || var5 != 0) {
                    arg1.field4277 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4198 >= 32768) {
            int var6 = arg1.field4198 - 32768;
            if (class234.field3758 == var6) {
                var6 = 2047;
            }
            class334 var7 = class74.field1049[var6];
            if (var7 != null) {
                int var8 = arg1.field4255 - var7.field4255;
                int var9 = arg1.field4264 - var7.field4264;
                if (var8 != 0 || var9 != 0) {
                    arg1.field4277 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((~arg1.field4241 != arg0 || arg1.field4202 != 0) && (arg1.field4251 == 0 || arg1.field4239 > 0)) {
            int var10 = arg1.field4264 - ((arg1.field4202 - class205.field3367 - class205.field3367) * 64);
            int var11 = arg1.field4255 - ((arg1.field4241 - class70.field989 - class70.field989) * 64);
            if (var11 != 0 || var10 != 0) {
                arg1.field4277 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field4202 = 0;
            arg1.field4241 = 0;
        }
        int var12 = arg1.field4277 - arg1.field4196 & 0x7FF;
        if (var12 == 0) {
            arg1.field4194 = 0;
            arg1.field4258 = 0;
        } else if (var2.field198 == 0) {
            arg1.field4194++;
            if (var12 > 1024) {
                boolean var13 = true;
                arg1.field4196 -= arg1.field4185;
                if (arg1.field4185 > var12 || var12 > 2048 - arg1.field4185) {
                    arg1.field4196 = arg1.field4277;
                    var13 = false;
                }
                if (arg1.field4194 > 25 || var13) {
                    arg1.field4232 = var2.field228;
                    if (arg1.field4251 > 0) {
                        if (arg1.field4246[arg1.field4251 - 1] == 2) {
                            if (var2.field226 != -1) {
                                arg1.field4232 = var2.field226;
                            } else if (var2.field229 != -1) {
                                arg1.field4232 = var2.field229;
                            }
                        } else if (arg1.field4246[arg1.field4251 - 1] == 0) {
                            if (var2.field214 != -1) {
                                arg1.field4232 = var2.field214;
                            } else if (var2.field224 != -1) {
                                arg1.field4232 = var2.field224;
                            }
                        } else if (var2.field231 != -1) {
                            arg1.field4232 = var2.field231;
                        }
                    } else if (var2.field212 != -1) {
                        arg1.field4232 = var2.field212;
                    }
                }
            } else {
                boolean var14 = true;
                arg1.field4196 += arg1.field4185;
                if (var12 < arg1.field4185 || var12 > (2048 - arg1.field4185)) {
                    arg1.field4196 = arg1.field4277;
                    var14 = false;
                }
                if (arg1.field4194 > 25 || var14) {
                    arg1.field4232 = var2.field228;
                    if (arg1.field4251 <= 0) {
                        if (var2.field232 != -1) {
                            arg1.field4232 = var2.field232;
                        }
                    } else if (arg1.field4246[arg1.field4251 - 1] == 2) {
                        if (var2.field219 != -1) {
                            arg1.field4232 = var2.field219;
                        } else if (var2.field229 != -1) {
                            arg1.field4232 = var2.field229;
                        }
                    } else if (arg1.field4246[arg1.field4251 - 1] == 0) {
                        if (var2.field235 != -1) {
                            arg1.field4232 = var2.field235;
                        } else if (var2.field224 != -1) {
                            arg1.field4232 = var2.field224;
                        }
                    } else if (var2.field213 != -1) {
                        arg1.field4232 = var2.field213;
                    }
                }
            }
            arg1.field4196 &= 0x7FF;
        } else {
            arg1.field4232 = -1;
            int var15 = arg1.field4277 << 5;
            if (arg1.field4209 != var15) {
                arg1.field4209 = var15;
                arg1.field4197 = 0;
                int var16 = var15 - arg1.field4193 & 0xFFFF;
                int var17 = arg1.field4258 * arg1.field4258 / (var2.field198 * 2);
                if (arg1.field4258 > 0 && var17 <= var16 && var16 - var17 < 32768) {
                    arg1.field4245 = var16 / 2;
                    arg1.field4266 = true;
                    int var18 = var2.field203 * var2.field203 / (var2.field198 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field4245) {
                        arg1.field4245 = var16 - var18;
                    }
                } else if (arg1.field4258 < 0 && 65536 - var16 >= var17 && 65536 - var16 - var17 < 32768) {
                    arg1.field4266 = true;
                    arg1.field4245 = (65536 - var16) / 2;
                    int var19 = var2.field203 * var2.field203 / (var2.field198 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field4245) {
                        arg1.field4245 = 65536 - var19 - var16;
                    }
                } else {
                    arg1.field4266 = false;
                }
            }
            if (arg1.field4258 == 0) {
                int var20 = arg1.field4209 - arg1.field4193 & 0xFFFF;
                if (var2.field198 <= var20) {
                    arg1.field4266 = true;
                    int var21 = var2.field203 * var2.field203 / (var2.field198 * 2);
                    arg1.field4197 = 0;
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg1.field4245 = (65536 - var20) / 2;
                        if (var21 < arg1.field4245) {
                            arg1.field4245 = 65536 - var20 - var21;
                        }
                        arg1.field4258 = -var2.field198;
                    } else {
                        arg1.field4258 = var2.field198;
                        arg1.field4245 = var20 / 2;
                        if (arg1.field4245 > var21) {
                            arg1.field4245 = var20 - var21;
                        }
                    }
                } else {
                    arg1.field4193 = arg1.field4209;
                }
            } else if (arg1.field4258 > 0) {
                if (arg1.field4245 <= arg1.field4197) {
                    arg1.field4266 = false;
                }
                if (!arg1.field4266) {
                    arg1.field4258 -= var2.field198;
                    if (arg1.field4258 < 0) {
                        arg1.field4258 = 0;
                    }
                } else if (var2.field203 > arg1.field4258) {
                    arg1.field4258 += var2.field198;
                }
            } else {
                if (arg1.field4245 <= arg1.field4197) {
                    arg1.field4266 = false;
                }
                if (!arg1.field4266) {
                    arg1.field4258 += var2.field198;
                    if (arg1.field4258 > 0) {
                        arg1.field4258 = 0;
                    }
                } else if (arg1.field4258 > (-var2.field203)) {
                    arg1.field4258 -= var2.field198;
                }
            }
            if (arg1.field4258 <= 0) {
                arg1.field4197 -= arg1.field4258;
            } else {
                arg1.field4197 += arg1.field4258;
            }
            arg1.field4193 += arg1.field4258;
            arg1.field4193 &= 0xFFFF;
            arg1.field4196 = arg1.field4193 >> 5;
            if (arg1.field4258 < 0) {
                if (arg1.field4251 > 0) {
                    if (arg1.field4246[arg1.field4251 - 1] == 2) {
                        if (var2.field226 != -1) {
                            arg1.field4232 = var2.field226;
                        } else if (var2.field229 != -1) {
                            arg1.field4232 = var2.field229;
                        }
                    } else if (arg1.field4246[arg1.field4251 - 1] == 0) {
                        if (var2.field214 != -1) {
                            arg1.field4232 = var2.field214;
                        } else if (var2.field224 != -1) {
                            arg1.field4232 = var2.field224;
                        }
                    }
                }
                if (arg1.field4232 == -1) {
                    if (var2.field231 != -1) {
                        arg1.field4232 = var2.field231;
                    } else if (var2.field212 != -1) {
                        arg1.field4232 = var2.field212;
                    }
                }
            } else {
                if (arg1.field4251 > 0) {
                    if (arg1.field4246[arg1.field4251 - 1] == 2) {
                        if (var2.field219 != -1) {
                            arg1.field4232 = var2.field219;
                        } else if (var2.field229 != -1) {
                            arg1.field4232 = var2.field229;
                        }
                    } else if (arg1.field4246[arg1.field4251 - 1] == 0) {
                        if (var2.field235 != -1) {
                            arg1.field4232 = var2.field235;
                        } else if (var2.field224 != -1) {
                            arg1.field4232 = var2.field224;
                        }
                    }
                }
                if (arg1.field4232 == -1) {
                    if (var2.field213 != -1) {
                        arg1.field4232 = var2.field213;
                    } else if (var2.field232 != -1) {
                        arg1.field4232 = var2.field232;
                    }
                }
            }
            if (arg1.field4232 == -1) {
                arg1.field4232 = var2.field228;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 901)
    public static void method976(int arg0) {
        if (arg0 != 0) {
            field2084 = (String) null;
        }
        field2082 = null;
        field2084 = null;
        field2085 = null;
        field2093 = null;
    }
}
