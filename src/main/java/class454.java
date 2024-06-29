import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class454 extends class354 {

    @OriginalMember(owner = "client!it", name = "K", descriptor = "I")
    private int field6720 = 0;

    @OriginalMember(owner = "client!it", name = "N", descriptor = "I")
    private int field6722 = 2000;

    @OriginalMember(owner = "client!it", name = "T", descriptor = "I")
    private int field6728 = 4096;

    @OriginalMember(owner = "client!it", name = "R", descriptor = "I")
    private int field6726 = 0;

    @OriginalMember(owner = "client!it", name = "V", descriptor = "I")
    private int field6730 = 16;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "I")
    public static int field6719 = 1;

    @OriginalMember(owner = "client!it", name = "L", descriptor = "Lvp;")
    public static class123 field6721 = new class123(25, 3);

    @OriginalMember(owner = "client!it", name = "W", descriptor = "I")
    public static int field6731 = 0;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!it", name = "O", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!it", name = "P", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!it", name = "Q", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!it", name = "S", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!it", name = "U", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
    public static final void method2734(int arg0) {
        if (arg0 == -15485) {
            for (class231 var1 = (class231) class246.field3563.method2257((byte) 104); var1 != null; var1 = (class231) class246.field3563.method2256(122)) {
                if (class216.method1428(25607, var1.field3368)) {
                    class38.method297(arg0 + 11388, var1);
                }
            }
            ++field6718;
            if (class106.field1669 != 1) {
                class346.method2246(class103.field1641, class529.field7806, (byte) -93, class365.field5484, class447.field6548);
                int var2 = class476.field6998.method105(class229.field3348.method1273(true, class370.field5530), 1);
                for (class231 var3 = (class231) class246.field3563.method2257((byte) 122); var3 != null; var3 = (class231) class246.field3563.method2256(93)) {
                    int var4 = class104.method791(var3, (byte) -118);
                    if (~var2 > ~var4) {
                        var2 = var4;
                    }
                }
                class365.field5484 = var2 - -8;
                class447.field6548 = class106.field1669 * 16 + (!class207.field2981 ? 22 : 26);
            } else {
                class314.field4487 = false;
                class346.method2246(class103.field1641, class529.field7806, (byte) -93, class365.field5484, class447.field6548);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBZIIZI)V")
    public static final void method2735(int arg0, byte arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (~arg6 < ~arg3) {
            int var7 = (arg3 + arg6) / 2;
            int var8 = arg3;
            class507 var9 = class291.field4170[var7];
            class291.field4170[var7] = class291.field4170[arg6];
            class291.field4170[arg6] = var9;
            for (int var10 = arg3; arg6 > var10; ++var10) {
                if (class49.method360(arg2, arg5, (byte) 88, class291.field4170[var10], arg0, var9, arg4) <= 0) {
                    class507 var11 = class291.field4170[var10];
                    class291.field4170[var10] = class291.field4170[var8];
                    class291.field4170[var8++] = var11;
                }
            }
            class291.field4170[arg6] = class291.field4170[var8];
            class291.field4170[var8] = var9;
            method2735(arg0, (byte) -123, arg2, arg3, arg4, arg5, var8 + -1);
            method2735(arg0, (byte) -3, arg2, var8 - -1, arg4, arg5, arg6);
        }
        ++field6727;
        int var12 = -66 % ((79 - arg1) / 34);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        ++field6723;
        class291.method1807(arg0);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field6725;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = this.field6728 >> 1;
            int[][] var5 = super.field5357.method863(arg1 ^ 12309);
            Random var6 = new Random((long) this.field6726);
            for (int var7 = 0; this.field6722 > var7; ++var7) {
                int var8 = this.field6728 <= 0 ? this.field6720 : this.field6720 + class104.method790((byte) 90, this.field6728, var6) + -var4;
                int var9 = (4090 & var8) >> 4;
                int var10 = class104.method790((byte) 90, class404.field5952, var6);
                int var11 = class104.method790((byte) 90, class337.field5146, var6);
                int var12 = (class461.field6801[var9] * this.field6730 >> 12) + var10;
                int var13 = (class492.field7184[var9] * this.field6730 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class104.method790((byte) 90, 4096, var6) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 - -1024;
                        int var30 = class168.field2527 & var28;
                        int var31 = class30.field492 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        if (arg1 != -95) {
            method2738((byte) 46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)Z")
    public static final boolean method2736(int arg0) {
        ++field6717;
        if (arg0 != -24647) {
            field6731 = 76;
        }
        return class151.field2320;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(III)I")
    public static final int method2737(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field6731 = 27;
        }
        ++field6729;
        return arg2 != 1 && arg2 != 3 ? class221.field3200[3 & arg1] : class369.field5523[3 & arg1];
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field6724;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field6728 = arg1.method1868(arg0 ^ 15180);
                        }
                    } else {
                        this.field6720 = arg1.method1868(0);
                    }
                } else {
                    this.field6730 = arg1.method1918((byte) 124);
                }
            } else {
                this.field6722 = arg1.method1868(0);
            }
        } else {
            this.field6726 = arg1.method1918((byte) -117);
        }
        if (arg0 != 15180) {
            this.field6730 = -89;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(B)V")
    public static void method2738(byte arg0) {
        int var1 = -17 / ((-45 - arg0) / 50);
        field6721 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
    public class454() {
        super(0, true);
    }
}
