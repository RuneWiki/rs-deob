import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class93 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public int field1588 = 0;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field1589 = -1;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field1584 = -1;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Z")
    public boolean field1587 = true;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lrg;")
    public static class84 field1590 = new class84();

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
    public static int[] field1598 = new int[1000];

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lda;")
    public static class275 field1594 = class255.method1672(111, ": ");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
    public static int[] field1596 = new int[5];

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lda;")
    public static class275 field1602 = class255.method1672(98, "um");

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lrh;")
    public static class21 field1599;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lda;")
    public static class275 field1595;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1601;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method667(int arg0) {
        field1585++;
        int var1 = class40.field670 * 128 + 64;
        int var2 = class229.field3920 * 128 + 64;
        int var3 = -84 / ((-arg0 - 54) / 38);
        int var4 = class89.method647(var2, class159.field2790, var1, 122) - class249.field4402;
        if (class200.field3415 < 100) {
            if (class195.field3335 < var2) {
                class195.field3335 += (var2 - class195.field3335) * class200.field3415 / 1000 + class240.field4220;
                if (var2 < class195.field3335) {
                    class195.field3335 = var2;
                }
            }
            if (var4 > class83.field1349) {
                class83.field1349 += class240.field4220 + ((var4 - class83.field1349) * class200.field3415 / 1000);
                if (class83.field1349 > var4) {
                    class83.field1349 = var4;
                }
            }
            if (var2 < class195.field3335) {
                class195.field3335 -= (class195.field3335 - var2) * class200.field3415 / 1000 + class240.field4220;
                if (var2 > class195.field3335) {
                    class195.field3335 = var2;
                }
            }
            if (class83.field1349 > var4) {
                class83.field1349 -= (class83.field1349 - var4) * class200.field3415 / 1000 + class240.field4220;
                if (class83.field1349 < var4) {
                    class83.field1349 = var4;
                }
            }
            if (class123.field2204 < var1) {
                class123.field2204 += (var1 - class123.field2204) * class200.field3415 / 1000 + class240.field4220;
                if (class123.field2204 > var1) {
                    class123.field2204 = var1;
                }
            }
            if (var1 < class123.field2204) {
                class123.field2204 -= (class123.field2204 - var1) * class200.field3415 / 1000 + class240.field4220;
                if (class123.field2204 < var1) {
                    class123.field2204 = var1;
                }
            }
        } else {
            class195.field3335 = class229.field3920 * 128 + 64;
            class123.field2204 = class40.field670 * 128 + 64;
            class83.field1349 = class89.method647(class195.field3335, class159.field2790, class123.field2204, 120) - class249.field4402;
        }
        int var5 = class11.field166 * 128 + 64;
        int var6 = class23.field388 * 128 + 64;
        int var7 = class89.method647(var6, class159.field2790, var5, -95) - class267.field4642;
        int var8 = var7 - class83.field1349;
        int var9 = var6 - class195.field3335;
        int var10 = var5 - class123.field2204;
        int var11 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var8, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 0x7FF;
        int var14 = var13 - class224.field3800;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (var14 > 0) {
            class224.field3800 += class33.field491 * var14 / 1000 + class147.field2567;
            class224.field3800 &= 0x7FF;
        }
        if (var14 < 0) {
            class224.field3800 -= -var14 * class33.field491 / 1000 + class147.field2567;
            class224.field3800 &= 0x7FF;
        }
        int var15 = var13 - class224.field3800;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var12 > class251.field4454) {
            class251.field4454 += class147.field2567 + ((var12 - class251.field4454) * class33.field491 / 1000);
            if (class251.field4454 > var12) {
                class251.field4454 = var12;
            }
        }
        if (var12 < class251.field4454) {
            class251.field4454 -= (class251.field4454 - var12) * class33.field491 / 1000 + class147.field2567;
            if (class251.field4454 < var12) {
                class251.field4454 = var12;
            }
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class224.field3800 = var13;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILij;)V")
    public final void method668(int arg0, int arg1, class85 arg2) {
        while (true) {
            int var4 = arg2.method564((byte) 62);
            if (var4 == 0) {
                int var5 = -72 % ((arg1 + 40) / 46);
                field1600++;
                return;
            }
            this.method669(var4, arg0, (byte) -127, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBLij;)V")
    private final void method669(int arg0, int arg1, byte arg2, class85 arg3) {
        if (arg2 >= -115) {
            method672((byte[]) null, (byte) 115);
        }
        field1593++;
        if (arg0 == 1) {
            this.field1588 = class92.method660(84, arg3.method598(101));
        } else if (arg0 == 2) {
            this.field1584 = arg3.method564((byte) 108);
        } else if (arg0 == 3) {
            this.field1584 = arg3.method608(72);
            if (this.field1584 == 65535) {
                this.field1584 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field1587 = false;
            return;
        } else if (arg0 == 7) {
            this.field1589 = class92.method660(40, arg3.method598(72));
            return;
        } else if (arg0 == 8) {
            class252.field4479 = arg1;
            return;
        } else {
            if (arg0 == 9) {
                arg3.method608(56);
            } else if (arg0 != 10) {
                if (arg0 == 11) {
                    arg3.method564((byte) 99);
                    return;
                }
                if (arg0 != 12) {
                    if (arg0 == 13) {
                        arg3.method598(87);
                        return;
                    }
                    if (arg0 == 14) {
                        arg3.method564((byte) 67);
                        return;
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1598 = null;
        field1602 = null;
        field1590 = null;
        field1595 = null;
        field1596 = null;
        field1599 = null;
        field1594 = null;
        if (arg0 != -71) {
            method667(-39);
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZZ[Lfd;I)V")
    public static final void method671(int arg0, int arg1, boolean arg2, boolean arg3, class229[] arg4, int arg5) {
        field1586++;
        if (arg2) {
            field1601 = null;
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class229 var7 = arg4[var6];
            if (var7 != null && var7.field3992 == arg5) {
                class118.method870((byte) -31, arg0, arg3, arg1, var7);
                class168.method1151(arg0, arg1, var7, 107);
                if (var7.field4016 > (var7.field4019 - var7.field3980)) {
                    var7.field4016 = var7.field4019 - var7.field3980;
                }
                if (var7.field3996 > var7.field3883 - var7.field3885) {
                    var7.field3996 = var7.field3883 - var7.field3885;
                }
                if (var7.field3996 < 0) {
                    var7.field3996 = 0;
                }
                if (var7.field4016 < 0) {
                    var7.field4016 = 0;
                }
                if (var7.field3858 == 0) {
                    class92.method666(var7, arg3, -1811);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BB)V")
    public static final void method672(byte[] arg0, byte arg1) {
        class85 var2 = new class85(arg0);
        var2.field1392 = arg0.length - 2;
        field1592++;
        class151.field2633 = var2.method608(arg1 + 156);
        class67.field1101 = new byte[class151.field2633][];
        class246.field4357 = new int[class151.field2633];
        class32.field480 = new int[class151.field2633];
        class144.field2520 = new byte[class151.field2633][];
        class158.field2775 = new boolean[class151.field2633];
        class152.field2662 = new int[class151.field2633];
        class114.field2010 = new int[class151.field2633];
        var2.field1392 = arg0.length - (class151.field2633 * 8) - 7;
        class267.field4646 = var2.method608(arg1 + 71);
        class250.field4419 = var2.method608(75);
        int var3 = (var2.method564((byte) 78) & 0xFF) + 1;
        for (int var4 = 0; var4 < class151.field2633; var4++) {
            class114.field2010[var4] = var2.method608(68);
        }
        for (int var5 = 0; var5 < class151.field2633; var5++) {
            class246.field4357[var5] = var2.method608(114);
        }
        for (int var6 = 0; var6 < class151.field2633; var6++) {
            class152.field2662[var6] = var2.method608(79);
        }
        for (int var7 = 0; var7 < class151.field2633; var7++) {
            class32.field480[var7] = var2.method608(42);
        }
        if (arg1 != -39) {
            return;
        }
        var2.field1392 = arg0.length - (class151.field2633 * 8) - ((var3 + -1) * 3) - 7;
        class270.field4695 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class270.field4695[var8] = var2.method598(arg1 + 136);
            if (class270.field4695[var8] == 0) {
                class270.field4695[var8] = 1;
            }
        }
        var2.field1392 = 0;
        for (int var9 = 0; var9 < class151.field2633; var9++) {
            int var10 = class152.field2662[var9];
            int var11 = class32.field480[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class67.field1101[var9] = var13;
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class144.field2520[var9] = var15;
            int var16 = var2.method564((byte) 96);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method581(8);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method581(class261.method1705(arg1, -47));
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var10 <= var18) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var11; var19++) {
                                byte var20 = var15[var10 * var19 + var18] = var2.method581(8);
                                var14 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var17] = var2.method581(arg1 + 47);
                    }
                    var17++;
                }
            }
            class158.field2775[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBII)I")
    public static final int method673(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 45) {
            field1598 = null;
        }
        field1591++;
        if (arg3 >= arg0) {
            return arg2 >= arg3 ? arg3 : arg2;
        } else {
            return arg0;
        }
    }
}
