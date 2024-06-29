import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class131 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2286 = 1;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public static int[] field2288 = new int[256];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lub;")
    public static class227 field2290 = class257.method1749("(U0a )2 in: ", 17263);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lrb;")
    public static class254 field2292;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public static int[] field2293;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lub;")
    public static class227 field2294;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    public static int[] field2295;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lvf;I)Lvf;")
    public abstract class248 method806(class248 arg0, int arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILub;Lta;)Lub;")
    public static final class227 method807(int arg0, class227 arg1, class105 arg2) {
        field2289++;
        if (arg0 >= -3) {
            method810(-89);
        }
        if (arg1.method1506(-1646, class187.field3189) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method1506(-1646, class193.field3278);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method1506(-1646, class186.field3157);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method1506(-1646, class77.field1347);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method1506(-1646, class219.field3690);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method1506(-1646, class179.field3068);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method1506(-1646, class103.field1809);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class227 var9 = class91.field1558;
                                                    if (class192.field3258 != null) {
                                                        var9 = class77.method458(class192.field3258.field1300, -53);
                                                        try {
                                                            if (class192.field3258.field1299 != null) {
                                                                byte[] var10 = ((String) class192.field3258.field1299).getBytes("ISO-8859-1");
                                                                var9 = class102.method623(0, -1, var10, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg1 = class76.method445((byte) -98, new class227[] { arg1.method1532((byte) 121, 0, var8), var9, arg1.method1517((byte) 122, var8 + 4) });
                                                }
                                            }
                                            arg1 = class76.method445((byte) -72, new class227[] { arg1.method1532((byte) 29, 0, var7), class211.method1345((byte) 117, class184.method1173(arg2, (byte) -120, 4)), arg1.method1517((byte) 104, var7 + 2) });
                                        }
                                    }
                                    arg1 = class76.method445((byte) -122, new class227[] { arg1.method1532((byte) 32, 0, var6), class211.method1345((byte) 115, class184.method1173(arg2, (byte) -127, 3)), arg1.method1517((byte) -5, var6 + 2) });
                                }
                            }
                            arg1 = class76.method445((byte) -107, new class227[] { arg1.method1532((byte) 42, 0, var5), class211.method1345((byte) 125, class184.method1173(arg2, (byte) -126, 2)), arg1.method1517((byte) 0, var5 + 2) });
                        }
                    }
                    arg1 = class76.method445((byte) -99, new class227[] { arg1.method1532((byte) 28, 0, var4), class211.method1345((byte) 118, class184.method1173(arg2, (byte) -118, 1)), arg1.method1517((byte) -26, var4 + 2) });
                }
            }
            arg1 = class76.method445((byte) -103, new class227[] { arg1.method1532((byte) 67, 0, var3), class211.method1345((byte) 114, class184.method1173(arg2, (byte) -119, 0)), arg1.method1517((byte) 100, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJILub;III)V")
    public static final void method808(int arg0, long arg1, int arg2, class227 arg3, int arg4, int arg5, int arg6) {
        class226 var8 = new class226(128);
        var8.method1443(10, 0);
        var8.method1451((int) ((double) arg6 * Math.random()), (byte) -122);
        var8.method1451(504, (byte) -111);
        var8.method1457(arg1, 32);
        field2291++;
        var8.method1427((int) (Math.random() * 9.9999999E7D), (byte) -8);
        var8.method1452(arg3, (byte) -63);
        var8.method1427((int) (Math.random() * 9.9999999E7D), (byte) 97);
        var8.method1451(class64.field1172, (byte) -125);
        var8.method1443(arg0, 0);
        var8.method1443(arg4, 0);
        var8.method1427((int) (Math.random() * 9.9999999E7D), (byte) -127);
        var8.method1451(arg5, (byte) -124);
        var8.method1451(arg2, (byte) -118);
        var8.method1427((int) (Math.random() * 9.9999999E7D), (byte) -117);
        var8.method1430(class165.field2767, class98.field1718, -101);
        class176.field2935.field3879 = 0;
        class176.field2935.method1443(169, 0);
        class176.field2935.method1443(var8.field3879, 0);
        class176.field2935.method1460(var8.field3879, 0, true, var8.field3901);
        class257.field4505 = -3;
        class100.field1755 = 0;
        class70.field1241 = 0;
        class145.field2508 = 1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2287++;
        for (class238 var5 = (class238) class97.field1701.method1277(97); var5 != null; var5 = (class238) class97.field1701.method1271(250)) {
            class60.method363(arg0, arg4, arg3 ^ 0xFFFFFF9C, var5, arg1, arg2);
        }
        for (class238 var6 = (class238) class185.field3140.method1277(arg3 + 118); var6 != null; var6 = (class238) class185.field3140.method1271(250)) {
            byte var10 = 1;
            if (var6.field4124.field82 == var6.field4124.field61) {
                var10 = 0;
            } else if (var6.field4124.field96 == var6.field4124.field82) {
                var10 = 2;
            }
            if (var6.field4142 != var10) {
                int var11 = class36.method191((byte) 115, var6.field4124);
                if (var6.field4139 != var11) {
                    if (var6.field4129 != null) {
                        class94.field1627.method479(var6.field4129);
                        var6.field4129 = null;
                    }
                    var6.field4139 = var11;
                }
                var6.field4142 = var10;
            }
            var6.field4123 = var6.field4124.field50 + (var6.field4124.field45 * 64);
            var6.field4128 = var6.field4124.field50;
            var6.field4127 = var6.field4124.field99;
            var6.field4138 = var6.field4124.field45 * 64 + var6.field4124.field99;
            class60.method363(arg0, arg4, -116, var6, arg1, arg2);
        }
        if (arg3 != 0) {
            return;
        }
        for (class238 var7 = (class238) class223.field3790.method1299((byte) -98); var7 != null; var7 = (class238) class223.field3790.method1295((byte) 31)) {
            byte var8 = 1;
            if (var7.field4135.field82 == var7.field4135.field61) {
                var8 = 0;
            } else if (var7.field4135.field96 == var7.field4135.field82) {
                var8 = 2;
            }
            if (var7.field4142 != var8) {
                int var9 = class63.method399(-99, var7.field4135);
                if (var7.field4139 != var9) {
                    if (var7.field4129 != null) {
                        class94.field1627.method479(var7.field4129);
                        var7.field4129 = null;
                    }
                    var7.field4139 = var9;
                }
                var7.field4142 = var8;
            }
            var7.field4127 = var7.field4135.field99;
            var7.field4128 = var7.field4135.field50;
            var7.field4138 = var7.field4135.field99 + (var7.field4135.field45 * 64);
            var7.field4123 = var7.field4135.field45 * 64 + var7.field4135.field50;
            class60.method363(arg0, arg4, arg3 ^ 0xFFFFFFA2, var7, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method810(int arg0) {
        if (arg0 < 124) {
            return;
        }
        field2288 = null;
        field2293 = null;
        field2295 = null;
        field2294 = null;
        field2292 = null;
        field2290 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public static final void method811(int arg0, int arg1, int arg2) {
        int var3 = -17 % ((arg0 + 21) / 40);
        class176.field2935.method664((byte) 90, 219);
        class156.field2679++;
        field2284++;
        class176.field2935.method1451(arg2, (byte) -113);
        class176.field2935.method1445(arg1, -718520472);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIZIII)V")
    public static final void method812(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2285++;
        if (class241.field4189 == arg4 && class148.field2581 == arg2 && class14.field269 == arg0 || class34.method178(true)) {
            return;
        }
        class148.field2581 = arg2;
        class14.field269 = arg0;
        class241.field4189 = arg4;
        if (class34.method178(true)) {
            class14.field269 = 0;
        }
        if (arg1) {
            class12.method60(28, -93);
        } else {
            class12.method60(25, 125);
        }
        class215.method1367(true, class245.field4271, (byte) -119);
        int var7 = class192.field3267;
        int var8 = class78.field1367;
        class192.field3267 = (arg4 - 6) * 8;
        int var9 = class192.field3267 - var7;
        int var10 = class192.field3267;
        class78.field1367 = (arg2 - 6) * 8;
        int var11 = class78.field1367 - var8;
        int var12 = class78.field1367;
        if (arg1) {
            class71.field1254 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class195 var32 = class220.field3715[var16];
                if (var32 != null) {
                    var32.field50 -= var9 * 128;
                    var32.field99 -= var11 * 128;
                    if (var32.field50 >= 0 && var32.field50 <= 13184 && var32.field99 >= 0 && var32.field99 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field78[var33] -= var9;
                            var32.field49[var33] -= var11;
                        }
                        class146.field2517[class71.field1254++] = var16;
                    } else {
                        class220.field3715[var16].field3315 = null;
                        class220.field3715[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class195 var14 = class220.field3715[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field78[var15] -= var9;
                        var14.field49[var15] -= var11;
                    }
                    var14.field50 -= var9 * 128;
                    var14.field99 -= var11 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class225 var30 = class27.field446[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field78[var31] -= var9;
                    var30.field49[var31] -= var11;
                }
                var30.field50 -= var9 * 128;
                var30.field99 -= var11 * 128;
            }
        }
        class64.field1171 = arg0;
        byte var18 = 0;
        class216.field3639.method18(arg5, arg6, arg3, 102);
        byte var19 = 104;
        byte var20 = 1;
        if (var9 < 0) {
            var20 = -1;
            var18 = 103;
            var19 = -1;
        }
        byte var21 = 104;
        byte var22 = 0;
        byte var23 = 1;
        if (var11 < 0) {
            var23 = -1;
            var21 = -1;
            var22 = 103;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var22; var26 != var21; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var11 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class80.field1389[var29][var24][var26] = class80.field1389[var29][var27][var28];
                    } else {
                        class80.field1389[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class49 var25 = (class49) class190.field3214.method1277(93); var25 != null; var25 = (class49) class190.field3214.method1271(250)) {
            var25.field856 -= var9;
            var25.field866 -= var11;
            if (var25.field856 < 0 || var25.field866 < 0 || var25.field856 >= 104 || var25.field866 >= 104) {
                var25.method369(125);
            }
        }
        class60.field1102 = -1;
        class144.field2478 = 0;
        if (class67.field1213 != 0) {
            class67.field1213 -= var9;
            class117.field2145 -= var11;
        }
        if (arg1) {
            class134.field2342 -= var9;
            class199.field3416 -= var11;
            class176.field2939 -= var11;
            class208.field3531 -= var9;
        } else {
            client.field1447 = 1;
        }
        class235.field4074.method1274((byte) 109);
        class41.field673.method1274((byte) 109);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2288[var0] = var1;
        }
        field2292 = new class254(50);
        field2293 = new int[2048];
        field2294 = class257.method1749("<col=00ff80>", 17263);
    }
}
