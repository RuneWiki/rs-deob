import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class284 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Z")
    public boolean field3704 = false;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public int field3708 = 443;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field3707 = 43594;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3703 = "";

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lvt;")
    public static class344 field3705 = new class344("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Ljava/lang/String;")
    public String field3700;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
    public final int method1763(int arg0) {
        if (arg0 == 16311) {
            field3706++;
            return this.field3704 ? this.field3708 : this.field3707;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1764(String arg0, int arg1) {
        field3701++;
        if (arg0 == null || arg1 < 69) {
            return;
        }
        if (!(class447.field6284 < 200 || class505.field7032) || class447.field6284 >= 200) {
            class534.method2970(class485.field6769.method2157(class245.field3103, 4074), (byte) -128);
            String var2 = class358.field4999.method2157(class245.field3103, 4074);
            if (var2 != null) {
                class534.method2970(var2, (byte) -116);
            }
            return;
        }
        String var3 = class22.method125(90, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class447.field6284; var4++) {
            String var8 = class22.method125(28, class395.field5457[var4]);
            if (var8 != null && var8.equals(var3)) {
                class534.method2970(arg0 + class642.field9325.method2157(class245.field3103, 4074), (byte) -71);
                return;
            }
            if (class71.field964[var4] != null) {
                String var9 = class22.method125(110, class71.field964[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class534.method2970(arg0 + class642.field9325.method2157(class245.field3103, 4074), (byte) -41);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class466.field6613; var5++) {
            String var6 = class22.method125(68, class546.field7616[var5]);
            if (var6 != null && var6.equals(var3)) {
                class534.method2970(class424.field5741.method2157(class245.field3103, 4074) + arg0 + class248.field3115.method2157(class245.field3103, 4074), (byte) -51);
                return;
            }
            if (class282.field3694[var5] != null) {
                String var7 = class22.method125(91, class282.field3694[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class534.method2970(class424.field5741.method2157(class245.field3103, 4074) + arg0 + class248.field3115.method2157(class245.field3103, 4074), (byte) -22);
                    return;
                }
            }
        }
        if (class22.method125(45, class147.field1899.field257).equals(var3)) {
            class534.method2970(class67.field893.method2157(class245.field3103, 4074), (byte) -36);
        } else {
            class118.method650(true, class209.field2711);
            class486.field6782++;
            class272.field3457.method3060(class194.method1241(arg0, -121), -25098);
            class272.field3457.method3040(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method1765(int arg0) {
        field3705 = null;
        field3703 = null;
        if (arg0 != 128) {
            field3703 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lac;I)Z")
    public final boolean method1766(class284 arg0, int arg1) {
        if (arg1 != -279) {
            this.method1766(null, 9);
        }
        field3709++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field3702 == arg0.field3702 && this.field3700.equals(arg0.field3700);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg5 && arg3 == arg8 && arg7 == arg9 && arg0 == arg2) {
            class536.method2987(arg1, arg9, arg4, true, arg0, arg3);
        } else {
            int var10 = arg4;
            int var11 = arg3;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg5 * 3;
            int var15 = arg8 * 3;
            int var16 = arg7 * 3;
            int var17 = arg2 * 3;
            int var18 = arg9 + var14 - arg4 - var16;
            int var19 = var15 + arg0 - var17 - arg3;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - (-var29 - var31) >> 12) + arg4;
                int var34 = arg3 + (var28 + var32 + var30 >> 12);
                class536.method2987(arg1, var33, var10, true, var34, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        field3710++;
        if (arg6 > -96) {
            method1765(19);
        }
    }
}
