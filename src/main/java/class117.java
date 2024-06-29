import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class117 extends class217 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field1822 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
    public static boolean field1829 = false;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lqb;")
    public class101 field1826;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lld;")
    public class121 field1833;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lfk;")
    public class45 field1828;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Lwa;")
    public class82 field1842;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Lwa;")
    public class82 field1848;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Z")
    public boolean field1825;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
    public int[] field1835;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([Ljava/lang/String;IZI)Ljava/lang/String;", line = 4)
    public static final String method906(String[] arg0, int arg1, boolean arg2, int arg3) {
        field1824++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var8 = arg0[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg1; var10 < var5; var10++) {
                String var11 = arg0[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            if (arg2) {
                method906((String[]) null, 92, true, 105);
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 77)
    public static final void method907(int arg0) {
        if (arg0 != 3) {
            method906((String[]) null, -121, true, 23);
        }
        int var1 = class88.field1293.method63(arg0 + 111, 8);
        if (var1 < class262.field3900) {
            for (int var2 = var1; var2 < class262.field3900; var2++) {
                class224.field3493[class167.field2521++] = class225.field3504[var2];
            }
        }
        field1846++;
        if (var1 > class262.field3900) {
            throw new RuntimeException("gppov1");
        }
        class262.field3900 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class225.field3504[var3];
            class121 var5 = class319.field4964[var4];
            int var6 = class88.field1293.method63(arg0 + 110, 1);
            if (var6 == 0) {
                class225.field3504[class262.field3900++] = var4;
                var5.field4481 = class312.field4852;
            } else {
                int var7 = class88.field1293.method63(126, 2);
                if (var7 == 0) {
                    class225.field3504[class262.field3900++] = var4;
                    var5.field4481 = class312.field4852;
                    class227.field3515[class122.field1922++] = var4;
                } else if (var7 == 1) {
                    class225.field3504[class262.field3900++] = var4;
                    var5.field4481 = class312.field4852;
                    int var12 = class88.field1293.method63(120, 3);
                    var5.method2034(var12, (byte) 98, 1);
                    int var13 = class88.field1293.method63(arg0 + 123, 1);
                    if (var13 == 1) {
                        class227.field3515[class122.field1922++] = var4;
                    }
                } else if (var7 == 2) {
                    class225.field3504[class262.field3900++] = var4;
                    var5.field4481 = class312.field4852;
                    if (class88.field1293.method63(120, 1) == 1) {
                        int var9 = class88.field1293.method63(arg0 + 110, 3);
                        var5.method2034(var9, (byte) 119, 2);
                        int var10 = class88.field1293.method63(119, 3);
                        var5.method2034(var10, (byte) 118, 2);
                    } else {
                        int var8 = class88.field1293.method63(arg0 + 119, 3);
                        var5.method2034(var8, (byte) 92, 0);
                    }
                    int var11 = class88.field1293.method63(116, 1);
                    if (var11 == 1) {
                        class227.field3515[class122.field1922++] = var4;
                    }
                } else if (var7 == 3) {
                    class224.field3493[class167.field2521++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 199)
    public final void method908(int arg0) {
        field1838++;
        if (arg0 != 2) {
            this.field1842 = (class82) null;
        }
        int var2 = this.field1837;
        if (this.field1826 != null) {
            class101 var3 = this.field1826.method784(true);
            if (var3 == null) {
                this.field1830 = 0;
                this.field1835 = null;
                this.field1820 = 0;
                this.field1847 = 0;
                this.field1837 = -1;
            } else {
                this.field1835 = var3.field1561;
                this.field1847 = var3.field1564;
                this.field1830 = var3.field1510 * 128;
                this.field1837 = var3.field1559;
                this.field1820 = var3.field1504;
            }
        } else if (this.field1828 != null) {
            int var4 = class104.method806((byte) -126, this.field1828);
            if (var2 != var4) {
                this.field1837 = var4;
                class183 var5 = this.field1828.field698;
                if (var5.field2738 != null) {
                    var5 = var5.method1329(108);
                }
                if (var5 == null) {
                    this.field1830 = 0;
                } else {
                    this.field1830 = var5.field2746 * 128;
                }
            }
        } else if (this.field1833 != null) {
            this.field1837 = class288.method2029(false, this.field1833);
            this.field1830 = this.field1833.field1898 * 128;
        }
        if (this.field1837 != var2 && this.field1842 != null) {
            class200.field3165.method2162(this.field1842);
            this.field1842 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Llb;Llb;I)V", line = 274)
    public static final void method909(class211 arg0, class211 arg1, int arg2) {
        class55.field820 = arg1;
        int var3 = -43 % ((arg2 + 68) / 39);
        class22.field243 = arg0;
        field1845++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V", line = 290)
    public static final void method910(byte arg0) {
        class244.field3675.method1433(30);
        field1823++;
        if (arg0 != 28) {
            field1829 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLlb;Llb;Llb;Llb;)V", line = 306)
    public static final void method911(boolean arg0, class211 arg1, class211 arg2, class211 arg3, class211 arg4) {
        class207.field3263 = arg4;
        class281.field4344 = arg3;
        class37.field563 = arg1;
        field1831++;
        class261.field3863 = arg2;
        if (arg0) {
            class305.field4779 = new class184[class37.field563.method1513(127)][];
            class261.field3867 = new boolean[class37.field563.method1513(122)];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)I", line = 339)
    public static final int method912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class56.field830[arg3 * 1024 / arg1] >> 1;
        int var6 = -102 / ((-arg0 - 47) / 33);
        field1836++;
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }
}
