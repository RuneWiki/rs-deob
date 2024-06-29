import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class241 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lqp;")
    private class278 field3223 = null;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lqp;")
    private class278 field3224 = null;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    private int field3228 = 65000;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
    public static int[] field3219 = new int[1000];

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Llm;ZLlm;I)V", line = 4)
    public static final void method1445(class347 arg0, boolean arg1, class347 arg2, int arg3) {
        class227.field2975 = arg2;
        if (arg3 != 1) {
            method1449((byte) 100);
        }
        class173.field2305 = arg1;
        class276.field3991 = arg0;
        field3222++;
    }

    @OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field3229++;
        return "Cache:" + this.field3231;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Ljava/lang/String;", line = 36)
    public static final String method1446(int arg0, int arg1) {
        field3225++;
        if (arg1 != 4) {
            method1449((byte) -2);
        }
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[B", line = 53)
    public final byte[] method1447(int arg0, int arg1) {
        field3221++;
        class278 var3 = this.field3224;
        synchronized (this.field3224) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3223.method1928(1)) {
                    return null;
                }
                this.field3223.method1927((byte) -24, (long) (arg1 * 6));
                this.field3223.method1930(0, class157.field2129, 6, 0);
                int var5 = ((class157.field2129[0] & 0xFF) << 16) + ((class157.field2129[1] & 0xFF) << 8) + (class157.field2129[2] & 0xFF);
                int var6 = ((class157.field2129[3] & 0xFF) << 16) + ((class157.field2129[4] & 0xFF) << 8) + (class157.field2129[5] & 0xFF);
                if (var5 < 0 || this.field3228 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3224.method1928(1) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    if (arg0 != -376026200) {
                        this.field3231 = 57;
                    }
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3224.method1927((byte) -24, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3224.method1930(0, class157.field2129, var13 + 8, 0);
                        int var14 = (class157.field2129[0] & 0xFF << 8) + (class157.field2129[1] & 0xFF);
                        int var15 = (class157.field2129[2] & 0xFF << 8) + (class157.field2129[3] & 0xFF);
                        int var16 = (class157.field2129[4] & 0xFF << 16) + ((class157.field2129[5] & 0xFF) << 8) + (class157.field2129[6] & 0xFF);
                        int var17 = class157.field2129[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3231 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3224.method1928(arg0 ^ 0xE9964BA9) / 520L) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label74;
                                    }
                                    var9[var10++] = class157.field2129[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lil;[[BII[[BLii;[ZIIIII[[BLrc;)V", line = 138)
    public static final void method1448(class264 arg0, byte[][] arg1, int arg2, int arg3, byte[][] arg4, class405 arg5, boolean[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][] arg12, class100 arg13) {
        field3227++;
        if (arg13 != null && arg0 != null || arg0 != null && arg8 == 12 || arg13 != null && arg8 == 0) {
            boolean[] var14 = arg13 != null && arg13.field1409 ? class211.field2828[arg8] : class349.field5043[arg8];
            if (arg7 > 0) {
                if (arg2 > 0) {
                    int var15 = arg12[arg2 - 1][arg7 - 1] & 0xFF;
                    if (var15 > 0) {
                        class100 var16 = class415.method2642(var15 - 1, 11619);
                        if (var16.field1393 != -1 && var16.field1409) {
                            byte var17 = arg1[arg2 - 1][arg7 - 1];
                            int var18 = arg4[arg2 - 1][arg7 - 1] * 2 + 4 & 0x7;
                            int var19 = class1.method9(arg5, (byte) 126, var16);
                            if (class420.field6209[var17][var18]) {
                                class268.field3865[0] = var16.field1393;
                                class406.field6032[0] = var19;
                                class228.field3000[0] = arg5.method1720() ? var16.field1410 : var16.field1395;
                                class164.field2213[0] = var16.field1400;
                                class181.field2393[0] = var16.field1398;
                                class105.field1520[0] = 256;
                            }
                        }
                    }
                }
                if (arg2 < (arg10 - 1)) {
                    int var20 = arg12[arg2 + 1][arg7 - 1] & 0xFF;
                    if (var20 > 0) {
                        class100 var21 = class415.method2642(var20 - 1, 11619);
                        if (var21.field1393 != -1 && var21.field1409) {
                            byte var22 = arg1[arg2 + 1][arg7 - 1];
                            int var23 = arg4[arg2 + 1][arg7 - 1] * 2 + 6 & 0x7;
                            int var24 = class1.method9(arg5, (byte) 119, var21);
                            if (class420.field6209[var22][var23]) {
                                class268.field3865[2] = var21.field1393;
                                class406.field6032[2] = var24;
                                class228.field3000[2] = arg5.method1720() ? var21.field1410 : var21.field1395;
                                class164.field2213[2] = var21.field1400;
                                class181.field2393[2] = var21.field1398;
                                class105.field1520[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg9 - 1 > arg7) {
                if (arg2 > 0) {
                    int var25 = arg12[arg2 - 1][arg7 + 1] & 0xFF;
                    if (var25 > 0) {
                        class100 var26 = class415.method2642(var25 - 1, 11619);
                        if (var26.field1393 != -1 && var26.field1409) {
                            byte var27 = arg1[arg2 - 1][arg7 + 1];
                            int var28 = (arg4[arg2 - 1][arg7 + 1] * 2) + 2 & 0x7;
                            int var29 = class1.method9(arg5, (byte) -13, var26);
                            if (class420.field6209[var27][var28]) {
                                class268.field3865[6] = var26.field1393;
                                class406.field6032[6] = var29;
                                class228.field3000[6] = arg5.method1720() ? var26.field1410 : var26.field1395;
                                class164.field2213[6] = var26.field1400;
                                class181.field2393[6] = var26.field1398;
                                class105.field1520[6] = 64;
                            }
                        }
                    }
                }
                if (arg10 - 1 > arg2) {
                    int var30 = arg12[arg2 + 1][arg7 + 1] & 0xFF;
                    if (var30 > 0) {
                        class100 var31 = class415.method2642(var30 - 1, 11619);
                        if (var31.field1393 != -1 && var31.field1409) {
                            byte var32 = arg1[arg2 + 1][arg7 + 1];
                            int var33 = -(-(arg4[arg2 + 1][arg7 + 1] * 2)) & 0x7;
                            int var34 = class1.method9(arg5, (byte) 112, var31);
                            if (class420.field6209[var32][var33]) {
                                class268.field3865[4] = var31.field1393;
                                class406.field6032[4] = var34;
                                class228.field3000[4] = arg5.method1720() ? var31.field1410 : var31.field1395;
                                class164.field2213[4] = var31.field1400;
                                class181.field2393[4] = var31.field1398;
                                class105.field1520[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg7 > 0) {
                int var35 = arg12[arg2][arg7 - 1] & 0xFF;
                if (var35 > 0) {
                    class100 var36 = class415.method2642(var35 - 1, 11619);
                    if (var36.field1393 != -1) {
                        byte var37 = arg1[arg2][arg7 - 1];
                        byte var38 = arg4[arg2][arg7 - 1];
                        if (var36.field1409) {
                            int var39 = 2;
                            int var40 = (var38 * 2) + 4;
                            int var41 = class1.method9(arg5, (byte) -53, var36);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class420.field6209[var37][var40] && class181.field2393[var39] <= var36.field1398) {
                                    class268.field3865[var39] = var36.field1393;
                                    class406.field6032[var39] = var41;
                                    class228.field3000[var39] = arg5.method1720() ? var36.field1410 : var36.field1395;
                                    class164.field2213[var39] = var36.field1400;
                                    if (class181.field2393[var39] == var36.field1398) {
                                        class105.field1520[var39] = class351.method2313(class105.field1520[var39], 32);
                                    } else {
                                        class105.field1520[var39] = 32;
                                    }
                                    class181.field2393[var39] = var36.field1398;
                                }
                                var39--;
                                var40++;
                            }
                            if (!var14[arg11 & 0x3]) {
                                arg6[0] = class211.field2828[var37][class183.method1117(3, var38 + 2)];
                            }
                        } else if (!var14[arg11 & 0x3]) {
                            arg6[0] = class349.field5043[var37][class183.method1117(var38 + 2, 3)];
                        }
                    }
                }
            }
            if (arg7 < (arg9 - 1)) {
                int var43 = arg12[arg2][arg7 + 1] & 0xFF;
                if (var43 > 0) {
                    class100 var44 = class415.method2642(var43 - 1, 11619);
                    if (var44.field1393 != -1) {
                        byte var45 = arg1[arg2][arg7 + 1];
                        byte var46 = arg4[arg2][arg7 + 1];
                        if (var44.field1409) {
                            int var47 = 4;
                            int var48 = (var46 * 2) + 2;
                            int var49 = class1.method9(arg5, (byte) -87, var44);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var47 &= 0x7;
                                var48 &= 0x7;
                                if (class420.field6209[var45][var48] && var44.field1398 >= class181.field2393[var47]) {
                                    class268.field3865[var47] = var44.field1393;
                                    class406.field6032[var47] = var49;
                                    class228.field3000[var47] = arg5.method1720() ? var44.field1410 : var44.field1395;
                                    class164.field2213[var47] = var44.field1400;
                                    if (class181.field2393[var47] == var44.field1398) {
                                        class105.field1520[var47] = class351.method2313(class105.field1520[var47], 16);
                                    } else {
                                        class105.field1520[var47] = 16;
                                    }
                                    class181.field2393[var47] = var44.field1398;
                                }
                                var48--;
                                var47++;
                            }
                            if (!var14[arg11 + 2 & 0x3]) {
                                arg6[2] = class211.field2828[var45][class183.method1117(3, -(-var46))];
                            }
                        } else if (!var14[arg11 + 2 & 0x3]) {
                            arg6[2] = class349.field5043[var45][class183.method1117(3, var46)];
                        }
                    }
                }
            }
            if (arg2 > 0) {
                int var51 = arg12[arg2 - 1][arg7] & 0xFF;
                if (var51 > 0) {
                    class100 var52 = class415.method2642(var51 - 1, 11619);
                    if (var52.field1393 != -1) {
                        byte var53 = arg1[arg2 - 1][arg7];
                        byte var54 = arg4[arg2 - 1][arg7];
                        if (var52.field1409) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class1.method9(arg5, (byte) -47, var52);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var56 &= 0x7;
                                var55 &= 0x7;
                                if (class420.field6209[var53][var56] && class181.field2393[var55] <= var52.field1398) {
                                    class268.field3865[var55] = var52.field1393;
                                    class406.field6032[var55] = var57;
                                    class228.field3000[var55] = arg5.method1720() ? var52.field1410 : var52.field1395;
                                    class164.field2213[var55] = var52.field1400;
                                    if (class181.field2393[var55] == var52.field1398) {
                                        class105.field1520[var55] = class351.method2313(class105.field1520[var55], 8);
                                    } else {
                                        class105.field1520[var55] = 8;
                                    }
                                    class181.field2393[var55] = var52.field1398;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg11 + 3 & 0x3]) {
                                arg6[3] = class211.field2828[var53][class183.method1117(var54 + 1, 3)];
                            }
                        } else if (!var14[arg11 + 3 & 0x3]) {
                            arg6[3] = class349.field5043[var53][class183.method1117(3, var54 + 1)];
                        }
                    }
                }
            }
            if (arg10 - 1 > arg2) {
                int var59 = arg12[arg2 + 1][arg7] & 0xFF;
                if (var59 > 0) {
                    class100 var60 = class415.method2642(var59 - 1, arg3 + 8895);
                    if (var60.field1393 != -1) {
                        byte var61 = arg1[arg2 + 1][arg7];
                        byte var62 = arg4[arg2 + 1][arg7];
                        if (var60.field1409) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class1.method9(arg5, (byte) 113, var60);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var64 &= 0x7;
                                var63 &= 0x7;
                                if (class420.field6209[var61][var64] && var60.field1398 >= class181.field2393[var63]) {
                                    class268.field3865[var63] = var60.field1393;
                                    class406.field6032[var63] = var65;
                                    class228.field3000[var63] = arg5.method1720() ? var60.field1410 : var60.field1395;
                                    class164.field2213[var63] = var60.field1400;
                                    if (class181.field2393[var63] == var60.field1398) {
                                        class105.field1520[var63] = class351.method2313(class105.field1520[var63], 4);
                                    } else {
                                        class105.field1520[var63] = 4;
                                    }
                                    class181.field2393[var63] = var60.field1398;
                                }
                                var64++;
                                var63--;
                            }
                            if (!var14[arg11 + 1 & 0x3]) {
                                arg6[1] = class211.field2828[var61][class183.method1117(3, var62 + 3)];
                            }
                        } else if (!var14[arg11 + 1 & 0x3]) {
                            arg6[1] = class349.field5043[var61][class183.method1117(3, var62 + 3)];
                        }
                    }
                }
            }
        }
        if (arg13 != null) {
            int var67 = class1.method9(arg5, (byte) 121, arg13);
            if (arg13.field1409) {
                for (int var68 = 0; var68 < 8; var68++) {
                    int var69 = var68 - arg11 * 2 & 0x7;
                    if (class420.field6209[arg8][var68] && class181.field2393[var69] <= arg13.field1398) {
                        class268.field3865[var69] = arg13.field1393;
                        class406.field6032[var69] = var67;
                        class228.field3000[var69] = arg5.method1720() ? arg13.field1410 : arg13.field1395;
                        class164.field2213[var69] = arg13.field1400;
                        if (class181.field2393[var69] == arg13.field1398) {
                            class105.field1520[var69] = class351.method2313(class105.field1520[var69], 2);
                        } else {
                            class105.field1520[var69] = 2;
                        }
                        class181.field2393[var69] = arg13.field1398;
                    }
                }
            }
        }
        if (arg3 != 2724) {
            method1446(-116, 94);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(ILqp;Lqp;I)V", line = 788)
    public class241(int arg0, class278 arg1, class278 arg2, int arg3) {
        this.field3224 = arg1;
        this.field3223 = arg2;
        this.field3228 = arg3;
        this.field3231 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 618)
    public static void method1449(byte arg0) {
        field3219 = null;
        if (arg0 != 74) {
            field3219 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZBII[B)Z", line = 629)
    private final boolean method1450(boolean arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        field3220++;
        class278 var6 = this.field3224;
        synchronized (this.field3224) {
            try {
                int var7;
                if (arg0) {
                    if (this.field3223.method1928(1) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field3223.method1927((byte) -24, (long) (arg2 * 6));
                    this.field3223.method1930(0, class157.field2129, 6, 0);
                    var7 = (class157.field2129[4] & 0xFF << 8) + (class157.field2129[3] & 0xFF << 16) + (class157.field2129[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3224.method1928(1) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3224.method1928(1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class157.field2129[3] = (byte) (var7 >> 16);
                class157.field2129[4] = (byte) (var7 >> 8);
                class157.field2129[5] = (byte) var7;
                class157.field2129[2] = (byte) arg3;
                class157.field2129[1] = (byte) (arg3 >> 8);
                class157.field2129[0] = (byte) (arg3 >> 16);
                if (arg1 > -64) {
                    return false;
                }
                this.field3223.method1927((byte) -24, (long) (arg2 * 6));
                this.field3223.method1924(0, 6, 70, class157.field2129);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg3) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field3224.method1927((byte) -24, (long) (var7 * 520));
                            try {
                                this.field3224.method1930(0, class157.field2129, 8, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class157.field2129[0] & 0xFF << 8) + (class157.field2129[1] & 0xFF);
                            int var15 = ((class157.field2129[2] & 0xFF) << 8) + (class157.field2129[3] & 0xFF);
                            var13 = (class157.field2129[6] & 0xFF) + ((class157.field2129[4] & 0xFF) << 16) + (class157.field2129[5] & 0xFF << 8);
                            int var16 = class157.field2129[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field3231 == var16) {
                                if (var13 >= 0 && this.field3224.method1928(1) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field3224.method1928(1) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class157.field2129[0] = (byte) (arg2 >> 8);
                    class157.field2129[2] = (byte) (var12 >> 8);
                    if ((arg3 - var11) <= 512) {
                        var13 = 0;
                    }
                    class157.field2129[1] = (byte) arg2;
                    class157.field2129[3] = (byte) var12;
                    class157.field2129[4] = (byte) (var13 >> 16);
                    class157.field2129[7] = (byte) this.field3231;
                    class157.field2129[6] = (byte) var13;
                    class157.field2129[5] = (byte) (var13 >> 8);
                    this.field3224.method1927((byte) -24, (long) (var7 * 520));
                    this.field3224.method1924(0, 8, 43, class157.field2129);
                    int var19 = arg3 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3224.method1924(var11, var19, -119, arg4);
                    var7 = var13;
                    var11 += var19;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIII)Z", line = 759)
    public final boolean method1451(byte[] arg0, int arg1, int arg2, int arg3) {
        field3226++;
        class278 var5 = this.field3224;
        synchronized (this.field3224) {
            if (arg3 < 0 || arg3 > this.field3228) {
                throw new IllegalArgumentException();
            }
            if (arg2 != 8926) {
                method1445((class347) null, true, (class347) null, -110);
            }
            boolean var6 = this.method1450(true, (byte) -91, arg1, arg3, arg0);
            if (!var6) {
                var6 = this.method1450(false, (byte) -92, arg1, arg3, arg0);
            }
            return var6;
        }
    }
}
