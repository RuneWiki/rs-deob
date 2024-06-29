import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class84 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Z")
    public static boolean field1021 = false;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "F")
    public static float field1024;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Laia;")
    public static class399 field1023;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()V")
    public static final void method639() {
        for (int var0 = class157.field2036; var0 < class266.field3869; var0++) {
            for (int var1 = 0; var1 < class414.field5796; var1++) {
                for (int var2 = 0; var2 < class704.field9799; var2++) {
                    class472 var3 = class59.field688[var0][var1][var2];
                    if (var3 != null) {
                        class391 var4 = var3.field6548;
                        class391 var5 = var3.field6544;
                        if (var4 != null && var4.method83(false)) {
                            class88.method656(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method83(false)) {
                                class88.method656(var5, var0, var1, var2, 1, 1);
                                var5.method73(var4, 0, false, 0, class139.field1781, 0, 126);
                                var5.method81((byte) 29);
                            }
                            var4.method81((byte) 29);
                        }
                        for (class44 var6 = var3.field6551; var6 != null; var6 = var6.field466) {
                            class253 var8 = var6.field465;
                            if (var8 != null && var8.method83(false)) {
                                class88.method656(var8, var0, var1, var2, var8.field3754 + 1 - var8.field3745, var8.field3755 - var8.field3758 + 1);
                                var8.method81((byte) 29);
                            }
                        }
                        class727 var7 = var3.field6540;
                        if (var7 != null && var7.method83(false)) {
                            class665.method3791(var7, var0, var1, var2);
                            var7.method81((byte) 29);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
    public static final String method640(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field1022++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 17) {
            return null;
        }
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
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
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
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

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1023 = null;
        if (arg0 != 0) {
            field1023 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[B)Lho;")
    public static final class318 method642(byte arg0, byte[] arg1) {
        field1025++;
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        if (arg0 > -47) {
            field1024 = 0.76727706F;
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class274.field3958);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class274.field3958);
                int var5 = var2.getHeight(class274.field3958);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class111.field1332.method2815(var6, (byte) -39, var4, var5, var4, 0);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }
}
