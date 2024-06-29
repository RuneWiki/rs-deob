import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class315 extends class239 {

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    private final int field5425;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    private final int field5417;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    private final int field5429;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    private final int field5428;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field5419 = 0;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Lsf;")
    public static class108 field5424 = class140.method973(255, "null");

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field5430 = 99;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lsf;")
    public static class108 field5431 = class140.method973(255, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lik;")
    public static class262 field5423;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZII)V", line = 7)
    public final void method1420(boolean arg0, int arg1, int arg2) {
        int var4 = this.field5428 * arg1 >> 12;
        field5426++;
        int var5 = this.field5425 * arg1 >> 12;
        int var6 = this.field5429 * arg2 >> 12;
        int var7 = this.field5417 * arg2 >> 12;
        class265.method1915(this.field4168, var4, var6, false, var5, this.field4170, this.field4169, var7);
        if (!arg0) {
            field5419 = -10;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 26)
    public static void method2192(int arg0) {
        if (arg0 != -20845) {
            field5424 = (class108) null;
        }
        field5424 = null;
        field5431 = null;
        field5423 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 43)
    public static final void method2193(int arg0) {
        field5432++;
        if (!class231.field4051 || class278.field4884) {
            return;
        }
        int var1 = 41 % ((arg0 + 18) / 60);
        class74[][][] var2 = class99.field1759;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class74[][] var4 = var2[var3];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class74 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field1141 != null && var7.field1141.field4557 instanceof class148) {
                            class148 var8 = (class148) var7.field1141.field4557;
                            if ((var7.field1141.field4560 & Long.MIN_VALUE) == 0L) {
                                var8.method1040(false, true, true, true, false, true, true);
                            } else {
                                var8.method1040(true, true, true, true, true, true, true);
                            }
                        }
                        if (var7.field1140 != null) {
                            if (var7.field1140.field513 instanceof class148) {
                                class148 var9 = (class148) var7.field1140.field513;
                                if ((Long.MIN_VALUE & var7.field1140.field502) == 0L) {
                                    var9.method1040(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1040(true, true, true, true, true, true, true);
                                }
                            }
                            if (var7.field1140.field510 instanceof class148) {
                                class148 var10 = (class148) var7.field1140.field510;
                                if ((Long.MIN_VALUE & var7.field1140.field502) == 0L) {
                                    var10.method1040(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1040(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var7.field1117 != null) {
                            if (var7.field1117.field3183 instanceof class148) {
                                class148 var11 = (class148) var7.field1117.field3183;
                                if ((var7.field1117.field3184 & Long.MIN_VALUE) == 0L) {
                                    var11.method1040(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1040(true, true, true, true, true, true, true);
                                }
                            }
                            if (var7.field1117.field3173 instanceof class148) {
                                class148 var12 = (class148) var7.field1117.field3173;
                                if ((Long.MIN_VALUE & var7.field1117.field3184) == 0L) {
                                    var12.method1040(false, true, true, true, false, true, true);
                                } else {
                                    var12.method1040(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var13 = 0; var13 < var7.field1119; var13++) {
                            if (var7.field1118[var13].field5570 instanceof class148) {
                                class148 var14 = (class148) var7.field1118[var13].field5570;
                                if ((Long.MIN_VALUE & var7.field1118[var13].field5563) == 0L) {
                                    var14.method1040(false, true, true, true, false, true, true);
                                } else {
                                    var14.method1040(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class278.field4884 = true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([BIB)I", line = 192)
    public static final int method2194(byte[] arg0, int arg1, byte arg2) {
        if (arg2 >= -124) {
            return -59;
        } else {
            field5418++;
            return class100.method696(arg1, arg0, 0, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIII)V", line = 203)
    public class315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5425 = arg2;
        this.field5417 = arg3;
        this.field5429 = arg1;
        this.field5428 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V", line = 215)
    public final void method1417(int arg0, int arg1, int arg2) {
        field5427++;
        int var4 = this.field5428 * arg2 >> 12;
        if (arg1 != -1) {
            this.method1420(false, 69, -6);
        }
        int var5 = this.field5429 * arg0 >> 12;
        int var6 = this.field5425 * arg2 >> 12;
        int var7 = this.field5417 * arg0 >> 12;
        class236.method1634(var4, var6, var7, var5, 0, this.field4170);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V", line = 241)
    public static final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5422++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg1;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        if (arg4 != -624) {
            field5419 = 112;
        }
        int var12 = arg1 << 1;
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = (1 - var12) * var7 + var10;
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (arg1 - 1) * var15;
        if (class266.field4677 <= arg0 && class166.field2984 >= arg0) {
            int var20 = class174.method1236(class260.field4593, arg2 + arg3, class79.field1202, -6219);
            int var21 = class174.method1236(class260.field4593, arg2 - arg3, class79.field1202, -6219);
            class209.method1452(var20, class106.field1839[arg0], 7, var21, arg5);
        }
        int var22 = (var6 + 1) * var16;
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var22;
                    var6++;
                    var22 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            var8--;
            if (var13 < 0) {
                var14 += var17;
                var6++;
                var17 += var16;
                var13 += var22;
                var22 += var16;
            }
            int var23 = arg0 + var8;
            var13 += -var18;
            var18 -= var15;
            var14 += -var19;
            int var24 = arg0 - var8;
            if (class266.field4677 <= var23 && var24 <= class166.field2984) {
                int var25 = class174.method1236(class260.field4593, arg2 + var6, class79.field1202, -6219);
                int var26 = class174.method1236(class260.field4593, arg2 - var6, class79.field1202, -6219);
                if (var24 >= class266.field4677) {
                    class209.method1452(var25, class106.field1839[var24], 7, var26, arg5);
                }
                if (var23 <= class166.field2984) {
                    class209.method1452(var25, class106.field1839[var23], arg4 ^ 0xFFFFFD97, var26, arg5);
                }
            }
            var19 -= var15;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(III)Lrd;", line = 343)
    public static final class174 method2196(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class174 var4 = var3.field1117;
            var3.field1117 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 355)
    public final void method1419(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2194((byte[]) null, 40, (byte) -16);
        }
        int var4 = this.field5425 * arg0 >> 12;
        int var5 = this.field5428 * arg0 >> 12;
        int var6 = this.field5429 * arg2 >> 12;
        int var7 = this.field5417 * arg2 >> 12;
        class305.method2142(this.field4169, -2, var7, var6, this.field4168, var4, var5);
        field5420++;
    }
}
