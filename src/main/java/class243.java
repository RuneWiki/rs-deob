import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class243 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private int field3809 = -1;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    private int field3826 = 0;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field3812;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lba;")
    public static class296 field3823;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[I")
    public static int[] field3813;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1593(int arg0) {
        field3813 = null;
        if (arg0 == 34) {
            field3823 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBLbj;)V")
    public final void method1594(int arg0, byte arg1, class215 arg2) {
        field3816++;
        if (arg1 != 82) {
            this.field3810 = 100;
        }
        while (true) {
            int var4 = arg2.method1374((byte) -60);
            if (var4 == 0) {
                return;
            }
            this.method1600(arg2, -3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
    private final void method1595(int arg0, byte arg1) {
        field3814++;
        double var3 = (double) ((arg0 & 0xFF746E) >> 16) / 256.0D;
        if (arg1 != 68) {
            return;
        }
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3812 = (int) (var15 * 256.0D);
        this.field3810 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3810 < 0) {
            this.field3810 = 0;
        } else if (this.field3810 > 255) {
            this.field3810 = 255;
        }
        if (this.field3812 < 0) {
            this.field3812 = 0;
        } else if (this.field3812 > 255) {
            this.field3812 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3820 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3820 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3820 < 1) {
            this.field3820 = 1;
        }
        this.field3811 = (int) ((double) this.field3820 * var19);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgb;IIIZBI)Lbf;")
    public static final class108 method1596(class69 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field3819++;
        int var8 = (arg1 << 19) + (arg6 << 17) + (arg4 ? 65536 : 0) + arg3;
        long var9 = (long) arg2 * 3147483667L + (long) var8 * 3849834839L;
        class108 var11 = (class108) class32.field477.method950(var9, (byte) -45);
        if (var11 != null) {
            return var11;
        }
        class118.field1691 = false;
        if (arg5 < 15) {
            return null;
        }
        class108 var12 = class276.method1794(arg4, false, false, true, arg6, arg2, arg1, arg0, arg3);
        if (var12 != null && !class118.field1691) {
            class32.field477.method942(var9, (byte) 24, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        field3822++;
        if (class183.field2772) {
            return;
        }
        int var1 = -53 / ((arg0 + 29) / 37);
        class183.field2772 = true;
        if (class78.field1085) {
            class123.field1743 = (float) ((int) class123.field1743 - 65 & 0xFFFFFF80);
        } else {
            class228.field3571 += (-24.0F - class228.field3571) / 2.0F;
        }
        class115.field1653 = true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lre;Lnh;Lnh;Lnh;I)Z")
    public static final boolean method1598(class282 arg0, class305 arg1, class305 arg2, class305 arg3, int arg4) {
        if (arg4 >= -44) {
            method1599(-76, -101, -63, 114, -14);
        }
        class176.field2488 = arg3;
        field3817++;
        class189.field2865 = arg2;
        class275.field4367 = arg1;
        class138.field1903 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3821++;
        if (class302.field4800 < 100) {
            class26.method174((byte) -74);
        }
        class266.method1747(arg0, arg3, arg0 + arg4, arg1 + arg3);
        if (class302.field4800 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg0;
            int var7 = arg3 + (arg1 / 2) - var5 - 18;
            class266.method1730(arg0, arg3, arg4, arg1, 0);
            class266.method1743(var6 - 152, var7, 304, 34, 9179409);
            class266.method1730(var6 - 150, var7 - -2, class302.field4800 * 3, 30, 9179409);
            class261.field4201.method211(class263.field4226, var6, var5 + var7, 16777215, -1);
            return;
        }
        class107.field1532 = (int) ((float) (arg1 * 2) / class97.field1401);
        class301.field4777 = class223.field3477 - ((int) ((float) arg4 / class97.field1401));
        class14.field253 = class311.field5005 - ((int) ((float) arg1 / class97.field1401));
        class105.field1507 = (int) ((float) (arg4 * 2) / class97.field1401);
        int var8 = class223.field3477 - ((int) ((float) arg4 / class97.field1401));
        int var9 = class311.field5005 - ((int) ((float) arg1 / class97.field1401));
        if (arg2 < 100) {
            return;
        }
        int var10 = (int) ((float) arg4 / class97.field1401) + class223.field3477;
        int var11 = class311.field5005 + ((int) ((float) arg1 / class97.field1401));
        class97.method624(var8, var9, var10, var11, arg0, arg3, arg0 + arg4, arg1 + arg3 + 1);
        class97.method632();
        class58 var12 = class97.method622();
        class252.method1634(var12, 1, 0, 0);
        if (class307.field4931 > 0) {
            class34.field520--;
            if (class34.field520 == 0) {
                class307.field4931--;
                class34.field520 = 20;
            }
        }
        if (!class223.field3481) {
            return;
        }
        int var13 = arg1 + arg3 - 8;
        int var14 = arg4 + arg0 - 5;
        class17.field293.method229("Fps:" + class15.field266, var14, var13, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var18 = var13 - 15;
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var17 = 16776960;
        if (var16 > 65536) {
            var17 = 16711680;
        }
        class17.field293.method229("Mem:" + var16 + "k", var14, var18, var17, -1);
        var13 = var18 - 15;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lbj;III)V")
    private final void method1600(class215 arg0, int arg1, int arg2, int arg3) {
        field3825++;
        if (arg3 == 1) {
            this.field3826 = arg0.method1403(6591);
            this.method1595(this.field3826, (byte) 68);
        } else if (arg3 == 2) {
            this.field3809 = arg0.method1379(-112);
            if (this.field3809 == 65535) {
                this.field3809 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method1379(-106);
        }
        if (arg1 != -3) {
            this.field3826 = -104;
        }
    }
}
