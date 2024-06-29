import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class244 extends class175 {

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    private int field4221 = -1;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "Lmb;")
    public static class96 field4223 = class243.method1708(")3runescape)3com)4l=", (byte) 98);

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "Lmb;")
    public static class96 field4224 = class243.method1708("Lade Schrifts-=tze )2 ", (byte) 112);

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "[J")
    public static long[] field4219 = new long[256];

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "Z")
    public static boolean field4238;

    @OriginalMember(owner = "client!fh", name = "qb", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!fh", name = "pb", descriptor = "Lmb;")
    public static class96 field4242;

    @OriginalMember(owner = "client!fh", name = "ob", descriptor = "Lmb;")
    private static class96 field4241;

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "Lmb;")
    public static class96 field4236;

    @OriginalMember(owner = "client!fh", name = "rb", descriptor = "Lmb;")
    public static class96 field4244;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "Li;")
    public static class18 field4235;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Lff;")
    public static class3 field4222;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "[I")
    public int[] field4234;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "[I")
    public static int[] field4240;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "[Lb;")
    public static class120[] field4237;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([III[II)V")
    public static final void method1711(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 >= -105) {
            method1716(56, 47, 41, 112, -92, -96, 76, 38);
        }
        if (~arg1 < ~arg2) {
            int var5 = arg2;
            int var6 = (arg2 - -arg1) / 2;
            int var7 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg2; ~arg1 < ~var9; ++var9) {
                if (arg3[var9] > var7 - -(1 & var9)) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg3[arg1] = arg3[var5];
            arg3[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var8;
            method1711(arg0, var5 + -1, arg2, arg3, -109);
            method1711(arg0, arg1, var5 - -1, arg3, -114);
        }
        ++field4231;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)V")
    public static void method1712(byte arg0) {
        field4237 = null;
        field4244 = null;
        field4222 = null;
        if (arg0 > -89) {
            method1716(52, -61, 32, 11, 73, 47, 67, -55);
        }
        field4219 = null;
        field4241 = null;
        field4240 = null;
        field4242 = null;
        field4224 = null;
        field4236 = null;
        field4223 = null;
        field4235 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field4228;
        int var4 = 86 / ((arg0 - -22) / 58);
        if (~arg1 == -1) {
            this.field4221 = arg2.method1663((byte) -109);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
    public static final void method1713(int arg0, int arg1) {
        ++field4216;
        if (class26.field442 == null || class26.field442.length < arg1) {
            class26.field442 = new int[arg1];
        }
        if (arg0 != 4080) {
            field4237 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
    public static final void method1714(int arg0, boolean arg1) {
        ++field4226;
        if (class225.method1534(-1, arg0)) {
            class107[] var2 = class100.field1704[arg0];
            if (!arg1) {
                field4219 = null;
            }
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class107 var4 = var2[var3];
                if (var4 != null) {
                    var4.field1910 = 0;
                    var4.field1952 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public final void method1038(int arg0) {
        ++field4220;
        if (arg0 != 23160) {
            method1712((byte) 67);
        }
        super.method1038(arg0);
        this.field4234 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lmb;Z)I")
    public static final int method1715(class96 arg0, boolean arg1) {
        ++field4233;
        if (!arg1) {
            field4235 = null;
        }
        if (class227.field3870 != null && arg0.method707(-42) != 0) {
            for (int var2 = 0; class227.field3870.field2027 > var2; ++var2) {
                if (class227.field3870.field2028[var2].method684(70, class147.field2607, class96.field1612).method717(arg0, (byte) 120)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 > 51) {
            ++field4232;
            if (arg2 >= 1 && ~arg4 <= -2 && ~arg2 >= -103 && arg4 <= 102) {
                if (!class106.method786(74) && (2 & class132.field2376[0][arg2][arg4]) == 0) {
                    int var8 = arg1;
                    if (~(8 & class132.field2376[arg1][arg2][arg4]) != -1) {
                        var8 = 0;
                    }
                    if (class277.field4822 != var8) {
                        return;
                    }
                }
                int var9 = arg1;
                if (arg1 < 3 && ~(class132.field2376[1][arg2][arg4] & 2) == -3) {
                    var9 = arg1 + 1;
                }
                class96.method695(arg4, arg2, class62.field1064[arg1], var9, (byte) 121, arg1, arg0);
                if (~arg7 <= -1) {
                    boolean var10 = class89.field1478;
                    class89.field1478 = true;
                    class121.method929(false, 4, arg1, arg6, var9, arg7, class62.field1064[arg1], arg2, false, arg4, arg5);
                    class89.field1478 = var10;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)I")
    public final int method1256(byte arg0) {
        ++field4229;
        int var2 = 12 / ((13 - arg0) / 59);
        return this.field4221;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[[I")
    public int[][] method77(int arg0, int arg1) {
        ++field4217;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (arg1 != 64) {
            this.method1717(true);
        }
        if (super.field3035.field1493 && this.method1717(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = this.field4230 * (class85.field1440 != this.field4225 ? this.field4225 * arg0 / class85.field1440 : arg0);
            if (~class1.field11 != ~this.field4230) {
                for (int var8 = 0; ~class1.field11 < ~var8; ++var8) {
                    int var9 = this.field4230 * var8 / class1.field11;
                    int var10 = this.field4234[var7 - -var9];
                    var6[var8] = class130.method985(var10 << 4, 4080);
                    var4[var8] = class130.method985(var10 >> 4, 4080);
                    var5[var8] = class130.method985(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; class1.field11 > var11; ++var11) {
                    int var12 = this.field4234[var7++];
                    var6[var11] = class130.method985(var12, 255) << 4;
                    var4[var11] = class130.method985(var12, 65280) >> 4;
                    var5[var11] = class130.method985(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z")
    public final boolean method1717(boolean arg0) {
        ++field4227;
        if (this.field4234 != null) {
            return true;
        } else if (!arg0) {
            return true;
        } else if (~this.field4221 <= -1) {
            class174 var2 = class145.method1073(class116.field2163, 1, this.field4221);
            var2.method1236();
            this.field4225 = var2.field4271;
            this.field4234 = var2.field3026;
            this.field4230 = var2.field4266;
            return true;
        } else {
            return false;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field4219[var0] = var1;
        }
        field4239 = 0;
        field4238 = false;
        field4243 = -1;
        field4242 = class243.method1708("gelb:", (byte) 112);
        field4241 = class243.method1708("wave:", (byte) 113);
        field4236 = field4241;
        field4244 = field4241;
    }
}
