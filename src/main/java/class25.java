import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KJGJRATW")
public class class25 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "I")
    private int field913 = 357;

    @OriginalMember(owner = "client!KJGJRATW", name = "c", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!KJGJRATW", name = "d", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!KJGJRATW", name = "b", descriptor = "[I")
    public int[] field914;

    @OriginalMember(owner = "client!KJGJRATW", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel field917;

    @OriginalMember(owner = "client!KJGJRATW", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field919;

    @OriginalMember(owner = "client!KJGJRATW", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer field918;

    @OriginalMember(owner = "client!KJGJRATW", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
    public class25(Component arg0, int arg1, int arg2, int arg3) {
        this.field915 = arg2;
        this.field916 = arg3;
        this.field914 = new int[arg2 * arg3];
        this.field917 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field919 = arg0.createImage(this);
        if (arg1 != 0) {
            this.field913 = 13;
        }
        this.method318();
        arg0.prepareImage(this.field919, this);
        this.method318();
        arg0.prepareImage(this.field919, this);
        this.method318();
        arg0.prepareImage(this.field919, this);
        this.method316(-439);
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "(I)V")
    public void method316(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class8.method159(this.field914, this.field915, this.field916, false);
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public void method317(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method318();
        int var5 = 25 / arg0;
        arg3.drawImage(this.field919, arg2, arg1, this);
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field918 = arg0;
        arg0.setDimensions(this.field915, this.field916);
        arg0.setProperties(null);
        arg0.setColorModel(this.field917);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field918 == arg0;
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field918 == arg0) {
            this.field918 = null;
        }
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "()V")
    public synchronized void method318() {
        if (this.field918 != null) {
            this.field918.setPixels(0, 0, this.field915, this.field916, this.field917, this.field914, 0, this.field915);
            this.field918.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!KJGJRATW", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
