import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class162 extends class179 {

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "[I")
    public static int[] field2874 = new int[5];

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field2880 = 0;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[Lsc;")
    private class141[] field2873;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Z", line = 5)
    public static final boolean method1192(int arg0, int arg1) {
        field2881++;
        if (arg1 != 32705) {
            field2874 = (int[]) null;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIIZI)V", line = 17)
    public static final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2877++;
        if (arg9) {
            field2874 = (int[]) null;
        }
        int var11 = 983040 / arg3;
        int var12 = arg5 - arg6;
        int var13 = 983040 / arg8;
        int var14 = arg7 - arg2;
        boolean var15;
        if (class288.field4986 > 0 && (class288.field4986 % 10) < 5) {
            var15 = true;
        } else {
            var15 = false;
        }
        for (int var16 = -var11; var16 < var11 + var12; var16++) {
            int var17 = arg3 * var16 + arg4 >> 16;
            int var18 = arg4 + ((var16 + 1) * arg3) >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var10000 = arg1 + var18;
                int var21 = arg6 + var16 >> 6;
                int var22 = arg1 + var17;
                if (var21 >= 0 && class305.field5269.length - 1 >= var21) {
                    int[][] var23 = class305.field5269[var21];
                    for (int var24 = -var13; var24 < (var13 + var14); var24++) {
                        int var25 = (var24 + 1) * arg8 + arg10 >> 16;
                        int var26 = arg10 + (arg8 * var24) >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            var10000 = arg0 + var25;
                            int var29 = arg0 + var26;
                            int var30 = var24 + arg2 >> 6;
                            if (var30 >= 0 && (var23.length - 1) >= var30 && var23[var30] != null) {
                                int var31 = ((arg2 + var24 & 0x3F) << 6) + (arg6 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class273 var33 = class271.method1871(123, var32 - 1);
                                    if (!class196.field3592[var33.field4692]) {
                                        if (var15 && class73.field1331 == var33.field4692) {
                                            class80 var34 = new class80();
                                            var34.field1484 = var22;
                                            var34.field1485 = var29;
                                            var34.field1494 = var33.field4692;
                                            client.field2152.method1269(arg9, var34);
                                        } else {
                                            class191.field3495[var33.field4692].method637(var22 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class80 var35 = (class80) client.field2152.method1270((byte) -121); var35 != null; var35 = (class80) client.field2152.method1277(1)) {
            class191.field3495[var35.field1494].method637(var35.field1484 - 7, var35.field1485 + -7);
            class178.method1297(var35.field1484, var35.field1485, 15, 16776960, 128);
            class178.method1297(var35.field1484, var35.field1485, 7, 16777215, 256);
        }
        client.field2152.method1275((byte) 83);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[[I)V", line = 137)
    private final void method1194(byte arg0, int[][] arg1) {
        if (arg0 >= -71) {
            this.method55(127, 91);
        }
        field2875++;
        int var3 = class161.field2858;
        int var4 = class38.field697;
        class244.method1640(124, arg1);
        class288.method2010(-96, 0, class285.field4945, class19.field255, 0);
        if (this.field2873 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2873.length; var5++) {
            class141 var6 = this.field2873[var5];
            int var7 = var6.field2485;
            int var8 = var6.field2482;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method629(var3, var4, 0);
                }
            } else if (var8 < 0) {
                var6.method634(var4, -1, var3);
            } else {
                var6.method630(var3, 15015, var4);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 190)
    public static void method1195(byte arg0) {
        field2874 = null;
        if (arg0 != 51) {
            field2880 = 104;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIIIIFI)[I", line = 201)
    public static final int[] method1196(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        int[] var8 = new int[arg1];
        class168 var9 = new class168();
        var9.field2969 = arg5;
        var9.field2980 = arg4;
        var9.field2984 = arg7;
        var9.field2985 = arg2;
        field2878++;
        var9.field2977 = arg0;
        var9.field2972 = (int) (arg6 * 4096.0F);
        var9.method418((byte) -110);
        class271.method1873(1, (byte) -55, arg1);
        var9.method1225(var8, arg3 + 1844420972, arg3);
        return var8;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIJ)Z", line = 226)
    public static final boolean method1197(int arg0, int arg1, int arg2, long arg3) {
        class271 var5 = class41.field790[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4639 != null && var5.field4639.field3601 == arg3) {
            return true;
        } else if (var5.field4643 != null && var5.field4643.field712 == arg3) {
            return true;
        } else if (var5.field4628 != null && var5.field4628.field3902 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4641; var6++) {
                if (var5.field4624[var6].field4601 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 260)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[[I", line = 269)
    public final int[][] method55(int arg0, int arg1) {
        field2879++;
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (arg0 != 75) {
            field2874 = (int[]) null;
        }
        if (this.field3169.field1080) {
            int var4 = class161.field2858;
            int var5 = class38.field697;
            int[][][] var6 = this.field3169.method464(-31281);
            int[][] var7 = new int[var5][var4];
            this.method1194((byte) -98, var7);
            for (int var8 = 0; var8 < class38.field697; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var7[var8];
                int[] var11 = var9[0];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class161.field2858; var14++) {
                    int var15 = var10[var14];
                    var13[var14] = class150.method1123(var15 << 4, 4080);
                    var12[var14] = class150.method1123(65280, var15) >> 4;
                    var11[var14] = class150.method1123(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I", line = 338)
    public final int[] method41(int arg0, int arg1) {
        field2876++;
        int[] var3 = this.field3157.method1258(arg1 + 31513, arg0);
        if (arg1 == -31598) {
            if (this.field3157.field3081) {
                this.method1194((byte) -109, this.field3157.method1257(true));
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILra;I)V", line = 368)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2873 = new class141[arg1.method357(false)];
            for (int var4 = 0; var4 < this.field2873.length; var4++) {
                int var5 = arg1.method357(false);
                if (var5 == 0) {
                    this.field2873[var4] = class5.method39(arg1, 2);
                } else if (var5 == 1) {
                    this.field2873[var4] = class98.method700((byte) 121, arg1);
                } else if (var5 == 2) {
                    this.field2873[var4] = class10.method64(15, arg1);
                } else if (var5 == 3) {
                    this.field2873[var4] = class249.method1677(arg1, 0);
                }
            }
        } else if (arg2 == 1) {
            this.field3153 = arg1.method357(false) == 1;
        }
        field2872++;
        if (arg0 <= 108) {
            this.method55(117, 44);
        }
    }
}
