import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class112 extends class103 {

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    private int field1856 = 0;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Led;")
    private class49 field1843 = new class49(16);

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    private int field1864 = 0;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "Lud;")
    private class52 field1860 = new class52();

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "J")
    private long field1865 = 0L;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Lpb;")
    private class177 field1841;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Z")
    private boolean field1863;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Lud;")
    private class52 field1861;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Ln;")
    private class229 field1839;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Lpb;")
    private class177 field1855;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    private int field1845;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "Ltl;")
    private class252 field1830;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    private int field1846;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "Z")
    private boolean field1866;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lid;")
    private class104 field1859;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Lsk;")
    public static class199 field1832 = new class199(5);

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Lmh;")
    private static class62 field1857 = class201.method1405(true, "Cancel");

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Lmh;")
    public static class62 field1853 = field1857;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "Lhi;")
    public static class26 field1852;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Lhf;")
    private class276 field1851;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Z")
    private boolean field1862;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[B")
    private byte[] field1834;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V", line = 12)
    public final void method815(byte arg0, int arg1) {
        field1837++;
        if (this.field1841 == null || arg0 != 81) {
            return;
        }
        for (class206 var3 = this.field1860.method334(-18673); var3 != null; var3 = this.field1860.method335((byte) 99)) {
            if ((long) arg1 == var3.field3499) {
                return;
            }
        }
        class206 var4 = new class206();
        var4.field3499 = (long) arg1;
        this.field1860.method330(var4, arg0 ^ 0x18);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I", line = 42)
    public final int method816(int arg0, int arg1) {
        class104 var3 = (class104) this.field1843.method311((byte) 114, (long) arg1);
        field1838++;
        if (var3 == null) {
            if (arg0 != 255) {
                this.method817((byte) -47, 27);
            }
            return 0;
        } else {
            return var3.method285(100);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)I", line = 65)
    public final int method867(int arg0) {
        field1829++;
        if (arg0 != 3194) {
            this.field1864 = -107;
        }
        if (this.method814(-61) == null) {
            return this.field1859 == null ? 0 : this.field1859.method285(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 87)
    public static void method868(byte arg0) {
        field1832 = null;
        if (arg0 != -63) {
            field1857 = (class62) null;
        }
        field1853 = null;
        field1852 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)Lid;", line = 101)
    private final class104 method869(byte arg0, int arg1, int arg2) {
        class104 var4 = (class104) this.field1843.method311((byte) 114, (long) arg1);
        field1854++;
        if (var4 != null && arg2 == 0 && !var4.field1703 && var4.field1706) {
            var4.method1444((byte) 89);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1841 == null || this.field1834[arg1] == -1) {
                    if (this.field1830.method1760((byte) -117)) {
                        return null;
                    }
                    var4 = this.field1830.method1749(true, arg1, (byte) 2, this.field1847, -4);
                } else {
                    var4 = this.field1839.method1623(arg1, (byte) 126, this.field1841);
                }
            } else if (arg2 == 1) {
                if (this.field1841 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1839.method1615(arg1, this.field1841, true);
            } else if (arg2 == 2) {
                if (this.field1841 == null) {
                    throw new RuntimeException();
                }
                if (this.field1834[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1830.method1750((byte) -105)) {
                    return null;
                }
                var4 = this.field1830.method1749(false, arg1, (byte) 2, this.field1847, -4);
            } else {
                throw new RuntimeException();
            }
            this.field1843.method309(var4, (long) arg1, 1);
        }
        if (var4.field1706) {
            return null;
        } else if (arg0 == 69) {
            byte[] var5 = var4.method288(true);
            if (!var4 instanceof class251) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class226.field3933.reset();
                    class226.field3933.update(var5, 0, var5.length - 2);
                    int var6 = (int) class226.field3933.getValue();
                    if (this.field1851.field4729[arg1] != var6) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var14) {
                    this.field1830.method1754(true);
                    var4.method1444((byte) 89);
                    if (var4.field1703 && !this.field1830.method1760((byte) -128)) {
                        class43 var8 = this.field1830.method1749(true, arg1, (byte) 2, this.field1847, -4);
                        this.field1843.method309(var8, (long) arg1, arg0 ^ 0x44);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field1851.field4749[arg1] >>> 8);
                var5[var5.length - 1] = (byte) this.field1851.field4749[arg1];
                if (this.field1841 != null) {
                    this.field1839.method1616(arg1, this.field1841, (byte) -95, var5);
                    if (this.field1834[arg1] != 1) {
                        this.field1856++;
                        this.field1834[arg1] = 1;
                    }
                }
                if (!var4.field1703) {
                    var4.method1444((byte) 89);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class226.field3933.reset();
                class226.field3933.update(var5, 0, var5.length - 2);
                int var9 = (int) class226.field3933.getValue();
                if (this.field1851.field4729[arg1] != var9) {
                    throw new RuntimeException();
                }
                int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field1851.field4749[arg1] & 0xFFFF) != var10) {
                    throw new RuntimeException();
                }
                if (this.field1834[arg1] != 1) {
                    if (this.field1834[arg1] != 0) {
                    }
                    this.field1856++;
                    this.field1834[arg1] = 1;
                }
                if (!var4.field1703) {
                    var4.method1444((byte) 89);
                }
                return var4;
            } catch (Exception var13) {
                this.field1834[arg1] = -1;
                var4.method1444((byte) 89);
                if (var4.field1703 && !this.field1830.method1760((byte) -116)) {
                    class43 var12 = this.field1830.method1749(true, arg1, (byte) 2, this.field1847, -4);
                    this.field1843.method309(var12, (long) arg1, arg0 - 68);
                }
                return null;
            }
        } else {
            return (class104) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLgi;B)V", line = 310)
    public static final void method870(boolean arg0, class285 arg1, byte arg2) {
        if (arg2 <= 30) {
            return;
        }
        field1849++;
        if (arg0) {
            class44.field662 = 3;
            class229.method1624(0, false);
            class97.field1596 = 0;
            class276.field4733 = false;
            class169.field2744 = 127;
            class74.field1157 = false;
            class92.field1499 = false;
            class218.field3770 = false;
            class306.field5262 = false;
            class114.field1902 = 127;
            class235.field4039 = false;
            class113.field1877 = false;
            class72.field1107 = false;
            client.field5162 = false;
            class170.field2777 = false;
            class124.field2055 = 0;
            class100.field1650 = 255;
            class52.field756 = false;
            class301.field5179 = 0;
            class158.field2547 = false;
            class54.field795 = 0;
            class12.method47((byte) -89, arg1);
            return;
        }
        class44.field662 = 3;
        class202 var3 = null;
        class229.method1624(0, true);
        class306.field5262 = true;
        class276.field4733 = true;
        class124.field2055 = 0;
        class301.field5179 = 2;
        class100.field1650 = 255;
        class158.field2547 = true;
        class218.field3770 = true;
        class235.field4039 = true;
        class114.field1902 = 127;
        class113.field1877 = true;
        class169.field2744 = 127;
        class74.field1157 = true;
        client.field5162 = true;
        class52.field756 = true;
        class72.field1107 = true;
        class97.field1596 = 0;
        class54.field795 = 0;
        class170.field2777 = true;
        class92.field1499 = true;
        try {
            class147 var4 = arg1.method1951(-7135, "runescape");
            while (var4.field2322 == 0) {
                class99.method792(-1, 1L);
            }
            if (var4.field2322 == 1) {
                var3 = (class202) var4.field2323;
                byte[] var5 = new byte[(int) var3.method1416((byte) 25)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1418(var6, var5.length - var6, (byte) -121, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class4.method20(new class92(var5), -73);
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method1414(0);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lhf;", line = 417)
    public final class276 method814(int arg0) {
        field1840++;
        if (this.field1851 != null) {
            return this.field1851;
        }
        if (this.field1859 == null) {
            if (this.field1830.method1760((byte) -120)) {
                return null;
            }
            this.field1859 = this.field1830.method1749(true, this.field1847, (byte) 0, 255, -4);
        }
        if (this.field1859.field1706) {
            return null;
        } else if (arg0 >= -33) {
            return (class276) null;
        } else {
            byte[] var2 = this.field1859.method288(true);
            if (this.field1859 instanceof class251) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1851 = new class276(var2, this.field1846);
                    if (this.field1851.field4740 != this.field1845) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field1851 = null;
                    if (this.field1830.method1760((byte) -116)) {
                        this.field1859 = null;
                    } else {
                        this.field1859 = this.field1830.method1749(true, this.field1847, (byte) 0, 255, -4);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1851 = new class276(var2, this.field1846);
                } catch (RuntimeException var6) {
                    this.field1830.method1754(true);
                    this.field1851 = null;
                    if (this.field1830.method1760((byte) -110)) {
                        this.field1859 = null;
                    } else {
                        this.field1859 = this.field1830.method1749(true, this.field1847, (byte) 0, 255, -4);
                    }
                    return null;
                }
                if (this.field1855 != null) {
                    this.field1839.method1616(this.field1847, this.field1855, (byte) -108, var2);
                }
            }
            if (this.field1841 != null) {
                this.field1856 = 0;
                this.field1834 = new byte[this.field1851.field4738];
            }
            this.field1859 = null;
            return this.field1851;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V", line = 513)
    public final void method871(byte arg0) {
        field1848++;
        if (arg0 <= 109) {
            field1852 = (class26) null;
        }
        if (this.field1861 != null) {
            if (this.method814(-104) == null) {
                return;
            }
            if (this.field1863) {
                boolean var2 = true;
                for (class206 var3 = this.field1861.method334(-18673); var3 != null; var3 = this.field1861.method335((byte) 60)) {
                    int var4 = (int) var3.field3499;
                    if (this.field1834[var4] == 0) {
                        this.method869((byte) 69, var4, 1);
                    }
                    if (this.field1834[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1444((byte) 89);
                    }
                }
                while (this.field1864 < this.field1851.field4746.length) {
                    if (this.field1851.field4746[this.field1864] == 0) {
                        this.field1864++;
                    } else {
                        if (this.field1839.field3983 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1834[this.field1864] == 0) {
                            this.method869((byte) 69, this.field1864, 1);
                        }
                        if (this.field1834[this.field1864] == 0) {
                            var2 = false;
                            class206 var5 = new class206();
                            var5.field3499 = (long) this.field1864;
                            this.field1861.method330(var5, 116);
                        }
                        this.field1864++;
                    }
                }
                if (var2) {
                    this.field1864 = 0;
                    this.field1863 = false;
                }
            } else if (this.field1862) {
                boolean var6 = true;
                for (class206 var7 = this.field1861.method334(-18673); var7 != null; var7 = this.field1861.method335((byte) 123)) {
                    int var8 = (int) var7.field3499;
                    if (this.field1834[var8] != 1) {
                        this.method869((byte) 69, var8, 2);
                    }
                    if (this.field1834[var8] == 1) {
                        var7.method1444((byte) 89);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1864 < this.field1851.field4746.length) {
                    if (this.field1851.field4746[this.field1864] == 0) {
                        this.field1864++;
                    } else {
                        if (this.field1830.method1750((byte) -128)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1834[this.field1864] != 1) {
                            this.method869((byte) 69, this.field1864, 2);
                        }
                        if (this.field1834[this.field1864] != 1) {
                            class206 var9 = new class206();
                            var6 = false;
                            var9.field3499 = (long) this.field1864;
                            this.field1861.method330(var9, 119);
                        }
                        this.field1864++;
                    }
                }
                if (var6) {
                    this.field1864 = 0;
                    this.field1862 = false;
                }
            } else {
                this.field1861 = null;
            }
        }
        if (!this.field1866 || class293.method1985((byte) -71) < this.field1865) {
            return;
        }
        for (class104 var10 = (class104) this.field1843.method317(-93); var10 != null; var10 = (class104) this.field1843.method314(-98)) {
            if (!var10.field1706) {
                if (var10.field1704) {
                    if (!var10.field1703) {
                        throw new RuntimeException();
                    }
                    var10.method1444((byte) 89);
                } else {
                    var10.field1704 = true;
                }
            }
        }
        this.field1865 = class293.method1985((byte) -71) + 1000L;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 702)
    public final void method872(int arg0) {
        field1835++;
        if (this.field1861 == null || this.method814(-87) == null) {
            return;
        }
        for (class206 var2 = this.field1860.method334(-18673); var2 != null; var2 = this.field1860.method335((byte) 82)) {
            int var3 = (int) var2.field3499;
            if (var3 < 0 || var3 >= this.field1851.field4738 || this.field1851.field4746[var3] == 0) {
                var2.method1444((byte) 89);
            } else {
                if (this.field1834[var3] == 0) {
                    this.method869((byte) 69, var3, 1);
                }
                if (this.field1834[var3] == -1) {
                    this.method869((byte) 69, var3, 2);
                }
                if (this.field1834[var3] == 1) {
                    var2.method1444((byte) 89);
                }
            }
        }
        int var4 = 118 % ((arg0 - 63) / 55);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I", line = 747)
    public final int method873(boolean arg0) {
        if (arg0) {
            this.method869((byte) -116, 94, -16);
        }
        field1828++;
        return this.field1856;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(BI)[B", line = 759)
    public final byte[] method817(byte arg0, int arg1) {
        field1858++;
        class104 var3 = this.method869((byte) 69, arg1, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 < 10) {
            this.method817((byte) -57, -37);
        }
        byte[] var4 = var3.method288(true);
        var3.method1444((byte) 89);
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I", line = 781)
    public final int method874(int arg0) {
        field1850++;
        if (arg0 != 18203) {
            return 109;
        } else if (this.field1851 == null) {
            return 0;
        } else if (this.field1863) {
            class206 var2 = this.field1861.method334(-18673);
            return var2 == null ? 0 : (int) var2.field3499;
        } else {
            return this.field1851.field4745;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)I", line = 811)
    public final int method875(byte arg0) {
        if (arg0 >= -62) {
            this.method871((byte) -61);
        }
        field1833++;
        return this.field1851 == null ? 0 : this.field1851.field4745;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V", line = 827)
    public static final void method876(int arg0, int arg1, int arg2) {
        field1836++;
        class170.field2772.method1693(159, false);
        class170.field2772.method747((byte) 27, arg1);
        if (arg2 != -7355) {
            field1857 = (class62) null;
        }
        class170.field2772.method745(27265, arg0);
        class250.field4238++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ltd;I)V", line = 847)
    public static final void method877(class222 arg0, int arg1) {
        field1842++;
        if (arg0.field3816 == 0) {
            return;
        }
        if (arg0.field3848 != -1 && arg0.field3848 < 32768) {
            class204 var2 = class301.field5186[arg0.field3848];
            if (var2 != null) {
                int var3 = arg0.field3821 - var2.field3821;
                int var4 = arg0.field3814 - var2.field3814;
                if (var3 != 0 || var4 != 0) {
                    arg0.field3862 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3848 >= 32768) {
            int var5 = arg0.field3848 - 32768;
            if (class156.field2523 == var5) {
                var5 = 2047;
            }
            class153 var6 = class5.field50[var5];
            if (var6 != null) {
                int var7 = arg0.field3821 - var6.field3821;
                int var8 = arg0.field3814 - var6.field3814;
                if (var7 != 0 || var8 != 0) {
                    arg0.field3862 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field3861 != 0 || arg0.field3835 != 0) && (arg0.field3808 == 0 || arg0.field3858 > 0)) {
            int var9 = arg0.field3821 + ((arg0.method1101(true) - 1) * 64) - ((-class120.field2006 + arg0.field3861 - class120.field2006) * 64);
            int var10 = arg0.field3814 - ((-class290.field4936 + arg0.field3835 - class290.field4936) * 64 + 64 - (arg0.method1101(true) * 64));
            if (var9 != 0 || var10 != 0) {
                arg0.field3862 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field3861 = 0;
            arg0.field3835 = 0;
        }
        int var11 = arg0.field3862 - arg0.field3856 & 0x7FF;
        if (arg1 == var11) {
            arg0.field3822 = 0;
            return;
        }
        arg0.field3822++;
        if (var11 > 1024) {
            arg0.field3856 -= arg0.field3816;
            boolean var12 = true;
            if (arg0.field3816 > var11 || var11 > 2048 - arg0.field3816) {
                var12 = false;
                arg0.field3856 = arg0.field3862;
            }
            if (arg0.field3879 == arg0.field3876 && (arg0.field3822 > 25 || var12)) {
                if (arg0.field3815 == -1) {
                    arg0.field3876 = arg0.field3831;
                } else {
                    arg0.field3876 = arg0.field3815;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field3856 += arg0.field3816;
            if (var11 < arg0.field3816 || var11 > 2048 - arg0.field3816) {
                arg0.field3856 = arg0.field3862;
                var13 = false;
            }
            if (arg0.field3879 == arg0.field3876 && (arg0.field3822 > 25 || var13)) {
                if (arg0.field3870 == -1) {
                    arg0.field3876 = arg0.field3831;
                } else {
                    arg0.field3876 = arg0.field3870;
                }
            }
        }
        arg0.field3856 &= 0x7FF;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V", line = 971)
    public final void method878(int arg0) {
        field1831++;
        if (this.field1841 == null) {
            return;
        }
        this.field1862 = true;
        if (arg0 != 2037) {
            this.field1866 = true;
        }
        if (this.field1861 == null) {
            this.field1861 = new class52();
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)I", line = 993)
    public static final int method879(int arg0, int arg1) {
        if (arg0 == -20074) {
            field1844++;
            return arg1 & 0x7F;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(ILpb;Lpb;Ltl;Ln;IIZ)V", line = 1038)
    public class112(int arg0, class177 arg1, class177 arg2, class252 arg3, class229 arg4, int arg5, int arg6, boolean arg7) {
        this.field1841 = arg1;
        this.field1847 = arg0;
        if (this.field1841 == null) {
            this.field1863 = false;
        } else {
            this.field1863 = true;
            this.field1861 = new class52();
        }
        this.field1839 = arg4;
        this.field1855 = arg2;
        this.field1845 = arg6;
        this.field1830 = arg3;
        this.field1846 = arg5;
        this.field1866 = arg7;
        if (this.field1855 != null) {
            this.field1859 = this.field1839.method1623(this.field1847, (byte) 111, this.field1855);
        }
    }
}
