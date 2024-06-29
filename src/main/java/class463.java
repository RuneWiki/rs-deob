import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class463 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public int field6314 = 2;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field6308 = -1;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public int field6318 = -1;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public int field6321 = -1;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public int field6325 = 0;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
    public boolean field6327 = false;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Z")
    public boolean field6323 = false;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public int field6316 = -1;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Z")
    public boolean field6317 = false;

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
    public int field6334 = 5;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public int field6332 = -1;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public int field6326 = 99;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "Z")
    public boolean field6335 = false;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
    public int field6329;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lwm;")
    public class129 field6320;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "Ljava/awt/Frame;")
    public static Frame field6333;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fq", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6336;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[I")
    public int[] field6307;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "[I")
    public int[] field6319;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "[I")
    private int[] field6328;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[Z")
    public boolean[] field6311;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[[I")
    public int[][] field6310;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2628(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2618(int arg0) {
        field6330++;
        if (class380.field5452 == null) {
            class380.field5452 = class38.method225((byte) -108);
            class119.field1526 = class380.field5452[0];
        }
        if (arg0 != -5823) {
            field6333 = null;
        }
        class38 var1 = class119.field1526;
        int var2 = class407.method2401(false);
        if (class119.field1526 == var1) {
            class75.field953 = class119.field1526.field387.method1491(class350.field5121, (byte) 126);
            if (class119.field1526.field382) {
                class75.field953 = class75.field953 + var2 + "%";
            }
            class556.field7597 = class119.field1526.field378;
        } else if (class38.field417 == class119.field1526) {
            class676.method3739(-22149, 3);
        } else {
            class75.field953 = var1.field385.method1491(class350.field5121, (byte) 126);
            class556.field7597 = var1.field380;
        }
        if (class241.field3153 == null) {
            return;
        }
        for (int var3 = class58.field816 + 1; var3 < class241.field3153.length; var3++) {
            if (class241.field3153[var3].method35(arg0 + 24165) >= 100 && (var3 - 1) == class58.field816 && class476.field6436 >= 1 && class241.field3153[var3].method36((byte) 72)) {
                class241.field3153[var3].method39(arg0 + 5938);
                class536.method3030(12667, class241.field3153[var3]);
                class58.field816++;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V", line = 74)
    public static void method2619(boolean arg0) {
        field6333 = null;
        if (!arg0) {
            field6333 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 84)
    public final void method2620(int arg0) {
        int var2 = -54 % ((80 - arg0) / 33);
        if (this.field6318 == -1) {
            if (this.field6311 == null) {
                this.field6318 = 0;
            } else {
                this.field6318 = 2;
            }
        }
        if (this.field6316 == -1) {
            if (this.field6311 == null) {
                this.field6316 = 0;
            } else {
                this.field6316 = 2;
            }
        }
        field6331++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZBLba;IIII)Lba;", line = 117)
    public final class629 method2621(int arg0, boolean arg1, byte arg2, class629 arg3, int arg4, int arg5, int arg6, int arg7) {
        field6309++;
        int var9 = this.field6319[arg4];
        int var10 = this.field6307[arg4];
        class495 var11 = this.field6320.method774(var10 >> 16, -121);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg3.method659(arg2, arg0, true);
        }
        class495 var13 = null;
        if ((this.field6327 || class425.field5919) && arg6 != -1 && arg6 < this.field6307.length) {
            int var14 = this.field6307[arg6];
            var13 = this.field6320.method774(var14 >> 16, -125);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field6335) {
            arg0 |= 0x200;
        }
        if (var11.method2792(0, var12)) {
            arg0 |= 0x80;
        }
        if (var11.method2791(9675, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method2796(var12, (byte) 38)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2792(0, arg6)) {
                arg0 |= 0x80;
            }
            if (var13.method2791(9675, arg6)) {
                arg0 |= 0x100;
            }
            if (var13.method2796(arg6, (byte) 38)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class629 var16 = arg3.method659(arg2, var15, true);
        var16.method3437(arg5, arg6, arg1, var9, arg7 - 1, var11, var13, this.field6335, var12);
        return var16;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIILsl;IIIIIII)Z", line = 180)
    public static final boolean method2622(int arg0, int arg1, int arg2, class245 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6324++;
        int var11 = arg8;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        if (arg2 != 256) {
            method2619(false);
        }
        class98.field1203[var13][var14] = 99;
        int var16 = arg6 - var14;
        class235.field3070[var13][var14] = 0;
        byte var17 = 0;
        class63.field859[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class303.field4035[var10001] = arg6;
        int[][] var19 = arg3.field3300;
        while (var26 != var18) {
            var12 = class303.field4035[var18];
            var11 = class63.field859[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg3.field3312;
            int var23 = var12 - arg3.field3308;
            if (arg7 == -4) {
                if (arg10 == var11 && arg1 == var12) {
                    class5.field46 = var11;
                    class125.field1609 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class609.method3356(2, arg10, arg4, var12, arg1, var11, 106, arg5, 2)) {
                    class5.field46 = var11;
                    class125.field1609 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg3.method1513(2, var11, arg1, arg4, arg5, arg10, 2, arg9, (byte) -108, var12)) {
                    class5.field46 = var11;
                    class125.field1609 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg3.method1499(arg1, 2, (byte) -42, arg5, var11, arg10, var12, arg4, arg9)) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg3.method1497(arg1, 2, arg0, arg10, (byte) 12, arg7, var12, var11)) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg3.method1511(arg0, 76, arg1, 2, arg10, arg7, var11, var12)) {
                class125.field1609 = var12;
                class5.field46 = var11;
                return true;
            }
            int var25 = class235.field3070[var20][var21] + 1;
            if (var20 > 0 && class98.field1203[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12;
                class98.field1203[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class98.field1203[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12;
                class98.field1203[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class98.field1203[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class63.field859[var26] = var11;
                class303.field4035[var26] = var12 - 1;
                class98.field1203[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class98.field1203[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class63.field859[var26] = var11;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var20][var21 + 1] = 4;
                class235.field3070[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class98.field1203[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12 - 1;
                class98.field1203[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class98.field1203[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var20 + 1][var21 - 1] = 9;
                class235.field3070[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class98.field1203[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var20 - 1][var21 + 1] = 6;
                class235.field3070[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class98.field1203[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var20 + 1][var21 + 1] = 12;
                class235.field3070[var20 + 1][var21 + 1] = var25;
            }
        }
        class125.field1609 = var12;
        class5.field46 = var11;
        return false;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ldga;II)V", line = 546)
    private final void method2623(class138 arg0, int arg1, int arg2) {
        field6322++;
        if (arg1 == 1) {
            int var13 = arg0.method922((byte) -122);
            this.field6319 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6319[var14] = arg0.method922((byte) -114);
            }
            this.field6307 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6307[var15] = arg0.method922((byte) -119);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field6307[var16] += arg0.method922((byte) -114) << 16;
            }
        } else if (arg1 == 2) {
            this.field6332 = arg0.method922((byte) -123);
        } else if (arg1 == 3) {
            this.field6311 = new boolean[256];
            int var11 = arg0.method957((byte) -99);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field6311[arg0.method957((byte) -111)] = true;
            }
        } else if (arg1 == 5) {
            this.field6334 = arg0.method957((byte) -121);
        } else if (arg1 == 6) {
            this.field6321 = arg0.method922((byte) -128);
        } else if (arg1 == 7) {
            this.field6308 = arg0.method922((byte) -121);
        } else if (arg1 == 8) {
            this.field6326 = arg0.method957((byte) -78);
        } else if (arg1 == 9) {
            this.field6316 = arg0.method957((byte) -110);
        } else if (arg1 == 10) {
            this.field6318 = arg0.method957((byte) -121);
        } else if (arg1 == 11) {
            this.field6314 = arg0.method957((byte) -102);
        } else if (arg1 == 12) {
            int var8 = arg0.method957((byte) -116);
            this.field6328 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6328[var9] = arg0.method922((byte) -114);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field6328[var10] = (arg0.method922((byte) -115) << 16) + this.field6328[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg0.method922((byte) -127);
            this.field6310 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method957((byte) -83);
                if (var6 > 0) {
                    this.field6310[var5] = new int[var6];
                    this.field6310[var5][0] = arg0.method904(127);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field6310[var5][var7] = arg0.method922((byte) -115);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field6335 = true;
        } else if (arg1 == 15) {
            this.field6327 = true;
        } else if (arg1 == 16) {
            this.field6317 = true;
        } else if (arg1 == 17) {
            this.field6325 = arg0.method957((byte) -119);
        } else if (arg1 == 18) {
            this.field6323 = true;
        }
        int var17 = 124 / ((-arg2 - 59) / 51);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLba;IIII)Lba;", line = 723)
    public final class629 method2624(byte arg0, class629 arg1, int arg2, int arg3, int arg4, int arg5) {
        field6312++;
        int var7 = this.field6319[arg5];
        int var8 = this.field6307[arg5];
        class495 var9 = this.field6320.method774(var8 >> 16, -122);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method659((byte) 1, arg4, true);
        }
        class495 var11 = null;
        if ((this.field6327 || class425.field5919) && arg2 != -1 && this.field6307.length > arg2) {
            int var12 = this.field6307[arg2];
            var11 = this.field6320.method774(var12 >> 16, -117);
            arg2 = var12 & 0xFFFF;
        }
        class495 var13 = null;
        class495 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (arg0 > -90) {
            this.method2621(-113, false, (byte) 5, null, -23, 68, -126, 64);
        }
        if (this.field6328 != null) {
            if (this.field6328.length > arg5) {
                var15 = this.field6328[arg5];
                if (var15 != 65535) {
                    var13 = this.field6320.method774(var15 >> 16, -119);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6327 || class425.field5919) && arg2 != -1 && arg2 < this.field6328.length) {
                var16 = this.field6328[arg2];
                if (var16 != 65535) {
                    var14 = this.field6320.method774(var16 >> 16, -122);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6335) {
            arg4 |= 0x200;
        }
        if (var9.method2792(0, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method2791(9675, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method2796(var10, (byte) 38)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2792(0, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method2791(9675, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method2796(var15, (byte) 38)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2792(0, arg2)) {
                arg4 |= 0x80;
            }
            if (var11.method2791(9675, arg2)) {
                arg4 |= 0x100;
            }
            if (var11.method2796(arg2, (byte) 38)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2792(0, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method2791(9675, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method2796(var16, (byte) 38)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class629 var18 = arg1.method659((byte) 1, var17, true);
        var18.method3437(0, arg2, false, var7, arg3 - 1, var9, var11, this.field6335, var10);
        if (var13 != null) {
            var18.method3437(0, var16, false, var7, arg3 - 1, var13, var14, this.field6335, var15);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZI)I", line = 868)
    public final int method2625(int arg0, int arg1, boolean arg2, int arg3) {
        field6315++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6307[arg3];
        class495 var8 = null;
        int var9 = 64 / ((-arg0 - 4) / 39);
        class495 var10 = this.field6320.method774(var7 >> 16, -121);
        int var11 = var7 & 0xFFFF;
        if (var10 == null) {
            return var5;
        }
        if ((this.field6327 || class425.field5919) && arg1 != -1 && this.field6307.length > arg1) {
            int var12 = this.field6307[arg1];
            var8 = this.field6320.method774(var12 >> 16, -123);
            var6 = var12 & 0xFFFF;
        }
        if (this.field6335) {
            var5 |= 0x200;
        }
        if (var10.method2792(0, var11)) {
            var5 |= 0x80;
        }
        if (var10.method2791(9675, var11)) {
            var5 |= 0x100;
        }
        if (var10.method2796(var11, (byte) 38)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2792(0, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2791(9675, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2796(var6, (byte) 38)) {
                var5 |= 0x400;
            }
        }
        if (this.field6328 != null && arg2) {
            if (arg3 < this.field6328.length) {
                int var13 = this.field6328[arg3];
                if (var13 != 65535) {
                    class495 var14 = this.field6320.method774(var13 >> 16, -117);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method2792(0, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method2791(9675, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method2796(var15, (byte) 38)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6327 || class425.field5919) && arg1 != -1 && arg1 < this.field6328.length) {
                int var16 = this.field6328[arg1];
                if (var16 != 65535) {
                    class495 var17 = this.field6320.method774(var16 >> 16, -125);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method2792(0, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method2791(9675, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method2796(var18, (byte) 38)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ldga;Z)V", line = 998)
    public final void method2626(class138 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method957((byte) -125);
            if (var3 == 0) {
                if (arg1) {
                    method2619(true);
                }
                field6313++;
                return;
            }
            this.method2623(arg0, var3, -127);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIBIII)V", line = 1038)
    public static final void method2627(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field6306++;
        if (arg1 >= 0 && arg3 >= 0 && arg1 < class588.field8082 - 1 && arg3 < (class12.field113 - 1)) {
            if (class145.field1841 == null) {
                return;
            }
            if (arg6 == 0) {
                class289 var8 = (class289) class147.method997(arg5, arg1, arg3);
                class289 var9 = (class289) class589.method3287(arg5, arg1, arg3);
                if (var8 != null && arg7 != 2) {
                    if (var8 instanceof class452) {
                        ((class452) var8).field6172.method1045((byte) 100, arg0);
                    } else {
                        class622.method3404(arg1, arg6, arg0, arg3, (byte) -18, var8.method130(-5582), arg7, arg2, arg5);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class452)) {
                        ((class452) var9).field6172.method1045((byte) 58, arg0);
                    } else {
                        class622.method3404(arg1, arg6, arg0, arg3, (byte) -32, var9.method130(-5582), arg7, arg2, arg5);
                    }
                }
            } else if (arg6 == 1) {
                class289 var12 = (class289) class7.method44(arg5, arg1, arg3);
                if (var12 != null) {
                    if (var12 instanceof class608) {
                        ((class608) var12).field8289.method1045((byte) 102, arg0);
                    } else {
                        int var13 = var12.method130(-5582);
                        if (arg7 == 4 || arg7 == 5) {
                            class622.method3404(arg1, arg6, arg0, arg3, (byte) -34, var13, 4, arg2, arg5);
                        } else if (arg7 == 6) {
                            class622.method3404(arg1, arg6, arg0, arg3, (byte) -42, var13, 4, arg2 + 4, arg5);
                        } else if (arg7 == 7) {
                            class622.method3404(arg1, arg6, arg0, arg3, (byte) -88, var13, 4, (arg2 + 2 & 0x3) + 4, arg5);
                        } else if (arg7 == 8) {
                            class622.method3404(arg1, arg6, arg0, arg3, (byte) -120, var13, 4, arg2 + 4, arg5);
                            class622.method3404(arg1, arg6, arg0, arg3, (byte) -125, var13, 4, (arg2 + 2 & 0x3) + 4, arg5);
                        }
                    }
                }
            } else if (arg6 == 2) {
                class289 var10 = (class289) class609.method3354(arg5, arg1, arg3, field6336 == null ? (field6336 = method2628("dda")) : field6336);
                if (var10 != null) {
                    if (arg7 == 11) {
                        arg7 = 10;
                    }
                    if (var10 instanceof class551) {
                        ((class551) var10).field7530.method1045((byte) 110, arg0);
                    } else {
                        class622.method3404(arg1, arg6, arg0, arg3, (byte) -111, var10.method130(-5582), arg7, arg2, arg5);
                    }
                }
            } else if (arg6 == 3) {
                class289 var11 = (class289) class618.method3391(arg5, arg1, arg3);
                if (var11 != null) {
                    if ((var11 instanceof class22)) {
                        ((class22) var11).field198.method1045((byte) 27, arg0);
                    } else {
                        class622.method3404(arg1, arg6, arg0, arg3, (byte) -108, var11.method130(-5582), arg7, arg2, arg5);
                    }
                }
            }
        }
        if (arg4 != -98) {
            field6333 = null;
        }
    }
}
