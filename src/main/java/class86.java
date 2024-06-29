import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class86 extends class243 {

    @OriginalMember(owner = "client!uk", name = "oc", descriptor = "J")
    public static long field1305 = 0L;

    @OriginalMember(owner = "client!uk", name = "sc", descriptor = "Ljava/lang/String;")
    public static String field1309 = "purple:";

    @OriginalMember(owner = "client!uk", name = "xc", descriptor = "[I")
    public static int[] field1314 = new int[14];

    @OriginalMember(owner = "client!uk", name = "wc", descriptor = "[I")
    public static int[] field1313 = new int[4096];

    @OriginalMember(owner = "client!uk", name = "zc", descriptor = "Z")
    public static boolean field1316 = false;

    @OriginalMember(owner = "client!uk", name = "mc", descriptor = "Ljava/lang/String;")
    public static String field1303 = "Loaded sprites";

    @OriginalMember(owner = "client!uk", name = "nc", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!uk", name = "pc", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!uk", name = "qc", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!uk", name = "rc", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!uk", name = "tc", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!uk", name = "uc", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!uk", name = "vc", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!uk", name = "yc", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!uk", name = "Bc", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!uk", name = "Cc", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!uk", name = "Dc", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!uk", name = "Gc", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!uk", name = "Hc", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!uk", name = "Ec", descriptor = "Luj;")
    public class134 field1321;

    @OriginalMember(owner = "client!uk", name = "Fc", descriptor = "Lkh;")
    public static class13 field1322;

    @OriginalMember(owner = "client!uk", name = "Ac", descriptor = "Lvl;")
    public static class73 field1317;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)V")
    public static void method582(int arg0) {
        if (arg0 == 13488) {
            field1309 = null;
            field1317 = null;
            field1322 = null;
            field1313 = null;
            field1314 = null;
            field1303 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public static final void method583(boolean arg0, int arg1) {
        ++field1324;
        class181 var2 = class95.method652(5, (byte) 34, arg1);
        if (arg0) {
            field1316 = false;
        }
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()I")
    public final int method4() {
        ++field1323;
        return super.field3960;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        ++field1306;
        if (this.field1321 != null) {
            class57 var13 = ~super.field3987 != 0 && super.field3977 == 0 ? class174.method1241(6, super.field3987) : null;
            class57 var14 = super.field3946 == -1 || ~super.field3946 == ~this.method1725(-122).field2517 && var13 != null ? null : class174.method1241(-123, super.field3946);
            class208 var15 = this.field1321.method856(var14, -21024, super.field3980, super.field3889, super.field3969, super.field3973, super.field3932, super.field3951, super.field3959, var13);
            if (var15 != null) {
                super.field3960 = var15.method4();
                class134 var16 = this.field1321;
                if (var16.field1894 != null) {
                    var16 = var16.method855((byte) -114);
                }
                if (class89.field1333 && var16.field1920) {
                    class208 var17 = class100.method680(super.field3986, super.field3920, arg0, (byte) 1, this.field1321.field1936, this.field1321.field1909, var15, super.field3956, this.field1321.field1882, var14 != null ? super.field3959 : super.field3980, this.field1321.field1898, super.field3915, var14 != null ? var14 : var13, this.field1321.field1925);
                    var17.method10(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field3926);
                }
                this.method1722(57, var15);
                class208 var18 = null;
                this.method1734(arg0, var15, 2);
                if (super.field3904 != -1 && super.field3930 != -1) {
                    class214 var19 = class92.method629(super.field3904, 12288);
                    var18 = var19.method1500(super.field3909, super.field3930, super.field3893, (byte) -55);
                    if (var18 != null) {
                        var18.method342(0, -super.field3963, 0);
                        if (var19.field3343) {
                            if (class205.field3218 != 0) {
                                var18.method323(class205.field3218);
                            }
                            if (~class260.field4229 != -1) {
                                var18.method331(class260.field4229);
                            }
                            if (class168.field2596 != 0) {
                                var18.method342(0, class168.field2596, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class51) var15).method320(var18);
                }
                this.method1726((byte) 6, var18, var15);
                if (this.field1321.field1925 == 1) {
                    var15.field3264 = true;
                }
                var15.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field3926);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field1319;
        if (this.field1321.field1894 != null) {
            class134 var2 = this.field1321.method855((byte) -114);
            if (var2 != null && ~var2.field1889 != 0) {
                return var2.field1889;
            }
        }
        if (arg0 != 0) {
            this.field1321 = null;
        }
        return super.field3898;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method584(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg6 > arg2) {
            int var7 = arg2;
            int var8 = (arg2 + arg6) / 2;
            class210 var9 = class68.field1021[var8];
            class68.field1021[var8] = class68.field1021[arg6];
            class68.field1021[arg6] = var9;
            for (int var10 = arg2; var10 < arg6; ++var10) {
                if (class179.method1265(arg5, arg4, false, arg1, arg3, class68.field1021[var10], var9) <= 0) {
                    class210 var11 = class68.field1021[var10];
                    class68.field1021[var10] = class68.field1021[var7];
                    class68.field1021[var7++] = var11;
                }
            }
            class68.field1021[arg6] = class68.field1021[var7];
            class68.field1021[var7] = var9;
            method584(0, arg1, arg2, arg3, arg4, arg5, var7 + -1);
            method584(0, arg1, var7 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg0 != 0) {
            method583(false, 12);
        }
        ++field1310;
    }

    @OriginalMember(owner = "client!uk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1312;
        if (super.field3926 != null) {
            super.field3926.method428();
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field1320;
        if (arg0 != 5) {
            this.method586(false, (class134) null);
        }
        return this.field1321 != null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B)Z")
    public static final boolean method585(int arg0, byte[] arg1) {
        if (arg0 > -114) {
            field1314 = null;
        }
        ++field1315;
        class170 var2 = new class170(arg1);
        int var3 = var2.method1218(78);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = ~var2.method1218(-103) == -2;
            if (var4) {
                class252.method1797(var2, 16722);
            }
            class199.method1387(255, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLuj;)V")
    public final void method586(boolean arg0, class134 arg1) {
        this.field1321 = arg1;
        if (!arg0) {
            field1309 = null;
        }
        ++field1311;
        if (super.field3926 != null) {
            super.field3926.method421();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIB)V")
    public static final void method587(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -12) {
            method582(59);
        }
        if (class56.field816 <= arg0 && ~arg0 >= ~class187.field2938) {
            int var5 = class196.method1369(class60.field882, arg2, true, class115.field1678);
            int var6 = class196.method1369(class60.field882, arg3, true, class115.field1678);
            class240.method1693(arg0, var5, arg1, var6, (byte) 45);
        }
        ++field1307;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1304;
        if (this.field1321 != null) {
            if (!super.field3985) {
                class57 var6 = super.field3987 != -1 && ~super.field3977 == -1 ? class174.method1241(-124, super.field3987) : null;
                class57 var7 = ~super.field3946 == 0 || ~super.field3946 == ~this.method1725(-126).field2517 && var6 != null ? null : class174.method1241(105, super.field3946);
                class208 var8 = this.field1321.method856(var7, -21024, super.field3980, super.field3889, super.field3969, super.field3973, super.field3932, super.field3951, super.field3959, var6);
                if (var8 == null) {
                    return;
                }
                this.method1726((byte) 6, (class208) null, var8);
            }
            if (super.field3926 != null) {
                super.field3926.method416(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }
}
