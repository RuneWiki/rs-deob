import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class69 extends class106 {

    @OriginalMember(owner = "client!he", name = "R", descriptor = "Z")
    public boolean field1518 = true;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public int field1519 = 0;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public int field1528 = -1;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "I")
    public int field1531 = -1;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "Leh;")
    private static class47 field1524 = class195.method1282((byte) -4, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
    public static int[] field1514 = new int[100];

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Leh;")
    private static class47 field1527 = class195.method1282((byte) -4, "Loaded update list");

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Leh;")
    public static class47 field1525 = field1527;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Leh;")
    public static class47 field1530 = field1524;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
    public static int[] field1516;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "[Lqe;")
    public static class149[] field1520;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "[[B")
    public static byte[][] field1511;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lah;IB)Ltg;")
    public static final class178 method614(class9 arg0, int arg1, byte arg2) {
        field1526++;
        if (arg2 >= -126) {
            return null;
        } else {
            byte[] var3 = arg0.method72(arg1, (byte) -98);
            return var3 == null ? null : new class178(var3);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)I")
    private final int method615(byte arg0, int arg1) {
        field1515++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 < 108) {
            field1527 = null;
        }
        double var7 = var5;
        if (var5 > var3) {
            var7 = var3;
        }
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var5;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (-var11 + 2.0D - var7);
            }
            if (var5 == var11) {
                var13 = (var3 - var9) / (var11 - var7);
            } else if (var3 == var11) {
                var13 = (var9 - var5) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (-var7 + var11) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var17 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var15 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var22 > 243) {
            var23 >>= 0x4;
        } else if (var22 > 217) {
            var23 >>= 0x3;
        } else if (var22 > 192) {
            var23 >>= 0x2;
        } else if (var22 > 179) {
            var23 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var23 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILhd;ZI)V")
    private final void method616(int arg0, class68 arg1, boolean arg2, int arg3) {
        field1532++;
        if (arg2) {
            method622(-49);
        }
        if (arg0 == 1) {
            this.field1519 = this.method615((byte) 125, arg1.method613(true));
        } else if (arg0 == 2) {
            this.field1528 = arg1.method604((byte) 65);
        } else if (arg0 == 3) {
            this.field1528 = arg1.method569(26496);
            if (this.field1528 == 65535) {
                this.field1528 = -1;
                return;
            }
        } else {
            if (arg0 == 5) {
                this.field1518 = false;
            } else if (arg0 == 7) {
                this.field1531 = this.method615((byte) 123, arg1.method613(true));
                return;
            } else if (arg0 != 8 && arg0 == 9) {
                arg1.method569(26496);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
    public static final void method617(boolean arg0) {
        field1529++;
        for (class146 var1 = (class146) class124.field2501.method345(-114); var1 != null; var1 = (class146) class124.field2501.method348(13949)) {
            if (var1.field2874 != null) {
                class182.field3491.method1175(var1.field2874);
                var1.field2874 = null;
            }
            if (var1.field2845 != null) {
                class182.field3491.method1175(var1.field2845);
                var1.field2845 = null;
            }
        }
        if (arg0) {
            field1524 = null;
        }
        class124.field2501.method350(111);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method618(int arg0) {
        int var1 = class105.field2182;
        int var2 = class76.field1648;
        field1523++;
        int var3 = class152.field2967;
        int var4 = class79.field1694;
        int var5 = 6116423;
        class169.method1149(var1, var2, var3, var4, var5);
        class169.method1149(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class169.method1151(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class52.field1014.method122(class196.field3813, var1 + 3, var2 + 14, var5, -1);
        int var6 = class84.field1788;
        int var7 = class41.field814;
        if (arg0 != 6238) {
            field1524 = null;
        }
        for (int var8 = 0; var8 < class95.field1971; var8++) {
            int var9 = var2 + (-1 - var8 + class95.field1971) * 15 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var1 + var3 > var6 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class52.field1014.method122(class100.method810(var8, false), var1 + 3, var9, var10, 0);
        }
        class141.method1017(class152.field2967, class79.field1694, class76.field1648, class105.field2182, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILhd;I)V")
    public final void method619(int arg0, class68 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method604((byte) -128);
            if (var4 == 0) {
                if (arg2 != 16776960) {
                    method624(-48, 5, 67);
                }
                field1522++;
                return;
            }
            this.method616(var4, arg1, false, arg0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ)Leh;")
    public static final class47 method620(int arg0, int arg1, boolean arg2) {
        if (arg1 != 3) {
            method622(30);
        }
        field1521++;
        return class88.method722(arg0, arg2, (byte) 127, 10);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)V")
    public static void method621(boolean arg0) {
        field1516 = null;
        field1511 = null;
        field1527 = null;
        field1525 = null;
        field1520 = null;
        field1530 = null;
        field1514 = null;
        field1524 = null;
        if (!arg0) {
            method624(97, 34, 67);
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Z")
    public static final boolean method622(int arg0) {
        field1517++;
        long var1 = class201.method1313(29);
        int var3 = (int) (var1 - class59.field1143);
        if (var3 > 200) {
            var3 = 200;
        }
        class188.field3617 += var3;
        class59.field1143 = var1;
        if (class151.field2960 == 0 && class72.field1554 == 0 && class86.field1812 == 0 && class85.field1796 == 0) {
            return true;
        } else if (class140.field2743 == null) {
            return false;
        } else {
            try {
                if (class188.field3617 > 30000) {
                    throw new IOException();
                } else if (arg0 == 16711680) {
                    while (class72.field1554 < 20 && class85.field1796 > 0) {
                        class31 var4 = (class31) class51.field995.method1344(false);
                        class68 var5 = new class68(4);
                        var5.method609(1, (byte) -105);
                        var5.method585((int) var4.field2283, -224823824);
                        class140.field2743.method679(4, (byte) 94, var5.field1495, 0);
                        class40.field778.method1341(arg0 ^ 0xFF00FF86, var4.field2283, var4);
                        class72.field1554++;
                        class85.field1796--;
                    }
                    while (class151.field2960 < 20 && class86.field1812 > 0) {
                        class31 var6 = (class31) class151.field2961.method1352((byte) 120);
                        class68 var7 = new class68(4);
                        var7.method609(0, (byte) -117);
                        var7.method585((int) var6.field2283, arg0 ^ 0xF26675F0);
                        class140.field2743.method679(4, (byte) 87, var7.field1495, 0);
                        var6.method865(-13283);
                        class56.field1071.method1341(-101, var6.field2283, var6);
                        class86.field1812--;
                        class151.field2960++;
                    }
                    for (int var8 = 0; var8 < 100; var8++) {
                        int var9 = class140.field2743.method680(0);
                        if (var9 < 0) {
                            throw new IOException();
                        }
                        if (var9 == 0) {
                            break;
                        }
                        class188.field3617 = 0;
                        byte var10 = 0;
                        if (class31.field587 == null) {
                            var10 = 8;
                        } else if (class27.field524 == 0) {
                            var10 = 1;
                        }
                        if (var10 > 0) {
                            int var11 = var10 - class197.field3844.field1454;
                            if (var11 > var9) {
                                var11 = var9;
                            }
                            class140.field2743.method682(class197.field3844.field1454, class197.field3844.field1495, 17031, var11);
                            if (class136.field2664 != 0) {
                                for (int var12 = 0; var12 < var11; var12++) {
                                    class197.field3844.field1495[class197.field3844.field1454 + var12] = (byte) class136.method989(class197.field3844.field1495[class197.field3844.field1454 + var12], class136.field2664);
                                }
                            }
                            class197.field3844.field1454 += var11;
                            if (var10 > class197.field3844.field1454) {
                                break;
                            }
                            if (class31.field587 == null) {
                                class197.field3844.field1454 = 0;
                                int var13 = class197.field3844.method604((byte) 48);
                                int var14 = class197.field3844.method569(arg0 - 16685184);
                                int var15 = class197.field3844.method604((byte) -124);
                                long var16 = (long) ((var13 << 16) + var14);
                                int var18 = class197.field3844.method599((byte) 96);
                                class31 var19 = (class31) class40.field778.method1342(var16, (byte) -20);
                                class140.field2733 = true;
                                if (var19 == null) {
                                    var19 = (class31) class56.field1071.method1342(var16, (byte) -20);
                                    class140.field2733 = false;
                                }
                                if (var19 == null) {
                                    throw new IOException();
                                }
                                class31.field587 = var19;
                                int var20 = var15 == 0 ? 5 : 9;
                                class52.field1008 = new class68(var18 + var20 + class31.field587.field588);
                                class52.field1008.method609(var15, (byte) -112);
                                class52.field1008.method606(var18, -1424429928);
                                class27.field524 = 8;
                                class197.field3844.field1454 = 0;
                            } else if (class27.field524 == 0) {
                                if (class197.field3844.field1495[0] == -1) {
                                    class197.field3844.field1454 = 0;
                                    class27.field524 = 1;
                                } else {
                                    class31.field587 = null;
                                }
                            }
                        } else {
                            int var21 = class52.field1008.field1495.length - class31.field587.field588;
                            int var22 = 512 - class27.field524;
                            if (var22 > var21 - class52.field1008.field1454) {
                                var22 = var21 - class52.field1008.field1454;
                            }
                            if (var22 > var9) {
                                var22 = var9;
                            }
                            class140.field2743.method682(class52.field1008.field1454, class52.field1008.field1495, 17031, var22);
                            if (class136.field2664 != 0) {
                                for (int var23 = 0; var23 < var22; var23++) {
                                    class52.field1008.field1495[class52.field1008.field1454 + var23] = (byte) class136.method989(class52.field1008.field1495[class52.field1008.field1454 + var23], class136.field2664);
                                }
                            }
                            class27.field524 += var22;
                            class52.field1008.field1454 += var22;
                            if (class52.field1008.field1454 == var21) {
                                if (class31.field587.field2283 == 16711935L) {
                                    class204.field4006 = class52.field1008;
                                    for (int var24 = 0; var24 < 256; var24++) {
                                        class52 var25 = class184.field3516[var24];
                                        if (var25 != null) {
                                            class204.field4006.field1454 = var24 * 8 + 5;
                                            int var26 = class204.field4006.method599((byte) 96);
                                            int var27 = class204.field4006.method599((byte) 96);
                                            var25.method455(var26, var27, arg0 - 16711425);
                                        }
                                    }
                                } else {
                                    class119.field2410.reset();
                                    class119.field2410.update(class52.field1008.field1495, 0, var21);
                                    int var28 = (int) class119.field2410.getValue();
                                    if (class31.field587.field592 != var28) {
                                        try {
                                            class140.field2743.method678((byte) -92);
                                        } catch (Exception var30) {
                                        }
                                        class140.field2743 = null;
                                        class123.field2484++;
                                        class136.field2664 = (byte) (Math.random() * 255.0D + 1.0D);
                                        return false;
                                    }
                                    class123.field2484 = 0;
                                    class53.field1032 = 0;
                                    class31.field587.field589.method454((int) (class31.field587.field2283 & 0xFFFFL), class52.field1008.field1495, (class31.field587.field2283 & 0xFF0000L) == 16711680L, class140.field2733, arg0 - 16695056);
                                }
                                class31.field587.method885(3);
                                class52.field1008 = null;
                                if (class140.field2733) {
                                    class72.field1554--;
                                } else {
                                    class151.field2960--;
                                }
                                class31.field587 = null;
                                class27.field524 = 0;
                            } else {
                                if (class27.field524 != 512) {
                                    break;
                                }
                                class27.field524 = 0;
                            }
                        }
                    }
                    return true;
                } else {
                    return true;
                }
            } catch (IOException var31) {
                try {
                    class140.field2743.method678((byte) -99);
                } catch (Exception var29) {
                }
                class140.field2743 = null;
                class53.field1032++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lfd;II)V")
    public static final void method623(class52 arg0, int arg1, int arg2) {
        field1512++;
        if (class204.field4006 != null) {
            class204.field4006.field1454 = arg2 * 8 + 5;
            int var3 = class204.field4006.method599((byte) 96);
            int var4 = class204.field4006.method599((byte) 96);
            arg0.method455(var3, var4, 255);
            return;
        }
        if (arg1 != 26097) {
            method622(-100);
        }
        class73.method640(true, 255, 0, null, false, 255, (byte) 0);
        class184.field3516[arg2] = arg0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)Lwb;")
    public static final class200 method624(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 == null || var3.field2989 == null ? null : var3.field2989;
    }
}
