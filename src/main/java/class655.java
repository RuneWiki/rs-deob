import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class655 implements Runnable {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Ldr;")
    public static class675 field8919 = new class675(30, -1);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[I")
    public static int[] field8921 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lue;")
    private class218 field8914;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field8917;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Z")
    private volatile boolean field8922;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[Lti;")
    private class409[] field8916;

    @OriginalMember(owner = "client!ih", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field8915++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8914.field2547));
            String var2 = var1.readLine();
            class356 var3 = class152.method943(1006);
            while (var2 != null) {
                var3.method2031(-99, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2035(6);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field8916 = new class409[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8916[var5 / 3] = new class409(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8922 = true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 45)
    public static void method3660(byte arg0) {
        field8919 = null;
        if (arg0 < 105) {
            method3660((byte) 121);
        }
        field8921 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Lti;", line = 57)
    public final class409 method3661(int arg0, byte arg1) {
        field8920++;
        if (arg1 < 70) {
            this.field8917 = null;
        }
        return this.field8916 == null || arg0 < 0 || arg0 >= this.field8916.length ? null : this.field8916[arg0];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z", line = 80)
    public final boolean method3662(int arg0) {
        field8918++;
        if (this.field8922) {
            return true;
        }
        if (this.field8914 == null) {
            try {
                int var2 = class257.field3292 == class255.field3277 ? 80 : class373.field4810.field3030 + 7000;
                this.field8914 = class386.field4955.method2599(new URL("http://" + class373.field4810.field3035 + ":" + var2 + "/news.ws?game=" + class341.field4353.field8728), (byte) -62);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field8914 == null || this.field8914.field2546 == 2) {
            return true;
        } else if (this.field8914.field2546 == 1) {
            if (this.field8917 == null) {
                this.field8917 = new Thread(this);
                this.field8917.start();
            }
            return arg0 == 9601 ? this.field8922 : false;
        } else {
            return false;
        }
    }
}
