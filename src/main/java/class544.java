import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public abstract class class544 {

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8135 = new String[] { method4113(method4112("NpDZS")), method4113(method4112("NpDVS")), method4113(method4112("NpDUS")), method4113(method4112("NpD[S")), method4113(method4112("NpDPS")) };

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field8130 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Lvaa;")
    public static class494 field8132 = new class494(9, 2);

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "[J")
    public static long[] field8134;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I", line = 4)
    public static int method4107(int arg0, int arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8135[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V", line = 11)
    public static void method4108(byte arg0) {
        try {
            field8132 = null;
            if (arg0 == -69) {
                field8134 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8135[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method4109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field8131++;
            int var5 = arg2;
            int var6 = arg4;
            int var7 = -arg4;
            int var8 = -1;
            int var9 = class541.method4089(class200.field3119, class676.field9797, arg0 + arg4, 18286);
            int var10 = class541.method4089(class200.field3119, class676.field9797, arg0 - arg4, 18286);
            class319.method2702(class243.field3731[arg1], var10, var9, true, arg3);
            while (var5 < var6) {
                var8 += 2;
                var7 += var8;
                if (var7 > 0) {
                    var6--;
                    var7 -= var6 << 1;
                    int var11 = arg1 - var6;
                    int var12 = arg1 + var6;
                    if (var12 >= class676.field9807 && var11 <= class381.field5786) {
                        int var13 = class541.method4089(class200.field3119, class676.field9797, arg0 + var5, 18286);
                        int var14 = class541.method4089(class200.field3119, class676.field9797, arg0 - var5, 18286);
                        if (var12 <= class381.field5786) {
                            class319.method2702(class243.field3731[var12], var14, var13, true, arg3);
                        }
                        if (class676.field9807 <= var11) {
                            class319.method2702(class243.field3731[var11], var14, var13, true, arg3);
                        }
                    }
                }
                var5++;
                int var15 = arg1 - var5;
                int var16 = arg1 + var5;
                if (var16 >= class676.field9807 && var15 <= class381.field5786) {
                    int var17 = class541.method4089(class200.field3119, class676.field9797, arg0 + var6, 18286);
                    int var18 = class541.method4089(class200.field3119, class676.field9797, arg0 - var6, arg2 ^ 0x476E);
                    if (class381.field5786 >= var16) {
                        class319.method2702(class243.field3731[var16], var18, var17, true, arg3);
                    }
                    if (var15 >= class676.field9807) {
                        class319.method2702(class243.field3731[var15], var18, var17, true, arg3);
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field8135[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)[Leh;", line = 111)
    public static final class379[] method4110(int arg0) {
        try {
            field8129++;
            if (arg0 > -115) {
                field8130 = 37;
            }
            return new class379[] { class85.field950, class553.field8237, class68.field728 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8135[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)Z", line = 123)
    public static final boolean method4111(int arg0, boolean arg1) {
        try {
            field8133++;
            if (!arg1) {
                field8134 = null;
            }
            return arg0 == 3 || arg0 == 5 || arg0 == 6;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8135[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)V")
    public abstract void method94(byte arg0);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method89(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public abstract void method96(byte arg0);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lks;")
    public abstract class462 method97(int arg0);

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4112(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4113(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
