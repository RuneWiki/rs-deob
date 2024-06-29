import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class71 extends class182 {

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    private int field1312 = 1024;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    private int field1301 = 2048;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    private int field1309 = 3072;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1315 = "glow2:";

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field1316 = -1;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Lbn;")
    public static class75 field1300;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[[[I")
    public static int[][][] field1308;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, 127);
        field1306++;
        if (arg0 != 2) {
            return (int[]) null;
        }
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, arg0 ^ 0xFFFFFF8C);
            for (int var5 = 0; var5 < class26.field672; var5++) {
                var3[var5] = (var4[var5] * this.field1301 >> 12) + this.field1312;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 41)
    public final void method163(int arg0) {
        this.field1301 = this.field1309 - this.field1312;
        if (arg0 == 100) {
            field1310++;
        }
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 58)
    public static void method538(int arg0) {
        field1315 = null;
        if (arg0 != 0) {
            field1308 = (int[][][]) ((int[][][]) null);
        }
        field1300 = null;
        field1308 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIIIIIIIII)V", line = 73)
    public static final void method539(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class92.field1638[var11][var12] = 0;
                class311.field5066[var11][var12] = 99999999;
            }
        }
        field1311++;
        int var13 = arg3;
        if (arg8 != 102) {
            return;
        }
        class92.field1638[arg3][arg10] = 99;
        int var14 = arg10;
        class311.field5066[arg3][arg10] = 0;
        int var15 = 0;
        byte var16 = 0;
        class145.field2433[var16] = arg3;
        boolean var17 = false;
        int var28 = var16 + 1;
        class316.field5135[var16] = arg10;
        int[][] var18 = class23.field576[class276.field4506].field4451;
        while (var15 != var28) {
            var13 = class145.field2433[var15];
            var14 = class316.field5135[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg6 == var13 && arg2 == var14) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class23.field576[class276.field4506].method1927(arg2, arg4, arg6, var14, var13, arg1 - 1, 2, (byte) 106)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class23.field576[class276.field4506].method1945(arg6, arg4, var14, arg8 + 16777114, arg1 + -1, arg2, var13, 2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg5 != 0 && class23.field576[class276.field4506].method1931(var13, arg7, var14, arg9, arg2, 2, arg5, arg6, -1)) {
                var17 = true;
                break;
            }
            int var19 = class311.field5066[var13][var14] + 1;
            if (var13 > 0 && class92.field1638[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x2C0138) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14;
                class92.field1638[var13 - 1][var14] = 2;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13 - 1][var14] = var19;
            }
            if (var13 < 102 && class92.field1638[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x2C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x2C01E0) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14;
                class92.field1638[var13 + 1][var14] = 8;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class92.field1638[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x2C0183) == 0) {
                class145.field2433[var28] = var13;
                class316.field5135[var28] = var14 - 1;
                class92.field1638[var13][var14 - 1] = 1;
                class311.field5066[var13][var14 - 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var14 < 102 && class92.field1638[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x2C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x2C01E0) == 0) {
                class145.field2433[var28] = var13;
                class316.field5135[var28] = var14 + 1;
                class92.field1638[var13][var14 + 1] = 4;
                var28 = var28 + 1 & 0xFFF;
                class311.field5066[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class92.field1638[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x2C013E) == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var18[var13][var14 - 1] & 0x2C018F) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 - 1][var14 - 1] = 3;
                class311.field5066[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 102 && var14 > 0 && class92.field1638[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x2C018F) == 0 && (var18[var13 + 2][var14 - 1] & 0x2C0183) == 0 && (var18[var13 + 2][var14] & 0x2C01E3) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 + 1][var14 - 1] = 9;
                class311.field5066[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 102 && class92.field1638[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x2C013E) == 0 && (var18[var13 - 1][var14 + 2] & 0x2C0138) == 0 && (var18[var13][var14 + 2] & 0x2C01F8) == 0) {
                class145.field2433[var28] = var13 - 1;
                class316.field5135[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class92.field1638[var13 - 1][var14 + 1] = 6;
                class311.field5066[var13 - 1][var14 + 1] = var19;
            }
            if (var13 < 102 && var14 < 102 && class92.field1638[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x2C01F8) == 0 && (var18[var13 + 2][var14 + 2] & 0x2C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x2C01E3) == 0) {
                class145.field2433[var28] = var13 + 1;
                class316.field5135[var28] = var14 + 1;
                class92.field1638[var13 + 1][var14 + 1] = 12;
                class311.field5066[var13 + 1][var14 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg0) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= (arg6 + var22); var23++) {
                for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class311.field5066[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (arg2 + arg5 - 1 < var24) {
                            var26 = var24 + 1 - arg5 - arg2;
                        }
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (var23 > (arg6 + arg7 - 1)) {
                            var25 = var23 - arg6 - (arg7 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class311.field5066[var23][var24] < var21) {
                            var14 = var24;
                            var13 = var23;
                            var21 = class311.field5066[var23][var24];
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg3 == var13 && arg10 == var14) {
                return;
            }
        }
        class284.field4641 = var14;
        class275.field4492 = false;
        class92.field1637 = var13;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V", line = 419)
    public static final void method540(int arg0, boolean arg1) {
        class229.field3755.method896(arg0, (byte) -121);
        if (arg1) {
            field1315 = (String) null;
        }
        field1303++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V", line = 436)
    public static final void method541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -95 % ((87 - arg2) / 39);
        float var6 = (float) class38.field821 / (float) class38.field824;
        int var7 = arg4;
        class170.field2809 = -1;
        int var8 = arg3;
        class105.field1914 = -1;
        field1307++;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = arg1 - (arg3 - var8) / 2;
        int var10 = arg0 - (arg4 - var7) / 2;
        class332.field5303 = class38.field824 * var10 / var7;
        class206.field3449 = class38.field821 * var9 / var8;
        class146.method999(475249384);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 460)
    public class71() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lg;I)Ljava/lang/String;", line = 472)
    public static final String method542(class181 arg0, int arg1) {
        if (arg1 != 1) {
            return (String) null;
        }
        field1302++;
        if (client.method1990(arg0).method2406(0) == 0) {
            return null;
        } else if (arg0.field3122 == null || arg0.field3122.trim().length() == 0) {
            return class323.field5230 ? "Hidden-use" : null;
        } else {
            return arg0.field3122;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 498)
    public static final void method543(byte arg0) {
        field1314++;
        if (class299.field4856 == 0) {
            return;
        }
        try {
            if (++class363.field5741 > 1500) {
                if (class127.field2224 != null) {
                    class127.field2224.method1646((byte) 121);
                    class127.field2224 = null;
                }
                if (class213.field3526 >= 1) {
                    class299.field4856 = 0;
                    class11.field363 = -5;
                    return;
                }
                class363.field5741 = 0;
                if (class46.field932 == class129.field2238) {
                    class129.field2238 = class293.field4746;
                } else {
                    class129.field2238 = class46.field932;
                }
                class299.field4856 = 1;
                class213.field3526++;
            }
            if (class299.field4856 == 1) {
                class41.field877 = class59.field1164.method1120(class129.field2238, class20.field519, -31246);
                class299.field4856 = 2;
            }
            if (class299.field4856 == 2) {
                if (class41.field877.field3504 == 2) {
                    throw new IOException();
                }
                if (class41.field877.field3504 != 1) {
                    return;
                }
                class127.field2224 = new class237((Socket) class41.field877.field3501, class59.field1164);
                class41.field877 = null;
                class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, -20326, 0);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-98);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-123);
                }
                int var1 = class127.field2224.method1639((byte) 125);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-111);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-116);
                }
                if (var1 != 101) {
                    class11.field363 = var1;
                    class299.field4856 = 0;
                    class127.field2224.method1646((byte) 78);
                    class127.field2224 = null;
                    return;
                }
                class299.field4856 = 3;
            }
            if (class299.field4856 == 3) {
                if (class127.field2224.method1642((byte) -89) >= 2) {
                    int var2 = class127.field2224.method1639((byte) 125) << 8 | class127.field2224.method1639((byte) 125);
                    class358.method2529(var2, -1);
                    if (class68.field1262 != -1) {
                        class299.field4856 = 0;
                        class127.field2224.method1646((byte) 91);
                        class127.field2224 = null;
                        class323.method2324((byte) -113);
                        return;
                    }
                    class11.field363 = 6;
                    class299.field4856 = 0;
                    class127.field2224.method1646((byte) 109);
                    class127.field2224 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class127.field2224 != null) {
                class127.field2224.method1646((byte) 89);
                class127.field2224 = null;
            }
            if (class213.field3526 < 1) {
                if (class46.field932 == class129.field2238) {
                    class129.field2238 = class293.field4746;
                } else {
                    class129.field2238 = class46.field932;
                }
                class363.field5741 = 0;
                class213.field3526++;
                class299.field4856 = 1;
            } else {
                class11.field363 = -4;
                class299.field4856 = 0;
            }
        }
        if (arg0 != 89) {
            method545(-82, -56, -126, 71, -65, 25, -108, 119);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Loe;IB)V", line = 650)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field1304++;
        if (arg2 != 60) {
            method545(93, -113, -43, 103, 35, -128, 0, -34);
        }
        if (arg1 == 0) {
            this.field1312 = arg0.method989(96);
        } else if (arg1 == 1) {
            this.field1309 = arg0.method989(108);
        } else if (arg1 == 2) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I", line = 695)
    public final int[][] method122(int arg0, int arg1) {
        if (arg1 != 4944) {
            field1316 = -109;
        }
        field1305++;
        int[][] var3 = this.field3152.method1953(arg0, arg1 - 4840);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 17, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                var8[var11] = (var5[var11] * this.field1301 >> 12) + this.field1312;
                var9[var11] = (var6[var11] * this.field1301 >> 12) + this.field1312;
                var10[var11] = (var7[var11] * this.field1301 >> 12) + this.field1312;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)I", line = 742)
    public static final int method544(int arg0, int arg1) {
        double var2 = (double) ((arg0 & 0xFF42) >> 8) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        field1313++;
        if (arg1 != 29062) {
            return -96;
        }
        double var8 = var4;
        double var10 = 0.0D;
        double var12 = var4;
        if (var4 < var2) {
            var12 = var2;
        }
        double var14 = 0.0D;
        if (var2 < var4) {
            var8 = var2;
        }
        if (var12 < var6) {
            var12 = var6;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var4 == var12) {
                var14 = (var2 - var6) / (var12 - var8);
            } else if (var2 == var12) {
                var14 = (var6 - var4) / (var12 - var8) + 2.0D;
            } else if (var6 == var12) {
                var14 = (var4 - var2) / (var12 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var10 = (var12 - var8) / (var8 + var12);
            }
            if (var16 >= 0.5D) {
                var10 = (var12 - var8) / (2.0D - var12 - var8);
            }
        }
        int var18 = (int) (var10 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var14 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var18 >>= 0x4;
        } else if (var22 > 217) {
            var18 >>= 0x3;
        } else if (var22 > 192) {
            var18 >>= 0x2;
        } else if (var22 > 179) {
            var18 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var18 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V", line = 854)
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1299++;
        int var8 = 0;
        int var9 = arg3 - arg2;
        int var10 = arg5 - arg2;
        int var11 = arg3 * arg3;
        int var12 = arg4;
        int var13 = arg5 * arg5;
        int var14 = arg5;
        int var15 = var10 * var10;
        int var16 = var13 << 1;
        int var17 = var9 * var9;
        int var18 = var11 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = var10 << 1;
        int var22 = arg5 << 1;
        int var23 = var13 - ((var22 - 1) * var18);
        int var24 = (1 - var21) * var17 + var19;
        int var25 = var11 << 2;
        int var26 = (1 - var22) * var11 + var16;
        int var27 = var15 - (var21 - 1) * var20;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = (var21 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var29;
        int var36 = var28;
        int var37 = (arg5 - 1) * var25;
        int var38 = (var10 - 1) * var30;
        int[] var39 = class232.field3799[arg1];
        class344.method2417(var39, arg0 - arg3, -var9 + arg0, arg6, (byte) -122);
        class344.method2417(var39, arg0 - var9, arg0 + var9, arg7, (byte) -123);
        class344.method2417(var39, arg0 + var9, arg0 + arg3, arg6, (byte) -120);
        while (var14 > 0) {
            if (var26 < 0) {
                while (var26 < 0) {
                    var8++;
                    var26 += var31;
                    var31 += var28;
                    var23 += var36;
                    var36 += var28;
                }
            }
            if (var23 < 0) {
                var8++;
                var23 += var36;
                var36 += var28;
                var26 += var31;
                var31 += var28;
            }
            var23 += -var32;
            var32 -= var25;
            var26 += -var37;
            boolean var40 = var14 <= var10;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var27 += var35;
                        var35 += var29;
                        var12++;
                        var24 += var34;
                        var34 += var29;
                    }
                }
                if (var27 < 0) {
                    var27 += var35;
                    var35 += var29;
                    var12++;
                    var24 += var34;
                    var34 += var29;
                }
                var27 += -var33;
                var24 += -var38;
                var38 -= var30;
                var33 -= var30;
            }
            var14--;
            var37 -= var25;
            int var41 = arg1 - var14;
            int var42 = arg0 + var8;
            int var43 = arg0 - var8;
            int var44 = arg1 + var14;
            if (var40) {
                int var45 = arg0 + var12;
                int var46 = arg0 - var12;
                class344.method2417(class232.field3799[var41], var43, var46, arg6, (byte) -124);
                class344.method2417(class232.field3799[var41], var46, var45, arg7, (byte) -121);
                class344.method2417(class232.field3799[var41], var45, var42, arg6, (byte) -125);
                class344.method2417(class232.field3799[var44], var43, var46, arg6, (byte) -126);
                class344.method2417(class232.field3799[var44], var46, var45, arg7, (byte) -125);
                class344.method2417(class232.field3799[var44], var45, var42, arg6, (byte) -123);
            } else {
                class344.method2417(class232.field3799[var41], var43, var42, arg6, (byte) -118);
                class344.method2417(class232.field3799[var44], var43, var42, arg6, (byte) -125);
            }
        }
    }
}
