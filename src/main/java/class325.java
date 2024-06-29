import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class325 implements Runnable {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Lnf;")
    public static class20 field4495;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Ljg;")
    private class246 field4488;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field4494;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
    private volatile boolean field4489;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "[Lhp;")
    private class563[] field4493;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[Z")
    public static boolean[] field4491;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2079(byte arg0) {
        field4491 = null;
        field4495 = null;
        if (arg0 != -36) {
            method2079((byte) -87);
        }
    }

    @OriginalMember(owner = "client!cp", name = "run", descriptor = "()V", line = 17)
    public final void run() {
        field4490++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field4488.field3638));
            String var2 = var1.readLine();
            class479 var3 = class105.method690(26402);
            while (var2 != null) {
                var3.method2912(7459, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2916(-123);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field4493 = new class563[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field4493[var5 / 3] = new class563(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field4489 = true;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lhp;", line = 62)
    public final class563 method2080(int arg0, int arg1) {
        if (arg0 == 0) {
            field4496++;
            return this.field4493 == null || arg1 < 0 || this.field4493.length <= arg1 ? null : this.field4493[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z", line = 80)
    public final boolean method2081(int arg0) {
        field4492++;
        if (this.field4489) {
            return true;
        }
        if (this.field4488 == null) {
            try {
                int var2 = class341.field4815 == class172.field2390 ? 80 : class266.field3901.field6484 + 7000;
                this.field4488 = class159.field2227.method859(new URL("http://" + class266.field3901.field6485 + ":" + var2 + "/news.ws?game=" + class289.field4140.field7713), (byte) -128);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field4488 == null || this.field4488.field3633 == 2) {
            return true;
        }
        if (arg0 != 2) {
            this.method2080(8, -114);
        }
        if (this.field4488.field3633 != 1) {
            return false;
        }
        if (this.field4494 == null) {
            this.field4494 = new Thread(this);
            this.field4494.start();
        }
        return this.field4489;
    }
}
