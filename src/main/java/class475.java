import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class475 extends class111 {

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "I")
    private int field6541;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    private int field6532;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    private int field6534;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    private int field6540;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Llh;")
    public static class487 field6542 = new class487(34, -1);

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "[I")
    public static int[] field6544 = new int[1000];

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "Lgq;")
    public static class476 field6543;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBI)V")
    public final void method807(int arg0, byte arg1, int arg2) {
        ++field6533;
        int var4 = this.field6541 * arg0 >> 12;
        if (arg1 == -21) {
            int var5 = this.field6534 * arg0 >> 12;
            int var6 = this.field6540 * arg2 >> 12;
            int var7 = this.field6532 * arg2 >> 12;
            class473.method2664(var4, var5, super.field1543, var7, super.field1536, super.field1538, var6, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLsea;Lsea;I)V")
    public static final void method2678(boolean arg0, class648 arg1, class648 arg2, int arg3) {
        class588.field8260 = arg2;
        ++field6537;
        class181.field2622 = arg1;
        if (!arg0) {
            field6544 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)I")
    public static final int method2679(int arg0) {
        if (arg0 != 16) {
            method2679(76);
        }
        ++field6539;
        if (class396.field5579 == null) {
            if (!class541.field7327 && class137.field1948 > 0) {
                if (class367.field4945 && class353.field4698.method34(81, -16215) && ~class137.field1948 < -3) {
                    return ((class499) class588.field8265.field3151.field5621.field5621).field6782;
                }
                return ((class499) class588.field8265.field3151.field5621).field6782;
            }
            int var1 = class214.field2991.method1499(arg0 + -8);
            int var2 = class214.field2991.method1491((byte) 110);
            int var3 = class603.field8403;
            int var4 = class627.field8692;
            int var5 = class568.field8040;
            if (var3 < var1 && ~var1 > ~(var3 - -var5)) {
                int var6 = -1;
                for (int var7 = 0; class137.field1948 > var7; ++var7) {
                    if (!class287.field3951) {
                        int var11 = (-var7 + -1 + class137.field1948) * 16 + var4 + 31;
                        if (~(var11 + -13) > ~var2 && var11 - -3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (-var7 + class137.field1948 + -1) * 16 + var4 + 33;
                        if (var2 > var12 + -13 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class666 var9 = new class666(class588.field8265);
                    for (class499 var10 = (class499) var9.method3765(-1968); var10 != null; var10 = (class499) var9.method3764(-21495)) {
                        if (~var6 == ~(var8++)) {
                            return var10.field6782;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public static final void method2680(byte arg0) {
        class562.field7587 = 0;
        class470.field6489 = 0;
        ++field6538;
        class433.method2481(-1);
        class515.method2942(-2);
        class594.method3359(0);
        boolean var1 = false;
        for (int var2 = 0; class470.field6489 > var2; ++var2) {
            int var4 = field6544[var2];
            class393 var5 = (class393) class299.field4071.method970((byte) 89, (long) var4);
            class61 var6 = var5.field5552;
            if (class541.field7327 && class561.method3140(127, var4)) {
                class592.method3352(-15934);
            }
            if (class186.field2697 != var6.field1716) {
                if (var6.field674.method3247(false)) {
                    class8.method33(var6, 53);
                }
                var6.method500((class568) null, -14527);
                var1 = true;
                var5.method2340(-44);
            }
        }
        if (var1) {
            class254.field3465 = class299.field4071.method972(arg0 + -76);
            class299.field4071.method971(class31.field400, arg0 + -30378);
        }
        if (class95.field1338 != class660.field9184.field6892) {
            throw new RuntimeException("gnp1 pos:" + class660.field9184.field6892 + " psize:" + class95.field1338);
        } else {
            for (int var3 = 0; ~var3 > ~class698.field9912; ++var3) {
                if (class299.field4071.method970((byte) 89, (long) class636.field8790[var3]) == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class698.field9912);
                }
            }
            if (arg0 != 76) {
                method2679(108);
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIIII)V")
    public class475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6541 = arg0;
        this.field6532 = arg3;
        this.field6534 = arg2;
        this.field6540 = arg1;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)V")
    public final void method804(int arg0, int arg1, int arg2) {
        ++field6536;
        int var4 = this.field6541 * arg0 >> 12;
        int var5 = this.field6534 * arg0 >> 12;
        if (arg2 <= 84) {
            field6543 = null;
        }
        int var6 = this.field6540 * arg1 >> 12;
        int var7 = this.field6532 * arg1 >> 12;
        class647.method3614(super.field1536, var5, super.field1538, var7, var4, var6, (byte) 23);
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public static void method2681(int arg0) {
        if (arg0 <= 117) {
            field6543 = null;
        }
        field6544 = null;
        field6543 = null;
        field6542 = null;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)V")
    public final void method806(int arg0, int arg1, int arg2) {
        ++field6535;
        int var4 = this.field6541 * arg0 >> 12;
        int var5 = this.field6534 * arg0 >> 12;
        if (arg2 != 0) {
            method2680((byte) -7);
        }
        int var6 = this.field6540 * arg1 >> 12;
        int var7 = this.field6532 * arg1 >> 12;
        class88.method645(super.field1543, var7, (byte) -126, var4, var5, var6);
    }
}
