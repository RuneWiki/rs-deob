import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class248 extends class224 {

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "[I")
    private int[] field4243 = new int[3];

    @OriginalMember(owner = "client!nl", name = "db", descriptor = "I")
    private int field4250 = 4096;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    private int field4244 = 409;

    @OriginalMember(owner = "client!nl", name = "gb", descriptor = "I")
    private int field4253 = 4096;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    private int field4240 = 4096;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "Lg;")
    public static class242 field4241 = null;

    @OriginalMember(owner = "client!nl", name = "bb", descriptor = "Luf;")
    public static class168 field4248 = class148.method1019(-1720, "blinken1:");

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "J")
    public static long field4239 = 0L;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!nl", name = "cb", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!nl", name = "eb", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!nl", name = "fb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 17)
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B[Lcg;ZIBI)V", line = 22)
    public static final void method1702(byte[] arg0, class253[] arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 <= 8) {
            method1703(-20);
        }
        field4242++;
        class153 var6 = new class153(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1079((byte) -114);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1074((byte) -125);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 >> 6 & 0x3F;
                int var14 = var6.method1042((byte) -117);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg3 + var13;
                int var18 = arg5 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class253 var19 = null;
                    if (!arg2) {
                        int var20 = var12;
                        if ((class159.field2520[1][var17][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class77.method460(var16, 0, var12, var12, var18, var7, var19, var15, arg2, var17, !arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZLj;)V", line = 95)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4238++;
        if (arg0 == 0) {
            this.field4244 = arg2.method1069(48);
        } else if (arg0 == 1) {
            this.field4240 = arg2.method1069(30);
        } else if (arg0 == 2) {
            this.field4250 = arg2.method1069(125);
        } else if (arg0 == 3) {
            this.field4253 = arg2.method1069(32);
        } else if (arg0 == 4) {
            int var5 = arg2.method1088(-30917);
            this.field4243[0] = class159.method1119(267386880, var5 << 4);
            this.field4243[2] = class159.method1119(var5 >> 12, 0);
            this.field4243[1] = class159.method1119(var5 >> 4, 4080);
        }
        if (arg1) {
            field4249 = 89;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 161)
    public static void method1703(int arg0) {
        field4241 = null;
        field4248 = null;
        if (arg0 != 27878) {
            method1705(-51, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 172)
    public static final void method1704(int arg0) {
        field4245++;
        class267.field4500.method1431((byte) 126);
        class128.field1995.method1431((byte) 124);
        class156.field2465.method1431((byte) 120);
        if (arg0 >= -94) {
            method1706(-27, -52, 33, 91, -58, -67, (byte) -109, -64);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[[I", line = 187)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.method17(-19, (byte) -74);
        }
        field4247++;
        int[][] var3 = this.field3631.method1587(arg0, arg1 + 9881);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field4243[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4244 < var13) {
                    var9[var11] = var12;
                    var10[var11] = var5[var11];
                    var8[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field4243[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4244 < var15) {
                        var9[var11] = var12;
                        var10[var11] = var14;
                        var8[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4243[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field4244) {
                            var9[var11] = var12;
                            var10[var11] = var14;
                            var8[var11] = var16;
                        } else {
                            var9[var11] = this.field4253 * var12 >> 12;
                            var10[var11] = this.field4250 * var14 >> 12;
                            var8[var11] = this.field4240 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)I", line = 289)
    public static final int method1705(int arg0, byte arg1) {
        field4252++;
        if (arg1 >= -55) {
            field4241 = (class242) null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIBI)V", line = 310)
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = -7 / ((55 - arg6) / 51);
        field4246++;
        if (arg0 < 0 || arg3 < 0 || arg0 >= 103 || arg3 >= 103) {
            return;
        }
        if (arg7 == 0) {
            class28 var9 = class245.method1686(arg2, arg0, arg3);
            if (var9 != null) {
                int var10 = (int) (var9.field363 >>> 32) & Integer.MAX_VALUE;
                if (arg5 == 2) {
                    var9.field358 = new class132(var10, 2, arg1 + 4, arg2, arg0, arg3, arg4, false, var9.field358);
                    var9.field361 = new class132(var10, 2, arg1 + 1 & 0x3, arg2, arg0, arg3, arg4, false, var9.field361);
                } else {
                    var9.field358 = new class132(var10, arg5, arg1, arg2, arg0, arg3, arg4, false, var9.field358);
                }
            }
        }
        if (arg7 == 1) {
            class40 var11 = class233.method1586(arg2, arg0, arg3);
            if (var11 != null) {
                int var12 = Integer.MAX_VALUE & (int) (var11.field497 >>> 32);
                if (arg5 == 4 || arg5 == 5) {
                    var11.field494 = new class132(var12, 4, arg1, arg2, arg0, arg3, arg4, false, var11.field494);
                } else if (arg5 == 6) {
                    var11.field494 = new class132(var12, 4, arg1 + 4, arg2, arg0, arg3, arg4, false, var11.field494);
                } else if (arg5 == 7) {
                    var11.field494 = new class132(var12, 4, (arg1 + 2 & 0x3) + 4, arg2, arg0, arg3, arg4, false, var11.field494);
                } else if (arg5 == 8) {
                    var11.field494 = new class132(var12, 4, arg1 + 4, arg2, arg0, arg3, arg4, false, var11.field494);
                    var11.field499 = new class132(var12, 4, (arg1 + 2 & 0x3) + 4, arg2, arg0, arg3, arg4, false, var11.field499);
                }
            }
        }
        if (arg7 == 2) {
            if (arg5 == 11) {
                arg5 = 10;
            }
            class91 var13 = class237.method1594(arg2, arg0, arg3);
            if (var13 != null) {
                var13.field1408 = new class132((int) (var13.field1407 >>> 32) & Integer.MAX_VALUE, arg5, arg1, arg2, arg0, arg3, arg4, false, var13.field1408);
            }
        }
        if (arg7 == 3) {
            class292 var14 = class211.method1470(arg2, arg0, arg3);
            if (var14 != null) {
                var14.field4919 = new class132(Integer.MAX_VALUE & (int) (var14.field4926 >>> 32), 22, arg1, arg2, arg0, arg3, arg4, false, var14.field4919);
            }
        }
    }
}
