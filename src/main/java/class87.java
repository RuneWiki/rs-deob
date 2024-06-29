import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class87 {

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public int field1321 = 0;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field1319 = 0;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Z")
    private boolean field1317 = false;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "[B")
    public static byte[] field1305;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[Z")
    public static boolean[] field1313;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "Ldb;")
    public static class298 field1324;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Ljv;")
    public static class73 field1327;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "J")
    public long field1325;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method697(int arg0) {
        field1324 = null;
        field1327 = null;
        field1313 = null;
        if (arg0 == -31680) {
            field1305 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLeh;)V")
    public final void method698(byte arg0, class335 arg1) {
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                if (arg0 != -96) {
                    this.field1319 = 9;
                }
                field1318++;
                return;
            }
            this.method700(-1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B[[BLeda;)V")
    public static final void method699(byte arg0, byte[][] arg1, class90 arg2) {
        field1323++;
        int var3 = class426.field5860.length;
        int var4 = -117 / ((3 - arg0) / 45);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = arg1[var5];
            if (var6 != null) {
                int var7 = (class376.field5072[var5] >> 8) * 64 - class473.field6334;
                int var8 = (class376.field5072[var5] & 0xFF) * 64 - class233.field3269;
                class381.method2226((byte) 114);
                arg2.method718(var6, class591.field7820, class10.field197, 1, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILeh;)V")
    private final void method700(int arg0, int arg1, class335 arg2) {
        field1308++;
        if (arg0 != -1) {
            return;
        }
        if (arg1 == 1) {
            this.field1310 = arg2.method2001((byte) -83);
        } else if (arg1 == 2) {
            arg2.method2034(255);
        } else if (arg1 == 3) {
            this.field1312 = arg2.method2045(-98);
            this.field1316 = arg2.method2045(-98);
            this.field1315 = arg2.method2045(arg0 ^ 0x61);
        } else if (arg1 == 4) {
            this.field1309 = arg2.method2034(arg0 ^ 0xFFFFFF00);
            this.field1320 = arg2.method2045(-98);
        } else if (arg1 == 6) {
            this.field1306 = arg2.method2034(arg0 ^ 0xFFFFFF00);
        } else if (arg1 == 8) {
            this.field1321 = 1;
        } else if (arg1 == 9) {
            this.field1319 = 1;
        } else if (arg1 == 10) {
            this.field1317 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public final void method701(int arg0) {
        this.field1311 = class126.field2105[this.field1310 << 3];
        field1314++;
        this.field1326 = (int) Math.sqrt((double) (this.field1316 * this.field1316 + this.field1315 * this.field1315 + this.field1312 * this.field1312));
        if (this.field1320 == 0) {
            this.field1320 = 1;
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field1309 == 0) {
            this.field1325 = 2147483647L;
        } else if (this.field1309 == 1) {
            this.field1325 = (this.field1326 * 8 / this.field1320);
            this.field1325 *= this.field1325;
        } else if (this.field1309 == 2) {
            this.field1325 = (this.field1326 * 8 / this.field1320);
        }
        if (this.field1317) {
            this.field1326 *= -1;
        }
    }

    static {
        int var0 = 0;
        field1305 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1305[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field1313 = new boolean[100];
        field1324 = new class298(96, 8);
        field1327 = new class73("", 14);
    }
}
