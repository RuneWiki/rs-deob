import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class483 {

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "Lfca;")
    public static class661 field6232 = new class661();

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field6237 = 0;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "Lfca;")
    public static class661 field6238 = new class661();

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "Ltn;")
    public static class749 field6239 = new class749(1);

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "[I")
    public static int[] field6240 = new int[1];

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    private int field6229;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "Luc;")
    public static class133 field6235;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "Lje;")
    public class382 field6233;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILmc;)V", line = 3)
    private final void method2711(int arg0, int arg1, class234 arg2) {
        field6234++;
        if (arg0 == 1) {
            this.field6229 = arg2.method1553((byte) -120);
        } else if (arg0 == 2) {
            this.field6227 = arg2.method1509(true);
            this.field6228 = arg2.method1509(true);
        }
        if (arg1 != -17037) {
            field6240 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lmc;I)V", line = 27)
    public final void method2712(class234 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                field6230++;
                if (arg1 >= -110) {
                    this.method2712(null, 17);
                    return;
                }
                return;
            }
            this.method2711(var3, -17037, arg0);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "([BI)Lpu;", line = 53)
    public static final class772 method2713(byte[] arg0, int arg1) {
        field6231++;
        if (arg1 != 0) {
            field6237 = -68;
        }
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class102.field1382);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class102.field1382);
                int var5 = var2.getHeight(class102.field1382);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class576.field7320.method3078((byte) 71, var5, var4, var6, 0, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)I", line = 95)
    public static final int method2714(int arg0, byte arg1) {
        if (arg1 >= -108) {
            field6237 = -123;
        }
        field6225++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Lvi;", line = 112)
    public final synchronized class388 method2715(int arg0) {
        field6226++;
        int var2 = -112 % ((44 - arg0) / 59);
        class388 var3 = (class388) this.field6233.field4781.method2931((long) this.field6229, (byte) -121);
        if (var3 != null) {
            return var3;
        }
        class388 var4 = class388.method2232(this.field6233.field4769, this.field6229, 0);
        if (var4 != null) {
            this.field6233.field4781.method2918((long) this.field6229, var4, 94);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 132)
    public static void method2716(byte arg0) {
        field6235 = null;
        field6232 = null;
        field6238 = null;
        field6239 = null;
        field6240 = null;
        if (arg0 != -74) {
            method2716((byte) -108);
        }
    }
}
