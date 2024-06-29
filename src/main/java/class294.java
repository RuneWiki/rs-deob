import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class294 {

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    private int field3901 = -1;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Z")
    private boolean field3904 = true;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[Lbc;")
    private class248[] field3905;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field3888;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[Lbc;")
    private class248[] field3887;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lbc;")
    private class248 field3898;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3897 = 1337;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "F")
    public static float field3893;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lo;")
    private class24 field3891;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 8)
    public final void method1763(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field3905 != null) {
            for (int var2 = 0; var2 < this.field3905.length; var2++) {
                this.field3905[var2].method1539();
            }
        }
        field3896++;
        this.field3891 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1764(int arg0) {
        if (arg0 != 0) {
            method1764(18);
        }
        field3903++;
        if (class525.field7730) {
            class525.field7730 = false;
            class34.field349 = null;
            class337.field4467 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 56)
    public static final void method1765(int arg0, int arg1) {
        class5.field52 = arg1;
        field3892++;
        class136.field1816.method3045(48);
        if (arg0 != 24755) {
            method1769(null, false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILza;)Z", line = 71)
    public final boolean method1766(int arg0, int arg1, class287 arg2) {
        field3902++;
        if (this.field3901 != arg1) {
            this.field3901 = arg1;
            int var4 = class111.method682(-125, arg1);
            if (arg1 < var4) {
                var4 = class525.method3127(arg1, 1617667937);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3895 != var4) {
                this.field3895 = var4;
                this.field3891 = null;
            }
            if (this.field3905 != null) {
                this.field3886 = 0;
                int[] var5 = new int[this.field3905.length];
                for (int var6 = 0; var6 < this.field3905.length; var6++) {
                    class248 var7 = this.field3905[var6];
                    if (var7.method1532(this.field3889, this.field3888, this.field3894, this.field3901)) {
                        var5[this.field3886] = var7.field3283;
                        this.field3887[this.field3886++] = var7;
                    }
                }
                class92.method514(var5, this.field3887, this.field3886 - 1, 1, 0);
            }
            this.field3904 = true;
        }
        if (arg0 <= 35) {
            return true;
        }
        boolean var8 = false;
        if (this.field3904) {
            this.field3904 = false;
            for (int var9 = this.field3886 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3887[var9].method1537(arg2, this.field3898);
                var8 |= var10;
                this.field3904 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIILza;IIBII)V", line = 145)
    public final void method1767(int arg0, int arg1, int arg2, int arg3, class287 arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 != -103) {
            this.field3904 = false;
        }
        int var11 = arg2 + arg3 & 0x3FFF;
        field3890++;
        if (this.field3885 == -1) {
            arg4.method1153(arg9, arg0, arg5, arg6, arg8, 0);
        } else {
            class433 var12 = class190.field2451.method94(this.field3885, (byte) -72);
            if (this.field3891 == null && class190.field2451.method91(this.field3885, arg7 ^ 0x4A2)) {
                int[] var13 = var12.field6311 ? class190.field2451.method90(0.7F, false, false, this.field3885, this.field3895, this.field3895) : class190.field2451.method92(2384, this.field3895, this.field3895, this.field3885, 0.7F, false);
                this.field3891 = arg4.method1218(var13, 0, this.field3895, this.field3895, this.field3895);
            }
            if (!var12.field6311) {
                arg4.method1153(arg9, arg0, arg5, arg6, arg8, 0);
            }
            if (this.field3891 != null) {
                int var14 = var12.field6311 ? 0 : 1;
                int var15 = arg1 * arg6 / -4096;
                int var16;
                for (var16 = arg6 * var11 / 4096 + (arg5 - arg6) / 2; var16 > arg6; var16 -= arg6) {
                }
                while (arg6 < var15) {
                    var15 -= arg6;
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg5; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field3891.method6(arg9 + var17, arg0 + var18, arg6, arg6, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3886 - 1; var19 >= 0; var19--) {
            this.field3887[var19].method1540(arg4, arg9, arg0, arg5, arg6, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILl;BIIILza;)V", line = 223)
    public static final void method1768(int arg0, class16 arg1, byte arg2, int arg3, int arg4, int arg5, class287 arg6) {
        if (class181.field2356 < 100) {
            class395.method2377(arg1, 0, arg6);
        }
        field3900++;
        arg6.method1182(arg0, arg5, arg0 + arg3, arg4 + arg5);
        if (class181.field2356 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg0;
            arg6.method1153(arg0, arg5, arg3, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg5 - var7 - 18;
            arg6.method1157(var8 - 152, var9, 304, 34, class273.field3638[class419.field6083].getRGB(), 0);
            arg6.method1153(var8 - 150, var9 - -2, class181.field2356 * 3, 30, class453.field6785[class419.field6083].getRGB(), 0);
            class79.field976.method1885(-1, 4, class435.field6353[class419.field6083].getRGB(), var8, class125.field1618.method1823(class374.field5072, (byte) -88), var7 + var9);
            return;
        }
        int var10 = class49.field556 - (int) ((float) arg3 / class416.field5998);
        int var11 = (int) ((float) arg4 / class416.field5998) + class163.field2133;
        int var12 = (int) ((float) arg3 / class416.field5998) + class49.field556;
        class139.field1859 = (int) ((float) (arg4 * 2) / class416.field5998);
        class331.field4391 = class49.field556 - (int) ((float) arg3 / class416.field5998);
        class422.field6150 = class163.field2133 - (int) ((float) arg4 / class416.field5998);
        int var13 = -126 % ((60 - arg2) / 32);
        class173.field2222 = (int) ((float) (arg3 * 2) / class416.field5998);
        int var14 = class163.field2133 - ((int) ((float) arg4 / class416.field5998));
        class416.method2573(class416.field6009 + var10, var11 - -class416.field6020, class416.field6009 + var12, class416.field6020 + var14, arg0, arg5, arg0 + arg3, arg5 + 1 - -arg4);
        class416.method2561(arg6);
        class167 var15 = class416.method2569(arg6);
        class10.method69(arg6, false, 0, 0, var15);
        if (class509.field7386 > 0) {
            class53.field615--;
            if (class53.field615 == 0) {
                class53.field615 = 20;
                class509.field7386--;
            }
        }
        if (!class435.field6354) {
            return;
        }
        int var16 = arg0 + arg3 - 5;
        int var17 = arg5 + arg4 - 8;
        class225.field3028.method1877(-127, var16, -1, "Fps:" + class515.field7495, var17, 16776960);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class225.field3028.method1877(-128, var16, -1, "Mem:" + var19 + "k", var21, var20);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I[Lbc;IIII)V", line = 355)
    public class294(int arg0, class248[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3905 = arg1;
        this.field3888 = arg4;
        this.field3894 = arg5;
        this.field3885 = arg0;
        this.field3889 = arg3;
        if (arg1 == null) {
            this.field3887 = null;
            this.field3898 = null;
        } else {
            this.field3887 = new class248[arg1.length];
            this.field3898 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lir;Z)I", line = 315)
    public static final int method1769(class22 arg0, boolean arg1) {
        field3899++;
        class212 var2 = arg0.field220;
        if (var2.field2903 != null) {
            var2 = var2.method1350(class52.field606, -1);
            if (var2 == null) {
                return -1;
            }
        }
        if (!arg1) {
            method1769(null, false);
        }
        int var3 = var2.field2893;
        class306 var4 = arg0.method547((byte) 117);
        if (arg0.field1176) {
            var3 = var2.field2874;
        } else if (arg0.field1216 == var4.field4083 || arg0.field1216 == var4.field4076 || arg0.field1216 == var4.field4100 || arg0.field1216 == var4.field4068) {
            var3 = var2.field2909;
        } else if (arg0.field1216 == var4.field4093 || arg0.field1216 == var4.field4071 || arg0.field1216 == var4.field4056 || arg0.field1216 == var4.field4087) {
            var3 = var2.field2867;
        }
        return var3;
    }
}
