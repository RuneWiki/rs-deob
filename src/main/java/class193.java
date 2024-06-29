import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class193 extends class196 {

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    private int field3248 = -1;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "Ldf;")
    public static class51 field3234 = class46.method233("<img=0>", 100);

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "[I")
    public static int[] field3242 = new int[32768];

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "[I")
    public static int[] field3239 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "Z")
    public static boolean field3244 = true;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "[I")
    private int[] field3246;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field3237;
        if (arg0 == 0) {
            this.field3248 = arg1.method876(false);
        }
        if (arg2 != 82) {
            method1371(93, -17, (byte[]) null, -12, -82, false, 70, (class170[]) null, 55, -5, -9);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BIIZI[Lkf;III)V")
    public static final void method1371(int arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5, int arg6, class170[] arg7, int arg8, int arg9, int arg10) {
        if (arg8 <= 4) {
            field3234 = null;
        }
        ++field3232;
        class121 var11 = new class121(arg2);
        int var12 = -1;
        while (true) {
            int var13 = var11.method907(125);
            if (~var13 == -1) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method877((byte) -112);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 63;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 63;
                int var19 = var11.method897(121);
                int var20 = 3 & var19;
                int var21 = var19 >> 2;
                if (arg10 == var17 && arg9 <= var18 && arg9 + 8 > var18 && ~arg4 >= ~var16 && ~(arg4 + 8) < ~var16) {
                    class108 var22 = class41.method210(var12, (byte) 75);
                    int var23 = class53.method342(var20, 2, var22.field1824, 7 & var18, 7 & var16, arg0, var22.field1807) + arg3;
                    int var24 = arg1 + class28.method145(var22.field1807, (byte) -126, var22.field1824, var18 & 7, arg0, var20, 7 & var16);
                    if (~var23 < -1 && var24 > 0 && ~var23 > -104 && var24 < 103) {
                        class170 var25 = null;
                        if (!arg5) {
                            int var26 = arg6;
                            if (~(2 & class160.field2626[1][var23][var24]) == -3) {
                                var26 = arg6 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg7[var26];
                            }
                        }
                        class188.method1341(var25, arg6, 0, var21, var12, !arg5, var24, arg5, arg0 + var20 & 3, var23, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)I")
    public final int method1372(byte arg0) {
        ++field3240;
        if (arg0 > -92) {
            method1376(-37, -47, -41, 73, 60);
        }
        return this.field3248;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1373(int arg0, int arg1, Random arg2) {
        ++field3235;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class46.method234(arg1, (byte) 43)) {
            return (int) (((long) arg2.nextInt() & 4294967295L) * (long) arg1 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return arg0 != -1634280864 ? 113 : class47.method240((byte) 99, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)Z")
    private final boolean method1374(int arg0) {
        if (arg0 >= -75) {
            return false;
        } else {
            ++field3230;
            if (this.field3246 != null) {
                return true;
            } else if (this.field3248 >= 0) {
                int var2 = class49.field767;
                int var3 = class234.field4079;
                int var4 = class240.field4166.method467(0, this.field3248) ? 64 : 128;
                this.field3246 = class240.field4166.method466(126, this.field3248);
                this.field3233 = var4;
                this.field3243 = var4;
                class172.method1209(var3, var2, -115);
                return this.field3246 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
    public static void method1375(byte arg0) {
        if (arg0 > 20) {
            field3234 = null;
            field3239 = null;
            field3242 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final void method1177(int arg0) {
        ++field3238;
        super.method1177(-128);
        this.field3246 = null;
        if (arg0 > -126) {
            field3244 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field3231;
        if (arg0 != 11) {
            method1371(-97, 107, (byte[]) null, 45, 9, false, 81, (class170[]) null, 110, -24, -122);
        }
        int[][] var3 = super.field3285.method1548(arg1, (byte) -108);
        if (super.field3285.field3963 && this.method1374(-128)) {
            int var4 = (class234.field4079 == this.field3243 ? arg1 : this.field3243 * arg1 / class234.field4079) * this.field3233;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class49.field767 != ~this.field3233) {
                for (int var8 = 0; class49.field767 > var8; ++var8) {
                    int var9 = this.field3233 * var8 / class49.field767;
                    int var10 = this.field3246[var4 - -var9];
                    var7[var8] = class191.method1366(var10, 255) << 4;
                    var6[var8] = class191.method1366(var10 >> 4, 4080);
                    var5[var8] = class191.method1366(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class49.field767; ++var11) {
                    int var12 = this.field3246[var4++];
                    var7[var11] = class191.method1366(var12, 255) << 4;
                    var6[var11] = class191.method1366(var12 >> 4, 4080);
                    var5[var11] = class191.method1366(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        ++field3245;
        int var6 = -120 / ((-75 - arg1) / 33);
        int var7 = -1;
        int var8 = -arg4;
        int var9 = arg4;
        int var10 = class149.method1074(119, class115.field1954, class28.field408, arg3 + arg4);
        int var11 = class149.method1074(112, class115.field1954, class28.field408, arg3 - arg4);
        class242.method1660((byte) -79, class80.field1324[arg2], arg0, var10, var11);
        while (var5 < var9) {
            var7 += 2;
            var8 += var7;
            if (~var8 < -1) {
                --var9;
                var8 -= var9 << 1;
                int var12 = arg2 - -var9;
                int var13 = -var9 + arg2;
                if (var12 >= class36.field542 && class175.field2867 >= var13) {
                    int var14 = class149.method1074(-40, class115.field1954, class28.field408, arg3 + var5);
                    int var15 = class149.method1074(-58, class115.field1954, class28.field408, arg3 - var5);
                    if (~var12 >= ~class175.field2867) {
                        class242.method1660((byte) -79, class80.field1324[var12], arg0, var14, var15);
                    }
                    if (var13 >= class36.field542) {
                        class242.method1660((byte) -79, class80.field1324[var13], arg0, var14, var15);
                    }
                }
            }
            ++var5;
            int var16 = -var5 + arg2;
            int var17 = arg2 + var5;
            if (var17 >= class36.field542 && ~class175.field2867 <= ~var16) {
                int var18 = class149.method1074(114, class115.field1954, class28.field408, arg3 + var9);
                int var19 = class149.method1074(104, class115.field1954, class28.field408, arg3 - var9);
                if (var17 <= class175.field2867) {
                    class242.method1660((byte) -79, class80.field1324[var17], arg0, var18, var19);
                }
                if (var16 >= class36.field542) {
                    class242.method1660((byte) -79, class80.field1324[var16], arg0, var18, var19);
                }
            }
        }
    }
}
