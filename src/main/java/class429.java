import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class429 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;I)V")
    public static final void method2579(boolean arg0, String arg1, byte arg2, String arg3, int arg4) {
        int var5 = -76 / ((-arg2 - 69) / 47);
        field5828++;
        class28.method250(arg3, 17355, true, arg1, arg0, -1, arg4);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjga;)V")
    public static final void method2580(int arg0, class746 arg1) {
        field5829++;
        if (arg1 == null) {
            return;
        }
        class239.field3583.method1727(arg1, (byte) 119);
        int var2 = -8 / ((65 - arg0) / 45);
        class618.field8644++;
        Object var3 = null;
        class753 var6;
        if (arg1.field10335 || "".equals(arg1.field10339)) {
            var6 = new class753(arg1.field10339);
            class310.field4426++;
        } else {
            long var4 = arg1.field10344;
            for (var6 = (class753) class561.field7973.method2242(var4, -1); var6 != null && !var6.field10408.equals(arg1.field10339); var6 = (class753) class561.field7973.method2250(true)) {
            }
            if (var6 == null) {
                var6 = (class753) class550.field7901.method3742((byte) 67, var4);
                if (var6 != null && !var6.field10408.equals(arg1.field10339)) {
                    var6 = null;
                }
                if (var6 == null) {
                    var6 = new class753(arg1.field10339);
                }
                class561.field7973.method2241(99, var4, var6);
                class310.field4426++;
            }
        }
        if (var6.method4190(arg1, 4096)) {
            class466.method2785(var6, true);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)[Lmm;")
    public static final class293[] method2581(byte arg0) {
        field5827++;
        if (class308.field4414 == null) {
            class293[] var1 = class439.method2619(class519.field7328, 0);
            class293[] var2 = new class293[var1.length];
            int var3 = 0;
            int var4 = class21.field353.field10087.method3752(-112);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class293 var9 = var1[var5];
                if ((var9.field4280 <= 0 || var9.field4280 >= 24) && var9.field4281 >= 800 && var9.field4275 >= 600 && (var4 != 2 || var9.field4281 <= 800 && var9.field4275 <= 600) && (var4 != 1 || var9.field4281 <= 1024 && var9.field4275 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class293 var11 = var2[var10];
                        if (var9.field4281 == var11.field4281 && var9.field4275 == var11.field4275) {
                            if (var11.field4280 < var9.field4280) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class308.field4414 = new class293[var3];
            class595.method3472(var2, 0, class308.field4414, 0, var3);
            int[] var6 = new int[class308.field4414.length];
            for (int var7 = 0; var7 < class308.field4414.length; var7++) {
                class293 var8 = class308.field4414[var7];
                var6[var7] = var8.field4281 * var8.field4275;
            }
            class387.method2416(var6, (byte) -96, class308.field4414);
        }
        if (arg0 > -81) {
            field5830 = -102;
        }
        return class308.field4414;
    }
}
