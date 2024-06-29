import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class7 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lvh;")
    public static class108 field87;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[Lda;")
    public static class197[] field85;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
    public abstract int method38(byte arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method39(Component arg0, byte arg1);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field85 = null;
        field87 = null;
        if (arg0 > -97) {
            method43((byte) 89);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method41(int arg0, int arg1) {
        field92++;
        if (~arg0 == arg1 || !class63.field1095[arg0]) {
            return;
        }
        class84.field1518.method739(-22926, arg0);
        if (class115.field2068[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class115.field2068[arg0].length; var3++) {
            if (class115.field2068[arg0][var3] != null) {
                if (class115.field2068[arg0][var3].field812 == 2) {
                    var2 = false;
                } else {
                    class115.field2068[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class115.field2068[arg0] = null;
        }
        class63.field1095[arg0] = false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
    public static final void method42() {
        class153.field2571 = 0;
        label191: for (int var0 = 0; var0 < class165.field2701; var0++) {
            class158 var1 = class291.field4648[var0];
            if (class56.field980 != null) {
                for (int var2 = 0; var2 < class56.field980.length; var2++) {
                    if (class56.field980[var2] != -1000000 && (var1.field2635 <= class56.field980[var2] || var1.field2644 <= class56.field980[var2]) && (var1.field2657 <= class198.field3207[var2] || var1.field2647 <= class198.field3207[var2]) && (var1.field2657 >= class56.field975[var2] || var1.field2647 >= class56.field975[var2]) && (var1.field2658 <= class11.field155[var2] || var1.field2651 <= class11.field155[var2]) && (var1.field2658 >= class239.field3936[var2] || var1.field2651 >= class239.field3936[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2649 == 1) {
                int var3 = var1.field2656 + class151.field2536 - class184.field2994;
                if (var3 >= 0 && var3 <= class151.field2536 + class151.field2536) {
                    int var4 = var1.field2652 + class151.field2536 - class102.field1795;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2631 + class151.field2536 - class102.field1795;
                    if (var5 > class151.field2536 + class151.field2536) {
                        var5 = class151.field2536 + class151.field2536;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class176.field2892[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class50.field854 - var1.field2657;
                        if (var7 > 32) {
                            var1.field2655 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2655 = 2;
                            var7 = -var7;
                        }
                        var1.field2641 = (var1.field2658 - class199.field3272 << 8) / var7;
                        var1.field2646 = (var1.field2651 - class199.field3272 << 8) / var7;
                        var1.field2643 = (var1.field2635 - class210.field3554 << 8) / var7;
                        var1.field2654 = (var1.field2644 - class210.field3554 << 8) / var7;
                        class140.field2415[class153.field2571++] = var1;
                    }
                }
            } else if (var1.field2649 == 2) {
                int var8 = var1.field2652 + class151.field2536 - class102.field1795;
                if (var8 >= 0 && var8 <= class151.field2536 + class151.field2536) {
                    int var9 = var1.field2656 + class151.field2536 - class184.field2994;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2638 + class151.field2536 - class184.field2994;
                    if (var10 > class151.field2536 + class151.field2536) {
                        var10 = class151.field2536 + class151.field2536;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class176.field2892[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class199.field3272 - var1.field2658;
                        if (var12 > 32) {
                            var1.field2655 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2655 = 4;
                            var12 = -var12;
                        }
                        var1.field2645 = (var1.field2657 - class50.field854 << 8) / var12;
                        var1.field2632 = (var1.field2647 - class50.field854 << 8) / var12;
                        var1.field2643 = (var1.field2635 - class210.field3554 << 8) / var12;
                        var1.field2654 = (var1.field2644 - class210.field3554 << 8) / var12;
                        class140.field2415[class153.field2571++] = var1;
                    }
                }
            } else if (var1.field2649 == 4) {
                int var13 = var1.field2635 - class210.field3554;
                if (var13 > 128) {
                    int var14 = var1.field2652 + class151.field2536 - class102.field1795;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2631 + class151.field2536 - class102.field1795;
                    if (var15 > class151.field2536 + class151.field2536) {
                        var15 = class151.field2536 + class151.field2536;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2656 + class151.field2536 - class184.field2994;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2638 + class151.field2536 - class184.field2994;
                        if (var17 > class151.field2536 + class151.field2536) {
                            var17 = class151.field2536 + class151.field2536;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class176.field2892[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2655 = 5;
                            var1.field2645 = (var1.field2657 - class50.field854 << 8) / var13;
                            var1.field2632 = (var1.field2647 - class50.field854 << 8) / var13;
                            var1.field2641 = (var1.field2658 - class199.field3272 << 8) / var13;
                            var1.field2646 = (var1.field2651 - class199.field3272 << 8) / var13;
                            class140.field2415[class153.field2571++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public static final void method43(byte arg0) {
        field88++;
        if (class183.method1201(79) != 2) {
            return;
        }
        byte var1 = (byte) (class71.field1166 - 4 & 0xFF);
        int var2 = class71.field1166 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class158.field2648[var3][var2][var16] = var1;
            }
        }
        if (class176.field2886 == 3) {
            return;
        }
        if (arg0 >= -42) {
            method41(-99, 39);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class78.field1337[var4] = -1000000;
            class201.field3307[var4] = 1000000;
            class4.field46[var4] = 0;
            class196.field3176[var4] = 1000000;
            class217.field3665[var4] = 0;
        }
        if (class241.field3970 != 1) {
            int var15 = class10.method68(true, class176.field2886, class237.field3904, class56.field976);
            if ((var15 - class250.field4093) >= 800 || (class229.field3862[class176.field2886][class56.field976 >> 7][class237.field3904 >> 7] & 0x4) == 0) {
                return;
            }
            class211.method1415(class237.field3904 >> 7, class56.field976 >> 7, (byte) 121, false, 1, class79.field1367);
            return;
        }
        if ((class229.field3862[class176.field2886][class273.field4378.field1397 >> 7][class273.field4378.field1458 >> 7] & 0x4) != 0) {
            class211.method1415(class273.field4378.field1458 >> 7, class273.field4378.field1397 >> 7, (byte) 127, false, 0, class79.field1367);
        }
        if (class228.field3844 >= 310) {
            return;
        }
        int var5 = class237.field3904 >> 7;
        int var6 = class56.field976 >> 7;
        int var7 = class273.field4378.field1397 >> 7;
        int var8 = class273.field4378.field1458 >> 7;
        int var9;
        if (var6 >= var7) {
            var9 = var6 - var7;
        } else {
            var9 = var7 - var6;
        }
        int var10;
        if (var8 > var5) {
            var10 = var8 - var5;
        } else {
            var10 = var5 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -104 && var9 < 104 && var10 > -104 && var10 < 104) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var5 != var8) {
                    if (var8 > var5) {
                        var5++;
                    } else if (var5 > var8) {
                        var5--;
                    }
                    if ((class229.field3862[class176.field2886][var6][var5] & 0x4) != 0) {
                        class211.method1415(var5, var6, (byte) 121, false, 1, class79.field1367);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var7 > var6) {
                            var6++;
                        } else if (var7 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class229.field3862[class176.field2886][var6][var5] & 0x4) != 0) {
                            class211.method1415(var5, var6, (byte) 123, false, 1, class79.field1367);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = 32768;
            int var14 = var10 * 65536 / var9;
            while (var6 != var7) {
                if (var7 > var6) {
                    var6++;
                } else if (var6 > var7) {
                    var6--;
                }
                if ((class229.field3862[class176.field2886][var6][var5] & 0x4) != 0) {
                    class211.method1415(var5, var6, (byte) 119, false, 1, class79.field1367);
                    return;
                }
                var13 += var14;
                if (var13 >= 65536) {
                    if (var8 > var5) {
                        var5++;
                    } else if (var8 < var5) {
                        var5--;
                    }
                    var13 -= 65536;
                    if ((class229.field3862[class176.field2886][var6][var5] & 0x4) != 0) {
                        class211.method1415(var5, var6, (byte) 121, false, 1, class79.field1367);
                        return;
                    }
                }
            }
            return;
        }
        class254.method1684(-11, (Throwable) null, "RC: " + var6 + "," + var5 + " " + var7 + "," + var8 + " " + class126.field2206 + "," + class255.field4162);
        return;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([[II)V")
    public static final void method44(int[][] arg0, int arg1) {
        class167.field2735 = arg0;
        if (arg1 <= 105) {
            method42();
        }
        field86++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method45(boolean arg0) {
        field90++;
        int var1 = -1;
        if (arg0) {
            method41(-114, -38);
        }
        while (class157.field2624 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class280.field4458[var1];
            }
            class288 var3 = class105.field1874[var2];
            if (var3 != null) {
                class187.method1225(var3, 0, var3.method528(-113));
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method46(Component arg0, int arg1);
}
