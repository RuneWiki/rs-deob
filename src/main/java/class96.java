import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class96 extends class305 {

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    private int field1515 = 1;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    private int field1518 = 1;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    private int field1519 = 204;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1517 = new String[8];

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Ldv;")
    public static final class508 method806(boolean arg0, int arg1) {
        ++field1516;
        class508 var2 = (class508) class350.field5216.method1634((long) arg1, 64);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class516.field7502.method731(0, arg1, 1);
            class508 var4 = new class508();
            var4.field7399 = arg1;
            if (var3 != null) {
                var4.method3027(new class194(var3), (byte) -16);
            }
            var4.method3023(17955);
            if (~var4.field7395 == -3 && class162.field2452.method358((byte) -120, (long) arg1) == null) {
                class162.field2452.method357(new class50(class359.field5304), 1, (long) arg1);
                class394.field5742[class359.field5304++] = var4;
            }
            if (arg0) {
                field1517 = null;
            }
            class350.field5216.method1623((long) arg1, 17621, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field1514;
        int[] var3 = super.field4677.method2174(arg0, arg1 + -4778);
        if (arg1 != 4688) {
            this.field1519 = 45;
        }
        if (super.field4677.field5040) {
            for (int var4 = 0; var4 < class91.field1471; ++var4) {
                int var5 = class78.field1298[var4];
                int var6 = class301.field4614[arg0];
                int var7 = this.field1515 * var5 >> 12;
                int var8 = this.field1518 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1515) * this.field1515;
                int var10 = var6 % (4096 / this.field1518) * this.field1518;
                if (var10 < this.field1519) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field1519) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1519) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
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
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public static final void method807(int arg0, int arg1) {
        if (arg0 == -2) {
            ++field1512;
            class188 var2 = class10.method48((byte) 80, 14, arg1);
            var2.method1306(arg0 ^ 23126);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public static void method808(byte arg0) {
        int var1 = 31 / ((-27 - arg0) / 57);
        field1517 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 76) {
            this.field1519 = -60;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1519 = arg1.method1396(-91);
                }
            } else {
                this.field1518 = arg1.method1337((byte) -121);
            }
        } else {
            this.field1515 = arg1.method1337((byte) 53);
        }
        ++field1513;
    }
}
