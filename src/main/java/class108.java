import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class108 extends class38 {

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    private int field1503 = 1;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    private int field1505 = 204;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    private int field1508 = 1;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "Ljt;")
    public static class106 field1500 = new class106(4);

    @OriginalMember(owner = "client!er", name = "K", descriptor = "[I")
    public static int[] field1506 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!er", name = "L", descriptor = "D")
    public static double field1507;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field1502;
        if (arg0 <= 34) {
            field1500 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1505 = arg2.method3712((byte) 67);
                }
            } else {
                this.field1503 = arg2.method3745(-6314);
            }
        } else {
            this.field1508 = arg2.method3745(-6314);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static void method811(int arg0) {
        field1506 = null;
        if (arg0 == 3) {
            field1500 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field1504;
        int[] var3 = super.field397.method1376(arg1, (byte) -58);
        if (arg0 >= -43) {
            method811(-3);
        }
        if (super.field397.field3005) {
            for (int var4 = 0; class729.field10216 > var4; ++var4) {
                int var5 = class255.field3666[var4];
                int var6 = class136.field1816[arg1];
                int var7 = this.field1508 * var5 >> 12;
                int var8 = this.field1503 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1508) * this.field1508;
                int var10 = var6 % (4096 / this.field1503) * this.field1503;
                if (~var10 > ~this.field1505) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1505) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field1505) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, true);
    }
}
