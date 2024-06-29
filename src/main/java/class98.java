import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lu;")
    public static class135 field2365 = class87.method676((byte) -93, "Spieler");

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lu;")
    private static class135 field2367 = class87.method676((byte) -43, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lu;")
    public static class135 field2368 = field2367;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lu;")
    public static class135 field2371 = class87.method676((byte) -65, "Entfernen");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lu;")
    public static class135 field2375 = class87.method676((byte) -39, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
    public static long field2363;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lpe;")
    public static class109 field2374;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lg;")
    public static class43 field2377;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method800(int arg0) {
        field2375 = null;
        if (arg0 != 0) {
            method803(37);
        }
        field2377 = null;
        field2374 = null;
        field2368 = null;
        field2367 = null;
        field2365 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BIII)Lu;")
    public static final class135 method801(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 22060) {
            return null;
        }
        field2364++;
        class135 var4 = new class135();
        var4.field3266 = new byte[arg2];
        var4.field3255 = 0;
        for (int var5 = arg3; var5 < arg3 + arg2; var5++) {
            if (arg0[var5] != 0) {
                var4.field3266[var4.field3255++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
    public static final int method802(byte arg0, int arg1, int arg2) {
        class69 var3 = (class69) class103.field2490.method842((long) arg1, 123);
        if (arg0 < 76) {
            field2374 = null;
        }
        field2372++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field1698.length) {
            return var3.field1698[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method803(int arg0) {
        field2369++;
        if (arg0 != 2 || class119.field2828 == null) {
            return;
        }
        class146 var1 = class119.field2828;
        class146 var2 = class20.method154(var1, (byte) 69);
        if (var2 == null) {
            class119.field2828 = null;
            return;
        }
        class128.field3094++;
        int var3 = class53.field1278;
        int var4 = class76.field1798;
        if (class82.field1928 == 0) {
            var3 -= 4;
            var4 -= 4;
        }
        if (class82.field1928 == 1) {
            var3 -= 553;
            var4 -= 205;
        }
        if (class82.field1928 == 2) {
            var3 -= 17;
            var4 -= 357;
        }
        int var5 = var3 - class97.field2362;
        int var6 = var4 - class4.field109;
        int[] var7 = class47.method357(var2, arg0 ^ 0x2);
        if (var7[0] > var5) {
            var5 = var7[0];
        }
        if (var1.field3623 + var5 > var7[0] + var2.field3623) {
            var5 = var7[0] + var2.field3623 - var1.field3623;
        }
        if (var7[1] > var6) {
            var6 = var7[1];
        }
        if (var1.field3661 + var6 > var7[1] + var2.field3661) {
            var6 = var7[1] + var2.field3661 - var1.field3661;
        }
        int var8 = var6 + var2.field3671 - var7[1];
        int var9 = var2.field3664 + var5 - var7[0];
        class146 var10 = class105.field2528[var1.field3595 >> 16][var1.field3611 & 0xFFFF];
        int[] var11 = class47.method357(var10, 0);
        int var12 = var10.field3664 + var5 - var11[0];
        int var13 = var10.field3671 + var6 - var11[1];
        int var14 = var12 - var1.field3575;
        int var15 = var13 - var1.field3669;
        int var10000;
        if (var1.field3554 >= var14 && -var1.field3554 <= var14 && var15 <= var1.field3554 && var15 >= -var1.field3554 && !class44.field1082) {
            var8 -= var15;
            var9 -= var14;
            var10000 = var12 - var14;
            boolean var17 = false;
            var10000 = var13 - var15;
            boolean var19 = false;
        } else if (var1.field3552 < class128.field3094 || class44.field1082) {
            class44.field1082 = true;
        } else {
            var10000 = var13 - var15;
            var8 -= var15;
            int var25 = var12 - var14;
            boolean var22 = false;
            var9 -= var14;
            boolean var23 = false;
        }
        if (class119.field2828.field3668 != null && class44.field1082) {
            class52.method399(var1, var1.field3668, var8, 0, null, -2147483645, var9);
        }
        if (class60.field1520 != 0) {
            return;
        }
        if (class44.field1082) {
            class146 var24 = class130.method1049(4, class97.field2362 + var9, class4.field109 + var8, var2, var1);
            if (class119.field2828.field3604 != null) {
                class52.method399(var1, var1.field3604, var8, 0, var24, -2147483645, var9);
            }
            if (var24 != null && class12.method91(var1, (byte) 116) != null) {
                class152.field3751.method929(245, arg0 - 14046);
                class152.field3751.method470((byte) -107, var24.field3580);
                class152.field3751.method458(arg0 + 125, var1.field3595);
                class152.field3751.method458(127, var24.field3595);
                class95.field2287++;
                class152.field3751.method448(var1.field3580, true);
            }
        } else {
            if (class119.field2828.field3665 != null) {
                class52.method399(var1, var1.field3665, var8, 0, null, arg0 - 2147483647, var9);
            }
            if ((class152.field3747 == 1 || class8.method40(class131.field3135 - 1, arg0 + -66)) && class131.field3135 > 2) {
                class122.method963(0);
            } else if (class131.field3135 > 0) {
                class34.method271((byte) 124, class131.field3135 - 1);
            }
        }
        class119.field2828 = null;
        return;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLg;)V")
    public static final void method804(byte arg0, class43 arg1) {
        field2370++;
        class145.field3538 = arg1;
        if (arg0 != -121) {
            field2363 = -55L;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;II)V")
    public static final void method805(class9 arg0, int arg1, int arg2) {
        if (arg1 == -8439) {
            class23.method187(arg1 - 1375015161, arg2, arg0.field173, arg0.field172);
            field2373++;
        }
    }
}
