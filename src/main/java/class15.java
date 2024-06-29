import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class11 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "Lkd;")
    public static class73 field456 = class126.method1070((byte) -66, "redstone1");

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Lkd;")
    private static class73 field451 = class126.method1070((byte) -66, "Enter object name");

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "Z")
    public static boolean field459 = false;

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Lkd;")
    public static class73 field460 = class126.method1070((byte) -66, "Titelbild geladen)3");

    @OriginalMember(owner = "client!c", name = "zb", descriptor = "Lkd;")
    public static class73 field467 = class126.method1070((byte) -66, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!c", name = "Cb", descriptor = "Lkd;")
    public static class73 field470 = class126.method1070((byte) -66, " loggt sich aus)3");

    @OriginalMember(owner = "client!c", name = "Ab", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lkd;")
    public static class73 field476 = field451;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!c", name = "Db", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "Lw;")
    public static class148 field458;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field457;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field462;

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "Z")
    public static boolean field474;

    @OriginalMember(owner = "client!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field463;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method119(int arg0) {
        field458 = null;
        field460 = null;
        field467 = null;
        if (arg0 != -1) {
            field476 = null;
        }
        field456 = null;
        field470 = null;
        field476 = null;
        field451 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        ++field473;
        if (arg0 > -27) {
            method119(27);
        }
        if (class105.field2615 == 1) {
            if (~class103.field2570 <= -7 && ~class103.field2570 >= -107 && class42.field1134 >= 467 && class42.field1134 <= 499) {
                class133.field3342 = (class133.field3342 + 1) % 4;
                class74.field1913 = true;
                ++class36.field988;
                class132.field3304 = true;
                class121.field3079.method1215(-98, 161);
                class121.field3079.method956((byte) 10, class133.field3342);
                class121.field3079.method956((byte) 10, class25.field711);
                class121.field3079.method956((byte) 10, class13.field410);
            }
            if (~class103.field2570 <= -136 && ~class103.field2570 >= -236 && class42.field1134 >= 467 && class42.field1134 <= 499) {
                class25.field711 = (class25.field711 + 1) % 3;
                class74.field1913 = true;
                class132.field3304 = true;
                ++class36.field988;
                class121.field3079.method1215(116, 161);
                class121.field3079.method956((byte) 10, class133.field3342);
                class121.field3079.method956((byte) 10, class25.field711);
                class121.field3079.method956((byte) 10, class13.field410);
            }
            if (class103.field2570 >= 273 && class103.field2570 <= 373 && ~class42.field1134 <= -468 && class42.field1134 <= 499) {
                ++class36.field988;
                class132.field3304 = true;
                class13.field410 = (class13.field410 + 1) % 3;
                class74.field1913 = true;
                class121.field3079.method1215(108, 161);
                class121.field3079.method956((byte) 10, class133.field3342);
                class121.field3079.method956((byte) 10, class25.field711);
                class121.field3079.method956((byte) 10, class13.field410);
            }
            if (~class103.field2570 <= -413 && class103.field2570 <= 512 && class42.field1134 >= 467 && class42.field1134 <= 499) {
                if (class52.field1393 != -1) {
                    class74.method647((byte) -63, class9.field298, class121.field3094, 0);
                    if (class24.field695 != null) {
                        class74.method647((byte) -27, class9.field298, class24.field695, 0);
                        return;
                    }
                    return;
                }
                client.method181((byte) 3);
                if (~class86.field2169 != 0) {
                    class50.field1316 = false;
                    class9.field312 = class9.field298;
                    class57.field1529 = class52.field1393 = class86.field2169;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method121(byte arg0) {
        if (class71.field1795 != null) {
            class81 var1 = class71.field1795;
            synchronized (class71.field1795) {
                class71.field1795 = null;
            }
        }
        ++field472;
        if (arg0 != -45) {
            method122((byte) -78, (class1) null);
        }
    }

    @OriginalMember(owner = "client!c", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field466;
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLa;)La;")
    public static final class1 method122(byte arg0, class1 arg1) {
        int var2 = 115 / ((39 - arg0) / 49);
        ++field475;
        class1 var3 = class37.method299(3490, arg1);
        if (var3 == null) {
            var3 = arg1.field9;
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwb;BI)V")
    public static final void method123(class150 arg0, byte arg1, int arg2) {
        int var3 = 67 / ((27 - arg1) / 32);
        ++field452;
        while (true) {
            class57 var4 = (class57) class76.field1944.method514((byte) -79);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; ~var6 > ~var4.field1524; ++var6) {
                if (var4.field1515[var6] != null) {
                    if (var4.field1515[var6].field1695 == 2) {
                        var4.field1518[var6] = -5;
                    }
                    if (~var4.field1515[var6].field1695 == -1) {
                        var5 = true;
                    }
                }
                if (var4.field1528[var6] != null) {
                    if (~var4.field1528[var6].field1695 == -3) {
                        var4.field1518[var6] = -6;
                    }
                    if (var4.field1528[var6].field1695 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1215(122, arg2);
            arg0.method956((byte) 10, 0);
            int var7 = arg0.field2816;
            arg0.method937(-1370716840, var4.field1523);
            for (int var8 = 0; var4.field1524 > var8; ++var8) {
                if (var4.field1518[var8] != 0) {
                    arg0.method956((byte) 10, var4.field1518[var8]);
                } else {
                    try {
                        int var9 = var4.field1509[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field1515[var8].field1693;
                            int var11 = var10.getInt((Object) null);
                            arg0.method956((byte) 10, 0);
                            arg0.method937(-1370716840, var11);
                        } else if (~var9 == -2) {
                            Field var12 = (Field) var4.field1515[var8].field1693;
                            var12.setInt((Object) null, var4.field1522[var8]);
                            arg0.method956((byte) 10, 0);
                        } else if (~var9 == -3) {
                            Field var13 = (Field) var4.field1515[var8].field1693;
                            int var14 = var13.getModifiers();
                            arg0.method956((byte) 10, 0);
                            arg0.method937(-1370716840, var14);
                        }
                        if (~var9 != -4) {
                            if (~var9 == -5) {
                                Method var21 = (Method) var4.field1528[var8].field1693;
                                int var22 = var21.getModifiers();
                                arg0.method956((byte) 10, 0);
                                arg0.method937(-1370716840, var22);
                            }
                        } else {
                            Method var15 = (Method) var4.field1528[var8].field1693;
                            byte[][] var16 = var4.field1526[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; ~var18 > ~var16.length; ++var18) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 != null) {
                                if (var20 instanceof Number) {
                                    arg0.method956((byte) 10, 1);
                                    arg0.method967(true, ((Number) var20).longValue());
                                } else if (!(var20 instanceof class73)) {
                                    arg0.method956((byte) 10, 4);
                                } else {
                                    arg0.method956((byte) 10, 2);
                                    arg0.method953(true, (class73) var20);
                                }
                            } else {
                                arg0.method956((byte) 10, 0);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg0.method956((byte) 10, -10);
                    } catch (InvalidClassException var24) {
                        arg0.method956((byte) 10, -11);
                    } catch (StreamCorruptedException var25) {
                        arg0.method956((byte) 10, -12);
                    } catch (OptionalDataException var26) {
                        arg0.method956((byte) 10, -13);
                    } catch (IllegalAccessException var27) {
                        arg0.method956((byte) 10, -14);
                    } catch (IllegalArgumentException var28) {
                        arg0.method956((byte) 10, -15);
                    } catch (InvocationTargetException var29) {
                        arg0.method956((byte) 10, -16);
                    } catch (SecurityException var30) {
                        arg0.method956((byte) 10, -17);
                    } catch (IOException var31) {
                        arg0.method956((byte) 10, -18);
                    } catch (NullPointerException var32) {
                        arg0.method956((byte) 10, -19);
                    } catch (Exception var33) {
                        arg0.method956((byte) 10, -20);
                    } catch (Throwable var34) {
                        arg0.method956((byte) 10, -21);
                    }
                }
            }
            arg0.method950(var7, -1013441432);
            arg0.method968(-var7 + arg0.field2816, -112);
            var4.method1147((byte) -35);
        }
    }

    @OriginalMember(owner = "client!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field471;
        return this.field462 == arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
    public final void method96(int arg0, Component arg1, byte arg2, int arg3) {
        ++field477;
        super.field328 = arg0;
        super.field327 = arg3;
        int var5 = 19 / ((arg2 - -36) / 47);
        super.field326 = new int[arg0 * arg3 + 1];
        this.field457 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field322 = arg1.createImage(this);
        this.method126(124);
        arg1.prepareImage(super.field322, this);
        this.method126(125);
        arg1.prepareImage(super.field322, this);
        this.method126(127);
        arg1.prepareImage(super.field322, this);
        this.method100(true);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method124(int arg0) {
        ++field450;
        short var1 = 256;
        if (~class115.field2888 < -1) {
            for (int var2 = 0; var2 < 256; ++var2) {
                if (~class115.field2888 < -769) {
                    class119.field3056[var2] = class105.method837(class53.field1404[var2], -class115.field2888 + 1024, class45.field1186[var2], 75);
                } else if (class115.field2888 > 256) {
                    class119.field3056[var2] = class53.field1404[var2];
                } else {
                    class119.field3056[var2] = class105.method837(class45.field1186[var2], -class115.field2888 + 256, class53.field1404[var2], class79.method679(arg0, 9493));
                }
            }
        } else if (field468 <= 0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                class119.field3056[var3] = class45.field1186[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (~field468 < -769) {
                    class119.field3056[var4] = class105.method837(class52.field1389[var4], 1024 - field468, class45.field1186[var4], arg0 + -9634);
                } else if (field468 > 256) {
                    class119.field3056[var4] = class52.field1389[var4];
                } else {
                    class119.field3056[var4] = class105.method837(class45.field1186[var4], -field468 + 256, class52.field1389[var4], 4);
                }
            }
        }
        if (arg0 != 9508) {
            field461 = -59;
        }
        int var5 = 6885;
        int var6 = 0;
        class17.method143(0, 9, 128, var1 + 7);
        class77.field1964.method841(0, 0);
        class17.method135();
        for (int var7 = 1; var1 + -1 > var7; ++var7) {
            int var20 = (-var7 + var1) * class118.field3020[var7] / var1;
            int var21 = var20 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var23 = class55.field1487[var6++];
                if (var23 != 0) {
                    int var25 = class89.field2297.field326[var5];
                    int var26 = -var23 + 256;
                    int var27 = class119.field3056[var23];
                    class89.field2297.field326[var5++] = class149.method1189(class149.method1189(var27, 65280) * var23 - -(class149.method1189(65280, var25) * var26), 16711680) + class149.method1189(-16711936, class149.method1189(var25, 16711935) * var26 + class149.method1189(16711935, var27) * var23) >> 8;
                } else {
                    ++var5;
                }
            }
            var5 += 637 - -var21;
        }
        class17.method143(637, 9, 765, var1 + 7);
        class111.field2760.method841(382, 0);
        int var8 = 0;
        class17.method135();
        int var9 = 7546;
        for (int var10 = 1; var10 < var1 + -1; ++var10) {
            int var11 = (-var10 + var1) * class118.field3020[var10] / var1;
            int var12 = 103 - var11;
            int var13 = var9 + var11;
            for (int var14 = 0; var14 < var12; ++var14) {
                int var15 = class55.field1487[var8++];
                if (~var15 == -1) {
                    ++var13;
                } else {
                    int var16 = 256 - var15;
                    int var18 = class119.field3056[var15];
                    int var19 = class89.field2297.field326[var13];
                    class89.field2297.field326[var13++] = class149.method1189(class149.method1189(var18, 16711935) * var15 + class149.method1189(16711935, var19) * var16, -16711936) + class149.method1189(16711680, class149.method1189(65280, var18) * var15 - -(class149.method1189(65280, var19) * var16)) >> 8;
                }
            }
            var9 = -var12 + 765 + -var11 + var13;
            var8 += -var12 + 128;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method98(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field453;
        if (arg2 != -16961) {
            field476 = null;
        }
        this.method126(124);
        arg3.drawImage(super.field322, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field462 = arg0;
        arg0.setDimensions(super.field328, super.field327);
        ++field465;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field457);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field454;
    }

    @OriginalMember(owner = "client!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field462 == arg0) {
            this.field462 = null;
        }
        ++field469;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZB)V")
    public static final void method125(boolean arg0, byte arg1) {
        ++field464;
        if (class73.field1901.field2277 >> 7 == class38.field1037 && class73.field1901.field2264 >> 7 == class34.field925) {
            class38.field1037 = 0;
        }
        int var2 = class63.field1661;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        int var4 = 20 % ((arg1 - 86) / 37);
        while (var2 > var3) {
            class118 var5;
            int var6;
            if (!arg0) {
                var5 = class42.field1141[class14.field435[var3]];
                var6 = class14.field435[var3] << 14;
            } else {
                var6 = 33538048;
                var5 = class73.field1901;
            }
            if (var5 != null && var5.method87((byte) -121)) {
                int var7 = var5.field2277 >> 7;
                var5.field3008 = false;
                if ((class77.field1971 && class63.field1661 > 50 || ~class63.field1661 < -201) && !arg0 && var5.field2258 == var5.field2245) {
                    var5.field3008 = true;
                }
                int var8 = var5.field2264 >> 7;
                if (~var7 <= -1 && var7 < 104 && var8 >= 0 && ~var8 > -105) {
                    if (var5.field2998 != null && var5.field3023 <= class49.field1308 && ~var5.field3022 < ~class49.field1308) {
                        var5.field3008 = false;
                        var5.field2991 = class70.method585(class11.field320, var5.field2277, var5.field2264, (byte) 74);
                        class34.field923.method77(class11.field320, var5.field2277, var5.field2264, var5.field2991, 60, var5, var5.field2265, var6, var5.field3004, var5.field2999, var5.field3012, var5.field2995);
                    } else {
                        label91: {
                            if ((127 & var5.field2277) == 64 && ~(127 & var5.field2264) == -65) {
                                if (class50.field1351[var7][var8] == class42.field1139) {
                                    break label91;
                                }
                                class50.field1351[var7][var8] = class42.field1139;
                            }
                            var5.field2991 = class70.method585(class11.field320, var5.field2277, var5.field2264, (byte) -63);
                            class34.field923.method48(class11.field320, var5.field2277, var5.field2264, var5.field2991, 60, var5, var5.field2265, var6, var5.field2291);
                        }
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    private final synchronized void method126(int arg0) {
        ++field455;
        if (this.field462 != null) {
            this.field462.setPixels(0, 0, super.field328, super.field327, this.field457, super.field326, 0, super.field328);
            if (arg0 <= 119) {
                this.isConsumer((ImageConsumer) null);
            }
            this.field462.imageComplete(2);
        }
    }
}
