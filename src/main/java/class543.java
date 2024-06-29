import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class543 extends class540 {

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Laj;")
    public static class333 field7371;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)Z")
    public static final boolean method3090(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3090(-101, -55, 12);
        }
        ++field7375;
        return (class530.method3044(arg0, (byte) 113, arg1) | class746.method4128(arg1, true, arg0) | class524.method3022(arg1, arg0, -13222)) & class293.method1853(arg2 ^ 35716, arg0, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBII)V")
    public final void method1411(int arg0, byte arg1, int arg2, int arg3) {
        ++field7372;
        super.field7341 = arg0;
        super.field7344 = arg2;
        if (arg1 == 24) {
            super.field7342 = arg3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIILaj;B)V")
    public static final void method3091(boolean arg0, int arg1, int arg2, int arg3, class333 arg4, byte arg5) {
        if (arg5 == -65) {
            class106.method808(arg4, arg2, arg1, 0L, (byte) 73, arg0, arg3);
            ++field7373;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
    public static final int method3092(int arg0, boolean arg1, String arg2, boolean arg3) {
        ++field7376;
        if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            if (!arg3) {
                field7371 = null;
            }
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                char var9 = arg2.charAt(var8);
                if (var8 == 0) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~var11 <= ~arg0) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (~(var10 / arg0) != ~var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FB)V")
    public final void method1412(float arg0, byte arg1) {
        if (arg1 == -50) {
            super.field7348 = arg0;
            ++field7370;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIF)V")
    public class543(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(JI)V")
    public static final void method3093(long arg0, int arg1) {
        ++field7377;
        int var3 = class500.field6902;
        int var4 = class734.field10175;
        int var5 = 56 / ((-78 - arg1) / 45);
        if (class262.field3888 != var3) {
            int var6 = var3 - class262.field3888;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 > 0) {
                if (~var7 != -1) {
                    if (~var6 > ~var7) {
                        var7 = var6;
                    }
                } else {
                    var7 = 1;
                }
            } else if (var7 != 0) {
                if (~var7 > ~var6) {
                    var7 = var6;
                }
            } else {
                var7 = -1;
            }
            class262.field3888 += var7;
        }
        class135.field1974 += (float) arg0 * class282.field4157 / 40.0F * 8.0F;
        class282.field4151 += (float) arg0 * class281.field4142 / 40.0F * 8.0F;
        if (class400.field5843 != var4) {
            int var8 = -class400.field5843 + var4;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 != 0) {
                    if (~var8 < ~var9) {
                        var9 = var8;
                    }
                } else {
                    var9 = -1;
                }
            } else if (~var9 != -1) {
                if (var9 > var8) {
                    var9 = var8;
                }
            } else {
                var9 = 1;
            }
            class400.field5843 += var9;
        }
        class320.method2033((byte) 59);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static void method3094(boolean arg0) {
        if (arg0) {
            method3094(false);
        }
        field7371 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3095(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field7371 = null;
        }
        ++field7374;
        return ~(65536 & arg0) != -1;
    }
}
