import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class class475 extends class143 {

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "Lqj;")
    public static class511 field6808 = new class511(11, 17);

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Z")
    public abstract boolean method374(int arg0);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([BI)Lf;")
    public static final class257 method2782(byte[] arg0, int arg1) {
        if (arg1 > -11) {
            method2782(null, -14);
        }
        field6810++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class573.field8424);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class573.field8424);
                int var5 = var2.getHeight(class573.field8424);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class637.field9048.method806(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLga;I)V")
    public static final void method2783(byte arg0, class63 arg1, int arg2) {
        if (class96.field1414) {
            arg2 = 0;
            class96.field1414 = false;
        }
        field6812++;
        if (arg0 <= 55) {
            method2785(-12, 126, -102);
        }
        if (class348.field4921 != null && class348.field4921.method522(-50, arg1)) {
            return;
        }
        class348.field4921 = arg1;
        class221.field3308 = class254.method1619(true);
        class230.field3411 = arg2;
        class434.field6252 = arg2;
        if (class434.field6252 == 0) {
            class535.method3138((byte) 114);
            return;
        }
        class538.field7892 = class202.field3120;
        class248.field3610 = class125.field2052;
        class584.field8555 = class123.field2023;
        class464.field6644 = class94.field1395;
        class102.field1658 = class595.field8618;
        class457.field6573 = class296.field4188;
        class108.field1765 = class104.field1710;
        class106.field1752 = class275.field3910;
        class570.field8330 = class26.field362;
        class371.field5141 = class686.field9739;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method373(boolean arg0);

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
    public static void method2784(byte arg0) {
        field6808 = null;
        int var1 = 71 % ((arg0 + 40) / 59);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)Z")
    public static final boolean method2785(int arg0, int arg1, int arg2) {
        if (arg0 > -54) {
            return false;
        } else {
            field6814++;
            return (arg2 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(I)V")
    public class475(int arg0) {
        this.field6811 = arg0;
    }
}
