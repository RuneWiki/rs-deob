import java.awt.FontMetrics;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class162 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public static boolean field3338 = false;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lid;")
    public static class78 field3336 = new class78(4096);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lch;")
    public static class29 field3339 = new class29(64);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3341 = 1;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lgg;")
    public static class63 field3342 = class116.method911(43, "leuchten2:");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lff;")
    public static class54 field3332;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Ljc;")
    public static class85 field3343;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3340;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3335;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static final void method1102(int arg0) {
        class34.field810.method282((byte) -58);
        field3331++;
        int var1 = -51 / ((4 - arg0) / 32);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lab;[BI)V")
    public final void method1103(class3 arg0, byte[] arg1, int arg2) {
        field3334++;
        if (arg2 < 119) {
            return;
        }
        if (arg0.field48[arg0.field54] != 31 || arg0.field48[arg0.field54 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3335 == null) {
            this.field3335 = new Inflater(true);
        }
        try {
            this.field3335.setInput(arg0.field48, arg0.field54 + 10, arg0.field48.length - 8 - (arg0.field54 + 10));
            this.field3335.inflate(arg1);
        } catch (Exception var4) {
            this.field3335.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3335.reset();
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class162() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII[B)Z")
    public static final boolean method1104(boolean arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        field3333++;
        if (arg0) {
            return false;
        }
        class3 var5 = new class3(arg3);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method45(-6498);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var14;
                class37 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method45(-6498);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method64(31790);
                                    }
                                    int var10 = var5.method45(-6498);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = var12 + arg1;
                                    var14 = var5.method64(31790) >> 2;
                                    var15 = arg2 + var11;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class167.method1133(true, var6);
                } while (var14 == 22 && class198.field3964 && var16.field915 == 0 && var16.field877 != 1 && !var16.field898);
                if (!var16.method349(-128)) {
                    var4 = false;
                    class14.field321++;
                }
                var8 = true;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIIZBI)Z")
    public static final boolean method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class77.field1875[var12][var36] = 0;
                class191.field3881[var12][var36] = 99999999;
            }
        }
        class77.field1875[arg1][arg7] = 99;
        field3330++;
        class191.field3881[arg1][arg7] = 0;
        int var13 = arg1;
        int var14 = arg7;
        byte var15 = 0;
        class141.field3033[var15] = arg1;
        int var16 = 0;
        int var37 = var15 + 1;
        class81.field1947[var15] = arg7;
        boolean var17 = false;
        int var18 = class141.field3033.length;
        int[][] var19 = class157.field3267[class112.field2528].field1909;
        while (var37 != var16) {
            var13 = class141.field3033[var16];
            var14 = class81.field1947[var16];
            var16 = (var16 + 1) % var18;
            if (arg6 == var13 && arg8 == var14) {
                var17 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class157.field3267[class112.field2528].method713((byte) 2, arg11, arg0 - 1, var13, arg8, var14, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg0 < 10 && class157.field3267[class112.field2528].method710(arg11, var13, arg8, var14, arg0 - 1, arg6, -1578)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg3 != 0 && class157.field3267[class112.field2528].method717(arg6, var13, var14, arg3, arg4, arg8, arg2, (byte) -126)) {
                var17 = true;
                break;
            }
            int var35 = class191.field3881[var13][var14] + 1;
            if (var13 > 0 && class77.field1875[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class141.field3033[var37] = var13 - 1;
                class81.field1947[var37] = var14;
                var37 = (var37 + 1) % var18;
                class77.field1875[var13 - 1][var14] = 2;
                class191.field3881[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class77.field1875[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class141.field3033[var37] = var13 + 1;
                class81.field1947[var37] = var14;
                class77.field1875[var13 + 1][var14] = 8;
                class191.field3881[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && class77.field1875[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class141.field3033[var37] = var13;
                class81.field1947[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class77.field1875[var13][var14 - 1] = 1;
                class191.field3881[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class77.field1875[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class141.field3033[var37] = var13;
                class81.field1947[var37] = var14 + 1;
                class77.field1875[var13][var14 + 1] = 4;
                var37 = (var37 + 1) % var18;
                class191.field3881[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class77.field1875[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class141.field3033[var37] = var13 - 1;
                class81.field1947[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class77.field1875[var13 - 1][var14 - 1] = 3;
                class191.field3881[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class77.field1875[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class141.field3033[var37] = var13 + 1;
                class81.field1947[var37] = var14 - 1;
                class77.field1875[var13 + 1][var14 - 1] = 9;
                var37 = (var37 + 1) % var18;
                class191.field3881[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class77.field1875[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class141.field3033[var37] = var13 - 1;
                class81.field1947[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class77.field1875[var13 - 1][var14 + 1] = 6;
                class191.field3881[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class77.field1875[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class141.field3033[var37] = var13 + 1;
                class81.field1947[var37] = var14 + 1;
                class77.field1875[var13 + 1][var14 + 1] = 12;
                var37 = (var37 + 1) % var18;
                class191.field3881[var13 + 1][var14 + 1] = var35;
            }
        }
        class150.field3151 = 0;
        if (!var17) {
            if (!arg9) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= arg6 + var22; var23++) {
                for (int var24 = arg8 - var22; var24 <= arg8 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class191.field3881[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (arg4 + arg6 - 1 < var23) {
                            var25 = var23 + 1 - arg6 - arg4;
                        }
                        int var26 = 0;
                        if (var24 < arg8) {
                            var26 = arg8 - var24;
                        } else if (var24 > arg8 + arg3 - 1) {
                            var26 = var24 + 1 - arg8 - arg3;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class191.field3881[var23][var24]) {
                            var20 = var27;
                            var21 = class191.field3881[var23][var24];
                            var13 = var23;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg7 == var14) {
                return false;
            }
            class150.field3151 = 1;
        }
        byte var28 = 0;
        class141.field3033[var28] = var13;
        int var38 = var28 + 1;
        class81.field1947[var28] = var14;
        int var29;
        int var30 = var29 = class77.field1875[var13][var14];
        if (arg10 >= -6) {
            field3342 = null;
        }
        while (arg1 != var13 || arg7 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class141.field3033[var38] = var13;
                class81.field1947[var38++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class77.field1875[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class141.field3033[var38];
            int var33 = class81.field1947[var38];
            if (arg5 == 0) {
                class141.field3031.method854(48, true);
                class64.field1637++;
                class141.field3031.method66(2, var31 + var31 + 3);
            }
            if (arg5 == 1) {
                class84.field1987++;
                class141.field3031.method854(120, true);
                class141.field3031.method66(2, var31 + var31 + 17);
            }
            if (arg5 == 2) {
                class141.field3031.method854(46, true);
                class141.field3031.method66(2, var31 + var31 + 3);
                class112.field2523++;
            }
            class141.field3031.method68(class9.field189[82] ? 1 : 0, 82);
            class141.field3031.method24(class3.field110 + var32, 126);
            class141.field3031.method62(class38.field921 + var33, (byte) 112);
            class118.field2632 = class81.field1947[0];
            class106.field2418 = class141.field3033[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class141.field3031.method51(class141.field3033[var38] - var32, (byte) -99);
                class141.field3031.method51(class81.field1947[var38] - var33, (byte) -99);
            }
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        if (arg0 == -1) {
            field3337++;
            class170.field3500.method282((byte) -69);
            class49.field1192.method282((byte) -54);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static void method1107(int arg0) {
        field3343 = null;
        field3340 = null;
        field3339 = null;
        field3342 = null;
        field3336 = null;
        if (arg0 > -57) {
            field3338 = true;
        }
        field3332 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III)V")
    private class162(int arg0, int arg1, int arg2) {
    }
}
