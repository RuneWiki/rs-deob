import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class97 {

    @OriginalMember(owner = "client!in", name = "c", descriptor = "[Z")
    public static boolean[] field1102 = new boolean[8];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([BI)Ljd;")
    public static final class241 method702(byte[] arg0, int arg1) {
        field1100++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        if (arg1 != -2) {
            method704(75, null, -59, 72);
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class256.field3768);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class256.field3768);
                int var5 = var2.getHeight(class256.field3768);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class37.field491.method458((byte) 125, var5, var4, var6, var4, 0);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)I")
    public final int method703(int arg0, int arg1, byte arg2) {
        field1104++;
        int var4 = arg1 >= class428.field5825 ? arg1 : class428.field5825;
        if (class651.field9092 == this) {
            return 0;
        } else if (class159.field2543 == this) {
            return var4 - arg0;
        } else if (arg2 <= 15) {
            return 46;
        } else if (class21.field350 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILnq;II)J")
    public static final long method704(int arg0, class484 arg1, int arg2, int arg3) {
        field1101++;
        if (arg3 != 29731) {
            method704(15, null, 8, 35);
        }
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class282 var8 = class277.field4038.method3919(true, arg1.method1483(arg3 - 4878));
        long var9 = (long) (arg1.method1482(true) << 14 | arg0 | arg2 << 7 | arg1.method1478((byte) 110) << 20 | 0x40000000);
        if (var8.field4149 == 0) {
            var9 |= var6;
        }
        if (var8.field4091 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method1483(24853) << 32;
    }

    @OriginalMember(owner = "client!in", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1105++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1102 = null;
        if (arg0 != 0) {
            field1103 = 9;
        }
    }
}
