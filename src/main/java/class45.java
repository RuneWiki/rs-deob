import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lhh;")
    public static class163 field756 = class137.method1065(" loggt sich ein)3", 17);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lhh;")
    public static class163 field762 = class137.method1065("::gc", 17);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field754;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[[[I")
    public static int[][][] field763;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIJILhh;)V")
    public static final void method331(int arg0, boolean arg1, int arg2, int arg3, long arg4, int arg5, class163 arg6) {
        field751++;
        class81 var8 = new class81(128);
        var8.method655(0, 10);
        var8.method631((int) (Math.random() * 99999.0D), -1);
        var8.method631(506, -1);
        var8.method651(-645765520, arg4);
        var8.method604((int) (Math.random() * 9.9999999E7D), 1543219568);
        var8.method654(17048, arg6);
        var8.method604((int) (Math.random() * 9.9999999E7D), 1543219568);
        var8.method631(class227.field4099, -1);
        var8.method655(0, arg5);
        var8.method655(0, arg2);
        var8.method604((int) (Math.random() * 9.9999999E7D), 1543219568);
        var8.method631(arg3, -1);
        var8.method631(arg0, -1);
        var8.method604((int) (Math.random() * 9.9999999E7D), 1543219568);
        var8.method650(0, class73.field1366, class29.field455);
        class191.field3499.field1541 = 0;
        class191.field3499.method655(0, 67);
        class191.field3499.method655(0, var8.field1541);
        class191.field3499.method638(0, 108, var8.field1562, var8.field1541);
        if (arg1) {
            method334((byte) 87, -67);
        }
        class75.field1403 = 0;
        class244.field4321 = -3;
        class31.field481 = 1;
        class58.field955 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field752++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg1;
        int var9 = var7 << 1;
        int var10 = arg1 << 1;
        int var11 = arg1 * arg1;
        int var12 = var7 << 2;
        int var13 = var11 - ((var10 - 1) * var9);
        int var14 = var11 << 1;
        int var15 = (1 - var10) * var7 + var14;
        int var16 = var11 << 2;
        int var17 = ((var6 << 1) + 3) * var14;
        int var18 = ((arg1 << 1) - 3) * var9;
        if (arg2 >= class182.field3344 && class201.field3593 >= arg2) {
            int var19 = class221.method1561(class127.field2465, (byte) -42, arg0 + arg3, class252.field4407);
            int var20 = class221.method1561(class127.field2465, (byte) -42, arg0 - arg3, class252.field4407);
            class227.method1585(var20, (byte) -66, arg4, class85.field1605[arg2], var19);
        }
        if (arg5 != -580324223) {
            method331(94, false, 22, -46, 66L, -72, (class163) null);
        }
        int var21 = (var6 + 1) * var16;
        int var22 = (arg1 - 1) * var12;
        while (var8 > 0) {
            var8--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var21;
                    var6++;
                    var15 += var17;
                    var17 += var16;
                    var21 += var16;
                }
            }
            if (var13 < 0) {
                var6++;
                var13 += var21;
                var21 += var16;
                var15 += var17;
                var17 += var16;
            }
            var13 += -var18;
            var18 -= var12;
            int var23 = arg2 - var8;
            var15 += -var22;
            int var24 = arg2 + var8;
            if (class182.field3344 <= var24 && var23 <= class201.field3593) {
                int var25 = class221.method1561(class127.field2465, (byte) -42, arg0 + var6, class252.field4407);
                int var26 = class221.method1561(class127.field2465, (byte) -42, arg0 - var6, class252.field4407);
                if (class182.field3344 <= var23) {
                    class227.method1585(var26, (byte) -66, arg4, class85.field1605[var23], var25);
                }
                if (class201.field3593 >= var24) {
                    class227.method1585(var26, (byte) -66, arg4, class85.field1605[var24], var25);
                }
            }
            var22 -= var12;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public static final boolean method333(boolean arg0) {
        field755++;
        long var1 = class7.method55(0);
        int var3 = (int) (var1 - class246.field4343);
        if (var3 > 200) {
            var3 = 200;
        }
        class246.field4343 = var1;
        class5.field101 += var3;
        if (!arg0) {
            method332(22, -15, 40, 29, 0, -80);
        }
        if (class77.field1447 == 0 && class116.field2200 == 0 && class20.field318 == 0 && class90.field1662 == 0) {
            return true;
        } else if (class23.field378 == null) {
            return false;
        } else {
            try {
                if (class5.field101 > 30000) {
                    throw new IOException();
                }
                while (class116.field2200 < 20 && class90.field1662 > 0) {
                    class46 var4 = (class46) class135.field2606.method1747((byte) 78);
                    class81 var5 = new class81(4);
                    var5.method655(0, 1);
                    var5.method613(95, (int) var4.field2641);
                    class23.field378.method1729(var5.field1562, 4, 0, 5000);
                    class214.field3909.method1741(var4, !arg0, var4.field2641);
                    class116.field2200++;
                    class90.field1662--;
                }
                while (class77.field1447 < 20 && class20.field318 > 0) {
                    class46 var6 = (class46) class20.field314.method468(-119);
                    class81 var7 = new class81(4);
                    var7.method655(0, 0);
                    var7.method613(-7, (int) var6.field2641);
                    class23.field378.method1729(var7.field1562, 4, 0, 5000);
                    var6.method1127(-24137);
                    class192.field3517.method1741(var6, !arg0, var6.field2641);
                    class77.field1447++;
                    class20.field318--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class23.field378.method1725(false);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class5.field101 = 0;
                    byte var10 = 0;
                    if (class77.field1446 == null) {
                        var10 = 8;
                    } else if (class182.field3340 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = 512 - class182.field3340;
                        int var12 = class85.field1606.field1562.length - class77.field1446.field767;
                        if (var11 > (var12 - class85.field1606.field1541)) {
                            var11 = var12 - class85.field1606.field1541;
                        }
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class23.field378.method1727(class85.field1606.field1562, (byte) -115, var11, class85.field1606.field1541);
                        if (class73.field1385 != 0) {
                            for (int var13 = 0; var13 < var11; var13++) {
                                class85.field1606.field1562[class85.field1606.field1541 + var13] = (byte) class46.method340(class85.field1606.field1562[class85.field1606.field1541 + var13], class73.field1385);
                            }
                        }
                        class182.field3340 += var11;
                        class85.field1606.field1541 += var11;
                        if (class85.field1606.field1541 == var12) {
                            if (class77.field1446.field2641 == 16711935L) {
                                class175.field3191 = class85.field1606;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class22 var16 = class67.field1140[var15];
                                    if (var16 != null) {
                                        class175.field3191.field1541 = var15 * 8 + 5;
                                        int var17 = class175.field3191.method620((byte) -82);
                                        int var18 = class175.field3191.method620((byte) -82);
                                        var16.method153(var18, var17, !arg0);
                                    }
                                }
                            } else {
                                class187.field3424.reset();
                                class187.field3424.update(class85.field1606.field1562, 0, var12);
                                int var14 = (int) class187.field3424.getValue();
                                if (class77.field1446.field768 != var14) {
                                    try {
                                        class23.field378.method1724(true);
                                    } catch (Exception var30) {
                                    }
                                    class17.field248++;
                                    class23.field378 = null;
                                    class73.field1385 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                class81.field1532 = 0;
                                class17.field248 = 0;
                                class77.field1446.field771.method148(false, (int) (class77.field1446.field2641 & 0xFFFFL), class6.field118, class85.field1606.field1562, (class77.field1446.field2641 & 0xFF0000L) == 16711680L);
                            }
                            class77.field1446.method1063(96);
                            if (class6.field118) {
                                class116.field2200--;
                            } else {
                                class77.field1447--;
                            }
                            class77.field1446 = null;
                            class182.field3340 = 0;
                            class85.field1606 = null;
                        } else {
                            if (class182.field3340 != 512) {
                                break;
                            }
                            class182.field3340 = 0;
                        }
                    } else {
                        int var19 = var10 - class176.field3222.field1541;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class23.field378.method1727(class176.field3222.field1562, (byte) -125, var19, class176.field3222.field1541);
                        if (class73.field1385 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class176.field3222.field1562[class176.field3222.field1541 + var20] = (byte) class46.method340(class176.field3222.field1562[class176.field3222.field1541 + var20], class73.field1385);
                            }
                        }
                        class176.field3222.field1541 += var19;
                        if (class176.field3222.field1541 < var10) {
                            break;
                        }
                        if (class77.field1446 == null) {
                            class176.field3222.field1541 = 0;
                            int var21 = class176.field3222.method622(true);
                            int var22 = class176.field3222.method658(96);
                            int var23 = class176.field3222.method622(true);
                            int var24 = class176.field3222.method620((byte) -82);
                            long var25 = (long) ((var21 << 16) + var22);
                            class46 var27 = (class46) class214.field3909.method1743(var25, !arg0);
                            class6.field118 = true;
                            if (var27 == null) {
                                var27 = (class46) class192.field3517.method1743(var25, false);
                                class6.field118 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class77.field1446 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class85.field1606 = new class81(var24 + class77.field1446.field767 + var28);
                            class85.field1606.method655(0, var23);
                            class85.field1606.method604(var24, 1543219568);
                            class182.field3340 = 8;
                            class176.field3222.field1541 = 0;
                        } else if (class182.field3340 == 0) {
                            if (class176.field3222.field1562[0] == -1) {
                                class182.field3340 = 1;
                                class176.field3222.field1541 = 0;
                            } else {
                                class77.field1446 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class23.field378.method1724(true);
                } catch (Exception var29) {
                }
                class81.field1532++;
                class23.field378 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
    public static final int method334(byte arg0, int arg1) {
        field758++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 > -93) {
            return -10;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method335(byte arg0) {
        field754 = null;
        field756 = null;
        field762 = null;
        if (arg0 == 7) {
            field763 = null;
        }
    }
}
