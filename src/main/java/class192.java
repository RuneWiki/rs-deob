import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "Laj;")
    public static class287 field3025 = new class287(8);

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "Lsb;")
    public static class266 field3031 = new class266(73, -1);

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Z")
    public static boolean field3032 = false;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "Lkp;")
    private class456 field3027;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3026;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "Z")
    private volatile boolean field3029;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "[Lvc;")
    private class291[] field3021;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1389(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3028++;
        if (arg2 != 12) {
            field3032 = true;
        }
        int var8 = arg1 - arg4;
        int var9 = arg3 + arg4;
        for (int var10 = arg3; var10 < var9; var10++) {
            class705.method3938(arg5, arg6, arg2 + 30324, arg0, class582.field8429[var10]);
        }
        for (int var11 = arg1; var11 > var8; var11--) {
            class705.method3938(arg5, arg6, 30336, arg0, class582.field8429[var11]);
        }
        int var12 = arg5 - arg4;
        int var13 = arg0 + arg4;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class582.field8429[var14];
            class705.method3938(var13, arg6, arg2 + 30324, arg0, var15);
            class705.method3938(var12, arg7, 30336, var13, var15);
            class705.method3938(arg5, arg6, 30336, var12, var15);
        }
    }

    @OriginalMember(owner = "client!rea", name = "run", descriptor = "()V")
    public final void run() {
        field3023++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field3027.field6499));
            String var2 = var1.readLine();
            class186 var3 = class11.method296(15667);
            while (var2 != null) {
                var3.method1364(true, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1359(true);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field3021 = new class291[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field3021[var5 / 3] = new class291(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field3029 = true;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V")
    public static void method1390(boolean arg0) {
        if (!arg0) {
            field3031 = null;
            field3025 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lvc;")
    public final class291 method1391(int arg0, int arg1) {
        field3022++;
        if (this.field3021 == null || arg0 < 0 || arg0 >= this.field3021.length) {
            return null;
        } else {
            if (arg1 != 18665) {
                this.field3027 = null;
            }
            return this.field3021[arg0];
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)Z")
    public final boolean method1392(byte arg0) {
        field3024++;
        if (this.field3029) {
            return true;
        }
        if (this.field3027 == null) {
            try {
                int var2 = class625.field9027 == class36.field1029 ? 80 : class513.field7242.field4419 + 7000;
                this.field3027 = class604.field8775.method397(new URL("http://" + class513.field7242.field4425 + ":" + var2 + "/news.ws?game=" + class78.field1573.field5796), -126);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field3027 == null || this.field3027.field6502 == 2) {
            return true;
        } else if (arg0 < 66) {
            return true;
        } else if (this.field3027.field6502 == 1) {
            if (this.field3026 == null) {
                this.field3026 = new Thread(this);
                this.field3026.start();
            }
            return this.field3029;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)V")
    public static final void method1393(byte arg0) {
        field3030++;
        if (arg0 >= -2) {
            field3025 = null;
        }
        if (class316.field4654 <= 0) {
            class677.field9614 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class696.field9798.length; var2++) {
            if (class696.field9798[var2].indexOf("--> ") != -1) {
                var1++;
                if (class316.field4654 == var1) {
                    class677.field9614 = class696.field9798[var2].substring(class696.field9798[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }
}
