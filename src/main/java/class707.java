import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class707 implements class698 {

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "Lgn;")
    public class565 field9960;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Lkha;")
    private class687 field9961;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
    public static int[] field9963 = new int[2];

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lhe;")
    public static class592 field9957;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "Lac;")
    public class712 field9954;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 4)
    public final void method621(int arg0) {
        field9956++;
        if (arg0 != 27799) {
            method3911((byte) -124, null);
        }
        this.field9954 = class339.method1984(this.field9961, this.field9960.field7904, 73);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V", line = 20)
    public void method620(boolean arg0, int arg1) {
        field9959++;
        if (arg1 < 108) {
            method3911((byte) -14, null);
        }
        if (arg0) {
            int var3 = this.field9960.field7905.method4235(false, class303.field3896, this.field9954.method1892()) + this.field9960.field7910;
            int var4 = this.field9960.field7902.method2413(this.field9954.method1882(), class708.field9966, (byte) -8) + this.field9960.field7903;
            this.field9954.method3929(var3, var4);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B[B)Lac;", line = 43)
    public static final class712 method3911(byte arg0, byte[] arg1) {
        field9958++;
        if (arg0 != -79) {
            method3912(121);
        }
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class612.field8463);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class612.field8463);
                int var5 = var2.getHeight(class612.field8463);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class458.field6407.method2666(var5, var4, (byte) -48, var6, 0, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)Z", line = 83)
    public final boolean method616(byte arg0) {
        if (arg0 != 30) {
            this.field9960 = null;
        }
        field9955++;
        return this.field9961.method3827(this.field9960.field7904, (byte) 47);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V", line = 98)
    public static void method3912(int arg0) {
        field9963 = null;
        field9957 = null;
        if (arg0 != -14041) {
            method3911((byte) -55, null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lkha;Lgn;)V", line = 108)
    public class707(class687 arg0, class565 arg1) {
        this.field9960 = arg1;
        this.field9961 = arg0;
    }
}
