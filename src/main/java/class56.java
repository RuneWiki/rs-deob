import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class56 {

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "Lfga;")
    public static class254 field1049 = new class254();

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "Lqda;")
    public class103 field1050;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V", line = 3)
    public static void method511(byte arg0) {
        field1049 = null;
        if (arg0 > -67) {
            method514(false);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lud;BI)V", line = 16)
    private final void method512(class35 arg0, byte arg1, int arg2) {
        if (arg1 != -66) {
            method513(-97, (byte) 110);
        }
        if (arg2 == 1) {
            this.field1048 = arg0.method253(-13900);
        } else if (arg2 == 2) {
            this.field1056 = arg0.method273(255);
            this.field1051 = arg0.method273(255);
        }
        field1047++;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)Z", line = 40)
    public static final boolean method513(int arg0, byte arg1) {
        field1045++;
        if (arg0 == 15 || arg0 == 2 || arg0 == 59 || arg0 == 11 || arg0 == 1011) {
            return true;
        } else {
            if (arg1 <= 26) {
                method513(17, (byte) -77);
            }
            return arg0 == 57 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V", line = 60)
    public static final void method514(boolean arg0) {
        if (class641.field9124 > 1) {
            class471.field6781.method2826(4, (byte) 117, class471.field6781.field6720);
        } else {
            class471.field6781.method2826(2, (byte) 121, class471.field6781.field6720);
        }
        if (!arg0) {
            method514(false);
        }
        field1053++;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIII)V", line = 84)
    public static final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1052++;
        int var6 = arg4 - arg0;
        int var7 = arg3 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class254.method1734(arg3, arg5, arg2, arg0, (byte) -108);
            }
        } else if (var7 == 0) {
            class643.method3665(arg4, (byte) 48, arg2, arg0, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class156.field2337) {
                var10 = var9 + (class156.field2337 * var8 >> 12);
                var11 = class156.field2337;
            } else if (class612.field8854 >= arg0) {
                var10 = arg5;
                var11 = arg0;
            } else {
                var11 = class612.field8854;
                var10 = (class612.field8854 * var8 >> 12) + var9;
            }
            if (arg1 != 18084) {
                method511((byte) 106);
            }
            int var12;
            int var13;
            if (class156.field2337 > arg4) {
                var12 = class156.field2337;
                var13 = var9 + (class156.field2337 * var8 >> 12);
            } else if (arg4 > class612.field8854) {
                var13 = (class612.field8854 * var8 >> 12) + var9;
                var12 = class612.field8854;
            } else {
                var13 = arg3;
                var12 = arg4;
            }
            if (var13 < class558.field7940) {
                var13 = class558.field7940;
                var12 = (class558.field7940 - var9 << 12) / var8;
            } else if (class748.field10458 < var13) {
                var12 = (class748.field10458 - var9 << 12) / var8;
                var13 = class748.field10458;
            }
            if (class558.field7940 > var10) {
                var10 = class558.field7940;
                var11 = (class558.field7940 - var9 << 12) / var8;
            } else if (var10 > class748.field10458) {
                var10 = class748.field10458;
                var11 = (class748.field10458 - var9 << 12) / var8;
            }
            class458.method2796(var13, var10, arg2, var12, arg1 ^ 0xFFFFB95B, var11);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lud;B)V", line = 190)
    public final void method516(class35 arg0, byte arg1) {
        if (arg1 >= -50) {
            this.field1056 = 42;
        }
        field1057++;
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                return;
            }
            this.method512(arg0, (byte) -66, var3);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lfw;", line = 214)
    public final synchronized class55 method517(int arg0) {
        if (arg0 != 1012) {
            method514(true);
        }
        field1046++;
        class55 var2 = (class55) this.field1050.field1730.method3054((byte) -98, (long) this.field1048);
        if (var2 != null) {
            return var2;
        }
        class55 var3 = class55.method502(this.field1050.field1725, this.field1048, 0);
        if (var3 != null) {
            this.field1050.field1730.method3047(false, var3, (long) this.field1048);
        }
        return var3;
    }
}
