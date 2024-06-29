import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class672 {

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "Ltb;")
    private class450 field9457 = new class450(128);

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "Ltb;")
    public class450 field9463 = new class450(64);

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "Lpl;")
    public class612 field9453;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "Lpl;")
    private class612 field9460;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "D")
    public static double field9454 = -1.0D;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "Lav;")
    public static class324 field9462;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 3)
    public static void method3770(int arg0) {
        field9462 = null;
        if (arg0 <= 70) {
            method3774(null, 99);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lww;", line = 14)
    public final class647 method3771(int arg0, int arg1) {
        field9456++;
        class450 var3 = this.field9457;
        class647 var4;
        synchronized (this.field9457) {
            var4 = (class647) this.field9457.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -107 / ((-arg1 - 44) / 38);
        class612 var6 = this.field9460;
        byte[] var7;
        synchronized (this.field9460) {
            var7 = this.field9460.method3365(arg0, -124, 36);
        }
        class647 var8 = new class647();
        var8.field9122 = arg0;
        var8.field9095 = this;
        if (var7 != null) {
            var8.method3620(-1, new class630(var7));
        }
        var8.method3621(-92);
        class450 var9 = this.field9457;
        synchronized (this.field9457) {
            this.field9457.method2409((long) arg0, var8, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 49)
    public final void method3772(byte arg0) {
        class450 var2 = this.field9457;
        synchronized (this.field9457) {
            this.field9457.method2412((byte) 59);
        }
        if (arg0 < 126) {
            return;
        }
        field9451++;
        class450 var3 = this.field9463;
        synchronized (this.field9463) {
            this.field9463.method2412((byte) 101);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)Lsc;", line = 67)
    public static final class364 method3773(int arg0, byte arg1) {
        field9452++;
        int var2 = 16 % ((32 - arg1) / 60);
        return arg0 >= 0 && arg0 < 100 ? class233.field2904[arg0] : null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([BI)Lf;", line = 81)
    public static final class536 method3774(byte[] arg0, int arg1) {
        field9450++;
        if (arg1 < 29) {
            return null;
        } else if (arg0 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class520.field7094);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class520.field7094);
                    int var5 = var2.getHeight(class520.field7094);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class32.field452.method1025(var6, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)V", line = 122)
    public final void method3775(byte arg0, int arg1) {
        class450 var3 = this.field9457;
        synchronized (this.field9457) {
            this.field9457.method2411(true, arg1);
        }
        int var4 = 64 / ((78 - arg0) / 44);
        field9459++;
        class450 var5 = this.field9463;
        synchronized (this.field9463) {
            this.field9463.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V", line = 147)
    public final void method3776(byte arg0) {
        class450 var2 = this.field9457;
        synchronized (this.field9457) {
            this.field9457.method2406(18385);
        }
        field9458++;
        class450 var3 = this.field9463;
        synchronized (this.field9463) {
            if (arg0 <= 122) {
                this.method3771(-26, 86);
            }
            this.field9463.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZI)V", line = 165)
    public final void method3777(int arg0, boolean arg1, int arg2) {
        this.field9457 = new class450(arg2);
        if (!arg1) {
            method3773(-55, (byte) 19);
        }
        field9455++;
        this.field9463 = new class450(arg0);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;)V", line = 185)
    public class672(class112 arg0, int arg1, class612 arg2, class612 arg3) {
        this.field9453 = arg3;
        this.field9460 = arg2;
        this.field9460.method3349(36, true);
    }
}
