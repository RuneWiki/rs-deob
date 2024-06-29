import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class169 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lhn;")
    private class509 field2181 = new class509(128);

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Lhn;")
    public class509 field2198 = new class509(64);

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lfo;")
    public class361 field2197;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lfo;")
    private class361 field2188;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Ljc;")
    public static class305 field2191 = new class305("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lgb;")
    public static class145 field2192;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lza;")
    public static class287 field2193;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[I")
    public static int[] field2189;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 6)
    public final void method991(int arg0) {
        if (arg0 <= 96) {
            return;
        }
        class509 var2 = this.field2181;
        synchronized (this.field2181) {
            this.field2181.method3045(48);
        }
        field2185++;
        class509 var3 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method3045(48);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILkh;ILlr;I)V", line = 33)
    public static final void method992(int arg0, class13 arg1, int arg2, class531 arg3, int arg4) {
        field2186++;
        byte var5 = -1;
        if ((arg4 & 0x4) != 0) {
            int var6 = arg1.method2426((byte) 120);
            int var7 = arg1.method2414(true);
            int var8 = arg1.method2414(true);
            int var9 = arg1.field5729;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg3.field7783 != null && arg3.field7833 != null) {
                boolean var11 = false;
                if (var7 <= 1) {
                    if (!var10 && (class193.field2495 && !class310.field4150 || class334.field4432)) {
                        var11 = true;
                    } else if (class313.method1863((byte) -9, arg3.field7783)) {
                        var11 = true;
                    }
                }
                if (!var11 && class94.field1120 == 0) {
                    class286.field3760.field5729 = 0;
                    arg1.method2394((byte) 63, class286.field3760.field5761, 0, var8);
                    class286.field3760.field5729 = 0;
                    int var12 = -1;
                    String var14;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class495 var13 = class62.method371((byte) -29, class286.field3760);
                        var12 = var13.field7223;
                        var14 = var13.field7229.method2713(class286.field3760, -1);
                    } else {
                        var14 = class401.method2476(class274.method1665(class286.field3760, (byte) 24), false);
                    }
                    arg3.field1151 = var14.trim();
                    arg3.field1221 = 150;
                    arg3.field1224 = var6 >> 8;
                    arg3.field1166 = var6 & 0xFF;
                    int var15;
                    if (var7 == 1 || var7 == 2) {
                        var15 = var10 ? 17 : 1;
                    } else {
                        var15 = var10 ? 17 : 2;
                    }
                    if (var7 == 2) {
                        class124.method755(null, var14, var12, true, "<img=1>" + arg3.method3158(true, 28451), var15, "<img=1>" + arg3.method3148(false, -1), 0);
                    } else if (var7 == 1) {
                        class124.method755(null, var14, var12, true, "<img=0>" + arg3.method3158(true, 28451), var15, "<img=0>" + arg3.method3148(false, -1), 0);
                    } else {
                        class124.method755(null, var14, var12, true, arg3.method3158(true, 28451), var15, arg3.method3148(false, -1), 0);
                    }
                }
            }
            arg1.field5729 = var8 + var9;
        }
        if ((arg4 & 0x800) != 0) {
            arg3.field1151 = arg1.method2432((byte) 125);
            if (arg3.field1151.charAt(0) == '~') {
                arg3.field1151 = arg3.field1151.substring(1);
                class119.method714(arg3.field1151, arg3.method3148(false, -1), 2, (byte) 102, arg3.method3158(true, 28451), 0);
            } else if (class96.field1170 == arg3) {
                class119.method714(arg3.field1151, arg3.method3148(false, -1), 2, (byte) 102, arg3.method3158(true, 28451), 0);
            }
            arg3.field1221 = 150;
            arg3.field1166 = 0;
            arg3.field1224 = 0;
        }
        if ((arg4 & 0x1) != 0) {
            arg3.field7819 = arg1.method2387((byte) 125);
            if (arg3.field1254 == 0) {
                arg3.method536(16383, arg3.field7819);
                arg3.field7819 = -1;
            }
        }
        if ((arg4 & 0x10) != 0) {
            class447.field6522[arg0] = arg1.method2418(-43);
        }
        if ((arg4 & 0x20) != 0) {
            int var16 = arg1.method2443(-117);
            int var17 = arg1.method2414(true);
            arg3.method540((byte) -103, var16, class532.field7836, var17);
            arg3.field1246 = class532.field7836 + 300;
            arg3.field1189 = arg1.method2441(-25006);
        }
        if ((arg4 & 0x4000) != 0) {
            int var18 = arg1.method2392(false);
            int var19 = arg1.method2409(-4);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var20 = arg1.method2388((byte) -112);
            arg3.method538(var19, var18, var20, 105, false);
        }
        if ((arg4 & 0x400) != 0) {
            int var21 = arg1.method2387((byte) 125);
            arg3.field1154 = arg1.method2447(4339);
            arg3.field1177 = arg1.method2447(4339);
            arg3.field1165 = var21 & 0x7FFF;
            arg3.field1157 = (var21 & 0x8000) != 0;
            arg3.field1241 = arg3.field1165 + arg3.field1154 + class532.field7836;
        }
        if ((arg4 & 0x80) != 0) {
            int var22 = arg1.method2414(true);
            byte[] var23 = new byte[var22];
            class396 var24 = new class396(var23);
            arg1.method2395((byte) 111, var23, 0, var22);
            class484.field7127[arg0] = var24;
            arg3.method3159(var24, 107);
        }
        if ((arg4 & 0x10000) != 0) {
            arg3.field1239 = arg1.method2442((byte) 127);
            arg3.field1185 = arg1.method2442((byte) 100);
            arg3.field1164 = arg1.method2404((byte) -97);
            arg3.field1167 = (byte) arg1.method2388((byte) -118);
            arg3.field1173 = class532.field7836 + arg1.method2387((byte) 125);
            arg3.field1238 = class532.field7836 + arg1.method2426((byte) 94);
        }
        if ((arg4 & 0x8000) != 0) {
            int var25 = class532.field7836;
            int var26 = arg1.method2443(-97);
            int var27 = arg1.method2441(-25006);
            arg3.method540((byte) -103, var26, var25, var27);
        }
        if ((arg4 & 0x2) != 0) {
            int var28 = arg1.method2387((byte) 125);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg1.method2441(-25006);
            class388.method2356(var29, var28, (byte) 32, arg3);
        }
        if ((arg4 & 0x20000) != 0) {
            int var30 = arg1.method2447(4339);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = arg1.method2392(false);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var31[var34] = var35;
                var32[var34] = arg1.method2441(-25006);
                var33[var34] = arg1.method2387((byte) 125);
            }
            class509.method3037(arg3, var33, 127, var32, var31);
        }
        if ((arg4 & 0x2000) != 0) {
            arg3.field7803 = arg1.method2388((byte) -115) == 1;
        }
        if ((arg4 & 0x100) != 0) {
            arg3.field1215 = arg1.method2428(1797);
            arg3.field1209 = arg1.method2404((byte) -97);
            arg3.field1219 = arg1.method2428(1797);
            arg3.field1222 = arg1.method2428(1797);
            arg3.field1213 = arg1.method2386(-23648) + class532.field7836;
            arg3.field1163 = arg1.method2386(-23648) + class532.field7836;
            arg3.field1199 = arg1.method2414(true);
            if (arg3.field7799) {
                arg3.field1219 += arg3.field7815;
                arg3.field1222 += arg3.field7794;
                arg3.field1215 += arg3.field7815;
                arg3.field1209 += arg3.field7794;
                arg3.field1254 = 0;
            } else {
                arg3.field1222 += arg3.field1251[0];
                arg3.field1209 += arg3.field1251[0];
                arg3.field1215 += arg3.field1249[0];
                arg3.field1219 += arg3.field1249[0];
                arg3.field1254 = 1;
            }
            arg3.field1257 = 0;
        }
        if ((arg4 & 0x1000) != 0) {
            var5 = arg1.method2418(127);
        }
        if ((arg4 & 0x8) != 0) {
            int var36 = arg1.method2392(false);
            if (var36 == 65535) {
                var36 = -1;
            }
            arg3.field1156 = var36;
        }
        if ((arg4 & 0x40000) != 0) {
            int var37 = arg1.method2386(-23648);
            int var38 = arg1.method2406((byte) -116);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var39 = arg1.method2388((byte) -113);
            arg3.method538(var38, var37, var39, 108, true);
        }
        if (arg3.field7799) {
            if (var5 == 127) {
                arg3.method3152(arg3.field7815, 128, arg3.field7794);
            } else {
                byte var40;
                if (var5 == -1) {
                    var40 = class447.field6522[arg0];
                } else {
                    var40 = var5;
                }
                arg3.method3154(107, arg3.field7815, arg3.field7794, var40);
            }
        }
        int var41 = 12 % ((69 - arg2) / 54);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lqr;", line = 365)
    public final class48 method993(int arg0, int arg1) {
        field2187++;
        class509 var3 = this.field2181;
        class48 var4;
        synchronized (this.field2181) {
            var4 = (class48) this.field2181.method3032(3589, (long) arg0);
        }
        if (arg1 != -21143) {
            field2196 = 116;
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field2188;
        byte[] var6;
        synchronized (this.field2188) {
            var6 = this.field2188.method2130(36, arg0, -71);
        }
        class48 var7 = new class48();
        var7.field504 = arg0;
        var7.field510 = this;
        if (var6 != null) {
            var7.method275(false, new class396(var6));
        }
        var7.method272(true);
        class509 var8 = this.field2181;
        synchronized (this.field2181) {
            this.field2181.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V", line = 399)
    public final void method994(byte arg0, int arg1) {
        field2194++;
        int var3 = -8 % ((-arg0 - 39) / 43);
        class509 var4 = this.field2181;
        synchronized (this.field2181) {
            this.field2181.method3036(arg1, (byte) -99);
        }
        class509 var5 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method3036(arg1, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 417)
    public final void method995(boolean arg0) {
        field2180++;
        class509 var2 = this.field2181;
        synchronized (this.field2181) {
            this.field2181.method3034((byte) 117);
        }
        if (!arg0) {
            field2192 = null;
        }
        class509 var3 = this.field2198;
        synchronized (this.field2198) {
            this.field2198.method3034((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 437)
    public static void method996(int arg0) {
        field2192 = null;
        field2189 = null;
        field2193 = null;
        if (arg0 != -3) {
            field2191 = null;
        }
        field2191 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V", line = 452)
    public final void method997(int arg0, byte arg1, int arg2) {
        this.field2181 = new class509(arg2);
        field2183++;
        if (arg1 < 102) {
            this.method993(-98, -9);
        }
        this.field2198 = new class509(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ld;ILfo;Lfo;)V", line = 478)
    public class169(class104 arg0, int arg1, class361 arg2, class361 arg3) {
        this.field2197 = arg3;
        this.field2188 = arg2;
        this.field2188.method2136(-81, 36);
    }
}
