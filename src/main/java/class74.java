import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class74 extends class107 {

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    private int field1413 = 2048;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    private int field1417 = 10;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    private int field1416 = 0;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "Lpj;")
    private static class237 field1411 = class33.method353("cyan:", 69);

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "[[B")
    public static byte[][] field1415 = new byte[250][];

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "Lpj;")
    public static class237 field1419 = field1411;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "Lpj;")
    public static class237 field1423 = field1411;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "Lng;")
    public static class75 field1424;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "[I")
    private int[] field1420;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "[I")
    private int[] field1425;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "[[[I")
    public static int[][][] field1421;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 31) {
            this.field1417 = -56;
        }
        ++field1414;
        this.method579(arg0 + -1465261555);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        ++field1422;
        if (super.field1921.field3539) {
            int var4 = class185.field3233[arg1];
            if (~this.field1416 != -1) {
                for (int var5 = 0; class106.field1862 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class182.field3199[var5];
                    int var9 = this.field1416;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = 2048 - -(var8 + -4096 + var4 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field1417; ++var10) {
                        if (~this.field1420[var10] >= ~var6 && var6 < this.field1420[var10 + 1]) {
                            if (var6 < this.field1425[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field1417 > var12; ++var12) {
                    if (this.field1420[var12] <= var4 && ~var4 > ~this.field1420[var12 + 1]) {
                        if (this.field1425[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class171.method1186(var3, 0, class106.field1862, var11);
            }
        }
        if (arg0 != -17) {
            this.method579(125);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1416 = arg0.method316((byte) -117);
                }
            } else {
                this.field1413 = arg0.method339(-16777216);
            }
        } else {
            this.field1417 = arg0.method316((byte) -14);
        }
        ++field1418;
        if (arg2 != -32513) {
            this.field1416 = 19;
        }
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V")
    private final void method579(int arg0) {
        this.field1425 = new int[this.field1417 + 1];
        this.field1420 = new int[this.field1417 + 1];
        ++field1412;
        int var2 = 0;
        int var3 = 4096 / this.field1417;
        int var4 = this.field1413 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1417; ++var5) {
            this.field1420[var5] = var2;
            this.field1425[var5] = var2 - -var4;
            var2 += var3;
        }
        if (arg0 != -1465261524) {
            field1415 = null;
        }
        this.field1420[this.field1417] = 4096;
        this.field1425[this.field1417] = this.field1425[0] + 4096;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
    public static void method580(int arg0) {
        if (arg0 <= 113) {
            method580(107);
        }
        field1415 = null;
        field1424 = null;
        field1423 = null;
        field1421 = null;
        field1419 = null;
        field1411 = null;
    }
}
