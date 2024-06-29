import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class223 {

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2942 = "wave2:";

    @OriginalMember(owner = "client!er", name = "a", descriptor = "[C")
    public static char[] field2940 = new char[128];

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
    public static int[] field2948;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1294(int arg0, int arg1) {
        if (arg0 != 6738) {
            method1294(11, -97);
        }
        field2945++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF72D9) >> 16) + "." + ((arg1 & 0xFF86) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static final void method1295(int arg0) {
        class8.field145.method391(78);
        if (arg0 < 32) {
            method1295(-97);
        }
        field2946++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLnj;)Ldn;")
    public static final class321 method1296(byte arg0, class228 arg1) {
        field2947++;
        if (arg0 < 87) {
            field2940 = null;
        }
        return new class321(arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1319((byte) -13), arg1.method1333((byte) -107), arg1.method1348(-114));
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/lang/Object;I[JBI)V")
    public static final void method1297(Object[] arg0, int arg1, long[] arg2, byte arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var9;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg2[var10] < var7 + ((long) (var10 & 0x1))) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var9;
            method1297(arg0, arg1, arg2, (byte) 93, var6 - 1);
            method1297(arg0, var6 + 1, arg2, (byte) 124, arg4);
        }
        if (arg3 <= 77) {
            method1297((Object[]) null, 38, (long[]) null, (byte) 29, -79);
        }
        field2941++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[Lba;[BIIILii;IZ)[I")
    public static final int[] method1298(int arg0, int arg1, class270[] arg2, byte[] arg3, int arg4, int arg5, int arg6, class405 arg7, int arg8, boolean arg9) {
        field2943++;
        if (!arg9) {
            for (int var10 = 0; var10 < 4; var10++) {
                class270 var11 = arg2[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg4 + var12;
                        int var15 = arg6 + var13;
                        if (var14 >= 0 && var14 < class192.field2574 && var15 >= 0 && class364.field5262 > var15) {
                            var11.method1843(var15, var14, (byte) 127);
                        }
                    }
                }
            }
        }
        class228 var16 = new class228(arg3);
        int var17 = arg4 + arg8;
        int var18 = arg5 + arg6;
        if (arg0 != -1553671577) {
            return null;
        }
        for (int var19 = 0; var19 < arg1; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class379.method2458(0, false, arg4 + var55, arg6 + var56, 0, 103, var17 + var55, 0, var18 + var56, var19, arg9, var16);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3040.length > var16.field3029) {
            int var22 = var16.method1348(-97);
            if (var22 == 128) {
                class415.field6093[0] = var16.method1343(255);
                class415.field6093[1] = var16.method1319((byte) -13);
                class415.field6093[2] = var16.method1319((byte) -13);
                class415.field6093[3] = var16.method1319((byte) -13);
                var20 = true;
                class415.field6093[4] = var16.method1343(arg0 + 1553671832);
            } else {
                if (var22 != 129) {
                    var16.field3029--;
                    break;
                }
                if (class377.field5490 == null) {
                    class377.field5490 = new byte[4][][];
                }
                var21 = true;
                for (int var23 = 0; var23 < 4; var23++) {
                    byte var24 = var16.method1349(arg0 + 1553671580);
                    if (var24 == 0 && class377.field5490[var23] != null) {
                        int var25 = arg4;
                        int var26 = arg4 + 64;
                        int var27 = arg6;
                        if (arg4 < 0) {
                            var25 = 0;
                        } else if (class192.field2574 <= arg4) {
                            var25 = class192.field2574;
                        }
                        int var28 = arg6 + 64;
                        if (arg6 < 0) {
                            var27 = 0;
                        } else if (arg6 >= class364.field5262) {
                            var27 = class364.field5262;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (class192.field2574 <= var26) {
                            var26 = class192.field2574;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (class364.field5262 <= var28) {
                            var28 = class364.field5262;
                        }
                        while (var25 < var26) {
                            while (var27 < var28) {
                                class377.field5490[var23][var25][var27] = 0;
                                var27++;
                            }
                            var25++;
                        }
                    } else if (var24 == 1) {
                        if (class377.field5490[var23] == null) {
                            class377.field5490[var23] = new byte[class192.field2574 + 1][class364.field5262 + 1];
                        }
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var16.method1349(3);
                                for (int var32 = arg4 + var29; var32 < var29 - (-arg4 - 4); var32++) {
                                    for (int var33 = arg6 + var30; var33 < (var30 + arg6 + 4); var33++) {
                                        if (var32 >= 0 && var32 < class192.field2574 && var33 >= 0 && class364.field5262 > var33) {
                                            class377.field5490[var23][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var24 == 2) {
                        if (class377.field5490[var23] == null) {
                            class377.field5490[var23] = new byte[class192.field2574 + 1][class364.field5262 + 1];
                        }
                        if (var23 > 0) {
                            int var34 = arg4;
                            int var35 = arg4 + 64;
                            int var36 = arg6;
                            int var37 = arg6 + 64;
                            if (arg4 < 0) {
                                var34 = 0;
                            } else if (class192.field2574 <= arg4) {
                                var34 = class192.field2574;
                            }
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (class192.field2574 <= var35) {
                                var35 = class192.field2574;
                            }
                            if (arg6 < 0) {
                                var36 = 0;
                            } else if (class364.field5262 <= arg6) {
                                var36 = class364.field5262;
                            }
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (class364.field5262 <= var37) {
                                var37 = class364.field5262;
                            }
                            while (var34 < var35) {
                                while (var37 > var36) {
                                    class377.field5490[var23][var34][var36] = class377.field5490[var23 - 1][var34][var36];
                                    var36++;
                                }
                                var34++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg9) {
            class438 var38 = null;
            while (true) {
                while (var16.field3029 < var16.field3040.length) {
                    int var43 = var16.method1348(arg0 + 1553671481);
                    if (var43 == 0) {
                        var38 = new class438(var16);
                    } else if (var43 == 1) {
                        int var44 = var16.method1348(-91);
                        if (var44 > 0) {
                            for (int var45 = 0; var45 < var44; var45++) {
                                class227 var46 = new class227(var16);
                                if (var46.field2989 == 31) {
                                    class395 var47 = client.method1533(var16.method1343(255), 4);
                                    var46.method1315(var47.field5835, var47.field5827, var47.field5825, (byte) 17, var47.field5828);
                                }
                                var46.field5310 += arg6 << 7;
                                var46.field5308 += arg4 << 7;
                                int var48 = var46.field5308 >> 7;
                                int var49 = var46.field5310 >> 7;
                                if (var48 >= 0 && var49 >= 0 && var48 < class192.field2574 && class364.field5262 > var49) {
                                    var46.field5307 = class331.field4817[var46.field2987][var48][var49] - var46.field5307;
                                    if (arg7.method1709() > 0) {
                                        class124.method794(var46);
                                    }
                                }
                            }
                        }
                    } else if (var43 == 2) {
                        if (var38 == null) {
                            var38 = new class438();
                        }
                        var38.method2758(var16, -120);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var38 != null) {
                    for (int var39 = 0; var39 < 8; var39++) {
                        for (int var40 = 0; var40 < 8; var40++) {
                            int var41 = (arg4 >> 3) + var39;
                            int var42 = (arg6 >> 3) + var40;
                            if (var41 >= 0 && class192.field2574 >> 3 > var41 && var42 >= 0 && (class364.field5262 >> 3) > var42) {
                                class355.method2332(var42, var38, var41, false);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class377.field5490 != null) {
            for (int var50 = 0; var50 < 4; var50++) {
                if (class377.field5490[var50] != null) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        for (int var52 = 0; var52 < 16; var52++) {
                            int var53 = (arg4 >> 2) + var51;
                            int var54 = (arg6 >> 2) + var52;
                            if (var53 >= 0 && var53 < 26 && var54 >= 0 && var54 < 26) {
                                class377.field5490[var50][var53][var54] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class415.field6093;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static void method1299(int arg0) {
        if (arg0 != -1) {
            method1296((byte) -35, (class228) null);
        }
        field2948 = null;
        field2940 = null;
        field2942 = null;
    }
}
