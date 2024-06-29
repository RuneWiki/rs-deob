import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lrc;")
    private static class105 field572 = class43.method374("Enter amount:", 0);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lrc;")
    public static class105 field573 = class43.method374("Bitte versuchen Sie)1", 0);

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lrc;")
    public static class105 field575 = class43.method374("Die Adresse dieses Computers wurde gesperrt)1", 0);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lrc;")
    public static class105 field574 = class43.method374("Verbinde mit Server)3)3)3", 0);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lrc;")
    public static class105 field582 = class43.method374("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 0);

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field578 = new int[32768];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field580 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lrc;")
    public static class105 field581 = field572;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field587 = -1;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lrc;")
    public static class105 field585 = class43.method374("logo", 0);

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lrc;")
    public static class105 field586 = class43.method374("Wen m-Ochten Sie von der Liste entfernen?", 0);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lvc;")
    public static class129 field576;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lrc;", line = 36)
    public static final class105 method237(int arg0, int arg1) {
        field584++;
        if (arg0 != 1000) {
            field576 = null;
        }
        if (arg1 < 100000) {
            return class75.method637(arg1, 8241);
        } else if (arg1 < 10000000) {
            return class108.method878(new class105[] { class75.method637(arg1 / 1000, arg0 + 7241), class134.field3285 }, 2867);
        } else {
            return class108.method878(new class105[] { class75.method637(arg1 / 1000000, arg0 ^ 0x23D9), class97.field2227 }, arg0 ^ 0x8DB);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjd;)V", line = 75)
    public static final void method238(byte arg0, class58 arg1) {
        field579++;
        if (arg0 >= -119) {
            field572 = null;
        }
        if (arg1.field1254 == 0) {
            return;
        }
        if (arg1.field1214 != -1 && arg1.field1214 < 32768) {
            class115 var2 = class19.field466[arg1.field1214];
            if (var2 != null) {
                int var3 = arg1.field1229 - var2.field1229;
                int var4 = arg1.field1274 - var2.field1274;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1253 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1214 >= 32768) {
            int var5 = arg1.field1214 - 32768;
            if (class55.field1112 == var5) {
                var5 = 2047;
            }
            class15 var6 = class58.field1303[var5];
            if (var6 != null) {
                int var7 = arg1.field1274 - var6.field1274;
                int var8 = arg1.field1229 - var6.field1229;
                if (var8 != 0 || var7 != 0) {
                    arg1.field1253 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1277 != 0 || arg1.field1273 != 0) && (arg1.field1266 == 0 || arg1.field1242 > 0)) {
            int var9 = arg1.field1229 - (arg1.field1277 - class23.field562 - class23.field562) * 64;
            int var10 = arg1.field1274 - (arg1.field1273 - class107.field2466 - class107.field2466) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1253 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1277 = 0;
            arg1.field1273 = 0;
        }
        int var11 = arg1.field1253 - arg1.field1226 & 0x7FF;
        if (var11 == 0) {
            arg1.field1255 = 0;
            return;
        }
        arg1.field1255++;
        if (var11 <= 1024) {
            arg1.field1226 += arg1.field1254;
            boolean var12 = true;
            if (var11 < arg1.field1254 || 2048 - arg1.field1254 < var11) {
                arg1.field1226 = arg1.field1253;
                var12 = false;
            }
            if (arg1.field1290 == arg1.field1271 && (arg1.field1255 > 25 || var12)) {
                if (arg1.field1228 == -1) {
                    arg1.field1271 = arg1.field1278;
                } else {
                    arg1.field1271 = arg1.field1228;
                }
            }
        } else {
            arg1.field1226 -= arg1.field1254;
            boolean var13 = true;
            if (arg1.field1254 > var11 || var11 > 2048 - arg1.field1254) {
                var13 = false;
                arg1.field1226 = arg1.field1253;
            }
            if (arg1.field1290 == arg1.field1271 && (arg1.field1255 > 25 || var13)) {
                if (arg1.field1217 == -1) {
                    arg1.field1271 = arg1.field1278;
                } else {
                    arg1.field1271 = arg1.field1217;
                }
            }
        }
        arg1.field1226 &= 0x7FF;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 201)
    public static void method239(int arg0) {
        field586 = null;
        field585 = null;
        field573 = null;
        if (arg0 != -22967) {
            method239(-69);
        }
        field574 = null;
        field575 = null;
        field576 = null;
        field582 = null;
        field572 = null;
        field578 = null;
        field581 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lrc;BLte;)Lrc;", line = 224)
    public static final class105 method240(class105 arg0, byte arg1, class119 arg2) {
        field577++;
        if (arg1 > -120) {
            method240(null, (byte) 78, null);
        }
        if (arg0.method834((byte) 127, class10.field201) == -1) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method834((byte) 125, class59.field1327);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method834((byte) 126, class78.field1763);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method834((byte) 126, class106.field2428);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method834((byte) 126, class23.field553);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method834((byte) 125, class107.field2461);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method834((byte) 127, class3.field54);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class105 var9 = class43.field992;
                                                    if (class98.field2262 != null) {
                                                        var9 = class93.method778(class98.field2262.field919, 98);
                                                        try {
                                                            if (class98.field2262.field918 != null) {
                                                                byte[] var10 = ((String) class98.field2262.field918).getBytes("ISO-8859-1");
                                                                var9 = class10.method125(var10, -41, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg0 = class108.method878(new class105[] { arg0.method860(0, false, var8), var9, arg0.method862(var8 + 4, (byte) -120) }, 2867);
                                                }
                                            }
                                            arg0 = class108.method878(new class105[] { arg0.method860(0, false, var7), class80.method686(class121.method975(4, (byte) -16, arg2), -256), arg0.method862(var7 + 2, (byte) -112) }, 2867);
                                        }
                                    }
                                    arg0 = class108.method878(new class105[] { arg0.method860(0, false, var6), class80.method686(class121.method975(3, (byte) -16, arg2), -256), arg0.method862(var6 + 2, (byte) -54) }, 2867);
                                }
                            }
                            arg0 = class108.method878(new class105[] { arg0.method860(0, false, var5), class80.method686(class121.method975(2, (byte) -16, arg2), -256), arg0.method862(var5 + 2, (byte) 112) }, 2867);
                        }
                    }
                    arg0 = class108.method878(new class105[] { arg0.method860(0, false, var4), class80.method686(class121.method975(1, (byte) -16, arg2), -256), arg0.method862(var4 + 2, (byte) 85) }, 2867);
                }
            }
            arg0 = class108.method878(new class105[] { arg0.method860(0, false, var3), class80.method686(class121.method975(0, (byte) -16, arg2), -256), arg0.method862(var3 + 2, (byte) -115) }, 2867);
        }
    }
}
