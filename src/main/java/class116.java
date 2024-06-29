import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class116 implements Runnable {

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Lwo;")
    public static class690 field1500 = new class690(83, 6);

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "Ljk;")
    public static class585 field1507 = new class585(80, 3);

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "Lwo;")
    public static class690 field1509 = new class690(93, -1);

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "Lnga;")
    private class477 field1504;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1499;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "Z")
    private volatile boolean field1498;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "[Leq;")
    private class193[] field1502;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z")
    public final boolean method825(byte arg0) {
        field1501++;
        if (this.field1498) {
            return true;
        }
        if (this.field1504 == null) {
            try {
                int var2 = class39.field729 == class215.field2737 ? 80 : class409.field5796.field4476 + 7000;
                this.field1504 = class517.field7570.method1508(new URL("http://" + class409.field5796.field4480 + ":" + var2 + "/news.ws?game=" + class588.field8518.field1256), false);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field1504 == null || this.field1504.field6693 == 2) {
            return true;
        }
        if (arg0 <= 62) {
            this.run();
        }
        if (this.field1504.field6693 != 1) {
            return false;
        }
        if (this.field1499 == null) {
            this.field1499 = new Thread(this);
            this.field1499.start();
        }
        return this.field1498;
    }

    @OriginalMember(owner = "client!eea", name = "run", descriptor = "()V")
    public final void run() {
        field1503++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1504.field6695));
            String var2 = var1.readLine();
            class391 var3 = class469.method2751(15555);
            while (var2 != null) {
                var3.method2289(var2, (byte) 94);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2288(104);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field1502 = new class193[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1502[var5 / 3] = new class193(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1498 = true;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
    public static void method826(byte arg0) {
        if (arg0 != 18) {
            field1507 = null;
        }
        field1509 = null;
        field1500 = null;
        field1507 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Leq;")
    public final class193 method827(int arg0, byte arg1) {
        field1506++;
        if (arg1 == -106) {
            return this.field1502 == null || arg0 < 0 || arg0 >= this.field1502.length ? null : this.field1502[arg0];
        } else {
            return null;
        }
    }
}
