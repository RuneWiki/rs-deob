import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class146 extends Exception {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lsa;)V")
    public static final void method1339(class214 arg0) {
        class239.field3687 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Laba;Z)Z")
    public static final boolean method1340(class185 arg0, boolean arg1) {
        boolean var2 = class757.field11125 == class740.field10902;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method811(-19900);
        if (arg0.field2945 < 0 || arg0.field2946 < 0 || arg0.field2940 >= class150.field2096 || arg0.field2939 >= class117.field1705) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field2945; var7 <= arg0.field2940; var7++) {
            for (int var11 = arg0.field2946; var11 <= arg0.field2939; var11++) {
                class290 var12 = class438.method3442(arg0.field9975, var7, var11);
                if (var12 != null) {
                    class135 var13 = class229.method2003(arg0, 115);
                    class135 var14 = var12.field4670;
                    if (var14 == null) {
                        var12.field4670 = var13;
                    } else {
                        while (var14.field1912 != null) {
                            var14 = var14.field1912;
                        }
                        var14.field1912 = var13;
                    }
                    if (var2 && (class192.field3020[var7][var11] & 0xFF000000) != 0) {
                        var3 = class192.field3020[var7][var11];
                        var4 = class148.field2073[var7][var11];
                        var5 = class54.field691[var7][var11];
                    }
                    if (!arg1 && var12.field4677 != null && var12.field4677.field7592 > var6) {
                        var6 = var12.field4677.field7592;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field2945; var8 <= arg0.field2940; var8++) {
                for (int var9 = arg0.field2946; var9 <= arg0.field2939; var9++) {
                    if ((class192.field3020[var8][var9] & 0xFF000000) == 0) {
                        class192.field3020[var8][var9] = var3;
                        class148.field2073[var8][var9] = var4;
                        class54.field691[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class213.field3363[class251.field3843++] = arg0;
        } else {
            int var10 = class757.field11125 == class740.field10902 ? 1 : 0;
            if (!arg0.method41((byte) 110)) {
                arg0.field9987 = class570.field8262[var10];
                class570.field8262[var10] = arg0;
            } else if (arg0.method45(-32768)) {
                arg0.field9987 = class50.field608[var10];
                class50.field608[var10] = arg0;
            } else {
                arg0.field9987 = class42.field476[var10];
                class42.field476[var10] = arg0;
                class540.field7961 = true;
            }
        }
        if (arg1) {
            arg0.field9972 -= var6;
        }
        return true;
    }
}
