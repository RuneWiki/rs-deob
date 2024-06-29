import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field576 = new String[] { method387(method386("^Ut\f!\u0005")), method387(method386("^Ut\f&\u0005")), method387(method386("CCyN")), method387(method386("V\u0018;\f\u001e")), method387(method386("^Ut\f'\u0005")), method387(method386("^Ut\f\u0011XX=")), method387(method386("^Ut\f\"\u0005")), method387(method386("^Ut\f \u0005")), method387(method386("EBaRY\u0002\u0019")), method387(method386("\u0002XpU\u0010\u0003Af\u001d\u0004L[p\u001f")) };

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "Lvd;")
    private class42 field570;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field571;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "Z")
    private volatile boolean field569;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "[Lfs;")
    public static class581[] field575;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "[Lcv;")
    private class594[] field572;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)Z")
    public final boolean method381(boolean arg0) {
        try {
            field573++;
            if (this.field569) {
                return true;
            }
            if (this.field570 == null) {
                try {
                    int var2 = class64.field667 == class31.field364 ? 80 : class546.field8156.field243 + 7000;
                    this.field570 = class580.field8601.method221((byte) -88, new URL(field576[8] + class546.field8156.field250 + ":" + var2 + field576[9] + class447.field6576.field83));
                } catch (MalformedURLException var4) {
                    return true;
                }
            }
            if (!arg0) {
                this.field569 = false;
            }
            if (this.field570 == null || this.field570.field503 == 2) {
                return true;
            } else if (this.field570.field503 == 1) {
                if (this.field571 == null) {
                    this.field571 = new Thread(this);
                    this.field571.start();
                }
                return this.field569;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field576[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIII)V")
    public static final void method382(byte arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 != 51) {
                field575 = null;
            }
            field567++;
            int var7 = arg3 * class289.field4305.field837.method4492(false) >> 8;
            if (var7 != 0 && arg1 != -1) {
                if (!class719.field10416 && class96.field1077 != -1 && class562.method4198(arg0 - 51) && !class752.method5467(-90)) {
                    class48.field548 = class574.method4283(25252);
                    class616 var4 = class40.method268(4096, class48.field548);
                    class617.method4596(var4, true, (byte) -105);
                }
                class638.method4683(var7, class657.field9489, 0, false, 0, arg1);
                class792.method5710(-1, 255, (byte) 91);
                class719.field10416 = true;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field576[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BI)Lcv;")
    public final class594 method383(byte arg0, int arg1) {
        try {
            field568++;
            if (arg0 > -25) {
                this.field572 = null;
            }
            return this.field572 == null || arg1 < 0 || arg1 >= this.field572.length ? null : this.field572[arg1];
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field576[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        try {
            field575 = null;
            if (arg0 != 6825) {
                field575 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field576[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILcn;B)V")
    public static final void method385(int arg0, int arg1, class541 arg2, byte arg3) {
        try {
            class402.field5990 = arg2;
            class714.field10339 = arg0;
            if (arg3 < 66) {
                method385(12, -77, null, (byte) -47);
            }
            field565++;
            class698.field10162 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field576[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field576[2] : field576[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field574++;
            try {
                BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field570.field499));
                String var2 = var1.readLine();
                class596 var3 = class547.method4124(65);
                while (var2 != null) {
                    var3.method4437(var2, -70);
                    var2 = var1.readLine();
                }
                String[] var4 = var3.method4439(-13718);
                if (var4.length % 3 != 0) {
                    return;
                }
                this.field572 = new class594[var4.length / 3];
                for (int var5 = 0; var5 < var4.length; var5 += 3) {
                    this.field572[var5 / 3] = new class594(var4[var5], var4[var5 + 1], var4[var5 + 2]);
                }
            } catch (IOException var7) {
            }
            this.field569 = true;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field576[5] + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method386(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method387(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
