import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class93 extends class466 implements class523 {

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
    private boolean field1392 = false;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lpw;")
    public class101 field1397;

    @OriginalMember(owner = "client!nb", name = "kb", descriptor = "Z")
    private boolean field1402;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "Ltg;")
    public static class605 field1396 = new class605();

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!nb", name = "jb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "Lcs;")
    public static class335 field1395;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "Lkn;")
    private class516 field1386;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "(I)V")
    public static void method775(int arg0) {
        if (arg0 != -26769) {
            method778(62);
        }
        field1395 = null;
        field1396 = null;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        int var2 = -64 / ((arg0 - 21) / 56);
        ++field1388;
        return this.field1397.method833(-27);
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            this.method86(-30);
        }
        ++field1383;
        return this.field1392;
    }

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field1400;
        int var2 = 94 % ((17 - arg0) / 61);
        return this.field1397.method828(true);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLha;)V")
    public final void method96(byte arg0, class544 arg1) {
        if (arg0 != 89) {
            method778(-62);
        }
        this.field1397.method836(arg0 + -212, arg1);
        ++field1385;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        if (arg0 != -12194) {
            this.field1397 = null;
        }
        ++field1382;
        return this.field1397.field1521;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
    public final boolean method88(byte arg0) {
        ++field1379;
        return arg0 < 44 ? false : this.field1397.method827((byte) -74);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        ++field1381;
        class282 var3 = this.field1397.method829(false, true, arg1, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field9477 >> 9;
            int var5 = super.field9475 >> 9;
            class73 var6 = arg0.method343();
            var6.method675(super.field9477, super.field9474, super.field9475);
            this.field1397.method825(var5, arg0, var5, -51, var6, var3, false, var4, var4);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        ++field1394;
        if (arg0 != -17773) {
            this.field1402 = false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field1391;
        int var5 = 48 / ((-80 - arg3) / 44);
        class282 var6 = this.field1397.method829(false, false, -1, arg2, 131072);
        if (var6 == null) {
            return false;
        } else {
            class73 var7 = arg2.method343();
            var7.method675(super.field6791 + super.field9477, super.field9474, super.field6798 + super.field9475);
            return class141.field2211 ? var6.method1023(arg0, arg1, var7, false, 0, class106.field1553) : var6.method1010(arg0, arg1, var7, false, 0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[ILrs;I[I)Lrl;")
    public static final class229 method776(byte arg0, int arg1, int[] arg2, class166 arg3, int arg4, int[] arg5) {
        ++field1399;
        if (arg0 <= 54) {
            method779((byte) -74);
        }
        byte[] var6 = new byte[arg1 * arg4];
        for (int var7 = 0; ~arg1 < ~var7; ++var7) {
            int var8 = arg4 * var7 - -arg2[var7];
            for (int var9 = 0; var9 < arg5[var7]; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class229(arg3, arg4, arg1, var6);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)I")
    public final int method85(byte arg0) {
        if (arg0 != -72) {
            return 102;
        } else {
            ++field1393;
            return this.field1397.field1520;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZIIIII)V")
    public class93(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1397 = new class101(arg0, arg1, arg10, arg11, super.field9470, arg3, this, arg7, arg12);
        this.field1402 = ~arg1.field8426 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        if (arg0 != 0) {
            this.method91((class544) null, true);
        }
        ++field1387;
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        ++field1378;
        if (arg0 != 2836) {
            this.method87(119);
        }
        return this.field1397.field1500;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZILjava/lang/String;I)V")
    public static final void method777(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
        ++field1401;
        class353 var5 = class745.method4165(110, arg2, arg4);
        if (var5 != null) {
            if (var5.field5305 != null) {
                class700 var6 = new class700();
                var6.field9895 = arg0;
                var6.field9900 = arg3;
                var6.field9902 = var5;
                var6.field9891 = var5.field5305;
                class464.method2838(var6);
            }
            if (~class521.field7529 == -11) {
                if (client.method2735(var5).method1864(2362, arg0 + -1)) {
                    if (~arg0 == -2) {
                        ++class130.field2127;
                        class540 var7 = class257.method1732(true, class736.field10370, class655.field9332);
                        class191.method1447(-1700668530, arg4, var7, arg2, var5.field5328);
                        class756.method4211(var7, 115);
                    }
                    if (~arg0 == -3) {
                        ++class516.field7473;
                        class540 var8 = class257.method1732(true, class473.field6861, class655.field9332);
                        class191.method1447(-1700668530, arg4, var8, arg2, var5.field5328);
                        class756.method4211(var8, 123);
                    }
                    if (arg0 == 3) {
                        ++class5.field45;
                        class540 var9 = class257.method1732(true, class174.field2973, class655.field9332);
                        class191.method1447(-1700668530, arg4, var9, arg2, var5.field5328);
                        class756.method4211(var9, 116);
                    }
                    if (arg0 == 4) {
                        ++class583.field8236;
                        class540 var10 = class257.method1732(true, class544.field7772, class655.field9332);
                        class191.method1447(-1700668530, arg4, var10, arg2, var5.field5328);
                        class756.method4211(var10, 117);
                    }
                    if (~arg0 == -6) {
                        ++class204.field3433;
                        class540 var11 = class257.method1732(true, class133.field2140, class655.field9332);
                        class191.method1447(-1700668530, arg4, var11, arg2, var5.field5328);
                        class756.method4211(var11, 121);
                    }
                    if (arg0 == 6) {
                        ++class232.field3727;
                        class540 var12 = class257.method1732(!arg1, class124.field1901, class655.field9332);
                        class191.method1447(-1700668530, arg4, var12, arg2, var5.field5328);
                        class756.method4211(var12, 124);
                    }
                    if (~arg0 == -8) {
                        ++class154.field2392;
                        class540 var13 = class257.method1732(!arg1, class14.field138, class655.field9332);
                        class191.method1447(-1700668530, arg4, var13, arg2, var5.field5328);
                        class756.method4211(var13, 111);
                    }
                    if (~arg0 == -9) {
                        ++class221.field3600;
                        class540 var14 = class257.method1732(true, class497.field7213, class655.field9332);
                        class191.method1447(-1700668530, arg4, var14, arg2, var5.field5328);
                        class756.method4211(var14, 123);
                    }
                    if (arg1) {
                        field1396 = null;
                    }
                    if (arg0 == 9) {
                        ++class505.field7366;
                        class540 var15 = class257.method1732(true, class747.field10444, class655.field9332);
                        class191.method1447(-1700668530, arg4, var15, arg2, var5.field5328);
                        class756.method4211(var15, 113);
                    }
                    if (~arg0 == -11) {
                        ++class590.field8316;
                        class540 var16 = class257.method1732(true, class487.field7038, class655.field9332);
                        class191.method1447(-1700668530, arg4, var16, arg2, var5.field5328);
                        class756.method4211(var16, 110);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "(I)I")
    public static final int method778(int arg0) {
        ++field1384;
        class14 var1 = class364.field5565;
        synchronized (class364.field5565) {
            if (arg0 >= -116) {
                method778(-38);
            }
            return class364.field5565.method70(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        if (arg1 != 1) {
            this.field1392 = true;
        }
        ++field1398;
        return this.field1386;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)[Laia;")
    public static final class257[] method779(byte arg0) {
        ++field1390;
        if (arg0 <= 8) {
            field1396 = null;
        }
        return new class257[] { class478.field6941, class723.field10141, class549.field7833, class222.field3608, class452.field6572, class494.field7163 };
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
    public static final void method780(int arg0, int arg1, int arg2, int arg3) {
        class114 var4 = class488.field7062[arg0][arg1][arg2];
        if (var4 != null) {
            class466 var5 = var4.field1767;
            class466 var6 = var4.field1777;
            if (var5 != null) {
                var5.field6791 = (short) (var5.field6791 * arg3 / (16 << class662.field9425 - 7));
                var5.field6798 = (short) (var5.field6798 * arg3 / (16 << class662.field9425 - 7));
            }
            if (var6 != null) {
                var6.field6791 = (short) (var6.field6791 * arg3 / (16 << class662.field9425 - 7));
                var6.field6798 = (short) (var6.field6798 * arg3 / (16 << class662.field9425 - 7));
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field1380;
        if (arg0 != 0) {
            this.field1392 = true;
        }
        class282 var3 = this.field1397.method829(false, true, -1, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class73 var4 = arg1.method343();
            var4.method675(super.field6791 + super.field9477, super.field9474, super.field6798 + super.field9475);
            class48 var5 = class331.method2130(1, (byte) 92, this.field1402);
            int var6 = super.field9477 >> 9;
            int var7 = super.field9475 >> 9;
            this.field1397.method825(var7, arg1, var7, arg0 + 115, var4, var3, true, var6, var6);
            if (!class141.field2211) {
                var3.method1007(var4, var5.field795[0], 0);
            } else {
                var3.method1026(var4, var5.field795[0], class106.field1553, 0);
            }
            if (this.field1397.field1498 != null) {
                class315 var8 = this.field1397.field1498.method3556();
                if (!class141.field2211) {
                    arg1.method420(var8);
                } else {
                    arg1.method380(var8, class106.field1553);
                }
            }
            this.field1392 = var3.method1048() || this.field1397.field1498 != null;
            if (this.field1386 != null) {
                class736.method4109(var3, arg0 + -8631, super.field9475, this.field1386, super.field9477, super.field9474);
            } else {
                this.field1386 = class100.method819(8, var3, super.field9474, super.field9475, super.field9477);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;Z)V")
    public final void method91(class544 arg0, boolean arg1) {
        this.field1397.method830(0, arg0);
        ++field1389;
        if (!arg1) {
            this.field1392 = false;
        }
    }
}
