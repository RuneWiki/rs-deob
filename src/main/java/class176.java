import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class176 extends class220 {

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    private int field2304 = 0;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    private int field2301 = 10;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "I")
    private int field2306 = 2048;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field2300 = 2;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!go", name = "ab", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!go", name = "cb", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!go", name = "db", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "[I")
    public static int[] field2298;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "[I")
    private int[] field2299;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "[I")
    private int[] field2305;

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "[I")
    public static int[] field2307;

    @OriginalMember(owner = "client!go", name = "bb", descriptor = "[I")
    public static int[] field2310;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field2312;
        if (arg0 != -11543) {
            return null;
        } else {
            int[] var3 = super.field3125.method2005(arg1, (byte) -128);
            if (super.field3125.field4676) {
                int var4 = class58.field831[arg1];
                if (~this.field2304 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; this.field2301 > var6; ++var6) {
                        if (this.field2305[var6] <= var4 && ~var4 > ~this.field2305[var6 - -1]) {
                            if (this.field2299[var6] > var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class111.method769(var3, 0, class344.field5043, var5);
                } else {
                    for (int var7 = 0; ~var7 > ~class344.field5043; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class160.field2096[var7];
                        int var11 = this.field2304;
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + var10 + -4096 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; var12 < this.field2301; ++var12) {
                            if (this.field2305[var12] <= var8 && this.field2305[var12 + 1] > var8) {
                                if (~this.field2299[var12] < ~var8) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(B)V")
    private final void method1073(byte arg0) {
        ++field2311;
        this.field2299 = new int[this.field2301 + 1];
        this.field2305 = new int[this.field2301 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field2301;
        int var4 = this.field2306 * var3 >> 12;
        for (int var5 = 0; this.field2301 > var5; ++var5) {
            this.field2305[var5] = var2;
            this.field2299[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != 76) {
            this.field2305 = null;
        }
        this.field2305[this.field2301] = 4096;
        this.field2299[this.field2301] = this.field2299[0] + 4096;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
    public static void method1074(boolean arg0) {
        field2298 = null;
        field2307 = null;
        field2310 = null;
        if (arg0) {
            field2300 = -93;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        ++field2309;
        if (arg0 == 0) {
            this.method1073((byte) 76);
        }
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "(B)V")
    public static final void method1075(byte arg0) {
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class85.field1178[var1] = true;
        }
        ++field2302;
        if (arg0 != -125) {
            method1075((byte) -102);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field2303;
        if (arg1 != -49) {
            this.field2301 = -122;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2304 = arg2.method1697(101);
                }
            } else {
                this.field2306 = arg2.method1685(arg1 ^ -8089);
            }
        } else {
            this.field2301 = arg2.method1697(105);
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)Z")
    public static final boolean method1076(int arg0) {
        ++field2308;
        try {
            if (arg0 != 9316) {
                field2298 = null;
            }
            return class81.method516(-78);
        } catch (IOException var4) {
            class120.method837(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class188.field2551 + "," + class227.field3199 + "," + class313.field4484 + " - " + class413.field6176 + "," + (class100.field1350.field303[0] + class184.field2482) + "," + (class100.field1350.field306[0] + class38.field620) + " - ";
            for (int var3 = 0; var3 < class413.field6176 && var3 < 50; ++var3) {
                var2 = var2 + class114.field1556.field3879[var3] + ",";
            }
            class226.method1406(var2, var5, 0);
            class322.method1992(arg0 + -9314);
            return true;
        }
    }
}
