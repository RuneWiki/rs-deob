import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class578 implements Runnable {

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Lbd;")
    public static class60 field8163 = new class60(5, 4);

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field8168 = 0;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8169 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lgca;")
    private class249 field8160;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field8164;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Z")
    private volatile boolean field8159;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "[Lbaa;")
    private class522[] field8167;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 17)
    public static void method3295(boolean arg0) {
        if (arg0) {
            method3295(false);
        }
        field8169 = null;
        field8163 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z", line = 30)
    public final boolean method3296(int arg0) {
        if (arg0 >= -41) {
            field8169 = null;
        }
        field8162++;
        if (this.field8159) {
            return true;
        }
        if (this.field8160 == null) {
            try {
                int var2 = class408.field5781 == class277.field3922 ? 80 : class553.field7777.field10399 + 7000;
                this.field8160 = class202.field2644.method2040(new URL("http://" + class553.field7777.field10402 + ":" + var2 + "/news.ws?game=" + class633.field8733.field4515), 118);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field8160 == null || this.field8160.field3310 == 2) {
            return true;
        } else if (this.field8160.field3310 == 1) {
            if (this.field8164 == null) {
                this.field8164 = new Thread(this);
                this.field8164.start();
            }
            return this.field8159;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iu", name = "run", descriptor = "()V", line = 72)
    public final void run() {
        field8161++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8160.field3311));
            String var2 = var1.readLine();
            class54 var3 = class569.method3274((byte) -51);
            while (var2 != null) {
                var3.method330(var2, -94);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method333(1);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field8167 = new class522[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8167[var5 / 3] = new class522(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8159 = true;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)Lbaa;", line = 117)
    public final class522 method3297(byte arg0, int arg1) {
        int var3 = -81 % ((arg0 + 13) / 45);
        field8170++;
        return this.field8167 == null || arg1 < 0 || this.field8167.length <= arg1 ? null : this.field8167[arg1];
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIII)Z", line = 132)
    public static final boolean method3298(int arg0, int arg1, int arg2, int arg3) {
        field8165++;
        class654.field8979.method357(arg0, arg2, arg1, class32.field424);
        int var4 = class32.field424[2];
        if (var4 < 50) {
            return false;
        }
        if (arg3 != 3713) {
            field8169 = null;
        }
        class32.field424[2] = var4;
        class32.field424[0] = class32.field424[0] * class44.field540 / var4 + class674.field9144;
        class32.field424[1] = class32.field424[1] * class123.field1473 / var4 + class194.field2592;
        return true;
    }
}
