import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class12 {

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "[B")
    public byte[] field142;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[Lpd;")
    public class168[] field126;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "[Lqf;")
    public class181[] field133;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
    public byte[] field135;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "[B")
    public byte[] field144;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "[S")
    public short[] field130;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "[[I")
    public static int[][] field136 = new int[104][104];

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "Lkh;")
    public static class117 field134 = class224.method1450((byte) -15, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Lkh;")
    public static class117 field141 = class224.method1450((byte) -104, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Lkh;")
    public static class117 field124 = class224.method1450((byte) -14, "Mem:");

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field138 = 50;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "Lnb;")
    public static class144 field139;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method55(int arg0) {
        field141 = null;
        field134 = null;
        field124 = null;
        field136 = null;
        if (arg0 == 2) {
            field139 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLpa;[B[I)Z")
    public final boolean method56(byte arg0, class165 arg1, byte[] arg2, int[] arg3) {
        if (arg0 < 122) {
            return false;
        }
        field140++;
        boolean var5 = true;
        int var6 = 0;
        class168 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field129[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1166(var9 >> 2, arg3, -123);
                        } else {
                            var7 = arg1.method1170(arg3, var9 >> 2, (byte) -103);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field126[var8] = var7;
                        this.field129[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public static final int method57(int arg0, int arg1) {
        field137++;
        class244 var2 = class161.method1144(arg0, (byte) 88);
        int var3 = var2.field4496;
        if (arg1 >= -28) {
            return 85;
        } else {
            int var4 = var2.field4503;
            int var5 = var2.field4500;
            int var6 = class72.field1385[var4 - var5];
            return var6 & class141.field2561[var3] >> var5;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILeg;I)V")
    public static final void method58(int arg0, class52 arg1, int arg2) {
        if (arg0 != 0) {
            field138 = -110;
        }
        field125++;
        while (true) {
            class150 var3 = (class150) class14.field435.method314((byte) -26);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2724; var5++) {
                if (var3.field2729[var5] != null) {
                    if (var3.field2729[var5].field1262 == 2) {
                        var3.field2728[var5] = -5;
                    }
                    if (var3.field2729[var5].field1262 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2722[var5] != null) {
                    if (var3.field2722[var5].field1262 == 2) {
                        var3.field2728[var5] = -6;
                    }
                    if (var3.field2722[var5].field1262 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method400(arg2, arg0 + 8);
            arg1.method1002(false, 0);
            int var6 = arg1.field2643;
            arg1.method1024(-51, var3.field2725);
            for (int var7 = 0; var7 < var3.field2724; var7++) {
                if (var3.field2728[var7] == 0) {
                    try {
                        int var8 = var3.field2723[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2729[var7].field1259;
                            int var10 = var9.getInt(null);
                            arg1.method1002(false, 0);
                            arg1.method1024(-63, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2729[var7].field1259;
                            var11.setInt(null, var3.field2737[var7]);
                            arg1.method1002(false, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2729[var7].field1259;
                            int var13 = var12.getModifiers();
                            arg1.method1002(false, 0);
                            arg1.method1024(arg0 ^ 0xFFFFFF93, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2722[var7].field1259;
                            byte[][] var17 = var3.field2735[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method1002(false, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method1002(false, 1);
                                arg1.method1000((byte) 39, ((Number) var21).longValue());
                            } else if (var21 instanceof class117) {
                                arg1.method1002(false, 2);
                                arg1.method1027(arg0 + 32768, (class117) var21);
                            } else {
                                arg1.method1002(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2722[var7].field1259;
                            int var15 = var14.getModifiers();
                            arg1.method1002(false, 0);
                            arg1.method1024(-44, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1002(false, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1002(false, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1002(false, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1002(false, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1002(false, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1002(false, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1002(false, -16);
                    } catch (SecurityException var29) {
                        arg1.method1002(false, -17);
                    } catch (IOException var30) {
                        arg1.method1002(false, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1002(false, -19);
                    } catch (Exception var32) {
                        arg1.method1002(false, -20);
                    } catch (Throwable var33) {
                        arg1.method1002(false, -21);
                    }
                } else {
                    arg1.method1002(false, var3.field2728[var7]);
                }
            }
            arg1.method1021(var6, true);
            arg1.method1007(arg1.field2643 - var6, true);
            var3.method123((byte) -126);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLnc;)Lkh;")
    public static final class117 method59(byte arg0, class145 arg1) {
        field143++;
        if (arg0 != -116) {
            field139 = null;
        }
        return class141.method959((byte) 125, 32767, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public final void method60(byte arg0) {
        this.field129 = null;
        if (arg0 == 20) {
            field123++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class8() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        this.field142 = new byte[128];
        this.field129 = new int[128];
        this.field126 = new class168[128];
        this.field133 = new class181[128];
        this.field135 = new byte[128];
        this.field144 = new byte[128];
        this.field130 = new short[128];
        class145 var2 = new class145(arg0);
        int var3;
        for (var3 = 0; var2.field2613[var2.field2643 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method994((byte) 119);
        }
        var3++;
        var2.field2643++;
        int var6 = 0;
        int var7 = var2.field2643;
        var2.field2643 += var3;
        while (var2.field2613[var2.field2643 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method994((byte) 72);
        }
        var2.field2643++;
        int var10 = var2.field2643;
        var6++;
        int var11 = 0;
        var2.field2643 += var6;
        while (var2.field2613[var2.field2643 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method994((byte) 79);
        }
        var2.field2643++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method998(98);
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
        class181[] var19 = new class181[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class181 var103 = var19[var20] = new class181();
            int var104 = var2.method998(61);
            if (var104 > 0) {
                var103.field3282 = new byte[var104 * 2];
            }
            int var105 = var2.method998(81);
            if (var105 > 0) {
                var103.field3275 = new byte[var105 * 2 + 2];
                var103.field3275[1] = 64;
            }
        }
        int var21 = var2.method998(109);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method998(107);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field2613[var2.field2643 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method994((byte) 30);
        }
        var25++;
        var2.field2643++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method998(78);
            this.field130[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method998(89);
            this.field130[var31] = (short) (this.field130[var31] + (var30 << 8));
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
                var34 = var2.method1048(16);
            }
            this.field130[var35] = (short) (this.field130[var35] + class209.method1370(var34 - 1 << 14, 32768));
            this.field129[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field129[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var38) {
                        var36 = -1;
                    } else {
                        var36 = var4[var38++];
                    }
                    var37 = var2.field2613[var7++] - 1;
                }
                var36--;
                this.field142[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field129[var43] != 0) {
                if (var42 == 0) {
                    if (var40 < var8.length) {
                        var42 = var8[var40++];
                    } else {
                        var42 = -1;
                    }
                    var41 = var2.field2613[var10++] + 16 << 2;
                }
                this.field135[var43] = (byte) var41;
                var42--;
            }
        }
        int var44 = 0;
        class181 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field129[var47] != 0) {
                if (var44 == 0) {
                    var45 = var19[var14[var46]];
                    if (var46 < var12.length) {
                        var44 = var12[var46++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field133[var47] = var45;
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
                if (this.field129[var51] > 0) {
                    var50 = var2.method998(120) + 1;
                }
            }
            this.field144[var51] = (byte) var50;
            var49--;
        }
        this.field127 = var2.method998(70) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class181 var100 = var19[var52];
            if (var100.field3282 != null) {
                for (int var101 = 1; var101 < var100.field3282.length; var101 += 2) {
                    var100.field3282[var101] = var2.method994((byte) 91);
                }
            }
            if (var100.field3275 != null) {
                for (int var102 = 3; var102 < var100.field3275.length - 2; var102 += 2) {
                    var100.field3275[var102] = var2.method994((byte) 109);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method994((byte) 53);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method994((byte) 31);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class181 var97 = var19[var55];
            if (var97.field3275 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3275.length; var99 += 2) {
                    var98 = var98 + var2.method998(66) + 1;
                    var97.field3275[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class181 var94 = var19[var56];
            if (var94.field3282 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3282.length; var96 += 2) {
                    var95 += var2.method998(69) + 1;
                    var94.field3282[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method998(80);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method998(62) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field144[var61] = (byte) (this.field144[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                var62 += 2;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class103.method697(var66 - var59, 2676, var67);
                    this.field144[var68] = (byte) (this.field144[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field144[var64] = (byte) (this.field144[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method998(84);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method998(59) + 1;
                var24[var71] = (byte) var70;
            }
            int var72 = var24[1] << 1;
            byte var73 = var24[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field135[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field135[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = (var79 - var73) / 2 + (var79 - var73) * var72;
                int var81 = var24[var75 + 1] << 1;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class103.method697(var79 - var73, 2676, var80);
                    var80 += var81 - var72;
                    int var84 = (this.field135[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field135[var82] = (byte) var84;
                }
                var73 = var79;
                var75 += 2;
                var72 = var81;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field135[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field135[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3286 = var2.method998(70);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class181 var93 = var19[var87];
            if (var93.field3282 != null) {
                var93.field3279 = var2.method998(68);
            }
            if (var93.field3275 != null) {
                var93.field3270 = var2.method998(88);
            }
            if (var93.field3286 > 0) {
                var93.field3267 = var2.method998(57);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3280 = var2.method998(70);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class181 var92 = var19[var89];
            if (var92.field3280 > 0) {
                var92.field3278 = var2.method998(69);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class181 var91 = var19[var90];
            if (var91.field3278 > 0) {
                var91.field3273 = var2.method998(61);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
    public static final void method61(byte arg0) {
        class56.field1148.method503(10);
        field145++;
        int var1 = 64 % ((-arg0 - 2) / 63);
    }
}
