import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class147 extends class106 {

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Z")
    public boolean field2637 = false;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2628 = 0;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Loc;")
    private static class151 field2634 = class137.method873(2, "Login");

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Loc;")
    private static class151 field2629 = class137.method873(2, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Loc;")
    public static class151 field2638 = field2629;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Loc;")
    public static class151 field2636 = field2634;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Loc;")
    public static class151 field2642 = class137.method873(2, "");

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Ljh;")
    public static class105 field2643;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZIII)V")
    public static final void method933(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class106.field1877 = -1;
        class138.field2508 = -1;
        field2633++;
        class110.field1943 = class217.field3788 * arg3 / arg4;
        class25.field541 = class27.field581 * arg2 / arg0;
        if (!arg1) {
            class237.method1541(!arg1);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lcg;I)V")
    public static final void method934(class30 arg0, int arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class189.field3346.length; var3++) {
            class189.field3346[var3] = 0;
        }
        field2641++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class189.field3346[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != 9049) {
            return;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class208.field3665[var15] = (class189.field3346[var15 - 128] + class189.field3346[var15 + 128] + class189.field3346[var15 - -1] + class189.field3346[var15 + -1]) / 4;
                }
            }
            int[] var13 = class189.field3346;
            class189.field3346 = class208.field3665;
            class208.field3665 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field634; var7++) {
            for (int var8 = 0; var8 < arg0.field633; var8++) {
                if (arg0.field628[var6++] != 0) {
                    int var9 = arg0.field631 + var8 + 16;
                    int var10 = arg0.field630 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class189.field3346[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lbf;IIIIII)Lbf;")
    public static final class18 method935(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2635++;
        long var7 = (long) arg5;
        class18 var9 = (class18) class236.field4397.method1028(var7, false);
        if (var9 == null) {
            class10 var10 = class10.method67(class176.field3188, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method58(64, 768, -50, -10, -50);
            class236.field4397.method1025(var9, false, var7);
        }
        if (arg4 != 9811) {
            method936(124);
        }
        int var11 = arg0.method150();
        int var12 = arg0.method159();
        int var13 = arg0.method164();
        int var14 = arg0.method154();
        class18 var15 = var9.method147(true);
        if (arg6 != 0) {
            var15.method153(arg6);
        }
        class76 var16 = (class76) var15;
        if (class195.method1225(arg2 + var11, class234.field4325, arg3 + var13, (byte) -118) != arg1 || arg1 != class195.method1225(arg2 + var12, class234.field4325, arg3 + var14, (byte) -118)) {
            for (int var17 = 0; var17 < var16.field1454; var17++) {
                var16.field1476[var17] += class195.method1225(var16.field1473[var17] + arg2, class234.field4325, var16.field1447[var17] + arg3, (byte) -118) - arg1;
            }
            var16.field1468 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static void method936(int arg0) {
        field2638 = null;
        field2636 = null;
        field2643 = null;
        field2634 = null;
        field2629 = null;
        if (arg0 > 96) {
            field2642 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Z")
    public static final boolean method937(byte arg0) {
        field2639++;
        long var1 = class217.method1351(-91);
        int var3 = (int) (var1 - class236.field4396);
        if (arg0 <= 13) {
            method933(0, false, -74, 47, 9);
        }
        class236.field4396 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class83.field1568 += var3;
        if (class206.field3655 == 0 && class170.field3095 == 0 && class232.field4263 == 0 && class232.field4227 == 0) {
            return true;
        } else if (class229.field4052 == null) {
            return false;
        } else {
            try {
                if (class83.field1568 > 30000) {
                    throw new IOException();
                }
                while (class170.field3095 < 20 && class232.field4227 > 0) {
                    class188 var4 = (class188) class36.field750.method1534(20912);
                    class229 var5 = new class229(4);
                    var5.method1447(-1, 1);
                    var5.method1483((byte) -105, (int) var4.field1881);
                    class229.field4052.method331(50, 4, var5.field4087, 0);
                    class104.field1864.method1536((byte) -114, var4, var4.field1881);
                    class232.field4227--;
                    class170.field3095++;
                }
                while (class206.field3655 < 20 && class232.field4263 > 0) {
                    class188 var6 = (class188) class53.field1079.method327(11997);
                    class229 var7 = new class229(4);
                    var7.method1447(-1, 0);
                    var7.method1483((byte) -126, (int) var6.field1881);
                    class229.field4052.method331(87, 4, var7.field4087, 0);
                    var6.method1129((byte) -2);
                    class109.field1923.method1536((byte) -45, var6, var6.field1881);
                    class206.field3655++;
                    class232.field4263--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class229.field4052.method337(true);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class83.field1568 = 0;
                    byte var10 = 0;
                    if (class94.field1753 == null) {
                        var10 = 8;
                    } else if (class178.field3213 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class124.field2221.field4087.length - class94.field1753.field3341;
                        int var12 = 512 - class178.field3213;
                        if (var12 > var11 - class124.field2221.field4101) {
                            var12 = var11 - class124.field2221.field4101;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class229.field4052.method334((byte) 95, class124.field2221.field4087, class124.field2221.field4101, var12);
                        if (class78.field1507 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class124.field2221.field4087[class124.field2221.field4101 + var13] = (byte) class112.method675(class124.field2221.field4087[class124.field2221.field4101 + var13], class78.field1507);
                            }
                        }
                        class124.field2221.field4101 += var12;
                        class178.field3213 += var12;
                        if (class124.field2221.field4101 == var11) {
                            if (class94.field1753.field1881 == 16711935L) {
                                class222.field3851 = class124.field2221;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class142 var15 = class144.field2605[var14];
                                    if (var15 != null) {
                                        class222.field3851.field4101 = var14 * 8 + 5;
                                        int var16 = class222.field3851.method1437(425528536);
                                        int var17 = class222.field3851.method1437(425528536);
                                        var15.method911(var16, var17, (byte) 0);
                                    }
                                }
                            } else {
                                class36.field740.reset();
                                class36.field740.update(class124.field2221.field4087, 0, var11);
                                int var18 = (int) class36.field740.getValue();
                                if (class94.field1753.field3333 != var18) {
                                    try {
                                        class229.field4052.method336(-13112);
                                    } catch (Exception var30) {
                                    }
                                    class229.field4052 = null;
                                    class71.field1380++;
                                    class78.field1507 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class215.field3766 = 0;
                                class71.field1380 = 0;
                                class94.field1753.field3340.method915((int) (class94.field1753.field1881 & 0xFFFFL), class5.field95, (class94.field1753.field1881 & 0xFF0000L) == 16711680L, 10055, class124.field2221.field4087);
                            }
                            class94.field1753.method636(67);
                            class94.field1753 = null;
                            if (class5.field95) {
                                class170.field3095--;
                            } else {
                                class206.field3655--;
                            }
                            class124.field2221 = null;
                            class178.field3213 = 0;
                        } else {
                            if (class178.field3213 != 512) {
                                break;
                            }
                            class178.field3213 = 0;
                        }
                    } else {
                        int var19 = var10 - class139.field2537.field4101;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class229.field4052.method334((byte) 95, class139.field2537.field4087, class139.field2537.field4101, var19);
                        if (class78.field1507 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class139.field2537.field4087[class139.field2537.field4101 + var20] = (byte) class112.method675(class139.field2537.field4087[class139.field2537.field4101 + var20], class78.field1507);
                            }
                        }
                        class139.field2537.field4101 += var19;
                        if (class139.field2537.field4101 < var10) {
                            break;
                        }
                        if (class94.field1753 == null) {
                            class139.field2537.field4101 = 0;
                            int var21 = class139.field2537.method1475(255);
                            int var22 = class139.field2537.method1490((byte) 73);
                            int var23 = class139.field2537.method1475(255);
                            long var24 = (long) ((var21 << 16) + var22);
                            int var26 = class139.field2537.method1437(425528536);
                            class188 var27 = (class188) class104.field1864.method1538(var24, (byte) 127);
                            class5.field95 = true;
                            if (var27 == null) {
                                var27 = (class188) class109.field1923.method1538(var24, (byte) 127);
                                class5.field95 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class94.field1753 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class124.field2221 = new class229(class94.field1753.field3341 + var28 + var26);
                            class124.field2221.method1447(-1, var23);
                            class124.field2221.method1461(var26, (byte) 28);
                            class178.field3213 = 8;
                            class139.field2537.field4101 = 0;
                        } else if (class178.field3213 == 0) {
                            if (class139.field2537.field4087[0] == -1) {
                                class178.field3213 = 1;
                                class139.field2537.field4101 = 0;
                            } else {
                                class94.field1753 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class229.field4052.method336(-13112);
                } catch (Exception var29) {
                }
                class215.field3766++;
                class229.field4052 = null;
                return false;
            }
        }
    }
}
