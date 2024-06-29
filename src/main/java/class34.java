import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class13 {

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    private int field706 = 0;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field702 = 2;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field711 = 0;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lec;")
    public static class32 field718 = class73.method594(": ", true);

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "Lec;")
    public static class32 field712 = class73.method594("<col=ffffff> )4 ", true);

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lec;")
    public static class32 field709 = class73.method594("Konfig geladen)3", true);

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lec;")
    public static class32 field715 = class73.method594("(U0a )2 in: ", true);

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lec;")
    private static class32 field728 = class73.method594("Location", true);

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public static int field730 = 0;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lec;")
    private static class32 field729 = class73.method594("OFF", true);

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "Lec;")
    public static class32 field716 = field729;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lec;")
    public static class32 field722 = field728;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lwc;")
    public static class156 field710 = new class156(32);

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lea;")
    public static class30 field719;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "Lf;")
    public static class36 field724;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
    public static int[] field720;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)I")
    public static final int method288(int arg0, int arg1, int arg2, int arg3) {
        field708++;
        if ((class3.field50[arg0][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class3.field50[1][arg3][arg2] & 0x2) == 0) {
            return arg1 < 107 ? 96 : arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
    private final void method289(int arg0, boolean arg1) {
        field713++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var9 > var13) {
            var13 = var9;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var17 = (var7 + var13) / 2.0D;
        this.field705 = (int) (var17 * 256.0D);
        if (this.field705 < 0) {
            this.field705 = 0;
        } else if (this.field705 > 255) {
            this.field705 = 255;
        }
        if (var7 != var13) {
            if (var17 < 0.5D) {
                var11 = (var13 - var7) / (var7 + var13);
            }
            if (var3 == var13) {
                var15 = (var5 - var9) / (-var7 + var13);
            } else if (var5 == var13) {
                var15 = (var9 - var3) / (-var7 + var13) + 2.0D;
            } else if (var9 == var13) {
                var15 = (var3 - var5) / (-var7 + var13) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var11 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        if (var17 > 0.5D) {
            this.field725 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field725 = (int) (var11 * var17 * 512.0D);
        }
        this.field707 = (int) (var11 * 256.0D);
        if (this.field707 < 0) {
            this.field707 = 0;
        } else if (this.field707 > 255) {
            this.field707 = 255;
        }
        if (!arg1) {
            this.field707 = 36;
        }
        double var19 = var15 / 6.0D;
        if (this.field725 < 1) {
            this.field725 = 1;
        }
        this.field723 = (int) ((double) this.field725 * var19);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILf;)V")
    public static final void method290(int arg0, class36 arg1) {
        field717++;
        if (arg0 != 1) {
            field709 = null;
        }
        int var2 = arg1.field846;
        if (var2 == 324) {
            if (class70.field1634 == -1) {
                class61.field1359 = arg1.field845;
                class70.field1634 = arg1.field820;
            }
            if (class61.field1361.field606) {
                arg1.field820 = class70.field1634;
            } else {
                arg1.field820 = class61.field1359;
            }
        } else if (var2 == 325) {
            if (class70.field1634 == -1) {
                class70.field1634 = arg1.field820;
                class61.field1359 = arg1.field845;
            }
            if (class61.field1361.field606) {
                arg1.field820 = class61.field1359;
            } else {
                arg1.field820 = class70.field1634;
            }
        } else if (var2 == 327) {
            arg1.field813 = 150;
            arg1.field875 = (int) (Math.sin((double) class140.field3219 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field771 = 5;
            arg1.field850 = 0;
        } else if (var2 == 328) {
            arg1.field813 = 150;
            arg1.field875 = (int) (Math.sin((double) class140.field3219 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field771 = 5;
            arg1.field850 = 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public static void method291(boolean arg0) {
        field712 = null;
        field719 = null;
        field722 = null;
        field720 = null;
        field729 = null;
        if (!arg0) {
            return;
        }
        field709 = null;
        field718 = null;
        field728 = null;
        field716 = null;
        field724 = null;
        field710 = null;
        field715 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZILjd;)V")
    public final void method292(boolean arg0, int arg1, class66 arg2) {
        if (arg0) {
            field704 = 81;
        }
        while (true) {
            int var4 = arg2.method533(255);
            if (var4 == 0) {
                field726++;
                return;
            }
            this.method295(arg1, 114, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public final void method293(byte arg0) {
        field727++;
        if (arg0 < 115) {
            field716 = null;
        }
        this.method289(this.field706, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZI)I")
    public static final int method294(boolean arg0, boolean arg1, int arg2) {
        field714++;
        if (arg2 != -20683) {
            field711 = 7;
        }
        int var3 = 0;
        if (arg0) {
            var3 += class158.field3629 + class64.field1495;
        }
        if (arg1) {
            var3 += class66.field1580 + class33.field698;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjd;I)V")
    private final void method295(int arg0, int arg1, class66 arg2, int arg3) {
        int var5 = -67 % ((arg1 - 25) / 35);
        field701++;
        if (arg3 == 1) {
            this.field706 = arg2.method518((byte) 85);
        }
    }
}
