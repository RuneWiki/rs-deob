import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class456 extends class35 {

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
    public boolean field6486;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "[Lpa;")
    public class456[] field6483;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field6476 = 0;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
    public static int[] field6470 = new int[5];

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field6477 = 104;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field6474 = new String[100];

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lto;")
    public class161 field6468;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Let;")
    public class432 field6466;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "[I")
    public static int[] field6482;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLre;)V")
    public void method210(int arg0, byte arg1, class446 arg2) {
        field6480++;
        if (arg1 != 55) {
            this.method2137(-61);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
    public int method623(int arg0) {
        field6485++;
        if (arg0 != 0) {
            field6474 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[[I")
    public int[][] method212(int arg0, int arg1) {
        field6479++;
        if (arg0 != 0) {
            this.method625((byte) 78, 84, -60);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public void method653(boolean arg0) {
        field6467++;
        if (!arg0) {
            this.method2137(-77);
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public static void method2705(int arg0) {
        field6482 = null;
        field6474 = null;
        field6470 = null;
        if (arg0 != 2) {
            field6476 = -55;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method2706(byte arg0) {
        field6475++;
        if (arg0 != 114) {
            field6470 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class103.field1442[var1] = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
    public int[] method33(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field6486 = true;
        }
        field6473++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V")
    public void method625(byte arg0, int arg1, int arg2) {
        field6484++;
        int var4 = this.field6481 == 255 ? arg2 : this.field6481;
        if (arg0 > -86) {
            this.field6481 = -53;
        }
        if (this.field6486) {
            this.field6466 = new class432(var4, arg2, arg1);
        } else {
            this.field6468 = new class161(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)[I")
    public final int[] method2707(int arg0, int arg1, int arg2) {
        field6471++;
        if (arg1 != -31797) {
            field6477 = 42;
        }
        return this.field6483[arg2].field6486 ? this.field6483[arg2].method33(arg1 + 31796, arg0) : this.field6483[arg2].method212(0, arg0)[0];
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
    public int method2137(int arg0) {
        field6478++;
        if (arg0 != 1) {
            field6474 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILtq;ILlk;Lgu;I)Z")
    public static final boolean method2708(int arg0, class63 arg1, int arg2, class290 arg3, class94 arg4, int arg5) {
        field6472++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field1316 != null) {
            var7 = (arg3.field4404 + arg4.field1323 - class189.field2898) * (class189.field2915 - class189.field2910) / (class189.field2908 - class189.field2898) + class189.field2910;
            var6 = class189.field2910 + ((arg4.field1326 + arg3.field4404 - class189.field2898) * (class189.field2915 - class189.field2910) / (class189.field2908 - class189.field2898));
            var9 = class189.field2904 - ((arg3.field4408 + arg4.field1309 - class189.field2900) * (class189.field2904 - class189.field2909) / (class189.field2911 - class189.field2900));
            var8 = class189.field2904 - ((arg4.field1334 + arg3.field4408 - class189.field2900) * (class189.field2904 - class189.field2909) / (class189.field2911 - class189.field2900));
        }
        class319 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field1293 != -1) {
            if (arg3.field4403 && arg4.field1319 != -1) {
                var10 = arg4.method726(true, arg1, (byte) -114);
            } else {
                var10 = arg4.method726(false, arg1, (byte) -114);
            }
            if (var10 != null) {
                var11 = arg3.field4402 - (var10.method791() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg3.field4402 + (var10.method791() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field4400 - (var10.method789() + 1 >> 1);
                var14 = arg3.field4400 + (var10.method789() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class239 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (arg0 != -1237) {
            method2708(24, (class63) null, -113, (class290) null, (class94) null, -46);
        }
        int var21 = 0;
        int var22 = 0;
        if (arg4.field1333 != null) {
            var15 = class13.method128(arg4.field1291, (byte) 110);
            if (var15 != null) {
                var16 = class29.field401.method4(arg4.field1333, 1, (class319[]) null, class247.field3590, (int[]) null);
                int var23 = arg3.field4400;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1548() / 2;
                } else {
                    var17 = var23 - ((var10.method789() >> 1) + var16 * var15.method1549());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class247.field3590[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1551(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field4402 + arg5 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + (arg3.field4402 + arg5);
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = var17 + arg2;
                var22 = var16 * var15.method1549() + arg2 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class189.field2910 || var6 > class189.field2915 || var9 < class189.field2909 || class189.field2904 < var8) {
            return true;
        }
        if (arg4.field1316 != null) {
            int[] var27 = new int[arg4.field1316.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg4.field1316[var28 * 2] + arg3.field4404;
                int var31 = arg4.field1316[var28 * 2 + 1] + arg3.field4408;
                var27[var28 * 2] = (var30 - class189.field2898) * (class189.field2915 - class189.field2910) / (class189.field2908 - class189.field2898) + class189.field2910;
                var27[var28 * 2 + 1] = class189.field2904 - ((class189.field2904 - class189.field2909) * (var31 - class189.field2900) / (class189.field2911 - class189.field2900));
            }
            class405.method2430(arg1, var27, arg4.field1298);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg1.method545(1, var27[var29 * 2 + 2 + 1], arg4.field1290, var27[var29 * 2], var27[var29 * 2 + 1], var27[(var29 + 1) * 2]);
            }
            arg1.method545(1, var27[1], arg4.field1290, var27[var27.length - 2], var27[var27.length - 1], var27[0]);
        }
        if (var10 != null) {
            if (class132.field1843 > 0 && (class346.field5287 != -1 && class346.field5287 == arg3.field4401 || class47.field685 != -1 && class47.field685 == arg4.field1322)) {
                int var32;
                if (class163.field2270 > 50) {
                    var32 = (100 - class163.field2270) * 2;
                } else {
                    var32 = class163.field2270 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method558(var10.method798() / 2 + 7, arg0 ^ 0xFFFFFB2A, arg3.field4402, var33, arg3.field4400);
                arg1.method558(var10.method798() / 2 + 5, 1, arg3.field4402, var33, arg3.field4400);
                arg1.method558(var10.method798() / 2 + 3, 1, arg3.field4402, var33, arg3.field4400);
                arg1.method558(var10.method798() / 2 + 1, arg0 ^ 0xFFFFFB2A, arg3.field4402, var33, arg3.field4400);
                arg1.method558(var10.method798() / 2, 1, arg3.field4402, var33, arg3.field4400);
            }
            var10.method1958(arg3.field4402 - (var10.method791() >> 1), arg3.field4400 + -(var10.method789() >> 1));
        }
        if (arg4.field1333 != null && var15 != null) {
            class96.method749(var15, var16, var18, arg3, arg1, var17, (byte) 112, arg4);
        }
        if (arg4.field1293 != -1 || arg4.field1333 != null) {
            class154 var34 = new class154(arg3);
            var34.field2146 = var11;
            var34.field2148 = var20;
            var34.field2152 = var22;
            var34.field2150 = var13;
            var34.field2149 = var14;
            var34.field2147 = var12;
            var34.field2143 = var19;
            var34.field2145 = var21;
            class314.field4720.method2453((byte) -83, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public void method626(int arg0) {
        if (this.field6486) {
            this.field6466.method2527(true);
            this.field6466 = null;
        } else {
            this.field6468.method1093(-17395);
            this.field6468 = null;
        }
        field6465++;
        if (arg0 != -5) {
            this.method212(-45, -48);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method2709(boolean arg0, int arg1, int arg2) {
        field6469++;
        if (arg0) {
            field6482 = null;
        }
        if (this.field6483[arg2].field6486) {
            int[] var4 = this.field6483[arg2].method33(-1, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field6483[arg2].method212(0, arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IZ)V")
    public class456(int arg0, boolean arg1) {
        this.field6486 = arg1;
        this.field6483 = new class456[arg0];
    }
}
