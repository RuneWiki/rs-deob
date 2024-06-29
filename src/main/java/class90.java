import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public int field1258 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field1267 = 0;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Z")
    private boolean field1270 = false;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public static int[] field1259 = new int[3];

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lvk;")
    public static class56 field1262 = new class56(8);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "J")
    public long field1269;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnj;I)V", line = 3)
    public final void method631(class228 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1348(-110);
            if (var3 == 0) {
                if (arg1 <= 58) {
                    this.field1270 = false;
                }
                field1264++;
                return;
            }
            this.method634(arg0, var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 49)
    public static void method632(int arg0) {
        field1262 = null;
        if (arg0 != 1) {
            method632(68);
        }
        field1259 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 70)
    public final void method633(byte arg0) {
        this.field1257 = class117.field1636[this.field1266 << 3];
        field1263++;
        this.field1272 = (int) Math.sqrt((double) (this.field1277 * this.field1277 + (this.field1261 * this.field1261 + (this.field1265 * this.field1265))));
        if (this.field1271 == 0) {
            this.field1271 = 1;
        }
        int var2 = 8 % ((arg0 + 36) / 55);
        if (this.field1256 == 0) {
            this.field1269 = 2147483647L;
        } else if (this.field1256 == 1) {
            this.field1269 = (long) (this.field1272 * 8 / this.field1271);
            this.field1269 *= this.field1269;
        } else if (this.field1256 == 2) {
            this.field1269 = (long) (this.field1272 * 8 / this.field1271);
        }
        if (this.field1270) {
            this.field1272 *= -1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnj;IB)V", line = 106)
    private final void method634(class228 arg0, int arg1, byte arg2) {
        field1274++;
        if (arg2 > -125) {
            return;
        }
        if (arg1 == 1) {
            this.field1266 = arg0.method1343(255);
        } else if (arg1 == 2) {
            arg0.method1348(-87);
        } else if (arg1 == 3) {
            this.field1277 = arg0.method1344((byte) 127);
            this.field1261 = arg0.method1344((byte) 88);
            this.field1265 = arg0.method1344((byte) 63);
        } else if (arg1 == 4) {
            this.field1256 = arg0.method1348(-127);
            this.field1271 = arg0.method1344((byte) 107);
        } else if (arg1 == 6) {
            this.field1260 = arg0.method1348(-107);
        } else if (arg1 == 8) {
            this.field1267 = 1;
            return;
        } else if (arg1 == 9) {
            this.field1258 = 1;
            return;
        } else if (arg1 == 10) {
            this.field1270 = true;
            return;
        }
    }
}
