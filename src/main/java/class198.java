import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class198 extends class165 {

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[Ldd;")
    public class42[] field3229;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[S")
    public short[] field3219;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[B")
    public byte[] field3233;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[B")
    public byte[] field3222;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[B")
    public byte[] field3226;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "[Lom;")
    public class125[] field3224;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "[I")
    private int[] field3230;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Z")
    public static boolean field3223 = false;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lcg;")
    public static class316 field3225;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 5)
    public final void method1454(byte arg0) {
        if (arg0 != -37) {
            field3223 = true;
        }
        field3220++;
        this.field3230 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lea;I[B[I)Z", line = 39)
    public final boolean method1455(class333 arg0, int arg1, byte[] arg2, int[] arg3) {
        field3218++;
        boolean var5 = true;
        class125 var6 = null;
        int var7 = 0;
        int var8 = 0;
        if (arg1 != -129) {
            return true;
        }
        while (var8 < 128) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3230[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method2330(arg3, arg1 + 127, var9 >> 2);
                        } else {
                            var6 = arg0.method2327(var9 >> 2, arg3, -119);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3224[var8] = var6;
                        this.field3230[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 100)
    public static final void method1456(String arg0, int arg1, byte arg2) {
        field3227++;
        class214.field3486++;
        class194.field3175.method2375(205, 0);
        class194.field3175.method279(false, class204.method1491(arg2 ^ 0x6959, arg0));
        class194.field3175.method274(arg1, 111);
        if (arg2 != -123) {
            field3231 = -125;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 114)
    public static final void method1457(int arg0) {
        if (class194.field3168 == 2) {
            if (class67.field960 == class200.field3248 && class7.field100 == class222.field3554) {
                class194.field3168 = 0;
                if (class13.field151 && class117.field1770[81] && class185.field3070 > 2) {
                    class252.method1816(class185.field3070 - 2, 11);
                } else {
                    class252.method1816(class185.field3070 - 1, 11);
                }
            }
        } else if (class200.field3248 == class105.field1542 && class222.field3554 == field3221) {
            class194.field3168 = 0;
            if (class13.field151 && class117.field1770[81] && class185.field3070 > 2) {
                class252.method1816(class185.field3070 - 2, arg0 ^ 0xB);
            } else {
                class252.method1816(class185.field3070 - 1, 11);
            }
        } else {
            class67.field960 = class105.field1542;
            class7.field100 = field3221;
            class194.field3168 = 2;
        }
        field3228++;
        if (arg0 != 0) {
            field3231 = 116;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 168)
    public static void method1458(int arg0) {
        field3225 = null;
        if (arg0 != 29581) {
            method1456((String) null, -13, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 180)
    public class198() {
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIZZZ)Lak;", line = 184)
    public static final class172 method1459(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (arg3) {
            field3223 = false;
        }
        field3232++;
        class127 var5 = null;
        if (class61.field859 != null) {
            var5 = new class127(arg1, class61.field859, client.field1666[arg1], 1000000);
        }
        class333.field5192[arg1] = class165.field2752.method615(-321, arg1, class318.field4947, var5);
        if (arg0) {
            class333.field5192[arg1].method1998(-1);
        }
        return new class172(class333.field5192[arg1], arg4, arg2);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V", line = 203)
    public class198(byte[] arg0) {
        this.field3229 = new class42[128];
        this.field3219 = new short[128];
        this.field3233 = new byte[128];
        this.field3222 = new byte[128];
        this.field3226 = new byte[128];
        this.field3224 = new class125[128];
        this.field3230 = new int[128];
        class44 var2 = new class44(arg0);
        int var3;
        for (var3 = 0; var2.field573[var2.field586 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method246((byte) -27);
        }
        var3++;
        var2.field586++;
        int var6 = 0;
        int var7 = var2.field586;
        var2.field586 += var3;
        while (var2.field573[var2.field586 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method246((byte) -96);
        }
        var6++;
        var2.field586++;
        int var10 = 0;
        int var11 = var2.field586;
        var2.field586 += var6;
        while (var2.field573[var2.field586 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method246((byte) -62);
        }
        var2.field586++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method286((byte) -118);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class42[] var19 = new class42[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class42 var21 = var19[var20] = new class42();
            int var22 = var2.method286((byte) -75);
            if (var22 > 0) {
                var21.field531 = new byte[var22 * 2];
            }
            int var23 = var2.method286((byte) -94);
            if (var23 > 0) {
                var21.field528 = new byte[var23 * 2 + 2];
                var21.field528[1] = 64;
            }
        }
        int var24 = var2.method286((byte) -115);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method286((byte) -65);
        int var27;
        for (var27 = 0; var2.field573[var2.field586 + var27] != 0; var27++) {
        }
        byte[] var28 = new byte[var27];
        byte[] var29 = var26 > 0 ? new byte[var26 * 2] : null;
        for (int var30 = 0; var30 < var27; var30++) {
            var28[var30] = var2.method246((byte) -79);
        }
        var27++;
        var2.field586++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method286((byte) -84);
            this.field3219[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method286((byte) -87);
            this.field3219[var34] = (short) (this.field3219[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var28.length > var36) {
                    var35 = var28[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var2.method223((byte) -106);
            }
            var35--;
            this.field3219[var38] = (short) (this.field3219[var38] + client.method767(var37 - 1 << 14, 32768));
            this.field3230[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3230[var42] != 0) {
                if (var39 == 0) {
                    if (var4.length > var41) {
                        var39 = var4[var41++];
                    } else {
                        var39 = -1;
                    }
                    var40 = var2.field573[var7++] - 1;
                }
                var39--;
                this.field3226[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3230[var46] != 0) {
                if (var44 == 0) {
                    var45 = var2.field573[var11++] + 16 << 2;
                    if (var8.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                var44--;
                this.field3222[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class42 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3230[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                var47--;
                this.field3229[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 < var28.length) {
                    var53 = var28[var51++];
                } else {
                    var53 = -1;
                }
                if (this.field3230[var54] > 0) {
                    var52 = var2.method286((byte) -65) + 1;
                }
            }
            var53--;
            this.field3233[var54] = (byte) var52;
        }
        this.field3217 = var2.method286((byte) -66) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class42 var56 = var19[var55];
            if (var56.field531 != null) {
                for (int var57 = 1; var57 < var56.field531.length; var57 += 2) {
                    var56.field531[var57] = var2.method246((byte) -28);
                }
            }
            if (var56.field528 != null) {
                for (int var58 = 3; var58 < (var56.field528.length - 2); var58 += 2) {
                    var56.field528[var58] = var2.method246((byte) -118);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method246((byte) -62);
            }
        }
        if (var29 != null) {
            for (int var60 = 1; var60 < var29.length; var60 += 2) {
                var29[var60] = var2.method246((byte) -116);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class42 var62 = var19[var61];
            if (var62.field528 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field528.length; var64 += 2) {
                    var63 = var2.method286((byte) -117) + var63 + 1;
                    var62.field528[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class42 var66 = var19[var65];
            if (var66.field531 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field531.length; var68 += 2) {
                    var67 = var67 + var2.method286((byte) -122) + 1;
                    var66.field531[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method286((byte) -92);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var2.method286((byte) -114) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field3233[var73] = (byte) (this.field3233[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var72) / 2 + (var75 - var72) * var71;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class177.method1333(115, var77, var75 - var72);
                    this.field3233[var78] = (byte) (this.field3233[var78] * var79 + 32 >> 6);
                    var77 += var76 - var71;
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field3233[var81] = (byte) (this.field3233[var81] * var71 + 32 >> 6);
            }
        }
        if (var29 != null) {
            int var82 = var2.method286((byte) -125);
            var29[0] = (byte) var82;
            for (int var83 = 2; var83 < var29.length; var83 += 2) {
                var82 = var2.method286((byte) -128) + var82 + 1;
                var29[var83] = (byte) var82;
            }
            byte var84 = var29[0];
            int var85 = var29[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3222[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3222[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var29.length > var88) {
                byte var89 = var29[var88];
                int var90 = var29[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class177.method1333(77, var91, var89 - var84);
                    var91 += var90 - var85;
                    int var94 = (this.field3222[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3222[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field3222[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3222[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field533 = var2.method286((byte) -74);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class42 var100 = var19[var99];
            if (var100.field531 != null) {
                var100.field532 = var2.method286((byte) -120);
            }
            if (var100.field528 != null) {
                var100.field534 = var2.method286((byte) -76);
            }
            if (var100.field533 > 0) {
                var100.field527 = var2.method286((byte) -106);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field526 = var2.method286((byte) -109);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class42 var103 = var19[var102];
            if (var103.field526 > 0) {
                var103.field525 = var2.method286((byte) -115);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class42 var105 = var19[var104];
            if (var105.field525 > 0) {
                var105.field538 = var2.method286((byte) -96);
            }
        }
    }
}
