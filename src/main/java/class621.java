import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class621 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
    public static boolean field8895 = false;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field8891;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field8894;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field8896;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field8901;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lr;")
    public static class165 field8893;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[Lpga;")
    public static class495[] field8897;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 7)
    public static void method3549(int arg0) {
        field8897 = null;
        int var1 = -36 / ((arg0 - 72) / 44);
        field8893 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 19)
    public static final void method3550(byte arg0) {
        field8892++;
        if (arg0 == 98 && field8893 != null) {
            field8893.method1047(1);
            class554.field8037 = null;
            field8893 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZLjava/lang/String;)Z", line = 42)
    public static final boolean method3551(int arg0, int arg1, boolean arg2, String arg3) {
        field8890++;
        if (arg0 != 90) {
            return false;
        } else if (arg1 >= 2 && arg1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg2) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg1) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if ((var10 / arg1) != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 120)
    public static final void method3552(int arg0) {
        field8900++;
        if (class382.field5103 == 0) {
            return;
        }
        try {
            if (arg0 > -94) {
                field8895 = true;
            }
            if ((++class184.field2257) > 2000) {
                if (class489.field6835 != null) {
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                }
                if (class88.field1237 >= 2) {
                    class696.field9865 = -5;
                    class382.field5103 = 0;
                    return;
                }
                class125.field1603.method1944(0);
                class184.field2257 = 0;
                class88.field1237++;
                class382.field5103 = 1;
            }
            if (class382.field5103 == 1) {
                class90.field1263 = class125.field1603.method1940(-16093, class517.field7570);
                class382.field5103 = 2;
            }
            if (class382.field5103 == 2) {
                if (class90.field1263.field6693 == 2) {
                    throw new IOException();
                }
                if (class90.field1263.field6693 != 1) {
                    return;
                }
                class489.field6835 = class220.method1335(7500, (Socket) class90.field1263.field6695, -125);
                class90.field1263 = null;
                class238.method1462(80);
                class382.field5103 = 4;
            }
            if (class382.field5103 == 4) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                int var1 = class29.field617.field5205[0] & 0xFF;
                if (var1 != 21) {
                    class696.field9865 = var1;
                    class382.field5103 = 0;
                    class489.field6835.method1853((byte) 11);
                    class489.field6835 = null;
                    return;
                }
                class382.field5103 = 5;
            }
            if (class382.field5103 == 5) {
                if (!class489.field6835.method1856(-1, 1)) {
                    return;
                }
                class489.field6835.method1851(class29.field617.field5205, 1, (byte) -3, 0);
                class382.field5103 = 6;
                class517.field7569 = new String[class29.field617.field5205[0] & 0xFF];
            }
            if (class382.field5103 == 6 && class489.field6835.method1856(-1, class517.field7569.length * 8)) {
                class29.field617.field5195 = 0;
                class489.field6835.method1851(class29.field617.field5205, class517.field7569.length * 8, (byte) -3, 0);
                for (int var2 = 0; var2 < class517.field7569.length; var2++) {
                    class517.field7569[var2] = class437.method2613((byte) -108, class29.field617.method2227(-26276));
                }
                class382.field5103 = 0;
                class696.field9865 = 21;
                class489.field6835.method1853((byte) 11);
                class489.field6835 = null;
            }
        } catch (IOException var3) {
            if (class489.field6835 != null) {
                class489.field6835.method1853((byte) 11);
                class489.field6835 = null;
            }
            if (class88.field1237 >= 2) {
                class696.field9865 = -4;
                class382.field5103 = 0;
            } else {
                class125.field1603.method1944(0);
                class382.field5103 = 1;
                class184.field2257 = 0;
                class88.field1237++;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 271)
    public static final void method3553(byte arg0) {
        field8898++;
        class32 var1 = (class32) class440.field6267.method1132((byte) -101);
        if (arg0 > -31) {
            field8897 = null;
        }
        while (var1 != null) {
            if (var1.field657 == -1) {
                var1.field654 = 0;
                if (var1.field647 >= 0 && var1.field661 >= 0 && class473.field6604 > var1.field647 && var1.field661 < class205.field2465) {
                    class69.method624((byte) 95, var1);
                }
            } else {
                var1.method3045(true);
            }
            var1 = (class32) class440.field6267.method1134(8446);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V", line = 299)
    public static final void method3554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8899++;
        int var6 = arg1 - arg2;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class507.method3015(arg4, -128, arg5, arg2, arg0);
            }
        } else if (var7 == 0) {
            class584.method3391((byte) 77, arg2, arg1, arg4, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class587.field8513) {
                var10 = class587.field8513;
                var11 = (class587.field8513 * var8 >> 12) + var9;
            } else if (class221.field2866 < arg2) {
                var10 = class221.field2866;
                var11 = (class221.field2866 * var8 >> 12) + var9;
            } else {
                var11 = arg4;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class587.field8513 > arg1) {
                var12 = class587.field8513;
                var13 = (class587.field8513 * var8 >> 12) + var9;
            } else if (class221.field2866 >= arg1) {
                var13 = arg5;
                var12 = arg1;
            } else {
                var13 = (class221.field2866 * var8 >> 12) + var9;
                var12 = class221.field2866;
            }
            if (var11 < class598.field8632) {
                var10 = (class598.field8632 - var9 << 12) / var8;
                var11 = class598.field8632;
            } else if (class288.field3883 < var11) {
                var10 = (class288.field3883 - var9 << 12) / var8;
                var11 = class288.field3883;
            }
            if (arg3 >= 31) {
                if (var13 < class598.field8632) {
                    var12 = (class598.field8632 - var9 << 12) / var8;
                    var13 = class598.field8632;
                } else if (class288.field3883 < var13) {
                    var13 = class288.field3883;
                    var12 = (class288.field3883 - var9 << 12) / var8;
                }
                class435.method2604(var12, var10, var13, var11, false, arg0);
            }
        }
    }
}
