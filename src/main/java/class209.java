import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class209 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field3753 = -1;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lkh;")
    public static class117 field3744 = class224.method1450((byte) -106, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lkh;")
    private static class117 field3748 = class224.method1450((byte) 116, "Loaded update list");

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lkh;")
    public static class117 field3740 = field3748;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[I")
    public static int[] field3755 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lkh;")
    public static class117 field3758 = class224.method1450((byte) 125, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[J")
    public static long[] field3759 = new long[100];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
    public static int[] field3746;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public static int[] field3747;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "[I")
    public static int[] field3752;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field3755 = null;
        field3759 = null;
        field3752 = null;
        field3740 = null;
        field3758 = null;
        field3748 = null;
        field3746 = null;
        if (arg0 != 8144) {
            field3747 = null;
        }
        field3744 = null;
        field3747 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static int method1370(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
    public static final int method1371(int arg0) {
        field3754++;
        if (class9.field152 == 3.0D) {
            return 37;
        } else if (class9.field152 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 5972) {
                field3747 = null;
            }
            return class9.field152 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lve;B)V")
    public static final void method1372(class234 arg0, byte arg1) {
        arg0.field4224 = arg0.field4251;
        field3756++;
        if (arg0.field4272 == 0) {
            arg0.field4260 = 0;
            return;
        }
        if (arg0.field4213 != -1 && arg0.field4225 == 0) {
            class174 var2 = class81.method555(arg0.field4213, (byte) 108);
            if (arg0.field4267 > 0 && var2.field3150 == 0) {
                arg0.field4260++;
                return;
            }
            if (arg0.field4267 <= 0 && var2.field3141 == 0) {
                arg0.field4260++;
                return;
            }
        }
        int var3 = arg0.field4221;
        int var4 = arg0.field4259[arg0.field4272 - 1] * 128 + arg0.field4256 * 64;
        int var5 = arg0.field4266[arg0.field4272 - 1] * 128 + arg0.field4256 * 64;
        int var6 = arg0.field4244;
        if (var4 - var6 > 256 || var4 - var6 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field4244 = var4;
            arg0.field4221 = var5;
            return;
        }
        if (var4 <= var6) {
            if (var4 >= var6) {
                if (var3 < var5) {
                    arg0.field4249 = 1024;
                } else if (var5 < var3) {
                    arg0.field4249 = 0;
                }
            } else if (var3 < var5) {
                arg0.field4249 = 768;
            } else if (var5 < var3) {
                arg0.field4249 = 256;
            } else {
                arg0.field4249 = 512;
            }
        } else if (var5 > var3) {
            arg0.field4249 = 1280;
        } else if (var3 <= var5) {
            arg0.field4249 = 1536;
        } else {
            arg0.field4249 = 1792;
        }
        int var7 = arg0.field4249 - arg0.field4232 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        boolean var8 = true;
        int var9 = arg0.field4247;
        int var10 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg0.field4257;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg0.field4265;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg0.field4238;
        }
        if (var9 == -1) {
            var9 = arg0.field4257;
        }
        arg0.field4224 = var9;
        if (arg1 != 18) {
            method1371(-42);
        }
        if (arg0 instanceof class207) {
            var8 = ((class207) arg0).field3718.field2015;
        }
        if (var8) {
            if (arg0.field4249 != arg0.field4232 && arg0.field4280 == -1 && arg0.field4262 != 0) {
                var10 = 2;
            }
            if (arg0.field4272 > 2) {
                var10 = 6;
            }
            if (arg0.field4272 > 3) {
                var10 = 8;
            }
            if (arg0.field4260 > 0 && arg0.field4272 > 1) {
                var10 = 8;
                arg0.field4260--;
            }
        } else {
            if (arg0.field4272 > 1) {
                var10 = 6;
            }
            if (arg0.field4272 > 2) {
                var10 = 8;
            }
            if (arg0.field4260 > 0 && arg0.field4272 > 1) {
                arg0.field4260--;
                var10 = 8;
            }
        }
        if (arg0.field4275[arg0.field4272 - 1]) {
            var10 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field4221 += var10;
            if (var5 < arg0.field4221) {
                arg0.field4221 = var5;
            }
        } else if (var5 < var3) {
            arg0.field4221 -= var10;
            if (var5 > arg0.field4221) {
                arg0.field4221 = var5;
            }
        }
        if (var10 >= 8 && arg0.field4257 == arg0.field4224 && arg0.field4242 != -1) {
            arg0.field4224 = arg0.field4242;
        }
        if (var6 < var4) {
            arg0.field4244 += var10;
            if (var4 < arg0.field4244) {
                arg0.field4244 = var4;
            }
        } else if (var6 > var4) {
            arg0.field4244 -= var10;
            if (arg0.field4244 < var4) {
                arg0.field4244 = var4;
            }
        }
        if (arg0.field4244 != var4 || arg0.field4221 != var5) {
            return;
        }
        arg0.field4272--;
        if (arg0.field4267 > 0) {
            arg0.field4267--;
            return;
        }
    }
}
