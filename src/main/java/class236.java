import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Lfja;")
    public static class783 field3388 = new class783(121, 11);

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "Lem;")
    public static class239 field3389 = new class239();

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Z")
    public static boolean field3391 = false;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field3392 = 100;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3393 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[I")
    public static int[] field3395 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field3394 = 0;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lfo;")
    private class545 field3382;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3387;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
    private volatile boolean field3384;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[Laha;")
    private class403[] field3385;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Laha;", line = 3)
    public final class403 method1584(int arg0, int arg1) {
        field3386++;
        if (arg1 > -69) {
            field3391 = false;
        }
        return this.field3385 == null || arg0 < 0 || this.field3385.length <= arg0 ? null : this.field3385[arg0];
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z", line = 24)
    public final boolean method1585(byte arg0) {
        field3390++;
        if (this.field3384) {
            return true;
        }
        if (this.field3382 == null) {
            try {
                int var2 = class556.field7850 == class517.field7028 ? 80 : class13.field201.field10374 + 7000;
                this.field3382 = class630.field8751.method4111((byte) -26, new URL("http://" + class13.field201.field10366 + ":" + var2 + "/news.ws?game=" + class177.field2797.field8378));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field3382 == null || this.field3382.field7412 == 2) {
            return true;
        } else if (this.field3382.field7412 != 1) {
            return false;
        } else if (arg0 < 5) {
            return true;
        } else {
            if (this.field3387 == null) {
                this.field3387 = new Thread(this);
                this.field3387.start();
            }
            return this.field3384;
        }
    }

    @OriginalMember(owner = "client!nt", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        field3383++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field3382.field7416));
            String var2 = var1.readLine();
            class189 var3 = class532.method3016((byte) -103);
            while (var2 != null) {
                var3.method1388(var2, 0);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1390((byte) 116);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field3385 = new class403[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field3385[var5 / 3] = new class403(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field3384 = true;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 111)
    public static void method1586(int arg0) {
        field3389 = null;
        field3393 = null;
        field3395 = null;
        int var1 = -26 % ((arg0 + 26) / 50);
        field3388 = null;
    }
}
