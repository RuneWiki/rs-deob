import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class485 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lhp;")
    public static class297 field6724 = new class450();

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Loaa;")
    private class260 field6720;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field6716;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    private volatile boolean field6718;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "[Lxa;")
    public static class461[] field6725;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[Lfi;")
    private class511[] field6722;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z")
    public final boolean method2733(byte arg0) {
        if (arg0 < 15) {
            this.field6718 = true;
        }
        field6717++;
        if (this.field6718) {
            return true;
        }
        if (this.field6720 == null) {
            try {
                int var2 = class500.field6862 == class112.field1530 ? 80 : class634.field8875.field5522 + 7000;
                this.field6720 = class503.field6878.method629(0, new URL("http://" + class634.field8875.field5516 + ":" + var2 + "/news.ws?game=" + class158.field2374.field9181));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field6720 == null || this.field6720.field3702 == 2) {
            return true;
        } else if (this.field6720.field3702 == 1) {
            if (this.field6716 == null) {
                this.field6716 = new Thread(this);
                this.field6716.start();
            }
            return this.field6718;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lfi;")
    public final class511 method2734(int arg0, boolean arg1) {
        field6723++;
        if (this.field6722 == null || arg0 < 0 || arg0 >= this.field6722.length) {
            return null;
        } else {
            if (arg1) {
                field6724 = null;
            }
            return this.field6722[arg0];
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method2735(int arg0) {
        int var1 = -103 % ((52 - arg0) / 45);
        field6725 = null;
        field6724 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLva;)I")
    public static final int method2736(byte arg0, class457 arg1) {
        field6721++;
        if (arg1.field6394 == 0) {
            return 0;
        }
        if (arg1.field6391 != -1) {
            class457 var2 = null;
            if (arg1.field6391 < 32768) {
                class178 var3 = (class178) class323.field4762.method2061(-17305, (long) arg1.field6391);
                if (var3 != null) {
                    var2 = var3.field2634;
                }
            } else if (arg1.field6391 >= 32768) {
                var2 = class495.field6821[arg1.field6391 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field509 - var2.field509;
                int var5 = arg1.field514 - var2.field514;
                if (var4 != 0 || var5 != 0) {
                    arg1.method2630(false, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 >= -33) {
            method2736((byte) 47, null);
        }
        if ((arg1 instanceof class286)) {
            class286 var9 = (class286) arg1;
            if (var9.field3994 != -1 && (var9.field6485 == 0 || var9.field6479 > 0)) {
                var9.method2630(false, var9.field3994);
                var9.field3994 = -1;
            }
        } else if (arg1 instanceof class225) {
            class225 var6 = (class225) arg1;
            if (var6.field3227 != -1 && (var6.field6485 == 0 || var6.field6479 > 0)) {
                int var7 = var6.field509 - ((var6.field3227 - class511.field6989 - class511.field6989) * 256);
                int var8 = var6.field514 - (var6.field3224 - class124.field1726 - class124.field1726) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method2630(false, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field3227 = -1;
            }
        }
        return arg1.method2637((byte) 65);
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        field6719++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6720.field3706));
            String var2 = var1.readLine();
            class95 var3 = class561.method3111(24169);
            while (var2 != null) {
                var3.method691((byte) 96, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method693(-27166);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field6722 = new class511[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6722[var5 / 3] = new class511(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6718 = true;
    }
}
