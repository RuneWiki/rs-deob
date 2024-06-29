import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class238 {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lok;")
    public static class146 field3968 = null;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "S")
    public static short field3963 = 1;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
    public static int[] field3969 = new int[256];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Loh;")
    public static class15 field3977;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    public static int[] field3967;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lki;", line = 4)
    public static final class157 method1735(int arg0, int arg1) {
        if (arg0 > -31) {
            return (class157) null;
        }
        field3971++;
        class157 var2 = (class157) class79.field1255.method1511((long) arg1, 83);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class169.field2865.method92(26, 0, arg1);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1235(new class47(var3), true);
        }
        class79.field1255.method1509((long) arg1, 120, var4);
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BJ)Lok;", line = 28)
    public static final class146 method1736(byte arg0, long arg1) {
        if (arg0 != 61) {
            method1736((byte) 20, 39L);
        }
        field3965++;
        return class140.method1030(arg1, false, 2, 10);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)Lok;", line = 41)
    public static final class146 method1737(byte arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field3972++;
        int var4 = 113 % ((-arg0 - 67) / 37);
        if (var3 < -9) {
            return class102.field1657;
        } else if (var3 < -6) {
            return class320.field5471;
        } else if (var3 < -3) {
            return class31.field584;
        } else if (var3 < 0) {
            return class121.field1994;
        } else if (var3 > 9) {
            return class113.field1826;
        } else if (var3 > 6) {
            return class215.field3558;
        } else if (var3 <= 3) {
            return var3 > 0 ? class127.field2062 : class139.field2306;
        } else {
            return class277.field4756;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 80)
    public static void method1738(boolean arg0) {
        field3969 = null;
        field3977 = null;
        field3967 = null;
        if (!arg0) {
            field3968 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Lgh;", line = 99)
    public static final class222 method1739(int arg0, int arg1) {
        field3966++;
        class222 var2 = (class222) class159.field2681.method799((byte) 52, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class180.field3029.method92(arg1, arg1 - 3, arg0);
        class222 var4 = new class222();
        if (var3 != null) {
            var4.method1643((byte) 127, new class47(var3));
        }
        class159.field2681.method797(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lwe;ZI)Lok;", line = 124)
    public static final class146 method1740(class47 arg0, boolean arg1, int arg2) {
        field3964++;
        try {
            class146 var3 = new class146();
            var3.field2461 = arg0.method350(-32768);
            if (arg2 < var3.field2461) {
                var3.field2461 = arg2;
            }
            if (arg1) {
                method1736((byte) 58, 86L);
            }
            var3.field2462 = new byte[var3.field2461];
            arg0.field857 += class287.field4924.method584(0, var3.field2461, arg0.field857, (byte) -104, arg0.field860, var3.field2462);
            return var3;
        } catch (Exception var5) {
            return class47.field833;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)I", line = 153)
    public static final int method1741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg6 & 0x3;
        field3962++;
        if (var8 == 0) {
            return arg2;
        }
        if (arg3 != 0) {
            field3975 = -46;
        }
        if (var8 == 1) {
            return 8 - arg1 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg2;
        } else {
            return arg0;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3969[var0] = var1;
        }
        field3974 = -1;
        field3976 = 0;
        field3975 = (int) (Math.random() * 17.0D) - 8;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)[B")
    public abstract byte[] method496(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[B)V")
    public abstract void method495(int arg0, byte[] arg1);
}
