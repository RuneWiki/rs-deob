import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class298 extends class305 {

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    private int field4583 = 20;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    private int field4581 = 0;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    private int field4585 = 1365;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    private int field4582 = 0;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "Lwa;")
    public static class505 field4580 = new class505(128);

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "S")
    public static short field4587 = 205;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 4)
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1983(boolean arg0) {
        field4580 = null;
        if (arg0) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILwl;)V", line = 27)
    public static final void method1984(int arg0, class521 arg1) {
        ++field4579;
        int var2 = -class446.field6625 + arg1.field7589;
        int var3 = 70 % ((53 - arg0) / 48);
        int var4 = arg1.field7565 * 128 - -(64 * arg1.method3045(0));
        int var5 = arg1.field7616 * 128 - -(64 * arg1.method3045(0));
        arg1.field1275 += (-arg1.field1275 + var4) / var2;
        arg1.field1279 += (-arg1.field1279 + var5) / var2;
        arg1.field7655 = 0;
        if (arg1.field7620 == 0) {
            arg1.method3104(103, 8192);
        }
        if (arg1.field7620 == 1) {
            arg1.method3104(114, 12288);
        }
        if (arg1.field7620 == 2) {
            arg1.method3104(127, 0);
        }
        if (arg1.field7620 == 3) {
            arg1.method3104(105, 4096);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)I", line = 61)
    public static final int method1985(int arg0, int arg1, byte arg2) {
        ++field4584;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        if (arg2 <= 13) {
            field4587 = -75;
        }
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return 255 & var5 >> 19;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILfh;B)V", line = 83)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 76) {
            method1984(64, (class521) null);
        }
        ++field4578;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field4582 = arg1.method1396(21);
                    }
                } else {
                    this.field4581 = arg1.method1396(121);
                }
            } else {
                this.field4583 = arg1.method1396(6);
            }
        } else {
            this.field4585 = arg1.method1396(-86);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I", line = 134)
    public final int[] method15(int arg0, int arg1) {
        ++field4586;
        if (arg1 != 4688) {
            this.method15(-96, -11);
        }
        int[] var3 = super.field4677.method2174(arg0, 45);
        if (super.field4677.field5040) {
            for (int var4 = 0; ~var4 > ~class91.field1471; ++var4) {
                int var5 = (class78.field1298[var4] << 12) / this.field4585 + this.field4581;
                int var6 = (class301.field4614[arg0] << 12) / this.field4585 + this.field4582;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field4583) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field4583 - 1 > var13 ? (var13 << 12) / this.field4583 : 0;
            }
        }
        return var3;
    }
}
