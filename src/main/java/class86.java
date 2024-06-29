import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class86 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lhga;")
    public static class158 field1619 = new class158();

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
    public static int[] field1623 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILda;I)Lbm;")
    public static final class98 method857(int arg0, int arg1, int arg2, class55 arg3, int arg4) {
        field1621++;
        if (arg3 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                field1623 = null;
            }
            return new class98(arg4, arg2, arg0, arg3.method354(), arg3.method369(), arg3.method330(), arg3.method315(), arg3.method343(), arg3.method328(), arg3.method327());
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lmu;")
    public static final class275 method858(int arg0) {
        field1620++;
        class275 var1 = class426.method2590((byte) 117);
        var1.field4102 = arg0;
        var1.field4108 = null;
        var1.field4103 = new class641(5000);
        return var1;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method859(int arg0) {
        field1623 = null;
        field1619 = null;
        if (arg0 != -1) {
            field1623 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static final void method860(boolean arg0) {
        field1622++;
        class99.field1767.method3699(true, 5);
        class1.field54.method1513(5, -17731);
        class467.field6618.method1894(5, (byte) 124);
        class237.field3521.method3517(5, true);
        class317.field4681.method807(124, 5);
        class268.field3985.method254(-31888, 5);
        class357.field5338.method2102(5, (byte) -17);
        class261.field3825.method1312(5, true);
        class661.field9519.method627(106, 5);
        class107.field1851.method1671((byte) -127, 5);
        class373.field5557.method1157(32, 5);
        class342.field5099.method3360(5, (byte) 29);
        class597.field8568.method2802(5, (byte) -33);
        client.field4124.method981(5, (byte) 115);
        class119.field2137.method2829(5, 18294);
        class475.field6813.method1518(96, 5);
        class92.field1672.method3560(5, -55);
        class428.field6168.method2738(5, -14556);
        class589.field8478.method2246(122, 5);
        class598.field8575.method3333(5, arg0);
        class606.method3491(5, (byte) -103);
        class39.method557(50, 0);
        class435.method2642(0, 50);
        class150.method1184(671, 5);
        class246.method1662((byte) -125, 5);
        class206.field3155.method1908(5, (byte) -11);
        class183.field2943.method1908(5, (byte) -11);
        class37.field1048.method1908(5, (byte) -11);
        class192.field3025.method1908(5, (byte) -11);
        class683.field9703.method1908(5, (byte) -11);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class74.method800((byte) -127, arg3);
        field1626++;
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg5 > -114) {
            field1625 = -14;
        }
        int var14 = -1;
        if (arg1 >= class309.field4556 && client.field4115 >= arg1) {
            int[] var15 = class582.field8429[arg1];
            int var16 = class107.method968(class379.field5612, 124, class704.field9911, arg0 - arg3);
            int var17 = class107.method968(class379.field5612, 110, class704.field9911, arg0 + arg3);
            int var18 = class107.method968(class379.field5612, 126, class704.field9911, arg0 - var8);
            int var19 = class107.method968(class379.field5612, 108, class704.field9911, arg0 + var8);
            class705.method3938(var18, arg2, 30336, var16, var15);
            class705.method3938(var19, arg4, 30336, var18, var15);
            class705.method3938(var17, arg2, 30336, var19, var15);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class486.field6950[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class309.field4556 <= var21 && client.field4115 >= var20) {
                    if (var8 > var9) {
                        int var22 = class486.field6950[var9];
                        int var23 = class107.method968(class379.field5612, 119, class704.field9911, arg0 + var7);
                        int var24 = class107.method968(class379.field5612, 127, class704.field9911, arg0 - var7);
                        int var25 = class107.method968(class379.field5612, 109, class704.field9911, arg0 + var22);
                        int var26 = class107.method968(class379.field5612, 126, class704.field9911, arg0 - var22);
                        if (client.field4115 >= var21) {
                            int[] var27 = class582.field8429[var21];
                            class705.method3938(var26, arg2, 30336, var24, var27);
                            class705.method3938(var25, arg4, 30336, var26, var27);
                            class705.method3938(var23, arg2, 30336, var25, var27);
                        }
                        if (var20 >= class309.field4556) {
                            int[] var28 = class582.field8429[var20];
                            class705.method3938(var26, arg2, 30336, var24, var28);
                            class705.method3938(var25, arg4, 30336, var26, var28);
                            class705.method3938(var23, arg2, 30336, var25, var28);
                        }
                    } else {
                        int var29 = class107.method968(class379.field5612, 123, class704.field9911, arg0 + var7);
                        int var30 = class107.method968(class379.field5612, 108, class704.field9911, arg0 - var7);
                        if (var21 <= client.field4115) {
                            class705.method3938(var29, arg2, 30336, var30, class582.field8429[var21]);
                        }
                        if (class309.field4556 <= var20) {
                            class705.method3938(var29, arg2, 30336, var30, class582.field8429[var20]);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class309.field4556 && client.field4115 >= var31) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class704.field9911 <= var33 && class379.field5612 >= var34) {
                    int var35 = class107.method968(class379.field5612, 122, class704.field9911, var33);
                    int var36 = class107.method968(class379.field5612, 109, class704.field9911, var34);
                    if (var7 >= var8) {
                        if (client.field4115 >= var32) {
                            class705.method3938(var35, arg2, 30336, var36, class582.field8429[var32]);
                        }
                        if (var31 >= class309.field4556) {
                            class705.method3938(var35, arg2, 30336, var36, class582.field8429[var31]);
                        }
                    } else {
                        int var37 = var7 > var11 ? class486.field6950[var7] : var11;
                        int var38 = class107.method968(class379.field5612, 124, class704.field9911, arg0 + var37);
                        int var39 = class107.method968(class379.field5612, 123, class704.field9911, arg0 - var37);
                        if (var32 <= client.field4115) {
                            int[] var40 = class582.field8429[var32];
                            class705.method3938(var39, arg2, 30336, var36, var40);
                            class705.method3938(var38, arg4, 30336, var39, var40);
                            class705.method3938(var35, arg2, 30336, var38, var40);
                        }
                        if (var31 >= class309.field4556) {
                            int[] var41 = class582.field8429[var31];
                            class705.method3938(var39, arg2, 30336, var36, var41);
                            class705.method3938(var38, arg4, 30336, var39, var41);
                            class705.method3938(var35, arg2, 30336, var38, var41);
                        }
                    }
                }
            }
        }
    }
}
