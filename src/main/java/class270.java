import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class270 {

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Lnd;")
    private class223 field4362 = null;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Z")
    private boolean field4371;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    private boolean field4349;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lwl;")
    private class167 field4364;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[[I")
    public static int[][] field4344 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field4342 = -1;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4357 = "Connected to update server";

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Z")
    public static boolean field4368 = false;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "F")
    public static float field4376 = 0.0F;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[Ljava/lang/Object;")
    private Object[] field4338;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4372;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[IB)Z")
    private final boolean method1863(int arg0, int[] arg1, byte arg2) {
        field4348++;
        if (!this.method1870((byte) -127, arg0)) {
            return false;
        } else if (this.field4338[arg0] == null) {
            return false;
        } else {
            int var4 = this.field4362.field3265[arg0];
            int[] var5 = this.field4362.field3285[arg0];
            if (this.field4372[arg0] == null) {
                this.field4372[arg0] = new Object[this.field4362.field3276[arg0]];
            }
            Object[] var6 = this.field4372[arg0];
            boolean var7 = true;
            if (arg2 != 121) {
                return false;
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var10 = class106.method821(true, this.field4338[arg0], -82);
                class53 var11 = new class53(var10);
                var11.method346(-31506, arg1, var11.field758.length, 5);
            } else {
                var10 = class106.method821(false, this.field4338[arg0], -72);
            }
            byte[] var12;
            try {
                var12 = class203.method1432((byte) 124, var10);
            } catch (RuntimeException var31) {
                throw class240.method1642(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class147.method1089(var10, var10.length, 0) + "," + class147.method1089(var10, var10.length - 2, 0) + "," + this.field4362.field3275[arg0] + "," + this.field4362.field3269);
            }
            if (this.field4371) {
                this.field4338[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class53 var16 = new class53(var12);
                int var17 = var32 - var4 * var15 * 4;
                var16.field735 = var17;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method340(-96);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var16.field735 = var17;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method340(-112);
                        class117.method880(var12, var24, var22[var27], var18[var27], var26);
                        var18[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field4349) {
                        var6[var29] = var22[var28];
                    } else {
                        var6[var29] = class20.method142(class224.method1553(arg2, 49), false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field4349) {
                    var6[var30] = var12;
                } else {
                    var6[var30] = class20.method142(-70, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
    private final boolean method1864(int arg0, int arg1, int arg2) {
        field4359++;
        if (arg0 != 6707) {
            this.method1866((byte) -38, -126);
        }
        if (!this.method1895((byte) -93)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field4362.field3276.length && arg1 < this.field4362.field3276[arg2]) {
            return true;
        } else if (class65.field977) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1865(String arg0, byte arg1) {
        if (arg1 < 83) {
            return -35;
        }
        field4339++;
        if (this.method1895((byte) -95)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4362.field3282.method556(class71.method537(var3, -126), (byte) 10);
            return this.method1876(var4, (byte) 36);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[I")
    public final int[] method1866(byte arg0, int arg1) {
        field4370++;
        if (!this.method1870((byte) -42, arg1)) {
            return null;
        }
        if (arg0 != -69) {
            this.method1892((byte) -78);
        }
        int[] var3 = this.field4362.field3285[arg1];
        if (var3 == null) {
            var3 = new int[this.field4362.field3265[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIZ)V")
    public final void method1867(boolean arg0, int arg1, boolean arg2) {
        field4367++;
        if (arg1 != -23835) {
            this.method1895((byte) -30);
        }
        if (!this.method1895((byte) -21)) {
            return;
        }
        if (arg0) {
            this.field4362.field3282 = null;
            this.field4362.field3262 = null;
        }
        if (arg2) {
            this.field4362.field3279 = null;
            this.field4362.field3277 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)[B")
    public final byte[] method1868(int arg0, int arg1, int arg2) {
        field4354++;
        if (arg2 != 1) {
            this.field4371 = true;
        }
        return this.method1883(arg0, arg1, 85, (int[]) null);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1869(byte arg0, String arg1) {
        field4353++;
        if (!this.method1895((byte) -88)) {
            return false;
        }
        if (arg0 > -13) {
            this.method1880(24);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4362.field3282.method556(class71.method537(var3, -128), (byte) 10);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)Z")
    private final boolean method1870(byte arg0, int arg1) {
        field4356++;
        int var3 = -99 / ((58 - arg0) / 36);
        if (!this.method1895((byte) -90)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field4362.field3276.length && this.field4362.field3276[arg1] != 0) {
            return true;
        } else if (class65.field977) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)I")
    public static final int method1871(boolean arg0, int arg1) {
        field4374++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (!arg0) {
                field4342 = 78;
            }
            return class240.method1643(119, arg1);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(ZI)V")
    private final void method1872(boolean arg0, int arg1) {
        field4345++;
        this.field4364.method1192(arg1, -2);
        if (arg0) {
            this.method1864(46, -33, -55);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
    public final boolean method1873(int arg0, int arg1) {
        field4375++;
        if (!this.method1870((byte) -84, arg1)) {
            return false;
        } else if (this.field4338[arg1] == null) {
            this.method1874(255, arg1);
            if (this.field4338[arg1] == null) {
                int var3 = -17 % ((arg0 + 11) / 37);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    private final void method1874(int arg0, int arg1) {
        if (arg0 != 255) {
            field4344 = null;
        }
        field4351++;
        if (this.field4371) {
            this.field4338[arg1] = this.field4364.method1194(false, arg1);
        } else {
            this.field4338[arg1] = class20.method142(class224.method1553(arg0, 156), false, this.field4364.method1194(false, arg1));
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1875(boolean arg0, String arg1, String arg2) {
        field4363++;
        if (!this.method1895((byte) -33)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4362.field3282.method556(class71.method537(var4, -105), (byte) 10);
        if (!this.method1870((byte) 13, var6)) {
            return false;
        }
        if (!arg0) {
            this.method1879(25);
        }
        int var7 = this.field4362.field3277[var6].method556(class71.method537(var5, 93), (byte) 10);
        return this.method1890(10, var6, var7);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)I")
    private final int method1876(int arg0, byte arg1) {
        field4355++;
        if (arg1 != 36) {
            field4376 = -0.33814308F;
        }
        if (this.method1870((byte) -14, arg0)) {
            return this.field4338[arg0] == null ? this.field4364.method1195(25046, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1877(String arg0, byte arg1) {
        field4360++;
        if (!this.method1895((byte) -55)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 >= -88) {
            return true;
        } else {
            int var4 = this.field4362.field3282.method556(class71.method537(var3, 97), (byte) 10);
            return this.method1873(39, var4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1878(String arg0, int arg1) {
        field4373++;
        if (arg1 == -1 && this.method1895((byte) -93)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4362.field3282.method556(class71.method537(var3, 106), (byte) 10);
            this.method1872(false, var4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method1879(int arg0) {
        field4337++;
        if (arg0 <= 107) {
            this.method1885(-56, -77);
        }
        if (!this.method1895((byte) -127)) {
            throw new IllegalStateException("");
        }
        return this.field4362.field3269;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    public final int method1880(int arg0) {
        field4352++;
        if (this.method1895((byte) -99)) {
            if (arg0 != -3333) {
                field4342 = 114;
            }
            return this.field4362.field3276.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method1881(String arg0, int arg1, String arg2) {
        field4346++;
        if (!this.method1895((byte) -87)) {
            return null;
        }
        if (arg1 != 0) {
            this.field4371 = false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4362.field3282.method556(class71.method537(var4, arg1 - 116), (byte) 10);
        if (this.method1870((byte) 21, var6)) {
            int var7 = this.field4362.field3277[var6].method556(class71.method537(var5, -117), (byte) 10);
            return this.method1868(var7, var6, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
    public final int method1882(int arg0) {
        field4365++;
        if (!this.method1895((byte) -74)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4338.length; var4++) {
            if (this.field4362.field3265[var4] > 0) {
                var3 += this.method1876(var4, (byte) 36);
                var2 += 100;
            }
        }
        if (arg0 <= 38) {
            field4344 = null;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[I)[B")
    public final byte[] method1883(int arg0, int arg1, int arg2, int[] arg3) {
        field4340++;
        if (!this.method1864(6707, arg0, arg1)) {
            return null;
        }
        if (this.field4372[arg1] == null || this.field4372[arg1][arg0] == null) {
            boolean var5 = this.method1863(arg1, arg3, (byte) 121);
            if (!var5) {
                this.method1874(255, arg1);
                boolean var6 = this.method1863(arg1, arg3, (byte) 121);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class106.method821(false, this.field4372[arg1][arg0], -113);
        if (this.field4349) {
            this.field4372[arg1][arg0] = null;
            if (this.field4362.field3276[arg1] == 1) {
                this.field4372[arg1] = null;
            }
        }
        if (arg2 < 64) {
            this.field4371 = true;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Ljava/lang/String;B)I")
    public final int method1884(String arg0, byte arg1) {
        field4341++;
        if (this.method1895((byte) -47)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4362.field3282.method556(class71.method537(var3, -118), (byte) 10);
            int var5 = -116 % ((74 - arg1) / 44);
            return this.method1870((byte) 108, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)Z")
    public final boolean method1885(int arg0, int arg1) {
        field4336++;
        if (!this.method1895((byte) -49)) {
            return false;
        } else if (this.field4362.field3276.length == 1) {
            return this.method1890(10, 0, arg1);
        } else if (!this.method1870((byte) -56, arg1)) {
            return false;
        } else if (this.field4362.field3276[arg1] == 1) {
            return this.method1890(arg0 + 8, arg1, 0);
        } else if (arg0 == 2) {
            throw new RuntimeException();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[B")
    public final byte[] method1886(int arg0, boolean arg1) {
        field4369++;
        if (arg1) {
            this.method1884((String) null, (byte) 27);
        }
        if (!this.method1895((byte) -26)) {
            return null;
        } else if (this.field4362.field3276.length == 1) {
            return this.method1868(arg0, 0, 1);
        } else if (!this.method1870((byte) -81, arg0)) {
            return null;
        } else if (this.field4362.field3276[arg0] == 1) {
            return this.method1868(0, arg0, 1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)I")
    public final int method1887(int arg0, int arg1) {
        field4358++;
        if (!this.method1895((byte) -30)) {
            return -1;
        }
        if (arg0 >= -46) {
            this.method1874(58, 100);
        }
        int var3 = this.field4362.field3282.method556(arg1, (byte) 10);
        return this.method1870((byte) -17, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(II)V")
    public final void method1888(int arg0, int arg1) {
        if (arg1 >= 96) {
            field4366++;
            if (this.method1870((byte) -28, arg0) && this.field4372 != null) {
                this.field4372[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method1889(int arg0) {
        int var1 = -30 % ((arg0 - 60) / 54);
        field4357 = null;
        field4344 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)Z")
    public final boolean method1890(int arg0, int arg1, int arg2) {
        field4334++;
        if (!this.method1864(6707, arg2, arg1)) {
            return false;
        } else if (this.field4372[arg1] != null && this.field4372[arg1][arg2] != null) {
            return true;
        } else if (arg0 != 10) {
            return true;
        } else if (this.field4338[arg1] == null) {
            this.method1874(arg0 ^ 0xF5, arg1);
            return this.field4338[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(II)I")
    public final int method1891(int arg0, int arg1) {
        field4350++;
        if (this.method1870((byte) -2, arg0)) {
            int var3 = -69 / ((arg1 + 52) / 33);
            return this.field4362.field3276[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public final void method1892(byte arg0) {
        if (this.field4372 != null) {
            for (int var2 = 0; var2 < this.field4372.length; var2++) {
                this.field4372[var2] = null;
            }
        }
        field4335++;
        int var3 = -22 / ((arg0 - 54) / 60);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)[B")
    public final byte[] method1893(int arg0, boolean arg1, int arg2) {
        field4361++;
        if (!this.method1864(6707, arg0, arg2)) {
            return null;
        }
        if (this.field4372[arg2] == null || this.field4372[arg2][arg0] == null) {
            boolean var4 = this.method1863(arg2, (int[]) null, (byte) 121);
            if (!var4) {
                this.method1874(255, arg2);
                boolean var5 = this.method1863(arg2, (int[]) null, (byte) 121);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg1 ? class106.method821(false, this.field4372[arg2][arg0], -121) : null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lwl;ZZ)V")
    public class270(class167 arg0, boolean arg1, boolean arg2) {
        this.field4371 = arg1;
        this.field4349 = arg2;
        this.field4364 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
    public final boolean method1894(int arg0) {
        field4343++;
        if (!this.method1895((byte) -62)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field4362.field3280.length; var3++) {
            int var4 = this.field4362.field3280[var3];
            if (this.field4338[var4] == null) {
                this.method1874(255, var4);
                if (this.field4338[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
    private final boolean method1895(byte arg0) {
        field4347++;
        if (this.field4362 == null) {
            this.field4362 = this.field4364.method1196(50);
            if (this.field4362 == null) {
                return false;
            }
            this.field4338 = new Object[this.field4362.field3281];
            this.field4372 = new Object[this.field4362.field3281][];
        }
        return arg0 >= -20 ? true : true;
    }
}
