import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class651 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Lqo;")
    private class22 field8944;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public int field8946;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "S")
    public static short field8945 = 32767;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field8951;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8952;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
    public static int[] field8948;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3685(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ[BI)I", line = 3)
    public static final int method3680(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field8943++;
        if (!arg1) {
            return 63;
        }
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class625.field8601[(var4 ^ arg2[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V", line = 31)
    public static final void method3681() {
        for (int var0 = 0; var0 < class234.field3398; var0++) {
            if (!class184.field2781[var0]) {
                class2 var1 = class394.field5788[var0];
                class669 var2 = var1.field18;
                int var3 = var1.field4;
                int var4 = var2.method3758(-1) - class72.field1328;
                int var5 = (var4 * 2 >> class130.field2185) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3759(-1) - var4 >> class130.field2185;
                int var9 = var2.method3752((byte) 79) - var4 >> class130.field2185;
                int var10 = var2.method3752((byte) 113) + var4 >> class130.field2185;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class432.field6185) {
                    var10 = class432.field6185 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field15[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class434.field6208) {
                        var16 = class434.field6208 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class494 var19 = class562.method3228(var3, var17, var11, field8952 == null ? (field8952 = method3685("jb")) : field8952);
                        if (var19 != null && var19.field6833 != 0) {
                            if (var19.field6833 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field15[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field15[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field15[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field15[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class184.field2781[var0] = true;
                class683.field9250[var3].method1158(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V", line = 210)
    protected final void finalize() throws Throwable {
        this.field8944.method242((byte) 65, this.field8946);
        field8950++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIIII)I", line = 219)
    public static final int method3682(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 4 / ((-arg0 - 51) / 63);
        field8949++;
        if (class683.field9250 == null) {
            return 0;
        }
        if (arg4 < 3) {
            int var7 = arg1 >> 9;
            int var8 = arg2 >> 9;
            if (arg3 < 0 || arg5 < 0 || class376.field5325 - 1 < arg3 || (class175.field2711 - 1) < arg5) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || class376.field5325 - 1 < var7 || var8 > (class175.field2711 - 1)) {
                return 0;
            }
            boolean var9 = (class607.field8331[1][arg1 >> 9][arg2 >> 9] & 0x2) != 0;
            if ((arg1 & 0x1FF) == 0) {
                boolean var10 = (class607.field8331[1][var7 - 1][arg2 >> 9] & 0x2) != 0;
                boolean var11 = (class607.field8331[1][var7][arg2 >> 9] & 0x2) != 0;
                if (var10 != var11) {
                    var9 = (class607.field8331[1][arg3][arg5] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x1FF) == 0) {
                boolean var12 = (class607.field8331[1][arg1 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class607.field8331[1][arg1 >> 9][var8] & 0x2) != 0;
                if (var12 != var13) {
                    var9 = (class607.field8331[1][arg3][arg5] & 0x2) != 0;
                }
            }
            if (var9) {
                arg4++;
            }
        }
        return class683.field9250[arg4].method1853(arg1, arg2, (byte) 22);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 279)
    public static void method3683(byte arg0) {
        if (arg0 == -28) {
            field8948 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V", line = 290)
    public static final void method3684(int arg0, int arg1) {
        class112 var2 = class755.field10551;
        synchronized (class755.field10551) {
            class755.field10551.method987(2, arg0);
        }
        if (arg1 == 26603) {
            field8947++;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lqo;II)V", line = 305)
    public class651(class22 arg0, int arg1, int arg2) {
        this.field8944 = arg0;
        this.field8946 = arg2;
    }
}
