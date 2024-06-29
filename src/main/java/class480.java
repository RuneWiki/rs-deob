import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class480 extends class130 {

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[B")
    public byte[] field7042;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "[B")
    public byte[] field7047;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[S")
    public short[] field7041;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[B")
    public byte[] field7036;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
    private int[] field7045;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lrm;")
    public class79[] field7039;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "[Lwv;")
    public class321[] field7044;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field7040;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "[B")
    public static byte[] field7046 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
    public static int[] field7049;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field7051;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "[I")
    public static int[] field7043;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method2897(byte arg0) {
        field7049 = null;
        if (arg0 != 17) {
            method2897((byte) 39);
        }
        field7051 = null;
        field7043 = null;
        field7046 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([I[BLao;I)Z")
    public final boolean method2898(int[] arg0, byte[] arg1, class303 arg2, int arg3) {
        field7038++;
        if (arg3 > -102) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class79 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field7045[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2005(arg0, var9 >> 2, (byte) 109);
                        } else {
                            var7 = arg2.method2007(var9 >> 2, 0, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field7039[var8] = var7;
                        this.field7045[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public final void method2899(byte arg0) {
        field7048++;
        this.field7045 = null;
        int var2 = -62 % ((-arg0 - 47) / 59);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class480() {
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
    public class480(byte[] arg0) {
        this.field7042 = new byte[128];
        this.field7047 = new byte[128];
        this.field7041 = new short[128];
        this.field7036 = new byte[128];
        this.field7045 = new int[128];
        this.field7039 = new class79[128];
        this.field7044 = new class321[128];
        class194 var2 = new class194(arg0);
        int var3;
        for (var3 = 0; var2.field2973[var2.field2982 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1398(29);
        }
        var3++;
        var2.field2982++;
        int var6 = var2.field2982;
        var2.field2982 += var3;
        int var7;
        for (var7 = 0; var2.field2973[var2.field2982 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1398(85);
        }
        var7++;
        var2.field2982++;
        int var10 = var2.field2982;
        var2.field2982 += var7;
        int var11;
        for (var11 = 0; var2.field2973[var2.field2982 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1398(66);
        }
        var11++;
        var2.field2982++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1337((byte) -108);
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
        class321[] var19 = new class321[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class321 var103 = var19[var20] = new class321();
            int var104 = var2.method1337((byte) -127);
            if (var104 > 0) {
                var103.field4865 = new byte[var104 * 2];
            }
            int var105 = var2.method1337((byte) 27);
            if (var105 > 0) {
                var103.field4861 = new byte[var105 * 2 + 2];
                var103.field4861[1] = 64;
            }
        }
        int var21 = var2.method1337((byte) -118);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1337((byte) -127);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field2973[var2.field2982 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1398(126);
        }
        var25++;
        var2.field2982++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1337((byte) 15);
            this.field7041[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1337((byte) 123);
            this.field7041[var31] = (short) (this.field7041[var31] + (var30 << 8));
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
                var34 = var2.method1372(false);
            }
            this.field7041[var35] = (short) (this.field7041[var35] + (class307.method2028(2, var34 - 1) << 14));
            this.field7045[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field7045[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field2973[var6++] - 1;
                }
                this.field7047[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field7045[var43] != 0) {
                if (var41 == 0) {
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field2973[var10++] + 16 << 2;
                }
                this.field7036[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class321 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field7045[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field7044[var47] = var46;
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
                if (this.field7045[var51] > 0) {
                    var50 = var2.method1337((byte) 52) + 1;
                }
            }
            var49--;
            this.field7042[var51] = (byte) var50;
        }
        this.field7040 = var2.method1337((byte) 15) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class321 var100 = var19[var52];
            if (var100.field4865 != null) {
                for (int var101 = 1; var101 < var100.field4865.length; var101 += 2) {
                    var100.field4865[var101] = var2.method1398(111);
                }
            }
            if (var100.field4861 != null) {
                for (int var102 = 3; var102 < var100.field4861.length - 2; var102 += 2) {
                    var100.field4861[var102] = var2.method1398(65);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1398(39);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1398(71);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class321 var97 = var19[var55];
            if (var97.field4861 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4861.length; var99 += 2) {
                    var98 = var98 + var2.method1337((byte) 19) + 1;
                    var97.field4861[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class321 var94 = var19[var56];
            if (var94.field4865 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4865.length; var96 += 2) {
                    var95 += var2.method1337((byte) 126) + 1;
                    var94.field4865[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1337((byte) -126);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method1337((byte) -127) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field7042[var61] = (byte) (this.field7042[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class503.method2997(var67, var65 - var59, -12294);
                    var67 += var66 - var60;
                    this.field7042[var68] = (byte) (this.field7042[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field7042[var64] = (byte) (this.field7042[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method1337((byte) 52);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method1337((byte) -121) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field7036[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field7036[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class503.method2997(var81, var79 - var72, -12294);
                    int var84 = (this.field7036[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field7036[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field7036[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field7036[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field4870 = var2.method1337((byte) -114);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class321 var93 = var19[var87];
            if (var93.field4865 != null) {
                var93.field4864 = var2.method1337((byte) -114);
            }
            if (var93.field4861 != null) {
                var93.field4855 = var2.method1337((byte) -2);
            }
            if (var93.field4870 > 0) {
                var93.field4868 = var2.method1337((byte) -122);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field4869 = var2.method1337((byte) 53);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class321 var92 = var19[var89];
            if (var92.field4869 > 0) {
                var92.field4871 = var2.method1337((byte) 89);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class321 var91 = var19[var90];
            if (var91.field4871 > 0) {
                var91.field4862 = var2.method1337((byte) -118);
            }
        }
    }

    static {
        new class179("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field7049 = new int[4096];
        field7050 = -1;
    }
}
