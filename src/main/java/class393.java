import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class393 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field5573 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lbk;")
    public class393 field5574;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lwga;")
    public class778 field5578;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[Lcq;")
    public static class490[] field5580;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B[B)Lqda;", line = 3)
    public static final class112 method2396(byte arg0, byte[] arg1) {
        field5579++;
        int var2 = 106 / ((arg0 + 46) / 39);
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var3 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var4 = new MediaTracker(class364.field5270);
                var4.addImage(var3, 0);
                var4.waitForAll();
                int var5 = var3.getWidth(class364.field5270);
                int var6 = var3.getHeight(class364.field5270);
                if (!var4.isErrorAny() && var5 >= 0 && var6 >= 0) {
                    int[] var7 = new int[var5 * var6];
                    PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
                    var8.grabPixels();
                    return class638.field8979.method476(0, var6, var5, true, var5, var7);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var9) {
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 43)
    public final void method2397(byte arg0) {
        field5577++;
        if (class547.field7726 >= 500) {
            return;
        }
        this.field5574 = class624.field8797;
        this.field5578 = null;
        class547.field7726++;
        class624.field8797 = this;
        if (arg0 < 69) {
            this.field5574 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBII)V", line = 61)
    public static final void method2398(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -6) {
            field5580 = null;
        }
        field5575++;
        class713 var4 = class259.field3639[arg3][arg2];
        class440.method2661(0, var4 == null ? class111.field1412 : var4, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 79)
    public static void method2399(int arg0) {
        field5573 = null;
        int var1 = 3 / ((arg0 - 19) / 53);
        field5580 = null;
    }
}
