import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class217 extends class108 {

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
    public int[] field3277 = new int[1];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public int[] field3280 = new int[] { -1 };

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lbv;")
    public static class567 field3281;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[I")
    public static int[] field3283;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lpp;")
    public static class464 field3282;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3284;

    static {
        new class567("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field3281 = new class567(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
        field3283 = new int[] { -1, -1, 1, 1 };
        field3282 = new class464(28, 3);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1463(int arg0, int arg1) {
        return class470.field6764 == null ? 0 : class470.field6764[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBILbj;Lqa;IZLqn;I)Lr;", line = 8)
    public final class519 method1464(int arg0, int arg1, byte arg2, int arg3, class439 arg4, class167 arg5, int arg6, boolean arg7, class525 arg8, int arg9) {
        field3279++;
        class519 var11 = null;
        int var12 = arg6;
        if (arg2 != -103) {
            return null;
        }
        class298 var13 = null;
        if (arg9 != -1) {
            var13 = class469.field6760.method1193(91, arg9);
        }
        int[] var14 = this.field3280;
        if (var13 != null && var13.field4311 != null) {
            var14 = new int[var13.field4311.length];
            for (int var15 = 0; var15 < var13.field4311.length; var15++) {
                int var16 = var13.field4311[var15];
                if (var16 >= 0 && this.field3280.length > var16) {
                    var14[var15] = this.field3280[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class285 var24 = null;
        class285 var25 = null;
        if (arg4 != null) {
            int var26 = arg4.field6416[arg0];
            var12 = arg6 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class49.field739.method2298(arg2 ^ 0x58, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method1810(var21, (byte) -52);
                var17 |= var24.method1814(var21, 16384);
                var20 |= var24.method1811(true, var21);
                var19 |= arg4.field6415;
            }
            if ((arg4.field6395 || class429.field6257) && arg1 != -1 && arg1 < arg4.field6416.length) {
                int var28 = arg4.field6416[arg1];
                var23 = arg4.field6413[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class49.field739.method2298(-71, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method1810(var22, (byte) -93);
                    var17 |= var25.method1814(var22, 16384);
                    var20 |= var25.method1811(true, var22);
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
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1465(arg9, arg7, var14, arg8 == null ? null : arg8.field7289, 110);
        if (class161.field2395 != null) {
            var11 = (class519) class161.field2395.method2407(false, var30);
        }
        if (var11 == null || arg5.method560(var11.method1373(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method649(var12, var11.method1373());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class611.field8684.method1621((byte) -120, var14[var34]).method2318(arg7, -16797)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class560[] var35 = new class560[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class611.field8684.method1621((byte) -82, var14[var36]).method2313(arg7, (byte) -66);
                }
            }
            if (var13 != null && var13.field4280 != null) {
                for (int var37 = 0; var37 < var13.field4280.length; var37++) {
                    if (var13.field4280[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4280[var37][0];
                        int var39 = var13.field4280[var37][1];
                        int var40 = var13.field4280[var37][2];
                        int var41 = var13.field4280[var37][3];
                        int var42 = var13.field4280[var37][4];
                        int var43 = var13.field4280[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3156(var41, 97, var42, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3151(0, var38, var39, var40);
                        }
                    }
                }
            }
            if (arg8 != null) {
                var32 = var12 | 0x4000;
            }
            class560 var44 = new class560(var35, var35.length);
            var11 = arg5.method400(var44, var32, class225.field3361, 64, 850);
            if (arg8 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg8.field7289[var45] < class273.field3991[var45].length) {
                        var11.method1387(class242.field3517[var45], class273.field3991[var45][arg8.field7289[var45]]);
                    }
                    if (arg8.field7289[var45] < class265.field3873[var45].length) {
                        var11.method1387(class201.field2840[var45], class265.field3873[var45][arg8.field7289[var45]]);
                    }
                }
            }
            if (class161.field2395 != null) {
                var11.method1405(var12);
                class161.field2395.method2408(var11, var30, -114);
            }
        }
        if (arg4 == null || var24 == null) {
            return var11;
        } else {
            class519 var46 = var11.method765((byte) 1, var12, true);
            var46.method2934(0, var22, var25, var21, arg3 - 1, var24, arg4.field6415, var23, (byte) 122);
            return var46;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ[I[II)J", line = 250)
    private final long method1465(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        field3278++;
        int var6 = -39 % ((61 - arg4) / 32);
        long[] var7 = class442.field6466;
        long var8 = -1L;
        long var10 = var7[(int) ((var8 ^ (long) (arg0 >> 8)) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var7[(int) (((long) arg0 ^ var10) & 0xFFL)] ^ var10 >>> 8;
        for (int var14 = 0; var14 < arg2.length; var14++) {
            long var18 = var12 >>> 8 ^ var7[(int) (((long) (arg2[var14] >> 24) ^ var12) & 0xFFL)];
            long var20 = var7[(int) ((var18 ^ (long) (arg2[var14] >> 16)) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var20 >>> 8 ^ var7[(int) (((long) (arg2[var14] >> 8) ^ var20) & 0xFFL)];
            var12 = var7[(int) (((long) arg2[var14] ^ var22) & 0xFFL)] ^ var22 >>> 8;
        }
        if (arg3 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var7[(int) ((var12 ^ (long) arg3[var15]) & 0xFFL)] ^ var12 >>> 8;
            }
        }
        return var7[(int) ((var12 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ var12 >>> 8;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 292)
    public static void method1466(int arg0) {
        field3282 = null;
        field3283 = null;
        if (arg0 != -4092) {
            field3276 = -16;
        }
        field3281 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V", line = 309)
    public static final void method1467(int arg0, int arg1) {
        field3275++;
        if (arg1 != -1) {
            return;
        }
        class395 var2 = class461.field6670;
        synchronized (class461.field6670) {
            class461.field6670.method2397(arg0, (byte) -91);
        }
        class395 var3 = class496.field6946;
        synchronized (class496.field6946) {
            class496.field6946.method2397(arg0, (byte) -70);
        }
    }
}
