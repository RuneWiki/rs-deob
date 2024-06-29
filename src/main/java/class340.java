import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class340 extends class295 {

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "B")
    private byte field5264 = 0;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public int field5279 = 0;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    private int field5280 = 0;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "B")
    private byte field5281 = 0;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Z")
    public boolean field5278 = false;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    private int field5288 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field5263 = 0;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[I")
    private int[] field5291;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "[I")
    public int[] field5298;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "[I")
    public int[] field5293;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "[I")
    public int[] field5283;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "[I")
    private int[] field5290;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[S")
    private short[] field5305;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "[S")
    private short[] field5306;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[S")
    private short[] field5266;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "[S")
    private short[] field5289;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "[S")
    private short[] field5285;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[F")
    private float[] field5277;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[F")
    private float[] field5272;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "[S")
    private short[] field5302;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[B")
    private byte[] field5286;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "[S")
    private short[] field5303;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "[S")
    private short[] field5294;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "[S")
    private short[] field5295;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "[S")
    private short[] field5276;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[B")
    private byte[] field5287;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[S")
    private short[] field5268;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lub;")
    public class55 field5270;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lod;")
    public class317 field5265;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lod;")
    private class317 field5274;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lod;")
    private class317 field5292;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Lod;")
    private class317 field5282;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lod;")
    private class317 field5297;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "S")
    private short field5269;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "S")
    private short field5299;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "[S")
    private short[] field5275;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "[I")
    private int[] field5296;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lgn;")
    private static class303 field5271 = new class303(10000);

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Lrd;")
    private static class340 field5304 = new class340();

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lrd;")
    private static class340 field5308 = new class340();

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lrd;")
    private static class340 field5309 = new class340();

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lrd;")
    private static class340 field5310 = new class340();

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Lrd;")
    private static class340 field5311 = new class340();

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lrd;")
    private static class340 field5312 = new class340();

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "[I")
    private static int[] field5316 = new int[1];

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "Z")
    private static boolean field5320 = false;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "[I")
    private static int[] field5319 = new int[1];

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "F")
    private static float field5313;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "F")
    private static float field5314;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "F")
    private static float field5315;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "F")
    private static float field5317;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "F")
    private static float field5318;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "F")
    private static float field5323;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "I")
    private static int field5321;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
    private static int field5322;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    private static int field5324;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Lpc;")
    private class216 field5301;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lqj;")
    private class258 field5300;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5307;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "[J")
    private static long[] field5284;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[[I")
    private int[][] field5267;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "[[I")
    private int[][] field5273;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "()V", line = 5)
    public final void method2352() {
        if (this.field5306 == null) {
            this.method955();
            return;
        }
        for (int var1 = 0; var1 < this.field5279; var1++) {
            int var2 = this.field5283[var1];
            this.field5283[var1] = this.field5298[var1];
            this.field5298[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5288; var3++) {
            short var4 = this.field5289[var3];
            this.field5289[var3] = this.field5306[var3];
            this.field5306[var3] = (short) (-var4);
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "()I", line = 43)
    public final int method2353() {
        return this.field5269;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(SS)V", line = 48)
    public final void method2354(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5280; var3++) {
            if (this.field5302[var3] == arg0) {
                this.field5302[var3] = arg1;
            }
        }
        this.field5274.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "()V", line = 63)
    public final void method961() {
        for (int var1 = 0; var1 < this.field5279; var1++) {
            int var2 = this.field5298[var1];
            this.field5298[var1] = this.field5283[var1];
            this.field5283[var1] = -var2;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "()I", line = 79)
    public final int method967() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field769;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZZ)Lg;", line = 85)
    public final class295 method972(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2364(arg0, arg1, arg2, field5312, field5311);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZZZ)Lg;", line = 89)
    public final class295 method981(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2364(arg0, arg1, arg2, field5310, field5309);
    }

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "()V", line = 92)
    public final void method2355() {
        if (this.field5306 == null) {
            this.method982();
            return;
        }
        for (int var1 = 0; var1 < this.field5279; var1++) {
            this.field5298[var1] = -this.field5298[var1];
            this.field5283[var1] = -this.field5283[var1];
        }
        for (int var2 = 0; var2 < this.field5288; var2++) {
            this.field5306[var2] = (short) (-this.field5306[var2]);
            this.field5289[var2] = (short) (-this.field5289[var2]);
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(SS)V", line = 127)
    public final void method2356(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5280; var3++) {
            if (this.field5276[var3] == arg0) {
                this.field5276[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class12.field126.method479(true, arg0 & 0xFFFF);
            var5 = class12.field126.method476(255, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class12.field126.method479(true, arg1 & 0xFFFF);
            var7 = class12.field126.method476(255, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field5274.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "()V", line = 161)
    private final void method2357() {
        if (field5271.field4716.length < this.field5280 * 12) {
            field5271 = new class303((this.field5280 + 100) * 12);
        } else {
            field5271.field4679 = 0;
        }
        if (class333.field5170) {
            for (int var1 = 0; var1 < this.field5280; var1++) {
                field5271.method2013(this.field5303[var1], -91);
                field5271.method2013(this.field5294[var1], -72);
                field5271.method2013(this.field5295[var1], -97);
            }
        } else {
            for (int var2 = 0; var2 < this.field5280; var2++) {
                field5271.method1993((byte) 7, this.field5303[var2]);
                field5271.method1993((byte) 7, this.field5294[var2]);
                field5271.method1993((byte) 7, this.field5295[var2]);
            }
        }
        if (!class333.field5188) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field5271.field4679);
            var5.put(field5271.field4716, 0, field5271.field4679);
            var5.flip();
            this.field5297.field4984 = true;
            this.field5297.field4980 = var5;
            this.field5297.field4976 = null;
            return;
        }
        class216 var3 = new class216();
        ByteBuffer var4 = ByteBuffer.wrap(field5271.field4716, 0, field5271.field4679);
        var3.method1442(var4);
        this.field5297.field4984 = true;
        this.field5297.field4980 = null;
        this.field5297.field4976 = var3;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 221)
    public final void method956(int arg0) {
        int var2 = class12.field121[arg0];
        int var3 = class12.field127[arg0];
        for (int var4 = 0; var4 < this.field5279; var4++) {
            int var5 = this.field5293[var4] * var3 - this.field5283[var4] * var2 >> 16;
            this.field5283[var4] = this.field5293[var4] * var2 + this.field5283[var4] * var3 >> 16;
            this.field5293[var4] = var5;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "()V", line = 241)
    public static void method2358() {
        field5284 = null;
        field5271 = null;
        field5307 = null;
        field5304 = null;
        field5308 = null;
        field5309 = null;
        field5310 = null;
        field5311 = null;
        field5312 = null;
        field5316 = null;
        field5319 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ISIB)I", line = 255)
    private static final int method2359(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class12.field129[class141.method985(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class12.field126.method479(true, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class12.field126.method476(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)V", line = 317)
    public final void method964(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5279; var4++) {
            this.field5298[var4] = this.field5298[var4] * arg0 >> 7;
            this.field5293[var4] = this.field5293[var4] * arg1 >> 7;
            this.field5283[var4] = this.field5283[var4] * arg2 >> 7;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 4530)
    private class340() {
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lvi;IIZ)V", line = 4532)
    public class340(class114 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1761];
        this.field5291 = new int[arg0.field1782 + 1];
        for (int var6 = 0; var6 < arg0.field1761; var6++) {
            if ((arg0.field1783 == null || arg0.field1783[var6] != 2) && (arg0.field1755 == null || arg0.field1755[var6] == -1 || !class12.field126.method469(-114, arg0.field1755[var6] & 0xFFFF))) {
                var5[this.field5280++] = var6;
                this.field5291[arg0.field1738[var6]]++;
                this.field5291[arg0.field1749[var6]]++;
                this.field5291[arg0.field1777[var6]]++;
            }
        }
        long[] var7 = new long[this.field5280];
        for (int var8 = 0; var8 < this.field5280; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1755 != null) {
                var14 = arg0.field1755[var9];
                if (var14 != -1) {
                    var12 = class12.field126.method472(false, var14 & 0xFFFF);
                    var13 = class12.field126.method466(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field1750 != null && arg0.field1750[var9] != 0 || var14 != -1 && !class12.field126.method478(var14 & 0xFFFF, -126);
            if ((arg3 || var15) && arg0.field1769 != null) {
                var10 += arg0.field1769[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class152.method1069(var5, (byte) -125, var7);
        this.field5279 = arg0.field1782;
        this.field5263 = arg0.field1766;
        this.field5298 = arg0.field1767;
        this.field5293 = arg0.field1757;
        this.field5283 = arg0.field1754;
        this.field5290 = arg0.field1776;
        this.field5305 = arg0.field1773;
        int var20 = this.field5280 * 3;
        this.field5306 = new short[var20];
        this.field5266 = new short[var20];
        this.field5289 = new short[var20];
        this.field5285 = new short[var20];
        this.field5277 = new float[var20];
        this.field5272 = new float[var20];
        this.field5302 = new short[this.field5280];
        this.field5286 = new byte[this.field5280];
        this.field5303 = new short[this.field5280];
        this.field5294 = new short[this.field5280];
        this.field5295 = new short[this.field5280];
        this.field5276 = new short[this.field5280];
        if (arg0.field1747 != null) {
            this.field5287 = new byte[this.field5280];
        }
        if (arg0.field1741 != null) {
            this.field5268 = new short[this.field5280];
        }
        this.field5270 = new class55();
        this.field5265 = new class317();
        this.field5274 = new class317();
        if (class192.field2903) {
            this.field5292 = new class317();
        }
        this.field5282 = new class317();
        this.field5297 = new class317();
        this.field5269 = (short) arg1;
        this.field5299 = (short) arg2;
        this.field5275 = new short[var20];
        field5284 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field5263; var22++) {
            int var23 = this.field5291[var22];
            this.field5291[var22] = var21;
            var21 += var23;
        }
        this.field5291[this.field5263] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1758 != null) {
            int var28 = arg0.field1772;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field5280; var36++) {
                int var37 = var5[var36];
                if (arg0.field1758[var37] != -1) {
                    int var38 = arg0.field1758[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1738[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1749[var37];
                        } else {
                            var40 = arg0.field1777[var37];
                        }
                        int var41 = arg0.field1767[var40];
                        int var42 = arg0.field1757[var40];
                        int var43 = arg0.field1754[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field1763[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1771[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field1744[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1771[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1744[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1780[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1771[var44] / 1024.0F;
                        var49 = (float) arg0.field1744[var44] / 1024.0F;
                        var48 = (float) arg0.field1780[var44] / 1024.0F;
                    }
                    var27[var44] = method2381(arg0.field1739[var44], arg0.field1775[var44], arg0.field1735[var44], arg0.field1768[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field5280; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1746[var51] & 0xFFFF;
            short var53;
            if (arg0.field1755 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1755[var51];
            }
            int var54;
            if (arg0.field1758 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1758[var51];
            }
            int var55;
            if (arg0.field1750 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1750[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field1763[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1738[var51];
                        int var67 = arg0.field1749[var51];
                        int var68 = arg0.field1777[var51];
                        short var69 = arg0.field1739[var54];
                        short var70 = arg0.field1775[var54];
                        short var71 = arg0.field1735[var54];
                        float var72 = (float) arg0.field1767[var69];
                        float var73 = (float) arg0.field1757[var69];
                        float var74 = (float) arg0.field1754[var69];
                        float var75 = (float) arg0.field1767[var70] - var72;
                        float var76 = (float) arg0.field1757[var70] - var73;
                        float var77 = (float) arg0.field1754[var70] - var74;
                        float var78 = (float) arg0.field1767[var71] - var72;
                        float var79 = (float) arg0.field1757[var71] - var73;
                        float var80 = (float) arg0.field1754[var71] - var74;
                        float var81 = (float) arg0.field1767[var66] - var72;
                        float var82 = (float) arg0.field1757[var66] - var73;
                        float var83 = (float) arg0.field1754[var66] - var74;
                        float var84 = (float) arg0.field1767[var67] - var72;
                        float var85 = (float) arg0.field1757[var67] - var73;
                        float var86 = (float) arg0.field1754[var67] - var74;
                        float var87 = (float) arg0.field1767[var68] - var72;
                        float var88 = (float) arg0.field1757[var68] - var73;
                        float var89 = (float) arg0.field1754[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field1738[var51];
                        int var102 = arg0.field1749[var51];
                        int var103 = arg0.field1777[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1759[var54];
                        float var109 = (float) arg0.field1732[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1780[var54] & 0xFFFF) / 1024.0F;
                            method2362(arg0.field1767[var101], arg0.field1757[var101], arg0.field1754[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field5314;
                            var57 = field5317;
                            method2362(arg0.field1767[var102], arg0.field1757[var102], arg0.field1754[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field5314;
                            var59 = field5317;
                            method2362(arg0.field1767[var103], arg0.field1757[var103], arg0.field1754[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field5314;
                            var61 = field5317;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field1760[var54] / 256.0F;
                            float var113 = (float) arg0.field1742[var54] / 256.0F;
                            int var114 = arg0.field1767[var102] - arg0.field1767[var101];
                            int var115 = arg0.field1757[var102] - arg0.field1757[var101];
                            int var116 = arg0.field1754[var102] - arg0.field1754[var101];
                            int var117 = arg0.field1767[var103] - arg0.field1767[var101];
                            int var118 = arg0.field1757[var103] - arg0.field1757[var101];
                            int var119 = arg0.field1754[var103] - arg0.field1754[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1771[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1744[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1780[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method2378(var126, var127, var128);
                            method2367(arg0.field1767[var101], arg0.field1757[var101], arg0.field1754[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field5323;
                            var57 = field5315;
                            method2367(arg0.field1767[var102], arg0.field1757[var102], arg0.field1754[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field5323;
                            var59 = field5315;
                            method2367(arg0.field1767[var103], arg0.field1757[var103], arg0.field1754[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field5323;
                            var61 = field5315;
                        } else if (var65 == 3) {
                            method2371(arg0.field1767[var101], arg0.field1757[var101], arg0.field1754[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field5318;
                            var57 = field5313;
                            method2371(arg0.field1767[var102], arg0.field1757[var102], arg0.field1754[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field5318;
                            var59 = field5313;
                            method2371(arg0.field1767[var103], arg0.field1757[var103], arg0.field1754[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field5318;
                            var61 = field5313;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method775();
            byte var129;
            if (arg0.field1783 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1783[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1738[var51];
                class283 var133 = arg0.field1743[var132];
                this.field5303[var50] = this.method2375(arg0, var132, var130, var133.field4345, var133.field4347, var133.field4344, var133.field4346, var56, var57);
                int var134 = arg0.field1749[var51];
                class283 var135 = arg0.field1743[var134];
                this.field5294[var50] = this.method2375(arg0, var134, (long) var62 + var130, var135.field4345, var135.field4347, var135.field4344, var135.field4346, var58, var59);
                int var136 = arg0.field1777[var51];
                class283 var137 = arg0.field1743[var136];
                this.field5295[var50] = this.method2375(arg0, var136, (long) var63 + var130, var137.field4345, var137.field4347, var137.field4344, var137.field4346, var60, var61);
            } else if (var129 == 1) {
                class181 var138 = arg0.field1753[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2780 > 0 ? 1024 : 2048) + (var138.field2779 + 256 << 12) + (var138.field2774 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field5303[var50] = this.method2375(arg0, arg0.field1738[var51], var139, var138.field2780, var138.field2779, var138.field2774, 0, var56, var57);
                this.field5294[var50] = this.method2375(arg0, arg0.field1749[var51], (long) var62 + var139, var138.field2780, var138.field2779, var138.field2774, 0, var58, var59);
                this.field5295[var50] = this.method2375(arg0, arg0.field1777[var51], (long) var63 + var139, var138.field2780, var138.field2779, var138.field2774, 0, var60, var61);
            }
            if (arg0.field1755 == null) {
                this.field5276[var50] = -1;
            } else {
                this.field5276[var50] = arg0.field1755[var51];
            }
            if (this.field5287 != null) {
                this.field5287[var50] = (byte) arg0.field1747[var51];
            }
            this.field5302[var50] = arg0.field1746[var51];
            if (arg0.field1750 != null) {
                this.field5286[var50] = arg0.field1750[var51];
            }
            if (arg0.field1741 != null) {
                this.field5268[var50] = arg0.field1741[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field5280; var143++) {
            short var144 = this.field5276[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field5296 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field5280; var147++) {
            short var148 = this.field5276[var147];
            if (var146 != var148) {
                this.field5296[var145++] = var147;
                var146 = var148;
            }
        }
        this.field5296[var145] = this.field5280;
        field5284 = null;
        this.field5306 = method2360(this.field5306, this.field5288);
        this.field5266 = method2360(this.field5266, this.field5288);
        this.field5289 = method2360(this.field5289, this.field5288);
        this.field5285 = method2360(this.field5285, this.field5288);
        this.field5277 = method2361(this.field5277, this.field5288);
        this.field5272 = method2361(this.field5272, this.field5288);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([SI)[S", line = 335)
    private static final short[] method2360(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class223.method1499(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([FI)[F", line = 341)
    private static final float[] method2361(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class223.method1503(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII[FFIF)V", line = 346)
    private static final void method2362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5314 = var16;
        field5317 = var17;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[IIIIZ)V", line = 391)
    public final void method968(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field5324 = 0;
            field5321 = 0;
            field5322 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field5273.length) {
                    int[] var14 = this.field5273[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field5324 += this.field5298[var16];
                        field5321 += this.field5293[var16];
                        field5322 += this.field5283[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field5324 = field5324 / var11 + var8;
                field5321 = field5321 / var11 + var9;
                field5322 = field5322 / var11 + var10;
            } else {
                field5324 = var8;
                field5321 = var9;
                field5322 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field5273.length) {
                    int[] var22 = this.field5273[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field5298[var24] += var17;
                        this.field5293[var24] += var18;
                        this.field5283[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5273.length) {
                    int[] var27 = this.field5273[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field5298[var29] -= field5324;
                        this.field5293[var29] -= field5321;
                        this.field5283[var29] -= field5322;
                        if (arg4 != 0) {
                            int var30 = class12.field121[arg4];
                            int var31 = class12.field127[arg4];
                            int var32 = this.field5298[var29] * var31 + this.field5293[var29] * var30 + 32767 >> 16;
                            this.field5293[var29] = this.field5293[var29] * var31 + 32767 - this.field5298[var29] * var30 >> 16;
                            this.field5298[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class12.field121[arg2];
                            int var34 = class12.field127[arg2];
                            int var35 = this.field5293[var29] * var34 + 32767 - this.field5283[var29] * var33 >> 16;
                            this.field5283[var29] = this.field5293[var29] * var33 + this.field5283[var29] * var34 + 32767 >> 16;
                            this.field5293[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class12.field121[arg3];
                            int var37 = class12.field127[arg3];
                            int var38 = this.field5298[var29] * var37 + this.field5283[var29] * var36 + 32767 >> 16;
                            this.field5283[var29] = this.field5283[var29] * var37 + 32767 - this.field5298[var29] * var36 >> 16;
                            this.field5298[var29] = var38;
                        }
                        this.field5298[var29] += field5324;
                        this.field5293[var29] += field5321;
                        this.field5283[var29] += field5322;
                    }
                }
            }
            if (arg5 && this.field5306 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field5273.length) {
                        int[] var41 = this.field5273[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field5291[var43];
                            int var45 = this.field5291[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field5275[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class12.field121[arg4];
                                    int var49 = class12.field127[arg4];
                                    int var50 = this.field5306[var47] * var49 + this.field5266[var47] * var48 + 32767 >> 16;
                                    this.field5266[var47] = (short) (this.field5266[var47] * var49 + 32767 - this.field5306[var47] * var48 >> 16);
                                    this.field5306[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class12.field121[arg2];
                                    int var52 = class12.field127[arg2];
                                    int var53 = this.field5266[var47] * var52 + 32767 - this.field5289[var47] * var51 >> 16;
                                    this.field5289[var47] = (short) (this.field5289[var47] * var52 + this.field5266[var47] * var51 + 32767 >> 16);
                                    this.field5266[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class12.field121[arg3];
                                    int var55 = class12.field127[arg3];
                                    int var56 = this.field5306[var47] * var55 + this.field5289[var47] * var54 + 32767 >> 16;
                                    this.field5289[var47] = (short) (this.field5289[var47] * var55 + 32767 - this.field5306[var47] * var54 >> 16);
                                    this.field5306[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field5292 != null) {
                    this.field5292.field4984 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field5273.length) {
                    int[] var59 = this.field5273[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field5298[var61] -= field5324;
                        this.field5293[var61] -= field5321;
                        this.field5283[var61] -= field5322;
                        this.field5298[var61] = this.field5298[var61] * arg2 >> 7;
                        this.field5293[var61] = this.field5293[var61] * arg3 >> 7;
                        this.field5283[var61] = this.field5283[var61] * arg4 >> 7;
                        this.field5298[var61] += field5324;
                        this.field5293[var61] += field5321;
                        this.field5283[var61] += field5322;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5267 != null && this.field5286 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field5267.length) {
                        int[] var64 = this.field5267[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field5286[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field5286[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field5274.field4984 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5267 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field5267.length) {
                    int[] var70 = this.field5267[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field5302[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field5302[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field5274.field4984 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "()V", line = 801)
    public final void method982() {
        for (int var1 = 0; var1 < this.field5279; var1++) {
            this.field5298[var1] = -this.field5298[var1];
            this.field5283[var1] = -this.field5283[var1];
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(ZZZ)Lg;", line = 814)
    public final class295 method989(boolean arg0, boolean arg1, boolean arg2) {
        return this.method2364(arg0, arg1, arg2, field5308, field5304);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[IIIIZI[I)V", line = 818)
    public final void method984(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field5324 = 0;
            field5321 = 0;
            field5322 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5273.length) {
                    int[] var16 = this.field5273[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5305 == null || (arg6 & this.field5305[var18]) != 0) {
                            field5324 += this.field5298[var18];
                            field5321 += this.field5293[var18];
                            field5322 += this.field5283[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field5324 = field5324 / var13 + var10;
                field5321 = field5321 / var13 + var11;
                field5322 = field5322 / var13 + var12;
                field5320 = true;
            } else {
                field5324 = var10;
                field5321 = var11;
                field5322 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5273.length) {
                    int[] var27 = this.field5273[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5305 == null || (arg6 & this.field5305[var29]) != 0) {
                            this.field5298[var29] += var22;
                            this.field5293[var29] += var23;
                            this.field5283[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field5273.length) {
                        int[] var92 = this.field5273[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field5305 == null || (arg6 & this.field5305[var94]) != 0) {
                                this.field5298[var94] -= field5324;
                                this.field5293[var94] -= field5321;
                                this.field5283[var94] -= field5322;
                                if (arg4 != 0) {
                                    int var95 = class12.field121[arg4];
                                    int var96 = class12.field127[arg4];
                                    int var97 = this.field5298[var94] * var96 + this.field5293[var94] * var95 + 32767 >> 16;
                                    this.field5293[var94] = this.field5293[var94] * var96 + 32767 - this.field5298[var94] * var95 >> 16;
                                    this.field5298[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class12.field121[arg2];
                                    int var99 = class12.field127[arg2];
                                    int var100 = this.field5293[var94] * var99 + 32767 - this.field5283[var94] * var98 >> 16;
                                    this.field5283[var94] = this.field5293[var94] * var98 + this.field5283[var94] * var99 + 32767 >> 16;
                                    this.field5293[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class12.field121[arg3];
                                    int var102 = class12.field127[arg3];
                                    int var103 = this.field5298[var94] * var102 + this.field5283[var94] * var101 + 32767 >> 16;
                                    this.field5283[var94] = this.field5283[var94] * var102 + 32767 - this.field5298[var94] * var101 >> 16;
                                    this.field5298[var94] = var103;
                                }
                                this.field5298[var94] += field5324;
                                this.field5293[var94] += field5321;
                                this.field5283[var94] += field5322;
                            }
                        }
                    }
                }
                if (arg5 && this.field5306 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field5273.length) {
                            int[] var106 = this.field5273[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field5305 == null || (arg6 & this.field5305[var108]) != 0) {
                                    int var109 = this.field5291[var108];
                                    int var110 = this.field5291[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field5275[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class12.field121[arg4];
                                            int var114 = class12.field127[arg4];
                                            int var115 = this.field5306[var112] * var114 + this.field5266[var112] * var113 + 32767 >> 16;
                                            this.field5266[var112] = (short) (this.field5266[var112] * var114 + 32767 - this.field5306[var112] * var113 >> 16);
                                            this.field5306[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class12.field121[arg2];
                                            int var117 = class12.field127[arg2];
                                            int var118 = this.field5266[var112] * var117 + 32767 - this.field5289[var112] * var116 >> 16;
                                            this.field5289[var112] = (short) (this.field5289[var112] * var117 + this.field5266[var112] * var116 + 32767 >> 16);
                                            this.field5266[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class12.field121[arg3];
                                            int var120 = class12.field127[arg3];
                                            int var121 = this.field5306[var112] * var120 + this.field5289[var112] * var119 + 32767 >> 16;
                                            this.field5289[var112] = (short) (this.field5289[var112] * var120 + 32767 - this.field5306[var112] * var119 >> 16);
                                            this.field5306[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5292 != null) {
                        this.field5292.field4984 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field5320) {
                    int var36 = arg7[6] * field5322 + arg7[0] * field5324 + arg7[3] * field5321 + 16384 >> 15;
                    int var37 = arg7[7] * field5322 + arg7[1] * field5324 + arg7[4] * field5321 + 16384 >> 15;
                    int var38 = arg7[8] * field5322 + arg7[2] * field5324 + arg7[5] * field5321 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field5324 = var39;
                    field5321 = var40;
                    field5322 = var41;
                    field5320 = false;
                }
                int[] var42 = new int[9];
                int var43 = class12.field127[arg2] >> 1;
                int var44 = class12.field121[arg2] >> 1;
                int var45 = class12.field127[arg3] >> 1;
                int var46 = class12.field121[arg3] >> 1;
                int var47 = class12.field127[arg4] >> 1;
                int var48 = class12.field121[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field5322 + var42[0] * -field5324 + var42[1] * -field5321 + 16384 >> 15;
                int var52 = var42[5] * -field5322 + var42[3] * -field5324 + var42[4] * -field5321 + 16384 >> 15;
                int var53 = var42[8] * -field5322 + var42[6] * -field5324 + var42[7] * -field5321 + 16384 >> 15;
                int var54 = field5324 + var51;
                int var55 = field5321 + var52;
                int var56 = field5322 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field5273.length) {
                        int[] var81 = this.field5273[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field5305 == null || (arg6 & this.field5305[var83]) != 0) {
                                int var84 = this.field5283[var83] * var68[2] + this.field5298[var83] * var68[0] + this.field5293[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field5283[var83] * var68[5] + this.field5298[var83] * var68[3] + this.field5293[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field5283[var83] * var68[8] + this.field5298[var83] * var68[6] + this.field5293[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field5298[var83] = var87;
                                this.field5293[var83] = var88;
                                this.field5283[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5273.length) {
                        int[] var174 = this.field5273[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5305 == null || (arg6 & this.field5305[var176]) != 0) {
                                this.field5298[var176] -= field5324;
                                this.field5293[var176] -= field5321;
                                this.field5283[var176] -= field5322;
                                this.field5298[var176] = this.field5298[var176] * arg2 >> 7;
                                this.field5293[var176] = this.field5293[var176] * arg3 >> 7;
                                this.field5283[var176] = this.field5283[var176] * arg4 >> 7;
                                this.field5298[var176] += field5324;
                                this.field5293[var176] += field5321;
                                this.field5283[var176] += field5322;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field5320) {
                    int var128 = arg7[6] * field5322 + arg7[0] * field5324 + arg7[3] * field5321 + 16384 >> 15;
                    int var129 = arg7[7] * field5322 + arg7[1] * field5324 + arg7[4] * field5321 + 16384 >> 15;
                    int var130 = arg7[8] * field5322 + arg7[2] * field5324 + arg7[5] * field5321 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field5324 = var131;
                    field5321 = var132;
                    field5322 = var133;
                    field5320 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field5324 * var134 + 16384 >> 15;
                int var138 = -field5321 * var135 + 16384 >> 15;
                int var139 = -field5322 * var136 + 16384 >> 15;
                int var140 = field5324 + var137;
                int var141 = field5321 + var138;
                int var142 = field5322 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field5273.length) {
                        int[] var163 = this.field5273[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field5305 == null || (arg6 & this.field5305[var165]) != 0) {
                                int var166 = this.field5283[var165] * var150[2] + this.field5298[var165] * var150[0] + this.field5293[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field5283[var165] * var150[5] + this.field5298[var165] * var150[3] + this.field5293[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field5283[var165] * var150[8] + this.field5298[var165] * var150[6] + this.field5293[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field5298[var165] = var169;
                                this.field5293[var165] = var170;
                                this.field5283[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5267 != null && this.field5286 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field5267.length) {
                        int[] var179 = this.field5267[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field5268 == null || (arg6 & this.field5268[var181]) != 0) {
                                int var182 = (this.field5286[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field5286[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field5274.field4984 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field5267 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field5267.length) {
                    int[] var185 = this.field5267[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field5268 == null || (arg6 & this.field5268[var187]) != 0) {
                            int var188 = this.field5302[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field5302[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field5274.field4984 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "()I", line = 1608)
    public final int method957() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field774;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z", line = 1614)
    public final boolean method987() {
        if (this.field5273 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5279; var1++) {
            this.field5298[var1] <<= 0x4;
            this.field5293[var1] <<= 0x4;
            this.field5283[var1] <<= 0x4;
        }
        field5324 = 0;
        field5321 = 0;
        field5322 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 1637)
    public final void method955() {
        for (int var1 = 0; var1 < this.field5279; var1++) {
            int var2 = this.field5283[var1];
            this.field5283[var1] = this.field5298[var1];
            this.field5298[var1] = -var2;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZZZZZZZZZZ)Lrd;", line = 1652)
    public final class340 method2363(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class340 var12 = new class340();
        var12.field5279 = this.field5279;
        var12.field5263 = this.field5263;
        var12.field5288 = this.field5288;
        var12.field5280 = this.field5280;
        if (arg0) {
            var12.field5298 = this.field5298;
            var12.field5283 = this.field5283;
        } else {
            var12.field5298 = class231.method1586(-24773, this.field5298);
            var12.field5283 = class231.method1586(-24773, this.field5283);
        }
        if (arg1) {
            var12.field5293 = this.field5293;
        } else {
            var12.field5293 = class231.method1586(-24773, this.field5293);
        }
        if (arg0 && arg1) {
            var12.field5265 = this.field5265;
            var12.field5270 = this.field5270;
        } else {
            var12.field5265 = new class317();
            var12.field5270 = new class55();
        }
        if (arg2) {
            var12.field5302 = this.field5302;
        } else {
            var12.field5302 = class131.method898(14118, this.field5302);
        }
        if (arg3) {
            var12.field5286 = this.field5286;
        } else {
            var12.field5286 = class59.method403(-28343, this.field5286);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class192.field2903) {
            var12.field5274 = new class317();
        } else {
            var12.field5274 = this.field5274;
        }
        if (arg5) {
            var12.field5306 = this.field5306;
            var12.field5266 = this.field5266;
            var12.field5289 = this.field5289;
            var12.field5285 = this.field5285;
        } else {
            var12.field5306 = class131.method898(14118, this.field5306);
            var12.field5266 = class131.method898(14118, this.field5266);
            var12.field5289 = class131.method898(14118, this.field5289);
            var12.field5285 = class131.method898(14118, this.field5285);
        }
        if (!class192.field2903) {
            var12.field5292 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field5292 = this.field5292;
        } else {
            var12.field5292 = new class317();
        }
        if (arg8) {
            var12.field5277 = this.field5277;
            var12.field5272 = this.field5272;
            var12.field5282 = this.field5282;
        } else {
            var12.field5277 = class132.method904(this.field5277, 0);
            var12.field5272 = class132.method904(this.field5272, 0);
            var12.field5282 = new class317();
        }
        if (arg9) {
            var12.field5303 = this.field5303;
            var12.field5294 = this.field5294;
            var12.field5295 = this.field5295;
            var12.field5297 = this.field5297;
        } else {
            var12.field5303 = class131.method898(14118, this.field5303);
            var12.field5294 = class131.method898(14118, this.field5294);
            var12.field5295 = class131.method898(14118, this.field5295);
            var12.field5297 = new class317();
        }
        if (arg10) {
            var12.field5276 = this.field5276;
        } else {
            var12.field5276 = class131.method898(14118, this.field5276);
        }
        var12.field5290 = this.field5290;
        var12.field5273 = this.field5273;
        var12.field5287 = this.field5287;
        var12.field5267 = this.field5267;
        var12.field5296 = this.field5296;
        var12.field5275 = this.field5275;
        var12.field5291 = this.field5291;
        var12.field5269 = this.field5269;
        var12.field5299 = this.field5299;
        var12.field5305 = this.field5305;
        var12.field5268 = this.field5268;
        return var12;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 1795)
    public final void method960(int arg0) {
        int var2 = class12.field121[arg0];
        int var3 = class12.field127[arg0];
        for (int var4 = 0; var4 < this.field5279; var4++) {
            int var5 = this.field5298[var4] * var3 + this.field5283[var4] * var2 >> 16;
            this.field5283[var4] = this.field5283[var4] * var3 - this.field5298[var4] * var2 >> 16;
            this.field5298[var4] = var5;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfe;IIIZ)V", line = 1818)
    public final void method641(class94 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class340 var6 = (class340) arg0;
        if (this.field5280 == 0 || var6.field5280 == 0) {
            return;
        }
        int var7 = var6.field5263;
        int[] var8 = var6.field5298;
        int[] var9 = var6.field5293;
        int[] var10 = var6.field5283;
        short[] var11 = var6.field5306;
        short[] var12 = var6.field5266;
        short[] var13 = var6.field5289;
        short[] var14 = var6.field5285;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5300 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field5300.field4008;
            var16 = this.field5300.field4007;
            var17 = this.field5300.field4006;
            var18 = this.field5300.field4009;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5300 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5300.field4008;
            var20 = var6.field5300.field4007;
            var21 = var6.field5300.field4006;
            var22 = var6.field5300.field4009;
        }
        int[] var23 = var6.field5291;
        short[] var24 = var6.field5275;
        if (!var6.field5270.field773) {
            var6.method2373();
        }
        short var25 = var6.field5270.field771;
        short var26 = var6.field5270.field770;
        short var27 = var6.field5270.field774;
        short var28 = var6.field5270.field775;
        short var29 = var6.field5270.field768;
        short var30 = var6.field5270.field769;
        for (int var31 = 0; var31 < this.field5263; var31++) {
            int var32 = this.field5293[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5298[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5283[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5291[var31];
                        int var37 = this.field5291[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5275[var38] - 1;
                            if (var35 == -1 || this.field5285[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field5300 = new class258();
                                            var15 = this.field5300.field4008 = class131.method898(14118, this.field5306);
                                            var16 = this.field5300.field4007 = class131.method898(14118, this.field5266);
                                            var17 = this.field5300.field4006 = class131.method898(14118, this.field5289);
                                            var18 = this.field5300.field4009 = class131.method898(14118, this.field5285);
                                        }
                                        if (var19 == null) {
                                            class258 var44 = var6.field5300 = new class258();
                                            var19 = var44.field4008 = class131.method898(14118, var11);
                                            var20 = var44.field4007 = class131.method898(14118, var12);
                                            var21 = var44.field4006 = class131.method898(14118, var13);
                                            var22 = var44.field4009 = class131.method898(14118, var14);
                                        }
                                        short var45 = this.field5306[var35];
                                        short var46 = this.field5266[var35];
                                        short var47 = this.field5289[var35];
                                        short var48 = this.field5285[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field5291[var31];
                                        int var58 = this.field5291[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field5275[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZZLrd;Lrd;)Lg;", line = 2057)
    private final class295 method2364(boolean arg0, boolean arg1, boolean arg2, class340 arg3, class340 arg4) {
        arg3.field5279 = this.field5279;
        arg3.field5263 = this.field5263;
        arg3.field5288 = this.field5288;
        arg3.field5280 = this.field5280;
        arg3.field5269 = this.field5269;
        arg3.field5299 = this.field5299;
        arg3.field5264 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field5298 == null || arg3.field5298.length < this.field5279) {
            arg3.field5298 = new int[this.field5279 + 100];
            arg3.field5293 = new int[this.field5279 + 100];
            arg3.field5283 = new int[this.field5279 + 100];
        }
        for (int var6 = 0; var6 < this.field5279; var6++) {
            arg3.field5298[var6] = this.field5298[var6];
            arg3.field5293[var6] = this.field5293[var6];
            arg3.field5283[var6] = this.field5283[var6];
        }
        if (arg3.field5265 == null) {
            arg3.field5265 = new class317();
        }
        arg3.field5265.field4984 = false;
        if (arg3.field5270 == null) {
            arg3.field5270 = new class55();
        }
        arg3.field5270.field773 = false;
        if (arg0) {
            arg3.field5286 = this.field5286;
        } else {
            if (arg4.field5286 == null || arg4.field5286.length < this.field5280) {
                arg4.field5286 = new byte[this.field5280 + 100];
            }
            arg3.field5286 = arg4.field5286;
            for (int var7 = 0; var7 < this.field5280; var7++) {
                arg3.field5286[var7] = this.field5286[var7];
            }
        }
        if (arg1) {
            arg3.field5302 = this.field5302;
        } else {
            if (arg4.field5302 == null || arg4.field5302.length < this.field5280) {
                arg4.field5302 = new short[this.field5280 + 100];
            }
            arg3.field5302 = arg4.field5302;
            for (int var8 = 0; var8 < this.field5280; var8++) {
                arg3.field5302[var8] = this.field5302[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field5274 = this.field5274;
        } else {
            if (arg4.field5274 == null) {
                arg4.field5274 = new class317();
            }
            arg3.field5274 = arg4.field5274;
            arg3.field5274.field4984 = false;
        }
        if (arg2 || this.field5306 == null) {
            arg3.field5306 = this.field5306;
            arg3.field5266 = this.field5266;
            arg3.field5289 = this.field5289;
            arg3.field5285 = this.field5285;
            arg3.field5292 = this.field5292;
        } else {
            if (arg4.field5306 == null || arg4.field5306.length < this.field5288) {
                arg4.field5306 = new short[this.field5288 + 100];
                arg4.field5266 = new short[this.field5288 + 100];
                arg4.field5289 = new short[this.field5288 + 100];
                arg4.field5285 = new short[this.field5288 + 100];
            }
            arg3.field5306 = arg4.field5306;
            arg3.field5266 = arg4.field5266;
            arg3.field5289 = arg4.field5289;
            arg3.field5285 = arg4.field5285;
            for (int var9 = 0; var9 < this.field5288; var9++) {
                arg3.field5306[var9] = this.field5306[var9];
                arg3.field5266[var9] = this.field5266[var9];
                arg3.field5289[var9] = this.field5289[var9];
                arg3.field5285[var9] = this.field5285[var9];
            }
            if (class192.field2903) {
                if (arg4.field5292 == null) {
                    arg4.field5292 = new class317();
                }
                arg3.field5292 = arg4.field5292;
                arg3.field5292.field4984 = false;
            } else {
                arg3.field5292 = null;
            }
        }
        arg3.field5277 = this.field5277;
        arg3.field5272 = this.field5272;
        arg3.field5290 = this.field5290;
        arg3.field5273 = this.field5273;
        arg3.field5303 = this.field5303;
        arg3.field5294 = this.field5294;
        arg3.field5295 = this.field5295;
        arg3.field5276 = this.field5276;
        arg3.field5287 = this.field5287;
        arg3.field5267 = this.field5267;
        arg3.field5282 = this.field5282;
        arg3.field5297 = this.field5297;
        arg3.field5296 = this.field5296;
        arg3.field5275 = this.field5275;
        arg3.field5291 = this.field5291;
        arg3.field4545 = this.field4545;
        arg3.field5305 = this.field5305;
        arg3.field5268 = this.field5268;
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V", line = 2212)
    public final void method958(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field5324 = 0;
            field5321 = 0;
            field5322 = 0;
            for (int var6 = 0; var6 < this.field5279; var6++) {
                field5324 += this.field5298[var6];
                field5321 += this.field5293[var6];
                field5322 += this.field5283[var6];
                var5++;
            }
            if (var5 > 0) {
                field5324 = field5324 / var5 + arg1;
                field5321 = field5321 / var5 + arg2;
                field5322 = field5322 / var5 + arg3;
            } else {
                field5324 = arg1;
                field5321 = arg2;
                field5322 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5279; var7++) {
                this.field5298[var7] += arg1;
                this.field5293[var7] += arg2;
                this.field5283[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5279; var8++) {
                this.field5298[var8] -= field5324;
                this.field5293[var8] -= field5321;
                this.field5283[var8] -= field5322;
                if (arg3 != 0) {
                    int var9 = class12.field121[arg3];
                    int var10 = class12.field127[arg3];
                    int var11 = this.field5298[var8] * var10 + this.field5293[var8] * var9 + 32767 >> 16;
                    this.field5293[var8] = this.field5293[var8] * var10 + 32767 - this.field5298[var8] * var9 >> 16;
                    this.field5298[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class12.field121[arg1];
                    int var13 = class12.field127[arg1];
                    int var14 = this.field5293[var8] * var13 + 32767 - this.field5283[var8] * var12 >> 16;
                    this.field5283[var8] = this.field5293[var8] * var12 + this.field5283[var8] * var13 + 32767 >> 16;
                    this.field5293[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class12.field121[arg2];
                    int var16 = class12.field127[arg2];
                    int var17 = this.field5298[var8] * var16 + this.field5283[var8] * var15 + 32767 >> 16;
                    this.field5283[var8] = this.field5283[var8] * var16 + 32767 - this.field5298[var8] * var15 >> 16;
                    this.field5298[var8] = var17;
                }
                this.field5298[var8] += field5324;
                this.field5293[var8] += field5321;
                this.field5283[var8] += field5322;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5279; var18++) {
                this.field5298[var18] -= field5324;
                this.field5293[var18] -= field5321;
                this.field5283[var18] -= field5322;
                this.field5298[var18] = this.field5298[var18] * arg1 / 128;
                this.field5293[var18] = this.field5293[var18] * arg2 / 128;
                this.field5283[var18] = this.field5283[var18] * arg3 / 128;
                this.field5298[var18] += field5324;
                this.field5293[var18] += field5321;
                this.field5283[var18] += field5322;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5280; var19++) {
                int var20 = (this.field5286[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field5286[var19] = (byte) var20;
            }
            this.field5274.field4984 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field5280; var21++) {
                int var22 = this.field5302[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field5302[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field5274.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 2406)
    public final void method2365(int arg0) {
        this.field5299 = (short) arg0;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)Z", line = 2412)
    private final boolean method2366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()I", line = 2435)
    public final int method112() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field771;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2443)
    private static final void method2367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field5323 = var18;
        field5315 = var19;
    }

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "()V", line = 2524)
    public final void method2368() {
        for (int var1 = 0; var1 < this.field5279; var1++) {
            this.field5283[var1] = -this.field5283[var1];
        }
        if (this.field5289 != null) {
            for (int var2 = 0; var2 < this.field5288; var2++) {
                this.field5289[var2] = (short) (-this.field5289[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field5280; var3++) {
            short var4 = this.field5303[var3];
            this.field5303[var3] = this.field5295[var3];
            this.field5295[var3] = var4;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
        this.field5297.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V", line = 2560)
    public final void method2369(int arg0) {
        if (this.field5306 == null) {
            this.method960(arg0);
            return;
        }
        int var2 = class12.field121[arg0];
        int var3 = class12.field127[arg0];
        for (int var4 = 0; var4 < this.field5279; var4++) {
            int var5 = this.field5298[var4] * var3 + this.field5283[var4] * var2 >> 16;
            this.field5283[var4] = this.field5283[var4] * var3 - this.field5298[var4] * var2 >> 16;
            this.field5298[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field5288; var6++) {
            int var7 = this.field5306[var6] * var3 + this.field5289[var6] * var2 >> 16;
            this.field5289[var6] = (short) (this.field5289[var6] * var3 - this.field5306[var6] * var2 >> 16);
            this.field5306[var6] = (short) var7;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "()I", line = 2602)
    public final int method966() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field768;
    }

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "()V", line = 2613)
    public final void method2370() {
        if (this.field5306 == null) {
            this.method961();
            return;
        }
        for (int var1 = 0; var1 < this.field5279; var1++) {
            int var2 = this.field5298[var1];
            this.field5298[var1] = this.field5283[var1];
            this.field5283[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field5288; var3++) {
            short var4 = this.field5306[var3];
            this.field5306[var3] = this.field5289[var3];
            this.field5289[var3] = (short) (-var4);
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
        if (this.field5292 != null) {
            this.field5292.field4984 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()I", line = 2651)
    public final int method952() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field770;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIJ)V", line = 2658)
    public final void method965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field5288 == 0) {
            return;
        }
        GL var10 = class333.field5160;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method2376();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII[FIF)V", line = 2682)
    private static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field5318 = var16;
        field5313 = var17;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILrd;[[I[[IIII)V", line = 2725)
    public final void method2372(int arg0, int arg1, class340 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field5270.field773) {
            arg2.method2373();
        }
        int var9 = arg2.field5270.field774 + arg5;
        int var10 = arg2.field5270.field775 + arg5;
        int var11 = arg2.field5270.field768 + arg7;
        int var12 = arg2.field5270.field769 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field5263; var17++) {
                int var18 = this.field5298[var17] + arg5;
                int var19 = this.field5283[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field5293[var17] = this.field5293[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field5270.field771;
            for (int var28 = 0; var28 < this.field5263; var28++) {
                int var29 = (this.field5293[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field5298[var28] + arg5;
                    int var31 = this.field5283[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field5293[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1933(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field5270.field770 - arg2.field5270.field771;
            for (int var42 = 0; var42 < this.field5263; var42++) {
                int var43 = this.field5298[var42] + arg5;
                int var44 = this.field5283[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field5293[var42] = var51 + this.field5293[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field5270.field770 - arg2.field5270.field771;
            for (int var53 = 0; var53 < this.field5263; var53++) {
                int var54 = this.field5298[var53] + arg5;
                int var55 = this.field5283[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field5293[var53] = ((this.field5293[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field5265.field4984 = false;
        this.field5270.field773 = false;
    }

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "()V", line = 2923)
    private final void method2373() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field5263; var9++) {
            int var10 = this.field5298[var9];
            int var11 = this.field5293[var9];
            int var12 = this.field5283[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field5270.field774 = (short) var1;
        this.field5270.field775 = (short) var4;
        this.field5270.field771 = (short) var2;
        this.field5270.field770 = (short) var5;
        this.field5270.field768 = (short) var3;
        this.field5270.field769 = (short) var6;
        this.field5270.field772 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field5270.field773 = true;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()V", line = 2994)
    public final void method973() {
        for (int var1 = 0; var1 < this.field5279; var1++) {
            this.field5298[var1] = this.field5298[var1] + 7 >> 4;
            this.field5293[var1] = this.field5293[var1] + 7 >> 4;
            this.field5283[var1] = this.field5283[var1] + 7 >> 4;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 3008)
    public final void method2374(int arg0) {
        this.field5269 = (short) arg0;
        this.field5274.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lvi;IJIIIIFF)S", line = 3015)
    private final short method2375(class114 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field5291[arg1];
        int var12 = this.field5291[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field5275[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field5284[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field5275[var13] = (short) (this.field5288 + 1);
        field5284[var13] = arg2;
        this.field5306[this.field5288] = (short) arg3;
        this.field5266[this.field5288] = (short) arg4;
        this.field5289[this.field5288] = (short) arg5;
        this.field5285[this.field5288] = (short) arg6;
        this.field5277[this.field5288] = arg7;
        this.field5272[this.field5288] = arg8;
        return (short) (this.field5288++);
    }

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "()V", line = 3051)
    private final void method2376() {
        GL var1 = class333.field5160;
        if (this.field5280 == 0) {
            return;
        }
        if (this.field5264 != 0) {
            this.method2380(true, !this.field5265.field4984 && (this.field5264 & 0x1) != 0, !this.field5274.field4984 && (this.field5264 & 0x2) != 0, this.field5292 != null && !this.field5292.field4984 && (this.field5264 & 0x4) != 0, false);
        }
        this.method2380(false, !this.field5265.field4984, !this.field5274.field4984, this.field5292 != null && !this.field5292.field4984, !this.field5282.field4984);
        if (!this.field5297.field4984) {
            this.method2357();
        }
        if (this.field5281 != 0) {
            if ((this.field5281 & 0x1) != 0) {
                this.field5298 = null;
                this.field5293 = null;
                this.field5283 = null;
                this.field5275 = null;
                this.field5291 = null;
            }
            if ((this.field5281 & 0x2) != 0) {
                this.field5302 = null;
                this.field5286 = null;
            }
            if ((this.field5281 & 0x4) != 0) {
                this.field5306 = null;
                this.field5266 = null;
                this.field5289 = null;
                this.field5285 = null;
            }
            if ((this.field5281 & 0x8) != 0) {
                this.field5277 = null;
                this.field5272 = null;
            }
            if ((this.field5281 & 0x10) != 0) {
                this.field5303 = null;
                this.field5294 = null;
                this.field5295 = null;
            }
            this.field5281 = 0;
        }
        class216 var2 = null;
        if (this.field5265.field4976 != null) {
            this.field5265.field4976.method1446();
            var2 = this.field5265.field4976;
            var1.glVertexPointer(3, 5126, this.field5265.field4979, (long) this.field5265.field4983);
        }
        if (this.field5274.field4976 != null) {
            if (this.field5274.field4976 != var2) {
                this.field5274.field4976.method1446();
                var2 = this.field5274.field4976;
            }
            var1.glColorPointer(4, 5121, this.field5274.field4979, (long) this.field5274.field4983);
        }
        if (class192.field2903 && this.field5292.field4976 != null) {
            if (this.field5292.field4976 != var2) {
                this.field5292.field4976.method1446();
                var2 = this.field5292.field4976;
            }
            var1.glNormalPointer(5126, this.field5292.field4979, (long) this.field5292.field4983);
        }
        if (this.field5282.field4976 != null) {
            if (this.field5282.field4976 != var2) {
                this.field5282.field4976.method1446();
                class216 var3 = this.field5282.field4976;
            }
            var1.glTexCoordPointer(2, 5126, this.field5282.field4979, (long) this.field5282.field4983);
        }
        if (this.field5297.field4976 != null) {
            this.field5297.field4976.method1444();
        }
        if (this.field5265.field4976 == null || this.field5274.field4976 == null || class192.field2903 && this.field5292.field4976 == null || this.field5282.field4976 == null) {
            if (class333.field5188) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field5265.field4976 == null) {
                this.field5265.field4980.position(this.field5265.field4983);
                var1.glVertexPointer(3, 5126, this.field5265.field4979, this.field5265.field4980);
            }
            if (this.field5274.field4976 == null) {
                this.field5274.field4980.position(this.field5274.field4983);
                var1.glColorPointer(4, 5121, this.field5274.field4979, this.field5274.field4980);
            }
            if (class192.field2903 && this.field5292.field4976 == null) {
                this.field5292.field4980.position(this.field5292.field4983);
                var1.glNormalPointer(5126, this.field5292.field4979, this.field5292.field4980);
            }
            if (this.field5282.field4976 == null) {
                this.field5282.field4980.position(this.field5282.field4983);
                var1.glTexCoordPointer(2, 5126, this.field5282.field4979, this.field5282.field4980);
            }
        }
        if (this.field5297.field4976 == null && class333.field5188) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field5296.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field5296[var5];
            int var7 = this.field5296[var5 + 1];
            short var8 = this.field5276[var6];
            if (var8 == -1) {
                class333.method2282(-1);
                class174.method1179(0, 0, (byte) 75);
            } else {
                class12.field126.method465(var8 & 0xFFFF, 37);
            }
            if (this.field5297.field4976 == null) {
                this.field5297.field4980.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field5297.field4980);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lbd;)Lbd;", line = 3222)
    public final class20 method2377(class20 arg0) {
        if (this.field5288 == 0) {
            return null;
        }
        if (!this.field5270.field773) {
            this.method2373();
        }
        int var2;
        int var3;
        if (class326.field5073 > 0) {
            var2 = this.field5270.field774 - (class326.field5073 * this.field5270.field770 >> 8) >> 3;
            var3 = this.field5270.field775 - (class326.field5073 * this.field5270.field771 >> 8) >> 3;
        } else {
            var2 = this.field5270.field774 - (class326.field5073 * this.field5270.field771 >> 8) >> 3;
            var3 = this.field5270.field775 - (class326.field5073 * this.field5270.field770 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class326.field5066 > 0) {
            var4 = this.field5270.field768 - (class326.field5066 * this.field5270.field770 >> 8) >> 3;
            var5 = this.field5270.field769 - (class326.field5066 * this.field5270.field771 >> 8) >> 3;
        } else {
            var4 = this.field5270.field768 - (class326.field5066 * this.field5270.field771 >> 8) >> 3;
            var5 = this.field5270.field769 - (class326.field5066 * this.field5270.field770 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class20 var8;
        if (arg0 == null || arg0.field268.length < var6 * var7) {
            var8 = new class20(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1171 = arg0.field1166 = var6;
            arg0.field1175 = arg0.field1170 = var7;
            arg0.method163();
        }
        var8.field1168 = var2;
        var8.field1165 = var4;
        if (field5316.length < this.field5288) {
            field5316 = new int[this.field5288];
            field5319 = new int[this.field5288];
        }
        for (int var9 = 0; var9 < this.field5263; var9++) {
            int var10 = (this.field5298[var9] - (this.field5293[var9] * class326.field5073 >> 8) >> 3) - var2;
            int var11 = (this.field5283[var9] - (this.field5293[var9] * class326.field5066 >> 8) >> 3) - var4;
            int var12 = this.field5291[var9];
            int var13 = this.field5291[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field5275[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field5316[var15] = var10;
                field5319[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field5280; var16++) {
            if (this.field5286[var16] <= 128) {
                short var17 = this.field5303[var16];
                short var18 = this.field5294[var16];
                short var19 = this.field5295[var16];
                int var20 = field5316[var17];
                int var21 = field5316[var18];
                int var22 = field5316[var19];
                int var23 = field5319[var17];
                int var24 = field5319[var18];
                int var25 = field5319[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class12.method105(var8.field268, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(FFF)I", line = 3352)
    private static final int method2378(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZZZZZZ)V", line = 3386)
    public final void method2379(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field5264 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field5288 != 0) {
            if (arg6) {
                boolean var8 = !this.field5274.field4984 && (arg1 || arg2 && !class192.field2903);
                this.method2380(false, !this.field5265.field4984 && arg0, var8, this.field5292 != null && !this.field5292.field4984 && arg2, !this.field5282.field4984 && arg3);
                if (!this.field5297.field4984 && arg4 && arg1) {
                    this.method2357();
                }
            }
            if (arg0) {
                if (this.field5265.field4984) {
                    if (!this.field5270.field773) {
                        this.method2373();
                    }
                    this.field5298 = null;
                    this.field5293 = null;
                    this.field5283 = null;
                    this.field5275 = null;
                    this.field5291 = null;
                } else {
                    this.field5281 = (byte) (this.field5281 | 0x1);
                }
            }
            if (arg1) {
                if (this.field5274.field4984) {
                    this.field5302 = null;
                    this.field5286 = null;
                } else {
                    this.field5281 = (byte) (this.field5281 | 0x2);
                }
            }
            if (arg2 && class192.field2903) {
                if (this.field5292.field4984) {
                    this.field5306 = null;
                    this.field5266 = null;
                    this.field5289 = null;
                    this.field5285 = null;
                } else {
                    this.field5281 = (byte) (this.field5281 | 0x4);
                }
            }
            if (arg3) {
                if (this.field5282.field4984) {
                    this.field5277 = null;
                    this.field5272 = null;
                } else {
                    this.field5281 = (byte) (this.field5281 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field5297.field4984 && this.field5274.field4984) {
                    this.field5303 = null;
                    this.field5294 = null;
                    this.field5295 = null;
                } else {
                    this.field5281 = (byte) (this.field5281 | 0x10);
                }
            }
            if (arg5) {
                this.field5290 = null;
                this.field5287 = null;
                this.field5273 = (int[][]) null;
                this.field5267 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZZZZ)V", line = 3482)
    private final void method2380(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field5265.field4983 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field5274.field4983 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field5292.field4983 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field5282.field4983 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field5271.field4716.length < this.field5288 * var6) {
            field5271 = new class303((this.field5288 + 100) * var6);
        } else {
            field5271.field4679 = 0;
        }
        if (arg1) {
            if (class333.field5170) {
                for (int var7 = 0; var7 < this.field5263; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field5298[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field5293[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field5283[var7]);
                    int var11 = this.field5291[var7];
                    int var12 = this.field5291[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field5275[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field5271.field4679 = var6 * var14;
                        field5271.method2013(var8, -81);
                        field5271.method2013(var9, -68);
                        field5271.method2013(var10, -84);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field5263; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field5298[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field5293[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field5283[var15]);
                    int var19 = this.field5291[var15];
                    int var20 = this.field5291[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field5275[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field5271.field4679 = var6 * var22;
                        field5271.method1993((byte) 7, var16);
                        field5271.method1993((byte) 7, var17);
                        field5271.method1993((byte) 7, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class192.field2903) {
                for (int var42 = 0; var42 < this.field5280; var42++) {
                    int var43 = method2359(this.field5302[var42], this.field5276[var42], this.field5269, this.field5286[var42]);
                    field5271.field4679 = this.field5303[var42] * var6 + this.field5274.field4983;
                    field5271.method2013(var43, -50);
                    field5271.field4679 = this.field5294[var42] * var6 + this.field5274.field4983;
                    field5271.method2013(var43, -89);
                    field5271.field4679 = this.field5295[var42] * var6 + this.field5274.field4983;
                    field5271.method2013(var43, -69);
                }
            } else {
                int var23 = (int) class326.field5070[0];
                int var24 = (int) class326.field5070[1];
                int var25 = (int) class326.field5070[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field5269 * 1.3F);
                int var28 = this.field5299 * var26 >> 8;
                for (int var29 = 0; var29 < this.field5280; var29++) {
                    short var30 = this.field5303[var29];
                    short var31 = this.field5285[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field5289[var30] * var25 + this.field5306[var30] * var23 + this.field5266[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field5289[var30] * var25 + this.field5306[var30] * var23 + this.field5266[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field5285[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field5294[var29];
                    short var34 = this.field5285[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field5289[var33] * var25 + this.field5306[var33] * var23 + this.field5266[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field5289[var33] * var25 + this.field5306[var33] * var23 + this.field5266[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field5285[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field5295[var29];
                    short var37 = this.field5285[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field5289[var36] * var25 + this.field5306[var36] * var23 + this.field5266[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field5289[var36] * var25 + this.field5306[var36] * var23 + this.field5266[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field5285[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method2359(this.field5302[var29], this.field5276[var29], var32, this.field5286[var29]);
                    int var40 = method2359(this.field5302[var29], this.field5276[var29], var35, this.field5286[var29]);
                    int var41 = method2359(this.field5302[var29], this.field5276[var29], var38, this.field5286[var29]);
                    field5271.field4679 = var6 * var30 + this.field5274.field4983;
                    field5271.method2013(var39, -73);
                    field5271.field4679 = var6 * var33 + this.field5274.field4983;
                    field5271.method2013(var40, -102);
                    field5271.field4679 = var6 * var36 + this.field5274.field4983;
                    field5271.method2013(var41, -62);
                }
                this.field5306 = null;
                this.field5266 = null;
                this.field5289 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field5299;
            float var45 = 3.0F / (float) (this.field5299 / 2 + this.field5299);
            field5271.field4679 = this.field5292.field4983;
            if (class333.field5170) {
                for (int var46 = 0; var46 < this.field5288; var46++) {
                    short var47 = this.field5285[var46];
                    if (var47 == 0) {
                        field5271.method2046((float) this.field5306[var46] * var45, 0);
                        field5271.method2046((float) this.field5266[var46] * var45, 0);
                        field5271.method2046((float) this.field5289[var46] * var45, 0);
                    } else {
                        float var48 = var44 / (float) var47;
                        field5271.method2046((float) this.field5306[var46] * var48, 0);
                        field5271.method2046((float) this.field5266[var46] * var48, 0);
                        field5271.method2046((float) this.field5289[var46] * var48, 0);
                    }
                    field5271.field4679 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field5288; var49++) {
                    short var50 = this.field5285[var49];
                    if (var50 == 0) {
                        field5271.method2056(116, (float) this.field5306[var49] * var45);
                        field5271.method2056(125, (float) this.field5266[var49] * var45);
                        field5271.method2056(121, (float) this.field5289[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field5271.method2056(126, (float) this.field5306[var49] * var51);
                        field5271.method2056(106, (float) this.field5266[var49] * var51);
                        field5271.method2056(111, (float) this.field5289[var49] * var51);
                    }
                    field5271.field4679 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field5271.field4679 = this.field5282.field4983;
            if (class333.field5170) {
                for (int var52 = 0; var52 < this.field5288; var52++) {
                    field5271.method2046(this.field5277[var52], 0);
                    field5271.method2046(this.field5272[var52], 0);
                    field5271.field4679 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field5288; var53++) {
                    field5271.method2056(114, this.field5277[var53]);
                    field5271.method2056(119, this.field5272[var53]);
                    field5271.field4679 += var6 - 8;
                }
            }
        }
        field5271.field4679 = this.field5288 * var6;
        if (arg0) {
            if (class333.field5164) {
                ByteBuffer var54 = ByteBuffer.wrap(field5271.field4716, 0, field5271.field4679);
                if (this.field5301 == null) {
                    this.field5301 = new class216(true);
                    this.field5301.method1442(var54);
                } else {
                    this.field5301.method1443(var54);
                }
                if (arg1) {
                    this.field5265.field4984 = true;
                    this.field5265.field4980 = null;
                    this.field5265.field4976 = this.field5301;
                    this.field5265.field4979 = var6;
                }
                if (arg2) {
                    this.field5274.field4984 = true;
                    this.field5274.field4980 = null;
                    this.field5274.field4976 = this.field5301;
                    this.field5274.field4979 = var6;
                }
                if (arg3) {
                    this.field5292.field4984 = true;
                    this.field5292.field4980 = null;
                    this.field5292.field4976 = this.field5301;
                    this.field5292.field4979 = var6;
                }
                if (arg4) {
                    this.field5282.field4984 = true;
                    this.field5282.field4980 = null;
                    this.field5282.field4976 = this.field5301;
                    this.field5282.field4979 = var6;
                }
            } else {
                if (field5307 == null || field5307.capacity() < field5271.field4679) {
                    field5307 = ByteBuffer.allocateDirect(var6 * 100 + field5271.field4679);
                } else {
                    field5307.clear();
                }
                field5307.put(field5271.field4716, 0, field5271.field4679);
                field5307.flip();
                if (arg1) {
                    this.field5265.field4984 = true;
                    this.field5265.field4980 = field5307;
                    this.field5265.field4976 = null;
                    this.field5265.field4979 = var6;
                }
                if (arg2) {
                    this.field5274.field4984 = true;
                    this.field5274.field4980 = field5307;
                    this.field5265.field4976 = null;
                    this.field5274.field4979 = var6;
                }
                if (arg3) {
                    this.field5292.field4984 = true;
                    this.field5292.field4980 = field5307;
                    this.field5292.field4976 = null;
                    this.field5292.field4979 = var6;
                }
                if (arg4) {
                    this.field5282.field4984 = true;
                    this.field5282.field4980 = field5307;
                    this.field5282.field4976 = null;
                    this.field5282.field4979 = var6;
                }
            }
        } else if (class333.field5188) {
            class216 var55 = new class216();
            ByteBuffer var56 = ByteBuffer.wrap(field5271.field4716, 0, field5271.field4679);
            var55.method1442(var56);
            if (arg1) {
                this.field5265.field4984 = true;
                this.field5265.field4980 = null;
                this.field5265.field4976 = var55;
                this.field5265.field4979 = var6;
            }
            if (arg2) {
                this.field5274.field4984 = true;
                this.field5274.field4980 = null;
                this.field5274.field4976 = var55;
                this.field5274.field4979 = var6;
            }
            if (arg3) {
                this.field5292.field4984 = true;
                this.field5292.field4980 = null;
                this.field5292.field4976 = var55;
                this.field5292.field4979 = var6;
            }
            if (arg4) {
                this.field5282.field4984 = true;
                this.field5282.field4980 = null;
                this.field5282.field4976 = var55;
                this.field5282.field4979 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field5271.field4679);
            var57.put(field5271.field4716, 0, field5271.field4679);
            var57.flip();
            if (arg1) {
                this.field5265.field4984 = true;
                this.field5265.field4980 = var57;
                this.field5265.field4976 = null;
                this.field5265.field4979 = var6;
            }
            if (arg2) {
                this.field5274.field4984 = true;
                this.field5274.field4980 = var57;
                this.field5265.field4976 = null;
                this.field5274.field4979 = var6;
            }
            if (arg3) {
                this.field5292.field4984 = true;
                this.field5292.field4980 = var57;
                this.field5292.field4976 = null;
                this.field5292.field4979 = var6;
            }
            if (arg4) {
                this.field5282.field4984 = true;
                this.field5282.field4980 = var57;
                this.field5282.field4976 = null;
                this.field5282.field4979 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "()I", line = 4011)
    public final int method975() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field772;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIFFF)[F", line = 4018)
    private static final float[] method2381(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 4084)
    public final void method988(int arg0) {
        int var2 = class12.field121[arg0];
        int var3 = class12.field127[arg0];
        for (int var4 = 0; var4 < this.field5279; var4++) {
            int var5 = this.field5298[var4] * var3 + this.field5293[var4] * var2 >> 16;
            this.field5293[var4] = this.field5293[var4] * var3 - this.field5298[var4] * var2 >> 16;
            this.field5298[var4] = var5;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 4103)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        if (this.field5288 == 0) {
            return;
        }
        if (!this.field5270.field773) {
            this.method2373();
        }
        short var13 = this.field5270.field772;
        short var14 = this.field5270.field771;
        short var15 = this.field5270.field770;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class27.field345) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class54.field763) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class234.field3757) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class6.field65) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class12.field121[arg0];
            var27 = class12.field127[arg0];
        }
        if (arg8 > 0L && class36.field451 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class50.field710 >= var28 && class50.field710 <= var29 && class132.field2088 >= var30 && class132.field2088 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field5270.field774;
                short var37 = this.field5270.field775;
                short var38 = this.field5270.field768;
                short var39 = this.field5270.field769;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class50.field710 >= var32 && class50.field710 <= var33 && class132.field2088 >= var34 && class132.field2088 <= var35) {
                    if (this.field4545) {
                        class74.field1105[class77.field1152++] = arg8;
                    } else {
                        if (field5316.length < this.field5288) {
                            field5316 = new int[this.field5288];
                            field5319 = new int[this.field5288];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field5263) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field5280) {
                                        break label118;
                                    }
                                    short var80 = this.field5303[var79];
                                    short var81 = this.field5294[var79];
                                    short var82 = this.field5295[var79];
                                    if (this.method2366(class50.field710, class132.field2088, field5319[var80], field5319[var81], field5319[var82], field5316[var80], field5316[var81], field5316[var82])) {
                                        class74.field1105[class77.field1152++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field5298[var59];
                            int var61 = this.field5293[var59];
                            int var62 = this.field5283[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field5291[var59];
                            int var76 = this.field5291[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field5275[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field5316[var78] = var73;
                                field5319[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class333.field5160;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method2376();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V", line = 4377)
    public final void method983(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5279; var4++) {
            this.field5298[var4] += arg0;
            this.field5293[var4] += arg1;
            this.field5283[var4] += arg2;
        }
        this.field5270.field773 = false;
        this.field5265.field4984 = false;
    }

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "()I", line = 4392)
    public final int method980() {
        if (!this.field5270.field773) {
            this.method2373();
        }
        return this.field5270.field775;
    }

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "()I", line = 4399)
    public final int method2382() {
        return this.field5299;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lfe;", line = 4405)
    public final class94 method642(int arg0, int arg1, int arg2) {
        this.field5278 = false;
        if (this.field5300 != null) {
            this.field5306 = this.field5300.field4008;
            this.field5266 = this.field5300.field4007;
            this.field5289 = this.field5300.field4006;
            this.field5285 = this.field5300.field4009;
            this.field5300 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "()V", line = 4418)
    public final void method2383() {
        int var10002;
        if (this.field5290 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5279; var3++) {
                int var4 = this.field5290[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5273 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5273[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5279) {
                int var7 = this.field5290[var6] & 0xFF;
                this.field5273[var7][var1[var7]++] = var6++;
            }
            this.field5290 = null;
        }
        if (this.field5287 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5280; var10++) {
            int var11 = this.field5287[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5267 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5267[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5280) {
            int var14 = this.field5287[var13] & 0xFF;
            this.field5267[var14][var8[var14]++] = var13++;
        }
        this.field5287 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()Z", line = 4516)
    public final boolean method643() {
        return this.field5278 && this.field5298 != null && this.field5306 != null;
    }

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "()V", line = 4521)
    public static final void method2384() {
        field5304 = new class340();
        field5308 = new class340();
        field5309 = new class340();
        field5310 = new class340();
        field5311 = new class340();
        field5312 = new class340();
    }
}
