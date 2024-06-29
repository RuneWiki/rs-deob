import jaggl.OpenGL;
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

@OriginalClass("client!no")
public class class602 extends class6 implements ImageProducer {

    @OriginalMember(owner = "client!no", name = "J", descriptor = "Ljc;")
    public static class374 field8984;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8982;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field8973;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field8974;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field8969;

    static {
        new class572("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class572("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field8984 = new class374();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V", line = 4)
    private final synchronized void method3554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8970;
        if (this.field8969 != null) {
            if (arg4 < -7) {
                this.field8969.setPixels(arg1, arg2, arg0, arg3, this.field8974, super.field54, super.field48 * arg2 + arg1, super.field48);
                this.field8969.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 23)
    public static void method3555(int arg0) {
        if (arg0 != 0) {
            field8984 = null;
        }
        field8984 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLkda;)V", line = 42)
    public static final void method3556(byte arg0, class328 arg1) {
        class388.field5331 = arg1;
        ++field8978;
        if (arg0 != -6) {
            field8984 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 61)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field8976;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 68)
    public final void method19(Canvas arg0, int arg1) {
        ++field8967;
        this.field8982 = arg0;
        super.field48 = this.field8982.getSize().width;
        super.field50 = this.field8982.getSize().height;
        super.field54 = new int[super.field50 * super.field48];
        this.field8974 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 == 7) {
            this.field8973 = this.field8982.createImage(this);
            this.method3559(0);
            this.field8982.prepareImage(this.field8973, this.field8982);
            this.method3559(0);
            this.field8982.prepareImage(this.field8973, this.field8982);
            this.method3559(0);
            this.field8982.prepareImage(this.field8973, this.field8982);
        }
    }

    @OriginalMember(owner = "client!no", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 91)
    public final void startProduction(ImageConsumer arg0) {
        ++field8979;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!no", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 101)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field8968;
        if (this.field8969 == arg0) {
            this.field8969 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 112)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field8969 = arg0;
        ++field8972;
        arg0.setDimensions(super.field48, super.field50);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field8974);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;BLte;)Lkh;", line = 124)
    public static final class15 method3557(int arg0, String arg1, byte arg2, class527 arg3) {
        ++field8980;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class336.field4653, 0);
        if (class336.field4653[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        } else {
            int var5 = 44 % ((56 - arg2) / 63);
            OpenGL.glBindProgramARB(arg0, 0);
            return new class15(arg3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 150)
    public final void method17(int arg0, byte arg1, int arg2, Graphics arg3) {
        ++field8975;
        this.method3559(0);
        int var5 = -97 / ((arg1 - 49) / 42);
        arg3.drawImage(this.field8973, arg2, arg0, this.field8982);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 161)
    public final void method16(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        if (arg5 == -46) {
            ++field8981;
            this.method3554(arg4, arg0, arg1, arg2, -126);
            Shape var7 = arg3.getClip();
            arg3.clipRect(arg0, arg1, arg4, arg2);
            arg3.drawImage(this.field8973, 0, 0, this.field8982);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBIIII)V", line = 179)
    public static final void method3558(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8971;
        if (arg2 <= 103) {
            field8984 = null;
        }
        int var7 = -arg5 + arg6;
        int var8 = arg1 - -arg5;
        for (int var9 = arg1; ~var9 > ~var8; ++var9) {
            class140.method969(arg0, 15888, arg3, arg4, class604.field8993[var9]);
        }
        for (int var10 = arg6; ~var7 > ~var10; --var10) {
            class140.method969(arg0, 15888, arg3, arg4, class604.field8993[var10]);
        }
        int var11 = -arg5 + arg4;
        int var12 = arg0 + arg5;
        for (int var13 = var8; ~var7 <= ~var13; ++var13) {
            int[] var14 = class604.field8993[var13];
            class140.method969(arg0, 15888, arg3, var12, var14);
            class140.method969(var11, 15888, arg3, arg4, var14);
        }
    }

    @OriginalMember(owner = "client!no", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 224)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field8977;
        return this.field8969 == arg0;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 232)
    private final synchronized void method3559(int arg0) {
        ++field8983;
        if (this.field8969 != null) {
            this.field8969.setPixels(0, arg0, super.field48, super.field50, this.field8974, super.field54, 0, super.field48);
            this.field8969.imageComplete(2);
        }
    }
}
