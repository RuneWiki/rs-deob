import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class110 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[I")
    private int[] field1897 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Z")
    public boolean field1896 = false;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public int field1914 = -1;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lid;")
    public static class149 field1894 = class60.method382("::", (byte) 11);

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
    public static int[] field1906 = new int[32768];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lid;")
    public static class149 field1899 = class60.method382("cookieprefix", (byte) 50);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    private int[] field1898;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[S")
    private short[] field1900;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[S")
    private short[] field1904;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "[S")
    private short[] field1907;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[S")
    private short[] field1912;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILgd;I)V")
    private final void method772(int arg0, class74 arg1, int arg2) {
        field1913++;
        if (arg2 < 54) {
            return;
        }
        if (arg0 == 1) {
            this.field1914 = arg1.method489((byte) 97);
        } else if (arg0 == 2) {
            int var8 = arg1.method489((byte) 96);
            this.field1898 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1898[var9] = arg1.method485(-2386);
            }
        } else if (arg0 == 3) {
            this.field1896 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method489((byte) -114);
            this.field1907 = new short[var6];
            this.field1904 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1907[var7] = (short) arg1.method485(-2386);
                this.field1904[var7] = (short) arg1.method485(-2386);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method489((byte) 88);
            this.field1912 = new short[var4];
            this.field1900 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1912[var5] = (short) arg1.method485(-2386);
                this.field1900[var5] = (short) arg1.method485(-2386);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1897[arg0 - 60] = arg1.method485(-2386);
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLgd;IIIIIZI)V")
    public static final void method773(boolean arg0, class74 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg5 >= 0 && arg5 < 104 && arg2 >= 0 && arg2 < 104) {
            if (!arg7) {
                class69.field1215[arg4][arg5][arg2] = 0;
            }
            while (true) {
                int var9 = arg1.method489((byte) -109);
                if (var9 == 0) {
                    if (arg7) {
                        class189.field3393[0][arg5][arg2] = class211.field3759[0][arg5][arg2];
                    } else if (arg4 == 0) {
                        class189.field3393[0][arg5][arg2] = -class28.method163(arg5 + arg8 + 932731, (byte) -29, arg2 + arg6 + 556238) * 8;
                    } else {
                        class189.field3393[arg4][arg5][arg2] = class189.field3393[arg4 - 1][arg5][arg2] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg1.method489((byte) -54);
                    if (arg7) {
                        class189.field3393[0][arg5][arg2] = class211.field3759[0][arg5][arg2] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class189.field3393[0][arg5][arg2] = -var10 * 8;
                        } else {
                            class189.field3393[arg4][arg5][arg2] = class189.field3393[arg4 - 1][arg5][arg2] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class256.field4480[arg4][arg5][arg2] = arg1.method514((byte) 1);
                    class154.field2830[arg4][arg5][arg2] = (byte) ((var9 - 2) / 4);
                    class13.field166[arg4][arg5][arg2] = (byte) class136.method953(var9 + arg3 - 2, 3);
                } else if (var9 > 81) {
                    class97.field1716[arg4][arg5][arg2] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class69.field1215[arg4][arg5][arg2] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg1.method489((byte) -41);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg1.method489((byte) 84);
                    break;
                }
                if (var11 <= 49) {
                    arg1.method489((byte) 116);
                }
            }
        }
        if (arg0) {
            field1903 = -54;
        }
        field1895++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lcb;")
    public final class241 method774(int arg0) {
        field1902++;
        class241[] var2 = new class241[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1897[var4] != -1) {
                var2[var3++] = class241.method1661(class201.field3644, this.field1897[var4], 0);
            }
        }
        class241 var5 = new class241(var2, var3);
        if (this.field1907 != null) {
            for (int var6 = 0; var6 < this.field1907.length; var6++) {
                var5.method1677(this.field1907[var6], this.field1904[var6]);
            }
        }
        if (arg0 != 9961) {
            field1903 = -76;
        }
        if (this.field1912 != null) {
            for (int var7 = 0; var7 < this.field1912.length; var7++) {
                var5.method1672(this.field1912[var7], this.field1900[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Z")
    public final boolean method775(byte arg0) {
        if (arg0 >= -80) {
            return true;
        }
        field1908++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1897[var3] != -1 && !class201.field3644.method1541(true, this.field1897[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILid;)I")
    public static final int method776(int arg0, class149 arg1) {
        field1905++;
        for (int var2 = arg0; var2 < class123.field2176.length; var2++) {
            if (class123.field2176[var2].method1048(83, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLgd;)V")
    public final void method777(byte arg0, class74 arg1) {
        while (true) {
            int var3 = arg1.method489((byte) -63);
            if (var3 == 0) {
                if (arg0 > -57) {
                    field1899 = null;
                }
                field1901++;
                return;
            }
            this.method772(var3, arg1, 66);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static void method778(byte arg0) {
        field1906 = null;
        field1894 = null;
        field1899 = null;
        int var1 = 36 % ((36 - arg0) / 38);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static final void method779(int arg0) {
        field1911++;
        if (class29.field437.toLowerCase().indexOf("microsoft") == -1) {
            class93.field1649[47] = 73;
            class93.field1649[92] = 74;
            class93.field1649[91] = 42;
            if (class29.field440 == null) {
                class93.field1649[222] = 59;
                class93.field1649[192] = 58;
            } else {
                class93.field1649[222] = 58;
                class93.field1649[520] = 59;
                class93.field1649[192] = 28;
            }
            class93.field1649[61] = 27;
            class93.field1649[59] = 57;
            class93.field1649[93] = 43;
            class93.field1649[45] = 26;
            class93.field1649[46] = 72;
            class93.field1649[44] = 71;
        } else {
            class93.field1649[191] = 73;
            class93.field1649[220] = 74;
            class93.field1649[186] = 57;
            class93.field1649[222] = 59;
            class93.field1649[187] = 27;
            class93.field1649[190] = 72;
            class93.field1649[189] = 26;
            class93.field1649[223] = 28;
            class93.field1649[188] = 71;
            class93.field1649[219] = 42;
            class93.field1649[192] = 58;
            class93.field1649[221] = 43;
        }
        if (arg0 != 12506) {
            method773(false, (class74) null, -3, -75, -103, 88, -82, false, 56);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
    public final boolean method780(boolean arg0) {
        field1910++;
        if (this.field1898 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field1898.length; var3++) {
            if (!class201.field3644.method1541(arg0, this.field1898[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Lcb;")
    public final class241 method781(int arg0) {
        field1909++;
        if (this.field1898 == null) {
            return null;
        }
        class241[] var2 = new class241[this.field1898.length];
        for (int var3 = 0; var3 < this.field1898.length; var3++) {
            var2[var3] = class241.method1661(class201.field3644, this.field1898[var3], 0);
        }
        class241 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class241(var2, var2.length);
        }
        if (arg0 != 71) {
            field1906 = null;
        }
        if (this.field1907 != null) {
            for (int var5 = 0; var5 < this.field1907.length; var5++) {
                var4.method1677(this.field1907[var5], this.field1904[var5]);
            }
        }
        if (this.field1912 != null) {
            for (int var6 = 0; var6 < this.field1912.length; var6++) {
                var4.method1672(this.field1912[var6], this.field1900[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ILid;)V")
    public static final void method782(int arg0, class149 arg1) {
        if (arg0 != -1) {
            field1899 = null;
        }
        field1893++;
        class285.method1959(false, (byte) 126);
        class279.method1927((byte) -117, arg1);
    }
}
