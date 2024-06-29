import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class127 extends class175 {

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    private int field2319 = 409;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "[I")
    private int[] field2320 = new int[3];

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field2315 = 4096;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    private int field2327 = 4096;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    private int field2325 = 4096;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "[Lq;")
    public static class157[] field2313 = new class157[6];

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Lmb;")
    private static class96 field2314 = class243.method1708("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) 113);

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "[I")
    public static int[] field2316 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "Lmb;")
    public static class96 field2329 = field2314;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lmb;")
    public static class96 field2328 = class243.method1708("k", (byte) 93);

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "[I")
    public static int[] field2323;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            return null;
        } else {
            ++field2312;
            int[][] var3 = super.field3035.method637(arg0, false);
            if (super.field3035.field1493) {
                int[][] var4 = this.method1253(arg0, -2880, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                int[] var10 = var3[1];
                for (int var11 = 0; ~var11 > ~class1.field11; ++var11) {
                    int var12 = var6[var11];
                    int var13 = -this.field2320[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var13 > this.field2319) {
                        var9[var11] = var12;
                        var10[var11] = var5[var11];
                        var8[var11] = var7[var11];
                    } else {
                        int var14 = var5[var11];
                        int var15 = -this.field2320[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var15 > this.field2319) {
                            var9[var11] = var12;
                            var10[var11] = var14;
                            var8[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field2320[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (var17 > this.field2319) {
                                var9[var11] = var12;
                                var10[var11] = var14;
                                var8[var11] = var16;
                            } else {
                                var9[var11] = this.field2327 * var12 >> 12;
                                var10[var11] = this.field2315 * var14 >> 12;
                                var8[var11] = this.field2325 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)I")
    public static final int method969(byte arg0, int arg1) {
        if (arg0 < 79) {
            field2329 = null;
        }
        ++field2317;
        int var2 = 3 & arg1 >> 6;
        int var3 = 63 & arg1;
        if (~var3 == -19) {
            if (var2 == 0) {
                return 1;
            }
            if (~var2 == -2) {
                return 2;
            }
            if (~var2 == -3) {
                return 4;
            }
            if (~var2 == -4) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (~var2 == -1) {
                return 16;
            }
            if (~var2 == -2) {
                return 32;
            }
            if (~var2 == -3) {
                return 64;
            }
            if (~var2 == -4) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)Z")
    public static final boolean method970(int arg0) {
        ++field2322;
        if (arg0 >= -8) {
            field2328 = null;
        }
        class234 var1 = class60.field1037;
        synchronized (class60.field1037) {
            if (class268.field4655 == class124.field2296) {
                return false;
            } else {
                class1.field9 = class114.field2104[class124.field2296];
                class145.field2579 = class9.field160[class124.field2296];
                class124.field2296 = 127 & class124.field2296 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = 25 / ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var6 = arg2.method1660(-335289648);
                            this.field2320[2] = class130.method985(255, var6) >> 12;
                            this.field2320[0] = class130.method985(var6 << 4, 267386880);
                            this.field2320[1] = class130.method985(var6, 65280) >> 4;
                        }
                    } else {
                        this.field2327 = arg2.method1663((byte) -93);
                    }
                } else {
                    this.field2315 = arg2.method1663((byte) -117);
                }
            } else {
                this.field2325 = arg2.method1663((byte) -122);
            }
        } else {
            this.field2319 = arg2.method1663((byte) 122);
        }
        ++field2321;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
    public static void method971(byte arg0) {
        field2314 = null;
        if (arg0 != -104) {
            field2316 = null;
        }
        field2329 = null;
        field2328 = null;
        field2316 = null;
        field2323 = null;
        field2313 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method972(int arg0, byte[] arg1) {
        ++field2326;
        if (arg0 != -17905) {
            method972(78, (byte[]) null);
        }
        class239 var2 = new class239(arg1);
        int var3 = var2.method1651(4139);
        int var4 = var2.method1617((byte) -43);
        if (var4 >= 0 && (~class83.field1412 == -1 || var4 <= class83.field1412)) {
            if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method1630(var4, (byte) 0, var5, 0);
                return var5;
            } else {
                int var6 = var2.method1617((byte) -43);
                if (~var6 <= -1 && (class83.field1412 == 0 || ~class83.field1412 <= ~var6)) {
                    byte[] var7 = new byte[var6];
                    if (var3 != 1) {
                        class200.field3478.method1357((byte) 118, var7, var2);
                    } else {
                        class81.method569(var7, var6, arg1, var4, 9);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lrg;B)Lmb;")
    public static final class96 method973(class239 arg0, byte arg1) {
        if (arg1 < 63) {
            field2316 = null;
        }
        ++field2318;
        return class89.method635(120, 32767, arg0);
    }
}
