import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class140 extends class424 {

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
    public static int field2040 = 0;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "Lhc;")
    public static class368 field2043 = new class368("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
    public static int field2049;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tr", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field2051;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "[I")
    public static int[] field2048;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1029(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)[[I", line = 3)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field2046;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (!arg1) {
            this.method19((class366) null, (byte) -56, 63);
        }
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class303.field4135 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V", line = 51)
    public static final void method1024(int arg0, String arg1) {
        if (arg0 != 63) {
            method1028(-102);
        }
        System.out.println("Error: " + class48.method393((byte) 78, "\n", "%0a", arg1));
        ++field2047;
    }

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "(I)V", line = 70)
    public static final void method1025(int arg0) {
        ++field2044;
        if (arg0 != 255) {
            method1026();
        }
        if (class431.field6047 != null) {
            class431.field6047.method1335(125);
        }
        if (class39.field513 != null) {
            class39.field513.method1335(120);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()V", line = 89)
    public static final void method1026() {
        for (int var0 = 0; var0 < class406.field5615; ++var0) {
            if (!class356.field4782[var0]) {
                class271 var1 = class122.field1838[var0];
                int var2 = var1.field3708;
                int var3 = var1.field2206 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field2204 - var3 >> 7;
                int var8 = var1.field2212 - var3 >> 7;
                int var9 = var1.field2212 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class354.field4768) {
                    var9 = class354.field4768 - 1;
                }
                for (int var10 = var8; var10 <= var9; ++var10) {
                    short var11 = var1.field3697[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 255) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class284.field3862) {
                        var15 = class284.field3862 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; ++var16) {
                        byte var17 = 1;
                        class5 var18 = class95.method734(var2, var16, var10, field2051 != null ? field2051 : (field2051 = method1029("ti")));
                        if (var18 != null && var18.field43 != 0) {
                            if (var18.field43 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field3697[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 255) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field3697[var5 - 1];
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
                                    short var29 = var1.field3697[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 255) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field3697[var5 + 1];
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
                class356.field4782[var0] = true;
                class436.field6160[var2].method328(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V", line = 260)
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IB)[I", line = 263)
    public final int[] method43(int arg0, byte arg1) {
        ++field2042;
        if (arg1 != -10) {
            method1024(-20, (String) null);
        }
        int[] var3 = super.field5892.method783(arg0, (byte) 120);
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -125, arg0);
            for (int var5 = 0; var5 < class303.field4135; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[BII)Ljava/lang/String;", line = 304)
    public static final String method1027(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field2041;
        if (arg0 != 124) {
            method1024(-29, (String) null);
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; arg2 > var6; ++var6) {
            int var7 = arg1[arg3 - -var6] & 255;
            if (~var7 != -1) {
                if (~var7 <= -129 && var7 < 160) {
                    char var8 = class171.field2432[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "(I)V", line = 347)
    public static void method1028(int arg0) {
        field2043 = null;
        field2048 = null;
        if (arg0 != 5875) {
            method1027((byte) 5, (byte[]) null, -112, 72);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lrg;BI)V", line = 360)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field2045;
        if (arg1 != -48) {
            this.method19((class366) null, (byte) -52, 31);
        }
        if (~arg2 == -1) {
            super.field5893 = arg0.method2306((byte) 26) == 1;
        }
    }
}
