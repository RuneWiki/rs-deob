import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class655 extends class241 {

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lbq;")
    public class289 field9337 = new class289();

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "Lsm;")
    public class282 field9348 = new class282();

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "Ldia;")
    private class233 field9344;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "Lsq;")
    public static class178 field9347 = new class178(9, 0, 4, 1);

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "Lmk;")
    public static class54 field9349 = new class54();

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "Lsc;")
    public static class347 field9350 = new class347();

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3714(int arg0, int arg1, int arg2) {
        field9346++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 != -5) {
            return false;
        }
        class316 var3 = class445.field6442.method3972((byte) 104, arg0);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1893(5410, arg2);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[IIIILsia;)V", line = 29)
    private final void method3715(int arg0, int[] arg1, int arg2, int arg3, int arg4, class732 arg5) {
        if (arg4 != 0) {
            method3718(93, -25, 56, 75);
        }
        field9335++;
        if ((this.field9344.field2752[arg5.field10253] & 0x4) != 0 && arg5.field10242 < 0) {
            int var7 = this.field9344.field2735[arg5.field10253] / class277.field3387;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field10260) / var7;
                if (var8 > arg2) {
                    arg5.field10260 += arg2 * var7;
                    break;
                }
                arg5.field10256.method659(arg1, arg3, var8);
                arg2 -= var8;
                arg3 += var8;
                arg5.field10260 += var7 * var8 - 1048576;
                int var9 = class277.field3387 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class95 var11 = arg5.field10256;
                if (this.field9344.field2764[arg5.field10253] == 0) {
                    arg5.field10256 = class95.method666(arg5.field10245, var11.method646(), var11.method663(), var11.method636());
                } else {
                    arg5.field10256 = class95.method666(arg5.field10245, var11.method646(), 0, var11.method636());
                    this.field9344.method1378(arg5.field10238.field9610[arg5.field10261] < 0, (byte) 91, arg5);
                    arg5.field10256.method644(var9, var11.method663());
                }
                if (arg5.field10238.field9610[arg5.field10261] < 0) {
                    arg5.field10256.method656(-1);
                }
                var11.method641(var9);
                var11.method659(arg1, arg3, arg0 - arg3);
                if (var11.method647()) {
                    this.field9348.method1689(var11);
                }
            }
        }
        arg5.field10256.method659(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V", line = 94)
    public final void method659(int[] arg0, int arg1, int arg2) {
        field9338++;
        this.field9348.method659(arg0, arg1, arg2);
        for (class732 var4 = (class732) this.field9337.method1719(65280); var4 != null; var4 = (class732) this.field9337.method1723(-20665)) {
            if (!this.field9344.method1371(var4, (byte) -76)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field10257 >= var6) {
                        this.method3715(var5 + var6, arg0, var6, var5, 0, var4);
                        var4.field10257 -= var6;
                        break;
                    }
                    this.method3715(var5 + var6, arg0, var4.field10257, var5, 0, var4);
                    var6 -= var4.field10257;
                    var5 += var4.field10257;
                } while (!this.field9344.method1355(-2564, arg0, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lsia;BI)V", line = 132)
    private final void method3716(class732 arg0, byte arg1, int arg2) {
        if (arg1 != -2) {
            return;
        }
        field9345++;
        if ((this.field9344.field2752[arg0.field10253] & 0x4) != 0 && arg0.field10242 < 0) {
            int var4 = this.field9344.field2735[arg0.field10253] / class277.field3387;
            int var5 = (var4 + 1048575 - arg0.field10260) / var4;
            arg0.field10260 = arg2 * var4 + arg0.field10260 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field9344.field2764[arg0.field10253] == 0) {
                    arg0.field10256 = class95.method666(arg0.field10245, arg0.field10256.method646(), arg0.field10256.method663(), arg0.field10256.method636());
                } else {
                    arg0.field10256 = class95.method666(arg0.field10245, arg0.field10256.method646(), 0, arg0.field10256.method636());
                    this.field9344.method1378(arg0.field10238.field9610[arg0.field10261] < 0, (byte) 114, arg0);
                }
                if (arg0.field10238.field9610[arg0.field10261] < 0) {
                    arg0.field10256.method656(-1);
                }
                arg2 = arg0.field10260 / var4;
            }
        }
        arg0.field10256.method649(arg2);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 173)
    public static void method3717(int arg0) {
        field9350 = null;
        field9349 = null;
        if (arg0 != 0) {
            method3718(-101, 121, 32, -115);
        }
        field9347 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V", line = 185)
    public static final void method3718(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        field9339++;
        if (class496.field7014 == 2) {
            class27.field281 = var5;
            class522.field7423 = var6;
            class152.field1670 = var4;
        }
        class308.field3835 = var5;
        if (arg0 != -12688) {
            method3718(46, 60, -32, 115);
        }
        class227.field2590 = var4;
        class472.method2850(arg0 ^ 0xFFFFC870);
        class217.field2521 = true;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "()V", line = 209)
    public static final void method3719() {
        if (class735.field10270 != null) {
            for (int var0 = 0; var0 < class735.field10270.length; var0++) {
                for (int var1 = 0; var1 < class284.field3473; var1++) {
                    for (int var2 = 0; var2 < class151.field1664; var2++) {
                        if (class735.field10270[var0][var1][var2] != null) {
                            class735.field10270[var0][var1][var2].method3896(103);
                        }
                        class735.field10270[var0][var1][var2] = null;
                    }
                }
            }
        }
        class735.field10270 = null;
        class11.field88 = null;
        if (class316.field3973 != null) {
            for (int var3 = 0; var3 < class316.field3973.length; var3++) {
                for (int var4 = 0; var4 < class284.field3473; var4++) {
                    for (int var5 = 0; var5 < class151.field1664; var5++) {
                        if (class316.field3973[var3][var4][var5] != null) {
                            class316.field3973[var3][var4][var5].method3896(103);
                        }
                        class316.field3973[var3][var4][var5] = null;
                    }
                }
            }
        }
        class316.field3973 = null;
        class159.field1758 = null;
        class638.field9170 = null;
        class504.field7120 = null;
        class233.field2770 = null;
        class511.field7298 = null;
        class255.field3122 = null;
        class391.field5395 = null;
        class486.field6968 = null;
        class210.method1247(-127);
        if (class139.field1560 != null) {
            for (int var6 = 0; var6 < class485.field6894; var6++) {
                class139.field1560[var6] = null;
            }
            class485.field6894 = 0;
        }
        class436.field6357 = null;
        class300.field3729 = null;
        class228.field2626 = null;
        if (class119.field1228 != null) {
            for (int var7 = 0; var7 < class119.field1228.length; var7++) {
                class119.field1228[var7] = null;
            }
            class479.field6842 = 0;
        }
        if (class461.field6573 != null) {
            for (int var8 = 0; var8 < class461.field6573.length; var8++) {
                class461.field6573[var8] = null;
            }
            class211.field2489 = 0;
        }
        if (class745.field10409 != null) {
            for (int var9 = 0; var9 < class275.field3367; var9++) {
                class745.field10409[var9] = null;
            }
            for (int var10 = 0; var10 < class723.field10134; var10++) {
                for (int var11 = 0; var11 < class284.field3473; var11++) {
                    for (int var12 = 0; var12 < class151.field1664; var12++) {
                        class210.field2482[var10][var11][var12] = 0L;
                    }
                }
            }
            class275.field3367 = 0;
        }
        class119.method772(0);
        class36.field387 = class36.field383;
        class36.field387.method3967((byte) -126);
        class703.field9910 = null;
        class248.field3011 = null;
        class648.field9262 = null;
        if (class472.field6766 != null) {
            class390.method2406();
            class563.field8026.method390(1);
            class563.field8026.method392(0);
        }
        if (class727.field10181 != null) {
            class727.field10181 = null;
        }
        class563.field8026 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()Leia;", line = 380)
    public final class241 method681() {
        field9336++;
        class732 var1;
        do {
            var1 = (class732) this.field9337.method1723(-20665);
            if (var1 == null) {
                return null;
            }
        } while (var1.field10256 == null);
        return var1.field10256;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "()I", line = 401)
    public final int method669() {
        field9340++;
        return 0;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "()Leia;", line = 409)
    public final class241 method678() {
        field9341++;
        class732 var1 = (class732) this.field9337.method1719(65280);
        if (var1 == null) {
            return null;
        } else if (var1.field10256 == null) {
            return this.method681();
        } else {
            return var1.field10256;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 427)
    public final void method649(int arg0) {
        field9342++;
        this.field9348.method649(arg0);
        for (class732 var2 = (class732) this.field9337.method1719(65280); var2 != null; var2 = (class732) this.field9337.method1723(-20665)) {
            if (!this.field9344.method1371(var2, (byte) -15)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field10257) {
                        this.method3716(var2, (byte) -2, var3);
                        var2.field10257 -= var3;
                        break;
                    }
                    this.method3716(var2, (byte) -2, var2.field10257);
                    var3 -= var2.field10257;
                } while (!this.field9344.method1355(-2564, null, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lig;IILgh;)V", line = 461)
    public static final void method3720(class244 arg0, int arg1, int arg2, class546 arg3) {
        field9343++;
        class36 var4 = new class36();
        var4.field386 = arg0.method1423(-34);
        var4.field385 = arg0.method1438(117);
        var4.field391 = new byte[var4.field386][][];
        var4.field395 = new class290[var4.field386];
        int var5 = 9 / ((27 - arg1) / 46);
        var4.field384 = new class290[var4.field386];
        var4.field390 = new int[var4.field386];
        var4.field388 = new int[var4.field386];
        var4.field389 = new int[var4.field386];
        for (int var6 = 0; var6 < var4.field386; var6++) {
            try {
                int var7 = arg0.method1423(-13);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = arg0.method1468(-1468860088);
                    String var9 = arg0.method1468(-1468860088);
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg0.method1438(98);
                    }
                    var4.field390[var6] = var7;
                    var4.field388[var6] = var10;
                    var4.field384[var6] = arg3.method3213(class239.method1411(var8, true), var9, (byte) -125);
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = arg0.method1468(-1468860088);
                    String var12 = arg0.method1468(-1468860088);
                    int var13 = arg0.method1423(-80);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = arg0.method1468(-1468860088);
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg0.method1438(100);
                            var16[var17] = new byte[var18];
                            arg0.method1461(824, 0, var16[var17], var18);
                        }
                    }
                    var4.field390[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class239.method1411(var14[var20], true);
                    }
                    var4.field395[var6] = arg3.method3198(class239.method1411(var11, true), var12, var19, (byte) -108);
                    var4.field391[var6] = var16;
                }
            } catch (ClassNotFoundException var21) {
                var4.field389[var6] = -1;
            } catch (SecurityException var22) {
                var4.field389[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field389[var6] = -3;
            } catch (Exception var24) {
                var4.field389[var6] = -4;
            } catch (Throwable var25) {
                var4.field389[var6] = -5;
            }
        }
        class559.field7984.method1721((byte) 116, var4);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ldia;)V", line = 648)
    public class655(class233 arg0) {
        this.field9344 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 580)
    public static final void method3721(int arg0, int arg1) {
        class182 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class278 var4 = class11.field88[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class151.field1664; var5++) {
                    for (int var6 = 0; var6 < class284.field3473; var6++) {
                        var2 = var4.method1678(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class748.field10430;
                            int var8 = var5 << class748.field10430;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class278 var10 = class11.field88[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1671(var5, var6, (byte) -116) - var10.method1671(var5, var6, (byte) 93);
                                    int var12 = var4.method1671(var5, var6 + 1, (byte) 84) - var10.method1671(var5, var6 + 1, (byte) -120);
                                    int var13 = var4.method1671(var5 + 1, var6 + 1, (byte) -121) - var10.method1671(var5 + 1, var6 + 1, (byte) 116);
                                    int var14 = var4.method1671(var5 + 1, var6, (byte) -100) - var10.method1671(var5 + 1, var6, (byte) -117);
                                    var10.method1677(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
