import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class328 implements Runnable {

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field4444 = 0;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Ljt;")
    private class107 field4438;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field4440;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Z")
    private volatile boolean field4445;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "[Lwe;")
    private class409[] field4435;

    @OriginalMember(owner = "client!vv", name = "run", descriptor = "()V", line = 11)
    public final void run() {
        field4436++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field4438.field1418));
            String var2 = var1.readLine();
            class146 var3 = class384.method2255(120);
            while (var2 != null) {
                var3.method904(var2, 0);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method903(20780);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field4435 = new class409[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field4435[var5 / 3] = new class409(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field4445 = true;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method1950(int arg0) {
        field4442++;
        if (arg0 != -1) {
            return false;
        } else if (this.field4445) {
            return true;
        } else {
            if (this.field4438 == null) {
                try {
                    int var2 = class61.field673 == class200.field2376 ? 80 : class252.field3246.field7967 + 7000;
                    this.field4438 = class287.field3823.method4134(-106, new URL("http://" + class252.field3246.field7975 + ":" + var2 + "/news.ws?game=" + class51.field541.field3141));
                } catch (MalformedURLException var3) {
                    return true;
                }
            }
            if (this.field4438 == null || this.field4438.field1419 == 2) {
                return true;
            } else if (this.field4438.field1419 == 1) {
                if (this.field4440 == null) {
                    this.field4440 = new Thread(this);
                    this.field4440.start();
                }
                return this.field4445;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Lwe;", line = 96)
    public final class409 method1951(int arg0, int arg1) {
        field4441++;
        if (arg0 == 23885) {
            return this.field4435 == null || arg1 < 0 || arg1 >= this.field4435.length ? null : this.field4435[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZBLgv;II)V", line = 117)
    public static final void method1952(boolean arg0, byte arg1, class83 arg2, int arg3, int arg4) {
        field4439++;
        int var5 = arg2.field898[0];
        int var6 = arg2.field899[0];
        if (var5 < 0 || var5 >= class272.field3589 || var6 < 0 || var6 >= class3.field26 || arg4 < 0 || arg4 >= class272.field3589 || arg3 < 0 || arg3 >= class3.field26) {
            return;
        }
        int var7 = class234.method1411(class171.field2130[arg2.field2175], arg2.method543(0), class161.field2022, 0, 0, arg3, 0, var6, class570.field8033, true, arg4, -4, 48, var5, 0);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        if (arg0) {
            field4443 = 115;
        }
        for (int var8 = 0; var8 < var7 - 1; var8++) {
            arg2.method608(arg1, 1, class570.field8033[var8], class161.field2022[var8]);
        }
    }
}
