import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class466 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    private int field6726 = -1;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
    public boolean field6722 = false;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "B")
    public byte field6733 = 0;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    private int field6738 = 0;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    private int field6741 = 0;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    private int field6743 = 0;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    private int field6735 = 128;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    private int field6744 = 128;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public int field6746 = -1;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6719 = -1;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lhd;")
    public static class523 field6723 = null;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[Ldb;")
    public static class212[] field6728 = new class212[50];

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6717 = 0;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field6742 = 1;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lap;")
    public static class335 field6740 = new class335("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public int field6731;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field6732;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Luf;")
    public class313 field6718;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[S")
    private short[] field6727;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[S")
    private short[] field6729;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "[S")
    private short[] field6730;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "[S")
    private short[] field6739;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfh;II)V")
    private final void method2809(class463 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field6732 = arg0.method2758((byte) 116);
        } else if (arg1 == 2) {
            this.field6746 = arg0.method2758((byte) 106);
        } else if (arg1 == 4) {
            this.field6744 = arg0.method2758((byte) 112);
        } else if (arg1 == 5) {
            this.field6735 = arg0.method2758((byte) 88);
        } else if (arg1 == 6) {
            this.field6743 = arg0.method2758((byte) 122);
        } else if (arg1 == 7) {
            this.field6741 = arg0.method2737(false);
        } else if (arg1 == 8) {
            this.field6738 = arg0.method2737(false);
        } else if (arg1 == 9) {
            this.field6733 = 3;
            this.field6726 = 8224;
        } else if (arg1 == 10) {
            this.field6722 = true;
        } else if (arg1 == 11) {
            this.field6733 = 1;
        } else if (arg1 == 12) {
            this.field6733 = 4;
        } else if (arg1 == 13) {
            this.field6733 = 5;
        } else if (arg1 == 14) {
            this.field6733 = 2;
            this.field6726 = arg0.method2737(false) * 256;
        } else if (arg1 == 15) {
            this.field6733 = 3;
            this.field6726 = arg0.method2758((byte) 120);
        } else if (arg1 == 16) {
            this.field6733 = 3;
            this.field6726 = arg0.method2727(-115);
        } else if (arg1 == 40) {
            int var6 = arg0.method2737(false);
            this.field6739 = new short[var6];
            this.field6729 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6739[var7] = (short) arg0.method2758((byte) 78);
                this.field6729[var7] = (short) arg0.method2758((byte) 87);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method2737(false);
            this.field6727 = new short[var4];
            this.field6730 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6727[var5] = (short) arg0.method2758((byte) 118);
                this.field6730[var5] = (short) arg0.method2758((byte) 87);
            }
        }
        if (arg2 != 0) {
            method2812(-81);
        }
        field6737++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZLya;ILin;I)Lt;")
    public final class474 method2810(int arg0, int arg1, boolean arg2, class38 arg3, int arg4, class60 arg5, int arg6) {
        field6724++;
        if (!arg2) {
            this.field6729 = null;
        }
        return this.method2816(null, arg4, arg5, null, arg3, arg1, 0, (byte) 5, arg6, 0, 0, (byte) 65, arg0, false);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZB)V")
    public static final void method2811(boolean arg0, boolean arg1, byte arg2) {
        if (arg1) {
            class491.field7159--;
            if (class491.field7159 == 0) {
                class441.field6318 = null;
            }
        }
        field6720++;
        if (arg2 != -49 || !arg0) {
            return;
        }
        class55.field717--;
        if (class55.field717 == 0) {
            class527.field7777 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method2812(int arg0) {
        int var1 = -26 % ((-arg0 - 47) / 55);
        field6740 = null;
        field6723 = null;
        field6728 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lfh;B)V")
    public final void method2813(class463 arg0, byte arg1) {
        if (arg1 != 81) {
            return;
        }
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                field6721++;
                return;
            }
            this.method2809(arg0, var3, arg1 ^ 0x51);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static final void method2814(byte arg0) {
        field6736++;
        if (arg0 <= 76) {
            field6717 = 29;
        }
        for (class79 var1 = (class79) class418.field5939.method153(0); var1 != null; var1 = (class79) class418.field5939.method161(-20)) {
            class97 var2 = var1.field1023;
            if (var2.field1184) {
                var1.method2165(16225);
                var2.method732((byte) -99);
            } else if (var2.field1162 <= class163.field2065) {
                var2.method734(class250.field3207, (byte) -91);
                if (var2.field1184) {
                    var1.method2165(16225);
                } else {
                    class361.method2076(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lin;IBIILya;I)Lt;")
    public final class474 method2815(class60 arg0, int arg1, byte arg2, int arg3, int arg4, class38 arg5, int arg6) {
        if (arg2 == -127) {
            field6734++;
            return this.method2816(null, arg6, arg0, null, arg5, arg4, 0, (byte) 2, arg1, 0, 0, (byte) 107, arg3, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lta;ILin;Lta;Lya;IIBIIIBIZ)Lt;")
    private final class474 method2816(class143 arg0, int arg1, class60 arg2, class143 arg3, class38 arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, boolean arg13) {
        if (arg11 <= 19) {
            return null;
        }
        field6725++;
        int var15 = arg12;
        class415 var16 = this.field6746 == -1 || arg1 == -1 ? null : arg2.method557(this.field6746, 15);
        boolean var17 = arg13 & this.field6733 != 0;
        if (var16 != null) {
            var15 = arg12 | var16.method2455(false, 128, arg1, arg5);
        }
        if (var17) {
            var15 |= this.field6733 == 3 ? 7 : 2;
        }
        if (this.field6735 != 128) {
            var15 |= 0x2;
        }
        if (this.field6744 != 128 || this.field6743 != 0) {
            var15 |= 0x5;
        }
        class449 var18 = this.field6718.field4004;
        class474 var19;
        synchronized (this.field6718.field4004) {
            var19 = (class474) this.field6718.field4004.method2647(-98, (long) (this.field6731 |= arg4.field497 << 29));
        }
        if (var19 == null || arg4.method307(var19.method422(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method370(var15, var19.method422());
            }
            int var20 = var15;
            if (this.field6739 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field6727 != null) {
                var20 |= 0x8000;
            }
            class173 var21 = class457.method2711(false, this.field6732, 0, this.field6718.field4002);
            if (var21 == null) {
                return null;
            }
            if (var21.field2200 < 13) {
                var21.method1111(0, -15);
            }
            var19 = arg4.method361(var21, var20, this.field6718.field4005, this.field6741 + 64, this.field6738 + 850);
            if (this.field6739 != null) {
                for (int var22 = 0; var22 < this.field6739.length; var22++) {
                    var19.method425(this.field6739[var22], this.field6729[var22]);
                }
            }
            if (this.field6727 != null) {
                for (int var23 = 0; var23 < this.field6727.length; var23++) {
                    var19.method423(this.field6727[var23], this.field6730[var23]);
                }
            }
            var19.method442(var15);
            class449 var24 = this.field6718.field4004;
            synchronized (this.field6718.field4004) {
                this.field6718.field4004.method2635((long) (this.field6731 |= arg4.field497 << 29), -26591, var19);
            }
        }
        class474 var25 = var16 == null ? var19.method416(arg7, var15, true) : var16.method2457((byte) -3, 0, var15, arg7, arg5, arg1, arg8, var19);
        if (this.field6744 != 128 || this.field6735 != 128) {
            var25.method440(this.field6744, this.field6735, this.field6744);
        }
        if (this.field6743 != 0) {
            if (this.field6743 == 90) {
                var25.method421(4096);
            }
            if (this.field6743 == 180) {
                var25.method421(8192);
            }
            if (this.field6743 == 270) {
                var25.method421(12288);
            }
        }
        if (var17) {
            var25.method404(this.field6733, this.field6726, arg0, arg3, arg10, arg9, arg6);
        }
        var25.method442(arg12);
        return var25;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lya;ILta;Lin;ILta;ZIIBIII)Lt;")
    public final class474 method2817(class38 arg0, int arg1, class143 arg2, class60 arg3, int arg4, class143 arg5, boolean arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        field6716++;
        if (arg9 != 8) {
            field6723 = null;
        }
        return this.method2816(arg2, arg7, arg3, arg5, arg0, arg8, arg12, (byte) 2, arg10, arg11, arg1, (byte) 78, arg4, arg6);
    }
}
