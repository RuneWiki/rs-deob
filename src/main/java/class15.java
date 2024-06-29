import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class123 {

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    private int field340 = 204;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    private int field343 = 1;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "I")
    private int field348 = 1;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field345 = 0;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "Leb;")
    public static class230 field349 = class68.method589(0, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!we", name = "pb", descriptor = "Leb;")
    public static class230 field355 = class68.method589(0, "<)4col>");

    @OriginalMember(owner = "client!we", name = "nb", descriptor = "I")
    public static int field353 = -1;

    @OriginalMember(owner = "client!we", name = "qb", descriptor = "Leb;")
    public static class230 field356 = null;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Leb;")
    public static class230 field342 = class68.method589(0, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "Lv;")
    public static class147 field337 = new class147(20);

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!we", name = "ob", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!we", name = "mb", descriptor = "Lkk;")
    public static class223 field352;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method204(int arg0) {
        if (arg0 == -2) {
            field355 = null;
            field352 = null;
            field356 = null;
            field349 = null;
            field342 = null;
            field337 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILkk;)V")
    public static final void method205(int arg0, class223 arg1) {
        ++field341;
        class35.field655 = arg1.method1521(8994, class30.field547);
        if (arg0 > -75) {
            method208(-71, -76, -30, false, 32, -2, 82, -13, 108, 85, -20, 5);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int[] var3 = super.field2160.method1323((byte) 69, arg0);
        if (super.field2160.field3243) {
            for (int var4 = 0; class140.field2505 > var4; ++var4) {
                int var5 = class214.field3705[var4];
                int var6 = this.field348 * var5 >> 12;
                int var7 = class154.field2753[arg0];
                int var8 = this.field343 * var7 >> 12;
                int var9 = var7 % (4096 / this.field343) * this.field343;
                int var10 = var5 % (4096 / this.field348) * this.field348;
                if (var9 < this.field340) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (~var6 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field340 > var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field340 < ~var10) {
                    int var11;
                    for (var11 = var6 - var8; ~var11 > -1; var11 += 4) {
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
        ++field344;
        int var12 = -116 / ((arg1 - -24) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)I")
    public static final int method206(int arg0, int arg1, int arg2) {
        ++field351;
        int var3 = -128 + class201.method1417(arg2 + 45365, 4, true, arg0 + 91923) + (-128 + class201.method1417(arg2 + 10294, 2, true, arg0 + 37821) >> 1) + (class201.method1417(arg2, 1, true, arg0) - 128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + arg1;
        if (~var4 > -11) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field347;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field340 = arg1.method161(4);
                }
            } else {
                this.field343 = arg1.method200(arg2 ^ 1876195635);
            }
        } else {
            this.field348 = arg1.method200(255);
        }
        if (arg2 != 1876195788) {
            field346 = -93;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lkk;I)V")
    public static final void method207(class223 arg0, int arg1) {
        class60.field1144 = arg0.method1521(8994, class223.field3850);
        ++field338;
        class259.field4576 = arg0.method1521(arg1 ^ -11129, class124.field2167);
        if (arg1 != -2139) {
            method204(-50);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZIIIIIIII)Z")
    public static final boolean method208(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg8 <= 92) {
            field355 = null;
        }
        ++field339;
        if (class56.field1033.method1005(0) != 2) {
            return class56.field1033.method1005(0) > 2 ? class113.method908(arg9, arg1, arg0, arg4, arg6, arg3, arg10, arg7, arg2, (byte) 97, arg5, class56.field1033.method1005(0), arg11) : class249.method1743(true, arg3, arg1, arg10, arg7, arg9, arg2, arg5, arg4, arg11, arg0, arg6);
        } else {
            return class204.method1430(arg4, arg5, arg1, arg7, arg0, arg2, -19886, arg10, arg9, arg11, arg6, arg3);
        }
    }
}
