import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class195 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
    public boolean field3115 = false;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field3123 = -1;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Z")
    public boolean field3126 = true;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    private int field3130 = -1;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public int field3139 = -1;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    private int field3131 = -1;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    private int field3138 = -1;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field3145 = -1;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    private int field3128 = -1;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
    public boolean field3147 = true;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field3134 = new String[5];

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public int field3124 = 0;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
    public boolean field3146 = true;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public int field3142 = -1;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public int field3150 = -1;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3117 = "Created gameworld";

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lpf;")
    public static class17 field3119 = new class17(64);

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "[S")
    public static short[] field3154 = new short[500];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field3151;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Lve;")
    public static class198 field3155;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Ljava/lang/String;")
    public String field3122;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Ljava/lang/String;")
    public String field3125;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Z")
    public static boolean field3153;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "[I")
    public int[] field3140;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZZZ)Lek;")
    public final class250 method1388(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.field3125 = null;
        }
        field3141++;
        int var4 = arg0 ? this.field3142 : this.field3150;
        class250 var5 = (class250) class171.field2761.method99((long) ((arg0 ? 65536 : 0) | var4), true);
        if (var5 != null) {
            return var5;
        } else if (class15.field306.method1118((byte) 70, var4)) {
            class230 var6 = class215.method1532(class15.field306, 0, var4, 0);
            if (var6 != null) {
                var6.field4231 = 0;
                var6.field4226 = var6.field4225;
                var6.field4230 = var6.field4235;
                var6.field4229 = 0;
                class171.field2761.method100((long) ((arg0 ? 65536 : 0) | var4), var6, 106);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)I")
    public static final int method1389(int arg0) {
        field3152++;
        if (arg0 <= 113) {
            method1392(false);
        }
        return class90.field1488;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lab;II)V")
    private final void method1390(class249 arg0, int arg1, int arg2) {
        field3137++;
        if (arg2 != 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3150 = arg0.method1821((byte) 51);
        } else if (arg1 == 2) {
            this.field3142 = arg0.method1821((byte) 51);
        } else if (arg1 == 3) {
            this.field3125 = arg0.method1769(1);
        } else if (arg1 == 4) {
            this.field3149 = arg0.method1812((byte) 52);
        } else if (arg1 == 5) {
            this.field3123 = arg0.method1812((byte) 52);
        } else if (arg1 == 6) {
            this.field3124 = arg0.method1802((byte) -128);
            return;
        } else if (arg1 == 7) {
            int var6 = arg0.method1802((byte) 48);
            if ((var6 & 0x1) == 0) {
                this.field3147 = false;
            }
            if ((var6 & 0x2) == 2) {
                this.field3115 = true;
                return;
            }
        } else if (arg1 == 8) {
            this.field3146 = arg0.method1802((byte) 127) == 1;
            return;
        } else if (arg1 == 9) {
            this.field3128 = arg0.method1821((byte) 51);
            if (this.field3128 == 65535) {
                this.field3128 = -1;
            }
            this.field3145 = arg0.method1821((byte) 51);
            if (this.field3145 == 65535) {
                this.field3145 = -1;
            }
            this.field3120 = arg0.method1800(91);
            this.field3151 = arg0.method1800(87);
            return;
        } else if (arg1 < 10 || arg1 > 14) {
            if (arg1 != 15) {
                if (arg1 == 16) {
                    this.field3126 = false;
                    return;
                }
                if (arg1 == 17) {
                    this.field3122 = arg0.method1769(1);
                    return;
                }
                if (arg1 == 18) {
                    this.field3131 = arg0.method1821((byte) 51);
                    return;
                }
                if (arg1 != 19) {
                    if (arg1 != 20) {
                        if (arg1 == 21) {
                            this.field3129 = arg0.method1800(-126);
                        } else if (arg1 == 22) {
                            this.field3143 = arg0.method1800(-107);
                            return;
                        }
                        return;
                    }
                    this.field3130 = arg0.method1821((byte) 51);
                    if (this.field3130 == 65535) {
                        this.field3130 = -1;
                    }
                    this.field3138 = arg0.method1821((byte) 51);
                    if (this.field3138 == 65535) {
                        this.field3138 = -1;
                    }
                    this.field3116 = arg0.method1800(127);
                    this.field3132 = arg0.method1800(111);
                    return;
                }
                this.field3139 = arg0.method1821((byte) 51);
                return;
            }
            int var4 = arg0.method1802((byte) 119);
            this.field3140 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field3140[var5] = arg0.method1762(-1);
            }
            this.field3121 = arg0.method1800(93);
            this.field3133 = arg0.method1800(122);
            return;
        } else {
            this.field3134[arg1 - 10] = arg0.method1769(arg2 + 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1391(int arg0) {
        field3117 = null;
        field3155 = null;
        field3119 = null;
        field3154 = null;
        if (arg0 != 0) {
            method1393(-83, true, true, -73, false, 52, (byte) 48, 49, (class284) null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static final void method1392(boolean arg0) {
        client.method723();
        field3127++;
        client.method740();
        client.method734();
        client.method739();
        client.method731();
        client.method730();
        if (arg0) {
            field3155 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZZIZIBILic;)Lmd;")
    public static final class273 method1393(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, class284 arg8) {
        field3144++;
        class71 var9 = class13.method75(false, arg7);
        if (arg0 > 1 && var9.field1229 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg0 >= var9.field1248[var11] && var9.field1248[var11] != 0) {
                    var10 = var9.field1229[var11];
                }
            }
            if (var10 != -1) {
                var9 = class13.method75(false, var10);
            }
        }
        class112 var12 = var9.method497(1245, arg8);
        if (var12 == null) {
            return null;
        }
        class92 var13 = null;
        if (var9.field1195 != -1) {
            var13 = (class92) method1393(10, true, true, 1, false, 0, (byte) -126, var9.field1198, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1214 != -1) {
            var13 = (class92) method1393(arg0, false, true, arg3, false, arg5, (byte) -119, var9.field1250, arg8);
            if (var13 == null) {
                return null;
            }
        }
        if (arg6 > -102) {
            field3153 = false;
        }
        int[] var14 = class211.field3551;
        int var15 = class211.field3557;
        int var16 = class211.field3556;
        int[] var17 = new int[4];
        class211.method1473(var17);
        class92 var18 = new class92(36, 32);
        class211.method1499(var18.field1516, 36, 32);
        class128.method948();
        class128.method964(16, 16);
        class128.field2129 = false;
        int var19 = var9.field1231;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class128.field2130[var9.field1251] * var19 >> 16;
        int var21 = class128.field2133[var9.field1251] * var19 >> 16;
        var12.method869(0, var9.field1226, var9.field1182, var9.field1251, var9.field1202, var21 + var9.field1208 - (var12.method860() / 2), var9.field1208 + var20, -1L);
        if (arg3 >= 1) {
            var18.method664(1);
            if (arg3 >= 2) {
                var18.method664(16777215);
            }
            class211.method1499(var18.field1516, 36, 32);
        }
        if (arg5 != 0) {
            var18.method644(arg5);
        }
        if (var9.field1195 != -1) {
            var13.method652(0, 0);
        } else if (var9.field1214 != -1) {
            class211.method1499(var13.field1516, 36, 32);
            var18.method652(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field1183 == 1 || arg0 != 1) && arg0 != -1) {
            class179.field2865.method1234(class109.method817(-21832, arg0), 0, 9, 16776960, 1);
        }
        class211.method1499(var14, var15, var16);
        class211.method1485(var17);
        class128.method948();
        class128.field2129 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lab;B)V")
    public final void method1394(class249 arg0, byte arg1) {
        field3118++;
        if (arg1 > -49) {
            this.field3131 = -8;
        }
        while (true) {
            int var3 = arg0.method1802((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1390(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
    public final boolean method1395(int arg0) {
        field3135++;
        if (arg0 != 29435) {
            return true;
        } else if (this.field3145 == -1 && this.field3128 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field3145 == -1) {
                var3 = class313.method2120((byte) -127, this.field3128);
            } else {
                var3 = class12.field230[this.field3145];
            }
            if (var3 < this.field3120 || this.field3151 < var3) {
                return false;
            } else if (this.field3138 == -1 && this.field3130 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field3138 == -1) {
                    var5 = class313.method2120((byte) -114, this.field3130);
                } else {
                    var5 = class12.field230[this.field3138];
                }
                return var5 >= this.field3116 && this.field3132 >= var5;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Lkm;")
    public final class230 method1396(int arg0) {
        field3148++;
        class230 var2 = (class230) class171.field2761.method99((long) (this.field3131 | 0x20000), true);
        if (var2 != null) {
            return var2;
        }
        class15.field306.method1118((byte) 57, this.field3131);
        class230 var3 = class215.method1532(class15.field306, arg0, this.field3131, 0);
        if (var3 != null) {
            var3.field4226 = var3.field4225;
            var3.field4230 = var3.field4235;
            var3.field4229 = 0;
            var3.field4231 = 0;
            class171.field2761.method100((long) (this.field3131 | 0x20000), var3, arg0 + 71);
        }
        return var3;
    }
}
