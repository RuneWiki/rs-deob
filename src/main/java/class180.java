import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class180 extends class139 {

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    private int field3608 = 2048;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    private int field3620 = 1024;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    private int field3624 = 3072;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lrf;")
    public static class163 field3617 = class53.method392(-72, "<img=0>");

    @OriginalMember(owner = "client!te", name = "W", descriptor = "Lrf;")
    public static class163 field3606 = class53.method392(77, "<br>(X");

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "Lrf;")
    private static class163 field3616 = class53.method392(52, "Loading config )2 ");

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lrf;")
    public static class163 field3604 = class53.method392(82, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lrf;")
    private static class163 field3609 = class53.method392(117, "OFF");

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "Lrf;")
    private static class163 field3614 = class53.method392(-73, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Lrf;")
    private static class163 field3612 = class53.method392(-126, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "Lrf;")
    public static class163 field3618 = class53.method392(-86, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "Lrf;")
    public static class163 field3623 = field3609;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "Lrf;")
    public static class163 field3610 = field3614;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "Lrf;")
    public static class163 field3621 = field3616;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Lrf;")
    public static class163 field3615 = field3612;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "[I")
    public static int[] field3607;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.field3608 = -this.field3620 + this.field3624;
        ++field3619;
        if (arg0 != 0) {
            method1216((class163[]) null, false);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lei;III)V")
    public static final void method1213(class50 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class80.field1620) {
            class111 var4 = class97.field2054[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2357 != null && var4.field2357.field184 instanceof class50) {
                class50 var5 = (class50) var4.field2357.field184;
                class50.method315(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class80.field1620) {
            class111 var6 = class97.field2054[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field2357 != null && var6.field2357.field184 instanceof class50) {
                class50 var7 = (class50) var6.field2357.field184;
                class50.method315(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class80.field1620 && arg3 < class92.field2007) {
            class111 var8 = class97.field2054[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field2357 != null && var8.field2357.field184 instanceof class50) {
                class50 var9 = (class50) var8.field2357.field184;
                class50.method315(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 < class80.field1620 && arg3 > 0) {
            class111 var10 = class97.field2054[arg1][arg2 + 1][arg3 - 1];
            if (var10 != null && var10.field2357 != null && var10.field2357.field184 instanceof class50) {
                class50 var11 = (class50) var10.field2357.field184;
                class50.method315(arg0, var11, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lde;B)V")
    public static final void method1214(class36 arg0, byte arg1) {
        ++field3625;
        if (arg1 == 84) {
            arg0.field683 = false;
            if (~arg0.field705 != 0) {
                class162 var2 = class97.method668(arg0.field705, (byte) 44);
                if (var2 != null && var2.field3263 != null) {
                    ++arg0.field690;
                    if (~arg0.field693 > ~var2.field3263.length && ~var2.field3292[arg0.field693] > ~arg0.field690) {
                        arg0.field690 = 1;
                        ++arg0.field693;
                        class73.method520(arg0.field679, -25, arg0.field693, class56.field1136 == arg0, arg0.field716, var2);
                    }
                    if (~arg0.field693 <= ~var2.field3263.length) {
                        arg0.field693 = 0;
                        arg0.field690 = 0;
                        class73.method520(arg0.field679, -107, arg0.field693, class56.field1136 == arg0, arg0.field716, var2);
                    }
                } else {
                    arg0.field705 = -1;
                }
            }
            if (~arg0.field741 != 0 && class51.field1023 >= arg0.field723) {
                if (~arg0.field703 > -1) {
                    arg0.field703 = 0;
                }
                int var3 = class93.method650(15575, arg0.field741).field4052;
                if (var3 == -1) {
                    arg0.field741 = -1;
                } else {
                    class162 var4 = class97.method668(var3, (byte) 44);
                    if (var4 != null && var4.field3263 != null) {
                        ++arg0.field720;
                        if (var4.field3263.length > arg0.field703 && arg0.field720 > var4.field3292[arg0.field703]) {
                            ++arg0.field703;
                            arg0.field720 = 1;
                            class73.method520(arg0.field679, 80, arg0.field703, class56.field1136 == arg0, arg0.field716, var4);
                        }
                        if (var4.field3263.length <= arg0.field703) {
                            arg0.field741 = -1;
                        }
                    } else {
                        arg0.field741 = -1;
                    }
                }
            }
            if (arg0.field730 != -1 && ~arg0.field715 >= -2) {
                class162 var5 = class97.method668(arg0.field730, (byte) 44);
                if (~var5.field3295 == -2 && ~arg0.field724 < -1 && class51.field1023 >= arg0.field673 && ~arg0.field738 > ~class51.field1023) {
                    arg0.field715 = 1;
                    return;
                }
            }
            if (~arg0.field730 != 0 && arg0.field715 == 0) {
                class162 var6 = class97.method668(arg0.field730, (byte) 44);
                if (var6 != null && var6.field3263 != null) {
                    ++arg0.field694;
                    if (~var6.field3263.length < ~arg0.field676 && ~var6.field3292[arg0.field676] > ~arg0.field694) {
                        ++arg0.field676;
                        arg0.field694 = 1;
                        class73.method520(arg0.field679, 114, arg0.field676, class56.field1136 == arg0, arg0.field716, var6);
                    }
                    if (arg0.field676 >= var6.field3263.length) {
                        ++arg0.field733;
                        arg0.field676 -= var6.field3287;
                        if (arg0.field733 >= var6.field3279) {
                            arg0.field730 = -1;
                        } else if (arg0.field676 >= 0 && arg0.field676 < var6.field3263.length) {
                            class73.method520(arg0.field679, 121, arg0.field676, class56.field1136 == arg0, arg0.field716, var6);
                        } else {
                            arg0.field730 = -1;
                        }
                    }
                    arg0.field683 = var6.field3284;
                } else {
                    arg0.field730 = -1;
                }
            }
            if (arg0.field715 > 0) {
                --arg0.field715;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg0 < 53) {
            this.field3624 = 71;
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -119, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class23.field402 > var11; ++var11) {
                var8[var11] = this.field3620 - -(var5[var11] * this.field3608 >> 12);
                var9[var11] = this.field3620 - -(var6[var11] * this.field3608 >> 12);
                var10[var11] = this.field3620 - -(var7[var11] * this.field3608 >> 12);
            }
        }
        ++field3613;
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            this.field3620 = -83;
        }
        ++field3626;
        int[] var3 = super.field2859.method1319(-123, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            for (int var5 = 0; ~class23.field402 < ~var5; ++var5) {
                var3[var5] = this.field3620 - -(var4[var5] * this.field3608 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field3622;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2872 = ~arg2.method344(255) == -2;
                }
            } else {
                this.field3624 = arg2.method390((byte) 122);
            }
        } else {
            this.field3620 = arg2.method390((byte) 110);
        }
        if (arg1 != 21) {
            this.method77(-84, -28);
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method1215(int arg0) {
        field3621 = null;
        field3614 = null;
        field3623 = null;
        field3618 = null;
        field3616 = null;
        if (arg0 != 20310) {
            field3621 = null;
        }
        field3617 = null;
        field3607 = null;
        field3610 = null;
        field3615 = null;
        field3612 = null;
        field3604 = null;
        field3609 = null;
        field3606 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Lrf;Z)Lrf;")
    public static final class163 method1216(class163[] arg0, boolean arg1) {
        if (arg1) {
            method1215(-38);
        }
        ++field3605;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class57.method413(arg0, arg0.length, 0, 105);
        }
    }
}
