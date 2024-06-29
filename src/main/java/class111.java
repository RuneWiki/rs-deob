import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Lkfa;")
    public static class549 field1287 = new class549(53, 7);

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lkfa;")
    public static class549 field1288 = new class549(26, 8);

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "[I")
    public static int[] field1291 = new int[500];

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Lsba;")
    private class199 field1290;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field1293;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
    private volatile boolean field1284;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "[Lwfa;")
    private class182[] field1283;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIBI)Lfp;", line = 6)
    public static final class292 method691(int arg0, int arg1, byte arg2, int arg3) {
        field1292++;
        class287 var4 = class97.field1074[arg1][arg3][arg0];
        if (var4 == null) {
            return null;
        }
        class292 var5 = null;
        if (arg2 != -63) {
            return null;
        }
        int var6 = -1;
        for (class60 var7 = var4.field3680; var7 != null; var7 = var7.field623) {
            class354 var8 = var7.field625;
            if (var8 instanceof class292) {
                class292 var9 = (class292) var8;
                int var10 = var9.method1656(true) * 256 - 4;
                int var11 = var9.field4641 - var10 >> 9;
                int var12 = var9.field4647 - var10 >> 9;
                int var13 = var9.field4641 + var10 >> 9;
                int var14 = var9.field4647 + var10 >> 9;
                if (var11 <= arg3 && arg0 >= var12 && var13 >= arg3 && arg0 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg0);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ut", name = "run", descriptor = "()V", line = 71)
    public final void run() {
        field1282++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1290.field2434));
            String var2 = var1.readLine();
            class583 var3 = class353.method1955(1);
            while (var2 != null) {
                var3.method3278(var2, 8627);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3285(-10576);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field1283 = new class182[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1283[var5 / 3] = new class182(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1284 = true;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lwfa;", line = 114)
    public final class182 method692(int arg0, int arg1) {
        field1289++;
        if (this.field1283 == null || arg1 < 0 || arg1 >= this.field1283.length) {
            return null;
        } else {
            if (arg0 != -1) {
                method691(126, -62, (byte) 55, 6);
            }
            return this.field1283[arg1];
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V", line = 134)
    public static void method693(boolean arg0) {
        field1291 = null;
        field1287 = null;
        if (arg0) {
            method695(false, -114, null);
        }
        field1288 = null;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)Z", line = 148)
    public final boolean method694(boolean arg0) {
        if (!arg0) {
            this.field1290 = null;
        }
        field1281++;
        if (this.field1284) {
            return true;
        }
        if (this.field1290 == null) {
            try {
                int var2 = class73.field771 == class553.field7884 ? 80 : class279.field3530.field3986 + 7000;
                this.field1290 = class623.field8837.method3148(false, new URL("http://" + class279.field3530.field3992 + ":" + var2 + "/news.ws?game=" + class220.field2668.field2518));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field1290 == null || this.field1290.field2437 == 2) {
            return true;
        } else if (this.field1290.field2437 == 1) {
            if (this.field1293 == null) {
                this.field1293 = new Thread(this);
                this.field1293.start();
            }
            return this.field1284;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZILag;)V", line = 192)
    public static final void method695(boolean arg0, int arg1, class625 arg2) {
        field1286++;
        if (class145.field1625 >= 400) {
            return;
        }
        class23 var3 = arg2.field8855;
        if (var3.field229 != null) {
            var3 = var3.method108(0, class491.field7127);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field212) {
            return;
        }
        if (arg1 <= 27) {
            method693(false);
        }
        String var4 = var3.field230;
        if (var3.field235 != 0) {
            String var5 = class343.field4453 == class220.field2668 ? class221.field2749.method1296(class226.field2899, (byte) -89) : class221.field2747.method1296(class226.field2899, (byte) 63);
            var4 = var4 + class176.method1026(class377.field4914.field6322, var3.field235, (byte) -32) + " (" + var5 + var3.field235 + ")";
        }
        if (class477.field6938 && !arg0) {
            class450 var6 = class109.field1269 == -1 ? null : class80.field854.method687(false, class109.field1269);
            if ((class406.field5414 & 0x2) != 0 && (var6 == null || var3.method102((byte) -116, class109.field1269, var6.field6198) != var6.field6198)) {
                class322.field4189++;
                class459.method2618(false, 500, -1, class182.field2231 + " -> <col=ffff00>" + var4, 0, true, 0, (long) arg2.field3784, class419.field5567, 23, class122.field1376);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field250;
            if (class226.field2891) {
                var7 = class626.method3514(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field246 == 0 || !var7[var8].equalsIgnoreCase(class221.field2742.method1296(class226.field2899, (byte) -118)))) {
                        byte var9 = 0;
                        int var10 = class421.field5604;
                        if (var8 == 0) {
                            var9 = 12;
                        }
                        if (var8 == 1) {
                            var9 = 25;
                        }
                        if (var8 == 2) {
                            var9 = 15;
                        }
                        if (var8 == 3) {
                            var9 = 22;
                        }
                        if (var8 == 4) {
                            var9 = 10;
                        }
                        if (var3.field231 == var8) {
                            var10 = var3.field266;
                        }
                        if (var3.field224 == var8) {
                            var10 = var3.field259;
                        }
                        class576.field8235++;
                        class459.method2618(false, 500, -1, "<col=ffff00>" + var4, 0, true, 0, (long) arg2.field3784, var7[var8], var9, var7[var8].equalsIgnoreCase(class221.field2742.method1296(class226.field2899, (byte) -113)) ? var3.field243 : var10);
                    }
                }
            }
            if (var3.field246 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class221.field2742.method1296(class226.field2899, (byte) -70))) {
                        short var12 = 0;
                        if (var3.field235 > class377.field4914.field6322) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 12;
                        }
                        if (var11 == 1) {
                            var13 = 25;
                        }
                        if (var11 == 2) {
                            var13 = 15;
                        }
                        if (var11 == 3) {
                            var13 = 22;
                        }
                        if (var11 == 4) {
                            var13 = 10;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class38.field419++;
                        class459.method2618(false, 500, -1, "<col=ffff00>" + var4, 0, true, 0, (long) arg2.field3784, var7[var11], var13, var3.field243);
                    }
                }
            }
        }
        class459.method2618(arg0, 500, -1, "<col=ffff00>" + var4, 0, true, 0, (long) arg2.field3784, class221.field2741.method1296(class226.field2899, (byte) 108), 1012, class293.field3848);
        class422.field5611++;
    }
}
