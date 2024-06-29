import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class253 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3491 = -1;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3493 = -1;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lql;")
    public static class346 field3492 = new class346();

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Ljava/util/Random;")
    public static Random field3495 = new Random();

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Llm;")
    public static class347 field3498;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Lcq;")
    public static class67 field3497;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[[[B")
    public static byte[][][] field3494;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILwd;)V", line = 9)
    public static final void method1547(int arg0, class36 arg1) {
        if (arg0 != 23912) {
            method1547(107, (class36) null);
        }
        field3489++;
        class350 var2 = null;
        try {
            class429 var3 = arg1.method266((byte) 44);
            while (var3.field6308 == 0) {
                class144.method918(1L, true);
            }
            if (var3.field6308 == 1) {
                var2 = (class350) var3.field6309;
                class228 var4 = class63.method438(-16777216);
                var2.method2306(false, var4.field3040, var4.field3029, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2304(-17644);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILfp;Lii;BLni;I)Z", line = 66)
    public static final boolean method1548(int arg0, class7 arg1, class405 arg2, byte arg3, class246 arg4, int arg5) {
        field3490++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg3 >= -127) {
            field3496 = -72;
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field130 != null) {
            var9 = class293.field4201 - ((arg1.field117 + arg4.field3327 - class293.field4189) * (class293.field4201 - class293.field4190) / (class293.field4187 - class293.field4189));
            var6 = (arg1.field111 + arg4.field3317 - class293.field4206) * (class293.field4200 - class293.field4202) / (class293.field4196 - class293.field4206) + class293.field4202;
            var8 = class293.field4201 - ((arg1.field122 + arg4.field3327 - class293.field4189) * (class293.field4201 - class293.field4190) / (class293.field4187 - class293.field4189));
            var7 = class293.field4202 + ((arg1.field114 + arg4.field3317 - class293.field4206) * (class293.field4200 - class293.field4202) / (class293.field4196 - class293.field4206));
        }
        class67 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field98 != -1) {
            if (arg4.field3320 && arg1.field135 != -1) {
                var10 = arg1.method60(true, arg2, true);
            } else {
                var10 = arg1.method60(false, arg2, true);
            }
            if (var10 != null) {
                var11 = arg4.field3321 - (var10.method411() + 1 >> 1);
                var12 = arg4.field3321 + (var10.method411() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg4.field3326 - (var10.method409() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field3326 + (var10.method409() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class427 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field113 != null) {
            var15 = class104.method693(arg1.field129, true);
            if (var15 != null) {
                var16 = class410.field6062.method2128(class246.field3316, arg1.field113, (int[]) null, (class67[]) null, (byte) -83);
                int var23 = arg4.field3326;
                if (var10 == null) {
                    var17 = var23 - var15.method2711() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method409() >> 1) + var15.method2714() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class246.field3316[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2715(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg5 + arg4.field3321 - (var18 / 2);
                var20 = var18 / 2 + (arg4.field3321 + arg5);
                if (var19 < var6) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = var17 + arg0;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg0 + var15.method2714() * var16 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class293.field4202 || var6 > class293.field4200 || var9 < class293.field4190 || var8 > class293.field4201) {
            return true;
        }
        if (arg1.field130 != null) {
            int[] var27 = new int[arg1.field130.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg1.field130[var28 * 2] + arg4.field3317;
                int var31 = arg1.field130[var28 * 2 + 1] + arg4.field3327;
                var27[var28 * 2] = (var30 - class293.field4206) * (class293.field4200 - class293.field4202) / (class293.field4196 - class293.field4206) + class293.field4202;
                var27[var28 * 2 + 1] = class293.field4201 - ((class293.field4201 - class293.field4190) * (var31 - class293.field4189) / (class293.field4187 - class293.field4189));
            }
            class170.method1046(arg2, var27, arg1.field128);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method2614(var27[(var29 + 1) * 2], var27[var29 * 2 + 1], var27[var29 * 2], var27[var29 * 2 + 1 + 2], arg1.field115, false);
            }
            arg2.method2614(var27[0], var27[var27.length - 1], var27[var27.length - 2], var27[1], arg1.field115, false);
        }
        if (var10 != null) {
            if (class449.field6577 > 0 && (class319.field4665 != -1 && class319.field4665 == arg4.field3323 || class372.field5415 != -1 && class372.field5415 == arg1.field100)) {
                int var32;
                if (class249.field3365 <= 50) {
                    var32 = class249.field3365 * 2;
                } else {
                    var32 = 200 - (class249.field3365 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method2608(arg4.field3326, true, var10.method408() / 2 + 7, arg4.field3321, var33);
                arg2.method2608(arg4.field3326, true, var10.method408() / 2 + 5, arg4.field3321, var33);
                arg2.method2608(arg4.field3326, true, var10.method408() / 2 + 3, arg4.field3321, var33);
                arg2.method2608(arg4.field3326, true, var10.method408() / 2 + 1, arg4.field3321, var33);
                arg2.method2608(arg4.field3326, true, var10.method408() / 2, arg4.field3321, var33);
            }
            var10.method454(arg4.field3321 - (var10.method411() >> 1), arg4.field3326 + -(var10.method409() >> 1));
        }
        if (arg1.field113 != null && var15 != null) {
            class196.method1169(var15, -1, arg2, var18, arg4, arg1, var17, var16);
        }
        if (arg1.field98 != -1 || arg1.field113 != null) {
            class144 var34 = new class144(arg4);
            var34.field1960 = var11;
            var34.field1965 = var14;
            var34.field1971 = var19;
            var34.field1968 = var20;
            var34.field1958 = var13;
            var34.field1961 = var12;
            var34.field1970 = var21;
            var34.field1966 = var22;
            class56.field747.method330(var34, -2130841184);
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 282)
    public static void method1549(int arg0) {
        field3497 = null;
        field3492 = null;
        field3495 = null;
        field3498 = null;
        if (arg0 != -12704) {
            field3497 = null;
        }
        field3494 = null;
    }
}
