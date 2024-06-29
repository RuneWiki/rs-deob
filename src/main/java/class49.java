import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class49 extends class223 {

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "[S")
    public short[] field539;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[B")
    public byte[] field532;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "[Ljs;")
    public class217[] field535;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "[B")
    public byte[] field528;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lvg;")
    public class39[] field540;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
    private int[] field530;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[B")
    public byte[] field533;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Lgn;")
    public static class493 field543 = new class493();

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lib;")
    public static class106 field545 = new class106(8);

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Ljava/util/Random;")
    public static Random field546 = new Random();

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field548 = 1;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Z")
    public static boolean field547 = false;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 4)
    public static void method493(int arg0) {
        field543 = null;
        if (arg0 != 32410) {
            method494((byte) 51, null);
        }
        field546 = null;
        field545 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLrs;)I", line = 16)
    public static final int method494(byte arg0, class461 arg1) {
        field541++;
        class100 var2 = arg1.field6790;
        if (var2.field1364 != null) {
            var2 = var2.method848(false, class253.field3739);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -26) {
            return -112;
        }
        int var3 = var2.field1345;
        class531 var4 = arg1.method969(arg0 + 25);
        if (arg1.field1743) {
            var3 = var2.field1356;
        } else if (arg1.field1763 == var4.field7785 || arg1.field1763 == var4.field7771 || arg1.field1763 == var4.field7781 || arg1.field1763 == var4.field7805) {
            var3 = var2.field1359;
        } else if (arg1.field1763 == var4.field7783 || arg1.field1763 == var4.field7799 || arg1.field1763 == var4.field7808 || arg1.field1763 == var4.field7791) {
            var3 = var2.field1353;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 56)
    public final void method495(int arg0) {
        this.field530 = null;
        if (arg0 == 0) {
            field531++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I", line = 69)
    public static final int method496(int arg0, int arg1, int arg2) {
        field529++;
        if (arg0 != 26723) {
            method493(81);
        }
        return arg2 == 4 || arg2 == 5 ? class125.field1836[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIIIIII)V", line = 86)
    public static final void method497(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field544++;
        class452[] var7 = class133.field1922;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class452 var10 = var7[var8];
            if (var10 != null && var10.field6652 == 2) {
                class339.method2062(arg1, var10.field6653, var10.field6655, var10.field6647, var10.field6657 * 2, arg4 >> 1, (byte) 41, arg3 >> 1, arg5);
                if (class522.field7676[0] > -1 && (class263.field3867 % 20) < 10) {
                    class226.field3305[var10.field6646].method111(arg6 + class522.field7676[0] - 12, class522.field7676[1] - 28 + arg2);
                }
            }
        }
        int var9 = -29 % ((arg0 + 67) / 35);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLrs;Z)V", line = 118)
    public static final void method498(boolean arg0, class461 arg1, boolean arg2) {
        field536++;
        if (class291.field4175 >= 400 || arg2) {
            return;
        }
        class100 var3 = arg1.field6790;
        if (var3.field1364 != null) {
            var3 = var3.method848(false, class253.field3739);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1366) {
            return;
        }
        String var4 = var3.field1393;
        if (var3.field1401 != 0) {
            String var5 = class61.field703 == class51.field564 ? class376.field5570.method2031(true, class377.field5585) : class149.field2103.method2031(true, class377.field5585);
            var4 = var4 + class278.method1785(class435.field6375.field5093, !arg2, var3.field1401) + " (" + var5 + var3.field1401 + ")";
        }
        if (!class453.field6671) {
            if (!arg0) {
                String[] var6 = var3.field1374;
                if (class104.field1459) {
                    var6 = class181.method1285(5, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class68.field872 != class61.field703 || !var6[var7].equalsIgnoreCase(class502.field7457.method2031(true, class377.field5585)))) {
                            byte var8 = 0;
                            int var9 = class396.field5816;
                            if (var7 == 0) {
                                var8 = 11;
                            }
                            if (var7 == 1) {
                                var8 = 15;
                            }
                            if (var7 == 2) {
                                var8 = 21;
                            }
                            if (var7 == 3) {
                                var8 = 3;
                            }
                            if (var7 == 4) {
                                var8 = 50;
                            }
                            if (var3.field1350 == var7) {
                                var9 = var3.field1405;
                            }
                            if (var3.field1376 == var7) {
                                var9 = var3.field1391;
                            }
                            class434.method2632(var8, (byte) -55, false, (long) arg1.field1716, 0, "<col=ffff00>" + var4, true, var6[var7], 0, -1, var9);
                            class51.field566++;
                        }
                    }
                }
                if (class68.field872 == class61.field703 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class502.field7457.method2031(true, class377.field5585))) {
                            short var11 = 0;
                            if (var3.field1401 > class435.field6375.field5093) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 11;
                            }
                            if (var10 == 1) {
                                var12 = 15;
                            }
                            if (var10 == 2) {
                                var12 = 21;
                            }
                            if (var10 == 3) {
                                var12 = 3;
                            }
                            if (var10 == 4) {
                                var12 = 50;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class40.field455++;
                            class434.method2632(var12, (byte) -55, false, (long) arg1.field1716, 0, "<col=ffff00>" + var4, true, var6[var10], 0, -1, var3.field1362);
                        }
                    }
                }
            }
            class434.method2632(1003, (byte) -55, arg0, (long) arg1.field1716, 0, "<col=ffff00>" + var4, true, class516.field7611.method2031(!arg2, class377.field5585), 0, -1, class170.field2413);
            class170.field2410++;
        } else if (!arg0) {
            class284 var13 = class299.field4290 == -1 ? null : class215.field3100.method2740((byte) 122, class299.field4290);
            if ((class223.field3273 & 0x2) != 0) {
                if (var13 == null || var3.method856(var13.field4127, class299.field4290, 0) != var13.field4127) {
                    class67.field867++;
                    class434.method2632(22, (byte) -55, false, (long) arg1.field1716, 0, class91.field1252 + " -> <col=ffff00>" + var4, true, class8.field93, 0, -1, class148.field2074);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLfd;ILjava/lang/String;)Lwl;", line = 288)
    public static final class280 method499(byte arg0, class365 arg1, int arg2, String arg3) {
        field534++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class128.field1854, 0);
        if (arg0 != 121) {
            return null;
        }
        if (class128.field1854[0] == 0) {
            if (class128.field1854[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class128.field1854, 1);
            if (class128.field1854[1] > 1) {
                byte[] var6 = new byte[class128.field1854[1]];
                OpenGL.glGetInfoLogARB(var4, class128.field1854[1], class128.field1854, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class128.field1854[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class280(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Loj;I[B[I)Z", line = 328)
    public final boolean method500(class258 arg0, int arg1, byte[] arg2, int[] arg3) {
        if (arg1 != 18621) {
            method499((byte) -56, null, 69, null);
        }
        field527++;
        boolean var5 = true;
        int var6 = 0;
        class217 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field530[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1664(arg3, -1903291760, var9 >> 2);
                        } else {
                            var7 = arg0.method1661(arg3, var9 >> 2, 2509);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field535[var8] = var7;
                        this.field530[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 405)
    public class49() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V", line = 411)
    public class49(byte[] arg0) {
        this.field539 = new short[128];
        this.field532 = new byte[128];
        this.field535 = new class217[128];
        this.field528 = new byte[128];
        this.field540 = new class39[128];
        this.field530 = new int[128];
        this.field533 = new byte[128];
        class65 var2 = new class65(arg0);
        int var3;
        for (var3 = 0; var2.field783[var2.field827 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method629(false);
        }
        var3++;
        var2.field827++;
        int var6 = var2.field827;
        var2.field827 += var3;
        int var7;
        for (var7 = 0; var2.field783[var2.field827 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method629(false);
        }
        var2.field827++;
        var7++;
        int var10 = var2.field827;
        var2.field827 += var7;
        int var11;
        for (var11 = 0; var2.field783[var2.field827 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method629(false);
        }
        var2.field827++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method577(255);
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
        class39[] var19 = new class39[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class39 var103 = var19[var20] = new class39();
            int var104 = var2.method577(255);
            if (var104 > 0) {
                var103.field440 = new byte[var104 * 2];
            }
            int var105 = var2.method577(255);
            if (var105 > 0) {
                var103.field443 = new byte[var105 * 2 + 2];
                var103.field443[1] = 64;
            }
        }
        int var21 = var2.method577(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method577(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field783[var2.field827 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method629(false);
        }
        var25++;
        var2.field827++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method577(255);
            this.field539[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method577(255);
            this.field539[var31] = (short) (this.field539[var31] + (var30 << 8));
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
                var34 = var2.method615((byte) 37);
            }
            this.field539[var35] = (short) (this.field539[var35] + (class345.method2089(var34 - 1, 2) << 14));
            this.field530[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field530[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field783[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field533[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field530[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field783[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                var41--;
                this.field532[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class39 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field530[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field540[var47] = var46;
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
                if (this.field530[var51] > 0) {
                    var50 = var2.method577(255) + 1;
                }
            }
            this.field528[var51] = (byte) var50;
            var48--;
        }
        this.field538 = var2.method577(255) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class39 var100 = var19[var52];
            if (var100.field440 != null) {
                for (int var101 = 1; var101 < var100.field440.length; var101 += 2) {
                    var100.field440[var101] = var2.method629(false);
                }
            }
            if (var100.field443 != null) {
                for (int var102 = 3; var102 < var100.field443.length - 2; var102 += 2) {
                    var100.field443[var102] = var2.method629(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method629(false);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method629(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class39 var97 = var19[var55];
            if (var97.field443 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field443.length; var99 += 2) {
                    var98 = var98 + var2.method577(255) + 1;
                    var97.field443[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class39 var94 = var19[var56];
            if (var94.field440 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field440.length; var96 += 2) {
                    var95 += var2.method577(255) + 1;
                    var94.field440[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method577(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method577(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field528[var61] = (byte) (this.field528[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class484.method2912(18059, var67, var65 - var59);
                    this.field528[var68] = (byte) (this.field528[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field528[var64] = (byte) (this.field528[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method577(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method577(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field532[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field532[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class484.method2912(18059, var81, var79 - var72);
                    int var84 = (this.field532[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field532[var82] = (byte) var84;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field532[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field532[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field439 = var2.method577(255);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class39 var93 = var19[var87];
            if (var93.field440 != null) {
                var93.field450 = var2.method577(255);
            }
            if (var93.field443 != null) {
                var93.field446 = var2.method577(255);
            }
            if (var93.field439 > 0) {
                var93.field441 = var2.method577(255);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field444 = var2.method577(255);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class39 var92 = var19[var89];
            if (var92.field444 > 0) {
                var92.field445 = var2.method577(255);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class39 var91 = var19[var90];
            if (var91.field445 > 0) {
                var91.field451 = var2.method577(255);
            }
        }
    }
}
