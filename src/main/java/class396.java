import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class396 extends class379 {

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field5126;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public int field5125;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Ltja;")
    public static class288 field5130 = new class288(3000000, 200);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V", line = 5)
    public class396(int arg0, int arg1) {
        this.field5126 = arg0;
        this.field5125 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILiia;III)V", line = 15)
    public static final void method2319(int arg0, int arg1, class96 arg2, int arg3, int arg4, int arg5) {
        field5128++;
        if (arg2.field1274 == -1 && arg2.field1263 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg2.field1278 * class118.field1503.field10661.method1581(arg5 ^ arg5) >> 8;
        if (arg2.field1270 < arg4) {
            var6 += arg4 - arg2.field1270;
        } else if (arg4 < arg2.field1258) {
            var6 += arg2.field1258 - arg4;
        }
        if (arg2.field1271 < arg3) {
            var6 += arg3 - arg2.field1271;
        } else if (arg3 < arg2.field1267) {
            var6 += arg2.field1267 - arg3;
        }
        if (arg2.field1264 == 0 || (var6 - 256) > arg2.field1264 || class118.field1503.field10661.method1581(0) == 0 || arg2.field1255 != arg1) {
            if (arg2.field1260 != null) {
                class783.field10811.method3257(arg2.field1260);
                arg2.field1260 = null;
                arg2.field1279 = null;
                arg2.field1277 = null;
            }
            if (arg2.field1272 != null) {
                class783.field10811.method3257(arg2.field1272);
                arg2.field1272 = null;
                arg2.field1257 = null;
                arg2.field1262 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg2.field1264 - arg2.field1282;
        if (var8 < 0) {
            var8 = arg2.field1264;
        }
        int var9 = var7;
        int var10 = var6 - arg2.field1282;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class300.field3596.method1665(arg5 ^ 0x996F5CF7);
        int var11 = 8192;
        int var12 = (arg2.field1270 + arg2.field1258) / 2 - arg4;
        int var13 = (arg2.field1271 + arg2.field1267) / 2 - arg3;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class111.field1405 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 < 4096) {
                var15 = var6 * 8192 / 4096 + 8192;
            } else {
                var15 = 16384;
            }
            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
        }
        if (arg2.field1260 != null) {
            arg2.field1260.method730(var9);
            arg2.field1260.method727(var11);
        } else if (arg2.field1274 >= 0) {
            int var16 = arg2.field1254 == 256 && arg2.field1248 == 256 ? 256 : class12.method186(arg2.field1254, -126, arg2.field1248);
            if (arg2.field1256) {
                if (arg2.field1279 == null) {
                    arg2.field1279 = class527.method3152(class709.field9956, arg2.field1274);
                }
                if (arg2.field1279 != null) {
                    if (arg2.field1277 == null) {
                        arg2.field1277 = arg2.field1279.method3148(new int[] { 22050 });
                    }
                    if (arg2.field1277 != null) {
                        class80 var20 = class80.method725(arg2.field1277, var16, var9 << 6, var11);
                        var20.method747(-1);
                        class783.field10811.method3258(var20);
                        arg2.field1260 = var20;
                    }
                }
            } else {
                class420 var17 = class420.method2506(class257.field3050, arg2.field1274, 0);
                if (var17 != null) {
                    class242 var18 = var17.method2509().method1462(class555.field7727);
                    class80 var19 = class80.method725(var18, var16, var9 << 6, var11);
                    var19.method747(-1);
                    class783.field10811.method3258(var19);
                    arg2.field1260 = var19;
                }
            }
        }
        if (arg2.field1272 != null) {
            arg2.field1272.method730(var9);
            arg2.field1272.method727(var11);
            if (!arg2.field1272.method2221(8763)) {
                arg2.field1257 = null;
                arg2.field1262 = null;
                arg2.field1272 = null;
            }
        } else if (arg2.field1263 != null && (arg2.field1276 -= arg0) <= 0) {
            int var21 = arg2.field1254 == 256 && arg2.field1248 == 256 ? 256 : arg2.field1248 + (int) (Math.random() * (double) (arg2.field1254 - arg2.field1248));
            if (!arg2.field1261) {
                int var22 = (int) (Math.random() * (double) arg2.field1263.length);
                class420 var23 = class420.method2506(class257.field3050, arg2.field1263[var22], 0);
                if (var23 != null) {
                    class242 var24 = var23.method2509().method1462(class555.field7727);
                    class80 var25 = class80.method725(var24, var21, var9 << 6, var11);
                    var25.method747(0);
                    class783.field10811.method3258(var25);
                    arg2.field1272 = var25;
                    arg2.field1276 = arg2.field1269 + (int) ((double) (arg2.field1259 - arg2.field1269) * Math.random());
                    return;
                }
                return;
            }
            if (arg2.field1257 == null) {
                int var26 = (int) (Math.random() * (double) arg2.field1263.length);
                arg2.field1257 = class527.method3152(class709.field9956, arg2.field1263[var26]);
            }
            if (arg2.field1257 != null) {
                if (arg2.field1262 == null) {
                    arg2.field1262 = arg2.field1257.method3148(new int[] { 22050 });
                }
                if (arg2.field1262 != null) {
                    class80 var27 = class80.method725(arg2.field1262, var21, var9 << 6, var11);
                    var27.method747(0);
                    class783.field10811.method3258(var27);
                    arg2.field1272 = var27;
                    arg2.field1276 = (int) ((double) (arg2.field1259 - arg2.field1269) * Math.random()) + arg2.field1269;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z", line = 279)
    public final boolean method2320(int arg0, byte arg1) {
        field5124++;
        int var3 = 31 % ((-arg1 - 14) / 57);
        return (this.field5126 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I", line = 290)
    public final int method2321(int arg0) {
        if (arg0 >= -51) {
            return -16;
        } else {
            field5134++;
            return class773.method4289(this.field5126, 1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 303)
    public static void method2322(byte arg0) {
        field5130 = null;
        if (arg0 != -74) {
            method2319(73, -52, null, -113, -61, 114);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I", line = 313)
    public final int method2323(boolean arg0) {
        field5131++;
        if (!arg0) {
            this.method2325(74);
        }
        return (this.field5126 & 0x1CE19E) >> 18;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z", line = 326)
    public final boolean method2324(int arg0) {
        if (arg0 != 0) {
            this.method2321(-108);
        }
        field5127++;
        return (this.field5126 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Z", line = 338)
    public final boolean method2325(int arg0) {
        if (arg0 != -1) {
            this.field5126 = -70;
        }
        field5132++;
        return ((this.field5126 & 0x7B7428) >> 22) != 0;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 351)
    public static final void method2326(int arg0) {
        class324.field4023 = -2;
        class343.field4302 = -2;
        if (arg0 <= 34) {
            method2319(47, 32, null, -37, 47, 44);
        }
        class303.field3619 = 0;
        field5129++;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Z", line = 364)
    public final boolean method2327(int arg0) {
        field5133++;
        if (arg0 > -120) {
            field5135 = -126;
        }
        return ((this.field5126 & 0x218FCD) >> 21) != 0;
    }
}
