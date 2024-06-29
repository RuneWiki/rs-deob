import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class226 extends class88 {

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Lbe;")
    public class18 field3629;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static volatile int field3638 = 0;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "F")
    public static float field3639 = 0.0F;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "Z")
    public static boolean field3636;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "[Lib;")
    public static class56[] field3630;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
    public static void method1596(int arg0) {
        if (arg0 != 0) {
            field3639 = -0.7889668F;
        }
        field3630 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILeh;)V")
    public static final void method1597(int arg0, class137 arg1) {
        field3631++;
        class53.field683 = arg1;
        if (arg0 != -5798) {
            method1597(-117, (class137) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lbe;)V")
    public class226(class18 arg0) {
        this.field3629 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLpd;I)Lml;")
    public static final class148 method1598(byte arg0, class96 arg1, int arg2) {
        field3632++;
        class148 var3 = new class148(arg2, arg1.method588(false), arg1.method588(false), arg1.method597(-1197332568), arg1.method597(-1197332568), arg1.method584(255) == 1, arg1.method584(255));
        int var4 = arg1.method584(255);
        if (arg0 >= -29) {
            field3638 = 52;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field2329.method1803(new class89(arg1.method584(255), arg1.method584(255), arg1.method549(255), arg1.method549(255), arg1.method549(255), arg1.method549(255), arg1.method549(255), arg1.method549(255), arg1.method549(255), arg1.method549(255)), -1);
        }
        var3.method1024((byte) 98);
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)Z")
    public static final boolean method1599(byte arg0) {
        if (arg0 <= 85) {
            field3636 = false;
        }
        field3635++;
        return class52.field674;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1600(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class95.method531(128, arg4);
        field3637++;
        int var7 = 0;
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg0 != 93) {
            return;
        }
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg6 >= class117.field1656 && class132.field2105 >= arg6) {
            int[] var14 = class14.field186[arg6];
            int var15 = class256.method1750(68, arg3 - arg4, class116.field1653, class114.field1634);
            int var16 = class256.method1750(49, arg3 + arg4, class116.field1653, class114.field1634);
            int var17 = class256.method1750(124, arg3 - var8, class116.field1653, class114.field1634);
            int var18 = class256.method1750(41, arg3 + var8, class116.field1653, class114.field1634);
            class78.method433(var17, var15, var14, arg2, (byte) 123);
            class78.method433(var18, var17, var14, arg1, (byte) 123);
            class78.method433(var16, var18, var14, arg2, (byte) 123);
        }
        int var19 = -1;
        while (var10 > var7) {
            var13 += 2;
            var9 += var13;
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class283.field4519[var11] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                int var20 = arg6 - var10;
                var9 -= var10 << 1;
                int var21 = arg6 + var10;
                if (var21 >= class117.field1656 && var20 <= class132.field2105) {
                    if (var8 > var10) {
                        int var22 = class283.field4519[var10];
                        int var23 = class256.method1750(58, arg3 + var7, class116.field1653, class114.field1634);
                        int var24 = class256.method1750(arg0 - 9, -var7 + arg3, class116.field1653, class114.field1634);
                        int var25 = class256.method1750(83, arg3 + var22, class116.field1653, class114.field1634);
                        int var26 = class256.method1750(126, arg3 - var22, class116.field1653, class114.field1634);
                        if (class132.field2105 >= var21) {
                            int[] var27 = class14.field186[var21];
                            class78.method433(var26, var24, var27, arg2, (byte) 123);
                            class78.method433(var25, var26, var27, arg1, (byte) 123);
                            class78.method433(var23, var25, var27, arg2, (byte) 123);
                        }
                        if (class117.field1656 <= var20) {
                            int[] var28 = class14.field186[var20];
                            class78.method433(var26, var24, var28, arg2, (byte) 123);
                            class78.method433(var25, var26, var28, arg1, (byte) 123);
                            class78.method433(var23, var25, var28, arg2, (byte) 123);
                        }
                    } else {
                        int var29 = class256.method1750(69, arg3 + var7, class116.field1653, class114.field1634);
                        int var30 = class256.method1750(84, arg3 - var7, class116.field1653, class114.field1634);
                        if (var21 <= class132.field2105) {
                            class78.method433(var29, var30, class14.field186[var21], arg2, (byte) 123);
                        }
                        if (var20 >= class117.field1656) {
                            class78.method433(var29, var30, class14.field186[var20], arg2, (byte) 123);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class117.field1656 <= var32 && class132.field2105 >= var31) {
                int var33 = arg3 - var10;
                int var34 = arg3 + var10;
                if (var34 >= class116.field1653 && class114.field1634 >= var33) {
                    int var35 = class256.method1750(56, var34, class116.field1653, class114.field1634);
                    int var36 = class256.method1750(125, var33, class116.field1653, class114.field1634);
                    if (var7 < var8) {
                        int var37 = var11 < var7 ? class283.field4519[var7] : var11;
                        int var38 = class256.method1750(75, arg3 + var37, class116.field1653, class114.field1634);
                        int var39 = class256.method1750(45, arg3 - var37, class116.field1653, class114.field1634);
                        if (var32 <= class132.field2105) {
                            int[] var40 = class14.field186[var32];
                            class78.method433(var39, var36, var40, arg2, (byte) 123);
                            class78.method433(var38, var39, var40, arg1, (byte) 123);
                            class78.method433(var35, var38, var40, arg2, (byte) 123);
                        }
                        if (class117.field1656 <= var31) {
                            int[] var41 = class14.field186[var31];
                            class78.method433(var39, var36, var41, arg2, (byte) 123);
                            class78.method433(var38, var39, var41, arg1, (byte) 123);
                            class78.method433(var35, var38, var41, arg2, (byte) 123);
                        }
                    } else {
                        if (var32 <= class132.field2105) {
                            class78.method433(var35, var36, class14.field186[var32], arg2, (byte) 123);
                        }
                        if (var31 >= class117.field1656) {
                            class78.method433(var35, var36, class14.field186[var31], arg2, (byte) 123);
                        }
                    }
                }
            }
        }
    }
}
