import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class218 extends class262 {

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    private int field3601 = 4;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    private int field3607 = 4;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "Lok;")
    public static class146 field3600 = class235.method1724(-12908, "(Z");

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    public static int field3608 = 0;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Lok;")
    private static class146 field3596 = class235.method1724(-12908, "cyan:");

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Lok;")
    public static class146 field3604 = field3596;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Lok;")
    public static class146 field3597 = field3596;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "Lok;")
    public static class146 field3598 = class235.method1724(-12908, ")3");

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "Loh;")
    public static class15 field3602;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V", line = 11)
    public static void method1609(int arg0) {
        field3602 = null;
        if (arg0 != 0) {
            return;
        }
        field3596 = null;
        field3597 = null;
        field3604 = null;
        field3598 = null;
        field3600 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)[[I", line = 29)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int var4 = class98.field1598 / this.field3607;
            int var5 = class104.field1676 / this.field3601;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1893(0, 0, -92);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1893(0, class104.field1676 * var7 / var5, arg0 ^ 0x68);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class98.field1598; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class98.field1598 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        field3593++;
        if (arg0 != 7) {
            method1611(-25, (class47) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IB)Lbd;", line = 105)
    public static final class301 method1610(int arg0, byte arg1) {
        field3606++;
        class301 var2 = (class301) class119.field1920.method799((byte) 52, (long) arg0);
        if (arg1 != -33) {
            return (class301) null;
        } else if (var2 == null) {
            byte[] var3 = class56.field998.method92(class213.method1591(-88, arg0), arg1 + 33, class107.method720(arg0, -114));
            class301 var4 = new class301();
            var4.field5126 = arg0;
            if (var3 != null) {
                var4.method2126((byte) -107, new class47(var3));
            }
            var4.method2127(true);
            class119.field1920.method797(var4, arg1 ^ 0xFFFFFFDF, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILwe;)V", line = 133)
    public static final void method1611(int arg0, class47 arg1) {
        field3610++;
        if (arg1.field860.length - arg1.field857 < 1) {
            return;
        }
        int var2 = arg1.method368(-105);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field860.length - arg1.field857)) {
            return;
        }
        class273.field4684 = arg1.method368(116);
        if (class273.field4684 < 1) {
            class273.field4684 = 1;
        } else if (class273.field4684 > 4) {
            class273.field4684 = 4;
        }
        class137.method1011(arg1.method368(-95) == 1, (byte) 108);
        class312.field5315 = arg1.method368(45) == arg0;
        class76.field1230 = arg1.method368(-107) == 1;
        class319.field5448 = arg1.method368(114) == 1;
        class195.field3252 = arg1.method368(-113) == 1;
        class300.field5078 = arg1.method368(arg0 + 83) == 1;
        class160.field2704 = arg1.method368(arg0 ^ 0xFFFFFF85) == 1;
        class281.field4822 = arg1.method368(arg0 + 104) == 1;
        class27.field478 = arg1.method368(-113);
        if (class27.field478 > 2) {
            class27.field478 = 2;
        }
        if (var2 < 2) {
            class102.field1641 = arg1.method368(arg0 ^ 0xFFFFFFA0) == 1;
            arg1.method368(arg0 - 105);
        } else {
            class102.field1641 = arg1.method368(arg0 ^ 0x37) == 1;
        }
        class117.field1888 = arg1.method368(122) == 1;
        class322.field5501 = arg1.method368(53) == 1;
        class264.field4508 = arg1.method368(-95);
        if (class264.field4508 > 2) {
            class264.field4508 = 2;
        }
        class147.field2502 = class264.field4508;
        class119.field1927 = arg1.method368(66) == 1;
        class100.field1621 = arg1.method368(-127);
        if (class100.field1621 > 127) {
            class100.field1621 = 127;
        }
        class27.field479 = arg1.method368(-109);
        class236.field3936 = arg1.method368(arg0 ^ 0x4E);
        if (class236.field3936 > 127) {
            class236.field3936 = 127;
        }
        if (var2 >= 1) {
            class124.field2020 = arg1.method379(-2);
            class275.field4727 = arg1.method379(~arg0);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method368(arg0 + 44);
        }
        if (var2 >= 4) {
            int var4 = arg1.method368(arg0 ^ 0x7A);
            if (class93.field1494 < 96) {
                var4 = 0;
            }
            class284.method2051(var4);
        }
        if (var2 >= 5) {
            class89.field1422 = arg1.method373((byte) 36);
        }
        if (var2 >= 6) {
            class91.field1435 = arg1.method368(-93);
        }
        if (var2 >= 7) {
            class7.field164 = arg1.method368(arg0 - 121) == 1;
        }
        if (var2 >= 8) {
            class215.field3549 = arg1.method368(arg0 ^ 0x1A) == 1;
        }
        if (var2 >= 9) {
            class23.field417 = arg1.method368(110);
        }
        if (var2 >= 10) {
            class123.field2014 = arg1.method368(arg0 ^ 0x34) != 0;
        }
        if (var2 >= 11) {
            class223.field3720 = arg1.method368(-103) != 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwe;II)V", line = 295)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            return;
        }
        if (arg2 == 0) {
            this.field3607 = arg0.method368(-124);
        } else if (arg2 == 1) {
            this.field3601 = arg0.method368(31);
        }
        field3603++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 335)
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[I", line = 356)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 107);
        if (this.field4350.field3333) {
            int var4 = class104.field1676 / this.field3601;
            int var5 = class98.field1598 / this.field3607;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method1895(7, 0, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method1895(7, 0, class104.field1676 * var7 / var4);
            }
            for (int var8 = 0; var8 < class98.field1598; var8++) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class98.field1598 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        field3605++;
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIIII)V", line = 405)
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3599++;
        if (arg2 != 0) {
            method1609(4);
        }
        int var6 = class21.method153(-122, arg4, class123.field2008, class318.field5394);
        int var7 = class21.method153(arg2 - 119, arg1, class123.field2008, class318.field5394);
        int var8 = class21.method153(-123, arg0, class151.field2564, class126.field2058);
        int var9 = class21.method153(-123, arg5, class151.field2564, class126.field2058);
        for (int var10 = var6; var10 <= var7; var10++) {
            class40.method281(arg3, var8, class81.field1297[var10], var9, 7);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Lok;", line = 438)
    public static final class146 method1613(int arg0, int arg1) {
        field3609++;
        if (arg0 < 100000) {
            return class112.method758(-59, new class146[] { class114.field1842, class82.method585(14744, arg0), class156.field2623 });
        } else if (arg0 >= 10000000) {
            if (arg1 != 1000) {
                method1609(47);
            }
            return class112.method758(arg1 - 1091, new class146[] { class301.field5110, class82.method585(14744, arg0 / 1000000), class191.field3158, class156.field2623 });
        } else {
            return class112.method758(121, new class146[] { class194.field3234, class82.method585(14744, arg0 / 1000), class171.field2885, class156.field2623 });
        }
    }
}
