import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class251 extends class69 {

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZLvl;)V", line = 3)
    public static final void method1542(boolean arg0, class13 arg1) {
        field3214++;
        boolean var2 = arg0;
        if (class463.field6224 == arg1.field176 || arg1.field153 == -1 || arg1.field171 != 0) {
            var2 = true;
        } else {
            class56 var3 = class66.field941.method1299((byte) -92, arg1.field153);
            if (var3.field777 || var3.field773[arg1.field198] < (arg1.field202 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field176 - arg1.field238;
            int var5 = class463.field6224 - arg1.field238;
            int var6 = arg1.field185 * 512 + arg1.method82((byte) 49) * 256;
            int var7 = arg1.field154 * 512 + arg1.method82((byte) 49) * 256;
            int var8 = arg1.field162 * 512 + (arg1.method82((byte) 49) * 256);
            int var9 = arg1.field240 * 512 + (arg1.method82((byte) 49) * 256);
            arg1.field5801 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field5797 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field268 = 0;
        if (arg1.field164 == 0) {
            arg1.method86(-7554, false, 8192);
        }
        if (arg1.field164 == 1) {
            arg1.method86(-7554, false, 12288);
        }
        if (arg1.field164 == 2) {
            arg1.method86(-7554, false, 0);
        }
        if (arg1.field164 == 3) {
            arg1.method86(-7554, false, 4096);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)Lvl;", line = 55)
    public static final class13 method1543(int arg0, int arg1, int arg2, int arg3) {
        field3215++;
        class14 var4 = class197.field2689[arg2][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        class13 var5 = null;
        int var6 = -1;
        if (arg0 > -74) {
            return null;
        }
        for (class621 var7 = var4.field289; var7 != null; var7 = var7.field8560) {
            class556 var8 = var7.field8559;
            if (var8 instanceof class13) {
                class13 var9 = (class13) var8;
                int var10 = (var9.method82((byte) 49) * 256 - 256) + 252;
                int var11 = var9.field5801 - var10 >> 9;
                int var12 = var9.field5797 - var10 >> 9;
                int var13 = var9.field5801 + var10 >> 9;
                int var14 = var9.field5797 + var10 >> 9;
                if (var11 <= arg3 && var12 <= arg1 && arg3 <= var13 && var14 >= arg1) {
                    int var15 = (var14 + 1 - arg1) * (var13 + 1 - arg3);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V", line = 115)
    public static final void method1544(int arg0) {
        field3216++;
        class373.field4792.method3065(true);
        if (arg0 == 256) {
            ;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIILim;Lim;)V", line = 127)
    public static final void method1545(int arg0, int arg1, int arg2, class573 arg3, class573 arg4) {
        class14 var5 = class700.method3936(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field277 = arg3;
        var5.field290 = arg4;
        int var6 = class395.field5009 == class195.field2669 ? 1 : 0;
        if (!arg3.method83((byte) -69)) {
            arg3.field5791 = class259.field3278[var6];
            class259.field3278[var6] = arg3;
        } else if (arg3.method85(-91)) {
            arg3.field5791 = class72.field1005[var6];
            class72.field1005[var6] = arg3;
        } else {
            arg3.field5791 = class730.field10164[var6];
            class730.field10164[var6] = arg3;
            class563.field7924 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method83((byte) -69)) {
            if (arg4.method85(-85)) {
                arg4.field5791 = class72.field1005[var6];
                class72.field1005[var6] = arg4;
                return;
            }
            arg4.field5791 = class730.field10164[var6];
            class730.field10164[var6] = arg4;
            class563.field7924 = true;
            return;
        }
        arg4.field5791 = class259.field3278[var6];
        class259.field3278[var6] = arg4;
    }
}
