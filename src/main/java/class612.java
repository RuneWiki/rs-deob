import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class612 implements Runnable {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lhu;")
    private class141 field8604;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field8600;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Z")
    private volatile boolean field8599;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[Lan;")
    private class25[] field8603;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lan;", line = 7)
    public final class25 method3555(int arg0, byte arg1) {
        field8602++;
        int var3 = 40 % ((arg1 - 52) / 42);
        return this.field8603 == null || arg0 < 0 || arg0 >= this.field8603.length ? null : this.field8603[arg0];
    }

    @OriginalMember(owner = "client!lk", name = "run", descriptor = "()V", line = 22)
    public final void run() {
        field8601++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8604.field2092));
            String var2 = var1.readLine();
            class234 var3 = class529.method3195(1);
            while (var2 != null) {
                var3.method1569(var2, 1);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1567(23);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field8603 = new class25[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8603[var5 / 3] = new class25(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8599 = true;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z", line = 64)
    public final boolean method3556(int arg0) {
        field8605++;
        if (arg0 < 114) {
            this.method3555(-14, (byte) -63);
        }
        if (this.field8599) {
            return true;
        }
        if (this.field8604 == null) {
            try {
                int var2 = class622.field8739 == class300.field4326 ? 80 : class277.field4037.field763 + 7000;
                this.field8604 = class519.field7328.method2832((byte) -10, new URL("http://" + class277.field4037.field760 + ":" + var2 + "/news.ws?game=" + class60.field734.field3718));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field8604 == null || this.field8604.field2089 == 2) {
            return true;
        } else if (this.field8604.field2089 == 1) {
            if (this.field8600 == null) {
                this.field8600 = new Thread(this);
                this.field8600.start();
            }
            return this.field8599;
        } else {
            return false;
        }
    }
}
