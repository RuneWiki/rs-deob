import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class85 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lse;")
    private class139 field1078 = new class139();

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lse;")
    private class139 field1092 = new class139();

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Lse;")
    private class139 field1102 = new class139();

    @OriginalMember(owner = "client!as", name = "A", descriptor = "Lse;")
    private class139 field1104 = new class139();

    @OriginalMember(owner = "client!as", name = "C", descriptor = "Llf;")
    private class130 field1106 = new class130(4);

    @OriginalMember(owner = "client!as", name = "I", descriptor = "B")
    private byte field1112 = 0;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "I")
    public volatile int field1111 = 0;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public volatile int field1110 = 0;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "Llf;")
    private class130 field1109 = new class130(8);

    @OriginalMember(owner = "client!as", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1086 = new Rectangle[100];

    @OriginalMember(owner = "client!as", name = "m", descriptor = "[Lqr;")
    public static class41[] field1090;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Lbr;")
    public static class223 field1096;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[C")
    public static char[] field1098;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "J")
    private long field1108;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Lkg;")
    private class148 field1105;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "Lbo;")
    private class435 field1113;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)Z")
    public final boolean method495(byte arg0) {
        field1079++;
        if (arg0 == -47) {
            return this.method509(-1) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method496(int arg0) {
        field1086 = null;
        if (arg0 == 7850) {
            field1098 = null;
            field1090 = null;
            field1096 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III[BZIII[Lqr;Lvq;IZ)[I")
    public static final int[] method497(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, class41[] arg8, class269 arg9, int arg10, boolean arg11) {
        field1087++;
        int var12 = (arg5 & 0x7) * 8;
        int var13 = (arg10 & 0x7) * 8;
        if (!arg4) {
            class41 var14 = arg8[arg2];
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = class243.method1656(77, var16 & 0x7, arg7, var15 & 0x7) + arg0;
                    int var18 = arg6 + class282.method1947(var15 & 0x7, var16 & 0x7, (byte) -1, arg7);
                    if (var17 > 0 && var17 < class80.field1034 - 1 && var18 > 0 && (class381.field5414 - 1) > var18) {
                        var14.method279(var17, var18, !arg11);
                    }
                }
            }
        }
        byte var19;
        if (arg4) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        class130 var20 = new class130(arg3);
        int var21 = (arg5 & 0xFFFFFFF8) << 3;
        int var22 = (arg10 & 0xFFFFFFF8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg7 == 1) {
            var24 = 1;
        } else if (arg7 == 2) {
            var23 = 1;
            var24 = 1;
        } else if (arg7 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg1 != var25 || var12 > var58 || var58 > (var12 + 8) || var59 < var13 || var13 + 8 < var59) {
                        class371.method2386(9509, 0, 0, 0, -1, var20, arg4, 0, false, -1, 0, 0);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg7 == 0) {
                            var66 = var58 + arg0 - var12;
                            var67 = var59 + arg6 - var13;
                        } else if (arg7 == 1) {
                            var66 = arg0 + var59 - var13;
                            var67 = var12 + arg6 + 8 - var58;
                        } else if (arg7 == 2) {
                            var67 = var13 + arg6 + 8 - var59;
                            var66 = var12 + 8 - (var58 - arg0);
                        } else {
                            var66 = arg0 - var59 - (-var13 - 8);
                            var67 = var58 - (var12 - arg6);
                        }
                        class371.method2386(9509, 0, var22 + var59, 0, var67, var20, arg4, arg2, true, var66, 0, var21 + var58);
                    } else {
                        int var60 = arg0 + class243.method1656(40, var59 & 0x7, arg7, var58 & 0x7);
                        int var61 = class282.method1947(var58 & 0x7, var59 & 0x7, (byte) -1, arg7) + arg6;
                        class371.method2386(9509, var23, var22 + var59, arg7, var61, var20, arg4, arg2, false, var60, var24, var21 + var58);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg7 == 0) {
                                var65 = var62 + arg0 - var12;
                                var64 = arg6 - (var13 - var63);
                            } else if (arg7 == 1) {
                                var64 = arg6 + var12 + 8 - var62;
                                var65 = arg0 + var63 - var13;
                            } else if (arg7 == 2) {
                                var64 = var13 + arg6 + 8 - var63;
                                var65 = var12 + arg0 + 8 - var62;
                            } else {
                                var64 = arg6 - (var12 - var62);
                                var65 = arg0 - (var63 - var13 - 8);
                            }
                            if (var65 >= 0 && class80.field1034 > var65 && var64 >= 0 && class381.field5414 > var64) {
                                class207.field2975[arg2][var65][var64] = class207.field2975[arg2][var23 + var60][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        while (var20.field1851.length > var20.field1880) {
            int var27 = var20.method837(true);
            if (var27 == 128) {
                class296.field4284[0] = var20.method798(false);
                class296.field4284[1] = var20.method844(698527688);
                class296.field4284[2] = var20.method844(698527688);
                class296.field4284[3] = var20.method844(698527688);
                var26 = true;
                class296.field4284[4] = var20.method798(!arg11);
            } else {
                if (var27 != 129) {
                    var20.field1880--;
                    break;
                }
                if (class423.field6035 == null) {
                    class423.field6035 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method823((byte) -35);
                    if (var46 == 0 && class423.field6035[arg2] != null) {
                        if (var45 <= arg1) {
                            int var47 = arg0;
                            int var48 = arg0 + 7;
                            int var49 = arg6;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= class80.field1034) {
                                var48 = class80.field1034;
                            }
                            if (arg0 < 0) {
                                var47 = 0;
                            } else if (class80.field1034 <= arg0) {
                                var47 = class80.field1034;
                            }
                            int var50 = arg6 + 7;
                            if (arg6 < 0) {
                                var49 = 0;
                            } else if (arg6 >= class381.field5414) {
                                var49 = class381.field5414;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (class381.field5414 <= var50) {
                                var50 = class381.field5414;
                            }
                            while (var47 < var48) {
                                while (var49 < var50) {
                                    class423.field6035[arg2][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class423.field6035[arg2] == null) {
                            class423.field6035[arg2] = new byte[class80.field1034 + 1][class381.field5414 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method823((byte) 109);
                                if (arg1 >= var45) {
                                    for (int var54 = var51; var54 < (var51 + 4); var54++) {
                                        for (int var55 = var52; var55 < var52 + 4; var55++) {
                                            if (var54 >= var12 && var54 < (var12 + 8) && var13 <= var55 && var13 < var13 + 8) {
                                                int var56 = class243.method1656(58, var55 & 0x7, arg7, var54 & 0x7) + arg0;
                                                int var57 = class282.method1947(var54 & 0x7, var55 & 0x7, (byte) -1, arg7) + arg6;
                                                if (var56 >= 0 && class80.field1034 > var56 && var57 >= 0 && class381.field5414 > var57) {
                                                    class423.field6035[arg2][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var28 = false;
        if (!arg4) {
            class129 var29 = null;
            while (true) {
                while (var20.field1880 < var20.field1851.length) {
                    int var30 = var20.method837(true);
                    if (var30 == 0) {
                        var29 = new class129(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method837(arg11);
                        if (var31 > 0) {
                            for (int var32 = 0; var32 < var31; var32++) {
                                class78 var33 = new class78(var20);
                                if (var33.field999 == 31) {
                                    class197 var34 = class166.method1201(var20.method798(false), arg11);
                                    var33.method461(-59, var34.field2823, var34.field2820, var34.field2826, var34.field2822);
                                }
                                int var35 = var33.field5644 >> 7;
                                int var36 = var33.field5647 >> 7;
                                if (var33.field1010 == arg1 && var35 >= var12 && (var12 + 8) > var35 && var13 <= var36 && var36 < var13 + 8) {
                                    int var37 = (arg0 << 7) + class382.method2431(var33.field5644 & 0x3FF, arg7, -123, var33.field5647 & 0x3FF);
                                    int var38 = class175.method1239(var33.field5647 & 0x3FF, var33.field5644 & 0x3FF, (byte) 113, arg7) + (arg6 << 7);
                                    var33.field5644 = var37;
                                    var33.field5647 = var38;
                                    int var39 = var33.field5644 >> 7;
                                    int var40 = var33.field5647 >> 7;
                                    if (var39 >= 0 && var40 >= 0 && class80.field1034 > var39 && class381.field5414 > var40) {
                                        var33.field5643 = class207.field2975[arg1][var39][var40] - var33.field5643;
                                        if (arg9.method953() > 0) {
                                            class209.method1480(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var30 == 2) {
                        if (var29 == null) {
                            var29 = new class129();
                        }
                        var29.method791(var20, (byte) -100);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var29 != null) {
                    class378.method2414(var29, arg6 >> 3, arg0 >> 3, false);
                }
                break;
            }
        }
        if (!arg11) {
            return null;
        }
        if (!var28 && class423.field6035 != null && class423.field6035[arg2] != null) {
            int var41 = arg0 + 7;
            int var42 = arg6 + 7;
            for (int var43 = arg0; var43 < var41; var43++) {
                for (int var44 = arg6; var44 < var42; var44++) {
                    class423.field6035[arg2][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class296.field4284;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z")
    public final boolean method498(byte arg0) {
        if (arg0 != -17) {
            this.field1078 = null;
        }
        field1099++;
        return this.method505(arg0 ^ 0x4768) >= 20;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLkg;I)V")
    public final void method499(boolean arg0, class148 arg1, int arg2) {
        if (this.field1105 != null) {
            try {
                this.field1105.method1093(false);
            } catch (Exception var8) {
            }
            this.field1105 = null;
        }
        field1080++;
        this.field1105 = arg1;
        this.method511(0);
        this.method500(arg0, (byte) -114);
        this.field1109.field1880 = 0;
        this.field1113 = null;
        if (arg2 != 18339) {
            field1098 = null;
        }
        while (true) {
            class435 var4 = (class435) this.field1092.method1054((byte) -68);
            if (var4 == null) {
                while (true) {
                    class435 var5 = (class435) this.field1104.method1054((byte) -68);
                    if (var5 == null) {
                        if (this.field1112 != 0) {
                            try {
                                this.field1106.field1880 = 0;
                                this.field1106.method831(4, (byte) -57);
                                this.field1106.method831(this.field1112, (byte) 118);
                                this.field1106.method799(0, 81);
                                this.field1105.method1091(false, this.field1106.field1851, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field1105.method1093(false);
                                } catch (Exception var6) {
                                }
                                this.field1110 = -2;
                                this.field1111++;
                                this.field1105 = null;
                            }
                        }
                        this.field1107 = 0;
                        this.field1108 = class18.method107(-16145);
                        return;
                    }
                    this.field1102.method1055(var5, -75);
                }
            }
            this.field1078.method1055(var4, -75);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)V")
    public final void method500(boolean arg0, byte arg1) {
        field1081++;
        if (this.field1105 == null) {
            return;
        }
        try {
            this.field1106.field1880 = 0;
            this.field1106.method831(arg0 ? 2 : 3, (byte) -94);
            this.field1106.method826(0, false);
            this.field1105.method1091(false, this.field1106.field1851, 4, 0);
            if (arg1 != -114) {
                this.method511(-115);
            }
        } catch (IOException var4) {
            try {
                this.field1105.method1093(false);
            } catch (Exception var3) {
            }
            this.field1105 = null;
            this.field1111++;
            this.field1110 = -2;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIII)V")
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class215.method1510(arg6, -11397);
        field1101++;
        int var7 = arg5;
        int var8 = arg6 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class440.field6288[arg0];
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class5.method17(var15, var16, arg1, (byte) 66, arg2 - arg6);
        class5.method17(var15, var17, arg3, (byte) 122, var16);
        class5.method17(var15, arg2 + arg6, arg1, (byte) 82, var17);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class403.field5651[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class440.field6288[arg0 + var9];
                    int[] var19 = class440.field6288[arg0 - var9];
                    int var20 = class403.field5651[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class5.method17(var18, var24, arg1, (byte) 68, var22);
                    class5.method17(var18, var23, arg3, (byte) 80, var24);
                    class5.method17(var18, var21, arg1, (byte) 118, var23);
                    class5.method17(var19, var24, arg1, (byte) 126, var22);
                    class5.method17(var19, var23, arg3, (byte) 90, var24);
                    class5.method17(var19, var21, arg1, (byte) 102, var23);
                } else {
                    int[] var25 = class440.field6288[arg0 + var9];
                    int[] var26 = class440.field6288[arg0 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class5.method17(var25, var27, arg1, (byte) 82, var28);
                    class5.method17(var26, var27, arg1, (byte) 125, var28);
                }
            }
            int[] var29 = class440.field6288[arg0 + var7];
            int[] var30 = class440.field6288[arg0 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class403.field5651[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class5.method17(var29, var35, arg1, (byte) 74, var32);
                class5.method17(var29, var34, arg3, (byte) 73, var35);
                class5.method17(var29, var31, arg1, (byte) 107, var34);
                class5.method17(var30, var35, arg1, (byte) 114, var32);
                class5.method17(var30, var34, arg3, (byte) 73, var35);
                class5.method17(var30, var31, arg1, (byte) 113, var34);
            } else {
                class5.method17(var29, var31, arg1, (byte) 110, var32);
                class5.method17(var30, var31, arg1, (byte) 116, var32);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
    public final void method502(int arg0) {
        try {
            this.field1105.method1093(false);
        } catch (Exception var2) {
        }
        if (arg0 != 0) {
            field1086 = null;
        }
        field1095++;
        this.field1112 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1111++;
        this.field1110 = -1;
        this.field1105 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILn;II)V")
    public static final void method503(int arg0, int arg1, int arg2, class13 arg3, int arg4, int arg5) {
        field1084++;
        if (arg3.field188 == -1 && arg3.field190 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class170.field2398 * arg3.field192 >> 8;
        if (arg0 > arg3.field180) {
            var6 += arg0 - arg3.field180;
        } else if (arg3.field181 > arg0) {
            var6 += arg3.field181 - arg0;
        }
        if (arg2 >= -17) {
            method513(-103, -10);
        }
        if (arg3.field199 < arg4) {
            var6 += arg4 - arg3.field199;
        } else if (arg3.field191 > arg4) {
            var6 += arg3.field191 - arg4;
        }
        if (arg3.field195 == 0 || (var6 - 64) > arg3.field195 || class170.field2398 == 0 || arg3.field203 != arg5) {
            if (arg3.field178 != null) {
                class378.field5380.method2296(arg3.field178);
                arg3.field178 = null;
            }
            if (arg3.field183 != null) {
                class378.field5380.method2296(arg3.field183);
                arg3.field183 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field195 - var6) * var7 / arg3.field195;
        if (arg3.field178 != null) {
            arg3.field178.method1675(var8);
        } else if (arg3.field188 >= 0) {
            class383 var9 = class383.method2436(class119.field1609, arg3.field188, 0);
            if (var9 != null) {
                class272 var10 = var9.method2438().method1859(class168.field2381);
                class244 var11 = class244.method1695(var10, 100, var8);
                var11.method1693(-1);
                class378.field5380.method2291(var11);
                arg3.field178 = var11;
            }
        }
        if (arg3.field183 != null) {
            arg3.field183.method1675(var8);
            if (arg3.field183.method2662((byte) 116)) {
                return;
            }
            arg3.field183 = null;
        } else if (arg3.field190 != null && (arg3.field198 -= arg1) <= 0) {
            int var12 = (int) ((double) arg3.field190.length * Math.random());
            class383 var13 = class383.method2436(class119.field1609, arg3.field190[var12], 0);
            if (var13 != null) {
                class272 var14 = var13.method2438().method1859(class168.field2381);
                class244 var15 = class244.method1695(var14, 100, var8);
                var15.method1693(0);
                class378.field5380.method2291(var15);
                arg3.field183 = var15;
                arg3.field198 = (int) (Math.random() * (double) (arg3.field185 - arg3.field193)) + arg3.field193;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IBZIB)Lbo;")
    public final class435 method504(int arg0, byte arg1, boolean arg2, int arg3, byte arg4) {
        field1082++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class435 var8 = new class435();
        var8.field6349 = arg2;
        var8.field6212 = arg4;
        var8.field5232 = var6;
        if (arg1 != 101) {
            this.method504(-58, (byte) 105, false, 55, (byte) 74);
        }
        if (arg2) {
            if (this.method505(-18297) >= 20) {
                throw new RuntimeException();
            }
            this.field1078.method1055(var8, arg1 - 215);
        } else if (this.method509(-1) < 20) {
            this.field1102.method1055(var8, -70);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
    public final int method505(int arg0) {
        if (arg0 == -18297) {
            field1085++;
            return this.field1078.method1059(0) + this.field1092.method1059(0);
        } else {
            return 44;
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)Z")
    public final boolean method506(int arg0) {
        if (this.field1105 != null) {
            long var2 = class18.method107(-16145);
            int var4 = (int) (var2 - this.field1108);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1108 = var2;
            this.field1107 += var4;
            if (this.field1107 > 30000) {
                try {
                    this.field1105.method1093(false);
                } catch (Exception var27) {
                }
                this.field1105 = null;
            }
        }
        field1089++;
        if (this.field1105 == null) {
            return this.method505(-18297) == 0 && this.method509(-1) == 0;
        }
        try {
            this.field1105.method1092(arg0 - 1336376348);
            for (class435 var5 = (class435) this.field1078.method1053(68); var5 != null; var5 = (class435) this.field1078.method1058(127)) {
                this.field1106.field1880 = 0;
                this.field1106.method831(1, (byte) 114);
                this.field1106.method826((int) var5.field5232, false);
                this.field1105.method1091(false, this.field1106.field1851, 4, 0);
                this.field1092.method1055(var5, arg0 ^ 0xB0588470);
            }
            for (class435 var6 = (class435) this.field1102.method1053(arg0 ^ 0x4FA77B9C); var6 != null; var6 = (class435) this.field1102.method1058(122)) {
                this.field1106.field1880 = 0;
                this.field1106.method831(0, (byte) 127);
                this.field1106.method826((int) var6.field5232, false);
                this.field1105.method1091(false, this.field1106.field1851, 4, 0);
                this.field1104.method1055(var6, 106);
            }
            if (arg0 != 1336376240) {
                field1094 = 114;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1105.method1089((byte) -127);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1107 = 0;
                byte var9 = 0;
                if (this.field1113 == null) {
                    var9 = 8;
                } else if (this.field1113.field6208 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1109.field1880;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field1105.method1096(var10, this.field1109.field1851, arg0 ^ 0xB058844F, this.field1109.field1880);
                    if (this.field1112 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1109.field1851[this.field1109.field1880 + var11] = (byte) class417.method2632(this.field1109.field1851[this.field1109.field1880 + var11], this.field1112);
                        }
                    }
                    this.field1109.field1880 += var10;
                    if (var9 <= this.field1109.field1880) {
                        if (this.field1113 == null) {
                            this.field1109.field1880 = 0;
                            int var12 = this.field1109.method837(true);
                            int var13 = this.field1109.method798(false);
                            int var14 = this.field1109.method837(true);
                            int var15 = this.field1109.method815(true);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class435 var21;
                            if (var17) {
                                for (var21 = (class435) this.field1104.method1053(70); var21 != null && var21.field5232 != var18; var21 = (class435) this.field1104.method1058(-50)) {
                                }
                            } else {
                                for (var21 = (class435) this.field1092.method1053(78); var21 != null && var21.field5232 != var18; var21 = (class435) this.field1092.method1058(127)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1113 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field1113.field6216 = new class130(var15 - (-var22 - this.field1113.field6212));
                            this.field1113.field6216.method831(var16, (byte) 120);
                            this.field1113.field6216.method849(var15, (byte) -53);
                            this.field1113.field6208 = 8;
                            this.field1109.field1880 = 0;
                        } else if (this.field1113.field6208 != 0) {
                            throw new IOException();
                        } else if (this.field1109.field1851[0] == -1) {
                            this.field1113.field6208 = 1;
                            this.field1109.field1880 = 0;
                        } else {
                            this.field1113 = null;
                        }
                    }
                } else {
                    int var23 = this.field1113.field6216.field1851.length - this.field1113.field6212;
                    int var24 = 512 - this.field1113.field6208;
                    if ((var23 - this.field1113.field6216.field1880) < var24) {
                        var24 = var23 - this.field1113.field6216.field1880;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field1105.method1096(var24, this.field1113.field6216.field1851, -1, this.field1113.field6216.field1880);
                    if (this.field1112 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1113.field6216.field1851[this.field1113.field6216.field1880 + var25] = (byte) class417.method2632(this.field1113.field6216.field1851[this.field1113.field6216.field1880 + var25], this.field1112);
                        }
                    }
                    this.field1113.field6208 += var24;
                    this.field1113.field6216.field1880 += var24;
                    if (this.field1113.field6216.field1880 == var23) {
                        this.field1113.method2365(true);
                        this.field1113.field6348 = false;
                        this.field1113 = null;
                    } else if (this.field1113.field6208 == 512) {
                        this.field1113.field6208 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1105.method1093(false);
            } catch (Exception var26) {
            }
            this.field1110 = -2;
            this.field1105 = null;
            this.field1111++;
            return this.method505(-18297) == 0 && this.method509(arg0 ^ 0xB058844F) == 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
    public final void method507(int arg0) {
        field1083++;
        if (this.field1105 == null) {
            return;
        }
        try {
            this.field1106.field1880 = 0;
            this.field1106.method831(7, (byte) -32);
            this.field1106.method826(0, false);
            this.field1105.method1091(false, this.field1106.field1851, 4, 0);
        } catch (IOException var3) {
            try {
                this.field1105.method1093(false);
            } catch (Exception var2) {
            }
            this.field1111++;
            this.field1105 = null;
            this.field1110 = -2;
        }
        if (arg0 <= 8) {
            method497(-87, -63, 127, (byte[]) null, true, 99, -51, -108, (class41[]) null, (class269) null, -68, true);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public final void method508(boolean arg0) {
        field1097++;
        if (this.field1105 != null) {
            this.field1105.method1093(false);
        }
        if (!arg0) {
            this.method505(-44);
        }
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)I")
    private final int method509(int arg0) {
        if (arg0 == -1) {
            field1100++;
            return this.field1102.method1059(0) + this.field1104.method1059(0);
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
    public static final void method510(int arg0, int arg1) {
        field1088++;
        class276 var2 = class264.method1816((byte) -110, arg0, arg1);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!as", name = "g", descriptor = "(I)V")
    private final void method511(int arg0) {
        field1091++;
        if (this.field1105 == null) {
            return;
        }
        try {
            this.field1106.field1880 = arg0;
            this.field1106.method831(6, (byte) 112);
            this.field1106.method826(3, false);
            this.field1105.method1091(false, this.field1106.field1851, 4, 0);
        } catch (IOException var3) {
            try {
                this.field1105.method1093(false);
            } catch (Exception var2) {
            }
            this.field1110 = -2;
            this.field1105 = null;
            this.field1111++;
        }
    }

    @OriginalMember(owner = "client!as", name = "h", descriptor = "(I)V")
    public final void method512(int arg0) {
        field1093++;
        if (this.field1105 != null) {
            this.field1105.method1099(4);
        }
        if (arg0 != 4) {
            this.field1092 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
    public static final void method513(int arg0, int arg1) {
        field1103++;
        class285.field4152.method91(4, arg0);
        if (arg1 <= 98) {
            method497(107, 63, 28, (byte[]) null, true, 83, -11, -68, (class41[]) null, (class269) null, 5, true);
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1086[var0] = new Rectangle();
        }
        field1090 = new class41[4];
        field1096 = null;
        field1098 = new char[] { '[', ']', '#' };
    }
}
