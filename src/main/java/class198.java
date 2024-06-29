import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class198 extends class157 {

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    private int field3549 = 0;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    private int field3547 = 4096;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Lcc;")
    public static class209 field3543 = class95.method669(125, "Fertigkeit: ");

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "[I")
    public static int[] field3541 = new int[200];

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "[I")
    public static int[] field3548 = new int[25];

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field3550 = 0;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "Lcc;")
    public static class209 field3553 = class95.method669(104, " (X");

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lcc;")
    private static class209 field3551 = class95.method669(116, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Lcc;")
    public static class209 field3544 = field3551;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "Lcc;")
    public static class209 field3556 = class95.method669(110, "Abbrechen");

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "[Lal;")
    public static class231[] field3557;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIIIII[Lga;I[BII)V")
    public static final void method1353(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class170[] arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        ++field3552;
        int var11 = -1;
        if (arg10 >= 80) {
            class106 var12 = new class106(arg8);
            while (true) {
                int var13 = var12.method775((byte) 108);
                if (~var13 == -1) {
                    return;
                }
                var11 += var13;
                int var14 = 0;
                while (true) {
                    int var15 = var12.method760(255);
                    if (~var15 == -1) {
                        break;
                    }
                    var14 += var15 - 1;
                    int var16 = 63 & var14 >> 6;
                    int var17 = var14 & 63;
                    int var18 = var14 >> 12;
                    int var19 = var12.method774((byte) 112);
                    int var20 = var19 >> 2;
                    int var21 = var19 & 3;
                    if (~arg1 == ~var18 && ~arg3 >= ~var16 && ~var16 > ~(arg3 + 8) && ~arg9 >= ~var17 && ~(arg9 + 8) < ~var17) {
                        class218 var22 = class245.method1711(27093, var11);
                        int var23 = class255.method1758((byte) -21, var22.field3916, var21, arg7, 7 & var17, 7 & var16, var22.field3912) + arg4;
                        int var24 = class141.method984(7 & var17, 78, var16 & 7, var22.field3912, var22.field3916, var21, arg7) + arg2;
                        if (var23 > 0 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                            class170 var25 = null;
                            if (!arg0) {
                                int var26 = arg5;
                                if ((2 & class285.field5023[1][var23][var24]) == 2) {
                                    var26 = arg5 - 1;
                                }
                                if (~var26 <= -1) {
                                    var25 = arg6[var26];
                                }
                            }
                            class138.method962(!arg0, var25, arg5, arg5, arg0, 0, var23, var11, 3 & arg7 + var21, var20, var24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        int[] var3 = super.field2879.method1269(arg1, 17885);
        ++field3540;
        if (arg0 != -98) {
            this.field3547 = -93;
        }
        if (super.field2879.field3363) {
            int[] var4 = this.method1097((byte) 75, 0, arg1);
            for (int var5 = 0; ~var5 > ~class226.field4124; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field3549 >= ~var6 && this.field3547 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
    public static final void method1354(byte arg0) {
        client.field2818.method294(109);
        ++field3555;
        int var1 = client.field2818.method289(8, 8);
        if (~var1 > ~class219.field3996) {
            for (int var2 = var1; class219.field3996 > var2; ++var2) {
                class110.field2229[class74.field1396++] = class249.field4492[var2];
            }
        }
        if (~var1 < ~class219.field3996) {
            throw new RuntimeException("gnpov1");
        } else {
            class219.field3996 = 0;
            if (arg0 >= 2) {
                for (int var3 = 0; ~var3 > ~var1; ++var3) {
                    int var4 = class249.field4492[var3];
                    class163 var5 = class60.field1207[var4];
                    int var6 = client.field2818.method289(8, 1);
                    if (~var6 == -1) {
                        class249.field4492[class219.field3996++] = var4;
                        var5.field1512 = class163.field2968;
                    } else {
                        int var7 = client.field2818.method289(8, 2);
                        if (var7 == 0) {
                            class249.field4492[class219.field3996++] = var4;
                            var5.field1512 = class163.field2968;
                            class211.field3840[class244.field4423++] = var4;
                        } else if (var7 == 1) {
                            class249.field4492[class219.field3996++] = var4;
                            var5.field1512 = class163.field2968;
                            int var8 = client.field2818.method289(8, 3);
                            var5.method570(false, var8, false);
                            int var9 = client.field2818.method289(8, 1);
                            if (~var9 == -2) {
                                class211.field3840[class244.field4423++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class249.field4492[class219.field3996++] = var4;
                            var5.field1512 = class163.field2968;
                            int var10 = client.field2818.method289(8, 3);
                            var5.method570(true, var10, false);
                            int var11 = client.field2818.method289(8, 3);
                            var5.method570(true, var11, false);
                            int var12 = client.field2818.method289(8, 1);
                            if (var12 == 1) {
                                class211.field3840[class244.field4423++] = var4;
                            }
                        } else if (var7 == 3) {
                            class110.field2229[class74.field1396++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public static void method1355(byte arg0) {
        if (arg0 < 98) {
            field3544 = null;
        }
        field3551 = null;
        field3553 = null;
        field3548 = null;
        field3543 = null;
        field3544 = null;
        field3556 = null;
        field3541 = null;
        field3557 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lsj;ILsj;)I")
    public static final int method1356(class49 arg0, int arg1, class49 arg2) {
        int var3 = 0;
        ++field3558;
        if (arg0.method351((byte) 38, class261.field4701)) {
            ++var3;
        }
        if (arg0.method351((byte) -20, class112.field2256)) {
            ++var3;
        }
        if (arg0.method351((byte) -127, class100.field1948)) {
            ++var3;
        }
        int var4 = -59 / ((arg1 - -55) / 47);
        if (arg2.method351((byte) -3, class261.field4701)) {
            ++var3;
        }
        if (arg2.method351((byte) -124, class112.field2256)) {
            ++var3;
        }
        if (arg2.method351((byte) 95, class100.field1948)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 < -29) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    this.field3547 = arg2.method736(127);
                }
            } else {
                this.field3549 = arg2.method736(123);
            }
            ++field3554;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[I)[I")
    public static final int[] method1357(byte arg0, int[] arg1) {
        ++field3545;
        if (arg0 != 61) {
            field3550 = 13;
        }
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class270.method1843(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class198() {
        super(1, true);
    }
}
