import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class476 extends class779 {

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6435 = null;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "[I")
    public static int[] field6436 = new int[8];

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public static int field6433 = 0;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "Lnf;")
    private class604 field6438;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Lnf;")
    private class604 field6439;

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "Lnf;")
    public class604 field6440;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "Lnf;")
    private class604 field6442;

    @OriginalMember(owner = "client!jea", name = "B", descriptor = "Lnf;")
    private class604 field6447;

    @OriginalMember(owner = "client!jea", name = "C", descriptor = "Lnf;")
    private class604 field6448;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1789(byte arg0) {
        ++field6434;
        if (!super.method1789(arg0)) {
            return false;
        } else {
            class429 var2 = (class429) super.field10732;
            if (!super.field10741.method3737(var2.field5858, false)) {
                return false;
            } else if (!super.field10741.method3737(var2.field5848, false)) {
                return false;
            } else if (!super.field10741.method3737(var2.field5849, false)) {
                return false;
            } else if (!super.field10741.method3737(var2.field5847, false)) {
                return false;
            } else if (!super.field10741.method3737(var2.field5851, false)) {
                return false;
            } else {
                return super.field10741.method3737(var2.field5850, false);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)V", line = 38)
    public static void method2727(byte arg0) {
        field6436 = null;
        if (arg0 >= -107) {
            method2727((byte) -97);
        }
        field6435 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 49)
    public final void method1790(int arg0) {
        ++field6441;
        super.method1790(arg0);
        class429 var2 = (class429) super.field10732;
        this.field6440 = class265.method1731(var2.field5858, 65485, super.field10741);
        this.field6439 = class265.method1731(var2.field5848, 65485, super.field10741);
        this.field6447 = class265.method1731(var2.field5849, arg0 ^ 59366, super.field10741);
        this.field6442 = class265.method1731(var2.field5847, 65485, super.field10741);
        this.field6448 = class265.method1731(var2.field5851, arg0 ^ 59366, super.field10741);
        this.field6438 = class265.method1731(var2.field5850, 65485, super.field10741);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZ)V", line = 70)
    public final void method1827(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6446;
        int var5 = this.field6447.method224() + arg2;
        int var6 = arg2 + super.field10732.field1031 + -this.field6442.method224();
        int var7 = arg1 - -this.field6448.method218();
        int var8 = super.field10732.field1030 + arg1 - this.field6438.method218();
        int var9 = var6 - var5;
        int var10 = var8 - var7;
        int var11 = this.method4270(arg0 + 49) * var9 / 10000;
        int[] var12 = new int[4];
        class95.field1472.method580(var12);
        class95.field1472.method512(var5, var7, var5 + var11, var8);
        this.method2728((byte) 93, var9, var5, var10, var7);
        class95.field1472.method512(var5 + var11, var7, var6, var8);
        this.field6439.method3426(var5, var7, var9, var10);
        class95.field1472.method512(var12[arg0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BIIII)V", line = 102)
    public void method2728(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6440.method3426(arg2, arg4, arg1, arg3);
        if (arg0 <= 55) {
            field6435 = null;
        }
        ++field6445;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lvl;BLpp;)Lqj;", line = 119)
    public static final class537 method2729(class15 arg0, byte arg1, class415 arg2) {
        ++field6443;
        class537 var3 = class198.method1428(arg1 ^ 16278);
        var3.field7297 = arg0.field223;
        var3.field7302 = arg0;
        if (var3.field7297 == -1) {
            var3.field7295 = new class329(260);
        } else if (var3.field7297 == -2) {
            var3.field7295 = new class329(10000);
        } else if (~var3.field7297 >= -19) {
            var3.field7295 = new class329(20);
        } else if (~var3.field7297 >= -99) {
            var3.field7295 = new class329(100);
        } else {
            var3.field7295 = new class329(260);
        }
        var3.field7295.method2071(arg2, (byte) -116);
        if (arg1 != -46) {
            return null;
        } else {
            var3.field7295.method2072(-1895652956, var3.field7302.method85(-120));
            var3.field7301 = 0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lgj;Lgj;Lhja;)V", line = 157)
    public class476(class662 arg0, class662 arg1, class429 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILuv;)V", line = 164)
    public static final void method2730(int arg0, class385 arg1) {
        ++field6437;
        int var2 = arg1.field5254 - class440.field5977;
        int var3 = arg1.field5218 * 512 - -(256 * arg1.method2342((byte) 122));
        int var4 = arg1.field5226 * 512 + arg1.method2342((byte) -126) * 256;
        arg1.field7398 += (var4 - arg1.field7398) / var2;
        if (arg0 != 1957) {
            field6433 = 12;
        }
        arg1.field7396 += (var3 - arg1.field7396) / var2;
        arg1.field5309 = 0;
        if (arg1.field5235 == 0) {
            arg1.method2332(8192, arg0 + 5459);
        }
        if (arg1.field5235 == 1) {
            arg1.method2332(12288, 7416);
        }
        if (~arg1.field5235 == -3) {
            arg1.method2332(0, arg0 ^ 7005);
        }
        if (arg1.field5235 == 3) {
            arg1.method2332(4096, arg0 ^ 7005);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZZII)V", line = 198)
    public final void method1826(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            int[] var5 = new int[4];
            class95.field1472.method580(var5);
            class95.field1472.method512(arg3, arg2, super.field10732.field1031 + arg3, super.field10732.field1030 + arg2);
            int var6 = this.field6447.method224();
            int var7 = this.field6447.method218();
            int var8 = this.field6442.method224();
            int var9 = this.field6442.method218();
            this.field6447.method3430(arg3, (-var7 + super.field10732.field1030) / 2 + arg2);
            this.field6442.method3430(super.field10732.field1031 + arg3 + -var8, arg2 - -((-var9 + super.field10732.field1030) / 2));
            class95.field1472.method512(arg3, arg2, super.field10732.field1031 + arg3, arg2 + this.field6448.method218());
            this.field6448.method3426(arg3 + var6, arg2, -var8 + super.field10732.field1031 + -var6, super.field10732.field1030);
            int var10 = this.field6438.method218();
            class95.field1472.method512(arg3, super.field10732.field1030 + arg2 + -var10, super.field10732.field1031 + arg3, arg2 - -super.field10732.field1030);
            this.field6438.method3426(arg3 + var6, -var10 + arg2 - -super.field10732.field1030, -var6 + super.field10732.field1031 + -var8, super.field10732.field1030);
            class95.field1472.method512(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field6444;
        if (arg0) {
            field6433 = -128;
        }
    }
}
