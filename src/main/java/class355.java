import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class355 extends class398 {

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    private int field5134 = 4096;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    private int field5140 = 4096;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    private int field5136 = 4096;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field5139 = 0;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)Z", line = 10)
    public static final boolean method2331(int arg0, int arg1) {
        ++field5135;
        if (~arg1 != -13 && ~arg1 != -49 && arg1 != 44 && ~arg1 != -58 && arg1 != 59) {
            if (~arg1 != -4 && ~arg1 != -46 && ~arg1 != -1006) {
                if (~arg1 != -16 && ~arg1 != -31 && ~arg1 != -20 && ~arg1 != -48 && arg1 != 2) {
                    if (~arg1 != -23 && arg1 != 5 && arg1 != 1004 && arg1 != 34) {
                        return arg0 > -85 ? false : false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[[I", line = 37)
    public final int[][] method99(int arg0, int arg1) {
        ++field5132;
        if (arg1 != 2) {
            method2332(-56, (class438) null, -1, true);
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int[][] var4 = this.method2561(arg0, (byte) -92, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class140.field1922 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field5136 * var12 >> 12;
                    var9[var11] = this.field5134 * var13 >> 12;
                    var10[var11] = this.field5140 * var14 >> 12;
                } else {
                    var8[var11] = this.field5136;
                    var9[var11] = this.field5134;
                    var10[var11] = this.field5140;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 151)
    public class355() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILqs;IZ)V", line = 111)
    public static final void method2332(int arg0, class438 arg1, int arg2, boolean arg3) {
        ++field5138;
        class315.field4611[arg2][arg0] = arg1;
        if (arg3) {
            field5139 = 54;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILfp;)Z", line = 122)
    public static final boolean method2333(int arg0, class7 arg1) {
        ++field5133;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field126) {
            return false;
        } else if (!arg1.method50(-28047)) {
            return false;
        } else if (class156.field2114.method384((long) arg1.field103, true) != null) {
            return false;
        } else if (class90.field1262.method384((long) arg1.field100, true) != null) {
            return false;
        } else {
            if (arg0 != 16037) {
                field5139 = -52;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lnj;II)V", line = 155)
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field5131;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field5140 = arg0.method1343(255);
                }
            } else {
                this.field5134 = arg0.method1343(255);
            }
        } else {
            this.field5136 = arg0.method1343(arg2 + 13387);
        }
        if (arg2 != -13132) {
            this.field5134 = 123;
        }
    }
}
