import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class652 implements Runnable {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Z")
    public static boolean field9188 = false;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field9194 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lav;")
    private class637 field9191;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field9190;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    private volatile boolean field9186;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[Lmc;")
    private class134[] field9185;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lmc;")
    public final class134 method3682(int arg0, int arg1) {
        field9187++;
        if (arg1 != 3) {
            field9194 = -45;
        }
        return this.field9185 == null || arg0 < 0 || this.field9185.length <= arg0 ? null : this.field9185[arg0];
    }

    @OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
    public final void run() {
        field9192++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field9191.field9093));
            String var2 = var1.readLine();
            class16 var3 = class315.method2032(1);
            while (var2 != null) {
                var3.method102(1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method98((byte) -86);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field9185 = new class134[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field9185[var5 / 3] = new class134(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field9186 = true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lvg;I)V")
    public static final void method3683(class52 arg0, int arg1) {
        field9193++;
        if (arg0.field930 == null && arg0.field966 == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 119 % ((70 - arg1) / 35);
        for (int var4 = 0; var4 < arg0.field930.length; var4++) {
            int var5 = -1;
            if (arg0.field930 != null) {
                var5 = arg0.field930[var4];
            }
            if (var5 != -1) {
                var2 = false;
                boolean var6 = false;
                boolean var7 = false;
                int var10;
                int var11;
                if ((var5 & 0xC0000000) == -1073741824) {
                    int var14 = var5 & 0xFFFFFFF;
                    int var15 = var14 >> 14;
                    int var16 = var14 & 0x3FFF;
                    var11 = arg0.field644 - ((var15 - class115.field1845) * 512) - 256;
                    var10 = arg0.field648 - ((var16 - class64.field1160) * 512) - 256;
                } else if ((var5 & 0x8000) == 0) {
                    class272 var12 = (class272) class758.field10539.method4203(true, (long) var5);
                    if (var12 == null) {
                        arg0.method466(-1, -18877, var4);
                        continue;
                    }
                    class84 var13 = var12.field3885;
                    var11 = arg0.field644 - var13.field644;
                    var10 = arg0.field648 - var13.field648;
                } else {
                    int var8 = var5 & 0x7FFF;
                    class349 var9 = class165.field2442[var8];
                    if (var9 == null) {
                        arg0.method466(-1, -18877, var4);
                        continue;
                    }
                    var10 = arg0.field648 - var9.field648;
                    var11 = arg0.field644 - var9.field644;
                }
                if (var11 != 0 || var10 != 0) {
                    arg0.method466((int) (Math.atan2((double) var11, (double) var10) * 2607.5945876176133D) & 0x3FFF, -18877, var4);
                }
            } else if (!arg0.method466(-1, -18877, var4)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field966 = null;
            arg0.field930 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z")
    public final boolean method3684(int arg0) {
        field9189++;
        if (this.field9186) {
            return true;
        }
        if (this.field9191 == null) {
            try {
                int var2 = class231.field3294 == class118.field1857 ? 80 : class430.field6021.field8324 + 7000;
                this.field9191 = class341.field4796.method2291(arg0 + 2, new URL("http://" + class430.field6021.field8321 + ":" + var2 + "/news.ws?game=" + class649.field9170.field2572));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field9191 == null || this.field9191.field9091 == 2) {
            return true;
        } else if (~this.field9191.field9091 == arg0) {
            if (this.field9190 == null) {
                this.field9190 = new Thread(this);
                this.field9190.start();
            }
            return this.field9186;
        } else {
            return false;
        }
    }
}
