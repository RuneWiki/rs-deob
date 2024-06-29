import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class292 implements Runnable {

    @OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
    public static int[] field4271 = new int[3];

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "Lbu;")
    public static class21 field4270;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Leba;")
    private class615 field4266;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4272;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "Z")
    private volatile boolean field4269;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "[Lbq;")
    private class307[] field4273;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Laj;I)V")
    public static final void method1845(class333 arg0, int arg1) {
        field4265++;
        class482.field6665 = arg0;
        if (arg1 > -26) {
            method1846(true);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method1846(boolean arg0) {
        if (!arg0) {
            field4271 = null;
        }
        field4271 = null;
        field4270 = null;
    }

    @OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
    public final void run() {
        field4260++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field4266.field8318));
            String var2 = var1.readLine();
            class337 var3 = class662.method3657((byte) 52);
            while (var2 != null) {
                var3.method2141(var2, 126);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2139(-21445);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field4273 = new class307[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field4273[var5 / 3] = new class307(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field4269 = true;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1847(byte arg0, int arg1, String[] arg2, int arg3) {
        field4264++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg0 <= 75) {
                return null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lha;I)V")
    public static final void method1848(class65 arg0, int arg1) {
        field4268++;
        int var2 = 0;
        int var3 = 0;
        if (class130.field1934) {
            var2 = class550.method3117(arg1 - 17976);
            var3 = class621.method3410(arg1 - 18077);
        }
        int var4 = -10660793;
        class8.method64(class356.field5213 + var3, 74, -16777216, class442.field6220, var4, class337.field4890, class245.field3317 + var2, arg0);
        class251.field3716.method583((byte) 56, class356.field5213 + var3 + 14, -1, class474.field6563.method2780(101, class38.field589), var4, class245.field3317 + var2 + 3);
        int var5 = class304.field4371.method778(0) + var2;
        if (arg1 != 18075) {
            return;
        }
        int var6 = var3 + class304.field4371.method777((byte) 104);
        if (class668.field9373) {
            int var7 = 0;
            for (class81 var8 = (class81) class57.field805.method697(0); var8 != null; var8 = (class81) class57.field805.method699(true)) {
                int var12 = var7 * 16 + class356.field5213 + var3 + 31;
                var7++;
                if (var8.field1151 == 1) {
                    class514.method2990(class442.field6220, var12, var6, class356.field5213 + var3, arg0, (class275) var8.field1155.field1176.field4146, var5, -256, class245.field3317 + var2, -1, class337.field4890, true);
                } else {
                    class168.method1206(var6, class356.field5213 + var3, arg0, class245.field3317 + var2, -256, -1, class442.field6220, class337.field4890, var5, var8, var12, false);
                }
            }
            if (class314.field4522 != null) {
                class8.method64(class270.field3986, 71, -16777216, class152.field2100, var4, class485.field6706, class271.field4010, arg0);
                int var9 = 0;
                class251.field3716.method583((byte) 56, class270.field3986 + 14, -1, class314.field4522.field1150, var4, class271.field4010 + 3);
                for (class275 var10 = (class275) class314.field4522.field1155.method697(arg1 - 18075); var10 != null; var10 = (class275) class314.field4522.field1155.method699(true)) {
                    int var11 = class270.field3986 + (var9 * 16) + 31;
                    var9++;
                    class514.method2990(class152.field2100, var11, var6, class270.field3986, arg0, var10, var5, -256, class271.field4010, -1, class485.field6706, true);
                }
                class39.method273(class485.field6706, class152.field2100, class270.field3986, -1, class271.field4010);
            }
        } else {
            int var13 = 0;
            for (class275 var14 = (class275) class280.field4138.method2551((byte) -108); var14 != null; var14 = (class275) class280.field4138.method2542(-111)) {
                int var15 = (class746.field10297 - var13 - 1) * 16 + class356.field5213 + var3 + 31;
                var13++;
                class514.method2990(class442.field6220, var15, var6, class356.field5213 + var3, arg0, var14, var5, -256, class245.field3317 + var2, -1, class337.field4890, true);
            }
        }
        class39.method273(class337.field4890, class442.field6220, class356.field5213 + var3, -1, class245.field3317 + var2);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)Lbq;")
    public final class307 method1849(boolean arg0, int arg1) {
        field4263++;
        if (this.field4273 == null || arg1 < 0 || arg1 >= this.field4273.length) {
            return null;
        } else {
            if (!arg0) {
                method1846(true);
            }
            return this.field4273[arg1];
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
    public final boolean method1850(byte arg0) {
        field4261++;
        if (this.field4269) {
            return true;
        }
        if (this.field4266 == null) {
            try {
                int var2 = class731.field10141 == class197.field2634 ? 80 : class370.field5372.field1148 + 7000;
                this.field4266 = class730.field10124.method614(new URL("http://" + class370.field5372.field1141 + ":" + var2 + "/news.ws?game=" + class21.field332.field4207), 4159);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field4266 == null || this.field4266.field8321 == 2) {
            return true;
        }
        if (arg0 < 103) {
            field4271 = null;
        }
        if (this.field4266.field8321 != 1) {
            return false;
        }
        if (this.field4272 == null) {
            this.field4272 = new Thread(this);
            this.field4272.start();
        }
        return this.field4269;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIILkf;I)V")
    public static final void method1851(boolean arg0, int arg1, int arg2, class267 arg3, int arg4) {
        field4262++;
        arg3.field3938.method2354(arg2, (byte) 102);
        arg3.field3938.method2363(29262, arg1);
        arg3.field3938.method2382(-25724, arg4);
        if (arg0) {
            method1847((byte) 39, -97, null, -83);
        }
    }
}
