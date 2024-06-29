import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class327 extends class147 {

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field5665 = -1;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
    public static int[] field5666 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Lna;")
    private static class26 field5662 = class69.method505("white:", (byte) -117);

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lna;")
    public static class26 field5664 = class69.method505("brillant2:", (byte) -118);

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lna;")
    public static class26 field5667 = field5662;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field5670 = 0;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field5668 = -1;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lna;")
    public static class26 field5676 = field5662;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
    public static int[] field5672 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lve;")
    public static class266 field5656;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 19)
    public static final void method2281(int arg0) {
        field5658++;
        if (!class255.field4184 || class126.field1956) {
            return;
        }
        class55[][][] var1 = class36.field585;
        if (arg0 != 1) {
            field5676 = (class26) null;
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class55[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class55 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field886 != null && var6.field886.field2095 instanceof class239) {
                            class239 var7 = (class239) var6.field886.field2095;
                            if ((var6.field886.field2105 & Long.MIN_VALUE) == 0L) {
                                var7.method1626(false, true, true, true, false, true, true);
                            } else {
                                var7.method1626(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field889 != null) {
                            if (var6.field889.field2550 instanceof class239) {
                                class239 var8 = (class239) var6.field889.field2550;
                                if ((var6.field889.field2549 & Long.MIN_VALUE) == 0L) {
                                    var8.method1626(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1626(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field889.field2544 instanceof class239) {
                                class239 var9 = (class239) var6.field889.field2544;
                                if ((Long.MIN_VALUE & var6.field889.field2549) == 0L) {
                                    var9.method1626(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1626(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field890 != null) {
                            if (var6.field890.field4409 instanceof class239) {
                                class239 var10 = (class239) var6.field890.field4409;
                                if ((var6.field890.field4408 & Long.MIN_VALUE) == 0L) {
                                    var10.method1626(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1626(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field890.field4412 instanceof class239) {
                                class239 var11 = (class239) var6.field890.field4412;
                                if ((Long.MIN_VALUE & var6.field890.field4408) == 0L) {
                                    var11.method1626(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1626(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field879; var12++) {
                            if (var6.field877[var12].field632 instanceof class239) {
                                class239 var13 = (class239) var6.field877[var12].field632;
                                if ((Long.MIN_VALUE & var6.field877[var12].field656) == 0L) {
                                    var13.method1626(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1626(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class126.field1956 = true;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 161)
    public static void method2282(byte arg0) {
        field5672 = null;
        if (arg0 <= 110) {
            method2281(-74);
        }
        field5656 = null;
        field5666 = null;
        field5662 = null;
        field5667 = null;
        field5664 = null;
        field5676 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z", line = 179)
    public final boolean method2283(int arg0, byte arg1) {
        field5657++;
        int var3 = 13 / ((-arg1 - 60) / 46);
        return (this.field5661 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z", line = 189)
    public final boolean method2284(int arg0) {
        field5663++;
        if (arg0 == 572878952) {
            return (this.field5661 & 0x22257068) >> 29 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I", line = 200)
    public final int method2285(byte arg0) {
        field5659++;
        if (arg0 != -74) {
            this.method2287(90);
        }
        return this.field5661 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)Z", line = 212)
    public final boolean method2286(int arg0) {
        field5669++;
        if (arg0 != -13081) {
            field5670 = 71;
        }
        return (this.field5661 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z", line = 228)
    public final boolean method2287(int arg0) {
        if (arg0 == -2063688673) {
            field5655++;
            return (this.field5661 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Z", line = 240)
    public final boolean method2288(int arg0) {
        field5675++;
        if (arg0 == -20710) {
            return (this.field5661 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V", line = 252)
    public class327(int arg0, int arg1) {
        this.field5654 = arg1;
        this.field5661 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Z", line = 291)
    public final boolean method2289(boolean arg0) {
        if (arg0) {
            field5666 = (int[]) null;
        }
        field5653++;
        return (this.field5661 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Z", line = 304)
    public final boolean method2290(int arg0) {
        field5671++;
        if (arg0 != 31595) {
            field5656 = (class266) null;
        }
        return ((this.field5661 & 0x67A5B75D) >> 30) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Z", line = 322)
    public final boolean method2291(byte arg0) {
        if (arg0 == -9) {
            field5673++;
            return (this.field5661 & 0x1B223520) >> 28 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)I", line = 333)
    public final int method2292(int arg0) {
        if (arg0 > -51) {
            field5665 = -42;
        }
        field5674++;
        return class4.method20((byte) -34, this.field5661);
    }
}
