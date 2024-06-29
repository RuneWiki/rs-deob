import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class306 extends class355 {

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lfg;")
    public static class18 field4467 = new class18(8);

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4472 = "Loaded world list data";

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "[[B")
    public static byte[][] field4471 = new byte[1000][];

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "B")
    public byte field4470;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lec;")
    public class37 field4465;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ma", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4475;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)[B")
    public final byte[] method1883(int arg0) {
        ++field4469;
        if (!super.field5053 && this.field4465.field565 >= this.field4465.field578.length + -this.field4470) {
            int var2 = 42 / ((-53 - arg0) / 43);
            return this.field4465.field578;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)I")
    public static final int method2092(int arg0, int arg1, int arg2) {
        ++field4464;
        int var3 = 1;
        int var4 = -6 / ((55 - arg0) / 63);
        while (~arg2 < -2) {
            if (~(1 & arg2) != -1) {
                var3 = arg1 * var3;
            }
            arg2 >>= 1;
            arg1 *= arg1;
        }
        if (~arg2 == -2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)V")
    public static void method2093(byte arg0) {
        if (arg0 == 98) {
            field4471 = null;
            field4467 = null;
            field4472 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public static final void method2094(int arg0, int arg1, int arg2, int arg3) {
        class168 var4 = class443.field6447[arg0][arg1][arg2];
        if (var4 != null) {
            class350 var5 = var4.field2506;
            class350 var6 = var4.field2507;
            if (var5 != null) {
                var5.field4979 = var5.field4979 * arg3 / 16;
                var5.field4978 = var5.field4978 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field4979 = var6.field4979 * arg3 / 16;
                var6.field4978 = var6.field4978 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public static final void method2095() {
        for (int var0 = 0; var0 < class336.field4811; ++var0) {
            if (!class354.field5034[var0]) {
                class420 var1 = class115.field1834[var0];
                int var2 = var1.field6124;
                int var3 = var1.field943 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field942 - var3 >> 7;
                int var8 = var1.field945 - var3 >> 7;
                int var9 = var1.field945 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class436.field6353) {
                    var9 = class436.field6353 - 1;
                }
                for (int var10 = var8; var10 <= var9; ++var10) {
                    short var11 = var1.field6138[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 255) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class139.field2209) {
                        var15 = class139.field2209 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; ++var16) {
                        byte var17 = 1;
                        class447 var18 = class371.method2358(var2, var16, var10, field4475 != null ? field4475 : (field4475 = method2097("pf")));
                        if (var18 != null && var18.field6510 != 0) {
                            if (var18.field6510 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field6138[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 255) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field6138[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 255) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field6138[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 255) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field6138[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 255) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    ++var5;
                }
                class354.field5034[var0] = true;
                class50.field816[var2].method806(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
    public static final void method2096(int arg0, int arg1) {
        class447.field6511.method104(arg0, (byte) -34);
        ++field4468;
        if (arg1 != 3516) {
            field4471 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)I")
    public final int method1884(int arg0) {
        ++field4473;
        if (this.field4465 == null) {
            return 0;
        } else {
            if (arg0 >= -93) {
                this.method1883(-64);
            }
            return this.field4465.field565 * 100 / (this.field4465.field578.length + -this.field4470);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2097(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
