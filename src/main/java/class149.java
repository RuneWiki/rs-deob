import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class149 extends class297 {

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "[I")
    public static int[] field2149 = new int[2000];

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Lje;")
    public static class158 field2150;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIB)I", line = 11)
    public static final int method937(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -38) {
            method940(87, 0.4964668342060683D);
        }
        field2147++;
        int var4 = class229.field3791[class227.method1599(arg2, arg0)];
        if (arg1 > 0) {
            int var5 = class229.field3802.method1101((byte) 32, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg0 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class229.field3802.method1091(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                int var11 = ((var4 & 0xFF0000) >> 16) * var9;
                int var12 = (var4 >> 8 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var11 & 0x200FF00) << 8) + (var12 & 0xFF00) + (var10 >> 8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V", line = 83)
    public static void method938(boolean arg0) {
        if (arg0) {
            field2150 = null;
            field2149 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 106)
    public static final boolean method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field2146++;
        if (arg6 <= 122) {
            field2149 = (int[]) null;
        }
        if (class151.field2183.field226 == 2) {
            return class289.method1958(true, arg11, arg10, arg3, arg4, arg5, arg9, arg8, arg1, arg7, arg2, arg0);
        } else if (class151.field2183.field226 <= 2) {
            return class18.method149(arg1, arg2, arg3, arg8, true, arg0, arg9, arg7, arg4, arg5, arg10, arg11);
        } else {
            return class194.method1272(arg11, arg10, class151.field2183.field226, arg1, arg7, arg9, arg4, arg5, arg2, arg8, (byte) -107, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ID)V", line = 130)
    public static final void method940(int arg0, double arg1) {
        field2148++;
        if (class126.field1895 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class296.field4979[var3] = var4 > 255 ? 255 : var4;
            }
            class126.field1895 = arg1;
        }
        if (arg0 < 52) {
            method940(74, 0.3937235283525565D);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(II)V", line = 156)
    public class149(int arg0, int arg1) {
        this.field2151 = arg1;
        this.field2152 = arg0;
    }
}
