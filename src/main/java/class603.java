import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class603 extends class35 {

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field8112;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Lsq;")
    private class194 field8109;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "Lps;")
    private class5 field8121;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "Lwba;")
    public static class540 field8113 = new class540(0, 0);

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
    public static boolean field8118 = false;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "F")
    public static float field8120;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "Lpe;")
    public static class615 field8117;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field8116;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([BB)Lxa;")
    public static final class511 method3276(byte[] arg0, byte arg1) {
        field8106++;
        if (arg1 != 127) {
            field8118 = true;
        }
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class381.field4890);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class381.field4890);
                int var5 = var2.getHeight(class381.field4890);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class520.field6799.method381(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
    public static void method3277(int arg0) {
        field8116 = null;
        int var1 = 108 % ((60 - arg0) / 60);
        field8113 = null;
        field8117 = null;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Z")
    public final boolean method278(int arg0, int arg1) throws IOException {
        field8108++;
        if (arg1 != 5) {
            this.method281(37);
        }
        return this.field8109.method1280((byte) -119, arg0);
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
    public final void method281(int arg0) {
        try {
            this.field8112.close();
        } catch (IOException var2) {
        }
        field8107++;
        this.field8109.method1279((byte) 37);
        this.field8121.method16((byte) 98);
        if (arg0 != 0) {
            method3277(105);
        }
    }

    @OriginalMember(owner = "client!aga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method281(0);
        field8110++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[BII)I")
    public final int method279(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8115++;
        return arg0 == 19311 ? this.field8109.method1277(arg3, arg0 ^ 0xFFFFB490, arg2, arg1) : 3;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
    public final void method276(int arg0) {
        field8114++;
        this.field8109.method1282((byte) -46);
        this.field8121.method17(-1);
        if (arg0 != 0) {
            field8116 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[BI)V")
    public final void method280(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 > 103) {
            this.field8121.method19(arg2, arg0, arg1, true);
            field8111++;
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class603(Socket arg0, int arg1) throws IOException {
        this.field8112 = arg0;
        this.field8112.setSoTimeout(30000);
        this.field8112.setTcpNoDelay(true);
        this.field8109 = new class194(this.field8112.getInputStream(), arg1);
        this.field8121 = new class5(this.field8112.getOutputStream(), arg1);
    }
}
