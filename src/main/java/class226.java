import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class226 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public static int[] field3903 = new int[32];

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Leb;")
    public static class230 field3901 = class68.method589(0, "hint_headicons");

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Leb;")
    public static class230 field3906 = class68.method589(0, "");

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Leb;")
    public static class230 field3905 = class68.method589(0, ":chalreq:");

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
    public static boolean field3904 = false;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Leb;")
    public static class230 field3898 = class68.method589(0, "Opened titlescreen)3");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public abstract void method1557(int arg0);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        field3900++;
        int var1 = class210.field3676 * 128 + 64;
        int var2 = class89.field1566 * 128 + 64;
        int var3 = class37.method333(var1, 1637367879, class124.field2174, var2) - class272.field4802;
        if (class13.field264 >= 100) {
            class176.field3099 = class89.field1566 * 128 + 64;
            class77.field1403 = class210.field3676 * 128 + 64;
            class263.field4681 = class37.method333(class77.field1403, 1637367879, class124.field2174, class176.field3099) - class272.field4802;
        } else {
            if (class263.field4681 < var3) {
                class263.field4681 += (var3 - class263.field4681) * class13.field264 / 1000 + class178.field3123;
                if (class263.field4681 > var3) {
                    class263.field4681 = var3;
                }
            }
            if (class263.field4681 > var3) {
                class263.field4681 -= (class263.field4681 - var3) * class13.field264 / 1000 + class178.field3123;
                if (var3 > class263.field4681) {
                    class263.field4681 = var3;
                }
            }
            if (class77.field1403 < var1) {
                class77.field1403 += (var1 - class77.field1403) * class13.field264 / 1000 + class178.field3123;
                if (class77.field1403 > var1) {
                    class77.field1403 = var1;
                }
            }
            if (class176.field3099 < var2) {
                class176.field3099 += (var2 - class176.field3099) * class13.field264 / 1000 + class178.field3123;
                if (class176.field3099 > var2) {
                    class176.field3099 = var2;
                }
            }
            if (class176.field3099 > var2) {
                class176.field3099 -= (class176.field3099 - var2) * class13.field264 / 1000 + class178.field3123;
                if (var2 > class176.field3099) {
                    class176.field3099 = var2;
                }
            }
            if (var1 < class77.field1403) {
                class77.field1403 -= class178.field3123 + ((class77.field1403 - var1) * class13.field264 / 1000);
                if (class77.field1403 < var1) {
                    class77.field1403 = var1;
                }
            }
        }
        int var4 = class164.field2924 * 128 + 64;
        int var5 = class14.field283 * 128 + 64;
        int var6 = class37.method333(var4, 1637367879, class124.field2174, var5) - class273.field4808;
        int var7 = var6 - class263.field4681;
        int var8 = var4 - class77.field1403;
        if (arg0 > -82) {
            field3904 = true;
        }
        int var9 = var5 - class176.field3099;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (class111.field2004 < var11) {
            class111.field2004 += (var11 - class111.field2004) * class31.field576 / 1000 + class76.field1376;
            if (var11 < class111.field2004) {
                class111.field2004 = var11;
            }
        }
        int var13 = var12 - class248.field4397;
        if (var11 < class111.field2004) {
            class111.field2004 -= (class111.field2004 - var11) * class31.field576 / 1000 + class76.field1376;
            if (var11 > class111.field2004) {
                class111.field2004 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class248.field4397 += class76.field1376 + (class31.field576 * var13 / 1000);
            class248.field4397 &= 0x7FF;
        }
        if (var13 < 0) {
            class248.field4397 -= -var13 * class31.field576 / 1000 + class76.field1376;
            class248.field4397 &= 0x7FF;
        }
        int var14 = var12 - class248.field4397;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class248.field4397 = var12;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class87.method698(arg1, arg3, arg1 + arg4, arg2 + arg3);
        class87.method705(arg1, arg3, arg4, arg2, 0);
        field3899++;
        if (class85.field1495 < 100) {
            return;
        }
        if (class246.field4379 == null || class246.field4379.field1458 != arg4 || class246.field4379.field1463 != arg2) {
            class10 var5 = new class10(arg4, arg2);
            class87.method710(var5.field165, arg4, arg2);
            class243.method1695(class237.field4094, -125, arg2, arg4, 0, 0, 0, class249.field4417, 0);
            class246.field4379 = var5;
            class251.field4499.method1281(19116);
        }
        class246.field4379.method112(arg1, arg3);
        int var6 = class155.field2758 * arg4 / class237.field4094 + arg1;
        int var7 = arg3 + (class204.field3607 * arg2 / class249.field4417);
        int var8 = class217.field3748 * arg2 / class249.field4417;
        int var9 = class135.field2435 * arg4 / class237.field4094;
        class87.method701(var6, var7, var9, var8, 16711680, 128);
        if (arg0 != 6823) {
            field3904 = true;
        }
        class87.method713(var6, var7, var9, var8, 16711680);
        if (class159.field2849 <= 0 || class159.field2849 % 10 >= 5) {
            return;
        }
        for (class155 var10 = (class155) class141.field2534.method839(128); var10 != null; var10 = (class155) class141.field2534.method834((byte) 82)) {
            if (class96.field1734 == var10.field2763) {
                int var11 = arg1 + (var10.field2770 * arg4 / class237.field4094);
                int var12 = var10.field2766 * arg2 / class249.field4417 + arg3;
                class87.method705(var11 - 2, var12 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V")
    public static final void method1560(byte arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class178.field3140; var3++) {
            class37 var4 = class206.method1446(var3, 4);
            if (var4 != null) {
                int var5 = var4.field695;
                if (var5 >= 0 && !class3.field15.method728(1, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field691 >= 0) {
                    int var6 = var4.field691;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class3.field20[class172.method1261(arg0 - 117, 96, var8)];
                } else if (var5 >= 0) {
                    var9 = class3.field20[class172.method1261(123, 96, class3.field15.method729(126, var5))];
                } else if (var4.field685 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field685;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class3.field20[class172.method1261(-37, 96, var12)];
                }
                class28.field519[var3 + 1] = var9;
            }
        }
        if (arg0 != 60) {
            method1563((byte) 56);
        }
        field3908++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)I")
    public abstract int method1561(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
    public static final void method1562(int arg0, boolean arg1) {
        field3895++;
        class110.field1975 = new int[104];
        class194.field3452 = new int[arg0];
        class160.field2864 = new int[104];
        class249.field4437 = new int[104];
        class81.field1464 = 99;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class127.field2220 = new byte[var2][104][104];
        class209.field3650 = new byte[var2][105][105];
        class157.field2813 = new byte[var2][104][104];
        class158.field2818 = new byte[var2][104][104];
        class139.field2482 = new byte[var2][104][104];
        class268.field4763 = new int[var2][105][105];
        class54.field941 = new int[104];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        field3901 = null;
        if (arg0 <= 50) {
            field3906 = null;
        }
        field3898 = null;
        field3905 = null;
        field3906 = null;
        field3903 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Lfi;")
    public static final class108 method1564(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class108 var4 = var3.field4056;
            var3.field4056 = null;
            return var4;
        }
    }
}
