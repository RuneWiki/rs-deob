import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZNUYRYPY")
public class class71 {

    @OriginalMember(owner = "ZNUYRYPY", name = "b", descriptor = "I")
    public int field1698 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "c", descriptor = "I")
    private int field1699 = 128;

    @OriginalMember(owner = "ZNUYRYPY", name = "g", descriptor = "I")
    public int field1703 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "h", descriptor = "I")
    private int field1704 = 128;

    @OriginalMember(owner = "ZNUYRYPY", name = "j", descriptor = "Z")
    private boolean field1706 = true;

    @OriginalMember(owner = "ZNUYRYPY", name = "k", descriptor = "I")
    public int field1707 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "l", descriptor = "Z")
    public boolean field1708 = true;

    @OriginalMember(owner = "ZNUYRYPY", name = "m", descriptor = "B")
    public byte field1709 = 1;

    @OriginalMember(owner = "ZNUYRYPY", name = "n", descriptor = "J")
    public long field1710 = -1L;

    @OriginalMember(owner = "ZNUYRYPY", name = "q", descriptor = "I")
    public int field1713 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "s", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "t", descriptor = "I")
    public int field1716 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "u", descriptor = "I")
    private int field1717 = 16191;

    @OriginalMember(owner = "ZNUYRYPY", name = "v", descriptor = "I")
    public int field1718 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "B", descriptor = "I")
    public int field1724 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "C", descriptor = "I")
    public int field1725 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "D", descriptor = "Z")
    public boolean field1726 = true;

    @OriginalMember(owner = "ZNUYRYPY", name = "F", descriptor = "I")
    public int field1728 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "G", descriptor = "I")
    public int field1729 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "K", descriptor = "I")
    public int field1733 = 32;

    @OriginalMember(owner = "ZNUYRYPY", name = "L", descriptor = "I")
    public int field1734 = -1;

    @OriginalMember(owner = "ZNUYRYPY", name = "M", descriptor = "Z")
    public boolean field1735 = false;

    @OriginalMember(owner = "ZNUYRYPY", name = "p", descriptor = "LCZWVRQJW;")
    public static class4 field1712 = new class4(false, 30);

    @OriginalMember(owner = "ZNUYRYPY", name = "f", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "ZNUYRYPY", name = "o", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "ZNUYRYPY", name = "z", descriptor = "I")
    private static int field1722;

    @OriginalMember(owner = "ZNUYRYPY", name = "H", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "ZNUYRYPY", name = "I", descriptor = "I")
    private static int field1731;

    @OriginalMember(owner = "ZNUYRYPY", name = "J", descriptor = "LLDILQFVA;")
    private static class34 field1732;

    @OriginalMember(owner = "ZNUYRYPY", name = "i", descriptor = "Lclient;")
    public static client field1705;

    @OriginalMember(owner = "ZNUYRYPY", name = "E", descriptor = "Ljava/lang/String;")
    public String field1727;

    @OriginalMember(owner = "ZNUYRYPY", name = "d", descriptor = "[B")
    public byte[] field1700;

    @OriginalMember(owner = "ZNUYRYPY", name = "a", descriptor = "[I")
    private int[] field1697;

    @OriginalMember(owner = "ZNUYRYPY", name = "e", descriptor = "[I")
    private int[] field1701;

    @OriginalMember(owner = "ZNUYRYPY", name = "r", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "ZNUYRYPY", name = "w", descriptor = "[I")
    public int[] field1719;

    @OriginalMember(owner = "ZNUYRYPY", name = "y", descriptor = "[I")
    private int[] field1721;

    @OriginalMember(owner = "ZNUYRYPY", name = "A", descriptor = "[I")
    private static int[] field1723;

    @OriginalMember(owner = "ZNUYRYPY", name = "N", descriptor = "[LZNUYRYPY;")
    private static class71[] field1736;

    @OriginalMember(owner = "ZNUYRYPY", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field1720;

    @OriginalMember(owner = "ZNUYRYPY", name = "a", descriptor = "(I[III)LHEQROJXW;")
    public final class27 method586(int arg0, int[] arg1, int arg2, int arg3) {
        if (this.field1719 != null) {
            class71 var5 = this.method591(0);
            return var5 == null ? null : var5.method586(0, arg1, arg2, arg3);
        }
        class27 var6 = (class27) field1712.method152(this.field1710);
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1697.length; var9++) {
                if (!class27.method323(this.field1697[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class27[] var10 = new class27[this.field1697.length];
            for (int var11 = 0; var11 < this.field1697.length; var11++) {
                var10[var11] = class27.method322(this.field1697[var11], (byte) 71);
            }
            if (var10.length == 1) {
                var6 = var10[0];
            } else {
                var6 = new class27((byte) 6, var10.length, var10);
            }
            if (this.field1701 != null) {
                for (int var12 = 0; var12 < this.field1701.length; var12++) {
                    var6.method336(this.field1701[var12], this.field1721[var12]);
                }
            }
            var6.method329(true);
            var6.method339(this.field1711 + 64, this.field1730 + 850, -30, -50, -30, true);
            field1712.method153(var6, true, this.field1710);
        }
        class27 var13 = class27.field845;
        var13.method324(class56.method536(arg3, 9643) & class56.method536(arg2, 9643), 0, var6);
        if (arg3 != -1 && arg2 != -1) {
            var13.method331(arg3, arg1, arg2, true);
        } else if (arg3 != -1) {
            var13.method330(arg3, 0);
        }
        if (this.field1704 != 128 || this.field1699 != 128) {
            var13.method338(this.field1699, 24701, this.field1704, this.field1704);
        }
        var13.method326((byte) -109);
        var13.field882 = null;
        var13.field881 = null;
        if (this.field1709 == 1) {
            var13.field883 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "a", descriptor = "(LLDILQFVA;I)V")
    private final void method587(class34 arg0, int arg1) {
        if (this.field1717 != arg1) {
            this.field1706 = !this.field1706;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method402();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method402();
                    this.field1697 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1697[var5] = arg0.method404();
                    }
                } else if (var3 == 2) {
                    this.field1727 = arg0.method409();
                } else if (var3 == 3) {
                    this.field1700 = arg0.method410(-34454);
                } else if (var3 == 12) {
                    this.field1709 = arg0.method403();
                } else if (var3 == 13) {
                    this.field1718 = arg0.method404();
                } else if (var3 == 14) {
                    this.field1716 = arg0.method404();
                } else if (var3 == 17) {
                    this.field1716 = arg0.method404();
                    this.field1729 = arg0.method404();
                    this.field1713 = arg0.method404();
                    this.field1703 = arg0.method404();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1720 == null) {
                        this.field1720 = new String[5];
                    }
                    this.field1720[var3 - 30] = arg0.method409();
                    if (this.field1720[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1720[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method402();
                    this.field1701 = new int[var6];
                    this.field1721 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1701[var7] = arg0.method404();
                        this.field1721[var7] = arg0.method404();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method402();
                    this.field1714 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1714[var9] = arg0.method404();
                    }
                } else if (var3 == 90) {
                    this.field1724 = arg0.method404();
                } else if (var3 == 91) {
                    this.field1707 = arg0.method404();
                } else if (var3 == 92) {
                    this.field1728 = arg0.method404();
                } else if (var3 == 93) {
                    this.field1726 = false;
                } else if (var3 == 95) {
                    this.field1734 = arg0.method404();
                } else if (var3 == 97) {
                    this.field1704 = arg0.method404();
                } else if (var3 == 98) {
                    this.field1699 = arg0.method404();
                } else if (var3 == 99) {
                    this.field1735 = true;
                } else if (var3 == 100) {
                    this.field1711 = arg0.method403();
                } else if (var3 == 101) {
                    this.field1730 = arg0.method403() * 5;
                } else if (var3 == 102) {
                    this.field1715 = arg0.method404();
                } else if (var3 == 103) {
                    this.field1733 = arg0.method404();
                } else if (var3 == 106) {
                    this.field1725 = arg0.method404();
                    if (this.field1725 == 65535) {
                        this.field1725 = -1;
                    }
                    this.field1698 = arg0.method404();
                    if (this.field1698 == 65535) {
                        this.field1698 = -1;
                    }
                    int var10 = arg0.method402();
                    this.field1719 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1719[var11] = arg0.method404();
                        if (this.field1719[var11] == 65535) {
                            this.field1719[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1708 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "a", descriptor = "(LSPZBTZXL;)V")
    public static final void method588(class51 arg0) {
        field1732 = new class34(arg0.method515("npc.dat", null), field1722);
        class34 var1 = new class34(arg0.method515("npc.idx", null), field1722);
        field1702 = var1.method404();
        field1723 = new int[field1702];
        int var2 = 2;
        for (int var3 = 0; var3 < field1702; var3++) {
            field1723[var3] = var2;
            var2 += var1.method404();
        }
        field1736 = new class71[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1736[var4] = new class71();
        }
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "a", descriptor = "(I)LZNUYRYPY;")
    public static final class71 method589(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1736[var1].field1710) {
                return field1736[var1];
            }
        }
        field1731 = (field1731 + 1) % 20;
        class71 var2 = field1736[field1731] = new class71();
        field1732.field1073 = field1723[arg0];
        var2.field1710 = arg0;
        var2.method587(field1732, 16191);
        return var2;
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "b", descriptor = "(I)LHEQROJXW;")
    public final class27 method590(int arg0) {
        if (arg0 != 3) {
            this.field1706 = !this.field1706;
        }
        if (this.field1719 != null) {
            class71 var2 = this.method591(0);
            return var2 == null ? null : var2.method590(3);
        } else if (this.field1714 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1714.length; var4++) {
                if (!class27.method323(this.field1714[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class27[] var5 = new class27[this.field1714.length];
            for (int var6 = 0; var6 < this.field1714.length; var6++) {
                var5[var6] = class27.method322(this.field1714[var6], (byte) 71);
            }
            class27 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class27((byte) 6, var5.length, var5);
            }
            if (this.field1701 != null) {
                for (int var8 = 0; var8 < this.field1701.length; var8++) {
                    var7.method336(this.field1701[var8], this.field1721[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "c", descriptor = "(I)LZNUYRYPY;")
    public final class71 method591(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1725 != -1) {
            class37 var3 = class37.field1110[this.field1725];
            int var4 = var3.field1112;
            int var5 = var3.field1113;
            int var6 = var3.field1114;
            int var7 = client.field176[var6 - var5];
            var2 = field1705.field455[var4] >> var5 & var7;
        } else if (this.field1698 != -1) {
            var2 = field1705.field455[this.field1698];
        }
        return var2 < 0 || var2 >= this.field1719.length || this.field1719[var2] == -1 ? null : method589(this.field1719[var2]);
    }

    @OriginalMember(owner = "ZNUYRYPY", name = "d", descriptor = "(I)V")
    public static final void method592(int arg0) {
        field1712 = null;
        field1723 = null;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field1736 = null;
        field1732 = null;
    }
}
