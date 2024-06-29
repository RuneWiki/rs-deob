import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class271 {

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field4615 = 128;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    private int field4607 = 0;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field4618 = 0;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Z")
    public boolean field4612 = false;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field4608 = 128;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public int field4611 = -1;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    private int field4623 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lmh;")
    private static class62 field4601 = class201.method1405(true, "M");

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field4603 = 20;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lmh;")
    public static class62 field4602 = field4601;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lmh;")
    public static class62 field4610 = field4601;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "J")
    public static long field4617 = 0L;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Lmh;")
    private static class62 field4614 = class201.method1405(true, "");

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Lmh;")
    public static class62 field4622 = field4614;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    private int field4597;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[S")
    private short[] field4599;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "[S")
    private short[] field4613;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "[S")
    private short[] field4616;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "[S")
    private short[] field4621;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[[[B")
    public static byte[][][] field4609;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmi;B)V", line = 13)
    public final void method1856(class92 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method702(-1);
            if (var3 == 0) {
                if (arg1 != -20) {
                    this.field4612 = true;
                }
                field4605++;
                return;
            }
            this.method1859((byte) -105, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lhg;Lna;IIIIILu;)V", line = 44)
    public static final void method1857(class216 arg0, class153 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class204 arg7) {
        class114 var8 = new class114();
        var8.field1897 = arg2;
        field4604++;
        var8.field1910 = arg3 * 128;
        var8.field1916 = arg6 * 128;
        if (arg4 <= 74) {
            method1858((byte) 40);
        }
        if (arg0 != null) {
            var8.field1891 = arg0.field3667;
            var8.field1904 = arg0.field3688;
            int var10 = arg0.field3669;
            var8.field1912 = arg0.field3694;
            var8.field1906 = arg0;
            var8.field1888 = arg0.field3674 * 128;
            var8.field1917 = arg0.field3664;
            int var11 = arg0.field3676;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg0.field3676;
                var11 = arg0.field3669;
            }
            var8.field1890 = (arg6 + var11) * 128;
            var8.field1914 = (arg3 + var10) * 128;
            if (arg0.field3709 != null) {
                var8.field1901 = true;
                var8.method893(2);
            }
            if (var8.field1904 != null) {
                var8.field1894 = (int) ((double) (var8.field1917 - var8.field1891) * Math.random()) + var8.field1891;
            }
            class38.field595.method330(var8, 60);
        } else if (arg7 != null) {
            var8.field1920 = arg7;
            class275 var9 = arg7.field3435;
            if (var9.field4720 != null) {
                var8.field1901 = true;
                var9 = var9.method1878(false);
            }
            if (var9 != null) {
                var8.field1914 = (var9.field4714 + arg3) * 128;
                var8.field1890 = (arg6 + var9.field4714) * 128;
                var8.field1912 = class164.method1183(arg7, 114);
                var8.field1888 = var9.field4688 * 128;
            }
            class101.field1663.method330(var8, 126);
        } else if (arg1 != null) {
            var8.field1918 = arg1;
            var8.field1914 = (arg3 + arg1.method1101(true)) * 128;
            var8.field1890 = (arg6 + arg1.method1101(true)) * 128;
            var8.field1912 = class276.method1892(arg1, -115);
            var8.field1888 = arg1.field2417 * 128;
            class243.field4134.method309(var8, arg1.field2430.method451(106), 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 132)
    public static void method1858(byte arg0) {
        field4602 = null;
        field4614 = null;
        field4601 = null;
        int var1 = 120 / ((-arg0 - 29) / 54);
        field4610 = null;
        field4609 = (byte[][][]) null;
        field4622 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILmi;)V", line = 146)
    private final void method1859(byte arg0, int arg1, class92 arg2) {
        field4620++;
        int var4 = -84 % ((arg0 + 41) / 63);
        if (arg1 == 1) {
            this.field4597 = arg2.method721(26);
        } else if (arg1 == 2) {
            this.field4611 = arg2.method721(22);
        } else if (arg1 == 4) {
            this.field4608 = arg2.method721(72);
        } else if (arg1 == 5) {
            this.field4615 = arg2.method721(117);
        } else if (arg1 == 6) {
            this.field4607 = arg2.method721(43);
        } else if (arg1 == 7) {
            this.field4623 = arg2.method702(-1);
        } else if (arg1 == 8) {
            this.field4618 = arg2.method702(-1);
        } else if (arg1 == 9) {
            this.field4612 = true;
        } else if (arg1 == 40) {
            int var5 = arg2.method702(-1);
            this.field4616 = new short[var5];
            this.field4599 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4599[var6] = (short) arg2.method721(42);
                this.field4616[var6] = (short) arg2.method721(31);
            }
        } else if (arg1 == 41) {
            int var7 = arg2.method702(-1);
            this.field4613 = new short[var7];
            this.field4621 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4621[var8] = (short) arg2.method721(65);
                this.field4613[var8] = (short) arg2.method721(69);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)[Lkb;", line = 231)
    public static final class82[] method1860(int arg0) {
        field4619++;
        class82[] var1 = new class82[class12.field100];
        int var2 = 0;
        int var3 = 66 % ((25 - arg0) / 63);
        while (class12.field100 > var2) {
            int var4 = class184.field2940[var2] * class15.field132[var2];
            byte[] var5 = class42.field645[var2];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class235.field4048[class234.method1648(var5[var7], 255)];
            }
            var1[var2] = new class82(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], var6);
            var2++;
        }
        class135.method1020(-99);
        return var1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ[III)V", line = 271)
    public static final void method1861(int arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (!arg1) {
            method1860(-121);
        }
        field4606++;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        arg4--;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg4 = var13 + 1;
            arg2[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg2[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)Lab;", line = 302)
    public final class138 method1862(boolean arg0, int arg1) {
        field4598++;
        class138 var3 = (class138) class62.field899.method1396(0, (long) this.field4600);
        if (var3 == null) {
            class76 var4 = class76.method582(class266.field4490, this.field4597, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4599 != null) {
                for (int var5 = 0; var5 < this.field4599.length; var5++) {
                    var4.method577(this.field4599[var5], this.field4616[var5]);
                }
            }
            if (this.field4621 != null) {
                for (int var6 = 0; var6 < this.field4621.length; var6++) {
                    var4.method587(this.field4621[var6], this.field4613[var6]);
                }
            }
            var3 = var4.method580(this.field4623 + 64, this.field4618 + 850, -30, -50, -30);
            class62.field899.method1397((long) this.field4600, var3, arg0);
        }
        class138 var7;
        if (this.field4611 == -1 || arg1 == -1) {
            var7 = var3.method482(true, true);
        } else {
            var7 = class151.method1085(this.field4611, (byte) 111).method773(var3, (byte) 77, arg1);
        }
        if (!arg0) {
            this.field4599 = (short[]) null;
        }
        if (this.field4608 != 128 || this.field4615 != 128) {
            var7.method499(this.field4608, this.field4615, this.field4608);
        }
        if (this.field4607 != 0) {
            if (this.field4607 == 90) {
                var7.method501();
            }
            if (this.field4607 == 180) {
                var7.method488();
            }
            if (this.field4607 == 270) {
                var7.method486();
            }
        }
        return var7;
    }
}
