import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class647 extends class3 {

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "Lfha;")
    public class522 field9169 = new class522();

    @OriginalMember(owner = "client!fia", name = "B", descriptor = "Lsga;")
    public class650 field9179 = new class650();

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "Lqc;")
    private class379 field9168;

    @OriginalMember(owner = "client!fia", name = "u", descriptor = "[C")
    public static char[] field9172 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fia", name = "t", descriptor = "Z")
    public static boolean field9171 = false;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!fia", name = "v", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!fia", name = "w", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!fia", name = "x", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!fia", name = "A", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!fia", name = "C", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!fia", name = "D", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!fia", name = "E", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!fia", name = "y", descriptor = "[[[B")
    public static byte[][][] field9176;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "()Lua;", line = 3)
    public final class3 method8() {
        field9178++;
        class261 var1 = (class261) this.field9169.method3118((byte) 73);
        if (var1 == null) {
            return null;
        } else if (var1.field3549 == null) {
            return this.method4();
        } else {
            return var1.field3549;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "()I", line = 20)
    public final int method5() {
        field9170++;
        return 0;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "([III)V", line = 28)
    public final void method10(int[] arg0, int arg1, int arg2) {
        field9181++;
        this.field9179.method10(arg0, arg1, arg2);
        for (class261 var4 = (class261) this.field9169.method3118((byte) 73); var4 != null; var4 = (class261) this.field9169.method3111(115)) {
            if (!this.field9168.method2324(-27613, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3543 >= var6) {
                        this.method3749(var5, var5 + var6, var6, arg0, 0, var4);
                        var4.field3543 -= var6;
                        break;
                    }
                    this.method3749(var5, var5 + var6, var4.field3543, arg0, 0, var4);
                    var6 -= var4.field3543;
                    var5 += var4.field3543;
                } while (!this.field9168.method2322(var5, 16878, arg0, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(III[IILve;)V", line = 68)
    private final void method3749(int arg0, int arg1, int arg2, int[] arg3, int arg4, class261 arg5) {
        if ((this.field9168.field5288[arg5.field3547] & 0x4) != arg4 && arg5.field3540 < 0) {
            int var7 = this.field9168.field5342[arg5.field3547] / class757.field10509;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3544) / var7;
                if (arg2 < var8) {
                    arg5.field3544 += arg2 * var7;
                    break;
                }
                arg5.field3549.method10(arg3, arg0, var8);
                arg2 -= var8;
                arg0 += var8;
                arg5.field3544 += var7 * var8 - 1048576;
                int var9 = class757.field10509 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class194 var11 = arg5.field3549;
                if (this.field9168.field5274[arg5.field3547] == 0) {
                    arg5.field3549 = class194.method1294(arg5.field3551, var11.method1306(), var11.method1288(), var11.method1300());
                } else {
                    arg5.field3549 = class194.method1294(arg5.field3551, var11.method1306(), 0, var11.method1300());
                    this.field9168.method2300((byte) 117, arg5, arg5.field3548.field2771[arg5.field3542] < 0);
                    arg5.field3549.method1309(var9, var11.method1288());
                }
                if (arg5.field3548.field2771[arg5.field3542] < 0) {
                    arg5.field3549.method1301(-1);
                }
                var11.method1316(var9);
                var11.method10(arg3, arg0, arg1 - arg0);
                if (var11.method1289()) {
                    this.field9179.method3760(var11);
                }
            }
        }
        field9182++;
        arg5.field3549.method10(arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(III)Z", line = 129)
    public static final boolean method3750(int arg0, int arg1, int arg2) {
        if (arg1 != -32446) {
            field9176 = null;
        }
        field9174++;
        return class682.method3899(arg2, false, arg0) || class691.method3933(arg2, (byte) -39, arg0);
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)V", line = 142)
    public static void method3751(int arg0) {
        field9176 = null;
        field9172 = null;
        int var1 = -105 / ((11 - arg0) / 51);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IILve;)V", line = 155)
    private final void method3752(int arg0, int arg1, class261 arg2) {
        if ((this.field9168.field5288[arg2.field3547] & 0x4) != 0 && arg2.field3540 < 0) {
            int var4 = this.field9168.field5342[arg2.field3547] / class757.field10509;
            int var5 = (var4 + 1048575 - arg2.field3544) / var4;
            arg2.field3544 = arg2.field3544 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field9168.field5274[arg2.field3547] == 0) {
                    arg2.field3549 = class194.method1294(arg2.field3551, arg2.field3549.method1306(), arg2.field3549.method1288(), arg2.field3549.method1300());
                } else {
                    arg2.field3549 = class194.method1294(arg2.field3551, arg2.field3549.method1306(), 0, arg2.field3549.method1300());
                    this.field9168.method2300((byte) 117, arg2, arg2.field3548.field2771[arg2.field3542] < 0);
                }
                if (arg2.field3548.field2771[arg2.field3542] < 0) {
                    arg2.field3549.method1301(-1);
                }
                arg1 = arg2.field3544 / var4;
            }
        }
        field9173++;
        arg2.field3549.method6(arg1);
        if (arg0 >= -32) {
            this.method8();
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lqc;)V", line = 284)
    public class647(class379 arg0) {
        this.field9168 = arg0;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 208)
    public final void method6(int arg0) {
        this.field9179.method6(arg0);
        field9177++;
        for (class261 var2 = (class261) this.field9169.method3118((byte) 73); var2 != null; var2 = (class261) this.field9169.method3111(115)) {
            if (!this.field9168.method2324(-27613, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3543) {
                        this.method3752(-90, var3, var2);
                        var2.field3543 -= var3;
                        break;
                    }
                    this.method3752(-103, var2.field3543, var2);
                    var3 -= var2.field3543;
                } while (!this.field9168.method2322(0, 16878, null, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "()Lua;", line = 244)
    public final class3 method4() {
        field9180++;
        class261 var1;
        do {
            var1 = (class261) this.field9169.method3111(116);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3549 == null);
        return var1.field3549;
    }

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z", line = 268)
    public static final boolean method3753(int arg0) {
        field9175++;
        if (class252.field3474 == null) {
            return false;
        } else {
            if (class252.field3474.field60 >= 2000) {
                class252.field3474.field60 -= 2000;
            }
            return (short) arg0 == class252.field3474.field60;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V", line = 292)
    public static final void method3754(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field9166++;
        if (class213.field3004 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class617.field8784 == null) {
                class225.method1461(true, class392.field5460, class33.field488, class552.field7816);
            } else {
                class45.method308(class33.field488, 1);
            }
        }
        if (arg0 != 13 && class329.field4216 != null) {
            class329.field4216.method2461(false);
            class329.field4216 = null;
        }
        if (arg0 == 3) {
            class404.method2452(arg1, class704.field9788 != class312.field4004);
        }
        if (arg0 == 7) {
            class692.method3936((byte) -70, class711.field9918 != class312.field4004);
        }
        if (arg0 == 5) {
            if (class617.field8784 == null) {
                class229.method1478(class392.field5460, -1, class552.field7816);
            } else {
                class289.method1709(0);
            }
        } else if (arg0 == 6) {
            if (class617.field8784 == null) {
                class225.method1461(true, class392.field5460, class33.field488, class552.field7816);
            } else {
                class45.method308(class33.field488, 1);
            }
        } else if (arg0 == 9) {
            if (class617.field8784 == null) {
                class225.method1461(true, class392.field5460, class33.field488, class552.field7816);
            } else {
                class45.method308(class33.field488, 1);
            }
        } else if (arg0 == 12) {
            if (class617.field8784 == null) {
                class229.method1478(class392.field5460, -1, class552.field7816);
            } else {
                class289.method1709(0);
            }
        }
        if (class603.method3540(class213.field3004, -5)) {
            class437.field5994.field7898 = 2;
            class574.field8111.field7898 = 2;
            class331.field4253.field7898 = 2;
            class506.field7072.field7898 = 2;
            class743.field10355.field7898 = 2;
            class216.field3065.field7898 = 2;
            class579.field8272.field7898 = 2;
        }
        if (class603.method3540(arg0, -5)) {
            class575.field8122 = 1;
            class369.field4722 = 0;
            class711.field9925 = 0;
            class133.field1795 = 0;
            class24.field270 = 1;
            class4.method12(true, true);
            class437.field5994.field7898 = 1;
            class574.field8111.field7898 = 1;
            class331.field4253.field7898 = 1;
            class506.field7072.field7898 = 1;
            class743.field10355.field7898 = 1;
            class216.field3065.field7898 = 1;
            class579.field8272.field7898 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class615.method3613(1);
        }
        boolean var2 = arg0 == 2 || class66.method432((byte) 120, arg0) || class275.method1670(-97, arg0);
        boolean var3 = class213.field3004 == 2 || class66.method432((byte) 113, class213.field3004) || class275.method1670(-97, class213.field3004);
        if (var2 != var3) {
            if (var2) {
                class555.field7841 = class658.field9295;
                if (class674.field9500.field5112.method3216(0) == 0) {
                    class205.method1371(2, (byte) -116);
                } else {
                    class570.method3411(2, class674.field9500.field5112.method3216(0), class658.field9295, false, 1, class76.field1047, 0);
                    class637.method3701(-4198);
                }
                class480.field6528.method1743(false, (byte) -80);
            } else {
                class205.method1371(2, (byte) -122);
                class480.field6528.method1743(true, (byte) -76);
            }
        }
        if (class603.method3540(arg0, -5) || arg0 == 13) {
            class96.field1401.method556();
        }
        class213.field3004 = arg0;
    }
}
