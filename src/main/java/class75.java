import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class75 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field991 = 127;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field993 = "glow1:";

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field997 = "cyan:";

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field986 = "Choose Option";

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
    public static boolean field988 = false;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lfh;")
    public static class140 field989;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lfh;")
    public static class140 field995;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[I")
    public static int[] field994;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[Lco;")
    public static class294[] field987;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 14)
    public static final void method544(int arg0, int arg1) {
        field985++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class247.field3605 += arg0 * 128;
        if (class42.field524.length < class247.field3605) {
            class247.field3605 -= class42.field524.length;
            int var3 = (int) (Math.random() * 12.0D);
            class308.method2149(-69, class71.field946[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        int var7 = 0;
        if (arg1 != 824) {
            field996 = 106;
        }
        while (var7 < var6) {
            int var8 = class339.field5303[var4 + var5] - class42.field524[class247.field3605 + var4 & class42.field524.length + -1] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class339.field5303[var4++] = var8;
            var7++;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class339.field5303[var10 + var11] = 255;
                } else {
                    class339.field5303[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg0); var13++) {
            class206.field2872[var13] = class206.field2872[var13 + arg0];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class206.field2872[var14] = (int) (Math.sin((double) class212.field2991 / 14.0D) * 16.0D + Math.sin((double) class212.field2991 / 15.0D) * 14.0D + Math.sin((double) class212.field2991 / 16.0D) * 12.0D);
            class212.field2991++;
        }
        class89.field1118 += arg0;
        int var15 = (arg0 + (class313.field4603 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class89.field1118; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class339.field5303[(var18 << 7) + var17] = 192;
        }
        class89.field1118 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var20 += class339.field5303[var15 + var22 + var21];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class339.field5303[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class64.field809[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class64.field809[var23 + var26 + (var15 * 128)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class64.field809[-(var15 * 128 - var26 - var23) - 128];
                }
                if (var25 >= 0) {
                    class339.field5303[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILjava/lang/String;)I", line = 189)
    public static final int method545(int arg0, int arg1, String arg2) {
        field998++;
        if (arg0 != -22511) {
            method545(100, -72, (String) null);
        }
        return class83.method614(arg1, arg2, 97, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 214)
    public static void method546(int arg0) {
        field987 = null;
        field986 = null;
        field997 = null;
        field994 = null;
        field993 = null;
        field995 = null;
        field989 = null;
        if (arg0 != 212098599) {
            field995 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqc;I)V", line = 232)
    public static final void method547(class331 arg0, int arg1) {
        field992++;
        if (class313.field4603 == arg0.field4846 || arg0.field4899 == -1 || arg0.field4885 != 0 || (arg0.field4940 + 1) > class207.method1516(arg0.field4899, 118).field4627[arg0.field4850]) {
            int var2 = arg0.field4846 - arg0.field4929;
            int var3 = class313.field4603 - arg0.field4929;
            int var4 = arg0.field4853 * 128 + arg0.method1699(-1) * 64;
            int var5 = arg0.field4928 * 128 + (arg0.method1699(~arg1) * 64);
            int var6 = arg0.field4908 * 128 + arg0.method1699(-1) * 64;
            int var7 = arg0.field4920 * 128 + arg0.method1699(~arg1) * 64;
            arg0.field4893 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field4855 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
        }
        if (arg0.field4901 == 0) {
            arg0.field4912 = 1024;
        }
        if (arg0.field4901 == 1) {
            arg0.field4912 = 1536;
        }
        if (arg0.field4901 == 2) {
            arg0.field4912 = 0;
        }
        arg0.field4932 = arg1;
        if (arg0.field4901 == 3) {
            arg0.field4912 = 512;
        }
        arg0.field4926 = arg0.field4912;
    }
}
