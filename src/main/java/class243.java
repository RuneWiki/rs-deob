import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class243 extends class379 {

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "[B")
    public byte[] field2869;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[S")
    public short[] field2862;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
    private int[] field2867;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[B")
    public byte[] field2865;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[Laia;")
    public class242[] field2860;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[Ljq;")
    public class538[] field2864;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[B")
    public byte[] field2858;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
    public static int[] field2855 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lgp;")
    public static class53 field2863 = new class53();

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field2870 = 765;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Llja;")
    public static class744 field2872 = new class744(64, 11);

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[[Z")
    public static boolean[][] field2873 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1463(byte arg0) {
        field2859++;
        if (class118.field1502 == 1 || class118.field1502 == 3 || class456.field6440 != class118.field1502 && (class118.field1502 == 0 || class456.field6440 == 0)) {
            class370.field4599 = 0;
            class3.field42 = 0;
            class30.field444.method2115(0);
        }
        class456.field6440 = class118.field1502;
        if (arg0 > -121) {
            field2873 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IILpl;[B)Z")
    public final boolean method1464(int[] arg0, int arg1, class678 arg2, byte[] arg3) {
        if (arg1 != 12999) {
            this.method1468(75);
        }
        field2856++;
        boolean var5 = true;
        int var6 = 0;
        class242 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field2867[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method3819(var9 >> 2, arg0, 24877);
                        } else {
                            var7 = arg2.method3816(var9 >> 2, arg0, (byte) -121);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2860[var8] = var7;
                        this.field2867[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method1465(int arg0, int arg1) {
        class506.field7198 = arg0;
        class268.field3168 = arg1;
        field2866++;
        long var2 = 0L;
        if (class31.field491 == null) {
            class138.method1010(35, (byte) 50);
        } else {
            class403 var4 = new class403(class343.method2036((byte) -22, class494.method2911(class31.field491, -123)));
            long var5 = var4.method2361(79);
            class616.field8285 = var4.method2361(49);
            class571.method3312(class486.method2889(true, var5), false, true, "", arg1 ^ 0x2A);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLjava/lang/String;)Z")
    public static final boolean method1466(int arg0, byte arg1, String arg2) {
        field2871++;
        if (class521.field7389.field9271) {
            class55.field743 = new class350();
            class55.field743.field4365 = arg0;
            class55.field743.field4362 = arg2;
            if (class737.field10285 != class446.field6003) {
                class55.field743.field4361 = class55.field743.field4365 + 40000;
                class55.field743.field4360 = class55.field743.field4365 + 50000;
            }
            for (int var3 = 0; var3 < class780.field10754.length; var3++) {
                if (class780.field10754[var3].field8622 == arg0) {
                    class444.field5951 = class780.field10754[var3].field1125;
                }
            }
            return true;
        }
        String var4 = "";
        if (arg1 != 89) {
            return true;
        }
        if (class737.field10285 != class446.field6003) {
            var4 = ":" + (arg0 + 7000);
        }
        String var5 = "";
        if (class28.field429 != null) {
            var5 = "/p=" + class28.field429;
        }
        String var6 = "http://" + arg2 + var4 + "/l=" + class770.field10592 + "/a=" + class176.field2187 + var5 + "/j" + (class171.field2050 ? "1" : "0") + ",o" + (class135.field1699 ? "1" : "0") + ",a2";
        try {
            class90.field1195.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class243() {
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([B)V")
    public class243(byte[] arg0) {
        this.field2869 = new byte[128];
        this.field2862 = new short[128];
        this.field2867 = new int[128];
        this.field2865 = new byte[128];
        this.field2860 = new class242[128];
        this.field2864 = new class538[128];
        this.field2858 = new byte[128];
        class403 var2 = new class403(arg0);
        int var3;
        for (var3 = 0; var2.field5275[var2.field5262 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2392(-30);
        }
        var2.field5262++;
        var3++;
        int var6 = var2.field5262;
        var2.field5262 += var3;
        int var7;
        for (var7 = 0; var2.field5275[var2.field5262 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2392(-59);
        }
        var7++;
        var2.field5262++;
        int var10 = var2.field5262;
        var2.field5262 += var7;
        int var11;
        for (var11 = 0; var2.field5275[var2.field5262 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2392(114);
        }
        var11++;
        var2.field5262++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2396((byte) 87);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class538[] var19 = new class538[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class538 var103 = var19[var20] = new class538();
            int var104 = var2.method2396((byte) -92);
            if (var104 > 0) {
                var103.field7574 = new byte[var104 * 2];
            }
            int var105 = var2.method2396((byte) 127);
            if (var105 > 0) {
                var103.field7572 = new byte[var105 * 2 + 2];
                var103.field7572[1] = 64;
            }
        }
        int var21 = var2.method2396((byte) 115);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method2396((byte) 110);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field5275[var2.field5262 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2392(-37);
        }
        var25++;
        var2.field5262++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2396((byte) 124);
            this.field2862[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2396((byte) -118);
            this.field2862[var31] = (short) (this.field2862[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method2367(54);
            }
            this.field2862[var35] = (short) (this.field2862[var35] + class296.method1733(32768, var34 - 1 << 14));
            var32--;
            this.field2867[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2867[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field5275[var6++] - 1;
                }
                var37--;
                this.field2865[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2867[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field5275[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field2858[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class538 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2867[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field2864[var47] = var46;
                var44--;
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
                if (this.field2867[var51] > 0) {
                    var50 = var2.method2396((byte) 39) + 1;
                }
            }
            this.field2869[var51] = (byte) var50;
            var49--;
        }
        this.field2868 = var2.method2396((byte) -87) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class538 var100 = var19[var52];
            if (var100.field7574 != null) {
                for (int var101 = 1; var101 < var100.field7574.length; var101 += 2) {
                    var100.field7574[var101] = var2.method2392(-117);
                }
            }
            if (var100.field7572 != null) {
                for (int var102 = 3; var102 < var100.field7572.length - 2; var102 += 2) {
                    var100.field7572[var102] = var2.method2392(125);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2392(127);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2392(-92);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class538 var97 = var19[var55];
            if (var97.field7572 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field7572.length; var99 += 2) {
                    var98 = var2.method2396((byte) 66) + (var98 + 1);
                    var97.field7572[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class538 var94 = var19[var56];
            if (var94.field7574 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field7574.length; var96 += 2) {
                    var95 = var95 + var2.method2396((byte) 36) + 1;
                    var94.field7574[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2396((byte) -114);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method2396((byte) -108) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2869[var61] = (byte) (this.field2869[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class155.method1099((byte) -69, var67, var65 - var59);
                    this.field2869[var68] = (byte) (this.field2869[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2869[var63] = (byte) (this.field2869[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2396((byte) -109);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method2396((byte) 43) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2858[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2858[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class155.method1099((byte) -69, var81, var79 - var72);
                    int var84 = (this.field2858[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field2858[var82] = (byte) var84;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2858[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2858[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field7576 = var2.method2396((byte) 98);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class538 var93 = var19[var87];
            if (var93.field7574 != null) {
                var93.field7581 = var2.method2396((byte) -92);
            }
            if (var93.field7572 != null) {
                var93.field7583 = var2.method2396((byte) 62);
            }
            if (var93.field7576 > 0) {
                var93.field7573 = var2.method2396((byte) 91);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field7575 = var2.method2396((byte) -100);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class538 var92 = var19[var89];
            if (var92.field7575 > 0) {
                var92.field7571 = var2.method2396((byte) -110);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class538 var91 = var19[var90];
            if (var91.field7571 > 0) {
                var91.field7578 = var2.method2396((byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1467(int arg0) {
        field2873 = null;
        field2855 = null;
        field2872 = null;
        int var1 = 118 / ((arg0 - 75) / 32);
        field2863 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public final void method1468(int arg0) {
        field2861++;
        if (arg0 == 271) {
            this.field2867 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1469(int arg0) {
        field2857++;
        class390.field5065.method626(((float) class118.field1503.field10655.method3783(0) * 0.1F + 0.7F) * 1.1523438F);
        class390.field5065.method578(class245.field2896, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class390.field5065.method650(class230.field2745, -1, 0);
        if (arg0 == -24978) {
            class390.field5065.method558(class655.field9031);
        }
    }
}
