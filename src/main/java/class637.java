import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class637 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field9002 = -1;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBILvq;I)V", line = 4)
    public static final void method3544(int arg0, byte arg1, int arg2, class425 arg3, int arg4) {
        field9006++;
        int var5 = 120 / ((-arg1 - 28) / 50);
        class87 var6 = arg3.method2544(2);
        int var7 = arg3.field6205 - arg3.field6209.field7276 & 0x3FFF;
        if (arg2 == -1) {
            if (var7 != 0 || arg3.field6243 > 25) {
                if (arg0 < 0 && var6.field1419 != -1) {
                    arg3.field6226 = var6.field1419;
                } else if (arg0 <= 0 || var6.field1421 == -1) {
                    arg3.field6226 = var6.field1435;
                } else {
                    arg3.field6226 = var6.field1421;
                }
                arg3.field6230 = false;
            } else if (!arg3.field6230 || !var6.method755(arg3.field6226, (byte) -117)) {
                arg3.field6226 = var6.method754(-1);
                arg3.field6230 = arg3.field6226 != -1;
            }
        } else if (arg3.field6171 != -1 && var7 >= 10240 || var7 <= 2048) {
            int var8 = class182.field2573[arg4] - arg3.field6209.field7276 & 0x3FFF;
            arg3.field6230 = false;
            if (arg2 == 2 && var6.field1418 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field1433 != -1) {
                    arg3.field6226 = var6.field1433;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field1440 != -1) {
                    arg3.field6226 = var6.field1440;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field1451 == -1) {
                    arg3.field6226 = var6.field1418;
                } else {
                    arg3.field6226 = var6.field1451;
                }
            } else if (arg2 == 0 && var6.field1414 != -1) {
                if (var8 > 2048 && var8 <= 6144 && var6.field1454 != -1) {
                    arg3.field6226 = var6.field1454;
                } else if (var8 >= 10240 && var8 < 14336 && var6.field1423 != -1) {
                    arg3.field6226 = var6.field1423;
                } else if (var8 <= 6144 || var8 >= 10240 || var6.field1464 == -1) {
                    arg3.field6226 = var6.field1414;
                } else {
                    arg3.field6226 = var6.field1464;
                }
            } else if (var8 > 2048 && var8 <= 6144 && var6.field1452 != -1) {
                arg3.field6226 = var6.field1452;
            } else if (var8 >= 10240 && var8 < 14336 && var6.field1457 != -1) {
                arg3.field6226 = var6.field1457;
            } else if (var8 <= 6144 || var8 >= 10240 || var6.field1425 == -1) {
                arg3.field6226 = var6.field1435;
            } else {
                arg3.field6226 = var6.field1425;
            }
        } else if (var7 == 0 && arg3.field6243 <= 25) {
            arg3.field6230 = false;
            if (arg2 == 2 && var6.field1418 != -1) {
                arg3.field6226 = var6.field1418;
            } else if (arg2 == 0 && var6.field1414 != -1) {
                arg3.field6226 = var6.field1414;
            } else {
                arg3.field6226 = var6.field1435;
            }
        } else {
            arg3.field6230 = false;
            if (arg2 == 2 && var6.field1418 != -1) {
                if (arg0 < 0 && var6.field1462 != -1) {
                    arg3.field6226 = var6.field1462;
                } else if (arg0 <= 0 || var6.field1439 == -1) {
                    arg3.field6226 = var6.field1418;
                } else {
                    arg3.field6226 = var6.field1439;
                }
            } else if (arg2 == 0 && var6.field1414 != -1) {
                if (arg0 < 0 && var6.field1459 != -1) {
                    arg3.field6226 = var6.field1459;
                } else if (arg0 <= 0 || var6.field1446 == -1) {
                    arg3.field6226 = var6.field1414;
                } else {
                    arg3.field6226 = var6.field1446;
                }
            } else if (arg0 < 0 && var6.field1445 != -1) {
                arg3.field6226 = var6.field1445;
            } else if (arg0 <= 0 || var6.field1426 == -1) {
                arg3.field6226 = var6.field1435;
            } else {
                arg3.field6226 = var6.field1426;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([BZ)Lf;", line = 166)
    public static final class702 method3545(byte[] arg0, boolean arg1) {
        if (arg1) {
            field9002 = -54;
        }
        field9003++;
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class565.field7967);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class565.field7967);
                int var5 = var2.getHeight(class565.field7967);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class282.field4228.method209(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 214)
    public static final void method3546(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9004++;
        float var5 = (float) class25.field360 / (float) class25.field359;
        int var6 = arg2;
        if (arg4 != -31579) {
            method3546(-114, -94, -106, -99, -118);
        }
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg1 - (arg3 - var7) / 2;
        int var9 = arg0 - (arg2 - var6) / 2;
        class199.field2808 = class25.field359 * var9 / var6;
        class9.field89 = -1;
        class319.field4698 = -1;
        class671.field9481 = class25.field360 - (class25.field360 * var8 / var7);
        class167.method1159((byte) -33);
    }
}
