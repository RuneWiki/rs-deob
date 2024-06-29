import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Calendar;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class23 extends class239 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Ljava/util/Calendar;")
    public static Calendar field459 = Calendar.getInstance();

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lgj;")
    public static class226 field464 = new class226(64);

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lsb;")
    public static class98 field466 = class47.method368("Musik)2Engine vorbereitet)3", 0);

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Lsb;")
    public static class98 field469 = class47.method368("null", 0);

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lq;")
    public static class148 field473 = null;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "[I")
    public static int[] field476 = new int[25];

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "[I")
    public static int[] field472 = new int[2];

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Lsb;")
    public static class98 field475 = class47.method368("overlay2", 0);

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "Lsb;")
    public static class98 field480 = class47.method368("<col=ff7000>", 0);

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lq;")
    public static class148 field470;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lui;")
    public static class73 field471;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field457;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field453;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[Lkb;")
    public static class247[] field467;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method241(boolean arg0, Graphics arg1, int arg2, int arg3) {
        this.method247(-89);
        arg1.drawImage(super.field4118, arg2, arg3, this);
        if (arg0) {
            field470 = null;
        }
        ++field460;
    }

    @OriginalMember(owner = "client!wc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field454;
        return this.field453 == arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsb;Lsb;Lsb;BI)V")
    public static final void method242(class98 arg0, class98 arg1, class98 arg2, byte arg3, int arg4) {
        if (arg3 != -58) {
            field467 = null;
        }
        ++field465;
        class15.method127(-1, 0, arg1, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[Lqb;ZI[BIBIII)V")
    public static final void method243(int arg0, int arg1, class72[] arg2, boolean arg3, int arg4, byte[] arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        ++field478;
        if (!arg3) {
            for (int var11 = 0; var11 < 8; ++var11) {
                for (int var12 = 0; ~var12 > -9; ++var12) {
                    if (arg0 + var11 > 0 && ~(arg0 - -var11) > -104 && ~(arg6 + var12) < -1 && arg6 + var12 < 103) {
                        arg2[arg9].field1175[arg0 - -var11][arg6 + var12] = class214.method1427(arg2[arg9].field1175[arg0 - -var11][arg6 + var12], -16777217);
                    }
                }
            }
        }
        class216 var13 = new class216(arg5);
        byte var14;
        if (arg3) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (arg7 > 51) {
            for (int var15 = 0; var15 < var14; ++var15) {
                for (int var16 = 0; var16 < 64; ++var16) {
                    for (int var17 = 0; var17 < 64; ++var17) {
                        if (~arg4 == ~var15 && ~var16 <= ~arg8 && arg8 + 8 > var16 && ~var17 <= ~arg1 && var17 < arg1 + 8) {
                            class36.method304(0, arg6 - -class208.method1400(7 & var17, arg10, 7 & var16, false), 99, arg0 + class167.method1191(1, arg10, var16 & 7, var17 & 7), var13, arg10, arg3, 0, arg9);
                        } else {
                            class36.method304(0, -1, 107, -1, var13, 0, arg3, 0, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method244(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method249((byte) 99, arg1, arg5, arg2, arg4);
        if (arg0 >= -50) {
            this.method250(-99, (byte) 105, (Component) null, -123);
        }
        ++field463;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg2, arg1, arg5);
        arg3.drawImage(super.field4118, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!wc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field451;
        if (this.field453 == arg0) {
            this.field453 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field461;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method245(int arg0) {
        field464 = null;
        field470 = null;
        field475 = null;
        field472 = null;
        field469 = null;
        field476 = null;
        field459 = null;
        field467 = null;
        field480 = null;
        field471 = null;
        field473 = null;
        if (arg0 < 102) {
            field466 = null;
        }
        field466 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class88[] var7 = class262.field4597;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class88 var9 = var7[var8];
            if (var9 != null && ~var9.field1559 == -3) {
                class190.method1311((-class182.field3143 + var9.field1567 << 7) + var9.field1562, (-class189.field3277 + var9.field1564 << 7) - -var9.field1565, arg3, arg0 >> 1, arg2, var9.field1555 * 2, arg4 >> 1, 60);
                if (~class88.field1563 < 0 && class236.field4071 % 20 < 10) {
                    class14.field276[var9.field1558].method618(class88.field1563 + -12 + arg1, class143.field2520 + arg5 + -28);
                }
            }
        }
        if (arg6 <= 85) {
            method248(22, -25);
        }
        ++field477;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    private final synchronized void method247(int arg0) {
        if (arg0 >= -67) {
            this.removeConsumer((ImageConsumer) null);
        }
        ++field450;
        if (this.field453 != null) {
            this.field453.setPixels(0, 0, super.field4121, super.field4116, this.field457, super.field4107, 0, super.field4121);
            this.field453.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method248(int arg0, int arg1) {
        class70.field1121 = -1;
        class70.field1121 = -1;
        ++field458;
        if (arg0 != 19537) {
            method248(-38, -116);
        }
        if (~arg1 == -38) {
            class148.field2726 = 3.0F;
        } else if (arg1 != 50) {
            if (arg1 == 75) {
                class148.field2726 = 6.0F;
            } else {
                class148.field2726 = 8.0F;
            }
        } else {
            class148.field2726 = 4.0F;
        }
    }

    @OriginalMember(owner = "client!wc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field449;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method249(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field462;
        if (arg0 != 99) {
            this.field453 = null;
        }
        if (this.field453 != null) {
            this.field453.setPixels(arg4, arg3, arg1, arg2, this.field457, super.field4107, super.field4121 * arg3 + arg4, super.field4121);
            this.field453.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field455;
        this.field453 = arg0;
        arg0.setDimensions(super.field4121, super.field4116);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field457);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field468;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method250(int arg0, byte arg1, Component arg2, int arg3) {
        super.field4121 = arg3;
        super.field4107 = new int[arg0 * arg3 + 1];
        super.field4116 = arg0;
        this.field457 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 < 0) {
            ++field452;
            super.field4118 = arg2.createImage(this);
            this.method247(-69);
            arg2.prepareImage(super.field4118, this);
            this.method247(-106);
            arg2.prepareImage(super.field4118, this);
            this.method247(-81);
            arg2.prepareImage(super.field4118, this);
            this.method1631(0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static final void method251(int arg0) {
        ++field456;
        if (~class121.field2219 < -2) {
            --class121.field2219;
            class68.field1099 = class186.field3214;
        }
        if (~class214.field3642 < -1) {
            --class214.field3642;
        }
        if (class101.field1789) {
            class101.field1789 = false;
            class139.method1050(-84);
        } else {
            for (int var1 = 0; ~var1 > -101 && class98.method751(-33); ++var1) {
            }
            if (class249.field4370 == 30) {
                class74.method546(4, class237.field4084, 163);
                Object var2 = class130.field2311.field4394;
                synchronized (class130.field2311.field4394) {
                    if (!class185.field3181) {
                        class130.field2311.field4399 = 0;
                    } else if (class48.field810 != 0 || class130.field2311.field4399 >= 40) {
                        class237.field4084.method490(211, -91);
                        ++class203.field3465;
                        class237.field4084.method1477(0, -26755);
                        int var3 = class237.field4084.field3728;
                        int var4 = 0;
                        for (int var5 = 0; ~class130.field2311.field4399 < ~var5 && -var3 + class237.field4084.field3728 < 240; ++var5) {
                            int var6 = class130.field2311.field4401[var5];
                            boolean var7 = false;
                            ++var4;
                            int var8 = class130.field2311.field4400[var5];
                            if (var8 >= 0) {
                                if (var8 > 65534) {
                                    var8 = 65534;
                                }
                            } else {
                                var8 = 0;
                            }
                            if (~var6 > -1) {
                                var6 = 0;
                            } else if (var6 > 65534) {
                                var6 = 65534;
                            }
                            if (~class130.field2311.field4400[var5] == 0 && ~class130.field2311.field4401[var5] == 0) {
                                var6 = -1;
                                var8 = -1;
                                var7 = true;
                            }
                            if (class156.field2846 == var6 && ~class81.field1436 == ~var8) {
                                if (class186.field3219 < 2047) {
                                    ++class186.field3219;
                                }
                            } else {
                                int var9 = var8 - class81.field1436;
                                int var10 = -class156.field2846 + var6;
                                class81.field1436 = var8;
                                class156.field2846 = var6;
                                if (~class186.field3219 > -9 && var10 >= -32 && var10 <= 31 && var9 >= -32 && ~var9 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class237.field4084.method1470((byte) -122, (class186.field3219 << 12) + (var10 << 6) + var9);
                                    class186.field3219 = 0;
                                } else if (class186.field3219 < 32 && var10 >= -128 && ~var10 >= -128 && var9 >= -128 && ~var9 >= -128) {
                                    var9 += 128;
                                    class237.field4084.method1477(class186.field3219 + 128, -26755);
                                    var10 += 128;
                                    class237.field4084.method1470((byte) -122, (var10 << 8) + var9);
                                    class186.field3219 = 0;
                                } else if (class186.field3219 < 32) {
                                    class237.field4084.method1477(192 - -class186.field3219, -26755);
                                    if (!var7) {
                                        class237.field4084.method1456(var6 | var8 << 16, -23438);
                                    } else {
                                        class237.field4084.method1456(Integer.MIN_VALUE, -23438);
                                    }
                                    class186.field3219 = 0;
                                } else {
                                    class237.field4084.method1470((byte) -122, class186.field3219 + 57344);
                                    if (var7) {
                                        class237.field4084.method1456(Integer.MIN_VALUE, -23438);
                                    } else {
                                        class237.field4084.method1456(var8 << 16 | var6, -23438);
                                    }
                                    class186.field3219 = 0;
                                }
                            }
                        }
                        class237.field4084.method1476(-var3 + class237.field4084.field3728, -103);
                        if (~class130.field2311.field4399 < ~var4) {
                            class130.field2311.field4399 -= var4;
                            for (int var11 = 0; class130.field2311.field4399 > var11; ++var11) {
                                class130.field2311.field4401[var11] = class130.field2311.field4401[var4 + var11];
                                class130.field2311.field4400[var11] = class130.field2311.field4400[var11 - -var4];
                            }
                        } else {
                            class130.field2311.field4399 = 0;
                        }
                    }
                }
                if (class48.field810 != 0) {
                    long var12 = (class85.field1499 - class138.field2464) / 50L;
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    int var14 = class139.field2471;
                    class138.field2464 = class85.field1499;
                    ++class60.field985;
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (var14 > 65535) {
                        var14 = 65535;
                    }
                    byte var15 = 0;
                    if (~class48.field810 == -3) {
                        var15 = 1;
                    }
                    int var16 = class250.field4384;
                    class237.field4084.method490(196, -57);
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -65536) {
                        var16 = 65535;
                    }
                    int var17 = (int) var12;
                    class237.field4084.method1470((byte) -122, var17 | var15 << 15);
                    class237.field4084.method1453(var14 | var16 << 16, -29263);
                }
                if (class212.field3618 > 0) {
                    --class212.field3618;
                }
                if (class107.field1915[96] || class107.field1915[97] || class107.field1915[98] || class107.field1915[99]) {
                    class52.field844 = true;
                }
                if (class52.field844 && class212.field3618 <= 0) {
                    ++class140.field2474;
                    class212.field3618 = 20;
                    class52.field844 = false;
                    class237.field4084.method490(44, -121);
                    class237.field4084.method1493(class243.field4219, false);
                    class237.field4084.method1493(class113.field2002, false);
                }
                if (class120.field2157 && !class69.field1101) {
                    ++class153.field2796;
                    class69.field1101 = true;
                    class237.field4084.method490(142, -55);
                    class237.field4084.method1477(1, -26755);
                }
                if (!class120.field2157 && class69.field1101) {
                    class69.field1101 = false;
                    ++class153.field2796;
                    class237.field4084.method490(142, -59);
                    class237.field4084.method1477(0, -26755);
                }
                if (!class224.field3865) {
                    ++class16.field309;
                    class237.field4084.method490(94, -80);
                    class237.field4084.method1453(class97.method697(false), -29263);
                    class224.field3865 = true;
                }
                class120.method900((byte) 11);
                if (~class249.field4370 == -31) {
                    class239.method1632(110);
                    class155.method1129((byte) 124);
                    ++class134.field2383;
                    if (~class134.field2383 < -751) {
                        class139.method1050(-115);
                    } else {
                        class45.method356(true);
                        class148.method1088(true);
                        class154.method1121((byte) 111);
                        if (class106.field1901 != null) {
                            class62.method456((byte) -43);
                        }
                        for (int var18 = class110.method834((byte) 99, true); ~var18 != 0; var18 = class110.method834((byte) 101, false)) {
                            class141.method1057(var18, 76);
                            class102.field1821[class214.method1427(class253.field4430++, 31)] = var18;
                        }
                        int var19 = 53 % ((-58 - arg0) / 60);
                        for (class134 var20 = class4.method18((byte) 65); var20 != null; var20 = class4.method18((byte) 95)) {
                            int var21 = var20.method1012(0);
                            int var22 = var20.method1010(false);
                            if (~var21 == -2) {
                                class253.field4433[var22] = var20.field2371;
                                class232.field3989[class214.method1427(31, class80.field1413++)] = var22;
                            } else if (var21 == 2) {
                                class97.field1670[var22] = var20.field2377;
                                class83.field1460[class214.method1427(31, class184.field3162++)] = var22;
                            }
                        }
                        if (class108.field1932 != 0) {
                            class51.field836 += 20;
                            if (class51.field836 >= 400) {
                                class108.field1932 = 0;
                            }
                        }
                        ++class199.field3418;
                        if (class85.field1501 != null) {
                            ++class75.field1321;
                            if (class75.field1321 >= 15) {
                                class72.method512(class85.field1501, 2);
                                class85.field1501 = null;
                            }
                        }
                        if (class181.field3128 != null) {
                            class72.method512(class181.field3128, 2);
                            ++class191.field3308;
                            if (~(class232.field3990 + 5) > ~class75.field1322 || ~class75.field1322 > ~(class232.field3990 + -5) || ~(class198.field3409 + 5) > ~class199.field3426 || ~(class198.field3409 + -5) < ~class199.field3426) {
                                class252.field4419 = true;
                            }
                            if (class81.field1433 == 0) {
                                if (class252.field4419 && class191.field3308 >= 5) {
                                    if (field470 == class181.field3128 && ~class228.field3919 != ~class227.field3913) {
                                        ++class26.field504;
                                        byte var23 = 0;
                                        class148 var24 = class181.field3128;
                                        if (~class166.field2966 == -2 && var24.field2691 == 206) {
                                            var23 = 1;
                                        }
                                        if (~var24.field2632[class227.field3913] >= -1) {
                                            var23 = 0;
                                        }
                                        if (class45.method359(-53, client.method761(var24))) {
                                            int var25 = class227.field3913;
                                            int var26 = class228.field3919;
                                            var24.field2632[var25] = var24.field2632[var26];
                                            var24.field2612[var25] = var24.field2612[var26];
                                            var24.field2632[var26] = -1;
                                            var24.field2612[var26] = 0;
                                        } else if (~var23 == -2) {
                                            int var27 = class227.field3913;
                                            int var28 = class228.field3919;
                                            while (~var27 != ~var28) {
                                                if (var27 >= var28) {
                                                    if (var28 < var27) {
                                                        var24.method1098(var28, var28 - -1, (byte) 123);
                                                        ++var28;
                                                    }
                                                } else {
                                                    var24.method1098(var28, var28 + -1, (byte) 95);
                                                    --var28;
                                                }
                                            }
                                        } else {
                                            var24.method1098(class228.field3919, class227.field3913, (byte) 125);
                                        }
                                        class237.field4084.method490(87, -52);
                                        class237.field4084.method1444(var23, (byte) -105);
                                        class237.field4084.method1470((byte) -122, class227.field3913);
                                        class237.field4084.method1456(class181.field3128.field2728, -23438);
                                        class237.field4084.method1460(class228.field3919, 16851);
                                    }
                                } else if ((class164.field2953 == 1 || class233.method1599((byte) 96, class226.field3894 - 1)) && ~class226.field3894 < -3) {
                                    class92.method676(0);
                                } else if (~class226.field3894 < -1) {
                                    class144.method1070((byte) -79);
                                }
                                class181.field3128 = null;
                                class48.field810 = 0;
                                class75.field1321 = 10;
                            }
                        }
                        class141.field2492 = null;
                        class101.field1787 = false;
                        class85.field1488 = 0;
                        class153.field2804 = false;
                        class148 var29 = class98.field1674;
                        class148 var30 = class34.field586;
                        class34.field586 = null;
                        class98.field1674 = null;
                        while (class205.method1386((byte) -122) && ~class85.field1488 > -129) {
                            class176.field3067[class85.field1488] = class45.field760;
                            class191.field3312[class85.field1488] = class52.field839;
                            ++class85.field1488;
                        }
                        class106.field1901 = null;
                        if (~class232.field3992 != 0) {
                            class226.method1562(class121.field2227, false, 0, 0, class232.field3992, class180.field3111, 0, 0);
                        }
                        ++class186.field3214;
                        while (true) {
                            class28 var31;
                            class148 var32;
                            class148 var33;
                            do {
                                var31 = (class28) class135.field2395.method372(63);
                                if (var31 == null) {
                                    while (true) {
                                        class28 var34;
                                        class148 var35;
                                        class148 var36;
                                        do {
                                            var34 = (class28) class54.field871.method372(63);
                                            if (var34 == null) {
                                                while (true) {
                                                    class28 var37;
                                                    class148 var38;
                                                    class148 var39;
                                                    do {
                                                        var37 = (class28) class88.field1554.method372(63);
                                                        if (var37 == null) {
                                                            if (class144.field2537 && class106.field1901 == null) {
                                                                class144.field2537 = false;
                                                            }
                                                            if (class199.field3427 != null) {
                                                                class136.method1021((byte) 115);
                                                            }
                                                            if (class130.field2312 > 0 && class107.field1915[82] && class107.field1915[81] && ~class107.field1912 != -1) {
                                                                int var40 = -class107.field1912 + class265.field4640;
                                                                if (~var40 > -1) {
                                                                    var40 = 0;
                                                                } else if (~var40 < -4) {
                                                                    var40 = 3;
                                                                }
                                                                class115.method857(121, var40, class182.field3143 - -class163.field2943.field4491[0], class189.field3277 - -class163.field2943.field4501[0]);
                                                            }
                                                            if (~class200.field3435 != 0) {
                                                                int var41 = class200.field3435;
                                                                int var42 = class4.field47;
                                                                if (~class130.field2312 < -1 && class107.field1915[82] && class107.field1915[81]) {
                                                                    class115.method857(108, class265.field4640, class182.field3143 + var42, class189.field3277 - -var41);
                                                                } else {
                                                                    boolean var43 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 0, 0, class163.field2943.field4501[0], true, 0, var41, var42);
                                                                    if (var43) {
                                                                        class82.field1449 = class250.field4384;
                                                                        class228.field3923 = class139.field2471;
                                                                        class108.field1932 = 1;
                                                                        class51.field836 = 0;
                                                                    }
                                                                }
                                                                class200.field3435 = -1;
                                                            }
                                                            class250.method1737(-1);
                                                            if (class98.field1674 != var29) {
                                                                if (var29 != null) {
                                                                    class72.method512(var29, 2);
                                                                }
                                                                if (class98.field1674 != null) {
                                                                    class72.method512(class98.field1674, 2);
                                                                }
                                                            }
                                                            if (class34.field586 != var30 && class147.field2569 == class140.field2481) {
                                                                if (var30 != null) {
                                                                    class72.method512(var30, 2);
                                                                }
                                                                if (class34.field586 != null) {
                                                                    class72.method512(class34.field586, 2);
                                                                }
                                                            }
                                                            if (class34.field586 != null) {
                                                                if (class140.field2481 < class147.field2569) {
                                                                    ++class140.field2481;
                                                                    if (class147.field2569 == class140.field2481) {
                                                                        class72.method512(class34.field586, 2);
                                                                    }
                                                                }
                                                            } else if (~class140.field2481 < -1) {
                                                                --class140.field2481;
                                                            }
                                                            if (~class207.field3549 != -2) {
                                                                if (class207.field3549 != 2) {
                                                                    class261.method1787(8);
                                                                } else {
                                                                    class130.method986(1000);
                                                                }
                                                            } else {
                                                                class158.method1145((byte) 79);
                                                            }
                                                            for (int var44 = 0; var44 < 5; ++var44) {
                                                                int var10002 = class190.field3281[var44]++;
                                                            }
                                                            int var45 = class177.method1233(-3865);
                                                            int var46 = class101.method783((byte) -79);
                                                            if (~var45 < -4501 && ~var46 < -4501) {
                                                                class214.field3642 = 250;
                                                                class176.method1229(4000, false);
                                                                ++class202.field3445;
                                                                class237.field4084.method490(11, -119);
                                                            }
                                                            ++class145.field2551;
                                                            ++class206.field3517;
                                                            ++class86.field1514;
                                                            if (~class86.field1514 < -501) {
                                                                class86.field1514 = 0;
                                                                int var47 = (int) (Math.random() * 8.0D);
                                                                if (~(4 & var47) == -5) {
                                                                    class115.field2067 += class45.field757;
                                                                }
                                                                if (~(var47 & 1) == -2) {
                                                                    class26.field503 += class138.field2447;
                                                                }
                                                                if ((2 & var47) == 2) {
                                                                    class49.field820 += class95.field1644;
                                                                }
                                                            }
                                                            if (~class145.field2551 < -501) {
                                                                int var48 = (int) (Math.random() * 8.0D);
                                                                if ((2 & var48) == 2) {
                                                                    class146.field2557 += class108.field1935;
                                                                }
                                                                if ((1 & var48) == 1) {
                                                                    class135.field2396 += class69.field1102;
                                                                }
                                                                class145.field2551 = 0;
                                                            }
                                                            if (~class115.field2067 > 39) {
                                                                class45.field757 = 1;
                                                            }
                                                            if (~class26.field503 > 49) {
                                                                class138.field2447 = 2;
                                                            }
                                                            if (class26.field503 > 50) {
                                                                class138.field2447 = -2;
                                                            }
                                                            if (~class115.field2067 < -41) {
                                                                class45.field757 = -1;
                                                            }
                                                            if (class146.field2557 < -20) {
                                                                class108.field1935 = 1;
                                                            }
                                                            if (class135.field2396 < -60) {
                                                                class69.field1102 = 2;
                                                            }
                                                            if (class146.field2557 > 10) {
                                                                class108.field1935 = -1;
                                                            }
                                                            if (class135.field2396 > 60) {
                                                                class69.field1102 = -2;
                                                            }
                                                            if (~class49.field820 > 54) {
                                                                class95.field1644 = 2;
                                                            }
                                                            if (class49.field820 > 55) {
                                                                class95.field1644 = -2;
                                                            }
                                                            if (~class206.field3517 < -51) {
                                                                ++class261.field4579;
                                                                class237.field4084.method490(237, -74);
                                                            }
                                                            class129.method978((byte) 102);
                                                            try {
                                                                if (class46.field774 != null && class237.field4084.field3728 > 0) {
                                                                    class46.field774.method788(true, 0, class237.field4084.field3728, class237.field4084.field3706);
                                                                    class237.field4084.field3728 = 0;
                                                                    class206.field3517 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var49) {
                                                                class139.method1050(-94);
                                                                return;
                                                            }
                                                        }
                                                        var38 = var37.field517;
                                                        if (~var38.field2651 > -1) {
                                                            break;
                                                        }
                                                        var39 = class62.method455(-854073200, var38.field2650);
                                                    } while (var39 == null || var39.field2751 == null || var38.field2651 >= var39.field2751.length || var39.field2751[var38.field2651] != var38);
                                                    class192.method1327(var37, 200000);
                                                }
                                            }
                                            var35 = var34.field517;
                                            if (var35.field2651 < 0) {
                                                break;
                                            }
                                            var36 = class62.method455(-854073200, var35.field2650);
                                        } while (var36 == null || var36.field2751 == null || var36.field2751.length <= var35.field2651 || var36.field2751[var35.field2651] != var35);
                                        class192.method1327(var34, 200000);
                                    }
                                }
                                var32 = var31.field517;
                                if (var32.field2651 < 0) {
                                    break;
                                }
                                var33 = class62.method455(-854073200, var32.field2650);
                            } while (var33 == null || var33.field2751 == null || var32.field2651 >= var33.field2751.length || var33.field2751[var32.field2651] != var32);
                            class192.method1327(var31, 200000);
                        }
                    }
                }
            }
        }
    }
}
