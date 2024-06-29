import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class71 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lr;")
    private static class118 field1649 = class153.method1136(106, "Unable to connect)3");

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lr;")
    public static class118 field1654 = class153.method1136(105, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lr;")
    public static class118 field1650 = class153.method1136(78, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lr;")
    public static class118 field1647 = field1649;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lr;")
    public static class118 field1652 = field1649;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lr;")
    private static class118 field1644 = class153.method1136(83, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lr;")
    private static class118 field1643 = class153.method1136(117, "Sorry invited players only)3");

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lr;")
    public static class118 field1655 = class153.method1136(89, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lr;")
    public static class118 field1642 = field1644;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lr;")
    public static class118 field1657 = field1643;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lr;")
    public static class118 field1663 = class153.method1136(103, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Ljf;")
    public static class68 field1664;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Ljava/awt/Image;")
    public Image field1660;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "[I")
    public int[] field1658;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 != 17648) {
            this.method601(82);
        }
        field1646++;
        class52.method475(this.field1658, this.field1656, this.field1641);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILff;Lff;Z)Lkc;")
    public static final class72 method602(int arg0, int arg1, class42 arg2, class42 arg3, boolean arg4) {
        field1659++;
        boolean var5 = true;
        int[] var6 = arg2.method352(arg0, 120);
        if (arg1 < 80) {
            field1642 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method358(arg0, (byte) 67, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method358(0, (byte) -121, var9);
                } else {
                    var10 = arg3.method358(var9, (byte) 50, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class72(arg2, arg3, arg0, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method603(int arg0) {
        int var1 = 101 / ((arg0 - 29) / 32);
        for (int var2 = 0; var2 < class92.field2216; var2++) {
            int var3 = class157.field3628[var2];
            class83 var4 = class74.field1833[var3];
            int var5 = class53.field1253.method831((byte) 76);
            if ((var5 & 0x2) != 0) {
                var4.field731 = class53.field1253.method819(false);
                if (var4.field731 == 65535) {
                    var4.field731 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field709 = class53.field1253.method810(1347010600);
                var4.field773 = 100;
            }
            if ((var5 & 0x8) != 0) {
                int var6 = class53.field1253.method789((byte) -82);
                int var7 = class53.field1253.method831((byte) 76);
                var4.method252(var6, -22502, class65.field1479, var7);
                var4.field776 = class65.field1479 + 300;
                var4.field743 = class53.field1253.method803(-121);
                var4.field727 = class53.field1253.method803(-125);
            }
            if ((var5 & 0x1) != 0) {
                var4.field735 = class53.field1253.method838((byte) 5);
                int var8 = class53.field1253.method834(119);
                var4.field782 = 0;
                var4.field745 = (var8 & 0xFFFF) + class65.field1479;
                if (var4.field735 == 65535) {
                    var4.field735 = -1;
                }
                var4.field738 = 0;
                if (class65.field1479 < var4.field745) {
                    var4.field782 = -1;
                }
                var4.field770 = var8 >> 16;
            }
            if ((var5 & 0x80) != 0) {
                int var9 = class53.field1253.method789((byte) -127);
                int var10 = class53.field1253.method823(17986);
                var4.method252(var9, -22502, class65.field1479, var10);
                var4.field776 = class65.field1479 + 300;
                var4.field743 = class53.field1253.method803(-108);
                var4.field727 = class53.field1253.method823(17986);
            }
            if ((var5 & 0x4) != 0) {
                var4.field1989 = class32.method273(9, class53.field1253.method797(125));
                var4.field733 = var4.field1989.field2575;
                var4.field716 = var4.field1989.field2568;
                var4.field729 = var4.field1989.field2574;
                var4.field761 = var4.field1989.field2565;
                var4.field767 = var4.field1989.field2553;
                var4.field762 = var4.field1989.field2542;
                var4.field764 = var4.field1989.field2548;
                var4.field714 = var4.field1989.field2572;
                var4.field766 = var4.field1989.field2540;
            }
            if ((var5 & 0x20) != 0) {
                int var11 = class53.field1253.method832(-4206);
                int var12 = class53.field1253.method803(-111);
                if (var11 == 65535) {
                    var11 = -1;
                }
                if (var4.field746 == var11 && var11 != -1) {
                    int var13 = class125.method970((byte) -68, var11).field3466;
                    if (var13 == 1) {
                        var4.field775 = 0;
                        var4.field747 = var12;
                        var4.field719 = 0;
                        var4.field739 = 0;
                    }
                    if (var13 == 2) {
                        var4.field739 = 0;
                    }
                } else if (var11 == -1 || var4.field746 == -1 || class125.method970((byte) -68, var11).field3472 >= class125.method970((byte) -68, var4.field746).field3472) {
                    var4.field747 = var12;
                    var4.field775 = 0;
                    var4.field713 = var4.field726;
                    var4.field746 = var11;
                    var4.field739 = 0;
                    var4.field719 = 0;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field780 = class53.field1253.method797(120);
                var4.field772 = class53.field1253.method838((byte) 5);
            }
        }
        field1653++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public abstract void method526(int arg0, byte arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
    public static final int method604(byte arg0) {
        int var1 = 3;
        if (class85.field2092 < 310) {
            int var2 = class44.field1051 >> 7;
            int var3 = class24.field580 >> 7;
            if ((class33.field830[class106.field2468][var3][var2] & 0x4) != 0) {
                var1 = class106.field2468;
            }
            int var4 = class89.field2150.field760 >> 7;
            int var5 = class89.field2150.field712 >> 7;
            int var6;
            if (var5 > var2) {
                var6 = var5 - var2;
            } else {
                var6 = var2 - var5;
            }
            int var7;
            if (var4 > var3) {
                var7 = var4 - var3;
            } else {
                var7 = var3 - var4;
            }
            if (var6 >= var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var5) {
                    var9 += var8;
                    if (var2 < var5) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    if ((class33.field830[class106.field2468][var3][var2] & 0x4) != 0) {
                        var1 = class106.field2468;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class33.field830[class106.field2468][var3][var2] & 0x4) != 0) {
                            var1 = class106.field2468;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var4) {
                    if (var3 < var4) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class33.field830[class106.field2468][var3][var2] & 0x4) != 0) {
                        var1 = class106.field2468;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        var11 -= 65536;
                        if ((class33.field830[class106.field2468][var3][var2] & 0x4) != 0) {
                            var1 = class106.field2468;
                        }
                    }
                }
            }
        }
        if (arg0 != 88) {
            method602(58, -30, null, null, false);
        }
        if ((class33.field830[class106.field2468][class89.field2150.field760 >> 7][class89.field2150.field712 >> 7] & 0x4) != 0) {
            var1 = class106.field2468;
        }
        field1648++;
        return var1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public abstract void method528(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method605(byte arg0) {
        int var1 = 19 / ((55 - arg0) / 34);
        field1650 = null;
        field1652 = null;
        field1643 = null;
        field1657 = null;
        field1655 = null;
        field1647 = null;
        field1664 = null;
        field1644 = null;
        field1649 = null;
        field1654 = null;
        field1642 = null;
        field1663 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method529(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    protected class71() {
    }
}
