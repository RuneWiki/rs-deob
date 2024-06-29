import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class429 {

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "[B")
    private byte[] field6315;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
    private int[] field6321;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
    private int[] field6312;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6319 = "Loaded textures";

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "[Ljr;")
    public static class57[] field6320;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method2654(int arg0) {
        if (arg0 != 1603297761) {
            field6319 = null;
        }
        field6319 = null;
        field6320 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([BII[BII)I")
    public final int method2655(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field6310++;
        int var7 = 0;
        int var8 = arg5 << 3;
        if (arg4 != -5775) {
            this.field6321 = null;
        }
        int var9 = arg1 + arg2;
        while (arg1 < var9) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field6321[var10];
            byte var12 = this.field6315[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class35.method227(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method2656(int arg0, int arg1, int arg2, String arg3, String arg4, String arg5) {
        field6316++;
        class102.method764(arg0, (String) null, -4461, arg3, arg1, arg5, arg2, arg4);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2657(String arg0, int arg1) {
        field6311++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 < 91) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method2658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = 89 % ((arg6 - 68) / 50);
        field6314++;
        int var9 = arg3 - arg1;
        int var10 = arg1 + arg4;
        for (int var11 = arg4; var11 < var10; var11++) {
            class256.method1769(arg5, class277.field4414[var11], (byte) 120, arg7, arg2);
        }
        int var12 = arg1 + arg2;
        int var13 = arg5 - arg1;
        for (int var14 = arg3; var14 > var9; var14--) {
            class256.method1769(arg5, class277.field4414[var14], (byte) 116, arg7, arg2);
        }
        for (int var15 = var10; var15 <= var9; var15++) {
            int[] var16 = class277.field4414[var15];
            class256.method1769(var12, var16, (byte) 72, arg7, arg2);
            class256.method1769(var13, var16, (byte) 106, arg0, var12);
            class256.method1769(arg5, var16, (byte) 60, arg7, var13);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method2659(String arg0, String arg1, int arg2, int arg3) {
        class336.field5222 = arg0;
        class70.field866 = arg2;
        field6317++;
        class232.field3852 = arg1;
        if (class336.field5222.equals("") || class232.field3852.equals("")) {
            class357.field5463 = 3;
        } else if (class155.field2434 == -1) {
            class426.field6281 = 1;
            class422.field6226 = 0;
            class357.field5463 = -3;
            class325.field5106 = 0;
            class186 var4 = new class186(128);
            var4.method1312(10, -56);
            var4.method1315((int) (Math.random() * 9.9999999E7D), (byte) 44);
            var4.method1318(0, class158.method1112(class336.field5222, (byte) -34));
            var4.method1315((int) (Math.random() * 9.9999999E7D), (byte) 44);
            var4.method1301(class232.field3852, 111);
            var4.method1315((int) (Math.random() * 9.9999999E7D), (byte) 98);
            var4.method1308((byte) -76, class336.field5223, class325.field5095);
            class11.field139.field3044 = 0;
            class11.field139.method1312(24, arg3 ^ 0x35DF);
            class11.field139.method1312(var4.field3044 + 2, -83);
            class11.field139.method1283(8, 564);
            if (arg3 != -13745) {
                field6320 = null;
            }
            class11.field139.method1269(false, 0, var4.field3066, var4.field3044);
        } else {
            class42.method281(-126);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLmo;Lmo;)V")
    public static final void method2660(byte arg0, class447 arg1, class447 arg2) {
        class391.field5876 = arg2;
        class342.field5276 = arg1;
        field6318++;
        if (arg0 != 40) {
            method2659((String) null, (String) null, 117, -127);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[B[BIII)I")
    public final int method2661(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6313++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg4;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var7 = this.field6312[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var12;
            if ((var12 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var13;
            if ((var13 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var14;
            if ((var14 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var15;
            if ((var15 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var16;
            if ((var16 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var17;
            if ((var17 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6312[var7];
            }
            int var18;
            if ((var18 = this.field6312[var7]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg0 != 1) {
            field6320 = null;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([B)V")
    public class429(byte[] arg0) {
        int var2 = arg0.length;
        this.field6315 = arg0;
        this.field6321 = new int[var2];
        this.field6312 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6321[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class35.method227(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field6312[var14] == 0) {
                            this.field6312[var14] = var4;
                        }
                        var14 = this.field6312[var14];
                    }
                    if (var14 >= this.field6312.length) {
                        int[] var17 = new int[this.field6312.length * 2];
                        for (int var18 = 0; var18 < this.field6312.length; var18++) {
                            var17[var18] = this.field6312[var18];
                        }
                        this.field6312 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field6312[var14] = ~var5;
            }
        }
    }
}
