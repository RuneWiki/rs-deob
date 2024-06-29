import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class102 extends class47 implements ImageProducer {

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "Lnj;")
    public static class487 field1289 = new class487("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field1303 = -1;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1300;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field1294;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1292;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1291;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kq", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field1304;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
    public static final boolean method590(int arg0, String arg1, Class arg2) {
        ++field1290;
        Class var3 = (Class) class646.field9380.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        } else {
            Object var4 = null;
            if (arg0 <= 104) {
                field1289 = null;
            }
            File var5 = (File) class110.field1399.get(arg1);
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg2, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class646.field9380.put(arg1, arg2);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class646.field9380.put(arg1, field1304 != null ? field1304 : (field1304 = method597("cn")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1291 = arg0;
        ++field1283;
        arg0.setDimensions(super.field554, super.field555);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1292);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1297;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BILjava/awt/Canvas;Ln;)Lqa;")
    public static final class167 method591(byte arg0, int arg1, Canvas arg2, class472 arg3) {
        if (arg0 <= 66) {
            method591((byte) 38, -26, (Canvas) null, (class472) null);
        }
        ++field1284;
        return new class468(arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!kq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1288;
        return this.field1291 == arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method592(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1287;
        int var6 = 122 % ((arg4 - 69) / 53);
        if (this.field1291 != null) {
            this.field1291.setPixels(arg1, arg0, arg3, arg2, this.field1292, super.field556, super.field554 * arg0 - -arg1, super.field554);
            this.field1291.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1296;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([[B[BII[[B[II[I)I")
    public static final int method593(byte[][] arg0, byte[] arg1, int arg2, int arg3, byte[][] arg4, int[] arg5, int arg6, int[] arg7) {
        ++field1295;
        int var8 = arg7[arg2];
        int var9 = arg5[arg2] + var8;
        int var10 = arg7[arg3];
        int var11 = arg5[arg3] + var10;
        int var12 = var8;
        if (~var8 > ~var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = 255 & arg1[arg2];
        if (~(arg6 & arg1[arg3]) > ~var14) {
            var14 = arg1[arg3] & 255;
        }
        byte[] var15 = arg0[arg2];
        byte[] var16 = arg4[arg3];
        int var17 = var12 - var8;
        int var18 = -var10 + var12;
        for (int var19 = var12; ~var13 < ~var19; ++var19) {
            int var20 = var15[var17++] - -var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!kq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1286;
        if (this.field1291 == arg0) {
            this.field1291 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method242(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method595((byte) 79);
        ++field1293;
        arg1.drawImage(this.field1294, arg3, arg2, this.field1300);
        if (arg0 != -14552) {
            this.startProduction((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method592(arg1, arg3, arg0, arg2, (byte) -66);
        ++field1301;
        if (arg4 != 1) {
            method594((byte) -41);
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg1, arg2, arg0);
        arg5.drawImage(this.field1294, 0, 0, this.field1300);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method240(int arg0, Canvas arg1) {
        this.field1300 = arg1;
        ++field1299;
        super.field554 = this.field1300.getSize().width;
        super.field555 = this.field1300.getSize().height;
        super.field556 = new int[super.field555 * super.field554];
        this.field1292 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1294 = this.field1300.createImage(this);
        if (arg0 == 13948) {
            this.method595((byte) 70);
            this.field1300.prepareImage(this.field1294, this.field1300);
            this.method595((byte) 60);
            this.field1300.prepareImage(this.field1294, this.field1300);
            this.method595((byte) 122);
            this.field1300.prepareImage(this.field1294, this.field1300);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method594(byte arg0) {
        if (arg0 <= 100) {
            method596(false, -5, 2, -77, 13);
        }
        field1289 = null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
    private final synchronized void method595(byte arg0) {
        ++field1298;
        if (arg0 > 54) {
            if (this.field1291 != null) {
                this.field1291.setPixels(0, 0, super.field554, super.field555, this.field1292, super.field556, 0, super.field554);
                this.field1291.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIII)V")
    public static final void method596(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1285;
        if (class159.method929(0, arg4)) {
            class232.method1512(arg2, arg0, class251.field3650[arg4], arg3, (byte) 72, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method597(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
