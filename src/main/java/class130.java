import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class130 extends class322 {

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Z")
    private boolean field2179 = false;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "B")
    public byte field2205 = 0;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public int field2194 = 0;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field2176 = 0;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "[I")
    public int[] field2191;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
    public int[] field2180;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    public int[] field2172;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
    public int[] field2183;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[I")
    public int[] field2199;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[I")
    public int[] field2201;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "[I")
    public int[] field2189;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[B")
    public byte[] field2192;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "[B")
    public byte[] field2185;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "[B")
    public byte[] field2181;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "[S")
    public short[] field2186;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "[S")
    public short[] field2190;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "[B")
    public byte[] field2219;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "[I")
    public int[] field2212;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[B")
    public byte[] field2196;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "[S")
    public short[] field2187;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "[S")
    public short[] field2182;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "[S")
    public short[] field2202;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "[S")
    public short[] field2204;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[S")
    public short[] field2177;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "[S")
    public short[] field2215;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "[B")
    public byte[] field2197;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[B")
    public byte[] field2193;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[B")
    public byte[] field2184;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "[B")
    public byte[] field2207;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[B")
    public byte[] field2173;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "[[I")
    public int[][] field2218;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "[[I")
    public int[][] field2195;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "[Lak;")
    public class306[] field2209;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "[Lpf;")
    public class81[] field2214;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "[Lak;")
    public class306[] field2208;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "S")
    public short field2188;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "S")
    public short field2198;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "[I")
    private static int[] field2200 = new int[10000];

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "[I")
    private static int[] field2206 = new int[10000];

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "[I")
    private static int[] field2213 = class109.field1750;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    private static int field2217 = 0;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "[I")
    private static int[] field2211 = class109.field1757;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "S")
    private short field2174;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "S")
    private short field2175;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "S")
    private short field2178;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "S")
    private short field2203;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "S")
    private short field2210;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "S")
    private short field2216;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 9)
    public final void method932() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            int var2 = this.field2172[var1];
            this.field2172[var1] = this.field2191[var1];
            this.field2191[var1] = -var2;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[IIIIII)V", line = 23)
    private final void method933(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method948(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method948(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method948(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method948(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method941(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method955(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method958(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(SS)V", line = 92)
    public final void method934(short arg0, short arg1) {
        if (this.field2190 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2194; var3++) {
            if (this.field2190[var3] == arg0) {
                this.field2190[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V", line = 109)
    private final void method935(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class47 var4 = new class47(arg0);
        class47 var5 = new class47(arg0);
        class47 var6 = new class47(arg0);
        class47 var7 = new class47(arg0);
        class47 var8 = new class47(arg0);
        var4.field857 = arg0.length - 18;
        int var9 = var4.method379(-2);
        int var10 = var4.method379(-2);
        int var11 = var4.method368(-97);
        int var12 = var4.method368(-109);
        int var13 = var4.method368(58);
        int var14 = var4.method368(-98);
        int var15 = var4.method368(82);
        int var16 = var4.method368(62);
        int var17 = var4.method379(-2);
        int var18 = var4.method379(-2);
        int var19 = var4.method379(-2);
        int var20 = var4.method379(-2);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2176 = var9;
        this.field2194 = var10;
        this.field2220 = var11;
        this.field2191 = new int[var9];
        this.field2180 = new int[var9];
        this.field2172 = new int[var9];
        this.field2199 = new int[var10];
        this.field2201 = new int[var10];
        this.field2189 = new int[var10];
        if (var11 > 0) {
            this.field2196 = new byte[var11];
            this.field2187 = new short[var11];
            this.field2182 = new short[var11];
            this.field2202 = new short[var11];
        }
        if (var16 == 1) {
            this.field2183 = new int[var9];
        }
        if (var12 == 1) {
            this.field2192 = new byte[var10];
            this.field2219 = new byte[var10];
            this.field2190 = new short[var10];
        }
        if (var13 == 255) {
            this.field2185 = new byte[var10];
        } else {
            this.field2205 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2181 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2212 = new int[var10];
        }
        this.field2186 = new short[var10];
        var4.field857 = var21;
        var5.field857 = var36;
        var6.field857 = var38;
        var7.field857 = var40;
        var8.field857 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method368(-93);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method369((byte) -118);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method369((byte) -118);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method369((byte) -118);
            }
            this.field2191[var46] = var43 + var48;
            this.field2180[var46] = var44 + var49;
            this.field2172[var46] = var45 + var50;
            var43 = this.field2191[var46];
            var44 = this.field2180[var46];
            var45 = this.field2172[var46];
            if (var16 == 1) {
                this.field2183[var46] = var8.method368(-99);
            }
        }
        var4.field857 = var32;
        var5.field857 = var28;
        var6.field857 = var26;
        var7.field857 = var30;
        var8.field857 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2186[var51] = (short) var4.method379(-2);
            if (var12 == 1) {
                int var52 = var5.method368(-99);
                if ((var52 & 0x1) == 1) {
                    this.field2192[var51] = 1;
                    var2 = true;
                } else {
                    this.field2192[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2219[var51] = (byte) (var52 >> 2);
                    this.field2190[var51] = this.field2186[var51];
                    this.field2186[var51] = 127;
                    if (this.field2190[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2219[var51] = -1;
                    this.field2190[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2185[var51] = var6.method352(255);
            }
            if (var14 == 1) {
                this.field2181[var51] = var7.method352(255);
            }
            if (var15 == 1) {
                this.field2212[var51] = var8.method368(38);
            }
        }
        var4.field857 = var25;
        var5.field857 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method368(-114);
            if (var58 == 1) {
                var53 = var4.method369((byte) -118) + var56;
                var54 = var4.method369((byte) -118) + var53;
                var55 = var4.method369((byte) -118) + var54;
                var56 = var55;
                this.field2199[var57] = var53;
                this.field2201[var57] = var54;
                this.field2189[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method369((byte) -118) + var56;
                var56 = var55;
                this.field2199[var57] = var53;
                this.field2201[var57] = var54;
                this.field2189[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method369((byte) -118) + var56;
                var56 = var55;
                this.field2199[var57] = var53;
                this.field2201[var57] = var54;
                this.field2189[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method369((byte) -118) + var56;
                var56 = var55;
                this.field2199[var57] = var53;
                this.field2201[var57] = var61;
                this.field2189[var57] = var55;
            }
        }
        var4.field857 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2196[var62] = 0;
            this.field2187[var62] = (short) var4.method379(-2);
            this.field2182[var62] = (short) var4.method379(-2);
            this.field2202[var62] = (short) var4.method379(-2);
        }
        if (this.field2219 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2219[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2187[var65] & 0xFFFF) == this.field2199[var64] && (this.field2182[var65] & 0xFFFF) == this.field2201[var64] && (this.field2202[var65] & 0xFFFF) == this.field2189[var64]) {
                        this.field2219[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2219 = null;
            }
        }
        if (!var3) {
            this.field2190 = null;
        }
        if (!var2) {
            this.field2192 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 451)
    private final void method936() {
        if (this.field2179) {
            return;
        }
        this.field2179 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2176; var7++) {
            int var8 = this.field2191[var7];
            int var9 = this.field2180[var7];
            int var10 = this.field2172[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2174 = (short) var1;
        this.field2175 = (short) var4;
        this.field2203 = (short) var2;
        this.field2178 = (short) var5;
        this.field2210 = (short) var3;
        this.field2216 = (short) var6;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 509)
    public final void method937() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2191[var1] = -this.field2191[var1];
            this.field2172[var1] = -this.field2172[var1];
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(SS)V", line = 527)
    public final void method938(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2194; var3++) {
            if (this.field2186[var3] == arg0) {
                this.field2186[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvd;IS)I", line = 544)
    private final int method939(class130 arg0, int arg1, short arg2) {
        int var4 = arg0.field2191[arg1];
        int var5 = arg0.field2180[arg1];
        int var6 = arg0.field2172[arg1];
        for (int var7 = 0; var7 < this.field2176; var7++) {
            if (this.field2191[var7] == var4 && this.field2180[var7] == var5 && this.field2172[var7] == var6) {
                return var7;
            }
        }
        this.field2191[this.field2176] = var4;
        this.field2180[this.field2176] = var5;
        this.field2172[this.field2176] = var6;
        if (arg0.field2183 != null) {
            this.field2183[this.field2176] = arg0.field2183[arg1];
        }
        return this.field2176++;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 573)
    public final void method940(int arg0) {
        int var2 = field2213[arg0];
        int var3 = field2211[arg0];
        for (int var4 = 0; var4 < this.field2176; var4++) {
            int var5 = this.field2191[var4] * var3 + this.field2172[var4] * var2 >> 16;
            this.field2172[var4] = this.field2172[var4] * var3 - this.field2191[var4] * var2 >> 16;
            this.field2191[var4] = var5;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V", line = 592)
    private final void method941(int arg0) {
        int var2 = field2213[arg0];
        int var3 = field2211[arg0];
        for (int var4 = 0; var4 < this.field2176; var4++) {
            int var5 = this.field2180[var4] * var3 - this.field2172[var4] * var2 >> 16;
            this.field2172[var4] = this.field2180[var4] * var2 + this.field2172[var4] * var3 >> 16;
            this.field2180[var4] = var5;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)Lnj;", line = 616)
    public final class220 method942(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class220(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIJILmk;)V", line = 622)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10) {
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I", line = 626)
    public final int method943(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2176; var4++) {
            if (this.field2191[var4] == arg0 && this.field2180[var4] == arg1 && this.field2172[var4] == arg2) {
                return var4;
            }
        }
        this.field2191[this.field2176] = arg0;
        this.field2180[this.field2176] = arg1;
        this.field2172[this.field2176] = arg2;
        return this.field2176++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lvd;", line = 644)
    public final class130 method944(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method936();
        int var10 = this.field2174 + arg4;
        int var11 = this.field2175 + arg4;
        int var12 = this.field2210 + arg6;
        int var13 = this.field2216 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class130 var18;
        if (arg7) {
            var18 = new class130();
            var18.field2176 = this.field2176;
            var18.field2194 = this.field2194;
            var18.field2220 = this.field2220;
            var18.field2199 = this.field2199;
            var18.field2201 = this.field2201;
            var18.field2189 = this.field2189;
            var18.field2192 = this.field2192;
            var18.field2185 = this.field2185;
            var18.field2181 = this.field2181;
            var18.field2219 = this.field2219;
            var18.field2186 = this.field2186;
            var18.field2190 = this.field2190;
            var18.field2205 = this.field2205;
            var18.field2196 = this.field2196;
            var18.field2187 = this.field2187;
            var18.field2182 = this.field2182;
            var18.field2202 = this.field2202;
            var18.field2204 = this.field2204;
            var18.field2177 = this.field2177;
            var18.field2215 = this.field2215;
            var18.field2197 = this.field2197;
            var18.field2193 = this.field2193;
            var18.field2184 = this.field2184;
            var18.field2207 = this.field2207;
            var18.field2173 = this.field2173;
            var18.field2183 = this.field2183;
            var18.field2212 = this.field2212;
            var18.field2218 = this.field2218;
            var18.field2195 = this.field2195;
            var18.field2188 = this.field2188;
            var18.field2198 = this.field2198;
            var18.field2209 = this.field2209;
            var18.field2214 = this.field2214;
            var18.field2208 = this.field2208;
            if (arg0 == 3) {
                var18.field2191 = class173.method1342((byte) -88, this.field2191);
                var18.field2180 = class173.method1342((byte) -55, this.field2180);
                var18.field2172 = class173.method1342((byte) -51, this.field2172);
            } else {
                var18.field2191 = this.field2191;
                var18.field2180 = new int[var18.field2176];
                var18.field2172 = this.field2172;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2176; var19++) {
                int var20 = this.field2191[var19] + arg4;
                int var21 = this.field2172[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2180[var19] = this.field2180[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2176; var29++) {
                int var30 = (this.field2180[var29] << 16) / this.field2203;
                if (var30 < arg1) {
                    int var31 = this.field2191[var29] + arg4;
                    int var32 = this.field2172[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2180[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2180[var29];
                } else {
                    var18.field2180[var29] = this.field2180[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method933(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2178 - this.field2203;
            for (int var43 = 0; var43 < this.field2176; var43++) {
                int var44 = this.field2191[var43] + arg4;
                int var45 = this.field2172[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2180[var43] = var52 + this.field2180[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2178 - this.field2203;
            for (int var54 = 0; var54 < this.field2176; var54++) {
                int var55 = this.field2191[var54] + arg4;
                int var56 = this.field2172[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2180[var54] = ((this.field2180[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method962();
        } else {
            this.field2179 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lbf;IIIZ)V", line = 905)
    public final void method945(class322 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class130 var6 = (class130) arg0;
        var6.method936();
        var6.method960();
        field2217++;
        int var7 = 0;
        int[] var8 = var6.field2191;
        int var9 = var6.field2176;
        for (int var10 = 0; var10 < this.field2176; var10++) {
            class306 var11 = this.field2209[var10];
            if (var11.field5241 != 0) {
                int var12 = this.field2180[var10] - arg2;
                if (var12 >= var6.field2203 && var12 <= var6.field2178) {
                    int var13 = this.field2191[var10] - arg1;
                    if (var13 >= var6.field2174 && var13 <= var6.field2175) {
                        int var14 = this.field2172[var10] - arg3;
                        if (var14 >= var6.field2210 && var14 <= var6.field2216) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class306 var16 = var6.field2209[var15];
                                if (var8[var15] == var13 && var6.field2172[var15] == var14 && var6.field2180[var15] == var12 && var16.field5241 != 0) {
                                    if (this.field2208 == null) {
                                        this.field2208 = new class306[this.field2176];
                                    }
                                    if (var6.field2208 == null) {
                                        var6.field2208 = new class306[var9];
                                    }
                                    class306 var17 = this.field2208[var10];
                                    if (var17 == null) {
                                        var17 = this.field2208[var10] = new class306(var11);
                                    }
                                    class306 var18 = var6.field2208[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2208[var15] = new class306(var16);
                                    }
                                    var17.field5235 += var16.field5235;
                                    var17.field5231 += var16.field5231;
                                    var17.field5240 += var16.field5240;
                                    var17.field5241 += var16.field5241;
                                    var18.field5235 += var11.field5235;
                                    var18.field5231 += var11.field5231;
                                    var18.field5240 += var11.field5240;
                                    var18.field5241 += var11.field5241;
                                    var7++;
                                    field2206[var10] = field2217;
                                    field2200[var15] = field2217;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field2194; var19++) {
            if (field2206[this.field2199[var19]] == field2217 && field2206[this.field2201[var19]] == field2217 && field2206[this.field2189[var19]] == field2217) {
                if (this.field2192 == null) {
                    this.field2192 = new byte[this.field2194];
                }
                this.field2192[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2194; var20++) {
            if (field2200[var6.field2199[var20]] == field2217 && field2200[var6.field2201[var20]] == field2217 && field2200[var6.field2189[var20]] == field2217) {
                if (var6.field2192 == null) {
                    var6.field2192 = new byte[var6.field2194];
                }
                var6.field2192[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V", line = 1028)
    public final void method946() {
        this.field2183 = null;
        this.field2212 = null;
        this.field2218 = (int[][]) null;
        this.field2195 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z", line = 1034)
    public final boolean method947() {
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[III)I", line = 1039)
    private static final int method948(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V", line = 1061)
    public final void method949() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2172[var1] = -this.field2172[var1];
        }
        for (int var2 = 0; var2 < this.field2194; var2++) {
            int var3 = this.field2199[var2];
            this.field2199[var2] = this.field2189[var2];
            this.field2189[var2] = var3;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lbf;", line = 1082)
    public final class322 method950(int arg0, int arg1, int arg2) {
        return this.method961(this.field2188, this.field2198, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)V", line = 1090)
    public final void method951(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2176; var4++) {
            this.field2191[var4] = this.field2191[var4] * arg0 / 128;
            this.field2180[var4] = this.field2180[var4] * arg1 / 128;
            this.field2172[var4] = this.field2172[var4] * arg2 / 128;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "([B)V", line = 1103)
    private final void method952(byte[] arg0) {
        class47 var2 = new class47(arg0);
        class47 var3 = new class47(arg0);
        class47 var4 = new class47(arg0);
        class47 var5 = new class47(arg0);
        class47 var6 = new class47(arg0);
        class47 var7 = new class47(arg0);
        class47 var8 = new class47(arg0);
        var2.field857 = arg0.length - 23;
        int var9 = var2.method379(-2);
        int var10 = var2.method379(-2);
        int var11 = var2.method368(88);
        int var12 = var2.method368(116);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method368(-103);
        int var16 = var2.method368(-124);
        int var17 = var2.method368(75);
        int var18 = var2.method368(29);
        int var19 = var2.method368(105);
        int var20 = var2.method379(-2);
        int var21 = var2.method379(-2);
        int var22 = var2.method379(-2);
        int var23 = var2.method379(-2);
        int var24 = var2.method379(-2);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2196 = new byte[var11];
            var2.field857 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2196[var28] = var2.method352(255);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field2176 = var9;
        this.field2194 = var10;
        this.field2220 = var11;
        this.field2191 = new int[var9];
        this.field2180 = new int[var9];
        this.field2172 = new int[var9];
        this.field2199 = new int[var10];
        this.field2201 = new int[var10];
        this.field2189 = new int[var10];
        if (var19 == 1) {
            this.field2183 = new int[var9];
        }
        if (var13) {
            this.field2192 = new byte[var10];
        }
        if (var15 == 255) {
            this.field2185 = new byte[var10];
        } else {
            this.field2205 = (byte) var15;
        }
        if (var16 == 1) {
            this.field2181 = new byte[var10];
        }
        if (var17 == 1) {
            this.field2212 = new int[var10];
        }
        if (var18 == 1) {
            this.field2190 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field2219 = new byte[var10];
        }
        this.field2186 = new short[var10];
        if (var11 > 0) {
            this.field2187 = new short[var11];
            this.field2182 = new short[var11];
            this.field2202 = new short[var11];
            if (var26 > 0) {
                this.field2204 = new short[var26];
                this.field2177 = new short[var26];
                this.field2215 = new short[var26];
                this.field2197 = new byte[var26];
                this.field2193 = new byte[var26];
                this.field2184 = new byte[var26];
            }
            if (var27 > 0) {
                this.field2207 = new byte[var27];
                this.field2173 = new byte[var27];
            }
        }
        var2.field857 = var11;
        var3.field857 = var46;
        var4.field857 = var48;
        var5.field857 = var50;
        var6.field857 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method368(-105);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method369((byte) -118);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method369((byte) -118);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method369((byte) -118);
            }
            this.field2191[var69] = var66 + var71;
            this.field2180[var69] = var67 + var72;
            this.field2172[var69] = var68 + var73;
            var66 = this.field2191[var69];
            var67 = this.field2180[var69];
            var68 = this.field2172[var69];
            if (var19 == 1) {
                this.field2183[var69] = var6.method368(30);
            }
        }
        var2.field857 = var44;
        var3.field857 = var33;
        var4.field857 = var36;
        var5.field857 = var39;
        var6.field857 = var37;
        var7.field857 = var42;
        var8.field857 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field2186[var74] = (short) var2.method379(-2);
            if (var13) {
                this.field2192[var74] = var3.method352(255);
            }
            if (var15 == 255) {
                this.field2185[var74] = var4.method352(255);
            }
            if (var16 == 1) {
                this.field2181[var74] = var5.method352(255);
            }
            if (var17 == 1) {
                this.field2212[var74] = var6.method368(-109);
            }
            if (var18 == 1) {
                this.field2190[var74] = (short) (var7.method379(-2) - 1);
            }
            if (this.field2219 != null) {
                if (this.field2190[var74] == -1) {
                    this.field2219[var74] = -1;
                } else {
                    this.field2219[var74] = (byte) (var8.method368(-128) - 1);
                }
            }
        }
        var2.field857 = var35;
        var3.field857 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method368(86);
            if (var80 == 1) {
                var75 = var2.method369((byte) -118) + var78;
                var76 = var2.method369((byte) -118) + var75;
                var77 = var2.method369((byte) -118) + var76;
                var78 = var77;
                this.field2199[var79] = var75;
                this.field2201[var79] = var76;
                this.field2189[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method369((byte) -118) + var78;
                var78 = var77;
                this.field2199[var79] = var75;
                this.field2201[var79] = var76;
                this.field2189[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method369((byte) -118) + var78;
                var78 = var77;
                this.field2199[var79] = var75;
                this.field2201[var79] = var76;
                this.field2189[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method369((byte) -118) + var78;
                var78 = var77;
                this.field2199[var79] = var75;
                this.field2201[var79] = var83;
                this.field2189[var79] = var77;
            }
        }
        var2.field857 = var52;
        var3.field857 = var54;
        var4.field857 = var56;
        var5.field857 = var58;
        var6.field857 = var60;
        var7.field857 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field2196[var84] & 0xFF;
            if (var85 == 0) {
                this.field2187[var84] = (short) var2.method379(-2);
                this.field2182[var84] = (short) var2.method379(-2);
                this.field2202[var84] = (short) var2.method379(-2);
            }
            if (var85 == 1) {
                this.field2187[var84] = (short) var3.method379(-2);
                this.field2182[var84] = (short) var3.method379(-2);
                this.field2202[var84] = (short) var3.method379(-2);
                this.field2204[var84] = (short) var4.method379(-2);
                this.field2177[var84] = (short) var4.method379(-2);
                this.field2215[var84] = (short) var4.method379(-2);
                this.field2197[var84] = var5.method352(255);
                this.field2193[var84] = var6.method352(255);
                this.field2184[var84] = var7.method352(255);
            }
            if (var85 == 2) {
                this.field2187[var84] = (short) var3.method379(-2);
                this.field2182[var84] = (short) var3.method379(-2);
                this.field2202[var84] = (short) var3.method379(-2);
                this.field2204[var84] = (short) var4.method379(-2);
                this.field2177[var84] = (short) var4.method379(-2);
                this.field2215[var84] = (short) var4.method379(-2);
                this.field2197[var84] = var5.method352(255);
                this.field2193[var84] = var6.method352(255);
                this.field2184[var84] = var7.method352(255);
                this.field2207[var84] = var7.method352(255);
                this.field2173[var84] = var7.method352(255);
            }
            if (var85 == 3) {
                this.field2187[var84] = (short) var3.method379(-2);
                this.field2182[var84] = (short) var3.method379(-2);
                this.field2202[var84] = (short) var3.method379(-2);
                this.field2204[var84] = (short) var4.method379(-2);
                this.field2177[var84] = (short) var4.method379(-2);
                this.field2215[var84] = (short) var4.method379(-2);
                this.field2197[var84] = var5.method352(255);
                this.field2193[var84] = var6.method352(255);
                this.field2184[var84] = var7.method352(255);
            }
        }
        if (!var14) {
            return;
        }
        var2.field857 = var64;
        int var86 = var2.method368(71);
        if (var86 > 0) {
            var2.field857 += var86 * 4;
        }
        int var87 = var2.method368(-108);
        if (var87 > 0) {
            var2.field857 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "()Lvd;", line = 1558)
    public final class130 method953() {
        class130 var1 = new class130();
        if (this.field2192 != null) {
            var1.field2192 = new byte[this.field2194];
            for (int var2 = 0; var2 < this.field2194; var2++) {
                var1.field2192[var2] = this.field2192[var2];
            }
        }
        var1.field2176 = this.field2176;
        var1.field2194 = this.field2194;
        var1.field2220 = this.field2220;
        var1.field2191 = this.field2191;
        var1.field2180 = this.field2180;
        var1.field2172 = this.field2172;
        var1.field2199 = this.field2199;
        var1.field2201 = this.field2201;
        var1.field2189 = this.field2189;
        var1.field2185 = this.field2185;
        var1.field2181 = this.field2181;
        var1.field2219 = this.field2219;
        var1.field2186 = this.field2186;
        var1.field2190 = this.field2190;
        var1.field2205 = this.field2205;
        var1.field2196 = this.field2196;
        var1.field2187 = this.field2187;
        var1.field2182 = this.field2182;
        var1.field2202 = this.field2202;
        var1.field2204 = this.field2204;
        var1.field2177 = this.field2177;
        var1.field2215 = this.field2215;
        var1.field2197 = this.field2197;
        var1.field2193 = this.field2193;
        var1.field2184 = this.field2184;
        var1.field2207 = this.field2207;
        var1.field2173 = this.field2173;
        var1.field2183 = this.field2183;
        var1.field2212 = this.field2212;
        var1.field2218 = this.field2218;
        var1.field2195 = this.field2195;
        var1.field2209 = this.field2209;
        var1.field2214 = this.field2214;
        var1.field2188 = this.field2188;
        var1.field2198 = this.field2198;
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBSB)I", line = 1613)
    public final int method954(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2199[this.field2194] = arg0;
        this.field2201[this.field2194] = arg1;
        this.field2189[this.field2194] = arg2;
        this.field2192[this.field2194] = arg3;
        this.field2219[this.field2194] = -1;
        this.field2186[this.field2194] = arg4;
        this.field2190[this.field2194] = -1;
        this.field2181[this.field2194] = arg5;
        return this.field2194++;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 1944)
    private class130() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V", line = 1946)
    private class130(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method952(arg0);
        } else {
            this.method935(arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V", line = 1953)
    public class130(int arg0, int arg1, int arg2) {
        this.field2191 = new int[arg0];
        this.field2180 = new int[arg0];
        this.field2172 = new int[arg0];
        this.field2183 = new int[arg0];
        this.field2199 = new int[arg1];
        this.field2201 = new int[arg1];
        this.field2189 = new int[arg1];
        this.field2192 = new byte[arg1];
        this.field2185 = new byte[arg1];
        this.field2181 = new byte[arg1];
        this.field2186 = new short[arg1];
        this.field2190 = new short[arg1];
        this.field2219 = new byte[arg1];
        this.field2212 = new int[arg1];
        if (arg2 > 0) {
            this.field2196 = new byte[arg2];
            this.field2187 = new short[arg2];
            this.field2182 = new short[arg2];
            this.field2202 = new short[arg2];
            this.field2204 = new short[arg2];
            this.field2177 = new short[arg2];
            this.field2215 = new short[arg2];
            this.field2197 = new byte[arg2];
            this.field2193 = new byte[arg2];
            this.field2184 = new byte[arg2];
            this.field2207 = new byte[arg2];
            this.field2173 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([Lvd;I)V", line = 1989)
    public class130(class130[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2176 = 0;
        this.field2194 = 0;
        this.field2220 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field2205 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class130 var12 = arg0[var11];
            if (var12 != null) {
                this.field2176 += var12.field2176;
                this.field2194 += var12.field2194;
                this.field2220 += var12.field2220;
                if (var12.field2185 == null) {
                    if (this.field2205 == -1) {
                        this.field2205 = var12.field2205;
                    }
                    if (this.field2205 != var12.field2205) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field2192 != null;
                var5 |= var12.field2181 != null;
                var6 |= var12.field2212 != null;
                var7 |= var12.field2190 != null;
                var8 |= var12.field2219 != null;
            }
        }
        this.field2191 = new int[this.field2176];
        this.field2180 = new int[this.field2176];
        this.field2172 = new int[this.field2176];
        this.field2183 = new int[this.field2176];
        this.field2199 = new int[this.field2194];
        this.field2201 = new int[this.field2194];
        this.field2189 = new int[this.field2194];
        if (var3) {
            this.field2192 = new byte[this.field2194];
        }
        if (var4) {
            this.field2185 = new byte[this.field2194];
        }
        if (var5) {
            this.field2181 = new byte[this.field2194];
        }
        if (var6) {
            this.field2212 = new int[this.field2194];
        }
        if (var7) {
            this.field2190 = new short[this.field2194];
        }
        if (var8) {
            this.field2219 = new byte[this.field2194];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field2186 = new short[this.field2194];
        if (this.field2220 > 0) {
            this.field2196 = new byte[this.field2220];
            this.field2187 = new short[this.field2220];
            this.field2182 = new short[this.field2220];
            this.field2202 = new short[this.field2220];
            this.field2204 = new short[this.field2220];
            this.field2177 = new short[this.field2220];
            this.field2215 = new short[this.field2220];
            this.field2197 = new byte[this.field2220];
            this.field2193 = new byte[this.field2220];
            this.field2184 = new byte[this.field2220];
            this.field2207 = new byte[this.field2220];
            this.field2173 = new byte[this.field2220];
        }
        this.field2176 = 0;
        this.field2194 = 0;
        this.field2220 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class130 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field2194; var18++) {
                    if (var3 && var17.field2192 != null) {
                        this.field2192[this.field2194] = var17.field2192[var18];
                    }
                    if (var4) {
                        if (var17.field2185 == null) {
                            this.field2185[this.field2194] = var17.field2205;
                        } else {
                            this.field2185[this.field2194] = var17.field2185[var18];
                        }
                    }
                    if (var5 && var17.field2181 != null) {
                        this.field2181[this.field2194] = var17.field2181[var18];
                    }
                    if (var6 && var17.field2212 != null) {
                        this.field2212[this.field2194] = var17.field2212[var18];
                    }
                    if (var7) {
                        if (var17.field2190 == null) {
                            this.field2190[this.field2194] = -1;
                        } else {
                            this.field2190[this.field2194] = var17.field2190[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field2219 == null || var17.field2219[var18] == -1) {
                            this.field2219[this.field2194] = -1;
                        } else {
                            this.field2219[this.field2194] = (byte) (var17.field2219[var18] + this.field2220);
                        }
                    }
                    this.field2186[this.field2194] = var17.field2186[var18];
                    this.field2199[this.field2194] = this.method939(var17, var17.field2199[var18], var16);
                    this.field2201[this.field2194] = this.method939(var17, var17.field2201[var18], var16);
                    this.field2189[this.field2194] = this.method939(var17, var17.field2189[var18], var16);
                    this.field2194++;
                }
                for (int var19 = 0; var19 < var17.field2220; var19++) {
                    byte var20 = this.field2196[this.field2220] = var17.field2196[var19];
                    if (var20 == 0) {
                        this.field2187[this.field2220] = (short) this.method939(var17, var17.field2187[var19], var16);
                        this.field2182[this.field2220] = (short) this.method939(var17, var17.field2182[var19], var16);
                        this.field2202[this.field2220] = (short) this.method939(var17, var17.field2202[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field2187[this.field2220] = var17.field2187[var19];
                        this.field2182[this.field2220] = var17.field2182[var19];
                        this.field2202[this.field2220] = var17.field2202[var19];
                        this.field2204[this.field2220] = var17.field2204[var19];
                        this.field2177[this.field2220] = var17.field2177[var19];
                        this.field2215[this.field2220] = var17.field2215[var19];
                        this.field2197[this.field2220] = var17.field2197[var19];
                        this.field2193[this.field2220] = var17.field2193[var19];
                        this.field2184[this.field2220] = var17.field2184[var19];
                    }
                    if (var20 == 2) {
                        this.field2207[this.field2220] = var17.field2207[var19];
                        this.field2173[this.field2220] = var17.field2173[var19];
                    }
                    this.field2220++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lvd;ZZZZ)V", line = 2218)
    public class130(class130 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2176 = arg0.field2176;
        this.field2194 = arg0.field2194;
        this.field2220 = arg0.field2220;
        if (arg1) {
            this.field2191 = arg0.field2191;
            this.field2180 = arg0.field2180;
            this.field2172 = arg0.field2172;
        } else {
            this.field2191 = new int[this.field2176];
            this.field2180 = new int[this.field2176];
            this.field2172 = new int[this.field2176];
            for (int var6 = 0; var6 < this.field2176; var6++) {
                this.field2191[var6] = arg0.field2191[var6];
                this.field2180[var6] = arg0.field2180[var6];
                this.field2172[var6] = arg0.field2172[var6];
            }
        }
        if (arg2) {
            this.field2186 = arg0.field2186;
        } else {
            this.field2186 = new short[this.field2194];
            for (int var7 = 0; var7 < this.field2194; var7++) {
                this.field2186[var7] = arg0.field2186[var7];
            }
        }
        if (arg3 || arg0.field2190 == null) {
            this.field2190 = arg0.field2190;
        } else {
            this.field2190 = new short[this.field2194];
            for (int var8 = 0; var8 < this.field2194; var8++) {
                this.field2190[var8] = arg0.field2190[var8];
            }
        }
        if (arg4) {
            this.field2181 = arg0.field2181;
        } else {
            this.field2181 = new byte[this.field2194];
            if (arg0.field2181 == null) {
                for (int var9 = 0; var9 < this.field2194; var9++) {
                    this.field2181[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2194; var10++) {
                    this.field2181[var10] = arg0.field2181[var10];
                }
            }
        }
        this.field2199 = arg0.field2199;
        this.field2201 = arg0.field2201;
        this.field2189 = arg0.field2189;
        this.field2192 = arg0.field2192;
        this.field2185 = arg0.field2185;
        this.field2219 = arg0.field2219;
        this.field2205 = arg0.field2205;
        this.field2196 = arg0.field2196;
        this.field2187 = arg0.field2187;
        this.field2182 = arg0.field2182;
        this.field2202 = arg0.field2202;
        this.field2204 = arg0.field2204;
        this.field2177 = arg0.field2177;
        this.field2215 = arg0.field2215;
        this.field2197 = arg0.field2197;
        this.field2193 = arg0.field2193;
        this.field2184 = arg0.field2184;
        this.field2207 = arg0.field2207;
        this.field2173 = arg0.field2173;
        this.field2183 = arg0.field2183;
        this.field2212 = arg0.field2212;
        this.field2218 = arg0.field2218;
        this.field2195 = arg0.field2195;
        this.field2209 = arg0.field2209;
        this.field2214 = arg0.field2214;
        this.field2208 = arg0.field2208;
        this.field2188 = arg0.field2188;
        this.field2198 = arg0.field2198;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 1629)
    private final void method955(int arg0) {
        int var2 = field2213[arg0];
        int var3 = field2211[arg0];
        for (int var4 = 0; var4 < this.field2176; var4++) {
            int var5 = this.field2191[var4] * var3 + this.field2180[var4] * var2 >> 16;
            this.field2180[var4] = this.field2180[var4] * var3 - this.field2191[var4] * var2 >> 16;
            this.field2191[var4] = var5;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "()V", line = 1658)
    public final void method956() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            int var2 = this.field2191[var1];
            this.field2191[var1] = this.field2172[var1];
            this.field2172[var1] = -var2;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Loh;II)Lvd;", line = 1682)
    public static final class130 method957(class15 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method92(arg1, 0, arg2);
        return var3 == null ? null : new class130(var3);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(III)V", line = 1695)
    public final void method958(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2176; var4++) {
            this.field2191[var4] += arg0;
            this.field2180[var4] += arg1;
            this.field2172[var4] += arg2;
        }
        this.method962();
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "()V", line = 1707)
    public final void method959() {
        int var10002;
        if (this.field2183 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2176; var3++) {
                int var4 = this.field2183[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2218 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2218[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2176) {
                int var7 = this.field2183[var6];
                this.field2218[var7][var1[var7]++] = var6++;
            }
            this.field2183 = null;
        }
        if (this.field2212 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2194; var10++) {
            int var11 = this.field2212[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2195 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2195[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2194) {
            int var14 = this.field2212[var13];
            this.field2195[var14][var8[var14]++] = var13++;
        }
        this.field2212 = null;
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "()V", line = 1801)
    public final void method960() {
        if (this.field2209 != null) {
            return;
        }
        this.field2209 = new class306[this.field2176];
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2209[var1] = new class306();
        }
        for (int var2 = 0; var2 < this.field2194; var2++) {
            int var3 = this.field2199[var2];
            int var4 = this.field2201[var2];
            int var5 = this.field2189[var2];
            int var6 = this.field2191[var4] - this.field2191[var3];
            int var7 = this.field2180[var4] - this.field2180[var3];
            int var8 = this.field2172[var4] - this.field2172[var3];
            int var9 = this.field2191[var5] - this.field2191[var3];
            int var10 = this.field2180[var5] - this.field2180[var3];
            int var11 = this.field2172[var5] - this.field2172[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2192 == null) {
                var19 = 0;
            } else {
                var19 = this.field2192[var2];
            }
            if (var19 == 0) {
                class306 var20 = this.field2209[var3];
                var20.field5235 += var16;
                var20.field5231 += var17;
                var20.field5240 += var18;
                var20.field5241++;
                class306 var21 = this.field2209[var4];
                var21.field5235 += var16;
                var21.field5231 += var17;
                var21.field5240 += var18;
                var21.field5241++;
                class306 var22 = this.field2209[var5];
                var22.field5235 += var16;
                var22.field5231 += var17;
                var22.field5240 += var18;
                var22.field5241++;
            } else if (var19 == 1) {
                if (this.field2214 == null) {
                    this.field2214 = new class81[this.field2194];
                }
                class81 var23 = this.field2214[var2] = new class81();
                var23.field1302 = var16;
                var23.field1301 = var17;
                var23.field1295 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIII)Lfg;", line = 1904)
    public final class208 method961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class271.field4640) {
            class176 var6 = new class176(this, arg0, arg1, true);
            var6.method1358();
            return var6;
        } else {
            return new class220(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 1920)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "()V", line = 1923)
    private final void method962() {
        this.field2209 = null;
        this.field2208 = null;
        this.field2214 = null;
        this.field2179 = false;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I", line = 1933)
    public final int method325() {
        if (!this.field2179) {
            this.method936();
        }
        return this.field2203;
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "()V", line = 1939)
    public static void method963() {
        field2206 = null;
        field2200 = null;
        field2213 = null;
        field2211 = null;
    }
}
