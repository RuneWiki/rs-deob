import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class363 extends class264 {

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    private int field4995;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "[I")
    public static int[] field4999 = new int[2];

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "J")
    public static volatile long field5002;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Ldj;")
    public static class314 field5001;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Lnl;")
    public static class435 field5003;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field4993;
        int[] var3 = super.field3808.method958((byte) 97, arg0);
        if (super.field3808.field1732) {
            class214.method1452(var3, 0, class478.field6792, this.field4995);
        }
        if (arg1 != 21034) {
            this.method90(-5, -9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)Z")
    public static final boolean method2229(byte[] arg0, int arg1) {
        ++field4990;
        class161 var2 = new class161(arg0);
        int var3 = var2.method1172((byte) -125);
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = ~var2.method1172((byte) -110) == -2;
            if (arg1 != -10400) {
                return false;
            } else {
                if (var4) {
                    class106.method849(var2, (byte) -44);
                }
                class130.method975(var2, (byte) -127);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lwt;Z)Z")
    public static final boolean method2230(class325 arg0, boolean arg1) {
        boolean var2 = class427.field5960 == class340.field4692;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method1753(true);
        if (arg0.field4535 >= 0 && arg0.field4539 >= 0 && arg0.field4526 < class310.field4401 && arg0.field4534 < class97.field1374) {
            for (int var6 = arg0.field4535; var6 <= arg0.field4526; ++var6) {
                for (int var9 = arg0.field4539; var9 <= arg0.field4534; ++var9) {
                    class52 var10 = class360.method2214(arg0.field4531, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field4535) {
                            ++var11;
                        }
                        if (var6 < arg0.field4526) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field4539) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field4534) {
                            var11 += 2;
                        }
                        class131 var12 = class399.method2398(var11, arg0, 16);
                        class131 var13 = var10.field763;
                        if (var13 == null) {
                            var10.field763 = var12;
                        } else {
                            while (var13.field1796 != null) {
                                var13 = var13.field1796;
                            }
                            var13.field1796 = var12;
                        }
                        var10.field768 = (byte) (var10.field768 | var11);
                        if (var2 && (class486.field6872[var6][var9] & -16777216) != 0) {
                            var3 = class486.field6872[var6][var9];
                            var4 = class218.field3157[var6][var9];
                            var5 = class332.field4610[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field4535; var7 <= arg0.field4526; ++var7) {
                    for (int var8 = arg0.field4539; var8 <= arg0.field4534; ++var8) {
                        if ((class486.field6872[var7][var8] & -16777216) == 0) {
                            class486.field6872[var7][var8] = var3;
                            class218.field3157[var7][var8] = var4;
                            class332.field4610[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class360.field4950[class239.field3495++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIBIIILvc;I[[[BI)V")
    public static final void method2231(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class89 arg9, int arg10, byte[][][] arg11, int arg12) {
        ++field4998;
        if (~arg2 != -1 && arg7 != 0) {
            if (arg2 == 9) {
                arg8 = 3 & arg8 - -1;
                arg2 = 1;
            }
            if (arg2 == 10) {
                arg8 = arg8 + 3 & 3;
                arg2 = 1;
            }
            if (~arg2 == -12) {
                arg8 = 3 & arg8 + 3;
                arg2 = 8;
            }
            int var13 = -14 % ((74 - arg5) / 40);
            arg9.method320(arg0, arg10, arg3, arg6, arg12, arg1, arg11[arg2 + -1][arg8], arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLtq;Lnl;)V")
    public static final void method2232(boolean arg0, class248 arg1, class435 arg2) {
        class95.field1333 = arg2;
        if (arg0) {
            field5003 = null;
        }
        class423.field5852 = arg1;
        ++field4989;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    public class363(int arg0) {
        super(0, true);
        this.field4995 = 4096;
        this.field4995 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)V")
    public static final void method2233(byte arg0, int arg1, int arg2) {
        ++field4997;
        class334 var3 = class352.method2172(arg2, 1, 16711935);
        var3.method2104(0);
        var3.field4648 = arg1;
        if (arg0 != -66) {
            field4999 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class363() {
        this(4096);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2234(byte arg0, String arg1) {
        if (arg0 >= -101) {
            field5004 = 51;
        }
        ++field4992;
        for (int var2 = 0; class462.field6532.length > var2; ++var2) {
            if (class462.field6532[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBILhq;)Lks;")
    public static final class292 method2235(int arg0, byte arg1, int arg2, class30 arg3) {
        ++field4996;
        int var4 = arg3.field304 | arg2 << 8;
        if (arg1 != -108) {
            return null;
        } else {
            class292 var5 = (class292) class185.field2788.method917(-6700, (long) var4 << 16);
            if (var5 != null) {
                return var5;
            } else {
                byte[] var6 = class291.field4126.method2650((byte) -72, class291.field4126.method2648(var4, true));
                if (var6 != null) {
                    if (~var6.length >= -2) {
                        return null;
                    } else {
                        class292 var7 = class227.method1544(var6, (byte) 4);
                        var7.field4131 = arg3;
                        class185.field2788.method922((long) var4 << 16, 67, var7);
                        return var7;
                    }
                } else {
                    int var8 = arg0 + 65536 << 8 | arg3.field304;
                    class292 var9 = (class292) class185.field2788.method917(-6700, (long) var8 << 16);
                    if (var9 != null) {
                        return var9;
                    } else {
                        byte[] var10 = class291.field4126.method2650((byte) -72, class291.field4126.method2648(var8, true));
                        if (var10 != null) {
                            if (~var10.length >= -2) {
                                return null;
                            } else {
                                class292 var11 = class227.method1544(var10, (byte) 4);
                                var11.field4131 = arg3;
                                class185.field2788.method922((long) var8 << 16, arg1 + 181, var11);
                                return var11;
                            }
                        } else {
                            int var12 = 16776960 | arg3.field304;
                            class292 var13 = (class292) class185.field2788.method917(-6700, (long) var12 << 16);
                            if (var13 != null) {
                                return var13;
                            } else {
                                byte[] var14 = class291.field4126.method2650((byte) -72, class291.field4126.method2648(var12, true));
                                if (var14 != null) {
                                    if (~var14.length >= -2) {
                                        return null;
                                    } else {
                                        class292 var15 = class227.method1544(var14, (byte) 4);
                                        var15.field4131 = arg3;
                                        class185.field2788.method922((long) var12 << 16, arg1 ^ -20, var15);
                                        return var15;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method2236(byte arg0) {
        field5003 = null;
        if (arg0 == 83) {
            field4999 = null;
            field5001 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4995 = (arg1.method1172((byte) 78) << 12) / 255;
        }
        if (arg0 <= 31) {
            method2232(true, (class248) null, (class435) null);
        }
        ++field4991;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IC)C")
    public static final char method2237(int arg0, char arg1) {
        ++field5000;
        if (arg0 != -403) {
            method2232(false, (class248) null, (class435) null);
        }
        return arg1 != 181 && ~arg1 != -403 ? Character.toTitleCase(arg1) : arg1;
    }

    static {
        new class151("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field5002 = 0L;
    }
}
