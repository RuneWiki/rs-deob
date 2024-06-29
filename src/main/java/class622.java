import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class622 extends class7 implements ImageProducer {

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "[F")
    public static float[] field8466 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lta;")
    public static class301 field8452;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8464;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field8449;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field8448;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field8458;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public final void method43(byte arg0, int arg1, Graphics arg2, int arg3) {
        this.method3405(true);
        if (arg0 != 83) {
            this.field8449 = null;
        }
        ++field8455;
        arg2.drawImage(this.field8449, arg3, arg1, this.field8464);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lfca;Z)V")
    public static final void method3400(int arg0, class188[] arg1, boolean arg2) {
        if (!arg2) {
            for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
                class188 var4 = arg1[var3];
                if (var4 != null) {
                    if (var4.field2304 == 0) {
                        if (var4.field2352 != null) {
                            method3400(arg0, var4.field2352, false);
                        }
                        class524 var5 = (class524) class54.field742.method2506(27, (long) var4.field2387);
                        if (var5 != null) {
                            class175.method1162(arg0, 2, var5.field7256);
                        }
                    }
                    if (arg0 == 0 && var4.field2333 != null) {
                        class425 var6 = new class425();
                        var6.field5913 = var4.field2333;
                        var6.field5911 = var4;
                        class317.method2051(var6);
                    }
                    if (arg0 == 1 && var4.field2364 != null) {
                        if (~var4.field2361 <= -1) {
                            class188 var7 = class557.method3117(var4.field2387, (byte) 71);
                            if (var7 == null || var7.field2352 == null || var7.field2352.length <= var4.field2361 || var7.field2352[var4.field2361] != var4) {
                                continue;
                            }
                        }
                        class425 var8 = new class425();
                        var8.field5911 = var4;
                        var8.field5913 = var4.field2364;
                        class317.method2051(var8);
                    }
                }
            }
            ++field8459;
        }
    }

    @OriginalMember(owner = "client!qc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field8465;
        this.field8458 = arg0;
        arg0.setDimensions(super.field66, super.field65);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field8448);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method3401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -114 / ((-63 - arg4) / 49);
        ++field8453;
        if (this.field8458 != null) {
            this.field8458.setPixels(arg2, arg3, arg1, arg0, this.field8448, super.field64, super.field66 * arg3 + arg2, super.field66);
            this.field8458.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method42(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8457;
        if (arg2 < -11) {
            this.method3401(arg4, arg3, arg1, arg5, -6);
            Shape var7 = arg0.getClip();
            arg0.clipRect(arg1, arg5, arg3, arg4);
            arg0.drawImage(this.field8449, 0, 0, this.field8464);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field8454;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method3402(String arg0, int arg1) {
        ++field8461;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 >= -110) {
            return null;
        } else {
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                char var5 = arg0.charAt(var4);
                if (~var5 < -1 && var5 < 128 || ~var5 <= -161 && ~var5 >= -256) {
                    var3[var4] = (byte) var5;
                } else if (~var5 == -8365) {
                    var3[var4] = -128;
                } else if (var5 == 8218) {
                    var3[var4] = -126;
                } else if (var5 == 402) {
                    var3[var4] = -125;
                } else if (~var5 != -8223) {
                    if (~var5 == -8231) {
                        var3[var4] = -123;
                    } else if (var5 == 8224) {
                        var3[var4] = -122;
                    } else if (~var5 == -8226) {
                        var3[var4] = -121;
                    } else if (~var5 != -711) {
                        if (var5 != 8240) {
                            if (~var5 == -353) {
                                var3[var4] = -118;
                            } else if (~var5 != -8250) {
                                if (var5 != 338) {
                                    if (~var5 != -382) {
                                        if (~var5 == -8217) {
                                            var3[var4] = -111;
                                        } else if (var5 == 8217) {
                                            var3[var4] = -110;
                                        } else if (~var5 == -8221) {
                                            var3[var4] = -109;
                                        } else if (var5 != 8221) {
                                            if (var5 != 8226) {
                                                if (var5 == 8211) {
                                                    var3[var4] = -106;
                                                } else if (~var5 == -8213) {
                                                    var3[var4] = -105;
                                                } else if (var5 == 732) {
                                                    var3[var4] = -104;
                                                } else if (var5 == 8482) {
                                                    var3[var4] = -103;
                                                } else if (~var5 == -354) {
                                                    var3[var4] = -102;
                                                } else if (~var5 != -8251) {
                                                    if (var5 == 339) {
                                                        var3[var4] = -100;
                                                    } else if (~var5 == -383) {
                                                        var3[var4] = -98;
                                                    } else if (~var5 == -377) {
                                                        var3[var4] = -97;
                                                    } else {
                                                        var3[var4] = 63;
                                                    }
                                                } else {
                                                    var3[var4] = -101;
                                                }
                                            } else {
                                                var3[var4] = -107;
                                            }
                                        } else {
                                            var3[var4] = -108;
                                        }
                                    } else {
                                        var3[var4] = -114;
                                    }
                                } else {
                                    var3[var4] = -116;
                                }
                            } else {
                                var3[var4] = -117;
                            }
                        } else {
                            var3[var4] = -119;
                        }
                    } else {
                        var3[var4] = -120;
                    }
                } else {
                    var3[var4] = -124;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field8451;
        return this.field8458 == arg0;
    }

    @OriginalMember(owner = "client!qc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field8456;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method47(Canvas arg0, int arg1) {
        this.field8464 = arg0;
        ++field8460;
        if (arg1 != 22509) {
            this.method43((byte) -42, 101, (Graphics) null, -96);
        }
        super.field66 = this.field8464.getSize().width;
        super.field65 = this.field8464.getSize().height;
        super.field64 = new int[super.field66 * super.field65];
        this.field8448 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field8449 = this.field8464.createImage(this);
        this.method3405(true);
        this.field8464.prepareImage(this.field8449, this.field8464);
        this.method3405(true);
        this.field8464.prepareImage(this.field8449, this.field8464);
        this.method3405(true);
        this.field8464.prepareImage(this.field8449, this.field8464);
    }

    @OriginalMember(owner = "client!qc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field8458 == arg0) {
            this.field8458 = null;
        }
        ++field8463;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method3403(int arg0) {
        if (arg0 > -80) {
            method3402((String) null, 112);
        }
        field8452 = null;
        field8466 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method3404(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8462;
        if (arg4 > -17) {
            field8452 = null;
        }
        if (arg0 >= 1 && ~arg3 <= -2 && class588.field8082 + -2 >= arg0 && ~arg3 >= ~(class12.field113 + -2)) {
            int var9 = arg8;
            if (arg8 < 3 && class313.method2026(arg3, 3550, arg0)) {
                var9 = arg8 + 1;
            }
            if (!class72.field935.method1861(class161.field2038, 38) && !class548.method3081(var9, arg0, arg3, class160.field2028, -16623)) {
                return;
            }
            if (class145.field1841 == null) {
                return;
            }
            class44.field571.method591(arg8, class624.field8489[arg8], arg3, class9.field103, arg0, arg1, 1);
            if (arg5 >= 0) {
                boolean var10 = class72.field935.field6500;
                class72.field935.field6500 = true;
                class44.field571.method584(arg5, class624.field8489[arg8], false, arg3, var9, arg2, class9.field103, arg0, arg8, arg6, arg7);
                class72.field935.field6500 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    private final synchronized void method3405(boolean arg0) {
        ++field8450;
        if (this.field8458 != null) {
            this.field8458.setPixels(0, 0, super.field66, super.field65, this.field8448, super.field64, 0, super.field66);
            if (arg0) {
                this.field8458.imageComplete(2);
            }
        }
    }
}
