import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class84 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private int field1385 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    private int field1395 = 128;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field1404 = -1;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Z")
    public boolean field1407 = false;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    private int field1403 = 128;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    private int field1389 = 0;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
    public boolean field1409 = false;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field1408 = 0;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1394 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lpf;")
    public static class17 field1388 = new class17(4);

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1401 = -1;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[S")
    private short[] field1387;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[S")
    private short[] field1391;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[S")
    private short[] field1399;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[S")
    private short[] field1400;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lab;I)V")
    public final void method589(class249 arg0, int arg1) {
        field1386++;
        int var3 = 105 % ((arg1 - 30) / 52);
        while (true) {
            int var4 = arg0.method1802((byte) 111);
            if (var4 == 0) {
                return;
            }
            this.method593(false, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
    public static final void method590(boolean arg0, int arg1) {
        if (arg0) {
            method595(-124, (String) null, (Throwable) null);
        }
        class206.field3323.method98(1, arg1);
        field1390++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Laj;ILaj;Z)V")
    public static final void method591(class151 arg0, int arg1, class151 arg2, boolean arg3) {
        class65.field1095 = arg3;
        class70.field1167 = arg2;
        class58.field1021 = arg0;
        field1396++;
        if (arg1 > -112) {
            field1398 = 32;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Lud;")
    public final class242 method592(int arg0, int arg1, int arg2, int arg3) {
        field1405++;
        class242 var5 = (class242) class65.field1091.method99((long) this.field1406, true);
        if (var5 == null) {
            class229 var6 = class229.method1644(class36.field573, this.field1397, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1399 != null) {
                for (int var7 = 0; var7 < this.field1399.length; var7++) {
                    var6.method1628(this.field1399[var7], this.field1400[var7]);
                }
            }
            if (this.field1391 != null) {
                for (int var8 = 0; var8 < this.field1391.length; var8++) {
                    var6.method1641(this.field1391[var8], this.field1387[var8]);
                }
            }
            var5 = var6.method1618(this.field1389 + 64, this.field1408 + 850, -30, -50, -30);
            class65.field1091.method100((long) this.field1406, var5, 47);
        }
        class242 var9;
        if (this.field1404 == -1 || arg2 == -1) {
            var9 = var5.method857(true, true, true);
        } else {
            var9 = class34.method211(this.field1404, 3).method1202(arg3, arg2, var5, -77, arg0);
        }
        if (this.field1403 != 128 || this.field1395 != 128) {
            var9.method845(this.field1403, this.field1395, this.field1403);
        }
        if (arg1 > -43) {
            this.field1409 = true;
        }
        if (this.field1385 != 0) {
            if (this.field1385 == 90) {
                var9.method851();
            }
            if (this.field1385 == 180) {
                var9.method850();
            }
            if (this.field1385 == 270) {
                var9.method849();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLab;I)V")
    private final void method593(boolean arg0, class249 arg1, int arg2) {
        field1392++;
        if (arg0) {
            field1388 = null;
        }
        if (arg2 == 1) {
            this.field1397 = arg1.method1821((byte) 51);
        } else if (arg2 == 2) {
            this.field1404 = arg1.method1821((byte) 51);
        } else if (arg2 == 4) {
            this.field1403 = arg1.method1821((byte) 51);
        } else if (arg2 == 5) {
            this.field1395 = arg1.method1821((byte) 51);
        } else if (arg2 == 6) {
            this.field1385 = arg1.method1821((byte) 51);
        } else if (arg2 == 7) {
            this.field1389 = arg1.method1802((byte) -105);
        } else if (arg2 == 8) {
            this.field1408 = arg1.method1802((byte) 120);
        } else if (arg2 == 9) {
            this.field1407 = true;
        } else if (arg2 == 10) {
            this.field1409 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1802((byte) 35);
            this.field1399 = new short[var6];
            this.field1400 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1399[var7] = (short) arg1.method1821((byte) 51);
                this.field1400[var7] = (short) arg1.method1821((byte) 51);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1802((byte) 36);
            this.field1391 = new short[var4];
            this.field1387 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1391[var5] = (short) arg1.method1821((byte) 51);
                this.field1387[var5] = (short) arg1.method1821((byte) 51);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I")
    public static final int method594(boolean arg0) {
        field1393++;
        return arg0 ? -30 : class76.field1299;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method595(int arg0, String arg1, Throwable arg2) {
        field1402++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class289.method2007(arg2, (byte) -125);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            if (arg0 == 14117) {
                class147.method1090(false, var3);
                String var4 = class241.method1731(var3, arg0 ^ 0xFFFFC8B9, ":", "%3a");
                String var5 = class241.method1731(var4, arg0 - 14244, "@", "%40");
                String var6 = class241.method1731(var5, arg0 - 14223, "&", "%26");
                String var7 = class241.method1731(var6, -123, "#", "%23");
                if (class159.field2595.field1380 != null) {
                    class191 var8 = class159.field2595.method575(new URL(class159.field2595.field1380.getCodeBase(), "clienterror.ws?c=" + class30.field498 + "&u=" + class214.field3612 + "&v1=" + class83.field1375 + "&v2=" + class83.field1368 + "&e=" + var7), true);
                    while (var8.field3091 == 0) {
                        class28.method182(1L, true);
                    }
                    if (var8.field3091 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field3089;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        if (arg0 == 5536) {
            field1388 = null;
            field1394 = null;
        }
    }
}
