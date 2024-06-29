import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class83 extends class54 {

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Ldc;")
    private static class37 field1472 = class185.method1233((byte) 86, "Loading)3)3)3");

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Ldc;")
    public static class37 field1469 = field1472;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lqb;")
    public static class176 field1468 = new class176(30);

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field1479 = 3;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "[J")
    public static long[] field1477 = new long[32];

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "[I")
    public static int[] field1478 = new int[5];

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "[Ldc;")
    public static class37[] field1480 = new class37[100];

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field1481 = -1;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Ldc;")
    public static class37 field1482 = class185.method1233((byte) 86, "Stufe)2");

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lci;")
    public class32 field1465;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Ldj;")
    public class44 field1464;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "[B")
    public byte[] field1476;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[Lji;")
    public static class106[] field1475;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public static final void method567(int arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        var3[0] = arg2;
        int var4 = 1;
        if (arg1 >= -13) {
            field1480 = null;
        }
        field1470++;
        int[] var5 = new int[4];
        var5[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class198.field3701[var6] != arg2) {
                var3[var4] = class198.field3701[var6];
                var5[var4] = class140.field2717[var6];
                var4++;
            }
        }
        class198.field3701 = var3;
        class140.field2717 = var5;
        class185.method1237(0, 0, class6.field67, class6.field67.length - 1);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public static void method568(byte arg0) {
        field1472 = null;
        field1475 = null;
        field1468 = null;
        field1469 = null;
        field1482 = null;
        field1478 = null;
        field1477 = null;
        if (arg0 == -93) {
            field1480 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBI)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1471++;
        if (arg4 != -88) {
            field1472 = null;
        }
        int var6 = arg5 - arg0;
        int var7 = arg1 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class150.method1033(arg2, arg1, arg3, arg0, (byte) -119);
            }
        } else if (var7 == 0) {
            class121.method831(false, arg2, arg5, arg0, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg5;
                arg5 = arg1;
                arg1 = var10;
                arg0 = arg3;
                arg3 = var9;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                arg0 = arg5;
                int var12 = arg3;
                arg5 = var11;
                arg3 = arg1;
                arg1 = var12;
            }
            int var13 = arg3;
            int var14 = arg5 - arg0;
            int var15 = arg1 - arg3;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg3 < arg1 ? 1 : -1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    class11.field156[var18][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    var16 += var15;
                    class11.field156[var13][var19] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -5 / ((arg2 - 61) / 41);
        field1467++;
        int var8 = class196.method1308(57, class198.field3697, arg3, class199.field3712);
        int var9 = class196.method1308(65, class198.field3697, arg5, class199.field3712);
        int var10 = class196.method1308(60, class29.field536, arg0, class82.field1458);
        int var11 = class196.method1308(111, class29.field536, arg6, class82.field1458);
        int var12 = class196.method1308(78, class198.field3697, arg3 + arg4, class199.field3712);
        int var13 = class196.method1308(117, class198.field3697, arg5 - arg4, class199.field3712);
        for (int var14 = var8; var14 < var12; var14++) {
            class29.method242(var11, (byte) -30, arg1, class11.field156[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class29.method242(var11, (byte) -30, arg1, class11.field156[var15], var10);
        }
        int var16 = class196.method1308(89, class29.field536, arg0 + arg4, class82.field1458);
        int var17 = class196.method1308(67, class29.field536, arg6 - arg4, class82.field1458);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class11.field156[var18];
            class29.method242(var16, (byte) -30, arg1, var19, var10);
            class29.method242(var11, (byte) -30, arg1, var19, var17);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lci;IILdj;)V")
    public static final void method571(class32 arg0, int arg1, int arg2, class44 arg3) {
        field1466++;
        byte[] var4 = null;
        class203 var5 = class160.field3015;
        synchronized (class160.field3015) {
            if (arg1 <= 102) {
                method568((byte) 43);
            }
            for (class83 var6 = (class83) class160.field3015.method1338(117); var6 != null; var6 = (class83) class160.field3015.method1332((byte) -89)) {
                if ((long) arg2 == var6.field1066 && var6.field1465 == arg0 && var6.field1473 == 0) {
                    var4 = var6.field1476;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method263((byte) -32, arg2);
            arg3.method385(true, arg2, arg0, var7, 73);
        } else {
            arg3.method385(true, arg2, arg0, var4, -89);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILwa;Lwa;)I")
    public static final int method572(int arg0, class238 arg1, class238 arg2) {
        field1474++;
        int var3 = 0;
        if (arg2.method1551(-13114, class75.field1335)) {
            var3++;
        }
        if (arg0 != 27118) {
            method570(-86, 63, 42, -107, 1, -51, 52);
        }
        if (arg1.method1551(-13114, field1481)) {
            var3++;
        }
        if (arg1.method1551(-13114, class6.field70)) {
            var3++;
        }
        if (arg1.method1551(-13114, class64.field1163)) {
            var3++;
        }
        if (arg1.method1551(-13114, class112.field1991)) {
            var3++;
        }
        if (arg1.method1551(-13114, class140.field2714)) {
            var3++;
        }
        arg1.method1551(arg0 - 40232, class6.field69);
        arg1.method1551(-13114, class239.field4392);
        arg1.method1551(-13114, class94.field1642);
        arg1.method1551(-13114, class158.field2996);
        arg1.method1551(-13114, class127.field2364);
        return var3;
    }
}
