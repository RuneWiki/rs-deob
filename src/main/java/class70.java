import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static volatile int field1775 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1776 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lmc;")
    private static class75 field1779 = class30.method234(true, "Trade)4compete");

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lmc;")
    public static class75 field1782 = class30.method234(true, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lmc;")
    private static class75 field1780 = class30.method234(true, "Please try again)3");

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lmc;")
    public static class75 field1793 = class30.method234(true, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lmc;")
    public static class75 field1794 = class30.method234(true, "Weiter");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lmc;")
    public static class75 field1790 = field1780;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "Lmc;")
    public static class75 field1798 = class30.method234(true, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lmc;")
    public static class75 field1792 = field1779;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Laa;")
    public static class2 field1789;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lpa;")
    public static class91 field1795;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lpb;")
    public static class92 field1781;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lpb;")
    public static class92 field1784;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
    public static int[] field1797;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lka;IIIIIII)V", line = 37)
    public static final void method592(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -62 % ((47 - arg1) / 63);
        field1788++;
        if (arg2 < 0 || arg2 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg0.method494(20471);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method494(20471);
                    return;
                }
                if (var11 <= 49) {
                    arg0.method494(20471);
                }
            }
        }
        class74.field1836[arg7][arg2][arg5] = 0;
        while (true) {
            int var9 = arg0.method494(20471);
            if (var9 == 0) {
                if (arg7 == 0) {
                    class15.field280[0][arg2][arg5] = -client.method128(arg5 + arg3 + 556238, arg4 + 932731 + arg2, (byte) 47) * 8;
                    return;
                } else {
                    class15.field280[arg7][arg2][arg5] = class15.field280[arg7 - 1][arg2][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method494(20471);
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    class15.field280[0][arg2][arg5] = -var10 * 8;
                    return;
                }
                class15.field280[arg7][arg2][arg5] = class15.field280[arg7 - 1][arg2][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class27.field546[arg7][arg2][arg5] = arg0.method517(128);
                class35.field827[arg7][arg2][arg5] = (byte) ((var9 - 2) / 4);
                class8.field123[arg7][arg2][arg5] = (byte) class56.method456(var9 + arg6 - 2, 3);
            } else if (var9 <= 81) {
                class74.field1836[arg7][arg2][arg5] = (byte) (var9 - 49);
            } else {
                class85.field2100[arg7][arg2][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 128)
    public static final void method593(byte arg0) {
        field1774++;
        try {
            if (arg0 >= -88) {
                field1798 = null;
            }
            Graphics var1 = class108.field2738.getGraphics();
            class57.field1446.method403(553, (byte) 113, var1, 205);
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 150)
    public static void method594(int arg0) {
        field1790 = null;
        field1784 = null;
        field1797 = null;
        field1782 = null;
        field1795 = null;
        field1798 = null;
        field1781 = null;
        field1793 = null;
        field1794 = null;
        field1779 = null;
        field1789 = null;
        field1780 = null;
        field1792 = null;
        int var1 = -4 % ((arg0 + 69) / 36);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZI)I", line = 177)
    public static final int method595(boolean arg0, boolean arg1, int arg2) {
        int var3 = arg2;
        field1777++;
        if (arg0) {
            var3 = class13.field256 + class44.field1047 + arg2;
        }
        if (arg1) {
            var3 += class79.field1994 + class16.field322;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)I", line = 194)
    public static final int method596(byte arg0, int arg1, int arg2) {
        field1796++;
        int var3 = -30 % ((2 - arg0) / 54);
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var5 = (arg1 & 0x7F) * arg2 / 128;
            if (var5 < 2) {
                var5 = 2;
            } else if (var5 > 126) {
                var5 = 126;
            }
            return (arg1 & 0xFF80) + var5;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILja;)Laa;", line = 254)
    public static final class2 method597(int arg0, int arg1, int arg2, class55 arg3) {
        field1783++;
        if (arg1 != -1) {
            field1784 = null;
        }
        return class82.method693(2151, arg0, arg3, arg2) ? class110.method898(-44) : null;
    }
}
