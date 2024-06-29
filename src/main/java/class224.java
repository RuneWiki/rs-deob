import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class224 extends class77 {

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Lia;")
    public class88 field4145;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Ldc;")
    public static class37 field4149 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "[S")
    public static short[] field4144 = new short[] { 2, 4, 25, 44, 3, 22, 16, 41 };

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Ldc;")
    public static class37 field4157 = class185.method1233((byte) 86, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Lpj;")
    public static class173 field4151;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Lwa;")
    public static class238 field4154;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Z")
    public static boolean field4155;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
    public static final void method1472(byte arg0, boolean arg1) {
        field4148++;
        for (int var2 = 0; var2 < class95.field1669; var2++) {
            class66 var3 = class70.field1262[class92.field1579[var2]];
            long var4 = (long) class92.field1579[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method482((byte) -108) && var3.field1190.field3838 == arg1 && var3.field1190.method1363(0)) {
                int var6 = var3.field3505 >> 7;
                int var7 = var3.field3490 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field3499 == 1 && (var3.field3505 & 0x7F) == 64 && (var3.field3490 & 0x7F) == 64) {
                        if (class66.field1184[var6][var7] == class231.field4224) {
                            continue;
                        }
                        class66.field1184[var6][var7] = class231.field4224;
                    }
                    if (!var3.field1190.field3847) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3487 = class145.method1008(class125.field2246, (var3.field3499 - 1) * 64 + var3.field3505, -64 - (-(var3.field3499 * 64) - var3.field3490), (byte) -76);
                    class88.method586(class125.field2246, var3.field3505, var3.field3490, var3.field3487, var3.field3499 * 64 - 4, var3, var3.field3511, var4, var3.field3476);
                }
            }
        }
        if (arg0 <= 10) {
            field4151 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lia;)V")
    public class224(class88 arg0) {
        this.field4145 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILre;)V")
    public static final void method1473(int arg0, class190 arg1) {
        field4152++;
        arg1.field3465 = arg1.field3466;
        if (arg1.field3491 == 0) {
            arg1.field3463 = 0;
            return;
        }
        if (arg1.field3524 != -1 && arg1.field3537 == 0) {
            class208 var2 = class16.method113(arg1.field3524, (byte) 87);
            if (arg1.field3471 > 0 && var2.field3905 == 0) {
                arg1.field3463++;
                return;
            }
            if (arg1.field3471 <= 0 && var2.field3897 == 0) {
                arg1.field3463++;
                return;
            }
        }
        int var3 = arg1.field3505;
        int var4 = arg1.field3490;
        int var5 = arg1.field3494[arg1.field3491 - 1] * 128 + arg1.field3499 * 64;
        int var6 = arg1.field3525[arg1.field3491 - 1] * 128 + arg1.field3499 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field3490 = var6;
            arg1.field3505 = var5;
            return;
        }
        if (var5 <= var3) {
            if (var3 > var5) {
                if (var6 > var4) {
                    arg1.field3513 = 768;
                } else if (var6 >= var4) {
                    arg1.field3513 = 512;
                } else {
                    arg1.field3513 = 256;
                }
            } else if (var6 > var4) {
                arg1.field3513 = 1024;
            } else if (var6 < var4) {
                arg1.field3513 = 0;
            }
        } else if (var4 < var6) {
            arg1.field3513 = 1280;
        } else if (var4 <= var6) {
            arg1.field3513 = 1536;
        } else {
            arg1.field3513 = 1792;
        }
        int var7 = arg1.field3486;
        int var8 = 4;
        int var9 = arg1.field3513 - arg1.field3511 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 >= -256 && var9 <= 256) {
            var7 = arg1.field3472;
        } else if (var9 >= 256 && var9 < 768) {
            var7 = arg1.field3509;
        } else if (var9 >= -768 && var9 <= -256) {
            var7 = arg1.field3531;
        }
        if (var7 == -1) {
            var7 = arg1.field3472;
        }
        boolean var10 = true;
        arg1.field3465 = var7;
        if (arg1 instanceof class66) {
            var10 = ((class66) arg1).field1190.field3856;
        }
        if (var10) {
            if (arg1.field3513 != arg1.field3511 && arg1.field3517 == -1 && arg1.field3461 != 0) {
                var8 = 2;
            }
            if (arg1.field3491 > 2) {
                var8 = 6;
            }
            if (arg1.field3491 > 3) {
                var8 = 8;
            }
            if (arg1.field3463 > 0 && arg1.field3491 > 1) {
                arg1.field3463--;
                var8 = 8;
            }
        } else {
            if (arg1.field3491 > 1) {
                var8 = 6;
            }
            if (arg1.field3491 > 2) {
                var8 = 8;
            }
            if (arg1.field3463 > 0 && arg1.field3491 > 1) {
                var8 = 8;
                arg1.field3463--;
            }
        }
        if (arg1.field3549[arg1.field3491 - 1]) {
            var8 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field3490 += var8;
            if (arg1.field3490 > var6) {
                arg1.field3490 = var6;
            }
        } else if (var4 > var6) {
            arg1.field3490 -= var8;
            if (arg1.field3490 < var6) {
                arg1.field3490 = var6;
            }
        }
        if (arg0 != 2) {
            field4144 = null;
        }
        if (var8 >= 8 && arg1.field3472 == arg1.field3465 && arg1.field3504 != -1) {
            arg1.field3465 = arg1.field3504;
        }
        if (var5 > var3) {
            arg1.field3505 += var8;
            if (var5 < arg1.field3505) {
                arg1.field3505 = var5;
            }
        } else if (var5 < var3) {
            arg1.field3505 -= var8;
            if (arg1.field3505 < var5) {
                arg1.field3505 = var5;
            }
        }
        if (arg1.field3505 != var5 || arg1.field3490 != var6) {
            return;
        }
        arg1.field3491--;
        if (arg1.field3471 > 0) {
            arg1.field3471--;
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        field4154 = null;
        field4149 = null;
        field4151 = null;
        field4157 = null;
        field4144 = null;
        int var1 = -47 / ((-arg0 - 48) / 63);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILp;IIIII)V")
    public static final void method1475(int arg0, class163 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4153++;
        if (arg2 >= -79) {
            field4150 = -67;
        }
        long var7 = 0L;
        boolean var9 = true;
        if (arg3 == 0) {
            var7 = client.method276(arg6, arg0, arg5);
        }
        if (arg3 == 1) {
            var7 = class9.method60(arg6, arg0, arg5);
        }
        boolean var10 = false;
        if (arg3 == 2) {
            var7 = class204.method1343(arg6, arg0, arg5);
        }
        if (arg3 == 3) {
            var7 = class244.method1592(arg6, arg0, arg5);
        }
        boolean var11 = false;
        if (var7 == 0L) {
            return;
        }
        int var12 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class30 var13 = class73.method519(var12, -21035);
        int var14 = (int) var7 >> 14 & 0x1F;
        int var15 = (int) var7 >> 20 & 0x3;
        if (arg3 == 0) {
            class119.method818(arg6, arg0, arg5);
            if (var13.field614 != 0) {
                arg1.method1093(true, var13.field571, arg0, var14, var15, arg5);
            }
        }
        if (arg3 == 1) {
            class101.method664(arg6, arg0, arg5);
        }
        if (arg3 == 2) {
            class125.method850(arg6, arg0, arg5);
            if (var13.field614 != 0 && arg0 + var13.field560 < 104 && arg5 + var13.field560 < 104 && var13.field562 + arg0 < 104 && var13.field562 + arg5 < 104) {
                arg1.method1097(arg0, var13.field560, 31317, var13.field571, var13.field562, var15, arg5);
            }
        }
        if (arg3 != 3) {
            return;
        }
        class107.method702(arg6, arg0, arg5);
        if (var13.field614 == 1) {
            arg1.method1106(arg0, arg5, 7446);
            return;
        }
    }
}
