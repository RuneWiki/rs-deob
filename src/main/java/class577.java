import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class577 extends class135 {

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    private int field8169;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Lrs;")
    private class166 field8177;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    private int field8174;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    private int field8168;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    private int field8173;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    private int field8180;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field8172 = 2;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Leda;")
    public static class14 field8175 = new class14(50);

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lio;")
    private class708 field8170;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "[Lit;")
    public static class34[] field8171;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public static void method3338(byte arg0) {
        int var1 = -111 / ((-arg0 - 5) / 43);
        field8175 = null;
        field8171 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lio;")
    public final class708 method1084(byte arg0) {
        if (arg0 != 28) {
            return null;
        }
        field8178++;
        if (this.field8170 == null) {
            class530.field7625[5] = this.field8169;
            class530.field7625[0] = this.field8173;
            class530.field7625[4] = this.field8174;
            class267 var2 = this.field8177.field7764;
            class530.field7625[2] = this.field8181;
            class530.field7625[1] = this.field8168;
            class530.field7625[3] = this.field8180;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1772(-5919, class530.field7625[var5])) {
                    return null;
                }
                class569 var7 = var2.method1774(85, class530.field7625[var5]);
                int var8 = var7.field8067 ? 64 : 128;
                if (var7.field8061 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class325.field4804[var6] = var2.method1771(1.0F, var4, class530.field7625[var6], var4, (byte) 70, false);
            }
            this.field8170 = new class708(this.field8177, 6407, var4, var3, class325.field4804);
        }
        return this.field8170;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([BB)Lit;")
    public static final class34 method3339(byte[] arg0, byte arg1) {
        field8179++;
        if (arg0 == null) {
            throw new RuntimeException("");
        } else if (arg1 > -28) {
            return null;
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class52.field834);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class52.field834);
                    int var5 = var2.getHeight(class52.field834);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class364.field5573.method3185(0, var6, false, var5, var4, var4);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lrs;IIIIII)V")
    public class577(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8169 = arg6;
        this.field8177 = arg0;
        this.field8181 = arg3;
        this.field8174 = arg5;
        this.field8168 = arg2;
        this.field8173 = arg1;
        this.field8180 = arg4;
    }
}
