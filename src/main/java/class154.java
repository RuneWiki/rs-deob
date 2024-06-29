import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class154 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "B")
    private byte field2425;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lcu;")
    public static class206 field2436 = new class206(39, 2);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lkca;")
    public static class76 field2437;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[Lvb;")
    public static class183[] field2423;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IC)Z", line = 5)
    public static final boolean method1079(int arg0, char arg1) {
        if (arg0 == 7) {
            field2428++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)I", line = 16)
    public final int method1080(int arg0) {
        field2431++;
        if (arg0 <= 60) {
            method1081(-97, null);
        }
        return this.field2425 & 0x7;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[B)Lxa;", line = 27)
    public static final class468 method1081(int arg0, byte[] arg1) {
        field2427++;
        if (arg1 == null) {
            throw new RuntimeException("");
        } else if (arg0 == 2) {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                    MediaTracker var3 = new MediaTracker(class139.field2244);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class139.field2244);
                    int var5 = var2.getHeight(class139.field2244);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class10.field197.method374(var6, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I", line = 67)
    public final int method1082(int arg0) {
        field2435++;
        if (arg0 != 8) {
            this.field2425 = 97;
        }
        return (this.field2425 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBILgba;)V", line = 80)
    public static final void method1083(int arg0, byte arg1, int arg2, class625 arg3) {
        field2433++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field8414 != null) {
            class48 var4 = new class48();
            var4.field692 = arg3;
            var4.field681 = arg3.field8414;
            class544.method3013(var4);
        }
        class2.field26 = arg2;
        class400.field5305 = true;
        class425.field5847 = arg3.field8442;
        class428.field5883 = arg3.field8282;
        class37.field563 = arg3.field8403;
        class522.field6979 = arg3.field8418;
        class255.field3536 = arg3.field8327;
        class658.field9093 = arg0;
        class463.method2624(false, arg3);
        if (arg1 != -41) {
            method1083(0, (byte) 103, -106, null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lbi;BI)Lkga;", line = 120)
    public static final class511 method1084(class449 arg0, byte arg1, int arg2) {
        field2432++;
        if (arg1 == 40) {
            byte[] var3 = arg0.method2531(arg2, 0);
            return var3 == null ? null : new class511(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 138)
    public static void method1085(int arg0) {
        field2437 = null;
        field2436 = null;
        if (arg0 != 39) {
            field2437 = null;
        }
        field2423 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 151)
    public class154() {
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Leh;)V", line = 159)
    public class154(class335 arg0) {
        this.field2425 = arg0.method2040(-70);
        this.field2424 = arg0.method2001((byte) -83);
        this.field2430 = arg0.method2045(-98);
        this.field2429 = arg0.method2045(-98);
        this.field2426 = arg0.method2045(-98);
        this.field2434 = arg0.method2045(-98);
    }
}
