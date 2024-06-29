import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class199 extends class425 {

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[B")
    public byte[] field3100;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lrg;")
    public static class597 field3097 = new class597();

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method1423(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3101++;
        class509.method3014(-67, arg1, class366.field5422.length - 1, arg3, arg0, arg4, 0);
        class137.field2421 = 0;
        if (arg2 == 7714) {
            class699.field9854 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1424(byte arg0) {
        field3097 = null;
        if (arg0 < 47) {
            method1423(true, 15, 118, -104, false);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)Lf;")
    public static final class702 method1425(byte[] arg0, int arg1) {
        field3099++;
        if (arg0 == null) {
            throw new RuntimeException("");
        } else if (arg1 == -9285) {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class486.field6963);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class486.field6963);
                    int var5 = var2.getHeight(class486.field6963);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class623.field9017.method54(var6, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public static final void method1426(boolean arg0, int arg1) {
        field3102++;
        class86.field1625 = 0;
        class398.field5793 = arg1;
        class439.method2655(arg1 ^ Integer.MIN_VALUE);
        class445.method2675(-126, arg0);
        class584.method3345(arg1);
        boolean var2 = false;
        for (int var3 = 0; var3 < class86.field1625; var3++) {
            int var5 = class288.field4296[var3];
            class436 var6 = (class436) class208.field3179.method2596((long) var5, arg1 ^ 0x75);
            class22 var7 = var6.field6298;
            if (class308.field4551 && class10.method278(-914424436, var5)) {
                class679.method3819(67);
            }
            if (class336.field5031 != var7.field8683) {
                if (var7.field880.method2149(false)) {
                    class398.method2450(var7, (byte) -124);
                }
                var7.method461((byte) 98, null);
                var2 = true;
                var6.method2588(300);
            }
        }
        if (var2) {
            class39.field1062 = class208.field3179.method2603(-123);
            class208.field3179.method2599(-114, class459.field6542);
        }
        if (class478.field6872 != class126.field2299.field1393) {
            throw new RuntimeException("gnp1 pos:" + class126.field2299.field1393 + " psize:" + class478.field6872);
        }
        for (int var4 = 0; var4 < class363.field5389; var4++) {
            if (class208.field3179.method2596((long) class367.field5444[var4], 60) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class363.field5389);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        this.field3100 = arg0;
    }
}
