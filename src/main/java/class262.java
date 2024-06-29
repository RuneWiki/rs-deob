import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class262 {

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "Lml;")
    private class134 field4643 = null;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Luk;")
    private class93 field4615;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Z")
    private boolean field4626;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "Z")
    private boolean field4637;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field4632 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "[Ljava/lang/Object;")
    private Object[] field4640;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4645;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1856(int arg0) {
        if (arg0 == 0) {
            class255.field4434.method639(arg0 ^ 0xFFFFFF87);
            field4622++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILsf;Lsf;)Z", line = 17)
    public final boolean method1857(int arg0, class108 arg1, class108 arg2) {
        field4631++;
        if (!this.method1869(117)) {
            return false;
        }
        class108 var4 = arg2.method764(false);
        class108 var5 = arg1.method764(false);
        int var6 = this.field4643.field2313.method88(var4.method768(-17345), -98);
        if (arg0 != -1) {
            return true;
        } else if (this.method1864((byte) 93, var6)) {
            int var7 = this.field4643.field2322[var6].method88(var5.method768(-17345), -49);
            return this.method1885(var7, (byte) 124, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLik;)V", line = 42)
    public static final void method1858(byte arg0, class262 arg1) {
        if (arg0 != 125) {
            field4632 = -43;
        }
        class54.field799 = arg1;
        field4641++;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z", line = 53)
    public final boolean method1859(int arg0) {
        field4605++;
        if (!this.method1869(103)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field4643.field2307.length; var3++) {
            int var4 = this.field4643.field2307[var3];
            if (this.field4640[var4] == null) {
                this.method1882(-43, var4);
                if (this.field4640[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII[I)[B", line = 88)
    public final byte[] method1860(boolean arg0, int arg1, int arg2, int[] arg3) {
        field4644++;
        if (!arg0) {
            this.method1885(-119, (byte) 126, -119);
        }
        if (!this.method1881(arg1, arg2, 87)) {
            return null;
        }
        if (this.field4645[arg1] == null || this.field4645[arg1][arg2] == null) {
            boolean var5 = this.method1890(arg1, arg3, !arg0);
            if (!var5) {
                this.method1882(-95, arg1);
                boolean var6 = this.method1890(arg1, arg3, false);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class311.method2170(this.field4645[arg1][arg2], false, -39);
        if (this.field4637) {
            this.field4645[arg1][arg2] = null;
            if (this.field4643.field2323[arg1] == 1) {
                this.field4645[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Z", line = 130)
    public final boolean method1861(int arg0, int arg1) {
        field4634++;
        if (!this.method1869(86)) {
            return false;
        } else if (this.field4643.field2323.length == 1) {
            return this.method1885(arg0, (byte) 127, 0);
        } else if (this.method1864((byte) 123, arg0)) {
            int var3 = -121 % ((arg1 - 66) / 36);
            if (this.field4643.field2323[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1885(0, (byte) 125, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 157)
    public final void method1862(int arg0) {
        if (this.field4645 != null) {
            for (int var2 = 0; var2 < this.field4645.length; var2++) {
                this.field4645[var2] = null;
            }
        }
        if (arg0 >= 97) {
            field4611++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I", line = 190)
    public final int method1863(byte arg0) {
        field4629++;
        if (!this.method1869(84)) {
            throw new IllegalStateException("");
        }
        if (arg0 <= 67) {
            field4632 = -34;
        }
        return this.field4643.field2319;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)Z", line = 205)
    private final boolean method1864(byte arg0, int arg1) {
        field4630++;
        if (arg0 <= 46) {
            this.method1875(false, true, (byte) -123);
        }
        if (!this.method1869(95)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field4643.field2323.length && this.field4643.field2323[arg1] != 0) {
            return true;
        } else if (class316.field5435) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lsf;I)Z", line = 246)
    public final boolean method1865(class108 arg0, int arg1) {
        if (arg1 != -1) {
            this.field4645 = (Object[][]) ((Object[][]) null);
        }
        field4618++;
        if (this.method1869(116)) {
            class108 var3 = arg0.method764(false);
            int var4 = this.field4643.field2313.method88(var3.method768(-17345), 97);
            return this.method1873(255, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BI)[B", line = 263)
    public final byte[] method1866(byte arg0, int arg1) {
        field4616++;
        if (arg0 >= -87) {
            this.method1881(-103, -85, -39);
        }
        if (!this.method1869(41)) {
            return null;
        } else if (this.field4643.field2323.length == 1) {
            return this.method1868(12236, 0, arg1);
        } else if (!this.method1864((byte) 57, arg1)) {
            return null;
        } else if (this.field4643.field2323[arg1] == 1) {
            return this.method1868(12236, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILsf;)I", line = 294)
    public final int method1867(int arg0, class108 arg1) {
        field4609++;
        if (!this.method1869(arg0 + 48)) {
            return 0;
        }
        class108 var3 = arg1.method764(false);
        if (arg0 != 0) {
            this.field4643 = (class134) null;
        }
        int var4 = this.field4643.field2313.method88(var3.method768(arg0 - 17345), 69);
        return this.method1870(true, var4);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)[B", line = 313)
    public final byte[] method1868(int arg0, int arg1, int arg2) {
        field4606++;
        if (arg0 != 12236) {
            this.field4640 = (Object[]) null;
        }
        return this.method1860(true, arg1, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Z", line = 324)
    private final boolean method1869(int arg0) {
        field4639++;
        if (this.field4643 == null) {
            this.field4643 = this.field4615.method632(28652);
            if (this.field4643 == null) {
                return false;
            }
            this.field4645 = new Object[this.field4643.field2306][];
            this.field4640 = new Object[this.field4643.field2306];
        }
        if (arg0 <= 33) {
            this.field4645 = (Object[][]) ((Object[][]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I", line = 346)
    private final int method1870(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1866((byte) -19, -63);
        }
        field4617++;
        if (this.method1864((byte) 72, arg1)) {
            return this.field4640[arg1] == null ? this.field4615.method631((byte) -46, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)Lam;", line = 365)
    public static final class258 method1871(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        return var3 == null || var3.field1141 == null ? null : var3.field1141;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 382)
    private final void method1872(int arg0, int arg1) {
        field4621++;
        if (arg0 < -1) {
            this.field4615.method635(arg1, -7274);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)Z", line = 393)
    public final boolean method1873(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field4626 = false;
        }
        field4610++;
        if (!this.method1864((byte) 117, arg1)) {
            return false;
        } else if (this.field4640[arg1] == null) {
            this.method1882(-84, arg1);
            return this.field4640[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(II)V", line = 417)
    public static final void method1874(int arg0, int arg1) {
        if (arg1 != -16093) {
            method1878(-83, (int[]) null);
        }
        field4608++;
        class120 var2 = class248.method1704(7, 113, arg0);
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZB)V", line = 431)
    public final void method1875(boolean arg0, boolean arg1, byte arg2) {
        field4636++;
        if (!this.method1869(88)) {
            return;
        }
        if (arg1) {
            this.field4643.field2322 = null;
            this.field4643.field2310 = (int[][]) null;
        }
        if (arg0) {
            this.field4643.field2313 = null;
            this.field4643.field2320 = null;
        }
        if (arg2 != 80) {
            this.method1888(-42, 53, -119);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I", line = 469)
    public final int method1876(int arg0, byte arg1) {
        if (arg1 >= -77) {
            return 86;
        } else {
            field4620++;
            return this.method1864((byte) 68, arg0) ? this.field4643.field2323[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lsf;B)V", line = 483)
    public final void method1877(class108 arg0, byte arg1) {
        field4624++;
        if (!this.method1869(54)) {
            return;
        }
        class108 var3 = arg0.method764(false);
        int var4 = this.field4643.field2313.method88(var3.method768(-17345), -125);
        if (arg1 > 56) {
            this.method1872(-47, var4);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)[I", line = 500)
    public static final int[] method1878(int arg0, int[] arg1) {
        field4642++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class23.method159(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I", line = 515)
    public final int method1879(int arg0) {
        field4635++;
        if (this.method1869(97)) {
            return arg0 == 0 ? this.field4643.field2323.length : 16;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(II)V", line = 531)
    public final void method1880(int arg0, int arg1) {
        field4625++;
        if (!this.method1864((byte) 100, arg0)) {
            return;
        }
        if (this.field4645 != null) {
            this.field4645[arg0] = null;
        }
        if (arg1 < 29) {
            this.field4643 = (class134) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(III)Z", line = 554)
    private final boolean method1881(int arg0, int arg1, int arg2) {
        int var4 = -123 % ((-arg2 - 18) / 44);
        field4613++;
        if (!this.method1869(122)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field4643.field2323.length > arg0 && arg1 < this.field4643.field2323[arg0]) {
            return true;
        } else if (class316.field5435) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)V", line = 577)
    private final void method1882(int arg0, int arg1) {
        if (arg0 > -14) {
            return;
        }
        field4627++;
        if (this.field4626) {
            this.field4640[arg1] = this.field4615.method627((byte) -109, arg1);
        } else {
            this.field4640[arg1] = class197.method1396(this.field4615.method627((byte) 51, arg1), 136, false);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)V", line = 599)
    public static final void method1883(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 > -12) {
            method1856(-46);
        }
        field4646++;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILsf;Lsf;)[B", line = 613)
    public final byte[] method1884(int arg0, class108 arg1, class108 arg2) {
        field4619++;
        if (!this.method1869(72)) {
            return null;
        }
        class108 var4 = arg1.method764(false);
        class108 var5 = arg2.method764(false);
        int var6 = this.field4643.field2313.method88(var4.method768(-17345), -107);
        if (!this.method1864((byte) 47, var6)) {
            return null;
        }
        int var7 = this.field4643.field2322[var6].method88(var5.method768(-17345), -126);
        if (arg0 <= 108) {
            this.field4637 = true;
        }
        return this.method1868(12236, var6, var7);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)Z", line = 637)
    public final boolean method1885(int arg0, byte arg1, int arg2) {
        if (arg1 <= 123) {
            this.field4626 = false;
        }
        field4614++;
        if (!this.method1881(arg2, arg0, 91)) {
            return false;
        } else if (this.field4645[arg2] != null && this.field4645[arg2][arg0] != null) {
            return true;
        } else if (this.field4640[arg2] == null) {
            this.method1882(-111, arg2);
            return this.field4640[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)I", line = 663)
    public final int method1886(byte arg0) {
        field4623++;
        if (!this.method1869(78)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 >= -91) {
            this.field4637 = false;
        }
        for (int var4 = 0; var4 < this.field4640.length; var4++) {
            if (this.field4643.field2305[var4] > 0) {
                var2 += 100;
                var3 += this.method1870(true, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILsf;)I", line = 701)
    public final int method1887(int arg0, class108 arg1) {
        field4628++;
        if (arg0 != -1) {
            this.method1875(true, true, (byte) -113);
        }
        if (this.method1869(62)) {
            class108 var3 = arg1.method764(false);
            int var4 = this.field4643.field2313.method88(var3.method768(-17345), arg0 ^ 0x68);
            return this.method1864((byte) 97, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(III)[B", line = 723)
    public final byte[] method1888(int arg0, int arg1, int arg2) {
        field4612++;
        if (!this.method1881(arg0, arg1, -93)) {
            return null;
        }
        if (this.field4645[arg0] == null || this.field4645[arg0][arg1] == null) {
            boolean var4 = this.method1890(arg0, (int[]) null, false);
            if (!var4) {
                this.method1882(-84, arg0);
                boolean var5 = this.method1890(arg0, (int[]) null, false);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = 12 % ((arg2 + 32) / 50);
        return class311.method2170(this.field4645[arg0][arg1], false, -75);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(BI)[I", line = 757)
    public final int[] method1889(byte arg0, int arg1) {
        field4638++;
        if (!this.method1864((byte) 79, arg1)) {
            return null;
        }
        int[] var3 = this.field4643.field2318[arg1];
        if (var3 == null) {
            var3 = new int[this.field4643.field2305[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (arg0 > -4) {
            this.method1865((class108) null, -100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[IZ)Z", line = 786)
    private final boolean method1890(int arg0, int[] arg1, boolean arg2) {
        field4607++;
        if (!this.method1864((byte) 122, arg0)) {
            return false;
        } else if (this.field4640[arg0] == null) {
            return false;
        } else {
            int var4 = this.field4643.field2305[arg0];
            int[] var5 = this.field4643.field2318[arg0];
            if (this.field4645[arg0] == null) {
                this.field4645[arg0] = new Object[this.field4643.field2323[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field4645[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var10 = class311.method2170(this.field4640[arg0], true, -29);
                class249 var11 = new class249(var10);
                var11.method1723(arg1, (byte) -30, 5, var11.field4338.length);
            } else {
                var10 = class311.method2170(this.field4640[arg0], false, -99);
            }
            byte[] var12;
            try {
                var12 = class79.method517(13456, var10);
            } catch (RuntimeException var31) {
                throw class104.method713(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class315.method2194(var10, var10.length, (byte) -128) + "," + class315.method2194(var10, var10.length - 2, (byte) -127) + "," + this.field4643.field2309[arg0] + "," + this.field4643.field2319);
            }
            if (this.field4626) {
                this.field4640[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var4 * var15 * 4;
                class249 var17 = new class249(var12);
                var17.field4314 = var16;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var17.method1738(-1756395344);
                        if (var5 == null) {
                        }
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                int var24 = 0;
                var17.field4314 = var16;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method1738(-1756395344);
                        class23.method156(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field4637) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class197.method1396(var22[var28], 136, false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field4637) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class197.method1396(var12, 136, false);
                }
            }
            if (arg2) {
                this.method1885(-53, (byte) -36, -16);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Luk;ZZ)V", line = 1003)
    public class262(class93 arg0, boolean arg1, boolean arg2) {
        this.field4615 = arg0;
        this.field4626 = arg1;
        this.field4637 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(ILsf;)Z", line = 986)
    public final boolean method1891(int arg0, class108 arg1) {
        field4633++;
        if (this.method1869(62)) {
            class108 var3 = arg1.method764(false);
            int var4 = this.field4643.field2313.method88(var3.method768(-17345), 121);
            return arg0 >= ~var4;
        } else {
            return false;
        }
    }
}
