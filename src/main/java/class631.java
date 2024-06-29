import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class631 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field9069 = -1;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "D")
    public static double field9074;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field9066;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([BI)Lhu;", line = 9)
    public static final class131 method3620(byte[] arg0, int arg1) {
        if (arg1 != 128) {
            return null;
        }
        field9073++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class30.field343);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class30.field343);
                int var5 = var2.getHeight(class30.field343);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class275.field3370.method430(var5, -90, var6, var4, var4, 0);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method3621(int arg0) {
        if (arg0 != -19594) {
            field9069 = 7;
        }
        field9068++;
        return (this.field9076 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z", line = 74)
    public final boolean method3622(byte arg0) {
        field9077++;
        if (arg0 >= -105) {
            this.method3622((byte) 76);
        }
        return (this.field9076 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z", line = 86)
    public final boolean method3623(int arg0) {
        field9075++;
        if (arg0 != 0) {
            field9074 = 1.0878814237597183D;
        }
        return (this.field9076 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)Z", line = 98)
    public final boolean method3624(int arg0) {
        if (arg0 != 0) {
            this.field9076 = -97;
        }
        field9072++;
        return (this.field9076 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lig;B)Lqt;", line = 112)
    public static final class634 method3625(class244 arg0, byte arg1) {
        arg0.method1423(arg1 - 180);
        field9070++;
        if (arg1 != 102) {
            return null;
        }
        int var2 = arg0.method1423(arg1 - 219);
        class634 var3 = class461.method2812(var2, -121);
        var3.field9113 = arg0.method1423(-87);
        int var4 = arg0.method1423(-96);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1423(arg1 - 159);
            var3.method3(var6, arg0, false);
        }
        var3.method87((byte) 103);
        return var3;
    }
}
