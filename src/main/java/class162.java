import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class162 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field2405 = 5;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field2417 = -1;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
    public boolean field2411 = false;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field2402 = 2;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
    public boolean field2418 = false;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field2397 = -1;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2407 = -1;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
    public boolean field2421 = false;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field2424 = -1;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public int field2425 = 99;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Z")
    public boolean field2419 = false;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field2426 = -1;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Z")
    public static boolean field2408 = false;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2409 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lsd;")
    public static class27 field2400;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
    private int[] field2398;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[I")
    public int[] field2401;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[I")
    public int[] field2423;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[Z")
    public boolean[] field2415;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[[I")
    public int[][] field2420;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 6)
    public static final boolean method1159(int arg0, String arg1, String arg2) {
        field2399++;
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        }
        if (arg0 <= 43) {
            field2409 = -7;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILaj;BIII)Laj;", line = 43)
    public final class1 method1160(int arg0, class1 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2410++;
        int var7 = this.field2423[arg3];
        int var8 = this.field2401[arg3];
        class160 var9 = class41.method368(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (arg2 < 23) {
            this.method1167((byte) -116, 58, 90, 79, -98, (class1) null);
        }
        if (var9 == null) {
            return arg1.method15(true, true, true);
        }
        class160 var11 = null;
        if ((this.field2411 || class16.field188) && arg4 != -1 && this.field2401.length > arg4) {
            int var12 = this.field2401[arg4];
            var11 = class41.method368(0, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        int var13 = arg5 & 0x3;
        class1 var14;
        if (var11 == null) {
            var14 = arg1.method15(!var9.method1150(2, var10), !var9.method1149(var10, true), !this.field2419);
        } else {
            var14 = arg1.method15(!var9.method1150(2, var10) & !var11.method1150(2, arg4), !var9.method1149(var10, true) & !var11.method1149(arg4, true), !this.field2419);
        }
        if (class36.field534 && this.field2419) {
            if (var13 == 1) {
                ((class165) var14).method1194();
            } else if (var13 == 2) {
                ((class165) var14).method1193();
            } else if (var13 == 3) {
                ((class165) var14).method1210();
            }
        } else if (var13 == 1) {
            var14.method14();
        } else if (var13 == 2) {
            var14.method5();
        } else if (var13 == 3) {
            var14.method9();
        }
        var14.method13(var9, var10, var11, arg4, arg0 - 1, var7, this.field2419);
        if (class36.field534 && this.field2419) {
            if (var13 == 1) {
                ((class165) var14).method1210();
            } else if (var13 == 2) {
                ((class165) var14).method1193();
            } else if (var13 == 3) {
                ((class165) var14).method1194();
            }
        } else if (var13 == 1) {
            var14.method9();
        } else if (var13 == 2) {
            var14.method5();
        } else if (var13 == 3) {
            var14.method14();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILhb;)V", line = 145)
    private final void method1161(int arg0, int arg1, class35 arg2) {
        field2403++;
        if (arg0 == 1) {
            int var4 = arg2.method300(-1394191632);
            this.field2423 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2423[var5] = arg2.method300(-1394191632);
            }
            this.field2401 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2401[var6] = arg2.method300(arg1 - 1394257167);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2401[var7] = (arg2.method300(-1394191632) << 16) + this.field2401[var7];
            }
        } else if (arg0 == 2) {
            this.field2407 = arg2.method300(-1394191632);
        } else if (arg0 == 3) {
            this.field2415 = new boolean[256];
            int var8 = arg2.method273(arg1 ^ 0xFF);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2415[arg2.method273(65280)] = true;
            }
        } else if (arg0 == 4) {
            this.field2421 = true;
        } else if (arg0 == 5) {
            this.field2405 = arg2.method273(65280);
        } else if (arg0 == 6) {
            this.field2397 = arg2.method300(-1394191632);
        } else if (arg0 == 7) {
            this.field2417 = arg2.method300(-1394191632);
        } else if (arg0 == 8) {
            this.field2425 = arg2.method273(arg1 - 255);
        } else if (arg0 == 9) {
            this.field2426 = arg2.method273(65280);
        } else if (arg0 == 10) {
            this.field2424 = arg2.method273(arg1 ^ 0xFF);
        } else if (arg0 == 11) {
            this.field2402 = arg2.method273(65280);
        } else if (arg0 == 12) {
            int var10 = arg2.method273(arg1 - 255);
            this.field2398 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2398[var11] = arg2.method300(-1394191632);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2398[var12] = (arg2.method300(arg1 - 1394257167) << 16) + this.field2398[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method300(-1394191632);
            this.field2420 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method273(65280);
                if (var15 > 0) {
                    this.field2420[var14] = new int[var15];
                    this.field2420[var14][0] = arg2.method269(false);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field2420[var14][var16] = arg2.method300(-1394191632);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2419 = true;
        } else if (arg0 == 15) {
            this.field2411 = true;
        } else if (arg0 == 16) {
            this.field2418 = true;
        }
        if (arg1 != 65535) {
            this.method1162(-107, (class1) null, 59, (byte) -22, -101);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILaj;IBI)Laj;", line = 305)
    public final class1 method1162(int arg0, class1 arg1, int arg2, byte arg3, int arg4) {
        field2406++;
        int var6 = this.field2423[arg2];
        int var7 = this.field2401[arg2];
        class160 var8 = class41.method368(0, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method26(true, true, true);
        }
        if (arg3 <= 40) {
            this.field2418 = false;
        }
        class160 var10 = null;
        if ((this.field2411 || class16.field188) && arg4 != -1 && this.field2401.length > arg4) {
            int var11 = this.field2401[arg4];
            var10 = class41.method368(0, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class1 var12;
        if (var10 == null) {
            var12 = arg1.method26(!var8.method1150(2, var9), !var8.method1149(var9, true), !this.field2419);
        } else {
            var12 = arg1.method26(!var8.method1150(2, var9) & !var10.method1150(2, arg4), !var8.method1149(var9, true) & !var10.method1149(arg4, true), !this.field2419);
        }
        var12.method13(var8, var9, var10, arg4, arg0 - 1, var6, this.field2419);
        return var12;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILaj;IIB)Laj;", line = 357)
    public final class1 method1163(int arg0, class1 arg1, int arg2, int arg3, byte arg4) {
        field2414++;
        int var6 = this.field2423[arg2];
        if (arg4 <= 7) {
            this.field2424 = 103;
        }
        int var7 = this.field2401[arg2];
        class160 var8 = class41.method368(0, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method30(true, true, true);
        }
        class160 var10 = null;
        if ((this.field2411 || class16.field188) && arg0 != -1 && this.field2401.length > arg0) {
            int var11 = this.field2401[arg0];
            var10 = class41.method368(0, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class160 var12 = null;
        int var13 = 0;
        class160 var14 = null;
        int var15 = 0;
        if (this.field2398 != null) {
            if (this.field2398.length > arg2) {
                var13 = this.field2398[arg2];
                if (var13 != 65535) {
                    var12 = class41.method368(0, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field2411 || class16.field188) && arg0 != -1 && arg0 < this.field2398.length) {
                var15 = this.field2398[arg0];
                if (var15 != 65535) {
                    var14 = class41.method368(0, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1150(2, var9);
        boolean var17 = !var8.method1149(var9, true);
        if (var12 != null) {
            var16 &= !var12.method1150(2, var13);
            var17 &= !var12.method1149(var13, true);
        }
        if (var10 != null) {
            var16 &= !var10.method1150(2, arg0);
            var17 &= !var10.method1149(arg0, true);
        }
        if (var14 != null) {
            var16 &= !var14.method1150(2, var15);
            var17 &= !var14.method1149(var15, true);
        }
        class1 var18 = arg1.method30(var16, var17, !this.field2419);
        var18.method13(var8, var9, var10, arg0, arg3 - 1, var6, this.field2419);
        if (var12 != null) {
            var18.method13(var12, var13, var14, var15, arg3 - 1, var6, this.field2419);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lhb;B)V", line = 460)
    public final void method1164(class35 arg0, byte arg1) {
        field2416++;
        if (arg1 != 77) {
            return;
        }
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                return;
            }
            this.method1161(var3, 65535, arg0);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 486)
    public static void method1165(int arg0) {
        field2400 = null;
        if (arg0 > -118) {
            method1166(47, 16, false, 127, -54, 70, 112, 47);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZIIIII)V", line = 516)
    public static final void method1166(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2422++;
        int var8 = arg7;
        if (!arg2) {
            field2409 = -3;
        }
        int var9 = 0;
        int var10 = arg6 * arg6;
        int var11 = arg6 - arg5;
        int var12 = arg7 - arg5;
        int var13 = 0;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var10 << 1;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var10 + var18;
        int var24 = var14 - (var21 - 1) * var17;
        int var25 = (1 - var22) * var15 + var20;
        int var26 = var16 - ((var22 - 1) * var19);
        int var27 = var10 << 2;
        int var28 = var14 << 2;
        int var29 = var18 * 3;
        int var30 = (var21 - 3) * var17;
        int var31 = var20 * 3;
        int var32 = var15 << 2;
        int var33 = var16 << 2;
        int var34 = var28;
        int var35 = (arg7 - 1) * var27;
        int var36 = var33;
        int var37 = (var22 - 3) * var19;
        int var38 = (var12 - 1) * var32;
        int[] var39 = class320.field4990[arg4];
        class138.method1047(arg3, arg0 - var11, -arg6 + arg0, 7, var39);
        class138.method1047(arg1, arg0 + var11, -var11 + arg0, 7, var39);
        class138.method1047(arg3, arg0 + arg6, arg0 + var11, 7, var39);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var34;
                    var34 += var28;
                    var13++;
                    var23 += var29;
                    var29 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var34;
                var13++;
                var23 += var29;
                var34 += var28;
                var29 += var28;
            }
            var24 += -var30;
            var30 -= var27;
            int var40 = arg0 + var13;
            var23 += -var35;
            var35 -= var27;
            boolean var41 = var12 >= var8;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var9++;
                        var25 += var31;
                        var31 += var33;
                        var26 += var36;
                        var36 += var33;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var9++;
                    var36 += var33;
                    var25 += var31;
                    var31 += var33;
                }
                var26 += -var37;
                var25 += -var38;
                var38 -= var32;
                var37 -= var32;
            }
            int var42 = arg0 - var13;
            var8--;
            int var43 = arg4 + var8;
            int var44 = arg4 - var8;
            if (var41) {
                int var45 = arg0 + var9;
                int var46 = arg0 - var9;
                class138.method1047(arg3, var46, var42, 7, class320.field4990[var44]);
                class138.method1047(arg1, var45, var46, 7, class320.field4990[var44]);
                class138.method1047(arg3, var40, var45, 7, class320.field4990[var44]);
                class138.method1047(arg3, var46, var42, 7, class320.field4990[var43]);
                class138.method1047(arg1, var45, var46, 7, class320.field4990[var43]);
                class138.method1047(arg3, var40, var45, 7, class320.field4990[var43]);
            } else {
                class138.method1047(arg3, var40, var42, 7, class320.field4990[var44]);
                class138.method1047(arg3, var40, var42, 7, class320.field4990[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIIILaj;)Laj;", line = 689)
    public final class1 method1167(byte arg0, int arg1, int arg2, int arg3, int arg4, class1 arg5) {
        int var7 = this.field2423[arg2];
        field2404++;
        int var8 = this.field2401[arg2];
        int var9 = 10 / ((arg0 - 26) / 58);
        class160 var10 = class41.method368(0, var8 >> 16);
        int var11 = var8 & 0xFFFF;
        if (var10 == null) {
            return arg5.method30(true, true, true);
        }
        int var12 = arg3 & 0x3;
        class160 var13 = null;
        if ((this.field2411 || class16.field188) && arg1 != -1 && this.field2401.length > arg1) {
            int var14 = this.field2401[arg1];
            var13 = class41.method368(0, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        class1 var15;
        if (var13 == null) {
            var15 = arg5.method30(!var10.method1150(2, var11), !var10.method1149(var11, true), !this.field2419);
        } else {
            var15 = arg5.method30(!var10.method1150(2, var11) & !var13.method1150(2, arg1), !var10.method1149(var11, true) & !var13.method1149(arg1, true), !this.field2419);
        }
        if (this.field2419 && class36.field534) {
            if (var12 == 1) {
                ((class165) var15).method1194();
            } else if (var12 == 2) {
                ((class165) var15).method1193();
            } else if (var12 == 3) {
                ((class165) var15).method1210();
            }
        } else if (var12 == 1) {
            var15.method14();
        } else if (var12 == 2) {
            var15.method5();
        } else if (var12 == 3) {
            var15.method9();
        }
        var15.method13(var10, var11, var13, arg1, arg4 - 1, var7, this.field2419);
        if (this.field2419 && class36.field534) {
            if (var12 == 1) {
                ((class165) var15).method1210();
            } else if (var12 == 2) {
                ((class165) var15).method1193();
            } else if (var12 == 3) {
                ((class165) var15).method1194();
            }
        } else if (var12 == 1) {
            var15.method9();
        } else if (var12 == 2) {
            var15.method5();
        } else if (var12 == 3) {
            var15.method14();
        }
        return var15;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 796)
    public final void method1168(int arg0) {
        field2413++;
        if (this.field2426 == -1) {
            if (this.field2415 == null) {
                this.field2426 = 0;
            } else {
                this.field2426 = 2;
            }
        }
        if (this.field2424 == -1) {
            if (this.field2415 == null) {
                this.field2424 = 0;
            } else {
                this.field2424 = 2;
            }
        }
        if (arg0 <= 84) {
            this.field2398 = (int[]) null;
        }
    }
}
