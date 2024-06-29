import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class184 {

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    private int field415 = 4096;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "Ldq;")
    public static class493 field412 = new class493(0, -1);

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "Lni;")
    public static class363 field419 = new class363("WTI", 5);

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "[I")
    public static int[] field420 = new int[99];

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "Ldq;")
    public static class493 field421;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "Lya;")
    public static class38 field416;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bt", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field422;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method245(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field420[var1] = var0 / 4;
        }
        field421 = new class493(71, -2);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V", line = 8)
    public static void method239(byte arg0) {
        field419 = null;
        field416 = null;
        int var1 = 34 / ((arg0 - -75) / 36);
        field421 = null;
        field420 = null;
        field412 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method6(int arg0, int arg1) {
        ++field417;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            return null;
        } else {
            if (super.field2409.field436) {
                int[] var4 = this.method1159(37, class501.field7240 & arg0 + -1, 0);
                int[] var5 = this.method1159(91, arg0, 0);
                int[] var6 = this.method1159(28, class501.field7240 & arg0 + 1, 0);
                for (int var7 = 0; ~class245.field3167 < ~var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field415;
                    int var9 = (var5[var7 + 1 & class421.field5961] + -var5[var7 + -1 & class421.field5961]) * this.field415;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 74)
    public class33() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILjava/lang/String;)V", line = 79)
    public static final void method240(byte arg0, int arg1, String arg2) {
        if (arg0 < 56) {
            method244((byte) -105, -11, -74, 98);
        }
        class282.method1669(class276.field3474, false);
        ++field410;
        ++class402.field5721;
        class40.field511.method2729(class463.method2733(-105, arg2) + 1, false);
        class40.field511.method2729(arg1, false);
        class40.field511.method2769(arg2, true);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V", line = 94)
    public static final void method241(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class140.field1804 != null) {
            class140.field1804[arg0][arg1] = -16777216 | arg2;
        }
        if (class382.field5040 != null) {
            class382.field5040[arg0][arg1] = (short) arg3;
        }
        if (class214.field2756 != null) {
            class214.field2756[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIB)I", line = 106)
    public static final int method242(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -128) {
            return 17;
        } else {
            ++field411;
            if (~arg0 <= ~arg1) {
                return arg0 > arg2 ? arg2 : arg0;
            } else {
                return arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V", line = 121)
    public static final void method243(byte arg0) {
        if (arg0 > 107) {
            ++field414;
            for (class426 var1 = (class426) class124.field1662.method153(0); var1 != null; var1 = (class426) class124.field1662.method161(-119)) {
                if (class125.field1664 == null) {
                    var1.method2165(16225);
                } else if (~class163.field2065 <= ~var1.field6055) {
                    int var2 = class461.field6590[var1.field6045];
                    if (var2 != 0) {
                        if (var2 != 1) {
                            if (~var2 != -3) {
                                if (var2 == 3) {
                                    class522 var3 = class238.method1430(var1.field6054, var1.field6047, var1.field6048);
                                    if (var3 instanceof class156) {
                                        class242.method1475(var1.field6054, var1.field6047, var1.field6048);
                                        class156 var4 = (class156) var3;
                                        if (var4.field1985 != null) {
                                            class24.method199(var1.field6054, var1.field6047, var1.field6048, var4.field1985);
                                        }
                                    }
                                }
                            } else {
                                class205 var5 = class212.method1314(var1.field6054, var1.field6047, var1.field6048, field422 != null ? field422 : (field422 = method245("fw")));
                                if (var5 instanceof class381) {
                                    class381.method2161(var1.field6054, var1.field6047, var1.field6048, field422 != null ? field422 : (field422 = method245("fw")));
                                    class381 var6 = (class381) var5;
                                    if (var6.field5012 != null) {
                                        class361.method2076(var6.field5012, false);
                                    }
                                }
                            }
                        } else {
                            class372 var7 = class140.method952(var1.field6054, var1.field6047, var1.field6048);
                            if (var7 instanceof class85) {
                                class200.method1261(var1.field6054, var1.field6047, var1.field6048);
                                class85 var8 = (class85) var7;
                                if (var8.field1060 != null) {
                                    class475.method2867(var1.field6054, var1.field6047, var1.field6048, var8.field1060, (class372) null);
                                }
                            }
                        }
                    } else {
                        class314 var9 = class20.method173(var1.field6054, var1.field6047, var1.field6048);
                        if (var9 instanceof class329) {
                            class229.method1391(var1.field6054, var1.field6047, var1.field6048);
                            class329 var10 = (class329) var9;
                            if (var10.field4146 != null) {
                                class317.method1868(var1.field6054, var1.field6047, var1.field6048, var10.field4146, (class314) null);
                            }
                        }
                    }
                    var1.method2165(16225);
                } else if (~class163.field2065 == ~var1.field6056) {
                    int var11 = class461.field6590[var1.field6045];
                    if (~var11 == -1) {
                        class314 var12 = class20.method173(var1.field6054, var1.field6047, var1.field6048);
                        if (var12 instanceof class329) {
                            var1.method2165(16225);
                        } else if (class250.method1519(var1.field6054, var1.field6047, var1.field6048) != null) {
                            var1.method2165(16225);
                        } else {
                            class329 var13 = new class329(var1.field6045, var1.field6043, var1.field6052, var1.field6046, var1.field6051, var12);
                            class317.method1868(var1.field6054, var1.field6047, var1.field6048, var13, (class314) null);
                        }
                    } else if (var11 == 1) {
                        class372 var21 = class140.method952(var1.field6054, var1.field6047, var1.field6048);
                        if (var21 instanceof class85) {
                            var1.method2165(16225);
                        } else if (class2.method9(var1.field6054, var1.field6047, var1.field6048) != null) {
                            var1.method2165(16225);
                        } else {
                            class85 var22 = new class85(var1.field6045, var1.field6043, var1.field6052, var1.field6046, var1.field6051, var21);
                            class475.method2867(var1.field6054, var1.field6047, var1.field6048, var22, (class372) null);
                        }
                    } else if (var11 == 2) {
                        class205 var14 = class212.method1314(var1.field6054, var1.field6047, var1.field6048, field422 != null ? field422 : (field422 = method245("fw")));
                        if (var14 instanceof class381) {
                            var1.method2165(16225);
                        } else {
                            class381.method2161(var1.field6054, var1.field6047, var1.field6048, field422 != null ? field422 : (field422 = method245("fw")));
                            class102 var15 = class315.field4017.method1958(-10091, var1.field6057);
                            int var16;
                            int var17;
                            if (var1.field6043 != 1 && var1.field6043 != 3) {
                                var16 = var15.field1272;
                                var17 = var15.field1282;
                            } else {
                                var17 = var15.field1272;
                                var16 = var15.field1282;
                            }
                            class381 var18 = new class381(var1.field6045, var1.field6043, var1.field6054, var1.field6052, var1.field6046, var1.field6051, var1.field6047, var16 + -1 + var1.field6047, var1.field6048, var1.field6048 + var17 + -1, var14);
                            class361.method2076(var18, false);
                        }
                    } else if (var11 == 3) {
                        class522 var19 = class238.method1430(var1.field6054, var1.field6047, var1.field6048);
                        if (var19 instanceof class156) {
                            var1.method2165(16225);
                        } else {
                            class156 var20 = new class156(var1.field6052, var1.field6046, var1.field6051, var19);
                            class24.method199(var1.field6054, var1.field6047, var1.field6048, var20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIII)V", line = 326)
    public static final void method244(byte arg0, int arg1, int arg2, int arg3) {
        ++field413;
        if (arg0 != 58) {
            method244((byte) 68, 55, -41, 29);
        }
        if (class125.field1664 != null) {
            long var4 = (long) (arg3 << 14 | arg2 << 28 | arg1);
            class91 var6 = (class91) class201.field2614.method2022(arg0 + -59, var4);
            if (var6 == null) {
                class365.method2098(arg2, arg1, arg3);
            } else {
                class400 var7 = (class400) var6.field1112.method153(0);
                if (var7 == null) {
                    class365.method2098(arg2, arg1, arg3);
                } else {
                    class434 var8 = (class434) class365.method2098(arg2, arg1, arg3);
                    if (var8 == null) {
                        var8 = new class434();
                    } else {
                        var8.field6172 = var8.field6165 = -1;
                    }
                    var8.field6163 = var7.field5707;
                    var8.field6174 = var7.field5703;
                    label48: while (true) {
                        class400 var9 = (class400) var6.field1112.method161(-76);
                        if (var9 == null) {
                            break;
                        }
                        if (var8.field6174 != var9.field5703) {
                            var8.field6172 = var9.field5703;
                            var8.field6166 = var9.field5707;
                            while (true) {
                                class400 var10 = (class400) var6.field1112.method161(-15);
                                if (var10 == null) {
                                    break label48;
                                }
                                if (~var8.field6174 != ~var10.field5703 && var8.field6172 != var10.field5703) {
                                    var8.field6170 = var10.field5707;
                                    var8.field6165 = var10.field5703;
                                }
                            }
                        }
                    }
                    int var11 = class151.method991((arg3 << 7) + 64, false, arg2, (arg1 << 7) + 64);
                    class247.method1500(arg2, arg1, arg3, var11, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILfh;)V", line = 405)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field418;
        int var4 = -45 % ((arg0 - -13) / 51);
        if (~arg1 == -1) {
            this.field415 = arg2.method2758((byte) 127);
        }
    }
}
