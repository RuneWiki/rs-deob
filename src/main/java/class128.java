import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class128 extends class336 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field1999 = 500;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field2009 = -1;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lgf;")
    public static class140 field2004;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lak;")
    public static class172 field1997;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1995;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2011;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lib;IIIIIIIZ)V", line = 9)
    public static final void method926(class31 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class298.field4704;
        int var11;
        int var12 = var11 = (arg7 << 7) - class172.field2866;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class110.field1642[arg1][arg6][arg7] - class165.field2753;
        int var18 = class110.field1642[arg1][arg6 + 1][arg7] - class165.field2753;
        int var19 = class110.field1642[arg1][arg6 + 1][arg7 + 1] - class165.field2753;
        int var20 = class110.field1642[arg1][arg6][arg7 + 1] - class165.field2753;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class170.field2809;
        int var46 = (var24 << 9) / var25 + class170.field2813;
        int var47 = (var27 << 9) / var31 + class170.field2809;
        int var48 = (var30 << 9) / var31 + class170.field2813;
        int var49 = (var33 << 9) / var37 + class170.field2809;
        int var50 = (var36 << 9) / var37 + class170.field2813;
        int var51 = (var39 << 9) / var43 + class170.field2809;
        int var52 = (var42 << 9) / var43 + class170.field2813;
        class170.field2803 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class116.field1768 && class36.method196(class170.field2809 + class15.field168, class21.field305 + class170.field2813, var50, var52, var48, var49, var51, var47)) {
                class291.field4650 = arg6;
                class263.field4213 = arg7;
            }
            if (!class232.field3690 && !arg8) {
                class170.field2818 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class170.field2805 || var51 > class170.field2805 || var47 > class170.field2805) {
                    class170.field2818 = true;
                }
                if (arg0.field419 == -1) {
                    if (arg0.field414 != 12345678) {
                        class170.method1263(var50, var52, var48, var49, var51, var47, arg0.field414, arg0.field410, arg0.field409);
                    }
                } else if (!class8.field123) {
                    int var53 = class170.field2814.method945(arg0.field419, 255);
                    class170.method1263(var50, var52, var48, var49, var51, var47, class175.method1320(var53, arg0.field414), class175.method1320(var53, arg0.field410), class175.method1320(var53, arg0.field409));
                } else if (arg0.field412) {
                    class170.method1258(var50, var52, var48, var49, var51, var47, arg0.field414, arg0.field410, arg0.field409, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field419);
                } else {
                    class170.method1258(var50, var52, var48, var49, var51, var47, arg0.field414, arg0.field410, arg0.field409, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field419);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class116.field1768 && class36.method196(class170.field2809 + class15.field168, class21.field305 + class170.field2813, var46, var48, var52, var45, var47, var51)) {
            class291.field4650 = arg6;
            class263.field4213 = arg7;
        }
        if (class232.field3690 || arg8) {
            return;
        }
        class170.field2818 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class170.field2805 || var47 > class170.field2805 || var51 > class170.field2805) {
            class170.field2818 = true;
        }
        if (arg0.field419 == -1) {
            if (arg0.field413 != 12345678) {
                class170.method1263(var46, var48, var52, var45, var47, var51, arg0.field413, arg0.field409, arg0.field410);
            }
        } else if (class8.field123) {
            class170.method1258(var46, var48, var52, var45, var47, var51, arg0.field413, arg0.field409, arg0.field410, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field419);
        } else {
            int var54 = class170.field2814.method945(arg0.field419, 255);
            class170.method1263(var46, var48, var52, var45, var47, var51, class175.method1320(var54, arg0.field413), class175.method1320(var54, arg0.field409), class175.method1320(var54, arg0.field410));
        }
    }

    @OriginalMember(owner = "client!e", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 167)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2011 = arg0;
        arg0.setDimensions(this.field5250, this.field5252);
        field1994++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1995);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 186)
    private final synchronized void method927(boolean arg0) {
        field2008++;
        if (arg0) {
            this.field2011 = (ImageConsumer) null;
        }
        if (this.field2011 != null) {
            this.field2011.setPixels(0, 0, this.field5250, this.field5252, this.field1995, this.field5253, 0, this.field5250);
            this.field2011.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!e", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 204)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2012++;
        return true;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 216)
    public static void method928(int arg0) {
        field1997 = null;
        if (arg0 != 16) {
            field1999 = -28;
        }
        field2004 = null;
    }

    @OriginalMember(owner = "client!e", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 227)
    public final void startProduction(ImageConsumer arg0) {
        field2006++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/awt/Component;II)V", line = 235)
    public final void method558(boolean arg0, Component arg1, int arg2, int arg3) {
        this.field5252 = arg2;
        this.field5250 = arg3;
        this.field5253 = new int[arg2 * arg3 + 1];
        this.field1995 = new DirectColorModel(32, 16711680, 65280, 255);
        field2010++;
        this.field5251 = arg1.createImage(this);
        this.method927(false);
        arg1.prepareImage(this.field5251, this);
        this.method927(!arg0);
        if (arg0) {
            arg1.prepareImage(this.field5251, this);
            this.method927(false);
            arg1.prepareImage(this.field5251, this);
            this.method2345((byte) -120);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 257)
    public static final void method929(int arg0) {
        class164.field2733 = null;
        class160.field2646 = null;
        class103.field1501 = null;
        class142.field2212 = null;
        class296.field4685 = (byte[][][]) null;
        class70.field988 = null;
        if (arg0 != 50) {
            field2009 = 45;
        }
        class199.field3238 = null;
        class309.field4799 = (int[][][]) null;
        class323.field5021 = (byte[][][]) null;
        class145.field2259 = (byte[][][]) null;
        field2007++;
        class180.field2987 = (byte[][][]) null;
        class199.field3240 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I", line = 279)
    public static final int method930(byte arg0) {
        field2000++;
        return arg0 == 2 ? 6 : -71;
    }

    @OriginalMember(owner = "client!e", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 290)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2001++;
    }

    @OriginalMember(owner = "client!e", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 297)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2011 == arg0) {
            this.field2011 = null;
        }
        field2002++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljj;B)Ljb;", line = 308)
    public static final class147 method931(class44 arg0, byte arg1) {
        field1993++;
        if (arg1 != 113) {
            method928(63);
        }
        return new class147(arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method273(arg1 ^ 0xCC485C69), arg0.method286((byte) -123));
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 320)
    public final void method557(int arg0, int arg1, Graphics arg2, int arg3) {
        field1996++;
        if (arg3 == -27039) {
            this.method927(false);
            arg2.drawImage(this.field5251, arg0, arg1, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V", line = 333)
    public final void method556(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5) {
        this.method932(arg3, arg0, arg5, arg1, (byte) 84);
        if (arg2) {
            return;
        }
        field2003++;
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg3, arg1, arg5);
        arg4.drawImage(this.field5251, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIB)V", line = 349)
    private final synchronized void method932(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2005++;
        if (arg4 <= 69) {
            this.startProduction((ImageConsumer) null);
        }
        if (this.field2011 != null) {
            this.field2011.setPixels(arg1, arg0, arg3, arg2, this.field1995, this.field5253, this.field5250 * arg0 + arg1, this.field5250);
            this.field2011.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!e", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 365)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1998++;
        return this.field2011 == arg0;
    }
}
