import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    private int field1753 = 32;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
    private long field1766 = class14.method95(-33);

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    private int field1769 = 0;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "J")
    private long field1771 = 0L;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
    private boolean field1777 = true;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "J")
    private long field1773 = 0L;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "[Lwc;")
    private class150[] field1770 = new class150[8];

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    private int field1780 = 0;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "[Lwc;")
    private class150[] field1781 = new class150[8];

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field1785 = 0;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field1784 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1756 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lu;")
    public static class135 field1746 = class87.method676((byte) -117, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1752 = 2;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lu;")
    public static class135 field1763 = class87.method676((byte) -70, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lu;")
    public static class135 field1776 = class87.method676((byte) -128, "(Y");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lwc;")
    private class150 field1758;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
    public int[] field1748;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public final synchronized void method598(byte arg0) {
        this.field1777 = true;
        if (arg0 >= -88) {
            return;
        }
        try {
            this.method276();
        } catch (Exception var2) {
            this.method275();
            this.field1773 = class14.method95(96) + 2000L;
        }
        field1754++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    private final void method599(int arg0, int arg1) {
        field1783++;
        this.field1784 -= arg1;
        if (this.field1784 < 0) {
            this.field1784 = 0;
        }
        if (this.field1758 != null) {
            this.field1758.method748(arg1);
        }
        if (arg0 > -75) {
            method609(null, null, -35);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        field1762++;
        if (arg0 != -9064) {
            this.field1773 = -8L;
        }
        this.field1777 = true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method601(boolean arg0) {
        field1776 = null;
        field1763 = null;
        field1746 = null;
        if (arg0) {
            field1761 = -118;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public void method277() throws Exception {
        field1764++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public void method279(int arg0) throws Exception {
        field1751++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public final synchronized void method602(byte arg0) {
        field1765++;
        if (class22.field543 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class22.field543.field1128[var3] == this) {
                    class22.field543.field1128[var3] = null;
                }
                if (class22.field543.field1128[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class22.field543.field1137 = true;
                while (class22.field543.field1145) {
                    class96.method795(50L, 110);
                }
                class22.field543 = null;
            }
        }
        if (arg0 != 119) {
            method601(true);
        }
        this.method275();
        this.field1748 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public final synchronized void method603(boolean arg0) {
        field1775++;
        if (this.field1748 == null) {
            return;
        }
        long var2 = class14.method95(-40);
        try {
            if (this.field1773 != 0L) {
                if (this.field1773 > var2) {
                    return;
                }
                this.method279(this.field1774);
                this.field1777 = true;
                this.field1773 = 0L;
            }
            if (arg0) {
                this.method275();
            }
            int var4 = this.method280();
            if (this.field1785 - var4 > this.field1780) {
                this.field1780 = this.field1785 - var4;
            }
            int var5 = this.field1782 + this.field1778;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1774) {
                this.field1774 += 1024;
                if (this.field1774 > 16384) {
                    this.field1774 = 16384;
                }
                this.method275();
                var4 = 0;
                this.method279(this.field1774);
                if (this.field1774 < var5 + 256) {
                    var5 = this.field1774 - 256;
                    this.field1782 = var5 - this.field1778;
                }
                this.field1777 = true;
            }
            while (var5 > var4) {
                this.method606(this.field1748, 256);
                this.method277();
                var4 += 256;
            }
            if (this.field1771 < var2) {
                if (this.field1777) {
                    this.field1777 = false;
                } else if (this.field1780 == 0 && this.field1769 == 0) {
                    this.method275();
                    this.field1773 = var2 + 2000L;
                    return;
                } else {
                    this.field1782 = Math.min(this.field1769, this.field1780);
                    this.field1769 = this.field1780;
                }
                this.field1780 = 0;
                this.field1771 = var2 + 2000L;
            }
            this.field1785 = var4;
        } catch (Exception var7) {
            this.method275();
            this.field1773 = var2 + 2000L;
        }
        try {
            if (var2 > this.field1766 + 500000L) {
                var2 = this.field1766;
            }
            while (var2 > this.field1766 + 5000L) {
                this.method599(-78, 256);
                this.field1766 += 256000 / class138.field3361;
            }
        } catch (Exception var6) {
            this.field1766 = var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILwc;)V")
    public final synchronized void method604(int arg0, class150 arg1) {
        if (arg0 != 0) {
            field1756 = 19;
        }
        this.field1758 = arg1;
        field1760++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
    public int method280() throws Exception {
        field1768++;
        return this.field1774;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
    public void method275() {
        field1747++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILwc;B)V")
    private final void method605(int arg0, class150 arg1, byte arg2) {
        field1757++;
        int var4 = arg0 >> 5;
        class150 var5 = this.field1781[var4];
        if (var5 == null) {
            this.field1770[var4] = arg1;
        } else {
            var5.field3714 = arg1;
        }
        this.field1781[var4] = arg1;
        arg1.field3713 = arg0;
        int var6 = -52 % ((arg2 - 72) / 43);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([II)V")
    private final void method606(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class125.field2990) {
            var3 = arg1 << 1;
        }
        class71.method576(arg0, 0, var3);
        this.field1784 -= arg1;
        if (this.field1758 != null && this.field1784 <= 0) {
            this.field1784 += class138.field3361 >> 4;
            class152.method1222(this.field1758, 0);
            this.method605(this.field1758.method722(), this.field1758, (byte) 125);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class150 var10 = null;
                        class150 var11 = this.field1770[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class118 var12 = var11.field3715;
                                if (var12 == null || var12.field2821 <= var8) {
                                    var11.field3716 = true;
                                    int var13 = var11.method721();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2821 += var13;
                                    }
                                    if (var4 >= this.field1753) {
                                        break label107;
                                    }
                                    class150 var14 = var11.method732();
                                    if (var14 != null) {
                                        int var15 = var11.field3713;
                                        while (var14 != null) {
                                            this.method605(var15 * var14.method722() >> 8, var14, (byte) -62);
                                            var14 = var11.method720();
                                        }
                                    }
                                    class150 var16 = var11.field3714;
                                    var11.field3714 = null;
                                    if (var10 == null) {
                                        this.field1770[var7] = var16;
                                    } else {
                                        var10.field3714 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1781[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3714;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class150 var18 = this.field1770[var17];
                this.field1770[var17] = this.field1781[var17] = null;
                while (var18 != null) {
                    class150 var19 = var18.field3714;
                    var18.field3714 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1784 < 0) {
            this.field1784 = 0;
        }
        if (this.field1758 != null) {
            this.field1758.method709(arg0, 0, arg1);
        }
        this.field1766 = class14.method95(-66);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lba;B)V")
    public static final void method607(class9 arg0, byte arg1) {
        field1750++;
        arg0.field156 = false;
        if (arg1 < 10) {
            method607(null, (byte) -119);
        }
        if (arg0.field159 != -1) {
            class84 var2 = class17.method108(arg0.field159, 0);
            if (var2 == null || var2.field2013 == null) {
                arg0.field159 = -1;
            } else {
                arg0.field228++;
                if (var2.field2013.length > arg0.field163 && var2.field2008[arg0.field163] < arg0.field228) {
                    arg0.field228 = 1;
                    arg0.field163++;
                    class55.method419(arg0.field172, arg0.field163, 40, var2, arg0.field173);
                }
                if (arg0.field163 >= var2.field2013.length) {
                    arg0.field163 = 0;
                    arg0.field228 = 0;
                    class55.method419(arg0.field172, arg0.field163, 40, var2, arg0.field173);
                }
            }
        }
        if (arg0.field155 != -1 && arg0.field193 <= class126.field2998) {
            if (arg0.field201 < 0) {
                arg0.field201 = 0;
            }
            int var3 = class44.method345(arg0.field155, true).field445;
            if (var3 == -1) {
                arg0.field155 = -1;
            } else {
                class84 var4 = class17.method108(var3, 0);
                if (var4 == null || var4.field2013 == null) {
                    arg0.field155 = -1;
                } else {
                    arg0.field225++;
                    if (arg0.field201 < var4.field2013.length && var4.field2008[arg0.field201] < arg0.field225) {
                        arg0.field225 = 1;
                        arg0.field201++;
                        class55.method419(arg0.field172, arg0.field201, 40, var4, arg0.field173);
                    }
                    if (var4.field2013.length <= arg0.field201 && (arg0.field201 < 0 || arg0.field201 >= var4.field2013.length)) {
                        arg0.field155 = -1;
                    }
                }
            }
        }
        if (arg0.field170 != -1 && arg0.field177 <= 1) {
            class84 var5 = class17.method108(arg0.field170, 0);
            if (var5.field2004 == 1 && arg0.field187 > 0 && class126.field2998 >= arg0.field208 && arg0.field226 < class126.field2998) {
                arg0.field177 = 1;
                return;
            }
        }
        if (arg0.field170 != -1 && arg0.field177 == 0) {
            class84 var6 = class17.method108(arg0.field170, 0);
            if (var6 == null || var6.field2013 == null) {
                arg0.field170 = -1;
            } else {
                arg0.field180++;
                if (arg0.field194 < var6.field2013.length && var6.field2008[arg0.field194] < arg0.field180) {
                    arg0.field180 = 1;
                    arg0.field194++;
                    class55.method419(arg0.field172, arg0.field194, 40, var6, arg0.field173);
                }
                if (var6.field2013.length <= arg0.field194) {
                    arg0.field229++;
                    arg0.field194 -= var6.field1984;
                    if (arg0.field229 >= var6.field1998) {
                        arg0.field170 = -1;
                    } else if (arg0.field194 >= 0 && arg0.field194 < var6.field2013.length) {
                        class55.method419(arg0.field172, arg0.field194, 40, var6, arg0.field173);
                    } else {
                        arg0.field170 = -1;
                    }
                }
                arg0.field156 = var6.field2003;
            }
        }
        if (arg0.field177 > 0) {
            arg0.field177--;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
    public void method276() throws Exception {
        field1772++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)I")
    public static final int method608(int arg0, int arg1, int arg2, int arg3) {
        field1749++;
        if ((client.field525[arg0][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (client.field525[1][arg1][arg2] & 0x2) == 0) {
            if (arg3 < 60) {
                field1756 = 96;
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method278(Component arg0) throws Exception {
        field1779++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lcc;Lcc;I)V")
    public static final void method609(class18 arg0, class18 arg1, int arg2) {
        if (class87.field2066 == null) {
            class87.field2066 = class30.method246(class138.field3347, class57.field1390, -88, class58.field1435);
        }
        field1755++;
        if (class80.field1893 == null) {
            class80.field1893 = class30.method243(class46.field1108, 918, class58.field1435, class57.field1390);
        }
        if (class50.field1180 == null) {
            class50.field1180 = class30.method243(class109.field2636, 918, class58.field1435, class57.field1390);
        }
        if (class2.field61 == null) {
            class2.field61 = class30.method243(class29.field706, 918, class58.field1435, class57.field1390);
        }
        class70.method564(0, 23, 765, 480, 0);
        class70.method569(0, 0, 125, 23, 12425273, 9135624);
        class70.method569(125, 0, 640, 23, 5197647, 2697513);
        arg0.method127(class119.field2889, 62, 15, 0);
        if (class2.field61 != null) {
            class2.field61[1].method29(140, 1);
            arg1.method121(class26.field627, 152, 10, 16777215);
            class2.field61[0].method29(140, 12);
            arg1.method121(class138.field3352, 152, 21, 16777215);
        }
        if (class50.field1180 != null) {
            short var3 = 390;
            short var4 = 280;
            if (class119.field2878[0] == 0 && class41.field962[0] == 0) {
                class50.field1180[2].method29(var4, 4);
            } else {
                class50.field1180[0].method29(var4, 4);
            }
            if (class119.field2878[0] == 0 && class41.field962[0] == 1) {
                class50.field1180[3].method29(var4 + 15, 4);
            } else {
                class50.field1180[1].method29(var4 + 15, 4);
            }
            arg0.method121(class148.field3697, var4 + 32, 17, 16777215);
            short var5 = 610;
            if (class119.field2878[0] == 1 && class41.field962[0] == 0) {
                class50.field1180[2].method29(var3, 4);
            } else {
                class50.field1180[0].method29(var3, 4);
            }
            if (class119.field2878[0] == 1 && class41.field962[0] == 1) {
                class50.field1180[3].method29(var3 + 15, 4);
            } else {
                class50.field1180[1].method29(var3 + 15, 4);
            }
            arg0.method121(class1.field4, var3 + 32, 17, 16777215);
            short var6 = 500;
            if (class119.field2878[0] == 2 && class41.field962[0] == 0) {
                class50.field1180[2].method29(var6, 4);
            } else {
                class50.field1180[0].method29(var6, 4);
            }
            if (class119.field2878[0] == 2 && class41.field962[0] == 1) {
                class50.field1180[3].method29(var6 + 15, 4);
            } else {
                class50.field1180[1].method29(var6 + 15, 4);
            }
            arg0.method121(class3.field80, var6 + 32, 17, 16777215);
            if (class119.field2878[0] == 3 && class41.field962[0] == 0) {
                class50.field1180[2].method29(var5, 4);
            } else {
                class50.field1180[0].method29(var5, 4);
            }
            if (class119.field2878[0] == 3 && class41.field962[0] == 1) {
                class50.field1180[3].method29(var5 + 15, 4);
            } else {
                class50.field1180[1].method29(var5 + 15, 4);
            }
            arg0.method121(class48.field1148, var5 + 32, 17, 16777215);
        }
        class70.method564(708, 4, 50, 16, 0);
        arg1.method127(class32.field756, 733, 16, 16777215);
        class117.field2815 = arg2;
        if (class87.field2066 != null) {
            byte var7 = 88;
            int var8 = 765 / (var7 + 1);
            byte var9 = 19;
            int var10 = 480 / (var9 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var8;
                if (class3.field74 <= (var8 - 1) * var10) {
                    var8--;
                }
                if ((var10 - 1) * var8 >= class3.field74) {
                    var10--;
                }
                if ((var10 - 1) * var8 >= class3.field74) {
                    var10--;
                }
            } while (var10 != var11 || var8 != var12);
            int var13 = (480 - var9 * var10) / (var10 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var7 * var8) / (var8 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = 0;
            int var16 = (765 - var7 * var8 - (var8 + -1) * var14) / 2;
            int var17 = (480 - (var10 - 1) * var13 - var9 * var10) / 2;
            int var18 = var17 + 23;
            int var19 = var16;
            for (int var20 = 0; var20 < class3.field74; var20++) {
                class50 var21 = class99.field2406[var20];
                boolean var22 = true;
                class135 var23 = class68.method547(-1, var21.field1182);
                if (var21.field1182 == -1) {
                    var23 = class58.field1413;
                    var22 = false;
                } else if (var21.field1182 > 1980) {
                    var23 = class102.field2458;
                    var22 = false;
                }
                if (class53.field1278 >= var19 && class76.field1798 >= var18 && class53.field1278 < var7 + var19 && class76.field1798 < var18 + var9 && var22) {
                    class117.field2815 = var20;
                    class87.field2066[var21.field1185 ? 1 : 0].method80(var19, var18, 128, 16777215);
                } else {
                    class87.field2066[var21.field1185 ? 1 : 0].method70(var19, var18);
                }
                if (class80.field1893 != null) {
                    class80.field1893[(var21.field1185 ? 8 : 0) + var21.field1181].method29(var19 + 29, var18);
                }
                arg0.method127(class68.method547(-1, var21.field1186), var19 + 15, var9 / 2 + var18 + 5, 0);
                arg1.method127(var23, var19 + 60, var9 / 2 - -5 + var18, 268435455);
                var18 += var9 + var13;
                var15++;
                if (var15 >= var10) {
                    var18 = var17 + 23;
                    var19 += var7 + var14;
                    var15 = 0;
                }
            }
        }
        try {
            Graphics var24 = class59.field1484.getGraphics();
            class113.field2739.method94(-17740, 0, var24, 0);
        } catch (Exception var25) {
            class59.field1484.repaint();
        }
    }
}
