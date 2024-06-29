import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class99 {

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lr;")
    public static class118 field3258 = class153.method1136(82, "Einloggen");

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Lr;")
    private static class118 field3257 = class153.method1136(102, "Members only world");

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3261 = -1;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Lr;")
    public static class118 field3260 = field3257;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Lr;")
    public static class118 field3259 = class153.method1136(108, "<)4col>");

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lr;")
    private static class118 field3263 = class153.method1136(107, " is already on your friend list)3");

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Lr;")
    public static class118 field3253 = field3263;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lr;")
    private static class118 field3265 = class153.method1136(111, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lr;")
    public static class118 field3266 = field3265;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Lr;")
    public class118 field3264;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field3263 = null;
        field3257 = null;
        field3259 = null;
        field3253 = null;
        field3266 = null;
        field3265 = null;
        field3258 = null;
        field3260 = null;
        if (arg0 != 0) {
            method1076(-77);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)Z")
    public static final boolean method1077(byte arg0) {
        field3262++;
        int var1 = 127 % ((-arg0 - 63) / 59);
        long var2 = class120.method945(20794);
        int var4 = (int) (var2 - class83.field1984);
        if (var4 > 200) {
            var4 = 200;
        }
        class83.field1984 = var2;
        class159.field3661 += var4;
        if (class34.field847 == 0 && class27.field656 == 0 && class133.field3041 == 0 && class56.field1316 == 0) {
            return true;
        } else if (class89.field2151 == null) {
            return false;
        } else {
            try {
                if (class159.field3661 > 30000) {
                    throw new IOException();
                }
                while (class27.field656 < 20 && class56.field1316 > 0) {
                    class31 var5 = (class31) class115.field2672.method296(0);
                    class105 var6 = new class105(4);
                    var6.method800(84, 1);
                    var6.method798(104, (int) var5.field2295);
                    class89.field2151.method409((byte) -107, var6.field2405, 0, 4);
                    class72.field1675.method288(var5, var5.field2295, (byte) -91);
                    class27.field656++;
                    class56.field1316--;
                }
                while (class34.field847 < 20 && class133.field3041 > 0) {
                    class31 var7 = (class31) class74.field1799.method1232(false);
                    class105 var8 = new class105(4);
                    var8.method800(100, 0);
                    var8.method798(-118, (int) var7.field2295);
                    class89.field2151.method409((byte) -94, var8.field2405, 0, 4);
                    var7.method962(102);
                    class32.field808.method288(var7, var7.field2295, (byte) -91);
                    class133.field3041--;
                    class34.field847++;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class89.field2151.method406(-4);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    byte var11 = 0;
                    if (class151.field3374 == null) {
                        var11 = 8;
                    } else if (class151.field3380 == 0) {
                        var11 = 1;
                    }
                    class159.field3661 = 0;
                    if (var11 > 0) {
                        int var12 = var11 - class33.field826.field2404;
                        if (var10 < var12) {
                            var12 = var10;
                        }
                        class89.field2151.method402(class33.field826.field2405, class33.field826.field2404, (byte) -62, var12);
                        if (class74.field1825 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class33.field826.field2405[class33.field826.field2404 + var13] = (byte) class47.method392(class33.field826.field2405[class33.field826.field2404 + var13], class74.field1825);
                            }
                        }
                        class33.field826.field2404 += var12;
                        if (var11 > class33.field826.field2404) {
                            break;
                        }
                        if (class151.field3374 == null) {
                            class33.field826.field2404 = 0;
                            int var14 = class33.field826.method831((byte) 76);
                            int var15 = class33.field826.method838((byte) 5);
                            int var16 = class33.field826.method831((byte) 76);
                            int var17 = class33.field826.method821((byte) 100);
                            long var18 = (long) ((var14 << 16) + var15);
                            class31 var20 = (class31) class72.field1675.method297(var18, -1);
                            class48.field1148 = true;
                            if (var20 == null) {
                                var20 = (class31) class32.field808.method297(var18, -1);
                                class48.field1148 = false;
                            }
                            if (var20 == null) {
                                throw new IOException();
                            }
                            class151.field3374 = var20;
                            int var21 = var16 == 0 ? 5 : 9;
                            class53.field1265 = new class105(var17 + var21 + class151.field3374.field788);
                            class53.field1265.method800(110, var16);
                            class53.field1265.method811(var17, 2073135696);
                            class33.field826.field2404 = 0;
                            class151.field3380 = 8;
                        } else if (class151.field3380 == 0) {
                            if (class33.field826.field2405[0] == -1) {
                                class33.field826.field2404 = 0;
                                class151.field3380 = 1;
                            } else {
                                class151.field3374 = null;
                            }
                        }
                    } else {
                        int var22 = class53.field1265.field2405.length - class151.field3374.field788;
                        int var23 = 512 - class151.field3380;
                        if (var23 > var22 - class53.field1265.field2404) {
                            var23 = var22 - class53.field1265.field2404;
                        }
                        if (var10 < var23) {
                            var23 = var10;
                        }
                        class89.field2151.method402(class53.field1265.field2405, class53.field1265.field2404, (byte) -62, var23);
                        if (class74.field1825 != 0) {
                            for (int var24 = 0; var24 < var23; var24++) {
                                class53.field1265.field2405[class53.field1265.field2404 + var24] = (byte) class47.method392(class53.field1265.field2405[class53.field1265.field2404 + var24], class74.field1825);
                            }
                        }
                        class151.field3380 += var23;
                        class53.field1265.field2404 += var23;
                        if (class53.field1265.field2404 == var22) {
                            if (class151.field3374.field2295 == 16711935L) {
                                class25.field615 = class53.field1265;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class68 var26 = class44.field1047[var25];
                                    if (var26 != null) {
                                        class25.field615.field2404 = var25 * 8 + 5;
                                        int var27 = class25.field615.method821((byte) 53);
                                        int var28 = class25.field615.method821((byte) 68);
                                        var26.method579(var27, var28, (byte) 109);
                                    }
                                }
                            } else {
                                class19.field467.reset();
                                class19.field467.update(class53.field1265.field2405, 0, var22);
                                int var29 = (int) class19.field467.getValue();
                                if (class151.field3374.field786 != var29) {
                                    try {
                                        class89.field2151.method408((byte) 120);
                                    } catch (Exception var31) {
                                    }
                                    class89.field2151 = null;
                                    class74.field1825 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class9.field181++;
                                    return false;
                                }
                                class9.field181 = 0;
                                class9.field205 = 0;
                                class151.field3374.field785.method581((byte) -108, (class151.field3374.field2295 & 0xFF0000L) == 16711680L, class53.field1265.field2405, (int) (class151.field3374.field2295 & 0xFFFFL), class48.field1148);
                            }
                            class151.field3374.method768(-1);
                            class53.field1265 = null;
                            class151.field3374 = null;
                            class151.field3380 = 0;
                            if (class48.field1148) {
                                class27.field656--;
                            } else {
                                class34.field847--;
                            }
                        } else {
                            if (class151.field3380 != 512) {
                                break;
                            }
                            class151.field3380 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    class89.field2151.method408((byte) 110);
                } catch (Exception var30) {
                }
                class9.field205++;
                class89.field2151 = null;
                return false;
            }
        }
    }
}
