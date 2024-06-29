import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class107 extends class69 {

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[I")
    private int[] field1858;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[Loc;")
    public class129[] field1865;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[S")
    public short[] field1866;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[B")
    public byte[] field1860;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[B")
    public byte[] field1868;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[B")
    public byte[] field1854;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[Lwc;")
    public class91[] field1864;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1857 = "Created gameworld";

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Z")
    public static boolean field1867;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method783(int arg0) {
        if (arg0 >= 121) {
            field1857 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjl;I[B)Z")
    public final boolean method784(int[] arg0, class238 arg1, int arg2, byte[] arg3) {
        if (arg2 <= 73) {
            this.field1866 = null;
        }
        boolean var5 = true;
        field1861++;
        int var6 = 0;
        class91 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1858[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1573(var9 >> 2, arg0, 86);
                        } else {
                            var7 = arg1.method1568(1024, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1864[var8] = var7;
                        this.field1858[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljj;I)V")
    public static final void method785(class134 arg0, int arg1) {
        class6.field72 = arg0;
        field1859++;
        if (arg1 != 0) {
            method785((class134) null, 11);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILhi;ILcb;)V")
    public static final void method786(int arg0, class264 arg1, int arg2, class255 arg3) {
        field1855++;
        class57 var4 = new class57();
        var4.field805 = arg1.method1779(-53);
        var4.field801 = arg1.method1765((byte) 96);
        var4.field798 = new int[var4.field805];
        var4.field792 = new int[var4.field805];
        var4.field790 = new class137[var4.field805];
        if (arg2 < 106) {
            field1857 = null;
        }
        var4.field793 = new class137[var4.field805];
        var4.field800 = new int[var4.field805];
        var4.field803 = new byte[var4.field805][][];
        for (int var5 = 0; var5 < var4.field805; var5++) {
            try {
                int var6 = arg1.method1779(-107);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method1750((byte) 119);
                    String var18 = arg1.method1750((byte) 127);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method1765((byte) 102);
                    }
                    var4.field798[var5] = var6;
                    var4.field800[var5] = var19;
                    var4.field793[var5] = arg3.method1675(class80.method595((byte) 96, var17), 2504, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method1750((byte) 88);
                    String var8 = arg1.method1750((byte) 106);
                    int var9 = arg1.method1779(-119);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method1750((byte) 116);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method1765((byte) 105);
                            var12[var13] = new byte[var14];
                            arg1.method1754(var14, var12[var13], -28, 0);
                        }
                    }
                    var4.field798[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class80.method595((byte) 96, var10[var16]);
                    }
                    var4.field790[var5] = arg3.method1670(var8, var15, (byte) 90, class80.method595((byte) 96, var7));
                    var4.field803[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field792[var5] = -1;
            } catch (SecurityException var21) {
                var4.field792[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field792[var5] = -3;
            } catch (Exception var23) {
                var4.field792[var5] = -4;
            } catch (Throwable var24) {
                var4.field792[var5] = -5;
            }
        }
        class288.field4608.method363(62, var4);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public final void method787(boolean arg0) {
        if (arg0) {
            this.field1865 = null;
        }
        field1863++;
        this.field1858 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class107() {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([B)V")
    public class107(byte[] arg0) {
        this.field1858 = new int[128];
        this.field1865 = new class129[128];
        this.field1866 = new short[128];
        int var2 = 0;
        this.field1860 = new byte[128];
        this.field1868 = new byte[128];
        this.field1854 = new byte[128];
        this.field1864 = new class91[128];
        class264 var3 = new class264(arg0);
        while (var3.field4198[var3.field4195 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1767(16711680);
        }
        var3.field4195++;
        var2++;
        int var6 = var3.field4195;
        int var7 = 0;
        var3.field4195 += var2;
        while (var3.field4198[var3.field4195 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1767(16711680);
        }
        var7++;
        var3.field4195++;
        int var10 = var3.field4195;
        int var11 = 0;
        var3.field4195 += var7;
        while (var3.field4198[var3.field4195 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1767(16711680);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field4195++;
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1779(-59);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class129[] var19 = new class129[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class129 var103 = var19[var20] = new class129();
            int var104 = var3.method1779(-51);
            if (var104 > 0) {
                var103.field2150 = new byte[var104 * 2];
            }
            int var105 = var3.method1779(-95);
            if (var105 > 0) {
                var103.field2157 = new byte[var105 * 2 + 2];
                var103.field2157[1] = 64;
            }
        }
        int var21 = var3.method1779(-100);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method1779(-110);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var3.field4198[var3.field4195 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method1767(16711680);
        }
        var25++;
        int var28 = 0;
        var3.field4195++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1779(-74);
            this.field1866[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1779(-70);
            this.field1866[var31] = (short) (this.field1866[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var3.method1781(-3);
            }
            this.field1866[var35] = (short) (this.field1866[var35] + class204.method1369(32768, var34 - 1 << 14));
            var32--;
            this.field1858[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1858[var39] != 0) {
                if (var36 == 0) {
                    if (var37 < var4.length) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                    var38 = var3.field4198[var6++] - 1;
                }
                var36--;
                this.field1868[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1858[var43] != 0) {
                if (var42 == 0) {
                    var41 = var3.field4198[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var42 = -1;
                    } else {
                        var42 = var8[var40++];
                    }
                }
                this.field1860[var43] = (byte) var41;
                var42--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class129 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1858[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field1865[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var49 < var26.length) {
                    var50 = var26[var49++];
                } else {
                    var50 = -1;
                }
                if (this.field1858[var51] > 0) {
                    var48 = var3.method1779(-53) + 1;
                }
            }
            var50--;
            this.field1854[var51] = (byte) var48;
        }
        this.field1862 = var3.method1779(-121) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class129 var100 = var19[var52];
            if (var100.field2150 != null) {
                for (int var101 = 1; var101 < var100.field2150.length; var101 += 2) {
                    var100.field2150[var101] = var3.method1767(16711680);
                }
            }
            if (var100.field2157 != null) {
                for (int var102 = 3; var102 < (var100.field2157.length - 2); var102 += 2) {
                    var100.field2157[var102] = var3.method1767(16711680);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1767(16711680);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method1767(16711680);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class129 var97 = var19[var55];
            if (var97.field2157 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2157.length; var99 += 2) {
                    var98 += var3.method1779(-100) + 1;
                    var97.field2157[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class129 var94 = var19[var56];
            if (var94.field2150 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2150.length; var96 += 2) {
                    var95 = var95 + var3.method1779(-75) + 1;
                    var94.field2150[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1779(-88);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var3.method1779(-95) + (var57 + 1);
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1854[var61] = (byte) (this.field1854[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class169.method1186(251194207, var67, var65 - var59);
                    var67 += var66 - var60;
                    this.field1854[var68] = (byte) (this.field1854[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1854[var64] = (byte) (this.field1854[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method1779(-57);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var3.method1779(-50) + 1;
                var24[var71] = (byte) var70;
            }
            int var72 = var24[1] << 1;
            byte var73 = var24[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field1860[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1860[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = (var79 - var73) / 2 + (var79 - var73) * var72;
                int var81 = var24[var75 + 1] << 1;
                var75 += 2;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class169.method1186(251194207, var80, var79 - var73);
                    int var84 = (this.field1860[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var80 += var81 - var72;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1860[var82] = (byte) var84;
                }
                var72 = var81;
                var73 = var79;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field1860[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1860[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2153 = var3.method1779(-49);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class129 var93 = var19[var87];
            if (var93.field2150 != null) {
                var93.field2148 = var3.method1779(-60);
            }
            if (var93.field2157 != null) {
                var93.field2144 = var3.method1779(-105);
            }
            if (var93.field2153 > 0) {
                var93.field2154 = var3.method1779(-91);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2151 = var3.method1779(-99);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class129 var92 = var19[var89];
            if (var92.field2151 > 0) {
                var92.field2152 = var3.method1779(-88);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class129 var91 = var19[var90];
            if (var91.field2152 > 0) {
                var91.field2147 = var3.method1779(-125);
            }
        }
    }
}
