import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class471 {

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public int field6909 = -1;

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6912 = new String[] { method3636(method3635("\\\u0013\u0010\\\u0014\u0010")), method3636(method3635("\\\u0013\u0010\\\u0017\u0010")), method3636(method3635("CX_\\/")), method3636(method3635("V\u0003\u001d\u001e")), method3636(method3635("\\\u0013\u0010\\\u001b\u0010")), method3636(method3635("\\\u0013\u0010\\\u0015\u0010")), method3636(method3635("\\\u0013\u0010\\\u0016\u0010")), method3636(method3635("\\\u0013\u0010\\\u001e\u0010")), method3636(method3635("\\\u0013\u0010\\\u0019\u0010")), method3636(method3635("\\\u0013\u0010\\\u0013\u0010")), method3636(method3635("\\\u0013\u0010\\\u0011\u0010")), method3636(method3635("\\\u0013\u0010\\\u001a\u0010")), method3636(method3635("\\\u0013\u0010\\\u001f\u0010")), method3636(method3635("\\\u0013\u0010\\\u0010\u0010")), method3636(method3635("\\\u0013\u0010\\\u0018\u0010")) };

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Lsb;")
    public static class261 field6892 = new class261(50, 2);

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "F")
    public static float field6903;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    private int field6902;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "J")
    private long field6899;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "J")
    private long field6906;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "Z")
    public boolean field6893;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
    private int[] field6894;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "[I")
    public int[] field6911;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "[Lvq;")
    private class363[] field6908;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 7)
    private final void method3622(int arg0) {
        try {
            field6910++;
            long[] var2 = class57.field813;
            this.field6906 = -1L;
            this.field6906 = this.field6906 >>> 8 ^ var2[(int) ((this.field6906 ^ (long) (this.field6902 >> 8)) & 0xFFL)];
            if (arg0 != 3030) {
                this.field6894 = null;
            }
            this.field6906 = var2[(int) ((this.field6906 ^ (long) this.field6902) & 0xFFL)] ^ this.field6906 >>> 8;
            for (int var3 = 0; var3 < this.field6894.length; var3++) {
                this.field6906 = var2[(int) ((this.field6906 ^ (long) (this.field6894[var3] >> 24)) & 0xFFL)] ^ this.field6906 >>> 8;
                this.field6906 = this.field6906 >>> 8 ^ var2[(int) ((this.field6906 ^ (long) (this.field6894[var3] >> 16)) & 0xFFL)];
                this.field6906 = this.field6906 >>> 8 ^ var2[(int) (((long) (this.field6894[var3] >> 8) ^ this.field6906) & 0xFFL)];
                this.field6906 = var2[(int) ((this.field6906 ^ (long) this.field6894[var3]) & 0xFFL)] ^ this.field6906 >>> 8;
            }
            if (this.field6908 != null) {
                for (int var4 = 0; var4 < this.field6908.length; var4++) {
                    if (this.field6908[var4] != null) {
                        int[] var5;
                        int[] var6;
                        if (this.field6893) {
                            var5 = this.field6908[var4].field5268;
                            var6 = this.field6908[var4].field5271;
                        } else {
                            var6 = this.field6908[var4].field5267;
                            var5 = this.field6908[var4].field5270;
                        }
                        if (var6 != null) {
                            for (int var7 = 0; var7 < var6.length; var7++) {
                                this.field6906 = var2[(int) (((long) (var6[var7] >> 8) ^ this.field6906) & 0xFFL)] ^ this.field6906 >>> 8;
                                this.field6906 = var2[(int) (((long) var6[var7] ^ this.field6906) & 0xFFL)] ^ this.field6906 >>> 8;
                            }
                        }
                        if (var5 != null) {
                            for (int var8 = 0; var8 < var5.length; var8++) {
                                this.field6906 = var2[(int) (((long) (var5[var8] >> 8) ^ this.field6906) & 0xFFL)] ^ this.field6906 >>> 8;
                                this.field6906 = var2[(int) ((this.field6906 ^ (long) var5[var8]) & 0xFFL)] ^ this.field6906 >>> 8;
                            }
                        }
                        if (this.field6908[var4].field5272 != null) {
                            for (int var9 = 0; var9 < this.field6908[var4].field5272.length; var9++) {
                                this.field6906 = var2[(int) ((this.field6906 ^ (long) (this.field6908[var4].field5272[var9] >> 8)) & 0xFFL)] ^ this.field6906 >>> 8;
                                this.field6906 = this.field6906 >>> 8 ^ var2[(int) ((this.field6906 ^ (long) this.field6908[var4].field5272[var9]) & 0xFFL)];
                            }
                        }
                        if (this.field6908[var4].field5264 != null) {
                            for (int var10 = 0; var10 < this.field6908[var4].field5264.length; var10++) {
                                this.field6906 = this.field6906 >>> 8 ^ var2[(int) ((this.field6906 ^ (long) (this.field6908[var4].field5264[var10] >> 8)) & 0xFFL)];
                                this.field6906 = var2[(int) ((this.field6906 ^ (long) this.field6908[var4].field5264[var10]) & 0xFFL)] ^ this.field6906 >>> 8;
                            }
                        }
                    }
                }
            }
            for (int var11 = 0; var11 < 5; var11++) {
                this.field6906 = this.field6906 >>> 8 ^ var2[(int) ((this.field6906 ^ (long) this.field6911[var11]) & 0xFFL)];
            }
            this.field6906 = var2[(int) (((long) (this.field6893 ? 1 : 0) ^ this.field6906) & 0xFFL)] ^ this.field6906 >>> 8;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field6912[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILnb;I)V", line = 133)
    public final void method3623(int arg0, int arg1, class415 arg2, int arg3) {
        try {
            field6905++;
            if (arg3 != -1) {
                method3634(15);
            }
            if (arg0 == -1) {
                this.field6894[arg1] = 0;
            } else if (arg2.method3237(arg0, 0) != null) {
                this.field6894[arg1] = class10.method71(arg0, 1073741824);
                this.method3622(3030);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6912[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6912[3] : field6912[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lrl;III)V", line = 156)
    public final void method3624(class343 arg0, int arg1, int arg2, int arg3) {
        try {
            field6901++;
            int var5 = class304.field4239[arg3];
            if (arg0.method2757(3, arg2) != null) {
                this.field6894[var5] = class10.method71(arg1, arg2);
                this.method3622(3030);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6912[9] + (arg0 == null ? field6912[3] : field6912[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BII)Z", line = 171)
    public static final boolean method3625(byte arg0, int arg1, int arg2) {
        try {
            field6891++;
            if (arg0 == -79) {
                boolean var3 = (arg1 & 0x37) == 0 ? class478.method3704(arg2, -1557, arg1) : class356.method2850(arg2, arg0 ^ 0xFFFF00B1, arg1);
                return var3 | (arg2 & 0x10000) != 0 | class750.method5428(arg1, arg2, arg0 - 34);
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6912[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lrl;ZLoc;Lqu;Lwh;BILqu;Lcq;Lhq;Lnb;Ldaa;[Lqu;Lha;I[I)Lka;", line = 187)
    public final class761 method3626(class343 arg0, boolean arg1, class760 arg2, class84 arg3, class350 arg4, byte arg5, int arg6, class84 arg7, class541 arg8, class56 arg9, class415 arg10, class226 arg11, class84[] arg12, class18 arg13, int arg14, int[] arg15) {
        try {
            field6895++;
            if (this.field6909 != -1) {
                return arg9.method600(-109, this.field6909).method1171((byte) -115, arg7, arg8, arg6, arg3, arg13, arg14, arg4, null, arg12, arg15);
            }
            int var17 = arg14;
            long var18 = this.field6906;
            int[] var20 = this.field6894;
            boolean var21 = false;
            boolean var22 = false;
            if (arg7 != null) {
                class437 var23 = arg7.method846(12763);
                if (var23 != null && (var23.field6436 >= 0 || var23.field6441 >= 0)) {
                    var20 = new int[this.field6894.length];
                    for (int var24 = 0; var24 < var20.length; var24++) {
                        var20[var24] = this.field6894[var24];
                    }
                    if (var23.field6436 >= 0 && arg2.field10839 != -1) {
                        var21 = true;
                        if (var23.field6436 == 65535) {
                            var20[arg2.field10839] = 0;
                            var18 ^= 0xFFFFFFFF00000000L;
                            for (int var26 = 0; var26 < arg2.field10846.length; var26++) {
                                var20[arg2.field10846[var26]] = 0;
                            }
                        } else {
                            var20[arg2.field10839] = class10.method71(var23.field6436, 1073741824);
                            for (int var25 = 0; var25 < arg2.field10846.length; var25++) {
                                var20[arg2.field10846[var25]] = 0;
                            }
                            var18 ^= (long) var20[arg2.field10839] << 32;
                        }
                    }
                    if (var23.field6441 >= 0 && arg2.field10844 != -1) {
                        if (var23.field6441 == 65535) {
                            var20[arg2.field10844] = 0;
                            var18 ^= 0xFFFFFFFFL;
                            for (int var27 = 0; var27 < arg2.field10841.length; var27++) {
                                var20[arg2.field10841[var27]] = 0;
                            }
                        } else {
                            var20[arg2.field10844] = class10.method71(var23.field6441, 1073741824);
                            for (int var28 = 0; var28 < arg2.field10841.length; var28++) {
                                var20[arg2.field10841[var28]] = 0;
                            }
                            var18 ^= var20[arg2.field10844];
                        }
                        var22 = true;
                    }
                }
            }
            boolean var29 = false;
            int var30 = arg12 == null ? 0 : arg12.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (arg12[var31] != null) {
                    var17 |= arg12[var31].method830(113);
                    var29 = true;
                }
            }
            if (arg7 != null) {
                var29 = true;
                var17 |= arg7.method830(102);
            }
            if (arg3 != null) {
                var17 |= arg3.method830(95);
                var29 = true;
            }
            boolean var32 = false;
            if (arg15 != null) {
                for (int var33 = 0; var33 < arg15.length; var33++) {
                    if (arg15[var33] != -1) {
                        var32 = true;
                        var17 |= 0x20;
                    }
                }
            }
            class251 var34 = class391.field5710;
            class761 var35;
            synchronized (class391.field5710) {
                var35 = (class761) class391.field5710.method2053(0, var18);
            }
            class765 var36 = null;
            if (this.field6902 != -1) {
                var36 = arg4.method2792(this.field6902, (byte) 18);
            }
            if (var35 == null || arg13.method226(var35.method395(), var17) != 0) {
                if (var35 != null) {
                    var17 = arg13.method194(var17, var35.method395());
                }
                boolean var38 = false;
                int var39 = 0;
                while (true) {
                    if (var39 >= var20.length) {
                        if (var38) {
                            if (this.field6899 != -1L) {
                                class251 var45 = class391.field5710;
                                synchronized (class391.field5710) {
                                    var35 = (class761) class391.field5710.method2053(0, this.field6899);
                                }
                            }
                            if (var35 == null || arg13.method226(var35.method395(), var17) != 0) {
                                return null;
                            }
                        } else {
                            class60[] var46 = new class60[var20.length];
                            for (int var47 = 0; var47 < var20.length; var47++) {
                                int var48 = var20[var47];
                                class363 var49 = null;
                                boolean var50 = var47 == 5 && var21 || var47 == 3 && var22;
                                if ((var48 & 0x40000000) != 0) {
                                    if (!var50 && this.field6908 != null && this.field6908[var47] != null) {
                                        var49 = this.field6908[var47];
                                    }
                                    class60 var51 = arg10.method3237(var48 & 0x3FFFFFFF, 0).method2941(this.field6893, true, var49);
                                    if (var51 != null) {
                                        var46[var47] = var51;
                                    }
                                } else if ((var48 & Integer.MIN_VALUE) != 0) {
                                    class60 var52 = arg0.method2757(3, var48 & 0x3FFFFFFF).method1006(13);
                                    if (var52 != null) {
                                        var46[var47] = var52;
                                    }
                                }
                            }
                            if (var36 != null && var36.field10884 != null) {
                                for (int var53 = 0; var53 < var36.field10884.length; var53++) {
                                    if (var46[var53] != null) {
                                        int var54 = 0;
                                        int var55 = 0;
                                        int var56 = 0;
                                        int var57 = 0;
                                        int var58 = 0;
                                        int var59 = 0;
                                        if (var36.field10884[var53] != null) {
                                            var57 = var36.field10884[var53][3] << 3;
                                            var58 = var36.field10884[var53][4] << 3;
                                            var56 = var36.field10884[var53][2];
                                            var54 = var36.field10884[var53][0];
                                            var59 = var36.field10884[var53][5] << 3;
                                            var55 = var36.field10884[var53][1];
                                        }
                                        if (var57 != 0 || var58 != 0 || var59 != 0) {
                                            var46[var53].method647(var59, var57, (byte) 105, var58);
                                        }
                                        if (var54 != 0 || var55 != 0 || var56 != 0) {
                                            var46[var53].method650(var54, var56, var55, true);
                                        }
                                    }
                                }
                            }
                            int var60 = var17 | 0x4000;
                            class60 var61 = new class60(var46, var46.length);
                            var35 = arg13.method197(var61, var60, class692.field9680, 64, 850);
                            for (int var62 = 0; var62 < 5; var62++) {
                                for (int var63 = 0; var63 < class617.field8803.length; var63++) {
                                    if (this.field6911[var62] < class617.field8803[var63][var62].length) {
                                        var35.method386(class511.field7497[var63][var62], class617.field8803[var63][var62][this.field6911[var62]]);
                                    }
                                }
                            }
                            if (arg1) {
                                var35.method411(var17);
                                class251 var64 = class391.field5710;
                                synchronized (class391.field5710) {
                                    class391.field5710.method2051(var18, var35, 93);
                                }
                                this.field6899 = var18;
                            }
                        }
                        break;
                    }
                    int var40 = var20[var39];
                    class363 var41 = null;
                    boolean var42 = false;
                    if (var21) {
                        if (arg2.field10839 == var39) {
                            var42 = true;
                        } else {
                            for (int var43 = 0; var43 < arg2.field10846.length; var43++) {
                                if (arg2.field10846[var43] == var39) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (var22) {
                        if (arg2.field10844 == var39) {
                            var42 = true;
                        } else {
                            for (int var44 = 0; var44 < arg2.field10841.length; var44++) {
                                if (arg2.field10841[var44] == var39) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if ((var40 & 0x40000000) != 0) {
                        if (!var42 && this.field6908 != null && this.field6908[var39] != null) {
                            var41 = this.field6908[var39];
                        }
                        if (!arg10.method3237(var40 & 0x3FFFFFFF, 0).method2930(2, this.field6893, var41)) {
                            var38 = true;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0 && !arg0.method2757(3, var40 & 0x3FFFFFFF).method1009(11519)) {
                        var38 = true;
                    }
                    var39++;
                }
            }
            class761 var65 = var35.method418((byte) 4, var17, true);
            if (!var29 && !var32) {
                return var65;
            }
            class104[] var66 = null;
            if (var36 != null) {
                var66 = var36.method5530((byte) -8, arg13);
            }
            if (var32 && var66 != null) {
                for (int var67 = 0; var67 < arg15.length; var67++) {
                    if (var66[var67] != null) {
                        var65.method389(var66[var67], 0x1 << var67, true);
                    }
                }
            }
            int var68 = 0;
            int var69 = 1;
            if (arg5 < 62) {
                this.field6906 = -120L;
            }
            while (var30 > var68) {
                if (arg12[var68] != null) {
                    arg12[var68].method841(-44, var69, 0, var65);
                }
                var68++;
                var69 <<= 0x1;
            }
            if (var32) {
                for (int var70 = 0; var70 < arg15.length; var70++) {
                    if (arg15[var70] != -1) {
                        int var71 = arg15[var70] - arg6;
                        int var72 = var71 & 0x3FFF;
                        class104 var73 = arg13.method221();
                        var73.method719(var72);
                        var65.method389(var73, 0x1 << var70, false);
                    }
                }
            }
            if (var32 && var66 != null) {
                for (int var74 = 0; var74 < arg15.length; var74++) {
                    if (var66[var74] != null) {
                        var65.method389(var66[var74], 0x1 << var74, false);
                    }
                }
            }
            if (arg7 != null && arg3 != null) {
                class177.method1484(121, arg3, var65, arg7);
            } else if (arg7 != null) {
                arg7.method825((byte) -124, 0, var65);
            } else if (arg3 != null) {
                arg3.method825((byte) -73, 0, var65);
            }
            return var65;
        } catch (RuntimeException var79) {
            throw class665.method4799(var79, field6912[13] + (arg0 == null ? field6912[3] : field6912[2]) + ',' + arg1 + ',' + (arg2 == null ? field6912[3] : field6912[2]) + ',' + (arg3 == null ? field6912[3] : field6912[2]) + ',' + (arg4 == null ? field6912[3] : field6912[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field6912[3] : field6912[2]) + ',' + (arg8 == null ? field6912[3] : field6912[2]) + ',' + (arg9 == null ? field6912[3] : field6912[2]) + ',' + (arg10 == null ? field6912[3] : field6912[2]) + ',' + (arg11 == null ? field6912[3] : field6912[2]) + ',' + (arg12 == null ? field6912[3] : field6912[2]) + ',' + (arg13 == null ? field6912[3] : field6912[2]) + ',' + arg14 + ',' + (arg15 == null ? field6912[3] : field6912[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 691)
    public static final void method3627(String arg0, int arg1) {
        try {
            field6896++;
            if (arg0 != null) {
                String var2 = class492.method3797(arg1 ^ arg1, arg0);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class210.field3062; var3++) {
                        String var4 = class591.field8497[var3];
                        String var5 = class492.method3797(0, var4);
                        if (class599.method4418((byte) 49, arg0, var5, var4, var2)) {
                            class210.field3062--;
                            for (int var6 = var3; var6 < class210.field3062; var6++) {
                                class591.field8497[var6] = class591.field8497[var6 + 1];
                                class653.field9272[var6] = class653.field9272[var6 + 1];
                                class336.field4867[var6] = class336.field4867[var6 + 1];
                                class147.field1895[var6] = class147.field1895[var6 + 1];
                                class302.field4205[var6] = class302.field4205[var6 + 1];
                                class653.field9275[var6] = class653.field9275[var6 + 1];
                            }
                            class469.field6864++;
                            class391.field5712 = class522.field7612;
                            class779 var7 = class85.method851(false);
                            class274 var8 = class375.method2969((byte) 1, class67.field985, var7.field11100);
                            var8.field3885.method5114(255, class101.method986(arg0, 6743));
                            var8.field3885.method5089(arg0, (byte) -82);
                            var7.method5608(var8, 29867);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6912[5] + (arg0 == null ? field6912[3] : field6912[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)V", line = 749)
    public static final void method3628(int arg0, int arg1, int arg2) {
        try {
            field6897++;
            class294 var3 = class146.method1261((long) arg1 | (long) arg0 << 32, 80, 18);
            var3.method2376(-107);
            if (arg2 >= -61) {
                method3628(8, 106, -110);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6912[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqu;Lnb;ILdaa;Lhq;Lha;Lcq;ZLrl;)Lka;", line = 767)
    public final class761 method3629(class84 arg0, class415 arg1, int arg2, class226 arg3, class56 arg4, class18 arg5, class541 arg6, boolean arg7, class343 arg8) {
        try {
            field6890++;
            if (this.field6909 != -1) {
                return arg4.method600(-85, this.field6909).method1176(null, arg2, arg5, arg0, (byte) 102, arg6);
            }
            int var10 = arg0 == null ? arg2 : arg0.method830(103) | arg2;
            class251 var11 = class270.field3827;
            class761 var12;
            synchronized (class270.field3827) {
                var12 = (class761) class270.field3827.method2053(0, this.field6906);
            }
            if (var12 == null || arg5.method226(var12.method395(), var10) != 0) {
                if (var12 != null) {
                    var10 = arg5.method194(var10, var12.method395());
                }
                boolean var14 = false;
                for (int var15 = 0; var15 < this.field6894.length; var15++) {
                    int var16 = this.field6894[var15];
                    class363 var17 = null;
                    if ((var16 & 0x40000000) != 0) {
                        if (this.field6908 != null && this.field6908[var15] != null) {
                            var17 = this.field6908[var15];
                        }
                        if (!arg1.method3237(var16 & 0x3FFFFFFF, 0).method2938(var17, this.field6893, 93)) {
                            var14 = true;
                        }
                    } else if ((Integer.MIN_VALUE & var16) != 0 && !arg8.method2757(3, var16 & 0x3FFFFFFF).method1011((byte) 76)) {
                        var14 = true;
                    }
                }
                if (var14) {
                    return null;
                }
                class60[] var18 = new class60[this.field6894.length];
                int var19 = 0;
                for (int var20 = 0; var20 < this.field6894.length; var20++) {
                    int var21 = this.field6894[var20];
                    class363 var22 = null;
                    if ((var21 & 0x40000000) != 0) {
                        if (this.field6908 != null && this.field6908[var20] != null) {
                            var22 = this.field6908[var20];
                        }
                        class60 var23 = arg1.method3237(var21 & 0x3FFFFFFF, 0).method2937(0, this.field6893, var22);
                        if (var23 != null) {
                            var18[var19++] = var23;
                        }
                    } else if ((var21 & Integer.MIN_VALUE) != 0) {
                        class60 var24 = arg8.method2757(3, var21 & 0x3FFFFFFF).method1010((byte) 110);
                        if (var24 != null) {
                            var18[var19++] = var24;
                        }
                    }
                }
                class60 var25 = new class60(var18, var19);
                int var26 = var10 | 0x4000;
                var12 = arg5.method197(var25, var26, class692.field9680, 64, 768);
                for (int var27 = 0; var27 < 5; var27++) {
                    for (int var28 = 0; var28 < class617.field8803.length; var28++) {
                        if (this.field6911[var27] < class617.field8803[var28][var27].length) {
                            var12.method386(class511.field7497[var28][var27], class617.field8803[var28][var27][this.field6911[var27]]);
                        }
                    }
                }
                var12.method411(var10);
                class251 var29 = class270.field3827;
                synchronized (class270.field3827) {
                    class270.field3827.method2051(this.field6906, var12, 93);
                }
            }
            if (arg0 == null) {
                return var12;
            } else {
                class761 var30 = var12.method418((byte) 4, var10, arg7);
                arg0.method825((byte) -99, 0, var30);
                return var30;
            }
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field6912[1] + (arg0 == null ? field6912[3] : field6912[2]) + ',' + (arg1 == null ? field6912[3] : field6912[2]) + ',' + arg2 + ',' + (arg3 == null ? field6912[3] : field6912[2]) + ',' + (arg4 == null ? field6912[3] : field6912[2]) + ',' + (arg5 == null ? field6912[3] : field6912[2]) + ',' + (arg6 == null ? field6912[3] : field6912[2]) + ',' + arg7 + ',' + (arg8 == null ? field6912[3] : field6912[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILdaa;Lqu;IILha;ILrl;)Lka;", line = 911)
    public final class761 method3630(int arg0, int arg1, class226 arg2, class84 arg3, int arg4, int arg5, class18 arg6, int arg7, class343 arg8) {
        try {
            field6900++;
            if (arg5 < 69) {
                this.method3631(null, null, false, (byte) -110, 38, -5, null);
            }
            int var10 = arg3 == null ? arg0 : arg3.method830(125) | arg0;
            long var11 = (long) arg4 << 32 | (long) (arg1 << 16) | (long) arg7;
            class251 var13 = class270.field3827;
            class761 var14;
            synchronized (class270.field3827) {
                var14 = (class761) class270.field3827.method2053(0, var11);
            }
            if (var14 == null || arg6.method226(var14.method395(), var10) != 0) {
                if (var14 != null) {
                    var10 = arg6.method194(var10, var14.method395());
                }
                class60[] var16 = new class60[3];
                int var17 = 0;
                if (!arg8.method2757(3, arg7).method1011((byte) 76) || !arg8.method2757(3, arg1).method1011((byte) 76) || !arg8.method2757(3, arg4).method1011((byte) 76)) {
                    return null;
                }
                class60 var18 = arg8.method2757(3, arg7).method1010((byte) 69);
                if (var18 != null) {
                    var16[var17++] = var18;
                }
                class60 var19 = arg8.method2757(3, arg1).method1010((byte) -40);
                if (var19 != null) {
                    var16[var17++] = var19;
                }
                class60 var20 = arg8.method2757(3, arg4).method1010((byte) -113);
                if (var20 != null) {
                    var16[var17++] = var20;
                }
                class60 var21 = new class60(var16, var17);
                int var22 = var10 | 0x4000;
                var14 = arg6.method197(var21, var22, class692.field9680, 64, 768);
                for (int var23 = 0; var23 < 5; var23++) {
                    for (int var24 = 0; var24 < class617.field8803.length; var24++) {
                        if (this.field6911[var23] < class617.field8803[var24][var23].length) {
                            var14.method386(class511.field7497[var24][var23], class617.field8803[var24][var23][this.field6911[var23]]);
                        }
                    }
                }
                var14.method411(var10);
                class251 var25 = class270.field3827;
                synchronized (class270.field3827) {
                    class270.field3827.method2051(var11, var14, 93);
                }
            }
            if (arg3 == null) {
                return var14;
            } else {
                class761 var26 = var14.method418((byte) 4, var10, true);
                arg3.method825((byte) -68, 0, var26);
                return var26;
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field6912[14] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6912[3] : field6912[2]) + ',' + (arg3 == null ? field6912[3] : field6912[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6912[3] : field6912[2]) + ',' + arg7 + ',' + (arg8 == null ? field6912[3] : field6912[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lvq;[IZBII[I)V", line = 997)
    public final void method3631(class363[] arg0, int[] arg1, boolean arg2, byte arg3, int arg4, int arg5, int[] arg6) {
        try {
            this.field6894 = arg6;
            this.field6911 = arg1;
            this.field6909 = arg5;
            if (this.field6902 != arg4) {
                this.field6902 = arg4;
            }
            field6907++;
            this.field6893 = arg2;
            this.field6908 = arg0;
            this.method3622(3030);
            if (arg3 < 123) {
                this.method3629(null, null, 66, null, null, null, null, false, null);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6912[4] + (arg0 == null ? field6912[3] : field6912[2]) + ',' + (arg1 == null ? field6912[3] : field6912[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6912[3] : field6912[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V", line = 1018)
    public final void method3632(boolean arg0, int arg1) {
        try {
            if (arg1 != -1) {
                this.method3630(-125, 115, null, null, -67, -14, null, 119, null);
            }
            this.field6893 = arg0;
            field6904++;
            this.method3622(arg1 + 3031);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6912[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(III)V", line = 1031)
    public final void method3633(int arg0, int arg1, int arg2) {
        try {
            field6898++;
            this.field6911[arg1] = arg2;
            this.method3622(3030);
            if (arg0 != 0) {
                this.field6894 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6912[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)V", line = 1048)
    public static void method3634(int arg0) {
        try {
            field6892 = null;
            if (arg0 >= -36) {
                method3628(-88, 13, 108);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6912[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3635(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3636(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
