import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class115 extends class283 {

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    private int field1803 = -1;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Lna;")
    public static class26 field1809 = class69.method505("sch-Utteln:", (byte) -118);

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field1813 = 128;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "Lna;")
    public static class26 field1806 = class69.method505("Lade)3)3)3", (byte) -120);

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "[I")
    public static int[] field1819 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lna;")
    private static class26 field1815 = class69.method505("Loading )2 please wait)3", (byte) -123);

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Lna;")
    public static class26 field1810 = field1815;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "Lna;")
    public static class26 field1821 = class69.method505("::fps ", (byte) -122);

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "[I")
    public int[] field1812;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)I", line = 5)
    public static final int method797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 8) {
            field1819 = (int[]) null;
        }
        field1805++;
        int var5 = 65536 - class200.field3115[arg2 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILth;JZ)V", line = 36)
    public static final void method798(int arg0, int arg1, int arg2, int arg3, class86 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class137 var8 = new class137();
        var8.field2095 = arg4;
        var8.field2099 = arg1 * 128 + 64;
        var8.field2107 = arg2 * 128 + 64;
        var8.field2101 = arg3;
        var8.field2105 = arg5;
        var8.field2106 = arg6;
        if (class36.field585[arg0][arg1][arg2] == null) {
            class36.field585[arg0][arg1][arg2] = new class55(arg0, arg1, arg2);
        }
        class36.field585[arg0][arg1][arg2].field886 = var8;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 153)
    public class115() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)V", line = 67)
    public static void method799(byte arg0) {
        field1809 = null;
        field1815 = null;
        if (arg0 >= -11) {
            field1818 = -68;
        }
        field1810 = null;
        field1821 = null;
        field1819 = null;
        field1806 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)Z", line = 82)
    public static final boolean method800(int arg0, byte[] arg1) {
        field1804++;
        if (arg0 != 4) {
            return false;
        }
        class82 var2 = new class82(arg1);
        int var3 = var2.method642((byte) -67);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method642((byte) -70) == 1;
        if (var4) {
            class291.method2051(var2, arg0 ^ 0xFFFFFFAC);
        }
        class198.method1335(var2, -14991);
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)Z", line = 108)
    public final boolean method801(int arg0) {
        field1820++;
        int var2 = 62 / ((arg0 - 2) / 62);
        if (this.field1812 != null) {
            return true;
        } else if (this.field1803 < 0) {
            return false;
        } else {
            class256 var3 = class136.field2082 < 0 ? class26.method168(class290.field4830, this.field1803, false) : class308.method2154(this.field1803, class290.field4830, -3178, class136.field2082);
            var3.method1809();
            this.field1811 = var3.field2308;
            this.field1808 = var3.field2320;
            this.field1812 = var3.field4199;
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I", line = 135)
    public final int method802(int arg0) {
        if (arg0 == 4) {
            field1807++;
            return this.field1803;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 159)
    public static final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1817++;
        class265 var13 = new class265();
        if (arg10 != -745213428) {
            return;
        }
        var13.field4362 = arg6;
        var13.field4361 = arg3;
        var13.field4338 = arg1;
        var13.field4355 = arg5;
        var13.field4345 = arg2;
        var13.field4343 = arg8;
        var13.field4352 = arg11;
        var13.field4360 = arg4;
        var13.field4342 = arg12;
        var13.field4340 = arg7;
        var13.field4344 = arg0;
        var13.field4353 = arg9;
        class188.field2962.method257(true, var13);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[[I", line = 189)
    public int[][] method3(int arg0, int arg1) {
        field1814++;
        if (arg0 != -1) {
            this.method802(32);
        }
        int[][] var3 = this.field4719.method2182((byte) 65, arg1);
        if (this.field4719.field5381 && this.method801(-113)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class225.field3574 == this.field1811 ? arg1 : this.field1811 * arg1 / class225.field3574) * this.field1808;
            if (class101.field1632 == this.field1808) {
                for (int var8 = 0; var8 < class101.field1632; var8++) {
                    int var9 = this.field1812[var7++];
                    var6[var8] = class4.method23(255, var9) << 4;
                    var5[var8] = class4.method23(65280, var9) >> 4;
                    var4[var8] = class4.method23(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class101.field1632; var10++) {
                    int var11 = this.field1808 * var10 / class101.field1632;
                    int var12 = this.field1812[var7 + var11];
                    var6[var10] = class4.method23(var12 << 4, 4080);
                    var5[var10] = class4.method23(var12, 65280) >> 4;
                    var4[var10] = class4.method23(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILwa;Z)V", line = 256)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field1803 = arg1.method576(1);
        }
        field1823++;
        if (!arg2) {
            method798(115, 107, 22, 20, (class86) null, 87L, false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V", line = 284)
    public static final void method804(byte arg0, int arg1, int arg2) {
        field1816++;
        class117.field1835[arg2] = arg1;
        if (arg0 != 99) {
            field1806 = (class26) null;
        }
        class116 var3 = (class116) class4.field32.method1827((long) arg2, 0);
        if (var3 == null) {
            class116 var4 = new class116(4611686018427387905L);
            class4.field32.method1826(1, var4, (long) arg2);
        } else if (var3.field1830 != 4611686018427387905L) {
            var3.field1830 = class128.method869((byte) -55) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)V", line = 316)
    public final void method805(byte arg0) {
        super.method805(arg0);
        this.field1812 = null;
        field1822++;
    }
}
