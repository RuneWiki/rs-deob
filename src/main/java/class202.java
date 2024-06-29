import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class202 extends class71 {

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    private int field3596 = 2000;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field3599 = 16;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    private int field3594 = 0;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    private int field3604 = 0;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field3605 = 4096;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3600 = 0;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Z")
    public static boolean field3608 = true;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Lcb;")
    public static class280 field3603;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 3)
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Lpg;", line = 13)
    public static final class199 method1496(int arg0, int arg1) {
        if (arg1 >= -118) {
            return (class199) null;
        }
        class199 var2 = (class199) class20.field574.method1767((byte) -37, (long) arg0);
        field3595++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3902.method1192(0, class59.method531(arg0, 10598), class177.method1375(-120, arg0));
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1476(128, new class53(var3));
        }
        class20.field574.method1771(-94, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V", line = 44)
    public static void method1497(byte arg0) {
        field3603 = null;
        if (arg0 < 102) {
            field3593 = 61;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 56)
    public final void method627(int arg0) {
        field3607++;
        class75.method644(69);
        if (arg0 != 7) {
            this.method199(-109, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[I", line = 71)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = this.field3605 >> 1;
            int[][] var5 = this.field1390.method550((byte) 81);
            Random var6 = new Random((long) this.field3604);
            for (int var7 = 0; var7 < this.field3596; var7++) {
                int var8 = this.field3605 <= 0 ? this.field3594 : this.field3594 + class133.method1041(var6, this.field3605, 10061) - var4;
                int var9 = class133.method1041(var6, class215.field3787, 10061);
                int var10 = class133.method1041(var6, class324.field5667, 10061);
                int var11 = var8 >> 4 & 0xFF;
                int var12 = var10 + (class278.field4909[var11] * this.field3599 >> 12);
                int var13 = var12 - var10;
                int var14 = (class87.field1668[var11] * this.field3599 >> 12) + var9;
                int var15 = var14 - var9;
                if (var15 != 0 || var13 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 > var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var14;
                        var9 = var10;
                        var14 = var12;
                        var10 = var17;
                        var12 = var18;
                    }
                    if (var14 < var9) {
                        int var19 = var9;
                        var9 = var14;
                        var14 = var19;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var14 - var9;
                    int var22 = var10;
                    int var23 = -var21 / 2;
                    int var24 = var12 - var10;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = 2048 / var21;
                    int var26 = 1024 - (class133.method1041(var6, 4096, 10061) >> 2);
                    int var27 = var12 <= var10 ? -1 : 1;
                    for (int var28 = var9; var28 < var14; var28++) {
                        int var29 = (var28 - var9) * var25 + var26 + 1024;
                        var23 += var24;
                        int var30 = class262.field4688 & var22;
                        if (var23 > 0) {
                            var23 += -var21;
                            var22 -= -var27;
                        }
                        int var31 = class309.field5478 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        field3602++;
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLvh;)V", line = 239)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method1497((byte) -17);
        }
        field3601++;
        if (arg0 == 0) {
            this.field3604 = arg2.method483(-127);
        } else if (arg0 == 1) {
            this.field3596 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field3599 = arg2.method483(-121);
        } else if (arg0 == 3) {
            this.field3594 = arg2.method468(28214);
        } else if (arg0 == 4) {
            this.field3605 = arg2.method468(28214);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lud;BI)V", line = 298)
    public static final void method1498(class279 arg0, byte arg1, int arg2) {
        field3598++;
        class314.field5534.method1634(218, arg1 + 27);
        class87.field1669++;
        class314.field5534.method479((byte) 3, arg0.method2013(115));
        class314.field5534.method504(arg2, (byte) 122);
        if (arg1 != -27) {
            field3603 = (class280) null;
        }
    }
}
