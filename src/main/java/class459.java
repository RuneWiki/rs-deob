import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class459 extends class180 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[I")
    public int[] field6463 = new int[1];

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "[I")
    public int[] field6464 = new int[] { -1 };

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lfn;")
    public static class52 field6462 = new class52(87, 4);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field6468 = 1;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lfn;")
    public static class52 field6469 = new class52(6, 8);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lfn;")
    public static class52 field6471 = new class52(100, 9);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;IIILdq;)Ldc;", line = 4)
    public static final class167 method2712(Component arg0, int arg1, int arg2, int arg3, class14 arg4) {
        field6470++;
        if (class245.field3463 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class167 var5 = (class167) Class.forName("lj").getDeclaredConstructor().newInstance();
                var5.field2476 = new int[arg1 * (class55.field899 ? 2 : 1)];
                var5.field2478 = arg2;
                var5.method600(arg0);
                var5.field2486 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field2486 > 16384) {
                    var5.field2486 = 16384;
                }
                var5.method598(var5.field2486);
                if (class319.field4367 > 0 && class439.field6022 == null) {
                    class439.field6022 = new class121();
                    class439.field6022.field1690 = arg4;
                    arg4.method115(class439.field6022, (byte) 76, class319.field4367);
                }
                if (class439.field6022 != null) {
                    if (class439.field6022.field1693[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class439.field6022.field1693[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class94 var6 = new class94(arg4, arg3);
                    var6.field2478 = arg2;
                    var6.field2476 = new int[(class55.field899 ? 2 : 1) * 256];
                    var6.method600(arg0);
                    var6.field2486 = 16384;
                    var6.method598(var6.field2486);
                    if (class319.field4367 > 0 && class439.field6022 == null) {
                        class439.field6022 = new class121();
                        class439.field6022.field1690 = arg4;
                        arg4.method115(class439.field6022, (byte) 76, class319.field4367);
                    }
                    if (class439.field6022 != null) {
                        if (class439.field6022.field1693[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class439.field6022.field1693[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class167();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILqg;Lkm;ZIILwh;IB)Lab;", line = 91)
    public final class232 method2713(int arg0, int arg1, class372 arg2, class487 arg3, boolean arg4, int arg5, int arg6, class15 arg7, int arg8, byte arg9) {
        field6466++;
        class232 var11 = null;
        int var12 = arg8;
        class318 var13 = null;
        if (arg6 != -1) {
            var13 = class363.field5161.method2806(arg6, -91);
        }
        int[] var14 = this.field6464;
        if (var13 != null && var13.field4353 != null) {
            var14 = new int[var13.field4353.length];
            for (int var15 = 0; var15 < var13.field4353.length; var15++) {
                int var16 = var13.field4353[var15];
                if (var16 >= 0 && var16 < this.field6464.length) {
                    var14[var15] = this.field6464[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        if (arg9 >= -23) {
            return null;
        }
        class13 var23 = null;
        class13 var24 = null;
        if (arg2 != null) {
            var12 = arg8 | 0x20;
            int var25 = arg2.field5278[arg5];
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class31.field505.method949(var26, 68);
            if (var23 != null) {
                var18 |= var23.method114(false, var20);
                var17 |= var23.method111(24279, var20);
                var19 |= arg2.field5262;
            }
            if ((arg2.field5261 || class399.field5582) && arg1 != -1 && arg1 < arg2.field5278.length) {
                var22 = arg2.field5283[arg5];
                int var27 = arg2.field5278[arg1];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class31.field505.method949(var21 >>> 16, 66);
                }
                if (var24 != null) {
                    var18 |= var24.method114(false, var21);
                    var17 |= var24.method111(24279, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2716(arg7 == null ? null : arg7.field243, -18052, var14, arg4, arg6);
        if (class70.field1032 != null) {
            var11 = (class232) class70.field1032.method659(var29, (byte) -1);
        }
        if (var11 == null || arg3.method1102(var11.method50(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method1067(var12, var11.method50());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class58.field918.method344(var14[var33], 31757).method999(30849, arg4)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class85[] var34 = new class85[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class58.field918.method344(var14[var35], 31757).method1009(arg4, -98);
                }
            }
            if (var13 != null && var13.field4356 != null) {
                for (int var36 = 0; var36 < var13.field4356.length; var36++) {
                    if (var13.field4356[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4356[var36][0];
                        int var38 = var13.field4356[var36][1];
                        int var39 = var13.field4356[var36][2];
                        int var40 = var13.field4356[var36][3];
                        int var41 = var13.field4356[var36][4];
                        int var42 = var13.field4356[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method585(var41, false, var40, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method591(var37, (byte) -53, var39, var38);
                        }
                    }
                }
            }
            class85 var43 = new class85(var34, var34.length);
            if (arg7 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg3.method1088(var43, var31, class136.field1930, 64, 850);
            if (arg7 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg7.field243[var44] < class444.field6137[var44].length) {
                        var11.method24(class282.field3879[var44], class444.field6137[var44][arg7.field243[var44]]);
                    }
                    if (class214.field3037[var44].length > arg7.field243[var44]) {
                        var11.method24(class132.field1856[var44], class214.field3037[var44][arg7.field243[var44]]);
                    }
                }
            }
            if (class70.field1032 != null) {
                var11.method56(var12);
                class70.field1032.method653(126, var29, var11);
            }
        }
        if (arg2 == null || var23 == null) {
            return var11;
        } else {
            class232 var45 = var11.method51((byte) 1, var12, true);
            var45.method1457(var23, var20, var21, arg2.field5262, var22, var24, arg0 - 1, (byte) -91, 0);
            return var45;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)Lwp;", line = 331)
    public static final class77 method2714(int arg0, Component arg1) {
        if (arg0 != 1197694608) {
            field6468 = -111;
        }
        field6467++;
        return new class353(arg1);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 350)
    public static void method2715(int arg0) {
        field6462 = null;
        field6471 = null;
        if (arg0 != 1197694608) {
            method2714(-113, (Component) null);
        }
        field6469 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([II[IZI)J", line = 362)
    private final long method2716(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        field6461++;
        long[] var6 = class160.field2303;
        long var7 = -1L;
        if (arg1 != -18052) {
            return -66L;
        }
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg2[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 407)
    public static final void method2717(String arg0, int arg1) {
        field6465++;
        if (class64.field973 == null) {
            return;
        }
        class396.field5564++;
        class131.method793(class389.field5483, 81);
        class366.field5214.method2470((byte) -74, class42.method349(arg0, arg1 + 1));
        class366.field5214.method2493((byte) 21, arg0);
        if (arg1 != 0) {
            method2712((Component) null, 116, 27, 12, (class14) null);
        }
    }
}
