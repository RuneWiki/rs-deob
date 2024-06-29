import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class239 extends class331 {

    @OriginalMember(owner = "client!f", name = "sc", descriptor = "I")
    public int field3453 = 0;

    @OriginalMember(owner = "client!f", name = "Ac", descriptor = "I")
    public int field3461 = 0;

    @OriginalMember(owner = "client!f", name = "wc", descriptor = "I")
    public int field3457 = -1;

    @OriginalMember(owner = "client!f", name = "yc", descriptor = "I")
    public int field3459 = 0;

    @OriginalMember(owner = "client!f", name = "Cc", descriptor = "I")
    public int field3463 = -1;

    @OriginalMember(owner = "client!f", name = "pc", descriptor = "I")
    public int field3450 = -1;

    @OriginalMember(owner = "client!f", name = "Dc", descriptor = "I")
    public int field3464 = 255;

    @OriginalMember(owner = "client!f", name = "zc", descriptor = "I")
    public int field3460 = -1;

    @OriginalMember(owner = "client!f", name = "Lc", descriptor = "I")
    public int field3472 = 0;

    @OriginalMember(owner = "client!f", name = "Fc", descriptor = "B")
    private byte field3466 = 0;

    @OriginalMember(owner = "client!f", name = "Gc", descriptor = "I")
    public int field3467 = -1;

    @OriginalMember(owner = "client!f", name = "Ec", descriptor = "I")
    public int field3465 = -1;

    @OriginalMember(owner = "client!f", name = "Jc", descriptor = "Z")
    public boolean field3470 = false;

    @OriginalMember(owner = "client!f", name = "Qc", descriptor = "I")
    public int field3477 = 0;

    @OriginalMember(owner = "client!f", name = "Pc", descriptor = "I")
    public int field3476 = -1;

    @OriginalMember(owner = "client!f", name = "Sc", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!f", name = "nc", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!f", name = "oc", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!f", name = "qc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!f", name = "rc", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!f", name = "tc", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!f", name = "uc", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!f", name = "vc", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!f", name = "xc", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!f", name = "Bc", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!f", name = "Hc", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!f", name = "Ic", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!f", name = "Kc", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!f", name = "Mc", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!f", name = "Nc", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!f", name = "Rc", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!f", name = "Tc", descriptor = "Lqk;")
    public class125 field3480;

    @OriginalMember(owner = "client!f", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field3475;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfd;B)V", line = 6)
    public final void method1695(class299 arg0, byte arg1) {
        field3454++;
        arg0.field4351 = 0;
        if (arg1 != 71) {
            this.field3459 = 41;
        }
        int var3 = -1;
        int var4 = arg0.method2096((byte) -122);
        boolean var5 = (var4 & 0x4) != 0;
        int var6 = var4 & 0x1;
        int var7 = super.method1699(arg1 ^ 0xFFFFFFB8);
        this.method2302(arg1 + 23680, ((var4 & 0x3E) >> 3) + 1);
        this.field3466 = (byte) (var4 >> 6 & 0x3);
        int[] var8 = new int[12];
        this.field4855 += (this.method1699(-1) - var7) * 64;
        this.field4893 += (this.method1699(-1) - var7) * 64;
        this.field3450 = arg0.method2104(121);
        this.field3476 = arg0.method2104(arg1 + 36);
        this.field3472 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method2096((byte) -122);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method2096((byte) -122);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var3 = arg0.method2083((byte) -61);
                    this.field3472 = arg0.method2096((byte) -122);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class312.field4587[var12 - 32768];
                    var8[var9] = class80.method568(1073741824, var13);
                    int var14 = class172.method1265(var13, (byte) 32).field5713;
                    if (var14 != 0) {
                        this.field3472 = var14;
                    }
                } else {
                    var8[var9] = class80.method568(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method2096((byte) -122);
            if (var17 < 0 || class17.field211[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4871 = arg0.method2083((byte) -120);
        long var18 = arg0.method2089((byte) 114);
        this.field3475 = class193.method1398(false, var18);
        this.field3477 = arg0.method2096((byte) -122);
        if (var5) {
            this.field3461 = arg0.method2083((byte) -95);
            this.field3453 = this.field3477;
            this.field3463 = -1;
        } else {
            this.field3461 = 0;
            this.field3453 = arg0.method2096((byte) -122);
            this.field3463 = arg0.method2096((byte) -122);
            if (this.field3463 == 255) {
                this.field3463 = -1;
            }
        }
        int var20 = this.field3459;
        this.field3459 = arg0.method2096((byte) -122);
        if (this.field3459 == 0) {
            class16.method120(15, this);
        } else {
            int var21 = this.field3460;
            int var22 = this.field3465;
            int var23 = this.field3457;
            int var24 = this.field3467;
            int var25 = this.field3464;
            this.field3465 = arg0.method2083((byte) -75);
            this.field3460 = arg0.method2083((byte) -37);
            this.field3457 = arg0.method2083((byte) -39);
            this.field3467 = arg0.method2083((byte) -116);
            this.field3464 = arg0.method2096((byte) -122);
            if (this.field3459 != var20 || this.field3465 != var22 || this.field3460 != var21 || this.field3457 != var23 || this.field3467 != var24 || this.field3464 != var25) {
                class40.method280(-86, this);
            }
        }
        if (this.field3480 == null) {
            this.field3480 = new class125();
        }
        int var26 = this.field3480.field1676;
        this.field3480.method929(arg1 - 71, var3, var8, this.field4871, var15, var6 == 1);
        if (var3 != var26) {
            this.field4855 = this.field4842[0] * 128 + (this.method1699(arg1 ^ 0xFFFFFFB8) * 64);
            this.field4893 = this.field4936[0] * 128 + this.method1699(arg1 ^ 0xFFFFFFB8) * 64;
        }
        if (this.field4879 != null) {
            this.field4879.method1354();
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I", line = 163)
    public final int method583() {
        field3455++;
        return this.field4911;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V", line = 172)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3471++;
        if (!this.field4900) {
            if (this.field3480 == null) {
                return;
            }
            class314 var6 = this.field4899 != -1 && this.field4885 == 0 ? class207.method1516(this.field4899, 120) : null;
            class314 var7 = this.field4897 == -1 || this.field3470 || this.field4897 == this.method2300((byte) 112).field1182 && var6 != null ? null : class207.method1516(this.field4897, 126);
            class81 var8 = this.field3480.method927(this.field4859, this.field4942, this.field4906, this.field4914, var7, this.field4850, -7453, false, this.field4890, var6, false, this.field4940);
            if (var8 == null) {
                return;
            }
            this.method2301(var8, (byte) 118, (class81) null);
        }
        if (this.field4879 != null) {
            this.field4879.method1351(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfh;Lke;IZLfh;)V", line = 206)
    public static final void method1696(class140 arg0, class230 arg1, int arg2, boolean arg3, class140 arg4) {
        class75.field995 = arg4;
        class296.field4297 = arg0;
        class166.field2324 = arg3;
        int var5 = class296.field4297.method1068(-99) - 1;
        if (arg2 != -8659) {
            method1696((class140) null, (class230) null, 100, false, (class140) null);
        }
        class26.field296 = var5 * 256 + class296.field4297.method1088(var5, 1);
        class159.field2265 = arg1;
        class328.field4790 = new String[] { null, null, null, null, class176.field2406 };
        field3448++;
        class131.field1788 = new String[] { null, null, class59.field755, null, null };
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I", line = 253)
    public final int method1254(boolean arg0) {
        if (arg0) {
            this.method573(-87, -38, 15, 11, -116);
        }
        field3474++;
        return this.field4871;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 272)
    public static final void method1697(int arg0) {
        if (arg0 != -31352) {
            method1702(0, 111, (byte) -128);
        }
        field3458++;
        class341.field5323.method2262(false);
        class82.field1044.method2262(false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 291)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field3449++;
        if (this.field3480 == null) {
            return;
        }
        class314 var13 = this.field4899 != -1 && this.field4885 == 0 ? class207.method1516(this.field4899, 122) : null;
        class91 var14 = this.method2300((byte) -109);
        boolean var15 = var14.field1164 != 0 || var14.field1167 != 0 || var14.field1170 != 0 || var14.field1171 != 0;
        class314 var16 = this.field4897 == -1 || this.field3470 || this.field4897 == this.method2300((byte) -115).field1182 && var13 != null ? null : class207.method1516(this.field4897, 121);
        class81 var17 = this.field3480.method927(this.field4859, this.field4942, this.field4906, this.field4914, var16, this.field4850, -7453, var15, this.field4890, var13, true, this.field4940);
        int var18 = class49.method390((byte) 100);
        if (class47.field623 && class255.field3734 < 96 && var18 > 50) {
            class15.method112(127);
        }
        if (class219.field3137 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (class107.field1385 < var19) {
                class194.field2685[class107.field1385] = new byte[102400];
                class107.field1385++;
            }
            while (var19 < class107.field1385) {
                class107.field1385--;
                class194.field2685[class107.field1385] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field4911 = var17.method583();
        if (class122.field1603 && (this.field3480.field1676 == -1 || class148.method1138(-3, this.field3480.field1676).field2177)) {
            class81 var20 = class245.method1729(0, 2, var16 == null ? var13 : var16, arg0, 1, 240, var17, var16 == null ? this.field4850 : this.field4942, this.field4898, this.field4893, this.field4894, 0, 160, this.field4855);
            if (class47.field623) {
                float var21 = class47.method377();
                float var22 = class47.method369();
                class47.method346();
                class47.method378(var21, var22 - 150.0F);
                var20.method585(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class187) null);
                class47.method348();
                class47.method378(var21, var22);
            } else {
                var20.method585(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class187) null);
            }
        }
        if (class359.field5616 == this) {
            for (int var23 = class102.field1326.length - 1; var23 >= 0; var23--) {
                class234 var24 = class102.field1326[var23];
                if (var24 != null && var24.field3361 != -1) {
                    if (var24.field3359 == 1 && var24.field3358 >= 0 && var24.field3358 < class251.field3688.length) {
                        class169 var25 = class251.field3688[var24.field3358];
                        if (var25 != null) {
                            int var26 = var25.field4855 / 32 - (class359.field5616.field4855 / 32);
                            int var27 = var25.field4893 / 32 - class359.field5616.field4893 / 32;
                            this.method1701(arg3, var27, (class187) null, arg2, arg9, arg1, arg0, arg5, var26, arg6, var24.field3361, (byte) -96, arg4, 360000, var17, arg7);
                        }
                    }
                    if (var24.field3359 == 2) {
                        int var28 = (var24.field3354 - class331.field4867) * 4 + 2 - (class359.field5616.field4855 / 32);
                        int var29 = (var24.field3363 - class355.field5556) * 4 + 2 - (class359.field5616.field4893 / 32);
                        int var30 = var24.field3360 * 4;
                        int var31 = var30 * var30;
                        this.method1701(arg3, var29, (class187) null, arg2, arg9, arg1, arg0, arg5, var28, arg6, var24.field3361, (byte) -109, arg4, var31, var17, arg7);
                    }
                    if (var24.field3359 == 10 && var24.field3358 >= 0 && class311.field4574.length > var24.field3358) {
                        class239 var32 = class311.field4574[var24.field3358];
                        if (var32 != null) {
                            int var33 = var32.field4855 / 32 - class359.field5616.field4855 / 32;
                            int var34 = var32.field4893 / 32 - (class359.field5616.field4893 / 32);
                            this.method1701(arg3, var34, (class187) null, arg2, arg9, arg1, arg0, arg5, var33, arg6, var24.field3361, (byte) -115, arg4, 360000, var17, arg7);
                        }
                    }
                }
            }
        }
        this.method2293(0, var17);
        class81 var35 = null;
        this.method2298(var17, arg0, 0);
        if (!this.field3470 && this.field4839 != -1 && this.field4921 != -1) {
            class15 var36 = class234.method1664(-128, this.field4839);
            var35 = var36.method114(this.field4857, this.field4848, this.field4921, (byte) 14);
            if (var35 != null) {
                var35.method580(0, -this.field4851, 0);
                if (var36.field167) {
                    if (class307.field4489 != 0) {
                        var35.method591(class307.field4489);
                    }
                    if (class17.field210 != 0) {
                        var35.method574(class17.field210);
                    }
                    if (class171.field2368 != 0) {
                        var35.method580(0, class171.field2368, 0);
                    }
                }
            }
        }
        class81 var37 = null;
        if (!this.field3470 && this.field4943 != null) {
            if (this.field4905 <= class313.field4603) {
                this.field4943 = null;
            }
            if (this.field4938 <= class313.field4603 && class313.field4603 < this.field4905) {
                if ((this.field4943 instanceof class291)) {
                    var37 = (class81) ((class291) this.field4943).method1998(-80);
                } else {
                    var37 = (class81) this.field4943;
                }
                var37.method580(this.field4927 - this.field4855, -this.field4898 + this.field4856, this.field4922 - this.field4893);
                if (this.field4912 == 512) {
                    var37.method586();
                } else if (this.field4912 == 1024) {
                    var37.method587();
                } else if (this.field4912 == 1536) {
                    var37.method577();
                }
            }
        }
        if (class47.field623) {
            this.method2301(var17, (byte) 119, var35);
            var17.field1040 = true;
            var17.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
            if (var35 != null) {
                if (this.field4879 != null) {
                    class128 var38 = (class128) var35;
                    this.field4879.method1369(var38.field1746, var38.field1712, true, var38.field1732, var38.field1710, var38.field1699);
                }
                var35.field1040 = true;
                var35.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
            }
        } else {
            if (var35 != null) {
                var17 = ((class332) var17).method2305(var35);
            }
            if (var37 != null) {
                var17 = ((class332) var17).method2305(var37);
            }
            this.method2301(var17, (byte) 113, var35);
            var17.field1040 = true;
            var17.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4879);
        }
        if (var37 == null) {
            return;
        }
        if (this.field4912 == 512) {
            var37.method577();
        } else if (this.field4912 == 1024) {
            var37.method587();
        } else if (this.field4912 == 1536) {
            var37.method586();
        }
        var37.method580(this.field4855 - this.field4927, this.field4898 - this.field4856, this.field4893 - this.field4922);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)Z", line = 560)
    public final boolean method1251(int arg0) {
        field3469++;
        if (this.field3480 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method1254(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Ljava/lang/String;", line = 575)
    public final String method1698(byte arg0) {
        if (arg0 != -122) {
            field3479 = 43;
        }
        field3473++;
        String var2 = this.field3475;
        if (class231.field3301 != null) {
            var2 = class231.field3301[this.field3466] + var2;
        }
        if (class175.field2402 != null) {
            var2 = var2 + class175.field2402[this.field3466];
        }
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I", line = 602)
    public final int method1699(int arg0) {
        field3478++;
        if (arg0 == -1) {
            return this.field3480 == null || this.field3480.field1676 == -1 ? super.method1699(-1) : class148.method1138(arg0 - 2, this.field3480.field1676).field2224;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 622)
    protected final void finalize() {
        if (this.field4879 != null) {
            this.field4879.method1360();
        }
        field3462++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZBI)V", line = 632)
    public final void method1700(int arg0, boolean arg1, byte arg2, int arg3) {
        super.method2290((byte) 87, arg0, this.method1699(-1), arg3, arg1);
        if (arg2 != -42) {
            this.method1695((class299) null, (byte) -106);
        }
        field3468++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILne;IIIIIIIIBIILvg;I)V", line = 663)
    private final void method1701(int arg0, int arg1, class187 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13, class81 arg14, int arg15) {
        field3452++;
        if (arg11 > -78) {
            return;
        }
        int var17 = arg1 * arg1 + arg8 * arg8;
        if (var17 < 16 || var17 > arg13) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg8, (double) arg1) * 325.949D) & 0x7FF;
        class81 var19 = class186.method1346(var18, arg14, this.field4893, arg10, (byte) -128, this.field4898, this.field4855);
        if (var19 == null) {
            return;
        }
        if (!class47.field623) {
            var19.method585(0, arg5, arg3, arg0, arg12, arg7, arg9, arg15, -1L, arg4, arg2);
            return;
        }
        float var20 = class47.method377();
        float var21 = class47.method369();
        class47.method346();
        class47.method378(var20, var21 - 150.0F);
        var19.method585(0, arg5, arg3, arg0, arg12, arg7, arg9, arg15, -1L, arg4, arg2);
        class47.method348();
        class47.method378(var20, var21);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Z", line = 706)
    public static final boolean method1702(int arg0, int arg1, byte arg2) {
        field3451++;
        if (!class159.field2263) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class26.field308[var3] == null || class26.field308[var3][var4] == null) {
            return false;
        }
        class333 var5 = class26.field308[var3][var4];
        if (arg1 == -1 && var5.field5105 == 0) {
            for (int var6 = 0; var6 < class66.field853; var6++) {
                if (class156.field2169[var6] == 1 || class156.field2169[var6] == 1009 || class156.field2169[var6] == 34 || class156.field2169[var6] == 23 || class156.field2169[var6] == 3) {
                    for (class333 var7 = class89.method644(49, class156.field2159[var6]); var7 != null; var7 = class223.method1622(89, var7)) {
                        if (var5.field5109 == var7.field5109) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class66.field853; var8++) {
                if (class95.field1243[var8] == arg1 && class156.field2159[var8] == var5.field5109 && (class156.field2169[var8] == 1 || class156.field2169[var8] == 1009 || class156.field2169[var8] == 34 || class156.field2169[var8] == 23 || class156.field2169[var8] == 3)) {
                    return true;
                }
            }
        }
        if (arg2 <= 103) {
            field3479 = 126;
        }
        return false;
    }
}
