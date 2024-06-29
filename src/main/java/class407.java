import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class407 extends class513 {

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "Ljava/lang/String;")
    public String field5650;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "[Z")
    public static boolean[] field5651 = new boolean[8];

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[B)Lcw;")
    public static final class21 method2482(int arg0, byte[] arg1) {
        field5648++;
        if (arg0 != 8) {
            return null;
        } else if (arg1 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                    MediaTracker var3 = new MediaTracker(class306.field3966);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class306.field3966);
                    int var5 = var2.getHeight(class306.field3966);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class96.field1401.method3258(var6, 1, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
    public static void method2483(byte arg0) {
        field5651 = null;
        if (arg0 >= -118) {
            field5651 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIZZ)I")
    public static final int method2484(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field5649++;
        int var5 = 15 % ((58 - arg1) / 58);
        class344 var6 = class70.method444(arg0, arg4, Integer.MIN_VALUE);
        if (var6 == null) {
            return 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var6.field4392.length; var8++) {
            if (var6.field4392[var8] >= 0 && var6.field4392[var8] < class487.field6572.field7134) {
                class544 var9 = class487.field6572.method3054(var6.field4392[var8], (byte) -99);
                int var10 = var9.method3238(class223.field3134.method2390(1, arg2).field10448, 25427, arg2);
                if (arg3) {
                    var7 += var6.field4391[var8] * var10;
                } else {
                    var7 += var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
    public class407() {
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class407(String arg0) {
        this.field5650 = arg0;
    }
}
