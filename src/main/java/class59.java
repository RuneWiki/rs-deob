import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
    public boolean field1284 = true;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field1291 = new Object();

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public int field1293 = 0;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[I")
    public int[] field1294 = new int[500];

    @OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
    public int[] field1303 = new int[500];

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lae;")
    public static class6 field1280 = class64.method474(117, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lae;")
    private static class6 field1282 = class64.method474(126, "button near the top of that page)3");

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lae;")
    public static class6 field1286 = class64.method474(114, ": ");

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lae;")
    public static class6 field1289 = class64.method474(109, "Hidden)2");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lae;")
    public static class6 field1288 = class64.method474(104, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Lq;")
    public static class101[] field1292 = new class101[1000];

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lae;")
    public static class6 field1279 = field1282;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[I")
    public static int[] field1285 = new int[25];

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Le;")
    public static class30 field1283 = new class30(4096);

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lae;")
    public static class6 field1296 = class64.method474(103, "Benutzername: ");

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lae;")
    private static class6 field1298 = class64.method474(107, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lae;")
    private static class6 field1299 = class64.method474(107, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lae;")
    public static class6 field1304 = field1298;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field1302 = -1;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lae;")
    public static class6 field1301 = class64.method474(114, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lae;")
    public static class6 field1297 = field1299;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lsd;")
    public static class114 field1281;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lbf;")
    public static class14 field1300;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[Lq;")
    public static class101[] field1305;

    @OriginalMember(owner = "client!j", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        while (this.field1284) {
            Object var1 = this.field1291;
            synchronized (this.field1291) {
                if (this.field1293 < 500) {
                    this.field1303[this.field1293] = class117.field2771;
                    this.field1294[this.field1293] = class57.field1244;
                    this.field1293++;
                }
            }
            class82.method696(3, 50L);
        }
        field1278++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 50)
    public static final void method438(int arg0) {
        field1287++;
        if (arg0 != -23401 || class85.field2058 < 2 && class19.field382 == 0 && !class117.field2783) {
            return;
        }
        class6 var1;
        if (class19.field382 == 1 && class85.field2058 < 2) {
            var1 = class85.method731(new class6[] { class76.field1792, class104.field2460, class96.field2290, class19.field376 }, arg0 ^ 0xFFFF9C7E);
        } else if (class117.field2783 && class85.field2058 < 2) {
            var1 = class85.method731(new class6[] { client.field472, class104.field2460, class20.field395, class19.field376 }, arg0 ^ 0xFFFF9C7E);
        } else {
            var1 = class57.field1247[class85.field2058 - 1];
        }
        if (class85.field2058 > 2) {
            var1 = class85.method731(new class6[] { var1, class63.field1386, class114.method942((byte) 71, class85.field2058 - 2), class126.field3094 }, 14569);
        }
        class56.field1229.method98(var1, 4, 15, 16777215, true, class5.field61 / 1000);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 87)
    public static void method439(int arg0) {
        field1296 = null;
        field1298 = null;
        field1304 = null;
        field1281 = null;
        field1285 = null;
        field1292 = null;
        field1283 = null;
        field1289 = null;
        field1301 = null;
        field1279 = null;
        field1280 = null;
        if (arg0 != 3) {
            method439(91);
        }
        field1282 = null;
        field1305 = null;
        field1300 = null;
        field1299 = null;
        field1288 = null;
        field1297 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Led;ILm;I)V", line = 131)
    public static final void method440(class31 arg0, int arg1, class77 arg2, int arg3) {
        class78 var4 = new class78();
        field1290++;
        var4.field1894 = arg2.method620((byte) -8);
        var4.field1876 = arg2.method647((byte) -72);
        var4.field1884 = new int[var4.field1894];
        var4.field1886 = new int[var4.field1894];
        var4.field1882 = new int[var4.field1894];
        var4.field1889 = new byte[var4.field1894][][];
        var4.field1895 = new class112[var4.field1894];
        var4.field1883 = new class112[var4.field1894];
        for (int var5 = 0; var5 < var4.field1894; var5++) {
            try {
                int var6 = arg2.method620((byte) -8);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method660((byte) -12).method49(4484));
                    String var8 = new String(arg2.method660((byte) -12).method49(4484));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method647((byte) -72);
                    }
                    var4.field1884[var5] = var6;
                    var4.field1886[var5] = var9;
                    var4.field1883[var5] = arg0.method289(class7.method74(1, var7), var8, 58);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method660((byte) -12).method49(4484));
                    String var11 = new String(arg2.method660((byte) -12).method49(4484));
                    int var12 = arg2.method620((byte) -8);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method660((byte) -12).method49(4484));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method647((byte) -72);
                            var15[var16] = new byte[var17];
                            arg2.method661(true, var15[var16], var17, 0);
                        }
                    }
                    var4.field1884[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class7.method74(1, var13[var19]);
                    }
                    var4.field1895[var5] = arg0.method286((byte) -126, var11, var18, class7.method74(1, var10));
                    var4.field1889[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1882[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1882[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1882[var5] = -3;
            } catch (Exception var23) {
                var4.field1882[var5] = -4;
            } catch (Throwable var24) {
                var4.field1882[var5] = -5;
            }
        }
        if (arg3 > -119) {
            field1283 = null;
        }
        class24.field616.method785((byte) 49, var4);
    }
}
