import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class700 extends class513 {

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "Z")
    public static boolean field9885 = false;

    @OriginalMember(owner = "client!sw", name = "G", descriptor = "[I")
    public static int[] field9908 = new int[2048];

    @OriginalMember(owner = "client!sw", name = "H", descriptor = "Z")
    public static boolean field9909 = false;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public static int field9897 = 0;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public int field9887;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public int field9890;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public int field9891;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public int field9892;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public int field9893;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public int field9895;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public int field9896;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public int field9899;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
    public int field9900;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
    public int field9901;

    @OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
    public int field9902;

    @OriginalMember(owner = "client!sw", name = "B", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!sw", name = "C", descriptor = "I")
    public int field9904;

    @OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
    public int field9905;

    @OriginalMember(owner = "client!sw", name = "E", descriptor = "I")
    public int field9906;

    @OriginalMember(owner = "client!sw", name = "F", descriptor = "I")
    public int field9907;

    @OriginalMember(owner = "client!sw", name = "I", descriptor = "I")
    public int field9910;

    @OriginalMember(owner = "client!sw", name = "K", descriptor = "I")
    public int field9911;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "Lhc;")
    public class124 field9898;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "Ltea;")
    public class217 field9886;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "Lpp;")
    public class360 field9894;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Lep;")
    public class387 field9889;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 19)
    public final void method3920(int arg0) {
        this.field9886 = null;
        this.field9889 = null;
        this.field9898 = null;
        this.field9894 = null;
        field9903++;
        if (arg0 < 55) {
            method3921(null, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "([BB)Lf;", line = 48)
    public static final class701 method3921(byte[] arg0, byte arg1) {
        field9888++;
        int var2 = -31 % ((arg1 + 32) / 50);
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var4 = new MediaTracker(class683.field9762);
                var4.addImage(var3, 0);
                var4.waitForAll();
                int var5 = var3.getWidth(class683.field9762);
                int var6 = var3.getHeight(class683.field9762);
                if (!var4.isErrorAny() && var5 >= 0 && var6 >= 0) {
                    int[] var7 = new int[var5 * var6];
                    PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
                    var8.grabPixels();
                    return class68.field1045.method311(var7, 0, var5, var5, var6);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var9) {
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V", line = 86)
    public static void method3922(int arg0) {
        if (arg0 == 2048) {
            field9908 = null;
        }
    }
}
