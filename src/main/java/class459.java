import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class459 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
    public static int[] field6316 = new int[5];

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lqk;")
    public static class148 field6312 = new class148(59, 4);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lfg;")
    private class436 field6307;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6311;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Z")
    private volatile boolean field6309;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[Lf;")
    private class127[] field6313;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lf;", line = 4)
    public final class127 method2751(int arg0, byte arg1) {
        field6308++;
        if (this.field6313 == null || arg0 < 0 || this.field6313.length <= arg0) {
            return null;
        } else {
            int var3 = 20 % ((-arg1 - 68) / 55);
            return this.field6313[arg0];
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(CLjava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 19)
    public static final String method2752(char arg0, String arg1, int arg2, String arg3) {
        int var4 = 109 / ((arg2 - 84) / 34);
        field6306++;
        int var5 = arg1.length();
        int var6 = arg3.length();
        int var7 = var5;
        int var8 = var6 - 1;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                var9 = arg1.indexOf(arg0, var9);
                if (var9 < 0) {
                    break;
                }
                var9++;
                var7 += var8;
            }
        }
        StringBuffer var10 = new StringBuffer(var7);
        int var11 = 0;
        while (true) {
            int var12 = arg1.indexOf(arg0, var11);
            if (var12 < 0) {
                var10.append(arg1.substring(var11));
                return var10.toString();
            }
            var10.append(arg1.substring(var11, var12));
            var10.append(arg3);
            var11 = var12 + 1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 78)
    public static void method2753(int arg0) {
        field6312 = null;
        field6316 = null;
        if (arg0 != -1) {
            field6316 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z", line = 90)
    public final boolean method2754(byte arg0) {
        field6314++;
        if (this.field6309) {
            return true;
        }
        if (this.field6307 == null) {
            try {
                int var2 = class746.field10392 == class456.field6280 ? 80 : class450.field6183.field812 + 7000;
                this.field6307 = class379.field5339.method3584((byte) 86, new URL("http://" + class450.field6183.field813 + ":" + var2 + "/news.ws?game=" + class210.field2984.field1662));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field6307 == null || this.field6307.field5975 == 2) {
            return true;
        } else if (arg0 > -96) {
            return false;
        } else if (this.field6307.field5975 == 1) {
            if (this.field6311 == null) {
                this.field6311 = new Thread(this);
                this.field6311.start();
            }
            return this.field6309;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lwu;B)V", line = 131)
    public static final void method2755(class557 arg0, byte arg1) {
        class351.field4458 = arg0;
        field6315++;
        if (arg1 >= -62) {
            field6317 = 46;
        }
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V", line = 152)
    public final void run() {
        field6310++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6307.field5973));
            String var2 = var1.readLine();
            class230 var3 = class617.method3620(-30782);
            while (var2 != null) {
                var3.method1487(-127, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1486(-118);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field6313 = new class127[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6313[var5 / 3] = new class127(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6309 = true;
    }
}
