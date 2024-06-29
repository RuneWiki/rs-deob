import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class4 extends class137 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[S")
    public short[] field73;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[B")
    public byte[] field72;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[B")
    public byte[] field78;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "[Lqa;")
    public class167[] field85;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
    private int[] field83;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "[B")
    public byte[] field82;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[Lbk;")
    public class140[] field77;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[S")
    public static short[] field76 = new short[500];

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "J")
    public static long field75 = 0L;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[Llk;")
    public static class112[] field87 = new class112[50];

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Loj;")
    public static class17 field74 = new class17(64);

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lhh;")
    public static class163 field90 = class137.method1065("www)2wtrc", 17);

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lv;")
    public static class22 field89;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[I[BLkk;)Z")
    public final boolean method34(boolean arg0, int[] arg1, byte[] arg2, class231 arg3) {
        field86++;
        int var5 = 0;
        boolean var6 = arg0;
        class167 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field83[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1604(arg1, var9 >> 2, -2294);
                        } else {
                            var7 = arg3.method1608(var9 >> 2, !arg0, arg1);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field85[var8] = var7;
                        this.field83[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public final void method35(int arg0) {
        field80++;
        if (arg0 != 128) {
            method36(79);
        }
        this.field83 = null;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public static void method36(int arg0) {
        field89 = null;
        field74 = null;
        int var1 = -33 % ((arg0 + 32) / 39);
        field87 = null;
        field90 = null;
        field76 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[B")
    public static final byte[] method37(byte arg0, int arg1) {
        field81++;
        class219 var2 = (class219) class131.field2537.method326((long) arg1, (byte) -70);
        if (arg0 > -89) {
            field91 = -6;
        }
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class127.method1012(var7, var3, -22067);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class219(var4);
            class131.field2537.method328(8690, var2, (long) arg1);
        }
        return var2.field3977;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class4() {
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
    public class4(byte[] arg0) {
        this.field73 = new short[128];
        this.field72 = new byte[128];
        this.field78 = new byte[128];
        this.field85 = new class167[128];
        this.field83 = new int[128];
        this.field82 = new byte[128];
        this.field77 = new class140[128];
        int var2 = 0;
        class81 var3 = new class81(arg0);
        while (var3.field1562[var3.field1541 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method635(108);
        }
        var3.field1541++;
        var2++;
        int var6 = var3.field1541;
        var3.field1541 += var2;
        int var7;
        for (var7 = 0; var3.field1562[var3.field1541 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method635(-107);
        }
        var3.field1541++;
        int var10 = var3.field1541;
        int var11 = 0;
        var7++;
        var3.field1541 += var7;
        while (var3.field1562[var3.field1541 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method635(-97);
        }
        var11++;
        var3.field1541++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method622(true);
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
        class140[] var19 = new class140[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class140 var103 = var19[var20] = new class140();
            int var104 = var3.method622(true);
            if (var104 > 0) {
                var103.field2672 = new byte[var104 * 2];
            }
            int var105 = var3.method622(true);
            if (var105 > 0) {
                var103.field2669 = new byte[var105 * 2 + 2];
                var103.field2669[1] = 64;
            }
        }
        int var21 = var3.method622(true);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method622(true);
        int var24;
        for (var24 = 0; var3.field1562[var3.field1541 + var24] != 0; var24++) {
        }
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method635(-67);
        }
        var24++;
        int var28 = 0;
        var3.field1541++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method622(true);
            this.field73[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method622(true);
            this.field73[var31] = (short) (this.field73[var31] + (var30 << 8));
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
                var34 = var3.method644(-95749960);
            }
            var32--;
            this.field73[var35] = (short) (this.field73[var35] + class7.method50(32768, var34 - 1 << 14));
            this.field83[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field83[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var3.field1562[var6++] - 1;
                }
                this.field78[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field83[var43] != 0) {
                if (var41 == 0) {
                    var40 = var3.field1562[var10++] + 16 << 2;
                    if (var42 < var8.length) {
                        var41 = var8[var42++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field72[var43] = (byte) var40;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class140 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field83[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field77[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field83[var51] > 0) {
                    var50 = var3.method622(true) + 1;
                }
            }
            var49--;
            this.field82[var51] = (byte) var50;
        }
        this.field79 = var3.method622(true) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class140 var100 = var19[var52];
            if (var100.field2672 != null) {
                for (int var101 = 1; var101 < var100.field2672.length; var101 += 2) {
                    var100.field2672[var101] = var3.method635(83);
                }
            }
            if (var100.field2669 != null) {
                for (int var102 = 3; var102 < (var100.field2669.length - 2); var102 += 2) {
                    var100.field2669[var102] = var3.method635(118);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method635(111);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method635(-107);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class140 var97 = var19[var55];
            if (var97.field2669 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2669.length; var99 += 2) {
                    var98 = var3.method622(true) + var98 + 1;
                    var97.field2669[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class140 var94 = var19[var56];
            if (var94.field2672 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2672.length; var96 += 2) {
                    var95 = var3.method622(true) + var95 + 1;
                    var94.field2672[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method622(true);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var3.method622(true) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field82[var61] = (byte) (this.field82[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                int var66 = (var65 - var59) / 2 + (var65 - var59) * var60;
                byte var67 = var22[var62 + 1];
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class6.method48(-1201173953, var65 - var59, var66);
                    var66 += var67 - var60;
                    this.field82[var68] = (byte) (this.field82[var68] * var69 + 32 >> 6);
                }
                var60 = var67;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field82[var63] = (byte) (this.field82[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method622(true);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method622(true) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field72[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field72[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class6.method48(-1201173953, var79 - var72, var81);
                    var81 += var80 - var73;
                    int var84 = (this.field72[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field72[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field72[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field72[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2687 = var3.method622(true);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class140 var93 = var19[var87];
            if (var93.field2672 != null) {
                var93.field2680 = var3.method622(true);
            }
            if (var93.field2669 != null) {
                var93.field2684 = var3.method622(true);
            }
            if (var93.field2687 > 0) {
                var93.field2685 = var3.method622(true);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2688 = var3.method622(true);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class140 var92 = var19[var89];
            if (var92.field2688 > 0) {
                var92.field2681 = var3.method622(true);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class140 var91 = var19[var90];
            if (var91.field2681 > 0) {
                var91.field2679 = var3.method622(true);
            }
        }
    }
}
