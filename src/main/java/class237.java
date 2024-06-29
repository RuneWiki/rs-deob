import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class237 implements class36 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field4126 = 50;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
    private boolean field4127 = false;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "Lok;")
    private class149 field4156;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Lok;")
    private class149 field4140;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Ldd;")
    private class247 field4128;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Ldd;")
    private class247 field4144;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[Z")
    private boolean[] field4131;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "[B")
    private byte[] field4143;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "[B")
    private byte[] field4155;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "[Z")
    private boolean[] field4132;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "[B")
    private byte[] field4151;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "[Z")
    private boolean[] field4162;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "[Z")
    private boolean[] field4159;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[Z")
    private boolean[] field4137;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "[S")
    private short[] field4158;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "[B")
    private byte[] field4163;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[[B")
    public static byte[][] field4133;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)Z", line = 7)
    public final boolean method319(int arg0, int arg1) {
        if (arg0 <= 34) {
            this.field4137 = (boolean[]) null;
        }
        field4153++;
        return this.field4137[arg1];
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)Lsb;", line = 19)
    private final class111 method1700(int arg0, byte arg1) {
        class111 var3 = (class111) this.field4144.method1767((byte) -37, (long) arg0);
        field4145++;
        if (var3 != null) {
            return var3;
        }
        class111 var4 = new class111(this.field4158[arg0] & 0xFFFF);
        if (arg1 == 123) {
            this.field4144.method1771(-104, (long) arg0, var4);
            return var4;
        } else {
            return (class111) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 36)
    public static void method1701(int arg0) {
        if (arg0 != -2) {
            method1701(-49);
        }
        field4133 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(FII)[I", line = 47)
    public final int[] method318(float arg0, int arg1, int arg2) {
        class178 var4 = this.method1707(arg2, false);
        field4130++;
        int var5 = -113 / ((arg1 + 34) / 39);
        if (var4 == null) {
            return null;
        } else {
            var4.field3231 = true;
            return var4.method1393(this, this.field4156, this.field4127 || this.field4159[arg2], arg0, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z", line = 62)
    public final boolean method315(int arg0, int arg1) {
        field4135++;
        return arg1 == 128 ? this.field4162[arg0] : true;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z", line = 74)
    public final boolean method314(int arg0, int arg1) {
        field4148++;
        if (arg1 != 1) {
            this.field4131 = (boolean[]) null;
        }
        return this.field4132[arg0];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZB)V", line = 98)
    public static final void method1702(boolean arg0, byte arg1) {
        class23.method208(class307.field5444, class221.field3899, (byte) 66, arg0, class176.field3150);
        if (arg1 == -15) {
            field4161++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[[ILaa;[[F[[FI[[F[IILsg;I)V", line = 109)
    public static final void method1703(int arg0, int[][] arg1, class9 arg2, float[][] arg3, float[][] arg4, int arg5, float[][] arg6, int[] arg7, int arg8, class37 arg9, int arg10) {
        field4164++;
        int[] var11 = new int[arg7.length / 2];
        if (arg8 != 255) {
            field4123 = -115;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg7[var12 + var12];
            int var14 = arg7[var12 + var12 + 1];
            if (arg10 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg10 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg10 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg6[arg5][arg0];
                var18 = arg4[arg5][arg0];
                var19 = arg3[arg5][arg0];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg4[arg5 + 1][arg0];
                var17 = arg6[arg5 + 1][arg0];
                var19 = arg3[arg5 + 1][arg0];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg6[arg5 + 1][arg0 + 1];
                var19 = arg3[arg5 + 1][arg0 + 1];
                var18 = arg4[arg5 + 1][arg0 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg6[arg5][arg0 + 1];
                var19 = arg3[arg5][arg0 + 1];
                var18 = arg4[arg5][arg0 + 1];
            } else {
                float var20 = arg3[arg5][arg0];
                float var21 = arg6[arg5][arg0];
                float var22 = (float) var13 / 128.0F;
                float var23 = (arg6[arg5 + 1][arg0] - var21) * var22 + var21;
                float var24 = (arg3[arg5 + 1][arg0] - var20) * var22 + var20;
                float var25 = arg4[arg5][arg0];
                float var26 = (arg4[arg5 + 1][arg0] - var25) * var22 + var25;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg3[arg5][arg0 + 1];
                float var29 = arg4[arg5][arg0 + 1];
                float var30 = (arg4[arg5 + 1][arg0 + 1] - var29) * var22 + var29;
                var18 = (var30 - var26) * var27 + var26;
                float var31 = (arg3[arg5 + 1][arg0 + 1] - var28) * var22 + var28;
                var19 = (var31 - var24) * var27 + var24;
                float var32 = arg6[arg5][arg0 + 1];
                float var33 = (arg6[arg5 + 1][arg0 + 1] - var32) * var22 + var32;
                var17 = (var33 - var23) * var27 + var23;
            }
            int var34 = (arg5 << 7) + var13;
            int var35 = (arg0 << 7) + var14;
            int var36 = class41.method357(arg1, true, arg5, var14, var13, arg0);
            var11[var12] = arg2.method69(arg9, var34, var36, var35, var19, var18, var17);
        }
        arg2.method68(var11);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)I", line = 228)
    public final int method316(boolean arg0, int arg1) {
        if (arg0) {
            this.method1707(32, false);
        }
        field4124++;
        return this.field4158[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(II)Z", line = 241)
    public final boolean method323(int arg0, int arg1) {
        field4129++;
        if (arg1 != 17013) {
            this.field4159 = (boolean[]) null;
        }
        return this.field4127 || this.field4159[arg0];
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(II)V", line = 256)
    public final void method1704(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field4143 = (byte[]) null;
        }
        field4146++;
        this.field4126 = arg0;
        this.field4128 = new class247(this.field4126);
        if (class97.field1824) {
            this.field4144 = new class247(this.field4126);
        } else {
            this.field4144 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(IZ)V", line = 276)
    public final void method1705(int arg0, boolean arg1) {
        field4136++;
        this.field4127 = arg1;
        this.method1709(true);
        if (arg0 != -23923) {
            this.method1705(-68, false);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 290)
    public static final void method1706(int arg0) {
        while (true) {
            if (class287.field5106.method1624(class264.field4741, false) >= 11) {
                int var1 = class287.field5106.method1628(83, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class96.field1780[var1] == null) {
                        class96.field1780[var1] = new class239();
                        var2 = true;
                        if (class249.field4450[var1] != null) {
                            class96.field1780[var1].method1720(class249.field4450[var1], 0);
                        }
                    }
                    class252.field4503[class103.field1931++] = var1;
                    class239 var3 = class96.field1780[var1];
                    var3.field84 = class8.field279;
                    int var4 = class287.field5106.method1628(-59, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class75.field1472[class287.field5106.method1628(-55, 3)];
                    if (var2) {
                        var3.field28 = var3.field44 = var5;
                    }
                    int var6 = class287.field5106.method1628(-72, 5);
                    int var7 = class287.field5106.method1628(-82, 1);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var7 == 1) {
                        class45.field945[class174.field3139++] = var1;
                    }
                    int var8 = class287.field5106.method1628(-54, 1);
                    var3.method1722((byte) -32, class72.field1420.field11[0] + var6, class72.field1420.field34[0] + var4, var8 == 1);
                    continue;
                }
            }
            field4138++;
            class287.field5106.method1635(true);
            int var9 = -126 / ((arg0 + 76) / 44);
            return;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(IZ)Lim;", line = 359)
    private final class178 method1707(int arg0, boolean arg1) {
        class178 var3 = (class178) this.field4128.method1767((byte) -37, (long) arg0);
        field4154++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4140.method1192(0, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class53 var5 = new class53(var4);
            class178 var6 = new class178(var5);
            this.field4128.method1771(20, (long) arg0, var6);
            return arg1 ? (class178) null : var6;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lok;Lok;Lok;IZ)V", line = 658)
    public class237(class149 arg0, class149 arg1, class149 arg2, int arg3, boolean arg4) {
        this.field4127 = arg4;
        this.field4156 = arg2;
        this.field4140 = arg0;
        this.field4126 = arg3;
        this.field4128 = new class247(this.field4126);
        if (class97.field1824) {
            this.field4144 = new class247(this.field4126);
        } else {
            this.field4144 = null;
        }
        class53 var6 = new class53(arg1.method1192(0, 0, 0));
        int var7 = var6.method468(28214);
        this.field4131 = new boolean[var7];
        this.field4143 = new byte[var7];
        this.field4155 = new byte[var7];
        this.field4132 = new boolean[var7];
        this.field4151 = new byte[var7];
        this.field4162 = new boolean[var7];
        this.field4159 = new boolean[var7];
        this.field4137 = new boolean[var7];
        this.field4158 = new short[var7];
        this.field4163 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4131[var8] = var6.method483(-102) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4131[var9]) {
                this.field4132[var9] = var6.method483(-122) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4131[var10]) {
                this.field4137[var10] = var6.method483(-113) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4131[var11]) {
                this.field4159[var11] = var6.method483(-125) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4131[var12]) {
                this.field4162[var12] = var6.method483(-125) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4131[var13]) {
                this.field4163[var13] = var6.method494(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4131[var14]) {
                this.field4151[var14] = var6.method494(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4131[var15]) {
                this.field4155[var15] = var6.method494(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4131[var16]) {
                this.field4143[var16] = var6.method494(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4131[var17]) {
                this.field4158[var17] = (short) var6.method468(28214);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(II)I", line = 398)
    public final int method326(int arg0, int arg1) {
        int var3 = 83 % ((-arg0 - 23) / 34);
        field4142++;
        return this.field4163[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)V", line = 407)
    public final void method324(int arg0, boolean arg1) {
        class162.method1279(0, this.field4143[arg0] & 0xFF, this.field4155[arg0] & 0xFF);
        field4152++;
        if (!arg1) {
            field4123 = 72;
        }
        boolean var3 = false;
        class178 var4 = this.method1707(arg0, false);
        if (var4 != null) {
            var3 = var4.method1395(true, this, this.field4156, this.field4127 || this.field4159[arg0]);
        }
        if (!var3) {
            class111 var5 = this.method1700(arg0, (byte) 123);
            var5.method908(0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)I", line = 439)
    public final int method320(int arg0, boolean arg1) {
        field4147++;
        return arg1 ? -20 : this.field4143[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)Z", line = 449)
    public static final boolean method1708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class250.field4458[arg0][var8][var9] == -class182.field3328) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class165.field2970[arg0][arg1][arg3] + arg5;
            if (!class213.method1564(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class213.method1564(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class213.method1564(var10, var12, var14)) {
                return false;
            } else if (class213.method1564(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class42.method361(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class213.method1564(var6 + 1, class165.field2970[arg0][arg1][arg3] + arg5, var7 + 1) && class213.method1564(var6 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class213.method1564(var6 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class213.method1564(var6 + 1, class165.field2970[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)Z", line = 509)
    public final boolean method321(int arg0, byte arg1) {
        if (arg1 < 7) {
            this.field4155 = (byte[]) null;
        }
        field4134++;
        class178 var3 = this.method1707(arg0, false);
        return var3 == null ? false : var3.method1388(-70, this.field4156, this);
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)I", line = 533)
    public final int method322(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method322(6, -66);
        }
        field4141++;
        return this.field4155[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 546)
    public final void method1709(boolean arg0) {
        this.field4128.method1770(-30351);
        if (!arg0) {
            method1712(-37);
        }
        field4150++;
        if (this.field4144 != null) {
            this.field4144.method1770(-30351);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V", line = 561)
    public final void method1710(byte arg0, int arg1) {
        field4139++;
        if (arg0 >= -101) {
            this.method322(-26, -84);
        }
        for (class178 var3 = (class178) this.field4128.method1772((byte) -2); var3 != null; var3 = (class178) this.field4128.method1766(-120)) {
            if (var3.field3231) {
                var3.method1394(false, arg1);
                var3.field3231 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(II)I", line = 585)
    public final int method325(int arg0, int arg1) {
        field4125++;
        if (arg1 != 255) {
            method1703(-61, (int[][]) ((int[][]) null), (class9) null, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -23, (float[][]) ((float[][]) null), (int[]) null, -60, (class37) null, -92);
        }
        return this.field4151[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILvh;)Lud;", line = 596)
    public static final class279 method1711(int arg0, int arg1, class53 arg2) {
        field4157++;
        try {
            class279 var3 = new class279();
            var3.field4967 = arg2.method472((byte) 103);
            if (var3.field4967 > arg1) {
                var3.field4967 = arg1;
            }
            var3.field4935 = new byte[var3.field4967];
            arg2.field1142 += class163.field2943.method268(var3.field4967, 15, arg0, var3.field4935, arg2.field1142, arg2.field1168);
            return var3;
        } catch (Exception var5) {
            return class318.field5585;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I", line = 624)
    public static final int method1712(int arg0) {
        field4149++;
        if (arg0 != -2) {
            field4133 = (byte[][]) ((byte[][]) null);
        }
        return class7.field142;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(ZI)[I", line = 647)
    public final int[] method317(boolean arg0, int arg1) {
        field4160++;
        class178 var3 = this.method1707(arg1, arg0);
        return var3 == null ? null : var3.method1390(this, 128, this.field4127 || this.field4159[arg1], this.field4156);
    }
}
