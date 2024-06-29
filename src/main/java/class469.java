import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class469 implements Runnable {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field6382 = 0;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field6395 = 0;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Lgga;")
    public static class513 field6386;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Lot;")
    private class746 field6394;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field6383;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
    private volatile boolean field6385;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lhka;")
    private class77[] field6389;

    @OriginalMember(owner = "client!mt", name = "run", descriptor = "()V")
    public final void run() {
        field6390++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6394.field10371));
            String var2 = var1.readLine();
            class589 var3 = class409.method2413(849519460);
            while (var2 != null) {
                var3.method3453(var2, -1);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3452(-32597);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field6389 = new class77[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6389[var5 / 3] = new class77(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6385 = true;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static final void method2738(int arg0) {
        class82.method724();
        if (arg0 != 2) {
            method2738(1);
        }
        field6393++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z")
    public final boolean method2739(byte arg0) {
        field6388++;
        if (this.field6385) {
            return true;
        }
        if (this.field6394 == null) {
            try {
                int var2 = class94.field1340 == class145.field2353 ? 80 : class488.field6706.field5598 + 7000;
                this.field6394 = class336.field4775.method922(0, new URL("http://" + class488.field6706.field5595 + ":" + var2 + "/news.ws?game=" + class113.field1647.field482));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field6394 == null || this.field6394.field10365 == 2) {
            return true;
        }
        if (arg0 <= 27) {
            field6386 = null;
        }
        if (this.field6394.field10365 != 1) {
            return false;
        }
        if (this.field6383 == null) {
            this.field6383 = new Thread(this);
            this.field6383.start();
        }
        return this.field6385;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)Lhka;")
    public final class77 method2740(byte arg0, int arg1) {
        if (arg0 != 95) {
            method2742(-122);
        }
        field6384++;
        return this.field6389 == null || arg1 < 0 || arg1 >= this.field6389.length ? null : this.field6389[arg1];
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
    public static final int method2741(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        field6387++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 <= 3) {
            return 21;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V")
    public static void method2742(int arg0) {
        if (arg0 != -14559) {
            method2741(-60, -50);
        }
        field6386 = null;
    }
}
