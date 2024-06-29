import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class25 extends class104 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    private int field331 = 0;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    private int field332 = -1;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "[I")
    public static int[] field336 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method158(int arg0, int arg1) {
        field337++;
        if (class44.field521 == arg1) {
            return false;
        }
        class17.field233 = new int[104][104];
        class252.field3836 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class149.field2072[var2] = new class22(104, 104);
        }
        class15.field215 = new byte[4][104][arg0];
        class269.field4239 = new class337[4][104][104];
        class264.field4163 = new byte[4][104][104];
        if (class250.field3787) {
            class193.method1338(4, 104, 104);
            class178.method1227(104, 104);
            class295.field4611 = new class222[13][13];
        }
        class44.field521 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V", line = 58)
    public class25(int arg0) {
        GL var2 = class250.field3818;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field332 = var3[0];
        this.field338 = class266.field4192;
        class250.method1806(this.field332);
        int var4 = class215.field3023[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class266.field4196 += var6.limit() - this.field331;
        this.field331 = var6.limit();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqb;I)V", line = 91)
    public static final void method159(class109 arg0, int arg1) {
        field335++;
        if (arg1 != 0) {
            field336 = (int[]) null;
        }
        class298 var2 = (class298) class120.field1695.method1537(class48.method285((byte) -90, arg0.field1496), -22708);
        if (var2 == null) {
            return;
        }
        if (var2.field4650 != null) {
            class19.field255.method27(var2.field4650);
            var2.field4650 = null;
        }
        var2.method2285(true);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 116)
    public final void method160(byte arg0) {
        int var2 = class45.method266(true);
        if ((var2 & 0x1) == 0) {
            class250.method1806(this.field332);
        }
        if ((var2 & 0x2) == 0) {
            class250.method1797(0);
        }
        field339++;
        if (arg0 != 72) {
            field340 = -55;
        }
        if ((var2 & 0x4) == 0) {
            class250.method1812(0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V", line = 138)
    protected final void finalize() throws Throwable {
        field334++;
        if (this.field332 != -1) {
            class266.method1927(this.field332, this.field331, this.field338);
            this.field332 = -1;
            this.field331 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII[Lcc;I)V", line = 154)
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class263[] arg8, int arg9) {
        if (class250.field3787) {
            class306.method2149(arg5, arg1, arg4, arg2);
        } else {
            class144.method972(arg5, arg1, arg4, arg2);
            class215.method1485();
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class263 var11 = arg8[var10];
            if (var11 != null && (var11.field4065 == arg3 || arg3 == -1412584499 && class116.field1649 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class228.field3291[class247.field3751] = var11.field4027 + arg9;
                    class78.field984[class247.field3751] = var11.field4074 + arg0;
                    class17.field234[class247.field3751] = var11.field3989;
                    class115.field1625[class247.field3751] = var11.field4096;
                    var12 = class247.field3751++;
                } else {
                    var12 = arg6;
                }
                var11.field4064 = var12;
                var11.field3979 = class38.field463;
                if (!var11.field3993 || !client.method1946(var11)) {
                    if (var11.field4113 > 0) {
                        class185.method1287(var11, (byte) -77);
                    }
                    int var13 = var11.field4027 + arg9;
                    int var14 = var11.field4074 + arg0;
                    int var15 = var11.field3992;
                    if (class309.field4772 && (client.method1952(var11).field2467 != 0 || var11.field3981 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class116.field1649 == var11) {
                        if (arg3 != -1412584499 && !var11.field3995) {
                            class58.field706 = arg8;
                            class166.field2294 = arg9;
                            class134.field1850 = arg0;
                            continue;
                        }
                        if (class117.field1662 && class62.field762) {
                            int var16 = class211.field2987;
                            int var17 = class161.field2216;
                            int var18 = var16 - class247.field3742;
                            int var19 = var17 - class242.field3651;
                            if (var19 < class331.field5058) {
                                var19 = class331.field5058;
                            }
                            if (var18 < class157.field2169) {
                                var18 = class157.field2169;
                            }
                            if (var19 + var11.field4096 > class331.field5058 - -class110.field1540.field4096) {
                                var19 = class110.field1540.field4096 + class331.field5058 - var11.field4096;
                            }
                            var14 = var19;
                            if ((class157.field2169 + class110.field1540.field3989) < (var18 + var11.field3989)) {
                                var18 = class157.field2169 + class110.field1540.field3989 - var11.field3989;
                            }
                            var13 = var18;
                        }
                        if (!var11.field3995) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3981 == 2) {
                        var20 = arg5;
                        var21 = arg2;
                        var22 = arg1;
                        var23 = arg4;
                    } else {
                        var22 = var14 > arg1 ? var14 : arg1;
                        var20 = var13 <= arg5 ? arg5 : var13;
                        int var24 = var14 + var11.field4096;
                        int var25 = var11.field3989 + var13;
                        if (var11.field3981 == 9) {
                            var24++;
                            var25++;
                        }
                        var23 = var25 < arg4 ? var25 : arg4;
                        var21 = arg2 <= var24 ? arg2 : var24;
                    }
                    if (!var11.field3993 || var20 < var23 && var22 < var21) {
                        if (var11.field4113 != 0) {
                            if (var11.field4113 == 1337 || var11.field4113 == 1403) {
                                class17.field232 = var14;
                                class226.field3230 = var11;
                                class67.field882 = var13;
                                class42.method243(var11.field4096, var11.field4113 == 1403, var14, var13, var11.field3989, (byte) -36);
                                class285.field4483[var12] = true;
                                if (class250.field3787) {
                                    class306.method2149(arg5, arg1, arg4, arg2);
                                } else {
                                    class144.method972(arg5, arg1, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field4113 == 1338) {
                                if (!var11.method1896(-56)) {
                                    continue;
                                }
                                class230.method1621(var13, (byte) 117, var14, var11, var12);
                                if (class250.field3787) {
                                    class306.method2149(arg5, arg1, arg4, arg2);
                                } else {
                                    class144.method972(arg5, arg1, arg4, arg2);
                                }
                                if (class68.field894 != 0 && class68.field894 != 3 || class140.field1951 || var20 > class49.field609 || class229.field3340 < var22 || var23 <= class49.field609 || class229.field3340 >= var21) {
                                    continue;
                                }
                                int var26 = class49.field609 - var13;
                                int var27 = class229.field3340 - var14;
                                int var28 = var11.field4015[var27];
                                if (var28 > var26 || (var11.field4101[var27] + var28) < var26) {
                                    continue;
                                }
                                int var29 = (int) class280.field4344 + class227.field3248 & 0x7FF;
                                int var30 = var27 - var11.field4096 / 2;
                                int var31 = var26 - var11.field3989 / 2;
                                int var32 = class215.field3024[var29];
                                int var33 = class215.field3017[var29];
                                int var34 = (class196.field2807 + 256) * var33 >> 8;
                                int var35 = (class196.field2807 + 256) * var32 >> 8;
                                int var36 = var30 * var35 + var31 * var34 >> 11;
                                int var37 = var30 * var34 - (var31 * var35) >> 11;
                                int var38 = class118.field1664.field2392 + var36 - ((class118.field1664.method748(false) + -1) * 64) >> 7;
                                int var39 = class118.field1664.field2357 + 64 - var37 - class118.field1664.method748(false) * 64 >> 7;
                                if (class72.field909 && (class37.field442 & 0x40) != 0) {
                                    class263 var40 = class176.method1211(arg7 ^ 0x3AB1, class225.field3194, class112.field1595);
                                    if (var40 == null) {
                                        class168.method1101(30509);
                                    } else {
                                        class168.method1100(var39, (short) 26, 1L, " ->", var38, -501, class229.field3343, class260.field3943);
                                    }
                                    continue;
                                }
                                if (class249.field3769 == 1) {
                                    class168.method1100(var39, (short) 10, 1L, "", var38, -501, -1, class279.field4328);
                                }
                                class168.method1100(var39, (short) 5, 1L, "", var38, -501, -1, class267.field4210);
                                continue;
                            }
                            if (var11.field4113 == 1339) {
                                if (var11.method1896(arg7 ^ 0xFFFFC57A)) {
                                    class303.method2127(256, var14, var13, var11, var12);
                                    if (class250.field3787) {
                                        class306.method2149(arg5, arg1, arg4, arg2);
                                    } else {
                                        class144.method972(arg5, arg1, arg4, arg2);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4113 == 1400) {
                                class185.method1285(var14, 31629, var11.field3989, var11.field4096, var13);
                                class285.field4483[var12] = true;
                                class211.field2985[var12] = true;
                                if (class250.field3787) {
                                    class306.method2149(arg5, arg1, arg4, arg2);
                                } else {
                                    class144.method972(arg5, arg1, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field4113 == 1401) {
                                class228.method1608(var11.field4096, var14, var13, var11.field3989, 32010);
                                class285.field4483[var12] = true;
                                class211.field2985[var12] = true;
                                if (class250.field3787) {
                                    class306.method2149(arg5, arg1, arg4, arg2);
                                } else {
                                    class144.method972(arg5, arg1, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field4113 == 1402) {
                                if (!class250.field3787) {
                                    class73.method447(var13, -118, var14);
                                    class285.field4483[var12] = true;
                                    class211.field2985[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4113 == 1405) {
                                if (!class132.field1819) {
                                    continue;
                                }
                                int var41 = var14 + 15;
                                int var42 = var11.field3989 + var13;
                                class179.field2601.method71("Fps:" + class180.field2613, var42, var41, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var142 = var41 + 15;
                                int var44 = 16776960;
                                int var45 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                if (var45 > 65536) {
                                    var44 = 16711680;
                                }
                                class179.field2601.method71("Mem:" + var45 + "k", var42, var142, var44, -1);
                                var41 = var142 + 15;
                                if (class250.field3787) {
                                    int var46 = 16776960;
                                    int var47 = (class266.field4195 + class266.field4193 + class266.field4196) / 1024;
                                    if (var47 > 65536) {
                                        var46 = 16711680;
                                    }
                                    class179.field2601.method71("Card:" + var47 + "k", var42, var41, var46, -1);
                                    var41 += 15;
                                }
                                int var48 = 16776960;
                                int var49 = 0;
                                int var50 = 0;
                                int var51 = 0;
                                for (int var52 = 0; var52 < 29; var52++) {
                                    var49 += class165.field2273[var52].method1676(true);
                                    var50 += class165.field2273[var52].method1684(-1);
                                    var51 += class165.field2273[var52].method1680((byte) 103);
                                }
                                int var53 = var51 * 100 / var49;
                                int var54 = var50 * 10000 / var49;
                                String var55 = "Cache:" + class220.method1512((long) var54, 0, 2, true, 98) + "% (" + var53 + "%)";
                                class276.field4292.method71(var55, var42, var41, var48, -1);
                                var41 += 12;
                                class285.field4483[var12] = true;
                                class211.field2985[var12] = true;
                                continue;
                            }
                            if (var11.field4113 == 1406) {
                                class177.field2575 = var11;
                                class318.field4891 = var14;
                                client.field4231 = var13;
                                continue;
                            }
                        }
                        if (!class140.field1951) {
                            if (var11.field3981 == 0 && var11.field4046 && class49.field609 >= var20 && var22 <= class229.field3340 && class49.field609 < var23 && var21 > class229.field3340 && !class309.field4772) {
                                class76.field968[0] = class275.field4288;
                                class30.field371[0] = 1007;
                                class310.field4794 = 1;
                                class221.field3124[0] = class279.field4339;
                                class148.field2061[0] = "";
                            }
                            if (var20 <= class49.field609 && class229.field3340 >= var22 && class49.field609 < var23 && var21 > class229.field3340) {
                                class117.method797(arg7 - 14928, class49.field609 - var13, var11, class229.field3340 - var14);
                            }
                        }
                        if (var11.field3981 == 0) {
                            if (!var11.field3993 && client.method1946(var11) && class113.field1611 != var11) {
                                continue;
                            }
                            if (!var11.field3993) {
                                if ((var11.field4059 - var11.field4096) < var11.field3990) {
                                    var11.field3990 = var11.field4059 - var11.field4096;
                                }
                                if (var11.field3990 < 0) {
                                    var11.field3990 = 0;
                                }
                            }
                            if (class250.field3787 && var11.field4113 == 1407) {
                                class124.method833(var13, var14, var11.field3989, var11.field4096);
                            }
                            method161(var14 - var11.field3990, var22, var21, var11.field4083, var23, var20, var12, 15024, arg8, var13 - var11.field4068);
                            if (var11.field3975 != null) {
                                method161(var14 - var11.field3990, var22, var21, var11.field4083, var23, var20, var12, 15024, var11.field3975, var13 - var11.field4068);
                            }
                            class343 var56 = (class343) class292.field4585.method1537((long) var11.field4083, -22708);
                            if (var56 != null) {
                                if (var56.field5324 == 0 && !class140.field1951 && var20 <= class49.field609 && class229.field3340 >= var22 && class49.field609 < var23 && var21 > class229.field3340 && !class309.field4772) {
                                    class310.field4794 = 1;
                                    class76.field968[0] = class275.field4288;
                                    class221.field3124[0] = class279.field4339;
                                    class30.field371[0] = 1007;
                                    class148.field2061[0] = "";
                                }
                                class162.method1066(var21, var14, var12, var22, var23, var56.field5329, var20, -18460, var13);
                            }
                            if (class250.field3787 && var11.field4113 == 1407) {
                                class124.method835();
                            }
                            if (class250.field3787) {
                                class306.method2149(arg5, arg1, arg4, arg2);
                            } else {
                                class144.method972(arg5, arg1, arg4, arg2);
                                class215.method1485();
                            }
                        }
                        if (class76.field969[var12] || class177.field2569 > 1) {
                            if (var11.field3981 == 0 && !var11.field3993 && var11.field4096 < var11.field4059) {
                                class12.method86(var13 + var11.field3989, var14, var11.field4096, var11.field4059, (byte) -122, var11.field3990);
                            }
                            if (var11.field3981 != 1) {
                                if (var11.field3981 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field4155; var58++) {
                                        for (int var59 = 0; var59 < var11.field4092; var59++) {
                                            int var60 = (var11.field4112 + 32) * var59 + var13;
                                            int var61 = var14 + ((var11.field4099 + 32) * var58);
                                            if (var57 < 20) {
                                                var61 += var11.field4147[var57];
                                                var60 += var11.field4013[var57];
                                            }
                                            if (var11.field4132[var57] > 0) {
                                                boolean var63 = false;
                                                boolean var64 = false;
                                                int var65 = var11.field4132[var57] - 1;
                                                if ((var60 + 32) > arg5 && var60 < arg4 && arg1 < (var61 + 32) && var61 < arg2 || class326.field4995 == var11 && class208.field2955 == var57) {
                                                    class91 var66;
                                                    if (class314.field4848 == 1 && class277.field4319 == var57 && class137.field1915 == var11.field4083) {
                                                        var66 = class147.method992(0, 2, arg7 - 7049, var65, var11.field4107, (class336) null, var11.field4047[var57]);
                                                    } else {
                                                        var66 = class147.method992(3153952, 1, 7975, var65, var11.field4107, (class336) null, var11.field4047[var57]);
                                                    }
                                                    if (class215.field3025) {
                                                        class285.field4483[var12] = true;
                                                    }
                                                    if (var66 == null) {
                                                        class239.method1712(arg7 - 15024, var11);
                                                    } else if (class326.field4995 == var11 && class208.field2955 == var57) {
                                                        int var67 = class161.field2216 - class75.field961;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        int var68 = class211.field2987 - class213.field2999;
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (class48.field594 < 5) {
                                                            var68 = 0;
                                                            var67 = 0;
                                                        }
                                                        var66.method537(var60 + var68, var61 + var67, 128);
                                                        if (arg3 != -1) {
                                                            class263 var69 = arg8[arg3 & 0xFFFF];
                                                            int var70;
                                                            int var71;
                                                            if (class250.field3787) {
                                                                var70 = class306.field4738;
                                                                var71 = class306.field4739;
                                                            } else {
                                                                var70 = class144.field2007;
                                                                var71 = class144.field2008;
                                                            }
                                                            if (var61 + var67 < var70 && var69.field3990 > 0) {
                                                                int var72 = (var70 - var61 - var67) * class322.field4939 / 3;
                                                                if (var72 > (class322.field4939 * 10)) {
                                                                    var72 = class322.field4939 * 10;
                                                                }
                                                                if (var69.field3990 < var72) {
                                                                    var72 = var69.field3990;
                                                                }
                                                                var69.field3990 -= var72;
                                                                class75.field961 += var72;
                                                                class239.method1712(0, var69);
                                                            }
                                                            if (var71 < (var61 + var67 + 32) && (var69.field4059 - var69.field4096) > var69.field3990) {
                                                                int var73 = (var61 + var67 + 32 - var71) * class322.field4939 / 3;
                                                                if ((class322.field4939 * 10) < var73) {
                                                                    var73 = class322.field4939 * 10;
                                                                }
                                                                if (var69.field4059 - var69.field3990 - var69.field4096 < var73) {
                                                                    var73 = var69.field4059 - var69.field4096 - var69.field3990;
                                                                }
                                                                var69.field3990 += var73;
                                                                class75.field961 -= var73;
                                                                class239.method1712(0, var69);
                                                            }
                                                        }
                                                    } else if (class89.field1114 == var11 && class276.field4299 == var57) {
                                                        var66.method537(var60, var61, 128);
                                                    } else {
                                                        var66.method531(var60, var61);
                                                    }
                                                }
                                            } else if (var11.field4149 != null && var57 < 20) {
                                                class91 var62 = var11.method1888(var57, (byte) -123);
                                                if (var62 != null) {
                                                    var62.method531(var60, var61);
                                                } else if (class254.field3873) {
                                                    class239.method1712(0, var11);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field3981 == 3) {
                                    int var74;
                                    if (class255.method1853(-98, var11)) {
                                        var74 = var11.field4126;
                                        if (class113.field1611 == var11 && var11.field4139 != 0) {
                                            var74 = var11.field4139;
                                        }
                                    } else {
                                        var74 = var11.field4063;
                                        if (class113.field1611 == var11 && var11.field4129 != 0) {
                                            var74 = var11.field4129;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4082) {
                                            if (class250.field3787) {
                                                class306.method2154(var13, var14, var11.field3989, var11.field4096, var74);
                                            } else {
                                                class144.method977(var13, var14, var11.field3989, var11.field4096, var74);
                                            }
                                        } else if (class250.field3787) {
                                            class306.method2156(var13, var14, var11.field3989, var11.field4096, var74);
                                        } else {
                                            class144.method964(var13, var14, var11.field3989, var11.field4096, var74);
                                        }
                                    } else if (var11.field4082) {
                                        if (class250.field3787) {
                                            class306.method2140(var13, var14, var11.field3989, var11.field4096, var74, 256 - (var15 & 0xFF));
                                        } else {
                                            class144.method966(var13, var14, var11.field3989, var11.field4096, var74, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class250.field3787) {
                                        class306.method2141(var13, var14, var11.field3989, var11.field4096, var74, 256 - (var15 & 0xFF));
                                    } else {
                                        class144.method962(var13, var14, var11.field3989, var11.field4096, var74, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3981 == 4) {
                                    class11 var138 = var11.method1899((byte) -49, class79.field1009);
                                    if (var138 != null) {
                                        String var139 = var11.field3999;
                                        int var140;
                                        if (class255.method1853(-119, var11)) {
                                            var140 = var11.field4126;
                                            if (class113.field1611 == var11 && var11.field4139 != 0) {
                                                var140 = var11.field4139;
                                            }
                                            if (var11.field4037.length() > 0) {
                                                var139 = var11.field4037;
                                            }
                                        } else {
                                            var140 = var11.field4063;
                                            if (class113.field1611 == var11 && var11.field4129 != 0) {
                                                var140 = var11.field4129;
                                            }
                                        }
                                        if (var11.field3993 && var11.field4000 != -1) {
                                            class93 var141 = class60.method353(var11.field4000, (byte) -54);
                                            var139 = var141.field1167;
                                            if (var139 == null) {
                                                var139 = "null";
                                            }
                                            if ((var141.field1188 == 1 || var11.field4022 != 1) && var11.field4022 != -1) {
                                                var139 = "<col=ff9040>" + var139 + "</col> x" + class99.method598((byte) -81, var11.field4022);
                                            }
                                        }
                                        if (class262.field3960 == var11) {
                                            var140 = var11.field4063;
                                            var139 = class218.field3061;
                                        }
                                        if (!var11.field3993) {
                                            var139 = class22.method131(true, var139, var11);
                                        }
                                        var138.method83(var139, var13, var14, var11.field3989, var11.field4096, var140, var11.field4087 ? 0 : -1, var11.field4018, var11.field4097, var11.field4005);
                                    } else if (class254.field3873) {
                                        class239.method1712(arg7 - 15024, var11);
                                    }
                                } else if (var11.field3981 == 5) {
                                    if (!var11.field3993) {
                                        class91 var75 = var11.method1892(arg7 + 4685, class255.method1853(-86, var11));
                                        if (var75 != null) {
                                            var75.method531(var13, var14);
                                        } else if (class254.field3873) {
                                            class239.method1712(0, var11);
                                        }
                                    } else if (var11.field4053 >= 0) {
                                        class344 var91 = var11.method1894(arg7 ^ 0xFFFFC52D);
                                        if (class250.field3787) {
                                            var91.method2377(0, var13, var14, var11.field3989, var11.field4096, var11.field4014, var11.field4094, 0);
                                        } else {
                                            var91.method2379(0, var13, var14, var11.field3989, var11.field4096, var11.field4014, var11.field4094, 0);
                                        }
                                    } else {
                                        class91 var76;
                                        if (var11.field4000 == -1) {
                                            var76 = var11.method1892(arg7 ^ 0x764D, false);
                                        } else if (var11.field4085 && class118.field1664.field1510 != null) {
                                            var76 = class147.method992(var11.field3982, var11.field4056, 7975, var11.field4000, var11.field4107, class118.field1664.field1510, var11.field4022);
                                        } else {
                                            var76 = class147.method992(var11.field3982, var11.field4056, 7975, var11.field4000, var11.field4107, (class336) null, var11.field4022);
                                        }
                                        if (var76 != null) {
                                            int var77 = var76.field1135;
                                            int var78 = var76.field1140;
                                            if (var11.field4023) {
                                                int var80 = (var78 - (1 - var11.field4096)) / var78;
                                                int var81 = (var11.field3989 + var77 - 1) / var77;
                                                if (class250.field3787) {
                                                    class306.method2150(var13, var14, var11.field3989 + var13, var14 - -var11.field4096);
                                                    boolean var84 = class30.method182(10876, var76.field1136);
                                                    class202 var85 = (class202) var76;
                                                    boolean var86 = class30.method182(10876, var76.field1144);
                                                    if (var84 && var86) {
                                                        if (var15 == 0) {
                                                            var85.method1385(var13, var14, var81, var80);
                                                        } else {
                                                            var85.method1388(var13, var14, 256 - (var15 & 0xFF), var81, var80);
                                                        }
                                                    } else if (var84) {
                                                        for (int var90 = 0; var90 < var80; var90++) {
                                                            if (var15 == 0) {
                                                                var85.method1385(var13, var14 + (var78 * var90), var81, 1);
                                                            } else {
                                                                var85.method1388(var13, var78 * var90 + var14, 256 - (var15 & 0xFF), var81, 1);
                                                            }
                                                        }
                                                    } else if (var86) {
                                                        for (int var87 = 0; var87 < var81; var87++) {
                                                            if (var15 == 0) {
                                                                var85.method1385(var77 * var87 + var13, var14, 1, var80);
                                                            } else {
                                                                var85.method1388(var77 * var87 + var13, var14, 256 - (var15 & 0xFF), 1, var80);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var88 = 0; var88 < var81; var88++) {
                                                            for (int var89 = 0; var89 < var80; var89++) {
                                                                if (var15 == 0) {
                                                                    var76.method531(var77 * var88 + var13, var78 * var89 + var14);
                                                                } else {
                                                                    var76.method537(var77 * var88 + var13, var78 * var89 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class306.method2149(arg5, arg1, arg4, arg2);
                                                } else {
                                                    class144.method967(var13, var14, var11.field3989 + var13, var14 - -var11.field4096);
                                                    for (int var82 = 0; var82 < var81; var82++) {
                                                        for (int var83 = 0; var83 < var80; var83++) {
                                                            if (var11.field4011 != 0) {
                                                                var76.method535(var77 / 2 + var13 + (var77 * var82), var78 / 2 + var14 - -(var78 * var83), 4096, var11.field4011, -108);
                                                            } else if (var15 == 0) {
                                                                var76.method531(var13 + (var77 * var82), var14 - -(var78 * var83));
                                                            } else {
                                                                var76.method537(var13 + (var77 * var82), var78 * var83 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class144.method972(arg5, arg1, arg4, arg2);
                                                }
                                            } else {
                                                int var79 = var11.field3989 * 4096 / var77;
                                                if (var11.field4011 != 0) {
                                                    var76.method535(var11.field3989 / 2 + var13, var11.field4096 / 2 + var14, var79, var11.field4011, -76);
                                                } else if (var15 != 0) {
                                                    var76.method541(var13, var14, var11.field3989, var11.field4096, 256 - (var15 & 0xFF));
                                                } else if (var11.field3989 == var77 && var11.field4096 == var78) {
                                                    var76.method531(var13, var14);
                                                } else {
                                                    var76.method539(var13, var14, var11.field3989, var11.field4096);
                                                }
                                            }
                                        } else if (class254.field3873) {
                                            class239.method1712(0, var11);
                                        }
                                    }
                                } else if (var11.field3981 == 6) {
                                    boolean var119 = class255.method1853(-97, var11);
                                    int var120;
                                    if (var119) {
                                        var120 = var11.field4071;
                                    } else {
                                        var120 = var11.field4134;
                                    }
                                    class201 var121 = null;
                                    int var122 = 0;
                                    if (var11.field4000 != -1) {
                                        class93 var123 = class60.method353(var11.field4000, (byte) -57);
                                        if (var123 != null) {
                                            class93 var124 = var123.method555(true, var11.field4022);
                                            class247 var125 = var120 == -1 ? null : class185.method1289(var120, (byte) 124);
                                            if (var11.field4085 && class118.field1664.field1510 != null) {
                                                var121 = var124.method560(var11.field4042, var11.field4153, -50, class118.field1664.field1510, var125, var11.field4050, 1);
                                            } else {
                                                var121 = var124.method560(var11.field4042, var11.field4153, -45, (class336) null, var125, var11.field4050, 1);
                                            }
                                            if (var121 == null) {
                                                class239.method1712(0, var11);
                                            } else {
                                                var122 = -var121.method11() / 2;
                                            }
                                        }
                                    } else if (var11.field4142 == 5) {
                                        if (var11.field4034 == -1) {
                                            var121 = class62.field780.method2316((class247) null, (class204[]) null, 32431, 0, -1, -1, -1, (class247) null, true, -1, 0);
                                        } else {
                                            int var126 = var11.field4034 & 0x7FF;
                                            if (class117.field1655 == var126) {
                                                var126 = 2047;
                                            }
                                            class109 var127 = class328.field5009[var126];
                                            class247 var128 = var120 == -1 ? null : class185.method1289(var120, (byte) 112);
                                            if (var127 != null && ((int) class48.method285((byte) -90, var127.field1496) << 11) == (var11.field4034 & 0xFFFFF800)) {
                                                var121 = var127.field1510.method2316((class247) null, (class204[]) null, arg7 + 17407, 0, var11.field4153, -1, 0, var128, true, -1, 0);
                                            }
                                        }
                                    } else if (var120 == -1) {
                                        var121 = var11.method1898(-1, var119, class118.field1664.field1510, 0, -84, -1, (class247) null);
                                        if (var121 == null && class254.field3873) {
                                            class239.method1712(0, var11);
                                        }
                                    } else {
                                        class247 var129 = class185.method1289(var120, (byte) 116);
                                        var121 = var11.method1898(var11.field4153, var119, class118.field1664.field1510, var11.field4050, -126, var11.field4042, var129);
                                        if (var121 == null && class254.field3873) {
                                            class239.method1712(0, var11);
                                        }
                                    }
                                    if (var121 != null) {
                                        int var130;
                                        if (var11.field4102 > 0) {
                                            var130 = (var11.field4096 << 8) / var11.field4102;
                                        } else {
                                            var130 = 256;
                                        }
                                        int var131;
                                        if (var11.field4028 <= 0) {
                                            var131 = 256;
                                        } else {
                                            var131 = (var11.field3989 << 8) / var11.field4028;
                                        }
                                        int var132 = var11.field3989 / 2 + (var11.field4103 * var131 >> 8) + var13;
                                        int var133 = var11.field4096 / 2 + (var11.field4117 * var130 >> 8) + var14;
                                        if (class250.field3787) {
                                            if (var11.field4010) {
                                                class250.method1813(var132, var133, var11.field4136, var11.field4141, var131, var130);
                                            } else {
                                                class250.method1792(var132, var133, var131, var130);
                                                class250.method1818((float) var11.field4076, (float) var11.field4141 * 1.5F);
                                            }
                                            class250.method1800();
                                            class250.method1794(true);
                                            class250.method1815(false);
                                            class139.method926(class165.field2289, (byte) 84);
                                            if (class100.field1319) {
                                                class306.method2143();
                                                class250.method1824();
                                                class306.method2149(arg5, arg1, arg4, arg2);
                                                class100.field1319 = false;
                                            }
                                            if (var11.field4077) {
                                                class250.method1827();
                                            }
                                            int var136 = class215.field3024[var11.field4131] * var11.field4136 >> 16;
                                            int var137 = class215.field3017[var11.field4131] * var11.field4136 >> 16;
                                            if (var11.field3993) {
                                                var121.method687(0, var11.field4120, var11.field4021, var11.field4131, var11.field4115, var122 + var136 + var11.field4061, var11.field4061 + var137, -1L);
                                            } else {
                                                var121.method687(0, var11.field4120, 0, var11.field4131, 0, var136, var137, -1L);
                                            }
                                            if (var11.field4077) {
                                                class250.method1791();
                                            }
                                        } else {
                                            class215.method1465(var132, var133);
                                            int var134 = class215.field3024[var11.field4131] * var11.field4136 >> 16;
                                            int var135 = class215.field3017[var11.field4131] * var11.field4136 >> 16;
                                            if (!var11.field3993) {
                                                var121.method687(0, var11.field4120, 0, var11.field4131, 0, var134, var135, -1L);
                                            } else if (var11.field4010) {
                                                ((class333) var121).method2293(0, var11.field4120, var11.field4021, var11.field4131, var11.field4115, var122 + var134 + var11.field4061, var135 - -var11.field4061, var11.field4136);
                                            } else {
                                                var121.method687(0, var11.field4120, var11.field4021, var11.field4131, var11.field4115, var11.field4061 + var134 + var122, var11.field4061 + var135, -1L);
                                            }
                                            class215.method1466();
                                        }
                                    }
                                } else {
                                    if (var11.field3981 == 7) {
                                        class11 var92 = var11.method1899((byte) 33, class79.field1009);
                                        if (var92 == null) {
                                            if (class254.field3873) {
                                                class239.method1712(arg7 ^ 0x3AB0, var11);
                                            }
                                            continue;
                                        }
                                        int var93 = 0;
                                        for (int var94 = 0; var94 < var11.field4155; var94++) {
                                            for (int var95 = 0; var95 < var11.field4092; var95++) {
                                                if (var11.field4132[var93] > 0) {
                                                    class93 var96 = class60.method353(var11.field4132[var93] - 1, (byte) -122);
                                                    String var97;
                                                    if (var96.field1188 != 1 && var11.field4047[var93] == 1) {
                                                        var97 = "<col=ff9040>" + var96.field1167 + "</col>";
                                                    } else {
                                                        var97 = "<col=ff9040>" + var96.field1167 + "</col> x" + class99.method598((byte) 123, var11.field4047[var93]);
                                                    }
                                                    int var98 = var13 + ((var11.field4112 + 115) * var95);
                                                    int var99 = (var11.field4099 + 12) * var94 + var14;
                                                    if (var11.field4018 == 0) {
                                                        var92.method58(var97, var98, var99, var11.field4063, var11.field4087 ? 0 : -1);
                                                    } else if (var11.field4018 == 1) {
                                                        var92.method64(var97, var98 + 57, var99, var11.field4063, var11.field4087 ? 0 : -1);
                                                    } else {
                                                        var92.method71(var97, var98 + 114, var99, var11.field4063, var11.field4087 ? 0 : -1);
                                                    }
                                                }
                                                var93++;
                                            }
                                        }
                                    }
                                    if (var11.field3981 == 8 && class204.field2868 == var11 && class98.field1285 == class282.field4384) {
                                        int var100 = 0;
                                        int var101 = 0;
                                        class11 var102 = class179.field2601;
                                        String var103 = var11.field3999;
                                        String var104 = class22.method131(true, var103, var11);
                                        while (var104.length() > 0) {
                                            int var105 = var104.indexOf("<br>");
                                            String var106;
                                            if (var105 == -1) {
                                                var106 = var104;
                                                var104 = "";
                                            } else {
                                                var106 = var104.substring(0, var105);
                                                var104 = var104.substring(var105 + 4);
                                            }
                                            int var107 = var102.method80(var106);
                                            var101 += var102.field159 + 1;
                                            if (var100 < var107) {
                                                var100 = var107;
                                            }
                                        }
                                        var100 += 6;
                                        var101 += 7;
                                        int var108 = var13 + var11.field3989 - var100 - 5;
                                        if ((var13 + 5) > var108) {
                                            var108 = var13 + 5;
                                        }
                                        if ((var100 + var108) > arg4) {
                                            var108 = arg4 - var100;
                                        }
                                        int var109 = var11.field4096 + var14 + 5;
                                        if (arg2 < (var101 + var109)) {
                                            var109 = arg2 - var101;
                                        }
                                        if (class250.field3787) {
                                            class306.method2154(var108, var109, var100, var101, 16777120);
                                            class306.method2156(var108, var109, var100, var101, 0);
                                        } else {
                                            class144.method977(var108, var109, var100, var101, 16777120);
                                            class144.method964(var108, var109, var100, var101, 0);
                                        }
                                        int var110 = var102.field159 + var109 + 2;
                                        String var111 = var11.field3999;
                                        String var112 = class22.method131(true, var111, var11);
                                        while (var112.length() > 0) {
                                            int var113 = var112.indexOf("<br>");
                                            String var114;
                                            if (var113 == -1) {
                                                var114 = var112;
                                                var112 = "";
                                            } else {
                                                var114 = var112.substring(0, var113);
                                                var112 = var112.substring(var113 + 4);
                                            }
                                            var102.method58(var114, var108 + 3, var110, 0, -1);
                                            var110 += var102.field159 + 1;
                                        }
                                    }
                                    if (var11.field3981 == 9) {
                                        int var115;
                                        int var116;
                                        int var117;
                                        int var118;
                                        if (var11.field4123) {
                                            var115 = var13 + var11.field3989;
                                            var116 = var11.field4096 + var14;
                                            var117 = var14;
                                            var118 = var13;
                                        } else {
                                            var115 = var11.field3989 + var13;
                                            var116 = var14;
                                            var117 = var11.field4096 + var14;
                                            var118 = var13;
                                        }
                                        if (var11.field4116 == 1) {
                                            if (class250.field3787) {
                                                class306.method2145(var118, var116, var115, var117, var11.field4063);
                                            } else {
                                                class144.method970(var118, var116, var115, var117, var11.field4063);
                                            }
                                        } else if (class250.field3787) {
                                            class306.method2144(var118, var116, var115, var117, var11.field4063, var11.field4116);
                                        } else {
                                            class144.method961(var118, var116, var115, var117, var11.field4063, var11.field4116);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg7 != 15024) {
            method162(-59);
        }
        field341++;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V", line = 1458)
    public static void method162(int arg0) {
        field336 = null;
        if (arg0 != 15817) {
            method161(-41, -112, -33, -37, -27, -67, -16, 121, (class263[]) null, 92);
        }
    }
}
