import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class283 extends class237 {

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "[Lqk;")
    public class8[] field4518;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "[Lqh;")
    public class29[] field4521;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[B")
    public byte[] field4505;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[B")
    public byte[] field4508;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[S")
    public short[] field4509;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[B")
    public byte[] field4506;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[I")
    private int[] field4516;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4511 = null;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lwa;")
    public static class243 field4507;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[I")
    public static int[] field4519;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public final void method1895(int arg0) {
        if (arg0 != 28822) {
            this.field4520 = 8;
        }
        field4512++;
        this.field4516 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lwb;II)Ljava/lang/String;")
    public static final String method1896(class123 arg0, int arg1, int arg2) {
        field4523++;
        if (!client.method735(arg0).method1166(arg1, true) && arg0.field1855 == null) {
            return null;
        }
        if (arg2 != 2) {
            field4519 = null;
        }
        if (arg0.field1910 == null || arg0.field1910.length <= arg1 || arg0.field1910[arg1] == null || arg0.field1910[arg1].trim().length() == 0) {
            return class60.field764 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field1910[arg1];
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([B[ILkf;I)Z")
    public final boolean method1897(byte[] arg0, int[] arg1, class93 arg2, int arg3) {
        int var5 = 0;
        field4515++;
        boolean var6 = true;
        if (arg3 != 11134) {
            this.field4521 = null;
        }
        class29 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4516[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method521(var9 >> 2, -1721842521, arg1);
                        } else {
                            var7 = arg2.method520(arg1, (byte) -116, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4521[var8] = var7;
                        this.field4516[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
    public static void method1898(int arg0) {
        field4511 = null;
        if (arg0 == -22563) {
            field4519 = null;
            field4507 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB)V")
    public static final void method1899(int arg0, int arg1, byte arg2) {
        class233 var3 = class114.method746(arg1, 1228126432, 7);
        if (arg2 == -107) {
            field4504++;
            var3.method1651((byte) 121);
            var3.field3855 = arg0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZLeh;)[Lrb;")
    public static final class135[] method1900(int arg0, int arg1, boolean arg2, class137 arg3) {
        field4514++;
        if (class111.method714(arg0, arg1, arg3, 78)) {
            return arg2 ? null : class2.method8(72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1901(int arg0, String arg1) {
        field4522++;
        return arg0 == 10 ? class184.method1280(-126, 10, arg1, true) : -99;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1902(String arg0, int arg1) {
        if (arg1 != 12) {
            method1902((String) null, 118);
        }
        field4510++;
        if (class184.field2944 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class56.method323(-102);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class211.method1487("mem=" + var4 + "k", (String) null, 0, (byte) -123);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class56.method323(-50);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class211.method1487("Memory before cleanup=" + var7 + "k", (String) null, 0, (byte) -126);
                class281.method1878(false);
                class56.method323(-99);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class211.method1487("Memory after cleanup=" + var9 + "k", (String) null, 0, (byte) -126);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class211.method1487("Number of player models in cache:" + class278.method1854(false), (String) null, 0, (byte) -121);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class42.method229(true);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class35.field454.method506(-108);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class35.field454.method505(true);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class194.field3107.method266(-117);
                class28.field400.method1215(280101936);
                class35.field454.method509(arg1 - 12);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class289.field4603 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class2.method13(false, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class255.field4134 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class255.field4134 = false;
            }
            if (arg0.startsWith("::setba")) {
                class95.field1201 = method1901(10, arg0.substring(8));
                class111.method716(0, class194.field3107);
                class263.field4253 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class268.method1801(method1901(10, arg0.substring(15)));
                class111.method716(0, class194.field3107);
                class263.field4253 = false;
            }
            if (arg0.startsWith("::fps ") && class77.field969 != 0) {
                class88.method482(method1901(arg1 ^ 0x6, arg0.substring(6)), (byte) 29);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class244.field4005 = method1901(10, arg0.substring(12).trim());
                class211.method1487("rect_debug=" + class244.field4005, (String) null, 0, (byte) -128);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class60.field764 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class204.field3211) {
                    class204.field3211 = false;
                    class211.method1487("Forced tweening disabled.", (String) null, 0, (byte) -128);
                } else {
                    class204.field3211 = true;
                    class211.method1487("Forced tweening ENABLED!", (String) null, 0, (byte) -121);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class44.field570) {
                    System.out.println("Shift-click disabled.");
                    class44.field570 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class44.field570 = true;
                }
            }
        }
        class4.field57.method1932(false, 8);
        class4.field57.method580((byte) 94, arg0.length() - 1);
        class4.field57.method566((byte) -118, arg0.substring(2));
        class139.field2227++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class283() {
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    public class283(byte[] arg0) {
        this.field4518 = new class8[128];
        this.field4521 = new class29[128];
        this.field4505 = new byte[128];
        this.field4508 = new byte[128];
        this.field4509 = new short[128];
        int var2 = 0;
        this.field4506 = new byte[128];
        this.field4516 = new int[128];
        class96 var3 = new class96(arg0);
        while (var3.field1218[var3.field1228 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method587(-27);
        }
        var2++;
        var3.field1228++;
        int var6 = 0;
        int var7 = var3.field1228;
        var3.field1228 += var2;
        while (var3.field1218[var3.field1228 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method587(25);
        }
        var6++;
        var3.field1228++;
        int var10 = var3.field1228;
        var3.field1228 += var6;
        int var11;
        for (var11 = 0; var3.field1218[var3.field1228 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method587(102);
        }
        var11++;
        var3.field1228++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method584(255);
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
        class8[] var19 = new class8[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class8 var103 = var19[var20] = new class8();
            int var104 = var3.method584(255);
            if (var104 > 0) {
                var103.field92 = new byte[var104 * 2];
            }
            int var105 = var3.method584(255);
            if (var105 > 0) {
                var103.field93 = new byte[var105 * 2 + 2];
                var103.field93[1] = 64;
            }
        }
        int var21 = var3.method584(255);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method584(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field1218[var3.field1228 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method587(-33);
        }
        var25++;
        var3.field1228++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method584(255);
            this.field4509[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method584(255);
            this.field4509[var31] = (short) (this.field4509[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var33 == 0) {
                if (var32 < var26.length) {
                    var33 = var26[var32++];
                } else {
                    var33 = -1;
                }
                var34 = var3.method542((byte) -72);
            }
            var33--;
            this.field4509[var35] = (short) (this.field4509[var35] + class173.method1186(32768, var34 - 1 << 14));
            this.field4516[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4516[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field1218[var7++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field4506[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4516[var43] != 0) {
                if (var41 == 0) {
                    var40 = var3.field1218[var10++] + 16 << 2;
                    if (var8.length <= var42) {
                        var41 = -1;
                    } else {
                        var41 = var8[var42++];
                    }
                }
                this.field4508[var43] = (byte) var40;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class8 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4516[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field4518[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field4516[var51] > 0) {
                    var50 = var3.method584(255) + 1;
                }
            }
            this.field4505[var51] = (byte) var50;
            var48--;
        }
        this.field4520 = var3.method584(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class8 var100 = var19[var52];
            if (var100.field92 != null) {
                for (int var101 = 1; var101 < var100.field92.length; var101 += 2) {
                    var100.field92[var101] = var3.method587(126);
                }
            }
            if (var100.field93 != null) {
                for (int var102 = 3; var102 < var100.field93.length - 2; var102 += 2) {
                    var100.field93[var102] = var3.method587(125);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method587(122);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method587(-70);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class8 var97 = var19[var55];
            if (var97.field93 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field93.length; var99 += 2) {
                    var98 = var3.method584(255) + var98 + 1;
                    var97.field93[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class8 var94 = var19[var56];
            if (var94.field92 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field92.length; var96 += 2) {
                    var95 = var3.method584(255) + var95 + 1;
                    var94.field92[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method584(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method584(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field4505[var61] = (byte) (this.field4505[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var60) * var59 + ((var65 - var60) / 2);
                var62 += 2;
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class285.method1908(var65 - var60, var67, false);
                    this.field4505[var68] = (byte) (this.field4505[var68] * var69 + 32 >> 6);
                    var67 += var66 - var59;
                }
                var59 = var66;
                var60 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field4505[var63] = (byte) (this.field4505[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var3.method584(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var3.method584(255) + (var70 + 1);
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4508[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4508[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class285.method1908(var79 - var72, var81, false);
                    int var84 = (this.field4508[var82] & 0xFF) + var83;
                    var81 += var80 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4508[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4508[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4508[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field102 = var3.method584(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class8 var93 = var19[var87];
            if (var93.field92 != null) {
                var93.field101 = var3.method584(255);
            }
            if (var93.field93 != null) {
                var93.field95 = var3.method584(255);
            }
            if (var93.field102 > 0) {
                var93.field96 = var3.method584(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field99 = var3.method584(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class8 var92 = var19[var89];
            if (var92.field99 > 0) {
                var92.field100 = var3.method584(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class8 var91 = var19[var90];
            if (var91.field100 > 0) {
                var91.field94 = var3.method584(255);
            }
        }
        if (class282.field4502) {
        }
    }
}
