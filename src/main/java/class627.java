import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class627 extends class778 implements class362 {

    @OriginalMember(owner = "client!qs", name = "W", descriptor = "Z")
    private boolean field8844 = false;

    @OriginalMember(owner = "client!qs", name = "qb", descriptor = "Lkm;")
    public class371 field8864;

    @OriginalMember(owner = "client!qs", name = "db", descriptor = "Z")
    private boolean field8851;

    @OriginalMember(owner = "client!qs", name = "R", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!qs", name = "S", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!qs", name = "T", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!qs", name = "U", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!qs", name = "V", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!qs", name = "X", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!qs", name = "Y", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!qs", name = "Z", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!qs", name = "ab", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!qs", name = "bb", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!qs", name = "cb", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!qs", name = "eb", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!qs", name = "fb", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!qs", name = "gb", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!qs", name = "hb", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!qs", name = "ib", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!qs", name = "jb", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!qs", name = "kb", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!qs", name = "lb", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!qs", name = "nb", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!qs", name = "ob", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!qs", name = "pb", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!qs", name = "sb", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!qs", name = "mb", descriptor = "J")
    public static long field8860;

    @OriginalMember(owner = "client!qs", name = "rb", descriptor = "Lpw;")
    private class733 field8865;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "(I)Z", line = 3)
    public final boolean method244(int arg0) {
        ++field8861;
        int var2 = -66 % ((arg0 - -19) / 57);
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(ILha;)V", line = 16)
    public final void method645(int arg0, class66 arg1) {
        ++field8843;
        int var3 = 22 % ((-72 - arg0) / 36);
        this.field8864.method2294((byte) 94, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I", line = 27)
    public final int method650(int arg0) {
        ++field8846;
        int var2 = 56 % ((24 - arg0) / 53);
        return this.field8864.field5354;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lha;I)V", line = 39)
    public final void method257(class66 arg0, int arg1) {
        ++field8841;
        if (arg1 <= 60) {
            this.method645(-116, (class66) null);
        }
        class495 var3 = this.field8864.method2292(true, arg0, 262144, true, 15514);
        if (var3 != null) {
            class378 var4 = arg0.method433();
            var4.method1959(super.field7718, super.field7723, super.field7719);
            this.field8864.method2300(super.field10730, 62, super.field10736, super.field10733, arg0, var3, var4, false, super.field10727);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method3590(int arg0, int arg1, int arg2) {
        ++field8859;
        if (arg0 > -52) {
            method3593(-39, (byte) -62, -115);
        }
        return (arg2 & 544) == 544 | (arg2 & 24) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lkia;II[I)V", line = 72)
    public static final void method3591(class645 arg0, int arg1, int arg2, int[] arg3) {
        ++field8854;
        if (arg0.field6393 != null) {
            boolean var4 = true;
            for (int var5 = 0; ~var5 > ~arg0.field6393.length; ++var5) {
                if (arg0.field6393[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && ~arg0.field6404 != 0) {
                class129 var6 = class203.field2975.method1931((byte) -81, arg0.field6404);
                int var7 = var6.field1679;
                if (~var7 == -2) {
                    arg0.field6371 = 0;
                    arg0.field6352 = 1;
                    arg0.field6354 = arg2;
                    arg0.field6350 = 0;
                    arg0.field6409 = 0;
                    if (!arg0.field6430) {
                        class524.method3048((byte) 17, arg0.field6409, arg0, var6);
                    }
                }
                if (~var7 == -3) {
                    arg0.field6371 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg1; ~arg3.length < ~var9; ++var9) {
            if (~arg3[var9] != 0) {
                var8 = false;
            }
            if (arg0.field6393 == null || arg0.field6393[var9] == -1 || ~class203.field2975.method1931((byte) -81, arg3[var9]).field1667 <= ~class203.field2975.method1931((byte) -81, arg0.field6393[var9]).field1667) {
                arg0.field6354 = arg2;
                arg0.field6393 = arg3;
                arg0.field6442 = arg0.field6443;
            }
        }
        if (var8) {
            arg0.field6393 = arg3;
            arg0.field6354 = arg2;
            arg0.field6442 = arg0.field6443;
        }
    }

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "(I)I", line = 160)
    public final int method246(int arg0) {
        ++field8845;
        if (arg0 > -104) {
            this.method642(50);
        }
        return this.field8864.method2303((byte) 26);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lha;B)Lhq;", line = 171)
    public final class167 method258(class66 arg0, byte arg1) {
        ++field8852;
        class495 var3 = this.field8864.method2292(false, arg0, 2048, true, arg1 ^ 15504);
        if (var3 == null) {
            return null;
        } else {
            class378 var4 = arg0.method433();
            var4.method1959(super.field7718, super.field7723, super.field7719);
            if (arg1 != 10) {
                field8860 = -9L;
            }
            class167 var5 = class653.method3739(0, 1, this.field8851);
            this.field8864.method2300(super.field10730, -125, super.field10736, super.field10733, arg0, var3, var4, true, super.field10727);
            if (class475.field6760) {
                var3.method91(var4, var5.field2426[0], class412.field5822, 0);
            } else {
                var3.method108(var4, var5.field2426[0], 0);
            }
            if (this.field8864.field5347 != null) {
                class443 var6 = this.field8864.field5347.method184();
                if (class475.field6760) {
                    arg0.method464(var6, class412.field5822);
                } else {
                    arg0.method437(var6);
                }
            }
            this.field8844 = var3.method88() || this.field8864.field5347 != null;
            if (this.field8865 != null) {
                class299.method1997(var3, super.field7723, 5378, super.field7718, this.field8865, super.field7719);
            } else {
                this.field8865 = class302.method2004(super.field7718, super.field7719, -128, super.field7723, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lha;B)Lpw;", line = 218)
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = -19 % ((-45 - arg1) / 63);
        ++field8840;
        return this.field8865;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lcb;Lcb;Lcb;ILcb;)V", line = 231)
    public static final void method3592(class544 arg0, class544 arg1, class544 arg2, int arg3, class544 arg4) {
        class611.field8623 = arg4;
        class701.field9896 = arg2;
        class303.field4541 = arg0;
        ++field8842;
        class110.field1382 = new class176[class611.field8623.method3136(false)][];
        if (arg3 > -17) {
            method3590(102, 126, 126);
        }
        class323.field4845 = new boolean[class611.field8623.method3136(false)];
    }

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "(I)I", line = 250)
    public final int method239(int arg0) {
        if (arg0 > -9) {
            this.field8851 = false;
        }
        ++field8857;
        return this.field8864.method2304((byte) 14);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)Z", line = 261)
    public final boolean method254(byte arg0) {
        if (arg0 != 104) {
            return true;
        } else {
            ++field8850;
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLha;I)Z", line = 281)
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field8862;
        if (!arg1) {
            this.method650(-66);
        }
        class495 var5 = this.field8864.method2292(false, arg2, 131072, false, 15514);
        if (var5 == null) {
            return false;
        } else {
            class378 var6 = arg2.method433();
            var6.method1959(super.field7718, super.field7723, super.field7719);
            return class475.field6760 ? var5.method84(arg3, arg0, var6, false, 0, class412.field5822) : var5.method83(arg3, arg0, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)V", line = 301)
    public final void method240(int arg0) {
        if (arg0 != -1) {
            this.field8851 = true;
        }
        ++field8848;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Z", line = 312)
    public final boolean method642(int arg0) {
        int var2 = 109 / ((77 - arg0) / 38);
        ++field8856;
        return this.field8864.method2297(93);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)I", line = 324)
    public final int method643(boolean arg0) {
        if (arg0) {
            this.method253(50, true, (class66) null, 7);
        }
        ++field8858;
        return this.field8864.field5339;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lha;Ldja;IIIIIZIIIIIII)V", line = 413)
    public class627(class66 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4796 == -2, class18.method150(-10, arg13, arg12));
        this.field8864 = new class371(arg0, arg1, arg12, arg13, super.field7710, arg3, this, arg7, arg14);
        this.field8851 = arg1.field4761 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 339)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field8866;
        if (arg3 != 0) {
            this.field8844 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 352)
    public final void method647(int arg0) {
        ++field8839;
        if (arg0 != 32653) {
            method3592((class544) null, (class544) null, (class544) null, 51, (class544) null);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILha;)V", line = 362)
    public final void method651(int arg0, class66 arg1) {
        if (arg0 == -8836) {
            this.field8864.method2299(arg1, (byte) -101);
            ++field8849;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IBI)Z", line = 373)
    public static final boolean method3593(int arg0, byte arg1, int arg2) {
        ++field8853;
        if (~arg0 <= -1 && ~arg2 <= -1 && class617.field8700[1].length > arg0 && class617.field8700[1][arg0].length > arg2) {
            if (~(2 & class617.field8700[1][arg0][arg2]) != -1) {
                return true;
            } else {
                int var3 = 106 % ((arg1 - -14) / 63);
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lpi;I)V", line = 391)
    public final void method3594(class521 arg0, int arg1) {
        ++field8847;
        this.field8864.method2298(arg0, 15480);
        if (arg1 != 0) {
            this.method651(-80, (class66) null);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)I", line = 402)
    public final int method646(byte arg0) {
        ++field8863;
        if (arg0 != 45) {
            this.method650(-63);
        }
        return this.field8864.field5323;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z", line = 423)
    public final boolean method248(byte arg0) {
        ++field8855;
        if (arg0 != -55) {
            this.method254((byte) 63);
        }
        return this.field8844;
    }
}
