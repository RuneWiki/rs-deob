import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class14 extends class166 {

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "[Ljc;")
    public class83[] field312;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "[B")
    public byte[] field309;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "[B")
    public byte[] field317;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[S")
    public short[] field310;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[B")
    public byte[] field303;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[Lqc;")
    public class146[] field321;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lcd;")
    public static class23 field302 = class54.method414("Hier wechseln", -1);

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lcd;")
    private static class23 field305 = class54.method414("No reply from loginserver)3", -1);

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "[J")
    public static long[] field313 = new long[100];

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lcd;")
    public static class23 field314 = field305;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lcd;")
    public static class23 field308 = class54.method414("Verbindung konnte nicht hergestellt werden)3", -1);

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Lcd;")
    private static class23 field320 = class54.method414("flash3:", -1);

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "Lcd;")
    public static class23 field319 = field320;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lcd;")
    public static class23 field315 = field320;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lcg;")
    public static class26 field301;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field301 = null;
        field319 = null;
        field308 = null;
        field305 = null;
        if (arg0 < 63) {
            field308 = null;
        }
        field315 = null;
        field313 = null;
        field302 = null;
        field314 = null;
        field320 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IILfc;[B)Z")
    public final boolean method74(int[] arg0, int arg1, class49 arg2, byte[] arg3) {
        field307++;
        boolean var5 = true;
        class83 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field300[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method384(var9 >> 2, arg0, true);
                        } else {
                            var6 = arg2.method383(arg0, (byte) -112, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field312[var8] = var6;
                        this.field300[var8] = 0;
                    }
                }
            }
        }
        if (arg1 != 128) {
            method75(61, null, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILkh;Lkh;)V")
    public static final void method75(int arg0, class97 arg1, class97 arg2) {
        field306++;
        class155.field3113 = arg2;
        if (arg0 != 1) {
            method73((byte) 71);
        }
        class181.field3581 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILpc;ILjava/awt/Component;I)Lvf;")
    public static final class194 method76(int arg0, class137 arg1, int arg2, Component arg3, int arg4) {
        field311++;
        if (class48.field1163 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                if (arg0 != -7363) {
                    field308 = null;
                }
                class194 var5 = (class194) Class.forName("uf").getDeclaredConstructor().newInstance();
                var5.field3843 = new int[(class143.field2934 ? 2 : 1) * 256];
                var5.field3852 = arg4;
                var5.method1135(arg3);
                var5.field3850 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3850 > 16384) {
                    var5.field3850 = 16384;
                }
                var5.method1138(var5.field3850);
                if (class145.field2957 > 0 && class180.field3566 == null) {
                    class180.field3566 = new class22();
                    class180.field3566.field453 = arg1;
                    arg1.method870(class180.field3566, class145.field2957, true);
                }
                if (class180.field3566 != null) {
                    if (class180.field3566.field450[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class180.field3566.field450[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class198 var6 = new class198(arg1, arg2);
                    var6.field3843 = new int[(class143.field2934 ? 2 : 1) * 256];
                    var6.field3852 = arg4;
                    var6.method1135(arg3);
                    var6.field3850 = 16384;
                    var6.method1138(var6.field3850);
                    if (class145.field2957 > 0 && class180.field3566 == null) {
                        class180.field3566 = new class22();
                        class180.field3566.field453 = arg1;
                        arg1.method870(class180.field3566, class145.field2957, true);
                    }
                    if (class180.field3566 != null) {
                        if (class180.field3566.field450[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class180.field3566.field450[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class194();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lkh;Z)V")
    public static final void method77(class97 arg0, boolean arg1) {
        field316++;
        class64.field1524 = arg0;
        if (!arg1) {
            field308 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class14() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
    public class14(byte[] arg0) {
        this.field312 = new class83[128];
        this.field309 = new byte[128];
        this.field317 = new byte[128];
        this.field300 = new int[128];
        this.field310 = new short[128];
        this.field303 = new byte[128];
        this.field321 = new class146[128];
        int var2 = 0;
        class189 var3 = new class189(arg0);
        while (var3.field3753[var3.field3752 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1204(true);
        }
        var2++;
        int var6 = 0;
        var3.field3752++;
        int var7 = var3.field3752;
        var3.field3752 += var2;
        while (var3.field3753[var3.field3752 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1204(true);
        }
        var6++;
        var3.field3752++;
        int var10 = var3.field3752;
        int var11 = 0;
        var3.field3752 += var6;
        while (var3.field3753[var3.field3752 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1204(true);
        }
        var3.field3752++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1202(126);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class146[] var18 = new class146[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class146 var102 = var18[var19] = new class146();
            int var103 = var3.method1202(113);
            if (var103 > 0) {
                var102.field2977 = new byte[var103 * 2];
            }
            int var104 = var3.method1202(-68);
            if (var104 > 0) {
                var102.field2989 = new byte[var104 * 2 + 2];
                var102.field2989[1] = 64;
            }
        }
        int var20 = var3.method1202(-77);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var3.method1202(101);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field3753[var3.field3752 + var22] != 0) {
            var22++;
        }
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method1204(true);
        }
        var22++;
        int var27 = 0;
        var3.field3752++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1202(115);
            this.field310[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1202(-125);
            this.field310[var30] = (short) (this.field310[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var3.method1178(2002251056);
            }
            this.field310[var34] = (short) (this.field310[var34] + class27.method198(32768, var33 - 1 << 14));
            this.field300[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field300[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var3.field3753[var7++] - 1;
                }
                this.field303[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field300[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field3753[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field317[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class146 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field300[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field321[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var47 < var25.length) {
                    var49 = var25[var47++];
                } else {
                    var49 = -1;
                }
                if (this.field300[var50] > 0) {
                    var48 = var3.method1202(-50) + 1;
                }
            }
            this.field309[var50] = (byte) var48;
            var49--;
        }
        this.field318 = var3.method1202(111) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class146 var99 = var18[var51];
            if (var99.field2977 != null) {
                for (int var100 = 1; var100 < var99.field2977.length; var100 += 2) {
                    var99.field2977[var100] = var3.method1204(true);
                }
            }
            if (var99.field2989 != null) {
                for (int var101 = 3; var101 < var99.field2989.length - 2; var101 += 2) {
                    var99.field2989[var101] = var3.method1204(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1204(true);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1204(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class146 var96 = var18[var54];
            if (var96.field2989 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2989.length; var98 += 2) {
                    var97 -= -var3.method1202(-68) - 1;
                    var96.field2989[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class146 var93 = var18[var55];
            if (var93.field2977 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2977.length; var95 += 2) {
                    var94 = var94 + var3.method1202(-69) + 1;
                    var93.field2977[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1202(112);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method1202(-38) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field309[var60] = (byte) (this.field309[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class141.method911(120, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field309[var67] = (byte) (this.field309[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field309[var63] = (byte) (this.field309[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1202(-57);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 += var3.method1202(-16) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field317[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field317[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var24[var74 + 1] << 1;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class141.method911(26, var78 - var71, var79);
                    int var83 = (this.field317[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var79 += var80 - var72;
                    this.field317[var81] = (byte) var83;
                }
                var72 = var80;
                var74 += 2;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field317[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field317[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2993 = var3.method1202(127);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class146 var92 = var18[var86];
            if (var92.field2977 != null) {
                var92.field2992 = var3.method1202(-39);
            }
            if (var92.field2989 != null) {
                var92.field2985 = var3.method1202(117);
            }
            if (var92.field2993 > 0) {
                var92.field2997 = var3.method1202(-73);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2983 = var3.method1202(125);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class146 var91 = var18[var88];
            if (var91.field2983 > 0) {
                var91.field2978 = var3.method1202(122);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class146 var90 = var18[var89];
            if (var90.field2978 > 0) {
                var90.field2974 = var3.method1202(-52);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method78(int arg0) {
        field304++;
        this.field300 = null;
        if (arg0 != 0) {
            this.method78(-39);
        }
    }
}
