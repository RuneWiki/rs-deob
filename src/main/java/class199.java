import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class199 extends class115 {

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "Lud;")
    private class279 field3558 = class171.field3079;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "Lud;")
    public static class279 field3550 = class130.method1024("niveau ", 255);

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "Z")
    public static boolean field3560 = false;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "Lud;")
    private static class279 field3566 = class130.method1024("Continue", 255);

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Lud;")
    public static class279 field3564 = field3566;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Lok;")
    public static class149 field3548;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "Lcd;")
    public class69 field3549;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Lcd;")
    private class69 field3553;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "[Lom;")
    public static class70[] field3557;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILvh;)V", line = 7)
    private final void method1475(int arg0, int arg1, class53 arg2) {
        if (arg0 < 6) {
            this.method1485((byte) 99, -78);
        }
        field3561++;
        if (arg1 == 1) {
            this.field3556 = arg2.method483(-108);
        } else if (arg1 == 2) {
            this.field3563 = arg2.method483(-103);
        } else if (arg1 == 3) {
            this.field3558 = arg2.method467((byte) -16);
        } else if (arg1 == 4) {
            this.field3567 = arg2.method453(1);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method468(28214);
            this.field3549 = new class69(class189.method1440(1, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method453(1);
                class314 var7;
                if (arg1 == 5) {
                    var7 = new class272(arg2.method467((byte) -16));
                } else {
                    var7 = new class91(arg2.method453(1));
                }
                this.field3549.method612(false, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILvh;)V", line = 76)
    public final void method1476(int arg0, class53 arg1) {
        field3552++;
        if (arg0 != 128) {
            return;
        }
        while (true) {
            int var3 = arg1.method483(-116);
            if (var3 == 0) {
                return;
            }
            this.method1475(arg0 - 67, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLud;)Z", line = 102)
    public final boolean method1477(boolean arg0, class279 arg1) {
        field3551++;
        if (this.field3549 == null) {
            return false;
        }
        if (this.field3553 == null) {
            this.method1481((byte) -61);
        }
        if (!arg0) {
            return false;
        }
        for (class271 var3 = (class271) this.field3553.method610(arg1.method1967((byte) 98), -1); var3 != null; var3 = (class271) this.field3553.method613(5185)) {
            if (var3.field4836.method1990((byte) 123, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V", line = 138)
    public static final void method1478(byte arg0) {
        field3559++;
        class73.field1437.method1334((byte) -25);
        if (arg0 != -23) {
            method1483(34);
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V", line = 154)
    private final void method1479(byte arg0) {
        if (arg0 <= 44) {
            field3566 = (class279) null;
        }
        this.field3553 = new class69(this.field3549.method602(false));
        for (class91 var2 = (class91) this.field3549.method609(-26368); var2 != null; var2 = (class91) this.field3549.method604(2)) {
            class91 var3 = new class91((int) var2.field5539);
            this.field3553.method612(false, var3, (long) var2.field1714);
        }
        field3547++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 184)
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class207.field3668 * 128) {
            arg0 = class207.field3668 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class54.field1193 * 128) {
            arg2 = class54.field1193 * 128 - 1;
        }
        class29.field684 = class27.field654[arg3];
        class204.field3628 = class27.field642[arg3];
        field3555 = class27.field654[arg4];
        class108.field2006 = class27.field642[arg4];
        class306.field5430 = arg0;
        class318.field5581 = arg1;
        class233.field4083 = arg2;
        class223.field3956 = arg0 / 128;
        class45.field951 = arg2 / 128;
        class195.field3529 = class223.field3956 - class115.field2091;
        if (class195.field3529 < 0) {
            class195.field3529 = 0;
        }
        class272.field4848 = class45.field951 - class115.field2091;
        if (class272.field4848 < 0) {
            class272.field4848 = 0;
        }
        class183.field3363 = class223.field3956 + class115.field2091;
        if (class183.field3363 > class207.field3668) {
            class183.field3363 = class207.field3668;
        }
        class302.field5369 = class45.field951 + class115.field2091;
        if (class302.field5369 > class54.field1193) {
            class302.field5369 = class54.field1193;
        }
        short var15;
        if (class97.field1824) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class115.field2091 + class115.field2091 + 2; var16++) {
            for (int var17 = 0; var17 < class115.field2091 + class115.field2091 + 2; var17++) {
                int var18 = (var16 - class115.field2091 << 7) - (class306.field5430 & 0x7F);
                int var19 = (var17 - class115.field2091 << 7) - (class233.field4083 & 0x7F);
                int var20 = class223.field3956 + var16 - class115.field2091;
                int var21 = class45.field951 + var17 - class115.field2091;
                if (var20 >= 0 && var21 >= 0 && var20 < class207.field3668 && var21 < class54.field1193) {
                    int var22;
                    if (class14.field432 == null) {
                        var22 = class255.field4550[0][var20][var21] + 128 - class318.field5581;
                    } else {
                        var22 = class14.field432[0][var20][var21] + 128 - class318.field5581;
                    }
                    int var23 = class255.field4550[3][var20][var21] - class318.field5581 - 1000;
                    class285.field5081[var16][var17] = class179.method1396(var18, var23, var22, var19, var15);
                } else {
                    class285.field5081[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class115.field2091 + class115.field2091 + 1; var24++) {
            for (int var25 = 0; var25 < class115.field2091 + class115.field2091 + 1; var25++) {
                class213.field3734[var24][var25] = class285.field5081[var24][var25] || class285.field5081[var24 + 1][var25] || class285.field5081[var24][var25 + 1] || class285.field5081[var24 + 1][var25 + 1];
            }
        }
        class164.field2950 = arg6;
        class321.field5605 = arg7;
        class200.field3581 = arg8;
        class245.field4352 = arg9;
        class324.field5665 = arg10;
        class169.method1321();
        if (class295.field5263 != null) {
            class315.method2232(true);
            class171.method1330(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class97.field1824) {
                class289.field5155 = false;
                class162.method1279(0, 0, 0);
                class219.method1606((float[]) null);
                class30.method286();
            }
            class315.method2232(false);
        }
        class171.method1330(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(B)V", line = 312)
    private final void method1481(byte arg0) {
        field3565++;
        this.field3553 = new class69(this.field3549.method602(false));
        class272 var2 = (class272) this.field3549.method609(-26368);
        if (arg0 != -61) {
            this.method1485((byte) -49, 66);
        }
        while (var2 != null) {
            class271 var3 = new class271(var2.field4843, (int) var2.field5539);
            this.field3553.method612(false, var3, var2.field4843.method1967((byte) 98));
            var2 = (class272) this.field3549.method604(arg0 ^ 0xFFFFFFC1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I", line = 338)
    public final int method1482(int arg0, int arg1) {
        if (arg0 <= 71) {
            return 68;
        }
        field3562++;
        if (this.field3549 == null) {
            return this.field3567;
        } else {
            class91 var3 = (class91) this.field3549.method610((long) arg1, -1);
            return var3 == null ? this.field3567 : var3.field1714;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 359)
    public static void method1483(int arg0) {
        field3548 = null;
        field3564 = null;
        field3566 = null;
        field3557 = null;
        field3550 = null;
        if (arg0 != 128) {
            method1483(-97);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Lud;", line = 379)
    public final class279 method1484(int arg0, byte arg1) {
        if (arg1 != -118) {
            this.method1476(-9, (class53) null);
        }
        field3546++;
        if (this.field3549 == null) {
            return this.field3558;
        } else {
            class272 var3 = (class272) this.field3549.method610((long) arg0, -1);
            return var3 == null ? this.field3558 : var3.field4843;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Z", line = 409)
    public final boolean method1485(byte arg0, int arg1) {
        field3568++;
        if (this.field3549 == null) {
            return false;
        }
        if (this.field3553 == null) {
            this.method1479((byte) 51);
        }
        class91 var3 = (class91) this.field3553.method610((long) arg1, -1);
        if (arg0 != -25) {
            method1483(-39);
        }
        return var3 != null;
    }
}
