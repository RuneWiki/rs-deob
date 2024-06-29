import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class339 implements Runnable {

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[Lpea;")
    public static class675[] field5503 = new class675[14];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lsw;")
    private class701 field5499;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field5494;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Z")
    private volatile boolean field5504;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[Lal;")
    private class86[] field5495;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Lal;")
    public final class86 method2320(int arg0, byte arg1) {
        field5496++;
        if (this.field5495 == null || arg0 < 0 || arg0 >= this.field5495.length) {
            return null;
        } else if (arg1 < 81) {
            return null;
        } else {
            return this.field5495[arg0];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILri;IIIZ)V")
    public static final void method2321(int arg0, int arg1, class97 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class338.field5487 = arg6;
        class419.field6421 = arg0;
        class206.field3453 = arg4;
        class20.field326 = arg5;
        class474.field7018 = null;
        class20.field332 = 1;
        class490.field7168 = arg1;
        field5502++;
        if (arg3 != -13082) {
            method2322(null, (byte) 71);
        }
        class386.field6000 = arg2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2322(String arg0, byte arg1) {
        field5493++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 != 63) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > var4 + 2) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + 10 - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + 10 - 65;
                }
                if (var11 != 0 && class347.method2350((byte) var11, -161)) {
                    var2.append(class457.method2868(arg1 ^ 0xFFFFFFA9, (byte) var11));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method2323(int arg0) {
        field5503 = null;
        if (arg0 < 90) {
            method2325(null, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZLr;)Lla;")
    public static final class418 method2324(int arg0, int arg1, boolean arg2, class167 arg3) {
        if (arg0 == -58) {
            field5500++;
            class13 var4 = class570.method3364(arg3, arg2, arg1, 0);
            return var4 == null ? null : var4.field195;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lac;B)Z")
    public static final boolean method2325(class501 arg0, byte arg1) {
        if (arg1 <= 13) {
            method2323(-109);
        }
        field5501++;
        return class299.field4674 == arg0 || class354.field5658 == arg0 || class133.field2182 == arg0 || class89.field1079 == arg0;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Z")
    public final boolean method2326(int arg0) {
        if (arg0 != -8522) {
            this.field5495 = null;
        }
        field5498++;
        if (this.field5504) {
            return true;
        }
        if (this.field5499 == null) {
            try {
                int var2 = class660.field9192 == class182.field3060 ? 80 : class255.field4053.field6971 + 7000;
                this.field5499 = class402.field6207.method3168(new URL("http://" + class255.field4053.field6959 + ":" + var2 + "/news.ws?game=" + class99.field1647.field2742), (byte) -30);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field5499 == null || this.field5499.field9884 == 2) {
            return true;
        } else if (this.field5499.field9884 == 1) {
            if (this.field5494 == null) {
                this.field5494 = new Thread(this);
                this.field5494.start();
            }
            return this.field5504;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
    public final void run() {
        field5497++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field5499.field9885));
            String var2 = var1.readLine();
            class614 var3 = class663.method3800(-112);
            while (var2 != null) {
                var3.method3580(-1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3582(-67);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field5495 = new class86[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field5495[var5 / 3] = new class86(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field5504 = true;
    }
}
