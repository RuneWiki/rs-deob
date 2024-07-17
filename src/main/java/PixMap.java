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

@OriginalClass("IVIFZQBK")
public class PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "IVIFZQBK", name = "b", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "IVIFZQBK", name = "d", descriptor = "I")
    public int width;

    @OriginalMember(owner = "IVIFZQBK", name = "e", descriptor = "I")
    public int height;

    @OriginalMember(owner = "IVIFZQBK", name = "c", descriptor = "[I")
    public int[] data;

    @OriginalMember(owner = "IVIFZQBK", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
    public ColorModel colorModel;

    @OriginalMember(owner = "IVIFZQBK", name = "h", descriptor = "Ljava/awt/Image;")
    public Image image;

    @OriginalMember(owner = "IVIFZQBK", name = "a", descriptor = "I")
    private int _flowObfuscator1;

    @OriginalMember(owner = "IVIFZQBK", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
    public ImageConsumer consumer;

    @OriginalMember(owner = "IVIFZQBK", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
    public PixMap(int arg0, int arg1, java.awt.Component arg2, int arg3) {
        this.width = arg0;
        this.height = arg1;
        this.data = new int[arg0 * arg1];
        this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = arg2.createImage(this);
        this.setPixels();
        arg2.prepareImage(this.image, this);
        if (arg3 != 0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        this.setPixels();
        arg2.prepareImage(this.image, this);
        this.setPixels();
        arg2.prepareImage(this.image, this);
        this.bind(0);
    }

    @OriginalMember(owner = "IVIFZQBK", name = "a", descriptor = "(I)V")
    public void bind(int arg0) {
        Pix2D.bind(this.height, this.width, -293, this.data);
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "IVIFZQBK", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public void draw(int arg0, int arg1, Graphics arg2, int arg3) {
        this.setPixels();
        if (arg1 != 23680) {
            this._flowObfuscator1 = -169;
        }
        arg2.drawImage(this.image, arg3, arg0, this);
    }

    @OriginalMember(owner = "IVIFZQBK", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void addConsumer(ImageConsumer arg0) {
        this.consumer = arg0;
        arg0.setDimensions(this.width, this.height);
        arg0.setProperties(null);
        arg0.setColorModel(this.colorModel);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "IVIFZQBK", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.consumer == arg0;
    }

    @OriginalMember(owner = "IVIFZQBK", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.consumer == arg0) {
            this.consumer = null;
        }
    }

    @OriginalMember(owner = "IVIFZQBK", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "IVIFZQBK", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    @OriginalMember(owner = "IVIFZQBK", name = "a", descriptor = "()V")
    public synchronized void setPixels() {
        if (this.consumer != null) {
            this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.data, 0, this.width);
            this.consumer.imageComplete(2);
        }
    }

    @OriginalMember(owner = "IVIFZQBK", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
