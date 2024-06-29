import jagex3.jagmisc.jagmisc;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class499 implements Runnable {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lwo;")
    private class445 field6853 = new class445();

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field6856 = new Thread(this);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[Z")
    public static boolean[] field6860;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)Lf;", line = 3)
    public static final class532 method2829(int arg0, byte[] arg1) {
        field6850++;
        if (arg0 <= 36) {
            field6860 = null;
        }
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class386.field5153);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class386.field5153);
                int var5 = var2.getHeight(class386.field5153);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class146.field1963.method1122(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILkba;B)V", line = 42)
    public static final void method2830(int arg0, int arg1, int arg2, class573 arg3, byte arg4) {
        field6854++;
        int var5 = arg3.field3088[0];
        int var6 = arg3.field3086[0];
        if (var5 < 0 || class703.field9886 <= var5 || var6 < 0 || var6 >= class431.field5789 || arg0 != 39 || arg2 < 0 || class703.field9886 <= arg2 || arg1 < 0 || class431.field5789 <= arg1) {
            return;
        }
        int var7 = class209.method1327(var5, -4, class322.field4302[arg3.field385], (byte) 125, 0, arg2, 0, 0, class502.field6925, var6, arg1, true, 0, arg3.method1435((byte) 98), class10.field99);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg3.method3168(26474, arg4, class502.field6925[var8], class10.field99[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 81)
    public final void method2831(int arg0) {
        if (arg0 != 0) {
            this.field6853 = null;
        }
        field6859++;
        if (this.field6856 == null) {
            return;
        }
        this.method2834(122, new class45());
        try {
            this.field6856.join();
        } catch (InterruptedException var2) {
        }
        this.field6856 = null;
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V", line = 104)
    public final void run() {
        field6852++;
        while (true) {
            class445 var1 = this.field6853;
            class292 var3;
            synchronized (this.field6853) {
                class45 var2;
                for (var2 = this.field6853.method2502((byte) 80); var2 == null; var2 = this.field6853.method2502((byte) 40)) {
                    try {
                        this.field6853.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class292)) {
                    return;
                }
                var3 = (class292) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3860).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3853 = var5;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 144)
    public static final void method2832(int arg0) {
        field6857++;
        if (arg0 != -1) {
            method2836(-3);
        }
        class246.method1501((byte) 111);
        class276.method1656(arg0 - 896460183);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)Ltaa;", line = 156)
    public final class292 method2833(String arg0, byte arg1) {
        field6851++;
        if (this.field6856 == null) {
            throw new IllegalStateException("");
        }
        int var3 = -66 / ((17 - arg1) / 44);
        if (arg0 == null) {
            throw new IllegalArgumentException("");
        }
        class292 var4 = new class292(arg0);
        this.method2834(60, var4);
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjca;)V", line = 177)
    private final void method2834(int arg0, class45 arg1) {
        if (arg0 < 51) {
            this.field6853 = null;
        }
        class445 var3 = this.field6853;
        synchronized (this.field6853) {
            this.field6853.method2507(arg1, (byte) -128);
            this.field6853.notify();
        }
        field6858++;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 228)
    public class499() {
        this.field6856.setDaemon(true);
        this.field6856.start();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V", line = 194)
    public static final void method2835(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= arg1) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class315.field4224[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class315.field4224[var6][arg0] = arg4;
            }
        }
        if (arg2 != 0) {
            field6860 = null;
        }
        field6855++;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 245)
    public static void method2836(int arg0) {
        if (arg0 != 1) {
            field6860 = null;
        }
        field6860 = null;
    }
}
