import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class338 {

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
    public static int[] field4921 = new int[1024];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lvd;")
    public static class39 field4915;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "[B")
    public byte[] field4924;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[S")
    public short[] field4916;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[S")
    public short[] field4920;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[S")
    public short[] field4922;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BI)Lpga;")
    public static final class536 method2155(byte[] arg0, int arg1) {
        field4918++;
        if (arg1 <= 126) {
            field4915 = null;
        }
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class236.field3433);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class236.field3433);
                int var5 = var2.getHeight(class236.field3433);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class736.field10316.method531(var5, var4, var6, var4, 0, (byte) -101);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILsca;Lsca;)V")
    public static final void method2156(int arg0, class46 arg1, class46 arg2) {
        field4923++;
        class756.field10581++;
        class468 var3 = class93.method734(class29.field284, class630.field8798, 8174);
        if (arg0 >= -38) {
            return;
        }
        var3.field6839.method3695(arg1.field610, 255);
        var3.field6839.method3702(arg2.field687, (byte) -108);
        var3.field6839.method3702(arg1.field603, (byte) -128);
        var3.field6839.method3705(-21138, arg2.field610);
        var3.field6839.method3706((byte) 82, arg1.field687);
        var3.field6839.method3702(arg2.field603, (byte) -108);
        class120.method872((byte) -79, var3);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILk;I)V")
    public static final void method2157(byte arg0, int arg1, class567 arg2, int arg3) {
        field4917++;
        if (!class483.field6967) {
            return;
        }
        int var4 = 0;
        for (class342 var5 = (class342) arg2.field8055.method3508(arg0 + 100); var5 != null; var5 = (class342) arg2.field8055.method3507(-14)) {
            int var10 = class162.method1183(var5, (byte) 115);
            if (var10 > var4) {
                var4 = var10;
            }
        }
        var4 += 8;
        class128.field1706 = arg2.field8052 * 16 + (class332.field4768 ? 26 : 22);
        int var6 = arg2.field8052 * 16 + 21;
        int var7 = class642.field9012 + class624.field8741;
        if (class501.field7123 < var4 + var7) {
            var7 = class642.field9012 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (arg0 != -102) {
            method2156(-87, null, null);
        }
        int var8 = class332.field4768 ? 33 : 31;
        int var9 = arg3 + 13 - var8;
        if (class510.field7263 < (var6 + var9)) {
            var9 = class510.field7263 - var6;
        }
        class582.field8289 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class218.field3211 = arg2;
        class304.field4300 = var9;
        class600.field8491 = var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method2158(int arg0) {
        if (arg0 != 0) {
            field4921 = null;
        }
        field4921 = null;
        field4915 = null;
    }
}
