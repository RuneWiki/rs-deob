import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class246 extends class328 {

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method4(int arg0, int arg1) {
        ++field3552;
        int var3 = -55 / ((48 - arg1) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            for (int var6 = 0; ~class449.field6539 < ~var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 34)
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZZ)V", line = 38)
    public static final void method1560(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 <= -37) {
            if (arg1) {
                --class81.field1438;
                if (~class81.field1438 == -1) {
                    class12.field126 = null;
                }
            }
            ++field3555;
            if (arg2) {
                --class308.field4448;
                if (class308.field4448 == 0) {
                    class220.field3297 = null;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLae;Lgp;)V", line = 70)
    public static final void method1561(boolean arg0, class40 arg1, class561 arg2) {
        class301.field4349 = arg2;
        class167.field2448 = arg1;
        class79.field1435 = "";
        if (!arg0) {
            method1565((class561) null, -72);
        }
        ++field3554;
        if (!class40.field564.startsWith("win")) {
            if (class40.field564.startsWith("linux")) {
                class79.field1435 = class79.field1435 + "linux/";
            } else if (class40.field564.startsWith("mac")) {
                class79.field1435 = class79.field1435 + "macos/";
            }
        } else {
            class79.field1435 = class79.field1435 + "windows/";
        }
        if (~class40.field554 == -3) {
            class79.field1435 = class79.field1435 + "msjava/";
        } else if (!class40.field561.startsWith("amd64") && !class40.field561.startsWith("x86_64")) {
            if (!class40.field561.startsWith("i386") && !class40.field561.startsWith("i486") && !class40.field561.startsWith("i586") && !class40.field561.startsWith("x86")) {
                if (class40.field561.startsWith("ppc")) {
                    class79.field1435 = class79.field1435 + "ppc/";
                } else {
                    class79.field1435 = class79.field1435 + "universal/";
                }
            } else {
                class79.field1435 = class79.field1435 + "x86/";
            }
        } else {
            class79.field1435 = class79.field1435 + "x86_64/";
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)Ljava/lang/String;", line = 118)
    public static final String method1562(int arg0, int arg1) {
        ++field3550;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 0) {
            return null;
        } else if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class432.field6339.method3220(false, class538.field7500) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, var2.length() + -4) + class98.field1703.method3220(false, class538.field7500) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lum;Lum;B)V", line = 148)
    public static final void method1563(class108 arg0, class108 arg1, byte arg2) {
        if (arg1.field1800 != null) {
            arg1.method911(-52);
        }
        ++field3548;
        arg1.field1802 = arg0;
        arg1.field1800 = arg0.field1800;
        arg1.field1800.field1802 = arg1;
        if (arg2 < 102) {
            method1564((byte) -113);
        }
        arg1.field1802.field1800 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Ljava/lang/String;", line = 166)
    public static final String method1564(byte arg0) {
        ++field3549;
        String var1 = "www";
        if (arg0 >= -73) {
            return null;
        } else {
            if (class47.field657 != class446.field6509) {
                if (class47.field657 == class276.field4033) {
                    var1 = "www-wtqa";
                } else if (class47.field657 == class261.field3800) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtrc";
            }
            String var2 = "";
            if (class459.field6612 != null) {
                var2 = "/p=" + class459.field6612;
            }
            return "http://" + var1 + "." + class640.field9282.field8323 + ".com/l=" + class538.field7500 + "/a=" + class56.field803 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lgp;I)V", line = 197)
    public static final void method1565(class561 arg0, int arg1) {
        ++field3547;
        class566.field8096 = arg0;
        if (arg1 != -4) {
            method1560((byte) -25, false, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILco;)V", line = 208)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (~arg1 == -1) {
            super.field4728 = ~arg2.method1738(255) == -2;
        }
        ++field3551;
        if (arg0 < 75) {
            method1562(57, 57);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I", line = 225)
    public final int[][] method7(int arg0, int arg1) {
        ++field3553;
        int[][] var3 = super.field4725.method1886((byte) -128, arg0);
        if (super.field4725.field4371) {
            int[][] var4 = this.method2040(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class449.field6539; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        int var12 = 23 / ((46 - arg1) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lk;III[Z)V", line = 272)
    public static final void method1566(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class88.field1594 != class73.field1360) {
            int var5 = class587.field8363[arg1].method695(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class542 var7 = class587.field8363[var6];
                    if (var7 != null) {
                        var7.method697(arg0, arg2, var5 - var7.method695(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }
}
