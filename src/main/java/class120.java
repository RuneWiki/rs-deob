import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class120 extends class26 {

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    private int field1741 = 0;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "Lnj;")
    private class144 field1739 = new class144(16);

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    private int field1760 = 0;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Led;")
    private class187 field1758 = new class187();

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "J")
    private long field1763 = 0L;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "Lii;")
    private class263 field1752;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
    private boolean field1759;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "Led;")
    private class187 field1756;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    private int field1754;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Ldg;")
    private class142 field1735;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lug;")
    private class205 field1731;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
    private boolean field1762;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Lii;")
    private class263 field1748;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Lgd;")
    private class76 field1732;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Led;")
    public static class187 field1747 = new class187();

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Lw;")
    private class146 field1753;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Llc;")
    public static class86 field1755;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Z")
    private boolean field1761;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[B")
    private byte[] field1745;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method873(int arg0) {
        field1738++;
        if (this.field1756 != null) {
            if (this.method189((byte) -82) == null) {
                return;
            }
            if (this.field1759) {
                boolean var2 = true;
                for (class280 var3 = this.field1756.method1384(2); var3 != null; var3 = this.field1756.method1388((byte) 97)) {
                    int var5 = (int) var3.field4459;
                    if (this.field1745[var5] == 0) {
                        this.method881(1, (byte) 115, var5);
                    }
                    if (this.field1745[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1922(-1);
                    }
                }
                while (this.field1753.field2393.length > this.field1760) {
                    if (this.field1753.field2393[this.field1760] == 0) {
                        this.field1760++;
                    } else {
                        if (this.field1735.field2294 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1745[this.field1760] == 0) {
                            this.method881(1, (byte) 90, this.field1760);
                        }
                        if (this.field1745[this.field1760] == 0) {
                            var2 = false;
                            class280 var4 = new class280();
                            var4.field4459 = (long) this.field1760;
                            this.field1756.method1385(var4, true);
                        }
                        this.field1760++;
                    }
                }
                if (var2) {
                    this.field1760 = 0;
                    this.field1759 = false;
                }
            } else if (this.field1761) {
                boolean var6 = true;
                for (class280 var7 = this.field1756.method1384(2); var7 != null; var7 = this.field1756.method1388((byte) 74)) {
                    int var9 = (int) var7.field4459;
                    if (this.field1745[var9] != 1) {
                        this.method881(2, (byte) 103, var9);
                    }
                    if (this.field1745[var9] == 1) {
                        var7.method1922(-1);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1760 < this.field1753.field2393.length) {
                    if (this.field1753.field2393[this.field1760] == 0) {
                        this.field1760++;
                    } else {
                        if (this.field1731.method1494((byte) -57)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1745[this.field1760] != 1) {
                            this.method881(2, (byte) -107, this.field1760);
                        }
                        if (this.field1745[this.field1760] != 1) {
                            var6 = false;
                            class280 var8 = new class280();
                            var8.field4459 = (long) this.field1760;
                            this.field1756.method1385(var8, true);
                        }
                        this.field1760++;
                    }
                }
                if (var6) {
                    this.field1761 = false;
                    this.field1760 = 0;
                }
            } else {
                this.field1756 = null;
            }
        }
        int var10 = -83 % ((arg0 - 6) / 54);
        if (!this.field1762 || this.field1763 > class197.method1454((byte) -104)) {
            return;
        }
        for (class76 var11 = (class76) this.field1739.method1033(-9843); var11 != null; var11 = (class76) this.field1739.method1031((byte) -7)) {
            if (!var11.field1090) {
                if (var11.field1095) {
                    if (!var11.field1094) {
                        throw new RuntimeException();
                    }
                    var11.method1922(-1);
                } else {
                    var11.field1095 = true;
                }
            }
        }
        this.field1763 = class197.method1454((byte) -104) + 1000L;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Lw;")
    public final class146 method189(byte arg0) {
        field1743++;
        if (this.field1753 != null) {
            return this.field1753;
        }
        if (this.field1732 == null) {
            if (this.field1731.method1506((byte) 115)) {
                return null;
            }
            this.field1732 = this.field1731.method1502(this.field1742, true, 21863, (byte) 0, 255);
        }
        if (this.field1732.field1090) {
            return null;
        }
        byte[] var2 = this.field1732.method462(1);
        if (arg0 >= -62) {
            method875(-54, (class152) null);
        }
        if (this.field1732 instanceof class198) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1753 = new class146(var2, this.field1754);
                if (this.field1753.field2387 != this.field1728) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1753 = null;
                if (this.field1731.method1506((byte) 90)) {
                    this.field1732 = null;
                } else {
                    this.field1732 = this.field1731.method1502(this.field1742, true, 21863, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1753 = new class146(var2, this.field1754);
            } catch (RuntimeException var4) {
                this.field1731.method1507(30000);
                this.field1753 = null;
                if (this.field1731.method1506((byte) 79)) {
                    this.field1732 = null;
                } else {
                    this.field1732 = this.field1731.method1502(this.field1742, true, 21863, (byte) 0, 255);
                }
                return null;
            }
            if (this.field1748 != null) {
                this.field1735.method1017(var2, this.field1748, this.field1742, (byte) -124);
            }
        }
        this.field1732 = null;
        if (this.field1752 != null) {
            this.field1741 = 0;
            this.field1745 = new byte[this.field1753.field2396];
        }
        return this.field1753;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public static final void method874(int arg0) {
        class275.field4416.method1556((byte) 97);
        field1734++;
        if (arg0 != 255) {
            method878(-81);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILv;)Ljava/lang/String;")
    public static final String method875(int arg0, class152 arg1) {
        field1757++;
        return arg0 == 100 ? class182.method1352(32767, arg0 ^ 0xD, arg1) : null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
    public final int method876(byte arg0) {
        field1736++;
        if (this.field1753 == null) {
            return 0;
        } else if (arg0 <= 52) {
            return -7;
        } else {
            return this.field1753.field2403;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final void method877(int arg0) {
        field1737++;
        if (this.field1756 == null || this.method189((byte) -106) == null) {
            return;
        }
        for (class280 var2 = this.field1758.method1384(2); var2 != null; var2 = this.field1758.method1388((byte) 69)) {
            int var3 = (int) var2.field4459;
            if (var3 < 0 || this.field1753.field2396 <= var3 || this.field1753.field2393[var3] == 0) {
                var2.method1922(-1);
            } else {
                if (this.field1745[var3] == 0) {
                    this.method881(1, (byte) 105, var3);
                }
                if (this.field1745[var3] == -1) {
                    this.method881(2, (byte) 77, var3);
                }
                if (this.field1745[var3] == 1) {
                    var2.method1922(-1);
                }
            }
        }
        if (arg0 > 0) {
            method875(-71, (class152) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
    public static void method878(int arg0) {
        if (arg0 == 255) {
            field1755 = null;
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public final void method188(int arg0, boolean arg1) {
        field1751++;
        if (this.field1752 == null) {
            return;
        }
        for (class280 var3 = this.field1758.method1384(2); var3 != null; var3 = this.field1758.method1388((byte) 118)) {
            if ((long) arg0 == var3.field4459) {
                return;
            }
        }
        class280 var4 = new class280();
        var4.field4459 = (long) arg0;
        this.field1758.method1385(var4, arg1);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public final void method879(byte arg0) {
        field1746++;
        if (arg0 > -83) {
            this.field1732 = null;
        }
        if (this.field1752 != null) {
            this.field1761 = true;
            if (this.field1756 == null) {
                this.field1756 = new class187();
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
    public static final boolean method880(boolean arg0) {
        field1744++;
        class212 var1 = class220.field3524;
        synchronized (class220.field3524) {
            if (class84.field1210 == class114.field1652) {
                return false;
            }
            class228.field3653 = class178.field2879[class84.field1210];
            if (arg0) {
                field1747 = null;
            }
            class185.field2985 = class277.field4441[class84.field1210];
            class84.field1210 = class84.field1210 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)Lgd;")
    private final class76 method881(int arg0, byte arg1, int arg2) {
        field1750++;
        class76 var4 = (class76) this.field1739.method1034((long) arg2, (byte) 21);
        if (var4 != null && arg0 == 0 && !var4.field1094 && var4.field1090) {
            var4.method1922(-1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field1752 == null || this.field1745[arg2] == -1) {
                    if (this.field1731.method1506((byte) 109)) {
                        return null;
                    }
                    var4 = this.field1731.method1502(arg2, true, 21863, (byte) 2, this.field1742);
                } else {
                    var4 = this.field1735.method1015(this.field1752, 2, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field1752 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1735.method1018(arg2, false, this.field1752);
            } else if (arg0 == 2) {
                if (this.field1752 == null) {
                    throw new RuntimeException();
                }
                if (this.field1745[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1731.method1494((byte) -57)) {
                    return null;
                }
                var4 = this.field1731.method1502(arg2, false, 21863, (byte) 2, this.field1742);
            } else {
                throw new RuntimeException();
            }
            this.field1739.method1032(false, var4, (long) arg2);
        }
        if (var4.field1090) {
            return null;
        }
        int var5 = -112 / ((arg1 - 4) / 45);
        byte[] var6 = var4.method462(1);
        if (!var4 instanceof class198) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class27.field311.reset();
                class27.field311.update(var6, 0, var6.length - 2);
                int var10 = (int) class27.field311.getValue();
                if (this.field1753.field2401[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field1731.field3307 = 0;
                this.field1731.field3306 = 0;
            } catch (RuntimeException var13) {
                this.field1731.method1507(30000);
                var4.method1922(-1);
                if (var4.field1094 && !this.field1731.method1506((byte) 100)) {
                    class63 var11 = this.field1731.method1502(arg2, true, 21863, (byte) 2, this.field1742);
                    this.field1739.method1032(false, var11, (long) arg2);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field1753.field2383[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field1753.field2383[arg2];
            if (this.field1752 != null) {
                this.field1735.method1017(var6, this.field1752, arg2, (byte) -116);
                if (this.field1745[arg2] != 1) {
                    this.field1741++;
                    this.field1745[arg2] = 1;
                }
            }
            if (!var4.field1094) {
                var4.method1922(-1);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class27.field311.reset();
            class27.field311.update(var6, 0, var6.length - 2);
            int var7 = (int) class27.field311.getValue();
            if (this.field1753.field2401[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field1753.field2383[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field1745[arg2] != 1) {
                this.field1741++;
                this.field1745[arg2] = 1;
            }
            if (!var4.field1094) {
                var4.method1922(-1);
            }
            return var4;
        } catch (Exception var12) {
            this.field1745[arg2] = -1;
            var4.method1922(-1);
            if (var4.field1094 && !this.field1731.method1506((byte) 108)) {
                class63 var9 = this.field1731.method1502(arg2, true, 21863, (byte) 2, this.field1742);
                this.field1739.method1032(false, var9, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
    public final int method185(int arg0, int arg1) {
        field1740++;
        if (arg0 != -1) {
            this.field1758 = null;
        }
        class76 var3 = (class76) this.field1739.method1034((long) arg1, (byte) 21);
        return var3 == null ? 0 : var3.method461((byte) 98);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[B")
    public final byte[] method186(int arg0, int arg1) {
        if (arg1 >= -57) {
            return null;
        }
        class76 var3 = this.method881(0, (byte) 62, arg0);
        field1730++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method462(1);
            var3.method1922(-1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)I")
    public final int method882(boolean arg0) {
        if (arg0) {
            return 35;
        } else {
            field1729++;
            return this.field1741;
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)I")
    public final int method883(int arg0) {
        field1733++;
        if (this.method189((byte) -99) == null) {
            return this.field1732 == null ? 0 : this.field1732.method461((byte) 101);
        } else {
            int var2 = -56 % ((12 - arg0) / 49);
            return 100;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)I")
    public final int method884(boolean arg0) {
        field1749++;
        if (arg0) {
            return -105;
        } else if (this.field1753 == null) {
            return 0;
        } else if (this.field1759) {
            class280 var2 = this.field1756.method1384(2);
            return var2 == null ? 0 : (int) var2.field4459;
        } else {
            return this.field1753.field2403;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(ILii;Lii;Lug;Ldg;IIZ)V")
    public class120(int arg0, class263 arg1, class263 arg2, class205 arg3, class142 arg4, int arg5, int arg6, boolean arg7) {
        this.field1742 = arg0;
        this.field1752 = arg1;
        if (this.field1752 == null) {
            this.field1759 = false;
        } else {
            this.field1759 = true;
            this.field1756 = new class187();
        }
        this.field1754 = arg5;
        this.field1735 = arg4;
        this.field1728 = arg6;
        this.field1731 = arg3;
        this.field1762 = arg7;
        this.field1748 = arg2;
        if (this.field1748 != null) {
            this.field1732 = this.field1735.method1015(this.field1748, 2, this.field1742);
        }
    }
}
