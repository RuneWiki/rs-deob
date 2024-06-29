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

@OriginalClass("client!gq")
public class class513 extends class115 implements ImageProducer {

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field7321 = 0;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7324;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field7315;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7312;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7319;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V", line = 3)
    public final void method763(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7316;
        this.method3033(arg2, arg5, arg1, -15595, arg7);
        if (arg3 != 10000) {
            field7321 = 49;
        }
        Shape var9 = arg0.getClip();
        arg0.clipRect(arg4, arg6, arg2, arg5);
        arg0.drawImage(this.field7315, -arg7 + arg4, arg6 - arg1, this.field7324);
        arg0.setClip(var9);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V", line = 21)
    public static final void method3031(int arg0, int arg1, Object[] arg2, int[] arg3, int arg4) {
        if (arg1 == -29868) {
            ++field7311;
            if (arg0 > arg4) {
                int var5 = (arg0 + arg4) / 2;
                int var6 = arg4;
                int var7 = arg3[var5];
                arg3[var5] = arg3[arg0];
                arg3[arg0] = var7;
                Object var8 = arg2[var5];
                arg2[var5] = arg2[arg0];
                arg2[arg0] = var8;
                int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
                for (int var10 = arg4; ~var10 > ~arg0; ++var10) {
                    if (var7 - -(var9 & var10) > arg3[var10]) {
                        int var11 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6] = var11;
                        Object var12 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6++] = var12;
                    }
                }
                arg3[arg0] = arg3[var6];
                arg3[var6] = var7;
                arg2[arg0] = arg2[var6];
                arg2[var6] = var8;
                method3031(var6 + -1, -29868, arg2, arg3, arg4);
                method3031(arg0, -29868, arg2, arg3, var6 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 79)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field7319 = arg0;
        ++field7314;
        arg0.setDimensions(super.field1201, super.field1200);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7312);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V", line = 92)
    public final void method760(Canvas arg0, int arg1, boolean arg2, int arg3) {
        super.field1200 = arg3;
        if (!arg2) {
            this.field7312 = null;
        }
        super.field1201 = arg1;
        ++field7318;
        this.field7324 = arg0;
        super.field1205 = new int[super.field1201 * super.field1200];
        this.field7312 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7315 = this.field7324.createImage(this);
        this.method3032((byte) -75);
        this.field7324.prepareImage(this.field7315, this.field7324);
        this.method3032((byte) 88);
        this.field7324.prepareImage(this.field7315, this.field7324);
        this.method3032((byte) 98);
        this.field7324.prepareImage(this.field7315, this.field7324);
    }

    @OriginalMember(owner = "client!gq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 114)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7320;
    }

    @OriginalMember(owner = "client!gq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 122)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field7323;
        if (this.field7319 == arg0) {
            this.field7319 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V", line = 138)
    private final synchronized void method3032(byte arg0) {
        ++field7325;
        int var2 = 64 % ((arg0 - -8) / 42);
        if (this.field7319 != null) {
            this.field7319.setPixels(0, 0, super.field1201, super.field1200, this.field7312, super.field1205, 0, super.field1201);
            this.field7319.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V", line = 156)
    private final synchronized void method3033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7322;
        if (this.field7319 != null) {
            this.field7319.setPixels(arg4, arg2, arg0, arg1, this.field7312, super.field1205, super.field1201 * arg2 + arg4, super.field1201);
            this.field7319.imageComplete(2);
            if (arg3 != -15595) {
                this.method3033(-92, 90, -31, 111, 5);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 172)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field7313;
    }

    @OriginalMember(owner = "client!gq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 188)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7317;
        return this.field7319 == arg0;
    }
}
