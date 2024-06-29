import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class175 extends class337 {

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field2601 = 3072;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    private int field2598 = 1024;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field2607 = 2048;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2599 = -1;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "Lit;")
    public static class459 field2605;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 < 1) {
            this.method177((byte) -62, -26, (class217) null);
        }
        ++field2600;
        this.field2607 = -this.field2598 + this.field2601;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class175() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        int var3 = 111 % ((arg1 - -41) / 49);
        ++field2604;
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[][] var5 = this.method2123(arg0, 0, -98);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class402.field5977 > var12; ++var12) {
                var9[var12] = this.field2598 - -(var6[var12] * this.field2607 >> 12);
                var10[var12] = (var7[var12] * this.field2607 >> 12) + this.field2598;
                var11[var12] = (var8[var12] * this.field2607 >> 12) + this.field2598;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5019 = ~arg2.method1515((byte) 121) == -2;
                }
            } else {
                this.field2601 = arg2.method1511(-110);
            }
        } else {
            this.field2598 = arg2.method1511(80);
        }
        ++field2606;
        int var5 = -15 % ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            field2599 = -40;
        }
        ++field2603;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0, 0, -97);
            for (int var5 = 0; var5 < class402.field5977; ++var5) {
                var3[var5] = (var4[var5] * this.field2607 >> 12) + this.field2598;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lcg;III)V")
    public static final void method1170(class93 arg0, int arg1, int arg2, int arg3) {
        long var4 = class329.field4942[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field1314 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field1311[arg0.field1314++] = class503.field7256[var8 - 1].field5918;
            var6 += 16L;
        }
        for (int var9 = arg0.field1314; var9 < 4; ++var9) {
            arg0.field1311[var9] = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class274.method1804(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class163.field2415;
                int var7 = arg3 << class163.field2415;
                return class52.method497(var6 + 1, class491.field7059[arg0].method411(arg1, arg3) + arg5, var7 + 1) && class52.method497(class450.field6574 + var6 - 1, class491.field7059[arg0].method411(arg1 + 1, arg3) + arg5, var7 + 1) && class52.method497(class450.field6574 + var6 - 1, class491.field7059[arg0].method411(arg1 + 1, arg3 + 1) + arg5, class450.field6574 + var7 - 1) && class52.method497(var6 + 1, class491.field7059[arg0].method411(arg1, arg3 + 1) + arg5, class450.field6574 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class534.field7849[arg0][var8][var14] == -class221.field3620) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class163.field2415) + 1;
            int var10 = (arg3 << class163.field2415) + 2;
            int var11 = class491.field7059[arg0].method411(arg1, arg3) + arg5;
            if (!class52.method497(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class163.field2415) - 1;
                if (!class52.method497(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class163.field2415) - 1;
                    if (!class52.method497(var9, var11, var13)) {
                        return false;
                    } else if (!class52.method497(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2605 = null;
        if (arg0 != -14198) {
            field2605 = null;
        }
    }
}
