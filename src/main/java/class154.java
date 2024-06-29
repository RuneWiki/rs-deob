import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
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

@OriginalClass("client!wa")
public class class154 extends class130 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
    public static int[] field3330 = new int[2000];

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Z")
    public static boolean field3333 = false;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Lic;")
    public static class59 field3341 = class59.method433(0, "http:)4)4");

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field3328 = -1;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lic;")
    public static class59 field3349 = class59.method433(0, "<col=c0ff00>");

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field3352 = 0;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lic;")
    public static class59 field3337 = class59.method433(0, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "Lic;")
    public static class59 field3354 = class59.method433(0, "Cabbage");

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Llf;")
    private static class82 field3345 = new class82(64);

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lub;")
    public static class141 field3329;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Lmd;")
    public static class87 field3332;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3340;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3338;

    @OriginalMember(owner = "client!wa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3342;
        this.field3338 = arg0;
        arg0.setDimensions(super.field2921, super.field2926);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3340);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lud;IB)V")
    public static final void method1124(class143 arg0, int arg1, byte arg2) {
        ++field3353;
        if (arg2 >= 8) {
            while (true) {
                class16 var3 = (class16) class2.field31.method682(0);
                if (var3 == null) {
                    return;
                }
                boolean var4 = false;
                for (int var5 = 0; var3.field314 > var5; ++var5) {
                    if (var3.field321[var5] != null) {
                        if (var3.field321[var5].field252 == 2) {
                            var3.field316[var5] = -5;
                        }
                        if (~var3.field321[var5].field252 == -1) {
                            var4 = true;
                        }
                    }
                    if (var3.field304[var5] != null) {
                        if (~var3.field304[var5].field252 == -3) {
                            var3.field316[var5] = -6;
                        }
                        if (var3.field304[var5].field252 == 0) {
                            var4 = true;
                        }
                    }
                }
                if (var4) {
                    return;
                }
                arg0.method1072(arg1, -1);
                arg0.method1205(0, 8584);
                int var6 = arg0.field3457;
                arg0.method1195(var3.field320, 852);
                for (int var7 = 0; ~var3.field314 < ~var7; ++var7) {
                    if (~var3.field316[var7] != -1) {
                        arg0.method1205(var3.field316[var7], 8584);
                    } else {
                        try {
                            int var8 = var3.field308[var7];
                            if (var8 != 0) {
                                if (~var8 == -2) {
                                    Field var9 = (Field) var3.field321[var7].field254;
                                    var9.setInt((Object) null, var3.field313[var7]);
                                    arg0.method1205(0, 8584);
                                } else if (~var8 == -3) {
                                    Field var10 = (Field) var3.field321[var7].field254;
                                    int var11 = var10.getModifiers();
                                    arg0.method1205(0, 8584);
                                    arg0.method1195(var11, 852);
                                }
                            } else {
                                Field var12 = (Field) var3.field321[var7].field254;
                                int var13 = var12.getInt((Object) null);
                                arg0.method1205(0, 8584);
                                arg0.method1195(var13, 852);
                            }
                            if (~var8 != -4) {
                                if (~var8 == -5) {
                                    Method var14 = (Method) var3.field304[var7].field254;
                                    int var15 = var14.getModifiers();
                                    arg0.method1205(0, 8584);
                                    arg0.method1195(var15, 852);
                                }
                            } else {
                                Method var16 = (Method) var3.field304[var7].field254;
                                byte[][] var17 = var3.field309[var7];
                                Object[] var18 = new Object[var17.length];
                                for (int var19 = 0; ~var17.length < ~var19; ++var19) {
                                    ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                    var18[var19] = var20.readObject();
                                }
                                Object var21 = var16.invoke((Object) null, var18);
                                if (var21 == null) {
                                    arg0.method1205(0, 8584);
                                } else if (var21 instanceof Number) {
                                    arg0.method1205(1, 8584);
                                    arg0.method1201(((Number) var21).longValue(), (byte) 38);
                                } else if (var21 instanceof class59) {
                                    arg0.method1205(2, 8584);
                                    arg0.method1187(123, (class59) var21);
                                } else {
                                    arg0.method1205(4, 8584);
                                }
                            }
                        } catch (ClassNotFoundException var22) {
                            arg0.method1205(-10, 8584);
                        } catch (InvalidClassException var23) {
                            arg0.method1205(-11, 8584);
                        } catch (StreamCorruptedException var24) {
                            arg0.method1205(-12, 8584);
                        } catch (OptionalDataException var25) {
                            arg0.method1205(-13, 8584);
                        } catch (IllegalAccessException var26) {
                            arg0.method1205(-14, 8584);
                        } catch (IllegalArgumentException var27) {
                            arg0.method1205(-15, 8584);
                        } catch (InvocationTargetException var28) {
                            arg0.method1205(-16, 8584);
                        } catch (SecurityException var29) {
                            arg0.method1205(-17, 8584);
                        } catch (IOException var30) {
                            arg0.method1205(-18, 8584);
                        } catch (NullPointerException var31) {
                            arg0.method1205(-19, 8584);
                        } catch (Exception var32) {
                            arg0.method1205(-20, 8584);
                        } catch (Throwable var33) {
                            arg0.method1205(-21, 8584);
                        }
                    }
                }
                arg0.method1181(-31570, var6);
                arg0.method1215(-var6 + arg0.field3457, 118);
                var3.method929(103);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    private final synchronized void method1125(int arg0) {
        ++field3331;
        if (this.field3338 != null) {
            this.field3338.setPixels(0, 0, super.field2921, super.field2926, this.field3340, super.field2932, arg0, super.field2921);
            this.field3338.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Lga;")
    public static final class44 method1126(byte arg0, int arg1) {
        ++field3339;
        if (arg0 != 71) {
            field3341 = null;
        }
        class44 var2 = (class44) field3345.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class32.field854.method193(false, arg1, 8);
            class44 var4 = new class44();
            if (var3 != null) {
                var4.method338(arg0 ^ 69, new class157(var3));
            }
            field3345.method672(-30464, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3336;
        return this.field3338 == arg0;
    }

    @OriginalMember(owner = "client!wa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3348;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field3345 = null;
        field3337 = null;
        if (arg0 < -62) {
            field3341 = null;
            field3329 = null;
            field3330 = null;
            field3332 = null;
            field3349 = null;
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3335;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method855(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 32) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.method1128(true, arg4, arg2, arg5, arg3);
        ++field3347;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg5, arg2, arg3, arg4);
        arg1.drawImage(super.field2914, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method856(int arg0, Component arg1, int arg2, byte arg3) {
        super.field2921 = arg0;
        super.field2932 = new int[arg0 * arg2 + 1];
        ++field3343;
        super.field2926 = arg2;
        this.field3340 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2914 = arg1.createImage(this);
        if (arg3 > 54) {
            this.method1125(0);
            arg1.prepareImage(super.field2914, this);
            this.method1125(0);
            arg1.prepareImage(super.field2914, this);
            this.method1125(0);
            arg1.prepareImage(super.field2914, this);
            this.method999(-16);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method857(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field3346;
        this.method1125(arg1);
        arg2.drawImage(super.field2914, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!wa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3344;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3351;
        if (this.field3338 == arg0) {
            this.field3338 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIII)V")
    private final synchronized void method1128(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            ++field3334;
            if (this.field3338 != null) {
                this.field3338.setPixels(arg3, arg2, arg4, arg1, this.field3340, super.field2932, super.field2921 * arg2 + arg3, super.field2921);
                this.field3338.imageComplete(2);
            }
        }
    }
}
