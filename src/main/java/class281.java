import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class281 extends class177 {

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    private int field4342 = 2048;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private int field4349 = 10;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    private int field4348 = 0;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "[I")
    public static int[] field4334 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4335 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "[[[Lad;")
    public static class128[][][] field4336 = new class128[4][104][104];

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4343 = "Take";

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "[I")
    public static int[] field4347 = new int[500];

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Llb;")
    public static class211 field4344;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "[I")
    private int[] field4332;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[I")
    private int[] field4340;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)I", line = 6)
    public static final int method1978(byte arg0) {
        if (arg0 != 75) {
            method1978((byte) -44);
        }
        field4338++;
        if (class37.field554) {
            return 0;
        } else if (class252.method1753(-8090)) {
            return class69.field1019 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 26)
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V", line = 31)
    public static final void method1979(int arg0, int arg1) {
        field4346++;
        if (!class179.method1294(arg1, 1)) {
            return;
        }
        int var2 = 125 / ((-arg0 - 83) / 36);
        class184[] var3 = class305.field4779[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class184 var5 = var3[var4];
            if (var5 != null) {
                var5.field2905 = 1;
                var5.field2892 = 0;
                var5.field2925 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 69)
    private final void method1980(int arg0) {
        this.field4340 = new int[this.field4349 + 1];
        this.field4332 = new int[this.field4349 + 1];
        field4341++;
        int var2 = 0;
        int var3 = 4096 / this.field4349;
        int var4 = this.field4342 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4349; var5++) {
            this.field4340[var5] = var2;
            this.field4332[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4340[this.field4349] = 4096;
        this.field4332[this.field4349] = this.field4332[arg0] + 4096;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)V", line = 98)
    public static final void method1981(byte arg0) {
        field4331++;
        class57.field849.method1433(30);
        class126.field1996.method1433(30);
        class279.field4287.method1433(30);
        int var1 = 93 / ((-arg0 - 55) / 57);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I", line = 124)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 >= -52) {
            method1981((byte) 28);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -86);
        field4339++;
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1];
            if (this.field4348 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field4349; var6++) {
                    if (var4 >= this.field4340[var6] && this.field4340[var6 + 1] > var4) {
                        if (this.field4332[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class151.method1116(var3, 0, class287.field4415, var5);
            } else {
                for (int var7 = 0; var7 < class287.field4415; var7++) {
                    int var8 = 0;
                    int var9 = class179.field2684[var7];
                    short var10 = 0;
                    int var11 = this.field4348;
                    if (var11 == 1) {
                        var8 = var9;
                    } else if (var11 == 2) {
                        var8 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field4349; var12++) {
                        if (this.field4340[var12] <= var8 && var8 < this.field4340[var12 + 1]) {
                            if (this.field4332[var12] > var8) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 250)
    public static void method1982(int arg0) {
        field4336 = (class128[][][]) null;
        field4335 = null;
        field4347 = null;
        field4343 = null;
        if (arg0 != -30742) {
            field4335 = (String) null;
        }
        field4344 = null;
        field4334 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 276)
    public final void method465(int arg0) {
        field4350++;
        this.method1980(0);
        int var2 = 101 / ((arg0 + 6) / 43);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhb;II)V", line = 286)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field4333++;
        if (arg1 != -18061) {
            method1982(-27);
        }
        if (arg2 == 0) {
            this.field4349 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field4342 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field4348 = arg0.method273(65280);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V", line = 330)
    public static final void method1983(byte arg0, int arg1) {
        if (arg0 <= 5) {
            method1983((byte) 106, 113);
        }
        class147 var2 = class92.method731(-29125, arg1, 10);
        var2.method1099(-72);
        field4345++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Lqb;", line = 345)
    public static final class101 method1984(int arg0, boolean arg1) {
        class101 var2 = (class101) class126.field1997.method1432((byte) 100, (long) arg0);
        field4337++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class225.field3502.method1507(class322.method2200(true, arg0), (byte) -128, class243.method1679(38, arg0));
        class101 var4 = new class101();
        var4.field1570 = arg0;
        if (var3 != null) {
            var4.method797(98, new class35(var3));
        }
        var4.method790((byte) 68);
        if (var4.field1549) {
            var4.field1557 = false;
            var4.field1514 = 0;
        }
        if (!class118.field1858 && var4.field1522) {
            var4.field1547 = null;
        }
        class126.field1997.method1436(arg1, var4, (long) arg0);
        return var4;
    }
}
