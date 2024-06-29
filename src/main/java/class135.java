import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class135 implements Runnable {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1747 = -1;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "Z")
    public static boolean field1753 = false;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "Lrb;")
    private class370 field1758;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1757;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Z")
    private volatile boolean field1751;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "[Luia;")
    private class380[] field1755;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "[[S")
    public static short[][] field1748;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)Z")
    public final boolean method953(boolean arg0) {
        if (!arg0) {
            field1748 = null;
        }
        field1749++;
        if (this.field1751) {
            return true;
        }
        if (this.field1758 == null) {
            try {
                int var2 = class256.field3599 == class177.field2704 ? 80 : class190.field2837.field6989 + 7000;
                this.field1758 = class27.field395.method3429(new URL("http://" + class190.field2837.field6987 + ":" + var2 + "/news.ws?game=" + class536.field7555.field1305), (byte) -71);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field1758 == null || this.field1758.field5314 == 2) {
            return true;
        } else if (this.field1758.field5314 == 1) {
            if (this.field1757 == null) {
                this.field1757 = new Thread(this);
                this.field1757.start();
            }
            return this.field1751;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Luia;")
    public final class380 method954(int arg0, int arg1) {
        if (arg0 != 0) {
            method955((byte) -64);
        }
        field1752++;
        return this.field1755 == null || arg1 < 0 || this.field1755.length <= arg1 ? null : this.field1755[arg1];
    }

    @OriginalMember(owner = "client!ju", name = "run", descriptor = "()V")
    public final void run() {
        field1756++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1758.field5317));
            String var2 = var1.readLine();
            class777 var3 = class183.method1368((byte) 51);
            while (var2 != null) {
                var3.method4269(var2, -21156);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method4268((byte) 114);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field1755 = new class380[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1755[var5 / 3] = new class380(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1751 = true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static void method955(byte arg0) {
        field1748 = null;
        if (arg0 >= -36) {
            method955((byte) 117);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static final void method956(int arg0) {
        class453.field6516++;
        field1754++;
        class731 var1 = class155.method1222(260, class275.field3819, class237.field3417);
        var1.field10211.method851((byte) -2, class100.method704(0));
        if (arg0 >= -44) {
            method956(-29);
        }
        var1.field10211.method860(class638.field8980, (byte) 126);
        var1.field10211.method860(class512.field7325, (byte) 115);
        var1.field10211.method851((byte) -2, class145.field1852.field8991.method1399((byte) -81));
        class533.method3088(var1, 0);
    }
}
