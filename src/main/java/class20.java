import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 extends class125 {

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[B")
    public byte[] field220;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "[B")
    public byte[] field222;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[B")
    public byte[] field229;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[Ljc;")
    public class240[] field224;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[Ltd;")
    public class72[] field223;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "[S")
    public short[] field230;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
    public static int[] field221 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "Loa;")
    public static class99 field234 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "Loa;")
    public static class99 field232 = field234;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Loa;")
    public static class99 field231 = field234;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Loa;")
    public static class99 field226 = class221.method1463(2844, "blaugr-Un:");

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "F")
    public static float field238;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static final void method119(int arg0) {
        field235++;
        if (class18.field192 == 0) {
            return;
        }
        if (arg0 != 128) {
            method120((byte) -41);
        }
        try {
            if ((++class182.field3168) > 1500) {
                if (class133.field2322 != null) {
                    class133.field2322.method54((byte) -1);
                    class133.field2322 = null;
                }
                if (class288.field5036 >= 1) {
                    class65.field1107 = -5;
                    class18.field192 = 0;
                    return;
                }
                class18.field192 = 1;
                class288.field5036++;
                class182.field3168 = 0;
                if (class256.field4424 == class202.field3523) {
                    class202.field3523 = class289.field5056;
                } else {
                    class202.field3523 = class256.field4424;
                }
            }
            if (class18.field192 == 1) {
                class115.field2038 = class24.field368.method586(class129.field2260, arg0 - 23, class202.field3523);
                class18.field192 = 2;
            }
            if (class18.field192 == 2) {
                if (class115.field2038.field4844 == 2) {
                    throw new IOException();
                }
                if (class115.field2038.field4844 != 1) {
                    return;
                }
                class133.field2322 = new class7((Socket) class115.field2038.field4843, class24.field368);
                class115.field2038 = null;
                class133.field2322.method55(class131.field2277.field4619, (byte) -108, 0, class131.field2277.field4587);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                int var1 = class133.field2322.method57(-96);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                if (var1 != 101) {
                    class18.field192 = 0;
                    class65.field1107 = var1;
                    class133.field2322.method54((byte) 3);
                    class133.field2322 = null;
                    return;
                }
                class18.field192 = 3;
            }
            if (class18.field192 == 3 && class133.field2322.method62(arg0 ^ 0xFFFFFF7F) >= 2) {
                int var2 = class133.field2322.method57(76) << 8 | class133.field2322.method57(arg0 ^ 0xFFFFFF27);
                class214.method1437(var2, 50);
                if (class33.field585 == -1) {
                    class18.field192 = 0;
                    class65.field1107 = 6;
                    class133.field2322.method54((byte) -38);
                    class133.field2322 = null;
                } else {
                    class18.field192 = 0;
                    class133.field2322.method54((byte) 126);
                    class133.field2322 = null;
                    class96.method641((byte) 123);
                }
            }
        } catch (IOException var3) {
            if (class133.field2322 != null) {
                class133.field2322.method54((byte) 127);
                class133.field2322 = null;
            }
            if (class288.field5036 < 1) {
                class182.field3168 = 0;
                class288.field5036++;
                class18.field192 = 1;
                if (class256.field4424 == class202.field3523) {
                    class202.field3523 = class289.field5056;
                } else {
                    class202.field3523 = class256.field4424;
                }
            } else {
                class18.field192 = 0;
                class65.field1107 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field232 = null;
        field231 = null;
        field234 = null;
        field221 = null;
        if (arg0 != -118) {
            field232 = null;
        }
        field226 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method121(int arg0) {
        if (arg0 != -31216) {
            field231 = null;
        }
        this.field233 = null;
        field236++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([B[IZLkf;)Z")
    public final boolean method122(byte[] arg0, int[] arg1, boolean arg2, class181 arg3) {
        field228++;
        if (arg2) {
            method119(-34);
        }
        int var5 = 0;
        boolean var6 = true;
        class72 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field233[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1216((byte) -76, var9 >> 2, arg1);
                        } else {
                            var7 = arg3.method1215(var9 >> 2, arg1, !arg2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field223[var8] = var7;
                        this.field233[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
    public class20(byte[] arg0) {
        this.field220 = new byte[128];
        this.field222 = new byte[128];
        this.field229 = new byte[128];
        this.field224 = new class240[128];
        this.field223 = new class72[128];
        int var2 = 0;
        this.field230 = new short[128];
        this.field233 = new int[128];
        class261 var3 = new class261(arg0);
        while (var3.field4619[var3.field4587 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1706(10819);
        }
        var3.field4587++;
        var2++;
        int var6 = var3.field4587;
        var3.field4587 += var2;
        int var7;
        for (var7 = 0; var3.field4619[var3.field4587 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1706(10819);
        }
        int var10 = 0;
        var7++;
        var3.field4587++;
        int var11 = var3.field4587;
        var3.field4587 += var7;
        while (var3.field4619[var3.field4587 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1706(10819);
        }
        var10++;
        var3.field4587++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1693((byte) 127);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class240[] var18 = new class240[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class240 var102 = var18[var19] = new class240();
            int var103 = var3.method1693((byte) 60);
            if (var103 > 0) {
                var102.field4135 = new byte[var103 * 2];
            }
            int var104 = var3.method1693((byte) 116);
            if (var104 > 0) {
                var102.field4138 = new byte[var104 * 2 + 2];
                var102.field4138[1] = 64;
            }
        }
        int var20 = var3.method1693((byte) -81);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var3.method1693((byte) -128);
        int var23;
        for (var23 = 0; var3.field4619[var3.field4587 + var23] != 0; var23++) {
        }
        byte[] var24 = var22 <= 0 ? null : new byte[var22 * 2];
        byte[] var25 = new byte[var23];
        for (int var26 = 0; var26 < var23; var26++) {
            var25[var26] = var3.method1706(10819);
        }
        var23++;
        var3.field4587++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1693((byte) 33);
            this.field230[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1693((byte) -95);
            this.field230[var30] = (short) (this.field230[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var33 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var33++];
                }
                var32 = var3.method1743(125);
            }
            var31--;
            this.field230[var34] = (short) (this.field230[var34] + (class71.method502(var32 - 1, 2) << 14));
            this.field233[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field233[var38] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var35) {
                        var37 = -1;
                    } else {
                        var37 = var4[var35++];
                    }
                    var36 = var3.field4619[var6++] - 1;
                }
                var37--;
                this.field220[var38] = (byte) var36;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field233[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field4619[var11++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field229[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class240 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field233[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field224[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field233[var50] > 0) {
                    var49 = var3.method1693((byte) 93) + 1;
                }
            }
            var48--;
            this.field222[var50] = (byte) var49;
        }
        this.field225 = var3.method1693((byte) 95) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class240 var99 = var18[var51];
            if (var99.field4135 != null) {
                for (int var100 = 1; var100 < var99.field4135.length; var100 += 2) {
                    var99.field4135[var100] = var3.method1706(10819);
                }
            }
            if (var99.field4138 != null) {
                for (int var101 = 3; var101 < var99.field4138.length - 2; var101 += 2) {
                    var99.field4138[var101] = var3.method1706(10819);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1706(10819);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1706(10819);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class240 var96 = var18[var54];
            if (var96.field4138 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4138.length; var98 += 2) {
                    var97 = var97 + var3.method1693((byte) -116) + 1;
                    var96.field4138[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class240 var93 = var18[var55];
            if (var93.field4135 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4135.length; var95 += 2) {
                    var94 = var94 + var3.method1693((byte) -120) + 1;
                    var93.field4135[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1693((byte) -115);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 -= -var3.method1693((byte) 46) - 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field222[var60] = (byte) (this.field222[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class186.method1277(var64 - var59, -92, var66);
                    this.field222[var67] = (byte) (this.field222[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var58 = var65;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field222[var63] = (byte) (this.field222[var63] * var58 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1693((byte) -127);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var69 + var3.method1693((byte) 78) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field229[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field229[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var24[var74 + 1] << 1;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class186.method1277(var78 - var71, -38, var79);
                    var79 += var80 - var72;
                    int var83 = (this.field229[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field229[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var80;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field229[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field229[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4139 = var3.method1693((byte) 89);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class240 var92 = var18[var86];
            if (var92.field4135 != null) {
                var92.field4141 = var3.method1693((byte) 75);
            }
            if (var92.field4138 != null) {
                var92.field4144 = var3.method1693((byte) -125);
            }
            if (var92.field4139 > 0) {
                var92.field4152 = var3.method1693((byte) 14);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4137 = var3.method1693((byte) 60);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class240 var91 = var18[var88];
            if (var91.field4137 > 0) {
                var91.field4148 = var3.method1693((byte) 109);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class240 var90 = var18[var89];
            if (var90.field4148 > 0) {
                var90.field4155 = var3.method1693((byte) 74);
            }
        }
    }
}
