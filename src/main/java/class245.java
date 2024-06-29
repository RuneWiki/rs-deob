import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class245 extends class175 {

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Z")
    public boolean field3924 = true;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
    private int[] field3929;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[I")
    public int[] field3934;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field3923;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[[I")
    private int[][] field3933;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method1608(long arg0, boolean arg1) {
        field3926++;
        return arg1 ? method1610(-107, arg0) : null;
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)I")
    public final int method1609(int arg0) {
        if (arg0 == 0) {
            field3927++;
            return this.field3929 == null ? 0 : this.field3929.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1610(int arg0, long arg1) {
        field3918++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            int var6 = 32 / ((-arg0 - 24) / 63);
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var7.append(class232.field3690[(int) (var8 - arg1 * 37L)]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lhi;B)Ljava/lang/String;")
    public final String method1611(class264 arg0, byte arg1) {
        field3928++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 != 66) {
            return null;
        }
        if (this.field3929 != null) {
            for (int var4 = 0; var4 < this.field3929.length; var4++) {
                var3.append(this.field3923[var4]);
                var3.append(class206.method1392(this.field3933[var4], arg1 + 31, this.field3929[var4], arg0.method1785(class96.field1461[this.field3929[var4]], 52)));
            }
        }
        var3.append(this.field3923[this.field3923.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IILhi;)V")
    public final void method1612(int[] arg0, int arg1, class264 arg2) {
        field3920++;
        if (this.field3929 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field3929.length && var4 < arg0.length; var4++) {
            int var5 = class242.field3885[this.method1619(var4, 11)];
            if (var5 > 0) {
                arg2.method1742((byte) 118, var5, (long) arg0[var4]);
            }
        }
        if (arg1 > -12) {
            this.method1615(28);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljj;I)V")
    public static final void method1613(class134 arg0, int arg1) {
        field3931++;
        if (class169.field2743) {
            return;
        }
        if (arg1 >= -39) {
            method1617(93);
        }
        class63.method503();
        class273.field4409 = class166.method1162(arg0, class111.field1911, (byte) 103);
        int var2 = class97.field1469;
        int var3 = var2 * 956 / 503;
        class273.field4409.method163((class107.field1856 - var3) / 2, 0, var3, var2);
        class172.field2782 = class291.method1946(client.field3619, arg0, -10258);
        class172.field2782.method533(class107.field1856 / 2 - (class172.field2782.field3434 / 2), 18);
        class169.field2743 = true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method1614(byte arg0, int arg1, int arg2) {
        field3922++;
        if (arg0 <= 51) {
            return 26;
        } else if (this.field3929 == null || arg2 < 0 || this.field3929.length < arg2) {
            return -1;
        } else if (this.field3933[arg2] == null || arg1 < 0 || arg1 > this.field3933[arg2].length) {
            return -1;
        } else {
            return this.field3933[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1615(int arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field3921++;
        if (this.field3923 == null) {
            return "";
        }
        var2.append(this.field3923[0]);
        for (int var3 = arg0; var3 < this.field3923.length; var3++) {
            var2.append("...");
            var2.append(this.field3923[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILhi;)V")
    public final void method1616(int arg0, class264 arg1) {
        while (true) {
            int var3 = arg1.method1779(-71);
            if (var3 == 0) {
                field3930++;
                if (arg0 != 0) {
                    method1617(-108);
                    return;
                }
                return;
            }
            this.method1618(var3, -32637, arg1);
        }
    }

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)Lak;")
    public static final class283 method1617(int arg0) {
        if (arg0 != 18) {
            return null;
        }
        field3925++;
        class283 var1 = (class283) class7.field83.method1635(arg0 ^ 0xFFFFFFA6);
        if (var1 != null) {
            var1.method544(117);
            var1.method1213(true);
            return var1;
        }
        class283 var2;
        do {
            var2 = (class283) class1.field8.method1635(-105);
            if (var2 == null) {
                return null;
            }
            if (var2.method1901(14065) > class182.method1253(20215)) {
                return null;
            }
            var2.method544(101);
            var2.method1213(true);
        } while ((Long.MIN_VALUE & var2.field2817) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILhi;)V")
    private final void method1618(int arg0, int arg1, class264 arg2) {
        if (arg0 == 1) {
            this.field3923 = class46.method356(arg2.method1750((byte) 74), (byte) -105, '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method1779(arg1 ^ 0x7F32);
            this.field3934 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3934[var9] = arg2.method1777(-41);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1779(-85);
            this.field3929 = new int[var4];
            this.field3933 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1777(-37);
                this.field3929[var5] = var6;
                this.field3933[var5] = new int[class3.field41[var6]];
                for (int var7 = 0; var7 < class3.field41[var6]; var7++) {
                    this.field3933[var5][var7] = arg2.method1777(-80);
                }
            }
        } else if (arg0 == 4) {
            this.field3924 = false;
        }
        if (arg1 != -32637) {
            this.method1619(-54, -24);
        }
        field3935++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
    public final int method1619(int arg0, int arg1) {
        field3932++;
        if (this.field3929 == null || arg0 < 0 || arg0 > this.field3929.length) {
            return -1;
        } else {
            int var3 = 78 / ((69 - arg1) / 56);
            return this.field3929[arg0];
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public final void method1620(byte arg0) {
        int var2 = 28 / ((6 - arg0) / 42);
        field3919++;
        if (this.field3934 != null) {
            for (int var3 = 0; var3 < this.field3934.length; var3++) {
                this.field3934[var3] = class45.method348(this.field3934[var3], 32768);
            }
        }
    }
}
