import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class123 {

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lqh;")
    private class201 field1812 = null;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lr;")
    private class41 field1810;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "Z")
    private boolean field1841;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Z")
    private boolean field1823;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Z")
    public static boolean field1815 = true;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "[Z")
    public static boolean[] field1844 = new boolean[112];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Ldl;")
    public static class123 field1838;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lkf;")
    public static class180 field1811;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[Ljava/lang/Object;")
    private Object[] field1805;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1847;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
    public final int method805(int arg0) {
        field1837++;
        if (!this.method829(100)) {
            return 0;
        } else if (arg0 == 1) {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1805.length; var4++) {
                if (this.field1812.field3155[var4] > 0) {
                    var2 += this.method832(var4, (byte) -104);
                    var3 += 100;
                }
            }
            if (var3 == 0) {
                return 100;
            } else {
                return var2 * 100 / var3;
            }
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Z")
    public final boolean method806(int arg0, int arg1) {
        field1831++;
        if (!this.method829(100)) {
            return false;
        } else if (this.field1812.field3139.length == 1) {
            return this.method835(0, 0, arg1);
        } else {
            if (arg0 < 12) {
                this.method819((String) null, (String) null, 79);
            }
            if (!this.method815((byte) 110, arg1)) {
                return false;
            } else if (this.field1812.field3139[arg1] == 1) {
                return this.method835(arg1, 0, 0);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)[B")
    public final byte[] method807(byte arg0, int arg1, int arg2) {
        if (arg0 <= 76) {
            return null;
        } else {
            field1816++;
            return this.method833(arg2, arg1, 1, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBI)[B")
    public final byte[] method808(int arg0, byte arg1, int arg2) {
        field1808++;
        int var4 = -90 % ((58 - arg1) / 58);
        if (!this.method810(false, arg0, arg2)) {
            return null;
        }
        if (this.field1847[arg2] == null || this.field1847[arg2][arg0] == null) {
            boolean var5 = this.method838((int[]) null, arg2, -29234);
            if (!var5) {
                this.method811(-64, arg2);
                boolean var6 = this.method838((int[]) null, arg2, -29234);
                if (!var6) {
                    return null;
                }
            }
        }
        return class194.method1350(0, false, this.field1847[arg2][arg0]);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
    public final int method809(int arg0) {
        field1828++;
        if (arg0 != -1) {
            return -60;
        } else if (this.method829(100)) {
            return this.field1812.field3151;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII)Z")
    private final boolean method810(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        }
        field1842++;
        if (!this.method829(100)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field1812.field3139.length > arg2 && this.field1812.field3139[arg2] > arg1) {
            return true;
        } else if (class158.field2437) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)V")
    private final void method811(int arg0, int arg1) {
        field1817++;
        if (this.field1841) {
            this.field1805[arg1] = this.field1810.method323(arg1, 100);
        } else {
            this.field1805[arg1] = class38.method307(false, this.field1810.method323(arg1, 100), -137);
        }
        if (arg0 > -52) {
            this.method813((String) null, 35);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
    public final int method812(int arg0) {
        int var2 = 25 % ((arg0 - 63) / 32);
        field1836++;
        return this.method829(100) ? this.field1812.field3139.length : -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method813(String arg0, int arg1) {
        field1839++;
        if (arg1 != -1) {
            field1844 = null;
        }
        if (this.method829(100)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1812.field3148.method1381((byte) 98, class239.method1619((byte) 121, var3));
            return this.method815((byte) 86, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method814(String arg0, boolean arg1) {
        if (!arg1) {
            return true;
        }
        field1834++;
        if (this.method829(100)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1812.field3148.method1381((byte) 93, class239.method1619((byte) 96, var3));
            return this.method823(var4, -8069);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Z")
    private final boolean method815(byte arg0, int arg1) {
        int var3 = -43 % ((-arg0 - 5) / 60);
        field1825++;
        if (!this.method829(100)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field1812.field3139.length && this.field1812.field3139[arg1] != 0) {
            return true;
        } else if (class158.field2437) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method816(String arg0, byte arg1) {
        field1846++;
        if (!this.method829(100)) {
            return 0;
        }
        if (arg1 != 80) {
            this.field1812 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1812.field3148.method1381((byte) -43, class239.method1619((byte) 120, var3));
        return this.method832(var4, (byte) -88);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(BI)[I")
    public final int[] method817(byte arg0, int arg1) {
        if (arg0 <= 66) {
            this.method835(120, -119, -87);
        }
        field1807++;
        if (!this.method815((byte) -78, arg1)) {
            return null;
        }
        int[] var3 = this.field1812.field3149[arg1];
        if (var3 == null) {
            var3 = new int[this.field1812.field3155[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Ljava/lang/String;Z)V")
    public final void method818(String arg0, boolean arg1) {
        field1809++;
        if (!this.method829(100)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1812.field3148.method1381((byte) 124, class239.method1619((byte) 113, var3));
        if (!arg1) {
            this.method831((byte) 112, -7);
        }
        this.method827(var4, 27835);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method819(String arg0, String arg1, int arg2) {
        field1818++;
        if (arg2 != -198) {
            this.method829(47);
        }
        if (!this.method829(100)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field1812.field3148.method1381((byte) -65, class239.method1619((byte) 89, var4));
        if (this.method815((byte) 80, var6)) {
            int var7 = this.field1812.field3145[var6].method1381((byte) 127, class239.method1619((byte) 109, var5));
            return this.method807((byte) 116, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)I")
    public final int method820(int arg0, int arg1) {
        if (arg1 != 112) {
            method837(3, -39, 84, 8, 75, 51, -11);
        }
        field1819++;
        return this.method815((byte) -74, arg0) ? this.field1812.field3139[arg0] : 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method821(int arg0, String arg1) {
        field1829++;
        if (!this.method829(100)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1812.field3148.method1381((byte) -16, class239.method1619((byte) 108, var3));
        if (var4 < 0) {
            return false;
        } else {
            int var5 = -16 % ((arg0 - 34) / 61);
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(ZII)V")
    public static final void method822(boolean arg0, int arg1, int arg2) {
        field1820++;
        class287 var3 = class261.method1786(arg1, arg0, 7);
        if (arg0) {
            method837(111, -14, -23, -78, 8, 9, 32);
        }
        var3.method1914((byte) 46);
        var3.field4547 = arg2;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(II)Z")
    public final boolean method823(int arg0, int arg1) {
        field1835++;
        if (arg1 != -8069) {
            this.field1805 = null;
        }
        if (!this.method815((byte) 118, arg0)) {
            return false;
        } else if (this.field1805[arg0] == null) {
            this.method811(arg1 + 7982, arg0);
            return this.field1805[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public final void method824(int arg0) {
        if (this.field1847 != null) {
            for (int var2 = 0; var2 < this.field1847.length; var2++) {
                this.field1847[var2] = null;
            }
        }
        if (arg0 == 0) {
            field1804++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method825(byte arg0) {
        field1811 = null;
        field1838 = null;
        field1844 = null;
        if (arg0 != -56) {
            method822(false, 34, -25);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZZ)V")
    public final void method826(int arg0, boolean arg1, boolean arg2) {
        field1826++;
        if (!this.method829(100)) {
            return;
        }
        if (arg1) {
            this.field1812.field3137 = null;
            this.field1812.field3148 = null;
        }
        if (arg2) {
            this.field1812.field3146 = null;
            this.field1812.field3145 = null;
        }
        if (arg0 <= 86) {
            this.method820(52, -112);
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(II)V")
    private final void method827(int arg0, int arg1) {
        this.field1810.method326((byte) -111, arg0);
        field1806++;
        if (arg1 != 27835) {
            this.field1841 = true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method828(String arg0, String arg1, int arg2) {
        field1832++;
        if (!this.method829(arg2 + 98)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 != 2) {
            this.method809(32);
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field1812.field3148.method1381((byte) -35, class239.method1619((byte) 91, var4));
        if (this.method815((byte) -105, var6)) {
            int var7 = this.field1812.field3145[var6].method1381((byte) 118, class239.method1619((byte) 90, var5));
            return this.method835(var6, 0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Z")
    private final boolean method829(int arg0) {
        if (arg0 != 100) {
            this.method814((String) null, false);
        }
        field1822++;
        if (this.field1812 == null) {
            this.field1812 = this.field1810.method320(-117);
            if (this.field1812 == null) {
                return false;
            }
            this.field1805 = new Object[this.field1812.field3135];
            this.field1847 = new Object[this.field1812.field3135][];
        }
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(II)Lnc;")
    public static final class85 method830(int arg0, int arg1) {
        field1833++;
        if (arg1 != -1) {
            return null;
        }
        class85 var2 = (class85) class248.field3960.method1428((long) arg0, (byte) -88);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class216.field3532.method807((byte) 95, arg0, 32);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method586(new class25(var3), 0);
        }
        var4.method591((byte) 100);
        class248.field3960.method1424((long) arg0, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(BI)V")
    public final void method831(byte arg0, int arg1) {
        if (arg0 == -90) {
            field1824++;
            if (this.method815((byte) -78, arg1) && this.field1847 != null) {
                this.field1847[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)I")
    private final int method832(int arg0, byte arg1) {
        field1843++;
        if (!this.method815((byte) -107, arg0)) {
            return 0;
        } else if (this.field1805[arg0] == null) {
            if (arg1 > -70) {
                this.field1812 = null;
            }
            return this.field1810.method322((byte) -124, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[I)[B")
    public final byte[] method833(int arg0, int arg1, int arg2, int[] arg3) {
        field1814++;
        if (arg2 != 1) {
            return null;
        } else if (this.method810(false, arg1, arg0)) {
            if (this.field1847[arg0] == null || this.field1847[arg0][arg1] == null) {
                boolean var5 = this.method838(arg3, arg0, -29234);
                if (!var5) {
                    this.method811(-95, arg0);
                    boolean var6 = this.method838(arg3, arg0, arg2 - 29235);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = class194.method1350(arg2 - 1, false, this.field1847[arg0][arg1]);
            if (this.field1823) {
                this.field1847[arg0][arg1] = null;
                if (this.field1812.field3139[arg0] == 1) {
                    this.field1847[arg0] = null;
                }
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)[B")
    public final byte[] method834(boolean arg0, int arg1) {
        field1840++;
        if (!arg0) {
            field1844 = null;
        }
        if (!this.method829(100)) {
            return null;
        } else if (this.field1812.field3139.length == 1) {
            return this.method807((byte) 113, arg1, 0);
        } else if (!this.method815((byte) -79, arg1)) {
            return null;
        } else if (this.field1812.field3139[arg1] == 1) {
            return this.method807((byte) 113, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
    public final boolean method835(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1812 = null;
        }
        field1813++;
        if (!this.method810(false, arg2, arg0)) {
            return false;
        } else if (this.field1847[arg0] != null && this.field1847[arg0][arg2] != null) {
            return true;
        } else if (this.field1805[arg0] == null) {
            this.method811(-87, arg0);
            return this.field1805[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)Z")
    public final boolean method836(int arg0) {
        field1827++;
        if (!this.method829(arg0 ^ 0x7843)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 30759) {
            return false;
        }
        for (int var3 = 0; var3 < this.field1812.field3136.length; var3++) {
            int var4 = this.field1812.field3136[var3];
            if (this.field1805[var4] == null) {
                this.method811(-95, var4);
                if (this.field1805[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 32) {
            method825((byte) -16);
        }
        field1845++;
        if (class51.field710 <= arg6 - arg2 && arg2 + arg6 <= class96.field1484 && arg4 - arg2 >= class110.field1669 && class189.field2984 >= (arg2 + arg4)) {
            class264.method1804(arg6, arg1, arg0, arg2, arg5, arg3 - 32, arg4);
        } else {
            class219.method1479(arg4, arg2, arg5, arg3 ^ 0xFFFFFF8E, arg0, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([III)Z")
    private final boolean method838(int[] arg0, int arg1, int arg2) {
        field1821++;
        if (!this.method815((byte) 103, arg1)) {
            return false;
        } else if (this.field1805[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1812.field3155[arg1];
            boolean var5 = true;
            int[] var6 = this.field1812.field3149[arg1];
            if (this.field1847[arg1] == null) {
                this.field1847[arg1] = new Object[this.field1812.field3139[arg1]];
            }
            Object[] var7 = this.field1847[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var6 == null) {
                    var9 = var8;
                } else {
                    var9 = var6[var8];
                }
                if (var7[var9] == null) {
                    var5 = false;
                    break;
                }
            }
            if (var5) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class194.method1350(0, true, this.field1805[arg1]);
                class25 var11 = new class25(var10);
                var11.method195(var11.field339.length, 5, -13, arg0);
            } else {
                var10 = class194.method1350(0, false, this.field1805[arg1]);
            }
            byte[] var12;
            try {
                var12 = class23.method158(var10, 107);
            } catch (RuntimeException var31) {
                throw class53.method389(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class107.method701((byte) 49, var10, var10.length) + "," + class107.method701((byte) 57, var10, var10.length - 2) + "," + this.field1812.field3150[arg1] + "," + this.field1812.field3151);
            }
            if (this.field1841) {
                this.field1805[arg1] = null;
            }
            if (arg2 != -29234) {
                return true;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class25 var16 = new class25(var12);
                int var17 = var32 - var15 * 4 * var4;
                var16.field349 = var17;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method214((byte) 44);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                int var24 = 0;
                var16.field349 = var17;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method214((byte) 44);
                        class196.method1357(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var6 == null) {
                        var29 = var28;
                    } else {
                        var29 = var6[var28];
                    }
                    if (this.field1823) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class38.method307(false, var22[var28], -137);
                    }
                }
            } else {
                int var30;
                if (var6 == null) {
                    var30 = 0;
                } else {
                    var30 = var6[0];
                }
                if (this.field1823) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class38.method307(false, var12, -137);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lr;ZZ)V")
    public class123(class41 arg0, boolean arg1, boolean arg2) {
        this.field1810 = arg0;
        this.field1841 = arg1;
        this.field1823 = arg2;
    }
}
