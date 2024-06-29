import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class66 {

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    private int field1040 = 32;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "J")
    private long field1031 = class300.method2048((byte) 18);

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private int field1059 = 0;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "J")
    private long field1054 = 0L;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    private int field1055 = 0;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "J")
    private long field1062 = 0L;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    private int field1056 = 0;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    private int field1057 = 0;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Z")
    private boolean field1064 = true;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "[Lcb;")
    private class85[] field1065 = new class85[8];

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[Lcb;")
    private class85[] field1063 = new class85[8];

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lbd;")
    public static class162 field1032 = class17.method142(0, ":duelstake:");

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lbd;")
    public static class162 field1047 = class17.method142(0, "overlay2");

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "J")
    public static long field1048 = 0L;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lai;")
    public static class258 field1052;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lcb;")
    private class85 field1053;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public int[] field1037;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 4)
    private final void method457(int arg0, int arg1) {
        this.field1056 -= arg1;
        if (arg0 > -86) {
            this.method462((int[]) null, 37);
        }
        if (this.field1056 < 0) {
            this.field1056 = 0;
        }
        field1039++;
        if (this.field1053 != null) {
            this.field1053.method455(arg1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 29)
    public final void method458(byte arg0) {
        this.field1064 = true;
        field1049++;
        if (arg0 != -74) {
            this.field1054 = 124L;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 40)
    public final synchronized void method459(int arg0) {
        field1044++;
        if (this.field1037 == null) {
            return;
        }
        long var2 = class300.method2048((byte) 18);
        try {
            if (this.field1062 != 0L) {
                if (this.field1062 > var2) {
                    return;
                }
                this.method474(this.field1061);
                this.field1064 = true;
                this.field1062 = 0L;
            }
            int var4 = this.method467();
            if (this.field1057 < this.field1059 - var4) {
                this.field1057 = this.field1059 - var4;
            }
            int var5 = this.field1060 + this.field1058;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1061 < (var5 + 256)) {
                var4 = 0;
                this.field1061 += 1024;
                if (this.field1061 > 16384) {
                    this.field1061 = 16384;
                }
                this.method461();
                this.method474(this.field1061);
                this.field1064 = true;
                if (this.field1061 < var5 + 256) {
                    var5 = this.field1061 - 256;
                    this.field1058 = var5 - this.field1060;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method462(this.field1037, 256);
                this.method470();
            }
            if (var2 > this.field1054) {
                if (this.field1064) {
                    this.field1064 = false;
                } else if (this.field1057 == 0 && this.field1055 == 0) {
                    this.method461();
                    this.field1062 = var2 + 2000L;
                    return;
                } else {
                    this.field1058 = Math.min(this.field1055, this.field1057);
                    this.field1055 = this.field1057;
                }
                this.field1057 = 0;
                this.field1054 = var2 + 2000L;
            }
            this.field1059 = var4;
        } catch (Exception var9) {
            this.method461();
            this.field1062 = var2 + 2000L;
        }
        try {
            if (arg0 != 28968) {
                return;
            }
            if (var2 > this.field1031 + 500000L) {
                var2 = this.field1031;
            }
            while (this.field1031 + 5000L < var2) {
                this.method457(-123, 256);
                this.field1031 += (long) (256000 / class306.field5146);
            }
        } catch (Exception var8) {
            this.field1031 = var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 156)
    public static void method460(int arg0) {
        field1047 = null;
        field1032 = null;
        field1052 = null;
        if (arg0 != 4) {
            method460(-107);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 171)
    public void method461() {
        field1030++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([II)V", line = 181)
    private final void method462(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class15.field233) {
            var3 = arg1 << 1;
        }
        class161.method1236(arg0, 0, var3);
        this.field1056 -= arg1;
        if (this.field1053 != null && this.field1056 <= 0) {
            this.field1056 += class306.field5146 >> 4;
            class284.method1965(this.field1053, (byte) -122);
            this.method469(false, this.field1053, this.field1053.method539());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class85 var10 = null;
                        class85 var11 = this.field1065[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class281 var12 = var11.field1520;
                                if (var12 == null || var12.field4789 <= var8) {
                                    var11.field1521 = true;
                                    int var13 = var11.method447();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4789 += var13;
                                    }
                                    if (var4 >= this.field1040) {
                                        break label105;
                                    }
                                    class85 var14 = var11.method453();
                                    if (var14 != null) {
                                        int var15 = var11.field1519;
                                        while (var14 != null) {
                                            this.method469(false, var14, var15 * var14.method539() >> 8);
                                            var14 = var11.method452();
                                        }
                                    }
                                    class85 var16 = var11.field1522;
                                    var11.field1522 = null;
                                    if (var10 == null) {
                                        this.field1065[var7] = var16;
                                    } else {
                                        var10.field1522 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1063[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1522;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class85 var18 = this.field1065[var17];
                this.field1065[var17] = this.field1063[var17] = null;
                while (var18 != null) {
                    class85 var19 = var18.field1522;
                    var18.field1522 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1056 < 0) {
            this.field1056 = 0;
        }
        if (this.field1053 != null) {
            this.field1053.method445(arg0, 0, arg1);
        }
        this.field1031 = class300.method2048((byte) 18);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 341)
    public void method463(Component arg0) throws Exception {
        field1033++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILcb;)V", line = 349)
    public final synchronized void method464(int arg0, class85 arg1) {
        field1034++;
        this.field1053 = arg1;
        if (arg0 != 0) {
            field1032 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 360)
    public final synchronized void method465(int arg0) {
        if (arg0 != -1) {
            method472((byte) -42, 64);
        }
        if (class136.field2422 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class136.field2422.field3222[var3] == this) {
                    class136.field2422.field3222[var3] = null;
                }
                if (class136.field2422.field3222[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class136.field2422.field3224 = true;
                while (class136.field2422.field3218) {
                    class177.method1342(50L, 1);
                }
                class136.field2422 = null;
            }
        }
        field1038++;
        this.method461();
        this.field1037 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 411)
    public final synchronized void method466(byte arg0) {
        this.field1064 = true;
        try {
            this.method471();
        } catch (Exception var3) {
            this.method461();
            this.field1062 = class300.method2048((byte) 18) + 2000L;
        }
        field1046++;
        if (arg0 != -94) {
            this.field1055 = -79;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()I", line = 430)
    public int method467() throws Exception {
        field1050++;
        return this.field1061;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([I[[FLr;Laa;I[[II[[FBI[[F)V", line = 439)
    public static final void method468(int[] arg0, float[][] arg1, class130 arg2, class196 arg3, int arg4, int[][] arg5, int arg6, float[][] arg7, byte arg8, int arg9, float[][] arg10) {
        int[] var11 = new int[arg0.length / 2];
        if (arg8 != 115) {
            field1052 = (class258) null;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg0[var12 + var12];
            int var14 = arg0[var12 + var12 + 1];
            if (arg4 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg4 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg4 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg10[arg9][arg6];
                var18 = arg1[arg9][arg6];
                var19 = arg7[arg9][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg10[arg9 + 1][arg6];
                var19 = arg7[arg9 + 1][arg6];
                var18 = arg1[arg9 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg7[arg9 + 1][arg6 + 1];
                var17 = arg10[arg9 + 1][arg6 + 1];
                var18 = arg1[arg9 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg1[arg9][arg6 + 1];
                var19 = arg7[arg9][arg6 + 1];
                var17 = arg10[arg9][arg6 + 1];
            } else {
                float var20 = arg7[arg9][arg6];
                float var21 = arg1[arg9][arg6];
                float var22 = arg10[arg9][arg6];
                float var23 = (float) var14 / 128.0F;
                float var24 = (float) var13 / 128.0F;
                float var25 = (arg1[arg9 + 1][arg6] - var21) * var24 + var21;
                float var26 = (arg10[arg9 + 1][arg6] - var22) * var24 + var22;
                float var27 = arg7[arg9][arg6 + 1];
                float var28 = (arg7[arg9 + 1][arg6] - var20) * var24 + var20;
                float var29 = arg1[arg9][arg6 + 1];
                float var30 = (arg1[arg9 + 1][arg6 + 1] - var29) * var24 + var29;
                float var31 = (arg7[arg9 + 1][arg6 + 1] - var27) * var24 + var27;
                var19 = (var31 - var28) * var23 + var28;
                var18 = (var30 - var25) * var23 + var25;
                float var32 = arg10[arg9][arg6 + 1];
                float var33 = (arg10[arg9 + 1][arg6 + 1] - var32) * var24 + var32;
                var17 = (var33 - var26) * var23 + var26;
            }
            int var34 = (arg6 << 7) + var14;
            int var35 = (arg9 << 7) + var13;
            int var36 = class90.method680(arg9, arg6, var13, var14, arg5, -106);
            var11[var12] = arg2.method1044(arg3, var35, var36, var34, var19, var18, var17);
        }
        arg2.method1043(var11);
        field1036++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLcb;I)V", line = 557)
    private final void method469(boolean arg0, class85 arg1, int arg2) {
        int var4 = arg2 >> 5;
        class85 var5 = this.field1063[var4];
        field1041++;
        if (var5 == null) {
            this.field1065[var4] = arg1;
        } else {
            var5.field1522 = arg1;
        }
        this.field1063[var4] = arg1;
        if (!arg0) {
            arg1.field1519 = arg2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 598)
    public void method470() throws Exception {
        field1042++;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V", line = 605)
    public void method471() throws Exception {
        field1045++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V", line = 613)
    public static final void method472(byte arg0, int arg1) {
        class229.field3807.method1538(arg1, (byte) -20);
        field1043++;
        if (arg0 < 47) {
            method472((byte) 106, 42);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 636)
    public static final void method473(int arg0) {
        class288.field4850.method1529(false);
        field1051++;
        if (arg0 != 13690) {
            method468((int[]) null, (float[][]) ((float[][]) null), (class130) null, (class196) null, 82, (int[][]) ((int[][]) null), -35, (float[][]) ((float[][]) null), (byte) 55, 95, (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 648)
    public void method474(int arg0) throws Exception {
        field1035++;
    }
}
