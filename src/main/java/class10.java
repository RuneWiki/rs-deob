import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class10 {

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field88 = -1;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "J")
    public static long field87;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;", line = 14)
    public static final String method48(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field89++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg4 * 10));
            if (arg4 == 0L) {
                if (arg3 != 1) {
                    field88 = 88;
                }
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "([BI)Lfd;", line = 104)
    public static final class298 method49(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            method49(null, 5);
        }
        field86++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class516.field7210);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class516.field7210);
                int var5 = var2.getHeight(class516.field7210);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class129.field1802.method3244(var5, var6, (byte) -120, var4, 0, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }
}
