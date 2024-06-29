import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class214 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    private int field3042 = 32;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Z")
    private boolean field3044 = false;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "J")
    private long field3064 = class55.method375(-3913);

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    private int field3066 = 0;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "J")
    private long field3068 = 0L;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    private int field3070 = 0;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "[Laf;")
    private class102[] field3072 = new class102[8];

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    private int field3075 = 0;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "[Laf;")
    private class102[] field3073 = new class102[8];

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "J")
    private long field3069 = 0L;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "Z")
    private boolean field3076 = true;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3052 = new String[100];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Laf;")
    private class102 field3046;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    public static int[] field3045;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[I")
    public int[] field3062;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final synchronized void method1337(int arg0) {
        field3043++;
        if (this.field3044) {
            return;
        }
        long var2 = class55.method375(-3913);
        try {
            if ((this.field3064 + 500000L) < var2) {
                this.field3064 = var2 - 500000L;
            }
            while ((this.field3064 + 5000L) < var2) {
                this.method1338(127, 256);
                this.field3064 += (long) (256000 / class29.field505);
            }
        } catch (Exception var7) {
            this.field3064 = var2;
        }
        if (this.field3062 == null) {
            return;
        }
        try {
            if (this.field3069 != 0L) {
                if (this.field3069 > var2) {
                    return;
                }
                this.method376(this.field3074);
                this.field3069 = 0L;
                this.field3076 = true;
            }
            int var4 = this.method377();
            if (this.field3066 < this.field3065 - var4) {
                this.field3066 = this.field3065 - var4;
            }
            int var5 = this.field3077 + this.field3067;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field3074) {
                this.field3074 += 1024;
                if (this.field3074 > 16384) {
                    this.field3074 = 16384;
                }
                this.method379();
                this.method376(this.field3074);
                var4 = 0;
                if ((var5 + 256) > this.field3074) {
                    var5 = this.field3074 - 256;
                    this.field3077 = var5 - this.field3067;
                }
                this.field3076 = true;
            }
            if (arg0 <= 88) {
                method1339(54, 18, 32, -9, 107, 105, false, -28, -10, -79);
            }
            while (var4 < var5) {
                this.method1341(this.field3062, 256);
                this.method381();
                var4 += 256;
            }
            if (this.field3068 < var2) {
                if (this.field3076) {
                    this.field3076 = false;
                } else if (this.field3066 == 0 && this.field3070 == 0) {
                    this.method379();
                    this.field3069 = var2 + 2000L;
                    return;
                } else {
                    this.field3077 = Math.min(this.field3070, this.field3066);
                    this.field3070 = this.field3066;
                }
                this.field3068 = var2 + 2000L;
                this.field3066 = 0;
            }
            this.field3065 = var4;
        } catch (Exception var6) {
            this.method379();
            this.field3069 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    private final void method1338(int arg0, int arg1) {
        field3057++;
        if (arg0 < 85) {
            return;
        }
        this.field3075 -= arg1;
        if (this.field3075 < 0) {
            this.field3075 = 0;
        }
        if (this.field3046 != null) {
            this.field3046.method172(arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg6) {
            method1339(-54, 95, 81, 61, -80, 102, false, -34, 71, -122);
        }
        if (arg5 == arg8 && arg2 == arg3 && arg0 == arg7 && arg4 == arg9) {
            class265.method1660(arg5, arg7, false, arg9, arg1, arg2);
        } else {
            int var10 = arg5;
            int var11 = arg2;
            int var12 = arg5 * 3;
            int var13 = arg2 * 3;
            int var14 = arg8 * 3;
            int var15 = arg3 * 3;
            int var16 = arg0 * 3;
            int var17 = arg4 * 3;
            int var18 = arg7 + var14 - var16 - arg5;
            int var19 = arg9 + var15 - var17 - arg2;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg5;
                int var34 = arg2 + (var28 - (-var30 - var32) >> 12);
                class265.method1660(var10, var33, false, var34, arg1, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field3053++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I")
    public int method377() throws Exception {
        field3058++;
        return this.field3074;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public final synchronized void method1340(byte arg0) {
        this.field3076 = true;
        field3061++;
        try {
            this.method378();
            int var2 = -106 % ((arg0 - 25) / 56);
        } catch (Exception var3) {
            this.method379();
            this.field3069 = class55.method375(-3913) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()V")
    public void method379() {
        field3050++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([II)V")
    private final void method1341(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class215.field3079) {
            var3 = arg1 << 1;
        }
        class111.method774(arg0, 0, var3);
        this.field3075 -= arg1;
        if (this.field3046 != null && this.field3075 <= 0) {
            this.field3075 += class29.field505 >> 4;
            class123.method850(false, this.field3046);
            this.method1342(this.field3046.method691(), -106, this.field3046);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class102 var10 = null;
                        class102 var11 = this.field3072[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class83 var12 = var11.field1372;
                                if (var12 == null || var12.field1164 <= var8) {
                                    var11.field1370 = true;
                                    int var13 = var11.method164();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1164 += var13;
                                    }
                                    if (var4 >= this.field3042) {
                                        break label107;
                                    }
                                    class102 var14 = var11.method167();
                                    if (var14 != null) {
                                        int var15 = var11.field1371;
                                        while (var14 != null) {
                                            this.method1342(var15 * var14.method691() >> 8, -86, var14);
                                            var14 = var11.method165();
                                        }
                                    }
                                    class102 var16 = var11.field1369;
                                    var11.field1369 = null;
                                    if (var10 == null) {
                                        this.field3072[var7] = var16;
                                    } else {
                                        var10.field1369 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3073[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1369;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class102 var18 = this.field3072[var17];
                this.field3072[var17] = this.field3073[var17] = null;
                while (var18 != null) {
                    class102 var19 = var18.field1369;
                    var18.field1369 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3075 < 0) {
            this.field3075 = 0;
        }
        if (this.field3046 != null) {
            this.field3046.method170(arg0, 0, arg1);
        }
        this.field3064 = class55.method375(-3913);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method380(Component arg0) throws Exception {
        field3041++;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public void method376(int arg0) throws Exception {
        field3060++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILaf;)V")
    private final void method1342(int arg0, int arg1, class102 arg2) {
        if (arg1 >= -49) {
            this.method1342(103, -99, (class102) null);
        }
        field3071++;
        int var4 = arg0 >> 5;
        class102 var5 = this.field3073[var4];
        if (var5 == null) {
            this.field3072[var4] = arg2;
        } else {
            var5.field1369 = arg2;
        }
        this.field3073[var4] = arg2;
        arg2.field1371 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public final synchronized void method1343(int arg0) {
        field3054++;
        if (class308.field4404 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class308.field4404.field4269[var3] == this) {
                    class308.field4404.field4269[var3] = null;
                }
                if (class308.field4404.field4269[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class308.field4404.field4266 = true;
                while (class308.field4404.field4271) {
                    class404.method2628(-22, 50L);
                }
                class308.field4404 = null;
            }
        }
        if (arg0 == 14682) {
            this.method379();
            this.field3044 = true;
            this.field3062 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public final void method1344(int arg0) {
        if (arg0 != 0) {
            this.method1344(54);
        }
        this.field3076 = true;
        field3051++;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field3045 = null;
        field3052 = null;
        int var1 = -77 % ((-arg0 - 15) / 57);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
    public static final void method1346(int arg0, boolean arg1) {
        field3059++;
        if (class192.field2671 != arg1) {
            class192.field2671 = arg1;
            class125.method858(0);
            int var2 = -111 % ((22 - arg0) / 43);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Llo;")
    public static final class419 method1347(byte arg0) {
        field3055++;
        if (class76.field1031 == null || class87.field1217 == null) {
            return null;
        } else if (arg0 == -50) {
            class87.field1217.method1047(class76.field1031, (byte) -120);
            class419 var1 = (class419) class87.field1217.method1043((byte) -111);
            if (var1 == null) {
                return null;
            } else {
                class80 var2 = class27.method248(var1.field6231, (byte) 1);
                return var2 != null && var2.field1096 && var2.method508(-1) ? var1 : class50.method346(true);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()V")
    public void method378() throws Exception {
        field3063++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ[[[Lpm;III)Z")
    public static final boolean method1348(int arg0, boolean arg1, class10[][][] arg2, int arg3, int arg4, int arg5) {
        field3048++;
        byte var6 = arg1 ? 1 : (byte) (class269.field3930 & 0xFF);
        if (class115.field1566[class193.field2688][arg5][arg4] == var6) {
            return false;
        } else if ((class37.field606[class193.field2688][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg3 != -27508) {
                return false;
            }
            int var8 = 0;
            class133.field1779[var7] = arg5;
            int var35 = var7 + 1;
            class219.field3110[var7] = arg4;
            class115.field1566[class193.field2688][arg5][arg4] = var6;
            while (var35 != var8) {
                int var9 = class133.field1779[var8] & 0xFFFF;
                int var10 = class133.field1779[var8] >> 16 & 0xFF;
                int var11 = class133.field1779[var8] >> 24 & 0xFF;
                int var12 = class219.field3110[var8] & 0xFFFF;
                int var13 = class219.field3110[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class37.field606[class193.field2688][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class193.field2688 + 1; var16 <= 3; var16++) {
                    if ((class37.field606[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field117 != null) {
                                int var20 = class272.method1744(var10, -110);
                                if (arg2[var16][var9][var12].field117.field5176 == var20 || arg2[var16][var9][var12].field120 != null && arg2[var16][var9][var12].field120.field5176 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class272.method1744(var11, -114);
                                    if (arg2[var16][var9][var12].field117.field5176 == var21 || arg2[var16][var9][var12].field120 != null && arg2[var16][var9][var12].field120.field5176 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class272.method1744(var13, arg3 ^ 0x6B11);
                                    if (arg2[var16][var9][var12].field117.field5176 == var22 || arg2[var16][var9][var12].field120 != null && arg2[var16][var9][var12].field120.field5176 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class10 var23 = arg2[var16][var9][var12];
                            if (var23.field109 != null) {
                                for (class39 var24 = var23.field109; var24 != null; var24 = var24.field627) {
                                    class361 var25 = var24.field621;
                                    if (var25 instanceof class351) {
                                        class351 var26 = (class351) var25;
                                        int var27 = var26.method160(arg3 + 5452);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method148((byte) -68);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class10 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field109 != null) {
                            for (class39 var31 = var30.field109; var31 != null; var31 = var31.field627) {
                                class361 var32 = var31.field621;
                                if (var32.field5296 != var32.field5293 || var32.field5288 != var32.field5286) {
                                    for (int var33 = var32.field5296; var33 <= var32.field5293; var33++) {
                                        for (int var34 = var32.field5288; var34 <= var32.field5286; var34++) {
                                            class115.field1566[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class115.field1566[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class88.field1226[class193.field2688 + 1].method781(var9, var12);
                    if (var17 > class45.field665[arg0]) {
                        class45.field665[arg0] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class86.field1192[arg0]) {
                        class86.field1192[arg0] = var18;
                    } else if (class156.field2045[arg0] < var18) {
                        class156.field2045[arg0] = var18;
                    }
                    if (var19 < class207.field2978[arg0]) {
                        class207.field2978[arg0] = var19;
                    } else if (class224.field3166[arg0] < var19) {
                        class224.field3166[arg0] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class115.field1566[class193.field2688][var9 - 1][var12] != var6) {
                        class133.field1779[var35] = class128.method871(class128.method871(var9 - 1, 1179648), -754974720);
                        class219.field3110[var35] = class128.method871(var12, 1245184);
                        class115.field1566[class193.field2688][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    int var10000 = ~class336.field4964;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class115.field1566[class193.field2688][var9 - 1][var12] != var6 && (class37.field606[class193.field2688][var9][var12] & 0x4) == 0 && (class37.field606[class193.field2688][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class133.field1779[var35] = class128.method871(class128.method871(var9 - 1, 1179648), 1375731712);
                            class219.field3110[var35] = class128.method871(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9 - 1][var12] = var6;
                        }
                        if (class115.field1566[class193.field2688][var9][var12] != var6) {
                            class133.field1779[var35] = class128.method871(class128.method871(var9, 5373952), 318767104);
                            class219.field3110[var35] = class128.method871(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9][var12] = var6;
                        }
                        if (var9 + 1 < class324.field4652 && class115.field1566[class193.field2688][var9 + 1][var12] != var6 && (class37.field606[class193.field2688][var9][var12] & 0x4) == 0 && (class37.field606[class193.field2688][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class133.field1779[var35] = class128.method871(-1845493760, class128.method871(5373952, var9 + 1));
                            class219.field3110[var35] = class128.method871(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class324.field4652 > (var9 + 1) && class115.field1566[class193.field2688][var9 + 1][var12] != var6) {
                        class133.field1779[var35] = class128.method871(1392508928, class128.method871(var9 + 1, 9568256));
                        class219.field3110[var35] = class128.method871(var12, 9633792);
                        class115.field1566[class193.field2688][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class115.field1566[class193.field2688][var9 - 1][var12] != var6 && (class37.field606[class193.field2688][var9][var12] & 0x4) == 0 && (class37.field606[class193.field2688][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class133.field1779[var35] = class128.method871(301989888, class128.method871(var9 - 1, 13762560));
                            class219.field3110[var35] = class128.method871(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9 - 1][var12] = var6;
                        }
                        if (class115.field1566[class193.field2688][var9][var12] != var6) {
                            class133.field1779[var35] = class128.method871(-1828716544, class128.method871(var9, 13762560));
                            class219.field3110[var35] = class128.method871(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9][var12] = var6;
                        }
                        if ((var9 + 1) < class324.field4652 && class115.field1566[class193.field2688][var9 + 1][var12] != var6 && (class37.field606[class193.field2688][var9][var12] & 0x4) == 0 && (class37.field606[class193.field2688][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class133.field1779[var35] = class128.method871(-771751936, class128.method871(var9 + 1, 9568256));
                            class219.field3110[var35] = class128.method871(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class115.field1566[class193.field2688][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class45.field665[arg0] != -1000000) {
                class45.field665[arg0] += 10;
                class86.field1192[arg0] -= 50;
                class156.field2045[arg0] += 50;
                class224.field3166[arg0] += 50;
                class207.field2978[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Laf;I)V")
    public final synchronized void method1349(class102 arg0, int arg1) {
        field3047++;
        this.field3046 = arg0;
        if (arg1 != -26391) {
            this.field3064 = 10L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()V")
    public void method381() throws Exception {
        field3056++;
    }
}
