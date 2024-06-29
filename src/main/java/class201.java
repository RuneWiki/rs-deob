import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class201 extends class426 {

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "Lwl;")
    public static class452 field3019 = new class452(24, 2);

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "[I")
    public static int[] field3038 = new int[2048];

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
    public static int[] field3035 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Liq;")
    public static class134 field3034;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lik;")
    public class463 field3027;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Ljava/lang/String;")
    public String field3025;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "[I")
    public int[] field3023;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[I")
    public int[] field3033;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[Lcm;")
    public class382[] field3026;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "[Ljava/lang/String;")
    public String[] field3024;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "[S")
    public static short[] field3032;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static final void method1201(int arg0) {
        class15.field179.method1485(-22032);
        if (arg0 != 30541) {
            field3030 = 73;
        }
        field3021++;
        class328.field4924.method1485(-22032);
        class292.field4451.method1485(arg0 ^ 0xFFFFDEBD);
        class443.field6528.method1485(arg0 ^ 0xFFFFDEBD);
        class128.field1633.method1485(-22032);
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field3019 = null;
        field3035 = null;
        field3034 = null;
        field3032 = null;
        field3038 = null;
        if (arg0 < 66) {
            field3019 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLdr;)V")
    public static final void method1203(boolean arg0, class261 arg1) {
        field3031++;
        arg1.method436(0, 0, class221.field3368, 350);
        arg1.method358(0, 0, class221.field3368, 350, class326.field4904 << 24 | 0x332277, 1);
        if (arg0) {
            field3038 = null;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class353.field5221[var2];
            int var14 = class314.field4754[var2];
            arg1.method358(var13, var14, 2, 2, class265.field4049[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class198.field2989;
        if (class57.field760 > 0) {
            int var4 = 346 - class198.field2989 - 4;
            int var5 = var3 * var4 / (var3 + class57.field760 - 1);
            int var6 = 4;
            if (class57.field760 > 1) {
                var6 += (class57.field760 - class319.field4819 - 1) * (var4 - var5) / (class57.field760 - 1);
            }
            arg1.method358(class221.field3368 - 16, var6, 12, var5, class326.field4904 << 24 | 0x332277, 2);
            for (int var7 = class319.field4819; var7 < (class319.field4819 + var3) && var7 < class57.field760; var7++) {
                String[] var8 = class110.method677('\b', class314.field4766[var7], (byte) -119);
                int var9 = (class221.field3368 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg1.method436(var11, 0, var9 + var11 - 8, 350);
                    class380.field5552.method873(var8[var10], 0, 350 - class138.field1868 - (class458.field6795.field4172 + 2) - ((-class319.field4819 + var7) * class198.field2989), -1, -16777216, var11);
                }
            }
        }
        arg1.method436(0, 0, class221.field3368, 350);
        arg1.method1611(class221.field3368, 350 - class138.field1868, arg0, 0, -1);
        class161.field2244.method873("--> " + class271.field4157, 0, 350 - class188.field2828.field4172 - 1, -1, -16777216, 10);
        int var12 = -1;
        if ((class26.field332 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method1622(350 - class188.field2828.field4172 - 11, var12, 12, class188.field2828.method1693(-113, "--> " + class271.field4157.substring(0, class339.field5063)) + 10, !arg0);
    }
}
