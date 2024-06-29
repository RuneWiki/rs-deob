import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 extends class42 {

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    private int field1651 = 0;

    @OriginalMember(owner = "client!ld", name = "pb", descriptor = "I")
    private int field1657 = -1;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lad;")
    public class5 field1644 = class65.field1563;

    @OriginalMember(owner = "client!ld", name = "wb", descriptor = "I")
    private int field1664 = 128;

    @OriginalMember(owner = "client!ld", name = "vb", descriptor = "I")
    private int field1663 = 0;

    @OriginalMember(owner = "client!ld", name = "Cb", descriptor = "I")
    private int field1670 = 128;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "Z")
    public boolean field1648 = false;

    @OriginalMember(owner = "client!ld", name = "Eb", descriptor = "I")
    public int field1672 = 0;

    @OriginalMember(owner = "client!ld", name = "rb", descriptor = "Z")
    private boolean field1659 = false;

    @OriginalMember(owner = "client!ld", name = "Pb", descriptor = "I")
    public int field1683 = 0;

    @OriginalMember(owner = "client!ld", name = "Rb", descriptor = "Z")
    public boolean field1685 = true;

    @OriginalMember(owner = "client!ld", name = "tb", descriptor = "I")
    public int field1661 = -1;

    @OriginalMember(owner = "client!ld", name = "Hb", descriptor = "I")
    private int field1675 = 0;

    @OriginalMember(owner = "client!ld", name = "Kb", descriptor = "I")
    public int field1678 = -1;

    @OriginalMember(owner = "client!ld", name = "Vb", descriptor = "I")
    public int field1689 = 16;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "Z")
    public boolean field1649 = false;

    @OriginalMember(owner = "client!ld", name = "Jb", descriptor = "I")
    public int field1677 = -1;

    @OriginalMember(owner = "client!ld", name = "Fb", descriptor = "I")
    private int field1673 = 128;

    @OriginalMember(owner = "client!ld", name = "xb", descriptor = "I")
    public int field1665 = 0;

    @OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
    private int field1656 = 0;

    @OriginalMember(owner = "client!ld", name = "Zb", descriptor = "I")
    public int field1693 = 1;

    @OriginalMember(owner = "client!ld", name = "Yb", descriptor = "I")
    public int field1692 = 0;

    @OriginalMember(owner = "client!ld", name = "cc", descriptor = "I")
    private int field1696 = -1;

    @OriginalMember(owner = "client!ld", name = "dc", descriptor = "Z")
    public boolean field1697 = false;

    @OriginalMember(owner = "client!ld", name = "Mb", descriptor = "Z")
    public boolean field1680 = false;

    @OriginalMember(owner = "client!ld", name = "Ab", descriptor = "Z")
    public boolean field1668 = true;

    @OriginalMember(owner = "client!ld", name = "zb", descriptor = "I")
    public int field1667 = -1;

    @OriginalMember(owner = "client!ld", name = "Nb", descriptor = "Z")
    public boolean field1681 = true;

    @OriginalMember(owner = "client!ld", name = "lc", descriptor = "I")
    public int field1705 = 1;

    @OriginalMember(owner = "client!ld", name = "Xb", descriptor = "I")
    public int field1691 = -1;

    @OriginalMember(owner = "client!ld", name = "Ob", descriptor = "[Lad;")
    public class5[] field1682 = new class5[5];

    @OriginalMember(owner = "client!ld", name = "ac", descriptor = "I")
    public int field1694 = -1;

    @OriginalMember(owner = "client!ld", name = "ic", descriptor = "I")
    private int field1702 = 0;

    @OriginalMember(owner = "client!ld", name = "gc", descriptor = "Z")
    private boolean field1700 = false;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "Lad;")
    private static class5 field1645 = class88.method674("You have only just left another world)3", 70);

    @OriginalMember(owner = "client!ld", name = "Qb", descriptor = "Lad;")
    public static class5 field1684 = field1645;

    @OriginalMember(owner = "client!ld", name = "bc", descriptor = "Lad;")
    public static class5 field1695 = class88.method674("und haben es deaktiviert)3 Benutzen Sie die", -93);

    @OriginalMember(owner = "client!ld", name = "lb", descriptor = "Lbb;")
    public static class9 field1653 = new class9(64);

    @OriginalMember(owner = "client!ld", name = "nc", descriptor = "Lad;")
    public static class5 field1707 = class88.method674("Benutzername: ", 56);

    @OriginalMember(owner = "client!ld", name = "hc", descriptor = "Lad;")
    private static class5 field1701 = class88.method674(" seconds)3", -90);

    @OriginalMember(owner = "client!ld", name = "mc", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!ld", name = "fc", descriptor = "Lad;")
    private static class5 field1699 = class88.method674("Hidden", -84);

    @OriginalMember(owner = "client!ld", name = "jc", descriptor = "Lad;")
    public static class5 field1703 = field1699;

    @OriginalMember(owner = "client!ld", name = "qc", descriptor = "Lad;")
    public static class5 field1710 = field1701;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ld", name = "qb", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ld", name = "sb", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ld", name = "yb", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ld", name = "Bb", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ld", name = "Db", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ld", name = "Gb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ld", name = "Lb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ld", name = "Sb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ld", name = "Tb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ld", name = "Ub", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ld", name = "Wb", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ld", name = "ec", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ld", name = "oc", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ld", name = "pc", descriptor = "Lje;")
    public static class59 field1709;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "[I")
    public int[] field1650;

    @OriginalMember(owner = "client!ld", name = "mb", descriptor = "[I")
    private int[] field1654;

    @OriginalMember(owner = "client!ld", name = "nb", descriptor = "[I")
    public int[] field1655;

    @OriginalMember(owner = "client!ld", name = "ub", descriptor = "[I")
    private int[] field1662;

    @OriginalMember(owner = "client!ld", name = "Ib", descriptor = "[I")
    private int[] field1676;

    @OriginalMember(owner = "client!ld", name = "kc", descriptor = "[I")
    private int[] field1704;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V", line = 23)
    public final void method547(boolean arg0) {
        if (this.field1667 == -1) {
            this.field1667 = 0;
            if (this.field1662 != null && (this.field1654 == null || this.field1654[0] == 10)) {
                this.field1667 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field1682[var2] != null) {
                    this.field1667 = 1;
                }
            }
        }
        if (!arg0) {
            this.field1644 = null;
        }
        if (this.field1677 == -1) {
            this.field1677 = this.field1668 ? 1 : 0;
        }
        field1708++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILm;IIIIBI)Lhc;", line = 55)
    public final class45 method548(int arg0, int arg1, class72 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 < 22) {
            return null;
        }
        long var10;
        if (this.field1654 == null) {
            var10 = (this.field1647 << 10) + arg0;
        } else {
            var10 = (this.field1647 << 10) + (arg6 << 3) + arg0;
        }
        class45 var12 = (class45) class30.field749.method98(-8, var10);
        field1671++;
        if (var12 == null) {
            var12 = this.method552(true, arg0, arg6, true, 25);
            if (var12 == null) {
                return null;
            }
            class30.field749.method102(var10, var12, 111);
        }
        if (arg2 == null && !this.field1680) {
            return var12;
        }
        class45 var13;
        if (arg2 == null) {
            var13 = var12.method399(true);
        } else {
            var13 = arg2.method570(-110, arg5, arg0, var12);
        }
        if (this.field1680) {
            int var14 = (arg1 + arg8 + arg4 + arg3) / 4;
            for (int var15 = 0; var15 < var13.field1139; var15++) {
                int var16 = var13.field1148[var15];
                int var17 = var13.field1147[var15];
                int var18 = arg4 + (arg1 - arg4) * (var17 + 64) / 128;
                int var19 = arg8 + (arg3 - arg8) * (var17 - -64) / 128;
                int var20 = var18 + (var19 - var18) * (var16 + 64) / 128;
                var13.field1145[var15] += var20 - var14;
            }
        }
        return var13;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIII)Lhc;", line = 127)
    public final class45 method549(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1679++;
        long var8;
        if (this.field1654 == null) {
            var8 = (this.field1647 << 10) + arg6;
        } else {
            var8 = (this.field1647 << 10) + (arg4 << 3) + arg6;
        }
        class45 var10 = (class45) class39.field984.method98(-8, var8);
        if (var10 == null) {
            var10 = this.method552(!this.field1700, arg6, arg4, false, -113);
            if (var10 == null) {
                return null;
            }
            class39.field984.method102(var8, var10, 109);
        }
        if (this.field1680 || this.field1700) {
            var10 = new class45(var10, this.field1680, this.field1700);
        }
        if (this.field1680) {
            int var11 = (arg0 + arg2 + arg3 + arg5) / 4;
            for (int var12 = 0; var12 < var10.field1139; var12++) {
                int var13 = var10.field1147[var12];
                int var14 = var10.field1148[var12];
                int var15 = (arg5 - arg3) * (var13 + 64) / 128 + arg3;
                int var16 = (arg0 - arg2) * (var13 + 64) / 128 + arg2;
                int var17 = (var15 - var16) * (var14 + 64) / 128 + var16;
                var10.field1145[var12] += var17 - var11;
            }
        }
        if (!arg1) {
            this.field1704 = null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Z", line = 186)
    public final boolean method550(byte arg0) {
        field1687++;
        if (this.field1662 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 27) {
            return true;
        } else {
            for (int var3 = 0; var3 < this.field1662.length; var3++) {
                var2 &= class100.field2413.method865(this.field1662[var3] & 0xFFFF, -2691, 0);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Lld;", line = 230)
    public final class70 method551(int arg0) {
        int var2 = -115 / ((-arg0 - 65) / 50);
        field1658++;
        int var3 = -1;
        if (this.field1696 != -1) {
            var3 = class1.method3(-63, this.field1696);
        } else if (this.field1657 != -1) {
            var3 = class128.field3058[this.field1657];
        }
        return var3 < 0 || var3 >= this.field1655.length || this.field1655[var3] == -1 ? null : class42.method357(this.field1655[var3], (byte) -42);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIZI)Lhc;", line = 269)
    private final class45 method552(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1660++;
        class45 var6 = null;
        if (this.field1654 == null) {
            if (arg2 != 10) {
                return null;
            }
            if (this.field1662 == null) {
                return null;
            }
            boolean var7 = this.field1659 ^ arg1 > 3;
            int var8 = this.field1662.length;
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = this.field1662[var9];
                if (var7) {
                    var10 += 65536;
                }
                var6 = (class45) class118.field2914.method98(-8, (long) var10);
                if (var6 == null) {
                    var6 = class45.method400(class100.field2413, var10 & 0xFFFF, 0);
                    if (var6 == null) {
                        return null;
                    }
                    if (var7) {
                        var6.method395();
                    }
                    class118.field2914.method102((long) var10, var6, 95);
                }
                if (var8 > 1) {
                    class40.field1027[var9] = var6;
                }
            }
            if (var8 > 1) {
                var6 = new class45(class40.field1027, var8);
            }
        } else {
            int var11 = -1;
            for (int var12 = 0; var12 < this.field1654.length; var12++) {
                if (this.field1654[var12] == arg2) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == -1) {
                return null;
            }
            boolean var13 = arg1 > 3 ^ this.field1659;
            int var14 = this.field1662[var11];
            if (var13) {
                var14 += 65536;
            }
            var6 = (class45) class118.field2914.method98(-8, (long) var14);
            if (var6 == null) {
                var6 = class45.method400(class100.field2413, var14 & 0xFFFF, 0);
                if (var6 == null) {
                    return null;
                }
                if (var13) {
                    var6.method395();
                }
                class118.field2914.method102((long) var14, var6, 79);
            }
        }
        boolean var15;
        if (this.field1673 == 128 && this.field1670 == 128 && this.field1664 == 128) {
            var15 = false;
        } else {
            var15 = true;
        }
        boolean var16;
        if (this.field1702 == 0 && this.field1675 == 0 && this.field1651 == 0) {
            var16 = false;
        } else {
            var16 = true;
        }
        class45 var17 = new class45(var6, arg1 == 0 && !var15 && !var16, this.field1676 == null, true);
        int var18 = arg1 & 0x3;
        int var19 = 106 % ((76 - arg4) / 46);
        if (var18 == 1) {
            var17.method380();
        } else if (var18 == 2) {
            var17.method382();
        } else if (var18 == 3) {
            var17.method377();
        }
        if (this.field1676 != null) {
            for (int var20 = 0; var20 < this.field1676.length; var20++) {
                var17.method381(this.field1676[var20], this.field1704[var20]);
            }
        }
        if (var15) {
            var17.method373(this.field1673, this.field1670, this.field1664);
        }
        if (var16) {
            var17.method397(this.field1702, this.field1675, this.field1651);
        }
        if (arg3) {
            var17.method378();
        }
        var17.method392(this.field1663 + 64, 768 - -(this.field1656 * 5), -50, -10, -50, arg0);
        return var17;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 430)
    public static void method553(int arg0) {
        field1695 = null;
        field1703 = null;
        field1684 = null;
        field1709 = null;
        field1653 = null;
        field1710 = null;
        if (arg0 != 65535) {
            method553(-56);
        }
        field1645 = null;
        field1701 = null;
        field1707 = null;
        field1699 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Color;Lad;I)V", line = 452)
    public static final void method554(int arg0, Color arg1, class5 arg2, int arg3) {
        try {
            Graphics var4 = class9.field305.getGraphics();
            if (class12.field353 == null) {
                class12.field353 = new Font("Helvetica", 1, 13);
                class90.field2118 = class9.field305.getFontMetrics(class12.field353);
            }
            if (class120.field2979) {
                class120.field2979 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class7.field270, class46.field1218);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class133.field3207 == null) {
                    class133.field3207 = class9.field305.createImage(304, 34);
                }
                Graphics var5 = class133.field3207.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class12.field353);
                var5.setColor(Color.white);
                arg2.method73((304 - arg2.method44(89, class90.field2118)) / 2, var5, 22, -30395);
                if (arg0 >= -37) {
                    method554(119, null, null, -17);
                }
                var4.drawImage(class133.field3207, class7.field270 / 2 - 152, class46.field1218 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class7.field270 / 2 - 152;
                int var7 = class46.field1218 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg3 * 3 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class12.field353);
                var4.setColor(Color.white);
                arg2.method73((304 - arg2.method44(66, class90.field2118)) / 2 + var6, var4, var7 + 22, -30395);
            }
        } catch (Exception var9) {
            class9.field305.repaint();
        }
        field1698++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lod;", line = 548)
    public static final class88 method555(byte arg0, int arg1) {
        field1666++;
        class88 var2 = (class88) class1.field4.method98(arg0 ^ 0xFFFFFFA7, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field2499.method857(arg0 + 30485, 3, arg1);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method678((byte) 98, new class39(var3));
        }
        class1.field4.method102((long) arg1, var4, arg0 - 11);
        if (arg0 != 95) {
            method553(55);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lgb;ZI)V", line = 578)
    private final void method556(class39 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg0.method330(-30864);
            if (var4 > 0) {
                if (this.field1662 == null || class100.field2430) {
                    this.field1662 = new int[var4];
                    this.field1654 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1662[var5] = arg0.method343((byte) -6);
                        this.field1654[var5] = arg0.method330(-30864);
                    }
                } else {
                    arg0.field957 += var4 * 3;
                }
            }
        } else if (arg2 == 2) {
            this.field1644 = arg0.method301(-1);
        } else if (arg2 == 5) {
            int var6 = arg0.method330(-30864);
            if (var6 > 0) {
                if (this.field1662 == null || class100.field2430) {
                    this.field1654 = null;
                    this.field1662 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1662[var7] = arg0.method343((byte) -6);
                    }
                } else {
                    arg0.field957 += var6 * 2;
                }
            }
        } else if (arg2 == 14) {
            this.field1705 = arg0.method330(-30864);
        } else if (arg2 == 15) {
            this.field1693 = arg0.method330(-30864);
        } else if (arg2 == 17) {
            this.field1668 = false;
        } else if (arg2 == 18) {
            this.field1685 = false;
        } else if (arg2 == 19) {
            this.field1667 = arg0.method330(-30864);
        } else if (arg2 == 21) {
            this.field1680 = true;
        } else if (arg2 == 22) {
            this.field1700 = true;
        } else if (arg2 == 23) {
            this.field1649 = true;
        } else if (arg2 == 24) {
            this.field1691 = arg0.method343((byte) -6);
            if (this.field1691 == 65535) {
                this.field1691 = -1;
            }
        } else if (arg2 == 28) {
            this.field1689 = arg0.method330(-30864);
        } else if (arg2 == 29) {
            this.field1663 = arg0.method318(-1);
        } else if (arg2 == 39) {
            this.field1656 = arg0.method318(-1) * 5;
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field1682[arg2 - 30] = arg0.method301(-1);
            if (this.field1682[arg2 - 30].method75(false, field1703)) {
                this.field1682[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var8 = arg0.method330(-30864);
            this.field1676 = new int[var8];
            this.field1704 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1676[var9] = arg0.method343((byte) -6);
                this.field1704[var9] = arg0.method343((byte) -6);
            }
        } else if (arg2 == 60) {
            this.field1678 = arg0.method343((byte) -6);
        } else if (arg2 == 62) {
            this.field1659 = true;
        } else if (arg2 == 64) {
            this.field1681 = false;
        } else if (arg2 == 65) {
            this.field1673 = arg0.method343((byte) -6);
        } else if (arg2 == 66) {
            this.field1670 = arg0.method343((byte) -6);
        } else if (arg2 == 67) {
            this.field1664 = arg0.method343((byte) -6);
        } else if (arg2 == 68) {
            this.field1661 = arg0.method343((byte) -6);
        } else if (arg2 == 69) {
            this.field1692 = arg0.method330(-30864);
        } else if (arg2 == 70) {
            this.field1702 = arg0.method329(-16621);
        } else if (arg2 == 71) {
            this.field1675 = arg0.method329(-16621);
        } else if (arg2 == 72) {
            this.field1651 = arg0.method329(-16621);
        } else if (arg2 == 73) {
            this.field1697 = true;
        } else if (arg2 == 74) {
            this.field1648 = true;
        } else if (arg2 == 75) {
            this.field1677 = arg0.method330(-30864);
        } else if (arg2 == 77) {
            this.field1696 = arg0.method343((byte) -6);
            if (this.field1696 == 65535) {
                this.field1696 = -1;
            }
            this.field1657 = arg0.method343((byte) -6);
            if (this.field1657 == 65535) {
                this.field1657 = -1;
            }
            int var12 = arg0.method330(-30864);
            this.field1655 = new int[var12 + 1];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1655[var13] = arg0.method343((byte) -6);
                if (this.field1655[var13] == 65535) {
                    this.field1655[var13] = -1;
                }
            }
        } else if (arg2 == 78) {
            this.field1694 = arg0.method343((byte) -6);
            this.field1683 = arg0.method330(-30864);
        } else if (arg2 == 79) {
            this.field1665 = arg0.method343((byte) -6);
            this.field1672 = arg0.method343((byte) -6);
            this.field1683 = arg0.method330(-30864);
            int var10 = arg0.method330(-30864);
            this.field1650 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1650[var11] = arg0.method343((byte) -6);
            }
        }
        if (!arg1) {
            method553(-60);
        }
        field1690++;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(BIII)I", line = 856)
    public static final int method557(byte arg0, int arg1, int arg2, int arg3) {
        field1674++;
        if (arg0 != 63) {
            field1703 = null;
        }
        int var4 = 256 - arg3;
        return ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg3 & 0xFF0000) + ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILgb;)V", line = 876)
    public final void method558(int arg0, class39 arg1) {
        while (true) {
            int var3 = arg1.method330(-30864);
            if (var3 == 0) {
                if (arg0 != 65535) {
                    return;
                }
                field1669++;
                return;
            }
            this.method556(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)Z", line = 897)
    public final boolean method559(int arg0) {
        field1646++;
        if (this.field1655 == null) {
            return this.field1694 != -1 || this.field1650 != null;
        }
        for (int var2 = 0; var2 < this.field1655.length; var2++) {
            if (this.field1655[var2] != -1) {
                class70 var3 = class42.method357(this.field1655[var2], (byte) -42);
                if (var3.field1694 != -1 || var3.field1650 != null) {
                    return true;
                }
            }
        }
        if (arg0 != -6) {
            method555((byte) 68, 85);
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z", line = 1013)
    public final boolean method560(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field1691 = 93;
        }
        field1688++;
        if (this.field1654 != null) {
            for (int var5 = 0; var5 < this.field1654.length; var5++) {
                if (this.field1654[var5] == arg1) {
                    return class100.field2413.method865(this.field1662[var5] & 0xFFFF, arg0 - 2692, 0);
                }
            }
            return true;
        } else if (this.field1662 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field1662.length; var4++) {
                var3 &= class100.field2413.method865(this.field1662[var4] & 0xFFFF, arg0 - 2692, 0);
            }
            return var3;
        } else {
            return true;
        }
    }
}
