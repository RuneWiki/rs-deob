import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class256 extends class75 {

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field4093 = -1;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "Ljava/lang/String;")
    public static String field4099 = "flash3:";

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "Z")
    public static boolean field4096 = false;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "[I")
    public static int[] field4097;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/util/Random;BI)I")
    public static final int method1680(Random arg0, byte arg1, int arg2) {
        ++field4094;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class205.method1373((byte) 72, arg2)) {
            return (int) ((long) arg2 * (4294967295L & (long) arg0.nextInt()) >> 32);
        } else {
            int var3 = -61 / ((61 - arg1) / 35);
            int var4 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var5 >= var4);
            return class283.method1896(arg2, true, var5);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lbj;IIIIIIZ)V")
    public static final void method1681(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field579.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field579[var9] - class209.field3435;
            int var23 = arg0.field581[var9] - class243.field3896;
            int var24 = arg0.field574[var9] - class30.field365;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field569 != null) {
                class47.field566[var9] = var25;
                class47.field585[var9] = var28;
                class47.field577[var9] = var29;
            }
            class47.field570[var9] = (var25 << 9) / var29 + class145.field2340;
            class47.field578[var9] = (var28 << 9) / var29 + class145.field2336;
        }
        class145.field2345 = 0;
        int var10 = arg0.field568.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field568[var11];
            int var13 = arg0.field575[var11];
            int var14 = arg0.field580[var11];
            int var15 = class47.field570[var12];
            int var16 = class47.field570[var13];
            int var17 = class47.field570[var14];
            int var18 = class47.field578[var12];
            int var19 = class47.field578[var13];
            int var20 = class47.field578[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class267.field4341 && class144.method976(class145.field2340 + class108.field1870, class205.field3285 + class145.field2336, var18, var19, var20, var15, var16, var17)) {
                    class74.field1015 = arg5;
                    class8.field124 = arg6;
                }
                if (!arg7) {
                    class145.field2342 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class145.field2349 || var16 > class145.field2349 || var17 > class145.field2349) {
                        class145.field2342 = true;
                    }
                    if (arg0.field569 != null && arg0.field569[var11] != -1) {
                        if (class9.field138) {
                            if (arg0.field572) {
                                class145.method996(var18, var19, var20, var15, var16, var17, arg0.field583[var11], arg0.field567[var11], arg0.field584[var11], class47.field566[0], class47.field566[1], class47.field566[3], class47.field585[0], class47.field585[1], class47.field585[3], class47.field577[0], class47.field577[1], class47.field577[3], arg0.field569[var11]);
                            } else {
                                class145.method996(var18, var19, var20, var15, var16, var17, arg0.field583[var11], arg0.field567[var11], arg0.field584[var11], class47.field566[var12], class47.field566[var13], class47.field566[var14], class47.field585[var12], class47.field585[var13], class47.field585[var14], class47.field577[var12], class47.field577[var13], class47.field577[var14], arg0.field569[var11]);
                            }
                        } else {
                            int var21 = class145.field2350.method310(64, arg0.field569[var11]);
                            class145.method978(var18, var19, var20, var15, var16, var17, class20.method137(var21, arg0.field583[var11]), class20.method137(var21, arg0.field567[var11]), class20.method137(var21, arg0.field584[var11]));
                        }
                    } else if (arg0.field583[var11] != 12345678) {
                        class145.method978(var18, var19, var20, var15, var16, var17, arg0.field583[var11], arg0.field567[var11], arg0.field584[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V")
    public static final void method1682(int arg0, boolean arg1) {
        class79.field1092.method1832(arg0, (byte) 70);
        class196.field3166.method1832(arg0, (byte) 115);
        ++field4092;
        if (!arg1) {
            field4093 = -92;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        field4097 = null;
        int var1 = -48 % ((arg0 - 50) / 43);
        field4099 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIILli;IJ)Z")
    public static final boolean method1684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class197 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class258.method1695(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field4093 = 66;
        }
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954 && this.method567(-1)) {
            int[] var4 = var3[0];
            int var5 = arg1 % super.field1021 * super.field1021;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; class186.field2986 > var8; ++var8) {
                int var9 = super.field1020[var8 % super.field1018 + var5];
                var6[var8] = class204.method1369(4080, var9 << 4);
                var7[var8] = class204.method1369(65280, var9) >> 4;
                var4[var8] = class204.method1369(16711680, var9) >> 12;
            }
        }
        ++field4098;
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZ)Lch;")
    public static final class125 method1685(int arg0, int arg1, boolean arg2) {
        ++field4091;
        for (class125 var3 = (class125) class102.field1538.method465((byte) -117); var3 != null; var3 = (class125) class102.field1538.method461((byte) -13)) {
            if (var3.field2077 && var3.method867(arg1, (byte) -118, arg0)) {
                return var3;
            }
        }
        if (arg2) {
            field4096 = true;
        }
        return null;
    }
}
