import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class82 extends class117 {

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    private int field1366 = 1;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    private int field1377 = 204;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    private int field1376 = 1;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1365 = "Loaded config";

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "Ldk;")
    public static class251 field1370;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "Ldk;")
    public static class251 field1375;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)Leg;")
    public static final class19 method568(int arg0, int arg1) {
        ++field1367;
        class19 var2 = (class19) class11.field114.method694((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class199.field3199.method1680(arg0, arg1, -101);
            class19 var4 = new class19();
            if (var3 != null) {
                var4.method100(new class162(var3), arg1 ^ 435);
            }
            class11.field114.method693((long) arg0, -121, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field1371;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1377 = arg0.method1142(-18970);
                }
            } else {
                this.field1366 = arg0.method1133((byte) 53);
            }
        } else {
            this.field1376 = arg0.method1133((byte) 53);
        }
        if (arg1 != 255) {
            field1370 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Z")
    public static final boolean method569(int arg0, byte arg1) {
        int var2 = -123 / ((arg1 - -28) / 62);
        class145.field2294 = true;
        ++field1368;
        class128.field2018 = 65535 & arg0 - -1;
        return true;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V")
    public static final void method570(byte arg0) {
        ++field1372;
        int[] var1 = new int[class296.field4733];
        int var2 = 0;
        for (int var3 = 0; var3 < class296.field4733; ++var3) {
            class115 var5 = class81.method562(var3, -20358);
            if (~var5.field1790 <= -1 || var5.field1857 >= 0) {
                var1[var2++] = var3;
            }
        }
        class86.field1421 = new int[var2];
        for (int var4 = 0; var4 < var2; ++var4) {
            class86.field1421[var4] = var1[var4];
        }
        if (arg0 > -82) {
            method569(37, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V")
    public static void method571(byte arg0) {
        int var1 = -127 % ((54 - arg0) / 42);
        field1370 = null;
        field1365 = null;
        field1375 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field1373;
        int[] var3 = super.field1883.method531(arg1, (byte) 104);
        if (super.field1883.field1313) {
            for (int var4 = 0; ~var4 > ~class168.field2737; ++var4) {
                int var5 = class173.field2835[arg1];
                int var6 = class243.field3869[var4];
                int var7 = this.field1376 * var6 >> 12;
                int var8 = var6 % (4096 / this.field1376) * this.field1376;
                int var9 = var5 % (4096 / this.field1366) * this.field1366;
                int var10 = this.field1366 * var5 >> 12;
                if (~this.field1377 < ~var9) {
                    for (var7 -= var10; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1377 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1377 < ~var8) {
                    int var11;
                    for (var11 = var7 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != 2) {
            this.field1377 = 58;
        }
        return var3;
    }
}
