import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class264 extends class337 {

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    private int field4056 = 2048;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
    private int field4054 = 0;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    private int field4060 = 8192;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    private int field4061 = 12288;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    private int field4063 = 0;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    private int field4055 = 4096;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    private int field4062 = 2048;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "Lob;")
    public static class521 field4052 = new class521(43, 7);

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "Lhn;")
    public static class509 field4057 = new class509(50, 0);

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "Lob;")
    public static class521 field4066 = new class521(8, 3);

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILhp;)Lw;")
    public static final class197 method1762(int arg0, class217 arg1) {
        ++field4051;
        return arg0 < 0 ? null : new class197(arg1.method1529((byte) 111), arg1.method1529((byte) 110), arg1.method1529((byte) -61), arg1.method1529((byte) -76), arg1.method1548(31529), arg1.method1515((byte) 127));
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)I")
    public static int method1763(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(III)Z")
    private final boolean method1764(int arg0, int arg1, int arg2) {
        ++field4059;
        int var4 = (arg0 + arg1) * this.field4061 >> 12;
        int var5 = class333.field4972[(var4 * 255 & 1047612) >> 12];
        int var6 = (var5 << 12) / this.field4061;
        int var7 = (var6 << 12) / this.field4060;
        int var8 = -52 / ((arg2 - 59) / 59);
        int var9 = this.field4055 * var7 >> 12;
        return var9 > -arg1 + arg0 && -var9 < arg0 - arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 97 / ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4060 = arg2.method1511(-109);
                                }
                            } else {
                                this.field4055 = arg2.method1511(107);
                            }
                        } else {
                            this.field4061 = arg2.method1511(74);
                        }
                    } else {
                        this.field4056 = arg2.method1511(100);
                    }
                } else {
                    this.field4054 = arg2.method1511(-95);
                }
            } else {
                this.field4063 = arg2.method1511(120);
            }
        } else {
            this.field4062 = arg2.method1511(91);
        }
        ++field4064;
    }

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "(I)V")
    public static void method1765(int arg0) {
        field4057 = null;
        field4052 = null;
        field4066 = null;
        if (arg0 != 0) {
            field4052 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field4058;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (arg1 != -11) {
            field4052 = null;
        }
        if (super.field5007.field687) {
            int var4 = class505.field7381[arg0] + -2048;
            for (int var5 = 0; ~class402.field5977 < ~var5; ++var5) {
                int var6 = class109.field1530[var5] + -2048;
                int var7 = var6 - -this.field4062;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field4063 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field4054 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field4056 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method1766(var12, var9, (byte) -127) && !this.method1764(var18, var15, arg1 + -21) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIB)Z")
    private final boolean method1766(int arg0, int arg1, byte arg2) {
        ++field4053;
        int var4 = (arg0 - arg1) * this.field4061 >> 12;
        int var5 = class333.field4972[255 & var4 * 255 >> 12];
        if (arg2 >= -92) {
            field4057 = null;
        }
        int var6 = (var5 << 12) / this.field4061;
        int var7 = (var6 << 12) / this.field4060;
        int var8 = this.field4055 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && ~(-var8) > ~(arg0 + arg1);
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        class61.method539((byte) 88);
        ++field4065;
        if (arg0 < 1) {
            this.field4061 = 81;
        }
    }
}
