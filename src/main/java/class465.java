import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class465 extends class180 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lcs;")
    public static class351 field6529 = new class351(22, 4);

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field6532 = 0;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "F")
    public static float field6533;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field6527;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field6530;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lfc;")
    public static class343 field6535;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "[I")
    public static int[] field6534;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2741(boolean arg0) {
        field6534 = null;
        if (!arg0) {
            field6529 = null;
            field6535 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfc;Z)V", line = 29)
    public static final void method2742(class343 arg0, boolean arg1) {
        field6535 = arg0;
        field6528++;
        if (!arg1) {
            method2743((String) null, 87);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 44)
    public static final void method2743(String arg0, int arg1) {
        class5.method77(arg0, 0, "", "", false, 0);
        field6531++;
        if (arg1 >= -1) {
            field6534 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lgb;)V", line = 61)
    public static final void method2744(class270 arg0) {
        if (class19.field321 >= 65535) {
            return;
        }
        class488.field6890[class19.field321] = arg0;
        class225.field3191[class19.field321] = false;
        class19.field321++;
        int var1 = arg0.field3743;
        if (arg0.field3732) {
            var1 = 0;
        }
        int var2 = arg0.field3743;
        if (arg0.field3744) {
            var2 = class109.field1542 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field6879 + class411.field5703 - arg0.field6878 >> class259.field3616;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field6879 + arg0.field6878 - class411.field5703 >> class259.field3616;
            if (var6 >= class205.field2946) {
                var6 = class205.field2946 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field3745[var4++];
                int var9 = (var8 >>> 8) + (arg0.field6883 + class411.field5703 - arg0.field6878 >> class259.field3616);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class456.field6299) {
                    var10 = class456.field6299 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class355.field4951[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class355.field4951[var3][var11][var7] = var12 | (long) class19.field321;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class355.field4951[var3][var11][var7] = var12 | (long) class19.field321 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class355.field4951[var3][var11][var7] = var12 | (long) class19.field321 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class355.field4951[var3][var11][var7] = var12 | (long) class19.field321 << 48;
                    }
                }
            }
        }
    }
}
