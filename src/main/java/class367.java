import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class367 {

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "Z")
    public boolean field5138;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "Lbca;")
    public static class662 field5142 = new class662();

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "Z")
    public static boolean field5144 = false;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "Lam;")
    public class633 field5135;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "Lam;")
    public class633 field5145;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "Z")
    public boolean field5137;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I[B)Lhu;")
    public static final class133 method2166(int arg0, byte[] arg1) {
        if (arg0 >= -38) {
            method2168((byte) 103, -9, 116, 65, -114, 20, 111);
        }
        field5134++;
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class243.field3401);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class243.field3401);
                int var5 = var2.getHeight(class243.field3401);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class341.field4807.method450(var5, (byte) 99, var4, var6, 0, var4);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)I")
    public static final int method2167(int arg0) {
        field5139++;
        return ~class410.field5681 == arg0 ? class186.field2817 : 0;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(BIIIIII)Ltea;")
    public static final class241 method2168(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5140++;
        if (arg0 != -121) {
            field5144 = true;
        }
        long var7 = (long) arg5 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg3 * 475427L ^ (long) arg6 * 67481L ^ (long) arg1 * 97549L ^ (long) arg4 * 76724863L;
        class241 var9 = (class241) class528.field6997.method552(4, var7);
        if (var9 == null) {
            class241 var10 = class164.field2494.method477(arg6, arg1, arg3, arg2, arg5, arg4);
            class528.field6997.method556((byte) 0, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V")
    public static void method2169(byte arg0) {
        field5142 = null;
        int var1 = 44 % ((arg0 - 67) / 54);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
    public final void method2170(boolean arg0) {
        if (!arg0) {
            method2167(18);
        }
        field5143++;
        if (this.field5135 != null) {
            this.field5135.method588(false);
        }
        this.field5137 = false;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)Z")
    public final boolean method2171(int arg0) {
        if (arg0 == 29782) {
            field5141++;
            return this.field5137 && !this.field5138;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Z)V")
    public class367(boolean arg0) {
        this.field5138 = arg0;
    }
}
