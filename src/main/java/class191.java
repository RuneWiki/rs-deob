import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class191 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lce;")
    public static class345 field2828 = new class345(64);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2830 = 2;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2831 = "Please remove ";

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1475(int arg0) {
        class199.field2904.method106((byte) -103);
        field2829++;
        class450.field6534.method106((byte) -121);
        class209.field3044.method106((byte) -115);
        class306.field4467.method106((byte) -110);
        class72.field1206.method106((byte) -107);
        if (arg0 != 13388) {
            field2831 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I", line = 20)
    public static final int method1476(boolean arg0) {
        field2826++;
        if (class84.field1365 || class389.field5591 <= 0) {
            int var1 = class129.field2111;
            int var2 = class291.field4327;
            int var3 = class169.field2512;
            int var4 = class63.field1024;
            int var5 = class32.field452;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class389.field5591; var7++) {
                    if (class369.field5242) {
                        int var12 = var4 + ((class389.field5591 + -1 - var7) * 16) + 33;
                        if ((var12 - 13) < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class389.field5591 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var11 - 13 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class214 var9 = new class214(class276.field4153);
                    for (class278 var10 = (class278) var9.method1631((byte) -59); var10 != null; var10 = (class278) var9.method1629(-1)) {
                        if ((var8++) == var6) {
                            return var10.field4175;
                        }
                    }
                }
            }
            if (!arg0) {
                method1478(36, 70, 38, -68, 47);
            }
            return -1;
        } else if (class41.field635 && class33.field482[81] && class389.field5591 > 2) {
            return ((class278) class276.field4153.field322.field497.field497).field4175;
        } else {
            return ((class278) class276.field4153.field322.field497).field4175;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 109)
    public static void method1477(int arg0) {
        if (arg0 == -22362) {
            field2828 = null;
            field2831 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V", line = 120)
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -84 % ((69 - arg4) / 51);
        if (arg1 >= class185.field2727 && arg1 <= class278.field4184) {
            int var6 = class102.method843(arg2, class383.field5497, class308.field4507, 0);
            int var7 = class102.method843(arg0, class383.field5497, class308.field4507, 0);
            class356.method2280(var7, arg3, -10605, arg1, var6);
        }
        field2827++;
    }
}
