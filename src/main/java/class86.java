import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class86 {

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "S")
    public short field1060;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "S")
    public short field1053;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "B")
    public byte field1054;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "S")
    public short field1058;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "B")
    public byte field1056;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Z")
    public boolean field1062;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1055 = null;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1057 = -1;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method648(int arg0) {
        if (arg0 != 0) {
            method648(-88);
        }
        field1055 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)Loia;")
    public static final class88 method649(byte[] arg0, int arg1) {
        field1052++;
        if (arg1 <= 102) {
            return null;
        } else if (arg0 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class499.field7161);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class499.field7161);
                    int var5 = var2.getHeight(class499.field7161);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class268.field3831.method426(var4, var5, var6, -1, var4, 0);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field1060 = (short) arg4;
        this.field1063 = arg10;
        this.field1053 = (short) arg5;
        this.field1054 = (byte) arg8;
        this.field1058 = (short) arg6;
        this.field1061 = arg0;
        this.field1056 = (byte) arg7;
        this.field1062 = arg9;
    }
}
