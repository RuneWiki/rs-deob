import java.awt.Component;
import java.awt.Frame;
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

@OriginalClass("client!ic")
public class class117 extends class140 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lwm;")
    public static class152 field1660 = class157.method1048("Fps:", 97);

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "[I")
    public static int[] field1652 = new int[25];

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1651;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1654;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "[[[B")
    public static byte[][][] field1661;

    @OriginalMember(owner = "client!ic", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 7)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1666++;
        return this.field1654 == arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 15)
    public final void method121(int arg0, Graphics arg1, int arg2, int arg3) {
        field1662++;
        this.method770(arg0 - 6531);
        arg1.drawImage(this.field2139, arg2, arg3, this);
        if (arg0 != -129) {
            field1652 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 28)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1654 = arg0;
        field1664++;
        arg0.setDimensions(this.field2137, this.field2123);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1651);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V", line = 41)
    public final void method120(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1655++;
        if (arg1 <= 33) {
            return;
        }
        this.method768(arg5, arg2, arg3, 103, arg4);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg2, arg4);
        arg0.drawImage(this.field2139, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 56)
    public static void method767(int arg0) {
        if (arg0 == -21434) {
            field1660 = null;
            field1652 = null;
            field1661 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 71)
    public final void method122(Component arg0, int arg1, int arg2, int arg3) {
        this.field2137 = arg3;
        field1667++;
        this.field2123 = arg1;
        this.field2124 = new int[arg1 * arg3 + 1];
        this.field1651 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2139 = arg0.createImage(this);
        this.method770(arg2 ^ 0xFFFFE5FE);
        if (arg2 != 2) {
            return;
        }
        arg0.prepareImage(this.field2139, this);
        this.method770(arg2 - 6662);
        arg0.prepareImage(this.field2139, this);
        this.method770(-6660);
        arg0.prepareImage(this.field2139, this);
        this.method883(true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V", line = 104)
    private final synchronized void method768(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1663++;
        if (this.field1654 == null) {
            return;
        }
        this.field1654.setPixels(arg0, arg2, arg1, arg4, this.field1651, this.field2124, this.field2137 * arg2 + arg0, this.field2137);
        this.field1654.imageComplete(2);
        if (arg3 <= 59) {
            field1652 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 121)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1649++;
    }

    @OriginalMember(owner = "client!ic", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 128)
    public final void startProduction(ImageConsumer arg0) {
        field1650++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 138)
    public static final void method769(int arg0, long[] arg1, Object[] arg2) {
        class55.method369(arg1, 0, arg1.length - 1, 2, arg2);
        if (arg0 < 116) {
            field1652 = (int[]) null;
        }
        field1668++;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 155)
    private final synchronized void method770(int arg0) {
        field1665++;
        if (this.field1654 == null) {
            return;
        }
        this.field1654.setPixels(0, 0, this.field2137, this.field2123, this.field1651, this.field2124, 0, this.field2137);
        if (arg0 != -6660) {
            this.field1654 = (ImageConsumer) null;
        }
        this.field1654.imageComplete(2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V", line = 171)
    public static final void method771(int arg0, byte arg1) {
        if (class122.field1720 == null) {
            class122.field1720 = new byte[4][104][104];
        }
        if (arg0 < 91) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class122.field1720[var2][var3][var4] = arg1;
                }
            }
        }
        field1659++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 208)
    public static final void method772(int arg0, int arg1, int arg2) {
        class240.field3937 = true;
        class135.field2080 = arg0;
        class108.field1548 = arg1;
        class302.field5207 = arg2;
        class233.field3815 = -1;
        class258.field4422 = -1;
    }

    @OriginalMember(owner = "client!ic", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 218)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1654 == arg0) {
            this.field1654 = null;
        }
        field1657++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLdi;Ljava/awt/Frame;)V", line = 233)
    public static final void method773(boolean arg0, class151 arg1, Frame arg2) {
        field1658++;
        while (true) {
            class188 var3 = arg1.method958(arg2, (byte) 110);
            while (var3.field2980 == 0) {
                class4.method19(0, 10L);
            }
            if (var3.field2980 == 1) {
                arg2.setVisible(arg0);
                arg2.dispose();
                return;
            }
            class4.method19(0, 100L);
        }
    }

    @OriginalMember(owner = "client!ic", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 262)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1669++;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lse;Z)I", line = 270)
    public static final int method774(class12 arg0, boolean arg1) {
        if (!arg1) {
            field1652 = (int[]) null;
        }
        field1653++;
        int var2 = arg0.field164;
        class251 var3 = arg0.method1706((byte) 99);
        if (arg0.field4224 == var3.field4310) {
            var2 = arg0.field167;
        } else if (arg0.field4224 == var3.field4286 || arg0.field4224 == var3.field4301 || arg0.field4224 == var3.field4296 || arg0.field4224 == var3.field4303) {
            var2 = arg0.field158;
        } else if (arg0.field4224 == var3.field4280 || arg0.field4224 == var3.field4307 || arg0.field4224 == var3.field4282 || arg0.field4224 == var3.field4318) {
            var2 = arg0.field162;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIBI)Lwm;", line = 312)
    public static final class152 method775(byte[] arg0, int arg1, byte arg2, int arg3) {
        class152 var4 = new class152();
        field1656++;
        var4.field2371 = 0;
        if (arg2 < 61) {
            return (class152) null;
        }
        var4.field2389 = new byte[arg1];
        for (int var5 = arg3; var5 < (arg1 + arg3); var5++) {
            if (arg0[var5] != 0) {
                var4.field2389[var4.field2371++] = arg0[var5];
            }
        }
        return var4;
    }
}
