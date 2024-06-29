import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class442 implements Runnable {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field6242 = 0;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lcq;")
    public static class110 field6243 = new class110(61, 3);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[I")
    public static int[] field6247 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "[I")
    public static int[] field6248 = new int[4096];

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lfg;")
    public static class174 field6249;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lhu;")
    public static class526 field6236;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lbp;")
    private class88 field6239;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field6245;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
    private volatile boolean field6238;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[Los;")
    private class510[] field6237;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I", line = 5)
    public static final int method2562(int arg0) {
        field6244++;
        return arg0 == 16 ? 16 : -70;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method2563(byte arg0) {
        field6240++;
        if (this.field6238) {
            return true;
        }
        if (this.field6239 == null) {
            try {
                int var2 = class364.field4875 == class337.field4237 ? 80 : class42.field414.field2001 + 7000;
                this.field6239 = class353.field4757.method2681((byte) 8, new URL("http://" + class42.field414.field1987 + ":" + var2 + "/news.ws?game=" + class246.field3031.field3943));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field6239 == null || this.field6239.field884 == 2) {
            return true;
        }
        if (arg0 != 93) {
            field6249 = null;
        }
        if (this.field6239.field884 != 1) {
            return false;
        }
        if (this.field6245 == null) {
            this.field6245 = new Thread(this);
            this.field6245.start();
        }
        return this.field6238;
    }

    @OriginalMember(owner = "client!wk", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        field6241++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6239.field886));
            String var2 = var1.readLine();
            class575 var3 = class420.method2354(true);
            while (var2 != null) {
                var3.method3251(-31977, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3249(50);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field6237 = new class510[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6237[var5 / 3] = new class510(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6238 = true;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 112)
    public static void method2564(int arg0) {
        if (arg0 <= 26) {
            method2562(-50);
        }
        field6249 = null;
        field6236 = null;
        field6243 = null;
        field6248 = null;
        field6247 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Los;", line = 129)
    public final class510 method2565(int arg0, int arg1) {
        field6246++;
        if (arg1 != 3) {
            this.method2565(-115, 85);
        }
        return this.field6237 == null || arg0 < 0 || arg0 >= this.field6237.length ? null : this.field6237[arg0];
    }
}
