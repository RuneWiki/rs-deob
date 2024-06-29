import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class63 {

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "[J")
    private long[] field1273 = new long[10];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lwd;")
    private static class150 field1254 = class2.method9(true, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lwd;")
    public static class150 field1252 = class2.method9(true, "welle:");

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lwd;")
    public static class150 field1266 = class2.method9(true, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Z")
    public static boolean field1264 = false;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lwd;")
    public static class150 field1275 = class2.method9(true, "(Y");

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Lwd;")
    private static class150 field1267 = class2.method9(true, "This computers address has been blocked");

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "Lwd;")
    public static class150 field1276 = field1254;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lwd;")
    public static class150 field1274 = class2.method9(true, "Ausw-=hlen");

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1261 = 0;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1253 = 0;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Lwd;")
    public static class150 field1269 = field1267;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "J")
    private long field1270;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lff;")
    public static class42 field1255;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public final void method351(byte arg0) {
        field1271++;
        if (arg0 != 47) {
            this.method351((byte) 27);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1273[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static final void method352(int arg0) {
        field1265++;
        class54 var1 = (class54) class107.field2432.method702((byte) -126);
        if (arg0 <= 92) {
            method353(59, 4, -24);
        }
        while (var1 != null) {
            if (var1.field1425 == -1) {
                var1.field1432 = 0;
                class134.method1001((byte) 122, var1);
            } else {
                var1.method678((byte) -26);
            }
            var1 = (class54) class107.field2432.method698(-1610612736);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public static final void method353(int arg0, int arg1, int arg2) {
        field1272++;
        class143.field3451.method965(true, 64);
        if (arg1 <= 9) {
            field1259 = 62;
        }
        class143.field3451.method1122((byte) 32, arg0);
        class6.field154++;
        class143.field3451.method1142(255, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public final void method354(byte arg0) {
        this.field1279 = 1;
        if (arg0 != 34) {
            field1276 = null;
        }
        this.field1262 = 256;
        this.field1278 = 0;
        field1258++;
        this.field1270 = class55.method430(0);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1273[var2] = this.field1270;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIB)V")
    public static final void method355(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1257++;
        int var5 = arg1;
        if (arg4 > -104) {
            return;
        }
        while (arg1 + arg3 >= var5) {
            for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class118.field2738[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class121.field2789[0][var6][var5] = class121.field2789[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class121.field2789[0][var6][var5] = class121.field2789[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class121.field2789[0][var6][var5] = class121.field2789[0][var6][var5 - 1];
                    }
                    if (arg1 + arg3 == var5 && var5 < 103) {
                        class121.field2789[0][var6][var5] = class121.field2789[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static final void method356(byte arg0) {
        Object var1 = class55.field1435;
        synchronized (class55.field1435) {
            if (class106.field2385 == 0) {
                class10.field243.method1031(5, new class6(), 93);
            }
            class106.field2385 = 600;
            int var2 = 121 / ((12 - arg0) / 43);
        }
        field1277++;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class47() {
        this.method354((byte) 34);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
    public static void method357(byte arg0) {
        field1274 = null;
        field1269 = null;
        field1254 = null;
        field1266 = null;
        field1275 = null;
        if (arg0 > -96) {
            method352(-18);
        }
        field1267 = null;
        field1276 = null;
        field1252 = null;
        field1255 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public final int method358(int arg0, int arg1, int arg2) {
        field1256++;
        int var4 = this.field1279;
        this.field1279 = 1;
        int var5 = this.field1262;
        this.field1262 = 300;
        this.field1270 = class55.method430(arg1 + 1);
        if (this.field1273[this.field1263] == 0L) {
            this.field1262 = var5;
            this.field1279 = var4;
        } else if (this.field1270 > this.field1273[this.field1263]) {
            this.field1262 = (int) ((long) (arg2 * 2560) / (this.field1270 - this.field1273[this.field1263]));
        }
        if (this.field1262 < 25) {
            this.field1262 = 25;
        }
        if (this.field1262 > 256) {
            this.field1262 = 256;
            this.field1279 = (int) ((long) arg2 - (this.field1270 - this.field1273[this.field1263]) / 10L);
        }
        if (arg2 < this.field1279) {
            this.field1279 = arg2;
        }
        if (arg1 != -1) {
            field1266 = null;
        }
        this.field1273[this.field1263] = this.field1270;
        this.field1263 = (this.field1263 + 1) % 10;
        if (this.field1279 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1273[var6] != 0L) {
                    this.field1273[var6] += this.field1279;
                }
            }
        }
        if (arg0 > this.field1279) {
            this.field1279 = arg0;
        }
        int var7 = 0;
        class72.method548(-84, (long) this.field1279);
        while (this.field1278 < 256) {
            this.field1278 += this.field1262;
            var7++;
        }
        this.field1278 &= 0xFF;
        return var7;
    }
}
