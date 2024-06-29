import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class226 extends OutputStream {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lok;")
    private static class41 field3621 = class137.method956("RuneScape is loading )2 please wait)3)3)3", 45);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lok;")
    public static class41 field3613 = field3621;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    public static boolean field3610 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[[[B")
    public static byte[][][] field3618;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1619(boolean arg0) {
        field3624++;
        class65.field974.method135(18436);
        if (arg0) {
            field3626 = -54;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZII[[[Lnh;II)Z", line = 25)
    public static final boolean method1620(boolean arg0, int arg1, int arg2, class308[][][] arg3, int arg4, int arg5) {
        byte var6 = arg0 ? 1 : (byte) (class112.field1646 & 0xFF);
        field3617++;
        if (class252.field4015[class55.field807][arg1][arg5] == var6) {
            return false;
        } else if ((class126.field1879[class55.field807][arg1][arg5] & 0x4) == 0) {
            return false;
        } else {
            if (arg4 != 16752871) {
                method1620(true, 40, -33, (class308[][][]) ((class308[][][]) null), -26, -38);
            }
            int var7 = 0;
            byte var8 = 0;
            class173.field2810[var8] = arg1;
            int var31 = var8 + 1;
            class138.field2068[var8] = arg5;
            class252.field4015[class55.field807][arg1][arg5] = var6;
            while (var7 != var31) {
                int var9 = class173.field2810[var7] & 0xFFFF;
                int var10 = class173.field2810[var7] >> 24 & 0xFF;
                int var11 = (class173.field2810[var7] & 0xFFA0E7) >> 16;
                int var12 = class138.field2068[var7] & 0xFFFF;
                boolean var13 = false;
                int var14 = (class138.field2068[var7] & 0xFF7C82) >> 16;
                boolean var15 = false;
                var7 = var7 + 1 & 0xFFF;
                if ((class126.field1879[class55.field807][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label245: for (int var16 = class55.field807 + 1; var16 <= 3; var16++) {
                    if ((class126.field1879[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field5210 != null) {
                                int var17 = class78.method560(var11, 0);
                                if (arg3[var16][var9][var12].field5210.field3855 == var17 || arg3[var16][var9][var12].field5210.field3860 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class78.method560(var10, 0);
                                    if (arg3[var16][var9][var12].field5210.field3855 == var18 || arg3[var16][var9][var12].field5210.field3860 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class78.method560(var14, arg4 - 16752871);
                                    if (arg3[var16][var9][var12].field5210.field3855 == var19 || arg3[var16][var9][var12].field5210.field3860 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var12].field5201 != null) {
                                for (int var20 = 0; var20 < arg3[var16][var9][var12].field5193; var20++) {
                                    int var21 = (int) (arg3[var16][var9][var12].field5201[var20].field3672 >> 14 & 0x3FL);
                                    int var22 = (int) (arg3[var16][var9][var12].field5201[var20].field3672 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var11 == var23 || var10 != 0 && var10 == var23 || var14 != 0 && var14 == var23) {
                                        continue label245;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class308 var24 = arg3[var16][var9][var12];
                        if (var24 != null && var24.field5193 > 0) {
                            for (int var25 = 0; var25 < var24.field5193; var25++) {
                                class232 var26 = var24.field5201[var25];
                                if (var26.field3673 != var26.field3668 || var26.field3676 != var26.field3665) {
                                    for (int var27 = var26.field3668; var27 <= var26.field3673; var27++) {
                                        for (int var28 = var26.field3665; var28 <= var26.field3676; var28++) {
                                            class252.field4015[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class252.field4015[var16][var9][var12] = var6;
                    }
                }
                if (var13) {
                    int var29 = var9 << 7;
                    if (class162.field2578[arg2] < class278.field4548[class55.field807 + 1][var9][var12]) {
                        class162.field2578[arg2] = class278.field4548[class55.field807 + 1][var9][var12];
                    }
                    int var30 = var12 << 7;
                    if (class223.field3580[arg2] > var29) {
                        class223.field3580[arg2] = var29;
                    } else if (class104.field1485[arg2] < var29) {
                        class104.field1485[arg2] = var29;
                    }
                    if (var30 < class234.field3744[arg2]) {
                        class234.field3744[arg2] = var30;
                    } else if (var30 > class300.field4871[arg2]) {
                        class300.field4871[arg2] = var30;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class252.field4015[class55.field807][var9 - 1][var12] != var6) {
                        class173.field2810[var31] = class255.method1813(-754974720, class255.method1813(1179648, var9 - 1));
                        class138.field2068[var31] = class255.method1813(var12, 1245184);
                        class252.field4015[class55.field807][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class252.field4015[class55.field807][var9 - 1][var12] != var6 && (class126.field1879[class55.field807][var9][var12] & 0x4) == 0 && (class126.field1879[class55.field807][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class173.field2810[var31] = class255.method1813(1375731712, class255.method1813(var9 - 1, 1179648));
                            class138.field2068[var31] = class255.method1813(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class252.field4015[class55.field807][var9 - 1][var12] = var6;
                        }
                        if (class252.field4015[class55.field807][var9][var12] != var6) {
                            class173.field2810[var31] = class255.method1813(318767104, class255.method1813(var9, 5373952));
                            class138.field2068[var31] = class255.method1813(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class252.field4015[class55.field807][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class252.field4015[class55.field807][var9 + 1][var12] != var6 && (class126.field1879[class55.field807][var9][var12] & 0x4) == 0 && (class126.field1879[class55.field807][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class173.field2810[var31] = class255.method1813(class255.method1813(5373952, var9 + 1), -1845493760);
                            class138.field2068[var31] = class255.method1813(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class252.field4015[class55.field807][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class252.field4015[class55.field807][var9 + 1][var12] != var6) {
                        class173.field2810[var31] = class255.method1813(class255.method1813(9568256, var9 + 1), 1392508928);
                        class138.field2068[var31] = class255.method1813(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class252.field4015[class55.field807][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class252.field4015[class55.field807][var9 - 1][var12] != var6 && (class126.field1879[class55.field807][var9][var12] & 0x4) == 0 && (class126.field1879[class55.field807][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class173.field2810[var31] = class255.method1813(class255.method1813(13762560, var9 - 1), 301989888);
                            class138.field2068[var31] = class255.method1813(13828096, var12);
                            class252.field4015[class55.field807][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class252.field4015[class55.field807][var9][var12] != var6) {
                            class173.field2810[var31] = class255.method1813(class255.method1813(var9, 13762560), -1828716544);
                            class138.field2068[var31] = class255.method1813(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class252.field4015[class55.field807][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class252.field4015[class55.field807][var9 + 1][var12] != var6 && (class126.field1879[class55.field807][var9][var12] & 0x4) == 0 && (class126.field1879[class55.field807][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class173.field2810[var31] = class255.method1813(class255.method1813(9568256, var9 + 1), -771751936);
                            class138.field2068[var31] = class255.method1813(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class252.field4015[class55.field807][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class162.field2578[arg2] != -1000000) {
                class162.field2578[arg2] += 10;
                class223.field3580[arg2] -= 50;
                class104.field1485[arg2] += 50;
                class300.field4871[arg2] += 50;
                class234.field3744[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLmh;II)[Lmg;", line = 331)
    public static final class314[] method1621(boolean arg0, class65 arg1, int arg2, int arg3) {
        field3622++;
        if (arg0) {
            field3621 = (class41) null;
        }
        return class10.method40(arg3, !arg0, arg2, arg1) ? class296.method2041(-3) : null;
    }

    @OriginalMember(owner = "client!td", name = "write", descriptor = "(I)V", line = 363)
    public final void write(int arg0) throws IOException {
        field3612++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIBI)V", line = 377)
    public static final void method1622(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3614++;
        class306 var5 = (class306) class186.field3031.method617((long) arg0, false);
        if (arg3 > -19) {
            return;
        }
        if (var5 == null) {
            var5 = new class306();
            class186.field3031.method610(118, var5, (long) arg0);
        }
        if (arg4 >= var5.field5125.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field5125.length; var8++) {
                var6[var8] = var5.field5125[var8];
                var7[var8] = var5.field5130[var8];
            }
            for (int var9 = var5.field5125.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field5130 = var7;
            var5.field5125 = var6;
        }
        var5.field5125[arg4] = arg2;
        var5.field5130[arg4] = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 436)
    public static final void method1623(int arg0, int arg1) {
        class265.field4208 = 50;
        class181.field2929 = arg1;
        field3619++;
        if (arg0 <= 17) {
            field3616 = -66;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 455)
    public static final void method1624(int arg0) {
        field3623++;
        for (int var1 = 0; var1 < 5; var1++) {
            class234.field3730[var1] = false;
        }
        class306.field5134 = -1;
        if (arg0 == -7844) {
            class120.field1762 = -1;
            class28.field416 = 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I", line = 481)
    public static final int method1625(int arg0, byte arg1) {
        if (arg1 > -16) {
            return -15;
        } else {
            field3620++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIII)V", line = 494)
    public static final void method1626(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class15.field192 && class237.field3801 >= arg3) {
            int var5 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg0);
            int var6 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg4);
            class223.method1604(-2238, var6, arg3, var5, arg2);
        }
        field3625++;
        if (arg1 != -75) {
            field3609 = -39;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 514)
    public static void method1627(int arg0) {
        field3621 = null;
        if (arg0 < 68) {
            field3616 = -16;
        }
        field3613 = null;
        field3618 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLmh;)Z", line = 526)
    public static final boolean method1628(int arg0, byte arg1, class65 arg2) {
        if (arg1 > -39) {
            return true;
        }
        byte[] var3 = arg2.method479(arg0, (byte) 78);
        field3611++;
        if (var3 == null) {
            return false;
        } else {
            class271.method1920(var3, 4483);
            return true;
        }
    }
}
