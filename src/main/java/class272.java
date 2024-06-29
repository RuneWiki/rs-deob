import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class272 extends class148 {

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    private int field3946 = 0;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    private int field3954 = 1;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "[I")
    public static int[] field3948 = new int[2048];

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lki;")
    public static class498 field3955 = new class498(44, -1);

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Lki;")
    public static class498 field3956 = new class498(28, 2);

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field3957 = 1337;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 33 % ((-88 - arg2) / 33);
        ++field3952;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field3954 = arg1.method1428(32122);
                }
            } else {
                this.field3946 = arg1.method1428(32122);
            }
        } else {
            this.field3953 = arg1.method1428(32122);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
    public static final void method1786(int arg0) {
        ++field3949;
        class74.field1105 = 0;
        if (arg0 == 25485) {
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class353.field5403[var1] = null;
                class284.field4082[var1] = 1;
                class244.field3610[var1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field3947;
        if (arg0 > -65) {
            return null;
        } else {
            int[] var3 = super.field2193.method497(arg1, false);
            if (super.field2193.field1312) {
                int var4 = class456.field6752[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class320.field4579; ++var6) {
                    int var7 = class517.field7539[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (this.field3953 != 0) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field3954 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field3954;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (this.field3946 != 0) {
                        if (this.field3946 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class76.field1130[var12 >> 4 & 255] - -4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V")
    public static void method1787(byte arg0) {
        if (arg0 == -31) {
            field3948 = null;
            field3955 = null;
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != -1285532468) {
            this.field3954 = 41;
        }
        ++field3950;
        class419.method2520(-114);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(ZI)V")
    public static final void method1788(boolean arg0, int arg1) {
        ++field3945;
        class404 var2 = (class404) class46.field732.method816(arg1 ^ 22080);
        if (arg1 == 22079) {
            while (var2 != null) {
                if (var2.field6085 != null) {
                    class366.field5591.method1794(var2.field6085);
                    var2.field6085 = null;
                }
                if (var2.field6093 != null) {
                    class366.field5591.method1794(var2.field6093);
                    var2.field6093 = null;
                }
                var2.method2049(-90);
                var2 = (class404) class46.field732.method812(83);
            }
            if (arg0) {
                for (class404 var3 = (class404) class372.field5674.method816(116); var3 != null; var3 = (class404) class372.field5674.method812(97)) {
                    if (var3.field6085 != null) {
                        class366.field5591.method1794(var3.field6085);
                        var3.field6085 = null;
                    }
                    var3.method2049(arg1 + -22163);
                }
                for (class404 var4 = (class404) class164.field2414.method2608(true); var4 != null; var4 = (class404) class164.field2414.method2603(119)) {
                    if (var4.field6085 != null) {
                        class366.field5591.method1794(var4.field6085);
                        var4.field6085 = null;
                    }
                    var4.method2049(arg1 + -22159);
                }
            }
        }
    }
}
