import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class379 extends class424 {

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    private int field5235 = 0;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    private int field5234 = 1;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    private int field5233 = 0;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "[Llr;")
    public static class105[] field5231 = new class105[29];

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field5232 = 0;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lrg;BI)V", line = 5)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field5234 = arg0.method2306((byte) 41);
                }
            } else {
                this.field5235 = arg0.method2306((byte) 98);
            }
        } else {
            this.field5233 = arg0.method2306((byte) 66);
        }
        ++field5240;
        if (arg1 != -48) {
            this.field5233 = 66;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IB)[I", line = 48)
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            field5236 = -97;
        }
        ++field5239;
        int[] var3 = super.field5892.method783(arg0, (byte) 85);
        if (super.field5892.field1427) {
            int var4 = class409.field5711[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class303.field4135; ++var6) {
                int var7 = class332.field4478[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field5233 == -1) {
                    var9 = (-var4 + var7) * this.field5234;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field5234 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field5235 != 0) {
                    if (~this.field5235 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class269.field3688[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lij;IZ)Lci;", line = 118)
    public static final class389 method2354(class316 arg0, int arg1, boolean arg2) {
        ++field5237;
        byte[] var3 = arg0.method1908((byte) -84, arg1);
        if (!arg2) {
            field5232 = -118;
        }
        return var3 == null ? null : new class389(var3);
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 141)
    public class379() {
        super(0, true);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V", line = 146)
    public final void method113(int arg0) {
        ++field5238;
        class361.method2227(4096);
        if (arg0 != 3) {
            this.field5235 = -102;
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V", line = 170)
    public static void method2355(int arg0) {
        field5231 = null;
        if (arg0 != 18016) {
            field5231 = null;
        }
    }
}
