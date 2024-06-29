import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class216 extends class613 implements class484 {

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "Z")
    private boolean field3347 = false;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lnia;")
    public class671 field3352;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Z")
    private boolean field3348;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Z")
    public static boolean field3351 = false;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Lfba;")
    public static class27 field3337 = new class27(13, 8);

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "[I")
    public static int[] field3356 = new int[1024];

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "Llba;")
    public static class574 field3354 = new class574(8);

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "Lwv;")
    public static class37 field3358 = new class37(6, -1);

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lrn;")
    private class281 field3335;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "Lwia;")
    public static class791 field3355;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "Z")
    public static boolean field3357;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "[Lje;")
    public static class421[] field3344;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lha;I)Lmaa;", line = 3)
    public final class495 method918(class65 arg0, int arg1) {
        ++field3353;
        class496 var3 = this.field3352.method3815(-779, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class326 var4 = arg0.method514();
            var4.method1869(super.field5742, super.field5741, super.field5746);
            class495 var5 = class86.method652(this.field3348, 0, 1);
            int var6 = super.field5742 >> 9;
            if (arg1 != -30514) {
                this.method1482(true);
            }
            int var7 = super.field5746 >> 9;
            this.field3352.method3818(var7, var3, var7, var6, var6, 0, true, var4, arg0);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field3352.field9352 != null) {
                class296 var8 = this.field3352.field9352.method3450();
                if (class576.field8120) {
                    arg0.method541(var8, class740.field10205);
                } else {
                    arg0.method504(var8);
                }
            }
            this.field3347 = var3.method121() || this.field3352.field9352 != null;
            if (this.field3335 == null) {
                this.field3335 = class490.method2922((byte) 120, super.field5742, var3, super.field5746, super.field5741);
            } else {
                class546.method3268(var3, super.field5742, this.field3335, -115, super.field5746, super.field5741);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIII)V", line = 55)
    public class216(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class604.method3502(arg8, arg9, 3));
        this.field3352 = new class671(arg0, arg1, arg8, arg9, super.field5755, arg3, this, arg7, arg10);
        this.field3348 = ~arg1.field4149 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 64)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        ++field3328;
        if (arg2 != 0) {
            this.method1486(false, (class520) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)I", line = 77)
    public final int method1478(byte arg0) {
        if (arg0 < 108) {
            this.method1488((byte) 32);
        }
        ++field3333;
        return this.field3352.field9334;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLha;)V", line = 94)
    public final void method1479(byte arg0, class65 arg1) {
        int var3 = -93 / ((-19 - arg0) / 48);
        ++field3326;
        this.field3352.method3817(arg1, false);
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V", line = 104)
    public final void method903(int arg0) {
        ++field3332;
        if (arg0 == -772) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Z", line = 115)
    public final boolean method910(boolean arg0) {
        ++field3341;
        if (!arg0) {
            this.field3347 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "(I)V", line = 127)
    public static void method1480(int arg0) {
        field3337 = null;
        field3354 = null;
        field3355 = null;
        field3356 = null;
        field3358 = null;
        if (arg0 < 87) {
            field3337 = null;
        }
        field3344 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)Z", line = 142)
    public static final boolean method1481(int arg0, int arg1, byte arg2) {
        ++field3338;
        if (arg2 >= -26) {
            return true;
        } else {
            return (arg0 & 50560) != 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)Z", line = 158)
    public final boolean method909(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field3336;
            return false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)I", line = 169)
    public final int method917(int arg0) {
        ++field3340;
        if (arg0 != -1760267218) {
            this.method917(-108);
        }
        return this.field3352.method3821(1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I", line = 181)
    public final int method1482(boolean arg0) {
        if (!arg0) {
            field3358 = null;
        }
        ++field3327;
        return this.field3352.field9341;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I", line = 196)
    public final int method1483(int arg0) {
        if (arg0 != 24853) {
            this.method906(74);
        }
        ++field3331;
        return this.field3352.field9332;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Z", line = 207)
    public final boolean method906(int arg0) {
        ++field3345;
        int var2 = 41 / ((11 - arg0) / 35);
        return this.field3347;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V", line = 217)
    public final void method1484(int arg0) {
        if (arg0 >= -107) {
            field3356 = null;
        }
        ++field3343;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvn;Z)V", line = 227)
    public static final void method1485(class330 arg0, boolean arg1) {
        ++field3346;
        if (arg0.field4625 != null || arg0.field4605 != null) {
            boolean var2 = arg1;
            for (int var3 = 0; ~arg0.field4625.length < ~var3; ++var3) {
                int var4 = -1;
                if (arg0.field4625 != null) {
                    var4 = arg0.field4625[var3];
                }
                if (~var4 == 0) {
                    if (!arg0.method2093(-1, 3177, var3)) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var10;
                    int var11;
                    if (~(-1073741824 & var4) == 1073741823) {
                        int var7 = var4 & 268435455;
                        int var8 = var7 >> 14;
                        int var9 = var7 & 16383;
                        var10 = -256 - ((-class124.field1922 + var8) * 512 - arg0.field5742);
                        var11 = -((-class88.field999 + var9) * 512) + -256 + arg0.field5746;
                    } else if (~(32768 & var4) != -1) {
                        int var12 = 32767 & var4;
                        class702 var13 = class767.field10560[var12];
                        if (var13 == null) {
                            arg0.method2093(-1, 3177, var3);
                            continue;
                        }
                        var10 = arg0.field5742 - var13.field5742;
                        var11 = arg0.field5746 - var13.field5746;
                    } else {
                        class205 var14 = (class205) class645.field9014.method2242((long) var4, -1);
                        if (var14 == null) {
                            arg0.method2093(-1, 3177, var3);
                            continue;
                        }
                        class665 var15 = var14.field3181;
                        var11 = -var15.field5746 + arg0.field5746;
                        var10 = arg0.field5742 - var15.field5742;
                    }
                    if (~var10 != -1 || var11 != 0) {
                        arg0.method2093((int) (2607.5945876176133D * Math.atan2((double) var10, (double) var11)) & 16383, 3177, var3);
                    }
                }
            }
            if (var2) {
                arg0.field4625 = null;
                arg0.field4605 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lha;I)Lrn;", line = 330)
    public final class281 method901(class65 arg0, int arg1) {
        ++field3329;
        if (arg1 <= 50) {
            this.field3352 = null;
        }
        return this.field3335;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(ILha;)V", line = 341)
    public final void method912(int arg0, class65 arg1) {
        ++field3349;
        if (arg0 >= 52) {
            class496 var3 = this.field3352.method3815(-779, 262144, arg1, true, true);
            if (var3 != null) {
                int var4 = super.field5742 >> 9;
                int var5 = super.field5746 >> 9;
                class326 var6 = arg1.method514();
                var6.method1869(super.field5742, super.field5741, super.field5746);
                this.field3352.method3818(var5, var3, var5, var4, var4, 0, false, var6, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILha;)Z", line = 367)
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg1 != -17458) {
            this.method1484(31);
        }
        ++field3334;
        class496 var5 = this.field3352.method3815(-779, 131072, arg3, false, false);
        if (var5 == null) {
            return false;
        } else {
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return class576.field8120 ? var5.method77(arg0, arg2, var6, false, 0, class740.field10205) : var5.method95(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLmi;)V", line = 389)
    public final void method1486(boolean arg0, class520 arg1) {
        if (!arg0) {
            field3344 = null;
        }
        this.field3352.method3819(arg1, -1);
        ++field3330;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILha;)V", line = 401)
    public final void method1487(int arg0, class65 arg1) {
        int var3 = -55 % ((4 - arg0) / 39);
        this.field3352.method3810(arg1, (byte) -4);
        ++field3342;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Z", line = 411)
    public final boolean method1488(byte arg0) {
        ++field3350;
        int var2 = -62 % ((arg0 - -7) / 60);
        return this.field3352.method3820((byte) 107);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)I", line = 421)
    public final int method916(boolean arg0) {
        ++field3339;
        if (!arg0) {
            this.method901((class65) null, 10);
        }
        return this.field3352.method3811((byte) 110);
    }
}
